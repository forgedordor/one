package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dwnl extends dwqg {
    public dwjr a;
    private String b;
    private ejwi c = ejud.a;

    @Override // defpackage.dwqg
    public final dwqh a() {
        dwjr dwjrVar;
        String str = this.b;
        if (str != null && (dwjrVar = this.a) != null) {
            return new dwnm(str, dwjrVar, this.c);
        }
        StringBuilder sb = new StringBuilder();
        if (this.b == null) {
            sb.append(" menuName");
        }
        if (this.a == null) {
            sb.append(" action");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    @Override // defpackage.dwqg
    public final void b(byte[] bArr) {
        this.c = ejwi.j(bArr);
    }

    @Override // defpackage.dwqg
    public final void c(String str) {
        if (str == null) {
            throw new NullPointerException("Null menuName");
        }
        this.b = str;
    }
}
