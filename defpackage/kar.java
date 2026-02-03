package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class kar {
    public final int a;

    public kar(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof kar) && this.a == ((kar) obj).a;
    }

    public final int hashCode() {
        return this.a;
    }

    public final String toString() {
        return "AndroidFontResolveInterceptor(fontWeightAdjustment=" + this.a + ')';
    }
}
