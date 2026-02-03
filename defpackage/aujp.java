package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class aujp extends aujk {
    public final aubq a;

    public aujp(aubq aubqVar) {
        aubqVar.getClass();
        this.a = aubqVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof aujp) && fdbq.f(this.a, ((aujp) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "RefreshRegistrationData(selfChatEndpoint=" + this.a + ")";
    }
}
