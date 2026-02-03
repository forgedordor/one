package defpackage;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.security.Provider;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import javax.net.ssl.SSLSocket;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fcqj extends fcql {
    private final Method d;
    private final Method e;
    private final Method f;
    private final Class g;
    private final Class h;

    public fcqj(Method method, Method method2, Method method3, Class cls, Class cls2, Provider provider) {
        super(provider);
        this.d = method;
        this.e = method2;
        this.f = method3;
        this.g = cls;
        this.h = cls2;
    }

    @Override // defpackage.fcql
    public final String a(SSLSocket sSLSocket) {
        try {
            fcqk fcqkVar = (fcqk) Proxy.getInvocationHandler(this.e.invoke(null, sSLSocket));
            int i = fcqk.c;
            if (fcqkVar.a) {
                return null;
            }
            String str = fcqkVar.b;
            if (str != null) {
                return str;
            }
            a.logp(Level.INFO, "io.grpc.okhttp.internal.Platform$JdkWithJettyBootPlatform", "getSelectedProtocol", "ALPN callback dropped: SPDY and HTTP/2 are disabled. Is alpn-boot on the boot class path?");
            return null;
        } catch (IllegalAccessException unused) {
            throw new AssertionError();
        } catch (InvocationTargetException unused2) {
            throw new AssertionError();
        }
    }

    @Override // defpackage.fcql
    public final void b(SSLSocket sSLSocket, String str, List list) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i = 0; i < size; i++) {
            fcqm fcqmVar = (fcqm) list.get(i);
            if (fcqmVar != fcqm.HTTP_1_0) {
                arrayList.add(fcqmVar.e);
            }
        }
        try {
            this.d.invoke(null, sSLSocket, Proxy.newProxyInstance(fcql.class.getClassLoader(), new Class[]{this.g, this.h}, new fcqk(arrayList)));
        } catch (IllegalAccessException e) {
            throw new AssertionError(e);
        } catch (InvocationTargetException e2) {
            throw new AssertionError(e2);
        }
    }

    @Override // defpackage.fcql
    public final int c() {
        return 1;
    }

    @Override // defpackage.fcql
    public final void d(SSLSocket sSLSocket) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        try {
            this.f.invoke(null, sSLSocket);
        } catch (IllegalAccessException unused) {
            throw new AssertionError();
        } catch (InvocationTargetException e) {
            a.logp(Level.FINE, "io.grpc.okhttp.internal.Platform$JdkWithJettyBootPlatform", "afterHandshake", "Failed to remove SSLSocket from Jetty ALPN", (Throwable) e);
        }
    }
}
