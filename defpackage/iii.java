package defpackage;

import android.graphics.Paint;
import android.graphics.PorterDuffXfermode;
import android.graphics.Shader;
import android.os.Build;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class iii implements ikb {
    public Paint a;
    public int b;
    public Shader c;
    public ijf d;

    public iii(Paint paint) {
        this.a = paint;
        this.b = 3;
    }

    @Override // defpackage.ikb
    public final float a() {
        return this.a.getAlpha() / 255.0f;
    }

    @Override // defpackage.ikb
    public final float b() {
        return this.a.getStrokeMiter();
    }

    @Override // defpackage.ikb
    public final float c() {
        return this.a.getStrokeWidth();
    }

    @Override // defpackage.ikb
    public final int d() {
        return !this.a.isFilterBitmap() ? 0 : 1;
    }

    @Override // defpackage.ikb
    public final int e() {
        int i;
        Paint.Cap strokeCap = this.a.getStrokeCap();
        if (strokeCap == null || (i = iij.a[strokeCap.ordinal()]) == 1) {
            return 0;
        }
        if (i != 2) {
            return i != 3 ? 0 : 2;
        }
        return 1;
    }

    @Override // defpackage.ikb
    public final int f() {
        int i;
        Paint.Join strokeJoin = this.a.getStrokeJoin();
        if (strokeJoin == null || (i = iij.b[strokeJoin.ordinal()]) == 1) {
            return 0;
        }
        if (i != 2) {
            return i != 3 ? 0 : 1;
        }
        return 2;
    }

    @Override // defpackage.ikb
    public final long g() {
        return ijg.c(this.a.getColor());
    }

    @Override // defpackage.ikb
    public final Paint h() {
        return this.a;
    }

    @Override // defpackage.ikb
    public final void i(float f) {
        this.a.setAlpha((int) Math.rint(f * 255.0f));
    }

    @Override // defpackage.ikb
    public final void j(int i) {
        if (iis.b(this.b, i)) {
            return;
        }
        this.b = i;
        Paint paint = this.a;
        if (Build.VERSION.SDK_INT >= 29) {
            paint.setBlendMode(iib.a(i));
        } else {
            paint.setXfermode(new PorterDuffXfermode(iib.b(i)));
        }
    }

    @Override // defpackage.ikb
    public final void k(long j) {
        this.a.setColor(ijg.b(j));
    }

    @Override // defpackage.ikb
    public final void l(ijf ijfVar) {
        this.d = ijfVar;
        this.a.setColorFilter(ijfVar != null ? ijfVar.b : null);
    }

    @Override // defpackage.ikb
    public final void m(int i) {
        this.a.setFilterBitmap(!ijl.a(i, 0));
    }

    @Override // defpackage.ikb
    public final void n(Shader shader) {
        this.c = shader;
        this.a.setShader(shader);
    }

    @Override // defpackage.ikb
    public final void o(int i) {
        Paint.Cap cap;
        boolean zA = iku.a(i, 2);
        Paint paint = this.a;
        if (zA) {
            cap = Paint.Cap.SQUARE;
        } else if (iku.a(i, 1)) {
            cap = Paint.Cap.ROUND;
        } else {
            iku.a(i, 0);
            cap = Paint.Cap.BUTT;
        }
        paint.setStrokeCap(cap);
    }

    /* JADX WARN: Removed duplicated region for block: B:4:0x0009  */
    @Override // defpackage.ikb
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void p(int r3) {
        /*
            r2 = this;
            r0 = 0
            boolean r0 = defpackage.ikv.a(r3, r0)
            android.graphics.Paint r1 = r2.a
            if (r0 == 0) goto Lc
        L9:
            android.graphics.Paint$Join r3 = android.graphics.Paint.Join.MITER
            goto L1f
        Lc:
            r0 = 2
            boolean r0 = defpackage.ikv.a(r3, r0)
            if (r0 == 0) goto L16
            android.graphics.Paint$Join r3 = android.graphics.Paint.Join.BEVEL
            goto L1f
        L16:
            r0 = 1
            boolean r3 = defpackage.ikv.a(r3, r0)
            if (r3 == 0) goto L9
            android.graphics.Paint$Join r3 = android.graphics.Paint.Join.ROUND
        L1f:
            r1.setStrokeJoin(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.iii.p(int):void");
    }

    @Override // defpackage.ikb
    public final void q(float f) {
        this.a.setStrokeMiter(f);
    }

    @Override // defpackage.ikb
    public final void r(float f) {
        this.a.setStrokeWidth(f);
    }

    @Override // defpackage.ikb
    public final void s(int i) {
        this.a.setStyle(i == 1 ? Paint.Style.STROKE : Paint.Style.FILL);
    }

    @Override // defpackage.ikb
    public final void t() {
        this.a.setPathEffect(null);
    }

    public iii() {
        this(new Paint(7));
    }
}
