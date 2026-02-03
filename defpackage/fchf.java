package defpackage;

import j$.util.DesugarCollections;
import java.lang.reflect.Method;
import java.net.SocketAddress;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Pattern;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fchf extends fbqo {
    private static final Method D;
    private final List E;
    private final SocketAddress F;
    private final boolean G;
    private final boolean H;
    private final fcgz I;
    fchy d;
    public fchy e;
    fbrx f;
    final List g;
    final String h;
    String i;
    final String j;
    fboo k;
    fbns l;
    long m;
    final int n;
    final int o;
    final long p;
    final long q;
    public boolean r;
    final fbpi s;
    Map t;
    final boolean u;
    public boolean v;
    public boolean w;
    public boolean x;
    public final fcgy y;
    private static final Logger z = Logger.getLogger(fchf.class.getName());
    static final long a = TimeUnit.MINUTES.toMillis(30);
    static final long b = TimeUnit.SECONDS.toMillis(1);
    private static final fchy A = new fcml(fcdy.o);
    private static final fboo B = fboo.b;
    private static final fbns C = fbns.a;
    static final Pattern c = Pattern.compile("[a-zA-Z][a-zA-Z0-9+.-]*:/.*");

    static {
        Method declaredMethod = null;
        try {
            Class<?> cls = Class.forName("fbxh");
            Class<?> cls2 = Boolean.TYPE;
            declaredMethod = cls.getDeclaredMethod("getClientInterceptor", cls2, cls2, cls2, cls2);
        } catch (ClassNotFoundException e) {
            z.logp(Level.FINE, "io.grpc.internal.ManagedChannelImplBuilder", "<clinit>", "Unable to apply census stats", (Throwable) e);
        } catch (NoSuchMethodException e2) {
            z.logp(Level.FINE, "io.grpc.internal.ManagedChannelImplBuilder", "<clinit>", "Unable to apply census stats", (Throwable) e2);
        }
        D = declaredMethod;
    }

    public fchf(String str, fcgz fcgzVar, fcgy fcgyVar) {
        fchy fchyVar = A;
        this.d = fchyVar;
        this.e = fchyVar;
        this.E = new ArrayList();
        this.f = fbrx.b();
        this.g = new ArrayList();
        this.j = "pick_first";
        this.k = B;
        this.l = C;
        this.m = a;
        this.n = 5;
        this.o = 5;
        this.p = 16777216L;
        this.q = 1048576L;
        this.r = true;
        this.s = fbpi.b;
        this.u = true;
        this.G = true;
        this.v = true;
        this.w = true;
        this.x = true;
        this.H = true;
        new ArrayList();
        str.getClass();
        this.h = str;
        this.I = fcgzVar;
        this.F = null;
        if (fcgyVar != null) {
            this.y = fcgyVar;
        } else {
            this.y = new fchd();
        }
        fbpl.a();
    }

    static fche b(String str, fbrx fbrxVar, Collection collection) {
        URI uri;
        StringBuilder sb = new StringBuilder();
        try {
            uri = new URI(str);
        } catch (URISyntaxException e) {
            sb.append(e.getMessage());
            uri = null;
        }
        fbrv fbrvVarA = uri != null ? fbrxVar.a(uri.getScheme()) : null;
        if (fbrvVarA == null && !c.matcher(str).matches()) {
            try {
                uri = new URI(fbrxVar.c(), "", a.v(str, "/"), null);
                fbrvVarA = fbrxVar.a(uri.getScheme());
            } catch (URISyntaxException e2) {
                throw new IllegalArgumentException(e2);
            }
        }
        if (fbrvVarA == null) {
            throw new IllegalArgumentException(String.format("Could not find a NameResolverProvider for %s%s", str, sb.length() > 0 ? a.b(sb, " (", ")") : ""));
        }
        if (collection == null || collection.containsAll(fbrvVarA.c())) {
            return new fche(uri, fbrvVarA);
        }
        throw new IllegalArgumentException(String.format("Address types of NameResolver '%s' for '%s' not supported by transport", uri.getScheme(), str));
    }

    static String m(SocketAddress socketAddress) {
        try {
            return new URI("directaddress", "", a.E(socketAddress, "/"), null).toString();
        } catch (URISyntaxException e) {
            throw new RuntimeException(e);
        }
    }

    private static List n(List list) {
        ArrayList arrayList = new ArrayList(list.size());
        for (Object obj : list) {
            if (obj == null) {
                arrayList.add(null);
            } else if (obj instanceof Map) {
                arrayList.add(o((Map) obj));
            } else if (obj instanceof List) {
                arrayList.add(n((List) obj));
            } else if (obj instanceof String) {
                arrayList.add(obj);
            } else if (obj instanceof Double) {
                arrayList.add(obj);
            } else {
                if (!(obj instanceof Boolean)) {
                    throw new IllegalArgumentException("The entry '" + obj.toString() + "' is of type '" + String.valueOf(obj.getClass()) + "', which is not supported");
                }
                arrayList.add(obj);
            }
        }
        return DesugarCollections.unmodifiableList(arrayList);
    }

    private static Map o(Map map) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : map.entrySet()) {
            ejwl.f(entry.getKey() instanceof String, "The key of the entry '%s' is not of String type", entry);
            String str = (String) entry.getKey();
            Object value = entry.getValue();
            if (value == null) {
                linkedHashMap.put(str, null);
            } else if (value instanceof Map) {
                linkedHashMap.put(str, o((Map) value));
            } else if (value instanceof List) {
                linkedHashMap.put(str, n((List) value));
            } else if (value instanceof String) {
                linkedHashMap.put(str, value);
            } else if (value instanceof Double) {
                linkedHashMap.put(str, value);
            } else {
                if (!(value instanceof Boolean)) {
                    throw new IllegalArgumentException("The value of the map entry '" + String.valueOf(entry) + "' is of type '" + String.valueOf(value.getClass()) + "', which is not supported");
                }
                linkedHashMap.put(str, value);
            }
        }
        return DesugarCollections.unmodifiableMap(linkedHashMap);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:50|10|(12:46|12|13|44|14|(1:29)|48|30|31|(1:41)|42|43)(1:26)|27|(0)|48|30|31|(0)|42|43) */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00ce, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00cf, code lost:
    
        defpackage.fchf.z.logp(java.util.logging.Level.FINE, "io.grpc.internal.ManagedChannelImplBuilder", "getEffectiveInterceptors", "Unable to apply census stats", (java.lang.Throwable) r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00df, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00e0, code lost:
    
        defpackage.fchf.z.logp(java.util.logging.Level.FINE, "io.grpc.internal.ManagedChannelImplBuilder", "getEffectiveInterceptors", "Unable to apply census stats", (java.lang.Throwable) r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00f0, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00f1, code lost:
    
        defpackage.fchf.z.logp(java.util.logging.Level.FINE, "io.grpc.internal.ManagedChannelImplBuilder", "getEffectiveInterceptors", "Unable to apply census stats", (java.lang.Throwable) r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0101, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0102, code lost:
    
        defpackage.fchf.z.logp(java.util.logging.Level.FINE, "io.grpc.internal.ManagedChannelImplBuilder", "getEffectiveInterceptors", "Unable to apply census stats", (java.lang.Throwable) r0);
     */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0113  */
    @Override // defpackage.fbqo
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.fbqm a() {
        /*
            Method dump skipped, instructions count: 288
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fchf.a():fbqm");
    }

    @Override // defpackage.fbqo
    public final /* synthetic */ void c(fbns fbnsVar) {
        this.l = fbnsVar;
    }

    @Override // defpackage.fbqo
    public final /* bridge */ /* synthetic */ void d(fboo fbooVar) {
        if (fbooVar != null) {
            this.k = fbooVar;
        } else {
            this.k = B;
        }
    }

    @Override // defpackage.fbqo
    public final /* bridge */ /* synthetic */ void e(Map map) {
        this.t = o(map);
    }

    @Override // defpackage.fbqo
    public final /* bridge */ /* synthetic */ void f() {
        this.r = true;
    }

    @Override // defpackage.fbqo
    public final /* bridge */ /* synthetic */ void g(Executor executor) {
        if (executor != null) {
            this.d = new fcdj(executor);
        } else {
            this.d = A;
        }
    }

    @Override // defpackage.fbqo
    public final /* bridge */ /* synthetic */ void h(long j, TimeUnit timeUnit) {
        ejwl.e(j > 0, "idle timeout is %s, but must be positive", j);
        if (timeUnit.toDays(j) >= 30) {
            this.m = -1L;
        } else {
            this.m = Math.max(timeUnit.toMillis(j), b);
        }
    }

    @Override // defpackage.fbqo
    public final /* bridge */ /* synthetic */ void i(fbni[] fbniVarArr) {
        this.E.addAll(Arrays.asList(fbniVarArr));
    }

    @Override // defpackage.fbqo
    @Deprecated
    public final /* bridge */ /* synthetic */ void j(fbrp fbrpVar) {
        SocketAddress socketAddress = this.F;
        ejwl.p(socketAddress == null, "directServerAddress is set (%s), which forbids the use of NameResolverFactory", socketAddress);
        if (fbrpVar == null) {
            this.f = fbrx.b();
            return;
        }
        fbrx fbrxVar = new fbrx();
        fbrxVar.e((fbrv) fbrpVar);
        this.f = fbrxVar;
    }

    @Override // defpackage.fbqo
    public final /* bridge */ /* synthetic */ void k(Executor executor) {
        if (executor != null) {
            this.e = new fcdj(executor);
        } else {
            this.e = A;
        }
    }

    @Override // defpackage.fbqo
    public final /* synthetic */ void l(String str) {
        this.i = str;
    }

    public fchf(SocketAddress socketAddress, String str, fcgz fcgzVar) {
        fchy fchyVar = A;
        this.d = fchyVar;
        this.e = fchyVar;
        this.E = new ArrayList();
        this.f = fbrx.b();
        this.g = new ArrayList();
        this.j = "pick_first";
        this.k = B;
        this.l = C;
        this.m = a;
        this.n = 5;
        this.o = 5;
        this.p = 16777216L;
        this.q = 1048576L;
        this.r = true;
        this.s = fbpi.b;
        this.u = true;
        this.G = true;
        this.v = true;
        this.w = true;
        this.x = true;
        this.H = true;
        new ArrayList();
        this.h = m(socketAddress);
        this.I = fcgzVar;
        this.F = socketAddress;
        fbrx fbrxVar = new fbrx();
        fbrxVar.e(new fchb(socketAddress, str));
        this.f = fbrxVar;
        this.y = new fchd();
        fbpl.a();
    }
}
