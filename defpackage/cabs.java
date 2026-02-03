package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cabs {
    public static final eksp a = eksp.c("BugleCms");
    public static final cczi b = cdag.e(cdag.b, "cms_set_feature_enabled_step_max_attempt", 50);
    private final cpmd c;

    public cabs(cpmd cpmdVar) {
        this.c = cpmdVar;
    }

    public final eiju a(int i, final cabo caboVar) {
        if (i > ((Integer) b.e()).intValue()) {
            ((eksl) ((eksl) a.j()).h("com/google/android/apps/messaging/shared/datamodel/worker/cloudstore/pwq/optin/CmsSetFeatureEnabledOnServerStep", "doWork", 46, "CmsSetFeatureEnabledOnServerStep.java")).q("Set feature enabled reached max retry");
            return eijx.d(new cpzd(cpyz.NO_RETRY));
        }
        eksl ekslVar = (eksl) a.h();
        ekslVar.X(bzmz.E, Integer.valueOf(i));
        ((eksl) ekslVar.h("com/google/android/apps/messaging/shared/datamodel/worker/cloudstore/pwq/optin/CmsSetFeatureEnabledOnServerStep", "doWork", 54, "CmsSetFeatureEnabledOnServerStep.java")).q("Doing status update on the server");
        return this.c.i().h(new ejvr() { // from class: cabr
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                ((eksl) ((eksl) cabs.a.h()).h("com/google/android/apps/messaging/shared/datamodel/worker/cloudstore/pwq/optin/CmsSetFeatureEnabledOnServerStep", "doWork", 60, "CmsSetFeatureEnabledOnServerStep.java")).q("MultiDevice status updated on the server");
                cabm cabmVar = (cabm) caboVar.toBuilder();
                cabmVar.copyOnWrite();
                cabo caboVar2 = (cabo) cabmVar.instance;
                caboVar2.d = 2;
                caboVar2.b |= 4;
                return (cabo) cabmVar.build();
            }
        }, eoqg.a);
    }
}
