package defpackage;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;
import androidx.car.app.hardware.info.EnergyProfile;
import com.google.android.apps.messaging.R;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class czri extends czrh implements ehlg, eyhx, ehlc, ehnw, eifl {
    private czrn ag;
    private Context ah;
    private final lvn ai = new lvn(this);
    private final eics aj = new eics(this);
    private boolean ak;

    @Deprecated
    public czri() {
        ecem.c();
    }

    @Override // defpackage.ehlg
    public final Class F() {
        return czrn.class;
    }

    @Override // defpackage.ecdv, defpackage.ea
    public final View M(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i;
        int i2;
        this.aj.k();
        try {
            super.M(layoutInflater, viewGroup, bundle);
            final czrn czrnVarH = H();
            layoutInflater.getClass();
            View viewInflate = layoutInflater.inflate(R.layout.rcs_default_on_legal_fyi_fragment, viewGroup, false);
            TextView textView = (TextView) viewInflate.findViewById(R.id.rcs_default_on_legal_fyi_title);
            czri czriVar = czrnVarH.b;
            Context contextA = czriVar.A();
            String str = czrnVarH.e;
            if (fdbq.f(str, "NEW_USERS_UI")) {
                i = R.string.rcs_default_on_title_text_new_users;
            } else {
                if (!fdbq.f(str, "DECLINED_TOS_UI")) {
                    throw new IllegalStateException("Unexpected UI variant.");
                }
                i = R.string.rcs_default_on_title_text_declined_tos_users;
            }
            textView.setText(contextA.getString(i));
            View viewFindViewById = viewInflate.findViewById(R.id.rcs_default_on_legal_fyi_description);
            viewFindViewById.getClass();
            TextView textView2 = (TextView) viewFindViewById;
            Context contextA2 = czriVar.A();
            String string = contextA2.getString(R.string.rcs_default_on_legal_fyi_settings_link);
            string.getClass();
            String string2 = contextA2.getString(R.string.rcs_default_on_legal_fyi_description_rcs_link);
            string2.getClass();
            if (fdbq.f(str, "NEW_USERS_UI")) {
                i2 = R.string.rcs_default_on_legal_fyi_description_text_new_users_pvaas_version;
            } else {
                if (!fdbq.f(str, "DECLINED_TOS_UI")) {
                    throw new IllegalStateException("Unexpected UI variant.");
                }
                i2 = R.string.rcs_default_on_legal_fyi_description_text_declined_tos_users_pvaas_version;
            }
            String string3 = contextA2.getString(i2, string, string2);
            string3.getClass();
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string3);
            int iV = fdgn.V(string3, string);
            spannableStringBuilder.setSpan(new czrl(czrnVarH, contextA2), iV, string.length() + iV, 17);
            int iV2 = fdgn.V(string3, string2);
            spannableStringBuilder.setSpan(new czrm(czrnVarH), iV2, string2.length() + iV2, 17);
            textView2.setText(spannableStringBuilder);
            eebt.b(textView2);
            eebt.c(textView2);
            ((ImageButton) viewInflate.findViewById(R.id.legal_fyi_close_btn)).setOnClickListener(new View.OnClickListener() { // from class: czrk
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    czrn czrnVar = czrnVarH;
                    czrnVar.b.f();
                    agzt agztVar = czrnVar.f;
                    if (agztVar != null) {
                        agztVar.d();
                    }
                }
            });
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
        return this.ai;
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

    @Override // defpackage.ecdv, defpackage.ea
    public final boolean aM(MenuItem menuItem) {
        eifp eifpVarJ = this.aj.j();
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
        this.aj.h(i, i2);
        eidc.q();
    }

    @Override // defpackage.czrh
    protected final /* synthetic */ eyhj aW() {
        return new ehog(this);
    }

    @Override // defpackage.ehlg
    /* renamed from: aY, reason: merged with bridge method [inline-methods] */
    public final czrn H() {
        czrn czrnVar = this.ag;
        if (czrnVar == null) {
            throw new IllegalStateException("peer() called before initialized.");
        }
        if (this.ak) {
            throw new IllegalStateException("peer() called after destroyed.");
        }
        return czrnVar;
    }

    @Override // defpackage.ecdv, defpackage.ea
    public final void ae(Bundle bundle) {
        this.aj.k();
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

    @Override // defpackage.ecdv, defpackage.ea
    public final void af(int i, int i2, Intent intent) {
        eifp eifpVarF = this.aj.f();
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

    @Override // defpackage.czrh, defpackage.ecdv, defpackage.ea
    public final void ag(Activity activity) {
        this.aj.k();
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

    @Override // defpackage.ecdv, defpackage.ea
    public final void ai() {
        eifp eifpVarB = this.aj.b();
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

    @Override // defpackage.ecdv, defpackage.ea
    public final void am() {
        this.aj.k();
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

    @Override // defpackage.ecdv, defpackage.ea
    public final void ao() {
        eifp eifpVarB = this.aj.b();
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

    @Override // defpackage.ecdv, defpackage.ea
    public final void ap(View view, Bundle bundle) {
        this.aj.k();
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
        if (this.ah == null) {
            this.ah = new ehnz(this, super.z());
        }
        return this.ah;
    }

    @Override // defpackage.eifl
    public final eiik bf() {
        return this.aj.a;
    }

    @Override // defpackage.ehnw
    public final Locale bg() {
        return ehnv.a(this);
    }

    @Override // defpackage.eifl
    public final void bh(eiik eiikVar, boolean z) {
        this.aj.e(eiikVar, z);
    }

    @Override // defpackage.eifl
    public final void bi(eiik eiikVar) {
        this.aj.b = eiikVar;
    }

    @Override // defpackage.czrh, defpackage.dn, defpackage.ea
    public final void g(Context context) {
        this.aj.k();
        try {
            if (this.ak) {
                throw new IllegalStateException("A Fragment cannot be attached more than once. Instead, create a new Fragment instance.");
            }
            super.g(context);
            if (this.ag == null) {
                try {
                    eieu eieuVarG = eiiy.g("com/google/android/apps/messaging/ui/rcs/defaulton/popup/RcsDefaultOnBottomSheetFragment", 96, czri.class, "CreateComponent");
                    try {
                        Object objBb = bb();
                        eieuVarG.close();
                        eieu eieuVarG2 = eiiy.g("com/google/android/apps/messaging/ui/rcs/defaulton/popup/RcsDefaultOnBottomSheetFragment", EnergyProfile.EVCONNECTOR_TYPE_OTHER, czri.class, "CreatePeer");
                        try {
                            ea eaVar = (ea) ((eyig) ((ahib) objBb).d).a;
                            if (!(eaVar instanceof czri)) {
                                throw new IllegalStateException(a.M(eaVar, czrn.class));
                            }
                            this.ag = new czrn((czri) eaVar, ((ahib) objBb).b.bA, ((ahib) objBb).a.b.jn, ((ahib) objBb).H());
                            eieuVarG2.close();
                            this.Z.c(new ehns(this.aj, this.ai));
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
                eics eicsVar = this.aj;
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

    @Override // defpackage.eefb, defpackage.kc, defpackage.dn
    public final Dialog gK(Bundle bundle) {
        super.gK(bundle);
        eefa eefaVar = new eefa(H().b.A(), R.style.LegalFyiBottomSheetTheme);
        eefaVar.setOnShowListener(new DialogInterface.OnShowListener() { // from class: czrj
            @Override // android.content.DialogInterface.OnShowListener
            public final void onShow(DialogInterface dialogInterface) throws Resources.NotFoundException {
                eksp ekspVar = czrn.a;
                dialogInterface.getClass();
                BottomSheetBehavior bottomSheetBehaviorV = BottomSheetBehavior.v(((Dialog) dialogInterface).findViewById(R.id.design_bottom_sheet));
                bottomSheetBehaviorV.getClass();
                bottomSheetBehaviorV.E(3);
            }
        });
        return eefaVar;
    }

    @Override // defpackage.czrh, defpackage.dn, defpackage.ea
    public final LayoutInflater go(Bundle bundle) {
        this.aj.k();
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

    @Override // defpackage.ecdv, defpackage.dn, defpackage.ea
    public final void h(Bundle bundle) {
        this.aj.k();
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

    @Override // defpackage.eefb, defpackage.dn
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

    @Override // defpackage.ecdv, defpackage.dn, defpackage.ea
    public final void i() {
        eifp eifpVarB = this.aj.b();
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

    @Override // defpackage.ecdv, defpackage.dn, defpackage.ea
    public final void j() {
        eifp eifpVarA = this.aj.a();
        try {
            super.j();
            this.ak = true;
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

    @Override // defpackage.ecdv, defpackage.dn, defpackage.ea
    public final void k(Bundle bundle) {
        this.aj.k();
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

    @Override // defpackage.ecdv, defpackage.dn, defpackage.ea
    public final void l() {
        this.aj.k();
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

    @Override // defpackage.ecdv, defpackage.dn, defpackage.ea
    public final void m() {
        this.aj.k();
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
        eifp eifpVarG = this.aj.g();
        try {
            czrn czrnVarH = H();
            dialogInterface.getClass();
            agzt agztVar = czrnVarH.f;
            if (agztVar != null) {
                agztVar.d();
            }
            czrnVarH.f = null;
            eifpVarG.close();
        } catch (Throwable th) {
            try {
                eifpVarG.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.dn, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        eifp eifpVarI = this.aj.i();
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

    @Override // defpackage.czrh, defpackage.ea
    public final Context z() {
        if (super.z() == null) {
            return null;
        }
        return bd();
    }
}
