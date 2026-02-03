package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class edju extends edho {
    private String a;
    private String b;
    private String c;
    private long d;
    private byte e;

    @Override // defpackage.edho
    public final edhp a() {
        String str;
        String str2;
        String str3;
        if (this.e == 1 && (str = this.a) != null && (str2 = this.b) != null && (str3 = this.c) != null) {
            return new edjv(str, str2, str3, this.d);
        }
        StringBuilder sb = new StringBuilder();
        if (this.a == null) {
            sb.append(" name");
        }
        if (this.b == null) {
            sb.append(" accessibilityLabel");
        }
        if (this.c == null) {
            sb.append(" url");
        }
        if (this.e == 0) {
            sb.append(" id");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    @Override // defpackage.edho
    public final void b(String str) {
        if (str == null) {
            throw new NullPointerException("Null accessibilityLabel");
        }
        this.b = str;
    }

    @Override // defpackage.edho
    public final void c(long j) {
        this.d = j;
        this.e = (byte) 1;
    }

    @Override // defpackage.edho
    public final void d(String str) {
        if (str == null) {
            throw new NullPointerException("Null name");
        }
        this.a = str;
    }

    @Override // defpackage.edho
    public final void e(String str) {
        if (str == null) {
            throw new NullPointerException("Null url");
        }
        this.c = str;
    }
}
