package defpackage;

import android.content.Context;
import android.net.Network;
import j$.util.Objects;
import j$.util.Optional;
import java.io.IOException;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.SocketAddress;
import java.security.KeyStore;
import java.security.SecureRandom;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ebji {
    private static final dhip g = new dhip("MsrpManager");
    public final int a;
    public final ebja b;
    public ebjr c;
    public final ebiv d;
    public final String e;
    public final dhip f;
    private final String h;
    private final String i;
    private final Context j;
    private final Optional k;
    private final int l;
    private int m;

    public ebji(Context context, Optional optional, String str, int i, ebja ebjaVar, int i2) {
        String strB = ebmh.b();
        ebiv ebivVarR = ((ebjh) dfds.a(ebjh.class)).r();
        String strC = dfpk.c();
        this.c = null;
        this.m = 1;
        this.h = str;
        this.a = i;
        this.i = strB;
        this.d = ebivVarR;
        this.e = strC;
        this.b = ebjaVar;
        this.j = context.getApplicationContext();
        this.k = optional;
        this.f = new dhip("MsrpManager[%s]", strB);
        this.l = i2;
    }

    public static String g(ebkd ebkdVar) {
        ebkb ebkbVarA = ebkdVar.a("setup");
        String str = ebkbVarA != null ? ebkbVarA.b : "passive";
        dhja.d(g, "Remote setup attribute is %s", str);
        if (str != null) {
            return str.equals("active") ? "passive" : "active";
        }
        throw new IllegalStateException("expected non-null remoteSetup");
    }

    private final Optional j() {
        if (((Boolean) dfpk.a().b.o.a()).booleanValue()) {
            return Optional.of(new InetSocketAddress(this.h, dfpk.p() ? this.a : 0));
        }
        dhja.r(this.f, "enableBindMsrpSocketLocalAddress is disabled, binding MSRP connection to any ip/port", new Object[0]);
        return Optional.empty();
    }

    private final String k() {
        int i = this.m;
        int i2 = i - 1;
        if (i != 0) {
            return i2 != 0 ? i2 != 1 ? i2 != 2 ? "UNKNOWN" : "CLOSED" : "SETUP" : "NEW";
        }
        throw null;
    }

    public final ebjr a(String str, int i, String str2, String str3, String str4, ebjc ebjcVar) {
        int i2;
        ebix ebixVar;
        try {
            boolean zStartsWith = str3.startsWith("msrps");
            ebjf ebjfVar = new ebjf(ebjcVar);
            try {
                if (zStartsWith) {
                    dhip dhipVar = this.f;
                    String string = eomf.a(str, i).toString();
                    final Optional optional = this.k;
                    dhja.l(dhipVar, "Creating secure MSRP client connection to %s on network[%s]", string, optional);
                    ebja ebjaVar = this.b;
                    Optional optionalOfNullable = Optional.ofNullable(str2);
                    final Optional optionalJ = j();
                    Context context = ebjaVar.a;
                    final ebfl ebflVarA = ebjaVar.c.a();
                    final KeyStore keyStoreB = ebjaVar.b.b();
                    i2 = 0;
                    final String str5 = (String) optionalOfNullable.orElse(null);
                    ebixVar = new ebix(context, new ebfw(new ebfv() { // from class: ebfk
                        @Override // defpackage.ebfv
                        public final Socket a() {
                            return ebflVarA.c(keyStoreB, str5);
                        }
                    }, new ebft() { // from class: ebiy
                        @Override // defpackage.ebft
                        public final InetAddress a(Socket socket, String str6) throws IOException {
                            Optional optional2 = optionalJ;
                            if (optional2.isPresent()) {
                                dhja.c("Binding MSRP socket to local address %s", dhiz.IP_ADDRESS.c(optional2));
                                socket.bind((SocketAddress) optional2.get());
                            }
                            Optional optional3 = optional;
                            if (!optional3.isPresent()) {
                                return null;
                            }
                            dhja.c("Bind socket to network %s", optional3);
                            ((Network) optional3.get()).bindSocket(socket);
                            if (Objects.nonNull(str6)) {
                                return ((Network) optional3.get()).getByName(str6);
                            }
                            return null;
                        }
                    }, str, i, Optional.of(ebjaVar.d.a(optional, ebjfVar))), 3);
                } else {
                    i2 = 0;
                    dhip dhipVar2 = this.f;
                    String string2 = eomf.a(str, i).toString();
                    final Optional optional2 = this.k;
                    dhja.l(dhipVar2, "Creating insecure MSRP client connection to %s on network[%s]", string2, optional2);
                    ebja ebjaVar2 = this.b;
                    final Optional optionalJ2 = j();
                    ebixVar = new ebix(ebjaVar2.a, ebjaVar2.c.a().a(new ebft() { // from class: ebiy
                        @Override // defpackage.ebft
                        public final InetAddress a(Socket socket, String str6) throws IOException {
                            Optional optional22 = optionalJ2;
                            if (optional22.isPresent()) {
                                dhja.c("Binding MSRP socket to local address %s", dhiz.IP_ADDRESS.c(optional22));
                                socket.bind((SocketAddress) optional22.get());
                            }
                            Optional optional3 = optional2;
                            if (!optional3.isPresent()) {
                                return null;
                            }
                            dhja.c("Bind socket to network %s", optional3);
                            ((Network) optional3.get()).bindSocket(socket);
                            if (Objects.nonNull(str6)) {
                                return ((Network) optional3.get()).getByName(str6);
                            }
                            return null;
                        }
                    }, str, i, Optional.of(ebjaVar2.d.a(optional2, ebjfVar))), 1);
                }
                i(ebixVar, str3, str4, ebjcVar, Optional.of(eomf.a(str, i)));
                ebixVar.b();
                dhip dhipVar3 = this.f;
                Object[] objArr = new Object[1];
                objArr[i2] = this.c;
                dhja.l(dhipVar3, "MSRP client endpoint created and opened: %s", objArr);
                Object[] objArr2 = new Object[1];
                objArr2[i2] = this.c;
                dhja.w(8, 3, "MSRP client endpoint created and opened: %s", objArr2);
                ebjr ebjrVar = this.c;
                ebjrVar.getClass();
                return ebjrVar;
            } catch (Exception e) {
                e = e;
                dhja.j(e, this.f, "Couldn't create the MSRP client session", new Object[i2]);
                String strValueOf = String.valueOf(e.getMessage());
                Throwable cause = e.getCause();
                Throwable cause2 = e;
                if (cause != null) {
                    cause2 = e.getCause();
                }
                throw new ebjd("MSRP client session creation failed: ".concat(strValueOf), cause2);
            }
        } catch (Exception e2) {
            e = e2;
            i2 = 0;
        }
    }

    public final ebkd b() {
        return c(dfpk.p() ? this.a : 9, "TCP/MSRP", "msrp");
    }

    public final ebkd c(int i, String str, String str2) {
        ebkd ebkdVar = new ebkd(ebkc.MESSAGE, i, 1, str, "*");
        ebkdVar.e(new ebkb("path", f(str2, i)));
        return ebkdVar;
    }

    public final ebkd d() {
        return e(this.e, this.d.a(), dfpk.p() ? this.a : 9);
    }

    public final ebkd e(String str, String str2, int i) {
        ebkd ebkdVarC = c(i, "TCP/TLS/MSRP", "msrps");
        ebkdVarC.e(new ebkb("fingerprint", a.q(str2, str, " ")));
        return ebkdVarC;
    }

    final String f(String str, int i) {
        String strA = this.h;
        if ((eomh.a(strA) instanceof Inet6Address) && strA.trim().charAt(0) != '[') {
            strA = a.a(strA, "[", "]");
        }
        return String.format(Locale.US, "%1$s://%2$s:%3$d/%4$s;tcp", str, strA, Integer.valueOf(i), this.i);
    }

    public final synchronized void h() {
        dhja.w(9, 3, "MSRP connection disconnected", new Object[0]);
        ebjr ebjrVar = this.c;
        if (ebjrVar != null) {
            try {
                dhja.l(this.f, "Closing MSRP session for SIP call id:[%s] from state:[%s]", ((ebjv) ebjrVar).c, k());
                ebjr ebjrVar2 = this.c;
                dhja.d(((ebjv) ebjrVar2).f, "Closing msrp media session", new Object[0]);
                ((ebjv) ebjrVar2).h.ifPresent(new ebju());
                final ebix ebixVar = ((ebjv) ebjrVar2).b;
                new Thread(new Runnable() { // from class: ebiw
                    @Override // java.lang.Runnable
                    public final void run() {
                        ebix ebixVar2 = ebixVar;
                        ebjl ebjlVar = ebixVar2.d;
                        if (ebjlVar != null) {
                            ebjlVar.a = true;
                            try {
                                ebjlVar.interrupt();
                            } catch (Exception unused) {
                            }
                            dhja.c("Receiver is terminated", new Object[0]);
                            ebixVar2.d = null;
                        }
                        try {
                            ebixVar2.f.c();
                            dhja.c("Connection has been closed", new Object[0]);
                        } catch (Exception e) {
                            try {
                                dhja.i(e, "Couldn't close socket correctly", new Object[0]);
                            } catch (Exception e2) {
                                dhja.i(e2, "Couldn't close socket correctly", new Object[0]);
                            }
                        }
                    }
                }).start();
            } catch (Exception e) {
                dhja.j(e, this.f, "Error while closing session", new Object[0]);
            }
            this.c = null;
        } else {
            dhja.l(this.f, "Closing the MSRP session - session does not exist from state:[%s]", k());
        }
        this.m = 3;
    }

    public final void i(ebix ebixVar, String str, String str2, ebjc ebjcVar, Optional optional) {
        String strF;
        int i = ebixVar.h;
        boolean z = i == 3 || i == 4;
        if (this.m == 3) {
            throw new IllegalStateException("state should not be CLOSED. did you call closeSession before calling setupSession?");
        }
        String str3 = true != z ? "msrp" : "msrps";
        String str4 = this.i;
        if (ebixVar.c()) {
            strF = f(str3, dfpk.p() ? this.a : 9);
        } else {
            strF = f(str3, this.a);
        }
        ebjv ebjvVar = new ebjv(str4, ebixVar, str, strF, str2, new ebjq(this.l), ekgb.s(ebjcVar, new ebje(this.j, ((ebjs) dfds.a(ebjs.class)).j())), new SecureRandom(), optional);
        this.c = ebjvVar;
        dhja.l(this.f, "created msrp session for SIP call id:[%s] from state:[%s]", ebjvVar.c, k());
        this.m = 2;
    }
}
