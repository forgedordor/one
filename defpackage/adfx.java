package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class adfx extends adga {
    public final dooy a;

    public adfx(dooy dooyVar) {
        this.a = dooyVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof adfx) && this.a == ((adfx) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "PhotosAppNotReadyPromo(missingRequirement=" + this.a + ")";
    }
}
