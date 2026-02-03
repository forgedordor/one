package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eexv {
    private static eeyt a;

    public static synchronized eeyt a(Context context) {
        if (a == null) {
            a = new eeyt(new eeyc(efaa.a(context)));
        }
        return a;
    }
}
