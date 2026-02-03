package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dwmk extends dwjq {
    private final String a;
    private final String b;

    public dwmk(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    @Override // defpackage.dwjq
    public final String c() {
        return this.b;
    }

    @Override // defpackage.dwjq
    public final String d() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof dwjq) {
            dwjq dwjqVar = (dwjq) obj;
            if (this.a.equals(dwjqVar.d()) && this.b.equals(dwjqVar.c())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        return "ReplyActionPayload{text=" + this.a + ", messageCallbackPayload=" + this.b + "}";
    }
}
