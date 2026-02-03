package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class ciet extends fcyz implements fdat {
    final /* synthetic */ cieu a;
    final /* synthetic */ ezny b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ciet(cieu cieuVar, ezny eznyVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.a = cieuVar;
        this.b = eznyVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ciet) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        cieu cieuVar = this.a;
        if (((eoth) ((aoyo) cieuVar.a).a.b()).a("bugle.enable_publish_extended_messaging_capability") && cieuVar.b.a() && cieuVar.c.a()) {
            ezny eznyVar = this.b;
            eznt ezntVar = (eznt) eznv.a.createBuilder();
            ezntVar.getClass();
            eznx eznxVar = eznx.a;
            eznw eznwVar = (eznw) eznxVar.createBuilder();
            eznwVar.getClass();
            eykf.b("+g.3gpp.iari-ref", eznwVar);
            eyke.b(eykf.a(eznwVar), ezntVar);
            eznw eznwVar2 = (eznw) eznxVar.createBuilder();
            eznwVar2.getClass();
            eykf.b("urn%3Aurn-7%3A3gppapplication.ims.iari.rcs.msg.extended", eznwVar2);
            eyke.c(eykf.a(eznwVar2), ezntVar);
            eyke.d(3, ezntVar);
            eznyVar.b(eyke.a(ezntVar));
        }
        return this.b;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new ciet(this.a, this.b, fcxyVar);
    }
}
