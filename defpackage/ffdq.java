package defpackage;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;

/* compiled from: PG */
/* loaded from: classes6.dex */
public class ffdq implements ffdt {
    public static final ffdp a = new ffdp();
    private final Class b;
    private final Method c;
    private final Method d;
    private final Method e;
    private final Method f;

    public ffdq(Class cls) throws NoSuchMethodException, SecurityException {
        this.b = cls;
        Method declaredMethod = cls.getDeclaredMethod("setUseSessionTickets", Boolean.TYPE);
        declaredMethod.getClass();
        this.c = declaredMethod;
        this.d = cls.getMethod("setHostname", String.class);
        this.e = cls.getMethod("getAlpnSelectedProtocol", null);
        this.f = cls.getMethod("setAlpnProtocols", byte[].class);
    }

    @Override // defpackage.ffdt
    public final String a(SSLSocket sSLSocket) {
        if (!e(sSLSocket)) {
            return null;
        }
        try {
            byte[] bArr = (byte[]) this.e.invoke(sSLSocket, null);
            if (bArr != null) {
                return new String(bArr, fdfy.a);
            }
            return null;
        } catch (IllegalAccessException e) {
            throw new AssertionError(e);
        } catch (InvocationTargetException e2) {
            Throwable cause = e2.getCause();
            if ((cause instanceof NullPointerException) && fdbq.f(((NullPointerException) cause).getMessage(), "ssl == null")) {
                return null;
            }
            throw new AssertionError(e2);
        }
    }

    @Override // defpackage.ffdt
    public /* synthetic */ X509TrustManager b(SSLSocketFactory sSLSocketFactory) {
        return null;
    }

    @Override // defpackage.ffdt
    public final void c(SSLSocket sSLSocket, String str, List list) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        if (e(sSLSocket)) {
            try {
                this.c.invoke(sSLSocket, true);
                this.d.invoke(sSLSocket, str);
                Method method = this.f;
                ffdi ffdiVar = ffdi.b;
                ffez ffezVar = new ffez();
                for (String str2 : ffdh.a(list)) {
                    ffezVar.P(str2.length());
                    ffezVar.ac(str2);
                }
                method.invoke(sSLSocket, ffezVar.G());
            } catch (IllegalAccessException e) {
                throw new AssertionError(e);
            } catch (InvocationTargetException e2) {
                throw new AssertionError(e2);
            }
        }
    }

    @Override // defpackage.ffdt
    public final boolean d() {
        return ffdd.a;
    }

    @Override // defpackage.ffdt
    public final boolean e(SSLSocket sSLSocket) {
        return this.b.isInstance(sSLSocket);
    }

    @Override // defpackage.ffdt
    public /* synthetic */ boolean f(SSLSocketFactory sSLSocketFactory) {
        return false;
    }
}
