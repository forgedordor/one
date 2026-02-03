package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.text.Html;
import androidx.preference.Preference;
import androidx.preference.PreferenceScreen;
import androidx.preference.SwitchPreferenceCompat;
import androidx.preference.TwoStatePreference;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.datamodel.data.suggestions.SmartSuggestionData;
import com.google.android.apps.messaging.shared.datamodel.data.suggestions.impl.SmartSuggestionItemSuggestionData;
import com.google.android.apps.messaging.ui.appsettings.SuggestionExamplePreference;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cvar {
    public final aiif a;
    public final aijh b;
    public final ehac c;
    public final eils d;
    public final Optional e;
    public final Optional f;
    public final fcsu g;
    public final Optional h;
    public final Optional i;
    private final crej j;
    private final Optional k;
    private Optional l;

    public cvar(aiif aiifVar, aijh aijhVar, ehac ehacVar, crej crejVar, eils eilsVar, Optional optional, Optional optional2, Optional optional3, fcsu fcsuVar, Optional optional4, Optional optional5) {
        this.a = aiifVar;
        this.b = aijhVar;
        this.c = ehacVar;
        this.j = crejVar;
        this.d = eilsVar;
        this.e = optional;
        this.f = optional2;
        this.k = optional3;
        this.g = fcsuVar;
        this.h = optional5;
        this.i = optional4;
    }

    private static SmartSuggestionData g(String str) {
        ezgh ezghVar = (ezgh) ezgi.a.createBuilder();
        ezgj ezgjVar = (ezgj) ezgk.a.createBuilder();
        ezgjVar.copyOnWrite();
        ezgk ezgkVar = (ezgk) ezgjVar.instance;
        str.getClass();
        ezgkVar.c = str;
        ezghVar.copyOnWrite();
        ezgi ezgiVar = (ezgi) ezghVar.instance;
        ezgk ezgkVar2 = (ezgk) ezgjVar.build();
        ezgkVar2.getClass();
        ezgiVar.d = ezgkVar2;
        ezgiVar.c = 2;
        ezgf ezgfVar = (ezgf) ezgg.b.createBuilder();
        ezan ezanVar = ezan.FULL_MESSAGE;
        ezgfVar.copyOnWrite();
        ((ezgg) ezgfVar.instance).l = ezanVar.a();
        ezghVar.copyOnWrite();
        ezgi ezgiVar2 = (ezgi) ezghVar.instance;
        ezgg ezggVar = (ezgg) ezgfVar.build();
        ezggVar.getClass();
        ezgiVar2.e = ezggVar;
        ezgiVar2.b |= 1;
        return new SmartSuggestionItemSuggestionData((ezgi) ezghVar.build());
    }

    private final void h(int i, Preference preference) {
        aiif aiifVar = this.a;
        String strY = aiifVar.Y(R.string.smarts_learn_more);
        preference.M(dajs.g(aiifVar.G(), Html.fromHtml(aiifVar.Z(i, strY)).toString(), strY));
    }

    public final Drawable a(int i) {
        aiif aiifVar = this.a;
        Context contextZ = aiifVar.z();
        contextZ.getClass();
        Context contextZ2 = aiifVar.z();
        contextZ2.getClass();
        return cqsu.h(contextZ, i, eehg.d(contextZ2, R.attr.colorOnSurface, "SmartsSettingsFragmentPeer: failed to get color R.attr.colorOnSurfaceVariant"));
    }

    public final Optional b(int i) {
        aiif aiifVar = this.a;
        return Optional.ofNullable(aiifVar.a(aiifVar.Y(i)));
    }

    public final void c(Preference preference, boolean z) {
        if (z) {
            preference.J(true != ((aqab) ((uzl) this.e.get()).a.b()).a() ? R.string.magic_compose_setting_summary : R.string.magic_compose_setting_summary_rewrite_only);
        } else {
            preference.J(true != ((aqab) ((uzl) this.e.get()).a.b()).a() ? R.string.magic_compose_setting_disabled_summary : R.string.magic_compose_setting_disabled_summary_rewrite_only);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x006c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d() {
        /*
            r4 = this;
            r0 = 2132087598(0x7f15132e, float:1.9815456E38)
            j$.util.Optional r0 = r4.b(r0)
            boolean r1 = r0.isEmpty()
            if (r1 == 0) goto Le
            return
        Le:
            java.lang.Object r1 = r0.get()
            androidx.preference.Preference r1 = (androidx.preference.Preference) r1
            cvak r2 = new cvak
            r2.<init>()
            r1.o = r2
            boolean r1 = defpackage.crbf.d()
            if (r1 == 0) goto L8d
            j$.util.Optional r1 = r4.e
            boolean r2 = r1.isEmpty()
            if (r2 != 0) goto L8d
            r2 = 2132085413(0x7f150aa5, float:1.9811024E38)
            j$.util.Optional r2 = r4.b(r2)
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L37
            goto L8d
        L37:
            java.lang.Object r1 = r1.get()
            cczi r2 = defpackage.crbf.ba
            java.lang.Object r2 = r2.e()
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            if (r2 == 0) goto L6c
            cczi r2 = defpackage.crbf.bd
            java.lang.Object r2 = r2.e()
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            r3 = 2132088829(0x7f1517fd, float:1.9817953E38)
            if (r2 != 0) goto L83
            r2 = r1
            uzl r2 = (defpackage.uzl) r2
            fcsu r2 = r2.a
            java.lang.Object r2 = r2.b()
            aqab r2 = (defpackage.aqab) r2
            boolean r2 = r2.a()
            if (r2 == 0) goto L6c
            goto L83
        L6c:
            uzl r1 = (defpackage.uzl) r1
            fcsu r1 = r1.a
            java.lang.Object r1 = r1.b()
            aqab r1 = (defpackage.aqab) r1
            boolean r1 = r1.a()
            if (r1 == 0) goto L80
            r3 = 2132088830(0x7f1517fe, float:1.9817955E38)
            goto L83
        L80:
            r3 = 2132088828(0x7f1517fc, float:1.981795E38)
        L83:
            java.lang.Object r0 = r0.get()
            androidx.preference.Preference r0 = (androidx.preference.Preference) r0
            r4.h(r3, r0)
            return
        L8d:
            java.lang.Object r0 = r0.get()
            androidx.preference.Preference r0 = (androidx.preference.Preference) r0
            r1 = 2132087599(0x7f15132f, float:1.9815458E38)
            r4.h(r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cvar.d():void");
    }

    public final void e() {
        if (crbf.d()) {
            this.k.ifPresent(new Consumer() { // from class: cvaj
                @Override // java.util.function.Consumer
                /* renamed from: accept */
                public final void z(Object obj) {
                    final uva uvaVar = (uva) obj;
                    egys egysVar = new egys(uvaVar.b, new eopk() { // from class: uuy
                        @Override // defpackage.eopk
                        public final eopy a(eopt eoptVar) {
                            uva uvaVar2 = uvaVar;
                            return new eopy(auvw.c(uvaVar2.c, fcyi.a, fdjz.a, new uuz(uvaVar2, null)));
                        }
                    }, "magic_compose_availability_data_source");
                    final cvar cvarVar = this.a;
                    cvarVar.c.a(egysVar, new egzv<agqo>() { // from class: cvar.1
                        @Override // defpackage.egzv
                        public final void a(Throwable th) {
                            cvar cvarVar2 = cvar.this;
                            Optional optionalB = cvarVar2.b(R.string.mc_enabled_pref_key);
                            aiif aiifVar = cvarVar2.a;
                            PreferenceScreen preferenceScreenE = aiifVar.e();
                            preferenceScreenE.getClass();
                            optionalB.ifPresent(new cvaq(preferenceScreenE));
                            Optional optionalB2 = cvarVar2.b(R.string.experiment_badge_pref_key);
                            PreferenceScreen preferenceScreenE2 = aiifVar.e();
                            preferenceScreenE2.getClass();
                            optionalB2.ifPresent(new cvaq(preferenceScreenE2));
                        }

                        @Override // defpackage.egzv
                        public final /* bridge */ /* synthetic */ void b(Object obj2) {
                            boolean z = ((agqo) obj2).a;
                            cvar cvarVar2 = cvar.this;
                            Optional optionalB = cvarVar2.b(R.string.mc_enabled_pref_key);
                            if (!z) {
                                aiif aiifVar = cvarVar2.a;
                                PreferenceScreen preferenceScreenE = aiifVar.e();
                                preferenceScreenE.getClass();
                                optionalB.ifPresent(new cvaq(preferenceScreenE));
                                Optional optionalB2 = cvarVar2.b(R.string.experiment_badge_pref_key);
                                PreferenceScreen preferenceScreenE2 = aiifVar.e();
                                preferenceScreenE2.getClass();
                                optionalB2.ifPresent(new cvaq(preferenceScreenE2));
                            }
                            cvarVar2.d();
                        }

                        @Override // defpackage.egzv
                        public final /* synthetic */ void hn() {
                        }
                    });
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
        }
    }

    public final void f() throws Resources.NotFoundException {
        aiif aiifVar;
        aiif aiifVar2 = this.a;
        aiifVar2.b.f("bugle");
        aiifVar2.f(R.xml.smarts_preferences);
        aiifVar2.e().ag();
        Optional optionalB = b(R.string.suggested_stickers_enabled_pref_key);
        if (!((Boolean) crbf.q.e()).booleanValue()) {
            final PreferenceScreen preferenceScreenE = aiifVar2.e();
            preferenceScreenE.getClass();
            optionalB.ifPresent(new Consumer() { // from class: cvam
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
        if (!crbf.d() || this.e.isEmpty() || this.k.isEmpty()) {
            Optional optionalB2 = b(R.string.mc_enabled_pref_key);
            final PreferenceScreen preferenceScreenE2 = aiifVar2.e();
            preferenceScreenE2.getClass();
            optionalB2.ifPresent(new Consumer() { // from class: cvam
                @Override // java.util.function.Consumer
                /* renamed from: accept */
                public final void z(Object obj) {
                    preferenceScreenE2.af((Preference) obj);
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
            Optional optionalB3 = b(R.string.experiment_badge_pref_key);
            final PreferenceScreen preferenceScreenE3 = aiifVar2.e();
            preferenceScreenE3.getClass();
            optionalB3.ifPresent(new Consumer() { // from class: cvam
                @Override // java.util.function.Consumer
                /* renamed from: accept */
                public final void z(Object obj) {
                    preferenceScreenE3.af((Preference) obj);
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
        } else {
            b(R.string.mc_enabled_pref_key).ifPresent(new Consumer() { // from class: cvae
                @Override // java.util.function.Consumer
                /* renamed from: accept */
                public final void z(Object obj) {
                    final cvar cvarVar = this.a;
                    final SwitchPreferenceCompat switchPreferenceCompat = (SwitchPreferenceCompat) obj;
                    cvarVar.e.get();
                    switchPreferenceCompat.L(R.string.magic_compose_setting_title);
                    cvarVar.c(switchPreferenceCompat, ((TwoStatePreference) switchPreferenceCompat).a);
                    switchPreferenceCompat.n = new eilq(cvarVar.d, "SmartsSettingsFragmentPeer:togglePantherEnabled", new oza() { // from class: cuzv
                        @Override // defpackage.oza
                        public final boolean a(Preference preference, Object obj2) {
                            final boolean zEquals = Boolean.TRUE.equals(obj2);
                            cvar cvarVar2 = cvarVar;
                            cvarVar2.c(switchPreferenceCompat, zEquals);
                            if (zEquals) {
                                fcsu fcsuVar = cvarVar2.g;
                                ((vbv) fcsuVar.b()).c(false);
                                vbv vbvVar = (vbv) fcsuVar.b();
                                auvw.k(vbvVar.a, null, null, new vbo(vbvVar, null), 3);
                                if (((Boolean) ((cczi) crbf.aW.get()).e()).booleanValue()) {
                                    ((vbv) fcsuVar.b()).b(false);
                                    vbv vbvVar2 = (vbv) fcsuVar.b();
                                    auvw.k(vbvVar2.a, null, null, new vbq(vbvVar2, null), 3);
                                }
                            }
                            cvarVar2.h.ifPresent(new Consumer() { // from class: cvai
                                @Override // java.util.function.Consumer
                                /* renamed from: accept */
                                public final void z(Object obj3) {
                                    ((uzw) obj3).g(zEquals);
                                }

                                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                                    return Consumer$CC.$default$andThen(this, consumer);
                                }
                            });
                            return true;
                        }
                    });
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
        }
        Optional optionalB4 = b(R.string.smart_action_example_key);
        Optional optionalB5 = b(R.string.smart_reply_suggestion_example_key);
        Optional optionalB6 = b(R.string.smart_action_settings_parent_pref);
        Optional optionalB7 = b(R.string.smart_actions_enabled_pref_key);
        ejxr ejxrVar = cugc.a;
        if (((Boolean) ((cczi) ejxrVar.get()).e()).booleanValue()) {
            final PreferenceScreen preferenceScreenE4 = aiifVar2.e();
            preferenceScreenE4.getClass();
            optionalB7.ifPresent(new Consumer() { // from class: cvam
                @Override // java.util.function.Consumer
                /* renamed from: accept */
                public final void z(Object obj) {
                    preferenceScreenE4.af((Preference) obj);
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
            final PreferenceScreen preferenceScreenE5 = aiifVar2.e();
            preferenceScreenE5.getClass();
            optionalB4.ifPresent(new Consumer() { // from class: cvaf
                @Override // java.util.function.Consumer
                /* renamed from: accept */
                public final void z(Object obj) {
                    preferenceScreenE5.af((SuggestionExamplePreference) obj);
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
            optionalB6.ifPresent(new Consumer() { // from class: cvah
                @Override // java.util.function.Consumer
                /* renamed from: accept */
                public final void z(Object obj) {
                    PreferenceScreen preferenceScreen = (PreferenceScreen) obj;
                    preferenceScreen.t = this.a.b.e(preferenceScreen.j);
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
        } else {
            final PreferenceScreen preferenceScreenE6 = aiifVar2.e();
            preferenceScreenE6.getClass();
            optionalB6.ifPresent(new Consumer() { // from class: cvap
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
        Resources resourcesB = aiifVar2.B();
        ejxr ejxrVar2 = cugc.b;
        if (((Boolean) ((cczi) ejxrVar2.get()).e()).booleanValue()) {
            final PreferenceScreen preferenceScreenE7 = aiifVar2.e();
            preferenceScreenE7.getClass();
            optionalB4.ifPresent(new Consumer() { // from class: cvaf
                @Override // java.util.function.Consumer
                /* renamed from: accept */
                public final void z(Object obj) {
                    preferenceScreenE7.af((SuggestionExamplePreference) obj);
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
            final PreferenceScreen preferenceScreenE8 = aiifVar2.e();
            preferenceScreenE8.getClass();
            optionalB5.ifPresent(new Consumer() { // from class: cvaf
                @Override // java.util.function.Consumer
                /* renamed from: accept */
                public final void z(Object obj) {
                    preferenceScreenE8.af((SuggestionExamplePreference) obj);
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
            aiifVar = aiifVar2;
        } else {
            int i = ekgb.d;
            final ekfw ekfwVar = new ekfw();
            crej crejVar = this.j;
            if (crejVar.d()) {
                ezgh ezghVar = (ezgh) ezgi.a.createBuilder();
                ezbn ezbnVar = ezbn.a;
                ezghVar.copyOnWrite();
                ezgi ezgiVar = (ezgi) ezghVar.instance;
                ezbnVar.getClass();
                ezgiVar.d = ezbnVar;
                ezgiVar.c = 19;
                ezgf ezgfVar = (ezgf) ezgg.b.createBuilder();
                ezan ezanVar = ezan.CALENDAR;
                ezgfVar.copyOnWrite();
                aiifVar = aiifVar2;
                ((ezgg) ezgfVar.instance).l = ezanVar.a();
                ezghVar.copyOnWrite();
                ezgi ezgiVar2 = (ezgi) ezghVar.instance;
                ezgg ezggVar = (ezgg) ezgfVar.build();
                ezggVar.getClass();
                ezgiVar2.e = ezggVar;
                ezgiVar2.b |= 1;
                ekfwVar.h(new SmartSuggestionItemSuggestionData((ezgi) ezghVar.build()));
            } else {
                aiifVar = aiifVar2;
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
            optionalB4.ifPresent(new Consumer() { // from class: cvan
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
            ekfwVar2.h(g(resourcesB.getString(R.string.example_smart_reply_text1)));
            ekfwVar2.h(g(resourcesB.getString(R.string.example_smart_reply_text2)));
            ekfwVar2.h(g(resourcesB.getString(R.string.example_smart_reply_text3)));
            ekfwVar2.h(g(resourcesB.getString(R.string.example_smart_reply_text4)));
            optionalB5.ifPresent(new Consumer() { // from class: cvao
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
        this.l = b(R.string.nudge_settings_parent_pref);
        if (crbf.g()) {
            this.l.ifPresent(new Consumer() { // from class: cval
                @Override // java.util.function.Consumer
                /* renamed from: accept */
                public final void z(Object obj) {
                    cvar cvarVar = this.a;
                    ((PreferenceScreen) obj).t = cvarVar.b.d(cvarVar.a.e().j);
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
        } else {
            Optional optional = this.l;
            final PreferenceScreen preferenceScreenE9 = aiifVar.e();
            preferenceScreenE9.getClass();
            optional.ifPresent(new Consumer() { // from class: cvap
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
        if (((Boolean) ((cczi) ejxrVar2.get()).e()).booleanValue()) {
            b(R.string.assistant_enabled_pref_key).ifPresent(new Consumer() { // from class: cuzw
                @Override // java.util.function.Consumer
                /* renamed from: accept */
                public final void z(Object obj) {
                    Preference preference = (Preference) obj;
                    preference.H(this.a.a(R.drawable.assistant_logo));
                    preference.J(R.string.assistant_preference_summary);
                    preference.I(8);
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
            b(R.string.p2p_conversation_suggestions_enabled_pref_key).ifPresent(new Consumer() { // from class: cuzx
                @Override // java.util.function.Consumer
                /* renamed from: accept */
                public final void z(Object obj) {
                    Preference preference = (Preference) obj;
                    preference.H(this.a.a(R.drawable.quantum_gm_ic_chat_vd_theme_24));
                    preference.J(R.string.smart_reply_preference_summary);
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
            optionalB.ifPresent(new Consumer() { // from class: cuzy
                @Override // java.util.function.Consumer
                /* renamed from: accept */
                public final void z(Object obj) {
                    Preference preference = (Preference) obj;
                    preference.H(this.a.a(R.drawable.quantum_gm_ic_sticker_vd_theme_24));
                    preference.I(7);
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
            this.l.ifPresent(new Consumer() { // from class: cuzz
                @Override // java.util.function.Consumer
                /* renamed from: accept */
                public final void z(Object obj) {
                    ((PreferenceScreen) obj).H(this.a.a(R.drawable.quantum_ic_alarm_vd_theme_24));
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
            if (crbf.d() && this.f.isPresent()) {
                b(R.string.mc_enabled_pref_key).ifPresent(new Consumer() { // from class: cvaa
                    @Override // java.util.function.Consumer
                    /* renamed from: accept */
                    public final void z(Object obj) {
                        cvar cvarVar = this.a;
                        ((Preference) obj).H(cvarVar.a(R.drawable.messages_spark_outlined));
                    }

                    public final /* synthetic */ Consumer andThen(Consumer consumer) {
                        return Consumer$CC.$default$andThen(this, consumer);
                    }
                });
            }
            if (((Boolean) ((cczi) ejxrVar.get()).e()).booleanValue()) {
                optionalB6.ifPresent(new Consumer() { // from class: cvab
                    @Override // java.util.function.Consumer
                    /* renamed from: accept */
                    public final void z(Object obj) {
                        ((PreferenceScreen) obj).H(this.a.a(R.drawable.quantum_gm_ic_calendar_add_on_gm_grey_24));
                    }

                    public final /* synthetic */ Consumer andThen(Consumer consumer) {
                        return Consumer$CC.$default$andThen(this, consumer);
                    }
                });
            } else {
                optionalB7.ifPresent(new Consumer() { // from class: cvac
                    @Override // java.util.function.Consumer
                    /* renamed from: accept */
                    public final void z(Object obj) {
                        ((Preference) obj).H(this.a.a(R.drawable.quantum_gm_ic_calendar_add_on_gm_grey_24));
                    }

                    public final /* synthetic */ Consumer andThen(Consumer consumer) {
                        return Consumer$CC.$default$andThen(this, consumer);
                    }
                });
            }
        }
        b(R.string.ds_setting_key).ifPresent(new Consumer() { // from class: cvad
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void z(Object obj) {
                Preference preference = (Preference) obj;
                final cvar cvarVar = this.a;
                Optional optional2 = cvarVar.i;
                if (optional2.isEmpty() || !((Boolean) ((cczi) crbf.bJ.get()).e()).booleanValue()) {
                    cvarVar.a.e().af(preference);
                    return;
                }
                final ztz ztzVar = (ztz) optional2.get();
                preference.H(cvarVar.a(ztzVar.a()));
                preference.M(ztzVar.d());
                preference.n(ztzVar.c());
                preference.o = new ozb() { // from class: cvag
                    @Override // defpackage.ozb
                    public final boolean a(Preference preference2) {
                        Intent intent = new Intent();
                        ztz ztzVar2 = ztzVar;
                        intent.setClassName(ztzVar2.b(), ztzVar2.e());
                        cvarVar.a.aD(intent);
                        return true;
                    }
                };
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
        d();
    }
}
