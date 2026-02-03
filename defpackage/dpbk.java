package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dpbk {
    public final String a;
    public final int b = 3;

    public dpbk(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dpbk)) {
            return false;
        }
        dpbk dpbkVar = (dpbk) obj;
        if (!fdbq.f(this.a, dpbkVar.a)) {
            return false;
        }
        int i = dpbkVar.b;
        return true;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + 3;
    }

    public final String toString() {
        return "TenorApiConfiguration(apiKey=" + this.a + ", contentFilter=MEDIUM)";
    }
}
