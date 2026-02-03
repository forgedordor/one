package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class yaz extends fcyz implements fdau {
    int a;
    /* synthetic */ Object b;
    private /* synthetic */ Object c;

    public yaz(fcxy fcxyVar) {
        super(3, fcxyVar);
    }

    @Override // defpackage.fdau
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        yaz yazVar = new yaz((fcxy) obj3);
        yazVar.c = (fdpm) obj;
        yazVar.b = (Object[]) obj2;
        return yazVar.b(fctx.a);
    }

    /* JADX WARN: Type inference failed for: r4v2, types: [fdpm, java.lang.Object] */
    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            ?? r4 = this.c;
            ekgb ekgbVarA = ekfv.a(fcur.K((xza[]) this.b));
            this.a = 1;
            if (r4.fO(ekgbVarA, this) == fcylVar) {
                return fcylVar;
            }
        }
        return fctx.a;
    }
}
