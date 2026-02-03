package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class edjy extends edhs {
    private String a;
    private String b;
    private long c;
    private long d;
    private byte e;

    @Override // defpackage.edhs
    public final edht a() {
        String str;
        String str2;
        if (this.e == 3 && (str = this.a) != null && (str2 = this.b) != null) {
            return new edjz(str, str2, this.c, this.d);
        }
        StringBuilder sb = new StringBuilder();
        if (this.a == null) {
            sb.append(" name");
        }
        if (this.b == null) {
            sb.append(" url");
        }
        if ((this.e & 1) == 0) {
            sb.append(" id");
        }
        if ((this.e & 2) == 0) {
            sb.append(" numImages");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    @Override // defpackage.edhs
    public final void b(long j) {
        this.c = j;
        this.e = (byte) (this.e | 1);
    }

    @Override // defpackage.edhs
    public final void c(String str) {
        if (str == null) {
            throw new NullPointerException("Null name");
        }
        this.a = str;
    }

    @Override // defpackage.edhs
    public final void d(long j) {
        this.d = j;
        this.e = (byte) (this.e | 2);
    }

    @Override // defpackage.edhs
    public final void e(String str) {
        if (str == null) {
            throw new NullPointerException("Null url");
        }
        this.b = str;
    }
}
