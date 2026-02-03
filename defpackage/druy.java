package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class druy {
    private final ekgp a = ekoj.a;

    public final boolean equals(Object obj) {
        if (obj instanceof druy) {
            return ekmi.m(this.a, ((druy) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return String.format("SessionInfo@%x : %s", Integer.valueOf(hashCode()), this.a);
    }
}
