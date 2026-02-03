package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dosb extends fcyz implements fdat {
    int a;
    /* synthetic */ Object b;
    final /* synthetic */ dosd c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dosb(dosd dosdVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.c = dosdVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dosb) c((dosh) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        adik adikVar;
        dosh doshVar;
        fcyl fcylVar = fcyl.a;
        fdap fdapVar = null;
        if (this.a != 0) {
            doshVar = (dosh) this.b;
            fctl.b(obj);
        } else {
            fctl.b(obj);
            dosh doshVar2 = (dosh) this.b;
            dosd dosdVar = this.c;
            dose doseVar = dosdVar.aj;
            if (doseVar == null) {
                fdbq.c("preferences");
                doseVar = null;
            }
            dorb dorbVar = dosdVar.an;
            this.b = doshVar2;
            this.a = 1;
            int iOrdinal = doshVar2.ordinal();
            if (iOrdinal == 0) {
                adikVar = adik.PHOTOS_LINK;
            } else {
                if (iOrdinal != 1) {
                    throw new fctg();
                }
                adikVar = adik.STANDARD;
            }
            Object objA = ((adhb) doseVar).a(dorbVar, adikVar, this);
            if (objA != fcylVar) {
                objA = fctx.a;
            }
            if (objA == fcylVar) {
                return fcylVar;
            }
            doshVar = doshVar2;
        }
        dosd dosdVar2 = this.c;
        fdap fdapVar2 = dosdVar2.ah;
        if (fdapVar2 == null) {
            fdbq.c("onResult");
        } else {
            fdapVar = fdapVar2;
        }
        fdapVar.invoke(doshVar);
        dosdVar2.hh();
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        dosb dosbVar = new dosb(this.c, fcxyVar);
        dosbVar.b = obj;
        return dosbVar;
    }
}
