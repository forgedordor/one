package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class vti extends fcyz implements fdat {
    Object a;
    int b;
    final /* synthetic */ vvs c;
    final /* synthetic */ vtm d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vti(vvs vvsVar, vtm vtmVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.c = vvsVar;
        this.d = vtmVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((vti) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        dltd dltdVar;
        vvo vvoVar;
        dltd dltdVar2;
        dltd dltdVar3;
        fcyl fcylVar = fcyl.a;
        int i = this.b;
        if (i != 0) {
            if (i == 1) {
                dltdVar3 = (dltd) this.a;
                fctl.b(obj);
                return new vtc(dltdVar3, vuo.a((cqsz) obj));
            }
            if (i == 2) {
                dltdVar2 = (dltd) this.a;
                fctl.b(obj);
                return new vtc(dltdVar2, vuo.a((cqsz) obj));
            }
            if (i != 3) {
                dltdVar = (dltd) this.a;
                fctl.b(obj);
                return new vtc(dltdVar, vuo.a((cqsz) obj));
            }
            vvoVar = (vvo) this.a;
            fctl.b(obj);
            return new vtd(vvoVar, vuo.a((cqsz) obj));
        }
        fctl.b(obj);
        vvs vvsVar = this.c;
        if (vvsVar instanceof vvn) {
            dltn dltnVar = ((vvn) vvsVar).b;
            cmfo cmfoVar = (cmfo) this.d.b.b();
            this.a = dltnVar;
            this.b = 1;
            Object objC = cmfoVar.c(this);
            if (objC != fcylVar) {
                dltdVar3 = dltnVar;
                obj = objC;
                return new vtc(dltdVar3, vuo.a((cqsz) obj));
            }
        } else if (vvsVar instanceof vvm) {
            doav doavVar = ((vvm) vvsVar).b;
            cmfo cmfoVar2 = (cmfo) this.d.b.b();
            this.a = doavVar;
            this.b = 2;
            Object objC2 = cmfoVar2.c(this);
            if (objC2 != fcylVar) {
                dltdVar2 = doavVar;
                obj = objC2;
                return new vtc(dltdVar2, vuo.a((cqsz) obj));
            }
        } else if (vvsVar instanceof vvo) {
            vvo vvoVar2 = (vvo) vvsVar;
            cmfo cmfoVar3 = (cmfo) this.d.b.b();
            this.a = vvoVar2;
            this.b = 3;
            Object objC3 = cmfoVar3.c(this);
            if (objC3 != fcylVar) {
                vvoVar = vvoVar2;
                obj = objC3;
                return new vtd(vvoVar, vuo.a((cqsz) obj));
            }
        } else {
            if (!(vvsVar instanceof vvr)) {
                throw new fctg();
            }
            dltd dltdVar4 = ((vvr) vvsVar).a;
            cmfo cmfoVar4 = (cmfo) this.d.b.b();
            this.a = dltdVar4;
            this.b = 4;
            Object objC4 = cmfoVar4.c(this);
            if (objC4 != fcylVar) {
                dltdVar = dltdVar4;
                obj = objC4;
                return new vtc(dltdVar, vuo.a((cqsz) obj));
            }
        }
        return fcylVar;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new vti(this.c, this.d, fcxyVar);
    }
}
