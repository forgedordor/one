package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class zxy implements fdat {
    final /* synthetic */ zxa a;

    public zxy(zxa zxaVar) {
        this.a = zxaVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hml hmlVar = (hml) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hmlVar.I()) {
            hmlVar.s();
        } else {
            zya.c(this.a, hmlVar, 0);
        }
        return fctx.a;
    }
}
