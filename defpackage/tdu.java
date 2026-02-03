package defpackage;

import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class tdu {
    private static final ekrg c = ekrg.c("com/google/android/apps/messaging/banner/eligibility/BannerEligibilityImpl");
    public final fduf a = fdvf.a(fcvp.a);
    public boolean b;

    public final void a(String str, tdv tdvVar) {
        tdvVar.getClass();
        ((ekrd) c.h().h("com/google/android/apps/messaging/banner/eligibility/BannerEligibilityImpl", "setIneligible", 23, "BannerEligibilityImpl.kt")).D("Setting banner %s to ineligible because of %s", str, tdvVar);
        fduf fdufVar = this.a;
        Map mapM = fcwa.m((Map) fdufVar.c());
        mapM.put(str, tdvVar);
        fdufVar.f(fcwa.l(mapM));
    }
}
