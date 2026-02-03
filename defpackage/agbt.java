package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class agbt implements afzv {
    public final ajlk a;
    public final ajlu b;
    public final int c;
    public final int d;

    public agbt(ajlk ajlkVar, ajlu ajluVar, int i, int i2) {
        ajlkVar.getClass();
        this.a = ajlkVar;
        this.b = ajluVar;
        this.c = i;
        this.d = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof agbt)) {
            return false;
        }
        agbt agbtVar = (agbt) obj;
        return fdbq.f(this.a, agbtVar.a) && fdbq.f(this.b, agbtVar.b) && this.c == agbtVar.c && this.d == agbtVar.d;
    }

    public final int hashCode() {
        return (((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c) * 31) + this.d;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ConversationDetails(conversationProperties=");
        sb.append(this.a);
        sb.append(", composeController=");
        sb.append(this.b);
        sb.append(", conversationSettingsLaunchSource=");
        sb.append(this.c);
        sb.append(", cdpOpeningSource=");
        sb.append((Object) (this.d != 1 ? "CONVERSATION_OVERFLOW_MENU_DETAILS" : "CONVERSATION_TOP_APPBAR_AVATAR_CLICK"));
        sb.append(")");
        return sb.toString();
    }
}
