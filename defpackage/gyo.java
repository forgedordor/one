package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class gyo extends fcyz implements fdat {
    int a;
    final /* synthetic */ gyp b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gyo(gyp gypVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = gypVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((gyo) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            fdcg fdcgVar = new fdcg();
            gyp gypVar = this.b;
            fdue fdueVar = gypVar.h.a;
            gyn gynVar = new gyn(fdcgVar, gypVar);
            this.a = 1;
            if (fdum.g((fdum) fdueVar, gynVar, this) == fcylVar) {
                return fcylVar;
            }
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new gyo(this.b, fcxyVar);
    }
}
