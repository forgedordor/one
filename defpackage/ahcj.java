package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.compose.ui.platform.ComposeView;
import com.google.android.apps.messaging.R;
import com.google.protobuf.contrib.android.ProtoParsers;
import defpackage.eyhq;
import java.io.IOException;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ahcj extends ahce implements ehlg, eyhx, ehlc, ehnw, eifl {
    private ahco a;
    private boolean ag;
    private Context d;
    private final lvn e = new lvn(this);

    @Deprecated
    public ahcj() {
        ecem.c();
    }

    @Override // defpackage.ehlg
    public final Class F() {
        return ahco.class;
    }

    @Override // defpackage.ehnp, defpackage.ecdo, defpackage.ea
    public final View M(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.c.k();
        try {
            s(layoutInflater, viewGroup, bundle);
            ahco ahcoVarH = H();
            layoutInflater.getClass();
            View viewInflate = layoutInflater.inflate(true != ahcoVarH.b() ? R.layout.identity_details_fragment_legacy : R.layout.identity_details_fragment, viewGroup, false);
            fcsu fcsuVar = ahcoVarH.e;
            if (((bvur) fcsuVar.b()).m()) {
                viewInflate.getClass();
                TextView textView = (TextView) viewInflate.findViewById(R.id.identity_details_intro);
                fcsu fcsuVar2 = ahcoVarH.d;
                textView.setText(R.string.security_key_page_intro);
                final Context context = viewInflate.getContext();
                Resources resources = context.getResources();
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(resources.getString(R.string.security_key_page_description));
                String strD = ((bvur) fcsuVar.b()).d();
                strD.getClass();
                if (!TextUtils.isEmpty(strD)) {
                    String strA = cpef.a(context);
                    spannableStringBuilder = dajs.g(context, spannableStringBuilder.append((CharSequence) " ").append((CharSequence) strA).toString(), strA);
                    final Uri uriA = dajs.a(strD, context);
                    ((TextView) viewInflate.findViewById(R.id.identity_details_learn_more)).setOnClickListener(new View.OnClickListener() { // from class: ahck
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) throws IOException {
                            ekrg ekrgVar = ahco.a;
                            Context context2 = context;
                            context2.getClass();
                            Intent data = new Intent("android.intent.action.VIEW").setData(uriA);
                            data.getClass();
                            eiid.o(context2, data);
                        }
                    });
                }
                ((TextView) viewInflate.findViewById(R.id.identity_details_learn_more)).setText(spannableStringBuilder);
                ehbb ehbbVar = (ehbb) ahcoVarH.h.b();
                bvux bvuxVar = (bvux) ahcoVarH.f.b();
                ahci ahciVar = ahcoVarH.i;
                aubq aubqVar = ahciVar.c;
                if (aubqVar == null) {
                    aubqVar = aubq.a;
                }
                ehbbVar.g(R.id.get_identity_details_security_key, bvuxVar.a(aubqVar, ahciVar.d), ahcoVarH.j);
                ((ains) ahcoVarH.g.b()).c("Bugle.Etouffee.UI.IdentityDetails.Page.Open.Counts");
            }
            if (ahcoVarH.b()) {
                viewInflate.getClass();
                ComposeView composeView = (ComposeView) viewInflate.findViewById(R.id.identity_details_compose_view);
                composeView.j();
                composeView.a(new hxd(-1954299512, true, new ahcn(ahcoVarH)));
            }
            viewInflate.getClass();
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

    @Override // defpackage.ahce, defpackage.ecdo, defpackage.ea
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

    @Override // defpackage.ahce
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
    public final ahco H() {
        ahco ahcoVar = this.a;
        if (ahcoVar == null) {
            throw new IllegalStateException("peer() called before initialized.");
        }
        if (this.ag) {
            throw new IllegalStateException("peer() called after destroyed.");
        }
        return ahcoVar;
    }

    @Override // defpackage.ahce, defpackage.ehnp, defpackage.ea
    public final void g(Context context) {
        this.c.k();
        try {
            if (this.ag) {
                throw new IllegalStateException("A Fragment cannot be attached more than once. Instead, create a new Fragment instance.");
            }
            super.g(context);
            if (this.a == null) {
                try {
                    eieu eieuVarG = eiiy.g("com/google/android/apps/messaging/privacy/identitydetails/IdentityDetailsFragment", 86, ahcj.class, "CreateComponent");
                    try {
                        Object objBb = bb();
                        eieuVarG.close();
                        eieu eieuVarG2 = eiiy.g("com/google/android/apps/messaging/privacy/identitydetails/IdentityDetailsFragment", 91, ahcj.class, "CreatePeer");
                        try {
                            ea eaVar = (ea) ((eyig) ((ahib) objBb).d).a;
                            ahkn ahknVar = ((ahib) objBb).a;
                            eyik eyikVar = ahknVar.id;
                            eyik eyikVar2 = ahknVar.dL;
                            ahng ahngVar = ahknVar.b;
                            eyik eyikVar3 = ahngVar.ot;
                            eyik eyikVar4 = ahknVar.a.c;
                            eyik eyikVar5 = ((ahib) objBb).ag;
                            Bundle bundleA = ((ahib) objBb).a();
                            evrr evrrVar = (evrr) ahngVar.gp.b();
                            ejwl.b(bundleA.containsKey("TIKTOK_FRAGMENT_ARGUMENT"), "Proto @Argument for Fragment could not be found. @Arguments must be provided using the Fragment#create(MessageLite argument) overload.");
                            ahci ahciVar = (ahci) ProtoParsers.f(bundleA, "TIKTOK_FRAGMENT_ARGUMENT", ahci.a, evrrVar);
                            ahciVar.getClass();
                            this.a = new ahco(eaVar, eyikVar, eyikVar2, eyikVar3, eyikVar4, eyikVar5, ahciVar);
                            eieuVarG2.close();
                            this.Z.c(new ehns(this.c, this.e));
                        } finally {
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

    @Override // defpackage.ahce, defpackage.ea
    public final Context z() {
        if (super.z() == null) {
            return null;
        }
        return bd();
    }
}
