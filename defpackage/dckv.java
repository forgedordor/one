package defpackage;

import android.util.Log;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dckv {
    private final String a;

    public dckv(String str) {
        dclh.c(str.length() <= 23, "tag \"%s\" is longer than the %d character maximum", str, 23);
        this.a = str;
    }

    public final boolean a(int i) {
        return Log.isLoggable(this.a, i);
    }

    public final void b(String str) {
        if (a(4)) {
            Log.i("ParentalControlsClient", str);
        }
    }
}
