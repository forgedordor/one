package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class akbj {
    public final akbk a;

    public akbj() {
        this(akbk.a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof akbj) && this.a == ((akbj) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "ConversationParentControlStates(conversationParentSupervisionState=" + this.a + ")";
    }

    public akbj(akbk akbkVar) {
        akbkVar.getClass();
        this.a = akbkVar;
    }
}
