package Classes;

import com.sun.javafx.application.ParametersImpl;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CatalogController extends HttpServlet {

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
            ProductDB product=new ProductDB();
            ArrayList<Product> catpro=new ArrayList();
            ArrayList<Product> pro= product.getAllProducts();
            ArrayList<String> Cat=product.getCategory();
            String code=(String)request.getParameter("productCode");
            String catalogCategory=(String)request.getParameter("catalogCategory");
            request.setAttribute("pro", pro);
            request.setAttribute("catalogCategory", catalogCategory);
            request.setAttribute("Cat",Cat);
            if(code!=null)
            {
                int flag=0;  
                for(Product a:pro)
                {
                    if(a.getProductCode().equals(code))
                    {    
                        flag=1;
                        request.setAttribute("item",a);
                        getServletContext().getRequestDispatcher("/item.jsp").forward(request, response);
                        return;
                    }
                }
                if(flag==0)
                {
                    getServletContext().getRequestDispatcher("/catalog.jsp").forward(request, response);
                    return;
                }
            }
            if(catalogCategory!=null)
            { 
                int flag=0;
                for(Product a:pro)
                {
                    if(a.getCatalogCategory().equals(catalogCategory))
                    {     
                        catpro.add(a);
                        flag=1;
                    }
                }
                if(flag==0)
                {
                    getServletContext().getRequestDispatcher("/catalog.jsp").forward(request, response);
                    return;
                }
                request.setAttribute("catpro", catpro);
                getServletContext().getRequestDispatcher("/category.jsp").forward(request, response);
                return;
            }
            getServletContext().getRequestDispatcher("/catalog.jsp").forward(request, response);
            processRequest(request, response);
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
        
          
        processRequest(request, response);
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
