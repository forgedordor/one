package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ffbf {
    public final feyz a;
    public final int b;
    public final String c;

    public ffbf(feyz feyzVar, int i, String str) {
        feyzVar.getClass();
        str.getClass();
        this.a = feyzVar;
        this.b = i;
        this.c = str;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.a == feyz.a) {
            sb.append("HTTP/1.0");
        } else {
            sb.append("HTTP/1.1");
        }
        sb.append(' ');
        sb.append(this.b);
        sb.append(' ');
        sb.append(this.c);
        return sb.toString();
    }
}
