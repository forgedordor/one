package defpackage;

import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bpzs extends dqws<bpze, bpzr, bpzs, bpyn, bpzd> {
    public bpzs(String[] strArr) {
        super("messages_annotations", strArr, null, null, null, "$primary");
    }

    private final void f(bpzd... bpzdVarArr) {
        int iIntValue = bpzx.c().intValue();
        for (bpzd bpzdVar : bpzdVarArr) {
            if (((Integer) bpzx.b.getOrDefault(bpzdVar.toString(), -1)).intValue() > iIntValue) {
                dqru.x("columnReference.toString()", iIntValue);
            }
        }
        m(bpzdVarArr);
    }

    @Override // defpackage.dqws
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final bpzr b() {
        l();
        return new bpzr(this.a.a());
    }

    public final void c(Function function) {
        f((bpzd[]) function.apply(bpzx.c));
    }

    public final void d(Function function) {
        f((bpzd) function.apply(bpzx.c));
    }

    public final void e(Function function) {
        String[] strArr = bpzx.a;
        k(new bpzv((bpzw) function.apply(new bpzw())));
    }
}
