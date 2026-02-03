package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dmpr extends fcyz implements fdat {
    int a;
    final /* synthetic */ dmpw b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dmpr(dmpw dmpwVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = dmpwVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dmpr) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            dmpw dmpwVar = this.b;
            doig doigVarA = dogh.a(dmpw.a);
            this.a = 1;
            ujc ujcVar = (ujc) dmpwVar.d.b;
            obj = fdin.a(eicg.a(ujcVar.a), new ujb(null, doigVarA, ujcVar.b), this);
            if (obj == fcylVar) {
                return fcylVar;
            }
        }
        if (obj != null) {
            return obj;
        }
        throw new IllegalArgumentException("Error getting output URI for image capture.");
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new dmpr(this.b, fcxyVar);
    }
}
