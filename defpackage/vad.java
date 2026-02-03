package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class vad extends fcyz implements fdat {
    Object a;
    int b;
    final /* synthetic */ vae c;
    final /* synthetic */ fdap d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vad(vae vaeVar, fdap fdapVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.c = vaeVar;
        this.d = fdapVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((vad) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        aill aillVar;
        fcyl fcylVar = fcyl.a;
        if (this.b != 0) {
            Object obj2 = this.a;
            fctl.b(obj);
            aillVar = obj2;
        } else {
            fctl.b(obj);
            aill aillVar2 = (aill) this.c.a.b();
            fdap fdapVar = this.d;
            this.a = aillVar2;
            this.b = 1;
            Object objInvoke = fdapVar.invoke(this);
            if (objInvoke == fcylVar) {
                return fcylVar;
            }
            aillVar = aillVar2;
            obj = objInvoke;
        }
        aillVar.o((ellg) obj);
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new vad(this.c, this.d, fcxyVar);
    }
}
