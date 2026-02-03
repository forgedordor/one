package defpackage;

import androidx.window.extensions.WindowExtensionsProvider;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class prn {
    public static final /* synthetic */ int a = 0;

    static {
        int i = fdcj.a;
        new fdbi(prn.class).c();
    }

    private prn() {
    }

    public static final int a() {
        try {
            return WindowExtensionsProvider.getWindowExtensions().getVendorApiLevel();
        } catch (NoClassDefFoundError | UnsupportedOperationException unused) {
            return 0;
        }
    }
}
