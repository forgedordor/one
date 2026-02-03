package defpackage;

import android.os.Build;
import android.security.NetworkSecurityPolicy;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ffdd extends ffdi {
    public static final boolean a;
    private final List c;
    private final ffdr d;

    static {
        boolean z = false;
        if (ffdh.b() && Build.VERSION.SDK_INT < 30) {
            z = true;
        }
        a = z;
    }

    public ffdd() throws NoSuchMethodException, ClassNotFoundException, SecurityException {
        ffdu ffduVar;
        Method method;
        Method method2;
        ffdt[] ffdtVarArr = new ffdt[2];
        Method method3 = null;
        try {
            Class<?> cls = Class.forName(a.x("com.android.org.conscrypt", ".OpenSSLSocketImpl"));
            cls.getClass();
            Class<?> cls2 = Class.forName(a.x("com.android.org.conscrypt", ".OpenSSLSocketFactoryImpl"));
            cls2.getClass();
            Class<?> cls3 = Class.forName(a.x("com.android.org.conscrypt", ".SSLParametersImpl"));
            cls3.getClass();
            ffduVar = new ffdu(cls, cls2, cls3);
        } catch (Exception e) {
            ffdi.b.l("unable to load android socket classes", 5, e);
            ffduVar = null;
        }
        ffdtVarArr[0] = ffduVar;
        ffdtVarArr[1] = new ffds(ffdq.a);
        List listK = fcur.K(ffdtVarArr);
        ArrayList arrayList = new ArrayList();
        for (Object obj : listK) {
            if (((ffdt) obj).d()) {
                arrayList.add(obj);
            }
        }
        this.c = arrayList;
        try {
            Class<?> cls4 = Class.forName("dalvik.system.CloseGuard");
            Method method4 = cls4.getMethod("get", null);
            method2 = cls4.getMethod("open", String.class);
            method = cls4.getMethod("warnIfOpen", null);
            method3 = method4;
        } catch (Exception unused) {
            method = null;
            method2 = null;
        }
        this.d = new ffdr(method3, method2, method);
    }

    @Override // defpackage.ffdi
    public final String a(SSLSocket sSLSocket) {
        Object next;
        Iterator it = this.c.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((ffdt) next).e(sSLSocket)) {
                break;
            }
        }
        ffdt ffdtVar = (ffdt) next;
        if (ffdtVar != null) {
            return ffdtVar.a(sSLSocket);
        }
        return null;
    }

    @Override // defpackage.ffdi
    public final X509TrustManager b(SSLSocketFactory sSLSocketFactory) {
        Object next;
        Iterator it = this.c.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((ffdt) next).f(sSLSocketFactory)) {
                break;
            }
        }
        ffdt ffdtVar = (ffdt) next;
        if (ffdtVar != null) {
            return ffdtVar.b(sSLSocketFactory);
        }
        return null;
    }

    @Override // defpackage.ffdi
    public final ffea c(X509TrustManager x509TrustManager) {
        ffdm ffdmVarA = ffdl.a(x509TrustManager);
        return ffdmVarA != null ? ffdmVarA : super.c(x509TrustManager);
    }

    @Override // defpackage.ffdi
    public final void d(SSLSocket sSLSocket, String str, List list) {
        Object next;
        Iterator it = this.c.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                if (((ffdt) next).e(sSLSocket)) {
                    break;
                }
            }
        }
        ffdt ffdtVar = (ffdt) next;
        if (ffdtVar != null) {
            ffdtVar.c(sSLSocket, str, list);
        }
    }

    @Override // defpackage.ffdi
    public final boolean e(String str) {
        return NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted(str);
    }

    @Override // defpackage.ffdi
    public final ffec f(X509TrustManager x509TrustManager) throws NoSuchMethodException, SecurityException {
        try {
            Method declaredMethod = x509TrustManager.getClass().getDeclaredMethod("findTrustAnchorByIssuerAndSignature", X509Certificate.class);
            declaredMethod.setAccessible(true);
            declaredMethod.getClass();
            return new ffdc(x509TrustManager, declaredMethod);
        } catch (NoSuchMethodException unused) {
            return super.f(x509TrustManager);
        }
    }

    @Override // defpackage.ffdi
    public final void g(Socket socket, InetSocketAddress inetSocketAddress, int i) throws IOException {
        socket.getClass();
        try {
            socket.connect(inetSocketAddress, i);
        } catch (ClassCastException e) {
            if (Build.VERSION.SDK_INT != 26) {
                throw e;
            }
            throw new IOException("Exception in connect", e);
        }
    }

    @Override // defpackage.ffdi
    public final void h(String str, Object obj) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        ffdr ffdrVar = this.d;
        if (obj != null) {
            try {
                Method method = ffdrVar.c;
                method.getClass();
                method.invoke(obj, null);
                return;
            } catch (Exception unused) {
            }
        }
        ffdi.m(this, str, 5, 4);
    }

    @Override // defpackage.ffdi
    public final Object i() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        ffdr ffdrVar = this.d;
        Method method = ffdrVar.a;
        if (method != null) {
            try {
                Object objInvoke = method.invoke(null, null);
                Method method2 = ffdrVar.b;
                method2.getClass();
                method2.invoke(objInvoke, "response.body().close()");
                return objInvoke;
            } catch (Exception unused) {
            }
        }
        return null;
    }
}
