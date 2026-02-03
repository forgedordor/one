package defpackage;

import android.content.res.Resources;
import android.os.Bundle;
import android.text.Html;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.google.android.apps.messaging.R;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cytj {
    public static final eksp a = eksp.c("BugleGDitto");
    public final cytb b;
    public final ehbb c;
    public final Optional d;
    public final fcsu e;
    public final fcsu f;
    public final fcsu g;
    public final fcsu h;
    public final fcsu i;
    public boolean j;
    public boolean k;
    public boolean l;
    public final abs m;
    public final ehay n;

    public cytj(cytb cytbVar, ehbb ehbbVar, Optional optional, fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3, fcsu fcsuVar4, fcsu fcsuVar5) {
        ehbbVar.getClass();
        fcsuVar2.getClass();
        fcsuVar4.getClass();
        fcsuVar5.getClass();
        this.b = cytbVar;
        this.c = ehbbVar;
        this.d = optional;
        this.e = fcsuVar;
        this.f = fcsuVar2;
        this.g = fcsuVar3;
        this.h = fcsuVar4;
        this.i = fcsuVar5;
        this.m = new cyti(this);
        this.n = new ehay() { // from class: cytg
            @Override // defpackage.ehay
            public final /* synthetic */ void a(Throwable th) {
                ehax.a(th);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // defpackage.ehay
            public final void b(Object obj) throws Resources.NotFoundException {
                bvqr bvqrVar = (bvqr) obj;
                bvqq bvqqVarB = bvqq.b(bvqrVar.c);
                if (bvqqVarB == null) {
                    bvqqVarB = bvqq.UNRECOGNIZED;
                }
                final cytj cytjVar = this.a;
                int iOrdinal = bvqqVarB.ordinal();
                if (iOrdinal != 2) {
                    if (iOrdinal == 3) {
                        eksl ekslVar = (eksl) cytj.a.h();
                        ekslVar.X(cqnc.S, cytjVar.getClass().getSimpleName());
                        ekslVar.q("Dismissed by selecting correct emoji.");
                        ((bvsh) cytjVar.i.b()).a(1);
                        cytjVar.a();
                        return;
                    }
                    if (iOrdinal == 4) {
                        eksl ekslVar2 = (eksl) cytj.a.h();
                        ekslVar2.X(cqnc.S, cytjVar.getClass().getSimpleName());
                        ekslVar2.q("Swapping to wrong emoji prompt");
                        cytjVar.g();
                        ((bvsh) cytjVar.i.b()).a(2);
                        cytb cytbVar2 = cytjVar.b;
                        ea eaVarH = cytbVar2.I().h("gaia_pairing_verification_wrong_code");
                        if (eaVarH == null) {
                            int i = cytq.b;
                            eaVarH = new cyto();
                            eyhj.e(eaVarH);
                        }
                        cg cgVar = new cg(cytbVar2.I());
                        cgVar.x(R.id.fragment_container, eaVarH, "gaia_pairing_verification_wrong_code");
                        cgVar.c();
                        cytjVar.f(cytbVar2.N(), false);
                        return;
                    }
                    if (iOrdinal == 9) {
                        eksl ekslVar3 = (eksl) cytj.a.h();
                        ekslVar3.X(cqnc.S, cytjVar.getClass().getSimpleName());
                        ekslVar3.q("Dismissed by failing to download emojis.");
                        ((ains) cytjVar.h.b()).e("Bugle.Gaia.Verification.Prompt.Emoji.Download", 2);
                        cytjVar.a();
                        return;
                    }
                    if (iOrdinal != 10) {
                        eksl ekslVar4 = (eksl) cytj.a.e();
                        ekslVar4.X(cqnc.S, cytjVar.getClass().getSimpleName());
                        bvqq bvqqVarB2 = bvqq.b(bvqrVar.c);
                        if (bvqqVarB2 == null) {
                            bvqqVarB2 = bvqq.UNRECOGNIZED;
                        }
                        ekslVar4.t("Dismissed. DataStatus: %s", bvqqVarB2.name());
                        cytjVar.a();
                        return;
                    }
                    cytjVar.g();
                    eksl ekslVar5 = (eksl) cytj.a.h();
                    ekslVar5.X(cqnc.S, cytjVar.getClass().getSimpleName());
                    ekslVar5.q("Swapping to secure account prompt");
                    ((bvsh) cytjVar.i.b()).a(3);
                    bvqh bvqhVar = bvqrVar.k;
                    if (bvqhVar == null) {
                        bvqhVar = bvqh.a;
                    }
                    String str = bvqhVar.e;
                    str.getClass();
                    cytb cytbVar3 = cytjVar.b;
                    ea eaVarH2 = cytbVar3.I().h("gaia_pairing_verification_secure_account");
                    if (eaVarH2 == null) {
                        cczi ccziVar = cytn.a;
                        eaVarH2 = new cytl();
                        eyhj.e(eaVarH2);
                    }
                    Bundle bundle = new Bundle();
                    bundle.putString("dusi", str);
                    eaVarH2.at(bundle);
                    cg cgVar2 = new cg(cytbVar3.I());
                    cgVar2.x(R.id.fragment_container, eaVarH2, "gaia_pairing_verification_secure_account");
                    cgVar2.c();
                    cytjVar.f(cytbVar3.N(), false);
                    return;
                }
                if (bvqrVar.n) {
                    View viewN = cytjVar.b.N();
                    cytjVar.e(viewN, R.id.gaia_pairing_verification_code_button_start);
                    cytjVar.e(viewN, R.id.gaia_pairing_verification_code_button_middle);
                    cytjVar.e(viewN, R.id.gaia_pairing_verification_code_button_end);
                    ((Button) viewN.findViewById(R.id.gaia_pairing_cancel_button)).setOnClickListener(new View.OnClickListener() { // from class: cytd
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            cytj cytjVar2 = cytjVar;
                            cytjVar2.c(1);
                            eksl ekslVar6 = (eksl) cytj.a.h();
                            ekslVar6.X(cqnc.S, cytjVar2.getClass().getSimpleName());
                            ekslVar6.q("Dismissed by tapping the cancel button");
                            ((bvsh) cytjVar2.i.b()).a(4);
                        }
                    });
                    ((Button) viewN.findViewById(R.id.gaia_pairing_not_me_button)).setOnClickListener(new View.OnClickListener() { // from class: cyte
                        /* JADX WARN: Type inference failed for: r4v5, types: [bvqv, java.lang.Object] */
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            cytj cytjVar2 = cytjVar;
                            Optional optional2 = cytjVar2.d;
                            optional2.isPresent();
                            ((ains) cytjVar2.h.b()).e("Bugle.Gaia.Verification.Prompt.User.Canceled", 2);
                            auvh.h(optional2.get().g(bvqq.ERROR_NOT_ME));
                        }
                    });
                    viewN.findViewById(R.id.standard_bottom_sheet).setOnClickListener(null);
                    viewN.findViewById(R.id.bottom_sheet_container).setOnTouchListener(new View.OnTouchListener() { // from class: cytc
                        @Override // android.view.View.OnTouchListener
                        public final boolean onTouch(View view, MotionEvent motionEvent) {
                            cytj cytjVar2 = cytjVar;
                            cytjVar2.c(3);
                            eksl ekslVar6 = (eksl) cytj.a.h();
                            ekslVar6.X(cqnc.S, cytjVar2.getClass().getSimpleName());
                            ekslVar6.q("Dismissed by tapping outside the prompt");
                            ((bvsh) cytjVar2.i.b()).a(6);
                            return false;
                        }
                    });
                }
                cytb cytbVar4 = cytjVar.b;
                View viewFindViewById = cytbVar4.N().findViewById(R.id.standard_bottom_sheet);
                LinearLayout linearLayout = (LinearLayout) cytbVar4.N().findViewById(R.id.gaia_pairing_action_buttons_container);
                View viewFindViewById2 = cytbVar4.N().findViewById(R.id.gaia_pairing_not_me_button);
                View viewFindViewById3 = cytbVar4.N().findViewById(R.id.gaia_pairing_cancel_button);
                View viewFindViewById4 = cytbVar4.N().findViewById(R.id.gaia_pairing_action_buttons_gap);
                int dimensionPixelSize = cytbVar4.B().getDimensionPixelSize(R.dimen.gaia_pairing_verification_layout_margin);
                if (viewFindViewById2.getWidth() + viewFindViewById3.getWidth() + dimensionPixelSize + dimensionPixelSize > viewFindViewById.getWidth()) {
                    viewFindViewById4.setVisibility(8);
                    linearLayout.setOrientation(1);
                } else {
                    viewFindViewById4.setVisibility(0);
                    linearLayout.setOrientation(0);
                }
                cytjVar.b(0);
                cytjVar.d(8);
                int width = cytbVar4.N().findViewById(R.id.standard_bottom_sheet).getWidth();
                float dimensionPixelSize2 = cytbVar4.B().getDimensionPixelSize(cytbVar4.B().getConfiguration().orientation == 2 ? R.dimen.gaia_pairing_verification_layout_width_landscape : R.dimen.gaia_pairing_verification_layout_width_portrait);
                float dimensionPixelSize3 = cytbVar4.B().getDimensionPixelSize(R.dimen.gaia_pairing_verification_image_button_size);
                float dimensionPixelSize4 = cytbVar4.B().getDimensionPixelSize(R.dimen.gaia_pairing_verification_image_button_padding);
                ImageButton imageButton = (ImageButton) cytbVar4.N().findViewById(R.id.gaia_pairing_verification_code_button_start);
                ImageButton imageButton2 = (ImageButton) cytbVar4.N().findViewById(R.id.gaia_pairing_verification_code_button_middle);
                ImageButton imageButton3 = (ImageButton) cytbVar4.N().findViewById(R.id.gaia_pairing_verification_code_button_end);
                float f = width / dimensionPixelSize2;
                float f2 = dimensionPixelSize3 * f;
                if (f2 > dimensionPixelSize3) {
                    float f3 = dimensionPixelSize4 * f;
                    ViewGroup.LayoutParams layoutParams = imageButton.getLayoutParams();
                    int i2 = (int) f2;
                    layoutParams.width = i2;
                    layoutParams.height = i2;
                    imageButton.setLayoutParams(layoutParams);
                    imageButton2.setLayoutParams(layoutParams);
                    imageButton3.setLayoutParams(layoutParams);
                    int i3 = (int) f3;
                    imageButton.setPadding(i3, i3, i3, i3);
                    imageButton2.setPadding(i3, i3, i3, i3);
                    imageButton3.setPadding(i3, i3, i3, i3);
                }
                evtg evtgVar = bvqrVar.f;
                evtgVar.getClass();
                evtg evtgVar2 = bvqrVar.d;
                evtgVar2.getClass();
                ImageButton imageButton4 = (ImageButton) cytbVar4.N().findViewById(R.id.gaia_pairing_verification_code_button_start);
                ImageButton imageButton5 = (ImageButton) cytbVar4.N().findViewById(R.id.gaia_pairing_verification_code_button_middle);
                ImageButton imageButton6 = (ImageButton) cytbVar4.N().findViewById(R.id.gaia_pairing_verification_code_button_end);
                fcsu fcsuVar6 = cytjVar.e;
                rbr rbrVarF = ((ehrb) fcsuVar6.b()).f((String) evtgVar2.get(0));
                cyth cythVar = new cyth(1, cytjVar);
                fcsu fcsuVar7 = cytjVar.f;
                rbrVarF.f(new eikl(cythVar, (eigp) fcsuVar7.b())).v(imageButton4);
                imageButton4.setContentDescription(((bvqj) evtgVar.get(0)).c);
                ((ehrb) fcsuVar6.b()).f((String) evtgVar2.get(1)).f(new eikl(new cyth(2, cytjVar), (eigp) fcsuVar7.b())).v(imageButton5);
                imageButton5.setContentDescription(((bvqj) evtgVar.get(1)).c);
                ((ehrb) fcsuVar6.b()).f((String) evtgVar2.get(2)).f(new eikl(new cyth(3, cytjVar), (eigp) fcsuVar7.b())).v(imageButton6);
                imageButton6.setContentDescription(((bvqj) evtgVar.get(2)).c);
                if ((bvqrVar.b & 4) != 0) {
                    bvqh bvqhVar2 = bvqrVar.k;
                    if (bvqhVar2 == null) {
                        bvqhVar2 = bvqh.a;
                    }
                    String str2 = bvqhVar2.b;
                    str2.getClass();
                    if (str2.length() > 0) {
                        TextView textView = (TextView) cytbVar4.N().findViewById(R.id.gaia_pairing_verification_info);
                        bvqh bvqhVar3 = bvqrVar.k;
                        if (bvqhVar3 == null) {
                            bvqhVar3 = bvqh.a;
                        }
                        String str3 = bvqhVar3.c;
                        str3.getClass();
                        if (str3.length() > 0) {
                            Resources resourcesB = cytbVar4.B();
                            bvqh bvqhVar4 = bvqrVar.k;
                            String str4 = (bvqhVar4 == null ? bvqh.a : bvqhVar4).b;
                            if (bvqhVar4 == null) {
                                bvqhVar4 = bvqh.a;
                            }
                            textView.setText(Html.fromHtml(resourcesB.getString(R.string.gaia_pairing_verification_location_device_info_text, str4, bvqhVar4.c), 63));
                            Resources resourcesB2 = cytbVar4.B();
                            bvqh bvqhVar5 = bvqrVar.k;
                            String str5 = (bvqhVar5 == null ? bvqh.a : bvqhVar5).b;
                            if (bvqhVar5 == null) {
                                bvqhVar5 = bvqh.a;
                            }
                            textView.setContentDescription(resourcesB2.getString(R.string.gaia_pairing_verification_location_device_info_a11y, str5, bvqhVar5.c));
                        } else {
                            bvqh bvqhVar6 = bvqrVar.k;
                            if (bvqhVar6 == null) {
                                bvqhVar6 = bvqh.a;
                            }
                            String str6 = bvqhVar6.d;
                            str6.getClass();
                            if (str6.length() > 0) {
                                Resources resourcesB3 = cytbVar4.B();
                                bvqh bvqhVar7 = bvqrVar.k;
                                String str7 = (bvqhVar7 == null ? bvqh.a : bvqhVar7).b;
                                if (bvqhVar7 == null) {
                                    bvqhVar7 = bvqh.a;
                                }
                                textView.setText(Html.fromHtml(resourcesB3.getString(R.string.gaia_pairing_verification_location_device_info_text, str7, bvqhVar7.d), 63));
                                Resources resourcesB4 = cytbVar4.B();
                                bvqh bvqhVar8 = bvqrVar.k;
                                String str8 = (bvqhVar8 == null ? bvqh.a : bvqhVar8).b;
                                if (bvqhVar8 == null) {
                                    bvqhVar8 = bvqh.a;
                                }
                                textView.setContentDescription(resourcesB4.getString(R.string.gaia_pairing_verification_location_device_info_a11y, str8, bvqhVar8.d));
                            } else {
                                Resources resourcesB5 = cytbVar4.B();
                                bvqh bvqhVar9 = bvqrVar.k;
                                if (bvqhVar9 == null) {
                                    bvqhVar9 = bvqh.a;
                                }
                                textView.setText(Html.fromHtml(resourcesB5.getString(R.string.gaia_pairing_verification_location_info_text, bvqhVar9.b), 63));
                                Resources resourcesB6 = cytbVar4.B();
                                bvqh bvqhVar10 = bvqrVar.k;
                                if (bvqhVar10 == null) {
                                    bvqhVar10 = bvqh.a;
                                }
                                textView.setContentDescription(resourcesB6.getString(R.string.gaia_pairing_verification_location_info_a11y, bvqhVar10.b));
                            }
                        }
                    }
                }
                ((TextView) cytbVar4.N().findViewById(R.id.gaia_pairing_verification_info)).setVisibility(0);
            }
        };
    }

    public final void a() {
        eg egVarG = this.b.G();
        if (egVarG != null) {
            egVarG.finish();
        }
    }

    public final void b(int i) {
        ((ProgressBar) this.b.N().findViewById(R.id.loading_progress)).setVisibility(i);
    }

    /* JADX WARN: Type inference failed for: r5v3, types: [bvqv, java.lang.Object] */
    public final void c(int i) {
        Optional optional = this.d;
        optional.isPresent();
        fcsu fcsuVar = this.h;
        ((ains) fcsuVar.b()).e("Bugle.Gaia.Verification.Prompt.User.Canceled.Operation", i);
        ((ains) fcsuVar.b()).e("Bugle.Gaia.Verification.Prompt.User.Canceled", 1);
        auvh.h(optional.get().g(bvqq.ERROR_USER_CANCELED_VERIFICATION));
    }

    public final void d(int i) {
        this.b.N().findViewById(R.id.gaia_pairing_verification_code_container).setVisibility(i);
    }

    public final void e(View view, int i) {
        ((ImageButton) view.findViewById(i)).setOnClickListener(new eifs((eigp) this.f.b(), "", "", 0, "GaiaPairingVerificationFragmentPeer::gaiaPairingVerificationCodeOnClickListener", new View.OnClickListener() { // from class: cytf
            /* JADX WARN: Type inference failed for: r0v2, types: [bvqv, java.lang.Object] */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                Optional optional = this.a.d;
                optional.isPresent();
                ?? r0 = optional.get();
                view2.getClass();
                r0.j(((ImageButton) view2).getContentDescription().toString());
            }
        }));
    }

    public final void f(View view, boolean z) {
        cytb cytbVar = this.b;
        float f = cytbVar.B().getConfiguration().fontScale;
        int iC = cytbVar.B().getDisplayMetrics().heightPixels;
        if (!craf.f) {
            iC -= dakl.c(cytbVar.G());
        }
        BottomSheetBehavior bottomSheetBehaviorV = BottomSheetBehavior.v(view.findViewById(R.id.standard_bottom_sheet));
        bottomSheetBehaviorV.getClass();
        int i = bottomSheetBehaviorV.d ? -1 : bottomSheetBehaviorV.c;
        if (f > 1.0f && z) {
            i = (int) (i * f);
            bottomSheetBehaviorV.D(i);
            view.requestLayout();
        }
        if (iC > i) {
            ViewGroup.LayoutParams layoutParams = view.findViewById(R.id.gaia_pairing_action_buttons_container).getLayoutParams();
            layoutParams.getClass();
            ((au) layoutParams).bottomMargin = (iC - i) + cytbVar.B().getDimensionPixelSize(R.dimen.gaia_pairing_verification_action_button_margin_bottom);
        }
    }

    public final void g() {
        this.b.N().findViewById(R.id.gaia_pairing_verification_container).setVisibility(8);
    }
}
