package defpackage;

import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bqkg extends dqws {
    public bqkg(String[] strArr) {
        super("message_reactions", strArr, null, null, null, "$primary");
    }

    @Override // defpackage.dqws
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final bqkf b() {
        l();
        return new bqkf(this.a.a());
    }

    public final void c(bqjq... bqjqVarArr) {
        int iIntValue = bqkl.c().intValue();
        for (bqjq bqjqVar : bqjqVarArr) {
            if (((Integer) bqkl.b.getOrDefault(bqjqVar.toString(), -1)).intValue() > iIntValue) {
                dqru.x("columnReference.toString()", iIntValue);
            }
        }
        m(bqjqVarArr);
    }

    public final void d(Function function) {
        c((bqjq[]) function.apply(bqkl.c));
    }

    public final void e(Function function) {
        c((bqjq) function.apply(bqkl.c));
    }

    public final void f(Function function) {
        String[] strArr = bqkl.a;
        k(new bqkj((bqkk) function.apply(new bqkk())));
    }
}
