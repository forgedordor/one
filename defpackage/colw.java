package defpackage;

import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class colw extends dqws {
    public colw(String[] strArr) {
        super("file_transfer", strArr, null, null, null, "$primary");
    }

    @Override // defpackage.dqws
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final colv b() {
        l();
        return new colv(this.a.a());
    }

    public final void c(colg... colgVarArr) {
        int iIntValue = comb.d().intValue();
        for (colg colgVar : colgVarArr) {
            if (((Integer) comb.b.getOrDefault(colgVar.toString(), -1)).intValue() > iIntValue) {
                dqru.x("columnReference.toString()", iIntValue);
            }
        }
        m(colgVarArr);
    }

    public final void d(coma comaVar) {
        k(new colz(comaVar));
    }

    public final void e(Function function) {
        String[] strArr = comb.a;
        k(new colz((coma) function.apply(new coma())));
    }
}
