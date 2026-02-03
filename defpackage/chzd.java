package defpackage;

import android.content.Context;
import android.content.IntentFilter;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class chzd implements chza, dfno {
    private static final cqce d = cqce.g("Bugle", "RcsAvailabilityUtilForProvisioningEngineV2");
    protected Context b;
    volatile chyd c;
    private final eosc f;
    private final cqdx g;
    private final dhhr h;
    private final chyy i;
    protected boolean a = false;
    private final chze e = new chze();

    public chzd(Context context, fcsu fcsuVar, fcsu fcsuVar2, eosc eoscVar, fcsu fcsuVar3, cqdx cqdxVar) {
        this.b = context;
        this.c = (chyd) fcsuVar2.b();
        this.f = eoscVar;
        this.g = cqdxVar;
        final dhhr dhhrVar = new dhhr();
        this.h = dhhrVar;
        chyy chyyVar = new chyy() { // from class: chzb
            @Override // defpackage.chyy
            public final void c(chyz chyzVar) {
                dhhrVar.b(chyzVar);
            }
        };
        this.i = chyyVar;
        this.c.f(chyyVar);
        Iterator it = ((Set) fcsuVar3.b()).iterator();
        while (it.hasNext()) {
            this.h.a(y((chyy) it.next(), this.f));
        }
        ((ccyw) fcsuVar.b()).c(this);
    }

    private static dhhq y(chyy chyyVar, Executor executor) {
        dhhp dhhpVarF = dhhq.f(new chzc(chyyVar), executor);
        dhhpVarF.b(chyyVar);
        dhhpVarF.c(false);
        return dhhpVarF.a();
    }

    private static String z(elsf elsfVar) {
        switch (elsfVar) {
            case UNKNOWN_UNINITIALIZED_REASON:
                return "WAITING FOR ENGINE TO CONNECT";
            case UNINITIALIZED_REASON_NO_FAILURE:
                return "NO_AVAILABILITY_FAILURE";
            case UNINITIALIZED_REASON_INTERRUPTED:
                return "INTERRUPTED";
            case UNINITIALIZED_REASON_DISCONNECTED:
                return "DISCONNECTED";
            case UNINITIALIZED_REASON_ENGINE_EXCEPTION:
                return "ENGINE_EXCEPTION";
            case UNINITIALIZED_REASON_RUNNABLE_EXCEPTION:
                return "RUNNABLE_EXCEPTION";
            case UNINITIALIZED_REASON_WEAR:
                return "WEAR";
            case UNINITIALIZED_REASON_INVALID_REGISTRATION:
                return "INVALID_REGISTRATION";
            case UNINITIALIZED_REASON_CONNECTION_TIMEOUT:
                return "TIMEOUT";
            default:
                return "UNKNOWN(" + elsfVar.j + ")";
        }
    }

    @Override // defpackage.chza
    public final eiju a(chyx chyxVar) {
        cqbd cqbdVarC = d.c();
        cqbdVarC.I("updateAvailabilityForAllSimsAsync");
        cqbdVarC.A("hint", chyxVar);
        cqbdVarC.r();
        return this.c.a(chyxVar);
    }

    @Override // defpackage.chza
    public final eiju b(dggn dggnVar, chyx chyxVar) {
        cqbd cqbdVarC = d.c();
        cqbdVarC.I("updateAvailabilityForRcsProvisioningIdAsync");
        cqbdVarC.A("hint", chyxVar);
        cqbdVarC.r();
        return this.c.b(dggnVar, chyxVar);
    }

    @Override // defpackage.chza
    public final elsf c() {
        return elsf.UNKNOWN_UNINITIALIZED_REASON;
    }

    @Override // defpackage.chza
    public final enwr d() {
        return this.c.c();
    }

    @Override // defpackage.chza
    public final enwr e(String str) {
        return this.c.d(str);
    }

    @Override // defpackage.chza
    public final enwr f(int i) {
        return this.c.e(i);
    }

    @Override // defpackage.chza
    public final String g(enwr enwrVar, elsf elsfVar) {
        switch (enwrVar) {
            case INVALID_PRE_KOTO:
                return "This device is pre-Koto";
            case BUGLE_LOADING_AVAILABILITY_IN_PROGRESS:
                return "RCS state is pending. Check back in a moment. ".concat(z(elsfVar));
            case DISABLED_VIA_GSERVICES:
                return "RCS is disabled for this carrier by Google";
            case DOGFOOD_SETUP_PENDING:
                return "Dogfood RCS is not set up";
            case DISABLED_FROM_PREFERENCES:
                return "You turned off RCS. Turn it back on in settings";
            case DISABLED_NOT_DEFAULT_SMS_APP:
                return "We aren't the default SMS app";
            case DISABLED_REMOTELY:
                return "The carrier disabled this device remotely";
            case AVAILABLE:
                return "RCS is setup";
            case DISABLED_OLD_RCS_SERVICE_VERSION:
                return "RCS service version is old";
            case DISABLED_SIM_ABSENT:
                return "RCS is disabled due to SIM absent";
            case CARRIER_SETUP_PENDING:
                return "Carrier RCS is not set up";
            case DISABLED_MULTI_SLOT_DEVICE:
                return "RCS shouldn't be disabled when MSIM M3 is enabled. Please file a bug.";
            case DISABLED_FOR_FI:
            default:
                return "RcsAvailabilityUtil returned an invalid state! This is a bug!";
            case BUGLE_LOADING_AVAILABILITY_EXCEPTION:
                return "There was an error retrieving current RCS state: ".concat(z(elsfVar));
            case DISABLED_LEGACY_CLIENT_ENABLED:
                return "RCS is disabled because third-party RCS client is enabled";
            case DISABLED_NO_PERMISSIONS:
                return "RCS is disabled because it doesn't have phone permission";
            case CARRIER_TERMS_AND_CONDITIONS_ACCEPTANCE_PENDING:
                return "Carrier RCS is setup, waiting for T&C acceptance";
            case DOGFOOD_TERMS_AND_CONDITIONS_ACCEPTANCE_PENDING:
                return "Dogfood RCS is setup, waiting for T&C acceptance";
            case DISABLED_TERMS_AND_CONDITIONS_REJECTED:
                return "RCS is disabled due to user rejection of T&Cs";
            case SUBJECT_TO_BATTERY_OPTIMIZATIONS:
                return "RCS services can't run in the background";
            case UNKNOWN_PEV2_DISABLED:
                return "Availability is unobtainable from this source because PEv2 is disabled";
            case DISABLED_WAITING_FOR_PHENOTYPE:
                return "RCS is disabled, waiting for phenotype to update";
            case DISABLED_STUB_PROVISIONING_ENGINE:
                return "Availability request was done on a stub implementation of the provisioning engine.";
            case DISABLED_VIA_FLAGS:
                return "RCS has been disabled via flags.";
            case DISABLED_BY_EMM:
                return "RCS has been disabled by EMM. go/rcs-disable-via-emm";
            case DISABLED_FOR_SECONDARY_USER:
                return "RCS is disabled for the secondary user.";
            case DISABLED_VIA_RCS_CONFIG_CHAT_AUTH:
                return "RCS chatAuth support is disabled in the IMS configuration";
            case DISABLED_BY_PROVISIONING_RULE:
                return "RCS is disabled by provisioning rule";
            case DISABLED_FOR_WEAR:
                return "RCS is disabled for a Wear OS device that does not support RCS";
            case DISABLED_AUTOMATIC_PROVISIONING_RULE:
                return "RCS is disabled by default via provisioning rule. User must manually enable RCS from Settings.";
            case DISABLED_BY_CONFIG_VERSION_ZERO_POSITIVE_VALIDITY:
                return "RCS is disabled because the configuration has version = 0, and validity seconds > 0";
            case DISABLED_BY_CONFIG_VERSION_CARRIER:
                return "RCS is disabled because the carrier indicated the user is ineligible for RCS";
            case DISABLED_BY_CONFIG_VERSION_APP_VERSION:
                return "RCS is disabled because the provisioning device has too low of an App version for RCS";
            case DISABLED_BY_CONFIG_VERSION_PERMANENT:
                return "RCS is disabled because the configuration indicates the user or device is permanently banned";
            case DISABLED_BY_CONFIG_VERSION_AWAITING_INPUT:
                return "RCS is disabled because the configuration indicates awaiting user input";
            case DISABLED_BY_CONFIG_VERSION_ATTESTATION_FAILURE:
                return "RCS is disabled because the configuration indicates an attestation failure for this user or device";
            case DISABLED_BY_CONFIG_VERSION_OTHER:
                return "RCS is disabled because the configuration has an invalid version number";
            case DISABLED_BY_CONFIG_VERSION_VENDOR_NOT_SUPPORTED:
                return "RCS is disabled because the configuration indicates the app vendor is not supported";
            case DISABLED_NOT_DEFAULT_SIM:
                return "RCS is disabled because the sim is not the default sim.";
        }
    }

    @Override // defpackage.chza
    public final void h(chyy chyyVar) {
        i(chyyVar, this.g);
    }

    @Override // defpackage.chza
    public final void i(chyy chyyVar, Executor executor) {
        this.h.a(y(chyyVar, executor));
    }

    @Override // defpackage.chza
    public final void j() {
        if (this.a) {
            return;
        }
        this.b.registerReceiver(this.e, new IntentFilter("android.intent.action.ACTION_SHUTDOWN"));
        this.a = true;
    }

    @Override // defpackage.chza
    public final void l(chyy chyyVar) {
        this.h.d(chyyVar);
    }

    @Override // defpackage.chza
    public final void m() {
        this.c.g();
    }

    @Override // defpackage.chza
    public final void n(chyx chyxVar) {
        cqbd cqbdVarC = d.c();
        cqbdVarC.I("updateRcsAvailability");
        cqbdVarC.A("hint", chyxVar);
        cqbdVarC.r();
        this.c.j(chyxVar);
    }

    @Override // defpackage.chza
    @Deprecated
    public final void o(chyx chyxVar) {
        cqbd cqbdVarC = d.c();
        cqbdVarC.I("updateAvailabilityAsync");
        cqbdVarC.A("hint", chyxVar);
        cqbdVarC.r();
        this.c.h(chyxVar);
    }

    @Override // defpackage.dfno
    public final void onCsLibPhenotypeUpdated() {
        cqbd cqbdVarC = d.c();
        cqbdVarC.I("onCsLibPhenotypeUpdated");
        cqbdVarC.r();
    }

    @Override // defpackage.chza
    public final void p(dggn dggnVar, chyx chyxVar) {
        this.c.i(dggnVar, chyxVar);
    }

    @Override // defpackage.chza
    public final boolean q() {
        return d() == enwr.AVAILABLE;
    }

    @Override // defpackage.chza
    public final boolean r() {
        return d() == enwr.DISABLED_FROM_PREFERENCES;
    }

    @Override // defpackage.chza
    @Deprecated
    public final boolean s() {
        int iOrdinal = d().ordinal();
        if (iOrdinal != 1 && iOrdinal != 6 && iOrdinal != 10 && iOrdinal != 13 && iOrdinal != 21) {
            switch (iOrdinal) {
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                    break;
                default:
                    return false;
            }
        }
        return true;
    }

    @Override // defpackage.chza
    public final int t() {
        return 5;
    }

    @Override // defpackage.chza
    public final enwr u(dggn dggnVar) {
        return this.c.n(dggnVar);
    }

    @Override // defpackage.chza
    public final enwr v(dggn dggnVar) {
        return this.c.k(dggnVar);
    }

    @Override // defpackage.chza
    @Deprecated
    public final enwr w() {
        return this.c.l();
    }

    @Override // defpackage.chza
    public final void x() {
        this.c.m();
    }

    @Override // defpackage.chza
    public final void k() {
    }
}
