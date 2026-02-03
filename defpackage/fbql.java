package defpackage;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fbql {
    private static final Logger a = Logger.getLogger(fbql.class.getName());
    private static fbql b;
    private static final Iterable c;
    private final LinkedHashSet d = new LinkedHashSet();
    private final LinkedHashMap e = new LinkedHashMap();

    static {
        ArrayList arrayList = new ArrayList();
        try {
            arrayList.add(Class.forName("fcis"));
        } catch (ClassNotFoundException e) {
            a.logp(Level.WARNING, "io.grpc.LoadBalancerRegistry", "getHardCodedClasses", "Unable to find pick-first LoadBalancer", (Throwable) e);
        }
        try {
            arrayList.add(Class.forName("fcsp"));
        } catch (ClassNotFoundException e2) {
            a.logp(Level.FINE, "io.grpc.LoadBalancerRegistry", "getHardCodedClasses", "Unable to find round-robin LoadBalancer", (Throwable) e2);
        }
        c = DesugarCollections.unmodifiableList(arrayList);
    }

    public static synchronized fbql b() {
        if (b == null) {
            List<fbqj> listA = fbtb.a(fbqj.class, c, fbqj.class.getClassLoader(), new fbqk());
            b = new fbql();
            for (fbqj fbqjVar : listA) {
                a.logp(Level.FINE, "io.grpc.LoadBalancerRegistry", "getDefaultRegistry", "Service loader found ".concat(String.valueOf(String.valueOf(fbqjVar))));
                b.c(fbqjVar);
            }
            b.d();
        }
        return b;
    }

    private final synchronized void c(fbqj fbqjVar) {
        fbqjVar.e();
        ejwl.b(true, "isAvailable() returned false");
        this.d.add(fbqjVar);
    }

    private final synchronized void d() {
        LinkedHashMap linkedHashMap = this.e;
        linkedHashMap.clear();
        Iterator it = this.d.iterator();
        while (it.hasNext()) {
            fbqj fbqjVar = (fbqj) it.next();
            String strC = fbqjVar.c();
            if (((fbqj) linkedHashMap.get(strC)) != null) {
                fbqjVar.d();
            } else {
                linkedHashMap.put(strC, fbqjVar);
            }
        }
    }

    public final synchronized fbqj a(String str) {
        return (fbqj) this.e.get(str);
    }
}
