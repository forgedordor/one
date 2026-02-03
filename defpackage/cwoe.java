package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import com.google.android.apps.messaging.R;
import com.google.android.gms.googlehelp.GoogleHelp;
import com.google.android.gms.googlehelp.InProductHelp;
import defpackage.eyhq;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cwoe extends cwnr implements ehlg, eyhx, ehlc, ehnw, eifl {
    private cwoh a;
    private boolean ag;
    private Context d;
    private final lvn e = new lvn(this);

    @Deprecated
    public cwoe() {
        ecem.c();
    }

    @Override // defpackage.ehlg
    public final Class F() {
        return cwoh.class;
    }

    @Override // defpackage.ehnp, defpackage.ecdo, defpackage.ea
    public final View M(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.c.k();
        try {
            final cwoh cwohVarH = H();
            layoutInflater.getClass();
            View viewInflate = layoutInflater.inflate(R.layout.rbm_deep_link_error_page_fragment, viewGroup, false);
            Button button = (Button) viewInflate.findViewById(R.id.rbm_error_page_button);
            button.setText(viewInflate.getContext().getResources().getString(R.string.rbm_error_page_button));
            button.setOnClickListener(new View.OnClickListener() { // from class: cwof
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    cwohVarH.a.fg().finish();
                }
            });
            TextView textView = (TextView) viewInflate.findViewById(R.id.rbm_error_page_body);
            Context context = viewInflate.getContext();
            context.getClass();
            String string = context.getResources().getString(R.string.rbm_error_page_learn_more);
            string.getClass();
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(context.getResources().getString(R.string.rbm_error_page_body, string));
            cpef.e(context, spannableStringBuilder, string, new View.OnClickListener() { // from class: cwog
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    cwoh cwohVar = cwohVarH;
                    eg egVarFg = cwohVar.a.fg();
                    GoogleHelp googleHelp = new GoogleHelp("eligible");
                    googleHelp.G = true;
                    fcsu fcsuVar = cwohVar.b;
                    googleHelp.q = Uri.parse((String) fcsuVar.b());
                    InProductHelp inProductHelp = new InProductHelp(googleHelp, null, null, 0, null, 0, null);
                    inProductHelp.c = (String) fcsuVar.b();
                    new ddci(egVarFg).d(inProductHelp);
                }
            });
            textView.setText(spannableStringBuilder);
            eebt.b(textView);
            eebt.c(textView);
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

    @Override // defpackage.cwnr, defpackage.ecdo, defpackage.ea
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

    @Override // defpackage.cwnr
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
    public final cwoh H() {
        cwoh cwohVar = this.a;
        if (cwohVar == null) {
            throw new IllegalStateException("peer() called before initialized.");
        }
        if (this.ag) {
            throw new IllegalStateException("peer() called after destroyed.");
        }
        return cwohVar;
    }

    @Override // defpackage.cwnr, defpackage.ehnp, defpackage.ea
    public final void g(Context context) {
        this.c.k();
        try {
            if (this.ag) {
                throw new IllegalStateException("A Fragment cannot be attached more than once. Instead, create a new Fragment instance.");
            }
            super.g(context);
            if (this.a == null) {
                try {
                    eieu eieuVarG = eiiy.g("com/google/android/apps/messaging/ui/conversation/rbm/RbmDeepLinkErrorPageFragment", 85, cwoe.class, "CreateComponent");
                    try {
                        Object objBb = bb();
                        eieuVarG.close();
                        eieu eieuVarG2 = eiiy.g("com/google/android/apps/messaging/ui/conversation/rbm/RbmDeepLinkErrorPageFragment", 90, cwoe.class, "CreatePeer");
                        try {
                            ea eaVar = (ea) ((eyig) ((ahib) objBb).d).a;
                            if (!(eaVar instanceof cwoe)) {
                                throw new IllegalStateException(a.M(eaVar, cwoh.class));
                            }
                            this.a = new cwoh((cwoe) eaVar, ((ahib) objBb).a.b.oG);
                            eieuVarG2.close();
                            this.a.c = this;
                            this.Z.c(new ehns(this.c, this.e));
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

    @Override // defpackage.cwnr, defpackage.ea
    public final Context z() {
        if (super.z() == null) {
            return null;
        }
        return bd();
    }
}
