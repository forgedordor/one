package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ecaf {
    private static volatile ebzy b;
    public static final ecaq a = new ecaq("debug.poke");
    private static final List c = new ArrayList();

    private ecaf() {
    }

    public static ebzu a(ebzv ebzvVar, String str) {
        if (ebzvVar instanceof ebzx) {
            return ((ebzx) ebzvVar).a(str);
        }
        List<ebzu> listD = ebzvVar.d();
        if (listD == null) {
            return null;
        }
        for (ebzu ebzuVar : listD) {
            if (ebzuVar.b().equals(str)) {
                return ebzuVar;
            }
        }
        return null;
    }

    public static ebzv b(ebzv ebzvVar, String str) {
        if (ebzvVar instanceof ebzx) {
            return ((ebzx) ebzvVar).b(str);
        }
        List<ebzv> listE = ebzvVar.e();
        if (listE == null) {
            return null;
        }
        for (ebzv ebzvVar2 : listE) {
            if (ebzvVar2.c().equals(str)) {
                return ebzvVar2;
            }
        }
        return null;
    }

    public static ebzy c() {
        ebzy ecabVar;
        ebzy ebzyVar = b;
        if (ebzyVar != null) {
            return ebzyVar;
        }
        synchronized (ecaf.class) {
            ecabVar = b;
            if (ecabVar == null) {
                if (ecad.b) {
                    ecabVar = new ebzw("[poke]");
                    List list = c;
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        ((ecac) it.next()).a(ecabVar);
                    }
                    list.clear();
                } else {
                    ecabVar = new ecab();
                }
                b = ecabVar;
            }
        }
        return ecabVar;
    }

    public static ecae d() {
        Class cls;
        if (!ecad.b || (cls = ecad.a) == null) {
            return null;
        }
        try {
            return (ecae) cls.newInstance();
        } catch (ClassCastException | IllegalAccessException | InstantiationException unused) {
            return null;
        }
    }

    public static void e(ecac ecacVar) {
        if (ecad.b) {
            synchronized (ecaf.class) {
                if (b != null) {
                    ecacVar.a(b);
                } else {
                    c.add(ecacVar);
                }
            }
        }
    }
}
