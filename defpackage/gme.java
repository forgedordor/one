package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class gme implements fdat {
    final /* synthetic */ gda a;
    final /* synthetic */ gpe b;
    final /* synthetic */ gsa c;
    final /* synthetic */ hcr d;
    final /* synthetic */ fdat e;

    public gme(gda gdaVar, gpe gpeVar, gsa gsaVar, hcr hcrVar, fdat fdatVar) {
        this.a = gdaVar;
        this.b = gpeVar;
        this.c = gsaVar;
        this.d = hcrVar;
        this.e = fdatVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hml hmlVar = (hml) obj;
        int iIntValue = ((Number) obj2).intValue();
        int i = iIntValue & 3;
        if (hmlVar.J(i != 2, iIntValue & 1)) {
            gda gdaVar = this.a;
            gpe gpcVar = this.b;
            if (gpcVar == null) {
                gpcVar = new gpc();
            }
            gmg.b(gdaVar, gpcVar, this.c, this.d, this.e, hmlVar, 0);
        } else {
            hmlVar.s();
        }
        return fctx.a;
    }
}
