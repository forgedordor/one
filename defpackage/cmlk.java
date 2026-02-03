package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class cmlk extends fcyz implements fdat {
    int a;
    final /* synthetic */ cmll b;
    final /* synthetic */ ensj c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cmlk(cmll cmllVar, ensj ensjVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = cmllVar;
        this.c = ensjVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cmlk) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            cmls cmlsVar = (cmls) this.b.a.b();
            ensj ensjVar = this.c;
            this.a = 1;
            if (cmlsVar.b(ensjVar, this) == fcylVar) {
                return fcylVar;
            }
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new cmlk(this.b, this.c, fcxyVar);
    }
}
