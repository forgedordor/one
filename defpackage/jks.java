package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build;
import androidx.compose.ui.platform.AndroidComposeView;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jks {
    public static final int a(Context context) {
        Resources resources = context.getResources();
        int identifier = resources.getIdentifier("navigation_bar_height", "dimen", "android");
        if (identifier > 0) {
            return resources.getDimensionPixelSize(identifier);
        }
        return 0;
    }

    public static final long b(AndroidComposeView androidComposeView) {
        Activity activity;
        long jRound;
        int iRound;
        Context context = androidComposeView.getContext();
        Context baseContext = context;
        while (true) {
            if (!(baseContext instanceof Activity)) {
                if (!(baseContext instanceof ContextWrapper)) {
                    activity = null;
                    break;
                }
                baseContext = ((ContextWrapper) baseContext).getBaseContext();
            } else {
                activity = (Activity) baseContext;
                break;
            }
        }
        if (activity != null) {
            Rect rectA = (Build.VERSION.SDK_INT >= 30 ? jkz.a : Build.VERSION.SDK_INT >= 29 ? jky.a : Build.VERSION.SDK_INT >= 28 ? jkx.a : jkw.a).a(activity);
            int iWidth = rectA.width();
            iRound = rectA.height();
            jRound = iWidth << 32;
        } else {
            Configuration configuration = context.getResources().getConfiguration();
            jRound = Math.round(configuration.screenWidthDp * r7) << 32;
            iRound = Math.round(configuration.screenHeightDp * context.getResources().getDisplayMetrics().density);
        }
        return (4294967295L & iRound) | jRound;
    }
}
