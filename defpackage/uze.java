package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class uze implements fdat {
    final /* synthetic */ uzk a;

    public uze(uzk uzkVar) {
        this.a = uzkVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hml hmlVar = (hml) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hmlVar.I()) {
            hmlVar.s();
        } else {
            this.a.b(hmlVar, 0);
        }
        return fctx.a;
    }
}
