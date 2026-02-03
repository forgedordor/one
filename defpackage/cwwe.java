package defpackage;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.ui.common.ListEmptyView;
import j$.util.Optional;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cwwe extends cwvn implements ehlg, eyhx, ehlc, ehnw, eifl {
    private cwwk ah;
    private Context ai;
    private final lvn aj = new lvn(this);
    private final eics ak = new eics(this);
    private boolean al;

    @Deprecated
    public cwwe() {
        ecem.c();
    }

    public static cwwe aY() {
        cwwe cwweVar = new cwwe();
        eyhj.e(cwweVar);
        return cwweVar;
    }

    @Override // defpackage.ehlg
    public final Class F() {
        return cwwk.class;
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

    @Override // defpackage.cwvn
    protected final /* synthetic */ eyhj aW() {
        return new ehog(this);
    }

    @Override // defpackage.ehlg
    /* renamed from: aZ, reason: merged with bridge method [inline-methods] */
    public final cwwk H() {
        cwwk cwwkVar = this.ah;
        if (cwwkVar == null) {
            throw new IllegalStateException("peer() called before initialized.");
        }
        if (this.al) {
            throw new IllegalStateException("peer() called after destroyed.");
        }
        return cwwkVar;
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

    @Override // defpackage.cwvn, defpackage.ecdn, defpackage.ea
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
            H().g.f();
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

    @Override // defpackage.cwvn, defpackage.dn, defpackage.ea
    public final void g(Context context) {
        this.ak.k();
        try {
            if (this.al) {
                throw new IllegalStateException("A Fragment cannot be attached more than once. Instead, create a new Fragment instance.");
            }
            super.g(context);
            if (this.ah == null) {
                try {
                    eieu eieuVarG = eiiy.g("com/google/android/apps/messaging/ui/conversationlist/ShareIntentFragment", 94, cwwe.class, "CreateComponent");
                    try {
                        Object objBb = bb();
                        eieuVarG.close();
                        eieu eieuVarG2 = eiiy.g("com/google/android/apps/messaging/ui/conversationlist/ShareIntentFragment", 99, cwwe.class, "CreatePeer");
                        try {
                            ea eaVar = (ea) ((eyig) ((ahib) objBb).d).a;
                            if (!(eaVar instanceof cwwe)) {
                                throw new IllegalStateException(a.M(eaVar, cwwk.class));
                            }
                            cwwe cwweVar = (cwwe) eaVar;
                            eyik eyikVar = ((ahib) objBb).bf;
                            eyik eyikVar2 = ((ahib) objBb).bg;
                            eyik eyikVar3 = ((ahib) objBb).bh;
                            ahkn ahknVar = ((ahib) objBb).a;
                            this.ah = new cwwk(cwweVar, eyikVar, eyikVar2, eyikVar3, ahknVar.b.hT, ahknVar.ij, ahknVar.aI);
                            eieuVarG2.close();
                            this.ah.p = this;
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
    public final Dialog gK(Bundle bundle) throws Resources.NotFoundException {
        envd envdVarB;
        super.gK(bundle);
        final cwwk cwwkVarH = H();
        cwwe cwweVar = cwwkVarH.a;
        eg egVarG = cwweVar.G();
        View viewInflate = egVarG.getLayoutInflater().inflate(R.layout.share_intent_conversation_list_view, (ViewGroup) null);
        cwwkVarH.j = (ListEmptyView) viewInflate.findViewById(R.id.no_conversations_view);
        cwwkVarH.j.c(R.drawable.ic_oobe_conv_list);
        cwwh cwwhVar = new cwwh();
        babw babwVar = cwwkVarH.g;
        badi badiVar = (badi) babwVar.a();
        lzg lzgVarA = lzg.a(cwweVar);
        badi.a.m("init loader");
        badiVar.f = new Bundle();
        badiVar.f.putString("bindingId", babwVar.b());
        badiVar.e = lzgVarA;
        badiVar.e.c(1, badiVar.f, badiVar);
        cwwd cwwdVar = (cwwd) cwwkVarH.d.b();
        fcsu fcsuVar = cwwdVar.a;
        eidm eidmVar = (eidm) cwwdVar.b.b();
        eidmVar.getClass();
        egVarG.getClass();
        cwwkVarH.k = new cwwc(fcsuVar, eidmVar, egVarG, cwwkVarH);
        cwwkVarH.k.B(true);
        cwwkVarH.i = (RecyclerView) viewInflate.findViewById(android.R.id.list);
        cwwkVarH.i.ao(cwwhVar);
        cwwkVarH.i.aK();
        cwwkVarH.i.al(cwwkVarH.k);
        ViewTreeObserver viewTreeObserver = cwwkVarH.i.getViewTreeObserver();
        final eigp eigpVar = (eigp) cwwkVarH.f.b();
        final cwwi cwwiVar = new cwwi(cwwkVarH);
        viewTreeObserver.addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: eifu
            public final /* synthetic */ String c = "com/google/android/apps/messaging/ui/conversationlist/ShareIntentFragmentPeer";
            public final /* synthetic */ String d = "onCreateDialog";
            public final /* synthetic */ String e = "layout changed";

            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener = cwwiVar;
                if (eidc.v()) {
                    onGlobalLayoutListener.onGlobalLayout();
                    return;
                }
                String str = this.e;
                String str2 = this.d;
                eieh eiehVarC = eigpVar.c(str, this.c, str2, 133);
                try {
                    onGlobalLayoutListener.onGlobalLayout();
                    eiehVarC.close();
                } catch (Throwable th) {
                    try {
                        eiehVarC.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            }
        });
        eeji eejiVar = new eeji(egVarG);
        eejiVar.w(viewInflate);
        eejiVar.u(cwwkVarH.l.a());
        Bundle bundle2 = cwweVar.m;
        if (bundle2 == null || !bundle2.getBoolean("hide_conv_button_key")) {
            eejiVar.r(R.string.share_new_message, new DialogInterface.OnClickListener() { // from class: cwwf
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    cwwk cwwkVar = cwwkVarH;
                    cwwkVar.m = true;
                    cwwkVar.l.c();
                }
            });
        }
        if (bundle2 != null && (envdVarB = envd.b(bundle2.getInt("intent_source", 0))) != null) {
            cwwkVarH.n = envdVarB;
        }
        eejiVar.m(R.string.share_cancel, null);
        int dimensionPixelSize = egVarG.getResources().getDimensionPixelSize(R.dimen.share_dialog_vertical_padding);
        Rect rect = eejiVar.b;
        rect.top = dimensionPixelSize;
        rect.bottom = dimensionPixelSize;
        iv ivVarCreate = eejiVar.create();
        ivVarCreate.setOnShowListener(new DialogInterface.OnShowListener() { // from class: cwwg
            @Override // android.content.DialogInterface.OnShowListener
            public final void onShow(DialogInterface dialogInterface) {
                cwwk cwwkVar = cwwkVarH;
                ((ajfx) cwwkVar.e.b()).c(ajfs.b, cwwkVar.o.get());
            }
        });
        return ivVarCreate;
    }

    @Override // defpackage.cwvn, defpackage.dn, defpackage.ea
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

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ecdn, defpackage.dn, defpackage.ea
    public final void h(Bundle bundle) {
        this.ak.k();
        try {
            super.h(bundle);
            cwwk cwwkVarH = H();
            ((ajfx) cwwkVarH.e.b()).a(ajfs.b, cwwkVarH.o.incrementAndGet());
            eg egVarG = cwwkVarH.a.G();
            if (egVarG instanceof cwwj) {
                cwwkVarH.l = (cwwj) egVarG;
            } else if (egVarG instanceof ehlg) {
                Object objH = ((ehlg) egVarG).H();
                if (objH instanceof cwwj) {
                    cwwkVarH.l = (cwwj) objH;
                }
            }
            babw babwVar = cwwkVarH.g;
            badj badjVar = (badj) cwwkVarH.c.b();
            cdpg cdpgVar = cdpg.HOME;
            fcsu fcsuVar = badjVar.a;
            fcsu fcsuVar2 = badjVar.b;
            axgc axgcVar = (axgc) badjVar.c.b();
            axgcVar.getClass();
            egVarG.getClass();
            cdpgVar.getClass();
            babwVar.c(new badi(fcsuVar, fcsuVar2, axgcVar, egVarG, cwwkVarH, cdpgVar, Optional.of(true), Optional.of(false)));
            eidc.q();
        } finally {
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
        eg egVarG;
        eifp eifpVarI = this.ak.i();
        try {
            super.onDismiss(dialogInterface);
            cwwk cwwkVarH = H();
            if (!cwwkVarH.m && (egVarG = cwwkVarH.a.G()) != null && !egVarG.isChangingConfigurations()) {
                egVarG.finish();
            }
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

    @Override // defpackage.cwvn, defpackage.ea
    public final Context z() {
        if (super.z() == null) {
            return null;
        }
        return bd();
    }
}
