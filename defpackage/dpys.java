package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dpys implements dpyt {
    public final dplj a;

    public dpys(dplj dpljVar) {
        this.a = dpljVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dpys) && fdbq.f(this.a, ((dpys) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Keyboard(keyboard=" + this.a + ")";
    }
}
