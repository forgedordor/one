package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class avkh extends fcyz implements fdat {
    Object a;
    int b;
    final /* synthetic */ avki c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public avkh(avki avkiVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.c = avkiVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((avkh) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
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
                ((eksl) ((eksl) avki.b.j()).g(e)).q("Caught exception during deleted contacts sync. Marking Work Result as Retry.");
                qam qamVar = new qam();
                avki avkiVar = this.c;
                fdmk fdmkVar = fdmk.a;
                avkg avkgVar = new avkg(avkiVar, null);
                this.a = qamVar;
                this.b = 3;
                if (fdin.a(fdmkVar, avkgVar, this) != fcylVar) {
                    return qamVar;
                }
            }
        } catch (Throwable th) {
            avki avkiVar2 = this.c;
            fdmk fdmkVar2 = fdmk.a;
            avkg avkgVar2 = new avkg(avkiVar2, null);
            this.a = th;
            this.b = 4;
            if (fdin.a(fdmkVar2, avkgVar2, this) != fcylVar) {
                throw th;
            }
        }
        if (i == 0) {
            fctl.b(obj);
            avki avkiVar3 = this.c;
            if (!((avbt) avkiVar3.f.b()).a()) {
                return new qao();
            }
            boolean z = avkiVar3.c.b.get();
            ((eksl) avki.b.h()).t("Deleted contacts worker triggered (observer_triggered = %s)", Boolean.valueOf(z));
            if (!z) {
                avjo avjoVar = (avjo) avkiVar3.d.b();
                this.b = 1;
                if (avjoVar.a(3, this) == fcylVar) {
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
        avki avkiVar4 = this.c;
        fdmk fdmkVar3 = fdmk.a;
        avkg avkgVar3 = new avkg(avkiVar4, null);
        this.a = qaoVar;
        this.b = 2;
        return fdin.a(fdmkVar3, avkgVar3, this) != fcylVar ? qaoVar : fcylVar;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new avkh(this.c, fcxyVar);
    }
}
