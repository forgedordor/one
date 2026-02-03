package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class zui extends fcyz implements fdat {
    int a;
    final /* synthetic */ zuj b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zui(zuj zujVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = zujVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((zui) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        feds fedsVar;
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            eiju eijuVarF = ((aurx) this.b.a.b()).f();
            this.a = 1;
            obj = fdxs.c(eijuVarF, this);
            if (obj == fcylVar) {
                return fcylVar;
            }
        }
        auml aumlVar = (auml) obj;
        aumlVar.getClass();
        switch (aumlVar) {
            case UNSPECIFIED_STATUS:
            case ENABLE_FAILED:
            case DISABLED:
            case DISABLING:
            case DISABLE_FAILED:
                fedsVar = feds.NOT_ENABLED;
                break;
            case ENABLED:
                fedsVar = feds.ENABLED;
                break;
            case ENABLING:
                fedsVar = feds.IN_INITIAL_SYNC;
                break;
            default:
                throw new fctg();
        }
        zuj zujVar = this.b;
        zujVar.c.set(fedsVar);
        feeg feegVarA = ((ajfr) zujVar.b.b()).a(fedsVar);
        feegVarA.getClass();
        zujVar.j(feegVarA);
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new zui(this.b, fcxyVar);
    }
}
