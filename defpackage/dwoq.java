package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dwoq extends dwsi {
    private String a;
    private int b;
    private byte c;

    @Override // defpackage.dwsi
    public final dwsj a() {
        String str;
        if (this.c == 1 && (str = this.a) != null) {
            return new dwor(str, this.b);
        }
        StringBuilder sb = new StringBuilder();
        if (this.a == null) {
            sb.append(" pattern");
        }
        if (this.c == 0) {
            sb.append(" substitute");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    @Override // defpackage.dwsi
    public final void b(String str) {
        if (str == null) {
            throw new NullPointerException("Null pattern");
        }
        this.a = str;
    }

    @Override // defpackage.dwsi
    public final void c(int i) {
        this.b = i;
        this.c = (byte) 1;
    }
}
