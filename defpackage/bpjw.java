package defpackage;

import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bpjw extends dqws {
    public bpjw(String[] strArr) {
        super("events", strArr, null, null, null, "$primary");
    }

    @Override // defpackage.dqws
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final bpju b() {
        l();
        return new bpju(this.a.a());
    }

    public final void c(Function function) {
        bpjh[] bpjhVarArr = (bpjh[]) function.apply(bpjz.c);
        int iA = bpjz.b().a();
        Integer.valueOf(iA).getClass();
        for (bpjh bpjhVar : bpjhVarArr) {
            if (((Integer) bpjz.b.getOrDefault(bpjhVar.toString(), -1)).intValue() > iA) {
                dqru.x("columnReference.toString()", iA);
            }
        }
        m(bpjhVarArr);
    }
}
