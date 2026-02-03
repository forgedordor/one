package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ctkq extends fcyz implements fdau {
    int a;
    /* synthetic */ Object b;
    final /* synthetic */ ctku c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ctkq(fcxy fcxyVar, ctku ctkuVar) {
        super(3, fcxyVar);
        this.c = ctkuVar;
    }

    @Override // defpackage.fdau
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        ctkq ctkqVar = new ctkq((fcxy) obj3, this.c);
        ctkqVar.d = (fdpm) obj;
        ctkqVar.b = obj2;
        return ctkqVar.b(fctx.a);
    }

    /* JADX WARN: Type inference failed for: r1v5, types: [ctnw, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v2, types: [fdpm, java.lang.Object] */
    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            ?? r4 = this.d;
            fdpl fdplVarA = ((ctqg) this.b) != null ? fdvf.a(null) : this.c.b.get().a();
            this.a = 1;
            if (fdpy.c(r4, fdplVarA, this) == fcylVar) {
                return fcylVar;
            }
        }
        return fctx.a;
    }
}
