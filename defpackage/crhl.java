package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class crhl extends fcyz implements fdat {
    final /* synthetic */ crhm a;
    private /* synthetic */ Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public crhl(fcxy fcxyVar, crhm crhmVar) {
        super(2, fcxyVar);
        this.a = crhmVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((crhl) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        if (!((Boolean) agpz.a.e()).booleanValue()) {
            ejqq ejqqVar = ejqq.a;
            ejqqVar.getClass();
            return ejqqVar;
        }
        String[] strArr = briz.a;
        briw briwVar = new briw(briz.a);
        briwVar.A("getNormalizedFeatures");
        brim brimVar = (brim) briwVar.b().p();
        try {
            ejwl.b(brimVar.getCount() < 2, "More than one row found of Normalized Features");
            if (!brimVar.moveToFirst()) {
                brimVar.close();
                return ejqq.a;
            }
            ejqq ejqqVarC = brimVar.c();
            brimVar.close();
            return ejqqVarC;
        } catch (Throwable th) {
            try {
                brimVar.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        crhl crhlVar = new crhl(fcxyVar, this.a);
        crhlVar.b = obj;
        return crhlVar;
    }
}
