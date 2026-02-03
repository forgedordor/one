package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cvfw {
    private final dggn a;
    private final String b;

    public cvfw(dggn dggnVar, String str) {
        this.a = dggnVar;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cvfw)) {
            return false;
        }
        cvfw cvfwVar = (cvfw) obj;
        return fdbq.f(this.a, cvfwVar.a) && fdbq.f(this.b, cvfwVar.b);
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "DisableRcsSimCheckboxClicked(rcsProvisioningId=" + this.a + ", rcsMsisdn=" + this.b + ")";
    }
}
