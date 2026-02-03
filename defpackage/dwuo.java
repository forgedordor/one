package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dwuo extends dwvj {
    public dwqf a;
    public dwjr b;
    private byte[] c;
    private String d;

    @Override // defpackage.dwvj
    public final dwvk a() {
        dwqf dwqfVar;
        String str;
        dwjr dwjrVar;
        byte[] bArr = this.c;
        if (bArr != null && (dwqfVar = this.a) != null && (str = this.d) != null && (dwjrVar = this.b) != null) {
            return new dwup(bArr, dwqfVar, str, dwjrVar);
        }
        StringBuilder sb = new StringBuilder();
        if (this.c == null) {
            sb.append(" icon");
        }
        if (this.a == null) {
            sb.append(" lighterIcon");
        }
        if (this.d == null) {
            sb.append(" displayText");
        }
        if (this.b == null) {
            sb.append(" action");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    @Override // defpackage.dwvj
    public final void b(String str) {
        if (str == null) {
            throw new NullPointerException("Null displayText");
        }
        this.d = str;
    }

    @Override // defpackage.dwvj
    public final void c(byte[] bArr) {
        if (bArr == null) {
            throw new NullPointerException("Null icon");
        }
        this.c = bArr;
    }
}
