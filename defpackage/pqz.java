package defpackage;

import android.os.Build;
import android.webkit.WebView;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class pqz {
    public static final prb a;

    static {
        prb pqhVar;
        ClassLoader classLoader;
        try {
            try {
                if (Build.VERSION.SDK_INT >= 28) {
                    classLoader = WebView.getWebViewClassLoader();
                } else {
                    try {
                        Method declaredMethod = WebView.class.getDeclaredMethod("getFactory", null);
                        declaredMethod.setAccessible(true);
                        classLoader = declaredMethod.invoke(null, null).getClass().getClassLoader();
                    } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException e) {
                        throw new RuntimeException(e);
                    }
                }
                pqhVar = new prc((WebViewProviderFactoryBoundaryInterface) fgho.a(WebViewProviderFactoryBoundaryInterface.class, (InvocationHandler) Class.forName("org.chromium.support_lib_glue.SupportLibReflectionUtil", false, classLoader).getDeclaredMethod("createWebViewProviderFactory", null).invoke(null, null)));
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException e2) {
                throw new RuntimeException(e2);
            }
        } catch (ClassNotFoundException unused) {
            pqhVar = new pqh();
        }
        a = pqhVar;
    }
}
