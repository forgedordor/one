package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cycm extends fcyz implements fdat {
    int a;
    final /* synthetic */ cycn b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cycm(fcxy fcxyVar, cycn cycnVar) {
        super(2, fcxyVar);
        this.b = cycnVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cycm) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        try {
            if (this.a != 0) {
                fctl.b(obj);
            } else {
                fctl.b(obj);
                auso ausoVar = this.b.a;
                this.a = 1;
                obj = ausoVar.g(this);
                if (obj == fcylVar) {
                    return fcylVar;
                }
            }
            return ((ausl) obj).name();
        } catch (Exception e) {
            e.toString();
            return "Failed. ".concat(e.toString());
        }
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        cycm cycmVar = new cycm(fcxyVar, this.b);
        cycmVar.c = obj;
        return cycmVar;
    }
}
