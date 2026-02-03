package defpackage;

import java.util.Iterator;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class tmx implements tmv {
    public static final ekrg a = ekrg.c("com/google/android/apps/messaging/cloudstore/cmsrpc/DeviceOnboardingDelegate");
    public final Map b;
    private final fdjx c;

    public tmx(Map map, fdjx fdjxVar) {
        fdjxVar.getClass();
        this.b = map;
        this.c = fdjxVar;
        Iterator<E> it = ((ekgp) map).keySet().iterator();
        while (it.hasNext()) {
            ((ekrd) a.e().h("com/google/android/apps/messaging/cloudstore/cmsrpc/DeviceOnboardingDelegate", "<init>", 29, "DeviceOnboardingDelegate.kt")).t("Registered DeviceOnboardingPayloadDelegate for %s ", ((epmr) it.next()).name());
        }
    }

    @Override // defpackage.tmv
    public final eiju a(long j, evqs evqsVar, epmp epmpVar) {
        return auvw.c(this.c, fcyi.a, fdjz.a, new tmw(this, epmpVar, j, evqsVar, null));
    }
}
