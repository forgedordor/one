package defpackage;

import android.content.ContentValues;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class dqyj {
    final List a;

    protected dqyj(dqyp dqypVar) {
        this.a = new ArrayList(dqypVar.a);
    }

    public final String a(dqxp dqxpVar) {
        List list = this.a;
        int size = list.size();
        int size2 = list.size();
        if (size2 == 0) {
            return "1";
        }
        if (size2 == 1) {
            StringBuilder sb = new StringBuilder();
            ((dqyq) list.get(0)).b(dqxpVar, sb);
            return sb.toString();
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("(");
        ((dqyq) list.get(0)).b(dqxpVar, sb2);
        for (int i = 1; i < size; i++) {
            sb2.append(" AND ");
            ((dqyq) list.get(i)).b(dqxpVar, sb2);
        }
        sb2.append(")");
        return sb2.toString();
    }

    public final String b(dqxp dqxpVar, List list) {
        ArrayList arrayList = new ArrayList();
        StringBuilder sb = new StringBuilder();
        List list2 = this.a;
        int size = list2.size();
        if (size != 0) {
            if (size != 1) {
                sb.append("(");
                ((dqyq) list2.get(0)).a(dqxpVar, sb, arrayList);
                for (int i = 1; i < size; i++) {
                    sb.append(" AND ");
                    ((dqyq) list2.get(i)).a(dqxpVar, sb, arrayList);
                }
                sb.append(")");
            } else {
                ((dqyq) list2.get(0)).a(dqxpVar, sb, arrayList);
            }
        } else {
            sb.append("1");
        }
        if (list != null) {
            list.addAll(arrayList);
        }
        return sb.toString();
    }

    final void c(dqpu dqpuVar) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((dqyq) it.next()).e(dqpuVar);
        }
    }

    protected final boolean d(dqwg dqwgVar, dqyq dqyqVar) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            if (((dqyq) it.next()).c(dqwgVar, dqyqVar)) {
                return true;
            }
        }
        return false;
    }

    protected final boolean e(String str, ContentValues contentValues) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            if (((dqyq) it.next()).d(str, contentValues)) {
                return true;
            }
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof dqyj)) {
            return a(dqxp.b()).equals(((dqyj) obj).a(dqxp.b()));
        }
        return false;
    }

    public final boolean f(dqyi dqyiVar) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            if (dqyiVar.a((dqyq) it.next())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return a(dqxp.b()).hashCode();
    }
}
