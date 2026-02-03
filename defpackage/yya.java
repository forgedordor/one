package defpackage;

import android.content.Context;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class yya {
    public static final ekrg a = ekrg.c("com/google/android/apps/messaging/conversation2/messagelist/message/bubble/progress/ProgressBarOverlayUiAdapter");
    public final fdjx b;
    public final ajmh c;
    public final arlv d;
    public final fdap e;
    private final Context f;
    private final cliy g;
    private final aqts h;
    private final aqtr i;
    private final fdpl j;

    public yya(fdjx fdjxVar, Context context, ajmh ajmhVar, cliy cliyVar, aqts aqtsVar, aqtr aqtrVar, fdpl fdplVar, arlv arlvVar) {
        fdjxVar.getClass();
        context.getClass();
        ajmhVar.getClass();
        cliyVar.getClass();
        aqtsVar.getClass();
        aqtrVar.getClass();
        this.b = fdjxVar;
        this.f = context;
        this.c = ajmhVar;
        this.g = cliyVar;
        this.h = aqtsVar;
        this.i = aqtrVar;
        this.j = fdplVar;
        this.d = arlvVar;
        this.e = auxh.a(new yxz(this), 1000L, fdjxVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final dknh i(final yxg yxgVar, float f, boolean z) {
        return new dknh(j(yxgVar.a), new dknq(Float.valueOf(f), new fdae() { // from class: yxm
            @Override // defpackage.fdae
            public final Object invoke() {
                yya yyaVar = this.a;
                auvw.k(yyaVar.b, null, null, new yxp(yyaVar, yxgVar, null), 3);
                return fctx.a;
            }
        }, z, new dknp(this.d.a())));
    }

    private static final int j(ajlt ajltVar) {
        if ((ajltVar.g() instanceof amwm) && ykm.q(ajltVar)) {
            return 3;
        }
        return ykm.r(ajltVar) ? 2 : 1;
    }

    public final auyl a(amyb amybVar, yxg yxgVar) {
        return auyp.b(new yxt(anov.a(amybVar.a()), this, yxgVar), null);
    }

    public final auyl b(fdjx fdjxVar, final yxg yxgVar) {
        amyb amybVarFm;
        amyb amybVarFm2;
        amyb amybVarFm3;
        amyb amybVarFm4;
        if (!this.h.a() && !this.i.a()) {
            ajlt ajltVar = yxgVar.a;
            amvr amvrVarG = ajltVar.g();
            boolean z = amvrVarG instanceof amsv;
            if (z && !(amvrVarG instanceof amwm)) {
                return null;
            }
            if ((z && (amybVarFm4 = ((amsv) amvrVarG).fm()) != null && amybVarFm4.b()) || (ajltVar instanceof ajmy)) {
                return null;
            }
            anlb anlbVarJ = ajltVar.j();
            if ((anlbVarJ != null && anlbVarJ.b() == 2) || ((cljh) this.g.h().c()).a()) {
                return null;
            }
            amsv amsvVar = z ? (amsv) amvrVarG : null;
            if (amsvVar == null || (amybVarFm3 = amsvVar.fm()) == null) {
                return null;
            }
            if (amybVarFm3.f()) {
                if (dhhi.a(this.f)) {
                    return auyp.b(new yxy(fdtg.a(anov.a(amybVarFm3.a()), fdjxVar, fdur.a, 1), this, yxgVar), null);
                }
                ((ekrd) a.h().h("com/google/android/apps/messaging/conversation2/messagelist/message/bubble/progress/ProgressBarOverlayUiAdapter", "createWithoutOverlayForSatellite", 119, "ProgressBarOverlayUiAdapter.kt")).t("No network is available for messageId=%s", ajltVar.b());
                return new auxq(new fdae() { // from class: yxl
                    @Override // defpackage.fdae
                    public final Object invoke() {
                        return this.a.d(yxgVar);
                    }
                });
            }
            ((ekrd) a.h().h("com/google/android/apps/messaging/conversation2/messagelist/message/bubble/progress/ProgressBarOverlayUiAdapter", "createWithoutOverlayForSatellite", 110, "ProgressBarOverlayUiAdapter.kt")).t("Not transferring for messageId=%s", ajltVar.b());
            if (ykm.q(ajltVar)) {
                return new auxq(new fdae() { // from class: yxk
                    @Override // defpackage.fdae
                    public final Object invoke() {
                        return this.a.c(yxgVar, null, null);
                    }
                });
            }
            return null;
        }
        ajlt ajltVar2 = yxgVar.a;
        amvr amvrVarG2 = ajltVar2.g();
        boolean z2 = amvrVarG2 instanceof amsv;
        if (z2 && !(amvrVarG2 instanceof amwm)) {
            return null;
        }
        if ((z2 && (amybVarFm2 = ((amsv) amvrVarG2).fm()) != null && amybVarFm2.b()) || (ajltVar2 instanceof ajmy)) {
            return null;
        }
        anlb anlbVarJ2 = ajltVar2.j();
        if (anlbVarJ2 != null && anlbVarJ2.b() == 2) {
            return null;
        }
        amsv amsvVar2 = z2 ? (amsv) amvrVarG2 : null;
        if (amsvVar2 == null || (amybVarFm = amsvVar2.fm()) == null) {
            return null;
        }
        if (!dhhi.a(this.f)) {
            ((ekrd) a.h().h("com/google/android/apps/messaging/conversation2/messagelist/message/bubble/progress/ProgressBarOverlayUiAdapter", "createWithOverlayForSatellite", 179, "ProgressBarOverlayUiAdapter.kt")).t("No network is available for messageId=%s", ajltVar2.b());
            return new auxq(new fdae() { // from class: yxi
                @Override // defpackage.fdae
                public final Object invoke() {
                    return this.a.d(yxgVar);
                }
            });
        }
        if (((cljh) this.g.h().c()).b()) {
            fdpl fdplVar = this.j;
            yxu yxuVar = new yxu(null, amybVarFm, this, yxgVar);
            int i = fdsn.a;
            return auyp.b(new fdwg(yxuVar, fdplVar), null);
        }
        if (amybVarFm.f()) {
            return a(amybVarFm, yxgVar);
        }
        ((ekrd) a.h().h("com/google/android/apps/messaging/conversation2/messagelist/message/bubble/progress/ProgressBarOverlayUiAdapter", "createWithOverlayForSatellite", 185, "ProgressBarOverlayUiAdapter.kt")).t("Not transferring for messageId=%s", ajltVar2.b());
        if (ykm.q(ajltVar2)) {
            return new auxq(new fdae() { // from class: yxj
                @Override // defpackage.fdae
                public final Object invoke() {
                    return this.a.c(yxgVar, null, null);
                }
            });
        }
        return null;
    }

    public final dknh c(final yxg yxgVar, String str, final fdae fdaeVar) {
        int iJ = j(yxgVar.a);
        if (str == null) {
            str = this.f.getString(R.string.message_bubble_manual_download);
            str.getClass();
        }
        return new dknh(iJ, new dknl(str, new fdae() { // from class: yxn
            @Override // defpackage.fdae
            public final Object invoke() {
                yxg yxgVar2 = yxgVar;
                yya yyaVar = this.a;
                auvw.k(yyaVar.b, null, null, new yxo(fdaeVar, yxgVar2, yyaVar, null), 3);
                return fctx.a;
            }
        }));
    }

    public final dknh d(final yxg yxgVar) {
        return new dknh(j(yxgVar.a), new dknn(new fdae() { // from class: yxh
            @Override // defpackage.fdae
            public final Object invoke() {
                yya yyaVar = this.a;
                auvw.k(yyaVar.b, null, null, new yxq(yyaVar, yxgVar, null), 3);
                return fctx.a;
            }
        }));
    }

    public final void e(ajlt ajltVar, amxz amxzVar) {
        if (!ykm.q(ajltVar) || ykm.j(ajltVar)) {
            return;
        }
        if (!((amsv) ajltVar.g()).fr()) {
            this.c.L(ajltVar, 3);
        }
        if (amxzVar.c()) {
            this.c.L(ajltVar, 5);
        } else {
            this.c.L(ajltVar, 4);
        }
    }
}
