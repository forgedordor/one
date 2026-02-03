package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.util.Log;
import android.util.TypedValue;
import android.util.Xml;
import java.util.WeakHashMap;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eeqc {
    public final ColorStateList a;
    public final String b;
    public final String c;
    public final int d;
    public final int e;
    public final float f;
    public final float g;
    public final float h;
    public final boolean i;
    public final float j;
    public final ColorStateList k;
    public float l;
    public Typeface m;
    private final int n;
    private boolean o = false;
    private boolean p = false;

    public eeqc(Context context, int i) throws Resources.NotFoundException {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i, kt.z);
        this.l = typedArrayObtainStyledAttributes.getDimension(0, 0.0f);
        this.k = eepy.c(context, typedArrayObtainStyledAttributes, 3);
        eepy.c(context, typedArrayObtainStyledAttributes, 4);
        eepy.c(context, typedArrayObtainStyledAttributes, 5);
        this.d = typedArrayObtainStyledAttributes.getInt(2, 0);
        this.e = typedArrayObtainStyledAttributes.getInt(1, 1);
        int iB = eepy.b(typedArrayObtainStyledAttributes, 12, 10);
        this.n = typedArrayObtainStyledAttributes.getResourceId(iB, 0);
        this.b = typedArrayObtainStyledAttributes.getString(iB);
        typedArrayObtainStyledAttributes.getBoolean(14, false);
        this.a = eepy.c(context, typedArrayObtainStyledAttributes, 6);
        this.f = typedArrayObtainStyledAttributes.getFloat(7, 0.0f);
        this.g = typedArrayObtainStyledAttributes.getFloat(8, 0.0f);
        this.h = typedArrayObtainStyledAttributes.getFloat(9, 0.0f);
        typedArrayObtainStyledAttributes.recycle();
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(i, eepz.a);
        this.i = typedArrayObtainStyledAttributes2.hasValue(0);
        this.j = typedArrayObtainStyledAttributes2.getFloat(0, 0.0f);
        this.c = typedArrayObtainStyledAttributes2.getString(eepy.b(typedArrayObtainStyledAttributes2, 3, 1));
        typedArrayObtainStyledAttributes2.recycle();
    }

    private final void g() {
        Typeface typeface;
        String str;
        if (this.m == null && (str = this.b) != null) {
            this.m = Typeface.create(str, this.d);
        }
        if (this.m == null) {
            int i = this.e;
            if (i == 1) {
                typeface = Typeface.SANS_SERIF;
            } else if (i == 2) {
                typeface = Typeface.SERIF;
            } else {
                if (i != 3) {
                    this.m = Typeface.DEFAULT;
                    this.m = Typeface.create(this.m, this.d);
                }
                typeface = Typeface.MONOSPACE;
            }
            this.m = typeface;
            this.m = Typeface.create(this.m, this.d);
        }
    }

    private final boolean h(Context context) {
        Context context2;
        Typeface typefaceE;
        String string;
        Typeface typefaceCreate;
        if (this.o) {
            return true;
        }
        int i = this.n;
        if (i == 0) {
            return false;
        }
        WeakHashMap weakHashMap = kyy.a;
        Typeface typefaceCreate2 = null;
        if (context.isRestricted()) {
            context2 = context;
            typefaceE = null;
        } else {
            context2 = context;
            typefaceE = kyy.e(context2, i, new TypedValue(), 0, null, false, true);
        }
        if (typefaceE == null) {
            if (!this.p) {
                this.p = true;
                Resources resources = context2.getResources();
                if (i == 0 || !resources.getResourceTypeName(i).equals("font")) {
                    string = null;
                    if (string != null && (typefaceCreate = Typeface.create(string, 0)) != Typeface.DEFAULT) {
                        typefaceCreate2 = Typeface.create(typefaceCreate, this.d);
                    }
                } else {
                    try {
                        XmlResourceParser xml = resources.getXml(i);
                        while (xml.getEventType() != 1) {
                            if (xml.getEventType() == 2 && xml.getName().equals("font-family")) {
                                TypedArray typedArrayObtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xml), kui.b);
                                string = typedArrayObtainAttributes.getString(7);
                                typedArrayObtainAttributes.recycle();
                                break;
                            }
                            xml.next();
                        }
                    } catch (Throwable unused) {
                    }
                    string = null;
                    if (string != null) {
                        typefaceCreate2 = Typeface.create(typefaceCreate, this.d);
                    }
                }
            }
            if (typefaceCreate2 == null) {
                return false;
            }
            typefaceE = typefaceCreate2;
        }
        this.m = typefaceE;
        this.o = true;
        return true;
    }

    public final Typeface a() {
        g();
        return this.m;
    }

    public final void b(Context context, eeqd eeqdVar) {
        if (!h(context)) {
            g();
        }
        int i = this.n;
        if (i == 0) {
            this.o = true;
            i = 0;
        }
        if (this.o) {
            eeqdVar.b(this.m, true);
            return;
        }
        try {
            kyy.d(context, i, new eeqa(this, eeqdVar));
        } catch (Resources.NotFoundException unused) {
            this.o = true;
            eeqdVar.a(1);
        } catch (Exception e) {
            Log.d("TextAppearance", "Error loading font ".concat(String.valueOf(this.b)), e);
            this.o = true;
            eeqdVar.a(-3);
        }
    }

    public final void c(Context context, TextPaint textPaint, eeqd eeqdVar) {
        d(context, textPaint, eeqdVar);
        ColorStateList colorStateList = this.k;
        textPaint.setColor(colorStateList != null ? colorStateList.getColorForState(textPaint.drawableState, colorStateList.getDefaultColor()) : -16777216);
        float f = this.h;
        float f2 = this.f;
        float f3 = this.g;
        ColorStateList colorStateList2 = this.a;
        textPaint.setShadowLayer(f, f2, f3, colorStateList2 != null ? colorStateList2.getColorForState(textPaint.drawableState, colorStateList2.getDefaultColor()) : 0);
    }

    public final void d(Context context, TextPaint textPaint, eeqd eeqdVar) {
        Typeface typeface;
        if (h(context) && this.o && (typeface = this.m) != null) {
            e(context, textPaint, typeface);
        } else {
            e(context, textPaint, a());
            b(context, new eeqb(this, context, textPaint, eeqdVar));
        }
    }

    public final void e(Context context, TextPaint textPaint, Typeface typeface) {
        Typeface typefaceA = eeqe.a(context.getResources().getConfiguration(), typeface);
        if (typefaceA != null) {
            typeface = typefaceA;
        }
        textPaint.setTypeface(typeface);
        int i = (~typeface.getStyle()) & this.d;
        textPaint.setFakeBoldText(1 == (i & 1));
        textPaint.setTextSkewX((i & 2) != 0 ? -0.25f : 0.0f);
        textPaint.setTextSize(this.l);
        textPaint.setFontVariationSettings(this.c);
        if (this.i) {
            textPaint.setLetterSpacing(this.j);
        }
    }
}
