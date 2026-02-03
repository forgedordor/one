package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class tip {
    public final fdvc a;

    public tip(fdvc fdvcVar) {
        fdvcVar.getClass();
        this.a = fdvcVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof tip) && fdbq.f(this.a, ((tip) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "BlockedParticipantsScreenUiData(blockedParticipantListFlow=" + this.a + ")";
    }
}
