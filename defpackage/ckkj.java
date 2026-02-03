package defpackage;

import android.content.Context;
import android.content.Intent;
import android.telephony.SubscriptionInfo;
import android.telephony.SubscriptionManager;
import com.google.common.util.concurrent.ListenableFuture;
import j$.time.Duration;
import j$.util.DesugarCollections;
import j$.util.Map;
import j$.util.Objects;
import j$.util.Optional;
import j$.util.concurrent.ConcurrentHashMap;
import j$.util.function.Consumer$CC;
import j$.util.function.Function$CC;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.function.Consumer;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class ckkj implements chtr, cldw, cldt, cldy, cfsc, cfsa, cldv, clea, devu {
    public static final eksp a = eksp.c("BugleRcsProvisioning");
    static final cczv b;
    private final fcsu A;
    private final dhkw B;
    private final crma C;
    private final aqaw D;
    private final fcsu E;
    private final fcsu F;
    private final aqbk G;
    private final fcsu H;
    private final fcsu I;
    private final fcsu J;
    private final fcsu K;
    private final fcsu L;
    private final fcsu M;
    private final fcsu N;
    private final Map O = new ConcurrentHashMap();
    private final Set P = ekpg.i();
    private final ckjt Q = new ckjt(this);
    private final ckju R = new ckju(this);
    private final dggc S;
    public final fcsu c;
    public final fcsu d;
    public final eosc e;
    public final fcsu f;
    public final chzz g;
    public final cjxi h;
    public final ahgh i;
    public final eigp j;
    public final fcsu k;
    public final ckhh l;
    public final cmlb m;
    public final cebq n;
    public final fcsu o;
    public final fcsu p;
    public final fcsu q;
    public final fcsu r;
    private final Context s;
    private final eosc t;
    private final fcsu u;
    private final dgqr v;
    private final dgrf w;
    private final dgrd x;
    private final aika y;
    private final cogw z;

    static {
        cdag.e(cdag.b, "vendor_ims_service_connection_timeout_ms", 10000);
        b = cdag.c(cdag.b, "phenotype_trigger_event_sample_rate", 50.0d);
    }

    public ckkj(Context context, fcsu fcsuVar, ccyw ccywVar, fcsu fcsuVar2, eosc eoscVar, eosc eoscVar2, fcsu fcsuVar3, fcsu fcsuVar4, dgqr dgqrVar, dgrf dgrfVar, dgrd dgrdVar, chzz chzzVar, aika aikaVar, dggc dggcVar, cjxi cjxiVar, cogw cogwVar, fcsu fcsuVar5, ahgh ahghVar, eigp eigpVar, crma crmaVar, dhkw dhkwVar, fcsu fcsuVar6, ckhh ckhhVar, cmlb cmlbVar, fcsu fcsuVar7, fcsu fcsuVar8, cebq cebqVar, fcsu fcsuVar9, fcsu fcsuVar10, aqbk aqbkVar, aqaw aqawVar, fcsu fcsuVar11, fcsu fcsuVar12, fcsu fcsuVar13, fcsu fcsuVar14, fcsu fcsuVar15, fcsu fcsuVar16, fcsu fcsuVar17, fcsu fcsuVar18, fcsu fcsuVar19) {
        this.s = context;
        this.c = fcsuVar;
        this.d = fcsuVar2;
        this.e = eoscVar;
        this.t = eoscVar2;
        this.f = fcsuVar3;
        this.u = fcsuVar4;
        this.v = dgqrVar;
        this.w = dgrfVar;
        this.x = dgrdVar;
        this.g = chzzVar;
        this.y = aikaVar;
        this.S = dggcVar;
        this.h = cjxiVar;
        this.z = cogwVar;
        this.A = fcsuVar5;
        this.i = ahghVar;
        this.j = eigpVar;
        this.B = dhkwVar;
        this.C = crmaVar;
        this.k = fcsuVar6;
        this.l = ckhhVar;
        this.m = cmlbVar;
        this.E = fcsuVar7;
        this.F = fcsuVar8;
        this.n = cebqVar;
        this.o = fcsuVar9;
        this.p = fcsuVar10;
        this.D = aqawVar;
        this.G = aqbkVar;
        this.H = fcsuVar11;
        this.q = fcsuVar12;
        this.I = fcsuVar13;
        this.r = fcsuVar14;
        this.J = fcsuVar15;
        this.K = fcsuVar16;
        this.M = fcsuVar17;
        this.L = fcsuVar18;
        this.N = fcsuVar19;
        ccywVar.c(new dfno() { // from class: ckjv
            @Override // defpackage.dfno
            public final void onCsLibPhenotypeUpdated() {
                ((eksl) ((eksl) ckkj.a.h()).h("com/google/android/apps/messaging/shared/rcsprovisioning/trigger/RcsProvisioningTriggerImpl", "onCsLibPhenotypeUpdated", 896, "RcsProvisioningTriggerImpl.java")).t("RcsProvisioningTrigger: onCsLibPhenotypeUpdated, enableProvisioningTaskInBugle = %s", Boolean.valueOf(dfog.C()));
                Optional optionalOf = Optional.of((Double) ckkj.b.e());
                final ckkj ckkjVar = this.a;
                auvh.h(ckkjVar.o(chyx.CSLIB_PHENOTYPE_UPDATE, true, optionalOf).h(new ejvr() { // from class: ckjs
                    @Override // defpackage.ejvr
                    public final Object apply(Object obj) {
                        ckkjVar.w(ewjm.TRIGGER_PHENOTYPE_FLAG_UPDATE, enxe.CSLIB_PHENOTYPE_UPDATE);
                        return null;
                    }
                }, ckkjVar.e));
            }
        });
        ((chza) ((cqbm) fcsuVar2.b()).a()).i(new chyy() { // from class: ckjw
            @Override // defpackage.chyy
            public final void c(chyz chyzVar) {
                AutoCloseable autoCloseableK;
                ckkj ckkjVar = this.a;
                if (!((aruq) ckkjVar.r.b()).a()) {
                    ckkjVar.q(chyzVar);
                    return;
                }
                try {
                    autoCloseableK = ckkjVar.j.c("RcsProvisioningTriggerImpl#onRcsAvailabilityUpdate", "com/google/android/apps/messaging/shared/rcsprovisioning/trigger/RcsProvisioningTriggerImpl", "getRootOrSpanTrace", 2004);
                } catch (IllegalStateException unused) {
                    eiiy.e();
                    autoCloseableK = eiiy.k("RcsProvisioningTriggerImpl#onRcsAvailabilityUpdate");
                }
                try {
                    ckkjVar.q(chyzVar);
                    autoCloseableK.close();
                } catch (Throwable th) {
                    try {
                        autoCloseableK.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            }
        }, eoscVar);
    }

    private final eiju B(chyx chyxVar, boolean z) {
        return o(chyxVar, z, Optional.empty());
    }

    private final enxm C(String str) {
        dgiq dgiqVarF = ((dgrs) this.f.b()).f(str);
        boolean zS = dgiqVarF.S();
        boolean z = !dgiqVarF.T();
        int iA = dgiqVarF.a();
        boolean zX = dgiqVarF.X();
        enxl enxlVar = (enxl) enxm.a.createBuilder();
        enxlVar.copyOnWrite();
        enxm enxmVar = (enxm) enxlVar.instance;
        enxmVar.b |= 1;
        enxmVar.c = zS;
        enxlVar.copyOnWrite();
        enxm enxmVar2 = (enxm) enxlVar.instance;
        enxmVar2.b |= 2;
        enxmVar2.d = z;
        enxlVar.copyOnWrite();
        enxm enxmVar3 = (enxm) enxlVar.instance;
        enxmVar3.b |= 4;
        enxmVar3.e = iA != 1;
        enxlVar.copyOnWrite();
        enxm enxmVar4 = (enxm) enxlVar.instance;
        enxmVar4.b |= 8;
        enxmVar4.f = zX;
        return (enxm) enxlVar.build();
    }

    private final String D(enwr enwrVar) {
        return enwrVar == null ? "null" : ((chza) ((cqbm) this.d.b()).a()).g(enwrVar, elsf.UNKNOWN_UNINITIALIZED_REASON);
    }

    @Deprecated
    private final void E(enxe enxeVar) {
        ((ckhg) this.c.b()).a(enxeVar).k(auvh.b(), eoqg.a);
    }

    private final void F(dggn dggnVar, ewjm ewjmVar, enxe enxeVar) {
        ((eksl) ((eksl) a.h()).h("com/google/android/apps/messaging/shared/rcsprovisioning/trigger/RcsProvisioningTriggerImpl", "scheduleProvisioningForRcsProvisioningId", 1212, "RcsProvisioningTriggerImpl.java")).D("scheduleProvisioningForRcsProvisioningId rcsProvisioningId: %s, provisioningTriggerEvent: %s", dhiz.SIM_ID.c(dggnVar), enxeVar);
        this.l.e(dggnVar, ewjmVar, enxeVar);
    }

    private final boolean G(String str) {
        boolean z = ((dgrs) this.f.b()).d(str).c;
        ((eksl) ((eksl) a.h()).h("com/google/android/apps/messaging/shared/rcsprovisioning/trigger/RcsProvisioningTriggerImpl", "shouldScheduleNotifyRcsUnavailableTask", 1591, "RcsProvisioningTriggerImpl.java")).t("RcsProvisioningTrigger: Should schedule notify RCS unavailable task NotifyBackendRcsIsUnavailable: %b", Boolean.valueOf(z));
        return dfog.C() && z;
    }

    public static enxe p(chyx chyxVar) {
        dhki dhkiVar = dhki.UNKNOWN;
        switch (chyxVar.ordinal()) {
            case 1:
                return enxe.RECEIVED_POST_PROVISIONING_INTENT;
            case 2:
                return enxe.CSLIB_PHENOTYPE_UPDATE;
            case 3:
                return enxe.DEFAULT_SMS_APP_ENABLED;
            case 4:
                return enxe.DEFAULT_SMS_APP_DISABLED;
            case 5:
                return enxe.BOOT_COMPLETE;
            case 6:
                return enxe.PACKAGE_REPLACED;
            case 7:
                return enxe.USER_SETTING_ENABLED;
            case 8:
                return enxe.USER_SETTING_DISABLED;
            case 9:
                return enxe.GSERVICE_UPDATE;
            case 10:
                return enxe.RECONFIG_SMS;
            case 11:
                return enxe.SINGLE_REGISTRATION_PROVISIONING_EVENT;
            case 12:
                return enxe.SINGLE_REGISTRATION_CAPABILITY_UPDATE;
            case 13:
                return enxe.RCS_CONFIGURATION_UPDATED;
            case 14:
                return enxe.SIM_SWAP;
            case 15:
                return enxe.SIM_REMOVAL;
            case 16:
                return enxe.TACHYON_REPROVISION_ERROR;
            case 17:
                return enxe.TACHYON_INVALID_IDENTITY_ERROR;
            case 18:
                return enxe.MOBILE_CONFIGURATION_UPDATE;
            case 19:
                return enxe.USER_SETTING_ENABLED_GLOBAL;
            case 20:
                return enxe.USER_SETTING_DISABLED_GLOBAL;
            case 21:
                return enxe.USER_SETTING_ENABLED_PER_SIM;
            case 22:
                return enxe.USER_SETTING_DISABLED_PER_SIM;
            case 23:
                return enxe.FI_ACTIVATION_COMPLETE;
            case 24:
                return enxe.DEFAULT_CALL_SIM_UPDATE;
            case 25:
                return enxe.DEFAULT_SMS_SIM_UPDATE;
            case 26:
                return enxe.DEFAULT_DATA_SIM_UPDATE;
            case 27:
                return enxe.SERVICE_STATE_CHANGE;
            default:
                return enxe.UNDEFINED_TRIGGER_EVENT;
        }
    }

    static boolean y(enwr enwrVar) {
        dhki dhkiVar = dhki.UNKNOWN;
        switch (enwrVar) {
            case INVALID_PRE_KOTO:
            case BUGLE_LOADING_AVAILABILITY_IN_PROGRESS:
            case DOGFOOD_SETUP_PENDING:
            case AVAILABLE:
            case CARRIER_SETUP_PENDING:
            case BUGLE_LOADING_AVAILABILITY_EXCEPTION:
            case CARRIER_TERMS_AND_CONDITIONS_ACCEPTANCE_PENDING:
            case DOGFOOD_TERMS_AND_CONDITIONS_ACCEPTANCE_PENDING:
            case SUBJECT_TO_BATTERY_OPTIMIZATIONS:
            case UNKNOWN_PEV2_DISABLED:
            case DISABLED_STUB_PROVISIONING_ENGINE:
            case DISABLED_VIA_RCS_CONFIG_CHAT_AUTH:
            case DISABLED_BY_CONFIG_VERSION_ZERO_POSITIVE_VALIDITY:
            case DISABLED_BY_CONFIG_VERSION_CARRIER:
            case DISABLED_BY_CONFIG_VERSION_APP_VERSION:
            case DISABLED_BY_CONFIG_VERSION_PERMANENT:
            case DISABLED_BY_CONFIG_VERSION_AWAITING_INPUT:
            case DISABLED_BY_CONFIG_VERSION_ATTESTATION_FAILURE:
            case DISABLED_BY_CONFIG_VERSION_OTHER:
            case DISABLED_BY_CONFIG_VERSION_VENDOR_NOT_SUPPORTED:
                return false;
            case DISABLED_VIA_GSERVICES:
            case DISABLED_FROM_PREFERENCES:
            case DISABLED_NOT_DEFAULT_SMS_APP:
            case DISABLED_REMOTELY:
            case DISABLED_OLD_RCS_SERVICE_VERSION:
            case DISABLED_SIM_ABSENT:
            case DISABLED_MULTI_SLOT_DEVICE:
            case DISABLED_FOR_FI:
            case DISABLED_LEGACY_CLIENT_ENABLED:
            case DISABLED_NO_PERMISSIONS:
            case DISABLED_TERMS_AND_CONDITIONS_REJECTED:
            case DISABLED_WAITING_FOR_PHENOTYPE:
            case DISABLED_VIA_FLAGS:
            case DISABLED_BY_EMM:
            case DISABLED_FOR_SECONDARY_USER:
            case DISABLED_BY_PROVISIONING_RULE:
            case DISABLED_FOR_WEAR:
            case DISABLED_AUTOMATIC_PROVISIONING_RULE:
            case DISABLED_NOT_DEFAULT_SIM:
                return true;
            default:
                throw new IllegalStateException("unsupported BugleRcsAvailability :" + enwrVar.N);
        }
    }

    @Override // defpackage.clea
    @Deprecated
    public final void A() {
        fcsu fcsuVar = this.L;
        if (((arhh) fcsuVar.b()).a()) {
            throw new ckki("onSingleRegistrationConfigurationRemoved");
        }
        eksp ekspVar = a;
        ((eksl) ((eksl) ekspVar.h()).h("com/google/android/apps/messaging/shared/rcsprovisioning/trigger/RcsProvisioningTriggerImpl", "onSingleRegistrationConfigurationRemoved", 588, "RcsProvisioningTriggerImpl.java")).q("RcsProvisioningTrigger: Schedule SR provisioning on removed configuration by AOSP.");
        chzz chzzVar = this.g;
        enxe enxeVar = enxe.SINGLE_REGISTRATION_CONFIGURATION_REMOVED;
        chzzVar.b(enxeVar);
        final ewjm ewjmVar = ewjm.TRIGGER_CALLBACK_REMOVED_BY_PLATFORM;
        ((eksl) ((eksl) ekspVar.h()).h("com/google/android/apps/messaging/shared/rcsprovisioning/trigger/RcsProvisioningTriggerImpl", "scheduleProvisioning", 1236, "RcsProvisioningTriggerImpl.java")).q("scheduleProvisioning using legacy code path");
        fcsu fcsuVar2 = this.u;
        final int iB = ((dhes) fcsuVar2.b()).b();
        String strL = ((dhes) fcsuVar2.b()).l();
        dhki dhkiVarA = this.B.a(iB);
        dhki dhkiVar = dhki.UNKNOWN;
        int iOrdinal = dhkiVarA.ordinal();
        if (iOrdinal != 1) {
            if (iOrdinal != 2) {
                ((eksl) ((eksl) ekspVar.j()).h("com/google/android/apps/messaging/shared/rcsprovisioning/trigger/RcsProvisioningTriggerImpl", "scheduleProvisioningBasedOnSipConnectionType", 1271, "RcsProvisioningTriggerImpl.java")).t("RcsProvisioningTrigger: Provisioning Engine version is unknown due to temporary Telephony platform unavailability. %s", dhkiVarA.name());
                return;
            } else {
                ((eksl) ((eksl) ekspVar.h()).h("com/google/android/apps/messaging/shared/rcsprovisioning/trigger/RcsProvisioningTriggerImpl", "scheduleProvisioningBasedOnSipConnectionType", 1258, "RcsProvisioningTriggerImpl.java")).t("RcsProvisioningTrigger: DR is active, initializing DR provisioning. %s", dhkiVarA.name());
                ((ckhg) this.c.b()).k(strL, enxeVar);
                return;
            }
        }
        ((eksl) ((eksl) ekspVar.h()).h("com/google/android/apps/messaging/shared/rcsprovisioning/trigger/RcsProvisioningTriggerImpl", "scheduleProvisioningBasedOnSipConnectionType", 1264, "RcsProvisioningTriggerImpl.java")).t("RcsProvisioningTrigger: Single Registration Provisioning Engine is active, initializing SR provisioning. %s", dhkiVarA.name());
        if (((arhh) fcsuVar.b()).a()) {
            throw new ckki("initializeProvisioningIfSingleRegistrationEnabled");
        }
        ((eksl) ((eksl) ekspVar.h()).h("com/google/android/apps/messaging/shared/rcsprovisioning/trigger/RcsProvisioningTriggerImpl", "initializeSingleRegistrationProvisioning", 621, "RcsProvisioningTriggerImpl.java")).r("[SR]: Single Registration is enabled. Setting up vendor ims for subId: %d", iB);
        Runnable runnable = new Runnable() { // from class: ckke
            @Override // java.lang.Runnable
            public final void run() {
                this.a.i.a(iB, ewjmVar);
            }
        };
        eosc eoscVar = this.e;
        eijx.f(runnable, eoscVar).k(auvh.b(), eoscVar);
    }

    @Override // defpackage.cfsa
    public final eiju a(ezol ezolVar) {
        felm felmVarB = felm.b(ezolVar.b);
        if (felmVarB == null) {
            felmVarB = felm.UNRECOGNIZED;
        }
        if (felmVarB.equals(felm.PHONE_NUMBER)) {
            dggk dggkVarA = ((dggl) this.F.b()).a(ezolVar.c);
            Optional map = ((dghj) this.E.b()).h(dggkVarA).map(new Function() { // from class: ckka
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo536andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return this.a.z(dggo.a((dggn) obj), 2, chyx.TACHYON_REPROVISION_ERROR);
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
            ((eksl) ((eksl) a.j()).h("com/google/android/apps/messaging/shared/rcsprovisioning/trigger/RcsProvisioningTriggerImpl", "logNoIdentityMappingForPhoneNumber", 889, "RcsProvisioningTriggerImpl.java")).t("No identity mapping for phone number: %s", dhiz.PHONE_NUMBER.c(dggkVarA.toString()));
            return (eiju) map.orElse(eijx.e(null));
        }
        eksl ekslVar = (eksl) ((eksl) a.h()).h("com/google/android/apps/messaging/shared/rcsprovisioning/trigger/RcsProvisioningTriggerImpl", "onTachygramProvisioningError", 868, "RcsProvisioningTriggerImpl.java");
        felm felmVarB2 = felm.b(ezolVar.b);
        if (felmVarB2 == null) {
            felmVarB2 = felm.UNRECOGNIZED;
        }
        ekslVar.t("TachyonCommon.Id type %s is not a phone number.", felmVarB2);
        return eijx.e(null);
    }

    @Override // defpackage.cldt
    public final void b() {
        ((eksl) ((eksl) a.h()).h("com/google/android/apps/messaging/shared/rcsprovisioning/trigger/RcsProvisioningTriggerImpl", "onBootComplete", 454, "RcsProvisioningTriggerImpl.java")).q("RcsProvisioningTrigger: onBootComplete");
        B(chyx.BOOT_COMPLETE, true).k(auvh.b(), this.e);
    }

    @Override // defpackage.cldy
    public final void c() {
        ((eksl) ((eksl) a.h()).h("com/google/android/apps/messaging/shared/rcsprovisioning/trigger/RcsProvisioningTriggerImpl", "onPackageReplaced", 461, "RcsProvisioningTriggerImpl.java")).q("RcsProvisioningTrigger: onPackageReplace");
        B(chyx.PACKAGE_REPLACED, true).k(auvh.b(), this.e);
    }

    @Override // defpackage.cldw
    public final eiju d(boolean z) {
        ((eksl) ((eksl) a.h()).h("com/google/android/apps/messaging/shared/rcsprovisioning/trigger/RcsProvisioningTriggerImpl", "onDefaultSmsAppChange", 1827, "RcsProvisioningTriggerImpl.java")).t("RcsProvisioningTrigger: onDefaultSmsAppChange : isDefaultSmsApp = %s", Boolean.valueOf(z));
        return B(z ? chyx.DEFAULT_SMS_APP_ENABLED : chyx.DEFAULT_SMS_APP_DISABLED, true);
    }

    @Override // defpackage.cfsc
    public final eiju e(cfrh cfrhVar, final felx felxVar) {
        eiju eijuVarE;
        if (cfrhVar.a().equals(cfrg.PHONE_NUMBER) && (cfrhVar instanceof cfre)) {
            dggk dggkVarA = ((dggl) this.F.b()).a(((cfre) cfrhVar).b);
            ((eksl) ((eksl) a.h()).h("com/google/android/apps/messaging/shared/rcsprovisioning/trigger/RcsProvisioningTriggerImpl", "getSimIdFromRegistrationInfoAsync", 815, "RcsProvisioningTriggerImpl.java")).t("PhoneNumberRegistrationInfo: %s", dhiz.PHONE_NUMBER.c(dggkVarA.a));
            eijuVarE = ((dghj) this.E.b()).e(dggkVarA).h(new ejvr() { // from class: ckjn
                @Override // defpackage.ejvr
                public final Object apply(Object obj) {
                    eksp ekspVar = ckkj.a;
                    return ((Optional) obj).map(new Function() { // from class: ckkb
                        @Override // java.util.function.Function
                        /* renamed from: andThen */
                        public final /* synthetic */ Function mo536andThen(Function function) {
                            return Function$CC.$default$andThen(this, function);
                        }

                        @Override // java.util.function.Function
                        public final Object apply(Object obj2) {
                            return dggo.a((dggn) obj2);
                        }

                        public final /* synthetic */ Function compose(Function function) {
                            return Function$CC.$default$compose(this, function);
                        }
                    });
                }
            }, eoqg.a);
        } else {
            ((eksl) ((eksl) a.j()).h("com/google/android/apps/messaging/shared/rcsprovisioning/trigger/RcsProvisioningTriggerImpl", "getSimIdFromRegistrationInfoAsync", 803, "RcsProvisioningTriggerImpl.java")).t("RegistrationInfo.RegistrationType %s is not a phone number.", cfrhVar.a());
            eijuVarE = eijx.e(Optional.empty());
        }
        return eijuVarE.i(new eooz() { // from class: ckjx
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                Optional optional = (Optional) obj;
                if (!optional.isPresent()) {
                    ((eksl) ((eksl) ckkj.a.j()).h("com/google/android/apps/messaging/shared/rcsprovisioning/trigger/RcsProvisioningTriggerImpl", "onTachyonRegistrationError", 843, "RcsProvisioningTriggerImpl.java")).q("Unable to handle Tachyon registration error, could not find simId for phone number.");
                    return eijx.e(null);
                }
                felx felxVar2 = felxVar;
                ckkj ckkjVar = this.a;
                eksp ekspVar = ckkj.a;
                ((eksl) ((eksl) ekspVar.h()).h("com/google/android/apps/messaging/shared/rcsprovisioning/trigger/RcsProvisioningTriggerImpl", "onTachyonRegistrationError", 837, "RcsProvisioningTriggerImpl.java")).t("onTachyonRegistrationError for simId: %s", dhiz.SIM_ID.c(((dggp) optional.get()).a));
                dggp dggpVar = (dggp) optional.get();
                dhki dhkiVar = dhki.UNKNOWN;
                int iOrdinal = felxVar2.ordinal();
                if (iOrdinal == 31) {
                    return ckkjVar.z(dggpVar, 1, chyx.TACHYON_INVALID_IDENTITY_ERROR);
                }
                if (iOrdinal == 33) {
                    return ckkjVar.z(dggpVar, 1, chyx.TACHYON_REPROVISION_ERROR);
                }
                ((eksl) ((eksl) ekspVar.j()).h("com/google/android/apps/messaging/shared/rcsprovisioning/trigger/RcsProvisioningTriggerImpl", "onTachyonRegistrationErrorForSim", 860, "RcsProvisioningTriggerImpl.java")).t("Unhandled TachyonError type %s.", felxVar2);
                return eijx.e(null);
            }
        }, eoqg.a);
    }

    @Override // defpackage.chtr
    public final eiju f(final String str) {
        eksp ekspVar = a;
        ((eksl) ((eksl) ekspVar.h()).h("com/google/android/apps/messaging/shared/rcsprovisioning/trigger/RcsProvisioningTriggerImpl", "onMobileConfigurationUpdated", 980, "RcsProvisioningTriggerImpl.java")).t("RcsProvisioningTrigger: onMobileConfigurationUpdated for simId: %s", dhiz.SIM_ID.c(str));
        this.P.add(str);
        if (!this.D.a()) {
            return n(str);
        }
        final String str2 = this.n.c(str).Q;
        ((eksl) ((eksl) ekspVar.h()).h("com/google/android/apps/messaging/shared/rcsprovisioning/trigger/RcsProvisioningTriggerImpl", "onMobileConfigurationUpdated", 989, "RcsProvisioningTriggerImpl.java")).D("RcsProvisioningTrigger: onMobileConfigurationUpdated, reprovisionCampaignId = %s, simId = %s", str2, str);
        return str2.isEmpty() ? n(str) : this.h.d().h(new ejvr() { // from class: cjwr
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                return (String) Map.EL.getOrDefault(DesugarCollections.unmodifiableMap(((cjuu) obj).r), str, "Default");
            }
        }, eoqg.a).i(new eooz() { // from class: ckkf
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                String str3 = (String) obj;
                eksp ekspVar2 = ckkj.a;
                ((eksl) ((eksl) ekspVar2.h()).h("com/google/android/apps/messaging/shared/rcsprovisioning/trigger/RcsProvisioningTriggerImpl", "handleReprovisionCampaignInMobileConfigurationUpdatedIfNeeded", 1019, "RcsProvisioningTriggerImpl.java")).t("RcsProvisioningTrigger: onMobileConfigurationUpdated, lastReprovisionCampaignId = %s", str3);
                ckkj ckkjVar = this.a;
                chza chzaVar = (chza) ((cqbm) ckkjVar.d.b()).a();
                String str4 = str;
                if (chzaVar.v(new dggp(str4)) != enwr.AVAILABLE) {
                    ((eksl) ((eksl) ekspVar2.h()).h("com/google/android/apps/messaging/shared/rcsprovisioning/trigger/RcsProvisioningTriggerImpl", "handleReprovisionCampaignInMobileConfigurationUpdatedIfNeeded", 1023, "RcsProvisioningTriggerImpl.java")).q("RcsProvisioningTrigger: onMobileConfigurationUpdated, skipping ReprovisionCampaign since RCS is not available");
                    return ckkjVar.n(str4);
                }
                String str5 = str2;
                if (str5.equals("Default")) {
                    ckkjVar.h.j(str4, str5);
                    return ckkjVar.n(str4);
                }
                if (str5.startsWith("Rollback")) {
                    if (str3.equals("Default")) {
                        return ckkjVar.n(str4);
                    }
                    if (str3.startsWith("Rollback")) {
                        if (!str3.equals(str5)) {
                            ckkjVar.h.j(str4, str5);
                        }
                        return ckkjVar.n(str4);
                    }
                    ckkjVar.r(str4, str5);
                } else {
                    if (str3.equals(str5)) {
                        return ckkjVar.n(str4);
                    }
                    ckkjVar.r(str4, str5);
                }
                return eijx.e(null);
            }
        }, this.e);
    }

    @Override // defpackage.chtr
    public final void g() {
        ((eksl) ((eksl) a.h()).h("com/google/android/apps/messaging/shared/rcsprovisioning/trigger/RcsProvisioningTriggerImpl", "onAppStart", 541, "RcsProvisioningTriggerImpl.java")).q("RcsProvisioningTrigger: Schedule provisioning on app startup");
        eiju eijuVarB = B(chyx.NO_HINT, false);
        ejvr ejvrVar = new ejvr() { // from class: ckjo
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                this.a.w(ewjm.TRIGGER_APP_START, enxe.APP_STARTUP);
                return null;
            }
        };
        eosc eoscVar = this.e;
        eijuVarB.h(ejvrVar, eoscVar).k(auvh.b(), eoscVar);
    }

    @Override // defpackage.chtr
    public final void h(int i) {
        String str;
        Iterator it = this.m.p().iterator();
        while (true) {
            if (!it.hasNext()) {
                ((eksl) ((eksl) a.h()).h("com/google/android/apps/messaging/shared/rcsprovisioning/trigger/RcsProvisioningTriggerImpl", "getSimIdFromEligibleSubIdOrEmpty", 1062, "RcsProvisioningTriggerImpl.java")).r("simId not found for subId: %s in the Intent", i);
                str = "";
                break;
            } else {
                cmmh cmmhVar = (cmmh) it.next();
                if (cmmhVar.d == i) {
                    str = cmmhVar.c;
                    break;
                }
            }
        }
        if (str.isEmpty()) {
            ((eksl) ((eksl) a.h()).h("com/google/android/apps/messaging/shared/rcsprovisioning/trigger/RcsProvisioningTriggerImpl", "onFiActivationComplete", 1070, "RcsProvisioningTriggerImpl.java")).q("Provisioning is not scheduled because the subId sent in intent does not map to valid simId");
            if (craf.h) {
                ckje.b(this.s, 3, i);
                return;
            }
            return;
        }
        dggp dggpVar = new dggp(str);
        ((eksl) ((eksl) a.h()).h("com/google/android/apps/messaging/shared/rcsprovisioning/trigger/RcsProvisioningTriggerImpl", "onFiActivationComplete", 1082, "RcsProvisioningTriggerImpl.java")).t("RcsProvisioningTrigger: onFiActivationComplete for rcsProvisioningId : %s", dhiz.SIM_ID.c(dggpVar));
        x(dggpVar, chyx.FI_ACTIVATION_COMPLETE);
        F(dggpVar, ewjm.TRIGGER_FI_ACTIVATION_COMPLETE, enxe.FI_ACTIVATION_COMPLETE);
    }

    @Override // defpackage.chtr
    public final void i(boolean z) {
        ((eksl) ((eksl) a.h()).h("com/google/android/apps/messaging/shared/rcsprovisioning/trigger/RcsProvisioningTriggerImpl", "onRcsGlobalSettingChange", 634, "RcsProvisioningTriggerImpl.java")).t("RcsProvisioningTrigger: onRcsGlobalSettingChange : isRcsEnabled = %s", Boolean.valueOf(z));
        B(z ? chyx.USER_SETTING_ENABLED_GLOBAL : chyx.USER_SETTING_DISABLED_GLOBAL, true).k(auvh.b(), this.t);
    }

    @Override // defpackage.chtr
    public final void j(dggn dggnVar, boolean z) {
        eksp ekspVar = a;
        eksl ekslVar = (eksl) ((eksl) ekspVar.h()).h("com/google/android/apps/messaging/shared/rcsprovisioning/trigger/RcsProvisioningTriggerImpl", "onRcsPerSimSettingChange", 645, "RcsProvisioningTriggerImpl.java");
        dhiz dhizVar = dhiz.SIM_ID;
        ekslVar.E("RcsProvisioningTrigger: onRcsPerSimSettingChange : rcsProvisioningId = %s, isRcsEnabled = %s", dhizVar.c(dggo.a(dggnVar).a), z);
        chyx chyxVar = z ? chyx.USER_SETTING_ENABLED_PER_SIM : chyx.USER_SETTING_DISABLED_PER_SIM;
        ((eksl) ((eksl) ekspVar.h()).h("com/google/android/apps/messaging/shared/rcsprovisioning/trigger/RcsProvisioningTriggerImpl", "updateRcsAvailabilityForProvisioningIdAsync", 1181, "RcsProvisioningTriggerImpl.java")).D("RcsProvisioningTrigger: updateRcsAvailabilityForProvisioningIdAsync : rcsProvisioningId = %s hint = %s", dhizVar.c(dggnVar), chyxVar);
        this.g.b(p(chyxVar));
        ((chza) ((cqbm) this.d.b()).a()).b(dggnVar, chyxVar).k(auvh.b(), this.t);
    }

    @Override // defpackage.chtr
    public final void k(enxe enxeVar) {
        eksp ekspVar = a;
        ((eksl) ((eksl) ekspVar.h()).h("com/google/android/apps/messaging/shared/rcsprovisioning/trigger/RcsProvisioningTriggerImpl", "onReconfiguration", 468, "RcsProvisioningTriggerImpl.java")).q("RcsProvisioningTrigger: Reconfiguration response, restarting provisioning");
        dgrs dgrsVar = (dgrs) this.f.b();
        fcsu fcsuVar = this.u;
        dgrsVar.C(((dhes) fcsuVar.b()).l());
        this.g.b(enxeVar);
        int iB = ((dhes) fcsuVar.b()).b();
        if (this.S.c(iB)) {
            ((eksl) ((eksl) ekspVar.h()).h("com/google/android/apps/messaging/shared/rcsprovisioning/trigger/RcsProvisioningTriggerImpl", "onReconfiguration", 474, "RcsProvisioningTriggerImpl.java")).r("[SR]: RcsProvisioningTrigger: Triggering Single Registration re-configuration for subId %s.", iB);
        } else {
            ((eksl) ((eksl) ekspVar.h()).h("com/google/android/apps/messaging/shared/rcsprovisioning/trigger/RcsProvisioningTriggerImpl", "onReconfiguration", 479, "RcsProvisioningTriggerImpl.java")).r("[SR]: RcsProvisioningTrigger: Single Registration is not capable for subId %s. Skipping re-configuration in AOSP.", iB);
        }
        if (((dgnq) this.A.b()).a()) {
            ((eksl) ((eksl) ekspVar.h()).h("com/google/android/apps/messaging/shared/rcsprovisioning/trigger/RcsProvisioningTriggerImpl", "onReconfiguration", 487, "RcsProvisioningTriggerImpl.java")).q("RcsProvisioningTrigger: Provisioning engine is currently running, skip restartProvisioning.");
            return;
        }
        dhki dhkiVarA = this.B.a(((dhes) fcsuVar.b()).b());
        if (!dhkiVarA.equals(dhki.DUAL_REG)) {
            ((eksl) ((eksl) ekspVar.h()).h("com/google/android/apps/messaging/shared/rcsprovisioning/trigger/RcsProvisioningTriggerImpl", "restartProvisioning", 1333, "RcsProvisioningTriggerImpl.java")).t("RcsProvisioningTrigger: SipConnectionType: %s, Skipping restartProvisioning.", dhkiVarA.name());
            return;
        }
        ((ckhg) this.c.b()).c(enxeVar).k(auvh.b(), this.e);
    }

    @Override // defpackage.chtr
    public final void l(String str) {
        List<SubscriptionInfo> activeSubscriptionInfoList;
        String strI;
        enxz enxzVar = (enxz) enya.a.createBuilder();
        boolean z = false;
        if (!((dgrs) this.f.b()).E(str)) {
            enxzVar.copyOnWrite();
            enya enyaVar = (enya) enxzVar.instance;
            enyaVar.b |= 1;
            enyaVar.c = false;
            this.g.f((enya) enxzVar.build());
            return;
        }
        enxzVar.copyOnWrite();
        enya enyaVar2 = (enya) enxzVar.instance;
        enyaVar2.b |= 1;
        enyaVar2.c = true;
        if (!(((eoth) ((aplg) this.G).a.b()).a("bugle.enable_sim_prefs_migration_is_fi_check_on_sim_removal") ? ((Boolean) this.m.j(new dggp(str)).map(new Function() { // from class: ckjf
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return Boolean.valueOf(((cmmh) obj).o);
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).orElse(false)).booleanValue() : ((dhes) this.u.b()).t())) {
            Context context = this.s;
            SubscriptionManager subscriptionManagerFrom = (SubscriptionManager) context.getApplicationContext().getSystemService(SubscriptionManager.class);
            if (subscriptionManagerFrom == null) {
                subscriptionManagerFrom = SubscriptionManager.from(context.getApplicationContext());
            }
            if (subscriptionManagerFrom == null) {
                enxzVar.copyOnWrite();
                enya enyaVar3 = (enya) enxzVar.instance;
                enyaVar3.b |= 16;
                enyaVar3.g = true;
            } else {
                if (this.C.k()) {
                    enxzVar.copyOnWrite();
                    enya enyaVar4 = (enya) enxzVar.instance;
                    enyaVar4.b |= 4;
                    enyaVar4.e = true;
                    activeSubscriptionInfoList = subscriptionManagerFrom.getActiveSubscriptionInfoList();
                } else {
                    enxzVar.copyOnWrite();
                    enya enyaVar5 = (enya) enxzVar.instance;
                    enyaVar5.b |= 4;
                    enyaVar5.e = false;
                    activeSubscriptionInfoList = null;
                }
                if (activeSubscriptionInfoList != null) {
                    int size = activeSubscriptionInfoList.size();
                    enxzVar.copyOnWrite();
                    enya enyaVar6 = (enya) enxzVar.instance;
                    enyaVar6.b |= 32;
                    enyaVar6.h = size;
                    Iterator<SubscriptionInfo> it = activeSubscriptionInfoList.iterator();
                    while (it.hasNext()) {
                        if (str.equals(it.next().getIccId())) {
                            z = true;
                            break;
                        }
                    }
                } else {
                    enxzVar.copyOnWrite();
                    enya enyaVar7 = (enya) enxzVar.instance;
                    enyaVar7.b |= 32;
                    enyaVar7.h = -1;
                }
            }
        } else {
            if (!((Boolean) dfog.o().a.R.a()).booleanValue()) {
                return;
            }
            try {
                if (this.C.k()) {
                    strI = dhkv.g(this.s).i();
                    enxzVar.copyOnWrite();
                    enya enyaVar8 = (enya) enxzVar.instance;
                    enyaVar8.b |= 4;
                    enyaVar8.e = true;
                } else {
                    enxzVar.copyOnWrite();
                    enya enyaVar9 = (enya) enxzVar.instance;
                    enyaVar9.b |= 4;
                    enyaVar9.e = false;
                    strI = "";
                }
                if (str.equals(strI)) {
                    z = true;
                    break;
                }
            } catch (dhkf unused) {
                enxzVar.copyOnWrite();
                enya enyaVar10 = (enya) enxzVar.instance;
                enyaVar10.b |= 8;
                enyaVar10.f = true;
            }
        }
        enxzVar.copyOnWrite();
        enya enyaVar11 = (enya) enxzVar.instance;
        enyaVar11.b |= 2;
        enyaVar11.d = z;
        this.g.f((enya) enxzVar.build());
        if (z) {
            return;
        }
        x(new dggp(str), chyx.SIM_REMOVAL);
        if (G(str)) {
            ((ckhg) this.c.b()).i(str, "SIM removal", enxe.SIM_REMOVAL);
        }
        E(enxe.SIM_REMOVAL);
        ((cjzq) this.o.b()).k();
    }

    @Override // defpackage.chtr
    public final void m(String str, String str2) {
        if (((dgrs) this.f.b()).E(str) && G(str)) {
            ((ckhg) this.c.b()).i(str, "SIM swap", enxe.SIM_SWAP);
        }
        ((eksl) ((eksl) a.h()).h("com/google/android/apps/messaging/shared/rcsprovisioning/trigger/RcsProvisioningTriggerImpl", "onSimSwap", 667, "RcsProvisioningTriggerImpl.java")).q("RcsProvisioningTrigger: SIM swap detected, restarting provisioning");
        if (!ejwk.c(str)) {
            x(new dggp(str), chyx.SIM_SWAP);
        }
        final dggp dggpVar = new dggp(str2);
        x(dggpVar, chyx.SIM_SWAP);
        cmlb cmlbVar = this.m;
        final enxe enxeVar = enxe.SIM_SWAP;
        cmlbVar.j(dggpVar).ifPresent(new Consumer() { // from class: ckjg
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void z(Object obj) {
                this.a.v(dggpVar, ((cmmh) obj).d, enxeVar);
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
    }

    public final eiju n(String str) {
        eksp ekspVar = a;
        ((eksl) ((eksl) ekspVar.h()).h("com/google/android/apps/messaging/shared/rcsprovisioning/trigger/RcsProvisioningTriggerImpl", "onMobileConfigurationUpdatedWithoutReprovisionCampaign", 1011, "RcsProvisioningTriggerImpl.java")).q("RcsProvisioningTrigger: onMobileConfigurationUpdatedWithoutReprovisionCampaign");
        dggp dggpVar = new dggp(str);
        chyx chyxVar = chyx.MOBILE_CONFIGURATION_UPDATE;
        ((eksl) ((eksl) ekspVar.h()).h("com/google/android/apps/messaging/shared/rcsprovisioning/trigger/RcsProvisioningTriggerImpl", "updateAvailabilityForProvisioningIdAsync", 1128, "RcsProvisioningTriggerImpl.java")).E("RcsProvisioningTrigger: updateAvailabilityForProvisioningIdAsync : hint = %s logTriggerEvent = %s", chyxVar, true);
        this.g.b(p(chyxVar));
        return ((chza) ((cqbm) this.d.b()).a()).b(dggpVar, chyxVar);
    }

    public final eiju o(final chyx chyxVar, boolean z, Optional optional) {
        ((eksl) ((eksl) a.h()).h("com/google/android/apps/messaging/shared/rcsprovisioning/trigger/RcsProvisioningTriggerImpl", "updateAvailabilityForAllSimsAsync", 1104, "RcsProvisioningTriggerImpl.java")).E("RcsProvisioningTrigger: updateAvailabilityForAllSimsAsync : hint = %s logTriggerEvent = %s", chyxVar, z);
        if (z) {
            optional.ifPresentOrElse(new Consumer() { // from class: ckkc
                @Override // java.util.function.Consumer
                /* renamed from: accept */
                public final void z(Object obj) {
                    this.a.g.c(ckkj.p(chyxVar), ((Double) obj).doubleValue());
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            }, new Runnable() { // from class: ckkd
                @Override // java.lang.Runnable
                public final void run() {
                    this.a.g.b(ckkj.p(chyxVar));
                }
            });
        }
        return ((chza) ((cqbm) this.d.b()).a()).a(chyxVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:60:0x0349, code lost:
    
        if (y(r10) != false) goto L61;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x010d A[Catch: all -> 0x05bb, TryCatch #0 {, blocks: (B:4:0x0003, B:6:0x006f, B:8:0x0077, B:10:0x0083, B:13:0x00d5, B:15:0x00db, B:17:0x00ff, B:22:0x013b, B:23:0x0153, B:26:0x016c, B:28:0x017b, B:32:0x0184, B:34:0x01fd, B:35:0x0213, B:45:0x0309, B:47:0x031b, B:49:0x0323, B:51:0x0331, B:55:0x033c, B:65:0x0352, B:68:0x03a5, B:70:0x03ad, B:71:0x03b8, B:73:0x03c1, B:75:0x03c5, B:77:0x03cb, B:81:0x03e4, B:83:0x03f2, B:98:0x0432, B:100:0x043e, B:102:0x0442, B:105:0x0448, B:107:0x0456, B:117:0x0476, B:119:0x04a7, B:109:0x045a, B:111:0x0460, B:114:0x0467, B:85:0x03f6, B:87:0x03fc, B:89:0x0402, B:91:0x0408, B:93:0x041e, B:95:0x0425, B:124:0x04d2, B:126:0x04e0, B:130:0x04f9, B:133:0x050b, B:136:0x0513, B:137:0x051a, B:139:0x0539, B:142:0x0556, B:144:0x055c, B:146:0x0566, B:149:0x058e, B:131:0x04fd, B:59:0x0345, B:31:0x0181, B:36:0x021e, B:40:0x0227, B:42:0x022b, B:44:0x0306, B:43:0x02a4, B:39:0x0224, B:19:0x010d, B:21:0x0115), top: B:157:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x013b A[Catch: all -> 0x05bb, TryCatch #0 {, blocks: (B:4:0x0003, B:6:0x006f, B:8:0x0077, B:10:0x0083, B:13:0x00d5, B:15:0x00db, B:17:0x00ff, B:22:0x013b, B:23:0x0153, B:26:0x016c, B:28:0x017b, B:32:0x0184, B:34:0x01fd, B:35:0x0213, B:45:0x0309, B:47:0x031b, B:49:0x0323, B:51:0x0331, B:55:0x033c, B:65:0x0352, B:68:0x03a5, B:70:0x03ad, B:71:0x03b8, B:73:0x03c1, B:75:0x03c5, B:77:0x03cb, B:81:0x03e4, B:83:0x03f2, B:98:0x0432, B:100:0x043e, B:102:0x0442, B:105:0x0448, B:107:0x0456, B:117:0x0476, B:119:0x04a7, B:109:0x045a, B:111:0x0460, B:114:0x0467, B:85:0x03f6, B:87:0x03fc, B:89:0x0402, B:91:0x0408, B:93:0x041e, B:95:0x0425, B:124:0x04d2, B:126:0x04e0, B:130:0x04f9, B:133:0x050b, B:136:0x0513, B:137:0x051a, B:139:0x0539, B:142:0x0556, B:144:0x055c, B:146:0x0566, B:149:0x058e, B:131:0x04fd, B:59:0x0345, B:31:0x0181, B:36:0x021e, B:40:0x0227, B:42:0x022b, B:44:0x0306, B:43:0x02a4, B:39:0x0224, B:19:0x010d, B:21:0x0115), top: B:157:0x0003 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized void q(defpackage.chyz r29) {
        /*
            Method dump skipped, instructions count: 1470
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ckkj.q(chyz):void");
    }

    final void r(String str, String str2) {
        ((eksl) ((eksl) a.h()).h("com/google/android/apps/messaging/shared/rcsprovisioning/trigger/RcsProvisioningTriggerImpl", "handleReprovisionCampaign", 956, "RcsProvisioningTriggerImpl.java")).D("RcsProvisioningTrigger: handleReprovisionCampaign with simId = %s, reprovisionCampaignId = %s", dhiz.SIM_ID.c(str), str2);
        ((ckhg) this.c.b()).h(str, enxe.REPROVISIONING_CAMPAIGN, true);
        this.h.j(str, str2);
    }

    @Override // defpackage.cldv
    public final void s(Intent intent) {
        Optional optionalEmpty;
        eksp ekspVar = a;
        ((eksl) ((eksl) ekspVar.h()).h("com/google/android/apps/messaging/shared/rcsprovisioning/trigger/RcsProvisioningTriggerImpl", "onConfigSms", 1872, "RcsProvisioningTriggerImpl.java")).q("RcsProvisioningTrigger: onConfigSms");
        if (dfog.C()) {
            dgrf dgrfVar = this.w;
            ckjt ckjtVar = this.Q;
            ((eosc) dgrfVar.a.b()).getClass();
            dhes dhesVar = (dhes) dgrfVar.b.b();
            dhesVar.getClass();
            dgrs dgrsVar = (dgrs) dgrfVar.c.b();
            dgrsVar.getClass();
            ckjtVar.getClass();
            dgre dgreVar = new dgre(dhesVar, dgrsVar, ckjtVar);
            int iMax = Math.max(intent.getIntExtra("subscription", -1), -1);
            if (iMax < 0) {
                ((eksl) ((eksl) ekspVar.j()).h("com/google/android/apps/messaging/shared/rcsprovisioning/trigger/RcsProvisioningTriggerImpl", "getSubIdFromIntent", 1865, "RcsProvisioningTriggerImpl.java")).q("RcsProvisioningTrigger: invalid subId in the intent.");
            }
            cmlb cmlbVar = this.m;
            cmmh cmmhVar = (cmmh) cmlbVar.i(iMax).orElse(null);
            if (cmmhVar != null) {
                dgreVar.b(((dgtg) this.k.b()).b(cmmhVar.c));
            } else {
                ((eksl) ((eksl) ekspVar.j()).h("com/google/android/apps/messaging/shared/rcsprovisioning/trigger/RcsProvisioningTriggerImpl", "onConfigSms", 1886, "RcsProvisioningTriggerImpl.java")).r("RcsProvisioningTrigger: no SimSubscriptionInfo found for subId %s in the intent.", iMax);
                dgreVar.b(((dgtg) this.k.b()).a());
            }
            Context context = this.s;
            dgreVar.d(context, intent);
            ((eksl) ((eksl) ekspVar.h()).h("com/google/android/apps/messaging/shared/rcsprovisioning/trigger/RcsProvisioningTriggerImpl", "onConfigSms", 1892, "RcsProvisioningTriggerImpl.java")).q("RcsProvisioningTrigger: completed processSmsIntent.");
            if (dfpi.z()) {
                Optional optionalI = cmlbVar.i(iMax);
                ((eksl) ((eksl) ekspVar.h()).h("com/google/android/apps/messaging/shared/rcsprovisioning/trigger/RcsProvisioningTriggerImpl", "onConfigSms", 1897, "RcsProvisioningTriggerImpl.java")).t("RcsProvisioningTrigger: simSubscriptionInfo: %s", cmmhVar);
                if (optionalI.isEmpty()) {
                    ((eksl) ((eksl) ekspVar.j()).h("com/google/android/apps/messaging/shared/rcsprovisioning/trigger/RcsProvisioningTriggerImpl", "onConfigSms", 1899, "RcsProvisioningTriggerImpl.java")).r("RcsProvisioningTrigger: no SimSubscriptionInfo found for subId %s in the intent.", iMax);
                    return;
                }
                optionalEmpty = Optional.of(((cmmh) optionalI.get()).c);
            } else {
                optionalEmpty = Optional.empty();
            }
            Optional optional = optionalEmpty;
            dgrd dgrdVar = this.x;
            ckju ckjuVar = this.R;
            Context context2 = (Context) dgrdVar.a.b();
            context2.getClass();
            ckjuVar.getClass();
            ((eosc) dgrdVar.b.b()).getClass();
            deyo deyoVar = (deyo) dgrdVar.c.b();
            deyoVar.getClass();
            dgtg dgtgVar = (dgtg) dgrdVar.d.b();
            dgtgVar.getClass();
            cebq cebqVar = (cebq) dgrdVar.e.b();
            cebqVar.getClass();
            final dgrc dgrcVar = new dgrc(context2, ckjuVar, deyoVar, dgtgVar, cebqVar, optional);
            optional.ifPresentOrElse(new Consumer() { // from class: ckkg
                @Override // java.util.function.Consumer
                /* renamed from: accept */
                public final void z(Object obj) {
                    dgrcVar.b(((dgtg) this.a.k.b()).b((String) obj));
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            }, new Runnable() { // from class: ckkh
                @Override // java.lang.Runnable
                public final void run() {
                    ((eksl) ((eksl) ckkj.a.j()).h("com/google/android/apps/messaging/shared/rcsprovisioning/trigger/RcsProvisioningTriggerImpl", "onConfigSms", 1913, "RcsProvisioningTriggerImpl.java")).q("No sim id to register OTP SMS port. Using default port.");
                    dgrcVar.a();
                }
            });
            dgrcVar.d(context, intent);
        }
    }

    public final void t(String str, int i, int i2) {
        eksp ekspVar = a;
        ((eksl) ((eksl) ekspVar.h()).h("com/google/android/apps/messaging/shared/rcsprovisioning/trigger/RcsProvisioningTriggerImpl", "onOtpSms", 410, "RcsProvisioningTriggerImpl.java")).q("RcsProvisioningTrigger: onOtpSms");
        this.g.b(enxe.OTP_SMS_RECEIVED);
        cjtx cjtxVar = (cjtx) cjty.a.createBuilder();
        cjtxVar.copyOnWrite();
        cjty cjtyVar = (cjty) cjtxVar.instance;
        str.getClass();
        cjtyVar.b |= 1;
        cjtyVar.c = str;
        cjtxVar.copyOnWrite();
        cjty cjtyVar2 = (cjty) cjtxVar.instance;
        cjtyVar2.b |= 2;
        cjtyVar2.d = i;
        cjtxVar.copyOnWrite();
        cjty cjtyVar3 = (cjty) cjtxVar.instance;
        cjtyVar3.b |= 4;
        cjtyVar3.e = i2;
        evvp evvpVarA = cssu.a(this.z.f().toEpochMilli());
        cjtxVar.copyOnWrite();
        cjty cjtyVar4 = (cjty) cjtxVar.instance;
        evvpVarA.getClass();
        cjtyVar4.f = evvpVarA;
        cjtyVar4.b |= 8;
        cjty cjtyVar5 = (cjty) cjtxVar.build();
        try {
            String str2 = ((cmmh) this.m.i(i).orElseThrow()).c;
            ((eksl) ((eksl) ekspVar.h()).h("com/google/android/apps/messaging/shared/rcsprovisioning/trigger/RcsProvisioningTriggerImpl", "onOtpSms", 431, "RcsProvisioningTriggerImpl.java")).B("RcsProvisioningTrigger: onOtpSms with simId: %s and subId: %s", dhiz.SIM_ID.c(str2), i);
            this.h.f(dhhe.g("provisioning_otp_sms", str2), cjtyVar5).k(auvh.b(), eoqg.a);
            fcsu fcsuVar = this.A;
            if (((dgnq) fcsuVar.b()).a()) {
                ((dgnq) fcsuVar.b()).a.b(cjtyVar5);
            } else {
                ((ckhg) this.c.b()).m(str2, Duration.ZERO, 2, enxe.OTP_SMS_RECEIVED);
            }
        } catch (NoSuchElementException unused) {
            ((eksl) ((eksl) a.h()).h("com/google/android/apps/messaging/shared/rcsprovisioning/trigger/RcsProvisioningTriggerImpl", "onOtpSms", 426, "RcsProvisioningTriggerImpl.java")).r("RcsProvisioningTrigger: no SimSubscriptionInfo found for subId %s in the OTP.", i);
        }
    }

    @Override // defpackage.devu
    public final void u() {
        ((eksl) ((eksl) a.h()).h("com/google/android/apps/messaging/shared/rcsprovisioning/trigger/RcsProvisioningTriggerImpl", "onSystemBound", 571, "RcsProvisioningTriggerImpl.java")).q("RcsProvisioningTrigger: System bound to :rcs process. Schedule provisioning.");
        chzz chzzVar = this.g;
        enxe enxeVar = enxe.RCS_SYSTEM_BINDING;
        chzzVar.b(enxeVar);
        w(ewjm.TRIGGER_SYSTEM_BINDING_ON_CREATE, enxeVar);
    }

    public final void v(dggp dggpVar, int i, enxe enxeVar) {
        dhki dhkiVarA = this.B.a(i);
        if (!Objects.equals(dhkiVarA, dhki.DUAL_REG)) {
            ((eksl) ((eksl) a.h()).h("com/google/android/apps/messaging/shared/rcsprovisioning/trigger/RcsProvisioningTriggerImpl", "restartProvisioningForSimId", 1306, "RcsProvisioningTriggerImpl.java")).t("RcsProvisioningTrigger: SipConnectionType: %s, Skipping restartProvisioning.", dhkiVarA.name());
            return;
        }
        ((ckhg) this.c.b()).d(dggpVar, enxeVar).k(auvh.b(), this.e);
    }

    public final void w(ewjm ewjmVar, enxe enxeVar) {
        ((eksl) ((eksl) a.h()).h("com/google/android/apps/messaging/shared/rcsprovisioning/trigger/RcsProvisioningTriggerImpl", "scheduleProvisioningForEligibleSims", 1222, "RcsProvisioningTriggerImpl.java")).q("scheduleProvisioningForEligibleSims");
        this.l.d(ewjmVar, enxeVar);
    }

    public final void x(dggn dggnVar, chyx chyxVar) {
        ((eksl) ((eksl) a.h()).h("com/google/android/apps/messaging/shared/rcsprovisioning/trigger/RcsProvisioningTriggerImpl", "updateRcsAvailabilityForProvisioningId", 1164, "RcsProvisioningTriggerImpl.java")).I("RcsProvisioningTrigger: updateRcsAvailabilityForProvisioningId : rcsProvisioningId = %s hint = %s, logTriggerEvent = %s ", dhiz.SIM_ID.c(dggnVar), chyxVar, true);
        this.g.b(p(chyxVar));
        ((chza) ((cqbm) this.d.b()).a()).p(dggnVar, chyxVar);
    }

    public final eiju z(final dggp dggpVar, final int i, final chyx chyxVar) {
        return !dfog.C() ? eijx.e(null) : eijx.h(new eooy() { // from class: ckjl
            @Override // defpackage.eooy
            public final ListenableFuture a() {
                eksl ekslVar = (eksl) ((eksl) ckkj.a.h()).h("com/google/android/apps/messaging/shared/rcsprovisioning/trigger/RcsProvisioningTriggerImpl", "handleTachyonReprovisionErrorForSim", 1286, "RcsProvisioningTriggerImpl.java");
                dhiz dhizVar = dhiz.SIM_ID;
                dggp dggpVar2 = dggpVar;
                String strC = dhizVar.c(dggpVar2);
                String str = i != 1 ? "TACHYGRAM" : "TACHYON_REGISTRATION";
                chyx chyxVar2 = chyxVar;
                ckkj ckkjVar = this.a;
                ekslVar.I("Tachyon error re-provision received for simId %s, at %s due to %s. Restarting provisioning", strC, str, chyxVar2.name());
                ((dgrs) ckkjVar.f.b()).C(dggpVar2.a);
                ckkjVar.x(dggpVar2, chyxVar2);
                return eorv.a;
            }
        }, this.e).i(new eooz() { // from class: ckjm
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                return this.a.l.a(dggpVar, enxe.TACHYON_REPROVISION_ERROR);
            }
        }, eoqg.a);
    }
}
