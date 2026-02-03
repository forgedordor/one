package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class vaa extends fcyz implements fdat {
    Object a;
    Object b;
    Object c;
    Object d;
    Object e;
    int f;
    final /* synthetic */ vae g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vaa(vae vaeVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.g = vaeVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((vaa) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        aill aillVar;
        fcyl fcylVar = fcyl.a;
        if (this.f != 0) {
            obj2 = this.e;
            Object obj6 = this.d;
            obj3 = this.c;
            Object obj7 = this.b;
            obj4 = this.a;
            fctl.b(obj);
            aillVar = obj6;
            obj5 = obj7;
        } else {
            fctl.b(obj);
            vae vaeVar = this.g;
            aill aillVar2 = (aill) vaeVar.a.b();
            ellg ellgVar = (ellg) ellh.a.createBuilder();
            ellf ellfVar = ellf.MAGIC_COMPOSE_ICON_EVENT;
            ellgVar.copyOnWrite();
            ellh ellhVar = (ellh) ellgVar.instance;
            ellhVar.j = ellfVar.f11do;
            ellhVar.b |= 1;
            entr entrVarA = entq.a((entd) ente.a.createBuilder());
            entd entdVar = entrVarA.a;
            entdVar.copyOnWrite();
            ente enteVar = (ente) entdVar.instance;
            enteVar.b |= 1;
            enteVar.c = true;
            cmfo cmfoVar = (cmfo) vaeVar.c.b();
            this.a = entrVarA;
            this.b = entrVarA;
            this.c = entrVarA;
            this.d = aillVar2;
            this.e = ellgVar;
            this.f = 1;
            obj = cmfoVar.c(this);
            if (obj == fcylVar) {
                return fcylVar;
            }
            obj2 = ellgVar;
            obj3 = entrVarA;
            obj4 = obj3;
            aillVar = aillVar2;
            obj5 = entrVarA;
        }
        ((entr) obj3).c(((cwtl) obj).c);
        if (vae.o()) {
            ((entr) obj5).b(vae.o());
        }
        ente enteVarA = ((entr) obj4).a();
        ((evsf) obj2).copyOnWrite();
        ellg ellgVar2 = (ellg) obj2;
        ellh ellhVar2 = (ellh) ellgVar2.instance;
        ellh ellhVar3 = ellh.a;
        ellhVar2.bI = enteVarA;
        ellhVar2.g |= 4194304;
        aillVar.o(ellgVar2);
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new vaa(this.g, fcxyVar);
    }
}
