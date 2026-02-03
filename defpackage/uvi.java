package defpackage;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Configuration;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.compose.ui.platform.ComposeView;
import com.google.android.apps.messaging.R;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class uvi extends uux implements ehlg, eyhx, ehlc, ehnw, eifl {
    private uvl ah;
    private Context ai;
    private final lvn aj = new lvn(this);
    private final eics ak = new eics(this);
    private boolean al;

    @Deprecated
    public uvi() {
        ecem.c();
    }

    @Override // defpackage.ehlg
    public final Class F() {
        return uvl.class;
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

    @Override // defpackage.uux
    protected final /* synthetic */ eyhj aW() {
        return new ehog(this);
    }

    @Override // defpackage.ehlg
    /* renamed from: aY, reason: merged with bridge method [inline-methods] */
    public final uvl H() {
        uvl uvlVar = this.ah;
        if (uvlVar == null) {
            throw new IllegalStateException("peer() called before initialized.");
        }
        if (this.al) {
            throw new IllegalStateException("peer() called after destroyed.");
        }
        return uvlVar;
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

    @Override // defpackage.uux, defpackage.ecdn, defpackage.ea
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

    @Override // defpackage.uux, defpackage.dn, defpackage.ea
    public final void g(Context context) {
        this.ak.k();
        try {
            if (this.al) {
                throw new IllegalStateException("A Fragment cannot be attached more than once. Instead, create a new Fragment instance.");
            }
            super.g(context);
            if (this.ah == null) {
                try {
                    eieu eieuVarG = eiiy.g("com/google/android/apps/messaging/conversation/suggestions/magicrewrite/MagicComposeInfoDialogFragment", 95, uvi.class, "CreateComponent");
                    try {
                        Object objBb = bb();
                        eieuVarG.close();
                        eieu eieuVarG2 = eiiy.g("com/google/android/apps/messaging/conversation/suggestions/magicrewrite/MagicComposeInfoDialogFragment", 100, uvi.class, "CreatePeer");
                        try {
                            ahkn ahknVar = ((ahib) objBb).a;
                            this.ah = new uvl(((ahib) objBb).I, ahknVar.aI, ahknVar.b.ks);
                            eieuVarG2.close();
                            this.Z.c(new ehns(this.ak, this.aj));
                        } finally {
                        }
                    } catch (Throwable th) {
                        try {
                            eieuVarG.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
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
        } catch (Throwable th3) {
            try {
                eidc.q();
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
            }
            throw th3;
        }
    }

    @Override // defpackage.dn
    public final Dialog gK(Bundle bundle) {
        super.gK(bundle);
        final uvl uvlVarH = H();
        fcsu fcsuVar = uvlVarH.a;
        LayoutInflater layoutInflaterK = ((uvi) fcsuVar.b()).K();
        layoutInflaterK.getClass();
        View viewInflate = layoutInflaterK.inflate(R.layout.magic_compose_info_dialog, (ViewGroup) null);
        viewInflate.getClass();
        View viewFindViewById = viewInflate.findViewById(R.id.experiment_badge);
        viewFindViewById.getClass();
        ((ComposeView) viewFindViewById).a(uuw.b);
        if (((Boolean) crbf.ba.e()).booleanValue() || ((Boolean) crbf.bd.e()).booleanValue()) {
            View viewFindViewById2 = viewInflate.findViewById(R.id.magic_compose_info_dialog_content);
            viewFindViewById2.getClass();
            ((TextView) viewFindViewById2).setText(((uzl) uvlVarH.c.b()).a());
        }
        eeji eejiVar = new eeji(((uvi) fcsuVar.b()).A());
        eejiVar.w(viewInflate);
        fcsu fcsuVar2 = uvlVarH.b;
        eejiVar.r(R.string.info_dialog_got_it, new eigf((eigp) fcsuVar2.b(), "", "", 0, "MagicComposeInfoDialogFragment Got it button", new DialogInterface.OnClickListener() { // from class: uvj
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                ((uvi) uvlVarH.a.b()).hh();
            }
        }));
        eejiVar.m(R.string.info_dialog_learn_more, new eigf((eigp) fcsuVar2.b(), "", "", 0, "MagicComposeInfoDialogFragment Learn more button", new DialogInterface.OnClickListener() { // from class: uvk
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                Uri uri = Uri.parse("https://support.google.com/messages?p=magic_compose");
                uri.getClass();
                Intent intent = new Intent("android.intent.action.VIEW", uri);
                fcsu fcsuVar3 = uvlVarH.a;
                eilp.a((ea) fcsuVar3.b(), intent);
                ((uvi) fcsuVar3.b()).hh();
            }
        }));
        iv ivVarCreate = eejiVar.create();
        ivVarCreate.setCanceledOnTouchOutside(true);
        return ivVarCreate;
    }

    @Override // defpackage.uux, defpackage.dn, defpackage.ea
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

    @Override // defpackage.ecdn, defpackage.ea, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        ((uvi) H().a.b()).hh();
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

    @Override // defpackage.uux, defpackage.ea
    public final Context z() {
        if (super.z() == null) {
            return null;
        }
        return bd();
    }
}
