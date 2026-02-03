package defpackage;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.airbnb.lottie.LottieAnimationView;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.dittosatellite.impl.DittoWebActivity;
import com.google.protobuf.contrib.android.ProtoParsers;
import j$.util.Optional;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class absl extends absk implements ehlg, eyhx, ehlc, ehnw, eifl {
    private absr ah;
    private Context ai;
    private final lvn aj = new lvn(this);
    private final eics ak = new eics(this);
    private boolean al;

    @Deprecated
    public absl() {
        ecem.c();
    }

    @Override // defpackage.ehlg
    public final Class F() {
        return absr.class;
    }

    @Override // defpackage.ecdn, defpackage.ea
    public final View M(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.ak.k();
        try {
            View viewM = super.M(layoutInflater, viewGroup, bundle);
            eidc.q();
            return viewM;
        } catch (Throwable th) {
            try {
                eidc.q();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.ea, defpackage.lvj
    public final lvc P() {
        return this.aj;
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

    @Override // defpackage.ecdn, defpackage.ea
    public final boolean aM(MenuItem menuItem) {
        eifp eifpVarJ = this.ak.j();
        try {
            boolean zAM = super.aM(menuItem);
            eifpVarJ.close();
            return zAM;
        } catch (Throwable th) {
            try {
                eifpVarJ.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.ea
    public final void aQ(Intent intent) {
        if (ehlf.a(intent, z().getApplicationContext())) {
            eiid.n(intent);
        }
        super.aQ(intent);
    }

    @Override // defpackage.ea
    public final void aR(int i, int i2) {
        this.ak.h(i, i2);
        eidc.q();
    }

    @Override // defpackage.absk
    protected final /* synthetic */ eyhj aW() {
        return new ehog(this);
    }

    @Override // defpackage.ehlg
    /* renamed from: aY, reason: merged with bridge method [inline-methods] */
    public final absr H() {
        absr absrVar = this.ah;
        if (absrVar == null) {
            throw new IllegalStateException("peer() called before initialized.");
        }
        if (this.al) {
            throw new IllegalStateException("peer() called after destroyed.");
        }
        return absrVar;
    }

    @Override // defpackage.ecdn, defpackage.ea
    public final void ae(Bundle bundle) {
        this.ak.k();
        try {
            super.ae(bundle);
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

    @Override // defpackage.ecdn, defpackage.ea
    public final void af(int i, int i2, Intent intent) {
        eifp eifpVarF = this.ak.f();
        try {
            super.af(i, i2, intent);
            eifpVarF.close();
        } catch (Throwable th) {
            try {
                eifpVarF.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.absk, defpackage.ecdn, defpackage.ea
    public final void ag(Activity activity) {
        this.ak.k();
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

    @Override // defpackage.ecdn, defpackage.ea
    public final void ai() {
        eifp eifpVarB = this.ak.b();
        try {
            super.ai();
            eifpVarB.close();
        } catch (Throwable th) {
            try {
                eifpVarB.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.ecdn, defpackage.ea
    public final void am() {
        this.ak.k();
        try {
            super.am();
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

    @Override // defpackage.ecdn, defpackage.ea
    public final void ao() {
        eifp eifpVarB = this.ak.b();
        try {
            super.ao();
            eifpVarB.close();
        } catch (Throwable th) {
            try {
                eifpVarB.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.ecdn, defpackage.ea
    public final void ap(View view, Bundle bundle) {
        this.ak.k();
        try {
            super.ap(view, bundle);
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

    @Override // defpackage.ehlc
    @Deprecated
    public final Context bd() {
        if (this.ai == null) {
            this.ai = new ehnz(this, super.z());
        }
        return this.ai;
    }

    @Override // defpackage.eifl
    public final eiik bf() {
        return this.ak.a;
    }

    @Override // defpackage.ehnw
    public final Locale bg() {
        return ehnv.a(this);
    }

    @Override // defpackage.eifl
    public final void bh(eiik eiikVar, boolean z) {
        this.ak.e(eiikVar, z);
    }

    @Override // defpackage.eifl
    public final void bi(eiik eiikVar) {
        this.ak.b = eiikVar;
    }

    @Override // defpackage.absk, defpackage.dn, defpackage.ea
    public final void g(Context context) {
        this.ak.k();
        try {
            if (this.al) {
                throw new IllegalStateException("A Fragment cannot be attached more than once. Instead, create a new Fragment instance.");
            }
            super.g(context);
            if (this.ah == null) {
                try {
                    eieu eieuVarG = eiiy.g("com/google/android/apps/messaging/dittosatellite/switcher/switcherdialog/SwitcherDialogFragment", 95, absl.class, "CreateComponent");
                    try {
                        Object objBb = bb();
                        eieuVarG.close();
                        eieu eieuVarG2 = eiiy.g("com/google/android/apps/messaging/dittosatellite/switcher/switcherdialog/SwitcherDialogFragment", 100, absl.class, "CreatePeer");
                        try {
                            ahkn ahknVar = ((ahib) objBb).a;
                            Bundle bundleA = ((ahib) objBb).a();
                            evrr evrrVar = (evrr) ahknVar.b.gp.b();
                            ejwl.b(bundleA.containsKey("TIKTOK_FRAGMENT_ARGUMENT"), "Proto @Argument for Fragment could not be found. @Arguments must be provided using the Fragment#create(MessageLite argument) overload.");
                            absn absnVar = (absn) ProtoParsers.f(bundleA, "TIKTOK_FRAGMENT_ARGUMENT", absn.a, evrrVar);
                            absnVar.getClass();
                            eyik eyikVar = ahknVar.y;
                            ahhk ahhkVar = ((ahib) objBb).c;
                            this.ah = new absr(absnVar, eyikVar, ahhkVar.d, ahknVar.a.FP, ahhkVar.aF, ahhkVar.aG, ahknVar.aI);
                            eieuVarG2.close();
                            this.Z.c(new ehns(this.ak, this.aj));
                        } finally {
                        }
                    } finally {
                    }
                } catch (ClassCastException e) {
                    throw new IllegalStateException("Missing entry point. If you're in a test with explicit entry points specified in your @TestRoot, check that you're not missing the one for this class.", e);
                }
            }
            lvj lvjVar = this.E;
            if (lvjVar instanceof eifl) {
                eics eicsVar = this.ak;
                if (eicsVar.a == null) {
                    eicsVar.e(((eifl) lvjVar).bf(), true);
                }
            }
            eidc.q();
        } finally {
        }
    }

    /* JADX WARN: Type inference failed for: r3v7, types: [alqm, java.lang.Object] */
    @Override // defpackage.dn
    public final Dialog gK(Bundle bundle) throws Resources.NotFoundException {
        super.gK(bundle);
        final absr absrVarH = H();
        absn absnVar = absrVarH.d;
        final abgx abgxVarB = abgx.b(absnVar.b);
        if (abgxVarB == null) {
            abgxVarB = abgx.UNRECOGNIZED;
        }
        final boolean z = absnVar.c;
        int iOrdinal = abgxVarB.ordinal();
        absrVarH.b = iOrdinal != 1 ? iOrdinal != 2 ? abgx.UNKNOWN : abgx.REMOTE : abgx.STANDALONE;
        fcsu fcsuVar = absrVarH.e;
        View viewInflate = LayoutInflater.from((Context) fcsuVar.b()).inflate(R.layout.switcher_peer_view, (ViewGroup) null);
        AlertDialog alertDialogCreate = new AlertDialog.Builder((Context) fcsuVar.b(), R.style.SwitcherDialogPeerStyle).setView(viewInflate).setPositiveButton(((Context) fcsuVar.b()).getResources().getString(R.string.switcher_positive_button_text), new eigf((eigp) absrVarH.h.b(), "com/google/android/apps/messaging/dittosatellite/switcher/switcherdialog/SwitcherDialogFragmentPeer", "onCreateDialog", 110, "SwitcherDialog:positive", new DialogInterface.OnClickListener() { // from class: absq
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                absr absrVar = absrVarH;
                abgx abgxVar = abgxVarB;
                if (z) {
                    ((bvio) absrVar.f.b()).z(absr.d(absrVar.b), 3, abmt.f());
                } else if (abgxVar != absrVar.b) {
                    ((bvio) absrVar.f.b()).z(absr.d(absrVar.b), 2, abmt.f());
                }
                absrVar.c(absrVar.b);
                abgx abgxVar2 = abgx.REMOTE;
                if (abgxVar == abgxVar2 && absrVar.b == abgx.STANDALONE) {
                    fcsu fcsuVar2 = absrVar.e;
                    if (fcsuVar2.b() instanceof DittoWebActivity) {
                        absr.a.m("launching Standalone mode");
                        DittoWebActivity dittoWebActivity = (DittoWebActivity) fcsuVar2.b();
                        dittoWebActivity.setResult(-1, dittoWebActivity.getIntent());
                        dittoWebActivity.finish();
                        return;
                    }
                    return;
                }
                if (abgxVar == abgx.STANDALONE && absrVar.b == abgxVar2) {
                    absr.a.m("launching Remote mode");
                    fcsu fcsuVar3 = absrVar.e;
                    ((Context) fcsuVar3.b()).startActivity(aiiw.c((Context) fcsuVar3.b(), DittoWebActivity.class, "android.intent.action.VIEW").a());
                }
            }
        })).create();
        if (absrVarH.m == null) {
            absrVarH.m = (LottieAnimationView) viewInflate.findViewById(R.id.switcher_animation);
        }
        absrVarH.m.g(((Context) fcsuVar.b()).getString(R.string.switcher_json));
        absrVarH.m.d();
        float dimension = ((Context) fcsuVar.b()).getResources().getDimension(R.dimen.switcher_option_corner);
        absrVarH.c = new float[]{dimension, dimension, dimension, dimension, dimension, dimension, dimension, dimension};
        absrVarH.i = viewInflate.findViewById(R.id.use_device_sim_layout);
        absrVarH.k = (ImageView) absrVarH.i.findViewById(R.id.use_device_sim_check_mark);
        absrVarH.j = viewInflate.findViewById(R.id.pair_device_layout);
        absrVarH.l = (ImageView) absrVarH.j.findViewById(R.id.pair_device_check_mark);
        fcsu fcsuVar2 = absrVarH.g;
        Optional optionalA = ((abse) fcsuVar2.b()).a();
        TextView textView = (TextView) absrVarH.i.findViewById(R.id.use_device_sim_number);
        if (optionalA.isPresent()) {
            textView.setText(((Context) fcsuVar.b()).getString(R.string.switcher_use_device_sim_number, optionalA.get().F().a));
            textView.setVisibility(0);
        } else if (!((abse) fcsuVar2.b()).d()) {
            textView.setText(((Context) fcsuVar.b()).getString(R.string.switcher_no_phone_number));
            textView.setVisibility(0);
        }
        absrVarH.a();
        absrVarH.i.setOnClickListener(new View.OnClickListener() { // from class: abso
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                absrVarH.b(abgx.STANDALONE);
            }
        });
        absrVarH.j.setOnClickListener(new View.OnClickListener() { // from class: absp
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                absrVarH.b(abgx.REMOTE);
            }
        });
        return alertDialogCreate;
    }

    @Override // defpackage.absk, defpackage.dn, defpackage.ea
    public final LayoutInflater go(Bundle bundle) {
        this.ak.k();
        try {
            LayoutInflater layoutInflaterGo = super.go(bundle);
            LayoutInflater layoutInflaterCloneInContext = layoutInflaterGo.cloneInContext(new ehnz(this, layoutInflaterGo));
            eidc.q();
            return layoutInflaterCloneInContext;
        } catch (Throwable th) {
            try {
                eidc.q();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.ecdn, defpackage.dn, defpackage.ea
    public final void h(Bundle bundle) {
        this.ak.k();
        try {
            super.h(bundle);
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

    @Override // defpackage.ecdn, defpackage.dn
    public final void hh() {
        eifp eifpVarK = eidc.k();
        try {
            super.hh();
            eifpVarK.close();
        } catch (Throwable th) {
            try {
                eifpVarK.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.ecdn, defpackage.dn, defpackage.ea
    public final void i() {
        eifp eifpVarB = this.ak.b();
        try {
            super.i();
            eifpVarB.close();
        } catch (Throwable th) {
            try {
                eifpVarB.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.ecdn, defpackage.dn, defpackage.ea
    public final void j() {
        eifp eifpVarA = this.ak.a();
        try {
            super.j();
            this.al = true;
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

    @Override // defpackage.ecdn, defpackage.dn, defpackage.ea
    public final void k(Bundle bundle) {
        this.ak.k();
        try {
            super.k(bundle);
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

    @Override // defpackage.ecdn, defpackage.dn, defpackage.ea
    public final void l() {
        this.ak.k();
        try {
            super.l();
            eina.c(this);
            if (this.c) {
                eina.b(this);
            }
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

    @Override // defpackage.ecdn, defpackage.dn, defpackage.ea
    public final void m() {
        this.ak.k();
        try {
            super.m();
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

    @Override // defpackage.dn, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        this.ak.g().close();
    }

    @Override // defpackage.ecdn, defpackage.dn, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        eifp eifpVarI = this.ak.i();
        try {
            super.onDismiss(dialogInterface);
            eifpVarI.close();
        } catch (Throwable th) {
            try {
                eifpVarI.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.absk, defpackage.ea
    public final Context z() {
        if (super.z() == null) {
            return null;
        }
        return bd();
    }
}
