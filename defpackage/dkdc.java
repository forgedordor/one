package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dkdc implements fdat {
    final /* synthetic */ dkdh a;

    public dkdc(dkdh dkdhVar) {
        this.a = dkdhVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hml hmlVar = (hml) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hmlVar.I()) {
            hmlVar.s();
        } else {
            dkdf.c(this.a.a, hmlVar, 0);
        }
        return fctx.a;
    }
}
