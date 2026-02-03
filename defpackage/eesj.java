package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eesj {
    public static final eeru a = new eesf(0.5f);
    public final eerv b;
    public final eerv c;
    public final eerv d;
    public final eerv e;
    public final eeru f;
    public final eeru g;
    public final eeru h;
    public final eeru i;
    final eerx j;
    final eerx k;
    final eerx l;
    final eerx m;

    public eesj() {
        this.b = new eesg();
        this.c = new eesg();
        this.d = new eesg();
        this.e = new eesg();
        this.f = new eerr(0.0f);
        this.g = new eerr(0.0f);
        this.h = new eerr(0.0f);
        this.i = new eerr(0.0f);
        this.j = new eerx();
        this.k = new eerx();
        this.l = new eerx();
        this.m = new eerx();
    }

    public static eeru a(TypedArray typedArray, int i, eeru eeruVar) {
        TypedValue typedValuePeekValue = typedArray.peekValue(i);
        if (typedValuePeekValue != null) {
            if (typedValuePeekValue.type == 5) {
                return new eerr(TypedValue.complexToDimensionPixelSize(typedValuePeekValue.data, typedArray.getResources().getDisplayMetrics()));
            }
            if (typedValuePeekValue.type == 6) {
                return new eesf(typedValuePeekValue.getFraction(1.0f, 1.0f));
            }
        }
        return eeruVar;
    }

    public static eesh b(Context context, int i, int i2) {
        return i(context, i, i2, new eerr(0.0f));
    }

    public static eesh c(Context context, AttributeSet attributeSet, int i, int i2, eeru eeruVar) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, eese.a, i, i2);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0);
        int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(1, 0);
        typedArrayObtainStyledAttributes.recycle();
        return i(context, resourceId, resourceId2, eeruVar);
    }

    public static eesh h(Context context, AttributeSet attributeSet, int i, int i2) {
        return c(context, attributeSet, i, i2, new eerr(0.0f));
    }

    private static eesh i(Context context, int i, int i2, eeru eeruVar) {
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, i);
        if (i2 != 0) {
            contextThemeWrapper = new ContextThemeWrapper(contextThemeWrapper, i2);
        }
        TypedArray typedArrayObtainStyledAttributes = contextThemeWrapper.obtainStyledAttributes(eese.b);
        try {
            int i3 = typedArrayObtainStyledAttributes.getInt(0, 0);
            int i4 = typedArrayObtainStyledAttributes.getInt(3, i3);
            int i5 = typedArrayObtainStyledAttributes.getInt(4, i3);
            int i6 = typedArrayObtainStyledAttributes.getInt(2, i3);
            int i7 = typedArrayObtainStyledAttributes.getInt(1, i3);
            eeru eeruVarA = a(typedArrayObtainStyledAttributes, 5, eeruVar);
            eeru eeruVarA2 = a(typedArrayObtainStyledAttributes, 8, eeruVarA);
            eeru eeruVarA3 = a(typedArrayObtainStyledAttributes, 9, eeruVarA);
            eeru eeruVarA4 = a(typedArrayObtainStyledAttributes, 7, eeruVarA);
            eeru eeruVarA5 = a(typedArrayObtainStyledAttributes, 6, eeruVarA);
            eesh eeshVar = new eesh();
            eeshVar.e(eesd.a(i4));
            eeshVar.e = eeruVarA2;
            eeshVar.g(eesd.a(i5));
            eeshVar.f = eeruVarA3;
            eeshVar.c(eesd.a(i6));
            eeshVar.g = eeruVarA4;
            eeshVar.a(eesd.a(i7));
            eeshVar.h = eeruVarA5;
            return eeshVar;
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public final eesj d(float f) {
        eesh eeshVar = new eesh(this);
        eeshVar.i(f);
        return new eesj(eeshVar);
    }

    public final eesj e(eesi eesiVar) {
        eesh eeshVar = new eesh(this);
        eeshVar.e = eesiVar.a(this.f);
        eeshVar.f = eesiVar.a(this.g);
        eeshVar.h = eesiVar.a(this.i);
        eeshVar.g = eesiVar.a(this.h);
        return new eesj(eeshVar);
    }

    public final boolean f() {
        return (this.c instanceof eesg) && (this.b instanceof eesg) && (this.d instanceof eesg) && (this.e instanceof eesg);
    }

    public final boolean g(RectF rectF) {
        boolean z = this.m.getClass().equals(eerx.class) && this.k.getClass().equals(eerx.class) && this.j.getClass().equals(eerx.class) && this.l.getClass().equals(eerx.class);
        float fA = this.f.a(rectF);
        return z && ((this.g.a(rectF) > fA ? 1 : (this.g.a(rectF) == fA ? 0 : -1)) == 0 && (this.i.a(rectF) > fA ? 1 : (this.i.a(rectF) == fA ? 0 : -1)) == 0 && (this.h.a(rectF) > fA ? 1 : (this.h.a(rectF) == fA ? 0 : -1)) == 0) && f();
    }

    public final String toString() {
        eeru eeruVar = this.i;
        eeru eeruVar2 = this.h;
        eeru eeruVar3 = this.g;
        return "[" + String.valueOf(this.f) + ", " + String.valueOf(eeruVar3) + ", " + String.valueOf(eeruVar2) + ", " + String.valueOf(eeruVar) + "]";
    }

    public eesj(eesh eeshVar) {
        this.b = eeshVar.a;
        this.c = eeshVar.b;
        this.d = eeshVar.c;
        this.e = eeshVar.d;
        this.f = eeshVar.e;
        this.g = eeshVar.f;
        this.h = eeshVar.g;
        this.i = eeshVar.h;
        this.j = eeshVar.i;
        this.k = eeshVar.j;
        this.l = eeshVar.k;
        this.m = eeshVar.l;
    }
}
