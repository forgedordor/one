package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dorw extends fcyz implements fdat {
    Object a;
    Object b;
    int c;
    final /* synthetic */ dosd d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dorw(dosd dosdVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.d = dosdVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dorw) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        Object objBk;
        Object obj2;
        fcyl fcylVar = fcyl.a;
        String str = null;
        if (this.c != 0) {
            obj2 = this.b;
            objBk = this.a;
            fctl.b(obj);
        } else {
            fctl.b(obj);
            dosd dosdVar = this.d;
            objBk = dosdVar.bk();
            doqf doqfVar = new doqf(dosdVar.bj());
            addy addyVar = dosdVar.ao;
            if (addyVar == null) {
                fdbq.c("accountSignIn");
                addyVar = null;
            }
            this.a = objBk;
            this.b = doqfVar;
            this.c = 1;
            obj = addyVar.a(this);
            if (obj == fcylVar) {
                return fcylVar;
            }
            obj2 = doqfVar;
        }
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        dosd dosdVar2 = this.d;
        String str2 = dosdVar2.al;
        if (str2 == null) {
            fdbq.c("mimeType");
        } else {
            str = str2;
        }
        ((adgp) objBk).b((doqh) obj2, zBooleanValue, str);
        dosdVar2.ai.invoke();
        dosdVar2.hh();
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new dorw(this.d, fcxyVar);
    }
}
