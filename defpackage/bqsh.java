package defpackage;

import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bqsh extends dqws {
    public bqsh(String[] strArr) {
        super("message_star", strArr, null, null, null, "$primary");
    }

    @Override // defpackage.dqws
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final bqsg b() {
        l();
        return new bqsg(this.a.a());
    }

    public final void c(bqrw... bqrwVarArr) {
        int iA = bqsm.b().a();
        Integer.valueOf(iA).getClass();
        for (bqrw bqrwVar : bqrwVarArr) {
            if (((Integer) bqsm.b.getOrDefault(bqrwVar.toString(), -1)).intValue() > iA) {
                dqru.x("columnReference.toString()", iA);
            }
        }
        m(bqrwVarArr);
    }

    public final void d(Function function) {
        c((bqrw[]) function.apply(bqsm.c));
    }

    public final void e(Function function) {
        String[] strArr = bqsm.a;
        k(new bqsk((bqsl) function.apply(new bqsl())));
    }
}
