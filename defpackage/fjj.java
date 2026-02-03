package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class fjj implements fdat {
    final /* synthetic */ flg a;
    final /* synthetic */ flw b;
    final /* synthetic */ fdat c;

    public fjj(flg flgVar, flw flwVar, fdat fdatVar) {
        this.a = flgVar;
        this.b = flwVar;
        this.c = fdatVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hml hmlVar = (hml) obj;
        int iIntValue = ((Number) obj2).intValue();
        int i = iIntValue & 3;
        if (hmlVar.J(i != 2, iIntValue & 1)) {
            flg flgVar = this.a;
            exx.b(flgVar, hxe.d(-284825865, new fji(this.b, this.c, flgVar), hmlVar), hmlVar, 48);
        } else {
            hmlVar.s();
        }
        return fctx.a;
    }
}
