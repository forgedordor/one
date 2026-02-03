package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class vtq {
    public static final vtr a(dnnp dnnpVar, int i) {
        int i2;
        dnno dnnoVar = dnnpVar.d;
        if (fdbq.f(dnnoVar, dnnm.a)) {
            i2 = 2;
        } else if (fdbq.f(dnnoVar, dnnk.a)) {
            i2 = 3;
        } else if (dnnoVar instanceof dnnn) {
            i2 = 4;
        } else {
            if (!fdbq.f(dnnoVar, dnnl.a)) {
                throw new fctg();
            }
            i2 = i == 3 ? 5 : 6;
        }
        return new vtr(dnnpVar.b, i2, dnnpVar.e);
    }
}
