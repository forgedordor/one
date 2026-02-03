package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class wqs extends fcyz implements fdat {
    int a;
    final /* synthetic */ wqu b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wqs(wqu wquVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = wquVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((wqs) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        Object objB;
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i != 0) {
            objB = obj;
        } else {
            fdjx fdjxVar = (fdjx) this.c;
            wqu wquVar = this.b;
            fcyi fcyiVar = fcyi.a;
            fdjz fdjzVar = fdjz.a;
            fdkf[] fdkfVarArr = {fdin.b(fdjxVar, eicg.a(fcyiVar), fdjzVar, new wqq(null, wquVar)), fdin.b(fdjxVar, eicg.a(fcyiVar), fdjzVar, new wqr(null, wquVar))};
            this.a = 1;
            objB = fdii.b(fdkfVarArr, this);
            if (objB == fcylVar) {
                return fcylVar;
            }
        }
        List list = (List) objB;
        final vvw vvwVar = (vvw) list.get(0);
        wrc wrcVar = (wrc) list.get(1);
        final wqu wquVar2 = this.b;
        final vvw vvwVar2 = wrcVar != null ? wrcVar.a : null;
        final fdci fdciVar = new fdci();
        vvw vvwVarB = wquVar2.i.b(new fdap() { // from class: wqp
            @Override // defpackage.fdap
            public final Object invoke(Object obj2) {
                wqn wqnVar;
                wqn wqnVar2;
                vvw vvwVar3 = (vvw) obj2;
                vvwVar3.getClass();
                vvw vvwVar4 = true != vvwVar3.a() ? null : vvwVar3;
                fdci fdciVar2 = fdciVar;
                fdciVar2.a = vvwVar4;
                vvw vvwVar5 = (vvw) fdciVar2.a;
                vvw vvwVar6 = vvwVar2;
                if (vvwVar6 != null) {
                    wqnVar = new wqn(vvwVar6, true);
                } else {
                    if (vvwVar5 != null) {
                        wqnVar2 = new wqn(vvwVar5, false);
                    } else {
                        vvw vvwVar7 = vvwVar;
                        if (vvwVar7 != null) {
                            wqnVar2 = new wqn(vvwVar7, false);
                        } else {
                            wqnVar = new wqn(null, false);
                        }
                    }
                    wqnVar = wqnVar2;
                }
                vvw vvwVar8 = wqnVar.a;
                return vvwVar8 == null ? vvwVar3 : vvwVar8;
            }
        });
        ekrg ekrgVar = wqu.a;
        ekrw ekrwVarH = ekrgVar.h();
        ekrz ekrzVar = eksq.a;
        ekrwVarH.X(ekrzVar, "BugleComposeRow2");
        ((ekrd) ekrwVarH.h("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/draft/data/DraftOpener", "initializeDraftState", 92, "DraftOpener.kt")).J("Draft merge chose %s, with user: %s, incoming: %s, persisted: %s", vvwVarB, fdciVar.a, vvwVar2, vvwVar);
        ((zuh) wquVar2.h.b()).b();
        vwf vwfVar = wrcVar != null ? wrcVar.b : null;
        ekrw ekrwVarH2 = ekrgVar.h();
        ekrwVarH2.X(ekrzVar, "BugleComposeRow2");
        ((ekrd) ekrwVarH2.h("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/draft/data/DraftOpener", "openInput", 103, "DraftOpener.kt")).t("DraftOpener opening input %s", vwfVar);
        if (vwfVar != null) {
            ((vwg) wquVar2.k.b()).c(vwfVar);
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        wqs wqsVar = new wqs(this.b, fcxyVar);
        wqsVar.c = obj;
        return wqsVar;
    }
}
