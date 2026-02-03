package defpackage;

import java.util.HashMap;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bwgs {
    private static final cqce c = cqce.g("BugleE2eeEtouffee", "IdVerificationCache");
    public final Object a = new Object();
    public final HashMap b = new HashMap();

    final boolean a(basd basdVar) {
        Integer num = (Integer) bwbt.t.e();
        Integer num2 = (Integer) bwbt.u.e();
        synchronized (this.a) {
            HashMap map = this.b;
            if (map.size() > num2.intValue()) {
                c.r("Cache is too large. Clear it.");
                map.clear();
            }
            Integer num3 = (Integer) map.get(basdVar);
            if (num3 == null) {
                num3 = 0;
            }
            if (num3.intValue() >= num.intValue()) {
                return false;
            }
            map.put(basdVar, Integer.valueOf(num3.intValue() + 1));
            return true;
        }
    }
}
