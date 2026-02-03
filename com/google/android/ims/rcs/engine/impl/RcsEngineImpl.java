package com.google.android.ims.rcs.engine.impl;

import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.text.TextUtils;
import androidx.car.app.hardware.info.EnergyProfile;
import com.google.android.ims.chatsession.ChatSessionEngine;
import com.google.android.ims.jibe.service.filetransfer.FileTransferEngine;
import com.google.android.ims.jibe.service.signup.SignupEngine;
import com.google.android.ims.network.common.RcsEngine;
import com.google.android.ims.provisioning.config.ImsConfiguration;
import com.google.android.ims.provisioning.config.InstantMessageConfiguration;
import com.google.android.ims.rcs.engine.IRcsEngineTemporaryController;
import com.google.android.ims.rcs.engine.impl.RcsEngineImpl;
import com.google.android.ims.rcsservice.businessinfo.BusinessInfoContentProvider;
import com.google.android.ims.rcsservice.businessinfo.BusinessInfoDatabase;
import com.google.android.ims.rcsservice.ims.ImsEvent;
import com.google.android.ims.rcsservice.ims.ImsRegistrationState;
import com.google.android.ims.util.common.RcsIntents;
import com.google.android.libraries.jibe.service.locationsharing.LocationSharingEngine;
import defpackage.a;
import defpackage.alpc;
import defpackage.cqaz;
import defpackage.crmx;
import defpackage.dbho;
import defpackage.dewk;
import defpackage.dewo;
import defpackage.dexn;
import defpackage.deza;
import defpackage.dezd;
import defpackage.dezf;
import defpackage.dfaq;
import defpackage.dfcf;
import defpackage.dfcj;
import defpackage.dfdd;
import defpackage.dfdi;
import defpackage.dfdj;
import defpackage.dfdk;
import defpackage.dfdv;
import defpackage.dfer;
import defpackage.dffx;
import defpackage.dfhn;
import defpackage.dfid;
import defpackage.dfnp;
import defpackage.dfnv;
import defpackage.dfny;
import defpackage.dfoc;
import defpackage.dfod;
import defpackage.dfog;
import defpackage.dfpk;
import defpackage.dfpo;
import defpackage.dfpu;
import defpackage.dfpv;
import defpackage.dfrk;
import defpackage.dfvx;
import defpackage.dfxv;
import defpackage.dfxx;
import defpackage.dfyd;
import defpackage.dfyj;
import defpackage.dfyx;
import defpackage.dfyy;
import defpackage.dfza;
import defpackage.dfzd;
import defpackage.dfze;
import defpackage.dfzz;
import defpackage.dgfs;
import defpackage.dgfu;
import defpackage.dgiq;
import defpackage.dgiu;
import defpackage.dgrs;
import defpackage.dgto;
import defpackage.dguc;
import defpackage.dgue;
import defpackage.dguf;
import defpackage.dgve;
import defpackage.dgwa;
import defpackage.dgwg;
import defpackage.dgxb;
import defpackage.dgxf;
import defpackage.dgxg;
import defpackage.dgxi;
import defpackage.dgxj;
import defpackage.dgya;
import defpackage.dgyl;
import defpackage.dgyu;
import defpackage.dgzu;
import defpackage.dham;
import defpackage.dhat;
import defpackage.dhaw;
import defpackage.dhbb;
import defpackage.dhbc;
import defpackage.dhbd;
import defpackage.dhby;
import defpackage.dhbz;
import defpackage.dhds;
import defpackage.dhdy;
import defpackage.dhej;
import defpackage.dhel;
import defpackage.dhes;
import defpackage.dhff;
import defpackage.dhgr;
import defpackage.dhgz;
import defpackage.dhhd;
import defpackage.dhht;
import defpackage.dhhv;
import defpackage.dhhw;
import defpackage.dhip;
import defpackage.dhiz;
import defpackage.dhja;
import defpackage.dhjl;
import defpackage.dhjm;
import defpackage.dhjt;
import defpackage.dhkf;
import defpackage.dhki;
import defpackage.dhkq;
import defpackage.dhkw;
import defpackage.dhme;
import defpackage.dhnr;
import defpackage.diep;
import defpackage.dstu;
import defpackage.ebja;
import defpackage.ebjd;
import defpackage.eblf;
import defpackage.eblg;
import defpackage.ebqr;
import defpackage.ekgb;
import defpackage.eosc;
import defpackage.eosd;
import defpackage.ewfn;
import defpackage.ewfo;
import defpackage.ewfp;
import defpackage.ewfq;
import defpackage.ewfu;
import defpackage.ewrb;
import defpackage.fcsu;
import j$.net.URLEncoder;
import j$.time.Instant;
import j$.util.Collection;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import j$.util.function.Function$CC;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class RcsEngineImpl extends IRcsEngineTemporaryController.Stub implements RcsEngine {
    public static final int[] VPN_DEPRIORITIZED_NETWORK_REGISTRATION_ORDER = {1, 0, 17};
    private static final dfny a = dfod.a(156458435);
    private static final dfny b = dfod.a(189858511);
    private static final dfny c = dfod.a(177065032);
    static final dfny<Boolean> reinitializeImsServicesWhenEmpty = dfnv.b("reinitialize_ims_services_when_empty");
    static final dfny<Boolean> setRcsEngineStateNullOnStop = dfnv.b("set_rcs_engine_state_null_on_stop");
    private final FileTransferEngine A;
    private final ChatSessionEngine B;
    private final LocationSharingEngine C;
    private final dhes D;
    private final dfnp E;
    private final eosc F;
    private final eosd G;
    private final crmx H;
    private final dffx I;
    private final dfhn J;
    private final dfyd K;
    private final dgrs L;
    private final dgiu M;
    private final dgxf N;
    private final dgwa O;
    private final eblg P;
    private final dhgr Q;
    private final fcsu R;
    private final dfxx S;
    private final dhme T;
    private final dhdy U;
    private final dfpv V;
    private final diep W;
    private final dhnr X;
    private final deza Y;
    private final dfzz Z;
    private final alpc aa;
    private dfyj ab;
    private dgwg ac;
    private final HandlerThread af;
    private final Handler ag;
    private final dfze ai;
    private final dhbd aj;
    private final dhkw d;
    private final dgxg e;
    private final ebja f;
    private final dgfu g;
    private final dfyy h;
    private final dgxj i;
    private dexn j;
    private dfer k;
    private dfpu l;
    final dfcj loggingController;
    private final dhip m;
    private final Context n;
    private final BusinessInfoDatabase o;
    private final dewk p;
    private final dgto q;
    private final dfdd r;
    private final dgxb s;
    private final dfdi t;
    private final dfcf u;
    private final dhgz v;
    private final dhbz w;
    private final dfdv x;
    private final dhel y;
    private final dhej z;
    private dezf ad = dezf.UNKNOWN;
    private dhds ae = dhds.STATE_UNKNOWN;
    private final CopyOnWriteArrayList ah = new CopyOnWriteArrayList();

    /* renamed from: $r8$lambda$lIdnFHL6R-jcHCNq8eNjbUAiuqE, reason: not valid java name */
    public static /* synthetic */ void m313$r8$lambda$lIdnFHL6RjcHCNq8eNjbUAiuqE(RcsEngineImpl rcsEngineImpl, Context context) {
        dhja.k("Notify Bugle of ZERO_SESSION_ID", new Object[0]);
        rcsEngineImpl.notifyBugleOfZeroSessionId(context);
    }

    public RcsEngineImpl(final Context context, BusinessInfoDatabase businessInfoDatabase, dfdd dfddVar, dfdi dfdiVar, dfcf dfcfVar, dgxb dgxbVar, dhgz dhgzVar, dfdv dfdvVar, dhel dhelVar, dhbz dhbzVar, FileTransferEngine fileTransferEngine, ChatSessionEngine chatSessionEngine, LocationSharingEngine locationSharingEngine, dhes dhesVar, dfnp dfnpVar, dewk dewkVar, dgto dgtoVar, eosc eoscVar, eosd eosdVar, dfcj dfcjVar, crmx crmxVar, dgiu dgiuVar, dfdj dfdjVar, dfhn dfhnVar, dfyd dfydVar, ebja ebjaVar, dgfu dgfuVar, dgxf dgxfVar, dhbc dhbcVar, dgrs dgrsVar, dgve dgveVar, dfza dfzaVar, dgwa dgwaVar, eblg eblgVar, dhgr dhgrVar, SignupEngine signupEngine, dfxx dfxxVar, fcsu<dfrk> fcsuVar, dhej dhejVar, dhme dhmeVar, dhdy dhdyVar, dfpv dfpvVar, diep diepVar, dhnr dhnrVar, dfze dfzeVar, deza dezaVar, dezd dezdVar, dfzz dfzzVar, alpc alpcVar, dhki dhkiVar, dfyy dfyyVar, dffx dffxVar, dgxj dgxjVar) {
        dhja.k("RcsEngine SipConnectionType set to %s", dhkiVar.name());
        dezdVar.a = dhkiVar;
        dhip dhipVarA = dhip.a(String.format("RcsEngineImpl[%s]", dhkiVar.d));
        this.m = dhipVarA;
        dhja.l(dhipVarA, "instantiated in package: %s", context.getPackageName());
        if ("com.google.android.ims".equals(context.getPackageName())) {
            if (dfpk.x()) {
                dhbzVar.b(getClass().getSimpleName(), new dhby() { // from class: dgtz
                    @Override // defpackage.dhby
                    public final void a() {
                        RcsEngineImpl.m313$r8$lambda$lIdnFHL6RjcHCNq8eNjbUAiuqE(this.a, context);
                    }
                });
            } else if (dhgzVar.x()) {
                notifyBugleOfZeroSessionId(context);
                dhgzVar.c();
            }
        }
        this.n = context;
        this.d = dezdVar;
        this.v = dhgzVar;
        this.w = dhbzVar;
        this.x = dfdvVar;
        this.o = businessInfoDatabase;
        this.p = dewkVar;
        this.q = dgtoVar;
        this.r = dfddVar;
        this.s = dgxbVar;
        this.t = dfdiVar;
        this.u = dfcfVar;
        this.y = dhelVar;
        this.A = fileTransferEngine;
        this.B = chatSessionEngine;
        this.C = locationSharingEngine;
        this.D = dhesVar;
        this.F = eoscVar;
        this.G = eosdVar;
        this.loggingController = dfcjVar;
        this.J = dfhnVar;
        HandlerThread handlerThread = new HandlerThread("RCS Engine Handler");
        this.af = handlerThread;
        handlerThread.start();
        this.ag = new dguf(handlerThread.getLooper(), this, dfydVar);
        this.E = dfnpVar;
        this.H = crmxVar;
        this.aj = new dhbd(context, this);
        this.e = dhbcVar;
        this.M = dgiuVar;
        this.I = dffxVar;
        this.K = dfydVar;
        this.z = dhejVar;
        this.f = ebjaVar;
        this.g = dgfuVar;
        this.N = dgxfVar;
        this.L = dgrsVar;
        this.O = dgwaVar;
        this.P = eblgVar;
        this.Q = dhgrVar;
        this.R = fcsuVar;
        this.S = dfxxVar;
        this.h = dfyyVar;
        this.T = dhmeVar;
        this.U = dhdyVar;
        this.V = dfpvVar;
        this.W = diepVar;
        this.X = dhnrVar;
        this.ai = dfzeVar;
        this.Y = dezaVar;
        this.Z = dfzzVar;
        this.i = dgxjVar;
        this.aa = alpcVar;
    }

    private final dgzu a() {
        dgzu dgzuVar = (dgzu) this.O.a(dgzu.class);
        if (dgzuVar != null) {
            return dgzuVar;
        }
        throw new dfvx();
    }

    private final void b(dgiq dgiqVar, dhjt dhjtVar) {
        dfyj dfyjVar = this.ab;
        if (dfyjVar == null) {
            dhja.h(this.m, "imsModule is null, unable to add RCS services", new Object[0]);
            return;
        }
        dgwg dgwgVar = this.ac;
        eblg eblgVar = this.P;
        dhaw dhawVar = new dhaw(dfyjVar, dgwgVar, eblgVar, this.H, this.N, dhjtVar, this.T, this.X);
        dgxi dgxiVarA = this.i.a(this.ab, this.ac, dhjtVar, dgiqVar, dhawVar, this.n);
        if (!dfog.R()) {
            dgwa dgwaVar = this.O;
            dgwaVar.e(dhawVar);
            dgwaVar.e(dgxiVarA);
        } else if (dhki.DUAL_REG.equals(this.d.a(this.D.b()))) {
            this.O.e(dgxiVarA);
        }
        this.O.e(new dgya(this.ab, this.ac, eblgVar, dhjtVar));
        dhgr dhgrVar = this.Q;
        try {
            dhgrVar.e = a.x(URLEncoder.encode(dgiqVar.m().w(), StandardCharsets.UTF_8.name()), "_groupsessions.xml");
            dhja.k("Using filename for group state: %s", dhiz.FILE.c(dhgrVar.e));
        } catch (UnsupportedEncodingException e) {
            dhja.i(e, "URLEncoder does not support UTF-8 encoding", new Object[0]);
        }
        final dhgr dhgrVar2 = this.Q;
        if (dfpk.x()) {
            dhgrVar2.d.b(dhgrVar2.getClass().getSimpleName(), new dhby() { // from class: dhgq
                @Override // defpackage.dhby
                public final void a() {
                    dhja.k("Clearing GroupInfo.", new Object[0]);
                    dhgr dhgrVar3 = dhgrVar2;
                    Map map = dhgrVar3.b;
                    synchronized (map) {
                        map.clear();
                        try {
                            dhgrVar3.d();
                        } catch (IOException e2) {
                            dhja.g("Failed to clear GroupInfo. %s.", e2.getMessage());
                        }
                    }
                }
            });
        }
        if (((Boolean) dhgr.a.a()).booleanValue()) {
            dhgrVar2.b();
        }
        dfyj dfyjVar2 = this.ab;
        dgwg dgwgVar2 = this.ac;
        eblg eblgVar2 = this.P;
        crmx crmxVar = this.H;
        dgyu dgyuVar = new dgyu(dfyjVar2, dgwgVar2, eblgVar2, crmxVar, dhjtVar, dhgrVar2);
        dgwa dgwaVar2 = this.O;
        dgwaVar2.e(dgyuVar);
        dgwaVar2.e(new dgzu(this.n, this.ab, this.ac, eblgVar2, crmxVar, this.f, this.N, this.loggingController, dhjtVar, dhgrVar2, new dgyl(), this.Y, this.Z));
        dhja.l(this.m, "completed adding RCS services to imsServiceManager", new Object[0]);
    }

    private final void c() {
        dhjm.c(this.n, RcsIntents.ACTION_DEBUG_OPTION_RESET_RCS_CONFIG_RESPONSE, null, dhjl.RCS_ENGINE_IMPL);
    }

    private final void d(final dgiq dgiqVar) {
        Collection.EL.stream(this.ah).forEach(new Consumer() { // from class: dgud
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void z(Object obj) {
                ((dgin) obj).u(dgiqVar);
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
    }

    private final void e() {
        if (((Boolean) setRcsEngineStateNullOnStop.a()).booleanValue()) {
            dhja.l(this.m, "resetting RcsEngine internal state", new Object[0]);
            this.ab = null;
            this.j = null;
            this.l = null;
            this.k = null;
            this.ah.clear();
        }
    }

    private final void f() {
        dhip dhipVar = this.m;
        dhja.l(dhipVar, "Triggering reconfiguration", new Object[0]);
        dhds dhdsVar = dhds.STATE_UNKNOWN;
        dezf dezfVar = dezf.RECONFIGURATION_REQUIRED;
        updateRcsImsState(dhdsVar, dezfVar);
        if (g()) {
            dhja.l(dhipVar, "Shutting down RCS stack for reconfiguration", new Object[0]);
            dfyj dfyjVar = this.ab;
            if (dfyjVar != null) {
                dfyjVar.k(dezfVar);
            }
        } else {
            this.ag.sendEmptyMessage(1);
            c();
        }
        new Bundle().putString(RcsIntents.EXTRA_SIM_ID, this.D.l());
        dhjm.b(this.n, new Intent(RcsIntents.ACTION_RCS_RECONFIGURATION_REQUIRED), "com.google.android.apps.messaging.rcsprovisioning.RcsProvisioningBroadcastReceiver", dhjl.RCS_ENGINE_IMPL);
    }

    private final boolean g() {
        dfyj dfyjVar = this.ab;
        if (dfyjVar == null) {
            dhja.l(this.m, "imsModule is null, shutdown not required", new Object[0]);
            return false;
        }
        dhja.d(this.m, "ImsModule is started:[%s]", String.valueOf(dfyjVar.n()));
        return this.ab.n();
    }

    public static int[] getNetworkRegistrationOrder() {
        return dfpk.n() ? VPN_DEPRIORITIZED_NETWORK_REGISTRATION_ORDER : RcsEngine.DEFAULT_NETWORK_REGISTRATION_ORDER;
    }

    private final dham h(String str, int i) {
        dgzu dgzuVarA = a();
        try {
            dham dhamVar = new dham(this.n, dgzuVarA, this.P, str, this.f, this.Q, this.loggingController, dgzuVarA.f, dgzuVarA.t, i, this.Y);
            dhamVar.T = this.Z;
            return dhamVar;
        } catch (ebjd e) {
            throw new dfvx("Unable to create originating session", e);
        }
    }

    public static /* synthetic */ IllegalStateException lambda$onImsModuleStarted$0() {
        return new IllegalStateException("RCS Configuration is empty.");
    }

    public void createImsProviders(Optional<dgiq> optional, dhjt dhjtVar) {
        dgwa dgwaVar = this.O;
        dgyu dgyuVar = (dgyu) dgwaVar.a(dgyu.class);
        if (this.j == null) {
            dexn dexnVar = new dexn(this.n, this.P, (dgzu) dgwaVar.a(dgzu.class), dgyuVar, this.Q, this.B, this.s, this.x, this.r, this.H, this.f, this.M, this.loggingController, dhjtVar, this.W, this.Y);
            this.j = dexnVar;
            this.ah.add(dexnVar);
        }
        if (this.l == null) {
            dfpu dfpuVar = new dfpu(this.n, (dgyu) dgwaVar.a(dgyu.class), this.Q, this.j, this.v, this.U, this.V);
            this.l = dfpuVar;
            this.ah.add(dfpuVar);
        }
        if (TextUtils.isEmpty((String) optional.map(new Function() { // from class: dgua
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((dgiq) obj).o();
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).map(new Function() { // from class: dgub
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((InstantMessageConfiguration) obj).mFtHttpContentServerUri;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).orElse(null))) {
            if (this.k == null) {
                dhja.j(new dgue(), this.m, "ftHttpContentServerUri is empty from config - file transfer provider is null and will not be initialized", new Object[0]);
            }
        } else if (this.k == null) {
            Context context = this.n;
            InstantMessageConfiguration instantMessageConfigurationD = this.ab.d();
            dexn dexnVar2 = this.j;
            dfer dferVar = new dfer(context, instantMessageConfigurationD, dexnVar2, dexnVar2, this.A, this.s, this.x, this.g, this.I, this.J, new dguc(this));
            this.k = dferVar;
            this.ah.add(dferVar);
        }
    }

    @Override // defpackage.dfvy
    public dhat createIncomingSession(ebqr ebqrVar) {
        dgzu dgzuVarA = a();
        try {
            dhat dhatVar = new dhat(this.n, dgzuVarA, this.P, ebqrVar, this.f, this.Q, this.loggingController, dgzuVarA.f, dgzuVarA.t, this.Y);
            dhatVar.T = this.Z;
            return dhatVar;
        } catch (ebjd e) {
            throw new dfvx("Unable to create terminating session", e);
        }
    }

    @Override // defpackage.dfvy
    public dham createOutgoingSession(String str) {
        return h(str, 1);
    }

    @Override // defpackage.dfvy
    public dham createOutgoingSlmSession(String str) {
        return h(str, 2);
    }

    @Override // com.google.android.ims.network.common.RcsEngine
    public void dumpState(PrintWriter printWriter) {
        String str;
        printWriter.println("-- RCS Engine State --");
        printWriter.println("  SipConnectionType: ".concat(String.valueOf(String.valueOf(this.d.a(this.D.b())))));
        printWriter.println(" - Clearcut Uptime Tracker State -");
        dfyd dfydVar = this.K;
        printWriter.printf("  Instance ID: %s\n", dfydVar.e);
        long j = dfydVar.f;
        printWriter.printf("  Instantiated: %s [%s],\n", Long.valueOf(j), Instant.ofEpochMilli(j));
        printWriter.printf("  Sequence No: %s,\n", Long.valueOf(dfydVar.g));
        printWriter.printf("  Previous state: %s,\n", dfydVar.f(dfydVar.m));
        printWriter.printf("  Current state: %s,\n", dfydVar.f(dfydVar.n));
        dbho dbhoVar = dfydVar.o;
        Object objD = dbhoVar.d();
        int iA = ewrb.a(((Integer) dbhoVar.d()).intValue());
        String str2 = "NETWORK_TYPE_UNKNOWN";
        if (iA != 0) {
            switch (iA - 1) {
                case 1:
                    str2 = "LTE";
                    break;
                case 2:
                    str2 = "CDMA";
                    break;
                case 3:
                    str2 = "GSM";
                    break;
                case 4:
                    str2 = "WIFI";
                    break;
                case 5:
                    str2 = "LAN";
                    break;
                case 6:
                    str2 = "CELLULAR";
                    break;
                case 7:
                    str2 = "GPRS";
                    break;
                case 8:
                    str2 = "EDGE";
                    break;
                case 9:
                    str2 = "UMTS";
                    break;
                case 10:
                    str2 = "EVDO";
                    break;
                case 11:
                    str2 = "HSPA";
                    break;
                case 12:
                    str2 = "IDEN";
                    break;
                case 13:
                    str2 = "EHRPD";
                    break;
                case 14:
                    str2 = "VPN";
                    break;
                case 15:
                    str2 = "NR";
                    break;
                case 16:
                    str2 = "ONEXRTT";
                    break;
            }
        }
        printWriter.printf("  Last registered network: %s [%s],\n", objD, str2);
        dbho dbhoVar2 = dfydVar.h;
        printWriter.printf("  Registered timestamp: %s [%s],\n", dbhoVar2.d(), dfydVar.e(dbhoVar2));
        dbho dbhoVar3 = dfydVar.i;
        printWriter.printf("  Unregistered timestamp: %s [%s],\n", dbhoVar3.d(), dfydVar.e(dbhoVar3));
        dbho dbhoVar4 = dfydVar.j;
        printWriter.printf("  Ignored timestamp: %s [%s],\n", dbhoVar4.d(), dfydVar.e(dbhoVar4));
        switch (dfydVar.d(dfydVar.k).ordinal()) {
            case 1:
                str = "RCS_UPTIME_IGNORE_NO_VALID_CONFIG";
                break;
            case 2:
                str = "RCS_UPTIME_IGNORE_NO_NETWORK_CONNECTIVITY";
                break;
            case 3:
                str = "RCS_UPTIME_IGNORE_NO_SIM";
                break;
            case 4:
                str = "RCS_UPTIME_IGNORE_DISABLED_VIA_PREFERENCES";
                break;
            case 5:
                str = "RCS_UPTIME_IGNORE_DEVICE_SHUTDOWN";
                break;
            case 6:
                str = "RCS_UPTIME_IGNORE_MISSING_PERMISSION";
                break;
            case 7:
                str = "RCS_UPTIME_IGNORE_BLOCKED_NETWORK";
                break;
            case 8:
                str = "RCS_UPTIME_IGNORE_SIP_DISABLED_BY_BUGLE";
                break;
            default:
                str = "RCS_UPTIME_IGNORE_REASON_UNKNOWN";
                break;
        }
        printWriter.printf("  Ignored reason: %s,\n", str);
        dfyj dfyjVar = this.ab;
        if (dfyjVar != null) {
            printWriter.println(" - IMS Module ".concat(String.valueOf(String.valueOf(dfyjVar.l))));
            dfyx dfyxVar = dfyjVar.b;
            if (dfyxVar != null) {
                dfyxVar.f(printWriter);
            }
        }
    }

    public dfyd getClearcutUptimeTracker() {
        return this.K;
    }

    public Looper getHandlerThreadLooper() {
        return this.af.getLooper();
    }

    @Override // com.google.android.ims.network.common.RcsEngine
    public dfyj getImsModule() {
        return this.ab;
    }

    public dgwa getImsServiceManager() {
        return this.O;
    }

    @Override // defpackage.dgtu
    public dhds getLastRegistrationState() {
        return this.ae;
    }

    public dfxv getProvisioningEngineV2StateReporter() {
        return this.q;
    }

    @Override // defpackage.dezc
    public ImsRegistrationState getRegistrationState() {
        dfyj dfyjVar;
        if (this.ab != null) {
            dfyjVar = this.ab;
            if (dfyjVar == null && dfyjVar.m()) {
                return new ImsRegistrationState(dhds.REGISTRATION_SUCCESSFUL);
            }
            if (!this.ae.equals(dhds.REGISTRATION_TERMINATED) || this.ae.equals(dhds.REGISTRATION_FAILED)) {
                return new ImsRegistrationState(this.ae, this.ad);
            }
        } else if (!((Boolean) dfyd.b.a()).booleanValue() || !dhds.REGISTRATION_DISABLED_BY_BUGLE.equals(this.ae)) {
            if (!((Boolean) setRcsEngineStateNullOnStop.a()).booleanValue()) {
                return new ImsRegistrationState(dhds.STATE_UNKNOWN);
            }
            dfyjVar = this.ab;
            if (dfyjVar == null) {
            }
            if (!this.ae.equals(dhds.REGISTRATION_TERMINATED)) {
            }
            return new ImsRegistrationState(this.ae, this.ad);
        }
        return new ImsRegistrationState(this.ae);
    }

    @Override // com.google.android.ims.network.common.RcsEngine
    public dhki getSipConnectionType() {
        return this.d.a(this.D.b());
    }

    public fcsu<eblf> getSipStackProvider() {
        return this.P;
    }

    @Override // defpackage.dezc
    public boolean hasActiveRegistration() {
        dfyx dfyxVar;
        dfyj dfyjVar = this.ab;
        if (dfyjVar == null || !dfyjVar.n() || (dfyxVar = this.ab.b) == null) {
            return false;
        }
        return dfyxVar.k();
    }

    @Override // com.google.android.ims.network.common.RcsEngine
    public void init() {
        dhja.l(this.m, "Initializing RcsEngine.", new Object[0]);
        ewfp ewfpVar = ewfp.REQUEST_RECONFIGURATION;
        dhel dhelVar = this.y;
        dhelVar.b(this, ewfpVar);
        dhelVar.b(this, ewfp.RESET_PROVISIONING_ENGINE);
        dhelVar.b(this, ewfp.SEND_KEEPALIVE);
        dfnp dfnpVar = this.E;
        dfnpVar.a.add(this);
        dfnpVar.a();
        dhja.c("Start listening for network changes", new Object[0]);
        dhja.c("Listen for network callbacks", new Object[0]);
        dfze dfzeVar = this.ai;
        try {
            dhkq dhkqVarF = dhkq.f(dfzeVar.a);
            dfzd dfzdVar = dfzeVar.c;
            dfzdVar.getClass();
            dhkqVarF.g(dfzdVar);
        } catch (dhkf e) {
            dhja.i(e, "Could not register network callback.", new Object[0]);
        }
        this.ai.a(this);
        this.K.r = Optional.of(this);
        dhja.l(this.m, "Initializing RBM resource permissions.", new Object[0]);
        BusinessInfoDatabase businessInfoDatabase = this.o;
        ekgb<String> rbmBotIds = businessInfoDatabase.getRbmBotIds();
        int size = rbmBotIds.size();
        for (int i = 0; i < size; i++) {
            String str = rbmBotIds.get(i);
            Context context = this.n;
            BusinessInfoContentProvider.BusinessInfoContentProviderInternal.grantBugleAccessToBusinessMedia(businessInfoDatabase, context, str, 0);
            BusinessInfoContentProvider.BusinessInfoContentProviderInternal.grantBugleAccessToBusinessMedia(businessInfoDatabase, context, str, 1);
            BusinessInfoContentProvider.BusinessInfoContentProviderInternal.grantBugleAccessToBusinessMedia(businessInfoDatabase, context, str, 2);
        }
    }

    @Override // defpackage.dezc
    public boolean isRegistered() {
        dfyj dfyjVar = this.ab;
        if (dfyjVar == null) {
            return false;
        }
        return dfyjVar.m();
    }

    public void notifyBugleOfZeroSessionId(Context context) {
        Intent intent = new Intent("com.google.android.ims.ZERO_SESSION_ID");
        dhff.c(context, intent);
        intent.setPackage("com.google.android.apps.messaging");
        context.sendBroadcast(intent);
    }

    @Override // defpackage.dfyl
    public void onConnectivityChange(Context context, int i) {
        dhja.d(this.m, "onConnectivityChange: RcsEngine received connectivity change event", new Object[0]);
        this.ag.sendEmptyMessage(2);
    }

    @Override // defpackage.dfno
    public synchronized void onCsLibPhenotypeUpdated() {
        dfyj dfyjVar = this.ab;
        if (dfyjVar != null) {
            dhja.d(dfyjVar.l, "Phenotype flags updated.", new Object[0]);
        }
    }

    @Override // defpackage.dfyr
    public void onForbidden(boolean z) {
        if (!z) {
            dhja.r(this.m, "IMS registration is rejected because user is not found", new Object[0]);
        } else {
            dhja.r(this.m, "IMS registration is forbidden for the user", new Object[0]);
            onReconfigurationRequested();
        }
    }

    @Override // defpackage.dfyr
    public void onImsModuleInitialized() {
        dhja.l(this.m, "IMS module has been initialized", new Object[0]);
        this.x.b(new ImsEvent(30105, 0L), dhjl.RCS_ENGINE_IMPL);
    }

    @Override // defpackage.dfyr
    public void onImsModuleStartFailed(dezf dezfVar) {
        updateRcsImsState(dhds.REGISTRATION_FAILED, dezfVar);
        ImsEvent imsEvent = new ImsEvent(30101, dezfVar.ordinal());
        dhjl dhjlVar = dhjl.RCS_ENGINE_IMPL;
        dfdv dfdvVar = this.x;
        dfdvVar.a(imsEvent, dhjlVar);
        dfdvVar.b(new ImsEvent(30106, 0, EnergyProfile.EVCONNECTOR_TYPE_OTHER), dhjlVar);
        if (dezfVar == dezf.RECONFIGURATION_REQUIRED) {
            f();
        }
    }

    @Override // defpackage.dfyr
    public void onImsModuleStarted() {
        dhja.l(this.m, "IMS module has started", new Object[0]);
        if (dfpk.x()) {
            this.w.a();
        }
        updateRcsImsState(dhds.REGISTRATION_SUCCESSFUL, dezf.UNKNOWN);
        registerImsProviders();
        dfcf dfcfVar = this.u;
        ImsConfiguration imsConfigurationC = this.ab.c();
        if (((Boolean) dfcf.a.a()).booleanValue() && imsConfigurationC.rcsVolteSingleRegistration) {
            dhja.c("Disabling ImsContactsDiscovery in single regstration mode.", new Object[0]);
        } else if (((Boolean) dfcf.b.a()).booleanValue()) {
            dhja.k("Address Book Scan is disabled.", new Object[0]);
        } else {
            synchronized (dfcfVar.l) {
                dfcfVar.i = false;
                dfdi dfdiVar = dfcfVar.d;
                dfdiVar.d.add(dfcfVar.s);
                if (dfcfVar.r.e()) {
                    dhja.c("Discovery is already waiting for polling period to expire", new Object[0]);
                } else if (dfcfVar.e.w()) {
                    dfcfVar.d();
                } else {
                    dfcfVar.c();
                }
            }
        }
        this.s.d.set(true);
        dgiq dgiqVar = (dgiq) this.M.a().orElseThrow(new Supplier() { // from class: dgty
            @Override // java.util.function.Supplier
            public final Object get() {
                return RcsEngineImpl.lambda$onImsModuleStarted$0();
            }
        });
        if (((Boolean) b.a()).booleanValue()) {
            ImsConfiguration imsConfigurationC2 = this.ab.c();
            if (imsConfigurationC2.rcsVolteSingleRegistration) {
                dhip dhipVar = this.m;
                dhja.l(dhipVar, "Single registration is enabled, save the ImsConfiguration.", new Object[0]);
                dgiqVar.D(imsConfigurationC2);
                this.ab.l(dgiqVar);
                dgrs dgrsVar = this.L;
                dhes dhesVar = this.D;
                dgrsVar.x(dhesVar.l(), dgiqVar);
                dhja.l(dhipVar, "Sending intent to initiate jibe de-provisioning.", new Object[0]);
                dhjm.b(this.n, new Intent(RcsIntents.ACTION_JIBE_DEPROVISION).putExtra(RcsIntents.EXTRA_SUB_ID, dhesVar.b()).putExtra(RcsIntents.EXTRA_SIM_ID, dhesVar.l()), "com.google.android.apps.messaging.rcsprovisioning.RcsProvisioningBroadcastReceiver", dhjl.RCS_ENGINE_IMPL);
            }
        }
        d(dgiqVar);
        ImsEvent imsEvent = new ImsEvent(30100, 0L);
        dfdv dfdvVar = this.x;
        dhjl dhjlVar = dhjl.RCS_ENGINE_IMPL;
        dfdvVar.a(imsEvent, dhjlVar);
        dfdvVar.b(new ImsEvent(30106, 100L), dhjlVar);
        dfer dferVar = this.k;
        if (dferVar != null) {
            dhja.c("Retry all failed file transfers", new Object[0]);
            dhja.c("Trigger all retries immediately", new Object[0]);
            dhhv dhhvVar = dferVar.g;
            ScheduledFuture scheduledFuture = dhhvVar.c;
            if (scheduledFuture != null && !scheduledFuture.isCancelled() && !dhhvVar.c.isDone()) {
                dhja.c("Immediate retry already pending.", new Object[0]);
                return;
            }
            HashMap map = dhhvVar.b;
            synchronized (map) {
                Iterator it = map.values().iterator();
                while (it.hasNext()) {
                    ((ScheduledFuture) it.next()).cancel(false);
                }
                map.clear();
            }
            dhhvVar.c = dhhw.a(new dhht(dhhvVar), 0L, TimeUnit.MILLISECONDS);
        }
    }

    @Override // defpackage.dfyr
    public void onImsModuleStopped(dezf dezfVar) {
        dhja.l(this.m, "IMS module has stopped: %s", dezfVar);
        updateRcsImsState(dhds.REGISTRATION_TERMINATED, dezfVar);
        this.B.unregisterProvider((dewo) this.j);
        this.C.unregisterProvider((dstu) this.l);
        this.A.unregisterProvider((dfid) this.k);
        this.u.f();
        this.t.b();
        this.s.f();
        ImsEvent imsEvent = new ImsEvent(30102, 0L);
        dhjl dhjlVar = dhjl.RCS_ENGINE_IMPL;
        dfdv dfdvVar = this.x;
        dfdvVar.a(imsEvent, dhjlVar);
        dfdvVar.b(new ImsEvent(30106, 101L), dhjlVar);
        if (dezfVar == dezf.RECONFIGURATION_REQUIRED) {
            f();
            c();
        }
    }

    @Override // com.google.android.ims.network.common.RcsEngine
    public void onReconfigurationRequested() {
        f();
    }

    @Override // com.google.android.ims.network.common.RcsEngine
    public void onSimLoaded(boolean z) {
        Object[] objArr = {Boolean.valueOf(z)};
        dhip dhipVar = this.m;
        dhja.l(dhipVar, "SIM is loaded. Changed: %b", objArr);
        Handler handler = this.ag;
        handler.sendEmptyMessage(2);
        dfoc.m();
        dfaq.I(this.n);
        if (z) {
            dhja.d(dhipVar, "SIM has changed. Shutting down IMS module !", new Object[0]);
            shutDownImsModule();
        } else {
            if (this.D.t() && g()) {
                dhja.h(dhipVar, "Unexpected SIM LOADED. Stopping ImsModule.", new Object[0]);
                this.ab.i(dezf.NETWORK_UNAVAILABLE);
            }
            dhja.d(dhipVar, "Ignoring SIM LOADED for unchanged SIM in RCS Engine", new Object[0]);
        }
        handler.sendEmptyMessage(3);
    }

    @Override // com.google.android.ims.network.common.RcsEngine
    public void onSimRemoved() {
        dhja.l(this.m, "SIM has been removed.", new Object[0]);
        dfyj dfyjVar = this.ab;
        if (dfyjVar != null) {
            dfyjVar.k(dezf.NETWORK_UNAVAILABLE);
        }
        dfaq.I(this.n);
        this.ag.sendEmptyMessage(3);
    }

    @Override // defpackage.dhek
    public void onTickle(ewfq ewfqVar) {
        dfyx dfyxVar;
        if (dhki.SINGLE_REG.equals(getSipConnectionType())) {
            dhja.l(this.m, "ignoring FCM tickle message for single-registration RcsEngine instance", new Object[0]);
            return;
        }
        dhip dhipVar = this.m;
        dhja.l(dhipVar, "Self-service message received by RcsEngine. Self service message ID: %s", ewfqVar.c);
        ewfp ewfpVarB = ewfp.b(ewfqVar.b);
        if (ewfpVarB == null) {
            ewfpVarB = ewfp.UNRECOGNIZED;
        }
        int iOrdinal = ewfpVarB.ordinal();
        if (iOrdinal != 1) {
            if (iOrdinal == 2) {
                dhja.l(dhipVar, "Reconfiguration requested by self-service message.", new Object[0]);
                onReconfigurationRequested();
                return;
            } else {
                if (iOrdinal != 3) {
                    dhja.r(dhipVar, "Unexpected self-service message: %s", this.y.a(ewfqVar));
                    return;
                }
                return;
            }
        }
        dhja.l(dhipVar, "SIP keep alive tickle requested by self-service message.", new Object[0]);
        if (!((Boolean) dfpo.p().a.z.a()).booleanValue()) {
            dhja.l(dhipVar, "Ignoring keep alive tickle. Disabled from SipSettings.", new Object[0]);
            return;
        }
        dfyj imsModule = getImsModule();
        if (imsModule == null || !imsModule.n()) {
            dhja.h(dhipVar, "Cannot process keep alive tickle. ImsModule is not initialized or not started", new Object[0]);
            return;
        }
        this.z.a = ewfqVar.c;
        dfyd dfydVar = this.K;
        dhja.c("FCM tickle received. Reporting uptime", new Object[0]);
        ewfu ewfuVar = (ewfu) dfydVar.a().build();
        ewfn ewfnVar = (ewfn) ewfqVar.toBuilder();
        ewfnVar.copyOnWrite();
        ((ewfq) ewfnVar.instance).g = ewfo.a(3);
        dfydVar.d.g(dfydVar.c, (ewfq) ewfnVar.build(), ewfuVar);
        dfyj dfyjVar = this.ab;
        dhbb dhbbVar = new dhbb(ewfqVar, dfyjVar, dfydVar, dfyjVar.m);
        dfyjVar.f(dhbbVar);
        this.ab.m.b(dhbbVar);
        if (isRegistered()) {
            dhja.d(dhipVar, "Client might be registered. Scheduling keep-alive due to keep alive self service message %s", ewfqVar);
            dgfs dgfsVar = imsModule.m;
            dgfsVar.c();
            dgfsVar.i(0);
            return;
        }
        dfyj dfyjVar2 = this.ab;
        if (dfyjVar2 != null && dfyjVar2.n() && (dfyxVar = this.ab.b) != null && dfyxVar.m()) {
            dhja.d(dhipVar, "Registration currently in progress. Ignoring keep alive self service message %s", ewfqVar);
        } else {
            dhja.d(dhipVar, "Client is not registered. Restarting registration due to keep alive self service message %s", ewfqVar);
            imsModule.i(dezf.FCM_TICKLE_KEEP_ALIVE);
        }
    }

    public void registerImsProviders() {
        dhja.d(this.m, "Registering IMS providers", new Object[0]);
        this.B.registerProvider((dewo) this.j);
        this.C.registerProvider((dstu) this.l);
        this.A.registerProvider((dfid) this.k);
    }

    void setChatSessionProvider(dexn dexnVar) {
        cqaz.j();
        this.j = dexnVar;
    }

    void setHttpFileTransferProvider(dfer dferVar) {
        cqaz.j();
        this.k = dferVar;
        this.ah.add(dferVar);
    }

    void setImsModule(dfyj dfyjVar) {
        cqaz.j();
        this.ab = dfyjVar;
    }

    @Override // defpackage.dfyl
    public boolean shouldTriggerOnCapabilitiesChanged() {
        return true;
    }

    public void shutDownImsModule() {
        dfdd dfddVar = this.r;
        try {
            final SQLiteDatabase writableDatabase = dfddVar.getWritableDatabase();
            final ContentValues contentValues = new ContentValues();
            contentValues.put("state", (Integer) 0);
            contentValues.put("capabilities", (Integer) 0);
            contentValues.put("lastActive", (Integer) 0);
            contentValues.put("isOnline", (Integer) 0);
            contentValues.put("responseCode", (Integer) 0);
            dfdk dfdkVar = dfddVar.b;
            dfdk.b(writableDatabase, new Runnable() { // from class: dfcu
                @Override // java.lang.Runnable
                public final void run() {
                    ContentValues contentValues2 = dfdd.a;
                    writableDatabase.update("Subscribers", contentValues, null, null);
                }
            });
        } catch (SQLiteException unused) {
        }
        this.ag.sendEmptyMessage(2);
        dhds dhdsVar = dhds.STATE_UNKNOWN;
        dezf dezfVar = dezf.RECONFIGURATION_REQUIRED;
        updateRcsImsState(dhdsVar, dezfVar);
        if (g()) {
            dhja.c("Shutting down IMS module", new Object[0]);
            this.ab.k(dezfVar);
        }
    }

    @Override // com.google.android.ims.network.common.RcsEngine
    public synchronized void shutdown() {
        dhel dhelVar = this.y;
        dhelVar.f(ewfp.REQUEST_RECONFIGURATION);
        dhelVar.f(ewfp.RESET_PROVISIONING_ENGINE);
        dhelVar.f(ewfp.SEND_KEEPALIVE);
        dfnp dfnpVar = this.E;
        dfnpVar.a.remove(this);
        dfnpVar.b();
        this.t.b();
        this.u.f();
        this.s.f();
        dfyj dfyjVar = this.ab;
        if (dfyjVar != null) {
            dfyjVar.k(dezf.SHUTDOWN);
            this.ai.c(this.ab.b.a());
            this.ab.b.e();
        }
        dgwa dgwaVar = this.O;
        dgwaVar.g(dezf.SHUTDOWN);
        dgwaVar.a.clear();
        dfze dfzeVar = this.ai;
        dfzeVar.c(this);
        dhja.c("Stop listening for network changes", new Object[0]);
        try {
            dhkq dhkqVarF = dhkq.f(dfzeVar.a);
            dfzd dfzdVar = dfzeVar.c;
            dfzdVar.getClass();
            dhkqVarF.h(dfzdVar);
        } catch (IllegalArgumentException unused) {
            dhja.c("NewConnectivityMonitor: defaultNetworkCallback is not registered.", new Object[0]);
        }
        dfzeVar.b.clear();
        e();
    }

    public void startDatabaseSyncerIfNeeded(dgiq dgiqVar) {
        if (dgiqVar == null || dgiqVar.h() == null) {
            dhja.d(this.m, "startDatabaseSyncerIfNeeded: Can't check initial address book scan for null config", new Object[0]);
        } else if (((Boolean) dfcf.b.a()).booleanValue() || dgiqVar.h().disableInitialAddressBookScan) {
            dhja.d(this.m, "startDatabaseSyncerIfNeeded: Initial address book scan disabled", new Object[0]);
        } else {
            dhja.d(this.m, "startDatabaseSyncerIfNeeded: Initial address book scan enabled", new Object[0]);
            this.t.a();
        }
    }

    @Override // defpackage.dgtu
    public void startRcsStack(int i) {
        dhja.l(this.m, "startRcsStack for subId:%d", Integer.valueOf(i));
        this.ag.sendEmptyMessage(0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0228 A[Catch: all -> 0x03cf, TryCatch #0 {, blocks: (B:4:0x0003, B:6:0x0013, B:8:0x0020, B:10:0x0030, B:13:0x0040, B:15:0x006a, B:18:0x0071, B:21:0x007f, B:23:0x0085, B:26:0x0093, B:28:0x00b0, B:30:0x00c3, B:31:0x00d1, B:33:0x0194, B:36:0x01ad, B:38:0x01f2, B:49:0x0228, B:51:0x0242, B:75:0x035b, B:77:0x0367, B:79:0x0382, B:80:0x0395, B:81:0x0397, B:83:0x03a9, B:85:0x03b4, B:86:0x03c2, B:50:0x0231, B:42:0x01fb, B:45:0x0208, B:46:0x0211, B:35:0x01a8, B:52:0x025a, B:54:0x0283, B:69:0x032b, B:71:0x0346, B:73:0x0350, B:74:0x0353, B:56:0x02a1, B:58:0x02b3, B:59:0x02d7, B:61:0x02ed, B:62:0x02f5, B:64:0x030b, B:65:0x0313, B:67:0x0321, B:7:0x001a), top: B:92:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0231 A[Catch: all -> 0x03cf, TryCatch #0 {, blocks: (B:4:0x0003, B:6:0x0013, B:8:0x0020, B:10:0x0030, B:13:0x0040, B:15:0x006a, B:18:0x0071, B:21:0x007f, B:23:0x0085, B:26:0x0093, B:28:0x00b0, B:30:0x00c3, B:31:0x00d1, B:33:0x0194, B:36:0x01ad, B:38:0x01f2, B:49:0x0228, B:51:0x0242, B:75:0x035b, B:77:0x0367, B:79:0x0382, B:80:0x0395, B:81:0x0397, B:83:0x03a9, B:85:0x03b4, B:86:0x03c2, B:50:0x0231, B:42:0x01fb, B:45:0x0208, B:46:0x0211, B:35:0x01a8, B:52:0x025a, B:54:0x0283, B:69:0x032b, B:71:0x0346, B:73:0x0350, B:74:0x0353, B:56:0x02a1, B:58:0x02b3, B:59:0x02d7, B:61:0x02ed, B:62:0x02f5, B:64:0x030b, B:65:0x0313, B:67:0x0321, B:7:0x001a), top: B:92:0x0003 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public synchronized void startRcsStackInternal() {
        /*
            Method dump skipped, instructions count: 978
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.ims.rcs.engine.impl.RcsEngineImpl.startRcsStackInternal():void");
    }

    @Override // defpackage.dgtu
    public void stopRcsStack(int i) {
        dhja.l(this.m, "stopRcsStack for subId:%d", Integer.valueOf(i));
        this.ag.sendEmptyMessage(4);
    }

    public void stopRcsStackInternal() {
        this.ae = ((Boolean) dfyd.b.a()).booleanValue() ? dhds.REGISTRATION_DISABLED_BY_BUGLE : dhds.CONFIGURATION_DISABLED;
        this.ag.sendEmptyMessage(2);
        this.S.e(null);
        if (g()) {
            dhja.l(this.m, "Shutting down IMS module", new Object[0]);
            this.ab.k(dezf.DISABLED);
        } else {
            dhja.l(this.m, "skipping imsModule.stop", new Object[0]);
        }
        e();
    }

    @Override // com.google.android.ims.rcs.engine.IRcsEngineTemporaryController
    public void triggerStartRcsStack(String str) {
        dhja.l(this.m, "triggerStartRcsStack for msisdn:%s", dhiz.PHONE_NUMBER.c(str));
        this.ag.sendEmptyMessage(0);
    }

    @Override // com.google.android.ims.rcs.engine.IRcsEngineTemporaryController
    public void triggerStopRcsStack(String str) {
        dhja.l(this.m, "triggerStopRcsStack for msisdn:%s", dhiz.PHONE_NUMBER.c(str));
        this.ag.sendEmptyMessage(4);
    }

    public void updateRcsConfig() {
        boolean zK;
        dhes dhesVar = this.D;
        dgrs dgrsVar = this.L;
        String strL = dhesVar.l();
        if (dgrsVar.D()) {
            try {
                zK = dgrsVar.b.k("com.google.android.ims.provisioning.engine.bugle_default_sms_app", false, "BuglePhoneNumberUtils");
            } catch (dhhd e) {
                dhja.j(e, dgrs.a, "Error while retrieving if Bugle is default SMS app", new Object[0]);
                zK = false;
            }
            dhja.l(dgrs.a, "Bugle is default SMS app: %s", Boolean.valueOf(zK));
            if (zK && dgrsVar.E(strL)) {
                if (isRegistered()) {
                    dhja.d(this.m, "updateRcsConfig: Already registered, skipping config update request", new Object[0]);
                } else {
                    this.ag.sendEmptyMessage(2);
                }
            }
        }
    }

    public void updateRcsImsState(dhds dhdsVar, dezf dezfVar) {
        dhja.l(this.m, "IMS registration state change [%s -> %s] reason: %s", this.ae.toString(), dhdsVar.toString(), dezfVar.name());
        this.ae = dhdsVar;
        this.ad = dezfVar;
    }
}
