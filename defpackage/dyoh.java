package defpackage;

import android.app.Dialog;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.apps.messaging.R;
import com.google.android.libraries.onegoogle.popovercontainer.ExpandableDialogView;
import com.google.android.material.button.MaterialButton;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dyoh {
    public final dydh a;
    public final dyay b;
    private final dzdb c;
    private final dzcx d;
    private final dzcx e;
    private final dzcx f;
    private final dzcx g;
    private final dzcx h;
    private final dzcx i;
    private final dzcx j;
    private final dzcx k;
    private final dzcx l = new dzcx() { // from class: dynv
        @Override // defpackage.dzcx
        public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
            return dyoh.c(layoutInflater);
        }
    };
    private int m;

    public dyoh(final dydh dydhVar, final dzdb dzdbVar, final exbg exbgVar) {
        dzda dzdaVar;
        dzcz dzczVar;
        dzcy dzcyVar;
        dyyb dyybVar;
        dyrh dyrhVar;
        this.a = dydhVar;
        this.c = dzdbVar;
        new dyog(dzdbVar);
        dzbr dzbrVar = new dzbr();
        dzbrVar.a = new dzda() { // from class: dzcr
            @Override // defpackage.dzda
            public final void a(View view) {
            }
        };
        dzbrVar.b = new dzcz() { // from class: dzcs
            @Override // defpackage.dzcz
            public final void a() {
            }
        };
        dzbrVar.c = new dzcy() { // from class: dzct
            @Override // defpackage.dzcy
            public final void a() {
            }
        };
        dzbrVar.a();
        dzbrVar.b();
        dzbrVar.d = new dzcu();
        dzbrVar.a = new dzda() { // from class: dyns
            @Override // defpackage.dzda
            public final void a(View view) {
                dyoh dyohVar = this.a;
                dydm dydmVar = (dydm) dyohVar.a;
                dydmVar.k.a(view, true != ((dyii) dydmVar.e).g.e() ? 90575 : 90576);
                dyohVar.d(37);
            }
        };
        dzbrVar.b = new dzcz() { // from class: dynt
            @Override // defpackage.dzcz
            public final void a() {
                this.a.d(38);
            }
        };
        dzbrVar.c = new dzcy() { // from class: dynu
            @Override // defpackage.dzcy
            public final void a() {
                dyif dyifVar = ((dydm) this.a.a).e;
            }
        };
        dydm dydmVar = (dydm) dydhVar;
        dzbrVar.d = dydmVar.k;
        dyif dyifVar = dydmVar.e;
        dzbrVar.a();
        dyif dyifVar2 = ((dydm) dydhVar).e;
        dzbrVar.b();
        dzbrVar.e = ((dyii) ((dydm) dydhVar).e).o;
        if (dzbrVar.f != 1 || (dzdaVar = dzbrVar.a) == null || (dzczVar = dzbrVar.b) == null || (dzcyVar = dzbrVar.c) == null || (dyybVar = dzbrVar.d) == null || dzbrVar.g == 0 || (dyrhVar = dzbrVar.e) == null) {
            StringBuilder sb = new StringBuilder();
            if (dzbrVar.a == null) {
                sb.append(" onViewCreatedCallback");
            }
            if (dzbrVar.b == null) {
                sb.append(" onDismissCallback");
            }
            if (dzbrVar.c == null) {
                sb.append(" onDestroyCallback");
            }
            if (dzbrVar.d == null) {
                sb.append(" visualElements");
            }
            if (dzbrVar.f == 0) {
                sb.append(" isExperimental");
            }
            if (dzbrVar.g == 0) {
                sb.append(" largeScreenDialogAlignment");
            }
            if (dzbrVar.e == null) {
                sb.append(" materialVersion");
            }
            throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
        }
        dzbs dzbsVar = new dzbs(dzdaVar, dzczVar, dzcyVar, dyybVar, dyrhVar);
        if (dzdbVar.an == null) {
            ejwl.m(dzdbVar.al == null, "initialize() must be called before setViewProviders()");
            dzdbVar.an = dzbsVar;
            dzdbVar.ao.b();
        }
        final dyod dyodVar = new dyod(dzdbVar);
        this.d = new dzcx() { // from class: dyop
            @Override // defpackage.dzcx
            public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
                dyas dyasVar = new dyas(layoutInflater.getContext());
                final dydh dydhVar2 = dydhVar;
                dydm dydmVar2 = (dydm) dydhVar2;
                dyjb dyjbVar = ((dyii) dydmVar2.e).e;
                final dyan dyanVar = new dyan(dydmVar2.c, ejud.a, dydmVar2.m);
                lcj lcjVar = new lcj() { // from class: dyoq
                    @Override // defpackage.lcj
                    public final Object a() {
                        dydm dydmVar3 = (dydm) dydhVar2;
                        ejwi ejwiVar = dydmVar3.h;
                        return dydmVar3.b.a();
                    }
                };
                dywb dywbVar = dydmVar2.f;
                exbg exbgVar2 = exbgVar;
                if (exbgVar2 == null) {
                    throw new NullPointerException("Null logContext");
                }
                dyqd dyqdVar = dyodVar;
                dyyb dyybVar2 = dydmVar2.k;
                dxxj dxxjVar = (dxxj) dyjbVar.c().e(new dxxj() { // from class: dyor
                    @Override // defpackage.dxxj
                    public final void a(View view, Object obj) {
                        dyan dyanVar2 = dyanVar;
                        dyat.a(view, dyanVar2.b, etzq.MISC_PRIVACY_POLICY_SCREEN, dyanVar2.a, obj, "https://www.google.com/policies/privacy");
                    }
                });
                dxxj dxxjVar2 = (dxxj) dyjbVar.d().e(new dxxj() { // from class: dyos
                    @Override // defpackage.dxxj
                    public final void a(View view, Object obj) {
                        dyan dyanVar2 = dyanVar;
                        dyat.a(view, dyanVar2.b, etzq.TERMS_OF_SERVICE_SCREEN, dyanVar2.a, obj, "https://myaccount.google.com/termsofservice");
                    }
                });
                ejwi ejwiVarB = dyjbVar.b();
                ejwi ejwiVarA = dyjbVar.a();
                ejwl.a(true);
                dyam dyamVar = new dyam(lcjVar, dywbVar, exbgVar2, dyybVar2, dxxjVar, dxxjVar2, ejwiVarB, ejwiVarA, dyqdVar);
                dyasVar.o = dyamVar.b;
                dyasVar.p = dyamVar.c;
                dyasVar.t = dyamVar.d;
                dyasVar.q = dyamVar.a;
                dyasVar.s = dyamVar.g;
                ArrayList arrayList = dyasVar.n;
                arrayList.clear();
                dyasVar.i.setOnClickListener(dyasVar.g(dyamVar.e, 18));
                dyasVar.j.setOnClickListener(dyasVar.g(dyamVar.f, 19));
                arrayList.add(new dyar(dyasVar));
                dyasVar.r = new dyaq(dyasVar);
                dyasVar.b(dyasVar.t);
                int iC = dypw.c(dyasVar.getContext(), R.attr.ogContainerInternalAdditionalHorizontalSpacing) + dypw.c(dyasVar.getContext(), R.attr.ogContainerExternalHorizontalSpacing);
                dyasVar.setPadding(dyasVar.getPaddingLeft() + iC, dyasVar.getPaddingTop(), dyasVar.getPaddingRight() + iC, dyasVar.getPaddingBottom());
                return dyasVar;
            }
        };
        this.e = new dzcx() { // from class: dyph
            @Override // defpackage.dzcx
            public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
                Context context = layoutInflater.getContext();
                TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(null, dyno.a, R.attr.ogAccountMenuStyle, R.style.OneGoogle_AccountMenu_DayNight);
                try {
                    typedArrayObtainStyledAttributes.getColor(4, dynn.a(context, R.color.og_background_light));
                    typedArrayObtainStyledAttributes.getColor(10, dynn.a(context, R.color.og_default_icon_color_light));
                    typedArrayObtainStyledAttributes.getColor(11, dynn.a(context, R.color.og_incognito_top_tight_icon_color_light));
                    typedArrayObtainStyledAttributes.getColor(8, dynn.a(context, R.color.og_menu_title_color_light));
                    typedArrayObtainStyledAttributes.getColor(9, dynn.a(context, R.color.google_white));
                    Drawable drawableA = ku.a(context, typedArrayObtainStyledAttributes.getResourceId(2, R.drawable.googlelogo_standard_color_74x24_vd));
                    typedArrayObtainStyledAttributes.recycle();
                    ImageView imageView = new ImageView(layoutInflater.getContext());
                    imageView.setImageDrawable(drawableA);
                    return imageView;
                } catch (Throwable th) {
                    typedArrayObtainStyledAttributes.recycle();
                    throw th;
                }
            }
        };
        this.f = new dzcx() { // from class: dypg
            @Override // defpackage.dzcx
            public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
                Context context = layoutInflater.getContext();
                TextView textView = new TextView(context);
                textView.setText(R.string.og_choose_an_account_title);
                textView.setTextAppearance(dypw.d(context, R.attr.ogTextAppearanceSubhead1));
                textView.setTextColor(dqoc.a(context, R.attr.colorOnSurface));
                textView.setGravity(1);
                textView.setMaxLines(2);
                textView.setEllipsize(TextUtils.TruncateAt.END);
                dxxt.a(textView);
                return textView;
            }
        };
        this.g = new dzcx() { // from class: dynw
            @Override // defpackage.dzcx
            public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
                dzdb dzdbVar2 = dzdbVar;
                if (dzdbVar2.Q == null) {
                    return dyoh.c(layoutInflater);
                }
                final exbg exbgVar2 = exbgVar;
                dyqd dyqdVar = dyodVar;
                final dydh dydhVar2 = dydhVar;
                dypm dypmVar = new dypm(layoutInflater.getContext());
                lvj lvjVarQ = dzdbVar2.Q();
                View viewFindViewById = dypmVar.findViewById(R.id.sign_in_button);
                dyqs dyqsVar = new dyqs(new View.OnClickListener() { // from class: dypl
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        exbf exbfVar = (exbf) exbgVar2.toBuilder();
                        exbfVar.copyOnWrite();
                        exbg exbgVar3 = (exbg) exbfVar.instance;
                        exbgVar3.c = 10;
                        exbgVar3.b |= 1;
                        exbg exbgVar4 = (exbg) exbfVar.build();
                        dydm dydmVar2 = (dydm) dydhVar2;
                        dydmVar2.f.a(null, exbgVar4);
                        ((dydk) dydmVar2.d).b.a(view, null);
                    }
                });
                dyqsVar.d = dyqdVar.b();
                dyqsVar.e = dyqdVar.a();
                viewFindViewById.setOnClickListener(new dyqq(dyqsVar));
                dyom dyomVar = new dyom(dydhVar2, dypmVar.getContext(), lvjVarQ);
                dyomVar.b();
                dyomVar.c();
                dydq dydqVar = new dydq(dydhVar2);
                dydqVar.b();
                dyomVar.d = dydqVar.a();
                dyol dyolVarA = dyomVar.a();
                int iC = dypw.c(dypmVar.getContext(), R.attr.ogContainerInternalAdditionalHorizontalSpacing) + dypw.c(dypmVar.getContext(), R.attr.ogContainerExternalHorizontalSpacing);
                dymv dymvVar = ((dyii) ((dydm) dydhVar2).e).o;
                dyoi dyoiVar = (dyoi) dyolVarA;
                dypm.b((RecyclerView) dypmVar.findViewById(R.id.cards_and_actions), dypmVar.a(dyoiVar.a, dymvVar, dydhVar2, dyqdVar, iC));
                dypm.b((RecyclerView) dypmVar.findViewById(R.id.common_actions), dypmVar.a(dyoiVar.b, dymvVar, dydhVar2, dyqdVar, iC));
                return dypmVar;
            }
        };
        this.h = new dzcx() { // from class: dynx
            @Override // defpackage.dzcx
            public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
                dzdb dzdbVar2 = dzdbVar;
                if (dzdbVar2.Q == null) {
                    return dyoh.c(layoutInflater);
                }
                exbg exbgVar2 = exbgVar;
                final dyqd dyqdVar = dyodVar;
                final dydh dydhVar2 = dydhVar;
                lvj lvjVarQ = dzdbVar2.Q();
                dyoo dyooVar = new dyoo(layoutInflater.getContext());
                dyaf dyafVarB = dyoh.b(dydhVar2, lvjVarQ);
                int iC = dypw.c(dyooVar.getContext(), R.attr.ogContainerInternalAdditionalHorizontalSpacing);
                dydm dydmVar2 = (dydm) dydhVar2;
                dyoo.b((RecyclerView) dyooVar.findViewById(R.id.accounts), new dybw(dyooVar.getContext(), dynr.a(dydhVar2), new dybk() { // from class: dyon
                    @Override // defpackage.dybk
                    public final void a(Object obj) {
                        dyqdVar.a().run();
                        ((dydm) dydhVar2).b.h(obj);
                    }
                }, dyqdVar, exbgVar2, dydmVar2.k, iC, dyafVarB, true));
                dyom dyomVar = new dyom(dydhVar2, dyooVar.getContext(), lvjVarQ);
                dyomVar.e = dynq.a(dyooVar.getContext(), dydhVar2, exbgVar2);
                dyomVar.b();
                dyomVar.c();
                dydq dydqVar = new dydq(dydhVar2);
                dydqVar.b();
                dyomVar.d = dydqVar.a();
                dyol dyolVarA = dyomVar.a();
                dymv dymvVar = ((dyii) dydmVar2.e).o;
                dyoi dyoiVar = (dyoi) dyolVarA;
                dyoo.b((RecyclerView) dyooVar.findViewById(R.id.cards_and_actions), dyooVar.a(dyoiVar.a, dymvVar, dydhVar2, dyqdVar, iC));
                dyoo.b((RecyclerView) dyooVar.findViewById(R.id.common_actions), dyooVar.a(dyoiVar.b, dymvVar, dydhVar2, dyqdVar, iC + dypw.c(dyooVar.getContext(), R.attr.ogContainerExternalHorizontalSpacing)));
                return dyooVar;
            }
        };
        this.i = new dzcx() { // from class: dyny
            /* JADX WARN: Removed duplicated region for block: B:16:0x0103  */
            /* JADX WARN: Removed duplicated region for block: B:36:0x0238  */
            /* JADX WARN: Type inference failed for: r11v6, types: [dyja, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r9v11, types: [dyja, java.lang.Object] */
            @Override // defpackage.dzcx
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final android.view.View a(android.view.LayoutInflater r31, android.view.ViewGroup r32) {
                /*
                    Method dump skipped, instructions count: 839
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.dyny.a(android.view.LayoutInflater, android.view.ViewGroup):android.view.View");
            }
        };
        this.j = new dzcx() { // from class: dynz
            @Override // defpackage.dzcx
            public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
                dypj dypjVar = new dypj(layoutInflater.getContext());
                lvj lvjVarQ = dzdbVar.Q();
                ejwl.a(false);
                MaterialButton materialButton = (MaterialButton) dypjVar.findViewById(R.id.turn_off_incognito_button);
                final dydh dydhVar2 = dydhVar;
                dydm dydmVar2 = (dydm) dydhVar2;
                dyiy dyiyVar = (dyiy) ((dyii) dydmVar2.e).b.c();
                materialButton.setText(dyiyVar.b());
                dypjVar.getContext();
                materialButton.d(dyiyVar.c());
                final exbg exbgVar2 = exbgVar;
                dyqs dyqsVar = new dyqs(new View.OnClickListener() { // from class: dypi
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        dydm dydmVar3 = (dydm) dydhVar2;
                        exbf exbfVar = (exbf) exbgVar2.toBuilder();
                        exbfVar.copyOnWrite();
                        exbg exbgVar3 = (exbg) exbfVar.instance;
                        exbgVar3.c = 7;
                        exbgVar3.b |= 1;
                        ((dywa) dydmVar3.f).b(3, null, (exbg) exbfVar.build());
                    }
                });
                dyqd dyqdVar = dyodVar;
                dyqsVar.d = dyqdVar.b();
                dyqsVar.e = dyqdVar.a();
                materialButton.setOnClickListener(new dyqq(dyqsVar));
                dyom dyomVar = new dyom(dydhVar2, dypjVar.getContext(), lvjVarQ);
                dydq dydqVar = new dydq(dydhVar2);
                dydqVar.b();
                dyomVar.d = dydqVar.a();
                lvv lvyVar = ((dyoi) dyomVar.a()).b;
                Context context = dypjVar.getContext();
                if (lvyVar == null) {
                    lvyVar = new lvy();
                }
                dyfx dyfxVar = new dyfx(context, dydmVar2.b, lvyVar, dyqdVar, dydmVar2.k, dypw.c(dypjVar.getContext(), R.attr.ogContainerInternalAdditionalHorizontalSpacing) + dypw.c(dypjVar.getContext(), R.attr.ogContainerExternalHorizontalSpacing));
                RecyclerView recyclerView = dypjVar.a;
                dyra.a(recyclerView, dyfxVar);
                recyclerView.setNestedScrollingEnabled(false);
                dypjVar.getContext();
                recyclerView.ao(new LinearLayoutManager());
                return dypjVar;
            }
        };
        this.k = new dzcx() { // from class: dyoa
            @Override // defpackage.dzcx
            public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
                FrameLayout frameLayout = (FrameLayout) layoutInflater.inflate(R.layout.og_loading_indicator, viewGroup, false);
                frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, viewGroup.getContext().getResources().getDimensionPixelSize(R.dimen.og_account_menu_loading_height)));
                frameLayout.setPadding(0, 0, 0, viewGroup.getContext().getResources().getDimensionPixelOffset(R.dimen.og_dialog_header_close_button_size));
                return frameLayout;
            }
        };
        this.b = new dyoe(this);
        dyof dyofVar = new dyof(this, dydhVar);
        dyof dyofVar2 = dzdbVar.ap;
        if (dyofVar2 != null && dzdbVar.aj) {
            dyofVar2.b();
        }
        dzdbVar.ap = dyofVar;
        if (dzdbVar.aj) {
            dyofVar.a();
        }
    }

    public static final dyaf b(dydh dydhVar, lvj lvjVar) {
        ejud ejudVar = ejud.a;
        ejwi ejwiVar = ((dyii) ((dydm) dydhVar).e).h;
        if (ejwiVar == null) {
            throw new NullPointerException("Null criticalAlertFeature");
        }
        dyag dyagVarA = dyaf.a();
        dyagVarA.b(dyah.a(lvjVar, ejudVar, ejwiVar));
        return dyagVarA.a();
    }

    static /* synthetic */ View c(LayoutInflater layoutInflater) {
        View view = new View(layoutInflater.getContext());
        view.setVisibility(8);
        return view;
    }

    public final void a() {
        int i;
        ExpandableDialogView expandableDialogView;
        dydm dydmVar = (dydm) this.a;
        dydi dydiVar = dydmVar.b;
        if (dydiVar.e()) {
            ejwi ejwiVar = dydmVar.h;
            i = dydiVar.b().isEmpty() ? 3 : dydiVar.a() != null ? 5 : 4;
        } else {
            i = 1;
        }
        int i2 = this.m;
        if (i != i2) {
            this.m = i;
            ejwl.l(true);
            int i3 = i - 1;
            dzcx dzcxVar = i3 != 0 ? i3 != 3 ? this.e : this.f : this.l;
            if (dzcxVar == null) {
                throw new NullPointerException("Null headerViewProvider");
            }
            dzcx dzcxVar2 = i3 != 0 ? i3 != 1 ? i3 != 2 ? i3 != 3 ? this.i : this.h : this.g : this.j : this.k;
            if (dzcxVar2 == null) {
                throw new NullPointerException("Null contentViewProvider");
            }
            dzcx dzcxVar3 = i == 1 ? this.l : this.d;
            if (dzcxVar3 == null) {
                throw new NullPointerException("Null footerViewProvider");
            }
            int iA = i3 != 1 ? i3 != 2 ? i3 != 3 ? R.string.og_account_and_settings : R.string.og_choose_an_account_title : R.string.og_sign_in_ : ((dyiy) ((dyii) dydmVar.e).b.c()).a();
            dzdb dzdbVar = this.c;
            dzbt dzbtVar = new dzbt(dzcxVar, dzcxVar2, dzcxVar3, iA);
            ecem.c();
            dzdbVar.al = dzbtVar;
            ExpandableDialogView expandableDialogView2 = dzdbVar.am;
            if (expandableDialogView2 != null) {
                dzdbVar.aV(dzbtVar, expandableDialogView2);
            }
            Dialog dialog = dzdbVar.d;
            if (dialog != null) {
                dialog.setTitle(dzbtVar.d);
            }
        }
        if (i2 == 0) {
            dzdb dzdbVar2 = this.c;
            ecem.c();
            SparseArray sparseArray = dzdbVar2.ak;
            if (sparseArray == null || (expandableDialogView = dzdbVar2.am) == null) {
                return;
            }
            expandableDialogView.restoreHierarchyState(sparseArray);
        }
    }

    public final void d(int i) {
        dydm dydmVar = (dydm) this.a;
        Object objA = dydmVar.b.a();
        exbf exbfVar = (exbf) exbg.a.createBuilder();
        exbfVar.copyOnWrite();
        exbg exbgVar = (exbg) exbfVar.instance;
        exbgVar.d = 1;
        exbgVar.b |= 2;
        exbfVar.copyOnWrite();
        exbg exbgVar2 = (exbg) exbfVar.instance;
        exbgVar2.f = 8;
        exbgVar2.b |= 32;
        exbfVar.copyOnWrite();
        exbg exbgVar3 = (exbg) exbfVar.instance;
        exbgVar3.e = 3;
        exbgVar3.b = 8 | exbgVar3.b;
        exbfVar.copyOnWrite();
        exbg exbgVar4 = (exbg) exbfVar.instance;
        exbgVar4.c = i - 1;
        exbgVar4.b |= 1;
        dydmVar.f.a(objA, (exbg) exbfVar.build());
    }
}
