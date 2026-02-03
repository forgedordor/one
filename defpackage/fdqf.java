package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fdqf extends fcyz implements fdat {
    Object a;
    int b;
    /* synthetic */ Object c;
    final /* synthetic */ fdci d;
    final /* synthetic */ fdpm e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fdqf(fdci fdciVar, fdpm fdpmVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.d = fdciVar;
        this.e = fdpmVar;
    }

    @Override // defpackage.fdat
    public final /* synthetic */ Object a(Object obj, Object obj2) {
        return ((fdqf) c(new fdog(((fdog) obj).b), (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        Object obj2;
        fcyl fcylVar = fcyl.a;
        if (this.b == 0) {
            fctl.b(obj);
            Object obj3 = ((fdog) this.c).b;
            fdci fdciVar = this.d;
            boolean z = obj3 instanceof fdof;
            if (!z) {
                fdciVar.a = obj3;
            }
            fdpm fdpmVar = this.e;
            if (z) {
                Throwable thB = fdog.b(obj3);
                if (thB != null) {
                    throw thB;
                }
                Object obj4 = fdciVar.a;
                if (obj4 != null) {
                    if (obj4 == fdwz.a) {
                        obj4 = null;
                    }
                    this.c = obj3;
                    this.a = fdciVar;
                    this.b = 1;
                    if (fdpmVar.fO(obj4, this) == fcylVar) {
                        return fcylVar;
                    }
                }
                obj2 = fdciVar;
            }
            return fctx.a;
        }
        obj2 = this.a;
        fctl.b(obj);
        ((fdci) obj2).a = fdwz.c;
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        fdqf fdqfVar = new fdqf(this.d, this.e, fcxyVar);
        fdqfVar.c = obj;
        return fdqfVar;
    }
}
