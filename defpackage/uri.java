package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.car.app.hardware.info.EnergyProfile;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.conversation.settings.ConversationSettingsOptionItemView;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import com.google.android.apps.messaging.shared.ui.ContactIconView;
import com.google.android.ims.rcsservice.businessinfo.BusinessInfoData;
import com.google.android.material.tabs.TabLayout;
import com.google.protobuf.contrib.android.ProtoParsers;
import defpackage.eyhq;
import defpackage.uqc;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import java.util.Locale;
import java.util.concurrent.Callable;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class uri extends uqx implements ehlg, eyhx, ehlc, ehnw, eifl, einn {
    public final lvn a = new lvn(this);
    private final eino ag = new eino();
    private boolean ah;
    private uro d;
    private Context e;

    @Deprecated
    public uri() {
        ecem.c();
    }

    @Override // defpackage.ehlg
    public final Class F() {
        return uro.class;
    }

    @Override // defpackage.ehnp, defpackage.ecdo, defpackage.ea
    public final View M(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.c.k();
        try {
            s(layoutInflater, viewGroup, bundle);
            final uro uroVarH = H();
            View viewInflate = layoutInflater.inflate(R.layout.info_and_options_fragment, viewGroup, false);
            uri uriVar = uroVarH.e;
            upv upvVar = (upv) uriVar.I().h("conversation_settings_base_fragment");
            if (upvVar == null) {
                upx upxVar = uroVarH.o.c;
                if (upxVar == null) {
                    upxVar = upx.a;
                }
                upv upvVar2 = new upv();
                eyhj.e(upvVar2);
                ehog.a(upvVar2, upxVar);
                cg cgVar = new cg(uriVar.I());
                cgVar.t(0, upvVar2, "conversation_settings_base_fragment");
                cgVar.c();
                upvVar = upvVar2;
            }
            if (viewInflate == null) {
                viewInflate = null;
            } else {
                uroVarH.r = (ContactIconView) viewInflate.findViewById(R.id.business_icon);
                uroVarH.s = (TextView) viewInflate.findViewById(R.id.business_name);
                uroVarH.t = (TextView) viewInflate.findViewById(R.id.business_description);
                uroVarH.u = (TabLayout) viewInflate.findViewById(R.id.info_and_options_tabs);
                uroVarH.v = (ImageView) viewInflate.findViewById(R.id.business_hero);
                ehac ehacVar = uroVarH.k;
                uqc uqcVarA = upvVar.H();
                egyi egyiVarB = ((urw) uqcVarA.o.b()).b(uriVar.a, uqcVarA.y);
                Consumer consumer = new Consumer() { // from class: urm
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // java.util.function.Consumer
                    /* renamed from: accept */
                    public final void z(Object obj) throws Resources.NotFoundException {
                        LinearLayout linearLayout;
                        ekgb ekgbVarG;
                        uro uroVar = uroVarH;
                        bage bageVar = (bage) obj;
                        upv upvVar3 = (upv) uroVar.e.I().h("conversation_settings_base_fragment");
                        upvVar3.getClass();
                        uql uqlVar = upvVar3.H().d;
                        mv.a(new uqj(uqlVar.l(), uqlVar.F(bageVar))).c(uqlVar);
                        uqlVar.a = bageVar;
                        uru uruVar = uroVar.d;
                        if (uruVar != null) {
                            uruVar.e(uruVar.Q, true);
                        }
                        urt urtVar = uroVar.c;
                        if (urtVar == null || !((aqhc) urtVar.e.b()).a() || (linearLayout = (LinearLayout) urtVar.Q) == null) {
                            return;
                        }
                        if (bageVar == null) {
                            int i = ekgb.d;
                            ekgbVarG = ekoe.a;
                        } else {
                            Optional optionalG = bageVar.g();
                            ekfw ekfwVar = new ekfw();
                            if (optionalG.isPresent() && ((ekgb) optionalG.get()).size() > 1) {
                                ekfwVar.h(bagd.SETTING_CHANGE_ACTIVE_SIM);
                            }
                            ekgbVarG = ekfwVar.g();
                        }
                        for (int i2 = 0; i2 < urtVar.ai; i2++) {
                            linearLayout.removeViewAt(0);
                        }
                        int i3 = 0;
                        while (true) {
                            int i4 = ((ekoe) ekgbVarG).c;
                            if (i3 >= i4) {
                                urtVar.ai = i4;
                                return;
                            }
                            bagd bagdVar = (bagd) ekgbVarG.get(i3);
                            View viewInflate2 = urtVar.fg().getLayoutInflater().inflate(R.layout.business_contact_action, (ViewGroup) linearLayout, false);
                            bagf bagfVarA = ((bagg) urtVar.ag.b()).a(urtVar.z());
                            bagfVarA.b(bageVar, bagdVar);
                            ((TextView) viewInflate2.findViewById(R.id.business_contact_action_header)).setText(bagfVarA.b);
                            ((TextView) viewInflate2.findViewById(R.id.business_contact_action_sub_header)).setText(bagfVarA.c);
                            ((ImageView) viewInflate2.findViewById(R.id.business_contact_action_icon)).setImageResource(bagdVar == bagd.SETTING_CHANGE_ACTIVE_SIM ? R.drawable.gs_sim_card_vd_theme_24 : 0);
                            View viewFindViewById = viewInflate2.findViewById(R.id.business_contact_action_group_divider);
                            if (i3 >= i4 - 1) {
                                viewFindViewById.setVisibility(0);
                            } else {
                                viewFindViewById.setVisibility(8);
                            }
                            ((einm) urtVar.ah.b()).b(viewInflate2, new ConversationSettingsOptionItemView.a(bagfVarA));
                            linearLayout.addView(viewInflate2, i3);
                            i3++;
                        }
                    }

                    public final /* synthetic */ Consumer andThen(Consumer consumer2) {
                        return Consumer$CC.$default$andThen(this, consumer2);
                    }
                };
                final uqc uqcVarA2 = upvVar.H();
                ehacVar.a(egyiVarB, new uqc.b(consumer, new Consumer() { // from class: urn
                    @Override // java.util.function.Consumer
                    /* renamed from: accept */
                    public final void z(Object obj) {
                        ConversationIdType conversationIdType = uqcVarA2.y;
                        uqc.a.s("Error getting options list data for settings options, conversationId: ".concat(String.valueOf(String.valueOf(conversationIdType))), (Throwable) obj);
                    }

                    public final /* synthetic */ Consumer andThen(Consumer consumer2) {
                        return Consumer$CC.$default$andThen(this, consumer2);
                    }
                }));
                final urh urhVar = (urh) uroVarH.l.b();
                final String str = uroVarH.o.d;
                ehacVar.a(new egys(urhVar.b, new eopk() { // from class: ure
                    @Override // defpackage.eopk
                    public final eopy a(eopt eoptVar) {
                        final urh urhVar2 = urhVar;
                        final String str2 = str;
                        Callable callable = new Callable() { // from class: urd
                            @Override // java.util.concurrent.Callable
                            public final Object call() {
                                return ((bbca) urhVar2.d.b()).c(str2);
                            }
                        };
                        eosc eoscVar = urhVar2.c;
                        final eiju eijuVarG = eijx.g(callable, eoscVar);
                        final eiju eijuVarH = urhVar2.f.a(str2).h(new ejvr() { // from class: urf
                            @Override // defpackage.ejvr
                            public final Object apply(Object obj) {
                                Optional optional = (Optional) obj;
                                boolean zBooleanValue = ((Boolean) ((cczi) urh.a.get()).e()).booleanValue();
                                urh urhVar3 = urhVar2;
                                String str3 = str2;
                                return !zBooleanValue ? (BusinessInfoData) optional.orElse(((cmpg) urhVar3.e.b()).a(str3)) : optional.isPresent() ? (BusinessInfoData) optional.get() : ((cmpg) urhVar3.e.b()).a(str3);
                            }
                        }, eoscVar);
                        return new eopy(eijx.m(eijuVarG, eijuVarH).a(new Callable() { // from class: urc
                            @Override // java.util.concurrent.Callable
                            public final Object call() {
                                int i = urh.g;
                                return new urg((ParticipantsTable.BindData) eork.q(eijuVarG), (BusinessInfoData) eork.q(eijuVarH));
                            }
                        }, eoqg.a));
                    }
                }, "INFO_AND_OPTIONS_".concat(String.valueOf(str))), uroVarH.q);
            }
            if (viewInflate == null) {
                urr.a(this, H());
            }
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
        return this.a;
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

    @Override // defpackage.uqx, defpackage.ecdo, defpackage.ea
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

    @Override // defpackage.ehnp, defpackage.ecdo, defpackage.ea
    public final void ap(View view, Bundle bundle) {
        this.c.k();
        try {
            einc.b(this).b = view;
            H();
            urr.a(this, H());
            bn(view, bundle);
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

    @Override // defpackage.uqx
    protected final /* synthetic */ eyhj b() {
        return new ehog(this);
    }

    @Override // defpackage.ehlc
    @Deprecated
    public final Context bd() {
        if (this.e == null) {
            this.e = new ehnz(this, super.z());
        }
        return this.e;
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
    public final uro H() {
        uro uroVar = this.d;
        if (uroVar == null) {
            throw new IllegalStateException("peer() called before initialized.");
        }
        if (this.ah) {
            throw new IllegalStateException("peer() called after destroyed.");
        }
        return uroVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r22v0, types: [android.content.Context] */
    /* JADX WARN: Type inference failed for: r22v1 */
    /* JADX WARN: Type inference failed for: r22v2, types: [eieu] */
    @Override // defpackage.uqx, defpackage.ehnp, defpackage.ea
    public final void g(Context context) {
        this.c.k();
        try {
            if (this.ah) {
                throw new IllegalStateException("A Fragment cannot be attached more than once. Instead, create a new Fragment instance.");
            }
            super.g(context);
            if (this.d == null) {
                try {
                    eieu eieuVarG = eiiy.g("com/google/android/apps/messaging/conversation/settings/InfoAndOptionsFragment", 96, uri.class, "CreateComponent");
                    try {
                        Object objBb = bb();
                        eieuVarG.close();
                        eieu eieuVarG2 = eiiy.g("com/google/android/apps/messaging/conversation/settings/InfoAndOptionsFragment", EnergyProfile.EVCONNECTOR_TYPE_OTHER, uri.class, "CreatePeer");
                        try {
                            ahkn ahknVar = ((ahib) objBb).a;
                            eyik eyikVar = ahknVar.hD;
                            ea eaVar = (ea) ((eyig) ((ahib) objBb).d).a;
                            try {
                                if (!(eaVar instanceof uri)) {
                                    throw new IllegalStateException(a.M(eaVar, uro.class));
                                }
                                uri uriVar = (uri) eaVar;
                                ahnh ahnhVar = ahknVar.a;
                                axjf axjfVar = (axjf) ahnhVar.so.b();
                                achu achuVar = (achu) ((ahib) objBb).b.bA.b();
                                cpcb cpcbVarG = ((ahib) objBb).g();
                                cpcd cpcdVarH = ((ahib) objBb).h();
                                cpcf cpcfVarI = ((ahib) objBb).i();
                                aijh aijhVar = (aijh) ahnhVar.Uk.b();
                                ehac ehacVar = (ehac) ((ahib) objBb).k.b();
                                eyik eyikVar2 = ((ahib) objBb).C;
                                eyik eyikVar3 = ahknVar.jW;
                                eyik eyikVar4 = ahknVar.ie;
                                alrj alrjVar = (alrj) ahnhVar.qi.b();
                                Bundle bundleA = ((ahib) objBb).a();
                                evrr evrrVar = (evrr) ahknVar.b.gp.b();
                                ejwl.b(bundleA.containsKey("TIKTOK_FRAGMENT_ARGUMENT"), "Proto @Argument for Fragment could not be found. @Arguments must be provided using the Fragment#create(MessageLite argument) overload.");
                                urk urkVar = (urk) ProtoParsers.f(bundleA, "TIKTOK_FRAGMENT_ARGUMENT", urk.a, evrrVar);
                                urkVar.getClass();
                                this.d = new uro(eyikVar, uriVar, axjfVar, achuVar, cpcbVarG, cpcdVarH, cpcfVarI, aijhVar, ehacVar, eyikVar2, eyikVar3, eyikVar4, alrjVar, urkVar);
                                eieuVarG2.close();
                                this.Z.c(new ehns(this.c, this.a));
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

    @Override // defpackage.ehnp, defpackage.ecdo, defpackage.ea
    public final void i() {
        eifp eifpVarB = this.c.b();
        try {
            aZ();
            if (this.Q == null) {
                this.ag.c();
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

    @Override // defpackage.ecdo, defpackage.ea
    public final void j() {
        eifp eifpVarA = this.c.a();
        try {
            bc();
            this.ah = true;
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

    @Override // defpackage.einn
    public final eine p(einb einbVar) {
        return this.ag.a(einbVar);
    }

    @Override // defpackage.einn
    public final void q(Class cls, eind eindVar) {
        this.ag.b(cls, eindVar);
    }

    @Override // defpackage.uqx, defpackage.ea
    public final Context z() {
        if (super.z() == null) {
            return null;
        }
        return bd();
    }
}
