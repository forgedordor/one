package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fdwc extends fcyz implements fdat {
    int a;
    final /* synthetic */ fdwg b;
    final /* synthetic */ fdpm c;
    final /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fdwc(fdwg fdwgVar, fdpm fdpmVar, Object obj, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = fdwgVar;
        this.c = fdpmVar;
        this.d = obj;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((fdwc) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            fdwg fdwgVar = this.b;
            fdpm fdpmVar = this.c;
            Object obj2 = this.d;
            this.a = 1;
            if (fdwgVar.e.a(fdpmVar, obj2, this) == fcylVar) {
                return fcylVar;
            }
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new fdwc(this.b, this.c, this.d, fcxyVar);
    }
}
