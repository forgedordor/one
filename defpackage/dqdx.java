package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dqdx extends fcyz implements fdau {
    int a;
    /* synthetic */ Object b;
    final /* synthetic */ dqee c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dqdx(dqee dqeeVar, fcxy fcxyVar) {
        super(3, fcxyVar);
        this.c = dqeeVar;
    }

    @Override // defpackage.fdau
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        dqdx dqdxVar = new dqdx(this.c, (fcxy) obj3);
        dqdxVar.b = (Exception) obj2;
        return dqdxVar.b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            Object obj2 = this.b;
            dqee dqeeVar = this.c;
            this.a = 1;
            if (dqeeVar.e((Exception) obj2, this) == fcylVar) {
                return fcylVar;
            }
        }
        return fctx.a;
    }
}
