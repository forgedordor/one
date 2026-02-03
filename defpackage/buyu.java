package defpackage;

import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class buyu extends dqws {
    public buyu(String[] strArr) {
        super("user_references", strArr, null, null, null, "$primary");
    }

    @Override // defpackage.dqws
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final buys b() {
        l();
        return new buys(this.a.a());
    }

    public final void c(Function function) {
        buye[] buyeVarArr = (buye[]) function.apply(buyx.c);
        int iA = buyx.c().a();
        Integer.valueOf(iA).getClass();
        for (buye buyeVar : buyeVarArr) {
            if (((Integer) buyx.b.getOrDefault(buyeVar.toString(), -1)).intValue() > iA) {
                dqru.x("columnReference.toString()", iA);
            }
        }
        m(buyeVarArr);
    }

    public final void d(Function function) {
        String[] strArr = buyx.a;
        k(new buyv((buyw) function.apply(new buyw())));
    }
}
