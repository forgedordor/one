package defpackage;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.constraint.ConstraintLayout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.ScrollView;
import android.widget.TextView;
import com.google.android.apps.messaging.R;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.protobuf.contrib.android.ProtoParsers;
import defpackage.ehol;
import j$.util.Optional;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class toj extends tse implements ehlg, eyhx, ehlc, ehnw, eifl {
    private tot a;
    private boolean ag;
    private Context d;
    private final lvn e = new lvn(this);

    @Deprecated
    public toj() {
        ecem.c();
    }

    @Override // defpackage.ehlg
    public final Class F() {
        return tot.class;
    }

    @Override // defpackage.ehnp, defpackage.ecdo, defpackage.ea
    public final View M(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.c.k();
        try {
            s(layoutInflater, viewGroup, bundle);
            final tot totVarH = H();
            View viewInflate = layoutInflater.inflate(R.layout.fi_account_confirmation_fragment_layout, viewGroup, false);
            viewInflate.setSystemUiVisibility(1792);
            final ScrollView scrollView = (ScrollView) viewInflate.findViewById(R.id.scroll_view);
            final ConstraintLayout constraintLayout = (ConstraintLayout) viewInflate.findViewById(R.id.bottom_sheet_container);
            scrollView.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: top
                @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
                public final void onGlobalLayout() {
                    ScrollView scrollView2 = scrollView;
                    ConstraintLayout constraintLayout2 = constraintLayout;
                    if (scrollView2.canScrollVertically(1)) {
                        constraintLayout2.setElevation(totVarH.b.B().getDimension(R.dimen.fi_bottom_sheet_elevation));
                    } else {
                        constraintLayout2.setElevation(0.0f);
                    }
                }
            });
            scrollView.getViewTreeObserver().addOnScrollChangedListener(new ViewTreeObserver.OnScrollChangedListener() { // from class: toq
                @Override // android.view.ViewTreeObserver.OnScrollChangedListener
                public final void onScrollChanged() {
                    tot totVar = totVarH;
                    ValueAnimator valueAnimator = totVar.A;
                    if (valueAnimator != null && valueAnimator.isRunning()) {
                        totVar.A.cancel();
                    }
                    float dimension = scrollView.canScrollVertically(1) ? totVar.b.B().getDimension(R.dimen.fi_bottom_sheet_elevation) : 0.0f;
                    final ConstraintLayout constraintLayout2 = constraintLayout;
                    totVar.A = ValueAnimator.ofFloat(constraintLayout2.getElevation(), dimension);
                    totVar.A.setDuration(150L);
                    totVar.A.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: tom
                        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                        public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                            constraintLayout2.setElevation(((Float) valueAnimator2.getAnimatedValue()).floatValue());
                        }
                    });
                    totVar.A.start();
                }
            });
            totVarH.w = (ProgressBar) viewInflate.findViewById(R.id.sync_data_spinner);
            totVarH.x = (Button) viewInflate.findViewById(R.id.ok_button);
            totVarH.x.setOnClickListener(new eifs(totVarH.e, "com/google/android/apps/messaging/cloudstore/fi/FiAccountConfirmationFragmentPeer", "onCreateView", 315, "FiAccountConfirmationFragment:syncDataClick", new View.OnClickListener() { // from class: ton
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    tot totVar = totVarH;
                    totVar.x.setEnabled(false);
                    totVar.y.setEnabled(false);
                    final tqj tqjVar = totVar.g;
                    cpmc cpmcVar = tqjVar.a;
                    evrv evrvVar = (evrv) evrw.a.createBuilder();
                    evrvVar.a("box_devices");
                    totVar.d.h(new egpq(cpmcVar.k((evrw) evrvVar.build()).i(new eooz() { // from class: tqi
                        @Override // defpackage.eooz
                        public final ListenableFuture a(Object obj) {
                            final ekgb ekgbVarA = cpus.a((eqiz) obj);
                            if (ekgbVarA.isEmpty()) {
                                return eijx.e(false);
                            }
                            tqj tqjVar2 = tqjVar;
                            return tqjVar2.b.n().h(new ejvr() { // from class: tqh
                                @Override // defpackage.ejvr
                                public final Object apply(Object obj2) {
                                    if (((Optional) obj2).isEmpty()) {
                                        return true;
                                    }
                                    return Boolean.valueOf(!ekgbVarA.contains(r3.get()));
                                }
                            }, tqjVar2.c);
                        }
                    }, tqjVar.d)), new egpo(null), totVar.u);
                }
            }));
            totVarH.y = (Button) viewInflate.findViewById(R.id.cancel_button);
            totVarH.k.a(totVarH.y, new View.OnClickListener() { // from class: too
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    tot totVar = totVarH;
                    toj tojVar = totVar.b;
                    Intent intentA = tlz.a(tojVar.z());
                    int iA = emck.a(totVar.n.c);
                    if (iA == 0) {
                        iA = 1;
                    }
                    intentA.putExtra("entry_point", iA - 1);
                    tojVar.aD(intentA);
                    einf.f(new trt(), tojVar);
                }
            });
            totVarH.z = (ImageView) viewInflate.findViewById(R.id.account_avatar);
            TextView textView = (TextView) viewInflate.findViewById(R.id.learn_more_text);
            if (textView != null) {
                textView.setText(dajs.c(totVarH.b.z(), totVarH.i, totVarH.j, R.string.fi_account_login_learn_more, null, cpyl.h));
                eebt.b(textView);
                eebt.c(textView);
                textView.setVisibility(0);
            }
            eidc.q();
            return viewInflate;
        } finally {
        }
    }

    @Override // defpackage.ea, defpackage.lvj
    public final lvc P() {
        return this.e;
    }

    @Override // defpackage.ehlg
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final tot H() {
        tot totVar = this.a;
        if (totVar == null) {
            throw new IllegalStateException("peer() called before initialized.");
        }
        if (this.ag) {
            throw new IllegalStateException("peer() called after destroyed.");
        }
        return totVar;
    }

    @Override // defpackage.ea
    public final void aA(boolean z) {
        if (z) {
            throw new IllegalArgumentException("Peered fragments cannot be retained, to avoid memory leaks. If you need a retained fragment, you should subclass Fragment directly. See http://go/tiktok-conformance-violations/FRAGMENT_SET_RETAIN_INSTANCE");
        }
    }

    @Override // defpackage.ea
    public final void aD(Intent intent) {
        if (ehlf.a(intent, z().getApplicationContext())) {
            eiid.n(intent);
        }
        aQ(intent);
    }

    @Override // defpackage.ea
    public final void aQ(Intent intent) {
        if (ehlf.a(intent, z().getApplicationContext())) {
            eiid.n(intent);
        }
        super.aQ(intent);
    }

    @Override // defpackage.tse, defpackage.ecdo, defpackage.ea
    public final void ag(Activity activity) {
        this.c.k();
        try {
            super.ag(activity);
            eidc.q();
        } catch (Throwable th) {
            try {
                eidc.q();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.ea
    public final void at(Bundle bundle) {
        Bundle bundle2 = this.m;
        boolean z = true;
        if (bundle2 != null && bundle2 != bundle) {
            z = false;
        }
        ejwl.m(z, "Cannot overwrite fragment arguments. See - http://go/tiktok/dev/dagger/fragmentpeers.md#argument");
        super.at(bundle);
    }

    @Override // defpackage.tse
    protected final /* bridge */ /* synthetic */ ehok b() {
        return new ehof(this, true);
    }

    @Override // defpackage.ehlc
    @Deprecated
    public final Context bd() {
        if (this.d == null) {
            this.d = new ehnz(this, super.z());
        }
        return this.d;
    }

    @Override // defpackage.ehnp, defpackage.eifl
    public final eiik bf() {
        return this.c.a;
    }

    @Override // defpackage.ehnw
    public final Locale bg() {
        return ehnv.a(this);
    }

    @Override // defpackage.ehnp, defpackage.eifl
    public final void bh(eiik eiikVar, boolean z) {
        this.c.e(eiikVar, z);
    }

    @Override // defpackage.ehnp, defpackage.eifl
    public final void bi(eiik eiikVar) {
        this.c.b = eiikVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r28v0, types: [android.content.Context] */
    /* JADX WARN: Type inference failed for: r28v1 */
    /* JADX WARN: Type inference failed for: r28v2, types: [eieu] */
    @Override // defpackage.tse, defpackage.ehnp, defpackage.ea
    public final void g(Context context) {
        this.c.k();
        try {
            if (this.ag) {
                throw new IllegalStateException("A Fragment cannot be attached more than once. Instead, create a new Fragment instance.");
            }
            super.g(context);
            if (this.a == null) {
                try {
                    eieu eieuVarG = eiiy.g("com/google/android/apps/messaging/cloudstore/fi/FiAccountConfirmationFragment", 89, toj.class, "CreateComponent");
                    try {
                        Object objBb = bb();
                        eieuVarG.close();
                        eieu eieuVarG2 = eiiy.g("com/google/android/apps/messaging/cloudstore/fi/FiAccountConfirmationFragment", 94, toj.class, "CreatePeer");
                        try {
                            ahkn ahknVar = ((ahhw) objBb).a;
                            Bundle bundleA = ((ahhw) objBb).a();
                            ahng ahngVar = ahknVar.b;
                            evrr evrrVar = (evrr) ahngVar.gp.b();
                            ejwl.b(bundleA.containsKey("TIKTOK_FRAGMENT_ARGUMENT"), "Proto @Argument for Fragment could not be found. @Arguments must be provided using the Fragment#create(MessageLite argument) overload.");
                            tov tovVar = (tov) ProtoParsers.f(bundleA, "TIKTOK_FRAGMENT_ARGUMENT", tov.a, evrrVar);
                            tovVar.getClass();
                            ea eaVar = (ea) ((eyig) ((ahhw) objBb).e).a;
                            try {
                                if (!(eaVar instanceof toj)) {
                                    throw new IllegalStateException(a.M(eaVar, tot.class));
                                }
                                toj tojVar = (toj) eaVar;
                                ahjr ahjrVar = ((ahhw) objBb).b;
                                efwo efwoVar = (efwo) ahjrVar.b.b();
                                egpr egprVar = (egpr) ((ahhw) objBb).f.b();
                                eigp eigpVar = (eigp) ahjrVar.ac.b();
                                ehac ehacVar = (ehac) ((ahhw) objBb).g.b();
                                cpmc cpmcVar = (cpmc) ahjrVar.m.b();
                                ahnh ahnhVar = ahknVar.a;
                                aurx aurxVar = (aurx) ahnhVar.wc.b();
                                cpmc cpmcVar2 = (cpmc) ahjrVar.m.b();
                                cpvj cpvjVarFE = ahjrVar.fE();
                                ahnh ahnhVar2 = ahjrVar.a.a;
                                fdjx fdjxVar = (fdjx) ahnhVar2.m.b();
                                fdjx fdjxVar2 = (fdjx) ahnhVar2.oS.b();
                                auso ausoVar = (auso) ahjrVar.mH.b();
                                fdjxVar2.getClass();
                                ausoVar.getClass();
                                tqj tqjVar = new tqj(cpmcVar, aurxVar, new autm(cpmcVar2, cpvjVarFE, fdjxVar, (auso) ahjrVar.mH.b(), (aurx) ahnhVar2.wc.b(), (cpmd) ahjrVar.mG.b(), (ceqp) ahjrVar.o.b(), (crmx) ahnhVar2.pB.b(), (alrj) ahnhVar2.qi.b()), ahnhVar.afs, (eosc) ahknVar.y.b(), (eosc) ahknVar.p.b());
                                egbf egbfVar = (egbf) ahnhVar.pG.b();
                                eyik eyikVar = ahnhVar.Uk;
                                eyik eyikVar2 = ahjrVar.oU;
                                einm einmVar = (einm) ((ahhw) objBb).d.e.b();
                                eyik eyikVar3 = ahjrVar.dx;
                                eyik eyikVar4 = ahngVar.ha;
                                eyik eyikVar5 = ((ahhw) objBb).h;
                                cpmi cpmiVar = (cpmi) ahnhVar.afH.b();
                                ains ainsVar = (ains) ahnhVar.c.b();
                                this.a = new tot(tovVar, tojVar, efwoVar, egprVar, eigpVar, ehacVar, tqjVar, egbfVar, eyikVar, eyikVar2, einmVar, eyikVar3, eyikVar4, eyikVar5, cpmiVar, ainsVar);
                                eieuVarG2.close();
                                this.Z.c(new ehns(this.c, this.e));
                            } catch (Throwable th) {
                                th = th;
                                Throwable th2 = th;
                                try {
                                    context.close();
                                    throw th2;
                                } catch (Throwable th3) {
                                    th2.addSuppressed(th3);
                                    throw th2;
                                }
                            }
                        } catch (Throwable th4) {
                            th = th4;
                            context = eieuVarG2;
                        }
                    } finally {
                    }
                } catch (ClassCastException e) {
                    throw new IllegalStateException("Missing entry point. If you're in a test with explicit entry points specified in your @TestRoot, check that you're not missing the one for this class.", e);
                }
            }
            eidc.q();
        } finally {
        }
    }

    @Override // defpackage.ea
    public final LayoutInflater go(Bundle bundle) {
        this.c.k();
        try {
            LayoutInflater layoutInflaterAO = aO();
            LayoutInflater layoutInflaterCloneInContext = layoutInflaterAO.cloneInContext(new ehol.a(layoutInflaterAO, this));
            LayoutInflater layoutInflaterCloneInContext2 = layoutInflaterCloneInContext.cloneInContext(new ehnz(this, layoutInflaterCloneInContext));
            eidc.q();
            return layoutInflaterCloneInContext2;
        } catch (Throwable th) {
            try {
                eidc.q();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.ehnp, defpackage.ecdo, defpackage.ea
    public final void h(Bundle bundle) {
        this.c.k();
        try {
            aX(bundle);
            tot totVarH = H();
            egpr egprVar = totVarH.d;
            egprVar.j(totVarH.u);
            egprVar.j(totVarH.s);
            egprVar.j(totVarH.q);
            totVarH.f.a(totVarH.h.a(totVarH.c), totVarH.v);
            eidc.q();
        } catch (Throwable th) {
            try {
                eidc.q();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.ecdo, defpackage.ea
    public final void j() {
        eifp eifpVarA = this.c.a();
        try {
            bc();
            this.ag = true;
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

    @Override // defpackage.tse, defpackage.ea
    public final Context z() {
        if (super.z() == null) {
            return null;
        }
        return bd();
    }
}
