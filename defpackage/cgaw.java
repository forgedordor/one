package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class cgaw extends cgeq {
    public final String a;
    public final String b;

    public cgaw(String str, String str2) {
        if (str == null) {
            throw new NullPointerException("Null contentTitle");
        }
        this.a = str;
        if (str2 == null) {
            throw new NullPointerException("Null contentText");
        }
        this.b = str2;
    }

    @Override // defpackage.cgeq
    public final String a() {
        return this.b;
    }

    @Override // defpackage.cgeq
    public final String b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof cgeq) {
            cgeq cgeqVar = (cgeq) obj;
            if (this.a.equals(cgeqVar.b()) && this.b.equals(cgeqVar.a())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        return "StuckMessagesNotificationContent{contentTitle=" + this.a + ", contentText=" + this.b + "}";
    }
}
