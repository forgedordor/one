package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cvvy {
    public final ekgb a;

    public cvvy(ekgb ekgbVar) {
        this.a = ekgbVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof cvvy) && fdbq.f(this.a, ((cvvy) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "ActionsUiData(actions=" + this.a + ")";
    }
}
