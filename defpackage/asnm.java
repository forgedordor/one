package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class asnm {
    public final String a;
    public final String b;
    public final int c;
    private final String d;

    public asnm(String str, int i, String str2, String str3) {
        this.a = str;
        this.c = i;
        this.b = str2;
        this.d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof asnm)) {
            return false;
        }
        asnm asnmVar = (asnm) obj;
        return fdbq.f(this.a, asnmVar.a) && this.c == asnmVar.c && fdbq.f(this.b, asnmVar.b) && fdbq.f(this.d, asnmVar.d);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        int iHashCode2 = (((iHashCode + this.c) * 31) + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RbmBusinessInfoDownloadParameters(botId=");
        sb.append(this.a);
        sb.append(", requestSource=");
        int i = this.c;
        sb.append((Object) (i != 2 ? i != 3 ? i != 4 ? i != 5 ? "DEBUG_MENU_RELOAD" : "INCOMING_MESSAGE_DOWNLOAD_POSTPONED" : "CHATBOT_DIRECTORY" : "CONVERSATION_UPDATE" : "INCOMING_MESSAGE"));
        sb.append(", messageId=");
        sb.append(this.b);
        sb.append(", shortCode=");
        sb.append(this.d);
        sb.append(")");
        return sb.toString();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public asnm(String str, int i) {
        this(str, i, null, null);
        str.getClass();
    }
}
