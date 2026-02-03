package defpackage;

import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.app.Dialog;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.util.Property;
import android.util.SparseArray;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import com.google.android.apps.messaging.R;
import com.google.android.libraries.onegoogle.popovercontainer.ExpandableDialogView;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dzdb extends kc implements dyqh {
    public static final Property ag = new dzcp(Float.class);
    public static final Property ah = new dzcq(Integer.class);
    public dzcg ai;
    public boolean aj;
    public SparseArray ak;
    public dzde al;
    public ExpandableDialogView am;
    public dzcw an;
    public dyof ap;
    private boolean aq;
    private dzda ar;
    public final dyqi ao = new dyqi(this);
    private final abs as = new dzcm(this);

    private static void aZ(ViewGroup viewGroup, dzcx dzcxVar) {
        viewGroup.removeAllViews();
        viewGroup.addView(dzcxVar.a(LayoutInflater.from(viewGroup.getContext()), viewGroup));
    }

    @Override // defpackage.ea
    public final View M(final LayoutInflater layoutInflater, final ViewGroup viewGroup, final Bundle bundle) {
        final FrameLayout frameLayout = new FrameLayout(layoutInflater.getContext());
        this.ao.c(new Runnable() { // from class: dzci
            @Override // java.lang.Runnable
            public final void run() {
                final dzdb dzdbVar = this.a;
                ejwl.m(dzdbVar.an != null, "configuration can't be null after initialization.");
                Context contextF = ((dzbs) dzdbVar.an).e.f(layoutInflater.getContext());
                Bundle bundle2 = dzdbVar.m;
                if (bundle2 != null && bundle2.getBoolean("accountMenuFlavorsStyle", false)) {
                    contextF = new ContextThemeWrapper(contextF, R.style.OneGoogle_AccountMenuFlavors);
                }
                Bundle bundle3 = dzdbVar.m;
                if (bundle3 != null && bundle3.getBoolean("dialogCenteredStyle", false)) {
                    contextF = new ContextThemeWrapper(contextF, R.style.OneGoogle_DialogCentered);
                }
                FrameLayout frameLayout2 = frameLayout;
                View viewInflate = LayoutInflater.from(contextF).inflate(R.layout.og_dialog, viewGroup, false);
                frameLayout2.addView(viewInflate);
                ExpandableDialogView expandableDialogView = (ExpandableDialogView) viewInflate.findViewById(R.id.og_dialog_view);
                expandableDialogView.getClass();
                dzdbVar.am = expandableDialogView;
                ((dzbs) dzdbVar.an).a.a(frameLayout2);
                ExpandableDialogView expandableDialogView2 = dzdbVar.am;
                expandableDialogView2.l = 1;
                expandableDialogView2.b(((dzbs) dzdbVar.an).d);
                Dialog dialog = dzdbVar.d;
                Window window = dialog != null ? dialog.getWindow() : null;
                ExpandableDialogView expandableDialogView3 = dzdbVar.am;
                expandableDialogView3.k = window;
                expandableDialogView3.j = new Runnable() { // from class: dzcl
                    @Override // java.lang.Runnable
                    public final void run() {
                        dzdbVar.aX();
                    }
                };
                dzde dzdeVar = dzdbVar.al;
                if (dzdeVar != null) {
                    dzdbVar.aV(dzdeVar, expandableDialogView3);
                } else {
                    Bundle bundle4 = bundle;
                    dzdbVar.ak = bundle4 != null ? bundle4.getSparseParcelableArray("viewHierarchyState") : null;
                }
            }
        });
        return frameLayout;
    }

    public final void aV(dzde dzdeVar, View view) {
        ecem.c();
        this.aq = true;
        dzbt dzbtVar = (dzbt) dzdeVar;
        aZ((ViewGroup) view.findViewById(R.id.og_container_footer), dzbtVar.c);
        aZ((ViewGroup) view.findViewById(R.id.og_header_container), dzbtVar.a);
        aZ((ViewGroup) view.findViewById(R.id.og_container_content_view), dzbtVar.b);
        ley.r(view.findViewById(R.id.og_header_close_button), view.getResources().getString(dzbtVar.d));
        view.setVisibility(0);
        dzda dzdaVar = this.ar;
        if (dzdaVar != null) {
            dzdaVar.a(view);
        }
    }

    public final void aW() {
        if (aF()) {
            if (aJ()) {
                super.dismissAllowingStateLoss();
            } else {
                super.hh();
            }
            dzcw dzcwVar = this.an;
            if (dzcwVar != null) {
                ((dzbs) dzcwVar).b.a();
            }
        }
    }

    public final void aX() {
        ExpandableDialogView expandableDialogView;
        View view;
        dzcw dzcwVar = this.an;
        if (dzcwVar != null && (expandableDialogView = this.am) != null && (view = expandableDialogView.h) != null) {
            ((dzbs) dzcwVar).d.f(new dsve(5), view);
        }
        hh();
    }

    public final void aY(dzda dzdaVar) {
        ExpandableDialogView expandableDialogView;
        this.ar = dzdaVar;
        if (!this.aq || dzdaVar == null || (expandableDialogView = this.am) == null) {
            return;
        }
        dzdaVar.a(expandableDialogView);
    }

    @Override // defpackage.ea
    public final void ai() {
        super.ai();
        this.ap = null;
        this.al = null;
        this.an = null;
        this.ar = null;
    }

    @Override // defpackage.ea
    public final void ap(final View view, final Bundle bundle) {
        dyrg.a(view);
        this.ao.c(new Runnable() { // from class: dzcj
            @Override // java.lang.Runnable
            public final void run() {
                View view2 = view;
                View viewFindViewById = view2.findViewById(R.id.og_header_close_button);
                final dzdb dzdbVar = this.a;
                viewFindViewById.setOnClickListener(new View.OnClickListener() { // from class: dzch
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view3) {
                        dzdb dzdbVar2 = dzdbVar;
                        dzcw dzcwVar = dzdbVar2.an;
                        if (dzcwVar != null) {
                            ((dzbs) dzcwVar).d.f(new dsve(5), view3);
                        }
                        dzdbVar2.hh();
                    }
                });
                dzdbVar.ai = new dzcg(dzdbVar.am, dzcg.a, view2.findViewById(R.id.og_container_scroll_view));
                dzdbVar.ai.b();
                if (bundle == null) {
                    ExpandableDialogView expandableDialogView = dzdbVar.am;
                    expandableDialogView.getClass();
                    expandableDialogView.setAlpha(0.0f);
                    ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(expandableDialogView, (Property<ExpandableDialogView, Float>) dzdb.ag, 0.0f, 1.0f);
                    objectAnimatorOfFloat.setDuration(83L);
                    objectAnimatorOfFloat.setInterpolator(new LinearInterpolator());
                    ObjectAnimator objectAnimatorOfPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(expandableDialogView, PropertyValuesHolder.ofFloat((Property<?, Float>) View.SCALE_X, 0.8f, 1.0f), PropertyValuesHolder.ofFloat((Property<?, Float>) View.SCALE_Y, 0.8f, 1.0f));
                    objectAnimatorOfPropertyValuesHolder.setDuration(200L);
                    objectAnimatorOfPropertyValuesHolder.setInterpolator(new lue());
                    expandableDialogView.getViewTreeObserver().addOnPreDrawListener(new dzcn(expandableDialogView));
                    Dialog dialog = dzdbVar.d;
                    if (dialog != null && dialog.getWindow() != null) {
                        int color = dzdbVar.A().getColor(R.color.google_scrim);
                        ObjectAnimator objectAnimatorOfObject = ObjectAnimator.ofObject(dzdbVar.d.getWindow().getDecorView(), (Property<View, V>) dzdb.ah, new eecf(), Integer.valueOf(kzb.h(color, 0)), Integer.valueOf(color));
                        objectAnimatorOfObject.setInterpolator(new LinearInterpolator());
                        objectAnimatorOfObject.setDuration(200L);
                        objectAnimatorOfObject.start();
                    }
                    objectAnimatorOfFloat.start();
                    objectAnimatorOfPropertyValuesHolder.start();
                }
            }
        });
    }

    @Override // defpackage.dyqh
    public final boolean b() {
        return this.an != null;
    }

    @Override // defpackage.kc, defpackage.dn
    public final Dialog gK(Bundle bundle) {
        Dialog dialogGK = super.gK(bundle);
        ((abk) dialogGK).b.b(this, this.as);
        return dialogGK;
    }

    @Override // defpackage.dn, defpackage.ea
    public final void h(Bundle bundle) {
        super.h(bundle);
        q(2, R.style.OneGoogle_Dialog);
    }

    @Override // defpackage.dn
    public final void hh() {
        Dialog dialog = this.d;
        if (dialog == null || dialog.getWindow() == null) {
            aW();
            return;
        }
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.d.getWindow().getDecorView(), (Property<View, Float>) ag, 1.0f, 0.0f);
        objectAnimatorOfFloat.setDuration(83L);
        objectAnimatorOfFloat.setInterpolator(new LinearInterpolator());
        objectAnimatorOfFloat.addListener(new dzco(this));
        objectAnimatorOfFloat.start();
    }

    @Override // defpackage.dn, defpackage.ea
    public final void i() {
        super.i();
        dzcg dzcgVar = this.ai;
        if (dzcgVar != null) {
            View view = dzcgVar.d;
            view.getViewTreeObserver().removeOnScrollChangedListener(dzcgVar.b);
            dyqy.a(view, dzcgVar.c);
            this.ai = null;
        }
        dzcw dzcwVar = this.an;
        if (dzcwVar != null) {
            ((dzbs) dzcwVar).c.a();
        }
        this.am = null;
        this.aq = false;
    }

    @Override // defpackage.dn, defpackage.ea
    public final void k(Bundle bundle) {
        super.k(bundle);
        if (this.am != null) {
            SparseArray sparseArray = new SparseArray();
            this.ak = sparseArray;
            this.am.saveHierarchyState(sparseArray);
            bundle.putSparseParcelableArray("viewHierarchyState", this.ak);
        }
    }

    @Override // defpackage.dn, defpackage.ea
    public final void l() {
        super.l();
        this.aj = true;
        dyof dyofVar = this.ap;
        if (dyofVar != null) {
            dyofVar.a();
        }
    }

    @Override // defpackage.dn, defpackage.ea
    public final void m() {
        super.m();
        this.aj = false;
        dyof dyofVar = this.ap;
        if (dyofVar != null) {
            dyofVar.b();
        }
    }

    @Override // defpackage.ea, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        ExpandableDialogView expandableDialogView = this.am;
        if (expandableDialogView != null) {
            expandableDialogView.onConfigurationChanged(configuration);
        }
    }
}
