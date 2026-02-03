package defpackage;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.WeakHashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class pop extends pog {
    static final PorterDuff.Mode a = PorterDuff.Mode.SRC_IN;
    public pon b;
    public boolean c;
    private PorterDuffColorFilter d;
    private ColorFilter f;
    private boolean g;
    private final float[] h;
    private final Matrix i;
    private final Rect j;

    public pop() {
        this.c = true;
        this.h = new float[9];
        this.i = new Matrix();
        this.j = new Rect();
        this.b = new pon();
    }

    static int a(int i, float f) {
        return (i & 16777215) | (((int) (Color.alpha(i) * f)) << 24);
    }

    public static pop b(Resources resources, int i, Resources.Theme theme) {
        pop popVar = new pop();
        WeakHashMap weakHashMap = kyy.a;
        popVar.e = resources.getDrawable(i, theme);
        return popVar;
    }

    final PorterDuffColorFilter c(ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean canApplyTheme() {
        Drawable drawable = this.e;
        if (drawable == null) {
            return false;
        }
        drawable.canApplyTheme();
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Paint paint;
        Drawable drawable = this.e;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        Rect rect = this.j;
        copyBounds(rect);
        if (rect.width() <= 0 || rect.height() <= 0) {
            return;
        }
        ColorFilter colorFilter = this.f;
        if (colorFilter == null) {
            colorFilter = this.d;
        }
        Matrix matrix = this.i;
        canvas.getMatrix(matrix);
        float[] fArr = this.h;
        matrix.getValues(fArr);
        float fAbs = Math.abs(fArr[0]);
        float fAbs2 = Math.abs(fArr[4]);
        float fAbs3 = Math.abs(fArr[1]);
        float fAbs4 = Math.abs(fArr[3]);
        if (fAbs3 != 0.0f || fAbs4 != 0.0f) {
            fAbs = 1.0f;
            fAbs2 = 1.0f;
        }
        int iMin = Math.min(2048, (int) (rect.width() * fAbs));
        int iMin2 = Math.min(2048, (int) (rect.height() * fAbs2));
        if (iMin <= 0 || iMin2 <= 0) {
            return;
        }
        int iSave = canvas.save();
        canvas.translate(rect.left, rect.top);
        if (isAutoMirrored() && getLayoutDirection() == 1) {
            canvas.translate(rect.width(), 0.0f);
            canvas.scale(-1.0f, 1.0f);
        }
        rect.offsetTo(0, 0);
        pon ponVar = this.b;
        Bitmap bitmap = ponVar.f;
        if (bitmap == null || iMin != bitmap.getWidth() || iMin2 != ponVar.f.getHeight()) {
            ponVar.f = Bitmap.createBitmap(iMin, iMin2, Bitmap.Config.ARGB_8888);
            ponVar.k = true;
        }
        if (this.c) {
            pon ponVar2 = this.b;
            if (ponVar2.k || ponVar2.g != ponVar2.c || ponVar2.h != ponVar2.d || ponVar2.j != ponVar2.e || ponVar2.i != ponVar2.b.getRootAlpha()) {
                this.b.a(iMin, iMin2);
                pon ponVar3 = this.b;
                ponVar3.g = ponVar3.c;
                ponVar3.h = ponVar3.d;
                ponVar3.i = ponVar3.b.getRootAlpha();
                ponVar3.j = ponVar3.e;
                ponVar3.k = false;
            }
        } else {
            this.b.a(iMin, iMin2);
        }
        pon ponVar4 = this.b;
        if (ponVar4.b.getRootAlpha() >= 255 && colorFilter == null) {
            paint = null;
        } else {
            if (ponVar4.l == null) {
                ponVar4.l = new Paint();
                ponVar4.l.setFilterBitmap(true);
            }
            ponVar4.l.setAlpha(ponVar4.b.getRootAlpha());
            ponVar4.l.setColorFilter(colorFilter);
            paint = ponVar4.l;
        }
        canvas.drawBitmap(ponVar4.f, (Rect) null, rect, paint);
        canvas.restoreToCount(iSave);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        Drawable drawable = this.e;
        return drawable != null ? drawable.getAlpha() : this.b.b.getRootAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getChangingConfigurations() {
        Drawable drawable = this.e;
        return drawable != null ? drawable.getChangingConfigurations() : super.getChangingConfigurations() | this.b.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        Drawable drawable = this.e;
        return drawable != null ? drawable.getColorFilter() : this.f;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        Drawable drawable = this.e;
        if (drawable != null) {
            return new poo(drawable.getConstantState());
        }
        this.b.a = getChangingConfigurations();
        return this.b;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        Drawable drawable = this.e;
        return drawable != null ? drawable.getIntrinsicHeight() : (int) this.b.b.f;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        Drawable drawable = this.e;
        return drawable != null ? drawable.getIntrinsicWidth() : (int) this.b.b.e;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        Drawable drawable = this.e;
        if (drawable != null) {
            return drawable.getOpacity();
        }
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) throws XmlPullParserException, IOException {
        Drawable drawable = this.e;
        if (drawable != null) {
            drawable.inflate(resources, xmlPullParser, attributeSet);
        } else {
            inflate(resources, xmlPullParser, attributeSet, null);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        Drawable drawable = this.e;
        if (drawable != null) {
            drawable.invalidateSelf();
        } else {
            super.invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isAutoMirrored() {
        Drawable drawable = this.e;
        return drawable != null ? drawable.isAutoMirrored() : this.b.e;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        Drawable drawable = this.e;
        if (drawable != null) {
            return drawable.isStateful();
        }
        if (super.isStateful()) {
            return true;
        }
        pon ponVar = this.b;
        if (ponVar == null) {
            return false;
        }
        if (ponVar.b()) {
            return true;
        }
        ColorStateList colorStateList = this.b.c;
        return colorStateList != null && colorStateList.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable mutate() {
        Drawable drawable = this.e;
        if (drawable != null) {
            drawable.mutate();
            return this;
        }
        if (!this.g && super.mutate() == this) {
            this.b = new pon(this.b);
            this.g = true;
        }
        return this;
    }

    @Override // defpackage.pog, android.graphics.drawable.Drawable
    protected final void onBoundsChange(Rect rect) {
        Drawable drawable = this.e;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    protected final boolean onStateChange(int[] iArr) {
        PorterDuff.Mode mode;
        Drawable drawable = this.e;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        pon ponVar = this.b;
        ColorStateList colorStateList = ponVar.c;
        boolean z = false;
        if (colorStateList != null && (mode = ponVar.d) != null) {
            this.d = c(colorStateList, mode);
            invalidateSelf();
            z = true;
        }
        if (ponVar.b()) {
            boolean zC = ponVar.b.d.c(iArr);
            ponVar.k |= zC;
            if (zC) {
                invalidateSelf();
                return true;
            }
        }
        return z;
    }

    @Override // android.graphics.drawable.Drawable
    public final void scheduleSelf(Runnable runnable, long j) {
        Drawable drawable = this.e;
        if (drawable != null) {
            drawable.scheduleSelf(runnable, j);
        } else {
            super.scheduleSelf(runnable, j);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        Drawable drawable = this.e;
        if (drawable != null) {
            drawable.setAlpha(i);
        } else if (this.b.b.getRootAlpha() != i) {
            this.b.b.setRootAlpha(i);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAutoMirrored(boolean z) {
        Drawable drawable = this.e;
        if (drawable != null) {
            drawable.setAutoMirrored(z);
        } else {
            this.b.e = z;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.e;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        } else {
            this.f = colorFilter;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i) {
        Drawable drawable = this.e;
        if (drawable != null) {
            drawable.setTint(i);
        } else {
            setTintList(ColorStateList.valueOf(i));
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.e;
        if (drawable != null) {
            drawable.setTintList(colorStateList);
            return;
        }
        pon ponVar = this.b;
        if (ponVar.c != colorStateList) {
            ponVar.c = colorStateList;
            this.d = c(colorStateList, ponVar.d);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.e;
        if (drawable != null) {
            drawable.setTintMode(mode);
            return;
        }
        pon ponVar = this.b;
        if (ponVar.d != mode) {
            ponVar.d = mode;
            this.d = c(ponVar.c, mode);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z, boolean z2) {
        Drawable drawable = this.e;
        return drawable != null ? drawable.setVisible(z, z2) : super.setVisible(z, z2);
    }

    @Override // android.graphics.drawable.Drawable
    public final void unscheduleSelf(Runnable runnable) {
        Drawable drawable = this.e;
        if (drawable != null) {
            drawable.unscheduleSelf(runnable);
        } else {
            super.unscheduleSelf(runnable);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        int i;
        int i2;
        boolean z;
        int i3;
        Resources resources2 = resources;
        Drawable drawable = this.e;
        if (drawable != null) {
            drawable.inflate(resources2, xmlPullParser, attributeSet, theme);
            return;
        }
        pon ponVar = this.b;
        ponVar.b = new pom();
        TypedArray typedArrayE = kyz.e(resources2, theme, attributeSet, pnx.a);
        pon ponVar2 = this.b;
        pom pomVar = ponVar2.b;
        int iC = kyz.c(typedArrayE, xmlPullParser, "tintMode", 6, -1);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        int i4 = 3;
        if (iC == 3) {
            mode = PorterDuff.Mode.SRC_OVER;
        } else if (iC == 5) {
            mode = PorterDuff.Mode.SRC_IN;
        } else if (iC != 9) {
            switch (iC) {
                case 14:
                    mode = PorterDuff.Mode.MULTIPLY;
                    break;
                case 15:
                    mode = PorterDuff.Mode.SCREEN;
                    break;
                case 16:
                    mode = PorterDuff.Mode.ADD;
                    break;
            }
        } else {
            mode = PorterDuff.Mode.SRC_ATOP;
        }
        ponVar2.d = mode;
        ColorStateList colorStateListN = kyz.n(typedArrayE, xmlPullParser, theme);
        if (colorStateListN != null) {
            ponVar2.c = colorStateListN;
        }
        ponVar2.e = kyz.l(typedArrayE, xmlPullParser, ponVar2.e);
        pomVar.g = kyz.a(typedArrayE, xmlPullParser, "viewportWidth", 7, pomVar.g);
        float fA = kyz.a(typedArrayE, xmlPullParser, "viewportHeight", 8, pomVar.h);
        pomVar.h = fA;
        if (pomVar.g <= 0.0f) {
            throw new XmlPullParserException(String.valueOf(typedArrayE.getPositionDescription()).concat("<vector> tag requires viewportWidth > 0"));
        }
        if (fA > 0.0f) {
            pomVar.e = typedArrayE.getDimension(3, pomVar.e);
            int i5 = 2;
            float dimension = typedArrayE.getDimension(2, pomVar.f);
            pomVar.f = dimension;
            if (pomVar.e <= 0.0f) {
                throw new XmlPullParserException(String.valueOf(typedArrayE.getPositionDescription()).concat("<vector> tag requires width > 0"));
            }
            if (dimension > 0.0f) {
                pomVar.setAlpha(kyz.a(typedArrayE, xmlPullParser, "alpha", 4, pomVar.getAlpha()));
                boolean z2 = false;
                String string = typedArrayE.getString(0);
                if (string != null) {
                    pomVar.j = string;
                    pomVar.l.put(string, pomVar);
                }
                typedArrayE.recycle();
                ponVar.a = getChangingConfigurations();
                ponVar.k = true;
                pon ponVar3 = this.b;
                pom pomVar2 = ponVar3.b;
                ArrayDeque arrayDeque = new ArrayDeque();
                arrayDeque.push(pomVar2.d);
                int eventType = xmlPullParser.getEventType();
                int depth = xmlPullParser.getDepth() + 1;
                boolean z3 = true;
                for (int i6 = 1; eventType != i6 && (xmlPullParser.getDepth() >= depth || eventType != i4); i6 = 1) {
                    if (eventType == i5) {
                        String name = xmlPullParser.getName();
                        poj pojVar = (poj) arrayDeque.peek();
                        if (pojVar != null) {
                            if ("path".equals(name)) {
                                poi poiVar = new poi();
                                TypedArray typedArrayE2 = kyz.e(resources2, theme, attributeSet, pnx.c);
                                poiVar.a = null;
                                if (kyz.i(xmlPullParser, "pathData")) {
                                    String string2 = typedArrayE2.getString(0);
                                    if (string2 != null) {
                                        poiVar.n = string2;
                                    }
                                    String string3 = typedArrayE2.getString(2);
                                    if (string3 != null) {
                                        poiVar.m = kzf.b(string3);
                                    }
                                    poiVar.d = kyz.o(typedArrayE2, xmlPullParser, theme, "fillColor", 1);
                                    i2 = depth;
                                    poiVar.f = kyz.a(typedArrayE2, xmlPullParser, "fillAlpha", 12, poiVar.f);
                                    int iC2 = kyz.c(typedArrayE2, xmlPullParser, "strokeLineCap", 8, -1);
                                    Paint.Cap cap = poiVar.j;
                                    if (iC2 == 0) {
                                        cap = Paint.Cap.BUTT;
                                    } else if (iC2 == 1) {
                                        cap = Paint.Cap.ROUND;
                                    } else if (iC2 == 2) {
                                        cap = Paint.Cap.SQUARE;
                                    }
                                    poiVar.j = cap;
                                    int iC3 = kyz.c(typedArrayE2, xmlPullParser, "strokeLineJoin", 9, -1);
                                    Paint.Join join = poiVar.k;
                                    if (iC3 == 0) {
                                        join = Paint.Join.MITER;
                                    } else if (iC3 == 1) {
                                        join = Paint.Join.ROUND;
                                    } else if (iC3 == 2) {
                                        join = Paint.Join.BEVEL;
                                    }
                                    poiVar.k = join;
                                    poiVar.l = kyz.a(typedArrayE2, xmlPullParser, "strokeMiterLimit", 10, poiVar.l);
                                    poiVar.b = kyz.o(typedArrayE2, xmlPullParser, theme, "strokeColor", 3);
                                    poiVar.e = kyz.a(typedArrayE2, xmlPullParser, "strokeAlpha", 11, poiVar.e);
                                    poiVar.c = kyz.a(typedArrayE2, xmlPullParser, "strokeWidth", 4, poiVar.c);
                                    poiVar.h = kyz.a(typedArrayE2, xmlPullParser, "trimPathEnd", 6, poiVar.h);
                                    poiVar.i = kyz.a(typedArrayE2, xmlPullParser, "trimPathOffset", 7, poiVar.i);
                                    poiVar.g = kyz.a(typedArrayE2, xmlPullParser, "trimPathStart", 5, poiVar.g);
                                    poiVar.o = kyz.c(typedArrayE2, xmlPullParser, "fillType", 13, poiVar.o);
                                } else {
                                    i2 = depth;
                                }
                                typedArrayE2.recycle();
                                pojVar.b.add(poiVar);
                                if (poiVar.getPathName() != null) {
                                    pomVar2.l.put(poiVar.getPathName(), poiVar);
                                }
                                int i7 = ponVar3.a;
                                i3 = 3;
                                z = false;
                                z3 = false;
                            } else {
                                i2 = depth;
                                if ("clip-path".equals(name)) {
                                    poh pohVar = new poh();
                                    if (kyz.i(xmlPullParser, "pathData")) {
                                        TypedArray typedArrayE3 = kyz.e(resources2, theme, attributeSet, pnx.d);
                                        String string4 = typedArrayE3.getString(0);
                                        if (string4 != null) {
                                            pohVar.n = string4;
                                        }
                                        String string5 = typedArrayE3.getString(1);
                                        if (string5 != null) {
                                            pohVar.m = kzf.b(string5);
                                        }
                                        pohVar.o = kyz.c(typedArrayE3, xmlPullParser, "fillType", 2, 0);
                                        typedArrayE3.recycle();
                                    }
                                    pojVar.b.add(pohVar);
                                    if (pohVar.getPathName() != null) {
                                        pomVar2.l.put(pohVar.getPathName(), pohVar);
                                    }
                                    int i8 = ponVar3.a;
                                    i3 = 3;
                                    z = false;
                                } else if ("group".equals(name)) {
                                    poj pojVar2 = new poj();
                                    TypedArray typedArrayE4 = kyz.e(resources2, theme, attributeSet, pnx.b);
                                    pojVar2.l = null;
                                    pojVar2.c = kyz.a(typedArrayE4, xmlPullParser, "rotation", 5, pojVar2.c);
                                    pojVar2.d = typedArrayE4.getFloat(1, pojVar2.d);
                                    pojVar2.e = typedArrayE4.getFloat(2, pojVar2.e);
                                    pojVar2.f = kyz.a(typedArrayE4, xmlPullParser, "scaleX", 3, pojVar2.f);
                                    pojVar2.g = kyz.a(typedArrayE4, xmlPullParser, "scaleY", 4, pojVar2.g);
                                    pojVar2.h = kyz.a(typedArrayE4, xmlPullParser, "translateX", 6, pojVar2.h);
                                    pojVar2.i = kyz.a(typedArrayE4, xmlPullParser, "translateY", 7, pojVar2.i);
                                    z = false;
                                    String string6 = typedArrayE4.getString(0);
                                    if (string6 != null) {
                                        pojVar2.m = string6;
                                    }
                                    pojVar2.a();
                                    typedArrayE4.recycle();
                                    pojVar.b.add(pojVar2);
                                    arrayDeque.push(pojVar2);
                                    if (pojVar2.getGroupName() != null) {
                                        pomVar2.l.put(pojVar2.getGroupName(), pojVar2);
                                    }
                                    int i9 = ponVar3.a;
                                    i = 2;
                                    i3 = 3;
                                } else {
                                    z = false;
                                    i3 = 3;
                                }
                            }
                            i = 2;
                        } else {
                            i2 = depth;
                            z = z2;
                            i = i5;
                            i3 = 3;
                        }
                    } else {
                        i = i5;
                        i2 = depth;
                        z = z2;
                        i3 = i4;
                        if (eventType == i3 && "group".equals(xmlPullParser.getName())) {
                            arrayDeque.pop();
                        }
                    }
                    eventType = xmlPullParser.next();
                    resources2 = resources;
                    i4 = i3;
                    z2 = z;
                    i5 = i;
                    depth = i2;
                }
                if (!z3) {
                    this.d = c(ponVar.c, ponVar.d);
                    return;
                }
                throw new XmlPullParserException("no path defined");
            }
            throw new XmlPullParserException(String.valueOf(typedArrayE.getPositionDescription()).concat("<vector> tag requires height > 0"));
        }
        throw new XmlPullParserException(String.valueOf(typedArrayE.getPositionDescription()).concat("<vector> tag requires viewportHeight > 0"));
    }

    public pop(pon ponVar) {
        this.c = true;
        this.h = new float[9];
        this.i = new Matrix();
        this.j = new Rect();
        this.b = ponVar;
        this.d = c(ponVar.c, ponVar.d);
    }
}
