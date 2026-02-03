package defpackage;

import android.content.Context;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class xfx {
    public static final ekrg a = ekrg.c("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/inputs/cameragallery/CameraGalleryInputUiAdapter");
    public final Context b;
    public final fdjx c;
    public final fdpl d;
    public final fcsu e;
    public final fcsu f;
    public final fcsu g;
    public final fcsu h;
    public final fcsu i;
    public final fctc j;
    public final fctc k;
    public final fdpl l;
    public final wre m;
    private final fdpl n;
    private final fduj o;

    public xfx(Context context, fdjx fdjxVar, fdpl fdplVar, @apnu fcsu fcsuVar, final fcsu fcsuVar2, fcsu fcsuVar3, fcsu fcsuVar4, wre wreVar, fcsu fcsuVar5, fcsu fcsuVar6, fcsu fcsuVar7, fdpl fdplVar2, fcsu fcsuVar8, fduj fdujVar) {
        context.getClass();
        fdjxVar.getClass();
        fdplVar.getClass();
        fcsuVar.getClass();
        fcsuVar3.getClass();
        fcsuVar4.getClass();
        wreVar.getClass();
        fcsuVar5.getClass();
        fcsuVar6.getClass();
        fcsuVar7.getClass();
        this.b = context;
        this.c = fdjxVar;
        this.d = fdplVar;
        this.e = fcsuVar;
        this.f = fcsuVar3;
        this.g = fcsuVar4;
        this.m = wreVar;
        this.h = fcsuVar5;
        this.i = fcsuVar6;
        this.n = fdplVar2;
        this.o = fdujVar;
        this.j = fctd.a(new fdae() { // from class: xfk
            @Override // defpackage.fdae
            public final Object invoke() {
                Optional optional;
                final xfx xfxVar = this;
                Object objB = xfxVar.e.b();
                objB.getClass();
                final xgc xgcVar = null;
                fcsu fcsuVar9 = true != ((Boolean) objB).booleanValue() ? null : fcsuVar2;
                if (fcsuVar9 != null && (optional = (Optional) fcsuVar9.b()) != null) {
                    xgcVar = (xgc) fdct.b(optional);
                }
                ekrw ekrwVarH = xfx.a.h();
                ekrwVarH.X(eksq.a, "BugleComposeRow2");
                ((ekrd) ekrwVarH.h("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/inputs/cameragallery/CameraGalleryInputUiAdapter", "onLongPress_delegate$lambda$2", 79, "CameraGalleryInputUiAdapter.kt")).t("CameraGalleryInputUiAdapter SelfieGifUiAdapter is null %s", Boolean.valueOf(xgcVar == null));
                return new fdae() { // from class: xfn
                    @Override // defpackage.fdae
                    public final Object invoke() {
                        xgc xgcVar2 = xgcVar;
                        if (xgcVar2 != null) {
                            xfx xfxVar2 = xfxVar;
                            ((acgu) xfxVar2.f.b()).a(34);
                            auvw.k(xfxVar2.c, null, null, new xfv(xgcVar2, null), 3);
                            ekrw ekrwVarE = xfx.a.e();
                            ekrwVarE.X(eksq.a, "BugleComposeRow2");
                            ((ekrd) ekrwVarE.h("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/inputs/cameragallery/CameraGalleryInputUiAdapter", "onInputLongPress", 161, "CameraGalleryInputUiAdapter.kt")).q("Camera gallery button long press invoked.");
                        }
                        return fctx.a;
                    }
                };
            }
        });
        this.k = fctd.a(new fdae() { // from class: xfl
            @Override // defpackage.fdae
            public final Object invoke() {
                xfx xfxVar = this.a;
                if (!((aqgu) xfxVar.h.b()).a() || !((aqgw) xfxVar.i.b()).a()) {
                    return fdvf.a(true);
                }
                wre wreVar2 = xfxVar.m;
                return auyf.c(wreVar2.a, xfxVar.c, new fdap() { // from class: xfm
                    @Override // defpackage.fdap
                    public final Object invoke(Object obj) {
                        vvw vvwVar = (vvw) obj;
                        vvwVar.getClass();
                        return Boolean.valueOf(wbw.a(vvwVar));
                    }
                });
            }
        });
        this.l = ((aqtu) fcsuVar8.b()).a() ? fdqq.a(new fdua(fdujVar, fdplVar2, new xft(null))) : fdqq.a(new fdua(((cliy) fcsuVar7.b()).h(), fdplVar2, new xfu(null)));
    }
}
