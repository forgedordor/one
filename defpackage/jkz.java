package defpackage;

import android.app.Activity;
import android.graphics.Rect;
import android.view.WindowManager;

/* compiled from: PG */
/* loaded from: classes.dex */
final class jkz implements jkv {
    public static final jkz a = new jkz();

    private jkz() {
    }

    @Override // defpackage.jkv
    public final Rect a(Activity activity) {
        return ((WindowManager) activity.getSystemService(WindowManager.class)).getCurrentWindowMetrics().getBounds();
    }
}
