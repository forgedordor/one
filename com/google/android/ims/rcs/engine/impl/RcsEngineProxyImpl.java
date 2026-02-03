package com.google.android.ims.rcs.engine.impl;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.StrictMode;
import com.google.android.ims.chatsession.ChatSessionEngine;
import com.google.android.ims.jibe.service.businessinfo.BusinessInfoEngine;
import com.google.android.ims.jibe.service.connectiontracker.ImsConnectionTrackerEngine;
import com.google.android.ims.jibe.service.contactsmanager.ContactsManager;
import com.google.android.ims.jibe.service.filetransfer.FileTransferEngine;
import com.google.android.ims.jibe.service.profile.RcsProfileEngine;
import com.google.android.ims.jibe.service.signup.SignupEngine;
import com.google.android.ims.jibe.service.singleregistration.SingleRegistrationVendorImsController;
import com.google.android.ims.jibe.service.transportcontrol.TransportControlEngine;
import com.google.android.ims.messaging.MessagingEngine;
import com.google.android.ims.metrics.PeriodicMetricsJobService;
import com.google.android.ims.network.common.RcsEngine;
import com.google.android.ims.rcs.engine.IRcsEngineController;
import com.google.android.ims.rcs.engine.IRcsEngineTemporaryController;
import com.google.android.ims.rcs.engine.RcsEngineLifecycleServiceResult;
import com.google.android.ims.rcs.engine.impl.RcsEngineProxyImpl;
import com.google.android.ims.rcs.singleregistration.ISingleRegistrationVendorImsController;
import com.google.android.ims.rcsservice.businessinfo.IBusinessInfo;
import com.google.android.ims.rcsservice.chatsession.IChatSession;
import com.google.android.ims.rcsservice.contacts.IContactsManagement;
import com.google.android.ims.rcsservice.events.IEvent;
import com.google.android.ims.rcsservice.filetransfer.IFileTransfer;
import com.google.android.ims.rcsservice.ims.IImsConnectionTracker;
import com.google.android.ims.rcsservice.ims.ImsRegistrationState;
import com.google.android.ims.rcsservice.lifecycle.InitializeAndStartRcsTransportRequest;
import com.google.android.ims.rcsservice.lifecycle.StopAllRcsTransportsExceptRequest;
import com.google.android.ims.rcsservice.locationsharing.ILocationSharing;
import com.google.android.ims.rcsservice.profile.IRcsProfile;
import com.google.android.ims.rcsservice.signup.ISignup;
import com.google.android.ims.rcsservice.transportcontrol.ITransportControl;
import com.google.android.ims.util.common.RcsIntents;
import com.google.android.libraries.jibe.service.locationsharing.LocationSharingEngine;
import com.google.android.rcs.client.messaging.IMessaging;
import defpackage.crny;
import defpackage.dcdt;
import defpackage.dejx;
import defpackage.deyw;
import defpackage.dezc;
import defpackage.dezf;
import defpackage.dfdj;
import defpackage.dfdv;
import defpackage.dfio;
import defpackage.dflf;
import defpackage.dfny;
import defpackage.dfod;
import defpackage.dfog;
import defpackage.dfpk;
import defpackage.dfys;
import defpackage.dgrs;
import defpackage.dgtw;
import defpackage.dgtx;
import defpackage.dgva;
import defpackage.dgvb;
import defpackage.dgvc;
import defpackage.dham;
import defpackage.dhat;
import defpackage.dhds;
import defpackage.dhei;
import defpackage.dhel;
import defpackage.dheq;
import defpackage.dhfr;
import defpackage.dhgz;
import defpackage.dhia;
import defpackage.dhin;
import defpackage.dhip;
import defpackage.dhja;
import defpackage.dhka;
import defpackage.dhki;
import defpackage.ebqr;
import defpackage.eiid;
import defpackage.eoqt;
import defpackage.eork;
import defpackage.eosc;
import defpackage.ewht;
import defpackage.ewhv;
import defpackage.ewig;
import defpackage.ewih;
import defpackage.ewwr;
import defpackage.ewwt;
import defpackage.ewwv;
import defpackage.eygg;
import defpackage.fcsu;
import defpackage.kxj;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import java.io.PrintWriter;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class RcsEngineProxyImpl extends IRcsEngineController.Stub implements dgtw, dezc {
    static final dfny<Boolean> enableLoggingRcsEngineInitializationCall = dfod.a(263232862);
    private RcsEngine A;
    private dgvb B;
    private final dhip C = dhip.a("RcsEngineProxyImpl");
    private final dejx D;
    private final eygg a;
    private final fcsu b;
    private final eygg c;
    private final eygg d;
    private final dhei e;
    private final fcsu f;
    private final eygg g;
    private final eygg h;
    private final eygg i;
    private final eygg j;
    private final eygg k;
    private final eosc l;
    private final dcdt m;
    private final eygg n;
    private final eygg o;
    private final crny p;
    private final eygg q;
    private final eygg r;
    private final eygg s;
    private final eygg t;
    private final eygg u;
    private final eygg v;
    private final eygg w;
    private final fcsu x;
    private final Map y;
    private final Context z;

    public static /* synthetic */ void $r8$lambda$gTae8hfuT2tQgdWorI6h2CEm_54(RcsEngineProxyImpl rcsEngineProxyImpl, boolean z) {
        if (((dflf) rcsEngineProxyImpl.x.b()).a()) {
            throw new dgvc("RcsEngineProxy.onSimLoadedInternal");
        }
        try {
            rcsEngineProxyImpl.a().onSimLoaded(z);
        } catch (IllegalStateException e) {
            dhja.j(e, rcsEngineProxyImpl.C, "RcsEngine is not initialized.", new Object[0]);
        }
        if (z) {
            dhja.l(rcsEngineProxyImpl.C, "onSimLoaded: detected a change", new Object[0]);
            ((dfdj) rcsEngineProxyImpl.a.b()).a();
            ((dfio) rcsEngineProxyImpl.c.b()).a();
        }
        dhja.l(rcsEngineProxyImpl.C, "onSimLoaded: isSimLoaded: [%b]", Boolean.valueOf(((dheq) rcsEngineProxyImpl.k.b()).l(rcsEngineProxyImpl.z)));
    }

    public RcsEngineProxyImpl(Context context, Map<dhki, fcsu<RcsEngine>> map, eygg<SignupEngine> eyggVar, eygg<FileTransferEngine> eyggVar2, eygg<ChatSessionEngine> eyggVar3, eygg<LocationSharingEngine> eyggVar4, eygg<ImsConnectionTrackerEngine> eyggVar5, eygg<TransportControlEngine> eyggVar6, eygg<SingleRegistrationVendorImsController> eyggVar7, eygg<ContactsManager> eyggVar8, eygg<RcsProfileEngine> eyggVar9, eygg<MessagingEngine> eyggVar10, eygg<BusinessInfoEngine> eyggVar11, eygg<dfdv> eyggVar12, eygg<dheq> eyggVar13, fcsu<dgrs> fcsuVar, eygg<dhel> eyggVar14, eygg<dfdj> eyggVar15, fcsu<dhgz> fcsuVar2, eygg<dfio> eyggVar16, dhei dheiVar, dcdt dcdtVar, crny crnyVar, eosc eoscVar, eygg<deyw> eyggVar17, dejx dejxVar, fcsu<dflf> fcsuVar3) {
        this.z = context;
        this.y = map;
        this.g = eyggVar;
        this.h = eyggVar2;
        this.i = eyggVar3;
        this.j = eyggVar4;
        this.n = eyggVar5;
        this.o = eyggVar6;
        this.q = eyggVar7;
        this.r = eyggVar8;
        this.s = eyggVar9;
        this.t = eyggVar10;
        this.u = eyggVar11;
        this.v = eyggVar12;
        this.k = eyggVar13;
        this.f = fcsuVar;
        this.d = eyggVar14;
        this.a = eyggVar15;
        this.b = fcsuVar2;
        this.c = eyggVar16;
        this.e = dheiVar;
        this.m = dcdtVar;
        this.p = crnyVar;
        this.l = eoscVar;
        this.w = eyggVar17;
        this.D = dejxVar;
        this.x = fcsuVar3;
    }

    private final synchronized RcsEngine a() {
        RcsEngine rcsEngine;
        rcsEngine = this.A;
        if (rcsEngine == null) {
            throw new IllegalStateException("RcsEngine is not initialized.");
        }
        return rcsEngine;
    }

    private final synchronized RcsEngineLifecycleServiceResult b(int i, dhki dhkiVar, Optional optional) {
        final fcsu fcsuVar = (fcsu) this.y.get(dhkiVar);
        if (fcsuVar == null) {
            dhja.h(this.C, "Unknown RCS backend type %s", dhkiVar);
            throw new IllegalArgumentException("Unknown RCS backend type ".concat(String.valueOf(String.valueOf(dhkiVar))));
        }
        dhja.l(this.C, "Initialize RcsEngine. subId=%d backendType=%s", Integer.valueOf(i), dhkiVar);
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        HandlerThread handlerThread = new HandlerThread("RcsEngineInitThread");
        handlerThread.start();
        new Handler(handlerThread.getLooper()).post(new Runnable() { // from class: dgum
            @Override // java.lang.Runnable
            public final void run() {
                RcsEngineProxyImpl.lambda$createAndInitRcsEngine$0(fcsuVar, countDownLatch);
            }
        });
        handlerThread.quitSafely();
        try {
            countDownLatch.await(3L, TimeUnit.SECONDS);
            final RcsEngine rcsEngine = (RcsEngine) fcsuVar.b();
            rcsEngine.init();
            g(rcsEngine);
            optional.ifPresent(new Consumer() { // from class: dgun
                @Override // java.util.function.Consumer
                /* renamed from: accept */
                public final void z(Object obj) {
                    this.a.B = new dgtx(rcsEngine, (ewwr) obj);
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
        } catch (InterruptedException e) {
            dhja.j(e, this.C, "RCS Engine initialization timeout.", new Object[0]);
            return new RcsEngineLifecycleServiceResult(1);
        }
        return new RcsEngineLifecycleServiceResult(0);
    }

    private final synchronized RcsEngineLifecycleServiceResult c(ewwr ewwrVar) {
        dhja.l(this.C, "RCS engine was destroyed: %b.", Boolean.valueOf(d().succeeded()));
        int i = ewwrVar.c;
        ewwt ewwtVarB = ewwt.b(ewwrVar.d);
        if (ewwtVarB == null) {
            ewwtVarB = ewwt.RCS_TRANSPORT_TYPE_UNKNOWN;
        }
        dhki dhkiVar = dhki.UNKNOWN;
        int iOrdinal = ewwtVarB.ordinal();
        RcsEngineLifecycleServiceResult rcsEngineLifecycleServiceResultB = b(i, iOrdinal != 1 ? iOrdinal != 2 ? dhki.UNKNOWN : dhki.SINGLE_REG : dhki.DUAL_REG, Optional.of(ewwrVar));
        if (!rcsEngineLifecycleServiceResultB.succeeded()) {
            return rcsEngineLifecycleServiceResultB;
        }
        dgvb dgvbVar = this.B;
        dgvbVar.getClass();
        ((dgtx) dgvbVar).a.startRcsStack(ewwrVar.c);
        return new RcsEngineLifecycleServiceResult(0);
    }

    private final synchronized RcsEngineLifecycleServiceResult d() {
        RcsEngine rcsEngine = this.A;
        if (rcsEngine == null) {
            dhja.r(this.C, "RcsEngine hasn't been initialized.", new Object[0]);
            return new RcsEngineLifecycleServiceResult(2);
        }
        dhja.l(this.C, "Destroy RcsEngine", new Object[0]);
        dhfr.a(this.z).b(IRcsEngineTemporaryController.class.getName()).ifPresent(new Consumer() { // from class: dguo
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void z(Object obj) {
                ((dhfq) obj).clear();
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
        rcsEngine.shutdown();
        g(null);
        this.B = null;
        return new RcsEngineLifecycleServiceResult(0);
    }

    private final void e() {
        fcsu fcsuVar = (fcsu) this.y.get(dhki.DUAL_REG);
        fcsuVar.getClass();
        final RcsEngine rcsEngine = (RcsEngine) fcsuVar.b();
        dhfr.a(this.z).b(IRcsEngineTemporaryController.class.getName()).ifPresent(new Consumer() { // from class: dgup
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void z(Object obj) {
                ((dhfq) obj).set(rcsEngine);
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
        g(rcsEngine);
        a().init();
    }

    private final void f() {
        dhfr dhfrVarA = dhfr.a(this.z);
        dhfrVarA.b(IEvent.class.getName()).ifPresent(new Consumer() { // from class: dgur
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void z(Object obj) {
                ((dhfq) obj).set(((dfdv) this.a.v.b()).b);
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
        dhfrVarA.b(IImsConnectionTracker.class.getName()).ifPresent(new Consumer() { // from class: dguv
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void z(Object obj) {
                ((dhfq) obj).set((IBinder) this.a.n.b());
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
        dhfrVarA.b(IContactsManagement.class.getName()).ifPresent(new Consumer() { // from class: dguw
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void z(Object obj) {
                ((dhfq) obj).set((IBinder) this.a.r.b());
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
        dhfrVarA.b(IFileTransfer.class.getName()).ifPresent(new Consumer() { // from class: dgux
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void z(Object obj) {
                ((dhfq) obj).set((IBinder) this.a.h.b());
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
        dhfrVarA.b(IChatSession.class.getName()).ifPresent(new Consumer() { // from class: dguy
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void z(Object obj) {
                ((dhfq) obj).set((IBinder) this.a.i.b());
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
        dhfrVarA.b(IRcsProfile.class.getName()).ifPresent(new Consumer() { // from class: dguz
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void z(Object obj) {
                ((dhfq) obj).set((IBinder) this.a.s.b());
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
        dhfrVarA.b(ISignup.class.getName()).ifPresent(new Consumer() { // from class: dgui
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void z(Object obj) {
                ((dhfq) obj).set((IBinder) this.a.g.b());
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
        dhfrVarA.b(ILocationSharing.class.getName()).ifPresent(new Consumer() { // from class: dguj
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void z(Object obj) {
                ((dhfq) obj).set((IBinder) this.a.j.b());
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
        dhfrVarA.b(IBusinessInfo.class.getName()).ifPresent(new Consumer() { // from class: dguk
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void z(Object obj) {
                ((dhfq) obj).set((IBinder) this.a.u.b());
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
        dhfrVarA.b(IMessaging.class.getName()).ifPresent(new Consumer() { // from class: dgul
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void z(Object obj) {
                ((dhfq) obj).set((IBinder) this.a.t.b());
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
        dhfrVarA.b(ITransportControl.class.getName()).ifPresent(new Consumer() { // from class: dgus
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void z(Object obj) {
                ((dhfq) obj).set((IBinder) this.a.o.b());
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
        dhfrVarA.b(ISingleRegistrationVendorImsController.class.getName()).ifPresent(new Consumer() { // from class: dgut
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void z(Object obj) {
                ((dhfq) obj).set((IBinder) this.a.q.b());
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
        dhfrVarA.b(IRcsEngineController.class.getName()).ifPresent(new Consumer() { // from class: dguu
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void z(Object obj) {
                ((dhfq) obj).set(this.a);
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
    }

    private final synchronized void g(RcsEngine rcsEngine) {
        if (rcsEngine == null) {
            dhja.r(this.C, "setting active RCS engine to null", new Object[0]);
        } else {
            dhja.l(this.C, "setting active RCS Engine to %s instance", rcsEngine.getSipConnectionType().d);
        }
        this.A = rcsEngine;
    }

    private final void h() {
        long millis = TimeUnit.MINUTES.toMillis(((Long) dfog.o().a.b.a()).longValue());
        long millis2 = TimeUnit.MINUTES.toMillis(((Long) dfog.o().a.c.a()).longValue());
        int i = PeriodicMetricsJobService.d;
        Context context = this.z;
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        JobInfo.Builder builder = new JobInfo.Builder(30000, new ComponentName(context, (Class<?>) PeriodicMetricsJobService.class));
        builder.setRequiredNetworkType(1);
        builder.setBackoffCriteria(millis2, 0);
        builder.setPeriodic(millis);
        dhja.o("Started periodic metrics with period %d ms and backoff %d ms, result %d", Long.valueOf(millis), Long.valueOf(millis2), Integer.valueOf(jobScheduler.schedule(builder.build())));
    }

    public static /* synthetic */ void lambda$createAndInitRcsEngine$0(fcsu fcsuVar, CountDownLatch countDownLatch) {
        fcsuVar.b();
        countDownLatch.countDown();
    }

    @Override // defpackage.dfvy
    public dhat createIncomingSession(ebqr ebqrVar) {
        return a().createIncomingSession(ebqrVar);
    }

    @Override // defpackage.dfvy
    public dham createOutgoingSession(String str) {
        return a().createOutgoingSession(str);
    }

    @Override // defpackage.dfvy
    public dham createOutgoingSlmSession(String str) {
        return a().createOutgoingSlmSession(str);
    }

    @Override // com.google.android.ims.rcs.engine.IRcsEngineController
    public synchronized RcsEngineLifecycleServiceResult destroy(int i) {
        if (dfpk.t() && dhka.i(this.z)) {
            return d();
        }
        dhja.r(this.C, "RCS engine is initialized automatically. Ignore destroy request from Bugle.", new Object[0]);
        return new RcsEngineLifecycleServiceResult(0);
    }

    @Override // defpackage.dgtw
    public void destroyRcsEngine() {
        dhja.l(this.C, "Destroy RCS Engine.", new Object[0]);
        unregisterReceivers();
        int i = PeriodicMetricsJobService.d;
        dhja.o("Stopping periodic metrics.", new Object[0]);
        Context context = this.z;
        ((JobScheduler) context.getSystemService("jobscheduler")).cancel(30000);
        dhfr.a(context).b(IRcsEngineTemporaryController.class.getName()).ifPresent(new Consumer() { // from class: dguq
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void z(Object obj) {
                ((dhfq) obj).clear();
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
        RcsEngine rcsEngine = this.A;
        if (rcsEngine != null) {
            rcsEngine.shutdown();
            g(null);
        }
    }

    @Override // defpackage.dgtw
    public void dumpState(PrintWriter printWriter) {
        try {
            a().dumpState(printWriter);
        } catch (IllegalStateException e) {
            dhja.j(e, this.C, "RcsEngine is not initialized.", new Object[0]);
        }
    }

    public dfys getImsModule() {
        return a().getImsModule();
    }

    @Override // defpackage.dgtu
    public dhds getLastRegistrationState() {
        try {
            return a().getLastRegistrationState();
        } catch (IllegalStateException e) {
            dhja.t(e, this.C, "RcsEngine is not initialized.", new Object[0]);
            return dhds.STATE_UNKNOWN;
        }
    }

    @Override // defpackage.dezc
    public ImsRegistrationState getRegistrationState() {
        try {
            return a().getRegistrationState();
        } catch (IllegalStateException e) {
            dhja.t(e, this.C, "RcsEngine is not initialized.", new Object[0]);
            return new ImsRegistrationState(dhds.STATE_UNKNOWN);
        }
    }

    @Override // defpackage.dezc
    public boolean hasActiveRegistration() {
        try {
            return a().hasActiveRegistration();
        } catch (IllegalStateException unused) {
            return false;
        }
    }

    @Override // com.google.android.ims.rcs.engine.IRcsEngineController
    public synchronized RcsEngineLifecycleServiceResult initialize(int i, int i2) {
        Object[] objArr = {dhki.a(i2).d};
        dhip dhipVar = this.C;
        dhja.l(dhipVar, "received initialization request for %s RcsEngine", objArr);
        if (((Boolean) enableLoggingRcsEngineInitializationCall.a()).booleanValue()) {
            deyw deywVar = (deyw) this.w.b();
            Context context = this.z;
            ewig ewigVar = (ewig) ewih.a.createBuilder();
            ewht ewhtVar = (ewht) ewhv.a.createBuilder();
            boolean zT = dfpk.t();
            ewhtVar.copyOnWrite();
            ewhv ewhvVar = (ewhv) ewhtVar.instance;
            ewhvVar.b |= 2;
            ewhvVar.d = zT;
            RcsEngine rcsEngine = this.A;
            int i3 = rcsEngine == null ? 2 : rcsEngine.getSipConnectionType() == dhki.SINGLE_REG ? 4 : this.A.getSipConnectionType() == dhki.DUAL_REG ? 3 : 1;
            ewhtVar.copyOnWrite();
            ewhv ewhvVar2 = (ewhv) ewhtVar.instance;
            ewhvVar2.c = i3 - 1;
            ewhvVar2.b |= 1;
            ewhv ewhvVar3 = (ewhv) ewhtVar.build();
            ewigVar.copyOnWrite();
            ewih ewihVar = (ewih) ewigVar.instance;
            ewhvVar3.getClass();
            ewihVar.d = ewhvVar3;
            ewihVar.c = 13;
            deywVar.h(context, (ewih) ewigVar.build());
        }
        if (dfpk.t() && dhka.i(this.z)) {
            RcsEngine rcsEngine2 = this.A;
            dhki dhkiVarA = dhki.a(i2);
            if (rcsEngine2 != null) {
                if (rcsEngine2.getSipConnectionType().equals(dhkiVarA)) {
                    dhja.r(dhipVar, "Already initialized %s RcsEngine instance. Reusing existing instance", dhki.a(i2).d);
                    return new RcsEngineLifecycleServiceResult(0);
                }
                dhja.r(dhipVar, "Requested initialization of %s RcsEngine when %s RcsEngine is already initialized. Destroying the %s RcsEngine", dhkiVarA, rcsEngine2.getSipConnectionType(), rcsEngine2.getSipConnectionType());
                destroy(i);
            }
            return b(i, dhkiVarA, Optional.empty());
        }
        dhja.r(dhipVar, "RCS engine is initialized automatically. Ignore initialization request from Bugle. enableRcsEngineInitializationByBugle:[%s], isRcsEngineInBugle:[%s]", Boolean.valueOf(dfpk.t()), Boolean.valueOf(dhka.i(this.z)));
        return new RcsEngineLifecycleServiceResult(0);
    }

    @Override // com.google.android.ims.rcs.engine.IRcsEngineController
    public synchronized RcsEngineLifecycleServiceResult initializeAndStartRcsTransport(InitializeAndStartRcsTransportRequest initializeAndStartRcsTransportRequest) {
        ewwt ewwtVarB = ewwt.b(initializeAndStartRcsTransportRequest.a().d);
        if (ewwtVarB == null) {
            ewwtVarB = ewwt.RCS_TRANSPORT_TYPE_UNKNOWN;
        }
        dhip dhipVar = this.C;
        dhja.l(dhipVar, "initializeAndStartRcsTransport: %s, %s", ewwtVarB, Integer.valueOf(initializeAndStartRcsTransportRequest.a().c));
        ewwr ewwrVarA = initializeAndStartRcsTransportRequest.a();
        dgvb dgvbVar = this.B;
        if (dgvbVar == null || !((dgtx) dgvbVar).b.equals(ewwrVarA)) {
            dhja.l(dhipVar, "initializeAndStartRcsTransport: creating a new RcsEngine instance", new Object[0]);
            return c(ewwrVarA);
        }
        dhja.l(dhipVar, "initializeAndStartRcsTransport: correct instance of RcsEngine already exists. Starting RCS stack", new Object[0]);
        return triggerStartRcsStack(ewwrVarA.c);
    }

    @Override // defpackage.dgtw
    public synchronized void initializeRcsEngineForBugle() {
        dhip dhipVar = this.C;
        dhja.l(dhipVar, "Initializing RCS Engine for Bugle host.", new Object[0]);
        eygg eyggVar = this.k;
        ((dheq) eyggVar.b()).h();
        f();
        ((dheq) eyggVar.b()).i();
        if (dfpk.t()) {
            dhja.l(dhipVar, "enableRcsEngineInitializationByBugle is enabled, waiting for Bugle to initialize RcsEngine.", new Object[0]);
        } else {
            dhja.r(dhipVar, "enableRcsEngineInitializationByBugle is disabled, directly initializing new DUAL_REG RcsEngine", new Object[0]);
            e();
        }
        h();
        Context context = this.z;
        if ("com.google.android.apps.messaging".equals(context.getPackageName())) {
            dhin.a = "BugleRcsEngine";
        }
        dhja.y(context);
        dhia.e(context, (dheq) eyggVar.b(), this.m, this.p, this.l, this.D);
        dhja.o("Device info: %s %s %s // %s %s", Build.MANUFACTURER, Build.MODEL, Build.DEVICE, Build.BRAND, Build.PRODUCT);
        dhja.o("Running Android %s, API level %d, %s %s", Build.VERSION.RELEASE, Integer.valueOf(Build.VERSION.SDK_INT), Build.VERSION.CODENAME, Build.VERSION.INCREMENTAL);
        if (!((Boolean) dfog.o().a.u.a()).booleanValue()) {
            StrictMode.ThreadPolicy.Builder builder = new StrictMode.ThreadPolicy.Builder();
            builder.detectNetwork();
            builder.penaltyLog();
            StrictMode.setThreadPolicy(builder.build());
        }
        registerReceivers();
        if (((Boolean) dfpk.a.b.d.a()).booleanValue()) {
            if (((dflf) this.x.b()).a()) {
                throw new dgvc("RcsEngineProxy.initializeRcsEngineForBugle");
            }
            Intent intentC = ((dheq) eyggVar.b()).c();
            if (intentC != null && "com.google.android.ims.SIM_LOADED".equals(intentC.getAction())) {
                dhja.d(dhipVar, "SIM has been loaded before JibeService.", new Object[0]);
                onSimLoaded(intentC.getBooleanExtra("SIM_CHANGED", false));
            }
        }
    }

    public void initializeRcsEngineForCsApk() {
        dhja.l(this.C, "Initializing RCS Engine for CsApk host.", new Object[0]);
        f();
        e();
        h();
    }

    @Override // defpackage.dezc
    public boolean isRegistered() {
        try {
            return a().isRegistered();
        } catch (IllegalStateException unused) {
            return false;
        }
    }

    @Override // defpackage.dgtw
    public void onSimAbsent() {
        if (((dflf) this.x.b()).a()) {
            throw new dgvc("RcsEngineProxy.onSimAbsent");
        }
        final dgrs dgrsVar = (dgrs) this.f.b();
        final String strF = ((dheq) this.k.b()).f();
        eork.r(eoqt.t(dgrsVar.c.submit(eiid.l(new Callable() { // from class: dgrr
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return dgrsVar.f(strF);
            }
        }))), new dgva(this), this.l);
    }

    public void onSimAbsentInternal() {
        if (((dflf) this.x.b()).a()) {
            throw new dgvc("RcsEngineProxy.onSimAbsentInternal");
        }
        if (!((dhgz) this.b.b()).t()) {
            ((dfdj) this.a.b()).a();
            ((dfio) this.c.b()).a();
            dhja.h(this.C, "onSimRemoved: not using a test number at the moment", new Object[0]);
        }
        dhja.l(this.C, "onSimRemoved: isSimLoaded: [%b]", Boolean.valueOf(((dheq) this.k.b()).l(this.z)));
        try {
            a().onSimRemoved();
        } catch (IllegalStateException e) {
            dhja.j(e, this.C, "RcsEngine is not initialized.", new Object[0]);
        }
    }

    @Override // defpackage.dgtw
    public void onSimLoaded(final boolean z) {
        if (((dflf) this.x.b()).a()) {
            throw new dgvc("RcsEngineProxy.onSimLoaded");
        }
        this.l.execute(eiid.k(new Runnable() { // from class: dguh
            @Override // java.lang.Runnable
            public final void run() {
                RcsEngineProxyImpl.$r8$lambda$gTae8hfuT2tQgdWorI6h2CEm_54(this.a, z);
            }
        }));
    }

    protected void registerReceivers() {
        registerSelfServiceMessageReceiver();
        try {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction(RcsIntents.ACTION_RCS_RECURRING_METRICS_UPLOAD);
            kxj.g(this.z, this.e, intentFilter);
        } catch (RuntimeException e) {
            dhja.j(e, this.C, "Failed to register RecurringMetricsUploadReceiver. Already registered?", new Object[0]);
        }
    }

    public void registerSelfServiceMessageReceiver() {
        try {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction(RcsIntents.ACTION_TACHYON_ANONYMOUS_DEVICE_ID);
            intentFilter.addAction(RcsIntents.ACTION_RCS_SELF_SERVICE_MESSAGE);
            kxj.g(this.z, (BroadcastReceiver) this.d.b(), intentFilter);
        } catch (RuntimeException e) {
            dhja.j(e, this.C, "Failed to register SelfServiceMessageReceiver. Already registered?", new Object[0]);
        }
    }

    @Override // defpackage.dgtw
    public void shutdown() {
        try {
            a().shutdown();
        } catch (IllegalStateException e) {
            dhja.j(e, this.C, "RcsEngine is not initialized", new Object[0]);
        }
    }

    @Override // defpackage.dgtu
    public void startRcsStack(int i) {
        try {
            a().startRcsStack(i);
        } catch (IllegalStateException e) {
            dhja.j(e, this.C, "RcsEngine is not initialized.", new Object[0]);
        }
    }

    @Override // defpackage.dgtw
    public void stop(dezf dezfVar) {
        try {
            a().getImsModule().k(dezfVar);
        } catch (IllegalStateException e) {
            dhja.j(e, this.C, "RcsEngine is not initialized.", new Object[0]);
        }
    }

    @Override // com.google.android.ims.rcs.engine.IRcsEngineController
    public synchronized RcsEngineLifecycleServiceResult stopAllRcsTransportsExcept(StopAllRcsTransportsExceptRequest stopAllRcsTransportsExceptRequest) {
        ewwv ewwvVarA = stopAllRcsTransportsExceptRequest.a();
        dgvb dgvbVar = this.B;
        if (dgvbVar != null) {
            ewwr ewwrVar = ((dgtx) dgvbVar).b;
            ewwt ewwtVarB = ewwt.b(ewwrVar.d);
            if (ewwtVarB == null) {
                ewwtVarB = ewwt.RCS_TRANSPORT_TYPE_UNKNOWN;
            }
            int i = ewwrVar.c;
            ewwt ewwtVarB2 = ewwt.b(ewwvVarA.d);
            if (ewwtVarB2 == null) {
                ewwtVarB2 = ewwt.RCS_TRANSPORT_TYPE_UNKNOWN;
            }
            if (ewwtVarB2.equals(ewwtVarB) && !ewwvVarA.c.contains(Integer.valueOf(i))) {
                dhja.l(this.C, "stopAllRcsTransportsExcept: trigger the stop of RcsEngine", new Object[0]);
                dgvb dgvbVar2 = this.B;
                dgvbVar2.getClass();
                return triggerStopRcsStack(((dgtx) dgvbVar2).b.c);
            }
        }
        dhja.l(this.C, "stopAllRcsTransportsExcept: ignoring stopping the RcsEngine. RcsEngine is still running", new Object[0]);
        return new RcsEngineLifecycleServiceResult(0);
    }

    @Override // defpackage.dgtu
    public void stopRcsStack(int i) {
        try {
            a().stopRcsStack(i);
        } catch (IllegalStateException e) {
            dhja.j(e, this.C, "RcsEngine is not initialized.", new Object[0]);
        }
    }

    @Override // com.google.android.ims.rcs.engine.IRcsEngineController
    public RcsEngineLifecycleServiceResult triggerStartRcsStack(int i) {
        a().startRcsStack(i);
        dhja.l(this.C, "triggerStartRcsStack: RcsEngine started", new Object[0]);
        return new RcsEngineLifecycleServiceResult(0);
    }

    @Override // com.google.android.ims.rcs.engine.IRcsEngineController
    public RcsEngineLifecycleServiceResult triggerStopRcsStack(int i) {
        a().stopRcsStack(i);
        dhja.l(this.C, "triggerStopRcsStack: RcsEngine stopped", new Object[0]);
        return new RcsEngineLifecycleServiceResult(0);
    }

    protected void unregisterReceivers() {
        unregisterSelfServiceMessageReceiver();
        try {
            this.z.unregisterReceiver(this.e);
        } catch (RuntimeException e) {
            dhja.j(e, this.C, "Failed to unregister RecurringMetricsUploadReceiver.", new Object[0]);
        }
    }

    public void unregisterSelfServiceMessageReceiver() {
        try {
            this.z.unregisterReceiver((BroadcastReceiver) this.d.b());
        } catch (RuntimeException e) {
            dhja.t(e, this.C, "Failed to unregister SelfServiceMessageReceiver.", new Object[0]);
        }
    }
}
