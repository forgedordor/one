package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class adeb extends adef {
    public final dooy a;

    public adeb(dooy dooyVar) {
        this.a = dooyVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof adeb) && this.a == ((adeb) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "PhotosAppNotReady(missingRequirement=" + this.a + ")";
    }
}
