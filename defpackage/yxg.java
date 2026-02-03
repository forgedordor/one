package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class yxg {
    public final ajlt a;

    public yxg(ajlt ajltVar) {
        ajltVar.getClass();
        this.a = ajltVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof yxg) && fdbq.f(this.a, ((yxg) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "ProgressBarOverlayArgs(message=" + this.a + ")";
    }
}
