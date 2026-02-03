package defpackage;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import com.google.android.apps.messaging.R;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.google.protobuf.contrib.android.ProtoParsers;
import czte.a;
import j$.time.Duration;
import j$.util.Optional;
import java.io.IOException;
import java.util.Locale;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class czsw extends czst implements ehlg, eyhx, ehlc, ehnw, eifl {
    private czte ag;
    private Context ah;
    private final lvn ai = new lvn(this);
    private final eics aj = new eics(this);
    private boolean ak;

    @Deprecated
    public czsw() {
        ecem.c();
    }

    public static czsw aY(cztp cztpVar) {
        czsw czswVar = new czsw();
        eyhj.e(czswVar);
        ehog.a(czswVar, cztpVar);
        return czswVar;
    }

    @Override // defpackage.ehlg
    public final Class F() {
        return czte.class;
    }

    @Override // defpackage.ecdv, defpackage.ea
    public final View M(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.aj.k();
        try {
            super.M(layoutInflater, viewGroup, bundle);
            czte czteVarH = H();
            View viewInflate = layoutInflater.inflate(R.layout.phone_number_input_bottomsheet_layout, viewGroup, false);
            viewInflate.getViewTreeObserver().addOnWindowFocusChangeListener(new cztg(czteVarH));
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

    @Override // defpackage.czst
    protected final /* synthetic */ eyhj aW() {
        return new ehog(this);
    }

    @Override // defpackage.ehlg
    /* renamed from: aZ, reason: merged with bridge method [inline-methods] */
    public final czte H() {
        czte czteVar = this.ag;
        if (czteVar == null) {
            throw new IllegalStateException("peer() called before initialized.");
        }
        if (this.ak) {
            throw new IllegalStateException("peer() called after destroyed.");
        }
        return czteVar;
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

    @Override // defpackage.czst, defpackage.ecdv, defpackage.ea
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
            czte czteVarH = H();
            cztr cztrVar = czteVarH.z;
            if (cztrVar != null) {
                cztrVar.a.b = null;
                czteVarH.z = null;
            }
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
            czte czteVarH = H();
            czteVarH.l();
            if (((Optional) czteVarH.c.get()).isPresent()) {
                czteVarH.k(emfc.RCS_PROVISIONING_MANUAL_MSISDN_ENTRY_SEEN);
            }
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
            final czte czteVarH = H();
            if (czteVarH.p()) {
                TextView textView = (TextView) czteVarH.d.N().findViewById(R.id.tos_reminder_text);
                Context context = ((czty) czteVarH.h.b()).a;
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(context.getString(R.string.phone_number_input_tos_reminder_text_v2, context.getString(R.string.phone_number_input_tos_text_v2)));
                String string = context.getResources().getString(R.string.phone_number_input_tos_text_v2);
                int iIndexOf = TextUtils.indexOf(spannableStringBuilder, string);
                if (iIndexOf != -1) {
                    spannableStringBuilder.setSpan(new cztx(czqr.b(craf.c(context))), iIndexOf, string.length() + iIndexOf, 17);
                }
                textView.setText(spannableStringBuilder);
                eebt.b(textView);
                eebt.c(textView);
                textView.setVisibility(0);
            }
            if (czteVarH.q()) {
                czsw czswVar = czteVarH.d;
                czswVar.N().findViewById(R.id.multi_sim_subtitle).setVisibility(0);
                ((czqx) czteVarH.i.b()).c(czswVar.A(), (TextView) czswVar.N().findViewById(R.id.multi_sim_subtitle));
            }
            czsw czswVar2 = czteVarH.d;
            TextInputLayout textInputLayout = (TextInputLayout) czswVar2.N().findViewById(R.id.country_code_text_container);
            textInputLayout.u(new cztf(textInputLayout));
            TextInputEditText textInputEditText = (TextInputEditText) czswVar2.N().findViewById(R.id.country_code_text);
            textInputEditText.setInputType(0);
            textInputEditText.setKeyListener(null);
            textInputEditText.setLongClickable(false);
            textInputEditText.setOnClickListener(new View.OnClickListener() { // from class: cztc
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    czte czteVar = czteVarH;
                    adj adjVar = czteVar.u;
                    if (adjVar != null) {
                        adjVar.c(czteVar.f());
                    }
                }
            });
            textInputEditText.setOnTouchListener(new View.OnTouchListener() { // from class: cztd
                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view2, MotionEvent motionEvent) {
                    if (motionEvent.getAction() != 1) {
                        return false;
                    }
                    view2.performClick();
                    return true;
                }
            });
            TextInputEditText textInputEditText2 = (TextInputEditText) czswVar2.N().findViewById(R.id.phone_number_text);
            czteVarH.c().addTextChangedListener(czteVarH.e());
            eebt.c(textInputEditText);
            eebt.c(textInputEditText2);
            textInputLayout.h(cuiu.a(czswVar2.fg()));
            ((TextInputLayout) czswVar2.N().findViewById(R.id.phone_number_text_container)).h(cuiu.a(czswVar2.fg()));
            String strF = ((crqv) czteVarH.f.b()).f("manual_msisdn_entered_phone_number_for_sim_".concat(String.valueOf(czteVarH.e)), "");
            czteVarH.r = czteVarH.f();
            czteVarH.j();
            if (TextUtils.isEmpty(strF)) {
                czteVarH.a().setEnabled(false);
            } else {
                czteVarH.c().setText(strF);
            }
            ((Button) czswVar2.N().findViewById(R.id.cancel_button)).setOnClickListener(new View.OnClickListener() { // from class: cztb
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    czte czteVar = czteVarH;
                    if (dfpi.U()) {
                        ((czqr) czteVar.t.get()).g();
                    }
                    czteVar.s(9);
                    czteVar.k(emfc.RCS_PROVISIONING_MANUAL_MSISDN_ENTRY_REJECTED);
                    czteVar.i(0);
                    cztr cztrVar = czteVar.z;
                    if (cztrVar != null) {
                        czsw czswVar3 = czteVar.d;
                        final cztt czttVar = cztrVar.a;
                        final eg egVarFg = czswVar3.fg();
                        czttVar.h();
                        adci.a(egVarFg, egVarFg.getString(R.string.phone_number_ui_dismissed_snackbar_text_v2), egVarFg.getString(R.string.phone_number_ui_dismissed_snackbar_action_text), new View.OnClickListener() { // from class: cztq
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view3) throws IOException {
                                aijh aijhVar = (aijh) czttVar.a.b();
                                Activity activity = egVarFg;
                                eiid.o(activity, aijhVar.n(activity));
                            }
                        });
                    }
                    ((ckhg) czteVar.j.b()).m(czteVar.e, Duration.ZERO, 2, enxe.PHONE_NUMBER_INPUT_BOTTOM_SHEET_CANCEL_BUTTON);
                }
            });
            ((Button) czswVar2.N().findViewById(R.id.continue_button)).setOnClickListener(new View.OnClickListener() { // from class: czsz
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    final czte czteVar = czteVarH;
                    if (!czteVar.d().r()) {
                        czteVar.c().setError(czteVar.d.z().getString(R.string.phone_number_input_invalid_number_text));
                        return;
                    }
                    czteVar.s(10);
                    Editable text = czteVar.c().getText();
                    final ecww ecwwVar = czteVar.r;
                    final String strH = czteVar.h();
                    if (ecwwVar != null && text != null) {
                        cczv cczvVar = alvx.a;
                        if (((Boolean) new alvk().get()).booleanValue()) {
                            alqm alqmVarD = czteVar.d();
                            int iR = czteVar.r();
                            fcsu fcsuVar = czteVar.n;
                            cjtw cjtwVar = (cjtw) fcsuVar.b();
                            String str = czteVar.e;
                            cjtu cjtuVarA = cjtwVar.a(ejwk.b(alqmVarD.p(((Boolean) new alvk().get()).booleanValue())), iR == 4, str);
                            ((egpr) czteVar.k.b()).h(egpq.b(((cjtw) fcsuVar.b()).b(str, cjtuVarA)), egpo.a(cjtuVarA), czteVar.w);
                        } else {
                            String strB = ejwk.b(strH);
                            int iR2 = czteVar.r();
                            fcsu fcsuVar2 = czteVar.n;
                            cjtw cjtwVar2 = (cjtw) fcsuVar2.b();
                            String str2 = czteVar.e;
                            cjtu cjtuVarA2 = cjtwVar2.a(strB, iR2 == 4, str2);
                            ((egpr) czteVar.k.b()).h(egpq.b(((cjtw) fcsuVar2.b()).b(str2, cjtuVarA2)), egpo.a(cjtuVarA2), czteVar.w);
                        }
                        ((egpr) czteVar.k.b()).g(egpq.b(eijx.f(new Runnable() { // from class: czsx
                            @Override // java.lang.Runnable
                            public final void run() {
                                byte[] byteArray = ecwwVar.toByteArray();
                                czte czteVar2 = czteVar;
                                fcsu fcsuVar3 = czteVar2.f;
                                ((crqv) fcsuVar3.b()).i("manual_msisdn_entered_country_code", byteArray);
                                crqv crqvVar = (crqv) fcsuVar3.b();
                                String str3 = czteVar2.e;
                                crqvVar.l("manual_msisdn_entered_phone_number_for_sim_".concat(String.valueOf(str3)), strH);
                                ((ckhg) czteVar2.j.b()).m(str3, Duration.ZERO, 2, enxe.PHONE_NUMBER_INPUT_BOTTOM_SHEET_CONTINUE_BUTTON);
                            }
                        }, (Executor) czteVar.g.b())), czteVar.x);
                    }
                    final String strG = czteVar.g();
                    if (dfpi.U()) {
                        ((czqr) czteVar.t.get()).g();
                    } else {
                        cczv cczvVar2 = alvx.a;
                        if (((Boolean) new alvk().get()).booleanValue()) {
                            final czty cztyVar = (czty) czteVar.h.b();
                            final alqm alqmVarD2 = czteVar.d();
                            final String str3 = czteVar.e;
                            auvh.h(eijx.f(new Runnable() { // from class: cztu
                                @Override // java.lang.Runnable
                                public final void run() {
                                    cqca.c("Bugle", "send msisdn to provisioning engine");
                                    String str4 = str3;
                                    if (TextUtils.isEmpty(str4)) {
                                        return;
                                    }
                                    alqm alqmVar = alqmVarD2;
                                    if (alqmVar.D()) {
                                        return;
                                    }
                                    czty cztyVar2 = cztyVar;
                                    cczv cczvVar3 = alvx.a;
                                    ((dgsz) cztyVar2.c.b()).v(str4, alqmVar.p(((Boolean) new alvk().get()).booleanValue()));
                                }
                            }, cztyVar.b));
                        } else {
                            final czty cztyVar2 = (czty) czteVar.h.b();
                            final String str4 = czteVar.e;
                            auwa.a(new Runnable() { // from class: cztw
                                @Override // java.lang.Runnable
                                public final void run() {
                                    cqca.c("Bugle", "send msisdn to provisioning engine");
                                    String str5 = str4;
                                    if (TextUtils.isEmpty(str5)) {
                                        return;
                                    }
                                    String str6 = strG;
                                    if (TextUtils.isEmpty(str6)) {
                                        return;
                                    }
                                    ((dgsz) cztyVar2.c.b()).v(str5, str6);
                                }
                            }, cztyVar2.b);
                        }
                    }
                    czteVar.k(emfc.RCS_PROVISIONING_MANUAL_MSISDN_ENTRY_ACCEPTED);
                    if (czteVar.r() == 4) {
                        String str5 = czteVar.e;
                        ((ekrd) ((ekrd) czte.a.h()).h("com/google/android/apps/messaging/ui/rcs/setup/manual/PhoneNumberInputBottomSheetFragmentPeer", "incrementRetryCounterForSimId", 956, "PhoneNumberInputBottomSheetFragmentPeer.java")).t("Incrementing daily retry counter for simId: %s", dhiz.SIM_ID.c(str5));
                        ((egpr) czteVar.k.b()).h(egpq.b(((cjzq) czteVar.o.b()).e(new dggp(str5))), new egpo(str5), czteVar.y);
                    }
                    czteVar.i(-1);
                    cztr cztrVar = czteVar.z;
                    if (cztrVar != null) {
                        czsw czswVar3 = czteVar.d;
                        cztt czttVar = cztrVar.a;
                        eg egVarFg = czswVar3.fg();
                        czttVar.h();
                        adci.b(egVarFg, egVarFg.getString(R.string.phone_number_ui_accepted_snackbar_text_v2));
                    }
                }
            });
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

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r31v0, types: [android.content.Context] */
    /* JADX WARN: Type inference failed for: r31v1 */
    /* JADX WARN: Type inference failed for: r31v2, types: [eieu] */
    @Override // defpackage.czst, defpackage.dn, defpackage.ea
    public final void g(Context context) {
        ea eaVar;
        this.aj.k();
        try {
            if (this.ak) {
                throw new IllegalStateException("A Fragment cannot be attached more than once. Instead, create a new Fragment instance.");
            }
            super.g(context);
            if (this.ag == null) {
                try {
                    eieu eieuVarG = eiiy.g("com/google/android/apps/messaging/ui/rcs/setup/manual/PhoneNumberInputBottomSheetFragment", 95, czsw.class, "CreateComponent");
                    try {
                        Object objBb = bb();
                        eieuVarG.close();
                        eieu eieuVarG2 = eiiy.g("com/google/android/apps/messaging/ui/rcs/setup/manual/PhoneNumberInputBottomSheetFragment", 100, czsw.class, "CreatePeer");
                        try {
                            eaVar = (ea) ((eyig) ((ahib) objBb).d).a;
                        } catch (Throwable th) {
                            th = th;
                            context = eieuVarG2;
                        }
                        try {
                            if (!(eaVar instanceof czsw)) {
                                throw new IllegalStateException(a.M(eaVar, czte.class));
                            }
                            czsw czswVar = (czsw) eaVar;
                            Bundle bundleA = ((ahib) objBb).a();
                            ahkn ahknVar = ((ahib) objBb).a;
                            ahng ahngVar = ahknVar.b;
                            evrr evrrVar = (evrr) ahngVar.gp.b();
                            ejwl.b(bundleA.containsKey("TIKTOK_FRAGMENT_ARGUMENT"), "Proto @Argument for Fragment could not be found. @Arguments must be provided using the Fragment#create(MessageLite argument) overload.");
                            cztp cztpVar = (cztp) ProtoParsers.f(bundleA, "TIKTOK_FRAGMENT_ARGUMENT", cztp.a, evrrVar);
                            cztpVar.getClass();
                            ahnh ahnhVar = ahknVar.a;
                            this.ag = new czte(czswVar, cztpVar, ahnhVar.pB, ahknVar.aT, ahnhVar.pf, ahknVar.y, ahngVar.jF, ((ahib) objBb).bC, ahngVar.hX, ahnhVar.Wt, ahnhVar.PN, ahknVar.cD, ((ahib) objBb).l, ((ahib) objBb).b.ce, ahnhVar.aaY, ahngVar.jE, ((ahib) objBb).bD, ((ahib) objBb).k, ahnhVar.qi, ahnhVar.PT, ((ahib) objBb).f, ((ahib) objBb).bE, ahngVar.jn);
                            eieuVarG2.close();
                            this.Z.c(new ehns(this.aj, this.ai));
                        } catch (Throwable th2) {
                            th = th2;
                            Throwable th3 = th;
                            try {
                                context.close();
                                throw th3;
                            } catch (Throwable th4) {
                                th3.addSuppressed(th4);
                                throw th3;
                            }
                        }
                    } finally {
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
        } finally {
        }
    }

    @Override // defpackage.eefb, defpackage.kc, defpackage.dn
    public final Dialog gK(Bundle bundle) {
        super.gK(bundle);
        czte czteVarH = H();
        eefa eefaVar = new eefa(czteVarH.d.z(), R.style.ThemeOverlay_Bugle_InputBottomSheetDialog);
        eefaVar.b.b(eefaVar, new czth(czteVarH));
        eefaVar.setOnShowListener(new cztk(czteVarH));
        return eefaVar;
    }

    @Override // defpackage.czst, defpackage.dn, defpackage.ea
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
            czte czteVarH = H();
            fcsu fcsuVar = czteVarH.k;
            ((egpr) fcsuVar.b()).j(czteVarH.x);
            cqce cqceVar = czte.b;
            czteVarH.v = new cjsc(cqceVar);
            ((egpr) fcsuVar.b()).j(czteVarH.v);
            czteVarH.w = new cjtv(cqceVar);
            ((egpr) fcsuVar.b()).j(czteVarH.w);
            ((egpr) fcsuVar.b()).j(czteVarH.y);
            ehac ehacVar = (ehac) czteVarH.m.b();
            final cjtk cjtkVar = (cjtk) czteVarH.l.b();
            final String str = czteVarH.e;
            ehacVar.a(new egzf(cjtkVar.c, new egys(cjtkVar.e, new eopk() { // from class: cjtg
                @Override // defpackage.eopk
                public final eopy a(eopt eoptVar) {
                    return new eopy(cjtkVar.d(str).h(new ejvr() { // from class: cjsm
                        @Override // defpackage.ejvr
                        public final Object apply(Object obj) {
                            return Integer.valueOf(cjtk.b((ekgb) obj));
                        }
                    }, eoqg.a));
                }
            }, cjxi.b)), czteVarH.new a());
            ehbb ehbbVar = (ehbb) czteVarH.p.b();
            cjrv cjrvVar = (cjrv) czteVarH.q.b();
            str.getClass();
            ehbbVar.g(R.id.phone_number_input_ui_sim_info_id, new cjru(cjrvVar, str), new cztm(czteVarH));
            czteVarH.u = czteVarH.d.O(new czti(czteVarH), new cztj(czteVarH));
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
        this.aj.g().close();
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

    @Override // defpackage.czst, defpackage.ea
    public final Context z() {
        if (super.z() == null) {
            return null;
        }
        return bd();
    }
}
