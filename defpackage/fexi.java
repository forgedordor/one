package defpackage;

import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fexi {
    public static final /* synthetic */ int j = 0;
    public final boolean a;
    public final boolean b;
    public final int c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final int g;
    public final int h;
    public final boolean i;
    private final int k;
    private final boolean l;
    private final boolean m;
    private String n;

    static {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        timeUnit.getClass();
        timeUnit.toSeconds(2147483647L);
    }

    public fexi(boolean z, boolean z2, int i, int i2, boolean z3, boolean z4, boolean z5, int i3, int i4, boolean z6, boolean z7, boolean z8, String str) {
        this.a = z;
        this.b = z2;
        this.c = i;
        this.k = i2;
        this.d = z3;
        this.e = z4;
        this.f = z5;
        this.g = i3;
        this.h = i4;
        this.i = z6;
        this.l = z7;
        this.m = z8;
        this.n = str;
    }

    public final String toString() {
        String str = this.n;
        if (str != null) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        if (this.a) {
            sb.append("no-cache, ");
        }
        if (this.b) {
            sb.append("no-store, ");
        }
        int i = this.c;
        if (i != -1) {
            sb.append("max-age=");
            sb.append(i);
            sb.append(", ");
        }
        int i2 = this.k;
        if (i2 != -1) {
            sb.append("s-maxage=");
            sb.append(i2);
            sb.append(", ");
        }
        if (this.d) {
            sb.append("private, ");
        }
        if (this.e) {
            sb.append("public, ");
        }
        if (this.f) {
            sb.append("must-revalidate, ");
        }
        int i3 = this.g;
        if (i3 != -1) {
            sb.append("max-stale=");
            sb.append(i3);
            sb.append(", ");
        }
        int i4 = this.h;
        if (i4 != -1) {
            sb.append("min-fresh=");
            sb.append(i4);
            sb.append(", ");
        }
        if (this.i) {
            sb.append("only-if-cached, ");
        }
        if (this.l) {
            sb.append("no-transform, ");
        }
        if (this.m) {
            sb.append("immutable, ");
        }
        if (sb.length() == 0) {
            return "";
        }
        sb.delete(sb.length() - 2, sb.length());
        String string = sb.toString();
        this.n = string;
        return string;
    }
}
