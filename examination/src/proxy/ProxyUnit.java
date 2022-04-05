package proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ProxyUnit {
    /**
     *
     * @param obj
     * @return
     */
    public static UserService getProxy(UserService obj) {
        /**
         * ClassLoader loader, 类加载器，负责加载代理类到内存中使用
         * Class<?>[] interfaces, 获取被代理对象实现的全部接口，代理要为全部接口的全部方法进行代理
         * InvocationHandler h， 代理的核心处理逻辑
         */
        return (UserService)Proxy.newProxyInstance(obj.getClass().getClassLoader(), obj.getClass().getInterfaces(), new InvocationHandler() {
            /**
             *
             * @param proxy 代理对象本身，一般不管
             * @param method 正在被代理的方法
             * @param args 被代理方法，传入的参数
             * @return
             * @throws Throwable
             */
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                long startTimer = System.currentTimeMillis();

                Object result = method.invoke(obj, args);

                long endTimer = System.currentTimeMillis();
                System.out.println("login方法耗时" + (endTimer - startTimer) / 1000.0 + "s");

                return result;
            }
        });
    }
}
