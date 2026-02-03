package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class fux implements fdat {
    final /* synthetic */ long a;
    final /* synthetic */ fdat b;

    public fux(long j, fdat fdatVar) {
        this.a = j;
        this.b = fdatVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hml hmlVar = (hml) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hmlVar.I()) {
            hmlVar.s();
        } else {
            long j = this.a;
            hnj.a(C0001for.a.c(new ije(j)), hxe.d(-1624601445, new fuw(this.b, j), hmlVar), hmlVar, 56);
        }
        return fctx.a;
    }
}
