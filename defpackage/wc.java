package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.ViewGroup;

/* compiled from: PG */
/* loaded from: classes.dex */
public class wc extends ViewGroup.MarginLayoutParams {
    public wv c;
    public final Rect d;
    public boolean e;
    boolean f;

    public wc(int i, int i2) {
        super(i, i2);
        this.d = new Rect();
        this.e = true;
        this.f = false;
    }

    public final int a() {
        return this.c.gl();
    }

    public final boolean b() {
        return this.c.y();
    }

    public final boolean c() {
        return this.c.v();
    }

    public wc(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.d = new Rect();
        this.e = true;
        this.f = false;
    }

    public wc(wc wcVar) {
        super((ViewGroup.LayoutParams) wcVar);
        this.d = new Rect();
        this.e = true;
        this.f = false;
    }

    public wc(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
        this.d = new Rect();
        this.e = true;
        this.f = false;
    }

    public wc(ViewGroup.MarginLayoutParams marginLayoutParams) {
        super(marginLayoutParams);
        this.d = new Rect();
        this.e = true;
        this.f = false;
    }
}
