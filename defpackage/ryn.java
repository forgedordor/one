package defpackage;

import android.graphics.Path;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ryn implements rxc {
    final Path a = new Path();
    float b;
    float c;

    public ryn(rxb rxbVar) {
        if (rxbVar == null) {
            return;
        }
        rxbVar.d(this);
    }

    @Override // defpackage.rxc
    public final void a(float f, float f2, float f3, boolean z, boolean z2, float f4, float f5) {
        ryv.c(this.b, this.c, f, f2, f3, z, z2, f4, f5, this);
        this.b = f4;
        this.c = f5;
    }

    @Override // defpackage.rxc
    public final void b() {
        this.a.close();
    }

    @Override // defpackage.rxc
    public final void c(float f, float f2, float f3, float f4, float f5, float f6) {
        this.a.cubicTo(f, f2, f3, f4, f5, f6);
        this.b = f5;
        this.c = f6;
    }

    @Override // defpackage.rxc
    public final void e(float f, float f2) {
        this.a.lineTo(f, f2);
        this.b = f;
        this.c = f2;
    }

    @Override // defpackage.rxc
    public final void f(float f, float f2) {
        this.a.moveTo(f, f2);
        this.b = f;
        this.c = f2;
    }

    @Override // defpackage.rxc
    public final void g(float f, float f2, float f3, float f4) {
        this.a.quadTo(f, f2, f3, f4);
        this.b = f3;
        this.c = f4;
    }
}
