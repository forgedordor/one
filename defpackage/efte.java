package defpackage;

import android.util.Log;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class efte {
    private final String a;

    public efte(Class cls) {
        this(cls.getSimpleName());
    }

    public final void a(String str) {
        if (Log.isLoggable("SetupLibrary", 3)) {
            Log.d("SetupLibrary", this.a.concat(str));
        }
    }

    public final void b(String str) {
        if (Log.isLoggable("SetupLibrary", 4)) {
            Log.i("SetupLibrary", this.a.concat(str));
        }
    }

    public final void c(String str) {
        if (Log.isLoggable("SetupLibrary", 2)) {
            Log.v("SetupLibrary", this.a.concat(str));
        }
    }

    public final void d(String str) {
        Log.e("SetupLibrary", this.a.concat(str));
    }

    public final void e(String str, Throwable th) {
        Log.e("SetupLibrary", this.a.concat(str), th);
    }

    public final void f(String str) {
        Log.w("SetupLibrary", this.a.concat(str));
    }

    public efte(String str) {
        this.a = a.a(str, "[", "] ");
    }
}
