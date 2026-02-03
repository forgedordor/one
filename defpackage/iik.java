package defpackage;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class iik implements ikd {
    public final Path a;
    public RectF b;
    private float[] c;
    private Matrix d;

    public iik() {
        this((byte[]) null);
    }

    @Override // defpackage.ikd
    public final int a() {
        return this.a.getFillType() == Path.FillType.EVEN_ODD ? 1 : 0;
    }

    @Override // defpackage.ikd
    public final ihu b() {
        if (this.b == null) {
            this.b = new RectF();
        }
        RectF rectF = this.b;
        rectF.getClass();
        this.a.computeBounds(rectF, true);
        return new ihu(rectF.left, rectF.top, rectF.right, rectF.bottom);
    }

    @Override // defpackage.ikd
    public final void c() {
        this.a.close();
    }

    @Override // defpackage.ikd
    public final void d(float f, float f2, float f3, float f4, float f5, float f6) {
        this.a.cubicTo(f, f2, f3, f4, f5, f6);
    }

    @Override // defpackage.ikd
    public final void e(float f, float f2) {
        this.a.lineTo(f, f2);
    }

    @Override // defpackage.ikd
    public final void f(float f, float f2) {
        this.a.moveTo(f, f2);
    }

    @Override // defpackage.ikd
    public final void g(float f, float f2, float f3, float f4) {
        this.a.quadTo(f, f2, f3, f4);
    }

    @Override // defpackage.ikd
    public final void h(float f, float f2, float f3, float f4, float f5, float f6) {
        this.a.rCubicTo(f, f2, f3, f4, f5, f6);
    }

    @Override // defpackage.ikd
    public final void i(float f, float f2) {
        this.a.rLineTo(f, f2);
    }

    @Override // defpackage.ikd
    public final void j(float f, float f2, float f3, float f4) {
        this.a.rQuadTo(f, f2, f3, f4);
    }

    @Override // defpackage.ikd
    public final void k() {
        this.a.reset();
    }

    @Override // defpackage.ikd
    public final void l() {
        this.a.rewind();
    }

    @Override // defpackage.ikd
    public final void m(int i) {
        this.a.setFillType(ike.a(i, 1) ? Path.FillType.EVEN_ODD : Path.FillType.WINDING);
    }

    @Override // defpackage.ikd
    public final void n(float[] fArr) {
        if (this.d == null) {
            this.d = new Matrix();
        }
        Matrix matrix = this.d;
        matrix.getClass();
        iih.a(matrix, fArr);
        Path path = this.a;
        Matrix matrix2 = this.d;
        matrix2.getClass();
        path.transform(matrix2);
    }

    @Override // defpackage.ikd
    public final void o(long j) {
        Matrix matrix = this.d;
        if (matrix == null) {
            this.d = new Matrix();
        } else {
            matrix.reset();
        }
        Matrix matrix2 = this.d;
        matrix2.getClass();
        matrix2.setTranslate(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)));
        Path path = this.a;
        Matrix matrix3 = this.d;
        matrix3.getClass();
        path.transform(matrix3);
    }

    @Override // defpackage.ikd
    public final boolean p() {
        return this.a.isConvex();
    }

    @Override // defpackage.ikd
    public final void q(ikd ikdVar, ikd ikdVar2, int i) {
        Path.Op op = ikf.a(i, 0) ? Path.Op.DIFFERENCE : ikf.a(i, 1) ? Path.Op.INTERSECT : ikf.a(i, 4) ? Path.Op.REVERSE_DIFFERENCE : ikf.a(i, 2) ? Path.Op.UNION : Path.Op.XOR;
        Path path = this.a;
        Path path2 = ((iik) ikdVar).a;
        if (!(ikdVar2 instanceof iik)) {
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        path.op(path2, ((iik) ikdVar2).a, op);
    }

    @Override // defpackage.ikd
    public final void r(ikd ikdVar) {
        float fIntBitsToFloat = Float.intBitsToFloat(0);
        float fIntBitsToFloat2 = Float.intBitsToFloat(0);
        this.a.addPath(((iik) ikdVar).a, fIntBitsToFloat, fIntBitsToFloat2);
    }

    @Override // defpackage.ikd
    public final void s(ihu ihuVar) {
        float f = ihuVar.b;
        if (Float.isNaN(f) || Float.isNaN(ihuVar.c) || Float.isNaN(ihuVar.d) || Float.isNaN(ihuVar.e)) {
            iio.a("Invalid rectangle, make sure no value is NaN");
        }
        if (this.b == null) {
            this.b = new RectF();
        }
        RectF rectF = this.b;
        rectF.getClass();
        rectF.set(f, ihuVar.c, ihuVar.d, ihuVar.e);
        Path path = this.a;
        RectF rectF2 = this.b;
        rectF2.getClass();
        path.addRect(rectF2, Path.Direction.CCW);
    }

    @Override // defpackage.ikd
    public final void t(ihw ihwVar) {
        if (this.b == null) {
            this.b = new RectF();
        }
        RectF rectF = this.b;
        rectF.getClass();
        rectF.set(ihwVar.a, ihwVar.b, ihwVar.c, ihwVar.d);
        if (this.c == null) {
            this.c = new float[8];
        }
        float[] fArr = this.c;
        fArr.getClass();
        long j = ihwVar.e;
        fArr[0] = Float.intBitsToFloat((int) (j >> 32));
        fArr[1] = Float.intBitsToFloat((int) (j & 4294967295L));
        long j2 = ihwVar.f;
        fArr[2] = Float.intBitsToFloat((int) (j2 >> 32));
        fArr[3] = Float.intBitsToFloat((int) (j2 & 4294967295L));
        long j3 = ihwVar.g;
        fArr[4] = Float.intBitsToFloat((int) (j3 >> 32));
        fArr[5] = Float.intBitsToFloat((int) (j3 & 4294967295L));
        long j4 = ihwVar.h;
        fArr[6] = Float.intBitsToFloat((int) (j4 >> 32));
        fArr[7] = Float.intBitsToFloat((int) (j4 & 4294967295L));
        Path path = this.a;
        RectF rectF2 = this.b;
        rectF2.getClass();
        float[] fArr2 = this.c;
        fArr2.getClass();
        path.addRoundRect(rectF2, fArr2, Path.Direction.CCW);
    }

    public iik(Path path) {
        this.a = path;
    }

    public /* synthetic */ iik(byte[] bArr) {
        this(new Path());
    }
}
