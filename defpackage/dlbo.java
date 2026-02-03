package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dlbo implements fdat {
    final /* synthetic */ dlbr a;

    public dlbo(dlbr dlbrVar) {
        this.a = dlbrVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hml hmlVar = (hml) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hmlVar.I()) {
            hmlVar.s();
        } else {
            dlbr dlbrVar = this.a;
            dlbp.d(dlbrVar.c != null, hxe.d(885371034, new dlbn(dlbrVar), hmlVar), hmlVar, 48);
        }
        return fctx.a;
    }
}
