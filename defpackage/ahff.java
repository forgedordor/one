package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ahff extends ahfr {
    public final String a;
    public final int b;
    public final boolean c;

    public ahff(String str, int i, boolean z) {
        this.a = str;
        this.b = i;
        this.c = z;
    }

    @Override // defpackage.ahfr
    public final int a() {
        return this.b;
    }

    @Override // defpackage.ahfr
    public final String b() {
        return this.a;
    }

    @Override // defpackage.ahfr
    public final boolean c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ahfr) {
            ahfr ahfrVar = (ahfr) obj;
            if (this.a.equals(ahfrVar.b()) && this.b == ahfrVar.a() && this.c == ahfrVar.c()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ (true != this.c ? 1237 : 1231);
    }

    public final String toString() {
        return "SingleRegistrationProvisioningEventInfo{simId=" + this.a + ", subId=" + this.b + ", setupVendorIms=" + this.c + "}";
    }
}
