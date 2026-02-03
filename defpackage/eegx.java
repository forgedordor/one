package defpackage;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eegx extends eesc implements Drawable.Callback, eemc {
    private ColorStateList D;
    private ColorStateList E;
    private float F;
    private ColorStateList G;
    private float H;
    private boolean I;
    private Drawable J;
    private ColorStateList K;
    private boolean L;
    private Drawable M;
    private ColorStateList N;
    private float O;
    private boolean P;
    private Drawable Q;
    private ColorStateList R;
    private float S;
    private float T;
    private float U;
    private float V;
    private final Context W;
    private final Paint X;
    private final Paint.FontMetrics Y;
    private final RectF Z;
    private final PointF aa;
    private final Path ab;
    private int ac;
    private int ad;
    private int ae;
    private int af;
    private int ag;
    private boolean ah;
    private int ai;
    private int aj;
    private ColorFilter ak;
    private PorterDuffColorFilter al;
    private ColorStateList am;
    private PorterDuff.Mode an;
    private int[] ao;
    private WeakReference ap;
    private boolean aq;
    public float b;
    public ColorStateList c;
    public CharSequence d;
    public float e;
    public boolean f;
    public Drawable g;
    public boolean h;
    public float i;
    public float j;
    public float k;
    public float l;
    public final eemd m;
    public TextUtils.TruncateAt n;
    public boolean o;
    public int p;
    public static final int[] a = {R.attr.state_enabled};
    private static final ShapeDrawable C = new ShapeDrawable(new OvalShape());

    private eegx(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.F = -1.0f;
        this.X = new Paint(1);
        this.Y = new Paint.FontMetrics();
        this.Z = new RectF();
        this.aa = new PointF();
        this.ab = new Path();
        this.aj = 255;
        this.an = PorterDuff.Mode.SRC_IN;
        this.ap = new WeakReference(null);
        L(context);
        this.W = context;
        eemd eemdVar = new eemd(this);
        this.m = eemdVar;
        this.d = "";
        eemdVar.a.density = context.getResources().getDisplayMetrics().density;
        int[] iArr = a;
        setState(iArr);
        t(iArr);
        this.o = true;
        C.setTint(-1);
    }

    private final float ab() {
        Drawable drawable = this.ah ? this.Q : this.J;
        float f = this.e;
        return (f > 0.0f || drawable == null) ? f : drawable.getIntrinsicWidth();
    }

    private final ColorFilter ac() {
        ColorFilter colorFilter = this.ak;
        return colorFilter != null ? colorFilter : this.al;
    }

    private final void ad(Drawable drawable) {
        if (drawable == null) {
            return;
        }
        drawable.setCallback(this);
        drawable.setLayoutDirection(getLayoutDirection());
        drawable.setLevel(getLevel());
        drawable.setVisible(isVisible(), false);
        if (drawable == this.g) {
            if (drawable.isStateful()) {
                drawable.setState(this.ao);
            }
            drawable.setTintList(this.N);
            return;
        }
        Drawable drawable2 = this.J;
        if (drawable == drawable2 && this.L) {
            drawable2.setTintList(this.K);
        }
        if (drawable.isStateful()) {
            drawable.setState(getState());
        }
    }

    private final void ae(Rect rect, RectF rectF) {
        rectF.setEmpty();
        if (aj() || ai()) {
            float f = this.i + this.S;
            float fAb = ab();
            if (getLayoutDirection() == 0) {
                rectF.left = rect.left + f;
                rectF.right = rectF.left + fAb;
            } else {
                rectF.right = rect.right - f;
                rectF.left = rectF.right - fAb;
            }
            Drawable drawable = this.ah ? this.Q : this.J;
            float fCeil = this.e;
            if (fCeil <= 0.0f && drawable != null) {
                fCeil = (float) Math.ceil(eemo.a(this.W, 24));
                if (drawable.getIntrinsicHeight() <= fCeil) {
                    fCeil = drawable.getIntrinsicHeight();
                }
            }
            rectF.top = rect.exactCenterY() - (fCeil / 2.0f);
            rectF.bottom = rectF.top + fCeil;
        }
    }

    private final boolean af() {
        return this.P && this.Q != null && this.h;
    }

    private static boolean ag(ColorStateList colorStateList) {
        return colorStateList != null && colorStateList.isStateful();
    }

    private final boolean ah(int[] iArr, int[] iArr2) {
        boolean z;
        boolean z2;
        ColorStateList colorStateList;
        boolean zOnStateChange = super.onStateChange(iArr);
        ColorStateList colorStateList2 = this.D;
        int iA = A(colorStateList2 != null ? colorStateList2.getColorForState(iArr, this.ac) : 0);
        boolean state = true;
        if (this.ac != iA) {
            this.ac = iA;
            zOnStateChange = true;
        }
        ColorStateList colorStateList3 = this.E;
        int iA2 = A(colorStateList3 != null ? colorStateList3.getColorForState(iArr, this.ad) : 0);
        if (this.ad != iA2) {
            this.ad = iA2;
            zOnStateChange = true;
        }
        int iG = kzb.g(iA2, iA);
        if ((this.ae != iG) | (D() == null)) {
            this.ae = iG;
            P(ColorStateList.valueOf(iG));
            zOnStateChange = true;
        }
        ColorStateList colorStateList4 = this.G;
        int colorForState = colorStateList4 != null ? colorStateList4.getColorForState(iArr, this.af) : 0;
        if (this.af != colorForState) {
            this.af = colorForState;
            zOnStateChange = true;
        }
        eeqc eeqcVar = this.m.f;
        int colorForState2 = (eeqcVar == null || (colorStateList = eeqcVar.k) == null) ? 0 : colorStateList.getColorForState(iArr, this.ag);
        if (this.ag != colorForState2) {
            this.ag = colorForState2;
            zOnStateChange = true;
        }
        int[] state2 = getState();
        if (state2 == null) {
            z = false;
        } else {
            int i = 0;
            while (true) {
                if (i >= state2.length) {
                    break;
                }
                if (state2[i] != 16842912) {
                    i++;
                } else if (this.h) {
                    z = true;
                }
            }
        }
        if (this.ah == z || this.Q == null) {
            z2 = false;
        } else {
            float fA = a();
            this.ah = z;
            if (fA != a()) {
                zOnStateChange = true;
                z2 = true;
            } else {
                z2 = false;
                zOnStateChange = true;
            }
        }
        ColorStateList colorStateList5 = this.am;
        int colorForState3 = colorStateList5 != null ? colorStateList5.getColorForState(iArr, this.ai) : 0;
        if (this.ai != colorForState3) {
            this.ai = colorForState3;
            this.al = eejo.b(this, this.am, this.an);
        } else {
            state = zOnStateChange;
        }
        if (s(this.J)) {
            state |= this.J.setState(iArr);
        }
        if (s(this.Q)) {
            state |= this.Q.setState(iArr);
        }
        if (s(this.g)) {
            int length = iArr.length;
            int length2 = iArr2.length;
            int[] iArr3 = new int[length + length2];
            System.arraycopy(iArr, 0, iArr3, 0, length);
            System.arraycopy(iArr2, 0, iArr3, length, length2);
            state |= this.g.setState(iArr3);
        }
        if (s(this.M)) {
            state |= this.M.setState(iArr2);
        }
        if (state) {
            invalidateSelf();
        }
        if (z2) {
            j();
        }
        return state;
    }

    private final boolean ai() {
        return this.P && this.Q != null && this.ah;
    }

    private final boolean aj() {
        return this.I && this.J != null;
    }

    private final boolean ak() {
        return this.f && this.g != null;
    }

    private static final void al(Drawable drawable) {
        if (drawable != null) {
            drawable.setCallback(null);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:115:0x0268  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x029e  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x02c0  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x02d4  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x02f4  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0314  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0328  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x033c  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0356  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0370  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0208  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x021f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.eegx f(android.content.Context r9, android.util.AttributeSet r10, int r11, int r12) {
        /*
            Method dump skipped, instructions count: 902
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.eegx.f(android.content.Context, android.util.AttributeSet, int, int):eegx");
    }

    public static eegx h(Context context, int i) throws XmlPullParserException, Resources.NotFoundException, IOException {
        AttributeSet attributeSetD = eejo.d(context, i, "chip");
        int styleAttribute = attributeSetD.getStyleAttribute();
        if (styleAttribute == 0) {
            styleAttribute = com.google.android.apps.messaging.R.style.Widget_MaterialComponents_Chip_Entry;
        }
        return f(context, attributeSetD, com.google.android.apps.messaging.R.attr.chipStandaloneStyle, styleAttribute);
    }

    public static boolean s(Drawable drawable) {
        return drawable != null && drawable.isStateful();
    }

    public final float a() {
        if (aj() || ai()) {
            return this.S + ab() + this.T;
        }
        return 0.0f;
    }

    public final float b() {
        if (ak()) {
            return this.U + this.O + this.V;
        }
        return 0.0f;
    }

    public final float c() {
        return this.aq ? x() : this.F;
    }

    public final Drawable d() {
        Drawable drawable = this.g;
        if (drawable != null) {
            return kzs.a(drawable);
        }
        return null;
    }

    @Override // defpackage.eesc, android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        int i;
        Canvas canvas2;
        int iSaveLayerAlpha;
        float f;
        int i2;
        Rect bounds = getBounds();
        if (bounds.isEmpty() || (i = this.aj) == 0) {
            return;
        }
        if (i < 255) {
            canvas2 = canvas;
            iSaveLayerAlpha = canvas2.saveLayerAlpha(bounds.left, bounds.top, bounds.right, bounds.bottom, this.aj);
        } else {
            canvas2 = canvas;
            iSaveLayerAlpha = 0;
        }
        if (!this.aq) {
            Paint paint = this.X;
            paint.setColor(this.ac);
            paint.setStyle(Paint.Style.FILL);
            RectF rectF = this.Z;
            rectF.set(bounds);
            canvas2.drawRoundRect(rectF, c(), c(), paint);
        }
        if (!this.aq) {
            Paint paint2 = this.X;
            paint2.setColor(this.ad);
            paint2.setStyle(Paint.Style.FILL);
            paint2.setColorFilter(ac());
            RectF rectF2 = this.Z;
            rectF2.set(bounds);
            canvas2.drawRoundRect(rectF2, c(), c(), paint2);
        }
        if (this.aq) {
            super.draw(canvas);
        }
        if (this.H <= 0.0f || this.aq) {
            f = 2.0f;
        } else {
            Paint paint3 = this.X;
            paint3.setColor(this.af);
            paint3.setStyle(Paint.Style.STROKE);
            if (!this.aq) {
                paint3.setColorFilter(ac());
            }
            RectF rectF3 = this.Z;
            f = 2.0f;
            rectF3.set(bounds.left + (this.H / 2.0f), bounds.top + (this.H / 2.0f), bounds.right - (this.H / 2.0f), bounds.bottom - (this.H / 2.0f));
            float f2 = this.F - (this.H / 2.0f);
            canvas2.drawRoundRect(rectF3, f2, f2, paint3);
        }
        Paint paint4 = this.X;
        paint4.setColor(0);
        paint4.setStyle(Paint.Style.FILL);
        RectF rectF4 = this.Z;
        rectF4.set(bounds);
        if (this.aq) {
            RectF rectF5 = new RectF(bounds);
            Path path = this.ab;
            I(rectF5, path);
            super.J(canvas2, paint4, path, this.q.a, this.z, E());
        } else {
            canvas2.drawRoundRect(rectF4, c(), c(), paint4);
        }
        if (aj()) {
            ae(bounds, rectF4);
            float f3 = rectF4.left;
            float f4 = rectF4.top;
            canvas2.translate(f3, f4);
            this.J.setBounds(0, 0, (int) rectF4.width(), (int) rectF4.height());
            this.J.draw(canvas2);
            canvas2.translate(-f3, -f4);
        }
        if (ai()) {
            ae(bounds, rectF4);
            float f5 = rectF4.left;
            float f6 = rectF4.top;
            canvas2.translate(f5, f6);
            this.Q.setBounds(0, 0, (int) rectF4.width(), (int) rectF4.height());
            this.Q.draw(canvas2);
            canvas2.translate(-f5, -f6);
        }
        if (this.o && this.d != null) {
            PointF pointF = this.aa;
            pointF.set(0.0f, 0.0f);
            Paint.Align align = Paint.Align.LEFT;
            if (this.d != null) {
                float fA = this.i + a() + this.j;
                if (getLayoutDirection() == 0) {
                    pointF.x = bounds.left + fA;
                    align = Paint.Align.LEFT;
                } else {
                    pointF.x = bounds.right - fA;
                    align = Paint.Align.RIGHT;
                }
                float fCenterY = bounds.centerY();
                eemd eemdVar = this.m;
                Paint.FontMetrics fontMetrics = this.Y;
                eemdVar.a.getFontMetrics(fontMetrics);
                pointF.y = fCenterY - ((fontMetrics.descent + fontMetrics.ascent) / f);
            }
            rectF4.setEmpty();
            if (this.d != null) {
                float fA2 = this.i + a() + this.j;
                float fB = this.l + b() + this.k;
                if (getLayoutDirection() == 0) {
                    rectF4.left = bounds.left + fA2;
                    rectF4.right = bounds.right - fB;
                } else {
                    rectF4.left = bounds.left + fB;
                    rectF4.right = bounds.right - fA2;
                }
                rectF4.top = bounds.top;
                rectF4.bottom = bounds.bottom;
            }
            eemd eemdVar2 = this.m;
            if (eemdVar2.f != null) {
                TextPaint textPaint = eemdVar2.a;
                textPaint.drawableState = getState();
                eemdVar2.f.c(this.W, textPaint, eemdVar2.b);
            }
            TextPaint textPaint2 = eemdVar2.a;
            textPaint2.setTextAlign(align);
            boolean z = Math.round(eemdVar2.a(this.d.toString())) > Math.round(rectF4.width());
            if (z) {
                int iSave = canvas2.save();
                canvas2.clipRect(rectF4);
                i2 = iSave;
            } else {
                i2 = 0;
            }
            CharSequence charSequenceEllipsize = this.d;
            if (z && this.n != null) {
                charSequenceEllipsize = TextUtils.ellipsize(charSequenceEllipsize, textPaint2, rectF4.width(), this.n);
            }
            canvas.drawText(charSequenceEllipsize, 0, charSequenceEllipsize.length(), pointF.x, pointF.y, textPaint2);
            canvas2 = canvas;
            if (z) {
                canvas2.restoreToCount(i2);
            }
        }
        if (ak()) {
            rectF4.setEmpty();
            if (ak()) {
                float f7 = this.l + this.V;
                if (getLayoutDirection() == 0) {
                    rectF4.right = bounds.right - f7;
                    rectF4.left = rectF4.right - this.O;
                } else {
                    rectF4.left = bounds.left + f7;
                    rectF4.right = rectF4.left + this.O;
                }
                rectF4.top = bounds.exactCenterY() - (this.O / f);
                rectF4.bottom = rectF4.top + this.O;
            }
            float f8 = rectF4.left;
            float f9 = rectF4.top;
            canvas2.translate(f8, f9);
            this.g.setBounds(0, 0, (int) rectF4.width(), (int) rectF4.height());
            this.M.setBounds(this.g.getBounds());
            this.M.jumpToCurrentState();
            this.M.draw(canvas2);
            canvas2.translate(-f8, -f9);
        }
        if (this.aj < 255) {
            canvas2.restoreToCount(iSaveLayerAlpha);
        }
    }

    @Override // defpackage.eemc
    public final void e() {
        j();
        invalidateSelf();
    }

    @Override // defpackage.eesc, android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.aj;
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        return this.ak;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return (int) this.b;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return Math.min(Math.round(this.i + a() + this.j + this.m.a(this.d.toString()) + this.k + b() + this.l), this.p);
    }

    @Override // defpackage.eesc, android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // defpackage.eesc, android.graphics.drawable.Drawable
    public final void getOutline(Outline outline) {
        Outline outline2;
        if (this.aq) {
            super.getOutline(outline);
            return;
        }
        Rect bounds = getBounds();
        if (bounds.isEmpty()) {
            outline2 = outline;
            outline2.setRoundRect(0, 0, getIntrinsicWidth(), getIntrinsicHeight(), this.F);
        } else {
            outline.setRoundRect(bounds, this.F);
            outline2 = outline;
        }
        outline2.setAlpha(this.aj / 255.0f);
    }

    public final eeqc i() {
        return this.m.f;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.invalidateDrawable(this);
        }
    }

    @Override // defpackage.eesc, android.graphics.drawable.Drawable
    public final boolean isStateful() {
        ColorStateList colorStateList;
        if (ag(this.D) || ag(this.E) || ag(this.G)) {
            return true;
        }
        eeqc eeqcVar = this.m.f;
        return !(eeqcVar == null || (colorStateList = eeqcVar.k) == null || !colorStateList.isStateful()) || af() || s(this.J) || s(this.Q) || ag(this.am);
    }

    protected final void j() {
        eegw eegwVar = (eegw) this.ap.get();
        if (eegwVar != null) {
            eegwVar.a();
        }
    }

    public final void k(boolean z) {
        if (this.P != z) {
            boolean zAi = ai();
            this.P = z;
            boolean zAi2 = ai();
            if (zAi != zAi2) {
                if (zAi2) {
                    ad(this.Q);
                } else {
                    al(this.Q);
                }
                invalidateSelf();
                j();
            }
        }
    }

    public final void l(Drawable drawable) {
        Drawable drawable2 = this.J;
        Drawable drawableA = drawable2 != null ? kzs.a(drawable2) : null;
        if (drawableA != drawable) {
            float fA = a();
            this.J = drawable != null ? drawable.mutate() : null;
            float fA2 = a();
            al(drawableA);
            if (aj()) {
                ad(this.J);
            }
            invalidateSelf();
            if (fA != fA2) {
                j();
            }
        }
    }

    public final void m(boolean z) {
        if (this.I != z) {
            boolean zAj = aj();
            this.I = z;
            boolean zAj2 = aj();
            if (zAj != zAj2) {
                if (zAj2) {
                    ad(this.J);
                } else {
                    al(this.J);
                }
                invalidateSelf();
                j();
            }
        }
    }

    public final void n(boolean z) {
        if (this.f != z) {
            boolean zAk = ak();
            this.f = z;
            boolean zAk2 = ak();
            if (zAk != zAk2) {
                if (zAk2) {
                    ad(this.g);
                } else {
                    al(this.g);
                }
                invalidateSelf();
                j();
            }
        }
    }

    public final void o(eegw eegwVar) {
        this.ap = new WeakReference(eegwVar);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLayoutDirectionChanged(int i) {
        boolean zOnLayoutDirectionChanged = super.onLayoutDirectionChanged(i);
        if (aj()) {
            zOnLayoutDirectionChanged |= this.J.setLayoutDirection(i);
        }
        if (ai()) {
            zOnLayoutDirectionChanged |= this.Q.setLayoutDirection(i);
        }
        if (ak()) {
            zOnLayoutDirectionChanged |= this.g.setLayoutDirection(i);
        }
        if (!zOnLayoutDirectionChanged) {
            return true;
        }
        invalidateSelf();
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    protected final boolean onLevelChange(int i) {
        boolean zOnLevelChange = super.onLevelChange(i);
        if (aj()) {
            zOnLevelChange |= this.J.setLevel(i);
        }
        if (ai()) {
            zOnLevelChange |= this.Q.setLevel(i);
        }
        if (ak()) {
            zOnLevelChange |= this.g.setLevel(i);
        }
        if (zOnLevelChange) {
            invalidateSelf();
        }
        return zOnLevelChange;
    }

    @Override // defpackage.eesc, android.graphics.drawable.Drawable, defpackage.eemc
    public final boolean onStateChange(int[] iArr) {
        if (this.aq) {
            super.onStateChange(iArr);
        }
        return ah(iArr, this.ao);
    }

    public final void p(CharSequence charSequence) {
        if (charSequence == null) {
            charSequence = "";
        }
        if (TextUtils.equals(this.d, charSequence)) {
            return;
        }
        this.d = charSequence;
        this.m.d = true;
        invalidateSelf();
        j();
    }

    public final void q(eeqc eeqcVar) {
        this.m.c(eeqcVar, this.W);
    }

    public final void r(int i) {
        q(new eeqc(this.W, i));
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.scheduleDrawable(this, runnable, j);
        }
    }

    @Override // defpackage.eesc, android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        if (this.aj != i) {
            this.aj = i;
            invalidateSelf();
        }
    }

    @Override // defpackage.eesc, android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        if (this.ak != colorFilter) {
            this.ak = colorFilter;
            invalidateSelf();
        }
    }

    @Override // defpackage.eesc, android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        if (this.am != colorStateList) {
            this.am = colorStateList;
            onStateChange(getState());
        }
    }

    @Override // defpackage.eesc, android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        if (this.an != mode) {
            this.an = mode;
            this.al = eejo.b(this, this.am, mode);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z, boolean z2) {
        boolean visible = super.setVisible(z, z2);
        if (aj()) {
            visible |= this.J.setVisible(z, z2);
        }
        if (ai()) {
            visible |= this.Q.setVisible(z, z2);
        }
        if (ak()) {
            visible |= this.g.setVisible(z, z2);
        }
        if (visible) {
            invalidateSelf();
        }
        return visible;
    }

    public final boolean t(int[] iArr) {
        if (Arrays.equals(this.ao, iArr)) {
            return false;
        }
        this.ao = iArr;
        if (ak()) {
            return ah(getState(), iArr);
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.unscheduleDrawable(this, runnable);
        }
    }
}
