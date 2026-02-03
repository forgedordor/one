package defpackage;

import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bqlw extends dqws {
    public bqlw(String[] strArr) {
        super("message_replies", strArr, null, null, null, "$primary");
    }

    @Override // defpackage.dqws
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final bqlv b() {
        l();
        return new bqlv(this.a.a());
    }

    public final void c(bqlj... bqljVarArr) {
        int iA = bqmc.c().a();
        Integer.valueOf(iA).getClass();
        for (bqlj bqljVar : bqljVarArr) {
            if (((Integer) bqmc.b.getOrDefault(bqljVar.toString(), -1)).intValue() > iA) {
                dqru.x("columnReference.toString()", iA);
            }
        }
        m(bqljVarArr);
    }

    public final void d(Function function) {
        c((bqlj) function.apply(bqmc.c));
    }

    public final void e(Function function) {
        String[] strArr = bqmc.a;
        k(new bqma((bqmb) function.apply(new bqmb())));
    }
}
