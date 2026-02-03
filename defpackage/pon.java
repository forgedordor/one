package defpackage;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;

/* compiled from: PG */
/* loaded from: classes.dex */
final class pon extends Drawable.ConstantState {
    int a;
    pom b;
    ColorStateList c;
    PorterDuff.Mode d;
    boolean e;
    Bitmap f;
    ColorStateList g;
    PorterDuff.Mode h;
    int i;
    boolean j;
    boolean k;
    Paint l;

    public pon() {
        this.c = null;
        this.d = pop.a;
        this.b = new pom();
    }

    public final void a(int i, int i2) {
        this.f.eraseColor(0);
        Canvas canvas = new Canvas(this.f);
        pom pomVar = this.b;
        pomVar.a(pomVar.d, pom.a, canvas, i, i2);
    }

    public final boolean b() {
        pom pomVar = this.b;
        if (pomVar.k == null) {
            pomVar.k = Boolean.valueOf(pomVar.d.b());
        }
        return pomVar.k.booleanValue();
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public int getChangingConfigurations() {
        return this.a;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        return new pop(this);
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources) {
        return new pop(this);
    }

    public pon(pon ponVar) {
        this.c = null;
        this.d = pop.a;
        if (ponVar != null) {
            this.a = ponVar.a;
            this.b = new pom(ponVar.b);
            Paint paint = ponVar.b.c;
            if (paint != null) {
                this.b.c = new Paint(paint);
            }
            Paint paint2 = ponVar.b.b;
            if (paint2 != null) {
                this.b.b = new Paint(paint2);
            }
            this.c = ponVar.c;
            this.d = ponVar.d;
            this.e = ponVar.e;
        }
    }
}
