package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class avaj extends fcyz implements fdat {
    int a;
    /* synthetic */ Object b;
    final /* synthetic */ fdcg c;
    final /* synthetic */ fdpm d;
    final /* synthetic */ fdau e;
    final /* synthetic */ fdce f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public avaj(fdcg fdcgVar, fdpm fdpmVar, fdau fdauVar, fdce fdceVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.c = fdcgVar;
        this.d = fdpmVar;
        this.e = fdauVar;
        this.f = fdceVar;
    }

    @Override // defpackage.fdat
    public final /* synthetic */ Object a(Object obj, Object obj2) {
        return ((avaj) c(new fdog(((fdog) obj).b), (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        Object obj2;
        fdce fdceVar;
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        if (i == 0) {
            fctl.b(obj);
            obj2 = ((fdog) this.b).b;
            this.c.a++;
            fdpm fdpmVar = this.d;
            if (!(obj2 instanceof fdof)) {
                this.b = obj2;
                this.a = 1;
                if (fdpmVar.fO(obj2, this) != fcylVar) {
                }
                return fcylVar;
            }
            return false;
        }
        if (i != 1) {
            fdceVar = (fdce) this.b;
            fctl.b(obj);
            fdceVar.a = true;
            return false;
        }
        obj2 = this.b;
        fctl.b(obj);
        fdau fdauVar = this.e;
        fdpm fdpmVar2 = this.d;
        fdce fdceVar2 = this.f;
        if (!(obj2 instanceof fdoe)) {
            return true;
        }
        Throwable thB = fdog.b(obj2);
        if (thB != null) {
            this.b = fdceVar2;
            this.a = 2;
            if (fdauVar.a(fdpmVar2, thB, this) != fcylVar) {
                fdceVar = fdceVar2;
                fdceVar.a = true;
            }
            return fcylVar;
        }
        return false;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        avaj avajVar = new avaj(this.c, this.d, this.e, this.f, fcxyVar);
        avajVar.b = obj;
        return avajVar;
    }
}
