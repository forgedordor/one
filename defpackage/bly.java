package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bly {
    private final List a;

    public bly(List list) {
        this.a = new ArrayList(list);
    }

    public static String b(bly blyVar) {
        ArrayList arrayList = new ArrayList();
        Iterator it = blyVar.a.iterator();
        while (it.hasNext()) {
            arrayList.add(((bls) it.next()).getClass().getSimpleName());
        }
        StringBuilder sb = new StringBuilder();
        Iterator it2 = arrayList.iterator();
        if (it2.hasNext()) {
            while (true) {
                sb.append((CharSequence) it2.next());
                if (!it2.hasNext()) {
                    break;
                }
                sb.append((CharSequence) " | ");
            }
        }
        return sb.toString();
    }

    public final bls a(Class cls) {
        for (bls blsVar : this.a) {
            if (blsVar.getClass() == cls) {
                return blsVar;
            }
        }
        return null;
    }

    public final List c(Class cls) {
        ArrayList arrayList = new ArrayList();
        for (bls blsVar : this.a) {
            if (cls.isAssignableFrom(blsVar.getClass())) {
                arrayList.add(blsVar);
            }
        }
        return arrayList;
    }

    public final boolean d(Class cls) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            if (cls.isAssignableFrom(((bls) it.next()).getClass())) {
                return true;
            }
        }
        return false;
    }
}
