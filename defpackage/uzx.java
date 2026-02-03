package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class uzx extends fcyz implements fdat {
    final /* synthetic */ vae a;
    final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uzx(vae vaeVar, int i, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.a = vaeVar;
        this.b = i;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((uzx) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        ailn ailnVarA = ((aimb) this.a.d.b()).a();
        ellg ellgVar = (ellg) ellh.a.createBuilder();
        ellgVar.getClass();
        elgr.g(ellf.MAGIC_COMPOSE_INPUT_TOKEN_METRIC, ellgVar);
        entf entfVar = (entf) enth.a.createBuilder();
        entfVar.getClass();
        int i = this.b;
        int i2 = i < 0 ? 1 : i <= 128 ? 2 : i <= 192 ? 3 : i <= 256 ? 4 : 5;
        entfVar.copyOnWrite();
        enth enthVar = (enth) entfVar.instance;
        enthVar.c = i2 - 1;
        enthVar.b |= 1;
        evsn evsnVarBuild = entfVar.build();
        evsnVarBuild.getClass();
        ellgVar.copyOnWrite();
        ellh ellhVar = (ellh) ellgVar.instance;
        ellhVar.bY = (enth) evsnVarBuild;
        ellhVar.h |= 128;
        ailnVarA.j((ellg) elgr.a(ellgVar).toBuilder(), aioj.LOG_SPEC_MAGIC_COMPOSE_EVENTS);
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new uzx(this.a, this.b, fcxyVar);
    }
}
