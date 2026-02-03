package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eugu extends euih {
    public final ekgb a;
    private final String b;
    private final boolean c;

    public eugu(ekgb ekgbVar, String str, boolean z) {
        this.a = ekgbVar;
        this.b = str;
        this.c = z;
    }

    @Override // defpackage.euih
    public final ekgb a() {
        return this.a;
    }

    @Override // defpackage.euih
    public final String b() {
        return this.b;
    }

    @Override // defpackage.euih
    public final boolean c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof euih) {
            euih euihVar = (euih) obj;
            if (ekjz.h(this.a, euihVar.a()) && ((str = this.b) != null ? str.equals(euihVar.b()) : euihVar.b() == null) && this.c == euihVar.c()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() ^ 1000003;
        String str = this.b;
        return (((iHashCode * 1000003) ^ (str == null ? 0 : str.hashCode())) * 1000003) ^ (true != this.c ? 1237 : 1231);
    }

    public final String toString() {
        return "ConversationActions{conversationActions=" + this.a.toString() + ", id=" + this.b + ", sensitive=" + this.c + "}";
    }
}
