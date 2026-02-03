package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cvde extends fcyz implements fdat {
    Object a;
    Object b;
    Object c;
    Object d;
    int e;
    final /* synthetic */ cvdg f;
    final /* synthetic */ int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cvde(cvdg cvdgVar, int i, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.f = cvdgVar;
        this.g = i;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cvde) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        Iterator it;
        enkc enkcVar;
        cvdg cvdgVar;
        Object objA;
        Object obj2;
        Object obj3;
        fcyl fcylVar = fcyl.a;
        int i = this.e;
        if (i != 0) {
            it = null;
            if (i == 1) {
                try {
                    fctl.b(obj);
                    awxn awxnVar = (awxn) obj;
                    cvdgVar = this.f;
                    objA = enwo.a((enwz) enxa.a.createBuilder());
                    dggx dggxVar = (dggx) cvdgVar.g.b();
                    axcm axcmVarB = awxnVar.b();
                    this.a = cvdgVar;
                    this.b = objA;
                    this.c = objA;
                    this.d = objA;
                    this.e = 2;
                    obj = dggxVar.m(axcmVarB, this);
                    if (obj == fcylVar) {
                        return fcylVar;
                    }
                    obj2 = objA;
                    obj3 = obj2;
                } catch (IllegalArgumentException e) {
                    ((ekrd) ((ekrd) cvdg.a.j()).g(e).h("com/google/android/apps/messaging/ui/appsettings/analytics/ToggleRcsChatsEventLogger$logToggleGlobalRcsChatsEvent$1", "invokeSuspend", 60, "ToggleRcsChatsEventLogger.kt")).q("Failed to log a toggle global RCS Chats Event");
                    enkcVar = null;
                }
            } else {
                objA = this.d;
                obj2 = this.c;
                Object obj4 = this.b;
                Object obj5 = this.a;
                fctl.b(obj);
                obj3 = obj4;
                cvdgVar = obj5;
            }
            enwr enwrVar = ((dgid) obj).a;
            enwrVar.getClass();
            ((enwp) objA).c(enwrVar);
            enpl enplVarB = ((dexw) cvdgVar.d.b()).b(null);
            enplVarB.getClass();
            ((enwp) obj2).b(enplVarB);
            ((enwp) obj3).a();
            throw null;
        }
        fctl.b(obj);
        int i2 = this.g;
        enkc enkcVar2 = (enkc) enkd.a.createBuilder();
        enkcVar2.getClass();
        enkcVar2.copyOnWrite();
        enkd enkdVar = (enkd) enkcVar2.instance;
        enkdVar.c = i2 - 1;
        enkdVar.b |= 1;
        evsn evsnVarBuild = enkcVar2.build();
        evsnVarBuild.getClass();
        evsf builder = ((enkd) evsnVarBuild).toBuilder();
        builder.getClass();
        it = ((cmlb) this.f.c.b()).n().iterator();
        enkcVar = (enkc) builder;
        while (it.hasNext()) {
            dggn dggnVar = (dggn) it.next();
            cvdg cvdgVar2 = this.f;
            enwp enwpVarA = enwo.a((enwz) enxa.a.createBuilder());
            enwr enwrVar2 = ((dggw) cvdgVar2.e.b()).b(dggo.a(dggnVar).a).a;
            enwrVar2.getClass();
            enwpVarA.c(enwrVar2);
            enpl enplVarB2 = ((dexw) cvdgVar2.d.b()).b(dggnVar);
            enplVarB2.getClass();
            enwpVarA.b(enplVarB2);
            enxa enxaVarA = enwpVarA.a();
            enkcVar.copyOnWrite();
            enkd enkdVar2 = (enkd) enkcVar.instance;
            enkd enkdVar3 = enkd.a;
            evtg evtgVar = enkdVar2.d;
            if (!evtgVar.c()) {
                enkdVar2.d = evsn.mutableCopy(evtgVar);
            }
            enkdVar2.d.add(enxaVarA);
        }
        ailn ailnVarA = ((aimb) this.f.b.b()).a();
        ellg ellgVar = (ellg) ellh.a.createBuilder();
        ellgVar.getClass();
        elgr.g(ellf.TOGGLE_RCS_CHATS_EVENT, ellgVar);
        enka enkaVar = (enka) enkb.a.createBuilder();
        enkaVar.getClass();
        evsn evsnVarBuild2 = enkcVar.build();
        evsnVarBuild2.getClass();
        enkaVar.copyOnWrite();
        enkb enkbVar = (enkb) enkaVar.instance;
        enkbVar.c = (enkd) evsnVarBuild2;
        enkbVar.b = 1;
        elgr.k(eobs.a(enkaVar), ellgVar);
        ailnVarA.j((ellg) elgr.a(ellgVar).toBuilder(), aioj.LOG_SPEC_RCS_SETTINGS_UI_EVENTS);
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new cvde(this.f, this.g, fcxyVar);
    }
}
