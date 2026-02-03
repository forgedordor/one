package defpackage;

import android.util.Log;
import androidx.window.extensions.WindowExtensions;
import androidx.window.extensions.WindowExtensionsProvider;
import androidx.window.extensions.embedding.ActivityEmbeddingComponent;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ptf {
    public static final ActivityEmbeddingComponent a() throws IllegalArgumentException {
        Object objNewProxyInstance = Proxy.newProxyInstance(ptg.class.getClassLoader(), new Class[]{prn$$ExternalSyntheticApiModelOutline0.m734m()}, new InvocationHandler() { // from class: pte
            @Override // java.lang.reflect.InvocationHandler
            public final Object invoke(Object obj, Method method, Object[] objArr) {
                return fctx.a;
            }
        });
        objNewProxyInstance.getClass();
        return prn$$ExternalSyntheticApiModelOutline0.m(objNewProxyInstance);
    }

    public static final boolean b() {
        try {
            ClassLoader classLoader = ptg.class.getClassLoader();
            if (classLoader != null) {
                prm prmVar = new prm(classLoader);
                WindowExtensions windowExtensions = WindowExtensionsProvider.getWindowExtensions();
                windowExtensions.getClass();
                if (new pvz(classLoader, prmVar, windowExtensions).a() != null) {
                    return true;
                }
            }
            return false;
        } catch (NoClassDefFoundError unused) {
            Log.d("EmbeddingCompat", "Embedding extension version not found");
            return false;
        } catch (UnsupportedOperationException unused2) {
            Log.d("EmbeddingCompat", "Stub Extension");
            return false;
        }
    }
}
