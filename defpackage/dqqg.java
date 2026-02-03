package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dqqg extends fcyz implements fdat {
    int a;
    final /* synthetic */ dqqj b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dqqg(dqqj dqqjVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = dqqjVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dqqg) c((fdpm) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fdpm fdpmVar;
        dqpd dqpdVarCS;
        fcyl fcylVar = fcyl.a;
        if (this.a != 0) {
            fdpmVar = (fdpm) this.c;
            fctl.b(obj);
        } else {
            fctl.b(obj);
            fdpmVar = (fdpm) this.c;
        }
        do {
            dqqj dqqjVar = this.b;
            if (dqqjVar.getPosition() == dqqjVar.getCount() || (dqpdVarCS = dqqjVar.cS()) == null) {
                return fctx.a;
            }
            this.c = fdpmVar;
            this.a = 1;
        } while (fdpmVar.fO(dqpdVarCS, this) != fcylVar);
        return fcylVar;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        dqqg dqqgVar = new dqqg(this.b, fcxyVar);
        dqqgVar.c = obj;
        return dqqgVar;
    }
}
