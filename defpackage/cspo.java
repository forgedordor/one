package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cspo {
    public final String a;

    public cspo(String str) {
        str.getClass();
        this.a = str;
        if (fdgn.H(str)) {
            throw new IllegalArgumentException("Failed requirement.");
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof cspo) && fdbq.f(this.a, ((cspo) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "BugleParticipantIdWrapper(participantId=" + this.a + ")";
    }
}
