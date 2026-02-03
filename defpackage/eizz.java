package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class eizz extends fcyz implements fdat {
    Object a;
    int b;
    final /* synthetic */ eizx c;
    final /* synthetic */ fdat d;
    private /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eizz(eizx eizxVar, fdat fdatVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.c = eizxVar;
        this.d = fdatVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((eizz) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Type inference failed for: r1v4, types: [fdat, java.lang.Object] */
    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        feav feavVar;
        fcyl fcylVar = fcyl.a;
        int i = this.b;
        if (i == 0) {
            fctl.b(obj);
            fdjy.f((fdjx) this.e);
            eizx eizxVar = this.c;
            fdat fdatVar = this.d;
            feav feavVar2 = eizxVar.a;
            this.e = feavVar2;
            this.a = fdatVar;
            this.b = 1;
            if (fcym.a(eizy.a, feavVar2, this) != fcylVar) {
                fcym.c(this).w(fctx.a);
            }
        } else {
            if (i != 1) {
                feavVar = (feav) this.e;
                try {
                    fctl.b(obj);
                    feavVar.d();
                    return obj;
                } catch (Throwable th) {
                    th = th;
                    feavVar.d();
                    throw th;
                }
            }
            ?? r1 = this.a;
            feav feavVar3 = (feav) this.e;
            fctl.b(obj);
            try {
                this.e = feavVar3;
                this.a = null;
                this.b = 2;
                obj = fdjy.a(r1, this);
                if (obj != fcylVar) {
                    feavVar = feavVar3;
                    feavVar.d();
                    return obj;
                }
            } catch (Throwable th2) {
                th = th2;
                feavVar = feavVar3;
                feavVar.d();
                throw th;
            }
        }
        return fcylVar;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        eizz eizzVar = new eizz(this.c, this.d, fcxyVar);
        eizzVar.e = obj;
        return eizzVar;
    }
}
