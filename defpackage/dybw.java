package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.graphics.ColorFilter;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.RecyclerView;
import android.text.SpannableString;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.apps.messaging.R;
import com.google.android.libraries.onegoogle.account.disc.AccountParticleDisc;
import com.google.android.libraries.onegoogle.account.particle.AccountParticle;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dybw extends vo {
    public final dxxk a;
    public final ejwi d;
    public Object e;
    public ekgb g;
    private final dxyj h;
    private final dyau i;
    private final dyyb j;
    private final dyaf k;
    private final dybl l;
    private final dyqd n;
    private final boolean p;
    private final int q;
    private final List m = new ArrayList();
    private final dyay o = new dybu(this);
    public boolean f = false;
    private final lvz r = new lvz() { // from class: dybo
        @Override // defpackage.lvz
        public final void a(Object obj) {
            this.a.F();
        }
    };

    public dybw(final Context context, final dybn dybnVar, final dybk dybkVar, final dyqd dyqdVar, exbg exbgVar, dyyb dyybVar, int i, dyaf dyafVar, boolean z) {
        dyby dybyVar = (dyby) dybnVar;
        this.h = dybyVar.a;
        this.a = dybyVar.b;
        dyau dyauVar = dybyVar.c;
        this.i = dyauVar;
        this.d = dybyVar.e;
        this.j = dyybVar;
        this.k = dyafVar;
        this.n = dyqdVar;
        lbz lbzVar = new lbz() { // from class: dybp
            @Override // defpackage.lbz
            public final void accept(final Object obj) {
                final dybw dybwVar = this.a;
                if (dybwVar.d.g()) {
                    final dybn dybnVar2 = dybnVar;
                    final Context context2 = context;
                    dyqc.a(dyqdVar, new Runnable() { // from class: dybr
                        @Override // java.lang.Runnable
                        public final void run() {
                            abxi abxiVar = ((dybe) dybwVar.d.c()).b;
                            Activity activity = abxiVar.a;
                            final egbe egbeVar = (egbe) obj;
                            ejwi ejwiVarJ = ejwi.j(activity.getString(R.string.account_switch_dialog_title));
                            SpannableString spannableString = new SpannableString(activity.getString(R.string.account_switch_dialog_explanation));
                            String string = activity.getString(R.string.account_switch_dialog_positive_button_text);
                            final fcsu fcsuVar = abxiVar.b;
                            final dyaz dyazVar = new dyaz(ejwiVarJ, spannableString, ejwi.j(new dyba(string, new lbz() { // from class: abxg
                                @Override // defpackage.lbz
                                public final void accept(Object obj2) {
                                    ((abwy) fcsuVar.b()).a(new abww(abwv.SIGN_OUT_ACCOUNT, egbeVar.a()));
                                }
                            })));
                            final Context context3 = context2;
                            Drawable drawableA = dyqw.a(context3, R.drawable.quantum_gm_ic_info_outline_vd_theme_24, dypw.b(context3, R.attr.ogCustomDialogIconColor));
                            eeji eejiVar = new eeji(context3, dypw.d(context3, R.attr.ogMaterialAlertDialogCentered));
                            eejiVar.v((CharSequence) dyazVar.a.e(context3.getString(R.string.og_account_switching_deactivated)));
                            eejiVar.j(drawableA);
                            eejiVar.l(dyazVar.b);
                            ejwi ejwiVar = dyazVar.c;
                            eejiVar.s(((dyba) ((ejwt) ejwiVar).a).a, new DialogInterface.OnClickListener() { // from class: dybd
                                @Override // android.content.DialogInterface.OnClickListener
                                public final void onClick(DialogInterface dialogInterface, int i2) {
                                    ((dyba) ((ejwt) ((dyaz) dyazVar).c).a).b.accept(context3);
                                }
                            });
                            eejiVar.m(R.string.og_dismiss, null);
                            iv ivVarCreate = eejiVar.create();
                            ivVarCreate.show();
                            TextView textView = (TextView) ivVarCreate.findViewById(android.R.id.message);
                            if (textView != null) {
                                textView.setMovementMethod(LinkMovementMethod.getInstance());
                                textView.setMinHeight((int) (context3.getResources().getDisplayMetrics().density * 48.0f));
                            }
                        }
                    });
                }
            }
        };
        dywb dywbVar = dybyVar.d;
        exbgVar.getClass();
        this.l = new dybl(dyauVar, dywbVar, exbgVar, dyybVar, new dybk() { // from class: dybq
            @Override // defpackage.dybk
            public final void a(Object obj) {
                this.a.f = true;
                dybkVar.a(obj);
            }
        }, lbzVar);
        this.q = i;
        this.p = z;
    }

    public static int l(Context context) throws Resources.NotFoundException {
        Resources resources = context.getResources();
        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.account_menu_account_list_action_item_padding_start);
        int dimensionPixelSize2 = resources.getDimensionPixelSize(R.dimen.account_menu_account_list_action_item_icon_margin);
        return dimensionPixelSize + dimensionPixelSize2 + dimensionPixelSize2 + resources.getDimensionPixelSize(R.dimen.account_menu_account_list_action_item_icon_size) + resources.getDimensionPixelSize(R.dimen.account_menu_account_list_action_item_title_margin_start);
    }

    public final void F() {
        if (this.f && this.p) {
            return;
        }
        ecem.c();
        List list = this.m;
        ArrayList arrayList = new ArrayList(list);
        ekgb ekgbVarG = this.g;
        ejwi ejwiVar = this.k.a;
        if (ejwiVar.g() && ((dyak) ejwiVar.c()).c.g()) {
            ekfw ekfwVar = new ekfw();
            ekfw ekfwVar2 = new ekfw();
            int size = ekgbVarG.size();
            for (int i = 0; i < size; i++) {
                Object obj = ekgbVarG.get(i);
                if (((dyaj) ((dyak) ejwiVar.c()).c.c()).b(obj) != null) {
                    ekfwVar.h(obj);
                } else {
                    ekfwVar2.h(obj);
                }
            }
            ekfw ekfwVar3 = new ekfw();
            ekfwVar3.j(ekfwVar.g());
            ekfwVar3.j(ekfwVar2.g());
            ekgbVarG = ekfwVar3.g();
        }
        ArrayList arrayList2 = new ArrayList(ekgbVarG);
        Object obj2 = this.e;
        if (obj2 != null) {
            arrayList2.remove(obj2);
        }
        mq mqVarA = mv.a(new dybv(this, arrayList, arrayList2));
        list.clear();
        list.addAll(arrayList2);
        mqVarA.c(this);
    }

    @Override // defpackage.vo
    public final int a() {
        return this.m.size();
    }

    @Override // defpackage.vo
    public final /* bridge */ /* synthetic */ wv e(ViewGroup viewGroup, int i) {
        return new dybh(viewGroup, this.a, this.h, this.d, this.k, this.q, this.j, this.n);
    }

    @Override // defpackage.vo
    public final /* synthetic */ void g(wv wvVar, int i) {
        float f;
        float f2;
        final dybh dybhVar = (dybh) wvVar;
        final Object obj = this.m.get(i);
        final dybl dyblVar = this.l;
        View.OnClickListener onClickListener = new View.OnClickListener() { // from class: dybi
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                dybl dyblVar2 = dyblVar;
                dyau dyauVar = dyblVar2.a;
                dywc dywcVar = dyblVar2.b;
                dywcVar.a(dyauVar.a(), dyblVar2.c);
                dyblVar2.e.f(new dsve(5), view);
                dyblVar2.f.a(obj);
                dywcVar.a(dyauVar.a(), dyblVar2.d);
            }
        };
        View.OnClickListener onClickListener2 = new View.OnClickListener() { // from class: dybj
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                dyblVar.g.accept(obj);
            }
        };
        AccountParticle accountParticle = dybhVar.s;
        accountParticle.m = true;
        accountParticle.b(dybhVar.w);
        dybhVar.x = obj;
        accountParticle.i.a(obj, new dyac() { // from class: dybg
            @Override // defpackage.dyac
            public final String a(String str) {
                dybh dybhVar2 = dybhVar;
                ejwi ejwiVar = dybhVar2.t;
                Context context = dybhVar2.a.getContext();
                boolean zG = ejwiVar.g();
                int i2 = R.string.og_use_account_a11y_no_period;
                if (zG && ((dybe) ejwiVar.c()).a.a(obj)) {
                    ejwiVar.c();
                    i2 = R.string.og_account_deactivated_a11y;
                }
                return context.getString(i2, str);
            }
        });
        ejwi ejwiVar = dybhVar.t;
        boolean z = ejwiVar.g() && ((dybe) ejwiVar.c()).a.a(obj);
        if (true == z) {
            onClickListener = onClickListener2;
        }
        accountParticle.setOnClickListener(onClickListener);
        TextView textView = accountParticle.k;
        float f3 = 1.0f;
        if (z) {
            ejwiVar.c();
            f = 0.62f;
        } else {
            f = 1.0f;
        }
        textView.setAlpha(f);
        TextView textView2 = accountParticle.l;
        if (z) {
            ejwiVar.c();
            f2 = 0.74f;
        } else {
            f2 = 1.0f;
        }
        textView2.setAlpha(f2);
        AccountParticleDisc accountParticleDisc = accountParticle.j;
        if (z) {
            ejwiVar.c();
            f3 = 0.38f;
        }
        accountParticleDisc.setAlpha(f3);
        if (z) {
            ColorMatrix colorMatrix = new ColorMatrix();
            colorMatrix.setSaturation(0.0f);
            accountParticleDisc.a.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
        } else {
            accountParticleDisc.a.setColorFilter((ColorFilter) null);
        }
        accountParticle.findViewById(R.id.og_account_deactivated_help_tooltip).setVisibility(true != z ? 8 : 0);
        ejwi ejwiVar2 = dybhVar.v;
        if (ejwiVar2.g() && ((dyak) ejwiVar2.c()).c.g()) {
            ((lvv) ((dyak) ejwiVar2.c()).c.c()).f(((dyak) ejwiVar2.c()).a, dybhVar.u);
        }
    }

    @Override // defpackage.vo
    public final void gI(RecyclerView recyclerView) {
        dyau dyauVar = this.i;
        dyauVar.c(this.o);
        this.e = dyauVar.a();
        this.g = ekgb.n(dyauVar.b());
        ejwi ejwiVar = this.k.a;
        if (ejwiVar.g() && ((dyak) ejwiVar.c()).c.g()) {
            ((lvv) ((dyak) ejwiVar.c()).c.c()).f(((dyak) ejwiVar.c()).a, this.r);
        }
        F();
    }

    @Override // defpackage.vo
    public final void h(RecyclerView recyclerView) {
        this.i.d(this.o);
        ejwi ejwiVar = this.k.a;
        if (ejwiVar.g() && ((dyak) ejwiVar.c()).c.g()) {
            ejwi ejwiVar2 = ((dyak) ejwiVar.c()).c;
            ((lvv) ejwiVar2.c()).k(this.r);
        }
        this.m.clear();
    }

    @Override // defpackage.vo
    public final /* bridge */ /* synthetic */ void k(wv wvVar) {
        dybh dybhVar = (dybh) wvVar;
        AccountParticle accountParticle = dybhVar.s;
        accountParticle.gW(dybhVar.w);
        accountParticle.m = false;
        ejwi ejwiVar = dybhVar.v;
        if (ejwiVar.g() && ((dyak) ejwiVar.c()).c.g()) {
            ((lvv) ((dyak) ejwiVar.c()).c.c()).k(dybhVar.u);
        }
    }
}
