package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fglz {
    public final List a = new ArrayList();

    public static fglz c(fgly fglyVar) {
        fglz fglzVar = new fglz();
        fglzVar.d(fglyVar);
        return fglzVar;
    }

    public final String a() {
        StringBuilder sb = new StringBuilder();
        int i = 0;
        while (true) {
            List list = this.a;
            if (i >= list.size()) {
                return sb.toString();
            }
            if (i != 0) {
                sb.append('\n');
            }
            sb.append(((fgly) list.get(i)).a);
            i++;
        }
    }

    public final List b() {
        ArrayList arrayList = new ArrayList();
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            fgll fgllVar = ((fgly) it.next()).b;
        }
        return arrayList;
    }

    public final void d(fgly fglyVar) {
        this.a.add(fglyVar);
    }

    public final boolean e() {
        return this.a.isEmpty();
    }
}
