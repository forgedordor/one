package defpackage;

import java.util.Iterator;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cbba implements cbaz {
    static final cczv a;
    private static final cqce b = cqce.g("BugleWorkQueue", "WorkQueueHandlerManagerImpl");
    private final fcsu c;
    private final fcsu d;

    static {
        dzzf dzzfVar = cdag.a;
        a = new cdaf(cdag.a, "WorkQueue__").a("max_rows_per_query", 100);
    }

    public cbba(fcsu fcsuVar, fcsu fcsuVar2) {
        boolean z;
        this.c = fcsuVar;
        this.d = fcsuVar2;
        Iterator it = ((Map) fcsuVar.b()).keySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                z = true;
                break;
            }
            String str = (String) it.next();
            if (str.contains("-")) {
                b.n("illegal handler name (contains -): ".concat(String.valueOf(str)));
                z = false;
                break;
            }
        }
        ejwl.l(z);
    }

    @Override // defpackage.cbaz
    public final int a(String str) {
        Integer num = (Integer) ((Map) this.d.b()).get(str);
        if (num == null) {
            num = (Integer) a.e();
        }
        return num.intValue();
    }

    @Override // defpackage.cbaz
    public final cazg b(String str) {
        fcsu fcsuVar = (fcsu) ((Map) this.c.b()).get(str);
        if (fcsuVar != null) {
            return (cazg) fcsuVar.b();
        }
        return null;
    }

    @Override // defpackage.cbaz
    public final cazg c(String str) {
        fcsu fcsuVar = this.c;
        fcsu fcsuVar2 = (fcsu) ((Map) fcsuVar.b()).get(str);
        if (fcsuVar2 == null) {
            fcsuVar2 = (fcsu) ((Map) fcsuVar.b()).get("__UNHANDLED_HANDLER");
        }
        if (fcsuVar2 != null) {
            return (cazg) fcsuVar2.b();
        }
        throw new IllegalArgumentException(a.a(str, "no default handler found (type was ", ")"));
    }

    @Override // defpackage.cbaz
    public final String d(cazg cazgVar) {
        for (Map.Entry entry : ((Map) this.c.b()).entrySet()) {
            if (((cazg) ((fcsu) entry.getValue()).b()).getClass().getName().equals(cazgVar.getClass().getName())) {
                return (String) entry.getKey();
            }
        }
        return null;
    }
}
