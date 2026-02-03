package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class avaf extends fcyz implements fdat {
    int a;
    /* synthetic */ Object b;
    final /* synthetic */ fdcg c;
    final /* synthetic */ fdpm d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public avaf(fdcg fdcgVar, fdpm fdpmVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.c = fdcgVar;
        this.d = fdpmVar;
    }

    @Override // defpackage.fdat
    public final /* synthetic */ Object a(Object obj, Object obj2) {
        return ((avaf) c(new fdog(((fdog) obj).b), (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        Object obj2;
        fcyl fcylVar = fcyl.a;
        if (this.a != 0) {
            obj2 = this.b;
            fctl.b(obj);
        } else {
            fctl.b(obj);
            Object obj3 = ((fdog) this.b).b;
            this.c.a++;
            fdpm fdpmVar = this.d;
            if (!(obj3 instanceof fdof)) {
                this.b = obj3;
                this.a = 1;
                if (fdpmVar.fO(obj3, this) == fcylVar) {
                    return fcylVar;
                }
            }
            obj2 = obj3;
        }
        if (!(obj2 instanceof fdoe)) {
            return true;
        }
        fdog.b(obj2);
        return false;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        avaf avafVar = new avaf(this.c, this.d, fcxyVar);
        avafVar.b = obj;
        return avafVar;
    }
}
