package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.Window;
import android.widget.LinearLayout;
import com.google.android.apps.messaging.R;
import com.google.android.setupcompat.view.StatusBarBackgroundLayout;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class efsz implements efsy {
    private final efrl a;
    private StatusBarBackgroundLayout b;
    private LinearLayout c;
    private final View d;

    public efsz(efrl efrlVar, Window window, AttributeSet attributeSet, int i) throws Resources.NotFoundException {
        this.a = efrlVar;
        View viewG = efrlVar.g(R.id.suc_layout_status);
        if (viewG == null) {
            throw new NullPointerException("sucLayoutStatus cannot be null in StatusBarMixin");
        }
        if (viewG instanceof StatusBarBackgroundLayout) {
            this.b = (StatusBarBackgroundLayout) viewG;
        } else {
            this.c = (LinearLayout) viewG;
        }
        View decorView = window.getDecorView();
        this.d = decorView;
        window.setStatusBarColor(0);
        TypedArray typedArrayObtainStyledAttributes = efrlVar.getContext().obtainStyledAttributes(attributeSet, efrm.e, i, 0);
        boolean zL = typedArrayObtainStyledAttributes.getBoolean(0, (decorView.getSystemUiVisibility() & 8192) == 8192);
        if (efrlVar.e()) {
            Context context = efrlVar.getContext();
            zL = efsj.h(context).l(context, efsh.CONFIG_LIGHT_STATUS_BAR, false);
        }
        if (zL) {
            decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 8192);
        } else {
            decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() & (-8193));
        }
        a(typedArrayObtainStyledAttributes.getDrawable(1));
        typedArrayObtainStyledAttributes.recycle();
    }

    public final void a(Drawable drawable) {
        efrl efrlVar = this.a;
        if (efrlVar.e() && !efrlVar.f()) {
            Context context = efrlVar.getContext();
            drawable = efsj.h(context).f(context, efsh.CONFIG_STATUS_BAR_BACKGROUND);
        }
        StatusBarBackgroundLayout statusBarBackgroundLayout = this.b;
        if (statusBarBackgroundLayout == null) {
            this.c.setBackgroundDrawable(drawable);
            return;
        }
        statusBarBackgroundLayout.a = drawable;
        statusBarBackgroundLayout.setWillNotDraw(drawable == null);
        statusBarBackgroundLayout.setFitsSystemWindows(drawable != null);
        statusBarBackgroundLayout.invalidate();
    }
}
