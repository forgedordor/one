package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.apps.messaging.R;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

/* compiled from: PG */
/* loaded from: classes5.dex */
public class eefa extends kb {
    private FrameLayout a;
    public BottomSheetBehavior c;
    public FrameLayout d;
    boolean e;
    public boolean f;
    public boolean g;
    public eeez h;
    private CoordinatorLayout i;
    private boolean j;
    private eemy k;
    private eeep l;

    public eefa(Context context) {
        this(context, 0);
        d();
    }

    private final View b(int i, View view, ViewGroup.LayoutParams layoutParams) throws Resources.NotFoundException {
        k();
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) this.a.findViewById(R.id.coordinator);
        if (i != 0 && view == null) {
            view = getLayoutInflater().inflate(i, (ViewGroup) coordinatorLayout, false);
        }
        if (this.j) {
            FrameLayout frameLayout = this.a;
            eeeu eeeuVar = new eeeu(this);
            int[] iArr = ley.a;
            len.k(frameLayout, eeeuVar);
        }
        this.d.removeAllViews();
        if (layoutParams == null) {
            this.d.addView(view);
        } else {
            this.d.addView(view, layoutParams);
        }
        coordinatorLayout.findViewById(R.id.touch_outside).setOnClickListener(new eeev(this));
        ley.p(this.d, new eeew(this));
        this.d.setOnTouchListener(new eeex());
        return this.a;
    }

    private final void d() {
        TypedArray typedArrayObtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(new int[]{R.attr.enableEdgeToEdge});
        this.j = typedArrayObtainStyledAttributes.getBoolean(0, false);
        typedArrayObtainStyledAttributes.recycle();
    }

    private final void j() {
        eemy eemyVar = this.k;
        if (eemyVar == null) {
            return;
        }
        if (this.e) {
            eemyVar.a();
        } else {
            eemyVar.b();
        }
    }

    private final void k() throws Resources.NotFoundException {
        if (this.a == null) {
            FrameLayout frameLayout = (FrameLayout) View.inflate(getContext(), R.layout.design_bottom_sheet_dialog, null);
            this.a = frameLayout;
            this.i = (CoordinatorLayout) frameLayout.findViewById(R.id.coordinator);
            FrameLayout frameLayout2 = (FrameLayout) this.a.findViewById(R.id.design_bottom_sheet);
            this.d = frameLayout2;
            BottomSheetBehavior bottomSheetBehaviorV = BottomSheetBehavior.v(frameLayout2);
            this.c = bottomSheetBehaviorV;
            bottomSheetBehaviorV.w(this.l);
            this.c.C(this.e);
            this.k = new eemy(this.c, this.d);
        }
    }

    public final BottomSheetBehavior a() throws Resources.NotFoundException {
        if (this.c == null) {
            k();
        }
        return this.c;
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void cancel() {
        a();
        super.cancel();
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        Window window = getWindow();
        if (window != null) {
            boolean z = false;
            if (this.j && Color.alpha(window.getNavigationBarColor()) < 255) {
                z = true;
            }
            boolean z2 = !z;
            FrameLayout frameLayout = this.a;
            if (frameLayout != null) {
                frameLayout.setFitsSystemWindows(z2);
            }
            CoordinatorLayout coordinatorLayout = this.i;
            if (coordinatorLayout != null) {
                coordinatorLayout.setFitsSystemWindows(z2);
            }
            lfq.a(window, z2);
            eeez eeezVar = this.h;
            if (eeezVar != null) {
                eeezVar.d(window);
            }
        }
        j();
    }

    @Override // defpackage.kb, defpackage.abk, android.app.Dialog
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Window window = getWindow();
        if (window != null) {
            window.setStatusBarColor(0);
            window.addFlags(Integer.MIN_VALUE);
            window.setLayout(-1, -1);
        }
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onDetachedFromWindow() {
        eeez eeezVar = this.h;
        if (eeezVar != null) {
            eeezVar.d(null);
        }
        eemy eemyVar = this.k;
        if (eemyVar != null) {
            eemyVar.b();
        }
    }

    @Override // defpackage.abk, android.app.Dialog
    protected void onStart() throws Resources.NotFoundException {
        super.onStart();
        BottomSheetBehavior bottomSheetBehavior = this.c;
        if (bottomSheetBehavior == null || bottomSheetBehavior.x != 5) {
            return;
        }
        bottomSheetBehavior.E(4);
    }

    @Override // android.app.Dialog
    public final void setCancelable(boolean z) throws Resources.NotFoundException {
        super.setCancelable(z);
        if (this.e != z) {
            this.e = z;
            BottomSheetBehavior bottomSheetBehavior = this.c;
            if (bottomSheetBehavior != null) {
                bottomSheetBehavior.C(z);
            }
            if (getWindow() != null) {
                j();
            }
        }
    }

    @Override // android.app.Dialog
    public final void setCanceledOnTouchOutside(boolean z) {
        super.setCanceledOnTouchOutside(z);
        if (z && !this.e) {
            this.e = true;
        }
        this.f = z;
        this.g = true;
    }

    @Override // defpackage.kb, defpackage.abk, android.app.Dialog
    public final void setContentView(int i) {
        super.setContentView(b(i, null, null));
    }

    @Override // defpackage.kb, defpackage.abk, android.app.Dialog
    public final void setContentView(View view) {
        super.setContentView(b(0, view, null));
    }

    public eefa(Context context, int i) {
        if (i == 0) {
            TypedValue typedValue = new TypedValue();
            i = context.getTheme().resolveAttribute(R.attr.bottomSheetDialogTheme, typedValue, true) ? typedValue.resourceId : R.style.Theme_Design_Light_BottomSheetDialog;
        }
        super(context, i);
        this.e = true;
        this.f = true;
        this.l = new eeey(this);
        g();
        d();
    }

    @Override // defpackage.kb, defpackage.abk, android.app.Dialog
    public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        super.setContentView(b(0, view, layoutParams));
    }
}
