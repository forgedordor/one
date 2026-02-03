package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class esfj extends esfv {
    private final String a;
    private final List b;

    public esfj(String str, List list) {
        if (str == null) {
            throw new NullPointerException("Null userAgent");
        }
        this.a = str;
        this.b = list;
    }

    @Override // defpackage.esfv
    public final String a() {
        return this.a;
    }

    @Override // defpackage.esfv
    public final List b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof esfv) {
            esfv esfvVar = (esfv) obj;
            if (this.a.equals(esfvVar.a()) && this.b.equals(esfvVar.b())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        return "HeartBeatResult{userAgent=" + this.a + ", usedDates=" + this.b.toString() + "}";
    }
}
