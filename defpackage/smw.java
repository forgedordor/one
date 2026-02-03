package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class smw extends smy {
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof smy)) {
            return false;
        }
        ((smy) obj).a();
        return true;
    }

    public final int hashCode() {
        return 1001110;
    }

    public final String toString() {
        return "UserProperties{isMinorUser=false}";
    }

    @Override // defpackage.smy
    public final void a() {
    }
}
