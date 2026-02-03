package defpackage;

import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class btbo extends dqws {
    public btbo(String[] strArr) {
        super("read_reports", strArr, null, null, null, "$primary");
    }

    @Override // defpackage.dqws
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final btbn b() {
        l();
        return new btbn(this.a.a());
    }

    public final void c(btbb... btbbVarArr) {
        int iIntValue = btbt.d().intValue();
        for (btbb btbbVar : btbbVarArr) {
            if (((Integer) btbt.b.getOrDefault(btbbVar.toString(), -1)).intValue() > iIntValue) {
                dqru.x("columnReference.toString()", iIntValue);
            }
        }
        m(btbbVarArr);
    }

    public final void d(Function function) {
        c((btbb[]) function.apply(btbt.c));
    }

    public final void e(Function function) {
        String[] strArr = btbt.a;
        k(new btbr((btbs) function.apply(new btbs())));
    }
}
