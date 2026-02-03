package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dorx extends fcyz implements fdat {
    int a;
    /* synthetic */ Object b;
    final /* synthetic */ dosd c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dorx(dosd dosdVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.c = dosdVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dorx) c((dosh) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        dosh doshVar;
        Object obj2 = fcyl.a;
        fdap fdapVar = null;
        if (this.a != 0) {
            doshVar = (dosh) this.b;
            fctl.b(obj);
        } else {
            fctl.b(obj);
            dosh doshVar2 = (dosh) this.b;
            dose doseVar = this.c.aj;
            if (doseVar == null) {
                fdbq.c("preferences");
                doseVar = null;
            }
            this.b = doshVar2;
            this.a = 1;
            adhb adhbVar = (adhb) doseVar;
            Object objA = fdin.a(eicg.a(adhbVar.b), new adgy(null, adhbVar), this);
            if (objA != obj2) {
                objA = fctx.a;
            }
            if (objA == obj2) {
                return obj2;
            }
            doshVar = doshVar2;
        }
        dosd dosdVar = this.c;
        fdap fdapVar2 = dosdVar.ah;
        if (fdapVar2 == null) {
            fdbq.c("onResult");
        } else {
            fdapVar = fdapVar2;
        }
        fdapVar.invoke(doshVar);
        dosdVar.hh();
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        dorx dorxVar = new dorx(this.c, fcxyVar);
        dorxVar.b = obj;
        return dorxVar;
    }
}
