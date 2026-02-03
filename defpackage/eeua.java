package defpackage;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.Display;
import android.view.ViewGroup;
import android.view.WindowManager;
import com.google.android.material.snackbar.BaseTransientBottomBar;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eeua implements Runnable {
    final /* synthetic */ BaseTransientBottomBar a;

    public eeua(BaseTransientBottomBar baseTransientBottomBar) {
        this.a = baseTransientBottomBar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Context context;
        Rect rect;
        BaseTransientBottomBar baseTransientBottomBar = this.a;
        eeul eeulVar = baseTransientBottomBar.j;
        if (eeulVar == null || (context = baseTransientBottomBar.i) == null) {
            return;
        }
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        if (Build.VERSION.SDK_INT >= 30) {
            rect = windowManager.getCurrentWindowMetrics().getBounds();
        } else {
            Display defaultDisplay = windowManager.getDefaultDisplay();
            Point point = new Point();
            defaultDisplay.getRealSize(point);
            rect = new Rect();
            rect.right = point.x;
            rect.bottom = point.y;
        }
        int iHeight = rect.height();
        int[] iArr = new int[2];
        eeulVar.getLocationInWindow(iArr);
        int height = iHeight - (iArr[1] + eeulVar.getHeight());
        int translationY = (int) eeulVar.getTranslationY();
        int i = baseTransientBottomBar.p;
        int i2 = height + translationY;
        if (i2 >= i) {
            baseTransientBottomBar.q = i;
            return;
        }
        ViewGroup.LayoutParams layoutParams = eeulVar.getLayoutParams();
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            Log.w(BaseTransientBottomBar.b, "Unable to apply gesture inset because layout params are not MarginLayoutParams");
            return;
        }
        baseTransientBottomBar.q = baseTransientBottomBar.p;
        ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin += baseTransientBottomBar.p - i2;
        eeulVar.requestLayout();
    }
}
