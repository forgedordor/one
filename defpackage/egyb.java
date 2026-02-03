package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class egyb extends egzq {
    private final String a;

    public egyb(String str) {
        this.a = str;
    }

    @Override // defpackage.egzq
    public final String b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof egzq) {
            return this.a.equals(((egzq) obj).b());
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "SingleStringKey{stringRepresentation=" + this.a + "}";
    }
}
