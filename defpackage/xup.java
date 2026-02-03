package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class xup {
    public final fdpl a;

    public xup(fdpl fdplVar) {
        this.a = fdplVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xup) && fdbq.f(this.a, ((xup) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "MlsWatermarkUiData(shouldShow=" + this.a + ")";
    }
}
