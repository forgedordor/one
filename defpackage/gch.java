package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class gch implements fdat {
    final /* synthetic */ long a;
    final /* synthetic */ fdat b;

    public gch(long j, fdat fdatVar) {
        this.a = j;
        this.b = fdatVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hml hmlVar = (hml) obj;
        int iIntValue = ((Number) obj2).intValue();
        int i = iIntValue & 3;
        if (hmlVar.J(i != 2, iIntValue & 1)) {
            hnj.a(gea.a.c(new ije(this.a)), this.b, hmlVar, 8);
        } else {
            hmlVar.s();
        }
        return fctx.a;
    }
}
