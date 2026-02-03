package defpackage;

import android.graphics.Typeface;

/* compiled from: PG */
/* loaded from: classes.dex */
final class lam implements Runnable {
    final /* synthetic */ lbe a;
    final /* synthetic */ Typeface b;

    public lam(lbe lbeVar, Typeface typeface) {
        this.a = lbeVar;
        this.b = typeface;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.b(this.b);
    }
}
