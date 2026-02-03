package defpackage;

import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class rrf implements rrh {
    private final rii a;
    private final rrh b;
    private final rrh c;

    public rrf(rii riiVar, rrh rrhVar, rrh rrhVar2) {
        this.a = riiVar;
        this.b = rrhVar;
        this.c = rrhVar2;
    }

    @Override // defpackage.rrh
    public final rhy a(rhy rhyVar, rex rexVar) {
        Drawable drawable = (Drawable) rhyVar.c();
        if (drawable instanceof BitmapDrawable) {
            return this.b.a(rnr.f(((BitmapDrawable) drawable).getBitmap(), this.a), rexVar);
        }
        if (drawable instanceof rqs) {
            return this.c.a(rhyVar, rexVar);
        }
        return null;
    }
}
