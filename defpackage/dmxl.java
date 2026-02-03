package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dmxl implements fdat {
    final /* synthetic */ fdae a;

    public dmxl(fdae fdaeVar) {
        this.a = fdaeVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hml hmlVar = (hml) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hmlVar.I()) {
            hmlVar.s();
        } else {
            dmxm.c(this.a, hmlVar, 0);
        }
        return fctx.a;
    }
}
