package defpackage;

import android.R;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.material.internal.CheckableImageButton;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eeio extends dn {
    private int aA;
    private CharSequence aB;
    private int aC;
    private CharSequence aD;
    private TextView aE;
    private TextView aF;
    private eesc aG;
    private boolean aH;
    private CharSequence aI;
    private CharSequence aJ;
    public int ai;
    public CheckableImageButton aj;
    public Button ak;
    private int an;
    private eeht ao;
    private eeiy ap;
    private eehq aq;
    private eehu ar;
    private eeih as;
    private int at;
    private CharSequence au;
    private boolean av;
    private int aw;
    private CharSequence ax;
    private int ay;
    private CharSequence az;
    public final LinkedHashSet ag = new LinkedHashSet();
    public final LinkedHashSet ah = new LinkedHashSet();
    private final LinkedHashSet al = new LinkedHashSet();
    private final LinkedHashSet am = new LinkedHashSet();

    public static boolean ba(Context context) {
        return bb(context, R.attr.windowFullscreen);
    }

    public static boolean bb(Context context, int i) throws Resources.NotFoundException {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(eepx.e(context, eeih.class.getCanonicalName()), new int[]{i});
        boolean z = typedArrayObtainStyledAttributes.getBoolean(0, false);
        typedArrayObtainStyledAttributes.recycle();
        return z;
    }

    private static int bc(Context context) throws Resources.NotFoundException {
        Resources resources = context.getResources();
        int dimensionPixelOffset = resources.getDimensionPixelOffset(com.google.android.apps.messaging.R.dimen.mtrl_calendar_content_padding);
        int i = new eeis(eejd.d()).d;
        return dimensionPixelOffset + dimensionPixelOffset + (resources.getDimensionPixelSize(com.google.android.apps.messaging.R.dimen.mtrl_calendar_day_width) * i) + ((i - 1) * resources.getDimensionPixelOffset(com.google.android.apps.messaging.R.dimen.mtrl_calendar_month_horizontal_padding));
    }

    private final int bd() {
        int i = this.an;
        return i != 0 ? i : aV().d();
    }

    @Override // defpackage.ea
    public final View M(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewInflate = layoutInflater.inflate(true != this.av ? com.google.android.apps.messaging.R.layout.mtrl_picker_dialog : com.google.android.apps.messaging.R.layout.mtrl_picker_fullscreen, viewGroup);
        Context context = viewInflate.getContext();
        if (this.ar != null) {
            throw null;
        }
        if (this.av) {
            viewInflate.findViewById(com.google.android.apps.messaging.R.id.mtrl_calendar_frame).setLayoutParams(new LinearLayout.LayoutParams(bc(context), -2));
        } else {
            viewInflate.findViewById(com.google.android.apps.messaging.R.id.mtrl_calendar_main_pane).setLayoutParams(new LinearLayout.LayoutParams(bc(context), -1));
        }
        TextView textView = (TextView) viewInflate.findViewById(com.google.android.apps.messaging.R.id.mtrl_picker_header_selection_text);
        this.aF = textView;
        textView.setAccessibilityLiveRegion(1);
        this.aj = (CheckableImageButton) viewInflate.findViewById(com.google.android.apps.messaging.R.id.mtrl_picker_header_toggle);
        this.aE = (TextView) viewInflate.findViewById(com.google.android.apps.messaging.R.id.mtrl_picker_title_text);
        this.aj.setTag("TOGGLE_BUTTON_TAG");
        CheckableImageButton checkableImageButton = this.aj;
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{R.attr.state_checked}, ku.a(context, com.google.android.apps.messaging.R.drawable.material_ic_calendar_black_24dp));
        stateListDrawable.addState(new int[0], ku.a(context, com.google.android.apps.messaging.R.drawable.material_ic_edit_black_24dp));
        checkableImageButton.setImageDrawable(stateListDrawable);
        this.aj.setChecked(this.ai != 0);
        ley.p(this.aj, null);
        aZ(this.aj);
        this.aj.setOnClickListener(new View.OnClickListener() { // from class: eeij
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                eeio eeioVar = this.a;
                eeioVar.ak.setEnabled(eeioVar.aV().c());
                eeioVar.aj.toggle();
                eeioVar.ai = eeioVar.ai == 1 ? 0 : 1;
                eeioVar.aZ(eeioVar.aj);
                eeioVar.aX();
            }
        });
        this.ak = (Button) viewInflate.findViewById(com.google.android.apps.messaging.R.id.confirm_button);
        if (aV().c()) {
            this.ak.setEnabled(true);
        } else {
            this.ak.setEnabled(false);
        }
        this.ak.setTag("CONFIRM_BUTTON_TAG");
        CharSequence charSequence = this.ax;
        if (charSequence != null) {
            this.ak.setText(charSequence);
        } else {
            int i = this.aw;
            if (i != 0) {
                this.ak.setText(i);
            }
        }
        CharSequence charSequence2 = this.az;
        if (charSequence2 != null) {
            this.ak.setContentDescription(charSequence2);
        } else if (this.ay != 0) {
            this.ak.setContentDescription(z().getResources().getText(this.ay));
        }
        this.ak.setOnClickListener(new View.OnClickListener() { // from class: eeik
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                eeio eeioVar = this.a;
                Iterator it = eeioVar.ag.iterator();
                while (it.hasNext()) {
                    eeip eeipVar = (eeip) it.next();
                    eeioVar.aV().i();
                    eeipVar.a();
                }
                eeioVar.hh();
            }
        });
        Button button = (Button) viewInflate.findViewById(com.google.android.apps.messaging.R.id.cancel_button);
        button.setTag("CANCEL_BUTTON_TAG");
        CharSequence charSequence3 = this.aB;
        if (charSequence3 != null) {
            button.setText(charSequence3);
        } else {
            int i2 = this.aA;
            if (i2 != 0) {
                button.setText(i2);
            }
        }
        CharSequence charSequence4 = this.aD;
        if (charSequence4 != null) {
            button.setContentDescription(charSequence4);
        } else if (this.aC != 0) {
            button.setContentDescription(z().getResources().getText(this.aC));
        }
        button.setOnClickListener(new View.OnClickListener() { // from class: eeil
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                eeio eeioVar = this.a;
                Iterator it = eeioVar.ah.iterator();
                while (it.hasNext()) {
                    ((View.OnClickListener) it.next()).onClick(view);
                }
                eeioVar.hh();
            }
        });
        return viewInflate;
    }

    public final eeht aV() {
        if (this.ao == null) {
            this.ao = (eeht) this.m.getParcelable("DATE_SELECTOR_KEY");
        }
        return this.ao;
    }

    public final String aW() {
        return aV().f();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v1, types: [eeiq] */
    public final void aX() {
        A();
        int iBd = bd();
        eeht eehtVarAV = aV();
        eehq eehqVar = this.aq;
        eehu eehuVar = this.ar;
        eeih eeihVar = new eeih();
        Bundle bundle = new Bundle();
        bundle.putInt("THEME_RES_ID_KEY", iBd);
        bundle.putParcelable("GRID_SELECTOR_KEY", eehtVarAV);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", eehqVar);
        bundle.putParcelable("DAY_VIEW_DECORATOR_KEY", eehuVar);
        bundle.putParcelable("CURRENT_MONTH_KEY", eehqVar.d);
        eeihVar.at(bundle);
        this.as = eeihVar;
        if (this.ai == 1) {
            eeht eehtVarAV2 = aV();
            eehq eehqVar2 = this.aq;
            ?? eeiqVar = new eeiq();
            Bundle bundle2 = new Bundle();
            bundle2.putInt("THEME_RES_ID_KEY", iBd);
            bundle2.putParcelable("DATE_SELECTOR_KEY", eehtVarAV2);
            bundle2.putParcelable("CALENDAR_CONSTRAINTS_KEY", eehqVar2);
            eeiqVar.at(bundle2);
            eeihVar = eeiqVar;
        }
        this.ap = eeihVar;
        this.aE.setText((this.ai == 1 && B().getConfiguration().orientation == 2) ? this.aJ : this.aI);
        aY(aW());
        cg cgVar = new cg(I());
        cgVar.D(com.google.android.apps.messaging.R.id.mtrl_calendar_frame, this.ap);
        cgVar.c();
        this.ap.ak.add(new eein(this));
    }

    final void aY(String str) {
        TextView textView = this.aF;
        eeht eehtVarAV = aV();
        A();
        textView.setContentDescription(eehtVarAV.e());
        this.aF.setText(str);
    }

    public final void aZ(CheckableImageButton checkableImageButton) {
        this.aj.setContentDescription(this.ai == 1 ? checkableImageButton.getContext().getString(com.google.android.apps.messaging.R.string.mtrl_picker_toggle_to_calendar_input_mode) : checkableImageButton.getContext().getString(com.google.android.apps.messaging.R.string.mtrl_picker_toggle_to_text_input_mode));
    }

    @Override // defpackage.dn
    public final Dialog gK(Bundle bundle) {
        Context contextA = A();
        A();
        Dialog dialog = new Dialog(contextA, bd());
        Context context = dialog.getContext();
        this.av = ba(context);
        this.aG = new eesc(context, null, com.google.android.apps.messaging.R.attr.materialCalendarStyle, com.google.android.apps.messaging.R.style.Widget_MaterialComponents_MaterialCalendar);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(null, eeiz.a, com.google.android.apps.messaging.R.attr.materialCalendarStyle, com.google.android.apps.messaging.R.style.Widget_MaterialComponents_MaterialCalendar);
        int color = typedArrayObtainStyledAttributes.getColor(1, 0);
        typedArrayObtainStyledAttributes.recycle();
        this.aG.L(context);
        this.aG.P(ColorStateList.valueOf(color));
        this.aG.O(dialog.getWindow().getDecorView().getElevation());
        return dialog;
    }

    @Override // defpackage.dn, defpackage.ea
    public final void h(Bundle bundle) throws Resources.NotFoundException {
        super.h(bundle);
        if (bundle == null) {
            bundle = this.m;
        }
        this.an = bundle.getInt("OVERRIDE_THEME_RES_ID");
        this.ao = (eeht) bundle.getParcelable("DATE_SELECTOR_KEY");
        this.aq = (eehq) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
        this.ar = (eehu) bundle.getParcelable("DAY_VIEW_DECORATOR_KEY");
        this.at = bundle.getInt("TITLE_TEXT_RES_ID_KEY");
        this.au = bundle.getCharSequence("TITLE_TEXT_KEY");
        this.ai = bundle.getInt("INPUT_MODE_KEY");
        this.aw = bundle.getInt("POSITIVE_BUTTON_TEXT_RES_ID_KEY");
        this.ax = bundle.getCharSequence("POSITIVE_BUTTON_TEXT_KEY");
        this.ay = bundle.getInt("POSITIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY");
        this.az = bundle.getCharSequence("POSITIVE_BUTTON_CONTENT_DESCRIPTION_KEY");
        this.aA = bundle.getInt("NEGATIVE_BUTTON_TEXT_RES_ID_KEY");
        this.aB = bundle.getCharSequence("NEGATIVE_BUTTON_TEXT_KEY");
        this.aC = bundle.getInt("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY");
        this.aD = bundle.getCharSequence("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_KEY");
        CharSequence text = this.au;
        if (text == null) {
            text = A().getResources().getText(this.at);
        }
        this.aI = text;
        if (text != null) {
            CharSequence[] charSequenceArrSplit = TextUtils.split(text.toString(), "\n");
            if (charSequenceArrSplit.length > 1) {
                text = charSequenceArrSplit[0];
            }
        } else {
            text = null;
        }
        this.aJ = text;
    }

    @Override // defpackage.dn, defpackage.ea
    public final void k(Bundle bundle) {
        super.k(bundle);
        bundle.putInt("OVERRIDE_THEME_RES_ID", this.an);
        bundle.putParcelable("DATE_SELECTOR_KEY", this.ao);
        int i = eeho.a;
        eehq eehqVar = this.aq;
        long j = eehqVar.a.f;
        long j2 = eehqVar.b.f;
        Long lValueOf = Long.valueOf(eehqVar.d.f);
        int i2 = eehqVar.e;
        eehp eehpVar = eehqVar.c;
        eeih eeihVar = this.as;
        eeis eeisVar = eeihVar == null ? null : eeihVar.c;
        if (eeisVar != null) {
            lValueOf = Long.valueOf(eeisVar.f);
        }
        Bundle bundle2 = new Bundle();
        bundle2.putParcelable("DEEP_COPY_VALIDATOR_KEY", eehpVar);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", new eehq(eeis.c(j), eeis.c(j2), (eehp) bundle2.getParcelable("DEEP_COPY_VALIDATOR_KEY"), eeis.c(lValueOf.longValue()), i2));
        bundle.putParcelable("DAY_VIEW_DECORATOR_KEY", this.ar);
        bundle.putInt("TITLE_TEXT_RES_ID_KEY", this.at);
        bundle.putCharSequence("TITLE_TEXT_KEY", this.au);
        bundle.putInt("INPUT_MODE_KEY", this.ai);
        bundle.putInt("POSITIVE_BUTTON_TEXT_RES_ID_KEY", this.aw);
        bundle.putCharSequence("POSITIVE_BUTTON_TEXT_KEY", this.ax);
        bundle.putInt("POSITIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY", this.ay);
        bundle.putCharSequence("POSITIVE_BUTTON_CONTENT_DESCRIPTION_KEY", this.az);
        bundle.putInt("NEGATIVE_BUTTON_TEXT_RES_ID_KEY", this.aA);
        bundle.putCharSequence("NEGATIVE_BUTTON_TEXT_KEY", this.aB);
        bundle.putInt("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY", this.aC);
        bundle.putCharSequence("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_KEY", this.aD);
    }

    @Override // defpackage.dn, defpackage.ea
    public final void l() throws Resources.NotFoundException {
        super.l();
        Window window = gV().getWindow();
        if (this.av) {
            window.setLayout(-1, -1);
            window.setBackgroundDrawable(this.aG);
            if (!this.aH) {
                View viewFindViewById = N().findViewById(com.google.android.apps.messaging.R.id.fullscreen_header);
                Integer numG = eemo.g(viewFindViewById);
                boolean z = numG == null || numG.intValue() == 0;
                int iC = eehg.c(window.getContext(), R.attr.colorBackground, -16777216);
                if (z) {
                    numG = Integer.valueOf(iC);
                }
                Integer numValueOf = Integer.valueOf(iC);
                lfq.a(window, false);
                window.getContext();
                int iH = Build.VERSION.SDK_INT < 27 ? kzb.h(eehg.c(window.getContext(), R.attr.navigationBarColor, -16777216), 128) : 0;
                window.setStatusBarColor(0);
                window.setNavigationBarColor(iH);
                eele.a(window, eele.b(0, eehg.i(numG.intValue())));
                numValueOf.getClass();
                new lhb(window, window.getDecorView()).a(eele.b(iH, eehg.i(iC)));
                eeim eeimVar = new eeim(viewFindViewById.getLayoutParams().height, viewFindViewById, viewFindViewById.getPaddingLeft(), viewFindViewById.getPaddingTop(), viewFindViewById.getPaddingRight());
                int[] iArr = ley.a;
                len.k(viewFindViewById, eeimVar);
                this.aH = true;
            }
        } else {
            window.setLayout(-2, -2);
            int dimensionPixelOffset = B().getDimensionPixelOffset(com.google.android.apps.messaging.R.dimen.mtrl_calendar_dialog_background_inset);
            Rect rect = new Rect(dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset);
            window.setBackgroundDrawable(new InsetDrawable((Drawable) this.aG, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset));
            window.getDecorView().setOnTouchListener(new eejh(gV(), rect));
        }
        aX();
    }

    @Override // defpackage.dn, defpackage.ea
    public final void m() {
        this.ap.ak.clear();
        super.m();
    }

    @Override // defpackage.dn, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        Iterator it = this.al.iterator();
        while (it.hasNext()) {
            ((DialogInterface.OnCancelListener) it.next()).onCancel(dialogInterface);
        }
    }

    @Override // defpackage.dn, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        Iterator it = this.am.iterator();
        while (it.hasNext()) {
            ((DialogInterface.OnDismissListener) it.next()).onDismiss(dialogInterface);
        }
        ViewGroup viewGroup = (ViewGroup) this.Q;
        if (viewGroup != null) {
            viewGroup.removeAllViews();
        }
        super.onDismiss(dialogInterface);
    }
}
