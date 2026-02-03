package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
final class rim {
    private final ril a = new ril(null);
    private final Map b = new HashMap();

    private static void d(ril rilVar) {
        ril rilVar2 = rilVar.d;
        rilVar2.c = rilVar.c;
        rilVar.c.d = rilVar2;
    }

    private static void e(ril rilVar) {
        rilVar.c.d = rilVar;
        rilVar.d.c = rilVar;
    }

    public final Object a(rit ritVar) {
        Map map = this.b;
        ril rilVar = (ril) map.get(ritVar);
        if (rilVar == null) {
            rilVar = new ril(ritVar);
            map.put(ritVar, rilVar);
        } else {
            ritVar.a();
        }
        d(rilVar);
        ril rilVar2 = this.a;
        rilVar.d = rilVar2;
        rilVar.c = rilVar2.c;
        e(rilVar);
        return rilVar.b();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, rit] */
    public final Object b() {
        ril rilVar = this.a;
        for (ril rilVar2 = rilVar.d; !rilVar2.equals(rilVar); rilVar2 = rilVar2.d) {
            Object objB = rilVar2.b();
            if (objB != null) {
                return objB;
            }
            d(rilVar2);
            Map map = this.b;
            ?? r3 = rilVar2.a;
            map.remove(r3);
            r3.a();
        }
        return null;
    }

    public final void c(rit ritVar, Object obj) {
        Map map = this.b;
        ril rilVar = (ril) map.get(ritVar);
        if (rilVar == null) {
            rilVar = new ril(ritVar);
            d(rilVar);
            ril rilVar2 = this.a;
            rilVar.d = rilVar2.d;
            rilVar.c = rilVar2;
            e(rilVar);
            map.put(ritVar, rilVar);
        } else {
            ritVar.a();
        }
        if (rilVar.b == null) {
            rilVar.b = new ArrayList();
        }
        rilVar.b.add(obj);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GroupedLinkedMap( ");
        ril rilVar = this.a;
        ril rilVar2 = rilVar.c;
        boolean z = false;
        while (!rilVar2.equals(rilVar)) {
            sb.append('{');
            sb.append(rilVar2.a);
            sb.append(':');
            sb.append(rilVar2.a());
            sb.append("}, ");
            rilVar2 = rilVar2.c;
            z = true;
        }
        if (z) {
            sb.delete(sb.length() - 2, sb.length());
        }
        sb.append(" )");
        return sb.toString();
    }
}
