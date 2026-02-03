package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cdew extends cdfe {
    private String a;
    private String b;

    @Override // defpackage.cdfe
    public final cdff a() {
        String str;
        String str2 = this.a;
        if (str2 != null && (str = this.b) != null) {
            return new cdex(str2, str);
        }
        StringBuilder sb = new StringBuilder();
        if (this.a == null) {
            sb.append(" psdKey");
        }
        if (this.b == null) {
            sb.append(" psdValue");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    @Override // defpackage.cdfe
    public final void b(String str) {
        if (str == null) {
            throw new NullPointerException("Null psdKey");
        }
        this.a = str;
    }

    @Override // defpackage.cdfe
    public final void c(String str) {
        if (str == null) {
            throw new NullPointerException("Null psdValue");
        }
        this.b = str;
    }
}
