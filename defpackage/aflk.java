package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aflk extends fcyz implements fdat {
    int a;
    /* synthetic */ Object b;
    final /* synthetic */ afln c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aflk(afln aflnVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.c = aflnVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((aflk) c((ajlt) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i != 0) {
            return obj;
        }
        ajlt ajltVar = (ajlt) this.b;
        afln aflnVar = this.c;
        fcyh fcyhVarA = eicg.a(aflnVar.e);
        aflj afljVar = new aflj(null, aflnVar, ajltVar);
        this.a = 1;
        Object objA = fdin.a(fcyhVarA, afljVar, this);
        return objA == fcylVar ? fcylVar : objA;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        aflk aflkVar = new aflk(this.c, fcxyVar);
        aflkVar.b = obj;
        return aflkVar;
    }
}
