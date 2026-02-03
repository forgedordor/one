package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class crgp extends fcyz implements fdap {
    int a;
    final /* synthetic */ crgq b;
    final /* synthetic */ fcsu c;
    final /* synthetic */ eosc d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public crgp(crgq crgqVar, fcsu fcsuVar, eosc eoscVar, fcxy fcxyVar) {
        super(1, fcxyVar);
        this.b = crgqVar;
        this.c = fcsuVar;
        this.d = eoscVar;
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            crgq crgqVar = this.b;
            fcsu fcsuVar = this.c;
            eosc eoscVar = this.d;
            fcyh fcyhVarA = eicg.a(crgqVar.a);
            crgo crgoVar = new crgo(null, fcsuVar, eoscVar);
            this.a = 1;
            obj = fdin.a(fcyhVarA, crgoVar, this);
            if (obj == fcylVar) {
                return fcylVar;
            }
        }
        ejlu ejluVar = (ejlu) obj;
        this.b.b = ejluVar;
        return ejluVar;
    }

    @Override // defpackage.fdap
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return new crgp(this.b, this.c, this.d, (fcxy) obj).b(fctx.a);
    }
}
