package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cuje {
    public final String a;
    private final int b = 0;

    public cuje(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cuje)) {
            return false;
        }
        cuje cujeVar = (cuje) obj;
        if (!fdbq.f(this.a, cujeVar.a)) {
            return false;
        }
        int i = cujeVar.b;
        return true;
    }

    public final int hashCode() {
        return this.a.hashCode() * 31;
    }

    public final String toString() {
        return "ToastData(text=" + this.a + ", duration=0)";
    }
}
