package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ctrb {
    public final boolean a;

    public ctrb(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ctrb) && this.a == ((ctrb) obj).a;
    }

    public final int hashCode() {
        return this.a ? 1231 : 1237;
    }

    public final String toString() {
        return "Flags(enableStartChatCoolRanchPhase3=" + this.a + ")";
    }

    public ctrb() {
        this(false);
    }
}
