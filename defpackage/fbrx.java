package defpackage;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fbrx {
    private static final Logger a = Logger.getLogger(fbrx.class.getName());
    private static fbrx b;
    private String c = "unknown";
    private final LinkedHashSet d = new LinkedHashSet();
    private ekgp e = ekoj.a;

    public static synchronized fbrx b() {
        if (b == null) {
            ArrayList arrayList = new ArrayList();
            try {
                arrayList.add(Class.forName("fcdf"));
            } catch (ClassNotFoundException e) {
                a.logp(Level.FINE, "io.grpc.NameResolverRegistry", "getHardCodedClasses", "Unable to find DNS NameResolver", (Throwable) e);
            }
            List<fbrv> listA = fbtb.a(fbrv.class, DesugarCollections.unmodifiableList(arrayList), fbrv.class.getClassLoader(), new fbrw());
            if (listA.isEmpty()) {
                a.logp(Level.WARNING, "io.grpc.NameResolverRegistry", "getDefaultRegistry", "No NameResolverProviders found via ServiceLoader, including for DNS. This is probably due to a broken build. If using ProGuard, check your configuration");
            }
            b = new fbrx();
            for (fbrv fbrvVar : listA) {
                a.logp(Level.FINE, "io.grpc.NameResolverRegistry", "getDefaultRegistry", "Service loader found ".concat(String.valueOf(String.valueOf(fbrvVar))));
                b.f(fbrvVar);
            }
            b.g();
        }
        return b;
    }

    private final synchronized void f(fbrv fbrvVar) {
        fbrvVar.d();
        ejwl.b(true, "isAvailable() returned false");
        this.d.add(fbrvVar);
    }

    private final synchronized void g() {
        HashMap map = new HashMap();
        Iterator it = this.d.iterator();
        String strB = "unknown";
        char c = 0;
        while (it.hasNext()) {
            fbrv fbrvVar = (fbrv) it.next();
            String strB2 = fbrvVar.b();
            if (((fbrv) map.get(strB2)) != null) {
                fbrvVar.e();
            } else {
                map.put(strB2, fbrvVar);
            }
            fbrvVar.e();
            if (c < 5) {
                fbrvVar.e();
                strB = fbrvVar.b();
            }
            c = 5;
        }
        this.e = ekgp.j(map);
        this.c = strB;
    }

    public final fbrv a(String str) {
        if (str == null) {
            return null;
        }
        return (fbrv) d().get(str.toLowerCase(Locale.US));
    }

    public final synchronized String c() {
        return this.c;
    }

    final synchronized Map d() {
        return this.e;
    }

    public final synchronized void e(fbrv fbrvVar) {
        f(fbrvVar);
        g();
    }
}
