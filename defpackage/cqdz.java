package defpackage;

import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cqdz {
    private static final ekrg a = ekrg.c("com/google/android/apps/messaging/shared/util/common/XslEventThrottler");

    public static boolean a(fhaz fhazVar) {
        double dDoubleValue = dfog.p().doubleValue();
        if (dDoubleValue >= 1.0d) {
            return true;
        }
        if (dDoubleValue > 0.0d && fhazVar != null && !fhazVar.b.isEmpty()) {
            String str = fhazVar.b;
            try {
                return Math.abs(UUID.fromString(str).hashCode()) <= ((int) (dDoubleValue * 2.147483647E9d));
            } catch (IllegalArgumentException unused) {
                ekrw ekrwVarE = a.e();
                ekrwVarE.X(eksq.a, "BugleDataModel");
                ((ekrd) ((ekrd) ekrwVarE).h("com/google/android/apps/messaging/shared/util/common/XslEventThrottler", "clientSideThrottle", 40, "XslEventThrottler.java")).t("Unable to parse UUID from: %s", str);
            }
        }
        return false;
    }
}
