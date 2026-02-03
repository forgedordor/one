package defpackage;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fcpn extends fcpo {
    private static final fcqg d = new fcqg(null, "setUseSessionTickets", Boolean.TYPE);
    private static final fcqg e = new fcqg(null, "setHostname", String.class);
    private static final fcqg f = new fcqg(byte[].class, "getAlpnSelectedProtocol", new Class[0]);
    private static final fcqg g = new fcqg(null, "setAlpnProtocols", byte[].class);
    private static final fcqg h = new fcqg(byte[].class, "getNpnSelectedProtocol", new Class[0]);
    private static final fcqg i = new fcqg(null, "setNpnProtocols", byte[].class);
    private static final Method j;
    private static final Method k;
    private static final Method l;
    private static final Method m;
    private static final Method n;
    private static final Method o;
    private static final Constructor p;

    static {
        NoSuchMethodException noSuchMethodException;
        Method method;
        Method method2;
        Method method3;
        ClassNotFoundException classNotFoundException;
        Method method4;
        Method method5;
        Method method6;
        Method method7;
        Method method8;
        Method method9;
        Class<?> cls;
        Constructor<?> constructor = null;
        try {
            method2 = SSLParameters.class.getMethod("setApplicationProtocols", String[].class);
            try {
                method5 = SSLParameters.class.getMethod("getApplicationProtocols", null);
                try {
                    method7 = SSLSocket.class.getMethod("getApplicationProtocol", null);
                    try {
                        cls = Class.forName("android.net.ssl.SSLSockets");
                        method8 = cls.getMethod("isSupportedSocket", SSLSocket.class);
                    } catch (ClassNotFoundException e2) {
                        classNotFoundException = e2;
                        method4 = null;
                        method = method5;
                        method3 = method7;
                    } catch (NoSuchMethodException e3) {
                        noSuchMethodException = e3;
                        method4 = null;
                        method = method5;
                        method3 = method7;
                    }
                    try {
                        method6 = cls.getMethod("setUseSessionTickets", SSLSocket.class, Boolean.TYPE);
                    } catch (ClassNotFoundException e4) {
                        classNotFoundException = e4;
                        method = method5;
                        method3 = method7;
                        method4 = method8;
                        fcpo.a.logp(Level.FINER, "io.grpc.okhttp.OkHttpProtocolNegotiator$AndroidNegotiator", "<clinit>", "Failed to find Android 10.0+ APIs", (Throwable) classNotFoundException);
                        method5 = method;
                        method6 = null;
                        method7 = method3;
                        method8 = method4;
                        l = method2;
                        m = method5;
                        n = method7;
                        j = method8;
                        k = method6;
                        method9 = SSLParameters.class.getMethod("setServerNames", List.class);
                        constructor = Class.forName("javax.net.ssl.SNIHostName").getConstructor(String.class);
                        o = method9;
                        p = constructor;
                    } catch (NoSuchMethodException e5) {
                        noSuchMethodException = e5;
                        method = method5;
                        method3 = method7;
                        method4 = method8;
                        fcpo.a.logp(Level.FINER, "io.grpc.okhttp.OkHttpProtocolNegotiator$AndroidNegotiator", "<clinit>", "Failed to find Android 10.0+ APIs", (Throwable) noSuchMethodException);
                        method5 = method;
                        method6 = null;
                        method7 = method3;
                        method8 = method4;
                        l = method2;
                        m = method5;
                        n = method7;
                        j = method8;
                        k = method6;
                        method9 = SSLParameters.class.getMethod("setServerNames", List.class);
                        constructor = Class.forName("javax.net.ssl.SNIHostName").getConstructor(String.class);
                        o = method9;
                        p = constructor;
                    }
                } catch (ClassNotFoundException e6) {
                    classNotFoundException = e6;
                    method3 = null;
                    method4 = null;
                    method = method5;
                } catch (NoSuchMethodException e7) {
                    noSuchMethodException = e7;
                    method3 = null;
                    method4 = null;
                    method = method5;
                }
            } catch (ClassNotFoundException e8) {
                classNotFoundException = e8;
                method = null;
                method3 = null;
                method4 = method3;
                fcpo.a.logp(Level.FINER, "io.grpc.okhttp.OkHttpProtocolNegotiator$AndroidNegotiator", "<clinit>", "Failed to find Android 10.0+ APIs", (Throwable) classNotFoundException);
                method5 = method;
                method6 = null;
                method7 = method3;
                method8 = method4;
                l = method2;
                m = method5;
                n = method7;
                j = method8;
                k = method6;
                method9 = SSLParameters.class.getMethod("setServerNames", List.class);
                constructor = Class.forName("javax.net.ssl.SNIHostName").getConstructor(String.class);
                o = method9;
                p = constructor;
            } catch (NoSuchMethodException e9) {
                noSuchMethodException = e9;
                method = null;
                method3 = null;
                method4 = method3;
                fcpo.a.logp(Level.FINER, "io.grpc.okhttp.OkHttpProtocolNegotiator$AndroidNegotiator", "<clinit>", "Failed to find Android 10.0+ APIs", (Throwable) noSuchMethodException);
                method5 = method;
                method6 = null;
                method7 = method3;
                method8 = method4;
                l = method2;
                m = method5;
                n = method7;
                j = method8;
                k = method6;
                method9 = SSLParameters.class.getMethod("setServerNames", List.class);
                constructor = Class.forName("javax.net.ssl.SNIHostName").getConstructor(String.class);
                o = method9;
                p = constructor;
            }
        } catch (ClassNotFoundException e10) {
            classNotFoundException = e10;
            method = null;
            method2 = null;
            method3 = null;
        } catch (NoSuchMethodException e11) {
            noSuchMethodException = e11;
            method = null;
            method2 = null;
            method3 = null;
        }
        l = method2;
        m = method5;
        n = method7;
        j = method8;
        k = method6;
        try {
            method9 = SSLParameters.class.getMethod("setServerNames", List.class);
        } catch (ClassNotFoundException e12) {
            e = e12;
            method9 = null;
        } catch (NoSuchMethodException e13) {
            e = e13;
            method9 = null;
        }
        try {
            constructor = Class.forName("javax.net.ssl.SNIHostName").getConstructor(String.class);
        } catch (ClassNotFoundException e14) {
            e = e14;
            fcpo.a.logp(Level.FINER, "io.grpc.okhttp.OkHttpProtocolNegotiator$AndroidNegotiator", "<clinit>", "Failed to find Android 7.0+ APIs", (Throwable) e);
            o = method9;
            p = constructor;
        } catch (NoSuchMethodException e15) {
            e = e15;
            fcpo.a.logp(Level.FINER, "io.grpc.okhttp.OkHttpProtocolNegotiator$AndroidNegotiator", "<clinit>", "Failed to find Android 7.0+ APIs", (Throwable) e);
            o = method9;
            p = constructor;
        }
        o = method9;
        p = constructor;
    }

    public fcpn(fcql fcqlVar) {
        super(fcqlVar);
    }

    @Override // defpackage.fcpo
    public final String a(SSLSocket sSLSocket) {
        Method method = n;
        if (method != null) {
            try {
                return (String) method.invoke(sSLSocket, null);
            } catch (IllegalAccessException e2) {
                throw new RuntimeException(e2);
            } catch (InvocationTargetException e3) {
                if (!(e3.getTargetException() instanceof UnsupportedOperationException)) {
                    throw new RuntimeException(e3);
                }
                fcpo.a.logp(Level.FINER, "io.grpc.okhttp.OkHttpProtocolNegotiator$AndroidNegotiator", "getSelectedProtocol", "Socket unsupported for getApplicationProtocol, will try old methods");
            }
        }
        if (this.c.c() == 1) {
            try {
                byte[] bArr = (byte[]) f.a(sSLSocket, new Object[0]);
                if (bArr != null) {
                    return new String(bArr, fcqo.b);
                }
            } catch (Exception e4) {
                fcpo.a.logp(Level.FINE, "io.grpc.okhttp.OkHttpProtocolNegotiator$AndroidNegotiator", "getSelectedProtocol", "Failed calling getAlpnSelectedProtocol()", (Throwable) e4);
            }
        }
        if (this.c.c() != 3) {
            try {
                byte[] bArr2 = (byte[]) h.a(sSLSocket, new Object[0]);
                if (bArr2 != null) {
                    return new String(bArr2, fcqo.b);
                }
            } catch (Exception e5) {
                fcpo.a.logp(Level.FINE, "io.grpc.okhttp.OkHttpProtocolNegotiator$AndroidNegotiator", "getSelectedProtocol", "Failed calling getNpnSelectedProtocol()", (Throwable) e5);
            }
        }
        return null;
    }

    @Override // defpackage.fcpo
    public final String b(SSLSocket sSLSocket, String str, List list) {
        String strA = a(sSLSocket);
        return strA == null ? super.b(sSLSocket, str, list) : strA;
    }

    @Override // defpackage.fcpo
    protected final void c(SSLSocket sSLSocket, String str, List list) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        Constructor constructor;
        boolean z;
        Method method;
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((fcqm) it.next()).e);
        }
        String[] strArr = (String[]) arrayList.toArray(new String[0]);
        SSLParameters sSLParameters = sSLSocket.getSSLParameters();
        if (str != null) {
            try {
                try {
                    if (!str.contains("_")) {
                        try {
                            ejwl.f(fcdy.f(str).getAuthority().indexOf(64) == -1, "Userinfo must not be present on authority: '%s'", str);
                            Method method2 = j;
                            if (method2 == null || !((Boolean) method2.invoke(null, sSLSocket)).booleanValue()) {
                                d.c(sSLSocket, true);
                            } else {
                                k.invoke(null, sSLSocket, true);
                            }
                            Method method3 = o;
                            if (method3 == null || (constructor = p) == null || eomh.b(eomf.b(str).a)) {
                                e.c(sSLSocket, str);
                            } else {
                                method3.invoke(sSLParameters, Collections.singletonList(constructor.newInstance(str)));
                            }
                        } catch (IllegalArgumentException unused) {
                        }
                    }
                } catch (InvocationTargetException e2) {
                    throw new RuntimeException(e2);
                }
            } catch (IllegalAccessException e3) {
                throw new RuntimeException(e3);
            } catch (InstantiationException e4) {
                throw new RuntimeException(e4);
            }
        }
        Method method4 = n;
        if (method4 != null) {
            try {
                method4.invoke(sSLSocket, null);
                l.invoke(sSLParameters, strArr);
                z = true;
            } catch (InvocationTargetException e5) {
                if (!(e5.getTargetException() instanceof UnsupportedOperationException)) {
                    throw e5;
                }
                fcpo.a.logp(Level.FINER, "io.grpc.okhttp.OkHttpProtocolNegotiator$AndroidNegotiator", "configureTlsExtensions", "setApplicationProtocol unsupported, will try old methods");
            }
        } else {
            z = false;
        }
        sSLSocket.setSSLParameters(sSLParameters);
        if (z && (method = m) != null && Arrays.equals(strArr, (String[]) method.invoke(sSLSocket.getSSLParameters(), null))) {
            return;
        }
        Object[] objArr = {fcql.e(list)};
        fcql fcqlVar = this.c;
        if (fcqlVar.c() == 1) {
            g.a(sSLSocket, objArr);
        }
        if (fcqlVar.c() == 3) {
            throw new RuntimeException("We can not do TLS handshake on this Android version, please install the Google Play Services Dynamic Security Provider to use TLS");
        }
        i.a(sSLSocket, objArr);
    }
}
