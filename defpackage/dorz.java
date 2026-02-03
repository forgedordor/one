package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dorz extends fcyz implements fdat {
    /* synthetic */ Object a;
    final /* synthetic */ dosd b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dorz(dosd dosdVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = dosdVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dorz) c((dosh) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        dosh doshVar = (dosh) this.a;
        dosd dosdVar = this.b;
        fdap fdapVar = dosdVar.ah;
        if (fdapVar == null) {
            fdbq.c("onResult");
            fdapVar = null;
        }
        fdapVar.invoke(doshVar);
        dosdVar.hh();
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        dorz dorzVar = new dorz(this.b, fcxyVar);
        dorzVar.a = obj;
        return dorzVar;
    }
}
