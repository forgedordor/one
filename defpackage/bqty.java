package defpackage;

import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bqty extends dqws<bqtk, bqtx, bqty, bqsq, bqtj> {
    public bqty(String[] strArr) {
        super("message_status", strArr, null, null, null, "$primary");
    }

    @Override // defpackage.dqws
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final bqtx b() {
        l();
        return new bqtx(this.a.a());
    }

    public final void c(Function function) {
        bqtj[] bqtjVarArr = (bqtj[]) function.apply(bqub.c);
        int iA = bqub.b().a();
        Integer.valueOf(iA).getClass();
        for (bqtj bqtjVar : bqtjVarArr) {
            if (((Integer) bqub.b.getOrDefault(bqtjVar.toString(), -1)).intValue() > iA) {
                dqru.x("columnReference.toString()", iA);
            }
        }
        m(bqtjVarArr);
    }

    public final void d(Function function) {
        String[] strArr = bqub.a;
        k(new bqtz((bqua) function.apply(new bqua())));
    }
}
