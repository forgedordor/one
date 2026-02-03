package defpackage;

import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class sgc {
    public static final /* synthetic */ int a = 0;
    private static final fctc b = fctd.b(3, new fdae() { // from class: sgb
        @Override // defpackage.fdae
        public final Object invoke() {
            int i = sgc.a;
            return new Handler(Looper.getMainLooper());
        }
    });

    public static final long a(Drawable drawable) {
        if (drawable.getIntrinsicWidth() < 0 || drawable.getIntrinsicHeight() < 0) {
            return 9205357640488583168L;
        }
        float intrinsicWidth = drawable.getIntrinsicWidth();
        float intrinsicHeight = drawable.getIntrinsicHeight();
        return (Float.floatToRawIntBits(intrinsicWidth) << 32) | (Float.floatToRawIntBits(intrinsicHeight) & 4294967295L);
    }

    public static final Handler b() {
        return (Handler) b.a();
    }
}
