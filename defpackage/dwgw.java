package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dwgw extends dwgx {
    private final String a;
    private final dwhf b;

    public dwgw(String str, dwhf dwhfVar) {
        this.a = str;
        this.b = dwhfVar;
    }

    @Override // defpackage.dwgx
    public final dwhf a() {
        return this.b;
    }

    @Override // defpackage.dwgx
    public final String b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof dwgx) {
            dwgx dwgxVar = (dwgx) obj;
            if (this.a.equals(dwgxVar.b()) && this.b.equals(dwgxVar.a())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        return "GetDecorationResult{messageId=" + this.a + ", linkPreview=" + this.b.toString() + "}";
    }
}
