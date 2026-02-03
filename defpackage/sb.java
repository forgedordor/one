package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.TextView;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.WeakHashMap;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class sb {
    public Typeface b;
    public boolean c;
    private final TextView d;
    private yv e;
    private yv f;
    private yv g;
    private yv h;
    private yv i;
    private yv j;
    private final sj k;
    public int a = 0;
    private int l = -1;
    private String m = null;

    public sb(TextView textView) {
        this.d = textView;
        this.k = new sj(textView);
    }

    public static void f(TextView textView, Typeface typeface, int i) {
        cub cubVar = rz.a;
        String fontVariationSettings = textView.getFontVariationSettings();
        if (!TextUtils.isEmpty(fontVariationSettings)) {
            rz.b(textView, null);
        }
        textView.setTypeface(typeface, i);
        if (TextUtils.isEmpty(fontVariationSettings)) {
            return;
        }
        rz.b(textView, fontVariationSettings);
    }

    public static final void r(TextView textView, InputConnection inputConnection, EditorInfo editorInfo) {
        if (Build.VERSION.SDK_INT >= 30 || inputConnection == null) {
            return;
        }
        lhu.a(editorInfo, textView.getText());
    }

    private static yv s(Context context, qu quVar, int i) {
        ColorStateList colorStateListA = quVar.a(context, i);
        if (colorStateListA == null) {
            return null;
        }
        yv yvVar = new yv();
        yvVar.d = true;
        yvVar.a = colorStateListA;
        return yvVar;
    }

    private final void t(Drawable drawable, yv yvVar) {
        if (drawable == null || yvVar == null) {
            return;
        }
        xa.h(drawable, yvVar, this.d.getDrawableState());
    }

    private final void u(boolean z) {
        Typeface typeface = this.b;
        if (typeface != null) {
            if (this.l == -1) {
                this.d.setTypeface(typeface, this.a);
            } else {
                this.d.setTypeface(typeface);
            }
        } else if (z) {
            this.d.setTypeface(null);
        }
        String str = this.m;
        if (str != null) {
            rz.b(this.d, str);
        }
    }

    private final boolean v(Context context, yx yxVar) {
        String strN;
        int i;
        Typeface typeface;
        Typeface typeface2;
        int[] iArr = kt.a;
        this.a = yxVar.c(2, this.a);
        if (Build.VERSION.SDK_INT >= 28) {
            int iC = yxVar.c(11, -1);
            this.l = iC;
            if (iC != -1) {
                this.a &= 2;
            }
        }
        if (yxVar.q(13)) {
            this.m = yxVar.n(13);
        }
        if (!yxVar.q(10) && !yxVar.q(12)) {
            if (!yxVar.q(1)) {
                if (Build.VERSION.SDK_INT < 28 || (i = this.l) == -1 || (typeface = this.b) == null) {
                    return false;
                }
                this.b = Typeface.create(typeface, i, (2 & this.a) != 0);
                return true;
            }
            this.c = false;
            int iC2 = yxVar.c(1, 1);
            if (iC2 == 1) {
                typeface2 = Typeface.SANS_SERIF;
            } else {
                if (iC2 != 2) {
                    if (iC2 == 3) {
                        typeface2 = Typeface.MONOSPACE;
                    }
                    return true;
                }
                typeface2 = Typeface.SERIF;
            }
            this.b = typeface2;
            return true;
        }
        Typeface typefaceE = null;
        this.b = null;
        int i2 = true == yxVar.q(12) ? 12 : 10;
        int i3 = this.l;
        int i4 = this.a;
        if (!context.isRestricted()) {
            rw rwVar = new rw(this, i3, i4, new WeakReference(this.d));
            try {
                int i5 = this.a;
                int resourceId = yxVar.b.getResourceId(i2, 0);
                if (resourceId != 0) {
                    if (yxVar.c == null) {
                        yxVar.c = new TypedValue();
                    }
                    Context context2 = yxVar.a;
                    TypedValue typedValue = yxVar.c;
                    WeakHashMap weakHashMap = kyy.a;
                    if (!context2.isRestricted()) {
                        typefaceE = kyy.e(context2, resourceId, typedValue, i5, rwVar, true, false);
                    }
                }
                if (typefaceE != null) {
                    if (Build.VERSION.SDK_INT < 28 || this.l == -1) {
                        this.b = typefaceE;
                    } else {
                        this.b = Typeface.create(Typeface.create(typefaceE, 0), this.l, (this.a & 2) != 0);
                    }
                }
                this.c = this.b == null;
            } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
            }
        }
        if (this.b == null && (strN = yxVar.n(i2)) != null) {
            if (Build.VERSION.SDK_INT < 28 || this.l == -1) {
                this.b = Typeface.create(strN, this.a);
            } else {
                this.b = Typeface.create(Typeface.create(strN, 0), this.l, (2 & this.a) != 0);
            }
        }
        return true;
    }

    public final int a() {
        return this.k.a();
    }

    public final int b() {
        return this.k.b();
    }

    public final int c() {
        return this.k.c();
    }

    public final int d() {
        return this.k.a;
    }

    public final void e() {
        if (this.e != null || this.f != null || this.g != null || this.h != null) {
            Drawable[] compoundDrawables = this.d.getCompoundDrawables();
            t(compoundDrawables[0], this.e);
            t(compoundDrawables[1], this.f);
            t(compoundDrawables[2], this.g);
            t(compoundDrawables[3], this.h);
        }
        if (this.i == null && this.j == null) {
            return;
        }
        Drawable[] compoundDrawablesRelative = this.d.getCompoundDrawablesRelative();
        t(compoundDrawablesRelative[0], this.i);
        t(compoundDrawablesRelative[2], this.j);
    }

    public final void g() {
        this.k.e();
    }

    /* JADX WARN: Removed duplicated region for block: B:164:0x02ba  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x02bc  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x02e3  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x02f3  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0313  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0336  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x033f  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x0344  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x034b  */
    /* JADX WARN: Removed duplicated region for block: B:206:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void h(android.util.AttributeSet r26, int r27) {
        /*
            Method dump skipped, instructions count: 854
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sb.h(android.util.AttributeSet, int):void");
    }

    public final void i(Context context, int i) {
        yx yxVarJ = yx.j(context, i, kt.z);
        if (yxVarJ.q(14)) {
            j(yxVarJ.p(14, false));
        }
        if (yxVarJ.q(0) && yxVarJ.b(0, -1) == 0) {
            this.d.setTextSize(0, 0.0f);
        }
        boolean zV = v(context, yxVarJ);
        yxVarJ.o();
        u(zV);
    }

    final void j(boolean z) {
        this.d.setAllCaps(z);
    }

    public final void k(int i, int i2, int i3, int i4) {
        sj sjVar = this.k;
        if (sjVar.k()) {
            DisplayMetrics displayMetrics = sjVar.i.getResources().getDisplayMetrics();
            sjVar.g(TypedValue.applyDimension(i4, i, displayMetrics), TypedValue.applyDimension(i4, i2, displayMetrics), TypedValue.applyDimension(i4, i3, displayMetrics));
            if (sjVar.i()) {
                sjVar.e();
            }
        }
    }

    public final void l(int[] iArr, int i) {
        sj sjVar = this.k;
        if (sjVar.k()) {
            int length = iArr.length;
            if (length > 0) {
                int[] iArrCopyOf = new int[length];
                if (i == 0) {
                    iArrCopyOf = Arrays.copyOf(iArr, length);
                } else {
                    DisplayMetrics displayMetrics = sjVar.i.getResources().getDisplayMetrics();
                    for (int i2 = 0; i2 < length; i2++) {
                        iArrCopyOf[i2] = Math.round(TypedValue.applyDimension(i, iArr[i2], displayMetrics));
                    }
                }
                sjVar.f = sj.l(iArrCopyOf);
                if (!sjVar.j()) {
                    throw new IllegalArgumentException("None of the preset sizes is valid: ".concat(String.valueOf(Arrays.toString(iArr))));
                }
            } else {
                sjVar.g = false;
            }
            if (sjVar.i()) {
                sjVar.e();
            }
        }
    }

    public final void m(int i) {
        sj sjVar = this.k;
        if (sjVar.k()) {
            if (i == 0) {
                sjVar.a = 0;
                sjVar.d = -1.0f;
                sjVar.e = -1.0f;
                sjVar.c = -1.0f;
                sjVar.f = new int[0];
                sjVar.b = false;
                return;
            }
            if (i != 1) {
                throw new IllegalArgumentException(a.g(i, "Unknown auto-size text type: "));
            }
            DisplayMetrics displayMetrics = sjVar.i.getResources().getDisplayMetrics();
            sjVar.g(TypedValue.applyDimension(2, 12.0f, displayMetrics), TypedValue.applyDimension(2, 112.0f, displayMetrics), 1.0f);
            if (sjVar.i()) {
                sjVar.e();
            }
        }
    }

    public final void n(int i, float f) {
        if (zy.c || o()) {
            return;
        }
        this.k.f(i, f);
    }

    public final boolean o() {
        return this.k.h();
    }

    public final int[] p() {
        return this.k.f;
    }

    public final void q() {
        if (zy.c) {
            return;
        }
        g();
    }
}
