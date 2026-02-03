package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class avjb extends fcyz implements fdat {
    Object a;
    int b;
    final /* synthetic */ avjc c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public avjb(avjc avjcVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.c = avjcVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((avjb) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.b;
        try {
            try {
            } catch (Exception e) {
                cczi ccziVar = avbs.j;
                if (((Boolean) ccziVar.e()).booleanValue() && (!((Boolean) ccziVar.e()).booleanValue() || !avcb.a(e))) {
                    throw e;
                }
                ((eksl) ((eksl) avjc.b.j()).g(e)).q("Caught exception during contacts change sync. Marking Work Result as Retry.");
                qam qamVar = new qam();
                avjc avjcVar = this.c;
                fdmk fdmkVar = fdmk.a;
                avja avjaVar = new avja(avjcVar, null);
                this.a = qamVar;
                this.b = 3;
                if (fdin.a(fdmkVar, avjaVar, this) != fcylVar) {
                    return qamVar;
                }
            }
        } catch (Throwable th) {
            avjc avjcVar2 = this.c;
            fdmk fdmkVar2 = fdmk.a;
            avja avjaVar2 = new avja(avjcVar2, null);
            this.a = th;
            this.b = 4;
            if (fdin.a(fdmkVar2, avjaVar2, this) != fcylVar) {
                throw th;
            }
        }
        if (i == 0) {
            fctl.b(obj);
            avjc avjcVar3 = this.c;
            if (!((avbt) avjcVar3.f.b()).a()) {
                return new qao();
            }
            boolean z = avjcVar3.c.a.get();
            ((eksl) avjc.b.h()).t("Contacts change worker triggered (observer_triggered = %s)", Boolean.valueOf(z));
            if (!z) {
                avii aviiVar = (avii) avjcVar3.d.b();
                this.b = 1;
                if (aviiVar.a(3, this) == fcylVar) {
                }
            }
        }
        if (i != 1) {
            if (i != 2 && i != 3) {
                Throwable th2 = (Throwable) this.a;
                fctl.b(obj);
                throw th2;
            }
            Object obj2 = this.a;
            qap qapVar = (qap) obj2;
            fctl.b(obj);
            return qapVar;
        }
        fctl.b(obj);
        qao qaoVar = new qao();
        avjc avjcVar4 = this.c;
        fdmk fdmkVar3 = fdmk.a;
        avja avjaVar3 = new avja(avjcVar4, null);
        this.a = qaoVar;
        this.b = 2;
        return fdin.a(fdmkVar3, avjaVar3, this) == fcylVar ? fcylVar : qaoVar;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new avjb(this.c, fcxyVar);
    }
}
