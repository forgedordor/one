package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fdqe extends fcyz implements fdap {
    int a;
    final /* synthetic */ fdpm b;
    final /* synthetic */ fdci c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fdqe(fdpm fdpmVar, fdci fdciVar, fcxy fcxyVar) {
        super(1, fcxyVar);
        this.b = fdpmVar;
        this.c = fdciVar;
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            fdpm fdpmVar = this.b;
            fdci fdciVar = this.c;
            fdzi fdziVar = fdwz.a;
            Object obj2 = fdciVar.a;
            if (obj2 == fdziVar) {
                obj2 = null;
            }
            this.a = 1;
            if (fdpmVar.fO(obj2, this) == fcylVar) {
                return fcylVar;
            }
        }
        this.c.a = null;
        return fctx.a;
    }

    @Override // defpackage.fdap
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return new fdqe(this.b, this.c, (fcxy) obj).b(fctx.a);
    }
}
