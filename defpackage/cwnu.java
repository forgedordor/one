package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.messaging.R;
import defpackage.eyhq;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cwnu extends cwnq implements ehlg, eyhx, ehlc, ehnw, eifl {
    private cwny a;
    private boolean ag;
    private Context d;
    private final lvn e = new lvn(this);

    @Deprecated
    public cwnu() {
        ecem.c();
    }

    @Override // defpackage.ehlg
    public final Class F() {
        return cwny.class;
    }

    @Override // defpackage.ehnp, defpackage.ecdo, defpackage.ea
    public final View M(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.c.k();
        try {
            cwny cwnyVarH = H();
            layoutInflater.getClass();
            ((eksl) cwny.a.h()).q("Attempted to launch RbmDeepLinkFragment.");
            View viewInflate = layoutInflater.inflate(R.layout.rbm_open_deep_link_fragment, viewGroup, false);
            Object objB = cwnyVarH.c.b();
            objB.getClass();
            auvw.k((fdjx) objB, null, null, new cwob(cwnyVarH, null), 3);
            eidc.q();
            return viewInflate;
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
        return this.e;
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

    @Override // defpackage.cwnq, defpackage.ecdo, defpackage.ea
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

    @Override // defpackage.cwnq
    protected final /* synthetic */ eyhj b() {
        return new ehog(this);
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

    @Override // defpackage.ehlg
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public final cwny H() {
        cwny cwnyVar = this.a;
        if (cwnyVar == null) {
            throw new IllegalStateException("peer() called before initialized.");
        }
        if (this.ag) {
            throw new IllegalStateException("peer() called after destroyed.");
        }
        return cwnyVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r32v0, types: [android.content.Context] */
    /* JADX WARN: Type inference failed for: r32v1 */
    /* JADX WARN: Type inference failed for: r32v2, types: [eieu] */
    @Override // defpackage.cwnq, defpackage.ehnp, defpackage.ea
    public final void g(Context context) {
        this.c.k();
        try {
            if (this.ag) {
                throw new IllegalStateException("A Fragment cannot be attached more than once. Instead, create a new Fragment instance.");
            }
            super.g(context);
            if (this.a == null) {
                try {
                    eieu eieuVarG = eiiy.g("com/google/android/apps/messaging/ui/conversation/rbm/OpenRbmDeepLinkFragment", 85, cwnu.class, "CreateComponent");
                    try {
                        Object objBb = bb();
                        eieuVarG.close();
                        eieu eieuVarG2 = eiiy.g("com/google/android/apps/messaging/ui/conversation/rbm/OpenRbmDeepLinkFragment", 90, cwnu.class, "CreatePeer");
                        try {
                            Activity activity = (Activity) ((ahib) objBb).c.d.b();
                            ea eaVar = (ea) ((eyig) ((ahib) objBb).d).a;
                            try {
                                if (!(eaVar instanceof cwnu)) {
                                    throw new IllegalStateException(a.M(eaVar, cwny.class));
                                }
                                cwnu cwnuVar = (cwnu) eaVar;
                                eyik eyikVar = ((ahib) objBb).g;
                                ahkn ahknVar = ((ahib) objBb).a;
                                ahnh ahnhVar = ahknVar.a;
                                eyik eyikVar2 = ahnhVar.m;
                                ahho ahhoVar = ((ahib) objBb).b;
                                eyik eyikVar3 = ahhoVar.f;
                                eyik eyikVar4 = ahnhVar.qi;
                                eyik eyikVar5 = ahnhVar.Jm;
                                ahng ahngVar = ahknVar.b;
                                this.a = new cwny(activity, cwnuVar, eyikVar, eyikVar2, eyikVar3, eyikVar4, eyikVar5, ahngVar.fg, ahnhVar.vR, ((ahib) objBb).k, ((ahib) objBb).be, ahngVar.oD, ahngVar.nR, ((ahib) objBb).aN, ahknVar.t, ahngVar.eQ, ahngVar.oE, ahngVar.oF, ahnhVar.MX, ahnhVar.Pi, ahnhVar.Pj, ahnhVar.Gk, ahnhVar.pT, ahhoVar.d, ahknVar.lk);
                                eieuVarG2.close();
                                this.a.q = this;
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
            LayoutInflater layoutInflaterCloneInContext = layoutInflaterAO.cloneInContext(new eyhq.a(layoutInflaterAO, this));
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

    @Override // defpackage.cwnq, defpackage.ea
    public final Context z() {
        if (super.z() == null) {
            return null;
        }
        return bd();
    }
}
