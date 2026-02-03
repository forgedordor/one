package defpackage;

import android.app.NotificationChannel;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.net.Uri;
import android.telephony.TelephonyManager;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.URLSpan;
import android.text.util.Linkify;
import android.util.LruCache;
import com.android.vcard.VCardConfig;
import com.google.android.apps.messaging.shared.api.messaging.selfidentity.SelfIdentityId;
import com.google.android.apps.messaging.shared.datamodel.data.MessageData;
import com.google.android.apps.messaging.shared.datamodel.data.common.DeviceData;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.common.statsdata.MessageUsageStatisticsData;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import com.google.android.ims.provisioning.config.ImsConfiguration;
import com.google.common.util.concurrent.ListenableFuture;
import j$.time.Instant;
import j$.util.Collection;
import j$.util.DesugarArrays;
import j$.util.Optional;
import j$.util.concurrent.ConcurrentHashMap;
import j$.util.concurrent.ThreadLocalRandom;
import j$.util.function.Consumer$CC;
import j$.util.function.Function$CC;
import j$.util.stream.Collectors;
import j$.util.stream.Stream;
import java.util.ArrayList;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ajjf implements ajhd {
    static final cczv f = cdag.f(cdag.b, "compose_duration_logging_cap_millis", TimeUnit.SECONDS.toMillis(120));
    static final cczv g = cdag.h(cdag.b, "disable_logging_bugle_telephony_event", true);
    public static final long h = TimeUnit.DAYS.toMillis(1);
    public static final cqce i = cqce.g("BugleUsageStatistics", "UsageStatistics");
    public static final ekrg j = ekrg.c("com/google/android/apps/messaging/shared/analytics/statistics/UsageStatisticsImpl");
    public final Executor A;
    public eiju B;
    public final eygg D;
    public final asrf E;
    public final fcsu F;
    public final fcsu G;
    public final ajjt H;
    public final fcsu I;
    public final fcsu J;
    public final fcsu K;
    public final fcsu L;
    public final fcsu M;
    public final fcsu N;
    private final fcsu O;
    private final fcsu P;
    private final fcsu Q;
    private final fcsu R;
    private final fcsu S;
    private final fcsu T;
    private final fcsu U;
    private final fcsu V;
    private final fcsu W;
    private final fcsu X;
    private final fcsu Y;
    private final fcsu Z;
    private final fcsu aa;
    private final eygg ab;
    private final eosc ac;
    private final fcsu ad;
    private final Context ae;
    private fcsu af;
    private final eigp ag;
    private final fcsu ah;
    private final aqbh ai;
    private final fcsu aj;
    private final fcsu ak;
    private final fcsu al;
    private final fcsu am;
    private final fcsu an;
    public final fcsu l;
    public final fcsu m;
    public final fcsu n;
    public final fcsu o;
    public final fcsu p;
    public final fcsu q;
    public final eygg r;
    public final eygg s;
    public final cogw t;
    public final fcsu u;
    public aill v;
    public aimb w;
    public final eygg y;
    public final eosc z;
    public final LruCache k = new LruCache(10);
    public final AtomicBoolean x = new AtomicBoolean(false);
    public final ajfn C = new ajfn();

    public ajjf(fcsu fcsuVar, Context context, fcsu fcsuVar2, fcsu fcsuVar3, fcsu fcsuVar4, fcsu fcsuVar5, fcsu fcsuVar6, fcsu fcsuVar7, fcsu fcsuVar8, fcsu fcsuVar9, fcsu fcsuVar10, fcsu fcsuVar11, fcsu fcsuVar12, fcsu fcsuVar13, fcsu fcsuVar14, fcsu fcsuVar15, fcsu fcsuVar16, fcsu fcsuVar17, eygg eyggVar, eygg eyggVar2, fcsu fcsuVar18, fcsu fcsuVar19, fcsu fcsuVar20, fcsu fcsuVar21, eygg eyggVar3, cogw cogwVar, fcsu fcsuVar22, eygg eyggVar4, eosc eoscVar, eosc eoscVar2, eigp eigpVar, eygg eyggVar5, asrf asrfVar, fcsu fcsuVar23, fcsu fcsuVar24, fcsu fcsuVar25, ajjt ajjtVar, fcsu fcsuVar26, aqbh aqbhVar, fcsu fcsuVar27, fcsu fcsuVar28, fcsu fcsuVar29, fcsu fcsuVar30, fcsu fcsuVar31, fcsu fcsuVar32, fcsu fcsuVar33, fcsu fcsuVar34, fcsu fcsuVar35, fcsu fcsuVar36) {
        this.al = fcsuVar;
        this.ae = context;
        this.O = fcsuVar2;
        this.l = fcsuVar3;
        this.m = fcsuVar4;
        this.P = fcsuVar5;
        this.n = fcsuVar6;
        this.Q = fcsuVar7;
        this.T = fcsuVar10;
        this.R = fcsuVar8;
        this.S = fcsuVar9;
        this.U = fcsuVar11;
        this.af = fcsuVar12;
        this.V = fcsuVar13;
        this.W = fcsuVar14;
        this.o = fcsuVar15;
        this.p = fcsuVar16;
        this.q = fcsuVar17;
        this.r = eyggVar;
        this.s = eyggVar2;
        this.X = fcsuVar18;
        this.Y = fcsuVar19;
        this.Z = fcsuVar20;
        this.aa = fcsuVar21;
        this.ab = eyggVar3;
        this.t = cogwVar;
        this.u = fcsuVar22;
        this.y = eyggVar4;
        this.z = eoscVar;
        this.ac = eoscVar2;
        this.ag = eigpVar;
        this.D = eyggVar5;
        this.E = asrfVar;
        this.F = fcsuVar23;
        this.G = fcsuVar24;
        this.A = new eoss(eoscVar);
        this.ad = fcsuVar25;
        this.H = ajjtVar;
        this.ah = fcsuVar26;
        this.ai = aqbhVar;
        this.I = fcsuVar27;
        this.J = fcsuVar28;
        this.aj = fcsuVar29;
        this.ak = fcsuVar30;
        this.K = fcsuVar31;
        this.am = fcsuVar32;
        this.L = fcsuVar33;
        this.M = fcsuVar34;
        this.an = fcsuVar36;
        this.N = fcsuVar35;
    }

    public static void aD(elof elofVar, MessageCoreData messageCoreData) {
        if (messageCoreData.cB() && messageCoreData.F().k() && messageCoreData.E().k() && !messageCoreData.F().equals(messageCoreData.E())) {
            String strF = messageCoreData.E().f();
            elofVar.copyOnWrite();
            elpg elpgVar = (elpg) elofVar.instance;
            evsy evsyVar = elpg.a;
            elpgVar.d |= 32768;
            elpgVar.R = strF;
        }
    }

    public static final elpv aF(elpt elptVar, int i2, int i3, int i4, int i5) {
        elpu elpuVar = (elpu) elpv.a.createBuilder();
        elpuVar.copyOnWrite();
        elpv elpvVar = (elpv) elpuVar.instance;
        elpvVar.c = elptVar.j;
        elpvVar.b |= 1;
        elpuVar.copyOnWrite();
        elpv elpvVar2 = (elpv) elpuVar.instance;
        elpvVar2.b |= 2;
        elpvVar2.d = i2;
        elpuVar.copyOnWrite();
        elpv elpvVar3 = (elpv) elpuVar.instance;
        elpvVar3.b |= 32;
        elpvVar3.e = i4;
        elis elisVar = (elis) elit.a.createBuilder();
        elisVar.copyOnWrite();
        elit elitVar = (elit) elisVar.instance;
        elitVar.b |= 1;
        elitVar.c = i3;
        elpuVar.copyOnWrite();
        elpv elpvVar4 = (elpv) elpuVar.instance;
        elit elitVar2 = (elit) elisVar.build();
        elitVar2.getClass();
        elpvVar4.f = elitVar2;
        elpvVar4.b |= 64;
        elpuVar.copyOnWrite();
        elpv elpvVar5 = (elpv) elpuVar.instance;
        elpvVar5.b |= 128;
        elpvVar5.g = i5;
        return (elpv) elpuVar.build();
    }

    private final eltp aL(int i2) {
        TelephonyManager telephonyManagerCreateForSubscriptionId = (TelephonyManager) this.ae.getSystemService("phone");
        if (telephonyManagerCreateForSubscriptionId != null) {
            telephonyManagerCreateForSubscriptionId = telephonyManagerCreateForSubscriptionId.createForSubscriptionId(i2);
        }
        return telephonyManagerCreateForSubscriptionId != null ? (eltp) Optional.ofNullable(eltp.b(telephonyManagerCreateForSubscriptionId.getPhoneType())).orElse(eltp.PHONE_TYPE_NONE) : eltp.PHONE_TYPE_NONE;
    }

    private final void aM(MessageCoreData messageCoreData, elny elnyVar) {
        bajf bajfVarA;
        if (!messageCoreData.z().t() && (bajfVarA = ((bapl) this.P.b()).a(messageCoreData.A())) != null) {
            messageCoreData.bE(bajfVarA.h(elnyVar, null, messageCoreData.o()));
        }
        this.C.f(messageCoreData);
    }

    private final void aN(MessageCoreData messageCoreData, elpj elpjVar) {
        ellg ellgVar = (ellg) ellh.a.createBuilder();
        elof elofVar = (elof) elpg.b.createBuilder();
        long jB = ((aika) this.p.b()).b(messageCoreData.A());
        elofVar.copyOnWrite();
        elpg elpgVar = (elpg) elofVar.instance;
        elpgVar.c |= 1073741824;
        elpgVar.G = jB;
        long j2 = elpjVar.d;
        elofVar.copyOnWrite();
        elpg elpgVar2 = (elpg) elofVar.instance;
        elpgVar2.c |= 128;
        elpgVar2.o = j2;
        elvg elvgVar = cqbe.a;
        elofVar.copyOnWrite();
        elpg elpgVar3 = (elpg) elofVar.instance;
        elpgVar3.L = elvgVar.x;
        elpgVar3.d |= 512;
        ellgVar.copyOnWrite();
        ellh ellhVar = (ellh) ellgVar.instance;
        elpg elpgVar4 = (elpg) elofVar.build();
        elpgVar4.getClass();
        ellhVar.l = elpgVar4;
        ellhVar.b |= 4;
        ellf ellfVar = ellf.BUGLE_ANNOTATION;
        ellgVar.copyOnWrite();
        ellh ellhVar2 = (ellh) ellgVar.instance;
        ellhVar2.j = ellfVar.f11do;
        ellhVar2.b |= 1;
        ellgVar.copyOnWrite();
        ellh ellhVar3 = (ellh) ellgVar.instance;
        elpjVar.getClass();
        ellhVar3.y = elpjVar;
        ellhVar3.b |= 262144;
        this.v.j(ellgVar);
    }

    private final void aO(final elkh elkhVar, final ConversationIdType conversationIdType) {
        auvh.h(((ajjo) this.G.b()).a(-1).h(new ejvr() { // from class: ajiu
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                eltf eltfVar = (eltf) obj;
                final ajjf ajjfVar = this.a;
                long jB = ((aika) ajjfVar.p.b()).b(conversationIdType);
                elkh elkhVar2 = elkhVar;
                elkhVar2.copyOnWrite();
                elki elkiVar = (elki) elkhVar2.instance;
                elki elkiVar2 = elki.a;
                elkiVar.b |= 65536;
                elkiVar.r = jB;
                elkhVar2.copyOnWrite();
                elki elkiVar3 = (elki) elkhVar2.instance;
                eltfVar.getClass();
                elkiVar3.y = eltfVar;
                elkiVar3.b |= 16777216;
                elki elkiVar4 = (elki) elkhVar2.build();
                final ellg ellgVar = (ellg) ellh.a.createBuilder();
                ellf ellfVar = ellf.BUGLE_CONVERSATION_LATCH_STATUS_CHANGE;
                ellgVar.copyOnWrite();
                ellh ellhVar = (ellh) ellgVar.instance;
                ellhVar.j = ellfVar.f11do;
                ellhVar.b |= 1;
                ellgVar.copyOnWrite();
                ellh ellhVar2 = (ellh) ellgVar.instance;
                elkiVar4.getClass();
                ellhVar2.m = elkiVar4;
                ellhVar2.b |= 8;
                elvt elvtVar = (elvt) elvv.a.createBuilder();
                int iD = ajjfVar.d();
                elvtVar.copyOnWrite();
                elvv elvvVar = (elvv) elvtVar.instance;
                elvvVar.b |= 1;
                elvvVar.c = iD;
                String strE = ((ajjo) ajjfVar.G.b()).e();
                elvtVar.copyOnWrite();
                elvv elvvVar2 = (elvv) elvtVar.instance;
                strE.getClass();
                elvvVar2.b |= 4;
                elvvVar2.e = strE;
                final elvv elvvVar3 = (elvv) elvtVar.build();
                final elud eludVar = (elud) eluz.a.createBuilder();
                fcsu fcsuVar = ajjfVar.F;
                final eiju eijuVarA = ((cdku) fcsuVar.b()).a();
                final eiju eijuVarB = ((cdku) fcsuVar.b()).b();
                eijw eijwVarM = eijx.m(eijuVarA, eijuVarB);
                Callable callable = new Callable() { // from class: ajjd
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        long j2 = ajjf.h;
                        elzt elztVar = (elzt) elzv.a.createBuilder();
                        int i2 = true != ((Boolean) eork.q(eijuVarA)).booleanValue() ? 2 : 3;
                        elztVar.copyOnWrite();
                        elzv elzvVar = (elzv) elztVar.instance;
                        elzvVar.c = i2 - 1;
                        elzvVar.b |= 1;
                        long jLongValue = ((Long) eork.q(eijuVarB)).longValue();
                        elztVar.copyOnWrite();
                        elzv elzvVar2 = (elzv) elztVar.instance;
                        elzvVar2.b = 2 | elzvVar2.b;
                        elzvVar2.d = jLongValue;
                        elud eludVar2 = eludVar;
                        eludVar2.copyOnWrite();
                        eluz eluzVar = (eluz) eludVar2.instance;
                        elzv elzvVar3 = (elzv) elztVar.build();
                        eluz eluzVar2 = eluz.a;
                        elzvVar3.getClass();
                        eluzVar.am = elzvVar3;
                        eluzVar.d |= 8;
                        return eludVar2;
                    }
                };
                eoqg eoqgVar = eoqg.a;
                auvh.h(eijwVarM.a(callable, eoqgVar).h(new ejvr() { // from class: ajiq
                    @Override // defpackage.ejvr
                    public final Object apply(Object obj2) {
                        elud eludVar2 = (elud) obj2;
                        eludVar2.copyOnWrite();
                        eluz eluzVar = (eluz) eludVar2.instance;
                        eluz eluzVar2 = eluz.a;
                        elvv elvvVar4 = elvvVar3;
                        elvvVar4.getClass();
                        eluzVar.z = elvvVar4;
                        eluzVar.b |= VCardConfig.FLAG_REFRAIN_PHONE_NUMBER_FORMATTING;
                        eluz eluzVar3 = (eluz) eludVar2.build();
                        ellg ellgVar2 = ellgVar;
                        ellgVar2.copyOnWrite();
                        ellh ellhVar3 = (ellh) ellgVar2.instance;
                        ellh ellhVar4 = ellh.a;
                        eluzVar3.getClass();
                        ellhVar3.q = eluzVar3;
                        ellhVar3.b |= 256;
                        ajjfVar.v.j(ellgVar2);
                        return null;
                    }
                }, eoqgVar));
                return null;
            }
        }, this.z));
    }

    private final void aP(int i2, int i3, int i4, long j2, int i5, int i6, long j3, boolean z, ConversationIdType conversationIdType) {
        if (!this.x.get()) {
            n();
            return;
        }
        elvt elvtVar = (elvt) elvv.a.createBuilder();
        int iD = d();
        elvtVar.copyOnWrite();
        elvv elvvVar = (elvv) elvtVar.instance;
        elvvVar.b |= 1;
        elvvVar.c = iD;
        fcsu fcsuVar = this.G;
        String strE = ((ajjo) fcsuVar.b()).e();
        elvtVar.copyOnWrite();
        elvv elvvVar2 = (elvv) elvtVar.instance;
        strE.getClass();
        elvvVar2.b |= 4;
        elvvVar2.e = strE;
        elvv elvvVar3 = (elvv) elvtVar.build();
        elho elhoVarB = ((aixn) this.q.b()).b(i2);
        elpt elptVarB = ajhe.b(i3);
        elpg elpgVar = elpg.b;
        elof elofVar = (elof) elpgVar.createBuilder();
        long jB = ((aika) this.p.b()).b(conversationIdType);
        elofVar.copyOnWrite();
        elpg elpgVar2 = (elpg) elofVar.instance;
        elpgVar2.c |= 1073741824;
        elpgVar2.G = jB;
        elofVar.copyOnWrite();
        elpg elpgVar3 = (elpg) elofVar.instance;
        elpgVar3.c |= 128;
        elpgVar3.o = j2;
        elofVar.copyOnWrite();
        elpg elpgVar4 = (elpg) elofVar.instance;
        elpgVar4.h = 2;
        elpgVar4.c |= 1;
        elofVar.copyOnWrite();
        elpg elpgVar5 = (elpg) elofVar.instance;
        elpgVar5.i = 6;
        elpgVar5.c = 2 | elpgVar5.c;
        elpy elpyVarA = ((aimw) this.r.b()).a(i2);
        elofVar.copyOnWrite();
        elpg elpgVar6 = (elpg) elofVar.instance;
        elpgVar6.j = elpyVarA;
        elpgVar6.c |= 4;
        elofVar.copyOnWrite();
        elpg elpgVar7 = (elpg) elofVar.instance;
        elpgVar7.d |= 1;
        elpgVar7.J = "NOT_AVAILABLE";
        elofVar.copyOnWrite();
        elpg elpgVar8 = (elpg) elofVar.instance;
        elvvVar3.getClass();
        elpgVar8.y = elvvVar3;
        elpgVar8.c |= 4194304;
        elpv elpvVarAF = aF(elptVarB, i4, i3, i6, 0);
        elofVar.copyOnWrite();
        elpg elpgVar9 = (elpg) elofVar.instance;
        elpvVarAF.getClass();
        elpgVar9.g = elpvVarAF;
        elpgVar9.f = 7;
        elofVar.copyOnWrite();
        elpg elpgVar10 = (elpg) elofVar.instance;
        elhoVarB.getClass();
        elpgVar10.S = elhoVarB;
        elpgVar10.d |= 65536;
        elvg elvgVar = cqbe.a;
        elofVar.copyOnWrite();
        elpg elpgVar11 = (elpg) elofVar.instance;
        elpgVar11.L = elvgVar.x;
        elpgVar11.d |= 512;
        ((ajjo) fcsuVar.b()).l(elofVar, 3, 7, i2);
        if (((aquo) this.L.b()).a()) {
            ((ccww) this.M.b()).b(elofVar, conversationIdType);
        }
        ellg ellgVar = (ellg) ellh.a.createBuilder();
        ellf ellfVar = ellf.BUGLE_MESSAGE;
        ellgVar.copyOnWrite();
        ellh ellhVar = (ellh) ellgVar.instance;
        ellhVar.j = ellfVar.f11do;
        ellhVar.b |= 1;
        ellgVar.copyOnWrite();
        ellh ellhVar2 = (ellh) ellgVar.instance;
        elpg elpgVar12 = (elpg) elofVar.build();
        elpgVar12.getClass();
        ellhVar2.l = elpgVar12;
        ellhVar2.b |= 4;
        elpg elpgVar13 = ((ellh) ellgVar.instance).l;
        if (elpgVar13 != null) {
            elpgVar = elpgVar13;
        }
        aR(elpgVar.f == 7 ? (elpv) elpgVar.g : elpv.a, i4, elhoVarB);
        this.w.a().j(ellgVar, aioj.LOG_SPEC_MESSAGE_DELIVERY_NORTHSTAR_EVENTS);
        if (z || i5 != 106) {
            return;
        }
        aC(j3, "Bugle.Download.Failure.Attachment.Size.Bucket.Mms");
        ((ains) this.U.b()).c("Bugle.DataModel.Action.Download.Failure.Count.Mms");
    }

    private final void aQ(MessageCoreData messageCoreData, elij elijVar, boolean z) {
        elph elphVar = (elph) elpj.a.createBuilder();
        if (z) {
            long jT = messageCoreData.t();
            elphVar.copyOnWrite();
            elpj elpjVar = (elpj) elphVar.instance;
            elpjVar.b |= 2;
            elpjVar.d = jT;
            elphVar.copyOnWrite();
            elpj elpjVar2 = (elpj) elphVar.instance;
            elpjVar2.c = 3;
            elpjVar2.b = 1 | elpjVar2.b;
            elphVar.copyOnWrite();
            elpj elpjVar3 = (elpj) elphVar.instance;
            elijVar.getClass();
            elpjVar3.g = elijVar;
            elpjVar3.b |= 16;
        } else {
            long jT2 = messageCoreData.t();
            elphVar.copyOnWrite();
            elpj elpjVar4 = (elpj) elphVar.instance;
            elpjVar4.b |= 2;
            elpjVar4.d = jT2;
            elphVar.copyOnWrite();
            elpj elpjVar5 = (elpj) elphVar.instance;
            elpjVar5.c = 1;
            elpjVar5.b = 1 | elpjVar5.b;
            elphVar.copyOnWrite();
            elpj elpjVar6 = (elpj) elphVar.instance;
            elijVar.getClass();
            elpjVar6.e = elijVar;
            elpjVar6.b |= 4;
        }
        aN(messageCoreData, (elpj) elphVar.build());
    }

    private static void aR(elpv elpvVar, int i2, elho elhoVar) {
        cqbd cqbdVarA = i.a();
        cqbdVarA.I("MMS failed.");
        elpt elptVarB = elpt.b(elpvVar.c);
        if (elptVarB == null) {
            elptVarB = elpt.UNKNOWN_BUGLE_MMS_FAILURE_CODE;
        }
        cqbdVarA.A("failureCode", elptVarB);
        cqbdVarA.y("httpStatusCode", i2);
        cqbdVarA.r();
        elit elitVar = elpvVar.f;
        if (elitVar == null) {
            elitVar = elit.a;
        }
        aV(elitVar);
        aS(elhoVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0066  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void aS(defpackage.elho r7) {
        /*
            cqce r0 = defpackage.ajjf.i
            cqbd r0 = r0.a()
            java.lang.String r1 = "Network details."
            r0.I(r1)
            int r1 = r7.d
            int r1 = defpackage.elhm.a(r1)
            r2 = 4
            r3 = 3
            r4 = 2
            r5 = 1
            if (r1 != 0) goto L18
            goto L2c
        L18:
            if (r1 == r5) goto L2c
            if (r1 == r4) goto L29
            if (r1 == r3) goto L26
            if (r1 == r2) goto L23
            java.lang.String r1 = "TYPE_OTHER"
            goto L2e
        L23:
            java.lang.String r1 = "TYPE_WIMAX"
            goto L2e
        L26:
            java.lang.String r1 = "TYPE_WIFI"
            goto L2e
        L29:
            java.lang.String r1 = "TYPE_MOBILE_DATA"
            goto L2e
        L2c:
            java.lang.String r1 = "TYPE_UNKNOWN"
        L2e:
            java.lang.String r6 = "networkType"
            r0.A(r6, r1)
            int r1 = r7.e
            int r1 = defpackage.elhi.a(r1)
            if (r1 != 0) goto L3c
            goto L66
        L3c:
            switch(r1) {
                case 1: goto L66;
                case 2: goto L63;
                case 3: goto L60;
                case 4: goto L5d;
                case 5: goto L5a;
                case 6: goto L57;
                case 7: goto L54;
                case 8: goto L51;
                case 9: goto L4e;
                case 10: goto L4b;
                case 11: goto L48;
                case 12: goto L45;
                case 13: goto L42;
                default: goto L3f;
            }
        L3f:
            java.lang.String r1 = "STATE_VERIFYING_POOR_LINK"
            goto L68
        L42:
            java.lang.String r1 = "STATE_SUSPENDED"
            goto L68
        L45:
            java.lang.String r1 = "STATE_SCANNING"
            goto L68
        L48:
            java.lang.String r1 = "STATE_OBTAINING_IPADDR"
            goto L68
        L4b:
            java.lang.String r1 = "STATE_IDLE"
            goto L68
        L4e:
            java.lang.String r1 = "STATE_FAILED"
            goto L68
        L51:
            java.lang.String r1 = "STATE_DISCONNECTING"
            goto L68
        L54:
            java.lang.String r1 = "STATE_DISCONNECTED"
            goto L68
        L57:
            java.lang.String r1 = "STATE_CONNECTING"
            goto L68
        L5a:
            java.lang.String r1 = "STATE_CONNECTED"
            goto L68
        L5d:
            java.lang.String r1 = "STATE_CAPTIVE_PORTAL_CHECK"
            goto L68
        L60:
            java.lang.String r1 = "STATE_BLOCKED"
            goto L68
        L63:
            java.lang.String r1 = "STATE_AUTHENTICATING"
            goto L68
        L66:
            java.lang.String r1 = "STATE_UNKNOWN"
        L68:
            java.lang.String r6 = "detailedState"
            r0.A(r6, r1)
            boolean r1 = r7.f
            java.lang.String r6 = "isRoaming"
            r0.B(r6, r1)
            int r1 = r7.g
            int r1 = defpackage.emkc.a(r1)
            if (r1 != 0) goto L7d
            goto L97
        L7d:
            if (r1 == r5) goto L97
            if (r1 == r4) goto L94
            if (r1 == r3) goto L91
            if (r1 == r2) goto L8e
            r2 = 6
            if (r1 == r2) goto L8b
            java.lang.String r1 = "SIGNAL_STRENGTH_GREAT"
            goto L99
        L8b:
            java.lang.String r1 = "SIGNAL_STRENGTH_NONE_OR_UNKNOWN"
            goto L99
        L8e:
            java.lang.String r1 = "SIGNAL_STRENGTH_GOOD"
            goto L99
        L91:
            java.lang.String r1 = "SIGNAL_STRENGTH_MODERATE"
            goto L99
        L94:
            java.lang.String r1 = "SIGNAL_STRENGTH_POOR"
            goto L99
        L97:
            java.lang.String r1 = "UNKNOWN_SIGNAL_STRENGTH"
        L99:
            java.lang.String r2 = "signalStrength"
            r0.A(r2, r1)
            boolean r1 = r7.h
            java.lang.String r2 = "airplaneModeOn"
            r0.B(r2, r1)
            boolean r7 = r7.i
            java.lang.String r1 = "mobileDataEnabled"
            r0.B(r1, r7)
            r0.r()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ajjf.aS(elho):void");
    }

    private final void aT(int i2, MessageCoreData messageCoreData) {
        boolean zCS = messageCoreData.cS();
        if (messageCoreData.cX() && !((dggw) this.ah.b()).w(i2)) {
            if (i2 == -1) {
                ekrw ekrwVarJ = j.j();
                ekrwVarJ.X(eksq.a, "BugleUsageStatistics");
                ekrd ekrdVar = (ekrd) ekrwVarJ;
                ekrdVar.Z(eksk.MEDIUM);
                ((ekrd) ekrdVar.h("com/google/android/apps/messaging/shared/analytics/statistics/UsageStatisticsImpl", "logRcsSubIdMismatchIfExists", 3214, "UsageStatisticsImpl.java")).t("DEFAULT_SUB_ID used during RCS Message %s", new esvh(esvg.NO_USER_DATA, true != zCS ? "receive" : "send"));
            } else {
                ((ains) this.U.b()).c("Bugle.Multisim.ProvisionedSubIdAndMessageIdMismatch.Count");
            }
        }
        if (messageCoreData.cX()) {
            axcy axcyVarE = ((bbdl) this.Z.b()).e(messageCoreData.v());
            if (axcyVarE == null) {
                ekrw ekrwVarJ2 = j.j();
                ekrwVarJ2.X(eksq.a, "BugleUsageStatistics");
                ekrd ekrdVar2 = (ekrd) ekrwVarJ2;
                ekrdVar2.Z(eksk.MEDIUM);
                ((ekrd) ekrdVar2.h("com/google/android/apps/messaging/shared/analytics/statistics/UsageStatisticsImpl", "shouldLogMismatch", 3273, "UsageStatisticsImpl.java")).q("Message subscription is null");
                return;
            }
            int iE = axcyVarE.e();
            if (axcyVarE.e() < 0) {
                ekrw ekrwVarJ3 = j.j();
                ekrwVarJ3.X(eksq.a, "BugleUsageStatistics");
                ekrd ekrdVar3 = (ekrd) ekrwVarJ3;
                ekrdVar3.Z(eksk.MEDIUM);
                ((ekrd) ekrdVar3.h("com/google/android/apps/messaging/shared/analytics/statistics/UsageStatisticsImpl", "isValidSubscription", 3262, "UsageStatisticsImpl.java")).q("Message subId is invalid");
                ((ains) this.U.b()).c("Bugle.Multisim.ProvisionedSubIdInvalid.Count");
                return;
            }
            if (((dggw) this.ah.b()).w(iE)) {
                return;
            }
            ((ains) this.U.b()).c(true != zCS ? "Bugle.Multisim.ProvisionedSubIdAndMessageIdMismatchDuringReceive.Count" : "Bugle.Multisim.ProvisionedSubIdAndMessageIdMismatchDuringSend.Count");
            ekrw ekrwVarJ4 = j.j();
            ekrwVarJ4.X(eksq.a, "BugleUsageStatistics");
            ekrd ekrdVar4 = (ekrd) ekrwVarJ4;
            ekrdVar4.Z(eksk.MEDIUM);
            ((ekrd) ekrdVar4.h("com/google/android/apps/messaging/shared/analytics/statistics/UsageStatisticsImpl", "logRcsSubIdMismatchIfExists", 3231, "UsageStatisticsImpl.java")).t("Message subId and the sender subId is mismatched for RCS Message %s", new esvh(esvg.NO_USER_DATA, true == zCS ? "send" : "receive"));
        }
    }

    private static void aU(eltq eltqVar, elho elhoVar) {
        cqbd cqbdVarA = i.a();
        cqbdVarA.I("SMS failed.");
        cqbdVarA.y("errorCode", eltqVar.c);
        eltp eltpVarB = eltp.b(eltqVar.e);
        if (eltpVarB == null) {
            eltpVarB = eltp.PHONE_TYPE_NONE;
        }
        cqbdVarA.A("phoneType", eltpVarB);
        cqbdVarA.r();
        elit elitVar = eltqVar.d;
        if (elitVar == null) {
            elitVar = elit.a;
        }
        aV(elitVar);
        aS(elhoVar);
    }

    private static void aV(elit elitVar) {
        cqbd cqbdVarA = i.a();
        cqbdVarA.I("XMS common failed details.");
        cqbdVarA.y("resultCode", elitVar.c);
        cqbdVarA.r();
    }

    @Deprecated
    private final void aW(String str, int i2, String str2, int i3, String str3, bvdz bvdzVar) {
        ekgb ekgbVar;
        alqm alqmVarU = ((alrj) this.Q.b()).u(str, i2);
        if (!this.x.get()) {
            n();
            return;
        }
        String[] strArr = cdsc.a;
        if (TextUtils.isEmpty(str3)) {
            int i4 = ekgb.d;
            ekgbVar = ekoe.a;
        } else {
            SpannableString spannableStringValueOf = SpannableString.valueOf(str3);
            if (Linkify.addLinks(spannableStringValueOf, 7)) {
                Stream map = DesugarArrays.stream((URLSpan[]) spannableStringValueOf.getSpans(0, spannableStringValueOf.length(), URLSpan.class)).map(new Function() { // from class: cdry
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo536andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        URLSpan uRLSpan = (URLSpan) obj;
                        String[] strArr2 = cdsc.a;
                        return uRLSpan.getURL().startsWith("tel:") ? cdrw.PHONE_NUMBER : uRLSpan.getURL().startsWith("mailto:") ? cdrw.EMAIL_ADDRESS : cdrw.WEB_URL;
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                });
                int i5 = ekgb.d;
                ekgbVar = (ekgb) map.collect(ekcv.a);
            } else {
                int i6 = ekgb.d;
                ekgbVar = ekoe.a;
            }
        }
        ekgb ekgbVarG = ((ekhx) Collection.EL.stream(ekgbVar).map(new Function() { // from class: ajhj
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                long j2 = ajjf.h;
                return (elvk) ekgp.n(cdrw.PHONE_NUMBER, elvk.PHONE_NUMBER, cdrw.EMAIL_ADDRESS, elvk.EMAIL_ADDRESS, cdrw.WEB_URL, elvk.WEB_URL).getOrDefault((cdrw) obj, elvk.UNKNOWN);
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).collect(ekcv.b)).g();
        elvi elviVar = (elvi) elvl.a.createBuilder();
        bvdz bvdzVar2 = bvdz.VERIFICATION_VERIFIED;
        elvb elvbVar = elvb.VERIFIED;
        elvb elvbVar2 = (elvb) ekgp.o(bvdzVar2, elvbVar, bvdz.VERIFICATION_UNVERIFIED, elvb.UNVERIFIED, bvdz.VERIFICATION_NA, elvb.NA, bvdz.VERIFICATION_IN_PROGRESS, elvb.NOT_YET_VERIFIED).getOrDefault(bvdzVar, elvb.UNKNOWN);
        if (alqmVarU.n() != null) {
            String strB = ejwk.b(alqmVarU.n());
            if (elvbVar != elvbVar2) {
                strB = "pii(" + strB.length() + ")";
            }
            elviVar.copyOnWrite();
            elvl elvlVar = (elvl) elviVar.instance;
            elvlVar.b |= 1;
            elvlVar.c = strB;
        }
        elviVar.copyOnWrite();
        elvl elvlVar2 = (elvl) elviVar.instance;
        elvlVar2.e = elvbVar2.g;
        elvlVar2.b |= 4;
        long jC = ((aika) this.p.b()).c(str2);
        elviVar.copyOnWrite();
        elvl elvlVar3 = (elvl) elviVar.instance;
        elvlVar3.b |= 8;
        elvlVar3.f = jC;
        elpy elpyVarA = ((aimw) this.r.b()).a(i2);
        elviVar.copyOnWrite();
        elvl elvlVar4 = (elvl) elviVar.instance;
        elvlVar4.d = elpyVarA;
        elvlVar4.b |= 2;
        elviVar.copyOnWrite();
        elvl elvlVar5 = (elvl) elviVar.instance;
        evsx evsxVar = elvlVar5.g;
        if (!evsxVar.c()) {
            elvlVar5.g = evsn.mutableCopy(evsxVar);
        }
        Iterator<E> it = ekgbVarG.iterator();
        while (it.hasNext()) {
            elvlVar5.g.h(((elvk) it.next()).f);
        }
        ellg ellgVar = (ellg) ellh.a.createBuilder();
        ellf ellfVar = ellf.BUGLE_BUSINESS_MESSAGING_EVENT;
        ellgVar.copyOnWrite();
        ellh ellhVar = (ellh) ellgVar.instance;
        ellhVar.j = ellfVar.f11do;
        ellhVar.b |= 1;
        elvh elvhVar = (elvh) elvn.a.createBuilder();
        elvhVar.copyOnWrite();
        elvn elvnVar = (elvn) elvhVar.instance;
        elvnVar.c = i3 - 1;
        elvnVar.b |= 1;
        elvhVar.copyOnWrite();
        elvn elvnVar2 = (elvn) elvhVar.instance;
        elvl elvlVar6 = (elvl) elviVar.build();
        elvlVar6.getClass();
        elvnVar2.d = elvlVar6;
        elvnVar2.b |= 2;
        ellgVar.copyOnWrite();
        ellh ellhVar2 = (ellh) ellgVar.instance;
        elvn elvnVar3 = (elvn) elvhVar.build();
        elvnVar3.getClass();
        ellhVar2.ai = elvnVar3;
        ellhVar2.d |= 16;
        this.v.n(ellgVar);
    }

    private final void aX(final basd basdVar, final MessageCoreData messageCoreData, final int i2, final int i3, final enxu enxuVar, final enyw enywVar, final elny elnyVar) {
        if (this.x.get()) {
            auvh.h(eijx.f(new Runnable() { // from class: ajio
                @Override // java.lang.Runnable
                public final void run() {
                    int i4;
                    MessageCoreData messageCoreData2;
                    Optional optionalOfNullable = Optional.ofNullable(enywVar);
                    final ajjf ajjfVar = this.a;
                    boolean zA = ((aryp) ajjfVar.N.b()).a();
                    basd basdVar2 = basdVar;
                    MessageCoreData messageCoreDataX = messageCoreData;
                    if (zA && messageCoreDataX == null) {
                        messageCoreDataX = ((baxe) ajjfVar.n.b()).x(basdVar2);
                    }
                    int i5 = i2;
                    String str = basdVar2.b;
                    int iAw = ajjfVar.aw(messageCoreDataX);
                    enwr enwrVarAz = ajjfVar.az(iAw);
                    elof elofVar = (elof) elpg.b.createBuilder();
                    if (i5 == 1) {
                        i4 = 6;
                    } else if (i5 == 3) {
                        i4 = 16;
                    } else if (i5 == 10) {
                        i4 = 7;
                    } else {
                        if (i5 != 25) {
                            throw new IllegalArgumentException(a.g(i5, "notificationType does not correspond to IMDN: "));
                        }
                        i4 = 8;
                    }
                    elofVar.copyOnWrite();
                    elpg elpgVar = (elpg) elofVar.instance;
                    elpgVar.h = i4 - 1;
                    elpgVar.c |= 1;
                    elofVar.copyOnWrite();
                    elpg elpgVar2 = (elpg) elofVar.instance;
                    elpgVar2.x = enwrVarAz.N;
                    elpgVar2.c |= 1048576;
                    String strJ = ajjfVar.j(Optional.of(Integer.valueOf(iAw)));
                    elofVar.copyOnWrite();
                    elpg elpgVar3 = (elpg) elofVar.instance;
                    strJ.getClass();
                    elpgVar3.d = 1 | elpgVar3.d;
                    elpgVar3.J = strJ;
                    elpy elpyVarA = ((aimw) ajjfVar.r.b()).a(iAw);
                    elofVar.copyOnWrite();
                    elpg elpgVar4 = (elpg) elofVar.instance;
                    elpgVar4.j = elpyVarA;
                    elpgVar4.c |= 4;
                    elvg elvgVar = cqbe.a;
                    elofVar.copyOnWrite();
                    elpg elpgVar5 = (elpg) elofVar.instance;
                    elpgVar5.L = elvgVar.x;
                    elpgVar5.d |= 512;
                    ajjfVar.aB(messageCoreDataX, elofVar);
                    if (str != null) {
                        elofVar.copyOnWrite();
                        elpg elpgVar6 = (elpg) elofVar.instance;
                        elpgVar6.c |= Integer.MIN_VALUE;
                        elpgVar6.H = str;
                    }
                    if (messageCoreDataX != null) {
                        ((ajjo) ajjfVar.G.b()).h(messageCoreDataX, elofVar);
                        if (i5 != 10 || !messageCoreDataX.cB()) {
                            String strF = messageCoreDataX.F().f();
                            elofVar.copyOnWrite();
                            elpg elpgVar7 = (elpg) elofVar.instance;
                            elpgVar7.d |= VCardConfig.FLAG_APPEND_TYPE_PARAM;
                            elpgVar7.ad = strF;
                        }
                        if (((aquo) ajjfVar.L.b()).a()) {
                            ((ccww) ajjfVar.M.b()).a(elofVar, messageCoreDataX);
                        }
                    }
                    final MessageCoreData messageCoreData3 = messageCoreDataX;
                    final int i6 = i3;
                    final elof elofVar2 = (elof) ((elpg) elofVar.build()).toBuilder();
                    elofVar2.copyOnWrite();
                    elpg elpgVar8 = (elpg) elofVar2.instance;
                    elny elnyVar2 = elnyVar;
                    elpgVar8.i = i6 - 1;
                    elpgVar8.c |= 2;
                    if (elnyVar2 == null) {
                        elnyVar2 = i6 == 3 ? elny.INCOMING : elny.BUGLE_MESSAGE_SOURCE_NA;
                    }
                    final enxu enxuVar2 = enxuVar;
                    elofVar2.copyOnWrite();
                    elpg elpgVar9 = (elpg) elofVar2.instance;
                    elpgVar9.n = elnyVar2.M;
                    elpgVar9.c |= 64;
                    ((ajjo) ajjfVar.G.b()).j(messageCoreData3, elofVar2, optionalOfNullable);
                    if (messageCoreData3 == null) {
                        messageCoreData2 = null;
                    } else {
                        if (messageCoreData3.z() != null) {
                            auvh.h(messageCoreData3.z().f().h(new ejvr() { // from class: ajih
                                @Override // defpackage.ejvr
                                public final Object apply(Object obj) {
                                    ajjfVar.aI(messageCoreData3, i6, enxuVar2, elofVar2);
                                    return null;
                                }
                            }, ajjfVar.A));
                            return;
                        }
                        messageCoreData2 = messageCoreData3;
                    }
                    ajjfVar.aI(messageCoreData2, i6, enxuVar2, elofVar2);
                }
            }, this.A));
        } else {
            i.m("End to end logging disabled. Not logging IMDN.");
        }
    }

    private final void aY(MessageCoreData messageCoreData, int i2, Optional optional, Optional optional2, ainn ainnVar) {
        if (!this.x.get()) {
            n();
            return;
        }
        long jT = messageCoreData.t();
        elvt elvtVar = (elvt) elvv.a.createBuilder();
        int iD = d();
        elvtVar.copyOnWrite();
        elvv elvvVar = (elvv) elvtVar.instance;
        elvvVar.b |= 1;
        elvvVar.c = iD;
        fcsu fcsuVar = this.G;
        String strE = ((ajjo) fcsuVar.b()).e();
        elvtVar.copyOnWrite();
        elvv elvvVar2 = (elvv) elvtVar.instance;
        strE.getClass();
        elvvVar2.b |= 4;
        elvvVar2.e = strE;
        elvv elvvVar3 = (elvv) elvtVar.build();
        int iD2 = ajhe.d(messageCoreData.d());
        final elof elofVar = (elof) elpg.b.createBuilder();
        long jB = ((aika) this.p.b()).b(messageCoreData.A());
        elofVar.copyOnWrite();
        elpg elpgVar = (elpg) elofVar.instance;
        elpgVar.c |= 1073741824;
        elpgVar.G = jB;
        elofVar.copyOnWrite();
        elpg elpgVar2 = (elpg) elofVar.instance;
        elpgVar2.c |= 128;
        elpgVar2.o = jT;
        elofVar.copyOnWrite();
        elpg elpgVar3 = (elpg) elofVar.instance;
        elpgVar3.h = iD2 - 1;
        elpgVar3.c |= 1;
        elofVar.copyOnWrite();
        elpg elpgVar4 = (elpg) elofVar.instance;
        elpgVar4.i = i2 - 1;
        elpgVar4.c |= 2;
        elpy elpyVarA = ((aimw) this.r.b()).a(-1);
        elofVar.copyOnWrite();
        elpg elpgVar5 = (elpg) elofVar.instance;
        elpgVar5.j = elpyVarA;
        elpgVar5.c |= 4;
        String strJ = j(Optional.of(-1));
        elofVar.copyOnWrite();
        elpg elpgVar6 = (elpg) elofVar.instance;
        strJ.getClass();
        elpgVar6.d |= 1;
        elpgVar6.J = strJ;
        elofVar.copyOnWrite();
        elpg elpgVar7 = (elpg) elofVar.instance;
        elvvVar3.getClass();
        elpgVar7.y = elvvVar3;
        elpgVar7.c |= 4194304;
        elvg elvgVar = cqbe.a;
        elofVar.copyOnWrite();
        elpg elpgVar8 = (elpg) elofVar.instance;
        elpgVar8.L = elvgVar.x;
        elpgVar8.d |= 512;
        int iC = ajhe.c(messageCoreData);
        elofVar.copyOnWrite();
        elpg elpgVar9 = (elpg) elofVar.instance;
        elpgVar9.Q = iC - 1;
        elpgVar9.d |= 16384;
        aB(messageCoreData, elofVar);
        if (messageCoreData.aJ() != null) {
            fhaz fhazVarAJ = messageCoreData.aJ();
            fhazVarAJ.getClass();
            elofVar.copyOnWrite();
            elpg elpgVar10 = (elpg) elofVar.instance;
            elpgVar10.p = fhazVarAJ;
            elpgVar10.c |= 1024;
        }
        ((ajjo) fcsuVar.b()).j(messageCoreData, elofVar, optional2);
        optional.ifPresent(new Consumer() { // from class: ajhy
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void z(Object obj) {
                long j2 = ajjf.h;
                elke elkeVarA = ajhe.a((Integer) obj);
                elof elofVar2 = elofVar;
                elofVar2.copyOnWrite();
                elpg elpgVar11 = (elpg) elofVar2.instance;
                evsy evsyVar = elpg.a;
                elpgVar11.s = elkeVarA.f;
                elpgVar11.c |= 16384;
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
        messageCoreData.F().g(new Consumer() { // from class: ajif
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void z(Object obj) {
                long j2 = ajjf.h;
                String strF = ((basd) obj).f();
                elof elofVar2 = elofVar;
                elofVar2.copyOnWrite();
                elpg elpgVar11 = (elpg) elofVar2.instance;
                evsy evsyVar = elpg.a;
                elpgVar11.c |= Integer.MIN_VALUE;
                elpgVar11.H = strF;
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
        ((ajjo) fcsuVar.b()).f(elofVar, -1);
        ((ajjo) fcsuVar.b()).h(messageCoreData, elofVar);
        if (((aquo) this.L.b()).a()) {
            ((ccww) this.M.b()).a(elofVar, messageCoreData);
        }
        ellg ellgVar = (ellg) ellh.a.createBuilder();
        ellf ellfVar = ellf.BUGLE_MESSAGE;
        ellgVar.copyOnWrite();
        ellh ellhVar = (ellh) ellgVar.instance;
        ellhVar.j = ellfVar.f11do;
        ellhVar.b |= 1;
        ellgVar.copyOnWrite();
        ellh ellhVar2 = (ellh) ellgVar.instance;
        elpg elpgVar11 = (elpg) elofVar.build();
        elpgVar11.getClass();
        ellhVar2.l = elpgVar11;
        ellhVar2.b |= 4;
        ailn ailnVarA = this.w.a();
        ailnVarA.f(ainnVar);
        ailnVarA.j(ellgVar, aioj.LOG_SPEC_MESSAGE_DELIVERY_NORTHSTAR_EVENTS);
        elpg elpgVar12 = (elpg) elofVar.instance;
        long j2 = elpgVar12.o;
        int iB = eloa.b(elpgVar12.i);
        ajfj.a(j2, iB != 0 ? iB : 1, ainnVar);
    }

    public static ellh ay(elki elkiVar) {
        ellg ellgVar = (ellg) ellh.a.createBuilder();
        ellf ellfVar = ellf.BUGLE_CONVERSATION;
        ellgVar.copyOnWrite();
        ellh ellhVar = (ellh) ellgVar.instance;
        ellhVar.j = ellfVar.f11do;
        ellhVar.b |= 1;
        ellgVar.copyOnWrite();
        ellh ellhVar2 = (ellh) ellgVar.instance;
        elkiVar.getClass();
        ellhVar2.m = elkiVar;
        ellhVar2.b |= 8;
        return (ellh) ellgVar.build();
    }

    @Override // defpackage.ajhd
    @Deprecated
    public final void A(MessageCoreData messageCoreData, String str) {
        new ajep(messageCoreData, str);
    }

    @Override // defpackage.ajhd
    public final void B(MessageCoreData messageCoreData, int i2, elpg elpgVar) {
        ejwl.a(ajhe.d(messageCoreData.d()) != 3);
        if (!this.x.get()) {
            i.m("Clearcut loggings are disabled.");
            return;
        }
        ejwl.a(messageCoreData.cY());
        MessagePartCoreData messagePartCoreDataH = messageCoreData.H();
        messagePartCoreDataH.getClass();
        aC(messagePartCoreDataH.p(), "Bugle.Download.Failure.Attachment.Size.Bucket.Rcs");
        enyw enywVarB = enyw.b(elpgVar.Y);
        if (enywVarB == null) {
            enywVarB = enyw.UNKNOWN_RCS_TYPE;
        }
        int iOrdinal = enywVarB.ordinal();
        if (iOrdinal == 0) {
            throw new IllegalStateException("Unknown RCS transport type.");
        }
        if (iOrdinal == 1) {
            ((ains) this.U.b()).c("Bugle.DataModel.Action.Download.Failure.Count.Rcs");
        } else if (iOrdinal == 2) {
            ((ains) this.U.b()).c("Bugle.DataModel.Action.Download.Failure.Count.Rcs.Smapi");
        } else if (iOrdinal == 3) {
            ((ains) this.U.b()).c("Bugle.DataModel.Action.Download.Failure.Count.Rcs.Tachygram");
        } else if (iOrdinal == 4) {
            throw new IllegalStateException("Not RCS.");
        }
        enyw enywVarB2 = enyw.b(elpgVar.Y);
        if (enywVarB2 == null) {
            enywVarB2 = enyw.UNKNOWN_RCS_TYPE;
        }
        Optional optionalOf = Optional.of(enywVarB2);
        elol elolVarB = elol.b(elpgVar.ah);
        if (elolVarB == null) {
            elolVarB = elol.UNKNOWN_FORMAT_TYPE;
        }
        ah(messageCoreData, i2, -2, 0, -1, 7, null, 1, 0, optionalOf, Optional.of(elolVarB), Optional.empty());
    }

    @Override // defpackage.ajhd
    public final void C(final MessageCoreData messageCoreData, final Integer num, final int i2, final elng elngVar) throws Throwable {
        Throwable th;
        eieu eieuVarK = eiiy.k("UsageStatisticsImpl::logMessageIdCreated");
        try {
        } catch (Throwable th2) {
            th = th2;
        }
        try {
            if (this.x.get()) {
                final elof elofVar = (elof) elpg.b.createBuilder();
                try {
                    auvh.h((messageCoreData.z() != null ? messageCoreData.z().f() : eijx.e(null)).i(new eooz() { // from class: ajik
                        @Override // defpackage.eooz
                        public final ListenableFuture a(Object obj) {
                            return ((ajjo) this.a.G.b()).b(messageCoreData, elofVar);
                        }
                    }, eoqg.a).h(new ejvr() { // from class: ajil
                        @Override // defpackage.ejvr
                        public final Object apply(Object obj) throws Throwable {
                            eieu eieuVar;
                            elkz elkzVar;
                            final ajjf ajjfVar = this.a;
                            final MessageCoreData messageCoreData2 = messageCoreData;
                            final elof elofVar2 = elofVar;
                            eieu eieuVarK2 = eiiy.k("UsageStatisticsImpl::logActiveUserSendMessage");
                            elng elngVar2 = elngVar;
                            int i3 = i2;
                            Integer num2 = num;
                            try {
                                int iD = ajhe.d(messageCoreData2.d());
                                long jB = ((aika) ajjfVar.p.b()).b(messageCoreData2.A());
                                eltz eltzVar = (eltz) elua.a.createBuilder();
                                long jR = messageCoreData2.r();
                                eltzVar.copyOnWrite();
                                elua eluaVar = (elua) eltzVar.instance;
                                eluaVar.b |= 1;
                                eluaVar.c = jR;
                                elua eluaVar2 = (elua) eltzVar.build();
                                elvt elvtVar = (elvt) elvv.a.createBuilder();
                                int iD2 = ajjfVar.d();
                                elvtVar.copyOnWrite();
                                elvv elvvVar = (elvv) elvtVar.instance;
                                elvvVar.b |= 1;
                                elvvVar.c = iD2;
                                fcsu fcsuVar = ajjfVar.G;
                                String strE = ((ajjo) fcsuVar.b()).e();
                                elvtVar.copyOnWrite();
                                elvv elvvVar2 = (elvv) elvtVar.instance;
                                strE.getClass();
                                elvvVar2.b |= 4;
                                elvvVar2.e = strE;
                                elvv elvvVar3 = (elvv) elvtVar.build();
                                elho elhoVarB = ((aixn) ajjfVar.q.b()).b(i3);
                                int i4 = i3 >= 0 ? 6 : i3 < -2 ? 2 : i3 == -2 ? 3 : 4;
                                elne elneVar = (elne) elnh.a.createBuilder();
                                elneVar.copyOnWrite();
                                eieuVar = eieuVarK2;
                                try {
                                    elnh elnhVar = (elnh) elneVar.instance;
                                    elnhVar.c = elngVar2.i;
                                    elnhVar.b |= 1;
                                    elnh elnhVar2 = (elnh) elneVar.build();
                                    elofVar2.copyOnWrite();
                                    elpg elpgVar = (elpg) elofVar2.instance;
                                    evsy evsyVar = elpg.a;
                                    elpgVar.c |= 1073741824;
                                    elpgVar.G = jB;
                                    long jT = messageCoreData2.t();
                                    elofVar2.copyOnWrite();
                                    elpg elpgVar2 = (elpg) elofVar2.instance;
                                    elpgVar2.c |= 128;
                                    elpgVar2.o = jT;
                                    elofVar2.copyOnWrite();
                                    elpg elpgVar3 = (elpg) elofVar2.instance;
                                    elpgVar3.h = iD - 1;
                                    elpgVar3.c |= 1;
                                    elofVar2.copyOnWrite();
                                    elpg elpgVar4 = (elpg) elofVar2.instance;
                                    elpgVar4.i = 12;
                                    elpgVar4.c |= 2;
                                    elke elkeVarA = ajhe.a(num2);
                                    elofVar2.copyOnWrite();
                                    elpg elpgVar5 = (elpg) elofVar2.instance;
                                    elpgVar5.s = elkeVarA.f;
                                    elpgVar5.c |= 16384;
                                    elofVar2.copyOnWrite();
                                    elpg elpgVar6 = (elpg) elofVar2.instance;
                                    elvvVar3.getClass();
                                    elpgVar6.y = elvvVar3;
                                    elpgVar6.c |= 4194304;
                                    elofVar2.copyOnWrite();
                                    elpg elpgVar7 = (elpg) elofVar2.instance;
                                    eluaVar2.getClass();
                                    elpgVar7.l = eluaVar2;
                                    elpgVar7.c |= 16;
                                    String strJ = ajjfVar.j(Optional.of(Integer.valueOf(i3)));
                                    elofVar2.copyOnWrite();
                                    elpg elpgVar8 = (elpg) elofVar2.instance;
                                    strJ.getClass();
                                    elpgVar8.d |= 1;
                                    elpgVar8.J = strJ;
                                    elpl elplVarK = ((ajjo) fcsuVar.b()).k(messageCoreData2.M(), 13);
                                    elofVar2.copyOnWrite();
                                    elpg elpgVar9 = (elpg) elofVar2.instance;
                                    elplVarK.getClass();
                                    elpgVar9.k = elplVarK;
                                    elpgVar9.c |= 8;
                                    elvg elvgVar = cqbe.a;
                                    elofVar2.copyOnWrite();
                                    elpg elpgVar10 = (elpg) elofVar2.instance;
                                    elpgVar10.L = elvgVar.x;
                                    elpgVar10.d |= 512;
                                    elofVar2.copyOnWrite();
                                    elpg elpgVar11 = (elpg) elofVar2.instance;
                                    elhoVarB.getClass();
                                    elpgVar11.S = elhoVarB;
                                    elpgVar11.d |= 65536;
                                    elofVar2.copyOnWrite();
                                    elpg elpgVar12 = (elpg) elofVar2.instance;
                                    elpgVar12.ap = i4 - 1;
                                    elpgVar12.e |= 128;
                                    int iC = ajhe.c(messageCoreData2);
                                    elofVar2.copyOnWrite();
                                    elpg elpgVar13 = (elpg) elofVar2.instance;
                                    elpgVar13.Q = iC - 1;
                                    elpgVar13.d |= 16384;
                                    elofVar2.copyOnWrite();
                                    elpg elpgVar14 = (elpg) elofVar2.instance;
                                    elnhVar2.getClass();
                                    elpgVar14.ax = elnhVar2;
                                    elpgVar14.e |= 32768;
                                    ajjfVar.aB(messageCoreData2, elofVar2);
                                    if (messageCoreData2.aJ() != null) {
                                        fhaz fhazVarAJ = messageCoreData2.aJ();
                                        fhazVarAJ.getClass();
                                        elofVar2.copyOnWrite();
                                        elpg elpgVar15 = (elpg) elofVar2.instance;
                                        elpgVar15.p = fhazVarAJ;
                                        elpgVar15.c |= 1024;
                                    }
                                    elpy elpyVarA = ((aimw) ajjfVar.r.b()).a(i3);
                                    elofVar2.copyOnWrite();
                                    elpg elpgVar16 = (elpg) elofVar2.instance;
                                    elpgVar16.j = elpyVarA;
                                    elpgVar16.c |= 4;
                                    if (basd.l(messageCoreData2.F())) {
                                        String strF = messageCoreData2.F().f();
                                        elofVar2.copyOnWrite();
                                        elpg elpgVar17 = (elpg) elofVar2.instance;
                                        elpgVar17.c |= Integer.MIN_VALUE;
                                        elpgVar17.H = strF;
                                    }
                                    ((ajjo) fcsuVar.b()).i(messageCoreData2, elofVar2);
                                    ((ajjo) fcsuVar.b()).h(messageCoreData2, elofVar2);
                                    ((ajjo) fcsuVar.b()).l(elofVar2, iD, 13, i3);
                                    ((ajjo) fcsuVar.b()).f(elofVar2, i3);
                                    elpg elpgVar18 = (elpg) elofVar2.instance;
                                    if ((elpgVar18.c & 2048) != 0) {
                                        ella ellaVar = elpgVar18.q;
                                        if (ellaVar == null) {
                                            ellaVar = ella.a;
                                        }
                                        elkzVar = (elkz) ellaVar.toBuilder();
                                    } else {
                                        elkzVar = (elkz) ella.a.createBuilder();
                                    }
                                    int size = ((cozg) ajjfVar.I.b()).e().size();
                                    elkzVar.copyOnWrite();
                                    ella ellaVar2 = (ella) elkzVar.instance;
                                    ellaVar2.b |= 16;
                                    ellaVar2.d = size;
                                    elofVar2.copyOnWrite();
                                    elpg elpgVar19 = (elpg) elofVar2.instance;
                                    ella ellaVar3 = (ella) elkzVar.build();
                                    ellaVar3.getClass();
                                    elpgVar19.q = ellaVar3;
                                    elpgVar19.c |= 2048;
                                    MessageUsageStatisticsData messageUsageStatisticsDataZ = messageCoreData2.z();
                                    if (messageUsageStatisticsDataZ != null) {
                                        if (messageUsageStatisticsDataZ.j() != null) {
                                            elny elnyVarJ = messageUsageStatisticsDataZ.j();
                                            elofVar2.copyOnWrite();
                                            elpg elpgVar20 = (elpg) elofVar2.instance;
                                            elpgVar20.n = elnyVarJ.M;
                                            elpgVar20.c |= 64;
                                        }
                                        eloe eloeVarK = messageUsageStatisticsDataZ.k();
                                        elnu elnuVarH = messageUsageStatisticsDataZ.h();
                                        enwr enwrVarAz = ajjfVar.az(i3);
                                        elwq elwqVarL = messageUsageStatisticsDataZ.l();
                                        elofVar2.copyOnWrite();
                                        elpg elpgVar21 = (elpg) elofVar2.instance;
                                        elpgVar21.v = eloeVarK.d;
                                        elpgVar21.c |= 262144;
                                        elofVar2.copyOnWrite();
                                        elpg elpgVar22 = (elpg) elofVar2.instance;
                                        elpgVar22.w = elnuVarH.p;
                                        elpgVar22.c |= 524288;
                                        if (enwrVarAz != null) {
                                            elofVar2.copyOnWrite();
                                            elpg elpgVar23 = (elpg) elofVar2.instance;
                                            elpgVar23.x = enwrVarAz.N;
                                            elpgVar23.c |= 1048576;
                                        }
                                        if (elwqVarL != null && ccze.a(ThreadLocalRandom.current(), ajjf.d)) {
                                            elofVar2.copyOnWrite();
                                            elpg elpgVar24 = (elpg) elofVar2.instance;
                                            elpgVar24.N = elwqVarL;
                                            elpgVar24.d |= 2048;
                                        }
                                        DeviceData deviceDataD = messageUsageStatisticsDataZ.d();
                                        if (deviceDataD != null) {
                                            elky elkyVar = deviceDataD.a;
                                            elkz elkzVar2 = (elkz) ella.a.createBuilder();
                                            elkzVar2.copyOnWrite();
                                            ella ellaVar4 = (ella) elkzVar2.instance;
                                            ellaVar4.c = elkyVar.f;
                                            ellaVar4.b |= 1;
                                            ella ellaVar5 = (ella) elkzVar2.build();
                                            elofVar2.copyOnWrite();
                                            elpg elpgVar25 = (elpg) elofVar2.instance;
                                            ellaVar5.getClass();
                                            elpgVar25.r = ellaVar5;
                                            elpgVar25.c |= 8192;
                                        }
                                        messageUsageStatisticsDataZ.m().ifPresent(new Consumer() { // from class: ajiw
                                            @Override // java.util.function.Consumer
                                            /* renamed from: accept */
                                            public final void z(Object obj2) {
                                                long j2 = ajjf.h;
                                                long jMin = Math.min(((Long) obj2).longValue(), ((Long) ajjf.f.e()).longValue());
                                                elof elofVar3 = elofVar2;
                                                elofVar3.copyOnWrite();
                                                elpg elpgVar26 = (elpg) elofVar3.instance;
                                                evsy evsyVar2 = elpg.a;
                                                elpgVar26.d |= VCardConfig.FLAG_REFRAIN_IMAGE_EXPORT;
                                                elpgVar26.aa = jMin;
                                            }

                                            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                                                return Consumer$CC.$default$andThen(this, consumer);
                                            }
                                        });
                                        Optional optionalN = messageUsageStatisticsDataZ.n();
                                        elofVar2.getClass();
                                        optionalN.ifPresent(new Consumer() { // from class: ajix
                                            @Override // java.util.function.Consumer
                                            /* renamed from: accept */
                                            public final void z(Object obj2) {
                                                boolean zBooleanValue = ((Boolean) obj2).booleanValue();
                                                elof elofVar3 = elofVar2;
                                                elofVar3.copyOnWrite();
                                                elpg elpgVar26 = (elpg) elofVar3.instance;
                                                evsy evsyVar2 = elpg.a;
                                                elpgVar26.d |= 16777216;
                                                elpgVar26.ab = zBooleanValue;
                                            }

                                            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                                                return Consumer$CC.$default$andThen(this, consumer);
                                            }
                                        });
                                    }
                                    ellg ellgVar = (ellg) ellh.a.createBuilder();
                                    ellf ellfVar = ellf.BUGLE_MESSAGE;
                                    ellgVar.copyOnWrite();
                                    ellh ellhVar = (ellh) ellgVar.instance;
                                    ellhVar.j = ellfVar.f11do;
                                    ellhVar.b |= 1;
                                    ellgVar.copyOnWrite();
                                    ellh ellhVar2 = (ellh) ellgVar.instance;
                                    elpg elpgVar26 = (elpg) elofVar2.build();
                                    elpgVar26.getClass();
                                    ellhVar2.l = elpgVar26;
                                    ellhVar2.b |= 4;
                                    ailn ailnVarA = ajjfVar.w.a();
                                    ailnVarA.d(emxt.ACTIVE_USER_SEND_MESSAGE);
                                    ailnVarA.j(ellgVar, aioj.LOG_SPEC_MESSAGE_DELIVERY_NORTHSTAR_EVENTS);
                                    Instant instantF = ajjfVar.t.f();
                                    fcsu fcsuVar2 = ajjfVar.K;
                                    ((ajdy) fcsuVar2.b()).g(instantF);
                                    ((ajdy) fcsuVar2.b()).f(instantF);
                                    ajdy ajdyVar = (ajdy) fcsuVar2.b();
                                    instantF.getClass();
                                    ajcd ajcdVar = ajdyVar.d;
                                    ejaa.a(fdjy.b(eicg.a(ajdyVar.b.hE())), ajdyVar.c, new ajdu(null, ajdyVar, ajcd.b(instantF)));
                                    if (messageCoreData2.cX()) {
                                        ((ajdy) fcsuVar2.b()).h(instantF);
                                        ajdy ajdyVar2 = (ajdy) fcsuVar2.b();
                                        instantF.getClass();
                                        ajcd ajcdVar2 = ajdyVar2.d;
                                        ejaa.a(fdjy.b(eicg.a(ajdyVar2.b.hE())), ajdyVar2.c, new ajds(null, ajdyVar2, ajcd.b(instantF)));
                                    }
                                    eijx.f(new Runnable() { // from class: ajiy
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            elpg elpgVar27 = (elpg) elofVar2.build();
                                            ajjf ajjfVar2 = ajjfVar;
                                            fhaz fhazVarAJ2 = messageCoreData2.aJ();
                                            Map map = fhazVarAJ2 != null ? (Map) ajjfVar2.k.remove(fhazVarAJ2.b) : null;
                                            if (map == null) {
                                                ekrw ekrwVarJ = ajjf.j.j();
                                                ekrwVarJ.X(eksq.a, "BugleUsageStatistics");
                                                ((ekrd) ((ekrd) ekrwVarJ).h("com/google/android/apps/messaging/shared/analytics/statistics/UsageStatisticsImpl", "logMessageSendInitiatedEvents", 888, "UsageStatisticsImpl.java")).q("No send button click recorded, skipping logging CHAT_MESSAGE_SEND_INITIATED.");
                                                return;
                                            }
                                            for (Map.Entry entry : map.entrySet()) {
                                                elof elofVar3 = (elof) elpgVar27.toBuilder();
                                                elofVar3.copyOnWrite();
                                                elpg elpgVar28 = (elpg) elofVar3.instance;
                                                elpgVar28.i = 28;
                                                elpgVar28.c |= 2;
                                                elny elnyVar = (elny) entry.getKey();
                                                elofVar3.copyOnWrite();
                                                elpg elpgVar29 = (elpg) elofVar3.instance;
                                                elpgVar29.n = elnyVar.M;
                                                elpgVar29.c |= 64;
                                                int i5 = 1;
                                                try {
                                                    ailn ailnVarA2 = ajjfVar2.w.a();
                                                    ailnVarA2.d(emxt.ACTIVE_USER_SEND_MESSAGE);
                                                    ailnVarA2.f((ainn) entry.getValue());
                                                    ellg ellgVar2 = (ellg) ellh.a.createBuilder();
                                                    ellf ellfVar2 = ellf.BUGLE_MESSAGE;
                                                    ellgVar2.copyOnWrite();
                                                    ellh ellhVar3 = (ellh) ellgVar2.instance;
                                                    ellhVar3.j = ellfVar2.f11do;
                                                    ellhVar3.b |= 1;
                                                    elpg elpgVar30 = (elpg) elofVar3.build();
                                                    ellgVar2.copyOnWrite();
                                                    ellh ellhVar4 = (ellh) ellgVar2.instance;
                                                    elpgVar30.getClass();
                                                    ellhVar4.l = elpgVar30;
                                                    ellhVar4.b |= 4;
                                                    ailnVarA2.j(ellgVar2, aioj.LOG_SPEC_MESSAGE_DELIVERY_NORTHSTAR_EVENTS);
                                                } catch (Exception e) {
                                                    ekrw ekrwVarJ2 = ajjf.j.j();
                                                    ekrwVarJ2.X(eksq.a, "BugleUsageStatistics");
                                                    ((ekrd) ((ekrd) ((ekrd) ekrwVarJ2).g(e)).h("com/google/android/apps/messaging/shared/analytics/statistics/UsageStatisticsImpl", "logMessageSendInitiatedEvents", (char) 910, "UsageStatisticsImpl.java")).q("Failed to send logs to Clearcut");
                                                }
                                                elpg elpgVar31 = (elpg) elofVar3.instance;
                                                long j2 = elpgVar31.o;
                                                int iB = eloa.b(elpgVar31.i);
                                                if (iB != 0) {
                                                    i5 = iB;
                                                }
                                                ajfj.a(j2, i5, (ainn) entry.getValue());
                                            }
                                        }
                                    }, ajjfVar.A);
                                    eieuVar.close();
                                    ajjfVar.C.f(messageCoreData2);
                                    return null;
                                } catch (Throwable th3) {
                                    th = th3;
                                    Throwable th4 = th;
                                    try {
                                        eieuVar.close();
                                        throw th4;
                                    } catch (Throwable th5) {
                                        th4.addSuppressed(th5);
                                        throw th4;
                                    }
                                }
                            } catch (Throwable th6) {
                                th = th6;
                                eieuVar = eieuVarK2;
                            }
                        }
                    }, this.A));
                } catch (Throwable th3) {
                    th = th3;
                    th = th;
                    try {
                        eieuVarK.close();
                        throw th;
                    } catch (Throwable th4) {
                        th.addSuppressed(th4);
                        throw th;
                    }
                }
            } else {
                n();
            }
            eieuVarK.close();
        } catch (Throwable th5) {
            th = th5;
            eieuVarK.close();
            throw th;
        }
    }

    @Override // defpackage.ajhd
    public final void D(final ajfg ajfgVar) {
        if (this.x.get()) {
            auvh.h(eijx.f(new Runnable() { // from class: ajhi
                @Override // java.lang.Runnable
                public final void run() {
                    ajel ajelVar = (ajel) ajfgVar;
                    enxu enxuVar = (enxu) ajelVar.f.orElse(null);
                    this.a.aJ(ajelVar.a, ajelVar.b, ajelVar.c, ajelVar.d, ajelVar.e, 6, enxuVar, ajelVar.k, ajelVar.g, Optional.empty(), ajelVar.h, ajelVar.i, ajelVar.j);
                }
            }, this.A));
        } else {
            n();
        }
    }

    @Override // defpackage.ajhd
    public final void E(MessageCoreData messageCoreData) {
        new ajer(messageCoreData);
    }

    @Override // defpackage.ajhd
    public final void F(MessageCoreData messageCoreData, int i2) {
        G(messageCoreData, i2, -1);
    }

    @Override // defpackage.ajhd
    public final void G(final MessageCoreData messageCoreData, final int i2, final int i3) {
        auvh.h(eijx.h(new eooy() { // from class: ajja
            @Override // defpackage.eooy
            public final ListenableFuture a() {
                final elof elofVar = (elof) elpg.b.createBuilder();
                final ajjf ajjfVar = this.a;
                ajjo ajjoVar = (ajjo) ajjfVar.G.b();
                final MessageCoreData messageCoreData2 = messageCoreData;
                eiju eijuVarB = ajjoVar.b(messageCoreData2, elofVar);
                final int i4 = i2;
                final int i5 = i3;
                return eijuVarB.h(new ejvr() { // from class: ajig
                    @Override // defpackage.ejvr
                    public final Object apply(Object obj) {
                        ajjf ajjfVar2 = ajjfVar;
                        if (!ajjfVar2.x.get()) {
                            ajjfVar2.n();
                            return null;
                        }
                        elof elofVar2 = elofVar;
                        MessageCoreData messageCoreData3 = messageCoreData2;
                        ajjfVar2.w.getClass();
                        ajfn ajfnVar = ajjfVar2.C;
                        Integer numE = ajfnVar.e(messageCoreData3.C().b());
                        ajhc ajhcVarA = ajfnVar.a(messageCoreData3.C().b());
                        elvt elvtVar = (elvt) elvv.a.createBuilder();
                        int iD = ajjfVar2.d();
                        elvtVar.copyOnWrite();
                        elvv elvvVar = (elvv) elvtVar.instance;
                        elvvVar.b |= 1;
                        elvvVar.c = iD;
                        fcsu fcsuVar = ajjfVar2.G;
                        String strE = ((ajjo) fcsuVar.b()).e();
                        elvtVar.copyOnWrite();
                        elvv elvvVar2 = (elvv) elvtVar.instance;
                        strE.getClass();
                        elvvVar2.b |= 4;
                        elvvVar2.e = strE;
                        elvv elvvVar3 = (elvv) elvtVar.build();
                        int iD2 = ajhe.d(messageCoreData3.d());
                        long jB = ((aika) ajjfVar2.p.b()).b(messageCoreData3.A());
                        elofVar2.copyOnWrite();
                        elpg elpgVar = (elpg) elofVar2.instance;
                        evsy evsyVar = elpg.a;
                        elpgVar.c |= 1073741824;
                        elpgVar.G = jB;
                        long jT = messageCoreData3.t();
                        elofVar2.copyOnWrite();
                        elpg elpgVar2 = (elpg) elofVar2.instance;
                        elpgVar2.c |= 128;
                        elpgVar2.o = jT;
                        String strF = messageCoreData3.F().f();
                        elofVar2.copyOnWrite();
                        elpg elpgVar3 = (elpg) elofVar2.instance;
                        elpgVar3.c |= Integer.MIN_VALUE;
                        elpgVar3.H = strF;
                        elofVar2.copyOnWrite();
                        elpg elpgVar4 = (elpg) elofVar2.instance;
                        int i6 = i4;
                        elpgVar4.h = iD2 - 1;
                        elpgVar4.c |= 1;
                        elofVar2.copyOnWrite();
                        elpg elpgVar5 = (elpg) elofVar2.instance;
                        elpgVar5.i = 7;
                        elpgVar5.c |= 2;
                        elpy elpyVarA = ((aimw) ajjfVar2.r.b()).a(i6);
                        elofVar2.copyOnWrite();
                        elpg elpgVar6 = (elpg) elofVar2.instance;
                        elpgVar6.j = elpyVarA;
                        elpgVar6.c |= 4;
                        String strJ = ajjfVar2.j(Optional.of(Integer.valueOf(i6)));
                        elofVar2.copyOnWrite();
                        elpg elpgVar7 = (elpg) elofVar2.instance;
                        strJ.getClass();
                        elpgVar7.d |= 1;
                        elpgVar7.J = strJ;
                        elofVar2.copyOnWrite();
                        elpg elpgVar8 = (elpg) elofVar2.instance;
                        elvvVar3.getClass();
                        elpgVar8.y = elvvVar3;
                        elpgVar8.c |= 4194304;
                        elvg elvgVar = cqbe.a;
                        elofVar2.copyOnWrite();
                        elpg elpgVar9 = (elpg) elofVar2.instance;
                        elpgVar9.L = elvgVar.x;
                        elpgVar9.d |= 512;
                        int iC = ajhe.c(messageCoreData3);
                        elofVar2.copyOnWrite();
                        elpg elpgVar10 = (elpg) elofVar2.instance;
                        elpgVar10.Q = iC - 1;
                        elpgVar10.d |= 16384;
                        if (messageCoreData3.aJ() != null) {
                            fhaz fhazVarAJ = messageCoreData3.aJ();
                            fhazVarAJ.getClass();
                            elofVar2.copyOnWrite();
                            elpg elpgVar11 = (elpg) elofVar2.instance;
                            elpgVar11.p = fhazVarAJ;
                            elpgVar11.c |= 1024;
                        }
                        int i7 = i5;
                        ajjf.aD(elofVar2, messageCoreData3);
                        if (i7 >= 0) {
                            elofVar2.copyOnWrite();
                            elpg elpgVar12 = (elpg) elofVar2.instance;
                            elpgVar12.e |= 16;
                            elpgVar12.am = i7;
                        }
                        elpf elpfVar = (elpf) ajjfVar2.H.fM(messageCoreData3.P());
                        elofVar2.copyOnWrite();
                        elpg elpgVar13 = (elpg) elofVar2.instance;
                        elpgVar13.an = elpfVar.h;
                        elpgVar13.e |= 32;
                        ((ajjo) fcsuVar.b()).i(messageCoreData3, elofVar2);
                        if (numE != null) {
                            elke elkeVarA = ajhe.a(numE);
                            elofVar2.copyOnWrite();
                            elpg elpgVar14 = (elpg) elofVar2.instance;
                            elpgVar14.s = elkeVarA.f;
                            elpgVar14.c |= 16384;
                            cqbd cqbdVarA = ajjf.i.a();
                            elke elkeVarB = elke.b(((elpg) elofVar2.instance).s);
                            if (elkeVarB == null) {
                                elkeVarB = elke.UNKNOWN_BUGLE_CONVERSATION_TYPE;
                            }
                            cqbdVarA.A("messageConversationType", elkeVarB);
                            cqbdVarA.r();
                        }
                        if (ajhcVarA != null) {
                            elpl elplVarK = ((ajjo) fcsuVar.b()).k(messageCoreData3.M(), 8);
                            elofVar2.copyOnWrite();
                            elpg elpgVar15 = (elpg) elofVar2.instance;
                            elplVarK.getClass();
                            elpgVar15.k = elplVarK;
                            elpgVar15.c |= 8;
                        }
                        ((ajjo) fcsuVar.b()).h(messageCoreData3, elofVar2);
                        if (((aquo) ajjfVar2.L.b()).a()) {
                            ((ccww) ajjfVar2.M.b()).a(elofVar2, messageCoreData3);
                        }
                        ((aiup) ajjfVar2.D.b()).a(elofVar2, messageCoreData3, numE != null ? numE.intValue() : 0);
                        ellg ellgVar = (ellg) ellh.a.createBuilder();
                        ellf ellfVar = ellf.BUGLE_MESSAGE;
                        ellgVar.copyOnWrite();
                        ellh ellhVar = (ellh) ellgVar.instance;
                        ellhVar.j = ellfVar.f11do;
                        ellhVar.b |= 1;
                        ellgVar.copyOnWrite();
                        ellh ellhVar2 = (ellh) ellgVar.instance;
                        elpg elpgVar16 = (elpg) elofVar2.build();
                        elpgVar16.getClass();
                        ellhVar2.l = elpgVar16;
                        ellhVar2.b |= 4;
                        ajjfVar2.w.a().j(ellgVar, aioj.LOG_SPEC_MESSAGE_DELIVERY_NORTHSTAR_EVENTS);
                        return null;
                    }
                }, ajjfVar.A);
            }
        }, this.ac));
    }

    @Override // defpackage.ajhd
    public final void H(MessageCoreData messageCoreData, int i2, elof elofVar) {
        elofVar.copyOnWrite();
        elpg elpgVar = (elpg) elofVar.instance;
        evsy evsyVar = elpg.a;
        elpgVar.W = 0;
        elpgVar.d |= 524288;
        cogw cogwVar = this.t;
        I(messageCoreData, i2, cogwVar.f().toEpochMilli(), ainm.a(cogwVar), elofVar);
    }

    @Override // defpackage.ajhd
    public final void I(MessageCoreData messageCoreData, int i2, long j2, ainn ainnVar, elof elofVar) {
        ((ajjo) this.G.b()).i(messageCoreData, elofVar);
        int iB = eloa.b(((elpg) elofVar.instance).i);
        if (iB == 0) {
            iB = 1;
        }
        int i3 = iB - 1;
        if (i3 == 1) {
            aT(i2, messageCoreData);
            new ajes(messageCoreData);
        } else if (i3 == 2) {
            aT(i2, messageCoreData);
            new ajeq(messageCoreData);
        }
        aiul aiulVar = (aiul) this.y.b();
        long j3 = ainnVar.a;
        cqnx.c(aiulVar.g(j3), "BugleUsageStatistics", "Failed to update LastPassiveEventTimeMillis");
        if (!this.x.get()) {
            n();
            return;
        }
        ejwl.b(!messageCoreData.P().equals(bvec.TRANSPORT_NOT_SELECTED), "XmsTransport must be selected at this stage");
        elpf elpfVar = (elpf) this.H.fM(messageCoreData.P());
        elofVar.copyOnWrite();
        elpg elpgVar = (elpg) elofVar.instance;
        elpgVar.an = elpfVar.h;
        elpgVar.e |= 32;
        if (messageCoreData.aJ() != null) {
            fhaz fhazVarAJ = messageCoreData.aJ();
            fhazVarAJ.getClass();
            elofVar.copyOnWrite();
            elpg elpgVar2 = (elpg) elofVar.instance;
            elpgVar2.p = fhazVarAJ;
            elpgVar2.c |= 1024;
        }
        cqbd cqbdVarC = i.c();
        cqbdVarC.I("Logging message sent or received async");
        cqbdVarC.d(messageCoreData.C());
        cqbdVarC.h(messageCoreData.F());
        cqbdVarC.w(messageCoreData.t());
        cqbdVarC.r();
        cave caveVar = (cave) cavf.a.createBuilder();
        String strB = messageCoreData.C().c() ? "-1" : messageCoreData.C().b();
        caveVar.copyOnWrite();
        cavf cavfVar = (cavf) caveVar.instance;
        strB.getClass();
        cavfVar.b = 1 | cavfVar.b;
        cavfVar.c = strB;
        caveVar.copyOnWrite();
        cavf cavfVar2 = (cavf) caveVar.instance;
        cavfVar2.b |= 2;
        cavfVar2.d = i2;
        caveVar.copyOnWrite();
        cavf cavfVar3 = (cavf) caveVar.instance;
        cavfVar3.b |= 4;
        cavfVar3.e = j2;
        caveVar.copyOnWrite();
        cavf cavfVar4 = (cavf) caveVar.instance;
        cavfVar4.b |= 16;
        cavfVar4.g = j3;
        long j4 = ainnVar.b;
        caveVar.copyOnWrite();
        cavf cavfVar5 = (cavf) caveVar.instance;
        cavfVar5.b |= 32;
        cavfVar5.h = j4;
        caveVar.copyOnWrite();
        cavf cavfVar6 = (cavf) caveVar.instance;
        elpg elpgVar3 = (elpg) elofVar.build();
        elpgVar3.getClass();
        cavfVar6.f = elpgVar3;
        cavfVar6.b |= 8;
        final cavf cavfVar7 = (cavf) caveVar.build();
        Runnable runnable = new Runnable() { // from class: ajhv
            @Override // java.lang.Runnable
            public final void run() {
                ((cauw) this.a.J.b()).k(cavfVar7);
            }
        };
        eieu eieuVarK = eiiy.k("UsageStatisticsImpl::logMessageSentOrReceivedAsync");
        try {
            eiju eijuVarF = eijx.f(runnable, this.A);
            eieuVarK.b(eijuVarF);
            caxe caxeVar = (caxe) this.aj.b();
            caxeVar.f("Bugle.DataModel.Action.ProcessSentOrReceivedMessage.Logging.AttachingAndroidFutureWrapper.Count", caxeVar.d(EnumSet.of(caxd.WAKELOCK, caxd.BACKGROUND_SERVICE), eijuVarF, new Supplier() { // from class: ajie
                @Override // java.util.function.Supplier
                public final Object get() {
                    long j5 = ajjf.h;
                    return null;
                }
            }));
            auvh.h(eijuVarF);
            eieuVarK.close();
        } catch (Throwable th) {
            try {
                eieuVarK.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.ajhd
    public final void J(int i2, int i3, int i4, int i5, long j2, int i6, long j3, ConversationIdType conversationIdType) {
        aP(i2, i3, i4, j2, i6, i5, j3, false, conversationIdType);
    }

    @Override // defpackage.ajhd
    public final void K(ConversationIdType conversationIdType, int i2, long j2) {
        enyw enywVar = enyw.NOT_RCS;
        Optional optionalEmpty = Optional.empty();
        ecem.b();
        if (!this.x.get()) {
            n();
            return;
        }
        ejwl.b(true, "Download start logging is only possible for MMS and RCS messages.");
        ((ains) this.U.b()).c("Bugle.DataModel.Action.Download.Start.Count.Mms");
        elvt elvtVar = (elvt) elvv.a.createBuilder();
        int iD = d();
        elvtVar.copyOnWrite();
        elvv elvvVar = (elvv) elvtVar.instance;
        elvvVar.b |= 1;
        elvvVar.c = iD;
        fcsu fcsuVar = this.G;
        String strE = ((ajjo) fcsuVar.b()).e();
        elvtVar.copyOnWrite();
        elvv elvvVar2 = (elvv) elvtVar.instance;
        strE.getClass();
        elvvVar2.b |= 4;
        elvvVar2.e = strE;
        elvv elvvVar3 = (elvv) elvtVar.build();
        elof elofVar = (elof) elpg.b.createBuilder();
        elofVar.copyOnWrite();
        elpg elpgVar = (elpg) elofVar.instance;
        elpgVar.Y = enywVar.h;
        elpgVar.d |= 2097152;
        long jB = ((aika) this.p.b()).b(conversationIdType);
        elofVar.copyOnWrite();
        elpg elpgVar2 = (elpg) elofVar.instance;
        elpgVar2.c |= 1073741824;
        elpgVar2.G = jB;
        elofVar.copyOnWrite();
        elpg elpgVar3 = (elpg) elofVar.instance;
        elpgVar3.h = 2;
        elpgVar3.c |= 1;
        elofVar.copyOnWrite();
        elpg elpgVar4 = (elpg) elofVar.instance;
        elpgVar4.i = 14;
        elpgVar4.c = 2 | elpgVar4.c;
        elpy elpyVarA = ((aimw) this.r.b()).a(i2);
        elofVar.copyOnWrite();
        elpg elpgVar5 = (elpg) elofVar.instance;
        elpgVar5.j = elpyVarA;
        elpgVar5.c |= 4;
        elofVar.copyOnWrite();
        elpg elpgVar6 = (elpg) elofVar.instance;
        elvvVar3.getClass();
        elpgVar6.y = elvvVar3;
        elpgVar6.c |= 4194304;
        elvg elvgVar = cqbe.a;
        elofVar.copyOnWrite();
        elpg elpgVar7 = (elpg) elofVar.instance;
        elpgVar7.L = elvgVar.x;
        elpgVar7.d |= 512;
        elofVar.copyOnWrite();
        elpg elpgVar8 = (elpg) elofVar.instance;
        elpgVar8.c |= 128;
        elpgVar8.o = j2;
        optionalEmpty.isPresent();
        ((ajjo) fcsuVar.b()).f(elofVar, i2);
        ((ajjo) fcsuVar.b()).l(elofVar, 3, 15, i2);
        if (((aquo) this.L.b()).a()) {
            ((ccww) this.M.b()).b(elofVar, conversationIdType);
        }
        ellg ellgVar = (ellg) ellh.a.createBuilder();
        ellf ellfVar = ellf.BUGLE_MESSAGE;
        ellgVar.copyOnWrite();
        ellh ellhVar = (ellh) ellgVar.instance;
        ellhVar.j = ellfVar.f11do;
        ellhVar.b |= 1;
        ellgVar.copyOnWrite();
        ellh ellhVar2 = (ellh) ellgVar.instance;
        elpg elpgVar9 = (elpg) elofVar.build();
        elpgVar9.getClass();
        ellhVar2.l = elpgVar9;
        ellhVar2.b |= 4;
        this.w.a().j(ellgVar, aioj.LOG_SPEC_MESSAGE_DELIVERY_NORTHSTAR_EVENTS);
    }

    @Override // defpackage.ajhd
    public final void L(int i2) {
        ((ains) this.U.b()).e("Bugle.Media.PhotoViewer.Launch.Counts", i2);
    }

    @Override // defpackage.ajhd
    public final void M(final ajfh ajfhVar) {
        MessageCoreData messageCoreData = ((ajem) ajfhVar).a;
        ejwl.a(ajhe.d(messageCoreData.d()) == 4);
        final int iAw = aw(messageCoreData);
        auvh.h(eijx.f(new Runnable() { // from class: ajin
            @Override // java.lang.Runnable
            public final void run() {
                ajjf ajjfVar = this.a;
                Optional optionalOf = Optional.of(ajjfVar.E.a());
                Optional optionalOf2 = Optional.of(elol.UNKNOWN_FORMAT_TYPE);
                ajem ajemVar = (ajem) ajfhVar;
                ajjfVar.aJ(ajemVar.a, iAw, -2, 0, -1, 18, null, 1, 0, optionalOf, optionalOf2, Optional.of(ajemVar.b), Optional.empty());
            }
        }, this.A));
    }

    @Override // defpackage.ajhd
    public final void N(MessageCoreData messageCoreData, int i2) {
        ejwl.a(messageCoreData.F().b != null);
        Optional optionalEmpty = Optional.empty();
        final ajek ajekVar = new ajek();
        ajekVar.e(messageCoreData);
        ajekVar.h(i2);
        ajekVar.f(-2);
        ajekVar.c(0);
        ajekVar.b(-1);
        ajekVar.d = 1;
        ajekVar.d(0);
        optionalEmpty.ifPresent(new Consumer() { // from class: ajhs
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void z(Object obj) {
                ajekVar.g((elpa) obj);
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
        D(ajekVar.a());
    }

    @Override // defpackage.ajhd
    public final void O(MessageCoreData messageCoreData, eltm eltmVar) {
        if (!this.x.get()) {
            n();
            return;
        }
        elph elphVar = (elph) elpj.a.createBuilder();
        long jT = messageCoreData.t();
        elphVar.copyOnWrite();
        elpj elpjVar = (elpj) elphVar.instance;
        elpjVar.b |= 2;
        elpjVar.d = jT;
        elphVar.copyOnWrite();
        elpj elpjVar2 = (elpj) elphVar.instance;
        elpjVar2.c = 2;
        elpjVar2.b |= 1;
        elphVar.copyOnWrite();
        elpj elpjVar3 = (elpj) elphVar.instance;
        eltmVar.getClass();
        elpjVar3.f = eltmVar;
        elpjVar3.b |= 8;
        aN(messageCoreData, (elpj) elphVar.build());
    }

    @Override // defpackage.ajhd
    public final void P(int i2, int i3) {
        elho elhoVarB = ((aixn) this.q.b()).b(i3);
        elof elofVar = (elof) elpg.b.createBuilder();
        elofVar.copyOnWrite();
        elpg elpgVar = (elpg) elofVar.instance;
        elpgVar.h = 1;
        elpgVar.c |= 1;
        elofVar.copyOnWrite();
        elpg elpgVar2 = (elpg) elofVar.instance;
        elpgVar2.i = 15;
        elpgVar2.c |= 2;
        elpy elpyVarA = ((aimw) this.r.b()).a(i3);
        elofVar.copyOnWrite();
        elpg elpgVar3 = (elpg) elofVar.instance;
        elpgVar3.j = elpyVarA;
        elpgVar3.c |= 4;
        String strJ = j(Optional.of(Integer.valueOf(i3)));
        elofVar.copyOnWrite();
        elpg elpgVar4 = (elpg) elofVar.instance;
        strJ.getClass();
        elpgVar4.d |= 1;
        elpgVar4.J = strJ;
        elofVar.copyOnWrite();
        elpg elpgVar5 = (elpg) elofVar.instance;
        elhoVarB.getClass();
        elpgVar5.S = elhoVarB;
        elpgVar5.d |= 65536;
        elvg elvgVar = cqbe.a;
        elofVar.copyOnWrite();
        elpg elpgVar6 = (elpg) elofVar.instance;
        elpgVar6.L = elvgVar.x;
        elpgVar6.d |= 512;
        eltn eltnVar = (eltn) eltq.a.createBuilder();
        eltnVar.copyOnWrite();
        eltq eltqVar = (eltq) eltnVar.instance;
        eltqVar.b |= 1;
        eltqVar.c = -1;
        elis elisVar = (elis) elit.a.createBuilder();
        elisVar.copyOnWrite();
        elit elitVar = (elit) elisVar.instance;
        elitVar.b |= 1;
        elitVar.c = i2;
        elit elitVar2 = (elit) elisVar.build();
        eltnVar.copyOnWrite();
        eltq eltqVar2 = (eltq) eltnVar.instance;
        elitVar2.getClass();
        eltqVar2.d = elitVar2;
        eltqVar2.b |= 2;
        eltp eltpVarAL = aL(i3);
        eltnVar.copyOnWrite();
        eltq eltqVar3 = (eltq) eltnVar.instance;
        eltqVar3.e = eltpVarAL.e;
        eltqVar3.b |= 4;
        eltq eltqVar4 = (eltq) eltnVar.build();
        elofVar.copyOnWrite();
        elpg elpgVar7 = (elpg) elofVar.instance;
        eltqVar4.getClass();
        elpgVar7.g = eltqVar4;
        elpgVar7.f = 41;
        eltq eltqVar5 = (eltq) elpgVar7.g;
        elho elhoVar = elpgVar7.S;
        if (elhoVar == null) {
            elhoVar = elho.b;
        }
        aU(eltqVar5, elhoVar);
        ((ajjo) this.G.b()).l(elofVar, 2, 16, i3);
        ellg ellgVar = (ellg) ellh.a.createBuilder();
        ellf ellfVar = ellf.BUGLE_MESSAGE;
        ellgVar.copyOnWrite();
        ellh ellhVar = (ellh) ellgVar.instance;
        ellhVar.j = ellfVar.f11do;
        ellhVar.b |= 1;
        ellgVar.copyOnWrite();
        ellh ellhVar2 = (ellh) ellgVar.instance;
        elpg elpgVar8 = (elpg) elofVar.build();
        elpgVar8.getClass();
        ellhVar2.l = elpgVar8;
        ellhVar2.b |= 4;
        this.w.a().j(ellgVar, aioj.LOG_SPEC_MESSAGE_DELIVERY_NORTHSTAR_EVENTS);
    }

    @Override // defpackage.ajhd
    public final void Q(emxt emxtVar, MessageCoreData messageCoreData, int i2) {
        int i3;
        if (!this.x.get()) {
            n();
            return;
        }
        ellg ellgVar = (ellg) ellh.a.createBuilder();
        if (messageCoreData != null) {
            aiko aikoVar = (aiko) this.T.b();
            Iterator it = messageCoreData.M().iterator();
            while (true) {
                i3 = 2;
                if (!it.hasNext()) {
                    break;
                }
                MessagePartCoreData messagePartCoreData = (MessagePartCoreData) it.next();
                elkq elkqVar = aikoVar.b;
                boolean zBv = messagePartCoreData.bv();
                int iB = elhs.b(((elku) elkqVar.instance).h);
                if (iB == 0) {
                    iB = 2;
                }
                int iA = aiko.a(zBv, iB);
                elkqVar.copyOnWrite();
                elku elkuVar = (elku) elkqVar.instance;
                elkuVar.h = elhs.a(iA);
                elkuVar.b |= 32;
                boolean zBj = messagePartCoreData.bj();
                int iB2 = elhs.b(((elku) elkqVar.instance).i);
                if (iB2 == 0) {
                    iB2 = 2;
                }
                int iA2 = aiko.a(zBj, iB2);
                elkqVar.copyOnWrite();
                elku elkuVar2 = (elku) elkqVar.instance;
                elkuVar2.i = elhs.a(iA2);
                elkuVar2.b |= 64;
                boolean zAY = messagePartCoreData.aY();
                int iB3 = elhs.b(((elku) elkqVar.instance).j);
                if (iB3 == 0) {
                    iB3 = 2;
                }
                int iA3 = aiko.a(zAY, iB3);
                elkqVar.copyOnWrite();
                elku elkuVar3 = (elku) elkqVar.instance;
                elkuVar3.j = elhs.a(iA3);
                elkuVar3.b |= 128;
                boolean zBx = messagePartCoreData.bx();
                int iB4 = elhs.b(((elku) elkqVar.instance).k);
                if (iB4 == 0) {
                    iB4 = 2;
                }
                int iA4 = aiko.a(zBx, iB4);
                elkqVar.copyOnWrite();
                elku elkuVar4 = (elku) elkqVar.instance;
                elkuVar4.k = elhs.a(iA4);
                elkuVar4.b |= 256;
                boolean zBk = messagePartCoreData.bk();
                int iB5 = elhs.b(((elku) elkqVar.instance).l);
                if (iB5 == 0) {
                    iB5 = 2;
                }
                int iA5 = aiko.a(zBk, iB5);
                elkqVar.copyOnWrite();
                elku elkuVar5 = (elku) elkqVar.instance;
                elkuVar5.l = elhs.a(iA5);
                elkuVar5.b |= 512;
                boolean zBn = messagePartCoreData.bn();
                int iB6 = elhs.b(((elku) elkqVar.instance).m);
                if (iB6 != 0) {
                    i3 = iB6;
                }
                int iA6 = aiko.a(zBn, i3);
                elkqVar.copyOnWrite();
                elku elkuVar6 = (elku) elkqVar.instance;
                elkuVar6.m = elhs.a(iA6);
                elkuVar6.b |= 1024;
            }
            int i4 = ((bakt) aikoVar.a.b()).c(messageCoreData.A()) == 0 ? 2 : 3;
            elkq elkqVar2 = aikoVar.b;
            elkqVar2.copyOnWrite();
            elku elkuVar7 = (elku) elkqVar2.instance;
            elku elkuVar8 = elku.a;
            elkuVar7.n = i4 - 1;
            elkuVar7.b |= 2048;
            if (messageCoreData.cX()) {
                i3 = 4;
            } else if (messageCoreData.cO()) {
                i3 = 3;
            } else if (true != messageCoreData.dg()) {
                i3 = 1;
            }
            elkqVar2.copyOnWrite();
            elku elkuVar9 = (elku) elkqVar2.instance;
            elkuVar9.p = i3 - 1;
            elkuVar9.b |= 8192;
            final elpq elpqVar = (elpq) elpr.a.createBuilder();
            if (!messageCoreData.C().c()) {
                String strB = messageCoreData.C().b();
                elpqVar.copyOnWrite();
                elpr elprVar = (elpr) elpqVar.instance;
                strB.getClass();
                elprVar.b = 1 | elprVar.b;
                elprVar.c = strB;
            }
            messageCoreData.F().g(new Consumer() { // from class: aikn
                @Override // java.util.function.Consumer
                /* renamed from: accept */
                public final void z(Object obj) {
                    String strF = ((basd) obj).f();
                    elpq elpqVar2 = elpqVar;
                    elpqVar2.copyOnWrite();
                    elpr elprVar2 = (elpr) elpqVar2.instance;
                    elpr elprVar3 = elpr.a;
                    elprVar2.b |= 2;
                    elprVar2.d = strF;
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
            elkq elkqVar3 = aikoVar.b;
            elkqVar3.copyOnWrite();
            elku elkuVar10 = (elku) elkqVar3.instance;
            elpr elprVar2 = (elpr) elpqVar.build();
            elprVar2.getClass();
            elkuVar10.s = elprVar2;
            elkuVar10.b |= 65536;
            aikoVar.c(i2);
            String strJ = j(Optional.of(Integer.valueOf(i2)));
            elkqVar2.copyOnWrite();
            elku elkuVar11 = (elku) elkqVar2.instance;
            strJ.getClass();
            elkuVar11.b |= 32768;
            elkuVar11.r = strJ;
            elku elkuVarB = aikoVar.b();
            ellgVar.copyOnWrite();
            ellh ellhVar = (ellh) ellgVar.instance;
            elkuVarB.getClass();
            ellhVar.v = elkuVarB;
            ellhVar.b |= 16384;
        }
        this.v.k(ellgVar, emxtVar);
    }

    @Override // defpackage.ajhd
    @Deprecated
    public final void R(String str, final int i2, final String str2) {
        final alqm alqmVarU = ((alrj) this.Q.b()).u(str, i2);
        if (!this.x.get()) {
            n();
        } else {
            ((ains) this.U.b()).c("Bugle.VerifiedSms.MessageUnverifiable.Counts");
            auwa.a(new Runnable() { // from class: ajiz
                @Override // java.lang.Runnable
                public final void run() {
                    ellg ellgVar = (ellg) ellh.a.createBuilder();
                    ellf ellfVar = ellf.BUGLE_BUSINESS_MESSAGING_EVENT;
                    ellgVar.copyOnWrite();
                    ellh ellhVar = (ellh) ellgVar.instance;
                    ellhVar.j = ellfVar.f11do;
                    ellhVar.b |= 1;
                    elvh elvhVar = (elvh) elvn.a.createBuilder();
                    elvhVar.copyOnWrite();
                    elvn elvnVar = (elvn) elvhVar.instance;
                    elvnVar.c = 4;
                    elvnVar.b |= 1;
                    elvi elviVar = (elvi) elvl.a.createBuilder();
                    String strB = ejwk.b(alqmVarU.n());
                    elviVar.copyOnWrite();
                    elvl elvlVar = (elvl) elviVar.instance;
                    elvlVar.b |= 1;
                    elvlVar.c = strB;
                    ajjf ajjfVar = this.a;
                    long jC = ((aika) ajjfVar.p.b()).c(str2);
                    elviVar.copyOnWrite();
                    elvl elvlVar2 = (elvl) elviVar.instance;
                    elvlVar2.b |= 8;
                    elvlVar2.f = jC;
                    elvb elvbVar = elvb.NOT_VERIFIABLE;
                    elviVar.copyOnWrite();
                    elvl elvlVar3 = (elvl) elviVar.instance;
                    elvlVar3.e = elvbVar.g;
                    elvlVar3.b = 4 | elvlVar3.b;
                    elpy elpyVarA = ((aimw) ajjfVar.r.b()).a(i2);
                    elviVar.copyOnWrite();
                    elvl elvlVar4 = (elvl) elviVar.instance;
                    elvlVar4.d = elpyVarA;
                    elvlVar4.b |= 2;
                    elvhVar.copyOnWrite();
                    elvn elvnVar2 = (elvn) elvhVar.instance;
                    elvl elvlVar5 = (elvl) elviVar.build();
                    elvlVar5.getClass();
                    elvnVar2.d = elvlVar5;
                    elvnVar2.b |= 2;
                    ellgVar.copyOnWrite();
                    ellh ellhVar2 = (ellh) ellgVar.instance;
                    elvn elvnVar3 = (elvn) elvhVar.build();
                    elvnVar3.getClass();
                    ellhVar2.ai = elvnVar3;
                    ellhVar2.d |= 16;
                    ajjfVar.v.n(ellgVar);
                }
            }, this.z);
        }
    }

    @Override // defpackage.ajhd
    public final void S(elny elnyVar, fhaz fhazVar, ainn ainnVar) {
        LruCache lruCache = this.k;
        synchronized (lruCache) {
            Map concurrentHashMap = (Map) lruCache.get(fhazVar.b);
            if (concurrentHashMap == null) {
                concurrentHashMap = new ConcurrentHashMap();
                lruCache.put(fhazVar.b, concurrentHashMap);
            }
            concurrentHashMap.put(elnyVar, ainnVar);
        }
    }

    @Override // defpackage.ajhd
    public final void T() {
        eygg eyggVar = this.y;
        cqnx.c(eork.f(((aiul) eyggVar.b()).f(-1L), ((aiul) eyggVar.b()).i(-1L)), "BugleUsageStatistics", "Failed to clear downloaded and upload report bytes");
    }

    @Override // defpackage.ajhd
    public final void U(final MessageCoreData messageCoreData) {
        if (messageCoreData.z() != null) {
            auvh.h(messageCoreData.z().f().h(new ejvr() { // from class: ajhf
                @Override // defpackage.ejvr
                public final Object apply(Object obj) {
                    this.a.C.f(messageCoreData);
                    return null;
                }
            }, this.A));
        } else {
            this.C.f(messageCoreData);
        }
    }

    @Override // defpackage.ajhd
    public final void V(boolean z) {
        Instant instantF = this.t.f();
        final long epochMilli = instantF.toEpochMilli();
        eygg eyggVar = this.y;
        ecjh ecjhVar = ((aiul) eyggVar.b()).a;
        ejvr ejvrVarA = eiid.a(new ejvr() { // from class: aitn
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                int i2 = aiul.d;
                aitg aitgVar = (aitg) ((aith) obj).toBuilder();
                aitgVar.copyOnWrite();
                aith aithVar = (aith) aitgVar.instance;
                aithVar.b |= 8;
                aithVar.f = epochMilli;
                return (aith) aitgVar.build();
            }
        });
        eoqg eoqgVar = eoqg.a;
        cqnx.c(eork.f(ecjhVar.b(ejvrVarA, eoqgVar), ((aiul) eyggVar.b()).g(epochMilli)), "BugleUsageStatistics", "Failed to update lastActiveEvent|lastPassiveEvent");
        fcsu fcsuVar = this.K;
        ((ajdy) fcsuVar.b()).g(instantF);
        ((ajdy) fcsuVar.b()).f(instantF);
        if (z) {
            cqnx.c(((aiul) eyggVar.b()).a.b(eiid.a(new ejvr() { // from class: aiuf
                @Override // defpackage.ejvr
                public final Object apply(Object obj) {
                    int i2 = aiul.d;
                    aitg aitgVar = (aitg) ((aith) obj).toBuilder();
                    aitgVar.copyOnWrite();
                    aith aithVar = (aith) aitgVar.instance;
                    aithVar.b |= 128;
                    aithVar.j = epochMilli;
                    return (aith) aitgVar.build();
                }
            }), eoqgVar), "BugleUsageStatistics", "Failed to update LastActiveRcsEventTimeMillis");
            ((ajdy) fcsuVar.b()).h(instantF);
        }
    }

    @Override // defpackage.ajhd
    public final void W() {
        ((crqv) this.V.b()).k("last_rbm_active_event_time_millis", this.t.f().toEpochMilli());
    }

    @Override // defpackage.ajhd
    public final void X() {
        ((crqv) this.V.b()).k("last_rbm_interactive_event_time_millis", this.t.f().toEpochMilli());
    }

    @Override // defpackage.ajhd
    public final boolean Y() {
        return this.x.get();
    }

    @Override // defpackage.ajhd
    public final void Z(int i2, int i3, int i4, long j2, int i5, long j3, ConversationIdType conversationIdType) {
        aP(-1, i2, i3, j2, i5, i4, j3, true, conversationIdType);
    }

    @Override // defpackage.ajhd, defpackage.dhem
    public final void a(ewke ewkeVar) {
        if (((Boolean) g.e()).booleanValue()) {
            return;
        }
        eieh eiehVarC = this.ag.c("UsageStatistics dispatchSimEventDelay", "com/google/android/apps/messaging/shared/analytics/statistics/UsageStatisticsImpl", "dispatchSimEventDelay", 4744);
        try {
            if (this.x.get()) {
                ellg ellgVar = (ellg) ellh.a.createBuilder();
                ellf ellfVar = ellf.BUGLE_TELEPHONY_EVENT;
                ellgVar.copyOnWrite();
                ellh ellhVar = (ellh) ellgVar.instance;
                ellhVar.j = ellfVar.f11do;
                ellhVar.b |= 1;
                ewkq ewkqVar = (ewkq) ewkr.a.createBuilder();
                ewkqVar.copyOnWrite();
                ewkr ewkrVar = (ewkr) ewkqVar.instance;
                ewkeVar.getClass();
                ewkrVar.c = ewkeVar;
                ewkrVar.b = 2;
                ellgVar.copyOnWrite();
                ellh ellhVar2 = (ellh) ellgVar.instance;
                ewkr ewkrVar2 = (ewkr) ewkqVar.build();
                ewkrVar2.getClass();
                ellhVar2.z = ewkrVar2;
                ellhVar2.b |= 1048576;
                this.v.j(ellgVar);
            } else {
                n();
            }
            eiehVarC.close();
        } catch (Throwable th) {
            try {
                eiehVarC.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final List aA(ConversationIdType conversationIdType) {
        return !conversationIdType.b() ? ((aixq) this.ab.b()).d(((bakt) this.m.b()).K(conversationIdType)) : ekgb.r(elns.UNKNOWN_FORMAT);
    }

    public final void aB(MessageCoreData messageCoreData, elof elofVar) {
        elwa elwaVar;
        if (messageCoreData != null) {
            Optional optionalAg = messageCoreData.ag();
            if (optionalAg.isEmpty()) {
                elvw elvwVar = (elvw) elwa.a.createBuilder();
                elvwVar.copyOnWrite();
                elwa elwaVar2 = (elwa) elvwVar.instance;
                elwaVar2.c = 1;
                elwaVar2.b = 1;
                elwaVar = (elwa) elvwVar.build();
            } else {
                Optional optionalJ = ((dggz) this.ak.b()).j(((dggl) this.al.b()).a(((aubq) optionalAg.get()).d));
                if (optionalJ.isEmpty()) {
                    elvw elvwVar2 = (elvw) elwa.a.createBuilder();
                    elvwVar2.copyOnWrite();
                    elwa elwaVar3 = (elwa) elvwVar2.instance;
                    elwaVar3.c = 2;
                    elwaVar3.b = 1;
                    elwaVar = (elwa) elvwVar2.build();
                } else {
                    Optional optionalV = ((dgiq) optionalJ.get()).v();
                    if (optionalV.isEmpty() || ((String) optionalV.get()).isEmpty()) {
                        elvw elvwVar3 = (elvw) elwa.a.createBuilder();
                        elvwVar3.copyOnWrite();
                        elwa elwaVar4 = (elwa) elvwVar3.instance;
                        elwaVar4.c = 3;
                        elwaVar4.b = 1;
                        elwaVar = (elwa) elvwVar3.build();
                    } else {
                        elvw elvwVar4 = (elvw) elwa.a.createBuilder();
                        elvy elvyVar = (elvy) elvz.a.createBuilder();
                        String str = (String) optionalV.get();
                        elvyVar.copyOnWrite();
                        elvz elvzVar = (elvz) elvyVar.instance;
                        elvzVar.b = 1 | elvzVar.b;
                        elvzVar.c = str;
                        elvwVar4.copyOnWrite();
                        elwa elwaVar5 = (elwa) elvwVar4.instance;
                        elvz elvzVar2 = (elvz) elvyVar.build();
                        elvzVar2.getClass();
                        elwaVar5.c = elvzVar2;
                        elwaVar5.b = 2;
                        elwaVar = (elwa) elvwVar4.build();
                    }
                }
            }
            elofVar.copyOnWrite();
            elpg elpgVar = (elpg) elofVar.instance;
            evsy evsyVar = elpg.a;
            elwaVar.getClass();
            elpgVar.aB = elwaVar;
            elpgVar.e |= 524288;
        }
    }

    public final void aC(long j2, String str) {
        ((ains) this.U.b()).e(str, elgz.a(cqmf.a(j2)));
    }

    public final boolean aE(MessageCoreData messageCoreData) {
        return this.ai.a() && messageCoreData.da();
    }

    /* JADX WARN: Removed duplicated region for block: B:59:0x01ec  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void aG(final com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData r43, final int r44, final defpackage.ainn r45, defpackage.elof r46) {
        /*
            Method dump skipped, instructions count: 1058
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ajjf.aG(com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData, int, ainn, elof):void");
    }

    public final int aH(Instant instant) {
        long epochMilli = this.t.f().toEpochMilli() - instant.toEpochMilli();
        if (epochMilli < TimeUnit.SECONDS.toMillis(1L)) {
            return 2;
        }
        if (epochMilli < TimeUnit.SECONDS.toMillis(2L)) {
            return 3;
        }
        if (epochMilli < TimeUnit.SECONDS.toMillis(5L)) {
            return 4;
        }
        if (epochMilli < TimeUnit.SECONDS.toMillis(10L)) {
            return 5;
        }
        if (epochMilli < TimeUnit.SECONDS.toMillis(30L)) {
            return 6;
        }
        if (epochMilli < TimeUnit.MINUTES.toMillis(1L)) {
            return 7;
        }
        if (epochMilli < TimeUnit.MINUTES.toMillis(5L)) {
            return 8;
        }
        if (epochMilli < TimeUnit.MINUTES.toMillis(30L)) {
            return 9;
        }
        if (epochMilli < TimeUnit.HOURS.toMillis(1L)) {
            return 10;
        }
        if (epochMilli < TimeUnit.HOURS.toMillis(2L)) {
            return 11;
        }
        if (epochMilli < TimeUnit.HOURS.toMillis(5L)) {
            return 12;
        }
        if (epochMilli < TimeUnit.HOURS.toMillis(12L) + TimeUnit.MINUTES.toMillis(1L)) {
            return 13;
        }
        return epochMilli < TimeUnit.HOURS.toMillis(13L) ? 14 : 15;
    }

    public final void aI(MessageCoreData messageCoreData, int i2, enxu enxuVar, elof elofVar) {
        String strB;
        long jT = messageCoreData != null ? messageCoreData.t() : -1L;
        int iAw = aw(messageCoreData);
        fcsu fcsuVar = this.G;
        ((ajjo) fcsuVar.b()).f(elofVar, iAw);
        elvt elvtVar = (elvt) elvv.a.createBuilder();
        int iD = d();
        elvtVar.copyOnWrite();
        elvv elvvVar = (elvv) elvtVar.instance;
        elvvVar.b |= 1;
        elvvVar.c = iD;
        String strE = ((ajjo) fcsuVar.b()).e();
        elvtVar.copyOnWrite();
        elvv elvvVar2 = (elvv) elvtVar.instance;
        strE.getClass();
        elvvVar2.b |= 4;
        elvvVar2.e = strE;
        elvv elvvVar3 = (elvv) elvtVar.build();
        elofVar.copyOnWrite();
        elpg elpgVar = (elpg) elofVar.instance;
        evsy evsyVar = elpg.a;
        elvvVar3.getClass();
        elpgVar.y = elvvVar3;
        elpgVar.c |= 4194304;
        elofVar.copyOnWrite();
        elpg elpgVar2 = (elpg) elofVar.instance;
        elpgVar2.c |= 128;
        elpgVar2.o = jT;
        int iF = ((crlk) this.Y.b()).f();
        elofVar.copyOnWrite();
        elpg elpgVar3 = (elpg) elofVar.instance;
        elpgVar3.A = iF - 1;
        elpgVar3.c |= 16777216;
        if (messageCoreData != null && i2 == 3) {
            ajfn ajfnVar = this.C;
            elnm elnmVarB = ajfnVar.b(messageCoreData.C().b());
            elofVar.copyOnWrite();
            elpg elpgVar4 = (elpg) elofVar.instance;
            elpgVar4.u = elnmVarB.d;
            elpgVar4.c |= 131072;
            elnu elnuVarC = ajfnVar.c(messageCoreData.C().b());
            elofVar.copyOnWrite();
            elpg elpgVar5 = (elpg) elofVar.instance;
            elpgVar5.w = elnuVarC.p;
            elpgVar5.c |= 524288;
            elpl elplVarK = ((ajjo) fcsuVar.b()).k(messageCoreData.M(), 10);
            elofVar.copyOnWrite();
            elpg elpgVar6 = (elpg) elofVar.instance;
            elplVarK.getClass();
            elpgVar6.k = elplVarK;
            elpgVar6.c |= 8;
        }
        if (messageCoreData != null) {
            int iC = ajhe.c(messageCoreData);
            elofVar.copyOnWrite();
            elpg elpgVar7 = (elpg) elofVar.instance;
            elpgVar7.Q = iC - 1;
            elpgVar7.d |= 16384;
        }
        if (messageCoreData != null && (strB = messageCoreData.C().b()) != null) {
            elke elkeVarA = ajhe.a(this.C.e(strB));
            elofVar.copyOnWrite();
            elpg elpgVar8 = (elpg) elofVar.instance;
            elpgVar8.s = elkeVarA.f;
            elpgVar8.c |= 16384;
        }
        if (enxuVar != null) {
            elofVar.copyOnWrite();
            elpg elpgVar9 = (elpg) elofVar.instance;
            elpgVar9.M = enxuVar;
            elpgVar9.d |= 1024;
        }
        eloi eloiVar = eloi.EMOJI_STATUS_NA;
        elofVar.copyOnWrite();
        elpg elpgVar10 = (elpg) elofVar.instance;
        elpgVar10.E = eloiVar.g;
        elpgVar10.c |= VCardConfig.FLAG_REFRAIN_QP_TO_NAME_PROPERTIES;
        elofVar.copyOnWrite();
        elpg elpgVar11 = (elpg) elofVar.instance;
        elpgVar11.F = 12;
        elpgVar11.c |= 536870912;
        elnw elnwVar = elnw.UNKNOWN_RESEND_ATTEMPT;
        elofVar.copyOnWrite();
        elpg elpgVar12 = (elpg) elofVar.instance;
        elpgVar12.t = elnwVar.d;
        elpgVar12.c |= 65536;
        eloe eloeVar = eloe.WAS_RCS_CONVERSATION;
        elofVar.copyOnWrite();
        elpg elpgVar13 = (elpg) elofVar.instance;
        elpgVar13.v = eloeVar.d;
        elpgVar13.c |= 262144;
        elofVar.copyOnWrite();
        elpg elpgVar14 = (elpg) elofVar.instance;
        elpgVar14.B = 15;
        elpgVar14.c |= VCardConfig.FLAG_REFRAIN_PHONE_NUMBER_FORMATTING;
        emig emigVar = emig.REPLY;
        elofVar.copyOnWrite();
        elpg elpgVar15 = (elpg) elofVar.instance;
        elpgVar15.D = emigVar.d;
        elpgVar15.c |= VCardConfig.FLAG_CONVERT_PHONETIC_NAME_STRINGS;
        ellg ellgVar = (ellg) ellh.a.createBuilder();
        ellf ellfVar = ellf.BUGLE_MESSAGE;
        ellgVar.copyOnWrite();
        ellh ellhVar = (ellh) ellgVar.instance;
        ellhVar.j = ellfVar.f11do;
        ellhVar.b |= 1;
        ellgVar.copyOnWrite();
        ellh ellhVar2 = (ellh) ellgVar.instance;
        elpg elpgVar16 = (elpg) elofVar.build();
        elpgVar16.getClass();
        ellhVar2.l = elpgVar16;
        ellhVar2.b |= 4;
        this.w.a().j(ellgVar, aioj.LOG_SPEC_MESSAGE_DELIVERY_NORTHSTAR_EVENTS);
    }

    public final void aJ(MessageCoreData messageCoreData, int i2, int i3, int i4, int i5, int i6, enxu enxuVar, int i7, int i8, Optional optional, Optional optional2, Optional optional3, Optional optional4) {
        String strB = messageCoreData.C().b();
        ajfn ajfnVar = this.C;
        Integer numE = ajfnVar.e(strB);
        ajhc ajhcVarA = ajfnVar.a(strB);
        elvt elvtVar = (elvt) elvv.a.createBuilder();
        int iD = d();
        elvtVar.copyOnWrite();
        elvv elvvVar = (elvv) elvtVar.instance;
        elvvVar.b |= 1;
        elvvVar.c = iD;
        fcsu fcsuVar = this.G;
        String strE = ((ajjo) fcsuVar.b()).e();
        elvtVar.copyOnWrite();
        elvv elvvVar2 = (elvv) elvtVar.instance;
        strE.getClass();
        elvvVar2.b |= 4;
        elvvVar2.e = strE;
        elvv elvvVar3 = (elvv) elvtVar.build();
        elho elhoVarB = ((aixn) this.q.b()).b(i2);
        int iD2 = ajhe.d(messageCoreData.d());
        final elof elofVar = (elof) elpg.b.createBuilder();
        long jB = ((aika) this.p.b()).b(messageCoreData.A());
        elofVar.copyOnWrite();
        elpg elpgVar = (elpg) elofVar.instance;
        elpgVar.c |= 1073741824;
        elpgVar.G = jB;
        long jT = messageCoreData.t();
        elofVar.copyOnWrite();
        elpg elpgVar2 = (elpg) elofVar.instance;
        elpgVar2.c |= 128;
        elpgVar2.o = jT;
        elofVar.copyOnWrite();
        elpg elpgVar3 = (elpg) elofVar.instance;
        elpgVar3.h = iD2 - 1;
        elpgVar3.c |= 1;
        elofVar.copyOnWrite();
        elpg elpgVar4 = (elpg) elofVar.instance;
        elpgVar4.i = i6 - 1;
        elpgVar4.c |= 2;
        elpy elpyVarA = ((aimw) this.r.b()).a(i2);
        elofVar.copyOnWrite();
        elpg elpgVar5 = (elpg) elofVar.instance;
        elpgVar5.j = elpyVarA;
        elpgVar5.c |= 4;
        String strJ = j(Optional.of(Integer.valueOf(i2)));
        elofVar.copyOnWrite();
        elpg elpgVar6 = (elpg) elofVar.instance;
        strJ.getClass();
        elpgVar6.d |= 1;
        elpgVar6.J = strJ;
        elofVar.copyOnWrite();
        elpg elpgVar7 = (elpg) elofVar.instance;
        elvvVar3.getClass();
        elpgVar7.y = elvvVar3;
        elpgVar7.c |= 4194304;
        elofVar.copyOnWrite();
        elpg elpgVar8 = (elpg) elofVar.instance;
        elhoVarB.getClass();
        elpgVar8.S = elhoVarB;
        elpgVar8.d |= 65536;
        elvg elvgVar = cqbe.a;
        elofVar.copyOnWrite();
        elpg elpgVar9 = (elpg) elofVar.instance;
        elpgVar9.L = elvgVar.x;
        elpgVar9.d |= 512;
        int iC = ajhe.c(messageCoreData);
        elofVar.copyOnWrite();
        elpg elpgVar10 = (elpg) elofVar.instance;
        elpgVar10.Q = iC - 1;
        elpgVar10.d |= 16384;
        elofVar.copyOnWrite();
        elpg elpgVar11 = (elpg) elofVar.instance;
        elpgVar11.W = i7 - 1;
        elpgVar11.d |= 524288;
        aB(messageCoreData, elofVar);
        elofVar.a(aA(messageCoreData.A()));
        if (aE(messageCoreData)) {
            optional4.ifPresent(new Consumer() { // from class: ajip
                @Override // java.util.function.Consumer
                /* renamed from: accept */
                public final void z(Object obj) {
                    elof elofVar2 = elofVar;
                    elofVar2.copyOnWrite();
                    elpg elpgVar12 = (elpg) elofVar2.instance;
                    evsy evsyVar = elpg.a;
                    elpgVar12.ay = ((elpa) obj).e;
                    elpgVar12.e |= 65536;
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
        }
        if (messageCoreData.aJ() != null) {
            fhaz fhazVarAJ = messageCoreData.aJ();
            fhazVarAJ.getClass();
            elofVar.copyOnWrite();
            elpg elpgVar12 = (elpg) elofVar.instance;
            elpgVar12.p = fhazVarAJ;
            elpgVar12.c |= 1024;
        }
        ((ajjo) fcsuVar.b()).j(messageCoreData, elofVar, optional);
        optional2.ifPresent(new ajhk(elofVar));
        optional3.ifPresent(new Consumer() { // from class: ajir
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void z(Object obj) {
                long j2 = ajjf.h;
                embl emblVar = (embl) embp.a.createBuilder();
                emblVar.copyOnWrite();
                embp embpVar = (embp) emblVar.instance;
                embpVar.c = ((embo) obj).n;
                embpVar.b |= 1;
                embp embpVar2 = (embp) emblVar.build();
                elof elofVar2 = elofVar;
                elofVar2.copyOnWrite();
                elpg elpgVar13 = (elpg) elofVar2.instance;
                evsy evsyVar = elpg.a;
                embpVar2.getClass();
                elpgVar13.al = embpVar2;
                elpgVar13.e |= 8;
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
        elpf elpfVar = (elpf) this.H.fM(messageCoreData.P());
        elofVar.copyOnWrite();
        elpg elpgVar13 = (elpg) elofVar.instance;
        elpgVar13.an = elpfVar.h;
        elpgVar13.e |= 32;
        elnw elnwVarD = ajfnVar.d(messageCoreData.C().b());
        elofVar.copyOnWrite();
        elpg elpgVar14 = (elpg) elofVar.instance;
        elpgVar14.t = elnwVarD.d;
        elpgVar14.c |= 65536;
        ((ajjo) fcsuVar.b()).h(messageCoreData, elofVar);
        if (messageCoreData.F() != null) {
            messageCoreData.F().g(new Consumer() { // from class: ajis
                @Override // java.util.function.Consumer
                /* renamed from: accept */
                public final void z(Object obj) {
                    long j2 = ajjf.h;
                    String strF = ((basd) obj).f();
                    elof elofVar2 = elofVar;
                    elofVar2.copyOnWrite();
                    elpg elpgVar15 = (elpg) elofVar2.instance;
                    evsy evsyVar = elpg.a;
                    elpgVar15.c |= Integer.MIN_VALUE;
                    elpgVar15.H = strF;
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
            aD(elofVar, messageCoreData);
        }
        ((ajjo) fcsuVar.b()).f(elofVar, i2);
        if (aE(messageCoreData)) {
            messageCoreData.B().g(new Consumer() { // from class: ajit
                @Override // java.util.function.Consumer
                /* renamed from: accept */
                public final void z(Object obj) {
                    long j2 = ajjf.h;
                    String strF = ((baro) obj).f();
                    elof elofVar2 = elofVar;
                    elofVar2.copyOnWrite();
                    elpg elpgVar15 = (elpg) elofVar2.instance;
                    evsy evsyVar = elpg.a;
                    elpgVar15.e |= 512;
                    elpgVar15.ar = strF;
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
        }
        ((ajjo) fcsuVar.b()).l(elofVar, iD2, i6, i2);
        if (numE != null) {
            elke elkeVarA = ajhe.a(numE);
            elofVar.copyOnWrite();
            elpg elpgVar15 = (elpg) elofVar.instance;
            elpgVar15.s = elkeVarA.f;
            elpgVar15.c |= 16384;
            cqbd cqbdVarA = i.a();
            elke elkeVarB = elke.b(((elpg) elofVar.instance).s);
            if (elkeVarB == null) {
                elkeVarB = elke.UNKNOWN_BUGLE_CONVERSATION_TYPE;
            }
            cqbdVarA.A("messageConversationType", elkeVarB);
            cqbdVarA.r();
        }
        if (ajhe.d(messageCoreData.d()) == 3) {
            elpv elpvVarAF = aF(ajhe.b(i3), i4, i3, messageCoreData.f(), i8);
            elofVar.copyOnWrite();
            elpg elpgVar16 = (elpg) elofVar.instance;
            elpvVarAF.getClass();
            elpgVar16.g = elpvVarAF;
            elpgVar16.f = 7;
            elpv elpvVar = (elpv) elpgVar16.g;
            elho elhoVar = elpgVar16.S;
            if (elhoVar == null) {
                elhoVar = elho.b;
            }
            aR(elpvVar, i4, elhoVar);
        }
        if (ajhe.d(messageCoreData.d()) == 4) {
            elrr elrrVar = (elrr) elrs.a.createBuilder();
            int iF = messageCoreData.f();
            elrrVar.copyOnWrite();
            elrs elrsVar = (elrs) elrrVar.instance;
            elrsVar.b |= 1;
            elrsVar.c = iF;
            elrs elrsVar2 = (elrs) elrrVar.build();
            elofVar.copyOnWrite();
            elpg elpgVar17 = (elpg) elofVar.instance;
            elrsVar2.getClass();
            elpgVar17.g = elrsVar2;
            elpgVar17.f = 60;
        }
        if (ajhcVarA != null) {
            elpl elplVarK = ((ajjo) fcsuVar.b()).k(messageCoreData.M(), i6);
            elofVar.copyOnWrite();
            elpg elpgVar18 = (elpg) elofVar.instance;
            elplVarK.getClass();
            elpgVar18.k = elplVarK;
            elpgVar18.c |= 8;
        }
        if (i6 == 6) {
            if (ajhcVarA != null) {
                elofVar.copyOnWrite();
                elpg elpgVar19 = (elpg) elofVar.instance;
                elpgVar19.n = ajhcVarA.a.M;
                elpgVar19.c |= 64;
            }
            int iAH = aH(messageCoreData.ad());
            elofVar.copyOnWrite();
            elpg elpgVar20 = (elpg) elofVar.instance;
            elpgVar20.B = iAH - 1;
            elpgVar20.c |= VCardConfig.FLAG_REFRAIN_PHONE_NUMBER_FORMATTING;
            if (ajhe.d(messageCoreData.d()) == 2) {
                eltn eltnVar = (eltn) eltq.a.createBuilder();
                eltnVar.copyOnWrite();
                eltq eltqVar = (eltq) eltnVar.instance;
                eltqVar.b |= 1;
                eltqVar.c = i5;
                elis elisVar = (elis) elit.a.createBuilder();
                elisVar.copyOnWrite();
                elit elitVar = (elit) elisVar.instance;
                elitVar.b |= 1;
                elitVar.c = i3;
                eltnVar.copyOnWrite();
                eltq eltqVar2 = (eltq) eltnVar.instance;
                elit elitVar2 = (elit) elisVar.build();
                elitVar2.getClass();
                eltqVar2.d = elitVar2;
                eltqVar2.b |= 2;
                eltp eltpVarAL = aL(i2);
                eltnVar.copyOnWrite();
                eltq eltqVar3 = (eltq) eltnVar.instance;
                eltqVar3.e = eltpVarAL.e;
                eltqVar3.b |= 4;
                eltq eltqVar4 = (eltq) eltnVar.build();
                elofVar.copyOnWrite();
                elpg elpgVar21 = (elpg) elofVar.instance;
                eltqVar4.getClass();
                elpgVar21.g = eltqVar4;
                elpgVar21.f = 41;
                eltq eltqVar5 = (eltq) elpgVar21.g;
                elho elhoVar2 = elpgVar21.S;
                if (elhoVar2 == null) {
                    elhoVar2 = elho.b;
                }
                aU(eltqVar5, elhoVar2);
            }
        }
        if (enxuVar != null) {
            elofVar.copyOnWrite();
            elpg elpgVar22 = (elpg) elofVar.instance;
            elpgVar22.M = enxuVar;
            elpgVar22.d |= 1024;
        }
        ((aiup) this.D.b()).a(elofVar, messageCoreData, numE != null ? numE.intValue() : 0);
        ((ajjo) fcsuVar.b()).g(elofVar);
        if (((aquo) this.L.b()).a()) {
            ((ccww) this.M.b()).a(elofVar, messageCoreData);
        }
        ellg ellgVar = (ellg) ellh.a.createBuilder();
        ellf ellfVar = ellf.BUGLE_MESSAGE;
        ellgVar.copyOnWrite();
        ellh ellhVar = (ellh) ellgVar.instance;
        ellhVar.j = ellfVar.f11do;
        ellhVar.b |= 1;
        ellgVar.copyOnWrite();
        ellh ellhVar2 = (ellh) ellgVar.instance;
        elpg elpgVar23 = (elpg) elofVar.build();
        elpgVar23.getClass();
        ellhVar2.l = elpgVar23;
        ellhVar2.b |= 4;
        this.w.a().j(ellgVar, aioj.LOG_SPEC_MESSAGE_DELIVERY_NORTHSTAR_EVENTS);
        ajdy ajdyVar = (ajdy) this.K.b();
        ejaa.a(fdjy.b(eicg.a(ajdyVar.b.hE())), ajdyVar.c, new ajde(null, ajdyVar, ajdyVar.d.a()));
    }

    public final void aK(MessageCoreData messageCoreData, int i2, enyw enywVar, int i3, int i4) {
        elny elnyVar;
        if (!this.x.get()) {
            n();
            return;
        }
        if (messageCoreData == null || messageCoreData.F().i()) {
            return;
        }
        ajfn ajfnVar = this.C;
        ajfnVar.f(messageCoreData);
        String strB = messageCoreData.C().b();
        ajhc ajhcVarA = ajfnVar.a(strB);
        eltz eltzVar = (eltz) elua.a.createBuilder();
        long epochMilli = this.t.f().toEpochMilli();
        eltzVar.copyOnWrite();
        elua eluaVar = (elua) eltzVar.instance;
        eluaVar.b |= 1;
        eluaVar.c = epochMilli;
        long jR = eluaVar.d - messageCoreData.r();
        eltzVar.copyOnWrite();
        elua eluaVar2 = (elua) eltzVar.instance;
        eluaVar2.b |= 2;
        eluaVar2.d = jR;
        elvt elvtVar = (elvt) elvv.a.createBuilder();
        int iD = d();
        elvtVar.copyOnWrite();
        elvv elvvVar = (elvv) elvtVar.instance;
        elvvVar.b |= 1;
        elvvVar.c = iD;
        fcsu fcsuVar = this.G;
        String strE = ((ajjo) fcsuVar.b()).e();
        elvtVar.copyOnWrite();
        elvv elvvVar2 = (elvv) elvtVar.instance;
        strE.getClass();
        elvvVar2.b |= 4;
        elvvVar2.e = strE;
        elvv elvvVar3 = (elvv) elvtVar.build();
        enwr enwrVarAz = az(i3);
        final elof elofVar = (elof) elpg.b.createBuilder();
        long jT = messageCoreData.t();
        elofVar.copyOnWrite();
        elpg elpgVar = (elpg) elofVar.instance;
        elpgVar.c |= 128;
        elpgVar.o = jT;
        long jB = ((aika) this.p.b()).b(messageCoreData.A());
        elofVar.copyOnWrite();
        elpg elpgVar2 = (elpg) elofVar.instance;
        elpgVar2.c |= 1073741824;
        elpgVar2.G = jB;
        eloe eloeVar = eloe.WAS_RCS_CONVERSATION;
        elofVar.copyOnWrite();
        elpg elpgVar3 = (elpg) elofVar.instance;
        elpgVar3.v = eloeVar.d;
        elpgVar3.c |= 262144;
        elofVar.copyOnWrite();
        elpg elpgVar4 = (elpg) elofVar.instance;
        elpgVar4.i = 11;
        elpgVar4.c |= 2;
        elofVar.copyOnWrite();
        elpg elpgVar5 = (elpg) elofVar.instance;
        elpgVar5.as = i4 - 1;
        elpgVar5.e |= 1024;
        int iD2 = ajhe.d(i2);
        elofVar.copyOnWrite();
        elpg elpgVar6 = (elpg) elofVar.instance;
        elpgVar6.h = iD2 - 1;
        elpgVar6.c |= 1;
        elofVar.copyOnWrite();
        elpg elpgVar7 = (elpg) elofVar.instance;
        elua eluaVar3 = (elua) eltzVar.build();
        eluaVar3.getClass();
        elpgVar7.l = eluaVar3;
        elpgVar7.c |= 16;
        elpl elplVarK = ((ajjo) fcsuVar.b()).k(messageCoreData.M(), 12);
        elofVar.copyOnWrite();
        elpg elpgVar8 = (elpg) elofVar.instance;
        elplVarK.getClass();
        elpgVar8.k = elplVarK;
        elpgVar8.c |= 8;
        elpy elpyVarA = ((aimw) this.r.b()).a(i3);
        elofVar.copyOnWrite();
        elpg elpgVar9 = (elpg) elofVar.instance;
        elpgVar9.j = elpyVarA;
        elpgVar9.c |= 4;
        String strJ = j(Optional.of(Integer.valueOf(i3)));
        elofVar.copyOnWrite();
        elpg elpgVar10 = (elpg) elofVar.instance;
        strJ.getClass();
        elpgVar10.d |= 1;
        elpgVar10.J = strJ;
        elnm elnmVarB = ajfnVar.b(strB);
        elofVar.copyOnWrite();
        elpg elpgVar11 = (elpg) elofVar.instance;
        elpgVar11.u = elnmVarB.d;
        elpgVar11.c |= 131072;
        elnu elnuVarC = ajfnVar.c(strB);
        elofVar.copyOnWrite();
        elpg elpgVar12 = (elpg) elofVar.instance;
        elpgVar12.w = elnuVarC.p;
        elpgVar12.c |= 524288;
        elofVar.copyOnWrite();
        elpg elpgVar13 = (elpg) elofVar.instance;
        elpgVar13.x = enwrVarAz.N;
        elpgVar13.c |= 1048576;
        elofVar.copyOnWrite();
        elpg elpgVar14 = (elpg) elofVar.instance;
        elvvVar3.getClass();
        elpgVar14.y = elvvVar3;
        elpgVar14.c |= 4194304;
        int iF = ((crlk) this.Y.b()).f();
        elofVar.copyOnWrite();
        elpg elpgVar15 = (elpg) elofVar.instance;
        elpgVar15.A = iF - 1;
        elpgVar15.c |= 16777216;
        elvg elvgVar = cqbe.a;
        elofVar.copyOnWrite();
        elpg elpgVar16 = (elpg) elofVar.instance;
        elpgVar16.L = elvgVar.x;
        elpgVar16.d |= 512;
        int iC = ajhe.c(messageCoreData);
        elofVar.copyOnWrite();
        elpg elpgVar17 = (elpg) elofVar.instance;
        elpgVar17.Q = iC - 1;
        elpgVar17.d |= 16384;
        elofVar.copyOnWrite();
        elpg elpgVar18 = (elpg) elofVar.instance;
        elpgVar18.Y = enywVar.h;
        elpgVar18.d |= 2097152;
        aB(messageCoreData, elofVar);
        if (ajhcVarA != null && (elnyVar = ajhcVarA.a) != null) {
            elofVar.copyOnWrite();
            elpg elpgVar19 = (elpg) elofVar.instance;
            elpgVar19.n = elnyVar.M;
            elpgVar19.c |= 64;
        }
        ((ajjo) fcsuVar.b()).h(messageCoreData, elofVar);
        if (((aquo) this.L.b()).a()) {
            ((ccww) this.M.b()).a(elofVar, messageCoreData);
        }
        messageCoreData.F().g(new Consumer() { // from class: ajid
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void z(Object obj) {
                long j2 = ajjf.h;
                String strF = ((basd) obj).f();
                elof elofVar2 = elofVar;
                elofVar2.copyOnWrite();
                elpg elpgVar20 = (elpg) elofVar2.instance;
                evsy evsyVar = elpg.a;
                elpgVar20.c |= Integer.MIN_VALUE;
                elpgVar20.H = strF;
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
        ellg ellgVar = (ellg) ellh.a.createBuilder();
        ellf ellfVar = ellf.BUGLE_MESSAGE;
        ellgVar.copyOnWrite();
        ellh ellhVar = (ellh) ellgVar.instance;
        ellhVar.j = ellfVar.f11do;
        ellhVar.b |= 1;
        ellgVar.copyOnWrite();
        ellh ellhVar2 = (ellh) ellgVar.instance;
        elpg elpgVar20 = (elpg) elofVar.build();
        elpgVar20.getClass();
        ellhVar2.l = elpgVar20;
        ellhVar2.b |= 4;
        this.w.a().j(ellgVar, aioj.LOG_SPEC_MESSAGE_DELIVERY_NORTHSTAR_EVENTS);
    }

    @Override // defpackage.ajhd
    public final void aa(basd basdVar, enxu enxuVar, enyw enywVar) {
        aX(basdVar, null, 1, 14, enxuVar, enywVar, elny.INCOMING_BLOCKED_USER);
    }

    @Override // defpackage.ajhd
    public final void ab(MessageCoreData messageCoreData, Optional optional, enyw enywVar, ainn ainnVar) {
        if (ajhe.d(messageCoreData.d()) != 4) {
            new ajeo(messageCoreData, "");
        }
        aY(messageCoreData, 10, optional, Optional.of(enywVar), ainnVar);
    }

    @Override // defpackage.ajhd
    public final void ac(NotificationChannel notificationChannel, NotificationChannel notificationChannel2) {
        if (notificationChannel == null || notificationChannel2 == null) {
            i.r("Before channel or after channel is null.");
            return;
        }
        if (notificationChannel.getId() == null || !notificationChannel.getId().equals(notificationChannel2.getId())) {
            i.r("Before channel does not match after channel.");
            return;
        }
        if (notificationChannel.getImportance() != notificationChannel2.getImportance()) {
            int importance = notificationChannel2.getImportance();
            int i2 = 2;
            if (importance != 1) {
                if (importance != 2) {
                    i2 = 4;
                    if (importance != 3) {
                        i2 = importance != 4 ? 1 : 5;
                    }
                } else {
                    i2 = 3;
                }
            }
            ((ains) this.U.b()).e("Bugle.UI.PeopleAndOptions.Notification.Setting.Changes", i2);
        }
        Uri sound = notificationChannel.getSound();
        Uri sound2 = notificationChannel2.getSound();
        if (sound == null) {
            if (sound2 == null) {
                sound2 = null;
                if (sound != null) {
                }
            }
            ((ains) this.U.b()).e("Bugle.UI.PeopleAndOptions.Notification.Setting.Changes", 6);
        } else if (sound != null && !sound.equals(sound2)) {
            ((ains) this.U.b()).e("Bugle.UI.PeopleAndOptions.Notification.Setting.Changes", 6);
        }
        if (notificationChannel.shouldVibrate() != notificationChannel2.shouldVibrate()) {
            ((ains) this.U.b()).e("Bugle.UI.PeopleAndOptions.Notification.Setting.Changes", true != notificationChannel2.shouldVibrate() ? 8 : 7);
        }
        if (notificationChannel.canShowBadge() != notificationChannel2.canShowBadge()) {
            ((ains) this.U.b()).e("Bugle.UI.PeopleAndOptions.Notification.Setting.Changes", true != notificationChannel2.canShowBadge() ? 10 : 9);
        }
        if (notificationChannel.canBypassDnd() != notificationChannel2.canBypassDnd()) {
            ((ains) this.U.b()).e("Bugle.UI.PeopleAndOptions.Notification.Setting.Changes", true != notificationChannel2.canBypassDnd() ? 12 : 11);
        }
    }

    @Override // defpackage.ajhd
    public final int ad() {
        Context context = this.ae;
        ApplicationInfo applicationInfoB = dhka.b(context);
        if (applicationInfoB == null) {
            return 1;
        }
        if (!dhka.j(applicationInfoB.flags)) {
            return 3;
        }
        if (applicationInfoB.enabled) {
            return !dhky.b(context) ? 5 : 2;
        }
        return 4;
    }

    @Override // defpackage.ajhd
    @Deprecated
    public final void ae(int i2) {
        if (!this.x.get()) {
            n();
            return;
        }
        ellg ellgVar = (ellg) ellh.a.createBuilder();
        ellf ellfVar = ellf.BUGLE_CONTACT_BANNER;
        ellgVar.copyOnWrite();
        ellh ellhVar = (ellh) ellgVar.instance;
        ellhVar.j = ellfVar.f11do;
        ellhVar.b |= 1;
        eljq eljqVar = (eljq) eljr.a.createBuilder();
        elwg elwgVar = (elwg) elwh.a.createBuilder();
        elwgVar.copyOnWrite();
        elwh elwhVar = (elwh) elwgVar.instance;
        elwhVar.c = i2 - 1;
        elwhVar.b |= 1;
        eljqVar.copyOnWrite();
        eljr eljrVar = (eljr) eljqVar.instance;
        elwh elwhVar2 = (elwh) elwgVar.build();
        elwhVar2.getClass();
        eljrVar.c = elwhVar2;
        eljrVar.b = 2;
        ellgVar.copyOnWrite();
        ellh ellhVar2 = (ellh) ellgVar.instance;
        eljr eljrVar2 = (eljr) eljqVar.build();
        eljrVar2.getClass();
        ellhVar2.E = eljrVar2;
        ellhVar2.b |= VCardConfig.FLAG_APPEND_TYPE_PARAM;
        this.v.j(ellgVar);
    }

    @Override // defpackage.ajhd
    public final void af(ConversationIdType conversationIdType, int i2) {
        if (!this.x.get()) {
            n();
            return;
        }
        elkh elkhVar = (elkh) elki.a.createBuilder();
        elkhVar.copyOnWrite();
        elki elkiVar = (elki) elkhVar.instance;
        elkiVar.x = 1;
        elkiVar.b |= VCardConfig.FLAG_REFRAIN_IMAGE_EXPORT;
        elkhVar.copyOnWrite();
        elki elkiVar2 = (elki) elkhVar.instance;
        elkiVar2.d = Integer.valueOf(i2 - 1);
        elkiVar2.c = 29;
        aO(elkhVar, conversationIdType);
    }

    @Override // defpackage.ajhd
    public final void ag(int i2, int i3, int i4) {
        if (!this.x.get()) {
            n();
            return;
        }
        ellg ellgVar = (ellg) ellh.a.createBuilder();
        ellf ellfVar = ellf.BUGLE_GIF_CHOOSER;
        ellgVar.copyOnWrite();
        ellh ellhVar = (ellh) ellgVar.instance;
        ellhVar.j = ellfVar.f11do;
        ellhVar.b |= 1;
        ello elloVar = (ello) ells.a.createBuilder();
        elloVar.copyOnWrite();
        ells ellsVar = (ells) elloVar.instance;
        ellsVar.c = i2 - 1;
        ellsVar.b |= 1;
        elloVar.copyOnWrite();
        ells ellsVar2 = (ells) elloVar.instance;
        int i5 = i3 - 1;
        if (i3 == 0) {
            throw null;
        }
        ellsVar2.d = i5;
        ellsVar2.b |= 2;
        elloVar.copyOnWrite();
        ells ellsVar3 = (ells) elloVar.instance;
        int i6 = i4 - 1;
        if (i4 == 0) {
            throw null;
        }
        ellsVar3.e = i6;
        ellsVar3.b |= 4;
        ellgVar.copyOnWrite();
        ellh ellhVar2 = (ellh) ellgVar.instance;
        ells ellsVar4 = (ells) elloVar.build();
        ellsVar4.getClass();
        ellhVar2.A = ellsVar4;
        ellhVar2.b |= 2097152;
        this.v.j(ellgVar);
    }

    @Override // defpackage.ajhd
    public final void ah(final MessageCoreData messageCoreData, final int i2, final int i3, final int i4, final int i5, final int i6, final enxu enxuVar, final int i7, final int i8, final Optional optional, final Optional optional2, final Optional optional3) {
        auvh.h(eijx.f(new Runnable() { // from class: ajhx
            @Override // java.lang.Runnable
            public final void run() {
                this.a.aJ(messageCoreData, i2, i3, i4, i5, i6, enxuVar, i7, i8, optional, optional2, Optional.empty(), optional3);
            }
        }, this.A));
    }

    @Override // defpackage.ajhd
    public final void ai(MessageCoreData messageCoreData, int i2, long j2, boolean z, int i3) {
        new ajeq(messageCoreData);
        if (!this.x.get()) {
            n();
            return;
        }
        elvt elvtVar = (elvt) elvv.a.createBuilder();
        int iD = d();
        elvtVar.copyOnWrite();
        elvv elvvVar = (elvv) elvtVar.instance;
        elvvVar.b |= 1;
        elvvVar.c = iD;
        fcsu fcsuVar = this.G;
        String strE = ((ajjo) fcsuVar.b()).e();
        elvtVar.copyOnWrite();
        elvv elvvVar2 = (elvv) elvtVar.instance;
        strE.getClass();
        elvvVar2.b |= 4;
        elvvVar2.e = strE;
        elvv elvvVar3 = (elvv) elvtVar.build();
        final elof elofVar = (elof) elpg.b.createBuilder();
        long jB = ((aika) this.p.b()).b(messageCoreData.A());
        elofVar.copyOnWrite();
        elpg elpgVar = (elpg) elofVar.instance;
        elpgVar.c |= 1073741824;
        elpgVar.G = jB;
        long jT = messageCoreData.t();
        elofVar.copyOnWrite();
        elpg elpgVar2 = (elpg) elofVar.instance;
        elpgVar2.c |= 128;
        elpgVar2.o = jT;
        elofVar.copyOnWrite();
        elpg elpgVar3 = (elpg) elofVar.instance;
        elpgVar3.h = 2;
        elpgVar3.c |= 1;
        elofVar.copyOnWrite();
        elpg elpgVar4 = (elpg) elofVar.instance;
        elpgVar4.i = 3;
        elpgVar4.c = 2 | elpgVar4.c;
        elpy elpyVarA = ((aimw) this.r.b()).a(i2);
        elofVar.copyOnWrite();
        elpg elpgVar5 = (elpg) elofVar.instance;
        elpgVar5.j = elpyVarA;
        elpgVar5.c |= 4;
        elofVar.copyOnWrite();
        elpg elpgVar6 = (elpg) elofVar.instance;
        elvvVar3.getClass();
        elpgVar6.y = elvvVar3;
        elpgVar6.c |= 4194304;
        elpl elplVarK = ((ajjo) fcsuVar.b()).k(((MessageData) messageCoreData).i, 4);
        elofVar.copyOnWrite();
        elpg elpgVar7 = (elpg) elofVar.instance;
        elplVarK.getClass();
        elpgVar7.k = elplVarK;
        elpgVar7.c |= 8;
        elvg elvgVar = cqbe.a;
        elofVar.copyOnWrite();
        elpg elpgVar8 = (elpg) elofVar.instance;
        elpgVar8.L = elvgVar.x;
        elpgVar8.d |= 512;
        int iC = ajhe.c(messageCoreData);
        elofVar.copyOnWrite();
        elpg elpgVar9 = (elpg) elofVar.instance;
        elpgVar9.Q = iC - 1;
        elpgVar9.d |= 16384;
        elofVar.copyOnWrite();
        elpg elpgVar10 = (elpg) elofVar.instance;
        int i4 = i3 - 1;
        if (i3 == 0) {
            throw null;
        }
        elpgVar10.W = i4;
        elpgVar10.d |= 524288;
        boolean zCM = messageCoreData.cM();
        elofVar.copyOnWrite();
        elpg elpgVar11 = (elpg) elofVar.instance;
        elpgVar11.d |= 1073741824;
        elpgVar11.ag = zCM;
        bojh bojhVarR = ((bakt) this.m.b()).r(messageCoreData.A());
        elke elkeVarA = ajhe.a(bojhVarR != null ? Integer.valueOf(bojhVarR.k()) : null);
        elofVar.copyOnWrite();
        elpg elpgVar12 = (elpg) elofVar.instance;
        elpgVar12.s = elkeVarA.f;
        elpgVar12.c |= 16384;
        ((ajjo) fcsuVar.b()).f(elofVar, i2);
        ((ajjo) fcsuVar.b()).l(elofVar, 3, 4, i2);
        if (((aquo) this.L.b()).a()) {
            ((ccww) this.M.b()).a(elofVar, messageCoreData);
        }
        auvh.h(((ajfe) this.am.b()).a(messageCoreData).h(new ejvr() { // from class: ajij
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                elof elofVar2 = elofVar;
                ((Optional) obj).ifPresent(new ajhp(elofVar2));
                ellg ellgVar = (ellg) ellh.a.createBuilder();
                ellf ellfVar = ellf.BUGLE_MESSAGE;
                ellgVar.copyOnWrite();
                ellh ellhVar = (ellh) ellgVar.instance;
                ellhVar.j = ellfVar.f11do;
                ellhVar.b |= 1;
                ellgVar.copyOnWrite();
                ellh ellhVar2 = (ellh) ellgVar.instance;
                elpg elpgVar13 = (elpg) elofVar2.build();
                elpgVar13.getClass();
                ellhVar2.l = elpgVar13;
                ellhVar2.b |= 4;
                ajjf ajjfVar = this.a;
                ajjfVar.w.a().j(ellgVar, aioj.LOG_SPEC_MESSAGE_DELIVERY_NORTHSTAR_EVENTS);
                ((ajfo) ajjfVar.o.b()).b(new dzfh("MMS downloaded"));
                return null;
            }
        }, this.A));
        if (z) {
            return;
        }
        aC(j2, "Bugle.Success.Attachment.Size.Bucket.Mms");
        ((ains) this.U.b()).c("Bugle.DataModel.Action.Download.Success.Count.Mms");
    }

    @Override // defpackage.ajhd
    public final void aj(elqb elqbVar, int i2, List list) {
        if (!this.x.get()) {
            n();
            return;
        }
        emem ememVar = (emem) emen.a.createBuilder();
        ememVar.copyOnWrite();
        emen emenVar = (emen) ememVar.instance;
        emenVar.c = i2 - 1;
        emenVar.b |= 1;
        if (list != null && !list.isEmpty()) {
            Stream stream = Collection.EL.stream(list);
            final aika aikaVar = (aika) this.p.b();
            aikaVar.getClass();
            List list2 = (List) stream.map(new Function() { // from class: ajht
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo536andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return Long.valueOf(aikaVar.b((ConversationIdType) obj));
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            }).collect(Collectors.toCollection(new Supplier() { // from class: ajhu
                @Override // java.util.function.Supplier
                public final Object get() {
                    return new ArrayList();
                }
            }));
            ememVar.copyOnWrite();
            emen emenVar2 = (emen) ememVar.instance;
            evta evtaVar = emenVar2.d;
            if (!evtaVar.c()) {
                emenVar2.d = evsn.mutableCopy(evtaVar);
            }
            evpz.addAll(list2, emenVar2.d);
        }
        elpz elpzVar = (elpz) elqc.a.createBuilder();
        elpzVar.copyOnWrite();
        elqc elqcVar = (elqc) elpzVar.instance;
        elqcVar.c = elqbVar.e;
        elqcVar.b |= 1;
        elpzVar.copyOnWrite();
        elqc elqcVar2 = (elqc) elpzVar.instance;
        emen emenVar3 = (emen) ememVar.build();
        emenVar3.getClass();
        elqcVar2.d = emenVar3;
        elqcVar2.b |= 2;
        elqc elqcVar3 = (elqc) elpzVar.build();
        ellg ellgVar = (ellg) ellh.a.createBuilder();
        ellf ellfVar = ellf.BUGLE_NOTIFICATION;
        ellgVar.copyOnWrite();
        ellh ellhVar = (ellh) ellgVar.instance;
        ellhVar.j = ellfVar.f11do;
        ellhVar.b |= 1;
        ellgVar.copyOnWrite();
        ellh ellhVar2 = (ellh) ellgVar.instance;
        elqcVar3.getClass();
        ellhVar2.aa = elqcVar3;
        ellhVar2.c |= VCardConfig.FLAG_CONVERT_PHONETIC_NAME_STRINGS;
        this.v.j(ellgVar);
    }

    @Override // defpackage.ajhd
    public final void ak(int i2, int i3, String str) {
        if (!this.x.get()) {
            n();
            return;
        }
        elrm elrmVar = (elrm) elrn.a.createBuilder();
        if (str != null) {
            elrmVar.copyOnWrite();
            elrn elrnVar = (elrn) elrmVar.instance;
            elrnVar.b |= 1;
            elrnVar.c = str;
        }
        elre elreVar = (elre) elrl.a.createBuilder();
        elreVar.copyOnWrite();
        elrl elrlVar = (elrl) elreVar.instance;
        elrlVar.f = i2 - 1;
        elrlVar.b |= 8;
        elreVar.copyOnWrite();
        elrl elrlVar2 = (elrl) elreVar.instance;
        elrlVar2.g = i3 - 1;
        elrlVar2.b |= 16;
        elreVar.copyOnWrite();
        elrl elrlVar3 = (elrl) elreVar.instance;
        elrn elrnVar2 = (elrn) elrmVar.build();
        elrnVar2.getClass();
        elrlVar3.c = elrnVar2;
        elrlVar3.b |= 1;
        elrl elrlVar4 = (elrl) elreVar.build();
        ellg ellgVar = (ellg) ellh.a.createBuilder();
        ellf ellfVar = ellf.BUGLE_RBM_BUSINESS_INFO;
        ellgVar.copyOnWrite();
        ellh ellhVar = (ellh) ellgVar.instance;
        ellhVar.j = ellfVar.f11do;
        ellhVar.b |= 1;
        ellgVar.copyOnWrite();
        ellh ellhVar2 = (ellh) ellgVar.instance;
        elrlVar4.getClass();
        ellhVar2.x = elrlVar4;
        ellhVar2.b |= 131072;
        this.v.j(ellgVar);
    }

    @Override // defpackage.ajhd
    public final void al(int i2, String str) {
        if (!this.x.get()) {
            n();
            return;
        }
        elrm elrmVar = (elrm) elrn.a.createBuilder();
        if (str != null) {
            elrmVar.copyOnWrite();
            elrn elrnVar = (elrn) elrmVar.instance;
            elrnVar.b |= 1;
            elrnVar.c = str;
        }
        elre elreVar = (elre) elrl.a.createBuilder();
        elreVar.copyOnWrite();
        elrl elrlVar = (elrl) elreVar.instance;
        elrlVar.h = i2 - 1;
        elrlVar.b |= 32;
        elreVar.copyOnWrite();
        elrl elrlVar2 = (elrl) elreVar.instance;
        elrn elrnVar2 = (elrn) elrmVar.build();
        elrnVar2.getClass();
        elrlVar2.c = elrnVar2;
        elrlVar2.b |= 1;
        elrl elrlVar3 = (elrl) elreVar.build();
        ellg ellgVar = (ellg) ellh.a.createBuilder();
        ellf ellfVar = ellf.BUGLE_RBM_BUSINESS_INFO;
        ellgVar.copyOnWrite();
        ellh ellhVar = (ellh) ellgVar.instance;
        ellhVar.j = ellfVar.f11do;
        ellhVar.b |= 1;
        ellgVar.copyOnWrite();
        ellh ellhVar2 = (ellh) ellgVar.instance;
        elrlVar3.getClass();
        ellhVar2.x = elrlVar3;
        ellhVar2.b |= 131072;
        this.v.j(ellgVar);
    }

    @Override // defpackage.ajhd
    public final void am(int i2, elrk elrkVar, String str) {
        if (!this.x.get()) {
            n();
            return;
        }
        elrm elrmVar = (elrm) elrn.a.createBuilder();
        if (str != null) {
            elrmVar.copyOnWrite();
            elrn elrnVar = (elrn) elrmVar.instance;
            elrnVar.b |= 1;
            elrnVar.c = str;
        }
        elre elreVar = (elre) elrl.a.createBuilder();
        elreVar.copyOnWrite();
        elrl elrlVar = (elrl) elreVar.instance;
        elrlVar.d = i2 - 1;
        elrlVar.b |= 2;
        elreVar.copyOnWrite();
        elrl elrlVar2 = (elrl) elreVar.instance;
        elrlVar2.e = elrkVar.i;
        elrlVar2.b |= 4;
        elreVar.copyOnWrite();
        elrl elrlVar3 = (elrl) elreVar.instance;
        elrn elrnVar2 = (elrn) elrmVar.build();
        elrnVar2.getClass();
        elrlVar3.c = elrnVar2;
        elrlVar3.b |= 1;
        elrl elrlVar4 = (elrl) elreVar.build();
        ellg ellgVar = (ellg) ellh.a.createBuilder();
        ellf ellfVar = ellf.BUGLE_RBM_BUSINESS_INFO;
        ellgVar.copyOnWrite();
        ellh ellhVar = (ellh) ellgVar.instance;
        ellhVar.j = ellfVar.f11do;
        ellhVar.b |= 1;
        ellgVar.copyOnWrite();
        ellh ellhVar2 = (ellh) ellgVar.instance;
        elrlVar4.getClass();
        ellhVar2.x = elrlVar4;
        ellhVar2.b |= 131072;
        this.v.j(ellgVar);
    }

    @Override // defpackage.ajhd
    public final void an(final MessageCoreData messageCoreData, final int i2, final enyw enywVar, final int i3, final int i4) {
        ejwl.b(messageCoreData.cX(), "Requires RCS message to log correct info");
        if (messageCoreData.z() != null) {
            auvh.h(messageCoreData.z().f().h(new ejvr() { // from class: ajim
                @Override // defpackage.ejvr
                public final Object apply(Object obj) {
                    this.a.aK(messageCoreData, i2, enywVar, i3, i4);
                    return null;
                }
            }, this.A));
        } else {
            aK(messageCoreData, i2, enywVar, i3, i4);
        }
    }

    @Override // defpackage.ajhd
    public final void ao(int i2) {
        ap(i2, 2);
    }

    @Override // defpackage.ajhd
    public final void ap(int i2, int i3) {
        if (!this.x.get()) {
            n();
            return;
        }
        ellg ellgVar = (ellg) ellh.a.createBuilder();
        ellf ellfVar = ellf.BUGLE_SHAKE_TO_REPORT;
        ellgVar.copyOnWrite();
        ellh ellhVar = (ellh) ellgVar.instance;
        ellhVar.j = ellfVar.f11do;
        ellhVar.b |= 1;
        emhq emhqVar = (emhq) emht.a.createBuilder();
        emhqVar.copyOnWrite();
        emht emhtVar = (emht) emhqVar.instance;
        emhtVar.c = i2 - 1;
        emhtVar.b |= 1;
        emhqVar.copyOnWrite();
        emht emhtVar2 = (emht) emhqVar.instance;
        emhtVar2.d = i3 - 1;
        emhtVar2.b |= 2;
        ellgVar.copyOnWrite();
        ellh ellhVar2 = (ellh) ellgVar.instance;
        emht emhtVar3 = (emht) emhqVar.build();
        emhtVar3.getClass();
        ellhVar2.N = emhtVar3;
        ellhVar2.c |= 4096;
        this.v.j(ellgVar);
    }

    @Override // defpackage.ajhd
    public final void aq() {
        eieu eieuVarK = eiiy.k("UsageStatisticsImpl::logMessageCreated");
        try {
            eieuVarK.close();
        } catch (Throwable th) {
            try {
                eieuVarK.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.ajhd
    public final void ar(MessageCoreData messageCoreData, Optional optional) {
        aY(messageCoreData, 9, optional, Optional.empty(), ainm.a(this.t));
    }

    @Override // defpackage.ajhd
    public final void as(ConversationIdType conversationIdType, elka elkaVar, int i2, boolean z, Boolean bool, boolean z2, boolean z3, int i3, List list, boolean z4, int i4, boolean z5, int i5) {
        int iF;
        if (!this.x.get()) {
            n();
            return;
        }
        emxt emxtVar = emxt.UNKNOWN_BUGLE_EVENT_CODE;
        if (z) {
            emxtVar = emxt.ACTIVE_USER_ENTER_CONVERSATION_WITH_UNREAD_MESSAGE;
            V(z2);
            if (z4) {
                W();
            }
        }
        elki elkiVar = elki.a;
        elkh elkhVar = (elkh) elkiVar.createBuilder();
        long jB = ((aika) this.p.b()).b(conversationIdType);
        elkhVar.copyOnWrite();
        elki elkiVar2 = (elki) elkhVar.instance;
        elkiVar2.b |= 65536;
        elkiVar2.r = jB;
        elkhVar.copyOnWrite();
        elki elkiVar3 = (elki) elkhVar.instance;
        elkiVar3.e = 1;
        elkiVar3.b |= 1;
        elkhVar.copyOnWrite();
        elki elkiVar4 = (elki) elkhVar.instance;
        elkiVar4.f = elkaVar.u;
        elkiVar4.b |= 2;
        elkhVar.copyOnWrite();
        elki elkiVar5 = (elki) elkhVar.instance;
        elkiVar5.b |= 4;
        elkiVar5.g = 0;
        elkhVar.copyOnWrite();
        elki elkiVar6 = (elki) elkhVar.instance;
        elkiVar6.b |= 8;
        elkiVar6.h = i2;
        elkhVar.copyOnWrite();
        elki elkiVar7 = (elki) elkhVar.instance;
        elkiVar7.b |= 32;
        elkiVar7.i = z;
        elkhVar.copyOnWrite();
        elki elkiVar8 = (elki) elkhVar.instance;
        elkiVar8.A = i4 - 1;
        elkiVar8.b |= VCardConfig.FLAG_APPEND_TYPE_PARAM;
        elkhVar.copyOnWrite();
        elki elkiVar9 = (elki) elkhVar.instance;
        elkiVar9.C = emtx.a(i5);
        elkiVar9.b |= VCardConfig.FLAG_REFRAIN_QP_TO_NAME_PROPERTIES;
        if (!list.isEmpty()) {
            if (list.size() > 1) {
                iF = 2;
            } else {
                iF = aixq.f((elns) list.get(0));
            }
            elkhVar.copyOnWrite();
            elki elkiVar10 = (elki) elkhVar.instance;
            elkiVar10.p = iF - 1;
            elkiVar10.b |= 16384;
            elkhVar.a(list);
        }
        if (bool == null) {
            elkhVar.copyOnWrite();
            elki elkiVar11 = (elki) elkhVar.instance;
            elkiVar11.l = 0;
            elkiVar11.b |= 1024;
        } else {
            int i6 = true != bool.booleanValue() ? 3 : 2;
            elkhVar.copyOnWrite();
            elki elkiVar12 = (elki) elkhVar.instance;
            elkiVar12.l = i6 - 1;
            elkiVar12.b |= 1024;
        }
        int i7 = z2 ? 3 : 2;
        elkhVar.copyOnWrite();
        elki elkiVar13 = (elki) elkhVar.instance;
        elkiVar13.k = i7 - 1;
        elkiVar13.b |= 512;
        elke elkeVarA = ajhe.a(Integer.valueOf(i3));
        elkhVar.copyOnWrite();
        elki elkiVar14 = (elki) elkhVar.instance;
        elkiVar14.j = elkeVarA.f;
        elkiVar14.b |= 256;
        if (((Boolean) ((cczi) crbf.ak.get()).e()).booleanValue()) {
            elkhVar.copyOnWrite();
            elki elkiVar15 = (elki) elkhVar.instance;
            elkiVar15.b |= 1073741824;
            elkiVar15.F = z3;
        }
        if (z5) {
            elkhVar.copyOnWrite();
            elki elkiVar16 = (elki) elkhVar.instance;
            elkiVar16.B = 1;
            elkiVar16.b |= VCardConfig.FLAG_CONVERT_PHONETIC_NAME_STRINGS;
        }
        ellh ellhVarAy = ay((elki) elkhVar.build());
        cqce cqceVar = i;
        cqbd cqbdVarC = cqceVar.c();
        cqbdVarC.I("Create or Open Conversation UNREAD");
        cqbdVarC.J(z);
        cqbdVarC.r();
        cqbd cqbdVarC2 = cqceVar.c();
        cqbdVarC2.I("Create or Open Conversation IS XMS FALLBACK");
        elki elkiVar17 = ellhVarAy.m;
        if (elkiVar17 != null) {
            elkiVar = elkiVar17;
        }
        cqbdVarC2.G((elju.a(elkiVar.l) != 0 ? r0 : 1) - 1);
        cqbdVarC2.r();
        cqbd cqbdVarC3 = cqceVar.c();
        cqbdVarC3.I("Create or Open Conversation Is RCS");
        cqbdVarC3.J(z2);
        cqbdVarC3.r();
        cqbd cqbdVarC4 = cqceVar.c();
        cqbdVarC4.I("Create or Open conversation CONVERSATION TYPE");
        cqbdVarC4.G(i3);
        cqbdVarC4.r();
        this.v.k((ellg) ellhVarAy.toBuilder(), emxtVar);
    }

    @Override // defpackage.ajhd
    public final void at(final MessageCoreData messageCoreData, final int i2, final ainn ainnVar, final elof elofVar) {
        MessageUsageStatisticsData messageUsageStatisticsData = ((MessageData) messageCoreData).k;
        if (messageUsageStatisticsData != null) {
            auvh.h(messageUsageStatisticsData.f().h(new ejvr() { // from class: ajiv
                @Override // defpackage.ejvr
                public final Object apply(Object obj) {
                    this.a.aG(messageCoreData, i2, ainnVar, elofVar);
                    return null;
                }
            }, this.A));
        } else {
            aG(messageCoreData, i2, ainnVar, elofVar);
        }
    }

    @Override // defpackage.ajhd
    public final void au(elqb elqbVar) {
        aj(elqbVar, 3, null);
    }

    @Override // defpackage.ajhd
    public final void av() {
        ((ains) this.U.b()).e("Bugle.Media.VideoViewer.Launch.Counts", 1);
    }

    final int aw(MessageCoreData messageCoreData) {
        SelfIdentityId selfIdentityIdAx;
        axcy axcyVarC;
        if (messageCoreData == null || (selfIdentityIdAx = ax(messageCoreData)) == null || (axcyVarC = ((bbdl) this.Z.b()).c(selfIdentityIdAx)) == null) {
            return -1;
        }
        return axcyVarC.e();
    }

    final SelfIdentityId ax(MessageCoreData messageCoreData) {
        bajf bajfVarA;
        eieu eieuVarK = eiiy.k("UsageStatisticsImpl#getMessageSelfParticipantId");
        try {
            SelfIdentityId selfIdentityIdV = messageCoreData.v();
            if (selfIdentityIdV != null) {
                eieuVarK.close();
                return selfIdentityIdV;
            }
            ConversationIdType conversationIdTypeA = messageCoreData.A();
            SelfIdentityId selfIdentityIdF = null;
            if (!conversationIdTypeA.b() && (bajfVarA = ((bapl) this.P.b()).a(conversationIdTypeA)) != null) {
                selfIdentityIdF = bajfVarA.f();
            }
            eieuVarK.close();
            return selfIdentityIdF;
        } catch (Throwable th) {
            try {
                eieuVarK.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final enwr az(int i2) {
        return ((dggw) this.ah.b()).c(i2).a;
    }

    @Override // defpackage.ajhd, defpackage.dhem
    public final void b(ewkl ewklVar) {
        if (((Boolean) g.e()).booleanValue()) {
            return;
        }
        eieh eiehVarC = this.ag.c("UsageStatistics dispatchSimStateEvent", "com/google/android/apps/messaging/shared/analytics/statistics/UsageStatisticsImpl", "dispatchSimStateEvent", 4722);
        try {
            if (this.x.get()) {
                ellg ellgVar = (ellg) ellh.a.createBuilder();
                ellf ellfVar = ellf.BUGLE_TELEPHONY_EVENT;
                ellgVar.copyOnWrite();
                ellh ellhVar = (ellh) ellgVar.instance;
                ellhVar.j = ellfVar.f11do;
                ellhVar.b |= 1;
                ewkq ewkqVar = (ewkq) ewkr.a.createBuilder();
                ewkqVar.copyOnWrite();
                ewkr ewkrVar = (ewkr) ewkqVar.instance;
                ewklVar.getClass();
                ewkrVar.c = ewklVar;
                ewkrVar.b = 1;
                ellgVar.copyOnWrite();
                ellh ellhVar2 = (ellh) ellgVar.instance;
                ewkr ewkrVar2 = (ewkr) ewkqVar.build();
                ewkrVar2.getClass();
                ellhVar2.z = ewkrVar2;
                ellhVar2.b |= 1048576;
                this.v.j(ellgVar);
            } else {
                n();
            }
            eiehVarC.close();
        } catch (Throwable th) {
            try {
                eiehVarC.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.dhem
    public final void c(ewkp ewkpVar) {
        if (((Boolean) g.e()).booleanValue()) {
            return;
        }
        eieh eiehVarC = this.ag.c("UsageStatistics dispatchSubChangedEvent", "com/google/android/apps/messaging/shared/analytics/statistics/UsageStatisticsImpl", "dispatchSubscriptionChangedEvent", 4789);
        try {
            if (this.x.get()) {
                ellg ellgVar = (ellg) ellh.a.createBuilder();
                ellf ellfVar = ellf.BUGLE_TELEPHONY_EVENT;
                ellgVar.copyOnWrite();
                ellh ellhVar = (ellh) ellgVar.instance;
                ellhVar.j = ellfVar.f11do;
                ellhVar.b |= 1;
                ewkq ewkqVar = (ewkq) ewkr.a.createBuilder();
                ewkqVar.copyOnWrite();
                ewkr ewkrVar = (ewkr) ewkqVar.instance;
                ewkpVar.getClass();
                ewkrVar.c = ewkpVar;
                ewkrVar.b = 4;
                ellgVar.copyOnWrite();
                ellh ellhVar2 = (ellh) ellgVar.instance;
                ewkr ewkrVar2 = (ewkr) ewkqVar.build();
                ewkrVar2.getClass();
                ellhVar2.z = ewkrVar2;
                ellhVar2.b |= 1048576;
                this.v.j(ellgVar);
            } else {
                n();
            }
            eiehVarC.close();
        } catch (Throwable th) {
            try {
                eiehVarC.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.ajhd
    public final int d() {
        return ((Integer) ((ajjo) this.G.b()).d().map(new Function() { // from class: ajhw
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                long j2 = ajjf.h;
                return Integer.valueOf(((PackageInfo) obj).versionCode);
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).orElse(-1)).intValue();
    }

    @Override // defpackage.ajhd
    public final ajft e() {
        if (this.x.get()) {
            return (ajft) this.af.b();
        }
        return null;
    }

    @Override // defpackage.ajhd
    public final eiju f() {
        return eijx.g(new Callable() { // from class: ajhh
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return ((ajjo) this.a.G.b()).d().map(new Function() { // from class: ajjc
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo536andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        long j2 = ajjf.h;
                        return ((PackageInfo) obj).versionName;
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                });
            }
        }, this.z);
    }

    @Override // defpackage.ajhd
    public final elul g(long j2) {
        return j2 <= a ? elul.EVENT_AGE_WITHIN_1_DAY : j2 <= b ? elul.EVENT_AGE_1_TO_7_DAYS : j2 <= c ? elul.EVENT_AGE_7_TO_28_DAYS : elul.EVENT_AGE_MORE_THAN_28_DAYS;
    }

    @Override // defpackage.ajhd
    public final elul h(String str) {
        return g(this.t.f().toEpochMilli() - ((crqv) this.V.b()).e(str, -1L));
    }

    @Override // defpackage.ajhd
    public final ListenableFuture i() {
        return this.B.h(new ejvr() { // from class: ajii
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                long j2 = ajjf.h;
                eltz eltzVar = (eltz) elua.a.createBuilder();
                long jLongValue = ((Long) obj).longValue();
                eltzVar.copyOnWrite();
                elua eluaVar = (elua) eltzVar.instance;
                eluaVar.b |= 1;
                eluaVar.c = jLongValue;
                return (elua) eltzVar.build();
            }
        }, eoqg.a);
    }

    @Override // defpackage.ajhd
    public final String j(Optional optional) {
        ImsConfiguration imsConfigurationN;
        if (optional.isEmpty()) {
            ekrw ekrwVarJ = j.j();
            ekrwVarJ.X(eksq.a, "BugleUsageStatistics");
            ekrd ekrdVar = (ekrd) ekrwVarJ;
            ekrdVar.Z(eksk.MEDIUM);
            ((ekrd) ekrdVar.h("com/google/android/apps/messaging/shared/analytics/statistics/UsageStatisticsImpl", "getPcscfAddress", 3832, "UsageStatisticsImpl.java")).q("Unable to retrieve the RCS Config, unexpected empty subId");
            return "NOT_AVAILABLE";
        }
        Optional optionalK = ((dggz) this.ak.b()).k(((Integer) optional.get()).intValue());
        if (!optionalK.isEmpty() && (imsConfigurationN = ((dgiq) optionalK.get()).n()) != null) {
            String str = imsConfigurationN.mPcscfAddress;
            if (!TextUtils.isEmpty(str)) {
                return str;
            }
        }
        return "NOT_AVAILABLE";
    }

    @Override // defpackage.ajhd
    public final void k() {
        fcsu fcsuVar = this.af;
        ecem.b();
        boolean zB = ((ajjp) this.ad.b()).b();
        if (zB) {
            this.v = (aill) this.R.b();
            this.w = (aimb) this.S.b();
            this.af = fcsuVar;
            aiul aiulVar = (aiul) this.y.b();
            final Function function = new Function() { // from class: ajhz
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo536andThen(Function function2) {
                    return Function$CC.$default$andThen(this, function2);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    Long l = (Long) obj;
                    if (l.longValue() <= 0) {
                        long epochMilli = this.a.t.f().toEpochMilli();
                        cqbd cqbdVarA = ajjf.i.a();
                        cqbdVarA.I(a.u(epochMilli, "Setting the time of the first use of the app to"));
                        cqbdVarA.r();
                        return Optional.of(Long.valueOf(epochMilli));
                    }
                    cqbd cqbdVarA2 = ajjf.i.a();
                    cqbdVarA2.I("Time of the first use of the app.");
                    cqbdVarA2.I(l);
                    cqbdVarA2.r();
                    return Optional.empty();
                }

                public final /* synthetic */ Function compose(Function function2) {
                    return Function$CC.$default$compose(this, function2);
                }
            };
            ecjh ecjhVar = aiulVar.a;
            ejvr ejvrVarA = eiid.a(new ejvr() { // from class: aitw
                @Override // defpackage.ejvr
                public final Object apply(Object obj) {
                    final aith aithVar = (aith) obj;
                    int i2 = aiul.d;
                    return (aith) ((Optional) function.apply(Long.valueOf(aithVar.d))).map(new Function() { // from class: aiua
                        @Override // java.util.function.Function
                        /* renamed from: andThen */
                        public final /* synthetic */ Function mo536andThen(Function function2) {
                            return Function$CC.$default$andThen(this, function2);
                        }

                        @Override // java.util.function.Function
                        public final Object apply(Object obj2) {
                            int i3 = aiul.d;
                            aitg aitgVar = (aitg) aithVar.toBuilder();
                            long jLongValue = ((Long) obj2).longValue();
                            aitgVar.copyOnWrite();
                            aith aithVar2 = (aith) aitgVar.instance;
                            aithVar2.b |= 2;
                            aithVar2.d = jLongValue;
                            return (aith) aitgVar.build();
                        }

                        public final /* synthetic */ Function compose(Function function2) {
                            return Function$CC.$default$compose(this, function2);
                        }
                    }).orElse(aithVar);
                }
            });
            eoqg eoqgVar = eoqg.a;
            this.B = eiju.g(ecjhVar.b(ejvrVarA, eoqgVar)).i(new eooz() { // from class: ajia
                @Override // defpackage.eooz
                public final ListenableFuture a(Object obj) {
                    return ((aiul) this.a.y.b()).d();
                }
            }, eoqgVar);
        }
        this.x.set(zB);
    }

    @Override // defpackage.ajhd
    @Deprecated
    public final void l(String str, int i2, String str2, String str3, bvdz bvdzVar) {
        aW(str, i2, str2, 3, str3, bvdzVar);
    }

    @Override // defpackage.ajhd
    @Deprecated
    public final void m(String str, int i2, String str2, String str3, bvdz bvdzVar) {
        aW(str, i2, str2, 2, str3, bvdzVar);
    }

    @Override // defpackage.ajhd
    public final void n() {
        ((ajjp) this.ad.b()).a();
    }

    @Override // defpackage.ajhd
    public final void o(final ConversationIdType conversationIdType, final elka elkaVar, final int i2) {
        auwa.a(new Runnable() { // from class: ajjb
            @Override // java.lang.Runnable
            public final void run() {
                eieu eieuVarK = eiiy.k("UsageStatisticsImpl#logConversationClicked");
                int i3 = i2;
                final elka elkaVar2 = elkaVar;
                final ConversationIdType conversationIdType2 = conversationIdType;
                final ajjf ajjfVar = this.a;
                try {
                    if (ajjfVar.x.get()) {
                        fcsu fcsuVar = ajjfVar.n;
                        boolean zS = ((baxe) fcsuVar.b()).S(conversationIdType2);
                        eieu eieuVarK2 = eiiy.k("MessageDatabaseOperations#getConversationHasDraftMessage");
                        try {
                            brdr brdrVarD = MessagesTable.d();
                            brdrVarD.A("getConversationHasDraftMessage");
                            brdrVarD.h(new Function() { // from class: bavn
                                @Override // java.util.function.Function
                                /* renamed from: andThen */
                                public final /* synthetic */ Function mo536andThen(Function function) {
                                    return Function$CC.$default$andThen(this, function);
                                }

                                @Override // java.util.function.Function
                                public final Object apply(Object obj) {
                                    brec brecVar = (brec) obj;
                                    cqce cqceVar = baxe.a;
                                    brecVar.ae(3);
                                    brecVar.m(conversationIdType2);
                                    return brecVar;
                                }

                                public final /* synthetic */ Function compose(Function function) {
                                    return Function$CC.$default$compose(this, function);
                                }
                            });
                            boolean zU = brdrVarD.b().U();
                            eieuVarK2.close();
                            final elkh elkhVar = (elkh) elki.a.createBuilder();
                            long jB = ((aika) ajjfVar.p.b()).b(conversationIdType2);
                            elkhVar.copyOnWrite();
                            elki elkiVar = (elki) elkhVar.instance;
                            elkiVar.b |= 65536;
                            elkiVar.r = jB;
                            elkhVar.copyOnWrite();
                            elki elkiVar2 = (elki) elkhVar.instance;
                            elkiVar2.e = 4;
                            elkiVar2.b |= 1;
                            elkhVar.copyOnWrite();
                            elki elkiVar3 = (elki) elkhVar.instance;
                            elkiVar3.f = elkaVar2.u;
                            elkiVar3.b |= 2;
                            elkhVar.copyOnWrite();
                            elki elkiVar4 = (elki) elkhVar.instance;
                            elkiVar4.b |= 4194304;
                            elkiVar4.w = i3;
                            elkhVar.copyOnWrite();
                            elki elkiVar5 = (elki) elkhVar.instance;
                            elkiVar5.b |= 32;
                            elkiVar5.i = zS;
                            elkhVar.copyOnWrite();
                            elki elkiVar6 = (elki) elkhVar.instance;
                            elkiVar6.b |= VCardConfig.FLAG_REFRAIN_PHONE_NUMBER_FORMATTING;
                            elkiVar6.z = zU;
                            auvh.h(eijx.e(null).h(new ejvr() { // from class: ajib
                                @Override // defpackage.ejvr
                                public final Object apply(Object obj) {
                                    ellh ellhVarAy = ajjf.ay((elki) elkhVar.build());
                                    cqbd cqbdVarC = ajjf.i.c();
                                    cqbdVarC.A("ConversationClicked Conversation Origin", elkaVar2);
                                    cqbdVarC.r();
                                    ajjfVar.v.j((ellg) ellhVarAy.toBuilder());
                                    return null;
                                }
                            }, ajjfVar.z));
                        } finally {
                        }
                    } else {
                        ajjfVar.n();
                    }
                    eieuVarK.close();
                } catch (Throwable th) {
                    try {
                        eieuVarK.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            }
        }, this.z);
    }

    @Override // defpackage.ajhd
    public final void p(ConversationIdType conversationIdType, eljx eljxVar) {
        if (!this.x.get()) {
            n();
            return;
        }
        elkh elkhVar = (elkh) elki.a.createBuilder();
        elkhVar.copyOnWrite();
        elki elkiVar = (elki) elkhVar.instance;
        elkiVar.x = 2;
        elkiVar.b |= VCardConfig.FLAG_REFRAIN_IMAGE_EXPORT;
        elkhVar.copyOnWrite();
        elki elkiVar2 = (elki) elkhVar.instance;
        elkiVar2.d = Integer.valueOf(eljxVar.k);
        elkiVar2.c = 28;
        aO(elkhVar, conversationIdType);
    }

    @Override // defpackage.ajhd
    public final void q(boolean z, boolean z2) {
        if (!this.x.get()) {
            n();
            return;
        }
        cqbd cqbdVarA = i.a();
        cqbdVarA.I("Default SMS app changed.");
        cqbdVarA.B("beforeState", z);
        cqbdVarA.B("currentState", z2);
        cqbdVarA.r();
        final ellg ellgVar = (ellg) ellh.a.createBuilder();
        ellf ellfVar = ellf.BUGLE_SETTING;
        ellgVar.copyOnWrite();
        ellh ellhVar = (ellh) ellgVar.instance;
        ellhVar.j = ellfVar.f11do;
        ellhVar.b |= 1;
        final elsz elszVar = (elsz) elta.a.createBuilder();
        final elkv elkvVar = (elkv) elkw.a.createBuilder();
        elkvVar.copyOnWrite();
        elkw elkwVar = (elkw) elkvVar.instance;
        elkwVar.b |= 1;
        elkwVar.c = z;
        elkvVar.copyOnWrite();
        elkw elkwVar2 = (elkw) elkvVar.instance;
        elkwVar2.b |= 2;
        elkwVar2.d = z2;
        final long epochMilli = this.t.f().toEpochMilli();
        cqnx.c(eiju.g(eijx.m(this.B).a(new Callable() { // from class: ajic
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return Boolean.valueOf(epochMilli - ((Long) eork.q(this.a.B)).longValue() < ajjf.h);
            }
        }, this.ac)).h(new ejvr() { // from class: ajhr
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                elkv elkvVar2 = elkvVar;
                elkvVar2.copyOnWrite();
                elkw elkwVar3 = (elkw) elkvVar2.instance;
                elkw elkwVar4 = elkw.a;
                elkwVar3.b |= 4;
                elkwVar3.e = zBooleanValue;
                elsz elszVar2 = elszVar;
                elszVar2.copyOnWrite();
                elta eltaVar = (elta) elszVar2.instance;
                elkw elkwVar5 = (elkw) elkvVar2.build();
                elta eltaVar2 = elta.a;
                elkwVar5.getClass();
                eltaVar.c = elkwVar5;
                eltaVar.b |= 2;
                ellg ellgVar2 = ellgVar;
                ellgVar2.copyOnWrite();
                ellh ellhVar2 = (ellh) ellgVar2.instance;
                elta eltaVar3 = (elta) elszVar2.build();
                ellh ellhVar3 = ellh.a;
                eltaVar3.getClass();
                ellhVar2.p = eltaVar3;
                ellhVar2.b |= 64;
                this.a.v.j(ellgVar2);
                return null;
            }
        }, this.z), "BugleUsageStatistics", "Failed to update logDefaultSmsAppChange");
    }

    @Override // defpackage.ajhd
    public final void r() {
        if (this.x.get()) {
            ((ains) this.U.b()).e("Bugle.Rcs.Onboarding.Boew.Outcome.Counts", ((crqx) this.W.b()).q() - 1);
        } else {
            n();
        }
    }

    @Override // defpackage.ajhd
    public final void s(basd basdVar, int i2) {
        aX(basdVar, null, i2, 36, null, null, null);
    }

    @Override // defpackage.ajhd
    public final void t(basd basdVar, MessageCoreData messageCoreData, int i2, enyw enywVar) {
        aX(basdVar, messageCoreData, i2, 3, null, enywVar, null);
    }

    @Override // defpackage.ajhd
    public final void u(basd basdVar, MessageCoreData messageCoreData, int i2, enyw enywVar, elny elnyVar) {
        aX(basdVar, messageCoreData, i2, 8, null, enywVar, elnyVar);
    }

    @Override // defpackage.ajhd
    public final void v(basd basdVar, MessageCoreData messageCoreData, int i2, enyw enywVar) {
        if (messageCoreData != null) {
            aM(messageCoreData, ajfi.a(messageCoreData, 3));
        }
        aX(basdVar, messageCoreData, i2, 2, null, enywVar, null);
    }

    @Override // defpackage.ajhd
    public final void w(basd basdVar, MessageCoreData messageCoreData, int i2, enxu enxuVar, enyw enywVar) {
        aX(basdVar, messageCoreData, i2, 6, enxuVar, enywVar, null);
    }

    @Override // defpackage.ajhd
    public final void x(MessageCoreData messageCoreData, elij elijVar) {
        if (this.x.get()) {
            aQ(messageCoreData, elijVar, false);
        } else {
            n();
        }
    }

    @Override // defpackage.ajhd
    public final void y(MessageCoreData messageCoreData, elij elijVar) {
        if (this.x.get()) {
            aQ(messageCoreData, elijVar, true);
        } else {
            n();
        }
    }

    @Override // defpackage.ajhd
    @Deprecated
    public final void z(MessageCoreData messageCoreData, String str) {
        new ajeo(messageCoreData, str);
    }
}
