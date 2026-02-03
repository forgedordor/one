package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cohf implements cohg {
    private final String a;

    public cohf(String str) {
        this.a = str;
    }

    @Override // defpackage.cohg
    public final eieu a() {
        return eiiy.k(this.a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof cohf) {
            return this.a.equals(((cohf) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "TraceSpanSupplier: ".concat(this.a);
    }
}
