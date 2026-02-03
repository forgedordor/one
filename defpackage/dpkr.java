package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.WindowInsets;
import com.google.android.apps.messaging.R;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dpkr implements ViewTreeObserver.OnGlobalLayoutListener, View.OnApplyWindowInsetsListener {
    public static final ekrg a = ekrg.c("com/google/android/libraries/compose/ui/keyboard/detector/KeyboardLayoutListener");
    public final Activity b;
    public final View c;
    public final int d;
    public final Rect e;
    public int f;
    public int g;
    public dpje h;
    private final dngc i;
    private final Map j;

    public dpkr(Activity activity, dngc dngcVar, View view) throws Resources.NotFoundException {
        int dimensionPixelSize = view.getResources().getDimensionPixelSize(R.dimen.minimum_keyboard_height);
        this.b = activity;
        this.i = dngcVar;
        this.c = view;
        this.d = dimensionPixelSize;
        this.e = new Rect();
        this.j = new LinkedHashMap();
    }

    public final dpko a() {
        Integer numValueOf = Integer.valueOf(this.c.getResources().getConfiguration().orientation);
        Map map = this.j;
        Object obj = map.get(numValueOf);
        if (obj == null) {
            dpko dpkoVar = new dpko(this.d);
            map.put(numValueOf, dpkoVar);
            obj = dpkoVar;
        }
        return (dpko) obj;
    }

    @Override // android.view.View.OnApplyWindowInsetsListener
    public final WindowInsets onApplyWindowInsets(View view, final WindowInsets windowInsets) {
        view.getClass();
        windowInsets.getClass();
        return (WindowInsets) this.i.f("KeyboardLayoutListener#onApplyWindowInsets", new fdae() { // from class: dpkq
            @Override // defpackage.fdae
            public final Object invoke() {
                dpje dpjeVar;
                ekrd ekrdVar = (ekrd) dpkr.a.h().h("com/google/android/libraries/compose/ui/keyboard/detector/KeyboardLayoutListener", "onApplyWindowInsets$lambda$2", 127, "KeyboardLayoutListener.kt");
                WindowInsets windowInsets2 = windowInsets;
                ekrdVar.r("onApplyWindowInsets: System window bottom inset is now %d", windowInsets2.getSystemWindowInsetBottom());
                int systemWindowInsetBottom = windowInsets2.getSystemWindowInsetBottom();
                dpkr dpkrVar = this;
                int i = dpkrVar.d;
                if (systemWindowInsetBottom > i) {
                    dpje dpjeVar2 = dpkrVar.h;
                    if (dpjeVar2 != null) {
                        dpjeVar2.b(dpjd.a);
                        return windowInsets2;
                    }
                } else if (dpkrVar.f < i && (dpjeVar = dpkrVar.h) != null) {
                    dpjeVar.b(dpjd.d);
                }
                return windowInsets2;
            }
        });
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        this.i.f("KeyboardLayoutListener#onGlobalLayout", new fdae() { // from class: dpkp
            @Override // defpackage.fdae
            public final Object invoke() {
                dpje dpjeVar;
                int dimensionPixelSize;
                dpkr dpkrVar = this.a;
                View view = dpkrVar.c;
                int i = view.getResources().getConfiguration().orientation;
                if (i != dpkrVar.g) {
                    dpkrVar.e.set(0, 0, 0, 0);
                }
                dpkrVar.g = i;
                Rect rect = dpkrVar.e;
                int iHeight = rect.height();
                view.getWindowVisibleDisplayFrame(rect);
                int iHeight2 = rect.height();
                ((ekrd) dpkr.a.h().h("com/google/android/libraries/compose/ui/keyboard/detector/KeyboardLayoutListener", "onGlobalLayout$lambda$0", 66, "KeyboardLayoutListener.kt")).u("onGlobalLayout: Height from %d to %d", iHeight, iHeight2);
                if (iHeight != iHeight2) {
                    dpko dpkoVarA = dpkrVar.a();
                    int i2 = dpkoVarA.b;
                    if (iHeight2 > i2) {
                        dpkoVarA.b = iHeight2;
                        i2 = iHeight2;
                    }
                    Integer numValueOf = Integer.valueOf(i2 - iHeight2);
                    if (numValueOf.intValue() < dpkoVarA.a) {
                        numValueOf = null;
                    }
                    int iIntValue = numValueOf != null ? numValueOf.intValue() : 0;
                    dpkrVar.f = iIntValue;
                    boolean zIsInMultiWindowMode = dpkrVar.b.isInMultiWindowMode();
                    if (iHeight == 0 && !zIsInMultiWindowMode) {
                        Context context = view.getContext();
                        context.getClass();
                        int i3 = dpgx.c(context).y;
                        if (Build.VERSION.SDK_INT > 29) {
                            dimensionPixelSize = view.getRootWindowInsets().getInsets(WindowInsets.Type.statusBars()).top;
                        } else {
                            Context context2 = view.getContext();
                            context2.getClass();
                            int identifier = context2.getResources().getIdentifier("status_bar_height", "dimen", "android");
                            dimensionPixelSize = identifier > 0 ? context2.getResources().getDimensionPixelSize(identifier) : 0;
                        }
                        int i4 = i3 - dimensionPixelSize;
                        iIntValue = i4 - iHeight2;
                        if (iIntValue >= dpkrVar.d) {
                            dpkrVar.a().b = i4;
                        }
                    }
                    boolean z = iIntValue >= dpkrVar.d;
                    dpje dpjeVar2 = dpkrVar.h;
                    if (dpjeVar2 != null) {
                        dpjeVar2.b(z ? dpjd.a : dpjd.d);
                    }
                    if (z && (dpjeVar = dpkrVar.h) != null) {
                        dpjeVar.a(iIntValue);
                    }
                }
                return fctx.a;
            }
        });
    }
}
