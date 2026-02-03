package defpackage;

import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.os.Build;
import android.util.TypedValue;
import android.view.View;
import android.view.Window;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eeji extends iu {
    public final Rect b;
    private Drawable c;

    public eeji(Context context) {
        this(context, 0);
    }

    private static int x(Context context) {
        TypedValue typedValueB = eepx.b(context, R.attr.materialAlertDialogTheme);
        if (typedValueB == null) {
            return 0;
        }
        return typedValueB.data;
    }

    @Override // defpackage.iu
    public final iv create() {
        iv ivVarCreate = super.create();
        Window window = ivVarCreate.getWindow();
        View decorView = window.getDecorView();
        Drawable drawable = this.c;
        if (drawable instanceof eesc) {
            ((eesc) drawable).O(decorView.getElevation());
        }
        Drawable drawable2 = this.c;
        Rect rect = this.b;
        window.setBackgroundDrawable(new InsetDrawable(drawable2, rect.left, rect.top, rect.right, rect.bottom));
        decorView.setOnTouchListener(new eejh(ivVarCreate, rect));
        return ivVarCreate;
    }

    public final void i(boolean z) {
        this.a.n = z;
    }

    public final void j(Drawable drawable) {
        super.b(drawable);
    }

    public final void k(int i) {
        ir irVar = this.a;
        irVar.g = irVar.a.getText(i);
    }

    public final void l(CharSequence charSequence) {
        super.c(charSequence);
    }

    public final void m(int i, DialogInterface.OnClickListener onClickListener) {
        super.setNegativeButton(i, onClickListener);
    }

    public final void n(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
        super.f(charSequence, onClickListener);
    }

    public final void o(DialogInterface.OnClickListener onClickListener) {
        super.d(R.string.clear_custom_smsc_dialog_button, onClickListener);
    }

    public final void p(DialogInterface.OnCancelListener onCancelListener) {
        this.a.o = onCancelListener;
    }

    public final void q(DialogInterface.OnDismissListener onDismissListener) {
        this.a.p = onDismissListener;
    }

    public final void r(int i, DialogInterface.OnClickListener onClickListener) {
        super.setPositiveButton(i, onClickListener);
    }

    public final void s(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
        super.g(charSequence, onClickListener);
    }

    @Override // defpackage.iu
    public final /* synthetic */ iu setNegativeButton(int i, DialogInterface.OnClickListener onClickListener) {
        super.setNegativeButton(i, onClickListener);
        return this;
    }

    @Override // defpackage.iu
    public final /* synthetic */ iu setPositiveButton(int i, DialogInterface.OnClickListener onClickListener) {
        super.setPositiveButton(i, onClickListener);
        return this;
    }

    @Override // defpackage.iu
    public final /* synthetic */ iu setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        return this;
    }

    @Override // defpackage.iu
    public final /* synthetic */ iu setView(View view) {
        super.setView(view);
        return this;
    }

    public final void t(CharSequence[] charSequenceArr, int i, DialogInterface.OnClickListener onClickListener) {
        super.h(charSequenceArr, i, onClickListener);
    }

    public final void u(int i) {
        super.e(i);
    }

    public final void v(CharSequence charSequence) {
        super.setTitle(charSequence);
    }

    public final void w(View view) {
        super.setView(view);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public eeji(Context context, int i) {
        int iX = x(context);
        Context contextA = eexh.a(context, null, R.attr.alertDialogStyle, R.style.MaterialAlertDialog_MaterialComponents);
        super(iX != 0 ? new aer(contextA, iX) : contextA, i == 0 ? x(context) : i);
        Context context2 = getContext();
        Resources.Theme theme = context2.getTheme();
        int[] iArr = eejj.a;
        TypedArray typedArrayA = eemh.a(context2, null, iArr, R.attr.alertDialogStyle, R.style.MaterialAlertDialog_MaterialComponents, new int[0]);
        int dimensionPixelSize = typedArrayA.getDimensionPixelSize(2, context2.getResources().getDimensionPixelSize(R.dimen.mtrl_alert_dialog_background_inset_start));
        int dimensionPixelSize2 = typedArrayA.getDimensionPixelSize(3, context2.getResources().getDimensionPixelSize(R.dimen.mtrl_alert_dialog_background_inset_top));
        int dimensionPixelSize3 = typedArrayA.getDimensionPixelSize(1, context2.getResources().getDimensionPixelSize(R.dimen.mtrl_alert_dialog_background_inset_end));
        int dimensionPixelSize4 = typedArrayA.getDimensionPixelSize(0, context2.getResources().getDimensionPixelSize(R.dimen.mtrl_alert_dialog_background_inset_bottom));
        typedArrayA.recycle();
        int layoutDirection = context2.getResources().getConfiguration().getLayoutDirection();
        this.b = new Rect(layoutDirection == 1 ? dimensionPixelSize3 : dimensionPixelSize, dimensionPixelSize2, layoutDirection != 1 ? dimensionPixelSize3 : dimensionPixelSize, dimensionPixelSize4);
        int iD = eehg.d(context2, R.attr.colorSurface, getClass().getCanonicalName());
        TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(null, iArr, R.attr.alertDialogStyle, R.style.MaterialAlertDialog_MaterialComponents);
        int color = typedArrayObtainStyledAttributes.getColor(4, iD);
        typedArrayObtainStyledAttributes.recycle();
        eesc eescVar = new eesc(context2, null, R.attr.alertDialogStyle, R.style.MaterialAlertDialog_MaterialComponents);
        eescVar.L(context2);
        eescVar.P(ColorStateList.valueOf(color));
        if (Build.VERSION.SDK_INT >= 28) {
            TypedValue typedValue = new TypedValue();
            theme.resolveAttribute(android.R.attr.dialogCornerRadius, typedValue, true);
            float dimension = typedValue.getDimension(getContext().getResources().getDisplayMetrics());
            if (typedValue.type == 5 && dimension >= 0.0f) {
                eescVar.M(dimension);
            }
        }
        this.c = eescVar;
    }
}
