package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cnoz {
    public final Optional a;
    public final Optional b;
    public final Optional c;

    public cnoz(Optional optional, Optional optional2, Optional optional3) {
        this.a = optional;
        this.b = optional2;
        this.c = optional3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cnoz)) {
            return false;
        }
        cnoz cnozVar = (cnoz) obj;
        return fdbq.f(this.a, cnozVar.a) && fdbq.f(this.b, cnozVar.b) && fdbq.f(this.c, cnozVar.c);
    }

    public final int hashCode() {
        return (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
    }

    public final String toString() {
        return "TelephonyWipeoutDetectorResult(wipeoutResult=" + this.a + ", telephonySmsCount=" + this.b + ", telephonyMmsCount=" + this.c + ")";
    }
}
