package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.os.PersistableBundle;
import android.util.AttributeSet;
import android.util.StateSet;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.Button;
import android.widget.LinearLayout;
import com.google.android.apps.messaging.R;
import com.google.android.material.button.MaterialButton;
import com.google.android.setupcompat.internal.TemplateLayout;
import com.google.android.setupcompat.logging.CustomEvent;
import com.google.android.setupcompat.template.FooterActionButton;
import com.google.android.setupcompat.view.ButtonBarLayout;
import java.util.HashMap;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class efss implements efsy {
    public static final efte a = new efte("FooterBarMixin");
    public final Context b;
    final boolean c;
    final boolean d;
    final boolean e;
    final boolean f;
    public LinearLayout g;
    public efst h;
    public efst i;
    public int j;
    int k;
    int l;
    final int m;
    public String n;
    public String o;
    public int p;
    final int q;
    public final efsg r;
    private final ViewStub s;
    private int t;
    private int u;
    private int v;
    private final int w;
    private final int x;
    private final int y;
    private final int z;

    public efss(TemplateLayout templateLayout, AttributeSet attributeSet, int i) throws Resources.NotFoundException, PackageManager.NameNotFoundException {
        efsg efsgVar = new efsg();
        this.r = efsgVar;
        Context context = templateLayout.getContext();
        this.b = context;
        this.s = (ViewStub) templateLayout.g(R.id.suc_layout_footer);
        efsv.a.clear();
        efrl efrlVar = (efrl) templateLayout;
        this.c = efrlVar.e();
        this.d = efrlVar.d();
        this.e = efrlVar.f();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, efrm.a, i, 0);
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(17, 0);
        this.m = dimensionPixelSize;
        this.u = typedArrayObtainStyledAttributes.getDimensionPixelSize(16, dimensionPixelSize);
        this.v = typedArrayObtainStyledAttributes.getDimensionPixelSize(13, dimensionPixelSize);
        this.k = typedArrayObtainStyledAttributes.getDimensionPixelSize(15, 0);
        this.l = typedArrayObtainStyledAttributes.getDimensionPixelSize(14, 0);
        int color = typedArrayObtainStyledAttributes.getColor(18, 0);
        this.w = color;
        int color2 = typedArrayObtainStyledAttributes.getColor(22, 0);
        this.x = color2;
        this.f = typedArrayObtainStyledAttributes.getBoolean(0, false);
        int color3 = typedArrayObtainStyledAttributes.getColor(21, 0);
        this.y = color3;
        int color4 = typedArrayObtainStyledAttributes.getColor(25, 0);
        this.z = color4;
        typedArrayObtainStyledAttributes.getColor(20, 0);
        typedArrayObtainStyledAttributes.getColor(24, 0);
        this.q = typedArrayObtainStyledAttributes.getDimensionPixelSize(8, 0);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(19, 0);
        int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(23, 0);
        typedArrayObtainStyledAttributes.recycle();
        if (resourceId2 != 0) {
            efst efstVarA = efsu.a(resourceId2, context);
            efrt.b("setSecondaryButton");
            m();
            int i2 = true != efsj.r(context) ? R.style.SucPartnerCustomizationButton_Secondary : R.style.SucGlifMaterialButton_Secondary;
            efsh efshVar = efsh.CONFIG_FOOTER_SECONDARY_BUTTON_BG_COLOR;
            efrq efrqVar = new efrq(l(efstVarA, i2, efshVar), efshVar, efsh.CONFIG_FOOTER_BUTTON_DISABLED_ALPHA, efsh.CONFIG_FOOTER_BUTTON_DISABLED_BG_COLOR, efsh.CONFIG_FOOTER_SECONDARY_BUTTON_DISABLED_TEXT_COLOR, n(efstVarA.a), efsh.CONFIG_FOOTER_SECONDARY_BUTTON_TEXT_COLOR, efsh.CONFIG_FOOTER_SECONDARY_BUTTON_MARGIN_START, efsh.CONFIG_FOOTER_BUTTON_TEXT_SIZE, efsh.CONFIG_FOOTER_BUTTON_MIN_HEIGHT, efsh.CONFIG_FOOTER_BUTTON_FONT_FAMILY, efsh.CONFIG_FOOTER_BUTTON_FONT_WEIGHT, efsh.CONFIG_FOOTER_BUTTON_TEXT_STYLE, efsh.CONFIG_FOOTER_BUTTON_RADIUS, efsh.CONFIG_FOOTER_BUTTON_RIPPLE_COLOR_ALPHA);
            Object objO = o(efstVarA, efrqVar);
            final Button button = (Button) objO;
            this.t = button.getId();
            if (objO instanceof efsx) {
            } else if (button instanceof FooterActionButton) {
                ((FooterActionButton) objO).b = false;
            } else {
                a.d("Set the primary button style error when setting secondary button.");
            }
            this.i = efstVarA;
            f(button, color2);
            p(button, efrqVar);
            if (efsj.r(context)) {
                boolean z = this.i.c;
                efsv.c(button, color4);
            }
            g();
            button.post(new Runnable() { // from class: efsq
                @Override // java.lang.Runnable
                public final void run() {
                    efss efssVar = this.a;
                    Context context2 = efssVar.b;
                    if (efsj.s(context2) && eftd.a(context2)) {
                        if (efssVar.j == 0 || efssVar.b().getVisibility() != 0) {
                            button.requestFocus();
                        }
                    }
                }
            });
            efsgVar.b(true, true);
        }
        if (resourceId != 0) {
            efst efstVarA2 = efsu.a(resourceId, context);
            efrt.b("setPrimaryButton");
            m();
            int i3 = true != efsj.r(context) ? R.style.SucPartnerCustomizationButton_Primary : R.style.SucGlifMaterialButton_Primary;
            efsh efshVar2 = efsh.CONFIG_FOOTER_PRIMARY_BUTTON_BG_COLOR;
            efrq efrqVar2 = new efrq(l(efstVarA2, i3, efshVar2), efshVar2, efsh.CONFIG_FOOTER_BUTTON_DISABLED_ALPHA, efsh.CONFIG_FOOTER_BUTTON_DISABLED_BG_COLOR, efsh.CONFIG_FOOTER_PRIMARY_BUTTON_DISABLED_TEXT_COLOR, n(efstVarA2.a), efsh.CONFIG_FOOTER_PRIMARY_BUTTON_TEXT_COLOR, efsh.CONFIG_FOOTER_PRIMARY_BUTTON_MARGIN_START, efsh.CONFIG_FOOTER_BUTTON_TEXT_SIZE, efsh.CONFIG_FOOTER_BUTTON_MIN_HEIGHT, efsh.CONFIG_FOOTER_BUTTON_FONT_FAMILY, efsh.CONFIG_FOOTER_BUTTON_FONT_WEIGHT, efsh.CONFIG_FOOTER_BUTTON_TEXT_STYLE, efsh.CONFIG_FOOTER_BUTTON_RADIUS, efsh.CONFIG_FOOTER_BUTTON_RIPPLE_COLOR_ALPHA);
            Object objO2 = o(efstVarA2, efrqVar2);
            final Button button2 = (Button) objO2;
            this.j = button2.getId();
            if (objO2 instanceof efsx) {
            } else if (button2 instanceof FooterActionButton) {
                ((FooterActionButton) objO2).b = true;
            } else {
                a.d("Set the primary button style error when setting primary button.");
            }
            this.h = efstVarA2;
            f(button2, color);
            p(button2, efrqVar2);
            if (efsj.r(context)) {
                boolean z2 = this.h.c;
                efsv.c(button2, color3);
            }
            g();
            button2.post(new Runnable() { // from class: efsp
                @Override // java.lang.Runnable
                public final void run() {
                    Context context2 = this.a.b;
                    if (efsj.s(context2) && eftd.a(context2)) {
                        button2.requestFocus();
                    }
                }
            });
            efsgVar.c(true, true);
        }
    }

    public static final boolean k(Button button, Button button2) {
        boolean z = button != null && button.getVisibility() == 0;
        boolean z2 = button2 != null && button2.getVisibility() == 0;
        a.a("isPrimaryVisible=" + z + ", isSecondaryVisible=" + z2);
        return z && z2;
    }

    private final int l(efst efstVar, int i, efsh efshVar) {
        int i2 = efstVar.d;
        if (i2 != 0 && !this.c && !efsj.r(this.b)) {
            i = i2;
        }
        if (!this.c) {
            return i;
        }
        Context context = this.b;
        return efsj.h(context).c(context, efshVar) == 0 ? true != efsj.r(context) ? R.style.SucPartnerCustomizationButton_Secondary : R.style.SucGlifMaterialButton_Secondary : true != efsj.r(context) ? R.style.SucPartnerCustomizationButton_Primary : R.style.SucGlifMaterialButton_Primary;
    }

    private final LinearLayout m() {
        efss efssVar;
        int iA;
        if (this.g == null) {
            ViewStub viewStub = this.s;
            if (viewStub == null) {
                throw new IllegalStateException("Footer stub is not found in this template");
            }
            Context context = this.b;
            viewStub.setLayoutInflater(LayoutInflater.from(new ContextThemeWrapper(context, R.style.SucPartnerCustomizationButtonBar_Stackable)));
            viewStub.setLayoutResource(R.layout.suc_footer_button_bar);
            LinearLayout linearLayout = (LinearLayout) viewStub.inflate();
            this.g = linearLayout;
            if (linearLayout == null) {
                efssVar = this;
            } else {
                linearLayout.setId(View.generateViewId());
                efssVar = this;
                efssVar.q(linearLayout, this.k, this.u, this.l, this.v);
                if (h()) {
                    linearLayout.setGravity(8388629);
                }
            }
            LinearLayout linearLayout2 = efssVar.g;
            if (linearLayout2 != null && efssVar.c) {
                if (!efssVar.e) {
                    linearLayout2.setBackgroundColor(efsj.h(context).c(context, efsh.CONFIG_FOOTER_BAR_BG_COLOR));
                }
                efsj efsjVarH = efsj.h(context);
                efsh efshVar = efsh.CONFIG_FOOTER_BUTTON_PADDING_TOP;
                if (efsjVarH.t(efshVar)) {
                    efssVar.u = (int) efsj.h(context).a(context, efshVar);
                }
                efsj efsjVarH2 = efsj.h(context);
                efsh efshVar2 = efsh.CONFIG_FOOTER_BUTTON_PADDING_BOTTOM;
                if (efsjVarH2.t(efshVar2)) {
                    efssVar.v = (int) efsj.h(context).a(context, efshVar2);
                }
                efsj efsjVarH3 = efsj.h(context);
                efsh efshVar3 = efsh.CONFIG_FOOTER_BAR_PADDING_START;
                if (efsjVarH3.t(efshVar3)) {
                    efssVar.k = (int) efsj.h(context).a(context, efshVar3);
                }
                efsj efsjVarH4 = efsj.h(context);
                efsh efshVar4 = efsh.CONFIG_FOOTER_BAR_PADDING_END;
                if (efsjVarH4.t(efshVar4)) {
                    efssVar.l = (int) efsj.h(context).a(context, efshVar4);
                }
                efssVar.q(linearLayout2, efssVar.k, efssVar.u, efssVar.l, efssVar.v);
                efsj efsjVarH5 = efsj.h(context);
                efsh efshVar5 = efsh.CONFIG_FOOTER_BAR_MIN_HEIGHT;
                if (efsjVarH5.t(efshVar5) && (iA = (int) efsj.h(context).a(context, efshVar5)) > 0) {
                    linearLayout2.setMinimumHeight(iA);
                }
            }
        } else {
            efssVar = this;
        }
        return efssVar.g;
    }

    private static efsh n(int i) {
        switch (i) {
            case 1:
                return efsh.CONFIG_FOOTER_BUTTON_ICON_ADD_ANOTHER;
            case 2:
                return efsh.CONFIG_FOOTER_BUTTON_ICON_CANCEL;
            case 3:
                return efsh.CONFIG_FOOTER_BUTTON_ICON_CLEAR;
            case 4:
                return efsh.CONFIG_FOOTER_BUTTON_ICON_DONE;
            case 5:
                return efsh.CONFIG_FOOTER_BUTTON_ICON_NEXT;
            case 6:
                return efsh.CONFIG_FOOTER_BUTTON_ICON_OPT_IN;
            case 7:
                return efsh.CONFIG_FOOTER_BUTTON_ICON_SKIP;
            case 8:
                return efsh.CONFIG_FOOTER_BUTTON_ICON_STOP;
            default:
                return null;
        }
    }

    private final efsw o(efst efstVar, efrq efrqVar) {
        efsw efsxVar;
        Context context = this.b;
        int i = efrqVar.o;
        if (efsj.r(context)) {
            try {
                efsxVar = i == 2132149538 ? new efsx(new ContextThemeWrapper(context, R.style.SucGlifMaterialButton_Primary), R.attr.sucMaterialButtonStyle) : new efsx(new ContextThemeWrapper(context, i), R.attr.sucMaterialOutlinedButtonStyle);
            } catch (IllegalArgumentException e) {
                a.d("Applyed invalid material theme: ".concat(e.toString()));
                i = i == 2132149538 ? R.style.SucPartnerCustomizationButton_Primary : R.style.SucPartnerCustomizationButton_Secondary;
            }
        } else {
            efsxVar = (efsw) LayoutInflater.from(new ContextThemeWrapper(context, i)).inflate(R.layout.suc_button, (ViewGroup) null, false);
        }
        Button button = (Button) efsxVar;
        button.setId(View.generateViewId());
        button.setText(efstVar.b);
        button.setOnClickListener(efstVar);
        button.setVisibility(0);
        button.setEnabled(true);
        if (efsxVar instanceof efsx) {
            ((efsx) efsxVar).k = efstVar;
        } else if (button instanceof FooterActionButton) {
            ((FooterActionButton) efsxVar).a = efstVar;
        } else {
            a.d("Set the footer button error!");
        }
        button.getId();
        return efsxVar;
    }

    private final void p(Button button, efrq efrqVar) throws Resources.NotFoundException, PackageManager.NameNotFoundException {
        float f;
        boolean z;
        GradientDrawable gradientDrawable;
        if (this.c) {
            Context context = this.b;
            boolean z2 = this.d;
            int id = button.getId();
            int i = this.j;
            efsv.a.put(Integer.valueOf(button.getId()), button.getTextColors());
            if (z2) {
                f = 0.0f;
                z = true;
            } else {
                if (button.isEnabled()) {
                    efsv.d(context, button, efrqVar.f);
                } else {
                    efsv.b(context, button, efrqVar.d);
                }
                efsh efshVar = efrqVar.a;
                efsh efshVar2 = efrqVar.b;
                efsh efshVar3 = efrqVar.c;
                efrt.a(Build.VERSION.SDK_INT >= 29, "Update button background only support on sdk Q or higher");
                int iC = efsj.h(context).c(context, efshVar);
                float fB = efsj.h(context).B(context, efshVar2);
                int iC2 = efsj.h(context).c(context, efshVar3);
                int[] iArr = new int[0];
                if (iC != 0) {
                    if (fB <= 0.0f) {
                        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(new int[]{android.R.attr.disabledAlpha});
                        float f2 = typedArrayObtainStyledAttributes.getFloat(0, 0.26f);
                        typedArrayObtainStyledAttributes.recycle();
                        fB = f2;
                    }
                    if (iC2 == 0) {
                        iC2 = iC;
                    }
                    f = 0.0f;
                    ColorStateList colorStateList = new ColorStateList(new int[][]{new int[]{-16842910}, iArr}, new int[]{efsv.a(iC2, fB), iC});
                    button.getBackground().mutate().setState(new int[0]);
                    button.refreshDrawableState();
                    button.setBackgroundTintList(colorStateList);
                } else {
                    f = 0.0f;
                }
                z = false;
            }
            efsh efshVar4 = efrqVar.f;
            efsh efshVar5 = efrqVar.n;
            int defaultColor = z ? button.getTextColors().getDefaultColor() : efsj.h(context).c(context, efshVar4);
            float fB2 = efsj.h(context).B(context, efshVar5);
            Drawable background = button.getBackground();
            RippleDrawable rippleDrawable = background instanceof InsetDrawable ? (RippleDrawable) ((InsetDrawable) background).getDrawable() : background instanceof RippleDrawable ? (RippleDrawable) background : null;
            if (rippleDrawable != null) {
                int iA = efsv.a(defaultColor, fB2);
                ColorStateList colorStateList2 = new ColorStateList(new int[][]{new int[]{android.R.attr.state_pressed}, new int[]{android.R.attr.state_focused}, StateSet.NOTHING}, new int[]{iA, iA, 0});
                if (efsj.r(context) && (button instanceof efsx)) {
                    ((efsx) button).f(colorStateList2);
                } else {
                    rippleDrawable.setColor(colorStateList2);
                }
            }
            efsh efshVar6 = efrqVar.g;
            ViewGroup.LayoutParams layoutParams = button.getLayoutParams();
            if (efsj.h(context).t(efshVar6) && (layoutParams instanceof ViewGroup.MarginLayoutParams)) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                marginLayoutParams.setMargins((int) efsj.h(context).a(context, efshVar6), marginLayoutParams.topMargin, marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
            }
            float fA = efsj.h(context).a(context, efrqVar.h);
            if (fA > f) {
                button.setTextSize(0, fA);
            }
            efsh efshVar7 = efrqVar.i;
            if (efsj.h(context).t(efshVar7)) {
                float fA2 = efsj.h(context).a(context, efshVar7);
                if (fA2 > f) {
                    button.setMinHeight((int) fA2);
                }
            }
            efsh efshVar8 = efrqVar.j;
            efsh efshVar9 = efrqVar.k;
            efsh efshVar10 = efrqVar.l;
            String strJ = efsj.h(context).j(context, efshVar8);
            int iD = efsj.h(context).t(efshVar10) ? efsj.h(context).d(context, efshVar10, 0) : 0;
            Typeface typefaceCreate = (efsj.p(context) && efsj.h(context).t(efshVar9)) ? Typeface.create(Typeface.create(strJ, iD), efsj.h(context).d(context, efshVar9, 400), false) : Typeface.create(strJ, iD);
            if (typefaceCreate != null) {
                button.setTypeface(typefaceCreate);
            }
            float fA3 = efsj.h(context).a(context, efrqVar.m);
            if (efsj.r(context) && (button instanceof efsx)) {
                efsx efsxVar = (efsx) button;
                int i2 = (int) fA3;
                if (efsxVar.o()) {
                    eefk eefkVar = ((MaterialButton) efsxVar).b;
                    if (!eefkVar.q || eefkVar.i != i2) {
                        eefkVar.i = i2;
                        eefkVar.q = true;
                        eefkVar.d(eefkVar.b.d(i2));
                    }
                }
            } else {
                Drawable background2 = button.getBackground();
                if (background2 instanceof InsetDrawable) {
                    gradientDrawable = (GradientDrawable) ((LayerDrawable) ((InsetDrawable) background2).getDrawable()).getDrawable(0);
                } else if (background2 instanceof RippleDrawable) {
                    RippleDrawable rippleDrawable2 = (RippleDrawable) background2;
                    gradientDrawable = rippleDrawable2.getDrawable(0) instanceof GradientDrawable ? (GradientDrawable) rippleDrawable2.getDrawable(0) : (GradientDrawable) ((InsetDrawable) rippleDrawable2.getDrawable(0)).getDrawable();
                } else {
                    gradientDrawable = null;
                }
                if (gradientDrawable != null) {
                    gradientDrawable.setCornerRadius(fA3);
                }
            }
            efsh efshVar11 = efrqVar.e;
            if (button != null) {
                Drawable drawableF = efshVar11 != null ? efsj.h(context).f(context, efshVar11) : null;
                if (drawableF != null) {
                    drawableF.setBounds(0, 0, drawableF.getIntrinsicWidth(), drawableF.getIntrinsicHeight());
                }
                Drawable drawable = id != i ? null : drawableF;
                if (id == i) {
                    drawableF = null;
                }
                button.setCompoundDrawablesRelative(drawableF, null, drawable, null);
            }
            if (z2) {
                return;
            }
            efsh efshVar12 = efrqVar.d;
            if (button.isEnabled()) {
                efsv.d(context, button, efshVar4);
            } else {
                efsv.b(context, button, efshVar12);
            }
        }
    }

    private final void q(LinearLayout linearLayout, int i, int i2, int i3, int i4) {
        linearLayout.setPadding(i, i2, i3, i4);
        if (efsj.r(this.b)) {
            linearLayout.requestApplyInsets();
        }
    }

    public final PersistableBundle a() {
        a.a("FooterBarMixin fragment name=" + this.n + ", Tag=" + this.o);
        PersistableBundle persistableBundle = new PersistableBundle();
        efsg efsgVar = this.r;
        persistableBundle.putString("PrimaryButtonVisibility", efsgVar.a);
        persistableBundle.putString("SecondaryButtonVisibility", efsgVar.b);
        if (Build.VERSION.SDK_INT >= 29 && efsj.o(this.b)) {
            String str = this.n;
            if (str != null) {
                persistableBundle.putString("HostFragmentName", CustomEvent.c(str));
            }
            String str2 = this.o;
            if (str2 != null) {
                persistableBundle.putString("HostFragmentTag", CustomEvent.c(str2));
            }
        }
        return persistableBundle;
    }

    public final Button b() {
        LinearLayout linearLayout = this.g;
        if (linearLayout == null) {
            return null;
        }
        return (Button) linearLayout.findViewById(this.j);
    }

    public final Button c() {
        LinearLayout linearLayout = this.g;
        if (linearLayout == null) {
            return null;
        }
        return (Button) linearLayout.findViewById(this.t);
    }

    public final Button d() {
        if (!efsj.r(this.b)) {
            a.a("Cannot get tertiary button when glif expressive is not enabled.");
            return null;
        }
        LinearLayout linearLayout = this.g;
        if (linearLayout == null) {
            return null;
        }
        return (Button) linearLayout.findViewById(0);
    }

    public final void e() {
        boolean zI = i();
        boolean zJ = j();
        efsg efsgVar = this.r;
        efsgVar.a = efsg.a(efsgVar.a, zI);
        efsgVar.b = efsg.a(efsgVar.b, zJ);
    }

    protected final void f(Button button, int i) {
        if (!this.d && i != 0) {
            HashMap map = efsv.a;
            button.getBackground().mutate().setColorFilter(i, PorterDuff.Mode.SRC_ATOP);
        }
        this.g.addView(button);
        Button buttonB = b();
        Button buttonC = c();
        int i2 = 0;
        boolean z = buttonB != null && buttonB.getVisibility() == 0;
        boolean z2 = buttonC != null && buttonC.getVisibility() == 0;
        LinearLayout linearLayout = this.g;
        if (linearLayout != null) {
            if (!z && !z2) {
                i2 = 8;
            }
            linearLayout.setVisibility(i2);
        }
    }

    protected final void g() {
        LinearLayout.LayoutParams layoutParams;
        LinearLayout.LayoutParams layoutParams2;
        LinearLayout linearLayoutM = m();
        Button buttonB = b();
        Button buttonC = c();
        View viewD = d();
        linearLayoutM.removeAllViews();
        Context context = this.b;
        int i = context.getResources().getConfiguration().orientation;
        if (efsj.r(context)) {
            int visibility = linearLayoutM.getVisibility();
            this.p = visibility;
            if (visibility == 0) {
                linearLayoutM.setVisibility(4);
            }
        }
        if (buttonC != null) {
            linearLayoutM.addView(buttonC);
        }
        if (!h() && !efsj.r(context)) {
            LinearLayout linearLayoutM2 = m();
            View view = new View(context);
            view.setLayoutParams(new LinearLayout.LayoutParams(0, 0, 1.0f));
            view.setVisibility(4);
            linearLayoutM2.addView(view);
        }
        if (efsj.r(context) && viewD != null) {
            if (k(buttonB, buttonC)) {
                linearLayoutM.addView(viewD);
            } else {
                a.a("Cannot add tertiary button when primary or secondary button is null.");
            }
        }
        if (buttonB != null) {
            linearLayoutM.addView(buttonB);
        }
        if (buttonB != null && (layoutParams2 = (LinearLayout.LayoutParams) buttonB.getLayoutParams()) != null) {
            layoutParams2.width = -2;
            layoutParams2.weight = 0.0f;
            buttonB.setLayoutParams(layoutParams2);
        }
        if (buttonC != null && (layoutParams = (LinearLayout.LayoutParams) buttonC.getLayoutParams()) != null) {
            layoutParams.width = -2;
            layoutParams.weight = 0.0f;
            buttonC.setLayoutParams(layoutParams);
        }
        if (efsj.r(context)) {
            this.g.post(new Runnable() { // from class: efsr
                @Override // java.lang.Runnable
                public final void run() {
                    efss efssVar = this.a;
                    int measuredWidth = efssVar.g.getMeasuredWidth();
                    Button buttonB2 = efssVar.b();
                    Button buttonC2 = efssVar.c();
                    Button buttonD = efssVar.d();
                    if (efssVar.b.getResources().getBoolean(R.bool.sucTwoPaneLayoutStyle)) {
                        measuredWidth /= 2;
                        efssVar.g.setGravity(8388613);
                    }
                    int i2 = (measuredWidth - efssVar.k) - efssVar.l;
                    int i3 = efssVar.q;
                    boolean z = buttonD != null && buttonD.getVisibility() == 0;
                    int i4 = i2 - i3;
                    efte efteVar = efss.a;
                    efteVar.a(a.r(z, "isTertiaryButtonVisible="));
                    if (z && efss.k(buttonB2, buttonC2)) {
                        LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) buttonB2.getLayoutParams();
                        LinearLayout.LayoutParams layoutParams4 = (LinearLayout.LayoutParams) buttonC2.getLayoutParams();
                        LinearLayout.LayoutParams layoutParams5 = (LinearLayout.LayoutParams) buttonD.getLayoutParams();
                        LinearLayout linearLayout = efssVar.g;
                        if (linearLayout instanceof ButtonBarLayout) {
                            ((ButtonBarLayout) linearLayout).a(true);
                            int i5 = i3 / 2;
                            layoutParams4.width = i4;
                            layoutParams4.topMargin = i5;
                            buttonC2.setLayoutParams(layoutParams4);
                            layoutParams5.width = i4;
                            layoutParams5.topMargin = i5;
                            layoutParams5.bottomMargin = i5;
                            buttonD.setLayoutParams(layoutParams5);
                            layoutParams3.width = i4;
                            layoutParams3.bottomMargin = i5;
                            buttonB2.setLayoutParams(layoutParams3);
                        }
                    } else if (efss.k(buttonB2, buttonC2)) {
                        LinearLayout.LayoutParams layoutParams6 = (LinearLayout.LayoutParams) buttonB2.getLayoutParams();
                        LinearLayout.LayoutParams layoutParams7 = (LinearLayout.LayoutParams) buttonC2.getLayoutParams();
                        LinearLayout.LayoutParams layoutParams8 = (LinearLayout.LayoutParams) buttonB2.getLayoutParams();
                        LinearLayout.LayoutParams layoutParams9 = (LinearLayout.LayoutParams) buttonC2.getLayoutParams();
                        String string = buttonB2.getText().toString();
                        Paint paint = new Paint();
                        paint.setTypeface(buttonB2.getTypeface());
                        paint.setTextSize(buttonB2.getTextSize());
                        float fMeasureText = paint.measureText(string) + buttonB2.getPaddingLeft();
                        float paddingRight = buttonB2.getPaddingRight();
                        float paddingStart = buttonB2.getPaddingStart();
                        float paddingEnd = buttonB2.getPaddingEnd();
                        StringBuilder sb = new StringBuilder("isPrimaryButtonTextOverFlowing= ");
                        float f = fMeasureText + paddingRight + paddingStart + paddingEnd;
                        float f2 = i4 / 2;
                        boolean z2 = f > f2;
                        sb.append(z2);
                        sb.append(", primaryButtonWidth= ");
                        sb.append(f);
                        sb.append(", maxButtonWidth= ");
                        sb.append(f2);
                        efteVar.a(sb.toString());
                        String string2 = buttonC2.getText().toString();
                        Paint paint2 = new Paint();
                        paint2.setTypeface(buttonC2.getTypeface());
                        paint2.setTextSize(buttonC2.getTextSize());
                        float fMeasureText2 = paint2.measureText(string2) + buttonC2.getPaddingLeft();
                        float paddingRight2 = buttonC2.getPaddingRight();
                        float paddingStart2 = buttonC2.getPaddingStart();
                        float paddingEnd2 = buttonC2.getPaddingEnd();
                        boolean z3 = z2;
                        StringBuilder sb2 = new StringBuilder("isSecondaryButtonTextOverFlowing= ");
                        float f3 = fMeasureText2 + paddingRight2 + paddingStart2 + paddingEnd2;
                        boolean z4 = f3 > f2;
                        sb2.append(z4);
                        sb2.append(", secondaryButtonWidth= ");
                        sb2.append(f3);
                        sb2.append(", maxButtonWidth= ");
                        sb2.append(f2);
                        efteVar.a(sb2.toString());
                        if (z3 || z4) {
                            LinearLayout linearLayout2 = efssVar.g;
                            if (linearLayout2 instanceof ButtonBarLayout) {
                                ((ButtonBarLayout) linearLayout2).a(true);
                                int i6 = i3 / 2;
                                layoutParams9.width = i4;
                                layoutParams9.topMargin = i6;
                                buttonC2.setLayoutParams(layoutParams9);
                                layoutParams8.width = i4;
                                layoutParams8.bottomMargin = i6;
                                buttonB2.setLayoutParams(layoutParams8);
                            }
                        } else {
                            LinearLayout linearLayout3 = efssVar.g;
                            if (linearLayout3 instanceof ButtonBarLayout) {
                                ((ButtonBarLayout) linearLayout3).a(false);
                                layoutParams8.width = i4;
                                int i7 = i3 / 2;
                                layoutParams8.setMarginStart(i7);
                                layoutParams8.bottomMargin = 0;
                                buttonB2.setLayoutParams(layoutParams8);
                                layoutParams9.width = i4;
                                layoutParams9.setMarginEnd(i7);
                                layoutParams9.topMargin = 0;
                                buttonC2.setLayoutParams(layoutParams9);
                            }
                        }
                        int marginStart = ((i4 - layoutParams6.getMarginStart()) - layoutParams7.getMarginEnd()) / 2;
                        if (layoutParams6 != null) {
                            layoutParams6.width = marginStart;
                            layoutParams6.setMarginStart(i3 / 2);
                            buttonB2.setLayoutParams(layoutParams6);
                        }
                        if (layoutParams7 != null) {
                            layoutParams7.width = marginStart;
                            layoutParams7.setMarginEnd(i3 / 2);
                            buttonC2.setLayoutParams(layoutParams7);
                        }
                    } else {
                        boolean z5 = buttonB2 != null && buttonC2 == null;
                        boolean z6 = (buttonB2 == null || buttonC2 == null || buttonC2.getVisibility() == 0) ? false : true;
                        efteVar.a("isPrimaryOnly=" + z5 + ", isPrimaryOnlyButSecondaryInvisible=" + z6);
                        if (z5 || z6) {
                            LinearLayout.LayoutParams layoutParams10 = (LinearLayout.LayoutParams) buttonB2.getLayoutParams();
                            if (layoutParams10 != null) {
                                layoutParams10.width = i4;
                                buttonB2.setLayoutParams(layoutParams10);
                            }
                        } else {
                            boolean z7 = buttonC2 != null && buttonB2 == null;
                            boolean z8 = (buttonC2 == null || buttonB2 == null || buttonB2.getVisibility() == 0) ? false : true;
                            efteVar.a("isSecondaryOnly=" + z7 + ", isSecondaryOnlyButPrimaryInvisible=" + z8);
                            if (z7 || z8) {
                                LinearLayout.LayoutParams layoutParams11 = (LinearLayout.LayoutParams) buttonC2.getLayoutParams();
                                if (layoutParams11 != null) {
                                    layoutParams11.width = i4;
                                    buttonC2.setLayoutParams(layoutParams11);
                                }
                            } else {
                                efteVar.b("There are no button visible in the footer bar.");
                            }
                        }
                    }
                    efssVar.g.setVisibility(efssVar.p);
                }
            });
        }
    }

    protected final boolean h() {
        Context context = this.b;
        efsj efsjVarH = efsj.h(context);
        efsh efshVar = efsh.CONFIG_FOOTER_BUTTON_ALIGNED_END;
        return efsjVarH.t(efshVar) ? efsj.h(context).l(context, efshVar, false) : this.f;
    }

    public final boolean i() {
        return b() != null && b().getVisibility() == 0;
    }

    public final boolean j() {
        return c() != null && c().getVisibility() == 0;
    }
}
