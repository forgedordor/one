package defpackage;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import com.google.android.apps.messaging.R;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cyiz extends cyjs implements ehlg, eyhx, ehlc, ehnw, eifl {
    private cyjg ah;
    private Context ai;
    private final lvn aj = new lvn(this);
    private final eics ak = new eics(this);
    private boolean al;

    @Deprecated
    public cyiz() {
        ecem.c();
    }

    @Override // defpackage.ehlg
    public final Class F() {
        return cyjg.class;
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

    @Override // defpackage.ehlg
    /* renamed from: aV, reason: merged with bridge method [inline-methods] */
    public final cyjg H() {
        cyjg cyjgVar = this.ah;
        if (cyjgVar == null) {
            throw new IllegalStateException("peer() called before initialized.");
        }
        if (this.al) {
            throw new IllegalStateException("peer() called after destroyed.");
        }
        return cyjgVar;
    }

    @Override // defpackage.cyjs
    protected final /* synthetic */ eyhj aW() {
        return new ehog(this);
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

    @Override // defpackage.cyjs, defpackage.ecdn, defpackage.ea
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

    @Override // defpackage.cyjs, defpackage.dn, defpackage.ea
    public final void g(Context context) {
        this.ak.k();
        try {
            if (this.al) {
                throw new IllegalStateException("A Fragment cannot be attached more than once. Instead, create a new Fragment instance.");
            }
            super.g(context);
            if (this.ah == null) {
                try {
                    eieu eieuVarG = eiiy.g("com/google/android/apps/messaging/ui/debug/tachyon/DebugTachyonPhoneRegistrationFragment", 94, cyiz.class, "CreateComponent");
                    try {
                        Object objBb = bb();
                        eieuVarG.close();
                        eieu eieuVarG2 = eiiy.g("com/google/android/apps/messaging/ui/debug/tachyon/DebugTachyonPhoneRegistrationFragment", 99, cyiz.class, "CreatePeer");
                        try {
                            ea eaVar = (ea) ((eyig) ((ahib) objBb).d).a;
                            if (!(eaVar instanceof cyiz)) {
                                throw new IllegalStateException(a.M(eaVar, cyjg.class));
                            }
                            cyiz cyizVar = (cyiz) eaVar;
                            eyik eyikVar = ((ahib) objBb).bu;
                            eyik eyikVar2 = ((ahib) objBb).l;
                            eyik eyikVar3 = ((ahib) objBb).f;
                            ahkn ahknVar = ((ahib) objBb).a;
                            this.ah = new cyjg(cyizVar, eyikVar, eyikVar2, eyikVar3, ahknVar.aQ, ahknVar.aI);
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

    @Override // defpackage.dn
    public final Dialog gK(Bundle bundle) {
        super.gK(bundle);
        final cyjg cyjgVarH = H();
        AlertDialog.Builder builder = new AlertDialog.Builder(cyjgVarH.a.z());
        builder.setTitle("Register Phone Number with Tachyon").setMessage("").setPositiveButton("Register", (DialogInterface.OnClickListener) null).setNegativeButton("Close", new DialogInterface.OnClickListener() { // from class: cyja
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.dismiss();
            }
        });
        builder.setNeutralButton("Refresh Status", new DialogInterface.OnClickListener() { // from class: cyjb
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
            }
        });
        cyjgVarH.g = builder.create();
        cyjgVarH.g.setCanceledOnTouchOutside(false);
        cyjgVarH.g.setCancelable(false);
        cyjgVarH.g.setOnShowListener(new DialogInterface.OnShowListener() { // from class: cyjc
            @Override // android.content.DialogInterface.OnShowListener
            public final void onShow(DialogInterface dialogInterface) {
                AlertDialog alertDialog = (AlertDialog) dialogInterface;
                Button button = alertDialog.getButton(-1);
                final cyjg cyjgVar = cyjgVarH;
                fcsu fcsuVar = cyjgVar.f;
                button.setOnClickListener(new eifs((eigp) fcsuVar.b(), "com/google/android/apps/messaging/ui/debug/tachyon/DebugTachyonPhoneRegistrationFragmentPeer", "onCreateDialog", 128, "Clicked Submit", new View.OnClickListener() { // from class: cyjd
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        cyjg cyjgVar2 = cyjgVar;
                        egpr egprVar = (egpr) cyjgVar2.c.b();
                        final cyjq cyjqVar = (cyjq) cyjgVar2.b.b();
                        egprVar.g(egpq.b(cyjqVar.a(cyjgVar2.h).i(new eooz() { // from class: cyjh
                            @Override // defpackage.eooz
                            public final ListenableFuture a(Object obj) {
                                final cejg cejgVar = (cejg) obj;
                                return cejgVar.o().l().i(new eooz() { // from class: cyjm
                                    @Override // defpackage.eooz
                                    public final ListenableFuture a(Object obj2) {
                                        return cejgVar.l();
                                    }
                                }, cyjqVar.c);
                            }
                        }, cyjqVar.d).h(new ejvr() { // from class: cyji
                            @Override // defpackage.ejvr
                            public final Object apply(Object obj) {
                                return null;
                            }
                        }, cyjqVar.c)), cyjgVar2.j);
                    }
                }));
                alertDialog.getButton(-3).setOnClickListener(new eifs((eigp) fcsuVar.b(), "com/google/android/apps/messaging/ui/debug/tachyon/DebugTachyonPhoneRegistrationFragmentPeer", "onCreateDialog", 141, "Clicked refresh status", new View.OnClickListener() { // from class: cyje
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        ((egzh) cyjgVar.e.b()).a(eorv.a, new egyb("debug_tachyon_state_data_source"));
                    }
                }));
            }
        });
        return cyjgVarH.g;
    }

    @Override // defpackage.cyjs, defpackage.dn, defpackage.ea
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
            cyjg cyjgVarH = H();
            Bundle bundle2 = cyjgVarH.a.m;
            if (bundle2 == null) {
                cqca.n("Bugle", "Failed to get tachyon sub id from arguments");
            } else {
                cyjgVarH.h = bundle2.getInt("effectiveSubId");
                ((ehbb) cyjgVarH.d.b()).g(R.id.debug_tachyon_subscription_id, new cyjp((cyjq) cyjgVarH.b.b(), cyjgVarH.h), cyjgVarH.i);
                ((egpr) cyjgVarH.c.b()).j(cyjgVarH.j);
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

    @Override // defpackage.cyjs, defpackage.ea
    public final Context z() {
        if (super.z() == null) {
            return null;
        }
        return bd();
    }
}
