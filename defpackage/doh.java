package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class doh extends fcyz implements fdat {
    Object a;
    Object b;
    Object c;
    int d;
    final /* synthetic */ dod e;
    final /* synthetic */ dok f;
    final /* synthetic */ fdap g;
    private /* synthetic */ Object h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public doh(dod dodVar, dok dokVar, fdap fdapVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.e = dodVar;
        this.f = dokVar;
        this.g = fdapVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((doh) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [feav, int] */
    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        dok dokVar;
        dof dofVar;
        fdap fdapVar;
        feav feavVar;
        dok dokVar2;
        Throwable th;
        feav feavVar2;
        fcyl fcylVar = fcyl.a;
        ?? r1 = this.d;
        try {
            try {
                if (r1 == 0) {
                    fctl.b(obj);
                    fdjx fdjxVar = (fdjx) this.h;
                    dod dodVar = this.e;
                    fcyf fcyfVar = fdjxVar.hE().get(fdlr.c);
                    fcyfVar.getClass();
                    dof dofVar2 = new dof(dodVar, (fdlr) fcyfVar);
                    dokVar = this.f;
                    dokVar.c(dofVar2);
                    fdap fdapVar2 = this.g;
                    this.h = dofVar2;
                    feav feavVar3 = dokVar.b;
                    this.a = feavVar3;
                    this.b = fdapVar2;
                    this.c = dokVar;
                    this.d = 1;
                    if (feavVar3.b(this) != fcylVar) {
                        dofVar = dofVar2;
                        fdapVar = fdapVar2;
                        feavVar = feavVar3;
                    }
                    return fcylVar;
                }
                if (r1 != 1) {
                    dokVar2 = (dok) this.b;
                    Object obj2 = this.a;
                    dofVar = (dof) this.h;
                    try {
                        fctl.b(obj);
                        feavVar2 = obj2;
                        dog.a(dokVar2.a, dofVar);
                        feavVar2.d();
                        return obj;
                    } catch (Throwable th2) {
                        th = th2;
                        dog.a(dokVar2.a, dofVar);
                        throw th;
                    }
                }
                Object obj3 = this.c;
                fdap fdapVar3 = (fdap) this.b;
                Object obj4 = this.a;
                dof dofVar3 = (dof) this.h;
                fctl.b(obj);
                dokVar = obj3;
                feavVar = obj4;
                fdapVar = fdapVar3;
                dofVar = dofVar3;
                this.h = dofVar;
                this.a = feavVar;
                this.b = dokVar;
                this.c = null;
                this.d = 2;
                Object objInvoke = fdapVar.invoke(this);
                if (objInvoke != fcylVar) {
                    dokVar2 = dokVar;
                    obj = objInvoke;
                    feavVar2 = feavVar;
                    dog.a(dokVar2.a, dofVar);
                    feavVar2.d();
                    return obj;
                }
                return fcylVar;
            } catch (Throwable th3) {
                dokVar2 = dokVar;
                th = th3;
                dog.a(dokVar2.a, dofVar);
                throw th;
            }
        } catch (Throwable th4) {
            r1.d();
            throw th4;
        }
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        doh dohVar = new doh(this.e, this.f, this.g, fcxyVar);
        dohVar.h = obj;
        return dohVar;
    }
}
