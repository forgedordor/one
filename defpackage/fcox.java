package defpackage;

import androidx.car.app.model.Alert;
import java.security.GeneralSecurityException;
import java.util.EnumSet;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fcox extends fboq {
    static final fcqb a;
    static final fchy b;
    public static final /* synthetic */ int o = 0;
    private static final long p;
    private static final fcmj q;
    public fcmt c;
    public fchy d;
    public fchy e;
    public SSLSocketFactory f;
    public final boolean g;
    public fcqb h;
    public long i;
    public long j;
    public int k;
    public int l;
    public int m;
    public int n;
    private final fchf r;

    static {
        Logger.getLogger(fcox.class.getName());
        fcqa fcqaVar = new fcqa(fcqb.a);
        fcqaVar.a(fcpz.TLS_ECDHE_ECDSA_WITH_AES_128_GCM_SHA256, fcpz.TLS_ECDHE_RSA_WITH_AES_128_GCM_SHA256, fcpz.TLS_ECDHE_ECDSA_WITH_AES_256_GCM_SHA384, fcpz.TLS_ECDHE_RSA_WITH_AES_256_GCM_SHA384, fcpz.TLS_ECDHE_ECDSA_WITH_CHACHA20_POLY1305_SHA256, fcpz.TLS_ECDHE_RSA_WITH_CHACHA20_POLY1305_SHA256);
        fcqaVar.c(fcqn.TLS_1_2);
        fcqaVar.b();
        a = new fcqb(fcqaVar);
        p = TimeUnit.DAYS.toNanos(1000L);
        fcor fcorVar = new fcor();
        q = fcorVar;
        b = new fcml(fcorVar);
        EnumSet.of(fbtn.MTLS, fbtn.CUSTOM_MANAGERS);
    }

    public fcox(String str) {
        this.c = fcmu.a;
        this.d = b;
        this.e = new fcml(fcdy.p);
        this.h = a;
        this.n = 1;
        this.i = Long.MAX_VALUE;
        this.j = fcdy.l;
        this.k = 65535;
        this.l = 4194304;
        this.m = Alert.DURATION_SHOW_INDEFINITELY;
        this.r = new fchf(str, new fcou(this), new fcot(this));
        this.g = false;
    }

    @Override // defpackage.fboq
    protected final fbqo b() {
        return this.r;
    }

    final SSLSocketFactory m() {
        int i = this.n;
        int i2 = i - 1;
        if (i == 0) {
            throw null;
        }
        if (i2 != 0) {
            throw new RuntimeException("Unknown negotiation type: ".concat(fcos.a(1)));
        }
        try {
            if (this.f == null) {
                this.f = SSLContext.getInstance("Default", fcql.b.c).getSocketFactory();
            }
            return this.f;
        } catch (GeneralSecurityException e) {
            throw new RuntimeException("TLS Provider failure", e);
        }
    }

    public final void n(long j, TimeUnit timeUnit) {
        ejwl.b(j > 0, "keepalive time must be positive");
        long nanos = timeUnit.toNanos(j);
        this.i = nanos;
        long jMax = Math.max(nanos, fcfk.a);
        this.i = jMax;
        if (jMax >= p) {
            this.i = Long.MAX_VALUE;
        }
    }

    public final void o(long j, TimeUnit timeUnit) {
        ejwl.b(j > 0, "keepalive timeout must be positive");
        long nanos = timeUnit.toNanos(j);
        this.j = nanos;
        this.j = Math.max(nanos, fcfk.b);
    }

    public final void p(Executor executor) {
        if (executor == null) {
            this.d = b;
        } else {
            this.d = new fcdj(executor);
        }
    }

    public final void q() {
        ejwl.m(true, "Cannot change security when using ChannelCredentials");
        this.n = 1;
    }

    public fcox(String str, int i) {
        this(fcdy.d(str, i));
    }
}
