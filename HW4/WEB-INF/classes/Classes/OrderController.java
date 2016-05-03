package Classes;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class OrderController extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
              // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">

        }
    }

    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException 
        {  
            
        }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        ProductDB product=new ProductDB();
            ArrayList<Product> allpro= product.getAllProducts();
            HttpSession session=request.getSession();
            Cart cart=(Cart)session.getAttribute("theShoppingCart");
            String[] productCode = request.getParameterValues("productCode");
            String quantity = null;
            String action = request.getParameter("action");
            Product p = null;
            if(cart== null)
            {
                cart=new Cart();
                session.setAttribute("theShoppingCart",cart);
            }
            if(action.equals("addToCart"))
            {
                String pc = request.getParameter("productCode");
                for(Product pro:allpro)
                {
                    if(pro.getProductCode().equals(pc))
                    {
                        p = pro;
                    }
                }
                cart.addItem(p,1);
                response.sendRedirect("/TheGuitarShopee/cart.jsp");
                return;
            }
            
            
        if(action!= null && action.equals("updateCart"))
            {
                for(int i=0;i<productCode.length;i++)
                {
                    quantity = request.getParameter(productCode[i]);
                    p = product.getProduct(productCode[i]);
                    if(Integer.parseInt(quantity)==0)
                    {
                        cart.removeItem(p);
                    }
                    else 
                    {
                        cart.update(p,Integer.parseInt(quantity)); 
                    }
                }
                getServletContext().getRequestDispatcher("/cart.jsp").forward(request, response);
                return;
            }
            Order o=new Order();
            if(action!= null && action.equals("checkout"))
            {
                UserDB udb=new UserDB();
                ArrayList<User> user= udb.getAllUsers();
                User u=user.get(1);
                session.setAttribute("theUser", u);
                for (OrderItem oi: cart.getCartItem())
                {
                    o.getItem().add(oi);
                }
                session.setAttribute("order",o);
                getServletContext().getRequestDispatcher("/order.jsp").forward(request, response);
                return;
            }
            if(request.getParameter("action")== null || !"updateCart".equals(request.getParameter("action")) || !"checkout".equals(request.getParameter("action")))
            {
                getServletContext().getRequestDispatcher("/cart.jsp").forward(request, response);
                return;
            }
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
