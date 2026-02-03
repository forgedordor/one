package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.PopupWindow;
import android.widget.TextView;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dsre implements ViewTreeObserver.OnGlobalLayoutListener {
    final /* synthetic */ View a;
    final /* synthetic */ dsrg b;

    public dsre(dsrg dsrgVar, View view) {
        this.a = view;
        this.b = dsrgVar;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        View view = this.a;
        view.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        View rootView = view.getRootView();
        Runnable runnable = new Runnable() { // from class: dsrd
            @Override // java.lang.Runnable
            public final void run() {
                View view2;
                int i;
                int i2;
                int i3;
                boolean z;
                final dsrg dsrgVar = this.a.b;
                Bundle bundle = dsrgVar.m;
                bundle.setClassLoader(dsbi.class.getClassLoader());
                dsrgVar.ai = (dsbi) bundle.getParcelable("promo_context");
                etns etnsVar = etns.UNSPECIFIED;
                dsrgVar.aj = etns.b(bundle.getInt("theme", etnsVar.d));
                etnj etnjVar = dsrgVar.ai.c().f;
                if (etnjVar == null) {
                    etnjVar = etnj.a;
                }
                final etoh etohVar = etnjVar.c == 5 ? (etoh) etnjVar.d : etoh.a;
                View viewA = dsrgVar.b.a(dsrgVar.G(), etohVar);
                if (!dsrm.c(viewA)) {
                    dsrgVar.al.b(dsrgVar.ai, dsoo.FAILED_VIEW_MOSTLY_HIDDEN);
                    dsrgVar.a();
                    return;
                }
                int iA = etnd.a(etnjVar.h);
                boolean z2 = iA != 0 && iA == 3 && eehf.b();
                Context contextZ = dsrgVar.z();
                int iA2 = etnd.a(etnjVar.h);
                if (iA2 == 0) {
                    iA2 = 1;
                }
                dsox dsoxVarA = dsoy.a(contextZ, dsrgVar.aj, iA2 == 3 && eehf.b());
                try {
                    dsqt dsqtVar = new dsqt();
                    if (viewA == null) {
                        throw new NullPointerException("Null targetView");
                    }
                    dsqtVar.a = viewA;
                    dsqtVar.c = etohVar.g;
                    dsqtVar.e = etohVar.h;
                    dsqtVar.q = 2;
                    etof etofVarB = etof.b(etohVar.k);
                    if (etofVarB == null) {
                        etofVarB = etof.UNKNOWN;
                    }
                    dsqtVar.p = etofVarB.ordinal() != 1 ? 2 : 1;
                    dsqtVar.m = 0.95f;
                    dsqtVar.n = (byte) 1;
                    dsqtVar.o = 2;
                    etns etnsVar2 = dsrgVar.aj;
                    if (etnsVar2 == etnsVar) {
                        if ((etohVar.b & 1) != 0) {
                            eyax eyaxVar = etohVar.e;
                            if (eyaxVar == null) {
                                eyaxVar = eyax.a;
                            }
                            dsqtVar.b(Integer.valueOf(dxuy.c(eyaxVar)));
                        }
                        if ((etohVar.b & 2) != 0) {
                            eyax eyaxVar2 = etohVar.f;
                            if (eyaxVar2 == null) {
                                eyaxVar2 = eyax.a;
                            }
                            dsqtVar.c(Integer.valueOf(dxuy.c(eyaxVar2)));
                        }
                    } else if (!z2 || dsoxVarA == null) {
                        etkx etkxVar = dspi.c(etnsVar2, etohVar.i).d;
                        if (etkxVar == null) {
                            etkxVar = etkx.a;
                        }
                        eyax eyaxVar3 = etkxVar.c;
                        if (eyaxVar3 == null) {
                            eyaxVar3 = eyax.a;
                        }
                        dsqtVar.d(Integer.valueOf(dxuy.c(eyaxVar3)));
                        eyax eyaxVar4 = etkxVar.d;
                        if (eyaxVar4 == null) {
                            eyaxVar4 = eyax.a;
                        }
                        dsqtVar.c(Integer.valueOf(dxuy.c(eyaxVar4)));
                        eyax eyaxVar5 = etkxVar.e;
                        if (eyaxVar5 == null) {
                            eyaxVar5 = eyax.a;
                        }
                        dsqtVar.b(Integer.valueOf(dxuy.c(eyaxVar5)));
                    } else {
                        Integer numValueOf = Integer.valueOf(((dsov) dsoxVarA).b);
                        dsqtVar.d(numValueOf);
                        dsqtVar.c(numValueOf);
                        dsqtVar.b(Integer.valueOf(((dsov) dsoxVarA).a));
                    }
                    if ((etohVar.b & 16) != 0) {
                        etns etnsVar3 = dsrgVar.aj;
                        if (etnsVar3 == etnsVar) {
                            etlk etlkVar = etohVar.j;
                            if (etlkVar == null) {
                                etlkVar = etlk.a;
                            }
                            if ((etlkVar.b & 4) != 0) {
                                etlk etlkVar2 = etohVar.j;
                                if (etlkVar2 == null) {
                                    etlkVar2 = etlk.a;
                                }
                                eyax eyaxVar6 = etlkVar2.g;
                                if (eyaxVar6 == null) {
                                    eyaxVar6 = eyax.a;
                                }
                                dsqtVar.a(Integer.valueOf(dxuy.c(eyaxVar6)));
                            }
                        } else if (!z2 || dsoxVarA == null) {
                            etlk etlkVar3 = etohVar.j;
                            if (etlkVar3 == null) {
                                etlkVar3 = etlk.a;
                            }
                            etkx etkxVar2 = dspi.c(etnsVar3, etlkVar3.i).d;
                            if (etkxVar2 == null) {
                                etkxVar2 = etkx.a;
                            }
                            eyax eyaxVar7 = etkxVar2.c;
                            if (eyaxVar7 == null) {
                                eyaxVar7 = eyax.a;
                            }
                            dsqtVar.a(Integer.valueOf(dxuy.c(eyaxVar7)));
                        } else {
                            dsqtVar.a(Integer.valueOf(((dsov) dsoxVarA).b));
                        }
                        etlk etlkVar4 = etohVar.j;
                        if (etlkVar4 == null) {
                            etlkVar4 = etlk.a;
                        }
                        dsqtVar.h = etlkVar4.f;
                        dsqtVar.j = new View.OnClickListener() { // from class: dsqz
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view3) {
                                dsrg dsrgVar2 = dsrgVar;
                                eifp eifpVarA = dsrgVar2.c.a("TooltipFragment");
                                etoh etohVar2 = etohVar;
                                try {
                                    dsrgVar2.ag = false;
                                    dsom dsomVar = dsrgVar2.al;
                                    dsbi dsbiVar = dsrgVar2.ai;
                                    dsoq dsoqVar = dsrgVar2.a;
                                    etlk etlkVar5 = etohVar2.j;
                                    if (etlkVar5 == null) {
                                        etlkVar5 = etlk.a;
                                    }
                                    dsomVar.a(dsbiVar, dsoqVar.a(etlkVar5));
                                    eifpVarA.close();
                                } catch (Throwable th) {
                                    try {
                                        eifpVarA.close();
                                    } catch (Throwable th2) {
                                        th.addSuppressed(th2);
                                    }
                                    throw th;
                                }
                            }
                        };
                    }
                    dxgk dxgkVar = dsrgVar.c;
                    final PopupWindow.OnDismissListener onDismissListener = new PopupWindow.OnDismissListener() { // from class: dsra
                        @Override // android.widget.PopupWindow.OnDismissListener
                        public final void onDismiss() {
                            dsrg dsrgVar2 = dsrgVar;
                            if (dsrgVar2.ah && dsrgVar2.ag) {
                                dsrgVar2.al.a(dsrgVar2.ai, etjv.DISMISSED);
                            }
                            dsrgVar2.a();
                        }
                    };
                    final eigp eigpVar = ((dxxh) dxgkVar).a;
                    dsqtVar.k = new PopupWindow.OnDismissListener() { // from class: eigc
                        public final /* synthetic */ String c = "com/google/android/libraries/notifications/platform/tiktok/trace/TikTokTrace";
                        public final /* synthetic */ String d = "onDismissPopupWindow";
                        public final /* synthetic */ String e = "TooltipFragment";

                        @Override // android.widget.PopupWindow.OnDismissListener
                        public final void onDismiss() {
                            PopupWindow.OnDismissListener onDismissListener2 = onDismissListener;
                            if (eidc.v()) {
                                onDismissListener2.onDismiss();
                                return;
                            }
                            String str = this.e;
                            String str2 = this.d;
                            eieh eiehVarC = eigpVar.c(str, this.c, str2, 46);
                            try {
                                onDismissListener2.onDismiss();
                                eiehVarC.close();
                            } catch (Throwable th) {
                                try {
                                    eiehVarC.close();
                                } catch (Throwable th2) {
                                    th.addSuppressed(th2);
                                }
                                throw th;
                            }
                        }
                    };
                    dsqtVar.l = new View.OnClickListener() { // from class: dsrb
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view3) {
                            dsrgVar.ah = true;
                        }
                    };
                    dsqtVar.d = new View.OnClickListener() { // from class: dsrc
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view3) {
                            dsrg dsrgVar2 = dsrgVar;
                            eifp eifpVarA = dsrgVar2.c.a("TooltipFragment");
                            try {
                                dsrgVar2.ag = false;
                                dsrgVar2.al.a(dsrgVar2.ai, etjv.POSITIVE_RESPONSE);
                                eifpVarA.close();
                            } catch (Throwable th) {
                                try {
                                    eifpVarA.close();
                                } catch (Throwable th2) {
                                    th.addSuppressed(th2);
                                }
                                throw th;
                            }
                        }
                    };
                    if (dsqtVar.n == 1 && (view2 = dsqtVar.a) != null && (i = dsqtVar.o) != 0 && (i2 = dsqtVar.p) != 0 && (i3 = dsqtVar.q) != 0) {
                        boolean z3 = false;
                        dsrgVar.e = new dsrm(new dsqu(view2, dsqtVar.b, dsqtVar.c, dsqtVar.d, dsqtVar.e, dsqtVar.f, dsqtVar.g, dsqtVar.h, dsqtVar.i, dsqtVar.j, dsqtVar.k, dsqtVar.l, i, i2, i3, dsqtVar.m));
                        final dsrm dsrmVar = dsrgVar.e;
                        View view3 = ((dsqu) dsrmVar.b).a;
                        dsrmVar.d = view3.getRootView();
                        aer aerVar = new aer(((dsqu) dsrmVar.b).a.getContext(), R.style.Theme_GrowthKit_Tooltip);
                        View viewInflate = (TextUtils.isEmpty(((dsqu) dsrmVar.b).c) || TextUtils.isEmpty(((dsqu) dsrmVar.b).e) || TextUtils.isEmpty(((dsqu) dsrmVar.b).h)) ? (TextUtils.isEmpty(((dsqu) dsrmVar.b).c) || TextUtils.isEmpty(((dsqu) dsrmVar.b).e) || !TextUtils.isEmpty(((dsqu) dsrmVar.b).h)) ? (!TextUtils.isEmpty(((dsqu) dsrmVar.b).c) && TextUtils.isEmpty(((dsqu) dsrmVar.b).e) && TextUtils.isEmpty(((dsqu) dsrmVar.b).h)) ? View.inflate(aerVar, R.layout.gm3_tooltip_title_content_view, null) : (TextUtils.isEmpty(((dsqu) dsrmVar.b).c) && !TextUtils.isEmpty(((dsqu) dsrmVar.b).e) && TextUtils.isEmpty(((dsqu) dsrmVar.b).h)) ? View.inflate(aerVar, R.layout.gm3_tooltip_body_content_view, null) : (!TextUtils.isEmpty(((dsqu) dsrmVar.b).c) || TextUtils.isEmpty(((dsqu) dsrmVar.b).e) || TextUtils.isEmpty(((dsqu) dsrmVar.b).h)) ? View.inflate(aerVar, R.layout.gm3_tooltip_title_body_button_content_view, null) : View.inflate(aerVar, R.layout.gm3_tooltip_body_button_content_view, null) : View.inflate(aerVar, R.layout.gm3_tooltip_title_body_content_view, null) : View.inflate(aerVar, R.layout.gm3_tooltip_title_body_button_content_view, null);
                        if (!TextUtils.isEmpty(((dsqu) dsrmVar.b).c)) {
                            TextView textView = (TextView) viewInflate.findViewById(R.id.gm_tooltip_title);
                            if (((dsqu) dsrmVar.b).f.g()) {
                                textView.setTextColor(((Integer) ((dsqu) dsrmVar.b).f.c()).intValue());
                            }
                            if (((dsqu) dsrmVar.b).g.g()) {
                                textView.setTextColor(((Integer) ((dsqu) dsrmVar.b).g.c()).intValue());
                            }
                            if (fbcn.c()) {
                                ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
                                DisplayMetrics displayMetrics = view3.getContext().getResources().getDisplayMetrics();
                                int iB = dxuy.b(displayMetrics, 12);
                                int iB2 = dxuy.b(displayMetrics, 6);
                                ((ViewGroup.MarginLayoutParams) layoutParams).setMargins(iB, iB2, iB, iB2);
                                textView.setLayoutParams(layoutParams);
                            }
                            dxuy.e(textView, ((dsqu) dsrmVar.b).c);
                        }
                        if (!TextUtils.isEmpty(((dsqu) dsrmVar.b).e)) {
                            TextView textView2 = (TextView) viewInflate.findViewById(R.id.gm_tooltip_detail);
                            if (((dsqu) dsrmVar.b).f.g()) {
                                textView2.setTextColor(((Integer) ((dsqu) dsrmVar.b).f.c()).intValue());
                            }
                            if (fbcn.c()) {
                                ViewGroup.LayoutParams layoutParams2 = textView2.getLayoutParams();
                                DisplayMetrics displayMetrics2 = view3.getContext().getResources().getDisplayMetrics();
                                int iB3 = dxuy.b(displayMetrics2, 12);
                                int iB4 = dxuy.b(displayMetrics2, 6);
                                ((ViewGroup.MarginLayoutParams) layoutParams2).setMargins(iB3, iB4, iB3, iB4);
                                textView2.setLayoutParams(layoutParams2);
                            }
                            dxuy.e(textView2, ((dsqu) dsrmVar.b).e);
                        }
                        dsro dsroVar = dsrmVar.b;
                        dsrmVar.a = new dsqy(viewInflate, view3, ((dsqu) dsroVar).o, ((dsqu) dsroVar).p);
                        if (((dsqu) dsrmVar.b).b.g()) {
                            dsrmVar.a.b.b(((Integer) ((dsqu) dsrmVar.b).b.c()).intValue());
                        }
                        if (TextUtils.isEmpty(((dsqu) dsrmVar.b).h)) {
                            z = false;
                        } else {
                            final TextView textView3 = (TextView) viewInflate.findViewById(R.id.gm_tooltip_action_button);
                            final dsqy dsqyVar = dsrmVar.a;
                            dsro dsroVar2 = dsrmVar.b;
                            CharSequence charSequence = ((dsqu) dsroVar2).h;
                            ejwi ejwiVar = ((dsqu) dsroVar2).i;
                            final View.OnClickListener onClickListener = ((dsqu) dsroVar2).j;
                            if (TextUtils.isEmpty(charSequence)) {
                                textView3.setVisibility(8);
                                z = false;
                            } else {
                                textView3.setText(charSequence);
                                if (ejwiVar.g()) {
                                    textView3.setTextColor(((Integer) ejwiVar.c()).intValue());
                                }
                                textView3.setOnClickListener(new View.OnClickListener() { // from class: dsrl
                                    @Override // android.view.View.OnClickListener
                                    public final void onClick(View view4) {
                                        View.OnClickListener onClickListener2 = onClickListener;
                                        if (onClickListener2 != null) {
                                            onClickListener2.onClick(textView3);
                                        }
                                        dsqyVar.a();
                                    }
                                });
                                z = false;
                                ColorStateList colorStateList = new ColorStateList(new int[][]{new int[]{android.R.attr.state_focused}}, new int[]{Color.argb(51, 0, 0, 0)});
                                int[] iArr = ley.a;
                                len.h(textView3, colorStateList);
                                z3 = true;
                            }
                        }
                        dsqy dsqyVar2 = dsrmVar.a;
                        dsro dsroVar3 = dsrmVar.b;
                        boolean z4 = ((dsqu) dsroVar3).n == 2 ? true : z;
                        dsqx dsqxVar = dsqyVar2.b;
                        dsqxVar.d = z4;
                        dsqxVar.g = ((dsqu) dsroVar3).m;
                        if (dsqxVar.isShown()) {
                            dsqxVar.requestLayout();
                        }
                        if (!z3) {
                            dsrmVar.a.b.setOnClickListener(new View.OnClickListener() { // from class: dsri
                                @Override // android.view.View.OnClickListener
                                public final void onClick(View view4) {
                                    dsrmVar.a();
                                }
                            });
                        }
                        dsqy dsqyVar3 = dsrmVar.a;
                        PopupWindow.OnDismissListener onDismissListener2 = new PopupWindow.OnDismissListener() { // from class: dsrj
                            @Override // android.widget.PopupWindow.OnDismissListener
                            public final void onDismiss() {
                                dsrm dsrmVar2 = dsrmVar;
                                dsrmVar2.c.b(null);
                                PopupWindow.OnDismissListener onDismissListener3 = ((dsqu) dsrmVar2.b).k;
                                if (onDismissListener3 != null) {
                                    onDismissListener3.onDismiss();
                                }
                            }
                        };
                        PopupWindow popupWindow = dsqyVar3.b.c;
                        if (popupWindow != null) {
                            popupWindow.setOnDismissListener(onDismissListener2);
                        }
                        dsqy dsqyVar4 = dsrmVar.a;
                        View.OnClickListener onClickListener2 = new View.OnClickListener() { // from class: dsrk
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view4) {
                                View.OnClickListener onClickListener3 = ((dsqu) dsrmVar.b).l;
                                if (onClickListener3 != null) {
                                    onClickListener3.onClick(view4);
                                }
                            }
                        };
                        dsqx dsqxVar2 = dsqyVar4.b;
                        dsqxVar2.k = onClickListener2;
                        dsqxVar2.j = ((dsqu) dsrmVar.b).d;
                        dsrmVar.c = new dsrv(dsrmVar.d);
                        dsrv dsrvVar = dsrmVar.c;
                        dsrvVar.b = dsrmVar;
                        dsrvVar.a = dsrmVar;
                        dsrvVar.b(view3);
                        if (fbcn.b()) {
                            ejwi ejwiVarJ = !etohVar.g.isEmpty() ? ejwi.j(etohVar.g) : !etohVar.h.isEmpty() ? ejwi.j(etohVar.h) : ejud.a;
                            if (ejwiVarJ.g()) {
                                ley.p(viewA, new dsrf(dsrgVar, ejwiVarJ));
                            }
                        }
                        if (!dsrgVar.ak.booleanValue()) {
                            dsrgVar.al.b(dsrgVar.ai, dsoo.SUCCESS);
                            dsrgVar.ak = true;
                        }
                        dsrgVar.d = true;
                        return;
                    }
                    StringBuilder sb = new StringBuilder();
                    if (dsqtVar.a == null) {
                        sb.append(" targetView");
                    }
                    if (dsqtVar.o == 0) {
                        sb.append(" tapDismissalType");
                    }
                    if (dsqtVar.p == 0) {
                        sb.append(" placement");
                    }
                    if (dsqtVar.q == 0) {
                        sb.append(" alignment");
                    }
                    if (dsqtVar.n == 0) {
                        sb.append(" maxWidthPercentage");
                    }
                    throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
                } catch (dsph unused) {
                    dsrgVar.al.b(dsrgVar.ai, dsoo.FAILED_THEME_NOT_FOUND);
                    dsrgVar.a();
                }
            }
        };
        int[] iArr = ley.a;
        rootView.postOnAnimation(runnable);
    }
}
