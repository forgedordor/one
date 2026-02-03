package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hmy implements hpz {
    final /* synthetic */ hnq a;
    final /* synthetic */ how b;

    public hmy(hnq hnqVar, how howVar) {
        this.a = hnqVar;
        this.b = howVar;
    }

    @Override // defpackage.hpz
    public final int c(hpx hpxVar, Object obj) {
        hnq hnqVar = this.a;
        hpz hpzVar = hnqVar instanceof hpz ? (hpz) hnqVar : null;
        int iC = hpzVar != null ? hpzVar.c(hpxVar, obj) : 1;
        if (iC != 1) {
            return iC;
        }
        how howVar = this.b;
        howVar.f = fcva.ai(howVar.f, new fcti(hpxVar, obj));
        return 2;
    }

    @Override // defpackage.hpz
    public final void b() {
    }

    @Override // defpackage.hpz
    public final void a(Object obj) {
    }
}
