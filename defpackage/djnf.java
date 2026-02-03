package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class djnf implements fdat {
    final /* synthetic */ djmp a;

    public djnf(djmp djmpVar) {
        this.a = djmpVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hml hmlVar = (hml) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hmlVar.I()) {
            hmlVar.s();
        } else {
            djmp djmpVar = this.a;
            dtdi.e(djmpVar.e.c, null, false, null, null, null, hxe.d(1485320244, new djne(djmpVar), hmlVar), hmlVar, 805306368, 510);
        }
        return fctx.a;
    }
}
