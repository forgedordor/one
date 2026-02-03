package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.samsung.appbar.ExpandableAppBarView;
import com.google.android.material.appbar.AppBarLayout;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aidv {
    static final /* synthetic */ fdeh[] a;
    public final ExpandableAppBarView b;
    public boolean c;
    public AppBarLayout d;
    public final int e;
    public View f;
    private final fdcz g;

    static {
        fdbv fdbvVar = new fdbv(aidv.class, "isTallEnough", "isTallEnough()Z", 0);
        int i = fdcj.a;
        a = new fdeh[]{fdbvVar};
    }

    public aidv(ExpandableAppBarView expandableAppBarView, TypedArray typedArray) {
        this.b = expandableAppBarView;
        int resourceId = -1;
        if (typedArray != null) {
            int[] iArr = aied.a;
            resourceId = typedArray.getResourceId(32, -1);
        }
        this.e = resourceId;
        this.g = new aidu(true, this);
    }

    public final void a() {
        int i;
        if (this.c) {
            DisplayMetrics displayMetrics = new DisplayMetrics();
            ExpandableAppBarView expandableAppBarView = this.b;
            expandableAppBarView.getDisplay().getMetrics(displayMetrics);
            int i2 = displayMetrics.heightPixels;
            boolean z = i2 >= ((int) TypedValue.applyDimension(1, 580.0f, displayMetrics));
            fdcz fdczVar = this.g;
            fdeh[] fdehVarArr = a;
            fdczVar.d(fdehVarArr[0], Boolean.valueOf(z));
            ViewGroup.LayoutParams layoutParams = expandableAppBarView.getLayoutParams();
            if (((Boolean) fdczVar.c(fdehVarArr[0])).booleanValue()) {
                Context context = expandableAppBarView.getContext();
                int i3 = dakm.a;
                i = (int) (i2 * (true != context.getResources().getBoolean(R.bool.is_large_screen_device) ? 0.39f : 0.19f));
            } else {
                i = -2;
            }
            layoutParams.height = i;
            expandableAppBarView.requestLayout();
        }
    }
}
