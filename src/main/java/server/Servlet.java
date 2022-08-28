package server;

/**
 * @Author: Jaa
 * @Date: 2022-02-08 10:38
 * @Discriprion:
 */
public interface Servlet {
    void init() throws Exception;

    void destroy() throws Exception;

    void service(Request request, Response response) throws Exception;
}
