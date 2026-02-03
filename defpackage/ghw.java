package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ghw implements fdpm {
    final /* synthetic */ ejy a;
    final /* synthetic */ fdap b;
    final /* synthetic */ hhr c;
    final /* synthetic */ fddq d;

    public ghw(ejy ejyVar, fdap fdapVar, hhr hhrVar, fddq fddqVar) {
        this.a = ejyVar;
        this.b = fdapVar;
        this.c = hhrVar;
        this.d = fddqVar;
    }

    @Override // defpackage.fdpm
    public final /* bridge */ /* synthetic */ Object fO(Object obj, fcxy fcxyVar) {
        ((Number) obj).intValue();
        ejy ejyVar = this.a;
        int iB = ejyVar.b() / 12;
        int iB2 = ejyVar.b() % 12;
        this.b.invoke(new Long(this.c.g(this.d.a + iB, iB2 + 1).e));
        return fctx.a;
    }
}
