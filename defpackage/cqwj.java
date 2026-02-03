package defpackage;

import android.net.Uri;
import java.io.File;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cqwj extends cqws {
    public Uri a;
    public String b;
    public String c;
    private File d;
    private long e;
    private double f;
    private boolean g;
    private double h;
    private byte i;

    @Override // defpackage.cqws
    public final cqwt a() {
        Uri uri;
        File file;
        if (this.i == 15 && (uri = this.a) != null && (file = this.d) != null) {
            return new cqwk(uri, file, this.e, this.f, this.g, this.h, this.b, this.c);
        }
        StringBuilder sb = new StringBuilder();
        if (this.a == null) {
            sb.append(" sourceUri");
        }
        if (this.d == null) {
            sb.append(" outputPath");
        }
        if ((this.i & 1) == 0) {
            sb.append(" sizeLimit");
        }
        if ((this.i & 2) == 0) {
            sb.append(" bitrateLimitFactor");
        }
        if ((this.i & 4) == 0) {
            sb.append(" enableHighBudgetVideoCompression");
        }
        if ((this.i & 8) == 0) {
            sb.append(" mmsVideoCompressionFudgeFactor");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    @Override // defpackage.cqws
    public final void b(double d) {
        this.f = d;
        this.i = (byte) (this.i | 2);
    }

    @Override // defpackage.cqws
    public final void c(boolean z) {
        this.g = z;
        this.i = (byte) (this.i | 4);
    }

    @Override // defpackage.cqws
    public final void d(double d) {
        this.h = d;
        this.i = (byte) (this.i | 8);
    }

    @Override // defpackage.cqws
    public final void e(File file) {
        if (file == null) {
            throw new NullPointerException("Null outputPath");
        }
        this.d = file;
    }

    @Override // defpackage.cqws
    public final void f(long j) {
        this.e = j;
        this.i = (byte) (this.i | 1);
    }
}
