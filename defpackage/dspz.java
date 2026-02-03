package defpackage;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowInsets;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.core.widget.NestedScrollView;
import com.google.android.apps.messaging.R;
import com.google.android.libraries.internal.growth.growthkit.internal.ui.impl.gm.dialogs.MaxDimensionsLinearLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dspz implements dsog {
    private int a;
    private final Context b;
    private final dxxd c;

    public dspz(Context context, dxxd dxxdVar) {
        this.b = context;
        this.c = dxxdVar;
    }

    public static int c(Activity activity, Configuration configuration, int i) {
        return configuration != null ? dxuy.b(activity.getResources().getDisplayMetrics(), configuration.screenHeightDp) : i;
    }

    public static int d(Activity activity, Configuration configuration, int i) {
        return configuration != null ? dxuy.b(activity.getResources().getDisplayMetrics(), configuration.screenWidthDp) : i;
    }

    public static final int f(Activity activity, boolean z, int i) throws Resources.NotFoundException {
        int i2;
        WindowInsets rootWindowInsets;
        int stableInsetBottom;
        if (z) {
            int dimensionPixelOffset = activity.getResources().getDimensionPixelOffset(R.dimen.growthkit_bottom_sheet_top_margin);
            if (dxuh.c()) {
                stableInsetBottom = activity.getWindowManager().getCurrentWindowMetrics().getWindowInsets().getInsetsIgnoringVisibility(WindowInsets.Type.navigationBars() | WindowInsets.Type.displayCutout()).bottom;
            } else {
                View viewFindViewById = activity.findViewById(android.R.id.content);
                stableInsetBottom = (viewFindViewById == null || (rootWindowInsets = viewFindViewById.getRootWindowInsets()) == null) ? 0 : rootWindowInsets.getStableInsetBottom();
            }
            i2 = dimensionPixelOffset + stableInsetBottom;
        } else {
            int dimensionPixelOffset2 = activity.getResources().getDimensionPixelOffset(R.dimen.growthkit_dialog_margin);
            i2 = dimensionPixelOffset2 + dimensionPixelOffset2;
        }
        return i - i2;
    }

    /* JADX WARN: Removed duplicated region for block: B:85:0x01b8 A[Catch: dsph -> 0x0327, TryCatch #0 {dsph -> 0x0327, blocks: (B:43:0x00c7, B:45:0x00cf, B:46:0x00d1, B:47:0x00db, B:49:0x00e1, B:51:0x00ed, B:58:0x010c, B:83:0x01a6, B:85:0x01b8, B:86:0x01bc, B:56:0x00fd, B:62:0x011a, B:68:0x014b, B:67:0x012a, B:69:0x015a, B:71:0x0164, B:72:0x0166, B:74:0x016c, B:76:0x017c, B:77:0x017e, B:79:0x0198, B:81:0x019c, B:82:0x019e, B:78:0x018c, B:88:0x01c7, B:90:0x01de, B:91:0x01e0, B:93:0x01e7, B:95:0x01fa, B:97:0x0202, B:98:0x0204, B:102:0x0210, B:105:0x0221, B:112:0x024e, B:116:0x0256, B:118:0x026f, B:119:0x0285, B:121:0x028f, B:122:0x0291, B:124:0x0295, B:125:0x0297, B:127:0x02a2, B:128:0x02a4, B:130:0x02af, B:131:0x02b1, B:133:0x02bc, B:137:0x02d0, B:139:0x02d5, B:140:0x02db, B:142:0x02e5, B:143:0x02e7, B:145:0x02ec, B:110:0x022b, B:111:0x0245, B:94:0x01f1), top: B:153:0x00c7 }] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01bc A[Catch: dsph -> 0x0327, TryCatch #0 {dsph -> 0x0327, blocks: (B:43:0x00c7, B:45:0x00cf, B:46:0x00d1, B:47:0x00db, B:49:0x00e1, B:51:0x00ed, B:58:0x010c, B:83:0x01a6, B:85:0x01b8, B:86:0x01bc, B:56:0x00fd, B:62:0x011a, B:68:0x014b, B:67:0x012a, B:69:0x015a, B:71:0x0164, B:72:0x0166, B:74:0x016c, B:76:0x017c, B:77:0x017e, B:79:0x0198, B:81:0x019c, B:82:0x019e, B:78:0x018c, B:88:0x01c7, B:90:0x01de, B:91:0x01e0, B:93:0x01e7, B:95:0x01fa, B:97:0x0202, B:98:0x0204, B:102:0x0210, B:105:0x0221, B:112:0x024e, B:116:0x0256, B:118:0x026f, B:119:0x0285, B:121:0x028f, B:122:0x0291, B:124:0x0295, B:125:0x0297, B:127:0x02a2, B:128:0x02a4, B:130:0x02af, B:131:0x02b1, B:133:0x02bc, B:137:0x02d0, B:139:0x02d5, B:140:0x02db, B:142:0x02e5, B:143:0x02e7, B:145:0x02ec, B:110:0x022b, B:111:0x0245, B:94:0x01f1), top: B:153:0x00c7 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final android.view.View g(android.app.Activity r21, defpackage.etnj r22, defpackage.etns r23, defpackage.etly r24, java.util.List r25) throws android.content.res.Resources.NotFoundException {
        /*
            Method dump skipped, instructions count: 808
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dspz.g(android.app.Activity, etnj, etns, etly, java.util.List):android.view.View");
    }

    private final void h(final Activity activity, final Dialog dialog, final Configuration configuration, final etly etlyVar, final View view) throws Resources.NotFoundException {
        final View viewFindViewById = activity.findViewById(android.R.id.content);
        int height = viewFindViewById.getHeight();
        int width = viewFindViewById.getWidth();
        if (height == 0) {
            viewFindViewById.post(new Runnable() { // from class: dspw
                @Override // java.lang.Runnable
                public final void run() throws Resources.NotFoundException {
                    Activity activity2 = activity;
                    Configuration configuration2 = configuration;
                    View view2 = viewFindViewById;
                    this.a.e(dialog, etlyVar, activity2, view, dspz.d(activity2, configuration2, view2.getWidth()), dspz.c(activity2, configuration2, view2.getHeight()));
                }
            });
        } else {
            e(dialog, etlyVar, activity, view, d(activity, configuration, width), c(activity, configuration, height));
        }
    }

    private static void i(boolean z, LinearLayout linearLayout, int i) {
        int i2 = 0;
        while (i2 < linearLayout.getChildCount()) {
            View childAt = linearLayout.getChildAt(i2);
            boolean z2 = i2 == linearLayout.getChildCount() + (-1);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) childAt.getLayoutParams();
            marginLayoutParams.setMarginEnd((z || z2) ? 0 : i);
            marginLayoutParams.setMarginStart(0);
            marginLayoutParams.topMargin = 0;
            marginLayoutParams.bottomMargin = (!z || z2) ? 0 : i;
            i2++;
        }
    }

    private static void j(LinearLayout linearLayout, int i) {
        i(true, linearLayout, i);
    }

    private static void k(View view, int i) {
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) view.getLayoutParams();
        layoutParams.gravity = i;
        view.setLayoutParams(layoutParams);
    }

    private static final etly l(etnj etnjVar) {
        int i = etnjVar.c;
        if (i == 2) {
            return (etly) etnjVar.d;
        }
        if (i != 6) {
            throw new IllegalArgumentException("PromoUi can't be built using a DialogBuilder.");
        }
        etly etlyVar = ((etna) etnjVar.d).d;
        return etlyVar == null ? etly.a : etlyVar;
    }

    private static final boolean m(etly etlyVar) {
        int iA;
        return ((etlyVar.b & 128) == 0 || (iA = etlt.a(etlyVar.l)) == 0 || iA != 3) ? false : true;
    }

    private static final void n(ViewGroup viewGroup, boolean z) {
        NestedScrollView nestedScrollView = (NestedScrollView) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.gm_dialog_scrollview, viewGroup, false);
        nestedScrollView.setScrollbarFadingEnabled(true);
        LinearLayout linearLayout = new LinearLayout(viewGroup.getContext());
        linearLayout.setOrientation(1);
        if (z) {
            View viewFindViewById = viewGroup.findViewById(R.id.gm_dialog_image);
            ViewGroup viewGroup2 = (ViewGroup) viewGroup.findViewById(R.id.gm_dialog_content);
            View viewFindViewById2 = viewGroup.findViewById(R.id.gm_dialog_button_pane);
            viewFindViewById2.setPadding(viewGroup2.getPaddingLeft(), 0, viewGroup2.getPaddingRight(), viewGroup2.getPaddingBottom());
            viewGroup2.removeView(viewFindViewById2);
            viewGroup2.setPadding(viewGroup2.getPaddingLeft(), viewGroup2.getPaddingTop(), viewGroup2.getPaddingRight(), 0);
            viewGroup.removeView(viewFindViewById);
            viewGroup.removeView(viewGroup2);
            linearLayout.addView(viewFindViewById);
            linearLayout.addView(viewGroup2);
            viewGroup.addView(viewFindViewById2);
        } else {
            View viewFindViewById3 = viewGroup.findViewById(R.id.gm_dialog_title);
            View viewFindViewById4 = viewGroup.findViewById(R.id.gm_dialog_body);
            viewGroup.removeView(viewFindViewById3);
            viewGroup.removeView(viewFindViewById4);
            linearLayout.addView(viewFindViewById3);
            linearLayout.addView(viewFindViewById4);
        }
        nestedScrollView.addView(linearLayout, new FrameLayout.LayoutParams(-1, -2));
        viewGroup.addView(nestedScrollView, 0, new LinearLayout.LayoutParams(-1, 0, 1.0f));
    }

    private static final FrameLayout o(View view) {
        FrameLayout frameLayout = new FrameLayout(view.getContext());
        frameLayout.addView(view, new FrameLayout.LayoutParams(-1, -2, 1));
        return frameLayout;
    }

    @Override // defpackage.dsog
    public final dsoh a(final Activity activity, etnj etnjVar, etns etnsVar, final Runnable runnable) throws Resources.NotFoundException {
        Dialog dialog;
        ArrayList arrayList = new ArrayList();
        etly etlyVarL = l(etnjVar);
        View viewG = g(activity, etnjVar, etnsVar, etlyVarL, arrayList);
        if (viewG == null) {
            return null;
        }
        int iA = etlv.a(etlyVarL.m);
        if (iA == 0) {
            iA = 1;
        }
        int i = iA - 1;
        if (i == 4) {
            kb kbVar = new kb(activity, R.style.Theme_GrowthKit_Dialog);
            Window window = kbVar.getWindow();
            Context context = this.b;
            window.setBackgroundDrawable(context.getDrawable(R.drawable.gm_dialog_full_background));
            View decorView = kbVar.getWindow().getDecorView();
            float dimension = context.getResources().getDimension(R.dimen.growthkit_dialog_elevation);
            int[] iArr = ley.a;
            len.j(decorView, dimension);
            kbVar.setContentView(viewG);
            kbVar.setCanceledOnTouchOutside(false);
            kbVar.setOnShowListener(new DialogInterface.OnShowListener() { // from class: dspx
                @Override // android.content.DialogInterface.OnShowListener
                public final void onShow(DialogInterface dialogInterface) {
                    runnable.run();
                }
            });
            dialog = kbVar;
        } else {
            if (i != 6) {
                return null;
            }
            final eefa eefaVar = new eefa(activity, R.style.Theme_GrowthKit_BottomSheetDialog);
            eefaVar.setContentView(o(viewG));
            eefaVar.setOnShowListener(new DialogInterface.OnShowListener() { // from class: dspy
                @Override // android.content.DialogInterface.OnShowListener
                public final void onShow(DialogInterface dialogInterface) throws Resources.NotFoundException {
                    BottomSheetBehavior bottomSheetBehaviorV = BottomSheetBehavior.v(eefaVar.findViewById(R.id.design_bottom_sheet));
                    Activity activity2 = activity;
                    bottomSheetBehaviorV.D(dspz.f(activity2, true, activity2.findViewById(android.R.id.content).getHeight()));
                    bottomSheetBehaviorV.E(3);
                    bottomSheetBehaviorV.v = true;
                    bottomSheetBehaviorV.C(true);
                    runnable.run();
                }
            });
            dialog = eefaVar;
        }
        Dialog dialog2 = dialog;
        h(activity, dialog2, null, etlyVarL, viewG);
        return new dsoh(dialog2, arrayList);
    }

    @Override // defpackage.dsog
    public final dsoh b(Activity activity, Dialog dialog, etnj etnjVar, etns etnsVar, Configuration configuration) throws Resources.NotFoundException {
        ArrayList arrayList;
        etly etlyVarL;
        View viewG;
        if (activity == null || dialog == null || (viewG = g(activity, etnjVar, etnsVar, (etlyVarL = l(etnjVar)), (arrayList = new ArrayList()))) == null) {
            return null;
        }
        if (dialog instanceof eefa) {
            dialog.setContentView(o(viewG));
        } else {
            dialog.setContentView(viewG);
        }
        h(activity, dialog, configuration, etlyVarL, viewG);
        return new dsoh(dialog, arrayList);
    }

    public final void e(Dialog dialog, etly etlyVar, Activity activity, View view, int i, int i2) throws Resources.NotFoundException {
        int iMin;
        int i3;
        int iA;
        boolean zM = m(etlyVar);
        MaxDimensionsLinearLayout maxDimensionsLinearLayout = (MaxDimensionsLinearLayout) view.findViewById(R.id.gm_dialog_container);
        boolean z = dialog instanceof eefa;
        int iF = f(activity, z, i2);
        maxDimensionsLinearLayout.a = iF;
        maxDimensionsLinearLayout.requestLayout();
        float f = i;
        if (z) {
            iMin = (int) (Math.min((int) (f / r3), 640) * activity.getResources().getDisplayMetrics().density);
        } else {
            DisplayMetrics displayMetrics = activity.getResources().getDisplayMetrics();
            displayMetrics.getClass();
            float f2 = f / displayMetrics.density;
            int i4 = (f2 < 600.0f ? 1 : f2 < 840.0f ? 2 : 3) - 1;
            int dimensionPixelOffset = i4 != 1 ? i4 != 2 ? activity.getResources().getDimensionPixelOffset(R.dimen.growthkit_dialog_width_compact) : activity.getResources().getDimensionPixelOffset(R.dimen.growthkit_dialog_width_expanded) : activity.getResources().getDimensionPixelOffset(R.dimen.growthkit_dialog_width_medium);
            int dimensionPixelOffset2 = activity.getResources().getDimensionPixelOffset(R.dimen.growthkit_dialog_margin);
            iMin = Math.min(dimensionPixelOffset, i - (dimensionPixelOffset2 + dimensionPixelOffset2));
        }
        if (z) {
            maxDimensionsLinearLayout.b = iMin;
            maxDimensionsLinearLayout.requestLayout();
        } else if (dialog.getWindow() != null) {
            WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
            layoutParams.copyFrom(dialog.getWindow().getAttributes());
            layoutParams.width = iMin;
            layoutParams.height = -2;
            dialog.getWindow().setAttributes(layoutParams);
        }
        int dimensionPixelOffset3 = activity.getResources().getDimensionPixelOffset(R.dimen.growthkit_dialog_content_side_padding);
        int i5 = iMin - (dimensionPixelOffset3 + dimensionPixelOffset3);
        ViewGroup viewGroup = (ViewGroup) view.findViewById(R.id.gm_dialog_content);
        LinearLayout linearLayout = (LinearLayout) viewGroup.findViewById(R.id.gm_dialog_button_pane);
        if (linearLayout.getChildCount() > 1 && linearLayout.getOrientation() == 0) {
            linearLayout.measure(View.MeasureSpec.makeMeasureSpec(i5, 0), View.MeasureSpec.makeMeasureSpec(iF, 0));
            if (linearLayout.getMeasuredWidth() > i5) {
                linearLayout.setOrientation(1);
                int childCount = linearLayout.getChildCount();
                View[] viewArr = new View[childCount];
                for (int i6 = 0; i6 < childCount; i6++) {
                    viewArr[i6] = linearLayout.getChildAt(0);
                    linearLayout.removeViewAt(0);
                }
                for (int i7 = 0; i7 < childCount; i7++) {
                    linearLayout.addView(viewArr[i7], 0);
                }
                j(linearLayout, this.a);
                k(linearLayout, 1);
            }
        }
        viewGroup.measure(View.MeasureSpec.makeMeasureSpec(i5, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(iF, 0));
        int measuredHeight = viewGroup.getMeasuredHeight();
        if (!zM) {
            if ((etlyVar.b & 128) == 0 || (iA = etlt.a(etlyVar.l)) == 0 || iA != 2) {
                i3 = 0;
            } else {
                int dimensionPixelOffset4 = this.b.getResources().getDimensionPixelOffset(R.dimen.growthkit_gm3_dialog_icon_padding);
                viewGroup.setPadding(viewGroup.getPaddingLeft(), viewGroup.getPaddingTop() + dimensionPixelOffset4, viewGroup.getPaddingRight(), viewGroup.getPaddingBottom());
                i3 = ((ViewGroup.MarginLayoutParams) viewGroup.getLayoutParams()).topMargin + dimensionPixelOffset4;
            }
            if (measuredHeight + i3 > iF) {
                n(viewGroup, false);
                return;
            }
            return;
        }
        LinearLayout linearLayout2 = (LinearLayout) viewGroup.findViewById(R.id.gm_dialog_button_pane);
        linearLayout2.measure(View.MeasureSpec.makeMeasureSpec(i5, 0), View.MeasureSpec.makeMeasureSpec(iF, 0));
        int measuredHeight2 = linearLayout2.getMeasuredHeight();
        ImageView imageView = (ImageView) view.findViewById(R.id.gm_dialog_image);
        int i8 = iF - measuredHeight;
        int dimensionPixelOffset5 = imageView.getContext().getResources().getDimensionPixelOffset(R.dimen.growthkit_dialog_large_image_min_height);
        if (i8 >= dimensionPixelOffset5) {
            imageView.setMaxHeight(i8);
        } else {
            imageView.setMaxHeight(Math.max(dimensionPixelOffset5, (int) ((iF - measuredHeight2) * 0.5d)));
            n(maxDimensionsLinearLayout, true);
        }
    }
}
