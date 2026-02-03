package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class hbc implements fdau {
    final /* synthetic */ kew a;
    final /* synthetic */ gxi b;
    final /* synthetic */ ebk c;

    public hbc(kew kewVar, ebk ebkVar, gxi gxiVar) {
        this.a = kewVar;
        this.c = ebkVar;
        this.b = gxiVar;
    }

    @Override // defpackage.fdau
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        fdat fdatVar = (fdat) obj;
        hml hmlVar = (hml) obj2;
        int iIntValue = ((Number) obj3).intValue();
        if ((iIntValue & 6) == 0) {
            iIntValue |= true != hmlVar.F(fdatVar) ? 2 : 4;
        }
        if (hmlVar.J((iIntValue & 19) != 18, iIntValue & 1)) {
            kew kewVar = this.a;
            gpl gplVar = gpl.a;
            String strA = kewVar.a();
            kfp kfpVar = kfo.a;
            egd egdVar = new egd(0.0f, 0.0f, 0.0f, 0.0f);
            ebk ebkVar = this.c;
            gxi gxiVar = this.b;
            gplVar.a(strA, fdatVar, true, true, kfpVar, ebkVar, false, null, null, null, null, gxiVar, egdVar, hxe.d(769667466, new hbb(ebkVar, gxiVar), hmlVar), hmlVar, ((iIntValue << 3) & 112) | 224640, 14352384, 16320);
        } else {
            hmlVar.s();
        }
        return fctx.a;
    }
}
