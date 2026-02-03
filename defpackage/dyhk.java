package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class dyhk {
    public static dyhj f(Drawable drawable) {
        dyfa dyfaVar = new dyfa();
        dyfaVar.a = drawable;
        dyfaVar.b(-1);
        dyfaVar.c(false);
        return dyfaVar;
    }

    public static dyhk g(Drawable drawable) {
        dyhj dyhjVarF = f(drawable);
        dyhjVarF.c(true);
        return dyhjVarF.d();
    }

    public abstract int a();

    public abstract Drawable b();

    public abstract ejwi c();

    public abstract boolean d();

    public final Drawable e(Context context, int i) {
        Drawable drawableB = b() != null ? b() : ku.a(context, a());
        if (d()) {
            dyqw.c(drawableB, i);
        }
        return drawableB;
    }
}
