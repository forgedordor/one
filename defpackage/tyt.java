package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class tyt extends fcyz implements fdat {
    Object a;
    int b;
    final /* synthetic */ eqmo c;
    final /* synthetic */ tyu d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tyt(eqmo eqmoVar, tyu tyuVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.c = eqmoVar;
        this.d = tyuVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((tyt) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        Object obj2;
        fcyl fcylVar = fcyl.a;
        int i = this.b;
        try {
        } catch (cpyy e) {
            ((eksl) tyu.a.h()).q("Resetting Folsom keys and disabling CMS.");
            auso ausoVar = (auso) this.d.c.b();
            this.a = e;
            this.b = 2;
            if (ausoVar.f(this) != fcylVar) {
                obj2 = e;
            }
        }
        if (i == 0) {
            fctl.b(obj);
            if (cpyl.a()) {
                eksp ekspVar = tyu.a;
                ((eksl) ekspVar.h()).q("BoxResetEvent received.");
                eqmo eqmoVar = this.c;
                eqjo eqjoVar = eqmoVar.b == 15 ? (eqjo) eqmoVar.c : eqjo.a;
                eqjoVar.getClass();
                int i2 = eqjoVar.b;
                eqjn eqjnVarB = eqjn.b(i2);
                if (eqjnVarB == null) {
                    eqjnVarB = eqjn.UNRECOGNIZED;
                }
                if (eqjnVarB != eqjn.RESET_ALL_RESOURCES) {
                    eksl ekslVar = (eksl) ekspVar.h();
                    eqjn eqjnVarB2 = eqjn.b(i2);
                    if (eqjnVarB2 == null) {
                        eqjnVarB2 = eqjn.UNRECOGNIZED;
                    }
                    ekslVar.t("BoxResetEvent is of type %s, will not opt the user out", eqjnVarB2);
                    return null;
                }
                tzc tzcVar = (tzc) this.d.b.b();
                this.b = 1;
                obj = tzcVar.a(this);
                if (obj == fcylVar) {
                    return fcylVar;
                }
            }
            return null;
        }
        if (i != 1) {
            obj2 = this.a;
            fctl.b(obj);
            throw ((Throwable) obj2);
        }
        fctl.b(obj);
        return null;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new tyt(this.c, this.d, fcxyVar);
    }
}
