package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dvig extends dvim {
    private final String a;
    private final ekgb b;

    public dvig(String str, ekgb ekgbVar) {
        this.a = str;
        this.b = ekgbVar;
    }

    @Override // defpackage.dvim
    public final ekgb a() {
        return this.b;
    }

    @Override // defpackage.dvim
    public final String b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof dvim) {
            dvim dvimVar = (dvim) obj;
            if (this.a.equals(dvimVar.b()) && ekjz.h(this.b, dvimVar.a())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        return "GetBlockedConversationsResult{nextPageToken=" + this.a + ", conversationIds=" + this.b.toString() + "}";
    }
}
