package defpackage;

import android.content.res.ColorStateList;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

/* compiled from: PG */
/* loaded from: classes5.dex */
public class eesa extends Drawable.ConstantState {
    public eesj a;
    eetb b;
    eejp c;
    ColorFilter d;
    ColorStateList e;
    ColorStateList f;
    ColorStateList g;
    ColorStateList h;
    PorterDuff.Mode i;
    public Rect j;
    float k;
    public float l;
    float m;
    int n;
    float o;
    float p;
    float q;
    int r;
    int s;
    int t;
    int u;
    boolean v;
    Paint.Style w;

    public eesa(eesa eesaVar) {
        this.e = null;
        this.f = null;
        this.g = null;
        this.h = null;
        this.i = PorterDuff.Mode.SRC_IN;
        this.j = null;
        this.k = 1.0f;
        this.l = 1.0f;
        this.n = 255;
        this.o = 0.0f;
        this.p = 0.0f;
        this.q = 0.0f;
        this.r = 0;
        this.s = 0;
        this.t = 0;
        this.u = 0;
        this.v = false;
        this.w = Paint.Style.FILL_AND_STROKE;
        this.a = eesaVar.a;
        this.b = eesaVar.b;
        this.c = eesaVar.c;
        this.m = eesaVar.m;
        this.d = eesaVar.d;
        this.e = eesaVar.e;
        this.f = eesaVar.f;
        this.i = eesaVar.i;
        this.h = eesaVar.h;
        this.n = eesaVar.n;
        this.k = eesaVar.k;
        this.t = eesaVar.t;
        this.r = eesaVar.r;
        boolean z = eesaVar.v;
        this.v = false;
        this.l = eesaVar.l;
        this.o = eesaVar.o;
        this.p = eesaVar.p;
        float f = eesaVar.q;
        this.q = 0.0f;
        this.s = eesaVar.s;
        this.u = eesaVar.u;
        ColorStateList colorStateList = eesaVar.g;
        this.g = null;
        this.w = eesaVar.w;
        Rect rect = eesaVar.j;
        if (rect != null) {
            this.j = new Rect(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final int getChangingConfigurations() {
        return 0;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public Drawable newDrawable() {
        eesc eescVar = new eesc(this);
        eescVar.u = true;
        eescVar.v = true;
        return eescVar;
    }

    public eesa(eesj eesjVar) {
        this.e = null;
        this.f = null;
        this.g = null;
        this.h = null;
        this.i = PorterDuff.Mode.SRC_IN;
        this.j = null;
        this.k = 1.0f;
        this.l = 1.0f;
        this.n = 255;
        this.o = 0.0f;
        this.p = 0.0f;
        this.q = 0.0f;
        this.r = 0;
        this.s = 0;
        this.t = 0;
        this.u = 0;
        this.v = false;
        this.w = Paint.Style.FILL_AND_STROKE;
        this.a = eesjVar;
        this.c = null;
    }
}
