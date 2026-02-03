package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Looper;
import android.util.AttributeSet;
import android.util.Log;
import android.util.StateSet;
import com.google.android.apps.messaging.R;
import j$.util.Objects;
import java.util.BitSet;

/* compiled from: PG */
/* loaded from: classes5.dex */
public class eesc extends Drawable implements eesu {
    public static final /* synthetic */ int B = 0;
    private static final String a = "eesc";
    private static final Paint b;
    private static final eesb[] c;
    public eefe A;
    private PorterDuffColorFilter C;
    private final RectF D;
    private boolean E;
    private eesj F;
    private loa G;
    private float[] H;
    private final eerz I;
    private final eesi d;
    private final Matrix e;
    private final Path f;
    private final Path g;
    private final RectF h;
    private final RectF i;
    private final Region j;
    private final Region k;
    private final Paint l;
    private final Paint m;
    private final eerq n;
    private final eesl o;
    private PorterDuffColorFilter p;
    public eesa q;
    public final eess[] r;
    public final eess[] s;
    public final BitSet t;
    public boolean u;
    public boolean v;
    public int w;
    public boolean x;
    lnz[] y;
    public float[] z;

    static {
        eesh eeshVar = new eesh();
        int i = 0;
        eerv eervVarA = eesd.a(0);
        eeshVar.e(eervVarA);
        eeshVar.g(eervVarA);
        eeshVar.c(eervVarA);
        eeshVar.a(eervVarA);
        eeshVar.i(0.0f);
        Paint paint = new Paint(1);
        b = paint;
        paint.setColor(-1);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        c = new eesb[4];
        while (true) {
            eesb[] eesbVarArr = c;
            int length = eesbVarArr.length;
            if (i >= 4) {
                return;
            }
            eesbVarArr[i] = new eesb(i);
            i++;
        }
    }

    public eesc() {
        this(new eesj());
    }

    public static eesc F(Context context) {
        return G(context, 0.0f, null);
    }

    public static eesc G(Context context, float f, ColorStateList colorStateList) {
        if (colorStateList == null) {
            colorStateList = ColorStateList.valueOf(eehg.d(context, R.attr.colorSurface, "eesc"));
        }
        eesc eescVar = new eesc();
        eescVar.L(context);
        eescVar.P(colorStateList);
        eescVar.O(f);
        return eescVar;
    }

    private static int a(int i, int i2) {
        return (i * (i2 + (i2 >>> 7))) >>> 8;
    }

    private final PorterDuffColorFilter b(ColorStateList colorStateList, PorterDuff.Mode mode, Paint paint, boolean z) {
        if (colorStateList != null && mode != null) {
            int colorForState = colorStateList.getColorForState(getState(), 0);
            if (z) {
                colorForState = A(colorForState);
            }
            this.w = colorForState;
            return new PorterDuffColorFilter(colorForState, mode);
        }
        if (!z) {
            return null;
        }
        int color = paint.getColor();
        int iA = A(color);
        this.w = iA;
        if (iA != color) {
            return new PorterDuffColorFilter(iA, PorterDuff.Mode.SRC_IN);
        }
        return null;
    }

    private final RectF c() {
        RectF rectF = this.i;
        rectF.set(E());
        float fW = w();
        rectF.inset(fW, fW);
        return rectF;
    }

    private final void d(RectF rectF, Path path) {
        I(rectF, path);
        if (this.q.k != 1.0f) {
            Matrix matrix = this.e;
            matrix.reset();
            float f = this.q.k;
            matrix.setScale(f, f, rectF.width() / 2.0f, rectF.height() / 2.0f);
            path.transform(matrix);
        }
        path.computeBounds(this.D, true);
    }

    private final void e(Canvas canvas) {
        if (this.t.cardinality() > 0) {
            Log.w(a, "Compatibility shadow requested but can't be drawn for all operations in this shape.");
        }
        if (this.q.t != 0) {
            canvas.drawPath(this.f, this.n.e);
        }
        for (int i = 0; i < 4; i++) {
            eess[] eessVarArr = this.r;
            eerq eerqVar = this.n;
            eessVarArr[i].c(eerqVar, this.q.s, canvas);
            this.s[i].c(eerqVar, this.q.s, canvas);
        }
        if (this.x) {
            int iB = B();
            int iC = C();
            canvas.translate(-iB, -iC);
            canvas.drawPath(this.f, b);
            canvas.translate(iB, iC);
        }
    }

    private final void f(int[] iArr, boolean z) {
        boolean z2;
        RectF rectFE = E();
        if (this.q.b == null || rectFE.isEmpty()) {
            return;
        }
        boolean z3 = z | (this.G == null);
        if (this.z == null) {
            this.z = new float[4];
        }
        eetb eetbVar = this.q.b;
        int iA = eetbVar.a(iArr);
        if (iA < 0) {
            iA = eetbVar.a(StateSet.WILD_CARD);
        }
        eesj eesjVar = eetbVar.d[iA];
        for (int i = 0; i < 4; i++) {
            float fA = eesl.c(i, eesjVar).a(rectFE);
            if (z3) {
                this.z[i] = fA;
                z2 = true;
            } else {
                z2 = false;
            }
            lnz lnzVar = this.y[i];
            if (lnzVar != null) {
                lnzVar.e(fA);
                if (z2) {
                    this.y[i].f();
                }
            }
        }
        if (z3) {
            invalidateSelf();
        }
    }

    private final void h() {
        float fZ = z();
        this.q.s = (int) Math.ceil(0.75f * fZ);
        this.q.t = (int) Math.ceil(fZ * 0.25f);
        k();
        super.invalidateSelf();
    }

    private final boolean i() {
        return (this.q.w == Paint.Style.FILL_AND_STROKE || this.q.w == Paint.Style.STROKE) && this.m.getStrokeWidth() > 0.0f;
    }

    private final boolean j(int[] iArr) {
        Paint paint;
        int color;
        int colorForState;
        Paint paint2;
        int color2;
        int colorForState2;
        boolean z = false;
        if (this.q.e != null && color2 != (colorForState2 = this.q.e.getColorForState(iArr, (color2 = (paint2 = this.l).getColor())))) {
            paint2.setColor(colorForState2);
            z = true;
        }
        if (this.q.f == null || color == (colorForState = this.q.f.getColorForState(iArr, (color = (paint = this.m).getColor())))) {
            return z;
        }
        paint.setColor(colorForState);
        return true;
    }

    private final boolean k() {
        PorterDuffColorFilter porterDuffColorFilter = this.p;
        PorterDuffColorFilter porterDuffColorFilter2 = this.C;
        eesa eesaVar = this.q;
        this.p = b(eesaVar.h, eesaVar.i, this.l, true);
        eesa eesaVar2 = this.q;
        ColorStateList colorStateList = eesaVar2.g;
        this.C = b(null, eesaVar2.i, this.m, false);
        boolean z = this.q.v;
        return (Objects.equals(porterDuffColorFilter, this.p) && Objects.equals(porterDuffColorFilter2, this.C)) ? false : true;
    }

    private static final float l(RectF rectF, eesj eesjVar, float[] fArr) {
        if (fArr == null) {
            if (eesjVar.g(rectF)) {
                return eesjVar.f.a(rectF);
            }
            return -1.0f;
        }
        if (eemr.b(fArr) && eesjVar.f()) {
            return fArr[0];
        }
        return -1.0f;
    }

    protected final int A(int i) {
        float fZ = z();
        eesa eesaVar = this.q;
        float f = fZ + eesaVar.o;
        eejp eejpVar = eesaVar.c;
        return eejpVar != null ? eejpVar.b(i, f) : i;
    }

    public final int B() {
        eesa eesaVar = this.q;
        return (int) (eesaVar.t * Math.sin(Math.toRadians(eesaVar.u)));
    }

    public final int C() {
        eesa eesaVar = this.q;
        return (int) (eesaVar.t * Math.cos(Math.toRadians(eesaVar.u)));
    }

    public final ColorStateList D() {
        return this.q.e;
    }

    public final RectF E() {
        RectF rectF = this.h;
        rectF.set(getBounds());
        return rectF;
    }

    public final eesj H() {
        return this.q.a;
    }

    protected final void I(RectF rectF, Path path) {
        eesa eesaVar = this.q;
        this.o.a(eesaVar.a, this.z, eesaVar.l, rectF, this.I, path);
    }

    public final void J(Canvas canvas, Paint paint, Path path, eesj eesjVar, float[] fArr, RectF rectF) {
        float fL = l(rectF, eesjVar, fArr);
        if (fL < 0.0f) {
            canvas.drawPath(path, paint);
        } else {
            float f = fL * this.q.l;
            canvas.drawRoundRect(rectF, f, f, paint);
        }
    }

    protected void K(Canvas canvas) {
        J(canvas, this.m, this.g, this.F, this.H, c());
    }

    public final void L(Context context) {
        this.q.c = new eejp(context);
        h();
    }

    public final void M(float f) {
        fx(this.q.a.d(f));
    }

    public final void N(loa loaVar) {
        if (this.G == loaVar) {
            return;
        }
        this.G = loaVar;
        int i = 0;
        while (true) {
            lnz[] lnzVarArr = this.y;
            int length = lnzVarArr.length;
            if (i >= 4) {
                f(getState(), true);
                invalidateSelf();
                return;
            }
            if (lnzVarArr[i] == null) {
                lnzVarArr[i] = new lnz(this, c[i]);
            }
            lnz lnzVar = this.y[i];
            loa loaVar2 = new loa();
            loaVar2.c((float) loaVar.b);
            double d = loaVar.a;
            loaVar2.e((float) (d * d));
            lnzVar.r = loaVar2;
            i++;
        }
    }

    public final void O(float f) {
        eesa eesaVar = this.q;
        if (eesaVar.p != f) {
            eesaVar.p = f;
            h();
        }
    }

    public final void P(ColorStateList colorStateList) {
        eesa eesaVar = this.q;
        if (eesaVar.e != colorStateList) {
            eesaVar.e = colorStateList;
            onStateChange(getState());
        }
    }

    public final void Q(float f) {
        eesa eesaVar = this.q;
        if (eesaVar.l != f) {
            eesaVar.l = f;
            this.u = true;
            this.v = true;
            invalidateSelf();
        }
    }

    public final void R(float f) {
        eesa eesaVar = this.q;
        if (eesaVar.o != f) {
            eesaVar.o = f;
            h();
        }
    }

    public final void S(int i) {
        this.n.a(i);
        this.q.v = false;
        super.invalidateSelf();
    }

    public final void T(eetb eetbVar) {
        eesa eesaVar = this.q;
        if (eesaVar.b != eetbVar) {
            eesaVar.b = eetbVar;
            f(getState(), true);
            invalidateSelf();
        }
    }

    public final void U(float f, int i) {
        X(f);
        W(ColorStateList.valueOf(i));
    }

    public final void V(float f, ColorStateList colorStateList) {
        X(f);
        W(colorStateList);
    }

    public final void W(ColorStateList colorStateList) {
        eesa eesaVar = this.q;
        if (eesaVar.f != colorStateList) {
            eesaVar.f = colorStateList;
            onStateChange(getState());
        }
    }

    public final void X(float f) {
        this.q.m = f;
        invalidateSelf();
    }

    public final boolean Y() {
        if (this.q.a.g(E())) {
            return true;
        }
        float[] fArr = this.z;
        return fArr != null && eemr.b(fArr) && this.q.a.f();
    }

    public final void Z() {
        eesa eesaVar = this.q;
        if (eesaVar.u != 180) {
            eesaVar.u = 180;
            super.invalidateSelf();
        }
    }

    public final void aa() {
        eesa eesaVar = this.q;
        if (eesaVar.r != 2) {
            eesaVar.r = 2;
            super.invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        int i;
        Paint paint = this.l;
        paint.setColorFilter(this.p);
        int alpha = paint.getAlpha();
        paint.setAlpha(a(alpha, this.q.n));
        Paint paint2 = this.m;
        paint2.setColorFilter(this.C);
        paint2.setStrokeWidth(this.q.m);
        int alpha2 = paint2.getAlpha();
        paint2.setAlpha(a(alpha2, this.q.n));
        if (this.q.w == Paint.Style.FILL_AND_STROKE || this.q.w == Paint.Style.FILL) {
            if (this.u) {
                d(E(), this.f);
                this.u = false;
            }
            eesa eesaVar = this.q;
            int i2 = eesaVar.r;
            if (i2 != 1 && eesaVar.s > 0 && (i2 == 2 || (!Y() && !this.f.isConvex() && Build.VERSION.SDK_INT < 29))) {
                canvas.save();
                canvas.translate(B(), C());
                if (this.x) {
                    RectF rectF = this.D;
                    float fWidth = rectF.width() - getBounds().width();
                    float fHeight = rectF.height() - getBounds().height();
                    int i3 = (int) fWidth;
                    if (i3 < 0 || (i = (int) fHeight) < 0) {
                        throw new IllegalStateException("Invalid shadow bounds. Check that the treatments result in a valid path.");
                    }
                    int iWidth = (int) rectF.width();
                    int i4 = this.q.s;
                    int iHeight = (int) rectF.height();
                    int i5 = this.q.s;
                    Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iWidth + i4 + i4 + i3, iHeight + i5 + i5 + i, Bitmap.Config.ARGB_8888);
                    Canvas canvas2 = new Canvas(bitmapCreateBitmap);
                    float f = (getBounds().left - this.q.s) - i3;
                    float f2 = (getBounds().top - this.q.s) - i;
                    canvas2.translate(-f, -f2);
                    e(canvas2);
                    canvas.drawBitmap(bitmapCreateBitmap, f, f2, (Paint) null);
                    bitmapCreateBitmap.recycle();
                    canvas.restore();
                } else {
                    e(canvas);
                    canvas.restore();
                }
            }
            J(canvas, paint, this.f, this.q.a, this.z, E());
        }
        if (i()) {
            if (this.v) {
                this.F = H().e(this.d);
                if (this.z != null) {
                    if (this.H == null) {
                        this.H = new float[4];
                    }
                    float fW = w();
                    int i6 = 0;
                    while (true) {
                        float[] fArr = this.z;
                        int length = fArr.length;
                        if (i6 >= 4) {
                            break;
                        }
                        this.H[i6] = Math.max(0.0f, fArr[i6] - fW);
                        i6++;
                    }
                } else {
                    this.H = null;
                }
                this.o.a(this.F, this.H, this.q.l, c(), null, this.g);
                this.v = false;
            }
            K(canvas);
        }
        paint.setAlpha(alpha);
        paint2.setAlpha(alpha2);
    }

    @Override // defpackage.eesu
    public final void fx(eesj eesjVar) {
        eesa eesaVar = this.q;
        eesaVar.a = eesjVar;
        eesaVar.b = null;
        this.z = null;
        this.H = null;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.q.n;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        return this.q;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(Outline outline) {
        if (this.q.r == 2) {
            return;
        }
        RectF rectFE = E();
        if (rectFE.isEmpty()) {
            return;
        }
        float fL = l(rectFE, this.q.a, this.z);
        if (fL >= 0.0f) {
            outline.setRoundRect(getBounds(), fL * this.q.l);
            return;
        }
        if (this.u) {
            d(rectFE, this.f);
            this.u = false;
        }
        eejo.e(outline, this.f);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean getPadding(Rect rect) {
        Rect rect2 = this.q.j;
        if (rect2 == null) {
            return super.getPadding(rect);
        }
        rect.set(rect2);
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final Region getTransparentRegion() {
        Region region = this.j;
        region.set(getBounds());
        RectF rectFE = E();
        Path path = this.f;
        d(rectFE, path);
        Region region2 = this.k;
        region2.setPath(path, region);
        region.op(region2, Region.Op.DIFFERENCE);
        return region;
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        this.u = true;
        this.v = true;
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        if (super.isStateful()) {
            return true;
        }
        ColorStateList colorStateList = this.q.h;
        if (colorStateList != null && colorStateList.isStateful()) {
            return true;
        }
        eesa eesaVar = this.q;
        ColorStateList colorStateList2 = eesaVar.g;
        ColorStateList colorStateList3 = eesaVar.f;
        if (colorStateList3 != null && colorStateList3.isStateful()) {
            return true;
        }
        ColorStateList colorStateList4 = this.q.e;
        if (colorStateList4 != null && colorStateList4.isStateful()) {
            return true;
        }
        eetb eetbVar = this.q.b;
        return eetbVar != null && eetbVar.a > 1;
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        this.q = new eesa(this.q);
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    protected final void onBoundsChange(Rect rect) {
        this.u = true;
        this.v = true;
        super.onBoundsChange(rect);
        if (this.q.b != null && !rect.isEmpty()) {
            f(getState(), this.E);
        }
        this.E = rect.isEmpty();
    }

    @Override // android.graphics.drawable.Drawable, defpackage.eemc
    protected boolean onStateChange(int[] iArr) {
        if (this.q.b != null) {
            f(iArr, false);
        }
        boolean z = j(iArr) || k();
        if (z) {
            invalidateSelf();
        }
        return z;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        eesa eesaVar = this.q;
        if (eesaVar.n != i) {
            eesaVar.n = i;
            super.invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.q.d = colorFilter;
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i) {
        setTintList(ColorStateList.valueOf(i));
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        this.q.h = colorStateList;
        k();
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        eesa eesaVar = this.q;
        if (eesaVar.i != mode) {
            eesaVar.i = mode;
            k();
            super.invalidateSelf();
        }
    }

    public final float u() {
        float fA;
        float fA2;
        float[] fArr = this.z;
        if (fArr != null) {
            fA = (fArr[3] + fArr[2]) - fArr[1];
            fA2 = fArr[0];
        } else {
            RectF rectFE = E();
            fA = (H().f.a(rectFE) + H().i.a(rectFE)) - H().h.a(rectFE);
            fA2 = eesl.c(0, H()).a(rectFE);
        }
        return (fA - fA2) / 2.0f;
    }

    public final float v() {
        return this.q.p;
    }

    public final float w() {
        if (i()) {
            return this.m.getStrokeWidth() / 2.0f;
        }
        return 0.0f;
    }

    public final float x() {
        float[] fArr = this.z;
        return fArr != null ? fArr[3] : this.q.a.f.a(E());
    }

    public final float y() {
        float[] fArr = this.z;
        return fArr != null ? fArr[0] : this.q.a.g.a(E());
    }

    public final float z() {
        float fV = v();
        float f = this.q.q;
        return fV + 0.0f;
    }

    public eesc(Context context, AttributeSet attributeSet, int i, int i2) {
        this(new eesj(eesj.h(context, attributeSet, i, i2)));
    }

    protected eesc(eesa eesaVar) {
        eesl eeslVar;
        this.d = new eery(this);
        this.r = new eess[4];
        this.s = new eess[4];
        this.t = new BitSet(8);
        this.e = new Matrix();
        this.f = new Path();
        this.g = new Path();
        this.h = new RectF();
        this.i = new RectF();
        this.j = new Region();
        this.k = new Region();
        Paint paint = new Paint(1);
        this.l = paint;
        Paint paint2 = new Paint(1);
        this.m = paint2;
        this.n = new eerq();
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            eeslVar = eesk.a;
        } else {
            eeslVar = new eesl();
        }
        this.o = eeslVar;
        this.D = new RectF();
        this.x = true;
        this.E = true;
        this.y = new lnz[4];
        this.q = eesaVar;
        paint2.setStyle(Paint.Style.STROKE);
        paint.setStyle(Paint.Style.FILL);
        k();
        j(getState());
        this.I = new eerz(this);
    }

    public eesc(eesj eesjVar) {
        this(new eesa(eesjVar));
    }
}
