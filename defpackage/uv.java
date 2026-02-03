package defpackage;

import android.content.Context;
import android.os.Build;
import android.util.Log;
import android.widget.PopupWindow;
import java.lang.reflect.Method;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class uv extends us implements ut {
    public static Method a;
    public ut b;

    static {
        try {
            if (Build.VERSION.SDK_INT <= 28) {
                a = PopupWindow.class.getDeclaredMethod("setTouchModal", Boolean.TYPE);
            }
        } catch (NoSuchMethodException unused) {
            Log.i("MenuPopupWindow", "Could not find method setTouchModal() on PopupWindow. Oh well.");
        }
    }

    public uv(Context context, int i) {
        super(context, null, i, null);
    }

    @Override // defpackage.us
    public final tm p(Context context, boolean z) {
        uu uuVar = new uu(context, z);
        uuVar.e = this;
        return uuVar;
    }
}
