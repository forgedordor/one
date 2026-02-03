package defpackage;

import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class rtu extends rud implements ruj {
    private Animatable c;

    public rtu(ImageView imageView) {
        super(imageView);
    }

    private final void p(Object obj) {
        if (!(obj instanceof Animatable)) {
            this.c = null;
            return;
        }
        Animatable animatable = (Animatable) obj;
        this.c = animatable;
        animatable.start();
    }

    private final void q(Object obj) {
        i(obj);
        p(obj);
    }

    @Override // defpackage.rtn, defpackage.rua
    public final void a(Drawable drawable) {
        q(null);
        k(drawable);
    }

    @Override // defpackage.rua
    public final void b(Object obj, ruk rukVar) {
        if (rukVar == null || !rukVar.a(obj, this)) {
            q(obj);
        } else {
            p(obj);
        }
    }

    @Override // defpackage.rtn, defpackage.rua
    public final void e(Drawable drawable) {
        this.b.c();
        Animatable animatable = this.c;
        if (animatable != null) {
            animatable.stop();
        }
        q(null);
        k(drawable);
    }

    @Override // defpackage.rtn, defpackage.rua
    public final void f(Drawable drawable) {
        q(null);
        k(drawable);
    }

    protected abstract void i(Object obj);

    @Override // defpackage.ruj
    public final Drawable j() {
        return ((ImageView) this.a).getDrawable();
    }

    @Override // defpackage.ruj
    public final void k(Drawable drawable) {
        ((ImageView) this.a).setImageDrawable(drawable);
    }

    @Override // defpackage.rtn, defpackage.rrx
    public final void n() {
        Animatable animatable = this.c;
        if (animatable != null) {
            animatable.start();
        }
    }

    @Override // defpackage.rtn, defpackage.rrx
    public final void o() {
        Animatable animatable = this.c;
        if (animatable != null) {
            animatable.stop();
        }
    }
}
