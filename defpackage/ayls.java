package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ayls extends aylx {
    public fhaz a;
    public basd b;
    public febt c;
    public evvp d;
    public int e;
    public int f;
    public int g;

    @Override // defpackage.aylx
    public final ayly a() {
        int i;
        int i2;
        int i3 = this.e;
        if (i3 != 0 && (i = this.f) != 0 && (i2 = this.g) != 0) {
            return new aylt(this.a, this.b, i3, i, i2, this.c, this.d);
        }
        StringBuilder sb = new StringBuilder();
        if (this.e == 0) {
            sb.append(" type");
        }
        if (this.f == 0) {
            sb.append(" xslNode");
        }
        if (this.g == 0) {
            sb.append(" xslInsideNode");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }
}
