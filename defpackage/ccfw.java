package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class ccfw {
    public final evqs a;

    public ccfw(evqs evqsVar) {
        this.a = evqsVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ccfw) && fdbq.f(this.a, ((ccfw) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "MlsKeyPackage(bytes=" + this.a + ")";
    }
}
