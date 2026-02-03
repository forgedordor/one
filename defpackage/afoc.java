package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class afoc {
    public final fdvc a;

    public afoc(fdvc fdvcVar) {
        fdvcVar.getClass();
        this.a = fdvcVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof afoc) && fdbq.f(this.a, ((afoc) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "BottomContentUiData(composeRow=" + this.a + ")";
    }
}
