package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class giq extends fcyz implements fdau {
    int a;
    /* synthetic */ float b;
    final /* synthetic */ gss c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public giq(gss gssVar, fcxy fcxyVar) {
        super(3, fcxyVar);
        this.c = gssVar;
    }

    @Override // defpackage.fdau
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        float fFloatValue = ((Number) obj2).floatValue();
        giq giqVar = new giq(this.c, (fcxy) obj3);
        giqVar.b = fFloatValue;
        return giqVar.b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            float f = this.b;
            hcn hcnVar = this.c.k;
            hcq hcqVarB = hcnVar.b();
            dep depVarD = hcnVar.d();
            ddz ddzVarA = hcnVar.a();
            this.a = 1;
            if (fyx.a(hcqVarB, f, depVarD, ddzVarA, this) == fcylVar) {
                return fcylVar;
            }
        }
        return fctx.a;
    }
}
