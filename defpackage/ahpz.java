package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ahpz {
    public final basd a;
    public final eyga b = null;

    public ahpz(basd basdVar) {
        this.a = basdVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ahpz)) {
            return false;
        }
        ahpz ahpzVar = (ahpz) obj;
        if (!fdbq.f(this.a, ahpzVar.a)) {
            return false;
        }
        eyga eygaVar = ahpzVar.b;
        return fdbq.f(null, null);
    }

    public final int hashCode() {
        return this.a.hashCode() * 31;
    }

    public final String toString() {
        return "ReplyQueuedInfo(rcsMessageId=" + this.a + ", customCpimHeaders=null)";
    }
}
