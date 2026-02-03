package com.google.android.libraries.onegoogle.expresssignin;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.apps.messaging.R;
import com.google.android.libraries.onegoogle.accountmanagement.SelectedAccountView;
import defpackage.dypw;
import defpackage.dyqh;
import defpackage.dyqi;
import defpackage.dyrs;
import defpackage.dysm;
import defpackage.dytu;
import defpackage.dytx;
import defpackage.dyud;
import defpackage.dyuh;
import defpackage.dyuu;
import defpackage.dyux;
import defpackage.ejud;
import defpackage.ejwi;
import defpackage.ejwl;
import defpackage.ejxr;
import defpackage.fbgk;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ExpressSignInLayout<AccountT> extends FrameLayout implements dyqh {
    public dytu a;
    private final dyqi b;

    public ExpressSignInLayout(Context context) {
        this(context, null);
    }

    public final void a(dytx dytxVar, dyud dyudVar) {
        c(dytxVar, dyudVar, false, ejud.a);
    }

    @Override // android.view.ViewGroup
    public final void addView(final View view, final int i, final ViewGroup.LayoutParams layoutParams) {
        d(new dysm() { // from class: dysf
            @Override // defpackage.dysm
            public final void a(dytu dytuVar) {
                dytuVar.addView(view, i, layoutParams);
            }
        });
    }

    @Override // defpackage.dyqh
    public final boolean b() {
        return this.a != null;
    }

    public final void c(final dytx dytxVar, final dyud dyudVar, boolean z, final ejwi ejwiVar) {
        ejwl.m(!b(), "initialize() has to be called only once.");
        dyuh dyuhVar = (dyuh) ((dyrs) dyudVar).b;
        dyux dyuxVar = dyuhVar.g;
        Context context = getContext();
        context.getClass();
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, dyuxVar.a);
        dytu dytuVar = new dytu(contextThemeWrapper, z, (dyuu) dyuhVar.f.d(((!z && fbgk.a.get().b(contextThemeWrapper) && dypw.f(contextThemeWrapper)) || (z && fbgk.a.get().a(contextThemeWrapper))) ? new ejxr() { // from class: dysg
            @Override // defpackage.ejxr
            public final Object get() {
                return new dyuw();
            }
        } : new ejxr() { // from class: dysh
            @Override // defpackage.ejxr
            public final Object get() {
                return new dyuv();
            }
        }));
        this.a = dytuVar;
        super.addView(dytuVar, -1, new ViewGroup.LayoutParams(-1, -1));
        d(new dysm() { // from class: dysi
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r3v3, types: [ach] */
            /* JADX WARN: Type inference failed for: r3v30 */
            /* JADX WARN: Type inference failed for: r3v31 */
            @Override // defpackage.dysm
            public final void a(final dytu dytuVar2) {
                ?? C;
                ekgb ekgbVarR;
                final dytx dytxVar2 = dytxVar;
                dytuVar2.e = dytxVar2;
                Context context2 = dytuVar2.getContext();
                ejwi ejwiVar2 = ejwiVar;
                if (ejwiVar2.g()) {
                    C = ejwiVar2.c();
                } else {
                    ach achVar = (ach) dyqe.a(context2, ach.class);
                    ejwl.b(achVar != null, "Express Sign In's onBackPressedDispatcherOwner has to be set or one of the context baseContexts should be a OnBackPressedDispatcherOwner");
                    C = achVar;
                }
                final dyud dyudVar2 = dyudVar;
                dytuVar2.x = C;
                dyuo dyuoVar = ((dyrs) dyudVar2).b;
                dytuVar2.q = (Button) dytuVar2.findViewById(R.id.continue_as_button);
                dytuVar2.r = (Button) dytuVar2.findViewById(R.id.secondary_action_button);
                dytuVar2.s = new dyre(dytuVar2.r);
                dytuVar2.t = new dyre(dytuVar2.q);
                dyrq dyrqVar = (dyrq) dytxVar2;
                final dyyb dyybVar = dyrqVar.e;
                dyybVar.a(dytuVar2, 90569);
                dytuVar2.b(dyybVar);
                dyuh dyuhVar2 = (dyuh) dyuoVar;
                dytuVar2.d = dyuhVar2.h;
                ejwi ejwiVar3 = dyuhVar2.d;
                if (ejwiVar3.g()) {
                    ejwiVar3.c();
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -1);
                    layoutParams.gravity = 17;
                    FrameLayout frameLayout = (FrameLayout) dytuVar2.findViewById(R.id.express_sign_in_header_logo_container);
                    Context context3 = dytuVar2.getContext();
                    ImageView imageView = new ImageView(context3);
                    imageView.setImageDrawable(ku.a(context3, true != dyqv.g(context3) ? R.drawable.googlelogo_light_color_74x24_vd : R.drawable.googlelogo_standard_color_74x24_vd));
                    frameLayout.addView(imageView, layoutParams);
                    frameLayout.setVisibility(0);
                }
                dyuj dyujVar = (dyuj) dyuhVar2.e.f();
                dyuy dyuyVar = (dyuy) dyuhVar2.a.f();
                if (dyujVar != null) {
                    dytuVar2.w = dyujVar;
                    dytuVar2.p(new View.OnClickListener() { // from class: dyst
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            dytu dytuVar3 = dytuVar2;
                            ((dyrq) dytuVar3.e).e.f(new dsve(5), view);
                            dytuVar3.c();
                        }
                    }, dyujVar.a());
                } else if (dyuyVar != null) {
                    View.OnClickListener onClickListener = new View.OnClickListener() { // from class: dyss
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            dytu dytuVar3 = dytuVar2;
                            ((dyrq) dytuVar3.e).e.f(new dsve(5), view);
                            dytuVar3.g(dyudVar2, null);
                        }
                    };
                    Context context4 = dytuVar2.getContext();
                    dytuVar2.p(onClickListener, ekgb.t(context4.getResources().getString(R.string.sign_in_app_name_without_account, dyuyVar.a), context4.getResources().getString(R.string.sign_in_without_account), context4.getResources().getString(R.string.sign_in_without_account_short)));
                }
                dytuVar2.v = null;
                dyul dyulVar = dytuVar2.v;
                dyuk dyukVar = (dyuk) dyuhVar2.c.f();
                if (dyukVar != null) {
                    dytuVar2.findViewById(R.id.esi_custom_header_container).setVisibility(0);
                    TextView textView = (TextView) dytuVar2.findViewById(R.id.esi_custom_header_title);
                    TextView textView2 = (TextView) dytuVar2.findViewById(R.id.esi_custom_header_subtitle);
                    textView.setText(dyukVar.d());
                    dxxt.a(textView);
                    textView2.setVisibility(8);
                }
                dytuVar2.A = dyuhVar2.i;
                if (ejwiVar3.g()) {
                    Button button = dytuVar2.k;
                    ((ViewGroup.MarginLayoutParams) button.getLayoutParams()).topMargin = dytuVar2.getResources().getDimensionPixelSize(R.dimen.og_sign_in_button_with_google_logo_top_margin);
                    button.requestLayout();
                    View viewFindViewById = dytuVar2.findViewById(R.id.esi_custom_header_container);
                    ((ViewGroup.MarginLayoutParams) viewFindViewById.getLayoutParams()).topMargin = 0;
                    viewFindViewById.requestLayout();
                }
                dyul dyulVar2 = dytuVar2.v;
                if (dytuVar2.c) {
                    Button button2 = dytuVar2.k;
                    ((ViewGroup.MarginLayoutParams) button2.getLayoutParams()).bottomMargin = 0;
                    button2.requestLayout();
                    ((ViewGroup.MarginLayoutParams) dytuVar2.q.getLayoutParams()).bottomMargin = 0;
                    dytuVar2.q.requestLayout();
                }
                dytuVar2.g.setOnClickListener(new View.OnClickListener() { // from class: dyta
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        dytu dytuVar3 = dytuVar2;
                        if (dytuVar3.b) {
                            dyybVar.f(new dsve(5), view);
                            dytuVar3.u(32);
                            dytuVar3.l(false);
                        }
                    }
                });
                SelectedAccountView selectedAccountView = dytuVar2.j;
                dxyj dxyjVar = dyrqVar.c;
                dxxk dxxkVar = ((dyrm) dyrqVar.f).a;
                selectedAccountView.j(dxyjVar, dxxkVar, dyaf.a().a(), new dyac() { // from class: dytb
                    @Override // defpackage.dyac
                    public final String a(String str) {
                        return dytuVar2.getResources().getString(R.string.og_selected_account_a11y, str);
                    }
                }, dytuVar2.getResources().getString(R.string.og_collapse_account_list_a11y), dytuVar2.getResources().getString(R.string.og_expand_account_list_a11y));
                dybk dybkVar = new dybk() { // from class: dytc
                    @Override // defpackage.dybk
                    public final void a(Object obj) {
                        ((dyrq) dytxVar2).b.h(obj);
                        final dytu dytuVar3 = dytuVar2;
                        dytuVar3.post(new Runnable() { // from class: dysz
                            @Override // java.lang.Runnable
                            public final void run() {
                                dytuVar3.l(false);
                            }
                        });
                    }
                };
                Context context5 = dytuVar2.getContext();
                dybx dybxVar = new dybx();
                dybxVar.b = dxxkVar;
                dyax dyaxVar = dyrqVar.b;
                dybxVar.c = dyaxVar;
                dybxVar.a = dxyjVar;
                dybxVar.d = dyrqVar.d;
                dybn dybnVarA = dybxVar.a();
                dyti dytiVar = new dyti();
                exbg exbgVarA = dytu.a();
                int i = ((dyrn) dytuVar2.f).c;
                dybw dybwVar = new dybw(context5, dybnVarA, dybkVar, dytiVar, exbgVarA, dyybVar, i, dyaf.a().a(), false);
                Context context6 = dytuVar2.getContext();
                dypt dyptVarA = dypp.a(dyaxVar, new dxxj() { // from class: dysq
                    @Override // defpackage.dxxj
                    public final void a(View view, Object obj) {
                        dytu dytuVar3 = dytuVar2;
                        dytuVar3.j(view);
                        dytuVar3.l(false);
                    }
                }, dytuVar2.getContext());
                if (dyptVarA == null) {
                    int i2 = ekgb.d;
                    ekgbVarR = ekoe.a;
                } else {
                    ekgbVarR = ekgb.r(dyptVarA);
                }
                dyrk dyrkVar = new dyrk(context6, ekgbVarR, dyybVar, i);
                dytu.o(dytuVar2.h, dybwVar);
                dytu.o(dytuVar2.i, dyrkVar);
                dytuVar2.f(dybwVar, dyrkVar);
                dytj dytjVar = new dytj(dytuVar2, dybwVar, dyrkVar);
                dybwVar.A(dytjVar);
                dyrkVar.A(dytjVar);
                dytuVar2.q.setOnClickListener(new View.OnClickListener() { // from class: dytd
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        dyybVar.f(new dsve(5), view);
                        dytuVar2.g(dyudVar2, ((dyrq) dytxVar2).b.a());
                    }
                });
                final dyte dyteVar = new dyte(dytuVar2, dyudVar2);
                dytuVar2.k.setOnClickListener(new View.OnClickListener() { // from class: dyso
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        dyybVar.f(new dsve(5), view);
                        ((dyrq) dytxVar2).b.d = dyteVar;
                        dytuVar2.j(view);
                    }
                });
                dytk dytkVar = new dytk(dytuVar2, dytxVar2);
                dytuVar2.addOnAttachStateChangeListener(dytkVar);
                dytl dytlVar = new dytl(dytuVar2);
                dytuVar2.addOnAttachStateChangeListener(dytlVar);
                int[] iArr = ley.a;
                if (dytuVar2.isAttachedToWindow()) {
                    dytkVar.onViewAttachedToWindow(dytuVar2);
                    dytlVar.onViewAttachedToWindow(dytuVar2);
                }
                dytuVar2.k(false);
            }
        });
        this.b.b();
    }

    public final void d(final dysm dysmVar) {
        this.b.c(new Runnable() { // from class: dysj
            @Override // java.lang.Runnable
            public final void run() {
                dytu dytuVar = this.a.a;
                dytuVar.getClass();
                dysmVar.a(dytuVar);
            }
        });
    }

    public ExpressSignInLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ExpressSignInLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.b = new dyqi(this);
    }
}
