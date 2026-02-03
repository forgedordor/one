package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class aisk extends fcyz implements fdat {
    int a;
    final /* synthetic */ aisn b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aisk(fcxy fcxyVar, aisn aisnVar) {
        super(2, fcxyVar);
        this.b = aisnVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((aisk) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            defn defnVarB = this.b.b.b();
            this.a = 1;
            obj = febo.a(defnVarB, this);
            if (obj == fcylVar) {
                return fcylVar;
            }
        }
        return Boolean.valueOf(((dejq) obj).b());
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        aisk aiskVar = new aisk(fcxyVar, this.b);
        aiskVar.c = obj;
        return aiskVar;
    }
}
