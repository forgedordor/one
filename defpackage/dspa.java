package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dspa extends fcyz implements fdat {
    final /* synthetic */ dsoo a;
    final /* synthetic */ dspd b;
    final /* synthetic */ dsbi c;
    final /* synthetic */ eg d;
    final /* synthetic */ etns e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dspa(dsoo dsooVar, dspd dspdVar, dsbi dsbiVar, eg egVar, etns etnsVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.a = dsooVar;
        this.b = dspdVar;
        this.c = dsbiVar;
        this.d = egVar;
        this.e = etnsVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dspa) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        dsoo dsooVar = dsoo.SUCCESS;
        dsoo dsooVar2 = this.a;
        if (dsooVar != dsooVar2) {
            dspd dspdVar = this.b;
            dsbi dsbiVar = this.c;
            dspdVar.g.b(dsbiVar, "Error rendering promotion, result=%s.", dsooVar2);
            dspdVar.h.h(dsbiVar, dsooVar2);
            return false;
        }
        dsbd dsbdVar = new dsbd(this.d.getResources().getConfiguration().orientation, this.e);
        dsbi dsbiVar2 = this.c;
        ethk ethkVarC = dsbiVar2.c();
        etnj etnjVar = ethkVarC.f;
        if (etnjVar == null) {
            etnjVar = etnj.a;
        }
        if (etnjVar.f) {
            dspd dspdVar2 = this.b;
            dspdVar2.g.c(dsbiVar2, "NOT DISPLAYED (control group).", new Object[0]);
            dspdVar2.h.f(dsbiVar2, dsbdVar);
        } else {
            dspd dspdVar3 = this.b;
            dspdVar3.g.c(dsbiVar2, "DISPLAYED.", new Object[0]);
            dspdVar3.h.j(dsbiVar2, dsbdVar);
        }
        dspd dspdVar4 = this.b;
        dxtx dxtxVar = (dxtx) dspdVar4.e.b();
        etnj etnjVar2 = ethkVarC.f;
        if (etnjVar2 == null) {
            etnjVar2 = etnj.a;
        }
        etni etniVarB = etni.b(etnjVar2.e);
        if (etniVarB == null) {
            etniVarB = etni.UITYPE_NONE;
        }
        String str = dspdVar4.f;
        ((ecoe) dxtxVar.h.get()).a(str, etniVarB.name());
        return true;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new dspa(this.a, this.b, this.c, this.d, this.e, fcxyVar);
    }
}
