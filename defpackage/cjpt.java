package defpackage;

import android.content.Intent;
import com.google.android.apps.messaging.shared.api.messaging.selfidentity.SelfIdentityId;
import com.google.android.apps.messaging.shared.datamodel.action.WaitForRcsServiceConnectionAction;
import com.google.android.ims.rcsservice.ims.ImsRegistrationState;
import com.google.android.rcs.client.contacts.ContactsService;
import com.google.android.rcs.client.events.EventService;
import com.google.android.rcs.client.filetransfer.FileTransferService;
import com.google.android.rcs.client.ims.ImsConnectionTrackerService;
import com.google.android.rcs.client.locationsharing.LocationSharingService;
import com.google.android.rcs.client.messaging.RcsMessagingService;
import com.google.android.rcs.client.profile.RcsProfileService;
import j$.util.Collection;
import j$.util.Objects;
import j$.util.Optional;
import j$.util.function.Predicate$CC;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.function.Predicate;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cjpt implements cjpo {
    private final fcsu d;
    private final fcsu e;
    private final fcsu f;
    private final fcsu g;
    private final fcsu h;
    private final fcsu i;
    private final fcsu j;
    private final fcsu k;
    private final fcsu l;
    private final fcsu m;
    private final cqbm n;
    private final fcsu o;
    private final fcsu p;
    private final aypv q;
    private final List r = new CopyOnWriteArrayList();
    private final fcsu s;
    private final fcsu t;
    private final fcsu u;
    private final fcsu v;
    private final fcsu w;
    private final fcsu x;
    private final fcsu y;
    private final eosc z;
    private static final AtomicBoolean b = new AtomicBoolean(false);
    private static final AtomicBoolean c = new AtomicBoolean(true);
    public static final ekrg a = ekrg.c("com/google/android/apps/messaging/shared/rcs/readiness/ChatReadinessManagerImpl");

    public cjpt(fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3, fcsu fcsuVar4, fcsu fcsuVar5, fcsu fcsuVar6, fcsu fcsuVar7, fcsu fcsuVar8, fcsu fcsuVar9, fcsu fcsuVar10, cqbm cqbmVar, fcsu fcsuVar11, fcsu fcsuVar12, aypv aypvVar, fcsu fcsuVar13, fcsu fcsuVar14, fcsu fcsuVar15, fcsu fcsuVar16, crma crmaVar, fcsu fcsuVar17, fcsu fcsuVar18, fcsu fcsuVar19, eosc eoscVar) {
        this.d = fcsuVar;
        this.e = fcsuVar2;
        this.f = fcsuVar3;
        this.g = fcsuVar4;
        this.h = fcsuVar5;
        this.i = fcsuVar6;
        this.j = fcsuVar7;
        this.k = fcsuVar8;
        this.l = fcsuVar9;
        this.m = fcsuVar10;
        this.n = cqbmVar;
        this.o = fcsuVar11;
        this.p = fcsuVar12;
        this.q = aypvVar;
        this.s = fcsuVar13;
        this.t = fcsuVar14;
        this.u = fcsuVar15;
        this.v = fcsuVar16;
        this.w = fcsuVar17;
        this.x = fcsuVar18;
        this.y = fcsuVar19;
        this.z = eoscVar;
        cqey cqeyVar = (cqey) cqbmVar.a();
        cqer cqerVar = (cqer) cqeu.a.createBuilder();
        cqet cqetVar = crmaVar.k() ? cqet.ALL_ACTIVE_SUBSCRIPTIONS : cqet.DEFAULT_SYSTEM_SUBSCRIPTION;
        cqerVar.copyOnWrite();
        cqeu cqeuVar = (cqeu) cqerVar.instance;
        cqeuVar.c = cqetVar.e;
        cqeuVar.b |= 1;
        cqeyVar.m(this, (cqeu) cqerVar.build());
    }

    private final elrz t(int i) {
        aubq aubqVarA = ((chtk) this.w.b()).a(i);
        if (aubqVarA != null) {
            return q(aubqVarA);
        }
        ekrw ekrwVarH = a.h();
        ekrwVarH.X(eksq.a, "Bugle");
        ekrd ekrdVar = (ekrd) ekrwVarH;
        ekrdVar.X(cqnc.w, Integer.valueOf(i));
        ((ekrd) ekrdVar.h("com/google/android/apps/messaging/shared/rcs/readiness/ChatReadinessManagerImpl", "calculateRcsReadinessConditions", 412, "ChatReadinessManagerImpl.java")).q("Missing identity mapping for subId, assuming that RCS is disabled");
        return u(enwr.DISABLED_FROM_PREFERENCES, enmr.TRANSPORT_UNKNOWN);
    }

    private final elrz u(enwr enwrVar, enmr enmrVar) {
        elrz elrzVar;
        eieu eieuVarK = eiiy.k("ChatReadinessManager::calculateRcsReadinessConditions");
        try {
            elry elryVar = (elry) elrz.a.createBuilder();
            elryVar.copyOnWrite();
            elrz elrzVar2 = (elrz) elryVar.instance;
            elrzVar2.c = enwrVar.N;
            elrzVar2.b |= 2;
            elryVar.copyOnWrite();
            elrz elrzVar3 = (elrz) elryVar.instance;
            elrzVar3.o = enmrVar.e;
            elrzVar3.b |= 16384;
            if (enwrVar.equals(enwr.AVAILABLE)) {
                int iW = w(Objects.equals(((cqey) this.n.a()).f(), cqgk.AVAILABLE));
                elryVar.copyOnWrite();
                elrz elrzVar4 = (elrz) elryVar.instance;
                elrzVar4.r = iW - 1;
                elrzVar4.b |= 131072;
                if (enmrVar.equals(enmr.TRANSPORT_SINGLE_REGISTRATION) || enmrVar.equals(enmr.TRANSPORT_RCS)) {
                    fcsu fcsuVar = this.g;
                    int iW2 = w(((ImsConnectionTrackerService) fcsuVar.b()).isConnected());
                    elryVar.copyOnWrite();
                    elrz elrzVar5 = (elrz) elryVar.instance;
                    elrzVar5.g = iW2 - 1;
                    elrzVar5.b |= 32;
                    int iW3 = w(((LocationSharingService) this.h.b()).isConnected());
                    elryVar.copyOnWrite();
                    elrz elrzVar6 = (elrz) elryVar.instance;
                    elrzVar6.h = iW3 - 1;
                    elrzVar6.b |= 64;
                    int iW4 = w(((FileTransferService) this.i.b()).isConnected());
                    elryVar.copyOnWrite();
                    elrz elrzVar7 = (elrz) elryVar.instance;
                    elrzVar7.i = iW4 - 1;
                    elrzVar7.b |= 128;
                    int iW5 = w(((ContactsService) this.k.b()).isConnected());
                    elryVar.copyOnWrite();
                    elrz elrzVar8 = (elrz) elryVar.instance;
                    elrzVar8.j = iW5 - 1;
                    elrzVar8.b |= 256;
                    int iW6 = w(((RcsProfileService) this.j.b()).isConnected());
                    elryVar.copyOnWrite();
                    elrz elrzVar9 = (elrz) elryVar.instance;
                    elrzVar9.k = iW6 - 1;
                    elrzVar9.b |= 512;
                    int iW7 = w(((RcsMessagingService) this.m.b()).isConnected());
                    elryVar.copyOnWrite();
                    elrz elrzVar10 = (elrz) elryVar.instance;
                    elrzVar10.q = iW7 - 1;
                    elrzVar10.b |= 65536;
                    int iW8 = w(((EventService) this.l.b()).isConnected());
                    elryVar.copyOnWrite();
                    elrz elrzVar11 = (elrz) elryVar.instance;
                    elrzVar11.p = iW8 - 1;
                    elrzVar11.b |= 32768;
                    try {
                        if (((ImsConnectionTrackerService) fcsuVar.b()).isConnected()) {
                            ImsRegistrationState registrationState = ((ImsConnectionTrackerService) fcsuVar.b()).getRegistrationState();
                            if (registrationState != null) {
                                int i = registrationState.a.l;
                                elryVar.copyOnWrite();
                                elrz elrzVar12 = (elrz) elryVar.instance;
                                elrzVar12.b |= 1024;
                                elrzVar12.l = i;
                                int iOrdinal = registrationState.b.ordinal();
                                elryVar.copyOnWrite();
                                elrz elrzVar13 = (elrz) elryVar.instance;
                                elrzVar13.b |= 2048;
                                elrzVar13.m = iOrdinal;
                            }
                            boolean zIsRegistered = ((ImsConnectionTrackerService) fcsuVar.b()).isRegistered();
                            elryVar.copyOnWrite();
                            elrz elrzVar14 = (elrz) elryVar.instance;
                            elrzVar14.b |= 8192;
                            elrzVar14.n = zIsRegistered;
                        }
                    } catch (efao e) {
                        ekrw ekrwVarJ = a.j();
                        ekrwVarJ.X(eksq.a, "Bugle");
                        ((ekrd) ((ekrd) ((ekrd) ekrwVarJ).g(e)).h("com/google/android/apps/messaging/shared/rcs/readiness/ChatReadinessManagerImpl", "calculateSipReadinessConditions", (char) 497, "ChatReadinessManagerImpl.java")).q("Failed to get SIP connection status for determining RCS Readiness");
                    }
                    elrzVar = (elrz) elryVar.build();
                    ekrw ekrwVarE = a.e();
                    ekrwVarE.X(eksq.a, "Bugle");
                    ((ekrd) ((ekrd) ekrwVarE).h("com/google/android/apps/messaging/shared/rcs/readiness/ChatReadinessManagerImpl", "calculateRcsReadinessConditions", 456, "ChatReadinessManagerImpl.java")).D("calculateRcsReadinessConditions: Enabled ChatTransportType is: %s, BugleRcsReadinessConditions: %s", enmrVar, elrzVar);
                } else {
                    elrzVar = (elrz) elryVar.build();
                    ekrw ekrwVarE2 = a.e();
                    ekrwVarE2.X(eksq.a, "Bugle");
                    ((ekrd) ((ekrd) ekrwVarE2).h("com/google/android/apps/messaging/shared/rcs/readiness/ChatReadinessManagerImpl", "calculateRcsReadinessConditions", 463, "ChatReadinessManagerImpl.java")).t("calculateRcsReadinessConditions: BugleRcsReadinessConditions: %s", elrzVar);
                }
            } else {
                elsf elsfVarC = ((chza) ((cqbm) this.p.b()).a()).c();
                elryVar.copyOnWrite();
                elrz elrzVar15 = (elrz) elryVar.instance;
                elrzVar15.d = elsfVarC.j;
                elrzVar15.b |= 4;
                int iQ = ((crqx) this.d.b()).q();
                elryVar.copyOnWrite();
                elrz elrzVar16 = (elrz) elryVar.instance;
                elrzVar16.e = iQ - 1;
                elrzVar16.b |= 8;
                elrzVar = (elrz) elryVar.build();
                ekrw ekrwVarE3 = a.e();
                ekrwVarE3.X(eksq.a, "Bugle");
                ((ekrd) ((ekrd) ekrwVarE3).h("com/google/android/apps/messaging/shared/rcs/readiness/ChatReadinessManagerImpl", "calculateRcsReadinessConditions", 441, "ChatReadinessManagerImpl.java")).t("calculateRcsReadinessConditions: RCS is not available. BugleRcsReadinessConditions: %s", elrzVar);
            }
            eieuVarK.close();
            return elrzVar;
        } finally {
        }
    }

    private final boolean v() {
        return enmr.TRANSPORT_TACHYGRAM.equals(((cozg) this.s.b()).d());
    }

    private static int w(boolean z) {
        return z ? 3 : 2;
    }

    @Override // defpackage.cqev
    public final void a(Intent intent) {
        if (v() && !intent.getBooleanExtra("noConnectivity", false)) {
            ekrw ekrwVarE = a.e();
            ekrwVarE.X(eksq.a, "Bugle");
            ((ekrd) ((ekrd) ekrwVarE).h("com/google/android/apps/messaging/shared/rcs/readiness/ChatReadinessManagerImpl", "onConnectivityStateChanged", 666, "ChatReadinessManagerImpl.java")).q("onConnectivityStateChanged: kicking off pending messages and notifying RcsOnReadyListeners if now connected");
            o();
        }
    }

    @Override // defpackage.cjpo
    public final eiju b(final SelfIdentityId selfIdentityId) {
        eieu eieuVarK = eiiy.k("ChatReadinessManager::isReadyToSendAndReceiveChatAsync");
        try {
            eiju eijuVarD = ((chtk) this.w.b()).d(selfIdentityId);
            ejvr ejvrVar = new ejvr() { // from class: cjpp
                @Override // defpackage.ejvr
                public final Object apply(Object obj) {
                    aubq aubqVar = (aubq) ((Optional) obj).orElse(null);
                    cjpt cjptVar = this.a;
                    if (aubqVar != null) {
                        return cjptVar.q(aubqVar);
                    }
                    SelfIdentityId selfIdentityId2 = selfIdentityId;
                    ekrw ekrwVarJ = cjpt.a.j();
                    ekrwVarJ.X(eksq.a, "Bugle");
                    ekrd ekrdVar = (ekrd) ekrwVarJ;
                    ekrdVar.X(cqnc.y, selfIdentityId2);
                    ((ekrd) ekrdVar.h("com/google/android/apps/messaging/shared/rcs/readiness/ChatReadinessManagerImpl", "isReadyToSendAndReceiveChatAsyncInTrace", 259, "ChatReadinessManagerImpl.java")).q("The mapping for selfIdentityId is missing.");
                    return cjptVar.r();
                }
            };
            eosc eoscVar = this.z;
            eiju eijuVarH = eijuVarD.h(ejvrVar, eoscVar).h(new cjpq(this), eoscVar);
            eieuVarK.close();
            return eijuVarH;
        } catch (Throwable th) {
            try {
                eieuVarK.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.cjpo
    public final eiju c(final int i) {
        eieu eieuVarK = eiiy.k("ChatReadinessManager::readyToSendAndReceiveChatAsync");
        try {
            eiju eijuVarF = ((chtk) this.w.b()).f(i);
            ejvr ejvrVar = new ejvr() { // from class: cjps
                @Override // defpackage.ejvr
                public final Object apply(Object obj) {
                    cjpt cjptVar = this.a;
                    aubq aubqVar = (aubq) obj;
                    if (aubqVar != null) {
                        return cjptVar.q(aubqVar);
                    }
                    int i2 = i;
                    ekrw ekrwVarJ = cjpt.a.j();
                    ekrwVarJ.X(eksq.a, "Bugle");
                    ekrd ekrdVar = (ekrd) ekrwVarJ;
                    ekrdVar.X(cqnc.w, Integer.valueOf(i2));
                    ((ekrd) ekrdVar.h("com/google/android/apps/messaging/shared/rcs/readiness/ChatReadinessManagerImpl", "readyToSendAndReceiveChatAsyncInTrace", 221, "ChatReadinessManagerImpl.java")).q("The mapping for subId is missing.");
                    return cjptVar.r();
                }
            };
            eosc eoscVar = this.z;
            eiju eijuVarH = eijuVarF.h(ejvrVar, eoscVar).h(new cjpq(this), eoscVar);
            eieuVarK.close();
            return eijuVarH;
        } catch (Throwable th) {
            try {
                eieuVarK.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.cjpo
    public final elrz d() {
        eieu eieuVarK = eiiy.k("ChatReadinessManager::getRcsReadinessConditions");
        try {
            Optional optionalEmpty = Optional.empty();
            chza chzaVar = (chza) ((cqbm) this.p.b()).a();
            optionalEmpty.isPresent();
            elrz elrzVarU = u(chzaVar.d(), ((cozg) this.s.b()).d());
            eieuVarK.close();
            return elrzVarU;
        } catch (Throwable th) {
            try {
                eieuVarK.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.cjpo
    public final elrz e(int i) {
        eieu eieuVarK = eiiy.k("ChatReadinessManager::getRcsReadinessConditions");
        try {
            elrz elrzVarT = t(i);
            eieuVarK.close();
            return elrzVarT;
        } catch (Throwable th) {
            try {
                eieuVarK.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.cjpo
    public final elrz f(aubq aubqVar) {
        eieu eieuVarK = eiiy.k("ChatReadinessManager::getRcsReadinessConditions");
        try {
            elrz elrzVarQ = q(aubqVar);
            eieuVarK.close();
            return elrzVarQ;
        } catch (Throwable th) {
            try {
                eieuVarK.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.cjpo
    public final String g() {
        return h(d());
    }

    @Override // defpackage.cjpo
    public final String h(elrz elrzVar) {
        int iQ;
        chza chzaVar = (chza) ((cqbm) this.p.b()).a();
        enwr enwrVarB = enwr.b(elrzVar.c);
        if (enwrVarB == null) {
            enwrVarB = enwr.INVALID_PRE_KOTO;
        }
        elsf elsfVarB = elsf.b(elrzVar.d);
        if (elsfVarB == null) {
            elsfVarB = elsf.UNKNOWN_UNINITIALIZED_REASON;
        }
        if ((enwrVarB.equals(enwr.CARRIER_SETUP_PENDING) || (((arui) this.y.b()).a() && new dgid(enwrVarB).b())) && ((crqx) this.d.b()).q() - 1 != 0) {
            int iA = eluu.a(iQ);
            String str = iA != 1 ? iA != 21 ? iA != 31 ? iA != 44 ? iA != 47 ? iA != 51 ? iA != 11 ? iA != 12 ? iA != 41 ? iA != 42 ? "null" : "RCS_ONBOARDING_FLOW_COMPLETED_STARTED_PROVISIONING" : "RCS_ONBOARDING_SAW_BOEW_DOUBLECHECK_DIALOG" : "RCS_ONBOARDING_SAW_PROMO_UPSELL_RECTIFIED" : "RCS_ONBOARDING_SAW_PROMO_UPSELL" : "RCS_ONBOARDING_FLOW_COMPLETED_SAW_CHECKMARK" : "RCS_ONBOARDING_SAW_TERMS_AND_CONDITIONS_DOUBLECHECK_DIALOG" : "RCS_ONBOARDING_SAW_TERMS_AND_CONDITIONS" : "RCS_ONBOARDING_SAW_BOEW_SYSTEM_DIALOG" : "RCS_ONBOARDING_SAW_FULL_SCREEN_PROMO" : "RCS_ONBOARDING_UNKNOWN";
            if (iA != 0) {
                return str;
            }
            throw null;
        }
        if (!enwr.AVAILABLE.equals(enwrVarB)) {
            return chzaVar.g(enwrVarB, elsfVarB);
        }
        enmr enmrVar = enmr.TRANSPORT_TACHYGRAM;
        enmr enmrVarB = enmr.b(elrzVar.o);
        if (enmrVarB == null) {
            enmrVarB = enmr.TRANSPORT_UNKNOWN;
        }
        if (enmrVar.equals(enmrVarB)) {
            int iA2 = elwe.a(elrzVar.r);
            return (iA2 != 0 && iA2 == 3) ? "RCS appears to be active" : "No network connection";
        }
        int iA3 = elwe.a(elrzVar.p);
        if (iA3 == 0 || iA3 != 3) {
            return "RCS EventService not connected";
        }
        int iA4 = elwe.a(elrzVar.g);
        if (iA4 == 0 || iA4 != 3) {
            return "RCS ImsConnectionTrackerService not connected";
        }
        int iA5 = elwe.a(elrzVar.h);
        if (iA5 == 0 || iA5 != 3) {
            return "RCS LocationSharingService not connected";
        }
        int iA6 = elwe.a(elrzVar.i);
        if (iA6 == 0 || iA6 != 3) {
            return "RCS FileTransferService not connected";
        }
        int iA7 = elwe.a(elrzVar.j);
        if (iA7 == 0 || iA7 != 3) {
            return "RCS ContactsService not connected";
        }
        int iA8 = elwe.a(elrzVar.k);
        if (iA8 == 0 || iA8 != 3) {
            return "RCS ProfileService not connected";
        }
        int iA9 = elwe.a(elrzVar.q);
        return (iA9 != 0 && iA9 == 3) ? !elrzVar.n ? (elrzVar.b & 1024) != 0 ? "RCS not connected to server: ".concat(new ImsRegistrationState(dhds.a(elrzVar.l), dezf.a(elrzVar.m)).toString()) : "RCS is not connected to server and getImsRegistrationState is empty! This is a bug!" : "RCS appears to be active" : "RCS MessagingService not connected";
    }

    @Override // defpackage.cjpo
    public final Set i() {
        return (Set) Collection.EL.stream(((cozg) this.s.b()).e()).filter(new Predicate() { // from class: cjpr
            public final /* synthetic */ Predicate and(Predicate predicate) {
                return Predicate$CC.$default$and(this, predicate);
            }

            @Override // java.util.function.Predicate
            /* renamed from: negate */
            public final /* synthetic */ Predicate mo538negate() {
                return Predicate$CC.$default$negate(this);
            }

            public final /* synthetic */ Predicate or(Predicate predicate) {
                return Predicate$CC.$default$or(this, predicate);
            }

            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return this.a.l((aubq) obj);
            }
        }).collect(ekcv.b);
    }

    @Override // defpackage.cjpo
    public final void j(cjpn cjpnVar) {
        this.r.add(cjpnVar);
        if (m()) {
            cjpnVar.a();
        }
    }

    @Override // defpackage.cjpo
    public final void k(cjpn cjpnVar) {
        this.r.remove(cjpnVar);
    }

    @Override // defpackage.cjpo
    public final boolean l(aubq aubqVar) {
        eieu eieuVarK = eiiy.k("ChatReadinessManager::isReadyToSendAndReceiveChat");
        try {
            boolean zS = s(q(aubqVar));
            eieuVarK.close();
            return zS;
        } catch (Throwable th) {
            try {
                eieuVarK.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.cjpo
    public final boolean m() {
        eieu eieuVarK = eiiy.k("ChatReadinessManager::readyToSendAndReceiveChat");
        try {
            boolean zS = s(d());
            eieuVarK.close();
            return zS;
        } catch (Throwable th) {
            try {
                eieuVarK.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.cjpo
    public final boolean n(int i) {
        eieu eieuVarK = eiiy.k("ChatReadinessManager::readyToSendAndReceiveChatWithSubId");
        try {
            boolean zS = s(t(i));
            eieuVarK.close();
            return zS;
        } catch (Throwable th) {
            try {
                eieuVarK.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.cjpo
    public final void o() {
        boolean zM = m();
        AtomicBoolean atomicBoolean = c;
        if (!atomicBoolean.get()) {
            ekrw ekrwVarH = a.h();
            ekrwVarH.X(eksq.a, "Bugle");
            ((ekrd) ((ekrd) ekrwVarH).h("com/google/android/apps/messaging/shared/rcs/readiness/ChatReadinessManagerImpl", "kickOffPendingIfNowConnected", 304, "ChatReadinessManagerImpl.java")).q("shouldLaunchPostReadyWork is false. Returning from the method");
            return;
        }
        if (!zM) {
            if (cqgk.AVAILABLE.equals(((cqey) this.n.a()).f())) {
                ekrw ekrwVarH2 = a.h();
                ekrwVarH2.X(eksq.a, "Bugle");
                ((ekrd) ((ekrd) ekrwVarH2).h("com/google/android/apps/messaging/shared/rcs/readiness/ChatReadinessManagerImpl", "kickOffPendingIfNowConnected", 311, "ChatReadinessManagerImpl.java")).q("kickOffPendingIfNowConnected: RCS is not ready but RCS is available. Trigger scheduling: [processPendingMessagesActionForStartup]");
                this.q.d();
                return;
            }
            return;
        }
        ekrg ekrgVar = a;
        ekrw ekrwVarH3 = ekrgVar.h();
        ekrz ekrzVar = eksq.a;
        ekrwVarH3.X(ekrzVar, "Bugle");
        ((ekrd) ((ekrd) ekrwVarH3).h("com/google/android/apps/messaging/shared/rcs/readiness/ChatReadinessManagerImpl", "kickOffRcsReadyPendingWork", 328, "ChatReadinessManagerImpl.java")).q("kickOffPendingIfNowConnected: RCS is ready and it was off. Trigger scheduling: [scheduleProcessPendingMessagesActionForStartup, scheduleOnlyForCurrentProcess, maybeScheduleImmediately]");
        if (enmr.TRANSPORT_RCS.equals(((cozg) this.s.b()).d())) {
            ekrw ekrwVarH4 = ekrgVar.h();
            ekrwVarH4.X(ekrzVar, "Bugle");
            ((ekrd) ((ekrd) ekrwVarH4).h("com/google/android/apps/messaging/shared/rcs/readiness/ChatReadinessManagerImpl", "kickOffRcsReadyPendingWork", 333, "ChatReadinessManagerImpl.java")).q("Trigger scheduling: [schedulePendingMessagesCatchup]");
            ciyr ciyrVar = (ciyr) this.t.b();
            if (((Boolean) ciyr.a.e()).booleanValue()) {
                ciyrVar.c().b();
            }
        }
        this.q.e();
        ((ayqn) this.f.b()).a(bary.a, barn.a, 3, elny.CHAT_READINESS_MANAGER).E(0L);
        ((aypx) this.o.b()).a();
        atomicBoolean.set(false);
        Iterator it = this.r.iterator();
        while (it.hasNext()) {
            ((cjpn) it.next()).a();
        }
        Iterator it2 = ((Set) this.u.b()).iterator();
        while (it2.hasNext()) {
            ((cjpn) it2.next()).a();
        }
    }

    @Override // defpackage.cjpo
    public final void p(cldb cldbVar) {
        if (m()) {
            return;
        }
        ekrw ekrwVarG = a.g();
        ekrwVarG.X(eksq.a, "Bugle");
        ((ekrd) ((ekrd) ekrwVarG).h("com/google/android/apps/messaging/shared/rcs/readiness/ChatReadinessManagerImpl", "potentiallyQueueActionToWaitForRcsServiceConnection", 623, "ChatReadinessManagerImpl.java")).q("Rcs services not connected. Queueing action");
        aylf aylfVar = (aylf) this.e.b();
        aylm aylmVar = (aylm) aylfVar.a.b();
        aylmVar.getClass();
        aylp aylpVar = (aylp) aylfVar.b.b();
        aylpVar.getClass();
        new WaitForRcsServiceConnectionAction(aylmVar, aylpVar).q(cldbVar);
    }

    public final elrz q(aubq aubqVar) {
        return u(((dggw) this.v.b()).v(aubqVar.d) ? enwr.AVAILABLE : enwr.DISABLED_SIM_ABSENT, ((cozg) this.s.b()).c(aubqVar).f);
    }

    public final elrz r() {
        return u(enwr.DISABLED_SIM_ABSENT, enmr.TRANSPORT_UNKNOWN);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0081  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean s(defpackage.elrz r12) {
        /*
            Method dump skipped, instructions count: 287
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cjpt.s(elrz):boolean");
    }

    @Override // defpackage.cqew
    public final void x() {
        if (v()) {
            if (cqgk.AVAILABLE.equals(((cqey) this.n.a()).f())) {
                ekrw ekrwVarE = a.e();
                ekrwVarE.X(eksq.a, "Bugle");
                ((ekrd) ((ekrd) ekrwVarE).h("com/google/android/apps/messaging/shared/rcs/readiness/ChatReadinessManagerImpl", "onConnectivityStateChanged", 645, "ChatReadinessManagerImpl.java")).q("onConnectivityStateChanged: kicking off pending messages and notifying RcsOnReadyListeners if now connected");
                o();
            }
        }
    }
}
