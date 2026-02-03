package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class aujc extends aujk {
    public final aubq a;

    public aujc(aubq aubqVar) {
        aubqVar.getClass();
        this.a = aubqVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof aujc) && fdbq.f(this.a, ((aujc) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "InvalidateCapabilitiesCacheData(destination=" + this.a + ")";
    }
}
