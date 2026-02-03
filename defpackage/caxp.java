package defpackage;

import android.os.Bundle;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class caxp extends cbcv {
    public ekgb a;
    public Exception b;
    public Bundle c;
    private boolean d;
    private boolean e;
    private boolean f;
    private byte g;

    public caxp() {
    }

    @Override // defpackage.cbcv
    public final cbcw a() {
        if (this.g == 7) {
            return new caxq(this.d, this.e, this.a, this.b, this.f, this.c);
        }
        StringBuilder sb = new StringBuilder();
        if ((this.g & 1) == 0) {
            sb.append(" completed");
        }
        if ((this.g & 2) == 0) {
            sb.append(" retryable");
        }
        if ((this.g & 4) == 0) {
            sb.append(" skipped");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    @Override // defpackage.cbcv
    public final void b(boolean z) {
        this.d = z;
        this.g = (byte) (this.g | 1);
    }

    @Override // defpackage.cbcv
    public final void c(boolean z) {
        this.e = z;
        this.g = (byte) (this.g | 2);
    }

    @Override // defpackage.cbcv
    public final void d(boolean z) {
        this.f = z;
        this.g = (byte) (this.g | 4);
    }

    public caxp(cbcw cbcwVar) {
        caxq caxqVar = (caxq) cbcwVar;
        this.d = caxqVar.a;
        this.e = caxqVar.b;
        this.a = caxqVar.c;
        this.b = caxqVar.d;
        this.f = caxqVar.e;
        this.c = caxqVar.f;
        this.g = (byte) 7;
    }
}
