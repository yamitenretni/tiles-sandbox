import org.apache.tiles.TilesContainer;
import org.apache.tiles.access.TilesAccess;
import org.apache.tiles.request.ApplicationContext;
import org.apache.tiles.request.Request;
import org.apache.tiles.web.util.TilesDispatchServlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by Лена on 10.11.2015.
 */
@WebServlet("/s")
public class MyServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        TilesContainer container = TilesAccess.getContainer(req.getSession().getServletContext());
        String var = "Blablabla";
        req.setAttribute("var", var);
        req.getRequestDispatcher("/mainPage.tiles").forward(req, resp);

    }
}
