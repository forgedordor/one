package defpackage;

import j$.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class uzz extends fcyz implements fdap {
    Object a;
    Object b;
    Object c;
    Object d;
    Object e;
    Object f;
    int g;
    final /* synthetic */ vae h;
    final /* synthetic */ epiv i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uzz(vae vaeVar, epiv epivVar, fcxy fcxyVar) {
        super(1, fcxyVar);
        this.h = vaeVar;
        this.i = epivVar;
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        Object obj6;
        Object obj7 = fcyl.a;
        if (this.g == 0) {
            fctl.b(obj);
            ellg ellgVar = (ellg) ellh.a.createBuilder();
            ellf ellfVar = ellf.MAGIC_COMPOSE_ICON_EVENT;
            ellgVar.copyOnWrite();
            ellh ellhVar = (ellh) ellgVar.instance;
            ellhVar.j = ellfVar.f11do;
            ellhVar.b |= 1;
            vae vaeVar = this.h;
            obj2 = this.i;
            entr entrVarA = entq.a((entd) ente.a.createBuilder());
            entd entdVar = entrVarA.a;
            entdVar.copyOnWrite();
            ente enteVar = (ente) entdVar.instance;
            enteVar.b |= 2;
            enteVar.d = true;
            cmfo cmfoVar = (cmfo) vaeVar.c.b();
            this.a = vaeVar;
            this.b = obj2;
            this.c = entrVarA;
            this.d = entrVarA;
            this.e = entrVarA;
            this.f = ellgVar;
            this.g = 1;
            Object objC = cmfoVar.c(this);
            if (objC != obj7) {
                obj7 = ellgVar;
                obj3 = entrVarA;
                obj = objC;
                obj4 = obj3;
                obj6 = entrVarA;
                obj5 = vaeVar;
            }
            return obj7;
        }
        obj7 = this.f;
        Object obj8 = this.e;
        obj4 = this.d;
        obj3 = this.c;
        obj2 = this.b;
        Object obj9 = this.a;
        fctl.b(obj);
        obj6 = obj8;
        obj5 = obj9;
        ((entr) obj6).c(((cwtl) obj).c);
        if (vae.o()) {
            ((entr) obj4).b(vae.o());
        }
        if (obj2 != null) {
            ento entoVar = (ento) Map.EL.getOrDefault(((vao) ((vae) obj5).b.b()).b, obj2, ento.MAGIC_COMPOSE_MAGIC_REWRITE_TONE_UNSPECIFIED);
            entoVar.getClass();
            entd entdVar2 = ((entr) obj4).a;
            entdVar2.copyOnWrite();
            ente enteVar2 = (ente) entdVar2.instance;
            ente enteVar3 = ente.a;
            enteVar2.e = entoVar.i;
            enteVar2.b |= 4;
        }
        ente enteVarA = ((entr) obj3).a();
        ((evsf) obj7).copyOnWrite();
        ellh ellhVar2 = (ellh) ((ellg) obj7).instance;
        ellh ellhVar3 = ellh.a;
        ellhVar2.bI = enteVarA;
        ellhVar2.g |= 4194304;
        return obj7;
    }

    @Override // defpackage.fdap
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return new uzz(this.h, this.i, (fcxy) obj).b(fctx.a);
    }
}
