package defpackage;

import android.graphics.Typeface;
import android.os.Handler;
import android.os.Looper;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class kyw {
    public static Handler e() {
        return new Handler(Looper.getMainLooper());
    }

    public abstract void a(int i);

    public abstract void b(Typeface typeface);

    public final void c(final int i) {
        e().post(new Runnable() { // from class: kyv
            @Override // java.lang.Runnable
            public final void run() {
                this.a.a(i);
            }
        });
    }

    public final void d(final Typeface typeface) {
        e().post(new Runnable() { // from class: kyu
            @Override // java.lang.Runnable
            public final void run() {
                this.a.b(typeface);
            }
        });
    }
}
