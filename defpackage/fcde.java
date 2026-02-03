package defpackage;

import j$.util.DesugarCollections;
import java.net.InetAddress;
import java.net.URI;
import java.net.UnknownHostException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fcde extends fbru {
    public static final Logger a;
    public static final Set b;
    static final boolean c;
    static final boolean d;
    protected static final boolean e;
    public static final fcdd f;
    private static final String r;
    private static final String s;
    private static final String t;
    private static String u;
    public final String i;
    public final int j;
    public final long k;
    public final fbtk l;
    public final fbrt m;
    public final ejxm n;
    protected boolean o;
    public boolean p;
    private final String v;
    private final fchy w;
    private boolean x;
    private Executor y;
    private fbrq z;
    public final Random g = new Random();
    protected volatile int q = 1;
    public final AtomicReference h = new AtomicReference();

    static {
        Logger logger = Logger.getLogger(fcde.class.getName());
        a = logger;
        b = DesugarCollections.unmodifiableSet(new HashSet(Arrays.asList("clientLanguage", "percentage", "clientHostname", "serviceConfig")));
        String property = System.getProperty("io.grpc.internal.DnsNameResolverProvider.enable_jndi", "true");
        r = property;
        String property2 = System.getProperty("io.grpc.internal.DnsNameResolverProvider.enable_jndi_localhost", "false");
        s = property2;
        String property3 = System.getProperty("io.grpc.internal.DnsNameResolverProvider.enable_service_config", "false");
        t = property3;
        c = Boolean.parseBoolean(property);
        d = Boolean.parseBoolean(property2);
        e = Boolean.parseBoolean(property3);
        fcdd fcddVar = null;
        try {
            try {
                try {
                    fcdd fcddVar2 = (fcdd) Class.forName("io.grpc.internal.JndiResourceResolverFactory", true, fcde.class.getClassLoader()).asSubclass(fcdd.class).getConstructor(null).newInstance(null);
                    if (fcddVar2.b() != null) {
                        logger.logp(Level.FINE, "io.grpc.internal.DnsNameResolver", "getResourceResolverFactory", "JndiResourceResolverFactory not available, skipping.", fcddVar2.b());
                    } else {
                        fcddVar = fcddVar2;
                    }
                } catch (Exception e2) {
                    a.logp(Level.FINE, "io.grpc.internal.DnsNameResolver", "getResourceResolverFactory", "Can't construct JndiResourceResolverFactory, skipping.", (Throwable) e2);
                }
            } catch (Exception e3) {
                a.logp(Level.FINE, "io.grpc.internal.DnsNameResolver", "getResourceResolverFactory", "Can't find JndiResourceResolverFactory ctor, skipping.", (Throwable) e3);
            }
        } catch (ClassCastException e4) {
            a.logp(Level.FINE, "io.grpc.internal.DnsNameResolver", "getResourceResolverFactory", "Unable to cast JndiResourceResolverFactory, skipping.", (Throwable) e4);
        } catch (ClassNotFoundException e5) {
            a.logp(Level.FINE, "io.grpc.internal.DnsNameResolver", "getResourceResolverFactory", "Unable to find JndiResourceResolverFactory, skipping.", (Throwable) e5);
        }
        f = fcddVar;
    }

    protected fcde(String str, fbrn fbrnVar, fcmj fcmjVar, ejxm ejxmVar, boolean z) throws NumberFormatException {
        fbrnVar.getClass();
        str.getClass();
        URI uriCreate = URI.create("//".concat(str));
        ejwl.f(uriCreate.getHost() != null, "Invalid DNS name: %s", str);
        String authority = uriCreate.getAuthority();
        authority.getClass();
        this.v = authority;
        this.i = uriCreate.getHost();
        if (uriCreate.getPort() == -1) {
            this.j = fbrnVar.a;
        } else {
            this.j = uriCreate.getPort();
        }
        Executor executor = fbrnVar.f;
        if (executor != null) {
            this.w = new fcdj(executor);
        } else {
            this.w = new fcml(fcmjVar);
        }
        long nanos = 0;
        if (!z) {
            String property = System.getProperty("networkaddress.cache.ttl");
            long j = 30;
            if (property != null) {
                try {
                    j = Long.parseLong(property);
                } catch (NumberFormatException unused) {
                    a.logp(Level.WARNING, "io.grpc.internal.DnsNameResolver", "getNetworkAddressCacheTtlNanos", "Property({0}) valid is not valid number format({1}), fall back to default({2})", new Object[]{"networkaddress.cache.ttl", property, 30L});
                }
            }
            nanos = j > 0 ? TimeUnit.SECONDS.toNanos(j) : j;
        }
        this.k = nanos;
        this.n = ejxmVar;
        this.l = fbrnVar.c;
        this.m = fbrnVar.d;
    }

    public static String e() {
        if (u == null) {
            try {
                u = InetAddress.getLocalHost().getHostName();
            } catch (UnknownHostException e2) {
                throw new RuntimeException(e2);
            }
        }
        return u;
    }

    private final void f() {
        if (this.p || this.x) {
            return;
        }
        if (this.o) {
            long j = this.k;
            if (j != 0 && (j <= 0 || this.n.a(TimeUnit.NANOSECONDS) <= j)) {
                return;
            }
        }
        this.p = true;
        this.y.execute(new fcdb(this, this.z));
    }

    @Override // defpackage.fbru
    public final String a() {
        return this.v;
    }

    @Override // defpackage.fbru
    public final void b() {
        if (this.x) {
            return;
        }
        this.x = true;
        Executor executor = this.y;
        if (executor != null) {
            this.w.b(executor);
            this.y = null;
        }
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, java.util.concurrent.Executor] */
    @Override // defpackage.fbru
    public final void c(fbrq fbrqVar) {
        ejwl.m(this.z == null, "already started");
        this.y = this.w.a();
        this.z = fbrqVar;
        f();
    }

    @Override // defpackage.fbru
    public final void d() {
        ejwl.m(this.z != null, "not started");
        f();
    }
}
