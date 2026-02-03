package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class xwe extends fcyz implements fdau {
    int a;
    /* synthetic */ Object b;
    final /* synthetic */ zvx c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xwe(fcxy fcxyVar, zvx zvxVar) {
        super(3, fcxyVar);
        this.c = zvxVar;
    }

    @Override // defpackage.fdau
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        xwe xweVar = new xwe((fcxy) obj3, this.c);
        xweVar.d = (fdpm) obj;
        xweVar.b = obj2;
        return xweVar.b(fctx.a);
    }

    /* JADX WARN: Type inference failed for: r10v2, types: [fdpm, java.lang.Object] */
    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fdpl fdplVarB;
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            ?? r10 = this.d;
            ajlt ajltVar = (ajlt) this.b;
            if (ajltVar == null) {
                fdplVarB = new fdpu(null);
            } else {
                zvx zvxVar = this.c;
                if (zvxVar.d.a()) {
                    fdpl fdplVar = zvxVar.a;
                    fdpl fdplVarB2 = zvxVar.f.b(ajltVar);
                    zvc zvcVar = zvxVar.e;
                    fdplVarB = fdud.a(fdplVar, fdplVarB2, zvcVar.i, new zvv(zvxVar, ajltVar, null));
                } else {
                    fdpl fdplVar2 = zvxVar.a;
                    fdpl fdplVarB3 = zvxVar.f.b(ajltVar);
                    zvc zvcVar2 = zvxVar.e;
                    fdplVarB = fdud.b(fdplVar2, fdplVarB3, zvcVar2.i, zvxVar.c, new zvw(zvxVar, ajltVar, null));
                }
            }
            this.a = 1;
            if (fdpy.c(r10, fdplVarB, this) == fcylVar) {
                return fcylVar;
            }
        }
        return fctx.a;
    }
}
