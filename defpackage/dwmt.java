package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dwmt extends dwpb {
    public final ekgb a;

    public dwmt(ekgb ekgbVar) {
        this.a = ekgbVar;
    }

    @Override // defpackage.dwpb
    public final ekgb a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof dwpb) {
            return ekjz.h(this.a, ((dwpb) obj).a());
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "CloudConversationMetadata{cloudMessages=" + this.a.toString() + "}";
    }
}
