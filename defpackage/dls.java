package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class dls extends fcyz implements fdau {
    int a;
    /* synthetic */ long b;
    final /* synthetic */ dlu c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dls(dlu dluVar, fcxy fcxyVar) {
        super(3, fcxyVar);
        this.c = dluVar;
    }

    @Override // defpackage.fdau
    public final /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        long j = ((ihs) obj2).a;
        dls dlsVar = new dls(this.c, (fcxy) obj3);
        dlsVar.d = (dwn) obj;
        dlsVar.b = j;
        return dlsVar.b(fctx.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v2, types: [dwn, java.lang.Object] */
    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            ?? r6 = this.d;
            long j = this.b;
            dlu dluVar = this.c;
            if (((dkd) dluVar).b) {
                this.a = 1;
                if (dluVar.f(r6, j, this) == fcylVar) {
                    return fcylVar;
                }
            }
        }
        return fctx.a;
    }
}
