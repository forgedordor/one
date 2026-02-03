package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class gco extends fcyz implements fdat {
    int a;
    final /* synthetic */ gcw b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gco(gcw gcwVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = gcwVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((gco) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            gcw gcwVar = this.b;
            if (gcwVar.b) {
                gcwVar.a.j(1);
            }
            fyf fyfVar = gcwVar.a;
            ddz ddzVar = gcwVar.d;
            this.a = 1;
            Object objA = fyfVar.f.a(dod.c, new fyd(fyfVar, fyfVar.a(hbk.b(fyfVar.f(), 0) ? fyfVar.c : fyfVar.d), ddzVar, null), this);
            if (objA != fcylVar) {
                objA = fctx.a;
            }
            if (objA == fcylVar) {
                return fcylVar;
            }
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new gco(this.b, fcxyVar);
    }
}
