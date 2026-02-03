package defpackage;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.text.TextUtils;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.analytics.recurringmetrics.AnalyticsAlarmReceiver;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Collection;
import j$.util.DesugarTimeZone;
import j$.util.Map;
import j$.util.Optional;
import j$.util.function.BiConsumer$CC;
import j$.util.function.Function$CC;
import j$.util.stream.Collectors;
import java.text.DateFormat;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import java.util.function.BiConsumer;
import java.util.function.Function;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ajat {
    public static final cqce a = cqce.g("BugleUsageStatistics", "RecurringMetricsUploader");
    public static final cczi b = cdag.h(cdag.b, "enable_device_resolution_upload", true);
    public static final cczv c = cdag.p(151630898);
    static final ejxr d = cdag.v("log_subs_per_active_sim");
    static final cczi e = cdag.e(cdag.b, "num_of_last_phone_number_digits", 5);
    static final cczi f = cdag.e(cdag.b, "upper_limit_of_sub_per_number", 10);
    public static final long g = TimeUnit.DAYS.toMillis(1);
    public static final long h = TimeUnit.DAYS.toMillis(1);
    public static final long i = TimeUnit.DAYS.toMillis(1);
    public final aiwu A;
    public final aiwq B;
    public final aiul C;
    public final eosc D;
    public final eosc E;
    public final dhes F;
    public final bvuw G;
    public final fcsu H;
    public final fcsu I;
    public final fcsu J;
    public final fcsu K;
    public final fcsu L;
    public final fcsu M;
    public final Optional N;
    public final fcsu O;
    public final fcsu P;
    public final fcsu Q;
    public final Optional R;
    public final Optional S;
    public final fcsu T;
    public final Optional U;
    public final fcsu V;
    public final fcsu W;
    public final fcsu X;
    public final fcsu Y;
    public final fcsu Z;
    public final fcsu aa;
    public final fcsu ab;
    public final fcsu ac;
    public final fcsu ad;
    public final aivj ae;
    private final cpch af;
    private final eosc ag;
    private final Optional ah;
    private final Optional ai;
    private final fcsu aj;
    private final fcsu ak;
    private final fcsu al;
    private final fcsu am;
    private final fcsu an;
    private final fcsu ao;
    private final fcsu ap;
    public final Context j;
    public final bvkr k;
    public final cqbm l;
    public final crny m;
    public final cqzr n;
    public final ajhd o;
    public final ains p;
    public final eygg q;
    public final fcsu r;
    public final crqx s;
    public final crmx t;
    public final crqv u;
    public final crma v;
    public final cogw w;
    public final Optional x;
    public final cpdm y;
    public final chwq z;

    public ajat(Context context, bvkr bvkrVar, crny crnyVar, cqzr cqzrVar, ajhd ajhdVar, ains ainsVar, eygg eyggVar, fcsu fcsuVar, crqx crqxVar, cqbm cqbmVar, crmx crmxVar, cpch cpchVar, crqv crqvVar, crma crmaVar, cogw cogwVar, Optional optional, aivj aivjVar, cpdm cpdmVar, chwq chwqVar, aiwu aiwuVar, aiwq aiwqVar, aiul aiulVar, eosc eoscVar, eosc eoscVar2, eosc eoscVar3, dhes dhesVar, bvuw bvuwVar, fcsu fcsuVar2, Optional optional2, Optional optional3, fcsu fcsuVar3, fcsu fcsuVar4, fcsu fcsuVar5, fcsu fcsuVar6, fcsu fcsuVar7, Optional optional4, fcsu fcsuVar8, fcsu fcsuVar9, fcsu fcsuVar10, fcsu fcsuVar11, Optional optional5, Optional optional6, Optional optional7, fcsu fcsuVar12, fcsu fcsuVar13, fcsu fcsuVar14, fcsu fcsuVar15, fcsu fcsuVar16, fcsu fcsuVar17, fcsu fcsuVar18, fcsu fcsuVar19, fcsu fcsuVar20, fcsu fcsuVar21, fcsu fcsuVar22, fcsu fcsuVar23, fcsu fcsuVar24, fcsu fcsuVar25, fcsu fcsuVar26, fcsu fcsuVar27) {
        this.j = context;
        this.k = bvkrVar;
        this.m = crnyVar;
        this.n = cqzrVar;
        this.o = ajhdVar;
        this.p = ainsVar;
        this.q = eyggVar;
        this.r = fcsuVar;
        this.s = crqxVar;
        this.l = cqbmVar;
        this.t = crmxVar;
        this.af = cpchVar;
        this.u = crqvVar;
        this.v = crmaVar;
        this.w = cogwVar;
        this.x = optional;
        this.ae = aivjVar;
        this.y = cpdmVar;
        this.z = chwqVar;
        this.A = aiwuVar;
        this.B = aiwqVar;
        this.C = aiulVar;
        this.D = eoscVar;
        this.E = eoscVar2;
        this.ag = eoscVar3;
        this.F = dhesVar;
        this.G = bvuwVar;
        this.H = fcsuVar2;
        this.ah = optional2;
        this.ai = optional3;
        this.I = fcsuVar3;
        this.J = fcsuVar4;
        this.K = fcsuVar5;
        this.L = fcsuVar6;
        this.M = fcsuVar7;
        this.Y = fcsuVar15;
        this.N = optional4;
        this.O = fcsuVar8;
        this.P = fcsuVar9;
        this.Q = fcsuVar10;
        this.R = optional5;
        this.S = optional6;
        this.T = fcsuVar11;
        this.U = optional7;
        this.V = fcsuVar12;
        this.W = fcsuVar13;
        this.aj = fcsuVar14;
        this.X = fcsuVar17;
        this.ak = fcsuVar16;
        this.Z = fcsuVar18;
        this.aa = fcsuVar19;
        this.ab = fcsuVar20;
        this.ac = fcsuVar21;
        this.al = fcsuVar22;
        this.ad = fcsuVar23;
        this.am = fcsuVar24;
        this.an = fcsuVar25;
        this.ao = fcsuVar26;
        this.ap = fcsuVar27;
    }

    public static int k(int i2) {
        if (i2 < 1000) {
            return 2;
        }
        if (i2 < 5000) {
            return 3;
        }
        if (i2 < 25000) {
            return 4;
        }
        if (i2 < 100000) {
            return 5;
        }
        if (i2 < 250000) {
            return 6;
        }
        if (i2 < 500000) {
            return 7;
        }
        return i2 < 1000000 ? 8 : 9;
    }

    private final int l(int i2, int i3, alqm alqmVar) throws dhkf {
        if (Build.VERSION.SDK_INT < 33) {
            return 7;
        }
        if (this.v.j()) {
            try {
                try {
                    String phoneNumber = dhks.b(this.j).a.getPhoneNumber(i2, i3);
                    if (ejwk.c(phoneNumber)) {
                        return 4;
                    }
                    phoneNumber.getClass();
                    if (alqmVar == null) {
                        return 5;
                    }
                    String strL = ((alrj) this.ap.b()).u(phoneNumber, i2).l();
                    String strL2 = alqmVar.l();
                    if (ejwk.c(strL2)) {
                        return 5;
                    }
                    return strL2.equals(strL) ? 2 : 3;
                } catch (SecurityException e2) {
                    throw new dhkf("READ_PHONE_STATE permission is missing.", e2);
                }
            } catch (dhkf unused) {
            }
        }
        return 6;
    }

    public final eiju a(final enwr enwrVar, final elsf elsfVar, final ekhx ekhxVar) {
        eiju eijuVarE;
        final ellc ellcVar = (ellc) elld.a.createBuilder();
        bvuw bvuwVar = this.G;
        final eiju eijuVarH = bvuwVar.d.l() ? bvuwVar.c.d().h(new ejvr() { // from class: bvuu
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                ellc ellcVar2 = ellcVar;
                if (zBooleanValue) {
                    ellcVar2.copyOnWrite();
                    elld elldVar = (elld) ellcVar2.instance;
                    elld elldVar2 = elld.a;
                    elldVar.c = 1;
                    elldVar.b = 1 | elldVar.b;
                } else {
                    ellcVar2.copyOnWrite();
                    elld elldVar3 = (elld) ellcVar2.instance;
                    elld elldVar4 = elld.a;
                    elldVar3.c = 2;
                    elldVar3.b = 1 | elldVar3.b;
                }
                return (elld) ellcVar2.build();
            }
        }, bvuwVar.f) : eijx.e((elld) ellcVar.build());
        final eiju eijuVarG = eiju.g(eika.d(eijuVarH).a(new Callable() { // from class: ajaa
            @Override // java.util.concurrent.Callable
            public final Object call() throws Resources.NotFoundException {
                ajat ajatVar = this.a;
                Resources resources = ajatVar.j.getResources();
                String string = resources.getString(R.string.share_typing_status_rcs_pref_key);
                boolean z = resources.getBoolean(R.bool.share_typing_status_rcs_pref_default);
                crqv crqvVar = ajatVar.u;
                boolean zQ = crqvVar.q(string, z);
                boolean zQ2 = crqvVar.q(resources.getString(R.string.send_seen_report_rcs_pref_key), resources.getBoolean(R.bool.send_seen_report_rcs_pref_default));
                elio elioVar = (elio) elip.a.createBuilder();
                elsg elsgVar = (elsg) elsh.a.createBuilder();
                boolean zA = ((apwv) ajatVar.aa.b()).a();
                elsgVar.copyOnWrite();
                elsh elshVar = (elsh) elsgVar.instance;
                elshVar.b |= 256;
                elshVar.j = zA;
                elsgVar.copyOnWrite();
                elsh elshVar2 = (elsh) elsgVar.instance;
                elshVar2.c = enwrVar.N;
                elshVar2.b |= 1;
                int i2 = 3;
                int i3 = true != zQ ? 3 : 2;
                elsgVar.copyOnWrite();
                elsh elshVar3 = (elsh) elsgVar.instance;
                elshVar3.d = i3 - 1;
                elshVar3.b |= 8;
                int i4 = true != zQ2 ? 3 : 2;
                elsgVar.copyOnWrite();
                elsh elshVar4 = (elsh) elsgVar.instance;
                elshVar4.e = i4 - 1;
                elshVar4.b |= 16;
                int i5 = true != crqvVar.q("auto_fallback_rcs", false) ? 5 : 2;
                elsgVar.copyOnWrite();
                elsh elshVar5 = (elsh) elsgVar.instance;
                elshVar5.f = i5 - 1;
                elshVar5.b |= 32;
                elsgVar.copyOnWrite();
                elsh elshVar6 = (elsh) elsgVar.instance;
                elshVar6.g = elsfVar.j;
                elshVar6.b |= 64;
                int iD = ajatVar.z.d();
                if (iD == 0) {
                    i2 = 2;
                } else if (iD != 1) {
                    i2 = 1;
                }
                elsgVar.copyOnWrite();
                elsh elshVar7 = (elsh) elsgVar.instance;
                elshVar7.h = i2 - 1;
                elshVar7.b |= 128;
                elsgVar.copyOnWrite();
                elsh elshVar8 = (elsh) elsgVar.instance;
                evtg evtgVar = elshVar8.i;
                if (!evtgVar.c()) {
                    elshVar8.i = evsn.mutableCopy(evtgVar);
                }
                evpz.addAll(ekhxVar, elshVar8.i);
                elsh elshVar9 = (elsh) elsgVar.build();
                elioVar.copyOnWrite();
                elip elipVar = (elip) elioVar.instance;
                elshVar9.getClass();
                elipVar.c = elshVar9;
                elipVar.b |= 1;
                elso elsoVar = (elso) elsp.a.createBuilder();
                crqx crqxVar = ajatVar.s;
                boolean zF = crqxVar.f();
                elsoVar.copyOnWrite();
                elsp elspVar = (elsp) elsoVar.instance;
                elspVar.b |= 1;
                elspVar.c = zF;
                boolean zH = crqxVar.h();
                elsoVar.copyOnWrite();
                elsp elspVar2 = (elsp) elsoVar.instance;
                elspVar2.b |= 2;
                elspVar2.d = zH;
                boolean zK = crqxVar.k();
                elsoVar.copyOnWrite();
                elsp elspVar3 = (elsp) elsoVar.instance;
                elspVar3.b |= 4;
                elspVar3.e = zK;
                elsp elspVar4 = (elsp) elsoVar.build();
                elioVar.copyOnWrite();
                elip elipVar2 = (elip) elioVar.instance;
                elspVar4.getClass();
                elipVar2.d = elspVar4;
                elipVar2.b |= 2;
                eltr eltrVar = (eltr) elts.a.createBuilder();
                boolean zF2 = crxi.a() ? ((csei) ajatVar.ad.b()).f() : crqxVar.c.a("spam_protection_feature_consent").a();
                eiju eijuVar = eijuVarH;
                eltrVar.copyOnWrite();
                elts eltsVar = (elts) eltrVar.instance;
                eltsVar.b |= 1;
                eltsVar.c = zF2;
                elts eltsVar2 = (elts) eltrVar.build();
                elioVar.copyOnWrite();
                elip elipVar3 = (elip) elioVar.instance;
                eltsVar2.getClass();
                elipVar3.e = eltsVar2;
                elipVar3.b |= 4;
                elld elldVar = (elld) eork.q(eijuVar);
                elioVar.copyOnWrite();
                elip elipVar4 = (elip) elioVar.instance;
                elldVar.getClass();
                elipVar4.g = elldVar;
                elipVar4.b |= 32;
                return elioVar;
            }
        }, this.ag));
        final elqh elqhVar = (elqh) elqj.a.createBuilder();
        int iO = this.n.o("bugle_rcs_not_delivered_channel") - 1;
        int i2 = iO != 0 ? iO != 1 ? 4 : 3 : 2;
        elqhVar.copyOnWrite();
        elqj elqjVar = (elqj) elqhVar.instance;
        elqjVar.d = i2 - 1;
        elqjVar.b |= 1;
        if (czwc.a()) {
            Optional optional = this.ah;
            optional.isPresent();
            final elqd elqdVar = (elqd) elqg.a.createBuilder();
            elqdVar.copyOnWrite();
            elqg elqgVar = (elqg) elqdVar.instance;
            elqgVar.c = 1;
            elqgVar.b = 1 | elqgVar.b;
            eijuVarE = ((clfl) optional.get()).b().h(new ejvr() { // from class: aizv
                @Override // defpackage.ejvr
                public final Object apply(Object obj) {
                    cqce cqceVar = ajat.a;
                    elqh elqhVar2 = elqhVar;
                    elqhVar2.copyOnWrite();
                    elqj elqjVar2 = (elqj) elqhVar2.instance;
                    elqg elqgVar2 = (elqg) elqdVar.build();
                    elqj elqjVar3 = elqj.a;
                    elqgVar2.getClass();
                    elqjVar2.a();
                    elqjVar2.c.add(elqgVar2);
                    return (elqj) elqhVar2.build();
                }
            }, this.E);
        } else {
            eijuVarE = eijx.e((elqj) elqhVar.build());
        }
        return eijuVarE.i(new eooz() { // from class: ajal
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                final elqj elqjVar2 = (elqj) obj;
                cqce cqceVar = ajat.a;
                return eijuVarG.h(new ejvr() { // from class: ajam
                    @Override // defpackage.ejvr
                    public final Object apply(Object obj2) {
                        elio elioVar = (elio) obj2;
                        cqce cqceVar2 = ajat.a;
                        elioVar.copyOnWrite();
                        elip elipVar = (elip) elioVar.instance;
                        elip elipVar2 = elip.a;
                        elqj elqjVar3 = elqjVar2;
                        elqjVar3.getClass();
                        elipVar.f = elqjVar3;
                        elipVar.b |= 16;
                        return (elip) elioVar.build();
                    }
                }, eoqg.a);
            }
        }, this.E);
    }

    public final eltk b(int i2, int i3, int i4, int i5) throws dhkf {
        crny crnyVar = this.m;
        crof crofVarH = crnyVar.h(i2);
        Optional optionalI = crofVarH.i(false);
        elti eltiVar = (elti) eltj.a.createBuilder();
        eltiVar.copyOnWrite();
        eltj eltjVar = (eltj) eltiVar.instance;
        eltjVar.b |= 1;
        eltjVar.c = i2 == i3;
        eltiVar.copyOnWrite();
        eltj eltjVar2 = (eltj) eltiVar.instance;
        eltjVar2.b |= 2;
        eltjVar2.d = i2 == i4;
        eltiVar.copyOnWrite();
        eltj eltjVar3 = (eltj) eltiVar.instance;
        eltjVar3.b |= 4;
        eltjVar3.e = i2 == i5;
        int iF = crnyVar.f();
        eltiVar.copyOnWrite();
        eltj eltjVar4 = (eltj) eltiVar.instance;
        eltjVar4.b |= 8;
        eltjVar4.f = i2 == iF;
        eltj eltjVar5 = (eltj) eltiVar.build();
        boolean zIsPresent = optionalI.isPresent();
        final eltg eltgVar = (eltg) eltk.a.createBuilder();
        eltgVar.copyOnWrite();
        eltk eltkVar = (eltk) eltgVar.instance;
        eltkVar.b |= 1;
        eltkVar.c = i2;
        eltgVar.copyOnWrite();
        eltk eltkVar2 = (eltk) eltgVar.instance;
        eltkVar2.b |= 2;
        eltkVar2.d = zIsPresent;
        int i6 = true != zIsPresent ? 3 : 2;
        eltgVar.copyOnWrite();
        eltk eltkVar3 = (eltk) eltgVar.instance;
        eltkVar3.e = i6 - 1;
        eltkVar3.b |= 4;
        eltgVar.copyOnWrite();
        eltk eltkVar4 = (eltk) eltgVar.instance;
        eltjVar5.getClass();
        eltkVar4.f = eltjVar5;
        eltkVar4.b |= 8;
        enwr enwrVar = ((dggw) this.al.b()).c(i2).a;
        eltgVar.copyOnWrite();
        eltk eltkVar5 = (eltk) eltgVar.instance;
        eltkVar5.j = enwrVar.N;
        eltkVar5.b |= 64;
        if (((Boolean) ((cczi) d.get()).e()).booleanValue()) {
            final String strW = crofVarH.w();
            axem axemVarA = axer.a();
            axemVarA.A("querySubscriptionsInRecurringMetrics");
            axdz[] axdzVarArr = {(axdz) new Function() { // from class: aizo
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo536andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    cqce cqceVar = ajat.a;
                    return ((axdy) obj).c;
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            }.apply(axer.c)};
            int iIntValue = axer.c().intValue();
            if (((Integer) axer.b.getOrDefault(axdzVarArr[0].toString(), -1)).intValue() > iIntValue) {
                dqru.x("columnReference.toString()", iIntValue);
            }
            axemVarA.m(axdzVarArr);
            axemVarA.c(new Function() { // from class: aizp
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo536andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    axeq axeqVar = (axeq) obj;
                    cqce cqceVar = ajat.a;
                    axeqVar.c(strW);
                    return axeqVar;
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
            axemVarA.y(((Integer) f.e()).intValue());
            Map.EL.forEach((HashMap) Collection.EL.stream(axemVarA.b().z()).map(new Function() { // from class: aizq
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo536andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    cqce cqceVar = ajat.a;
                    String strK = ((axdh) obj).k();
                    if (TextUtils.isEmpty(strK)) {
                        return "";
                    }
                    int iIntValue2 = ((Integer) ajat.e.e()).intValue();
                    return strK.length() > iIntValue2 ? strK.substring(strK.length() - iIntValue2) : strK;
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            }).collect(Collectors.groupingBy(Function$CC.identity(), new Supplier() { // from class: aizr
                @Override // java.util.function.Supplier
                public final Object get() {
                    return new HashMap();
                }
            }, Collectors.counting())), new BiConsumer() { // from class: aizs
                @Override // java.util.function.BiConsumer
                public final void accept(Object obj, Object obj2) {
                    Long l = (Long) obj2;
                    cqce cqceVar = ajat.a;
                    boolean zIsEmpty = TextUtils.isEmpty((String) obj);
                    eltg eltgVar2 = eltgVar;
                    if (zIsEmpty) {
                        int iIntValue2 = l.intValue();
                        eltgVar2.copyOnWrite();
                        eltk eltkVar6 = (eltk) eltgVar2.instance;
                        eltk eltkVar7 = eltk.a;
                        eltkVar6.b |= 16;
                        eltkVar6.g = iIntValue2;
                        return;
                    }
                    int iIntValue3 = l.intValue();
                    eltgVar2.copyOnWrite();
                    eltk eltkVar8 = (eltk) eltgVar2.instance;
                    eltk eltkVar9 = eltk.a;
                    evsx evsxVar = eltkVar8.h;
                    if (!evsxVar.c()) {
                        eltkVar8.h = evsn.mutableCopy(evsxVar);
                    }
                    eltkVar8.h.h(iIntValue3);
                }

                public final /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
                    return BiConsumer$CC.$default$andThen(this, biConsumer);
                }
            });
        }
        if (((apsr) this.am.b()).a()) {
            encx encxVar = (encx) encz.a.createBuilder();
            cmmh cmmhVar = (cmmh) ((cmlb) this.ao.b()).i(i2).orElse(null);
            if (cmmhVar == null) {
                encxVar.copyOnWrite();
                encz enczVar = (encz) encxVar.instance;
                enczVar.c = 4;
                enczVar.b |= 1;
                encxVar.copyOnWrite();
                encz enczVar2 = (encz) encxVar.instance;
                enczVar2.d = 4;
                enczVar2.b |= 2;
                encxVar.copyOnWrite();
                encz enczVar3 = (encz) encxVar.instance;
                enczVar3.e = 4;
                enczVar3.b |= 4;
            } else {
                alqm alqmVar = (alqm) ((cefq) this.an.b()).b(new dggp(cmmhVar.c)).orElse(null);
                int iL = l(i2, 1, alqmVar);
                encxVar.copyOnWrite();
                encz enczVar4 = (encz) encxVar.instance;
                enczVar4.c = iL - 1;
                enczVar4.b |= 1;
                int iL2 = l(i2, 3, alqmVar);
                encxVar.copyOnWrite();
                encz enczVar5 = (encz) encxVar.instance;
                enczVar5.d = iL2 - 1;
                enczVar5.b |= 2;
                int iL3 = l(i2, 2, alqmVar);
                encxVar.copyOnWrite();
                encz enczVar6 = (encz) encxVar.instance;
                enczVar6.e = iL3 - 1;
                enczVar6.b |= 4;
            }
            encz enczVar7 = (encz) encxVar.build();
            eltgVar.copyOnWrite();
            eltk eltkVar6 = (eltk) eltgVar.instance;
            enczVar7.getClass();
            eltkVar6.k = enczVar7;
            eltkVar6.b |= 128;
        }
        return (eltk) eltgVar.build();
    }

    public final void c(elud eludVar) {
        autx autxVar = (autx) this.ak.b();
        aumq aumqVarC = ((aurx) this.aj.b()).c();
        int i2 = 1;
        if (!autxVar.b.a() || !autxVar.c.a()) {
            autt auttVarB = autt.b(aumqVarC.f);
            if (auttVarB == null) {
                auttVarB = autt.INITIAL_SYNC_STATUS_NOT_SET;
            }
            switch (auttVarB) {
                case INITIAL_SYNC_STATUS_NOT_SET:
                    i2 = 2;
                    break;
                case RESTORE:
                case RESTORE_KEYS:
                    i2 = 3;
                    break;
                case BACKUP:
                    i2 = 4;
                    break;
                case FAILED:
                case INITIAL_BACKUP_NEEDS_RETRY:
                case RESTORE_MESSAGES_COMPLETE:
                case STARTED:
                    break;
                case COMPLETE:
                    i2 = 5;
                    break;
                default:
                    throw new IllegalArgumentException("unknown enum value: ".concat(String.valueOf(String.valueOf(auttVarB))));
            }
        }
        eludVar.copyOnWrite();
        eluz eluzVar = (eluz) eludVar.instance;
        eluz eluzVar2 = eluz.a;
        eluzVar.ao = i2 - 1;
        eluzVar.d |= 64;
    }

    public final void d(elud eludVar) {
        List listO = this.k.o();
        boolean z = false;
        if (listO != null && !listO.isEmpty()) {
            z = true;
        }
        boolean zAi = ((aurx) this.aj.b()).ai();
        if (z) {
            eludVar.copyOnWrite();
            eluz eluzVar = (eluz) eludVar.instance;
            eluz eluzVar2 = eluz.a;
            eluzVar.an = 2;
            eluzVar.d |= 32;
            return;
        }
        if (zAi) {
            eludVar.copyOnWrite();
            eluz eluzVar3 = (eluz) eludVar.instance;
            eluz eluzVar4 = eluz.a;
            eluzVar3.an = 3;
            eluzVar3.d |= 32;
            return;
        }
        eludVar.copyOnWrite();
        eluz eluzVar5 = (eluz) eludVar.instance;
        eluz eluzVar6 = eluz.a;
        eluzVar5.an = 1;
        eluzVar5.d |= 32;
    }

    public final void e(ekgp ekgpVar, String str) {
        ekqg ekqgVarListIterator = ekgpVar.entrySet().listIterator();
        while (ekqgVarListIterator.hasNext()) {
            Map.Entry entry = (Map.Entry) ekqgVarListIterator.next();
            this.p.h(str, ((Boolean) entry.getValue()).booleanValue() ? 1L : 0L, (String) entry.getKey());
        }
    }

    public final void f(Calendar calendar) {
        cqce cqceVar = a;
        if (cqceVar.t(3)) {
            DateFormat dateTimeInstance = DateFormat.getDateTimeInstance(3, 3);
            cqbd cqbdVarA = cqceVar.a();
            cqbdVarA.I("Scheduling analytics uploader for");
            cqbdVarA.I(dateTimeInstance.format(calendar.getTime()));
            cqbdVarA.r();
        }
        Context context = this.j;
        AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
        if (alarmManager == null) {
            cqceVar.r("Cannot schedule telemetry. AlarmManager is null");
            return;
        }
        aiiw aiiwVarC = aiiw.c(context, AnalyticsAlarmReceiver.class, "android.intent.action.VIEW");
        aiiwVarC.f(context.getPackageName());
        PendingIntent pendingIntentD = ebsn.d(context, 0, aiiwVarC.a(), crag.a(0));
        if (pendingIntentD == null) {
            cqceVar.r("Cannot schedule telemetry. Pending intent is null");
        } else {
            alarmManager.setInexactRepeating(0, calendar.getTimeInMillis(), 86400000L, pendingIntentD);
        }
    }

    public final void g() {
        if (this.o.Y()) {
            Calendar calendar = Calendar.getInstance(DesugarTimeZone.getTimeZone("UTC"));
            Random random = new Random();
            crqv crqvVar = this.u;
            long jE = crqvVar.e("first_analytics_upload_time_in_millis", -1L);
            if (jE == -1) {
                calendar.set(11, 11);
                calendar.add(10, random.nextInt(5));
                calendar.set(12, random.nextInt(60));
                calendar.set(13, random.nextInt(60));
                crqvVar.k("first_analytics_upload_time_in_millis", calendar.getTimeInMillis());
            } else {
                Calendar calendar2 = Calendar.getInstance(DesugarTimeZone.getTimeZone("UTC"));
                calendar2.setTimeInMillis(jE);
                calendar.set(10, calendar2.get(10));
                calendar.set(12, calendar2.get(12));
                calendar.set(13, calendar2.get(13));
            }
            calendar.set(5, Calendar.getInstance(DesugarTimeZone.getTimeZone("UTC")).get(5));
            calendar.add(5, 1);
            f(calendar);
        }
    }

    public final void h(final cldb cldbVar) {
        ListenableFuture listenableFutureA = this.C.a.a();
        ejvr ejvrVar = new ejvr() { // from class: aitx
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                return Long.valueOf(((aith) obj).i);
            }
        };
        eoqg eoqgVar = eoqg.a;
        eiju eijuVarH = eiju.g(eika.j(listenableFutureA, ejvrVar, eoqgVar)).h(new ejvr() { // from class: aizz
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                Long l = (Long) obj;
                long jLongValue = l.longValue();
                Calendar calendar = Calendar.getInstance(DesugarTimeZone.getTimeZone("UTC"));
                calendar.setTimeInMillis(jLongValue);
                Calendar calendar2 = Calendar.getInstance(DesugarTimeZone.getTimeZone("UTC"));
                int i2 = calendar.get(0);
                int i3 = calendar2.get(0);
                ajat ajatVar = this.a;
                if (i2 != i3 || calendar.get(1) != calendar2.get(1) || calendar.get(6) != calendar2.get(6)) {
                    ((ayds) ajatVar.H.b()).a().q(cldbVar);
                    ajat.a.m("Recurring telemetry upload launched.");
                    return null;
                }
                long jLongValue2 = (l.longValue() + ajat.i) - ajatVar.w.f().toEpochMilli();
                cqbd cqbdVarD = ajat.a.d();
                cqbdVarD.I("Recurring telemetry won't run; already updated today, scheduled in");
                cqbdVarD.H(jLongValue2);
                cqbdVarD.I("ms");
                cqbdVarD.r();
                return null;
            }
        }, eoqgVar);
        cldbVar.q("RecurringTelemetryUploader", eijuVarH);
        cqnx.c(eijuVarH, "BugleUsageStatistics", "Failed to log recurring telemetry");
    }

    public final int i() {
        Optional optional = this.ai;
        optional.isPresent();
        return ((crah) optional.get()).b() ? 2 : 3;
    }

    public final int j() {
        return this.af.g() ? 4 : 3;
    }
}
