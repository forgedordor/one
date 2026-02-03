package defpackage;

import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bpxe extends dqws {
    public bpxe(String[] strArr) {
        super("link_preview", strArr, null, null, null, "$primary");
    }

    @Override // defpackage.dqws
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final bpxd b() {
        l();
        return new bpxd(this.a.a());
    }

    public final void c(bpwj... bpwjVarArr) {
        int iIntValue = bpxj.d().intValue();
        for (bpwj bpwjVar : bpwjVarArr) {
            if (((Integer) bpxj.b.getOrDefault(bpwjVar.toString(), -1)).intValue() > iIntValue) {
                dqru.x("columnReference.toString()", iIntValue);
            }
        }
        m(bpwjVarArr);
    }

    public final void d(Function function) {
        c((bpwj[]) function.apply(bpxj.c));
    }

    public final void e(Function function) {
        String[] strArr = bpxj.a;
        k(new bpxh((bpxi) function.apply(new bpxi())));
    }
}
