package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.CheckBox;
import android.widget.LinearLayout;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.helpandfeedback.advancedfeedback.ui.AdvancedFeedbackActivity;
import com.google.android.apps.messaging.helpandfeedback.advancedfeedback.ui.AdvancedFeedbackDataView;
import com.google.android.material.textfield.TextInputLayout;
import defpackage.eyhq;
import j$.util.Collection;
import j$.util.Optional;
import j$.util.function.Function$CC;
import j$.util.stream.Stream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Locale;
import java.util.concurrent.Callable;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aclj extends acmp implements ehlg, eyhx, ehlc, ehnw, eifl {
    private acme a;
    private boolean ag;
    private Context d;
    private final lvn e = new lvn(this);

    @Deprecated
    public aclj() {
        ecem.c();
    }

    public static aclj a() {
        aclj acljVar = new aclj();
        eyhj.e(acljVar);
        return acljVar;
    }

    @Override // defpackage.ehlg
    public final Class F() {
        return acme.class;
    }

    @Override // defpackage.ehnp, defpackage.ecdo, defpackage.ea
    public final View M(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.c.k();
        try {
            s(layoutInflater, viewGroup, bundle);
            final acme acmeVarH = H();
            View viewInflate = layoutInflater.inflate(R.layout.advanced_feedback_fragment, viewGroup, false);
            aclj acljVar = acmeVarH.d;
            eg egVarG = acljVar.G();
            egVarG.getClass();
            Bundle extras = egVarG.getIntent().getExtras();
            acmeVarH.x = (AdvancedFeedbackActivity) egVarG;
            if (extras != null) {
                acmeVarH.r = elie.b(extras.getInt("advanced_feedback_config_data"));
            }
            if (acmeVarH.r == elie.BUGLE_ADVANCED_FEEDBACK_SOURCE_NOTIFICATION_GENERIC && ((Boolean) ackx.d.e()).booleanValue()) {
                ((cgbn) acmeVarH.p.b()).l();
                ((ajgb) acmeVarH.u.b()).a(((clgq) acmeVarH.q.b()).f(egVarG.getIntent(), "report_issue_event_type", 3));
            }
            Bundle bundle2 = acljVar.m;
            String string = bundle2 != null ? bundle2.getString("screenshot_file_key") : null;
            if (string != null) {
                ehac ehacVar = acmeVarH.e;
                final acjh acjhVar = acmeVarH.f;
                final File file = new File(string);
                ehacVar.a(new egys(acjhVar.b, new eopk() { // from class: acjg
                    @Override // defpackage.eopk
                    public final eopy a(eopt eoptVar) {
                        acnp acnpVar = acjhVar.a;
                        ((eksl) acnpVar.c.o().h("com/google/android/apps/messaging/helpandfeedback/advancedfeedback/util/AdvancedFeedbackScreenshotHelper", "getScreenshot", 65, "AdvancedFeedbackScreenshotHelper.java")).q("Getting screenshot from temp file");
                        final File file2 = file;
                        return new eopy(eijx.g(new Callable() { // from class: acno
                            @Override // java.util.concurrent.Callable
                            public final Object call() throws IOException {
                                File file3 = file2;
                                if (!file3.exists()) {
                                    return Optional.empty();
                                }
                                FileInputStream fileInputStream = new FileInputStream(file3);
                                Bitmap bitmapDecodeStream = BitmapFactory.decodeStream(fileInputStream);
                                fileInputStream.close();
                                file3.delete();
                                return Optional.of(bitmapDecodeStream);
                            }
                        }, acnpVar.b));
                    }
                }, file.getPath()), acmeVarH.y);
            }
            acmeVarH.i = (TextInputLayout) viewInflate.findViewById(R.id.advanced_feedback_fragment_issue_list_layout);
            acmeVarH.h = (AutoCompleteTextView) viewInflate.findViewById(R.id.advanced_feedback_fragment_issue_list_view);
            acmeVarH.j = (LinearLayout) viewInflate.findViewById(R.id.advanced_feedback_fragment_checkbox_list);
            acjz acjzVar = acmeVarH.b;
            Stream map = Collection.EL.stream(acjzVar.a()).map(new Function() { // from class: aclk
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo536andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return ((acjy) obj).c();
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
            int i = ekgb.d;
            acmeVarH.h.setAdapter(new ArrayAdapter(acmeVarH.a, R.layout.advanced_feedback_issue_view, (ekgb) map.collect(ekcv.a)));
            acmeVarH.h.setOnItemClickListener(new AdapterView.OnItemClickListener() { // from class: aclv
                @Override // android.widget.AdapterView.OnItemClickListener
                public final void onItemClick(AdapterView adapterView, View view, int i2, long j) {
                    acme acmeVar = acmeVarH;
                    acmeVar.c((acjy) acmeVar.b.a().get(i2));
                }
            });
            acio acioVar = acmeVarH.c;
            ekfw ekfwVar = new ekfw();
            ekfwVar.h(acioVar.a);
            ekfwVar.h(acioVar.b);
            if (((Boolean) ackx.b.e()).booleanValue()) {
                ekfwVar.h((acin) acioVar.c.b());
            }
            if (((Boolean) cqcu.a.e()).booleanValue()) {
                ekfwVar.h(acioVar.d);
            }
            if (((Boolean) ackx.c.e()).booleanValue()) {
                ekfwVar.h(acioVar.e);
            }
            ekgb ekgbVarG = ekfwVar.g();
            int i2 = ((ekoe) ekgbVarG).c;
            for (int i3 = 0; i3 < i2; i3++) {
                acin acinVar = (acin) ekgbVarG.get(i3);
                AdvancedFeedbackDataView advancedFeedbackDataView = (AdvancedFeedbackDataView) layoutInflater.inflate(R.layout.advanced_feedback_data_view, (ViewGroup) acmeVarH.j, false);
                advancedFeedbackDataView.j = acinVar;
                String strH = acinVar.h();
                if (strH != null) {
                    advancedFeedbackDataView.h.setText(strH);
                }
                acmeVarH.k.add(advancedFeedbackDataView);
                acmeVarH.j.addView(advancedFeedbackDataView);
            }
            View viewFindViewById = viewInflate.findViewById(R.id.advanced_feedback_share_with_partner_title);
            View viewFindViewById2 = viewInflate.findViewById(R.id.advanced_feedback_share_with_external_card);
            if (crad.a()) {
                viewFindViewById2.setVisibility(8);
                viewFindViewById.setVisibility(8);
                acmeVarH.s.a = elic.BUGLE_ADVANCED_FEEDBACK_PARTNER_SHARING_CONSENT_NOT_REQUIRED;
            } else {
                final CheckBox checkBox = (CheckBox) viewFindViewById2.findViewById(R.id.advanced_feedback_share_with_external_checkbox);
                acmeVarH.s.a = elic.BUGLE_ADVANCED_FEEDBACK_PARTNER_SHARING_CONSENT_CONSENTED;
                checkBox.setChecked(true);
                viewFindViewById2.setOnClickListener(new View.OnClickListener() { // from class: acls
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        CheckBox checkBox2 = checkBox;
                        checkBox2.toggle();
                        acmeVarH.s.a = checkBox2.isChecked() ? elic.BUGLE_ADVANCED_FEEDBACK_PARTNER_SHARING_CONSENT_CONSENTED : elic.BUGLE_ADVANCED_FEEDBACK_PARTNER_SHARING_CONSENT_REJECTED;
                    }
                });
            }
            acmeVarH.d();
            Intent intentA = acmeVarH.a();
            if (intentA != null) {
                int intExtra = intentA.getIntExtra("report_issue_type_value_extra", 0);
                acmeVarH.w = intExtra;
                if (intExtra != 0) {
                    emgm emgmVarB = emgm.b(intExtra);
                    emgmVarB.getClass();
                    int iOrdinal = emgmVarB.ordinal();
                    acjy acjyVar = iOrdinal != 3 ? iOrdinal != 4 ? iOrdinal != 5 ? iOrdinal != 7 ? ((ackc) acjzVar).a : ((ackc) acjzVar).c : ((ackc) acjzVar).e : ((ackc) acjzVar).b : ((ackc) acjzVar).d;
                    acmeVarH.h.setText((CharSequence) acjyVar.c(), false);
                    acmeVarH.c(acjyVar);
                }
            }
            String strF = acmeVarH.f();
            if (strF != null) {
                ((eksl) ((eksl) acmeVarH.l.h()).h("com/google/android/apps/messaging/helpandfeedback/advancedfeedback/ui/AdvancedFeedbackFragmentPeer", "onCreateView", 233, "AdvancedFeedbackFragmentPeer.java")).t("Messages automatically detected an error. User tapped notification, launching advanced feedback: %s", strF);
            }
            ((acim) acmeVarH.t.b()).a(2, Optional.of(acmeVarH.r), Optional.empty(), Optional.empty(), Optional.empty());
            eidc.q();
            return viewInflate;
        } finally {
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

    @Override // defpackage.acmp, defpackage.ecdo, defpackage.ea
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

    @Override // defpackage.ehlg
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final acme H() {
        acme acmeVar = this.a;
        if (acmeVar == null) {
            throw new IllegalStateException("peer() called before initialized.");
        }
        if (this.ag) {
            throw new IllegalStateException("peer() called after destroyed.");
        }
        return acmeVar;
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

    @Override // defpackage.acmp
    protected final /* synthetic */ eyhj e() {
        return new ehog(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r28v0, types: [android.content.Context] */
    /* JADX WARN: Type inference failed for: r28v1 */
    /* JADX WARN: Type inference failed for: r28v2, types: [eieu] */
    @Override // defpackage.acmp, defpackage.ehnp, defpackage.ea
    public final void g(Context context) {
        this.c.k();
        try {
            if (this.ag) {
                throw new IllegalStateException("A Fragment cannot be attached more than once. Instead, create a new Fragment instance.");
            }
            super.g(context);
            if (this.a == null) {
                try {
                    eieu eieuVarG = eiiy.g("com/google/android/apps/messaging/helpandfeedback/advancedfeedback/ui/AdvancedFeedbackFragment", 85, aclj.class, "CreateComponent");
                    try {
                        Object objBb = bb();
                        eieuVarG.close();
                        eieu eieuVarG2 = eiiy.g("com/google/android/apps/messaging/helpandfeedback/advancedfeedback/ui/AdvancedFeedbackFragment", 90, aclj.class, "CreatePeer");
                        try {
                            ahhk ahhkVar = ((ahib) objBb).c;
                            Context context2 = (Context) ahhkVar.d.b();
                            ahho ahhoVar = ((ahib) objBb).b;
                            achu achuVar = (achu) ahhoVar.bA.b();
                            ea eaVar = (ea) ((eyig) ((ahib) objBb).d).a;
                            try {
                                if (!(eaVar instanceof aclj)) {
                                    throw new IllegalStateException(a.M(eaVar, acme.class));
                                }
                                aclj acljVar = (aclj) eaVar;
                                ahng ahngVar = ahhoVar.a.b;
                                ahkn ahknVar = ahngVar.a;
                                ackc ackcVar = new ackc(new acke(ahknVar.t), new ackm(ahknVar.t), new ackk(ahknVar.t), new acki(ahknVar.t), new acku(ahknVar.t), new ackg(ahknVar.t), new acks(ahknVar.t), new acko(ahknVar.t), new ackq(ahknVar.t), new ackw(ahknVar.t), ahngVar.C(), ahngVar.D(), ahngVar.os, ahngVar.E(), ahhoVar.c());
                                ahkn ahknVar2 = ((ahib) objBb).a;
                                ahng ahngVar2 = ahknVar2.b;
                                aciu aciuVarC = ahngVar2.C();
                                acjb acjbVarD = ahngVar2.D();
                                eyik eyikVar = ahngVar2.os;
                                acio acioVar = new acio(aciuVarC, acjbVarD, eyikVar, ahngVar2.E(), ahhoVar.c());
                                einm einmVar = (einm) ahngVar2.nT.b();
                                acjc acjcVar = new acjc();
                                ehac ehacVar = (ehac) ((ahib) objBb).k.b();
                                acjh acjhVar = new acjh((acnp) ahknVar2.oi.b(), (egyt) ahknVar2.dj.b());
                                crma crmaVar = (crma) ahknVar2.da.b();
                                eyik eyikVar2 = ahhkVar.h;
                                acit acitVar = (acit) eyikVar.b();
                                ahnh ahnhVar = ahknVar2.a;
                                this.a = new acme(context2, achuVar, acljVar, ackcVar, acioVar, einmVar, acjcVar, ehacVar, acjhVar, crmaVar, eyikVar2, acitVar, ahnhVar.Cs, ahhoVar.bu, ((ahib) objBb).ai, ahnhVar.adO);
                                eieuVarG2.close();
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

    @Override // defpackage.acmp, defpackage.ea
    public final Context z() {
        if (super.z() == null) {
            return null;
        }
        return bd();
    }
}
