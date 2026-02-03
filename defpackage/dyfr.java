package defpackage;

import android.content.Context;
import android.graphics.drawable.PaintDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.graphics.drawable.shapes.RoundRectShape;
import android.graphics.drawable.shapes.Shape;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.google.android.apps.messaging.R;
import com.google.android.libraries.onegoogle.accountmenu.cards.DynamicCardRootView;

/* compiled from: PG */
/* loaded from: classes4.dex */
abstract class dyfr extends wv {
    public final Context s;
    public final dyyb t;
    public final DynamicCardRootView u;
    public final View v;
    public final ViewGroup w;
    public dyfk x;

    public dyfr(ViewGroup viewGroup, Context context, dyyb dyybVar) {
        super(LayoutInflater.from(context).inflate(R.layout.og_dynamic_card, viewGroup, false));
        this.s = context;
        this.t = dyybVar;
        DynamicCardRootView dynamicCardRootView = (DynamicCardRootView) this.a.findViewById(R.id.og_card);
        this.u = dynamicCardRootView;
        dynamicCardRootView.setLayoutParams(new ViewGroup.MarginLayoutParams(-1, -2));
        ViewGroup viewGroup2 = (ViewGroup) dynamicCardRootView.findViewById(R.id.og_card_content_root);
        this.w = viewGroup2;
        View viewFindViewById = dynamicCardRootView.findViewById(R.id.og_loading_card_view);
        this.v = viewFindViewById;
        G(dynamicCardRootView, this.x);
        F(viewGroup2, dynamicCardRootView);
        ((ImageView) viewFindViewById.findViewById(R.id.og_loading_card_icon_placeholder)).setImageDrawable(D(new OvalShape()));
        ((ImageView) viewFindViewById.findViewById(R.id.og_loading_card_title_placeholder)).setImageDrawable(D(new RoundRectShape(null, null, null)));
        ((ImageView) viewFindViewById.findViewById(R.id.og_loading_card_progress_placeholder)).setImageDrawable(D(new RoundRectShape(null, null, null)));
        ((ImageView) viewFindViewById.findViewById(R.id.og_loading_card_progress_desc_placeholder)).setImageDrawable(D(new RoundRectShape(null, null, null)));
        viewFindViewById.setContentDescription(viewFindViewById.getResources().getString(R.string.og_card_loading_label_a11y));
    }

    private final PaintDrawable D(Shape shape) {
        Integer num = (Integer) ((dypx) dyqv.e(this.s)).b.get(dyqu.COLOR_HAIRLINE);
        num.getClass();
        PaintDrawable paintDrawable = new PaintDrawable(num.intValue());
        paintDrawable.setShape(shape);
        paintDrawable.setIntrinsicWidth(-1);
        paintDrawable.setIntrinsicHeight(-1);
        return paintDrawable;
    }

    private static final void G(DynamicCardRootView dynamicCardRootView, dyfk dyfkVar) {
        if (dynamicCardRootView != null) {
            dynamicCardRootView.i = dyfkVar != null ? ejwi.j(Integer.valueOf(dyfkVar.g)) : ejud.a;
        }
    }

    /* renamed from: C */
    protected void H(final lvj lvjVar, final dyfk dyfkVar) {
        this.x = dyfkVar;
        DynamicCardRootView dynamicCardRootView = this.u;
        G(dynamicCardRootView, dyfkVar);
        dynamicCardRootView.b(this.t);
        dyfkVar.a(lvjVar);
        dyfkVar.b.f(lvjVar, new lvz() { // from class: dyfn
            @Override // defpackage.lvz
            public final void a(Object obj) {
                final ejwi ejwiVar = (ejwi) obj;
                final dyfr dyfrVar = this.a;
                dyfrVar.u.setOnClickListener(new View.OnClickListener() { // from class: dyfl
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        dsve dsveVar = new dsve(5);
                        dyfr dyfrVar2 = dyfrVar;
                        dyfrVar2.t.f(dsveVar, dyfrVar2.u);
                        ejwi ejwiVar2 = ejwiVar;
                        if (ejwiVar2.g()) {
                            ((View.OnClickListener) ejwiVar2.c()).onClick(view);
                        }
                    }
                });
            }
        });
        dyfkVar.d.f(lvjVar, new lvz() { // from class: dyfo
            @Override // defpackage.lvz
            public final void a(Object obj) {
                this.a.u.setContentDescription((CharSequence) ((ejwi) obj).f());
            }
        });
        dyfkVar.e.f(lvjVar, new lvz() { // from class: dyfp
            @Override // defpackage.lvz
            public final void a(Object obj) {
                Boolean bool = (Boolean) obj;
                int i = true != bool.booleanValue() ? 8 : 0;
                dyfr dyfrVar = this.a;
                dyfrVar.v.setVisibility(i);
                dyfrVar.w.setVisibility(true != bool.booleanValue() ? 0 : 8);
            }
        });
        dynamicCardRootView.post(new Runnable() { // from class: dyfq
            @Override // java.lang.Runnable
            public final void run() {
                final dyfr dyfrVar = this.a;
                dyfkVar.f.f(lvjVar, new lvz() { // from class: dyfm
                    @Override // defpackage.lvz
                    public final void a(Object obj) {
                        dyyb dyybVar;
                        dyfr dyfrVar2 = dyfrVar;
                        DynamicCardRootView dynamicCardRootView2 = dyfrVar2.u;
                        ejwi ejwiVar = (ejwi) obj;
                        if (dynamicCardRootView2.k && dynamicCardRootView2.i.g() && !dynamicCardRootView2.j.equals(ejwiVar)) {
                            dynamicCardRootView2.j = ejwiVar;
                            ekgb ekgbVarF = dynamicCardRootView2.f();
                            int i = ((ekoe) ekgbVarF).c;
                            int i2 = 0;
                            while (true) {
                                dyybVar = dyfrVar2.t;
                                if (i2 >= i) {
                                    break;
                                }
                                ((dyyh) ekgbVarF.get(i2)).gW(dyybVar);
                                i2++;
                            }
                            dynamicCardRootView2.gW(dyybVar);
                            if (ejwiVar.g()) {
                                dyybVar.d(dynamicCardRootView2, ((Integer) dynamicCardRootView2.i.c()).intValue(), (dsva) ejwiVar.c());
                            } else {
                                dynamicCardRootView2.b(dyybVar);
                            }
                            ekgb ekgbVarF2 = dynamicCardRootView2.f();
                            int i3 = ((ekoe) ekgbVarF2).c;
                            for (int i4 = 0; i4 < i3; i4++) {
                                ((dyyh) ekgbVarF2.get(i4)).b(dyybVar);
                            }
                            dynamicCardRootView2.k = true;
                        }
                    }
                });
            }
        });
    }

    protected void E(lvj lvjVar) {
        this.u.gW(this.t);
        dyfk dyfkVar = this.x;
        dyfkVar.getClass();
        dyfkVar.d();
        this.x.b.l(lvjVar);
        this.x.d.l(lvjVar);
        this.x.e.l(lvjVar);
        this.x.f.l(lvjVar);
    }

    protected abstract void F(ViewGroup viewGroup, ViewGroup viewGroup2);
}
