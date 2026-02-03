package defpackage;

import android.os.Build;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class erb {
    public static final era a;

    static {
        String lowerCase = Build.FINGERPRINT.toLowerCase(Locale.ROOT);
        lowerCase.getClass();
        a = fdbq.f(lowerCase, "robolectric") ? new era() : null;
    }
}
