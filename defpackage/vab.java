package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class vab extends fcyz implements fdat {
    Object a;
    int b;
    final /* synthetic */ ensy c;
    final /* synthetic */ vae d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vab(ensy ensyVar, vae vaeVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.c = ensyVar;
        this.d = vaeVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((vab) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        Object obj2;
        fcyl fcylVar = fcyl.a;
        if (this.b != 0) {
            obj2 = this.a;
            fctl.b(obj);
        } else {
            fctl.b(obj);
            ensy ensyVar = this.c;
            cmfo cmfoVar = (cmfo) this.d.c.b();
            this.a = ensyVar;
            this.b = 1;
            Object objC = cmfoVar.c(this);
            if (objC == fcylVar) {
                return fcylVar;
            }
            obj2 = ensyVar;
            obj = objC;
        }
        boolean z = ((cwtl) obj).c;
        ((evsf) obj2).copyOnWrite();
        enta entaVar = (enta) ((ensy) obj2).instance;
        enta entaVar2 = enta.a;
        entaVar.b |= 64;
        entaVar.n = z;
        aill aillVar = (aill) this.d.a.b();
        ellg ellgVar = (ellg) ellh.a.createBuilder();
        ellf ellfVar = ellf.MAGIC_COMPOSE_EVENT;
        ellgVar.copyOnWrite();
        ellh ellhVar = (ellh) ellgVar.instance;
        ellhVar.j = ellfVar.f11do;
        ellhVar.b |= 1;
        ensy ensyVar2 = this.c;
        ellgVar.copyOnWrite();
        ellh ellhVar2 = (ellh) ellgVar.instance;
        enta entaVar3 = (enta) ensyVar2.build();
        entaVar3.getClass();
        ellhVar2.bE = entaVar3;
        ellhVar2.g |= 131072;
        aillVar.o(ellgVar);
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new vab(this.c, this.d, fcxyVar);
    }
}
