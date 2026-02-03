package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class doj extends fcyz implements fdat {
    Object a;
    Object b;
    Object c;
    Object d;
    int e;
    final /* synthetic */ dod f;
    final /* synthetic */ dok g;
    final /* synthetic */ fdat h;
    final /* synthetic */ Object i;
    private /* synthetic */ Object j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public doj(dod dodVar, dok dokVar, fdat fdatVar, Object obj, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.f = dodVar;
        this.g = dokVar;
        this.h = fdatVar;
        this.i = obj;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((doj) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [feav, int] */
    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        dok dokVar;
        Object obj2;
        dof dofVar;
        fdat fdatVar;
        feav feavVar;
        dok dokVar2;
        Throwable th;
        feav feavVar2;
        fcyl fcylVar = fcyl.a;
        ?? r1 = this.e;
        try {
            try {
                if (r1 == 0) {
                    fctl.b(obj);
                    fdjx fdjxVar = (fdjx) this.j;
                    dod dodVar = this.f;
                    fcyf fcyfVar = fdjxVar.hE().get(fdlr.c);
                    fcyfVar.getClass();
                    dof dofVar2 = new dof(dodVar, (fdlr) fcyfVar);
                    dokVar = this.g;
                    dokVar.c(dofVar2);
                    fdat fdatVar2 = this.h;
                    obj2 = this.i;
                    this.j = dofVar2;
                    feav feavVar3 = dokVar.b;
                    this.a = feavVar3;
                    this.b = fdatVar2;
                    this.c = obj2;
                    this.d = dokVar;
                    this.e = 1;
                    if (feavVar3.b(this) != fcylVar) {
                        dofVar = dofVar2;
                        fdatVar = fdatVar2;
                        feavVar = feavVar3;
                    }
                    return fcylVar;
                }
                if (r1 != 1) {
                    dokVar2 = (dok) this.b;
                    Object obj3 = this.a;
                    dofVar = (dof) this.j;
                    try {
                        fctl.b(obj);
                        feavVar2 = obj3;
                        doi.a(dokVar2.a, dofVar);
                        feavVar2.d();
                        return obj;
                    } catch (Throwable th2) {
                        th = th2;
                        doi.a(dokVar2.a, dofVar);
                        throw th;
                    }
                }
                Object obj4 = this.d;
                Object obj5 = this.c;
                fdatVar = (fdat) this.b;
                Object obj6 = this.a;
                dof dofVar3 = (dof) this.j;
                fctl.b(obj);
                dokVar = obj4;
                feavVar = obj6;
                obj2 = obj5;
                dofVar = dofVar3;
                this.j = dofVar;
                this.a = feavVar;
                this.b = dokVar;
                this.c = null;
                this.d = null;
                this.e = 2;
                Object objA = fdatVar.a(obj2, this);
                if (objA != fcylVar) {
                    dokVar2 = dokVar;
                    obj = objA;
                    feavVar2 = feavVar;
                    doi.a(dokVar2.a, dofVar);
                    feavVar2.d();
                    return obj;
                }
                return fcylVar;
            } catch (Throwable th3) {
                dokVar2 = dokVar;
                th = th3;
                doi.a(dokVar2.a, dofVar);
                throw th;
            }
        } catch (Throwable th4) {
            r1.d();
            throw th4;
        }
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        doj dojVar = new doj(this.f, this.g, this.h, this.i, fcxyVar);
        dojVar.j = obj;
        return dojVar;
    }
}
