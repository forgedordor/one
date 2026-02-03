package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cvdf extends fcyz implements fdat {
    Object a;
    Object b;
    Object c;
    Object d;
    Object e;
    Object f;
    Object g;
    int h;
    final /* synthetic */ cvdg i;
    final /* synthetic */ dggn j;
    final /* synthetic */ int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cvdf(cvdg cvdgVar, dggn dggnVar, int i, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.i = cvdgVar;
        this.j = dggnVar;
        this.k = i;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cvdf) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        enkf enkfVarA;
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        Object obj6;
        dggn dggnVar;
        Object obj7;
        fcyl fcylVar = fcyl.a;
        int i = this.h;
        if (i != 0) {
            if (i != 1) {
                obj2 = this.g;
                Object obj8 = this.f;
                obj5 = this.e;
                obj3 = this.d;
                obj4 = this.c;
                Object obj9 = this.b;
                Object obj10 = this.a;
                fctl.b(obj);
                obj7 = obj8;
                dggnVar = obj9;
                obj6 = obj10;
            } else {
                fdci fdciVar = (fdci) this.c;
                fdci fdciVar2 = (fdci) this.a;
                try {
                    fctl.b(obj);
                    fdciVar.a = (awxn) obj;
                    int i2 = this.k;
                    cvdg cvdgVar = this.i;
                    dggn dggnVar2 = this.j;
                    eobu eobuVarA = eobt.a((enke) enkf.a.createBuilder());
                    eobuVarA.c(i2);
                    enwp enwpVarA = enwo.a((enwz) enxa.a.createBuilder());
                    dggx dggxVar = (dggx) cvdgVar.g.b();
                    axcm axcmVarB = ((awxn) fdciVar2.a).b();
                    this.a = cvdgVar;
                    this.b = dggnVar2;
                    this.c = eobuVarA;
                    this.d = enwpVarA;
                    this.e = enwpVarA;
                    this.f = eobuVarA;
                    this.g = enwpVarA;
                    this.h = 2;
                    Object objM = dggxVar.m(axcmVarB, this);
                    if (objM == fcylVar) {
                        return fcylVar;
                    }
                    obj2 = enwpVarA;
                    obj3 = obj2;
                    obj4 = eobuVarA;
                    obj = objM;
                    obj5 = obj3;
                    obj7 = eobuVarA;
                    dggnVar = dggnVar2;
                    obj6 = cvdgVar;
                } catch (IllegalArgumentException e) {
                    ((ekrd) ((ekrd) cvdg.a.j()).g(e).h("com/google/android/apps/messaging/ui/appsettings/analytics/ToggleRcsChatsEventLogger$logTogglePerSimRcsChatsEvent$1", "invokeSuspend", 128, "ToggleRcsChatsEventLogger.kt")).q("Failed to log a toggle global RCS Chats Event");
                    return fctx.a;
                }
            }
            enwr enwrVar = ((dgid) obj).a;
            enwrVar.getClass();
            ((enwp) obj2).c(enwrVar);
            enpl enplVarB = ((dexw) ((cvdg) obj6).d.b()).b(dggnVar);
            enplVarB.getClass();
            ((enwp) obj5).b(enplVarB);
            ((eobu) obj7).b(((enwp) obj3).a());
            enkfVarA = ((eobu) obj4).a();
        } else {
            fctl.b(obj);
            cvdg cvdgVar2 = this.i;
            int i3 = this.k;
            dggn dggnVar3 = this.j;
            eobu eobuVarA2 = eobt.a((enke) enkf.a.createBuilder());
            eobuVarA2.c(i3);
            enwp enwpVarA2 = enwo.a((enwz) enxa.a.createBuilder());
            enwr enwrVar2 = ((dggw) cvdgVar2.e.b()).b(dggo.a(dggnVar3).a).a;
            enwrVar2.getClass();
            enwpVarA2.c(enwrVar2);
            enpl enplVarB2 = ((dexw) cvdgVar2.d.b()).b(dggnVar3);
            enplVarB2.getClass();
            enwpVarA2.b(enplVarB2);
            eobuVarA2.b(enwpVarA2.a());
            enkfVarA = eobuVarA2.a();
        }
        ailn ailnVarA = ((aimb) this.i.b.b()).a();
        ellg ellgVar = (ellg) ellh.a.createBuilder();
        ellgVar.getClass();
        elgr.g(ellf.TOGGLE_RCS_CHATS_EVENT, ellgVar);
        enka enkaVar = (enka) enkb.a.createBuilder();
        enkaVar.getClass();
        enkaVar.copyOnWrite();
        enkb enkbVar = (enkb) enkaVar.instance;
        enkbVar.c = enkfVarA;
        enkbVar.b = 2;
        elgr.k(eobs.a(enkaVar), ellgVar);
        ailnVarA.j((ellg) elgr.a(ellgVar).toBuilder(), aioj.LOG_SPEC_RCS_SETTINGS_UI_EVENTS);
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new cvdf(this.i, this.j, this.k, fcxyVar);
    }
}
