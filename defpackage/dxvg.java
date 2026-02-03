package defpackage;

import java.util.Set;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dxvg {
    public final Set a;
    private final String b = null;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dxvg)) {
            return false;
        }
        dxvg dxvgVar = (dxvg) obj;
        if (!fdbq.f(this.a, dxvgVar.a)) {
            return false;
        }
        String str = dxvgVar.b;
        return fdbq.f(null, null);
    }

    public final int hashCode() {
        return this.a.hashCode() * 31;
    }

    public final String toString() {
        return "AccountRegistrationInfo(notificationChannels=" + this.a + ", delegateGaiaActualAccountName=null)";
    }
}
