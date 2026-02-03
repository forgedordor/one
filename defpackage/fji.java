package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class fji implements fdat {
    final /* synthetic */ flw a;
    final /* synthetic */ fdat b;
    final /* synthetic */ flg c;

    public fji(flw flwVar, fdat fdatVar, flg flgVar) {
        this.a = flwVar;
        this.b = fdatVar;
        this.c = flgVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hml hmlVar = (hml) obj;
        int iIntValue = ((Number) obj2).intValue();
        int i = iIntValue & 3;
        if (hmlVar.J(i != 2, iIntValue & 1)) {
            hnj.a(fly.a.c(this.a), hxe.d(610483127, new fjh(this.b, this.c), hmlVar), hmlVar, 56);
        } else {
            hmlVar.s();
        }
        return fctx.a;
    }
}
