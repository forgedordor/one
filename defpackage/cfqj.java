package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class cfqj extends fcyz implements fdat {
    int a;
    final /* synthetic */ cfqm b;
    final /* synthetic */ ezjj c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cfqj(cfqm cfqmVar, ezjj ezjjVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = cfqmVar;
        this.c = ezjjVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cfqj) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        try {
            if (this.a != 0) {
                fctl.b(obj);
            } else {
                fctl.b(obj);
                cfqm cfqmVar = this.b;
                cfra cfraVar = (cfra) cfqmVar.c.b();
                ezjj ezjjVar = this.c;
                String str = ezjjVar.c;
                str.getClass();
                if (((Boolean) cbpz.i.e()).booleanValue()) {
                    ellg ellgVar = (ellg) ellh.a.createBuilder();
                    ellgVar.getClass();
                    elgr.g(ellf.RCS_REFLECTION_EVENT, ellgVar);
                    emfs emfsVar = (emfs) emga.a.createBuilder();
                    emfsVar.getClass();
                    emmq.b(str, emfsVar);
                    emmq.e(3, emfsVar);
                    elgr.h(emmq.a(emfsVar), ellgVar);
                    ((cfpv) cfraVar.a.b()).a(elgr.a(ellgVar));
                }
                this.a = 1;
                obj = cfqmVar.b(ezjjVar, this);
                if (obj == fcylVar) {
                    return fcylVar;
                }
            }
            Boolean bool = (Boolean) obj;
            bool.booleanValue();
            return bool;
        } catch (cfpt e) {
            ekrw ekrwVarI = cfqm.a.i();
            ekrwVarI.X(eksq.a, "BugleDittoRcs");
            ((ekrd) ((ekrd) ekrwVarI).g(e).h("com/google/android/apps/messaging/shared/net/handler/reflectedmessage/ReflectedTachygramMessageHandler$handleInboxMessage$1", "invokeSuspend", 62, "ReflectedTachygramMessageHandler.kt")).q("Failed to handle inboxMessage");
            return false;
        }
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new cfqj(this.b, this.c, fcxyVar);
    }
}
