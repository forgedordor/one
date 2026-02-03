package defpackage;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.Region;
import java.lang.reflect.InvocationTargetException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class iic implements ijb {
    public Canvas a = iid.a;
    private Rect b;
    private Rect c;

    public static final Region.Op q(int i) {
        return i == 0 ? Region.Op.DIFFERENCE : Region.Op.INTERSECT;
    }

    @Override // defpackage.ijb
    public final void a(float f, float f2, float f3, float f4, int i) {
        this.a.clipRect(f, f2, f3, f4, q(i));
    }

    @Override // defpackage.ijb
    public final void b(float[] fArr) {
        if (ijv.a(fArr)) {
            return;
        }
        Matrix matrix = new Matrix();
        iih.a(matrix, fArr);
        this.a.concat(matrix);
    }

    @Override // defpackage.ijb
    public final void c() throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        ijd.a(this.a, false);
    }

    @Override // defpackage.ijb
    public final void d(long j, float f, ikb ikbVar) {
        this.a.drawCircle(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (4294967295L & j)), f, ((iii) ikbVar).a);
    }

    @Override // defpackage.ijb
    public final void e(long j, long j2, ikb ikbVar) {
        int i = (int) (4294967295L & j);
        this.a.drawLine(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat(i), Float.intBitsToFloat((int) (j2 >> 32)), Float.intBitsToFloat((int) (j2 & 4294967295L)), ((iii) ikbVar).a);
    }

    @Override // defpackage.ijb
    public final void f(ikd ikdVar, ikb ikbVar) {
        boolean z = ikdVar instanceof iik;
        Canvas canvas = this.a;
        if (!z) {
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        canvas.drawPath(((iik) ikdVar).a, ((iii) ikbVar).a);
    }

    @Override // defpackage.ijb
    public final void g(float f, float f2, float f3, float f4, ikb ikbVar) {
        this.a.drawRect(f, f2, f3, f4, ((iii) ikbVar).a);
    }

    @Override // defpackage.ijb
    public final void h(float f, float f2, float f3, float f4, float f5, float f6, ikb ikbVar) {
        this.a.drawRoundRect(f, f2, f3, f4, f5, f6, ((iii) ikbVar).a);
    }

    @Override // defpackage.ijb
    public final void i() throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        ijd.a(this.a, true);
    }

    @Override // defpackage.ijb
    public final void j() {
        this.a.restore();
    }

    @Override // defpackage.ijb
    public final void k(float f) {
        this.a.rotate(f);
    }

    @Override // defpackage.ijb
    public final void l() {
        this.a.save();
    }

    @Override // defpackage.ijb
    public final void m(ihu ihuVar, ikb ikbVar) {
        this.a.saveLayer(ihuVar.b, ihuVar.c, ihuVar.d, ihuVar.e, ikbVar.h(), 31);
    }

    @Override // defpackage.ijb
    public final void n(float f, float f2) {
        this.a.scale(f, f2);
    }

    @Override // defpackage.ijb
    public final void o(float f, float f2) {
        this.a.translate(f, f2);
    }

    @Override // defpackage.ijb
    public final void p(float f, float f2, float f3, float f4, float f5, float f6, ikb ikbVar) {
        this.a.drawArc(f, f2, f3, f4, f5, f6, false, ((iii) ikbVar).a);
    }

    @Override // defpackage.ijb
    public final void r(ikd ikdVar) {
        this.a.clipPath(((iik) ikdVar).a, q(1));
    }

    @Override // defpackage.ijb
    public final /* synthetic */ void s(ihu ihuVar) {
        ija.d(this, ihuVar);
    }

    @Override // defpackage.ijb
    public final void t(ijp ijpVar, ikb ikbVar) {
        this.a.drawBitmap(iig.a(ijpVar), Float.intBitsToFloat(0), Float.intBitsToFloat(0), ((iii) ikbVar).a);
    }

    @Override // defpackage.ijb
    public final void u(ijp ijpVar, long j, long j2, ikb ikbVar) {
        if (this.b == null) {
            this.b = new Rect();
            this.c = new Rect();
        }
        Canvas canvas = this.a;
        Bitmap bitmapA = iig.a(ijpVar);
        Rect rect = this.b;
        rect.getClass();
        rect.left = kjb.a(0L);
        rect.top = kjb.b(0L);
        rect.right = kjb.a(0L) + ((int) (j >> 32));
        rect.bottom = kjb.b(0L) + ((int) (j & 4294967295L));
        Rect rect2 = this.c;
        rect2.getClass();
        rect2.left = kjb.a(0L);
        rect2.top = kjb.b(0L);
        rect2.right = kjb.a(0L) + ((int) (j2 >> 32));
        rect2.bottom = kjb.b(0L) + ((int) (j2 & 4294967295L));
        canvas.drawBitmap(bitmapA, rect, rect2, ((iii) ikbVar).a);
    }
}
