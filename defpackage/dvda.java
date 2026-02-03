package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dvda extends dvde {
    public final boolean a;

    public dvda(boolean z) {
        this.a = z;
    }

    @Override // defpackage.dvde
    public final boolean a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof dvde) && this.a == ((dvde) obj).a();
    }

    public final int hashCode() {
        return (true != this.a ? 1237 : 1231) ^ 1000003;
    }

    public final String toString() {
        return "PhotoOptions{allowDefaultImage=" + this.a + "}";
    }
}
