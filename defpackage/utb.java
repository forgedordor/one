package defpackage;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.messaging.R;
import com.google.protobuf.contrib.android.ProtoParsers;
import defpackage.utd;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class utb extends usy implements ehlg, eyhx, ehlc, ehnw, eifl {
    private utd ah;
    private Context ai;
    private final lvn aj = new lvn(this);
    private final eics ak = new eics(this);
    private boolean al;
    private boolean am;

    @Deprecated
    public utb() {
        ecem.c();
    }

    @Override // defpackage.ehlg
    public final Class F() {
        return utd.class;
    }

    @Override // defpackage.ecdn, defpackage.ea
    public final View M(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.ak.k();
        try {
            View viewM = super.M(layoutInflater, viewGroup, bundle);
            this.al = false;
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

    @Override // defpackage.usy
    protected final /* synthetic */ eyhj aW() {
        return new ehog(this);
    }

    @Override // defpackage.ehlg
    /* renamed from: aY, reason: merged with bridge method [inline-methods] */
    public final utd H() {
        utd utdVar = this.ah;
        if (utdVar == null) {
            throw new IllegalStateException("peer() called before initialized.");
        }
        if (this.am) {
            throw new IllegalStateException("peer() called after destroyed.");
        }
        return utdVar;
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

    @Override // defpackage.usy, defpackage.ecdn, defpackage.ea
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
            if (!this.c && !this.al) {
                einc.b(this).b = view;
                H();
                utf.a(this, H());
            }
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

    @Override // defpackage.usy, defpackage.dn, defpackage.ea
    public final void g(Context context) {
        this.ak.k();
        try {
            if (this.am) {
                throw new IllegalStateException("A Fragment cannot be attached more than once. Instead, create a new Fragment instance.");
            }
            super.g(context);
            if (this.ah == null) {
                try {
                    eieu eieuVarG = eiiy.g("com/google/android/apps/messaging/conversation/settings/removal/RemoveUserDialogFragment", 99, utb.class, "CreateComponent");
                    try {
                        Object objBb = bb();
                        eieuVarG.close();
                        eieu eieuVarG2 = eiiy.g("com/google/android/apps/messaging/conversation/settings/removal/RemoveUserDialogFragment", 104, utb.class, "CreatePeer");
                        try {
                            eyik eyikVar = ((ahib) objBb).E;
                            eyik eyikVar2 = ((ahib) objBb).G;
                            ahkn ahknVar = ((ahib) objBb).a;
                            eyik eyikVar3 = ahknVar.aI;
                            ahng ahngVar = ahknVar.b;
                            eyik eyikVar4 = ahngVar.nT;
                            eyik eyikVar5 = ((ahib) objBb).H;
                            Bundle bundleA = ((ahib) objBb).a();
                            evrr evrrVar = (evrr) ahngVar.gp.b();
                            ejwl.b(bundleA.containsKey("TIKTOK_FRAGMENT_ARGUMENT"), "Proto @Argument for Fragment could not be found. @Arguments must be provided using the Fragment#create(MessageLite argument) overload.");
                            uti utiVar = (uti) ProtoParsers.f(bundleA, "TIKTOK_FRAGMENT_ARGUMENT", uti.a, evrrVar);
                            utiVar.getClass();
                            this.ah = new utd(eyikVar, eyikVar2, eyikVar3, eyikVar4, eyikVar5, utiVar);
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
        final utd utdVarH = H();
        ehmt ehmtVar = (ehmt) utdVarH.b.b();
        eeji eejiVar = new eeji(ehmtVar);
        eejiVar.l(ehmtVar.getString(R.string.remove_user_dialog_message, new Object[]{utdVarH.f}));
        eejiVar.m(R.string.remove_user_dialog_cancel, new eigf((eigp) utdVarH.c.b(), "com/google/android/apps/messaging/conversation/settings/removal/RemoveUserDialogFragmentPeer", "onCreateDialog", 78, "RemoveUserDialog Cancel", new DialogInterface.OnClickListener() { // from class: utc
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                utdVarH.a.hh();
            }
        }));
        eejiVar.r(R.string.remove_user_dialog_confirm, new einh((einm) utdVarH.d.b(), new utd.a()));
        return eejiVar.create();
    }

    @Override // defpackage.usy, defpackage.dn, defpackage.ea
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
            this.am = true;
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
                if (!this.al) {
                    einc.b(this).b = eina.a(this);
                    H();
                    utf.a(this, H());
                    this.al = true;
                }
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

    @Override // defpackage.usy, defpackage.ea
    public final Context z() {
        if (super.z() == null) {
            return null;
        }
        return bd();
    }
}
