package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class drph extends ub {
    final /* synthetic */ drpq c;
    final /* synthetic */ drpl d;

    public drph(drpl drplVar, drpq drpqVar) {
        this.c = drpqVar;
        this.d = drplVar;
    }

    @Override // defpackage.ub
    public final int b(int i) {
        int iDF = this.d.g.dF(i);
        if (iDF == drrq.a || iDF == drrp.a || iDF == drsb.a) {
            return this.c.a();
        }
        return 1;
    }
}
