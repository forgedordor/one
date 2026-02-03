package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class xoc extends fcyz implements fdau {
    int a;
    /* synthetic */ Object b;
    final /* synthetic */ xog c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xoc(fcxy fcxyVar, xog xogVar) {
        super(3, fcxyVar);
        this.c = xogVar;
    }

    @Override // defpackage.fdau
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        xoc xocVar = new xoc((fcxy) obj3, this.c);
        xocVar.d = (fdpm) obj;
        xocVar.b = obj2;
        return xocVar.b(fctx.a);
    }

    /* JADX WARN: Type inference failed for: r4v2, types: [fdpm, java.lang.Object] */
    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            ?? r4 = this.d;
            fdpl xofVar = ((Boolean) this.b).booleanValue() ? new xof(this.c.e) : new fdpu(false);
            this.a = 1;
            if (fdpy.c(r4, xofVar, this) == fcylVar) {
                return fcylVar;
            }
        }
        return fctx.a;
    }
}
