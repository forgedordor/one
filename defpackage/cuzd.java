package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.preference.Preference;
import androidx.preference.PreferenceScreen;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.datamodel.data.suggestions.impl.SmartSuggestionItemSuggestionData;
import com.google.android.apps.messaging.ui.appsettings.SuggestionExamplePreference;
import defpackage.eyhq;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import java.util.Locale;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cuzd extends cuqx implements ehlg, eyhx, ehlc, ehnw, eifl {
    private cuzu aj;
    private Context ak;
    private final lvn al = new lvn(this);
    private final eics an = new eics(this);
    private boolean ao;

    @Deprecated
    public cuzd() {
        ecem.c();
    }

    @Override // defpackage.ehlg
    public final Class F() {
        return cuzu.class;
    }

    @Override // defpackage.ecdm, defpackage.ea
    public final View M(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.an.k();
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
        return this.al;
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

    @Override // defpackage.ecdm, defpackage.ea
    public final boolean aM(MenuItem menuItem) {
        eifp eifpVarJ = this.an.j();
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
        this.an.h(i, i2);
        eidc.q();
    }

    @Override // defpackage.cuqx
    protected final /* synthetic */ eyhj aZ() {
        return new ehog(this);
    }

    @Override // defpackage.ecdm, defpackage.ea
    public final void ae(Bundle bundle) {
        this.an.k();
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

    @Override // defpackage.ecdm, defpackage.ea
    public final void af(int i, int i2, Intent intent) {
        eifp eifpVarF = this.an.f();
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

    @Override // defpackage.cuqx, defpackage.ecdm, defpackage.ea
    public final void ag(Activity activity) {
        this.an.k();
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

    @Override // defpackage.ecdm, defpackage.ea
    public final void ai() {
        eifp eifpVarB = this.an.b();
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

    @Override // defpackage.ecdm, defpackage.ea
    public final void am() {
        this.an.k();
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

    @Override // defpackage.ecdm, defpackage.ea
    public final void ao() {
        eifp eifpVarB = this.an.b();
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

    @Override // defpackage.aiif, defpackage.ea
    public final void ap(View view, Bundle bundle) {
        this.an.k();
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
        if (this.ak == null) {
            this.ak = new ehnz(this, super.z());
        }
        return this.ak;
    }

    @Override // defpackage.ehlg
    /* renamed from: be, reason: merged with bridge method [inline-methods] */
    public final cuzu H() {
        cuzu cuzuVar = this.aj;
        if (cuzuVar == null) {
            throw new IllegalStateException("peer() called before initialized.");
        }
        if (this.ao) {
            throw new IllegalStateException("peer() called after destroyed.");
        }
        return cuzuVar;
    }

    @Override // defpackage.eifl
    public final eiik bf() {
        return this.an.a;
    }

    @Override // defpackage.ehnw
    public final Locale bg() {
        return ehnv.a(this);
    }

    @Override // defpackage.eifl
    public final void bh(eiik eiikVar, boolean z) {
        this.an.e(eiikVar, z);
    }

    @Override // defpackage.eifl
    public final void bi(eiik eiikVar) {
        this.an.b = eiikVar;
    }

    @Override // defpackage.aiif
    protected final boolean bj() {
        return true;
    }

    @Override // defpackage.cuqx, defpackage.ea
    public final void g(Context context) {
        this.an.k();
        try {
            if (this.ao) {
                throw new IllegalStateException("A Fragment cannot be attached more than once. Instead, create a new Fragment instance.");
            }
            super.g(context);
            if (this.aj == null) {
                try {
                    eieu eieuVarG = eiiy.g("com/google/android/apps/messaging/ui/appsettings/SmartsSettingsFragment", 94, cuzd.class, "CreateComponent");
                    try {
                        Object objBb = bb();
                        eieuVarG.close();
                        eieu eieuVarG2 = eiiy.g("com/google/android/apps/messaging/ui/appsettings/SmartsSettingsFragment", 99, cuzd.class, "CreatePeer");
                        try {
                            ea eaVar = (ea) ((eyig) ((ahib) objBb).d).a;
                            if (!(eaVar instanceof cuzd)) {
                                throw new IllegalStateException(a.M(eaVar, cuzu.class));
                            }
                            cuzd cuzdVar = (cuzd) eaVar;
                            ahnh ahnhVar = ((ahib) objBb).a.a;
                            this.aj = new cuzu(cuzdVar, (aijh) ahnhVar.Uk.b(), (crej) ahnhVar.BH.b(), Optional.empty(), ((ahib) objBb).aF);
                            eieuVarG2.close();
                            this.Z.c(new ehns(this.an, this.al));
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
                eics eicsVar = this.an;
                if (eicsVar.a == null) {
                    eicsVar.e(((eifl) lvjVar).bf(), true);
                }
            }
            eidc.q();
        } finally {
        }
    }

    @Override // defpackage.aiif, defpackage.ozm
    public final void gh(Bundle bundle, String str) throws Resources.NotFoundException {
        ejxr ejxrVar;
        int i;
        super.gh(bundle, str);
        final cuzu cuzuVarH = H();
        if (crbf.d()) {
            cvar cvarVar = cuzuVarH.a;
            cvarVar.getClass();
            cvarVar.f();
            return;
        }
        cuzd cuzdVar = cuzuVarH.b;
        cuzdVar.b.f("bugle");
        cuzdVar.f(R.xml.smarts_preferences);
        cuzdVar.e().ag();
        Optional optionalC = cuzuVarH.c(R.string.suggested_stickers_enabled_pref_key);
        if (!((Boolean) crbf.q.e()).booleanValue()) {
            final PreferenceScreen preferenceScreenE = cuzdVar.e();
            preferenceScreenE.getClass();
            optionalC.ifPresent(new Consumer() { // from class: cuzn
                @Override // java.util.function.Consumer
                /* renamed from: accept */
                public final void z(Object obj) {
                    preferenceScreenE.af((Preference) obj);
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
        }
        Optional optionalC2 = cuzuVarH.c(R.string.mc_enabled_pref_key);
        final PreferenceScreen preferenceScreenE2 = cuzdVar.e();
        preferenceScreenE2.getClass();
        optionalC2.ifPresent(new Consumer() { // from class: cuzn
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void z(Object obj) {
                preferenceScreenE2.af((Preference) obj);
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
        Optional optionalC3 = cuzuVarH.c(R.string.experiment_badge_pref_key);
        final PreferenceScreen preferenceScreenE3 = cuzdVar.e();
        preferenceScreenE3.getClass();
        optionalC3.ifPresent(new Consumer() { // from class: cuzn
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void z(Object obj) {
                preferenceScreenE3.af((Preference) obj);
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
        Optional optionalC4 = cuzuVarH.c(R.string.smart_action_example_key);
        Optional optionalC5 = cuzuVarH.c(R.string.smart_reply_suggestion_example_key);
        Optional optionalC6 = cuzuVarH.c(R.string.smart_action_settings_parent_pref);
        Optional optionalC7 = cuzuVarH.c(R.string.smart_actions_enabled_pref_key);
        ejxr ejxrVar2 = cugc.a;
        if (((Boolean) ((cczi) ejxrVar2.get()).e()).booleanValue()) {
            final PreferenceScreen preferenceScreenE4 = cuzdVar.e();
            preferenceScreenE4.getClass();
            optionalC7.ifPresent(new Consumer() { // from class: cuzn
                @Override // java.util.function.Consumer
                /* renamed from: accept */
                public final void z(Object obj) {
                    preferenceScreenE4.af((Preference) obj);
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
            final PreferenceScreen preferenceScreenE5 = cuzdVar.e();
            preferenceScreenE5.getClass();
            optionalC4.ifPresent(new Consumer() { // from class: cuzi
                @Override // java.util.function.Consumer
                /* renamed from: accept */
                public final void z(Object obj) {
                    preferenceScreenE5.af((SuggestionExamplePreference) obj);
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
            optionalC6.ifPresent(new Consumer() { // from class: cuzj
                @Override // java.util.function.Consumer
                /* renamed from: accept */
                public final void z(Object obj) {
                    PreferenceScreen preferenceScreen = (PreferenceScreen) obj;
                    preferenceScreen.t = cuzuVarH.c.e(preferenceScreen.j);
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
        } else {
            final PreferenceScreen preferenceScreenE6 = cuzdVar.e();
            preferenceScreenE6.getClass();
            optionalC6.ifPresent(new Consumer() { // from class: cuzp
                @Override // java.util.function.Consumer
                /* renamed from: accept */
                public final void z(Object obj) {
                    preferenceScreenE6.af((PreferenceScreen) obj);
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
        }
        Resources resourcesB = cuzdVar.B();
        ejxr ejxrVar3 = cugc.b;
        if (((Boolean) ((cczi) ejxrVar3.get()).e()).booleanValue()) {
            final PreferenceScreen preferenceScreenE7 = cuzdVar.e();
            preferenceScreenE7.getClass();
            optionalC4.ifPresent(new Consumer() { // from class: cuzi
                @Override // java.util.function.Consumer
                /* renamed from: accept */
                public final void z(Object obj) {
                    preferenceScreenE7.af((SuggestionExamplePreference) obj);
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
            final PreferenceScreen preferenceScreenE8 = cuzdVar.e();
            preferenceScreenE8.getClass();
            optionalC5.ifPresent(new Consumer() { // from class: cuzi
                @Override // java.util.function.Consumer
                /* renamed from: accept */
                public final void z(Object obj) {
                    preferenceScreenE8.af((SuggestionExamplePreference) obj);
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
            ejxrVar = ejxrVar2;
            i = 1;
        } else {
            int i2 = ekgb.d;
            final ekfw ekfwVar = new ekfw();
            crej crejVar = cuzuVarH.d;
            if (crejVar.d()) {
                ezgh ezghVar = (ezgh) ezgi.a.createBuilder();
                ezbn ezbnVar = ezbn.a;
                ezghVar.copyOnWrite();
                i = 1;
                ezgi ezgiVar = (ezgi) ezghVar.instance;
                ezbnVar.getClass();
                ezgiVar.d = ezbnVar;
                ezgiVar.c = 19;
                ezgf ezgfVar = (ezgf) ezgg.b.createBuilder();
                ezan ezanVar = ezan.CALENDAR;
                ezgfVar.copyOnWrite();
                ejxrVar = ejxrVar2;
                ((ezgg) ezgfVar.instance).l = ezanVar.a();
                ezghVar.copyOnWrite();
                ezgi ezgiVar2 = (ezgi) ezghVar.instance;
                ezgg ezggVar = (ezgg) ezgfVar.build();
                ezggVar.getClass();
                ezgiVar2.e = ezggVar;
                ezgiVar2.b |= 1;
                ekfwVar.h(new SmartSuggestionItemSuggestionData((ezgi) ezghVar.build()));
            } else {
                ejxrVar = ejxrVar2;
                i = 1;
            }
            if (crejVar.i()) {
                ezgh ezghVar2 = (ezgh) ezgi.a.createBuilder();
                ezfv ezfvVar = ezfv.a;
                ezghVar2.copyOnWrite();
                ezgi ezgiVar3 = (ezgi) ezghVar2.instance;
                ezfvVar.getClass();
                ezgiVar3.d = ezfvVar;
                ezgiVar3.c = 17;
                ezgf ezgfVar2 = (ezgf) ezgg.b.createBuilder();
                ezan ezanVar2 = ezan.RECENT_IMAGE;
                ezgfVar2.copyOnWrite();
                ((ezgg) ezgfVar2.instance).l = ezanVar2.a();
                ezghVar2.copyOnWrite();
                ezgi ezgiVar4 = (ezgi) ezghVar2.instance;
                ezgg ezggVar2 = (ezgg) ezgfVar2.build();
                ezggVar2.getClass();
                ezgiVar4.e = ezggVar2;
                ezgiVar4.b |= 1;
                ekfwVar.h(new SmartSuggestionItemSuggestionData((ezgi) ezghVar2.build()));
            }
            if (crejVar.e()) {
                ezgh ezghVar3 = (ezgh) ezgi.a.createBuilder();
                ezcn ezcnVar = ezcn.a;
                ezghVar3.copyOnWrite();
                ezgi ezgiVar5 = (ezgi) ezghVar3.instance;
                ezcnVar.getClass();
                ezgiVar5.d = ezcnVar;
                ezgiVar5.c = 14;
                ezgf ezgfVar3 = (ezgf) ezgg.b.createBuilder();
                ezan ezanVar3 = ezan.DUO_CALL;
                ezgfVar3.copyOnWrite();
                ((ezgg) ezgfVar3.instance).l = ezanVar3.a();
                ezghVar3.copyOnWrite();
                ezgi ezgiVar6 = (ezgi) ezghVar3.instance;
                ezgg ezggVar3 = (ezgg) ezgfVar3.build();
                ezggVar3.getClass();
                ezgiVar6.e = ezggVar3;
                ezgiVar6.b |= 1;
                ekfwVar.h(new SmartSuggestionItemSuggestionData((ezgi) ezghVar3.build()));
            }
            if (crejVar.h()) {
                ezgh ezghVar4 = (ezgh) ezgi.a.createBuilder();
                ezfx ezfxVar = ezfx.a;
                ezghVar4.copyOnWrite();
                ezgi ezgiVar7 = (ezgi) ezghVar4.instance;
                ezfxVar.getClass();
                ezgiVar7.d = ezfxVar;
                ezgiVar7.c = 3;
                ezgf ezgfVar4 = (ezgf) ezgg.b.createBuilder();
                ezan ezanVar4 = ezan.LOCATION;
                ezgfVar4.copyOnWrite();
                ((ezgg) ezgfVar4.instance).l = ezanVar4.a();
                ezghVar4.copyOnWrite();
                ezgi ezgiVar8 = (ezgi) ezghVar4.instance;
                ezgg ezggVar4 = (ezgg) ezgfVar4.build();
                ezggVar4.getClass();
                ezgiVar8.e = ezggVar4;
                ezgiVar8.b |= 1;
                ekfwVar.h(new SmartSuggestionItemSuggestionData((ezgi) ezghVar4.build()));
            }
            if (crejVar.g()) {
                String string = resourcesB.getString(R.string.example_gif_search_action_text);
                ezgh ezghVar5 = (ezgh) ezgi.a.createBuilder();
                ezdb ezdbVar = (ezdb) ezdc.a.createBuilder();
                ezdbVar.copyOnWrite();
                ezdc ezdcVar = (ezdc) ezdbVar.instance;
                string.getClass();
                ezdcVar.b = string;
                ezghVar5.copyOnWrite();
                ezgi ezgiVar9 = (ezgi) ezghVar5.instance;
                ezdc ezdcVar2 = (ezdc) ezdbVar.build();
                ezdcVar2.getClass();
                ezgiVar9.d = ezdcVar2;
                ezgiVar9.c = 5;
                ezgf ezgfVar5 = (ezgf) ezgg.b.createBuilder();
                ezan ezanVar5 = ezan.GIF;
                ezgfVar5.copyOnWrite();
                ((ezgg) ezgfVar5.instance).l = ezanVar5.a();
                ezghVar5.copyOnWrite();
                ezgi ezgiVar10 = (ezgi) ezghVar5.instance;
                ezgg ezggVar5 = (ezgg) ezgfVar5.build();
                ezggVar5.getClass();
                ezgiVar10.e = ezggVar5;
                ezgiVar10.b |= 1;
                ekfwVar.h(new SmartSuggestionItemSuggestionData((ezgi) ezghVar5.build()));
            }
            optionalC4.ifPresent(new Consumer() { // from class: cuzk
                @Override // java.util.function.Consumer
                /* renamed from: accept */
                public final void z(Object obj) {
                    ((SuggestionExamplePreference) obj).a = ekfwVar.g();
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
            final ekfw ekfwVar2 = new ekfw();
            ekfwVar2.h(cuzu.b(resourcesB.getString(R.string.example_smart_reply_text1)));
            ekfwVar2.h(cuzu.b(resourcesB.getString(R.string.example_smart_reply_text2)));
            ekfwVar2.h(cuzu.b(resourcesB.getString(R.string.example_smart_reply_text3)));
            ekfwVar2.h(cuzu.b(resourcesB.getString(R.string.example_smart_reply_text4)));
            optionalC5.ifPresent(new Consumer() { // from class: cuzo
                @Override // java.util.function.Consumer
                /* renamed from: accept */
                public final void z(Object obj) {
                    ((SuggestionExamplePreference) obj).a = ekfwVar2.g();
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
        }
        cuzuVarH.e = cuzuVarH.c(R.string.nudge_settings_parent_pref);
        if (crbf.g()) {
            cuzuVarH.e.ifPresent(new Consumer() { // from class: cuzm
                @Override // java.util.function.Consumer
                /* renamed from: accept */
                public final void z(Object obj) {
                    cuzu cuzuVar = cuzuVarH;
                    ((PreferenceScreen) obj).t = cuzuVar.c.d(cuzuVar.b.e().j);
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
        } else {
            Optional optional = cuzuVarH.e;
            final PreferenceScreen preferenceScreenE9 = cuzdVar.e();
            preferenceScreenE9.getClass();
            optional.ifPresent(new Consumer() { // from class: cuzp
                @Override // java.util.function.Consumer
                /* renamed from: accept */
                public final void z(Object obj) {
                    preferenceScreenE9.af((PreferenceScreen) obj);
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
        }
        if (((Boolean) ((cczi) ejxrVar3.get()).e()).booleanValue()) {
            cuzuVarH.c(R.string.assistant_enabled_pref_key).ifPresent(new Consumer() { // from class: cuzq
                @Override // java.util.function.Consumer
                /* renamed from: accept */
                public final void z(Object obj) {
                    Preference preference = (Preference) obj;
                    preference.H(cuzuVarH.a(R.drawable.assistant_logo));
                    preference.J(R.string.assistant_preference_summary);
                    preference.I(8);
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
            cuzuVarH.c(R.string.p2p_conversation_suggestions_enabled_pref_key).ifPresent(new Consumer() { // from class: cuzr
                @Override // java.util.function.Consumer
                /* renamed from: accept */
                public final void z(Object obj) {
                    Preference preference = (Preference) obj;
                    preference.H(cuzuVarH.a(R.drawable.quantum_gm_ic_chat_vd_theme_24));
                    preference.J(R.string.smart_reply_preference_summary);
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
            optionalC.ifPresent(new Consumer() { // from class: cuzs
                @Override // java.util.function.Consumer
                /* renamed from: accept */
                public final void z(Object obj) {
                    Preference preference = (Preference) obj;
                    preference.H(cuzuVarH.a(R.drawable.quantum_gm_ic_sticker_vd_theme_24));
                    preference.I(7);
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
            cuzuVarH.e.ifPresent(new Consumer() { // from class: cuzt
                @Override // java.util.function.Consumer
                /* renamed from: accept */
                public final void z(Object obj) {
                    ((PreferenceScreen) obj).H(cuzuVarH.a(R.drawable.quantum_ic_alarm_vd_theme_24));
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
            if (((Boolean) ((cczi) ejxrVar.get()).e()).booleanValue()) {
                optionalC6.ifPresent(new Consumer() { // from class: cuzf
                    @Override // java.util.function.Consumer
                    /* renamed from: accept */
                    public final void z(Object obj) {
                        ((PreferenceScreen) obj).H(cuzuVarH.a(R.drawable.quantum_gm_ic_calendar_add_on_gm_grey_24));
                    }

                    public final /* synthetic */ Consumer andThen(Consumer consumer) {
                        return Consumer$CC.$default$andThen(this, consumer);
                    }
                });
            } else {
                optionalC7.ifPresent(new Consumer() { // from class: cuzg
                    @Override // java.util.function.Consumer
                    /* renamed from: accept */
                    public final void z(Object obj) {
                        ((Preference) obj).H(cuzuVarH.a(R.drawable.quantum_gm_ic_calendar_add_on_gm_grey_24));
                    }

                    public final /* synthetic */ Consumer andThen(Consumer consumer) {
                        return Consumer$CC.$default$andThen(this, consumer);
                    }
                });
            }
        }
        cuzuVarH.c(R.string.ds_setting_key).ifPresent(new Consumer() { // from class: cuzh
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void z(Object obj) {
                Preference preference = (Preference) obj;
                final cuzu cuzuVar = cuzuVarH;
                Optional optional2 = cuzuVar.f;
                if (optional2.isEmpty() || !((Boolean) ((cczi) crbf.bJ.get()).e()).booleanValue()) {
                    cuzuVar.b.e().af(preference);
                    return;
                }
                final ztz ztzVar = (ztz) optional2.get();
                preference.H(cuzuVar.a(ztzVar.a()));
                preference.M(ztzVar.d());
                preference.n(ztzVar.c());
                preference.o = new ozb() { // from class: cuze
                    @Override // defpackage.ozb
                    public final boolean a(Preference preference2) {
                        Intent intent = new Intent();
                        ztz ztzVar2 = ztzVar;
                        intent.setClassName(ztzVar2.b(), ztzVar2.e());
                        cuzuVar.b.aD(intent);
                        return true;
                    }
                };
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
        Optional optionalC8 = cuzuVarH.c(R.string.smarts_learn_more_pref_key);
        if (optionalC8.isEmpty()) {
            return;
        }
        ((Preference) optionalC8.get()).o = new ozb() { // from class: cuzl
            @Override // defpackage.ozb
            public final boolean a(Preference preference) {
                cuzu cuzuVar = cuzuVarH;
                cuzuVar.c.t(cuzuVar.b.G(), (String) crbf.t.e());
                return true;
            }
        };
        Preference preference = (Preference) optionalC8.get();
        String strY = cuzdVar.Y(R.string.smarts_learn_more);
        Object[] objArr = new Object[i];
        objArr[0] = strY;
        preference.M(dajs.g(cuzdVar.G(), Html.fromHtml(cuzdVar.Z(R.string.smarts_preference_info_text, objArr)).toString(), strY));
    }

    @Override // defpackage.ea
    public final LayoutInflater go(Bundle bundle) {
        this.an.k();
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

    @Override // defpackage.ecdm, defpackage.ozm, defpackage.ea
    public final void h(Bundle bundle) {
        this.an.k();
        try {
            super.h(bundle);
            cuzu cuzuVarH = H();
            if (crbf.d()) {
                cvar cvarVar = cuzuVarH.a;
                cvarVar.getClass();
                cvarVar.e();
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

    @Override // defpackage.ecdm, defpackage.ozm, defpackage.ea
    public final void i() {
        eifp eifpVarB = this.an.b();
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

    @Override // defpackage.ecdm, defpackage.ea
    public final void j() {
        eifp eifpVarA = this.an.a();
        try {
            super.j();
            this.ao = true;
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

    @Override // defpackage.ecdm, defpackage.ea
    public final void k(Bundle bundle) {
        this.an.k();
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

    @Override // defpackage.ecdm, defpackage.ozm, defpackage.ea
    public final void l() {
        this.an.k();
        try {
            super.l();
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

    @Override // defpackage.ecdm, defpackage.ozm, defpackage.ea
    public final void m() {
        this.an.k();
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

    @Override // defpackage.cuqx, defpackage.ea
    public final Context z() {
        if (super.z() == null) {
            return null;
        }
        return bd();
    }
}
