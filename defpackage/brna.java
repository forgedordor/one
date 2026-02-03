package defpackage;

import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class brna extends dqws {
    public brna(String[] strArr) {
        super("p2p_suggestions", strArr, null, null, null, "$primary");
    }

    @Override // defpackage.dqws
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final brmz b() {
        l();
        return new brmz(this.a.a());
    }

    public final void c(Function function) {
        brmk[] brmkVarArr = (brmk[]) function.apply(brnk.c);
        int iIntValue = brnk.c().intValue();
        for (brmk brmkVar : brmkVarArr) {
            if (((Integer) brnk.b.getOrDefault(brmkVar.toString(), -1)).intValue() > iIntValue) {
                dqru.x("columnReference.toString()", iIntValue);
            }
        }
        m(brmkVarArr);
    }

    public final void d(Function function) {
        String[] strArr = brnk.a;
        k(new brnd((brnj) function.apply(new brnj())));
    }
}
