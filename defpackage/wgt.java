package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class wgt {
    public static final ekrg a = ekrg.c("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/draft/DraftTopUiDataAdapter");
    private final xbl b;
    private final wwe c;
    private final wtm d;
    private final wxl e;

    public wgt(xbl xblVar, Optional optional, Optional optional2, Optional optional3) {
        xblVar.getClass();
        this.b = xblVar;
        this.c = (wwe) fdct.b(optional);
        this.d = (wtm) fdct.b(optional2);
        this.e = (wxl) fdct.b(optional3);
    }

    public final fdvc a(fdjx fdjxVar) {
        final fdci fdciVar = new fdci();
        fdus fdusVar = fdur.b;
        fdvc fdvcVarB = this.b.b();
        wwe wweVar = this.c;
        fdvc fdvcVarB2 = wweVar != null ? wweVar.b() : new auxs(wgq.a);
        wxl wxlVar = this.e;
        fdvc fdvcVarB3 = wxlVar != null ? wxlVar.b() : new auxs(wgr.a);
        wtm wtmVar = this.d;
        return avba.a(fdjxVar, fdusVar, fdvcVarB, fdvcVarB2, fdvcVarB3, wtmVar != null ? wtmVar.a() : new auxs(wgs.a), new fdav() { // from class: wgm
            @Override // defpackage.fdav
            public final Object a(Object obj, Object obj2, Object obj3, Object obj4) {
                djfy djfyVar = (djfy) obj;
                djcs djcsVar = (djcs) obj2;
                djdh djdhVar = (djdh) obj3;
                djdh djdhVar2 = (djdh) obj4;
                fcti fctiVar = djdhVar != null ? new fcti(djdhVar, wgo.d) : djfyVar != null ? new fcti(djfyVar, wgo.b) : djcsVar != null ? new fcti(djcsVar, wgo.c) : djdhVar2 != null ? new fcti(djdhVar2, wgo.e) : new fcti(null, wgo.a);
                fdci fdciVar2 = fdciVar;
                boolean z = djfyVar != null;
                boolean z2 = djcsVar != null;
                boolean z3 = djdhVar != null;
                boolean z4 = djdhVar2 != null;
                djcw djcwVar = (djcw) fctiVar.a;
                wgp wgpVar = new wgp((wgo) fctiVar.b, z, z2, z3, z4);
                if (!fdbq.f(wgpVar, fdciVar2.a)) {
                    ekrw ekrwVarF = wgt.a.f();
                    ekrwVarF.X(eksq.a, "BugleComposeRow2");
                    ((ekrd) ekrwVarF.h("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/draft/DraftTopUiDataAdapter", "createUiData$lambda$0", 98, "DraftTopUiDataAdapter.kt")).D("Compose row top UI data upstream changed to %s from %s", wgpVar, fdciVar2.a);
                }
                fdciVar2.a = wgpVar;
                return djcwVar;
            }
        });
    }
}
