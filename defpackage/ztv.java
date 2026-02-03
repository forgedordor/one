package defpackage;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.provider.CalendarContract;
import android.text.TextUtils;
import androidx.car.app.navigation.model.Maneuver;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.api.messaging.Conversation;
import com.google.android.apps.messaging.shared.conversation.draft.ComposeRowState;
import com.google.android.apps.messaging.shared.datamodel.data.suggestions.SmartSuggestionData;
import com.google.android.apps.messaging.shared.datamodel.data.suggestions.impl.RbmSuggestionData;
import com.google.android.ims.rcsservice.chatsession.message.ConversationSuggestion;
import j$.util.Optional;
import java.util.Calendar;
import java.util.Map;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ztv implements zrc {
    public static final ekrg a = ekrg.c("com/google/android/apps/messaging/conversation2/messagelist/suggestion/SuggestionUiAdapterImpl");
    public static final Map b = fcwa.g(new fcti(8, aaab.a), new fcti(9, aaab.b), new fcti(10, aaab.c));
    public static final Map c = fcwa.g(new fcti(aaab.a, enfj.TEXT), new fcti(aaab.b, enfj.AUDIO), new fcti(aaab.c, enfj.VIDEO));
    public static final Map d = fcwa.g(new fcti(11, enfo.WEBVIEW), new fcti(1, enfo.BROWSER));
    public final fcsu A;
    public final fcsu B;
    public final ahax C;
    public final fcsu D;
    public final fcsu E;
    public final fcsu F;
    public final fcsu G;
    public final fcsu H;
    public final zqz I;
    private final Optional J;
    private final fcsu K;
    private final fcsu L;
    private final fcsu M;
    private final fcsu N;
    private final fctc O;
    private final fctc P;
    public final fdjx e;
    public final fdjx f;
    public final Context g;
    public final Conversation h;
    public final ajlu i;
    public final ajlw j;
    public final fdpl k;
    public final fcsu l;
    public final fcsu m;
    public final fcsu n;
    public final fcsu o;
    public final fcsu p;
    public final fcsu q;
    public final fcsu r;
    public final fcsu s;
    public final fcsu t;
    public final fcsu u;
    public final fcsu v;
    public final fcsu w;
    public final fcsu x;
    public final fcsu y;
    public final fcsu z;

    public ztv(fdjx fdjxVar, fdjx fdjxVar2, Context context, Conversation conversation, ajlu ajluVar, ajlw ajlwVar, fdpl fdplVar, fcsu fcsuVar, @apnu fcsu fcsuVar2, fcsu fcsuVar3, fcsu fcsuVar4, fcsu fcsuVar5, fcsu fcsuVar6, fcsu fcsuVar7, fcsu fcsuVar8, fcsu fcsuVar9, fcsu fcsuVar10, Optional optional, fcsu fcsuVar11, fcsu fcsuVar12, fcsu fcsuVar13, fcsu fcsuVar14, fcsu fcsuVar15, fcsu fcsuVar16, fcsu fcsuVar17, final fcsu fcsuVar18, final fcsu fcsuVar19, fcsu fcsuVar20, fcsu fcsuVar21, fcsu fcsuVar22, fcsu fcsuVar23, ahax ahaxVar, fcsu fcsuVar24, fcsu fcsuVar25, fcsu fcsuVar26, fcsu fcsuVar27, fcsu fcsuVar28, zqz zqzVar, vuc vucVar) {
        fdjxVar.getClass();
        fdjxVar2.getClass();
        context.getClass();
        conversation.getClass();
        ajluVar.getClass();
        ajlwVar.getClass();
        fdplVar.getClass();
        fcsuVar2.getClass();
        fcsuVar5.getClass();
        fcsuVar6.getClass();
        fcsuVar7.getClass();
        fcsuVar9.getClass();
        fcsuVar10.getClass();
        fcsuVar11.getClass();
        fcsuVar12.getClass();
        fcsuVar13.getClass();
        fcsuVar15.getClass();
        fcsuVar16.getClass();
        fcsuVar17.getClass();
        fcsuVar19.getClass();
        fcsuVar20.getClass();
        fcsuVar21.getClass();
        fcsuVar22.getClass();
        fcsuVar23.getClass();
        ahaxVar.getClass();
        fcsuVar24.getClass();
        fcsuVar25.getClass();
        fcsuVar28.getClass();
        vucVar.getClass();
        this.e = fdjxVar;
        this.f = fdjxVar2;
        this.g = context;
        this.h = conversation;
        this.i = ajluVar;
        this.j = ajlwVar;
        this.k = fdplVar;
        this.l = fcsuVar;
        this.m = fcsuVar2;
        this.n = fcsuVar3;
        this.o = fcsuVar4;
        this.p = fcsuVar5;
        this.q = fcsuVar6;
        this.r = fcsuVar7;
        this.s = fcsuVar8;
        this.t = fcsuVar9;
        this.u = fcsuVar10;
        this.J = optional;
        this.K = fcsuVar11;
        this.v = fcsuVar12;
        this.w = fcsuVar13;
        this.x = fcsuVar14;
        this.y = fcsuVar15;
        this.z = fcsuVar16;
        this.A = fcsuVar17;
        this.B = fcsuVar20;
        this.L = fcsuVar21;
        this.M = fcsuVar22;
        this.N = fcsuVar23;
        this.C = ahaxVar;
        this.D = fcsuVar24;
        this.E = fcsuVar25;
        this.F = fcsuVar26;
        this.G = fcsuVar27;
        this.H = fcsuVar28;
        this.I = zqzVar;
        this.O = fctd.a(new fdae() { // from class: zro
            @Override // defpackage.fdae
            public final Object invoke() {
                Optional optional2;
                Object objB = this.m.b();
                objB.getClass();
                fcsu fcsuVar29 = true != ((Boolean) objB).booleanValue() ? null : fcsuVar18;
                if (fcsuVar29 == null || (optional2 = (Optional) fcsuVar29.b()) == null) {
                    return null;
                }
                return (xgc) fdct.b(optional2);
            }
        });
        this.P = fctd.a(new fdae() { // from class: zru
            @Override // defpackage.fdae
            public final Object invoke() {
                ekrg ekrgVar = ztv.a;
                return (vwj) fcsuVar19.b();
            }
        });
    }

    public static final ComposeRowState o(String str, aaab aaabVar) {
        int iOrdinal = aaabVar.ordinal();
        if (iOrdinal == 0) {
            return avnr.a(avnz.a(str, fcvo.a, null), null);
        }
        if (iOrdinal == 1) {
            return avnr.a(avnz.a(str, fcvo.a, null), avob.a);
        }
        if (iOrdinal == 2) {
            return avnr.a(avnz.a(str, fcvo.a, null), avob.b);
        }
        throw new fctg();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [fcsu, java.lang.Object] */
    @Override // defpackage.zrc
    public final dlfg a(final aldp aldpVar) {
        dlfg dlfgVarA;
        aldpVar.getClass();
        Optional optional = this.J;
        if (optional.isEmpty() || (dlfgVarA = ((ztw) optional.get().b()).a(aldpVar)) == null) {
            return null;
        }
        if (aldpVar instanceof SmartSuggestionData) {
            fdae fdaeVarB = auxh.b(new fdae() { // from class: zrp
                @Override // defpackage.fdae
                public final Object invoke() {
                    fdae zrtVar;
                    fdae zrvVar;
                    aldp aldpVar2 = aldpVar;
                    final SmartSuggestionData smartSuggestionData = (SmartSuggestionData) aldpVar2;
                    int iOrdinal = smartSuggestionData.l().ordinal();
                    final ztv ztvVar = this.a;
                    switch (iOrdinal) {
                        case 0:
                        case 4:
                        case 6:
                        case 7:
                        case 8:
                        case 10:
                        case 14:
                        case 17:
                        case 18:
                        case 19:
                        case 20:
                        case 21:
                        case 24:
                        case 25:
                        case 26:
                        case 27:
                        case 28:
                        case 29:
                        case 30:
                        case 31:
                        case 32:
                        case 33:
                        case 40:
                            zrtVar = new fdae() { // from class: zsb
                                @Override // defpackage.fdae
                                public final Object invoke() {
                                    ekrg ekrgVar = ztv.a;
                                    return fctx.a;
                                }
                            };
                            zrtVar.invoke();
                            auvw.k(ztvVar.f, null, null, new zse(ztvVar, aldpVar2, null), 3);
                            return fctx.a;
                        case 1:
                        case 2:
                        case 15:
                        case 16:
                            zrvVar = new zrv(ztvVar, smartSuggestionData);
                            zrtVar = zrvVar;
                            zrtVar.invoke();
                            auvw.k(ztvVar.f, null, null, new zse(ztvVar, aldpVar2, null), 3);
                            return fctx.a;
                        case 3:
                            zrtVar = new fdae() { // from class: zrx
                                @Override // defpackage.fdae
                                public final Object invoke() {
                                    ((vwg) ztvVar.o.b()).c(new vwe(xhc.a));
                                    return fctx.a;
                                }
                            };
                            zrtVar.invoke();
                            auvw.k(ztvVar.f, null, null, new zse(ztvVar, aldpVar2, null), 3);
                            return fctx.a;
                        case 5:
                            zrvVar = new fdae() { // from class: zrf
                                @Override // defpackage.fdae
                                public final Object invoke() {
                                    ((vwg) ztvVar.o.b()).c(new vwb(vvy.b, smartSuggestionData.p()));
                                    return fctx.a;
                                }
                            };
                            zrtVar = zrvVar;
                            zrtVar.invoke();
                            auvw.k(ztvVar.f, null, null, new zse(ztvVar, aldpVar2, null), 3);
                            return fctx.a;
                        case 9:
                            zrtVar = new fdae() { // from class: zrg
                                @Override // defpackage.fdae
                                public final Object invoke() {
                                    ((vwg) ztvVar.o.b()).c(vwc.a);
                                    return fctx.a;
                                }
                            };
                            zrtVar.invoke();
                            auvw.k(ztvVar.f, null, null, new zse(ztvVar, aldpVar2, null), 3);
                            return fctx.a;
                        case 11:
                            zrtVar = new fdae() { // from class: zrh
                                @Override // defpackage.fdae
                                public final Object invoke() {
                                    ekrg ekrgVar = ztv.a;
                                    return fctx.a;
                                }
                            };
                            zrtVar.invoke();
                            auvw.k(ztvVar.f, null, null, new zse(ztvVar, aldpVar2, null), 3);
                            return fctx.a;
                        case 12:
                            zrvVar = new fdae() { // from class: zrk
                                @Override // defpackage.fdae
                                public final Object invoke() {
                                    ztv ztvVar2 = ztvVar;
                                    SmartSuggestionData smartSuggestionData2 = smartSuggestionData;
                                    ztvVar2.k(smartSuggestionData2.o(), smartSuggestionData2.u());
                                    return fctx.a;
                                }
                            };
                            zrtVar = zrvVar;
                            zrtVar.invoke();
                            auvw.k(ztvVar.f, null, null, new zse(ztvVar, aldpVar2, null), 3);
                            return fctx.a;
                        case 13:
                            zrtVar = new zrt(ztvVar);
                            zrtVar.invoke();
                            auvw.k(ztvVar.f, null, null, new zse(ztvVar, aldpVar2, null), 3);
                            return fctx.a;
                        case 22:
                            zrvVar = new fdae() { // from class: zri
                                @Override // defpackage.fdae
                                public final Object invoke() {
                                    ((cpez) ztvVar.r.b()).e(smartSuggestionData, eyzv.CONVERSATION_VIEW);
                                    return fctx.a;
                                }
                            };
                            zrtVar = zrvVar;
                            zrtVar.invoke();
                            auvw.k(ztvVar.f, null, null, new zse(ztvVar, aldpVar2, null), 3);
                            return fctx.a;
                        case 23:
                            zrvVar = new fdae() { // from class: zrj
                                @Override // defpackage.fdae
                                public final Object invoke() {
                                    SmartSuggestionData smartSuggestionData2 = smartSuggestionData;
                                    if (smartSuggestionData2.m().c == 19) {
                                        ezgi ezgiVarM = smartSuggestionData2.m();
                                        ezbn ezbnVar = ezgiVarM.c == 19 ? (ezbn) ezgiVarM.d : ezbn.a;
                                        ezbnVar.getClass();
                                        ezpz ezpzVarA = eykd.a(ezbnVar);
                                        String str = ezbnVar.e;
                                        String strB = smartSuggestionData2.b();
                                        Uri.Builder builderBuildUpon = fdbq.f("android.intent.action.INSERT", "android.intent.action.VIEW") ? CalendarContract.CONTENT_URI.buildUpon() : CalendarContract.Events.CONTENT_URI.buildUpon();
                                        Intent intent = new Intent("android.intent.action.INSERT");
                                        if (ezpzVarA != null) {
                                            Calendar calendar = Calendar.getInstance();
                                            calendar.getClass();
                                            int i = 0;
                                            calendar.set(13, 0);
                                            calendar.set(14, 0);
                                            int i2 = ezpzVarA.b;
                                            boolean z = (i2 & 2) != 0;
                                            int i3 = i2 & 1;
                                            if (z) {
                                                if (i3 != 0) {
                                                    eyaz eyazVar = ezpzVarA.c;
                                                    if (eyazVar == null) {
                                                        eyazVar = eyaz.a;
                                                    }
                                                    eyazVar.getClass();
                                                    cwsv.a(calendar, eyazVar);
                                                    eybm eybmVar = ezpzVarA.d;
                                                    if (eybmVar == null) {
                                                        eybmVar = eybm.a;
                                                    }
                                                    eybmVar.getClass();
                                                    cwsv.b(calendar, eybmVar);
                                                }
                                                intent = cwsu.a("android.intent.action.INSERT", Long.valueOf(calendar.getTimeInMillis()), null);
                                            } else {
                                                i = i3;
                                            }
                                            if (z) {
                                                eybm eybmVar2 = ezpzVarA.d;
                                                if (eybmVar2 == null) {
                                                    eybmVar2 = eybm.a;
                                                }
                                                eybmVar2.getClass();
                                                cwsv.b(calendar, eybmVar2);
                                            } else if (i != 0) {
                                                calendar.clear();
                                                eyaz eyazVar2 = ezpzVarA.c;
                                                if (eyazVar2 == null) {
                                                    eyazVar2 = eyaz.a;
                                                }
                                                eyazVar2.getClass();
                                                cwsv.a(calendar, eyazVar2);
                                            }
                                            intent = cwsu.a("android.intent.action.INSERT", Long.valueOf(calendar.getTimeInMillis()), null);
                                        } else {
                                            intent.setData(builderBuildUpon.build());
                                        }
                                        if (!TextUtils.isEmpty(str)) {
                                            intent.putExtra("eventLocation", str);
                                        }
                                        ztv ztvVar2 = ztvVar;
                                        Context context = ztvVar2.g;
                                        intent.putExtra("description", context.getString(R.string.calendar_suggestion_event_description));
                                        diel dielVar = (diel) dieo.a.createBuilder();
                                        dielVar.copyOnWrite();
                                        dieo.a((dieo) dielVar.instance);
                                        diem diemVar = (diem) dien.a.createBuilder();
                                        String string = context.getString(R.string.calendar_suggestion_event_chat_title);
                                        diemVar.copyOnWrite();
                                        dien dienVar = (dien) diemVar.instance;
                                        string.getClass();
                                        dienVar.b |= 16;
                                        dienVar.c = string;
                                        dielVar.copyOnWrite();
                                        dieo dieoVar = (dieo) dielVar.instance;
                                        dien dienVar2 = (dien) diemVar.build();
                                        dienVar2.getClass();
                                        dieoVar.h = dienVar2;
                                        dieoVar.b |= 16384;
                                        if (intent.hasExtra(ConversationSuggestion.SUGGESTION_PROPERTY_CALENDAR_TITLE)) {
                                            String stringExtra = intent.getStringExtra(ConversationSuggestion.SUGGESTION_PROPERTY_CALENDAR_TITLE);
                                            stringExtra.getClass();
                                            dielVar.copyOnWrite();
                                            dieo dieoVar2 = (dieo) dielVar.instance;
                                            dieoVar2.b |= 4;
                                            dieoVar2.c = stringExtra;
                                        }
                                        if (intent.hasExtra("eventLocation")) {
                                            String stringExtra2 = intent.getStringExtra("eventLocation");
                                            stringExtra2.getClass();
                                            dielVar.copyOnWrite();
                                            dieo dieoVar3 = (dieo) dielVar.instance;
                                            dieoVar3.b |= 128;
                                            dieoVar3.f = stringExtra2;
                                        }
                                        if (intent.hasExtra("description")) {
                                            String stringExtra3 = intent.getStringExtra("description");
                                            stringExtra3.getClass();
                                            dielVar.copyOnWrite();
                                            dieo dieoVar4 = (dieo) dielVar.instance;
                                            dieoVar4.b |= 256;
                                            dieoVar4.g = stringExtra3;
                                        }
                                        if (intent.hasExtra("beginTime")) {
                                            long longExtra = intent.getLongExtra("beginTime", 0L);
                                            dielVar.copyOnWrite();
                                            dieo dieoVar5 = (dieo) dielVar.instance;
                                            dieoVar5.b |= 16;
                                            dieoVar5.d = longExtra;
                                        }
                                        if (intent.hasExtra("endTime")) {
                                            long longExtra2 = intent.getLongExtra("endTime", 0L);
                                            dielVar.copyOnWrite();
                                            dieo dieoVar6 = (dieo) dielVar.instance;
                                            dieoVar6.b |= 32;
                                            dieoVar6.e = longExtra2;
                                        }
                                        evsn evsnVarBuild = dielVar.build();
                                        evsnVarBuild.getClass();
                                        intent.putExtra("proto", ((dieo) evsnVarBuild).toByteArray());
                                        auvw.k(ztvVar2.f, null, null, new zts(ztvVar2, intent, strB, null), 3);
                                    }
                                    return fctx.a;
                                }
                            };
                            zrtVar = zrvVar;
                            zrtVar.invoke();
                            auvw.k(ztvVar.f, null, null, new zse(ztvVar, aldpVar2, null), 3);
                            return fctx.a;
                        case 34:
                            zrvVar = new fdae() { // from class: zrl
                                @Override // defpackage.fdae
                                public final Object invoke() {
                                    SmartSuggestionData smartSuggestionData2 = smartSuggestionData;
                                    String strD = smartSuggestionData2.d();
                                    if (strD != null) {
                                        ztv ztvVar2 = ztvVar;
                                        if (((Boolean) ((cczi) crbf.as.get()).e()).booleanValue()) {
                                            new zrv(ztvVar2, smartSuggestionData2).invoke();
                                        } else {
                                            auvw.k(ztvVar2.f, null, null, new zsr(ztvVar2, strD, null), 3);
                                        }
                                    }
                                    return fctx.a;
                                }
                            };
                            zrtVar = zrvVar;
                            zrtVar.invoke();
                            auvw.k(ztvVar.f, null, null, new zse(ztvVar, aldpVar2, null), 3);
                            return fctx.a;
                        case 35:
                            zrvVar = new fdae() { // from class: zre
                                @Override // defpackage.fdae
                                public final Object invoke() {
                                    ztv ztvVar2 = ztvVar;
                                    auvw.k(ztvVar2.f, null, null, new zsp(ztvVar2, smartSuggestionData, null), 3);
                                    return fctx.a;
                                }
                            };
                            zrtVar = zrvVar;
                            zrtVar.invoke();
                            auvw.k(ztvVar.f, null, null, new zse(ztvVar, aldpVar2, null), 3);
                            return fctx.a;
                        case 36:
                            zrtVar = new fdae() { // from class: zrm
                                @Override // defpackage.fdae
                                public final Object invoke() {
                                    ztv ztvVar2 = ztvVar;
                                    auvw.k(ztvVar2.f, null, null, new zsn(ztvVar2, null), 3);
                                    return fctx.a;
                                }
                            };
                            zrtVar.invoke();
                            auvw.k(ztvVar.f, null, null, new zse(ztvVar, aldpVar2, null), 3);
                            return fctx.a;
                        case 37:
                            zrvVar = new fdae() { // from class: zry
                                @Override // defpackage.fdae
                                public final Object invoke() {
                                    ztvVar.j(smartSuggestionData.q());
                                    return fctx.a;
                                }
                            };
                            zrtVar = zrvVar;
                            zrtVar.invoke();
                            auvw.k(ztvVar.f, null, null, new zse(ztvVar, aldpVar2, null), 3);
                            return fctx.a;
                        case 38:
                            zrvVar = new fdae() { // from class: zrz
                                @Override // defpackage.fdae
                                public final Object invoke() {
                                    ezgi ezgiVarM = smartSuggestionData.m();
                                    int iA = ezek.a((ezgiVarM.c == 31 ? (ezel) ezgiVarM.d : ezel.a).b);
                                    if (iA == 0) {
                                        iA = 1;
                                    }
                                    ztv ztvVar2 = ztvVar;
                                    int i = iA - 2;
                                    if (i == 1) {
                                        ((uvn) ztvVar2.F.b()).c();
                                    } else if (i == 2) {
                                        ((uvn) ztvVar2.F.b()).b();
                                    }
                                    ((vwg) ztvVar2.o.b()).c(vvz.a);
                                    return fctx.a;
                                }
                            };
                            zrtVar = zrvVar;
                            zrtVar.invoke();
                            auvw.k(ztvVar.f, null, null, new zse(ztvVar, aldpVar2, null), 3);
                            return fctx.a;
                        case Maneuver.TYPE_DESTINATION /* 39 */:
                            zrtVar = new fdae() { // from class: zsa
                                @Override // defpackage.fdae
                                public final Object invoke() {
                                    ((vwg) ztvVar.o.b()).c(vwa.a);
                                    return fctx.a;
                                }
                            };
                            zrtVar.invoke();
                            auvw.k(ztvVar.f, null, null, new zse(ztvVar, aldpVar2, null), 3);
                            return fctx.a;
                        default:
                            throw new fctg();
                    }
                }
            }, this.f);
            if (dlfgVarA instanceof dlfk) {
                return dlfk.e((dlfk) dlfgVarA, fdaeVarB);
            }
            if (dlfgVarA instanceof dlfq) {
                return dlfq.e((dlfq) dlfgVarA, fdaeVarB);
            }
            if (dlfgVarA instanceof dldf) {
                return dldf.b((dldf) dlfgVarA, fdaeVarB);
            }
            throw new fctg();
        }
        if (!(aldpVar instanceof RbmSuggestionData)) {
            return null;
        }
        final RbmSuggestionData rbmSuggestionData = (RbmSuggestionData) aldpVar;
        fdae fdaeVarB2 = auxh.b(new fdae() { // from class: zrd
            @Override // defpackage.fdae
            public final Object invoke() {
                RbmSuggestionData rbmSuggestionData2 = rbmSuggestionData;
                ztv ztvVar = this.a;
                auvw.k(ztvVar.e, null, null, new ztq(rbmSuggestionData2, ztvVar, null), 3);
                return fctx.a;
            }
        }, this.f);
        if (dlfgVarA instanceof dlfk) {
            return dlfk.e((dlfk) dlfgVarA, fdaeVarB2);
        }
        if (dlfgVarA instanceof dlfq) {
            return dlfq.e((dlfq) dlfgVarA, fdaeVarB2);
        }
        Objects.toString(dlfgVarA);
        throw new IllegalArgumentException("Unsupported RBM suggestion UI data type: ".concat(dlfgVarA.toString()));
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [fcsu, java.lang.Object] */
    @Override // defpackage.zrc
    public final dlfg b(final alff alffVar) {
        dlfg dlfgVarB = ((ztw) this.J.get().b()).b(alffVar);
        fdae fdaeVarB = auxh.b(new fdae() { // from class: zrs
            @Override // defpackage.fdae
            public final Object invoke() {
                ztv ztvVar = this.a;
                auvw.m(ztvVar.f, null, new zsf(ztvVar, alffVar, null), 3);
                return fctx.a;
            }
        }, this.f);
        if (dlfgVarB instanceof dlfk) {
            return dlfk.e((dlfk) dlfgVarB, fdaeVarB);
        }
        if (dlfgVarB instanceof dlfq) {
            return dlfq.e((dlfq) dlfgVarB, fdaeVarB);
        }
        if (dlfgVarB instanceof dldf) {
            return dldf.b((dldf) dlfgVarB, fdaeVarB);
        }
        throw new fctg();
    }

    public final vwj c() {
        Object objA = this.P.a();
        objA.getClass();
        return (vwj) objA;
    }

    public final xgc d() {
        return (xgc) this.O.a();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(com.google.android.apps.messaging.shared.datamodel.data.suggestions.impl.RbmSuggestionData r13, defpackage.fcxy r14) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 256
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ztv.e(com.google.android.apps.messaging.shared.datamodel.data.suggestions.impl.RbmSuggestionData, fcxy):java.lang.Object");
    }

    public final Object f(RbmSuggestionData rbmSuggestionData, fcxy fcxyVar) {
        ConversationSuggestion conversationSuggestion = rbmSuggestionData.b;
        int suggestionType = conversationSuggestion.getSuggestionType();
        Intent intentA = suggestionType != 1 ? suggestionType != 2 ? suggestionType != 3 ? suggestionType != 4 ? null : ((cwtj) this.K.b()).a(rbmSuggestionData) : ((cwtj) this.K.b()).b(rbmSuggestionData) : ((cwtj) this.K.b()).c(rbmSuggestionData) : ((cwtj) this.K.b()).d(rbmSuggestionData);
        if (intentA == null || !((cpbz) this.v.b()).e(intentA)) {
            return e(rbmSuggestionData, fcxyVar);
        }
        m(conversationSuggestion.getSuggestionType());
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(com.google.android.apps.messaging.shared.datamodel.data.suggestions.impl.RbmSuggestionData r22, defpackage.fcxy r23) throws java.lang.Throwable {
        /*
            r21 = this;
            r0 = r21
            r1 = r22
            r2 = r23
            boolean r3 = r2 instanceof defpackage.zsj
            if (r3 == 0) goto L19
            r3 = r2
            zsj r3 = (defpackage.zsj) r3
            int r4 = r3.c
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L19
            int r4 = r4 - r5
            r3.c = r4
            goto L1e
        L19:
            zsj r3 = new zsj
            r3.<init>(r0, r2)
        L1e:
            java.lang.Object r2 = r3.a
            fcyl r4 = defpackage.fcyl.a
            int r5 = r3.c
            java.lang.String r6 = "uri"
            r7 = 2
            r8 = 1
            if (r5 == 0) goto L47
            if (r5 == r8) goto L3a
            if (r5 != r7) goto L32
            defpackage.fctl.b(r2)
            return r2
        L32:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L3a:
            java.lang.String r1 = r3.e
            com.google.android.apps.messaging.shared.datamodel.data.suggestions.impl.RbmSuggestionData r5 = r3.d
            defpackage.fctl.b(r2)
            r20 = r5
            r5 = r1
            r1 = r20
            goto L79
        L47:
            defpackage.fctl.b(r2)
            com.google.android.ims.rcsservice.chatsession.message.ConversationSuggestion r2 = r1.b
            java.lang.String r5 = r2.getPropertyValue(r6)
            if (r5 != 0) goto L58
            r1 = 0
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            return r1
        L58:
            java.lang.String r9 = "openUrlViewMode"
            java.lang.String r9 = r2.getPropertyValue(r9)
            int r2 = r2.getSuggestionType()
            r0.m(r2)
            fcsu r2 = r0.E
            java.lang.Object r2 = r2.b()
            aspd r2 = (defpackage.aspd) r2
            r3.d = r1
            r3.e = r5
            r3.c = r8
            java.lang.Object r2 = r2.a(r5, r9, r3)
            if (r2 == r4) goto Lbb
        L79:
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            if (r2 != 0) goto Lb6
            java.util.HashMap r10 = new java.util.HashMap
            r10.<init>()
            r10.put(r6, r5)
            java.lang.String r13 = r1.g()
            com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType r1 = r1.c
            java.lang.String r14 = r1.toString()
            r9 = 1
            r11 = 0
            r12 = 0
            com.google.android.ims.rcsservice.chatsession.message.ConversationSuggestion r15 = com.google.android.ims.rcsservice.chatsession.message.ConversationSuggestion.createRbmConversationSuggestion(r9, r10, r11, r12, r13, r14)
            com.google.android.apps.messaging.shared.datamodel.data.suggestions.impl.RbmSuggestionData r14 = new com.google.android.apps.messaging.shared.datamodel.data.suggestions.impl.RbmSuggestionData
            r18 = 4
            r19 = 0
            r17 = 0
            r16 = r1
            r14.<init>(r15, r16, r17, r18, r19)
            r1 = 0
            r3.d = r1
            r3.e = r1
            r3.c = r7
            java.lang.Object r1 = r0.f(r14, r3)
            if (r1 != r4) goto Lb5
            goto Lbb
        Lb5:
            return r1
        Lb6:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r8)
            return r1
        Lbb:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ztv.g(com.google.android.apps.messaging.shared.datamodel.data.suggestions.impl.RbmSuggestionData, fcxy):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object h(defpackage.dnvg r11, defpackage.fcxy r12) throws java.lang.Throwable {
        /*
            r10 = this;
            boolean r0 = r12 instanceof defpackage.ztr
            if (r0 == 0) goto L13
            r0 = r12
            ztr r0 = (defpackage.ztr) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            ztr r0 = new ztr
            r0.<init>(r10, r12)
        L18:
            java.lang.Object r12 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.fctl.b(r12)
            goto L51
        L27:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L2f:
            defpackage.fctl.b(r12)
            vvr r12 = new vvr
            vvq r4 = new vvq
            vvl r5 = defpackage.vuc.a()
            r8 = 0
            r9 = 62
            r6 = 0
            r7 = 0
            r4.<init>(r5, r6, r7, r8, r9)
            r12.<init>(r11, r4)
            vwj r11 = r10.c()
            r0.c = r3
            java.lang.Object r12 = r11.a(r12, r0)
            if (r12 == r1) goto L75
        L51:
            java.lang.Boolean r12 = (java.lang.Boolean) r12
            boolean r11 = r12.booleanValue()
            if (r11 != 0) goto L72
            ekrg r11 = defpackage.ztv.a
            ekrw r11 = r11.i()
            r12 = 782(0x30e, float:1.096E-42)
            java.lang.String r0 = "SuggestionUiAdapterImpl.kt"
            java.lang.String r1 = "com/google/android/apps/messaging/conversation2/messagelist/suggestion/SuggestionUiAdapterImpl"
            java.lang.String r2 = "sendPhotomojiSticker"
            ekrw r11 = r11.h(r1, r2, r12, r0)
            ekrd r11 = (defpackage.ekrd) r11
            java.lang.String r12 = "Failed to send photomoji suggestion"
            r11.q(r12)
        L72:
            fctx r11 = defpackage.fctx.a
            return r11
        L75:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ztv.h(dnvg, fcxy):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object i(defpackage.aoer r12, java.lang.String r13, com.google.android.apps.messaging.shared.conversation.draft.ComposeRowState r14, defpackage.fcxy r15) throws java.lang.Throwable {
        /*
            r11 = this;
            boolean r0 = r15 instanceof defpackage.ztt
            if (r0 == 0) goto L13
            r0 = r15
            ztt r0 = (defpackage.ztt) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            ztt r0 = new ztt
            r0.<init>(r11, r15)
        L18:
            java.lang.Object r15 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            com.google.android.apps.messaging.shared.conversation.draft.ComposeRowState r14 = r0.d
            defpackage.fctl.b(r15)
            goto L6f
        L29:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L31:
            defpackage.fctl.b(r15)
            fcsu r15 = r11.M
            java.lang.Object r15 = r15.b()
            anty r15 = (defpackage.anty) r15
            fcsu r2 = r11.L
            java.lang.Object r2 = r2.b()
            alrj r2 = (defpackage.alrj) r2
            alqm r13 = r2.n(r13)
            com.google.android.apps.messaging.shared.api.messaging.recipient.Recipient r13 = r15.h(r13)
            fcsu r15 = r11.N
            java.lang.Object r15 = r15.b()
            ajln r15 = (defpackage.ajln) r15
            j$.util.Optional r12 = j$.util.Optional.ofNullable(r12)
            ekgb r13 = defpackage.ekgb.r(r13)
            r2 = 0
            eiju r12 = r15.o(r12, r13, r2)
            r12.getClass()
            r0.d = r14
            r0.c = r3
            java.lang.Object r15 = defpackage.fdxs.c(r12, r0)
            if (r15 != r1) goto L6f
            return r1
        L6f:
            r7 = r14
            fcsu r12 = r11.s
            com.google.android.apps.messaging.shared.api.messaging.Conversation r15 = (com.google.android.apps.messaging.shared.api.messaging.Conversation) r15
            java.lang.Object r12 = r12.b()
            afzc r12 = (defpackage.afzc) r12
            agbq r13 = new agbq
            agbs r2 = new agbs
            com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId r3 = r15.d()
            r9 = 0
            r10 = 450(0x1c2, float:6.3E-43)
            r4 = 1
            r5 = 1
            r6 = 7
            r8 = 0
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10)
            r13.<init>(r2)
            r12.h(r13)
            fctx r12 = defpackage.fctx.a
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ztv.i(aoer, java.lang.String, com.google.android.apps.messaging.shared.conversation.draft.ComposeRowState, fcxy):java.lang.Object");
    }

    public final void j(String str) {
        auvw.k(this.f, null, null, new zsd(this, str, null), 3);
    }

    public final void k(String str, String str2) {
        auvw.k(this.e, null, null, new zsg(this, str, str2, null), 3);
    }

    public final void l(aaab aaabVar) {
        auvw.k(this.e, null, null, new zsl(this, aaabVar, null), 3);
    }

    public final void m(int i) {
        if (i == 1 || i == 11) {
            auvw.k(this.e, null, null, new zsm(this, i, null), 3);
        }
    }

    public final Object n(final aaab aaabVar, final String str, final String str2) {
        if (str == null) {
            return false;
        }
        this.C.b(new fdap() { // from class: zrr
            @Override // defpackage.fdap
            public final Object invoke(Object obj) {
                ((ahat) obj).getClass();
                final ztv ztvVar = this;
                final String str3 = str;
                final String str4 = str2;
                final aaab aaabVar2 = aaabVar;
                return new zzy(new fdae() { // from class: zrq
                    @Override // defpackage.fdae
                    public final Object invoke() {
                        ztv ztvVar2 = ztvVar;
                        auvw.k(ztvVar2.e, null, null, new zsi(ztvVar2, str3, str4, aaabVar2, null), 3);
                        return fctx.a;
                    }
                }, str3, aaabVar2);
            }
        });
        l(aaabVar);
        return true;
    }
}
