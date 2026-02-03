package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ybu implements fdat {
    final /* synthetic */ fdat a;

    public ybu(fdat fdatVar) {
        this.a = fdatVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hml hmlVar = (hml) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hmlVar.I()) {
            hmlVar.s();
        } else {
            this.a.a(hmlVar, 0);
        }
        return fctx.a;
    }
}
