package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class aojh extends fcyz implements fdat {
    int a;
    final /* synthetic */ aojk b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aojh(aojk aojkVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = aojkVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((aojh) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        boolean z = true;
        fctl.b(obj);
        if (i == 0) {
            clox cloxVar = (clox) this.b.a.b();
            this.a = 1;
            obj = cloxVar.c(this);
            if (obj == fcylVar) {
                return fcylVar;
            }
        }
        cloc clocVarB = cloc.b(((clod) obj).c);
        if (clocVarB == null) {
            clocVarB = cloc.UNRECOGNIZED;
        }
        clocVarB.getClass();
        if (clocVarB != cloc.SESSION_STATUS_EMERGENCY && clocVarB != cloc.SESSION_STATUS_DEMO) {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new aojh(this.b, fcxyVar);
    }
}
