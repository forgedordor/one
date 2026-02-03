package defpackage;

import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.TransitionDrawable;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class rug implements ruk {
    private final boolean a;

    public rug(boolean z) {
        this.a = z;
    }

    @Override // defpackage.ruk
    public final /* bridge */ /* synthetic */ boolean a(Object obj, ruj rujVar) {
        Drawable drawable = (Drawable) obj;
        Drawable drawableJ = rujVar.j();
        if (drawableJ == null) {
            drawableJ = new ColorDrawable(0);
        }
        TransitionDrawable transitionDrawable = new TransitionDrawable(new Drawable[]{drawableJ, drawable});
        transitionDrawable.setCrossFadeEnabled(this.a);
        transitionDrawable.startTransition(300);
        rujVar.k(transitionDrawable);
        return true;
    }
}
