package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ehpb extends fcyz implements fdat {
    int a;
    final /* synthetic */ feav b;
    final /* synthetic */ fdat c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ehpb(fcxy fcxyVar, feav feavVar, fdat fdatVar) {
        super(2, fcxyVar);
        this.b = feavVar;
        this.c = fdatVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ehpb) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        feav feavVar;
        feav feavVar2;
        Throwable th;
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        try {
            if (i == 0) {
                fctl.b(obj);
                feavVar = this.b;
                this.d = feavVar;
                this.a = 1;
                if (feavVar.b(this) != fcylVar) {
                }
                return fcylVar;
            }
            if (i != 1) {
                feavVar2 = (feav) this.d;
                try {
                    fctl.b(obj);
                    feavVar2.d();
                    return fctx.a;
                } catch (Throwable th2) {
                    th = th2;
                    feavVar2.d();
                    throw th;
                }
            }
            feav feavVar3 = (feav) this.d;
            fctl.b(obj);
            feavVar = feavVar3;
            ehoz ehozVar = new ehoz(this.c, null);
            this.d = feavVar;
            this.a = 2;
            if (fdjy.a(ehozVar, this) != fcylVar) {
                feavVar2 = feavVar;
                feavVar2.d();
                return fctx.a;
            }
            return fcylVar;
        } catch (Throwable th3) {
            feavVar2 = feavVar;
            th = th3;
            feavVar2.d();
            throw th;
        }
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        ehpb ehpbVar = new ehpb(fcxyVar, this.b, this.c);
        ehpbVar.d = obj;
        return ehpbVar;
    }
}
