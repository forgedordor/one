package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class akes extends fcyz implements fdat {
    int a;
    final /* synthetic */ akex b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public akes(akex akexVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = akexVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((akes) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            fdkf fdkfVarC = fdil.c((fdjx) this.c, null, new aker(this.b, null), 3);
            this.a = 1;
            obj = fdkfVarC.c(this);
            if (obj == fcylVar) {
                return fcylVar;
            }
        }
        obj.getClass();
        return new akdx((ajts) obj);
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        akes akesVar = new akes(this.b, fcxyVar);
        akesVar.c = obj;
        return akesVar;
    }
}
