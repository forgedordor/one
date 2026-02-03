package defpackage;

import io.grpc.Status;
import j$.util.DesugarCollections;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.charset.Charset;
import java.util.EnumSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fcdy {
    public static final fbrb b;
    public static final fbrb c;
    public static final fbrb d;
    public static final fbrb e;
    public static final fbrb f;
    static final fbrb g;
    public static final fbrb h;
    public static final fbrb i;
    public static final fbrb j;
    public static final ejxk k;
    public static final long l;
    public static final fbsh m;
    public static final fbnb n;
    public static final fcmj o;
    public static final fcmj p;
    public static final ejxr q;
    private static final fbnm t;
    private static final Logger r = Logger.getLogger(fcdy.class.getName());
    private static final Set s = DesugarCollections.unmodifiableSet(EnumSet.of(Status.Code.OK, Status.Code.INVALID_ARGUMENT, Status.Code.NOT_FOUND, Status.Code.ALREADY_EXISTS, Status.Code.FAILED_PRECONDITION, Status.Code.ABORTED, Status.Code.OUT_OF_RANGE, Status.Code.DATA_LOSS));
    public static final Charset a = Charset.forName("US-ASCII");

    static {
        fcdx fcdxVar = new fcdx();
        int i2 = fbrb.d;
        b = new fbqw("grpc-timeout", fcdxVar);
        c = new fbqw("grpc-encoding", fbrg.c);
        d = fbpp.a("grpc-accept-encoding", new fcdv());
        e = new fbqw("content-encoding", fbrg.c);
        f = fbpp.a("accept-encoding", new fcdv());
        g = new fbqw("content-length", fbrg.c);
        h = new fbqw("content-type", fbrg.c);
        i = new fbqw("te", fbrg.c);
        j = new fbqw("user-agent", fbrg.c);
        k = ejxk.b(',').f();
        l = TimeUnit.SECONDS.toNanos(20L);
        TimeUnit.HOURS.toNanos(2L);
        TimeUnit.SECONDS.toNanos(20L);
        m = new fciw();
        n = new fbnb("io.grpc.internal.CALL_OPTIONS_RPC_OWNED_BY_BALANCER", null);
        t = new fcdr();
        o = new fcds();
        p = new fcdt();
        q = new fcdu();
    }

    private fcdy() {
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0035  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static io.grpc.Status a(int r2) {
        /*
            r0 = 100
            if (r2 < r0) goto Lb
            r0 = 200(0xc8, float:2.8E-43)
            if (r2 >= r0) goto Lb
            io.grpc.Status$Code r0 = io.grpc.Status.Code.INTERNAL
            goto L37
        Lb:
            r0 = 400(0x190, float:5.6E-43)
            if (r2 == r0) goto L35
            r0 = 401(0x191, float:5.62E-43)
            if (r2 == r0) goto L32
            r0 = 403(0x193, float:5.65E-43)
            if (r2 == r0) goto L2f
            r0 = 404(0x194, float:5.66E-43)
            if (r2 == r0) goto L2c
            r0 = 429(0x1ad, float:6.01E-43)
            if (r2 == r0) goto L29
            r0 = 431(0x1af, float:6.04E-43)
            if (r2 == r0) goto L35
            switch(r2) {
                case 502: goto L29;
                case 503: goto L29;
                case 504: goto L29;
                default: goto L26;
            }
        L26:
            io.grpc.Status$Code r0 = io.grpc.Status.Code.UNKNOWN
            goto L37
        L29:
            io.grpc.Status$Code r0 = io.grpc.Status.Code.UNAVAILABLE
            goto L37
        L2c:
            io.grpc.Status$Code r0 = io.grpc.Status.Code.UNIMPLEMENTED
            goto L37
        L2f:
            io.grpc.Status$Code r0 = io.grpc.Status.Code.PERMISSION_DENIED
            goto L37
        L32:
            io.grpc.Status$Code r0 = io.grpc.Status.Code.UNAUTHENTICATED
            goto L37
        L35:
            io.grpc.Status$Code r0 = io.grpc.Status.Code.INTERNAL
        L37:
            io.grpc.Status r0 = r0.a()
            java.lang.String r1 = "HTTP status code "
            java.lang.String r2 = defpackage.a.g(r2, r1)
            io.grpc.Status r2 = r0.withDescription(r2)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fcdy.a(int):io.grpc.Status");
    }

    public static Status b(Status status) {
        ejwl.a(status != null);
        if (!s.contains(status.getCode())) {
            return status;
        }
        return Status.o.withDescription("Inappropriate status code from control plane: " + status.getCode().toString() + " " + status.getDescription()).d(status.t);
    }

    static fcaq c(fbqc fbqcVar, boolean z) {
        fcaq fcaqVarA;
        fbqf fbqfVar = fbqcVar.b;
        if (fbqfVar != null) {
            fcgv fcgvVar = (fcgv) fbqfVar;
            ejwl.m(fcgvVar.g, "Subchannel is not started");
            fcaqVarA = fcgvVar.f.a();
        } else {
            fcaqVarA = null;
        }
        if (fcaqVarA != null) {
            return fcaqVarA;
        }
        Status status = fbqcVar.c;
        if (!status.f()) {
            if (fbqcVar.d) {
                return new fcdi(b(status), fcao.DROPPED);
            }
            if (!z) {
                return new fcdi(b(status), fcao.PROCESSED);
            }
        }
        return null;
    }

    public static String d(String str, int i2) {
        String str2;
        int i3;
        try {
            str2 = str;
            i3 = i2;
            try {
                return new URI(null, null, str2, i3, null, null, null).getAuthority();
            } catch (URISyntaxException e2) {
                e = e2;
                throw new IllegalArgumentException(a.B(i3, str2, "Invalid host or port: ", " "), e);
            }
        } catch (URISyntaxException e3) {
            e = e3;
            str2 = str;
            i3 = i2;
        }
    }

    public static String e(String str, String str2) {
        StringBuilder sb = new StringBuilder();
        if (str2 != null) {
            sb.append(str2);
            sb.append(' ');
        }
        sb.append("grpc-java-");
        sb.append(str);
        sb.append("/1.73.0-SNAPSHOT");
        return sb.toString();
    }

    public static URI f(String str) {
        String str2;
        str.getClass();
        try {
            str2 = str;
        } catch (URISyntaxException e2) {
            e = e2;
            str2 = str;
        }
        try {
            return new URI(null, str2, null, null, null);
        } catch (URISyntaxException e3) {
            e = e3;
            throw new IllegalArgumentException("Invalid authority: ".concat(str2), e);
        }
    }

    static void g(fcmo fcmoVar) throws IOException {
        while (true) {
            InputStream inputStreamG = fcmoVar.g();
            if (inputStreamG == null) {
                return;
            } else {
                h(inputStreamG);
            }
        }
    }

    public static void h(Closeable closeable) throws IOException {
        try {
            closeable.close();
        } catch (IOException e2) {
            r.logp(Level.WARNING, "io.grpc.internal.GrpcUtil", "closeQuietly", "exception caught in closeQuietly", (Throwable) e2);
        }
    }

    public static boolean i(String str, boolean z) {
        String strTrim = System.getenv(str);
        if (strTrim == null) {
            strTrim = System.getProperty(str);
        }
        if (strTrim != null) {
            strTrim = strTrim.trim();
        }
        return z ? ejwk.c(strTrim) || Boolean.parseBoolean(strTrim) : !ejwk.c(strTrim) && Boolean.parseBoolean(strTrim);
    }

    public static boolean j(fbnc fbncVar) {
        return !Boolean.TRUE.equals(fbncVar.h(n));
    }

    public static ThreadFactory k(String str) {
        eosw eoswVar = new eosw();
        eoswVar.c(true);
        eoswVar.d(str);
        return eosw.b(eoswVar);
    }

    public static fbnm[] l(fbnc fbncVar) {
        List list = fbncVar.g;
        int size = list.size();
        fbnm[] fbnmVarArr = new fbnm[size + 1];
        fbncVar.getClass();
        for (int i2 = 0; i2 < list.size(); i2++) {
            fbnmVarArr[i2] = ((fbnl) list.get(i2)).a();
        }
        fbnmVarArr[size] = t;
        return fbnmVarArr;
    }
}
