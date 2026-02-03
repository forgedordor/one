package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class anac {
    private final String a;
    private final String b;

    public anac(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof anac)) {
            return false;
        }
        anac anacVar = (anac) obj;
        return fdbq.f(this.a, anacVar.a) && fdbq.f(this.b, anacVar.b);
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "ExtensionMessageMetadata(extensionId=" + this.a + ", extensionPackage=" + this.b + ")";
    }
}
