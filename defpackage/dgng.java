package defpackage;

import android.app.BroadcastOptions;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Message;
import android.text.TextUtils;
import android.util.Base64;
import androidx.car.app.hardware.common.CarZone;
import androidx.car.app.navigation.model.Maneuver;
import com.sun.jna.Function;
import j$.time.Duration;
import j$.util.Collection;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import j$.util.function.Function$CC;
import j$.util.function.Predicate$CC;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import java.util.function.Consumer;
import java.util.function.Predicate;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dgng {
    public static final dfny a = dfnv.b("enable_available_msisdn_source_logging");
    public static final dfny b = dfnv.b("enable_broadcast_phone_number_input_request_for_testing");
    public static final dfny c = dfnv.b("crash_on_unexpected_message_code");
    public static final dfny d = dfnv.b("use_retry_after_header_to_schedule_retry");
    public static final ekrg e = ekrg.c("com/google/android/ims/provisioning/engine/ProvisioningEngineStateMachine");
    public static final Duration f = Duration.ofDays(30);
    public final dgjo A;
    public final dgnt B;
    public final dgnq C;
    public final dgjz D;
    public final dgkh E;
    public final dgjy F;
    public final boolean G;
    public cmmh H;
    public final cmlb I;
    public Optional J;
    public final diep K;
    public final fcsu L;
    public final fcsu M;
    public final boolean N;
    public final fcsu O;
    public final dfnb P;
    public final dgom Q;
    public final fcsu R;
    public final fcsu S;
    public final fcsu T;
    public final fcsu U;
    public final fcsu V;
    public enxe W;
    public String X;
    public final cebq Y;
    public final fcsu Z;
    final dgmn aA;
    final dgmn aB;
    final dgmn aC;
    final dglv aD;
    public final dgjp aE;
    public final dgjq aF;
    private final dgnm aG;
    private final dgtg aH;
    private final cqbm aI;
    private final Optional aJ;
    private final cqbm aK;
    private final cebf aL;
    private final fcsu aM;
    private final fcsu aN;
    public final Optional aa;
    public final fcsu ab;
    public final fcsu ac;
    public final Optional ad;
    final dgmn ae;
    final dgmn af;
    final dgmn ag;
    final dgmn ah;
    final dgmn ai;
    final dgmq aj;
    final dgmb ak;
    final dgmn al;
    final dgmn am;
    final dgmn an;
    final dgmn ao;
    final dgmn ap;
    final dgmn aq;
    final dgmn ar;
    final dgmn as;
    final dgmn at;
    final dgmn au;
    final dgmn av;
    final dgmn aw;
    final dgmn ax;
    final dgmn ay;
    final dgmn az;
    final Map g;
    public final String h;
    public final int i;
    public final String j;
    public int k;
    public String l;
    public final Context m;
    public final deyo n;
    public final Optional o;
    public final dgkn p;
    public final dgnj q;
    public final dheq r;
    public final dgkj s;
    public final Optional t;
    public final dgrs u;
    public final dgsy v;
    public final eosc w;
    public final crmx x;
    public final dgiv y;
    public dgke z;

    public dgng(Context context, deyo deyoVar, dgnm dgnmVar, Optional optional, dgkn dgknVar, dgnj dgnjVar, dheq dheqVar, dgkj dgkjVar, Optional optional2, dgrs dgrsVar, dgsy dgsyVar, eosc eoscVar, crmx crmxVar, dgtg dgtgVar, dcdt dcdtVar, crny crnyVar, dgiv dgivVar, dgjo dgjoVar, dgjp dgjpVar, dgnt dgntVar, dgnq dgnqVar, cqbm cqbmVar, Optional optional3, dgjz dgjzVar, dgkh dgkhVar, dgjy dgjyVar, boolean z, Optional optional4, cmlb cmlbVar, dgjq dgjqVar, cqbm cqbmVar2, cebq cebqVar, cebf cebfVar, fdjx fdjxVar, fcyh fcyhVar, eosc eoscVar2, dejx dejxVar, diep diepVar, fcsu fcsuVar, fcsu fcsuVar2, boolean z2, fcsu fcsuVar3, fcsu fcsuVar4, fcsu fcsuVar5, fcsu fcsuVar6, fcsu fcsuVar7, fcsu fcsuVar8, fcsu fcsuVar9, fcsu fcsuVar10, Optional optional5, Optional optional6, fcsu fcsuVar11, fcsu fcsuVar12, fcsu fcsuVar13, fcsu fcsuVar14) {
        dglx dglxVar;
        cmmh cmmhVar;
        HashMap map = new HashMap();
        this.g = map;
        this.k = 0;
        this.W = enxe.UNDEFINED_TRIGGER_EVENT;
        this.X = "";
        dgli dgliVar = new dgli(this);
        this.ae = dgliVar;
        dglg dglgVar = new dglg(this);
        this.af = dglgVar;
        dglb dglbVar = new dglb(this);
        this.ag = dglbVar;
        dglr dglrVar = new dglr(this);
        this.ah = dglrVar;
        dglo dgloVar = new dglo(this);
        this.ai = dgloVar;
        dgmq dgmqVar = new dgmq(this);
        this.aj = dgmqVar;
        dgmb dgmbVar = new dgmb(this);
        this.ak = dgmbVar;
        dglx dglxVar2 = new dglx(this);
        this.al = dglxVar2;
        dgmg dgmgVar = new dgmg(this);
        this.am = dgmgVar;
        dgls dglsVar = new dgls(this);
        this.an = dglsVar;
        dgnb dgnbVar = new dgnb(this);
        this.ao = dgnbVar;
        dgms dgmsVar = new dgms(this);
        this.ap = dgmsVar;
        dgmf dgmfVar = new dgmf(this);
        this.aq = dgmfVar;
        dgme dgmeVar = new dgme(this);
        this.ar = dgmeVar;
        dglw dglwVar = new dglw(this);
        this.as = dglwVar;
        dgle dgleVar = new dgle(this);
        this.at = dgleVar;
        dgly dglyVar = new dgly(this);
        this.au = dglyVar;
        dgmx dgmxVar = new dgmx(this);
        this.av = dgmxVar;
        dgnf dgnfVar = new dgnf(this);
        this.aw = dgnfVar;
        dglp dglpVar = new dglp(this);
        this.ax = dglpVar;
        dgna dgnaVar = new dgna(this);
        this.ay = dgnaVar;
        dgmk dgmkVar = new dgmk(this);
        this.az = dgmkVar;
        dgll dgllVar = new dgll(this);
        this.aA = dgllVar;
        dgnd dgndVar = new dgnd(this);
        this.aB = dgndVar;
        dgmv dgmvVar = new dgmv(this);
        this.aC = dgmvVar;
        dglv dglvVar = new dglv(this);
        this.aD = dglvVar;
        this.m = context;
        this.n = deyoVar;
        this.aG = dgnmVar;
        this.o = optional;
        this.p = dgknVar;
        this.q = dgnjVar;
        this.r = dheqVar;
        this.T = fcsuVar6;
        this.U = fcsuVar7;
        this.V = fcsuVar8;
        if (z) {
            cmmh cmmhVar2 = (cmmh) optional4.orElseThrow();
            this.H = cmmhVar2;
            dglxVar = dglxVar2;
            this.h = cmmhVar2.c;
            this.i = cmmhVar2.d;
            this.j = cmmhVar2.f;
        } else {
            dglxVar = dglxVar2;
            this.h = dheqVar.f();
            this.i = dheqVar.b();
            this.j = dheqVar.e();
        }
        this.s = dgkjVar;
        this.t = optional2;
        this.u = dgrsVar;
        this.v = dgsyVar;
        this.w = eoscVar;
        this.x = crmxVar;
        this.aH = dgtgVar;
        this.J = Optional.empty();
        this.y = dgivVar;
        this.A = dgjoVar;
        this.aE = dgjpVar;
        this.B = dgntVar;
        this.L = fcsuVar;
        this.M = fcsuVar2;
        this.ab = fcsuVar11;
        this.ac = fcsuVar12;
        this.aN = fcsuVar13;
        this.l = ((dgsz) fcsuVar.b()).k(this.h);
        Optional optionalOfNullable = Optional.ofNullable((!z || (cmmhVar = this.H) == null) ? null : cmmhVar.p);
        cmmb cmmbVarA = cmlbVar.a();
        this.z = new dgke(this.l, Optional.of(new dgkd(optionalOfNullable, this.i, this.h.equals(cmmbVarA.c), this.h.equals(cmmbVarA.d), this.h.equals(cmmbVarA.e))));
        if (fdjxVar == null) {
            throw new NullPointerException("Null blockingScope");
        }
        if (fcyhVar == null) {
            throw new NullPointerException("Null blockingContext");
        }
        dfmk dfmkVar = (dfmk) fcsuVar14.b();
        if (dfmkVar == null) {
            throw new NullPointerException("Null removeContextsFromPrivateSuspendsInSmv2");
        }
        dgoq dgoqVar = new dgoq(fdjxVar, fcyhVar, dfmkVar, dgliVar, dglgVar, dglbVar, dglrVar, dgloVar, dgmqVar, dgmbVar, dglxVar, dgmgVar, dglsVar, dgnbVar, dgmsVar, dgmfVar, dgmeVar, dglwVar, dgleVar, dglyVar, dgmxVar, dgnfVar, dglpVar, dgnaVar, dgmkVar, dgllVar, dgndVar, dgmvVar, dglvVar);
        dglx dglxVar3 = dglxVar;
        ekgi ekgiVar = new ekgi();
        ewrp ewrpVar = ewrp.RCS_PROVISIONING_ENABLED_STATE;
        ekgiVar.i(ewrpVar, dgoqVar.e);
        ekgiVar.i(ewrp.RCS_PROVISIONING_DISABLED_STATE, dgoqVar.f);
        ewrp ewrpVar2 = ewrp.RCS_PROVISIONING_CHECK_PRECONDITIONS_STATE;
        ekgiVar.i(ewrpVar2, dgoqVar.g);
        ewrp ewrpVar3 = ewrp.RCS_PROVISIONING_READY_STATE;
        ekgiVar.i(ewrpVar3, dgoqVar.h);
        ewrp ewrpVar4 = ewrp.RCS_PROVISIONING_IN_PROGRESS_STATE;
        ekgiVar.i(ewrpVar4, dgoqVar.i);
        ewrp ewrpVar5 = ewrp.RCS_PROVISIONING_VERIFY_MSISDN_STATE;
        ekgiVar.i(ewrpVar5, dgoqVar.j);
        ewrp ewrpVar6 = ewrp.RCS_PROVISIONING_REQUEST_WITH_MSISDN_TOKEN_STATE;
        ekgiVar.i(ewrpVar6, dgoqVar.k);
        ewrp ewrpVar7 = ewrp.RCS_PROVISIONING_REQUEST_WITH_IMSI_STATE;
        ekgiVar.i(ewrpVar7, dgoqVar.l);
        ekgiVar.i(ewrp.RCS_PROVISIONING_RETRY_STATE, dgoqVar.m);
        ekgiVar.i(ewrp.RCS_PROVISIONING_REPLAY_REQUEST_STATE, dgoqVar.n);
        ewrp ewrpVar8 = ewrp.RCS_PROVISIONING_WAITING_FOR_OTP_STATE;
        ekgiVar.i(ewrpVar8, dgoqVar.o);
        ewrp ewrpVar9 = ewrp.RCS_PROVISIONING_VERIFY_OTP_STATE;
        ekgiVar.i(ewrpVar9, dgoqVar.p);
        ewrp ewrpVar10 = ewrp.RCS_PROVISIONING_REQUEST_WITHOUT_AUTH_STATE;
        ekgiVar.i(ewrpVar10, dgoqVar.q);
        ewrp ewrpVar11 = ewrp.RCS_PROVISIONING_REQUEST_WITH_TOKEN_STATE;
        ekgiVar.i(ewrpVar11, dgoqVar.r);
        ewrp ewrpVar12 = ewrp.RCS_PROVISIONING_REQUEST_WITH_HE_STATE;
        ekgiVar.i(ewrpVar12, dgoqVar.s);
        ekgiVar.i(ewrp.RCS_PROVISIONING_CONFIGURED_STATE, dgoqVar.t);
        ewrp ewrpVar13 = ewrp.RCS_PROVISIONING_REQUEST_WITH_MSISDN_STATE;
        ekgiVar.i(ewrpVar13, dgoqVar.u);
        ewrp ewrpVar14 = ewrp.RCS_PROVISIONING_WAITING_FOR_GOOGLE_TOS_STATE;
        ekgiVar.i(ewrpVar14, dgoqVar.v);
        ewrp ewrpVar15 = ewrp.RCS_PROVISIONING_WAITING_FOR_TERMS_AND_CONDITIONS_STATE;
        ekgiVar.i(ewrpVar15, dgoqVar.w);
        ewrp ewrpVar16 = ewrp.RCS_PROVISIONING_PROCESS_CONFIGURATION_STATE;
        ekgiVar.i(ewrpVar16, dgoqVar.x);
        ewrp ewrpVar17 = ewrp.RCS_PROVISIONING_WAITING_FOR_MANUAL_MSISDN_ENTRY_STATE;
        ekgiVar.i(ewrpVar17, dgoqVar.y);
        ewrp ewrpVar18 = ewrp.RCS_PROVISIONING_SET_GOOGLE_TOS_CONSENT_STATE;
        ekgiVar.i(ewrpVar18, dgoqVar.z);
        ewrp ewrpVar19 = ewrp.RCS_PROVISIONING_GET_GOOGLE_TOS_CONSENT_STATE;
        ekgiVar.i(ewrpVar19, dgoqVar.A);
        ewrp ewrpVar20 = ewrp.RCS_PROVISIONING_WAITING_FOR_RCS_DEFAULT_ON_STATE;
        ekgiVar.i(ewrpVar20, dgoqVar.B);
        ewrp ewrpVar21 = ewrp.RCS_PROVISIONING_WAITING_FOR_APP_OPEN_STATE;
        ekgiVar.i(ewrpVar21, dgoqVar.C);
        ewrp ewrpVar22 = ewrp.RCS_PROVISIONING_REQUEST_ATTESTATION_STATE;
        ekgiVar.i(ewrpVar22, dgoqVar.D);
        ekgp ekgpVarC = ekgiVar.c();
        ekgi ekgiVar2 = new ekgi();
        ekgiVar2.i(ewrpVar2, ewrpVar);
        ekgiVar2.i(ewrpVar14, ewrpVar2);
        ekgiVar2.i(ewrpVar18, ewrpVar2);
        ekgiVar2.i(ewrpVar19, ewrpVar2);
        ekgiVar2.i(ewrpVar20, ewrpVar2);
        ekgiVar2.i(ewrpVar21, ewrpVar2);
        ekgiVar2.i(ewrpVar3, ewrpVar4);
        ekgiVar2.i(ewrpVar5, ewrpVar4);
        ekgiVar2.i(ewrpVar6, ewrpVar4);
        ekgiVar2.i(ewrpVar7, ewrpVar4);
        ekgiVar2.i(ewrpVar8, ewrpVar4);
        ekgiVar2.i(ewrpVar9, ewrpVar4);
        ekgiVar2.i(ewrpVar10, ewrpVar4);
        ekgiVar2.i(ewrpVar11, ewrpVar4);
        ekgiVar2.i(ewrpVar12, ewrpVar4);
        ekgiVar2.i(ewrpVar13, ewrpVar4);
        ekgiVar2.i(ewrpVar15, ewrpVar4);
        ekgiVar2.i(ewrpVar16, ewrpVar4);
        ekgiVar2.i(ewrpVar17, ewrpVar4);
        ekgiVar2.i(ewrpVar22, ewrpVar4);
        dgom dgomVar = new dgom(ekgpVarC, ekgiVar2.c(), dgoqVar.b, dgoqVar.c, dgoqVar.d);
        this.Q = dgomVar;
        this.C = dgnqVar;
        this.aI = cqbmVar;
        this.aJ = optional3;
        this.D = dgjzVar;
        this.E = dgkhVar;
        this.F = dgjyVar;
        this.G = z;
        this.I = cmlbVar;
        this.aF = dgjqVar;
        this.aK = cqbmVar2;
        this.Y = cebqVar;
        this.aL = cebfVar;
        dfnb dgkzVar = dgomVar.n() ? new dgkz(this) : new dgla();
        this.P = dgkzVar;
        this.K = diepVar;
        this.N = z2;
        this.O = fcsuVar3;
        this.R = fcsuVar4;
        this.S = fcsuVar5;
        this.Z = fcsuVar9;
        this.aM = fcsuVar10;
        this.ad = optional5;
        this.aa = optional6;
        dhia.e(context, dheqVar, dcdtVar, crnyVar, eoscVar2, dejxVar);
        map.put("EnabledState", dgliVar);
        map.put("DisabledState", dglgVar);
        map.put("CheckPreconditionsState", dglbVar);
        map.put("InProgressState", dgloVar);
        map.put("ReadyState", dglrVar);
        map.put("VerifyMsisdnState", dgmqVar);
        map.put("RequestWithMsisdnTokenState", dgmbVar);
        map.put("RequestWithImsiState", dglxVar3);
        map.put("RetryState", dgmgVar);
        map.put("ReplayRequestState", dglsVar);
        map.put("RequestWithoutAuthState", dgmfVar);
        map.put("RequestWithTokenState", dgmeVar);
        map.put("RequestWithHeState", dglwVar);
        map.put("WaitingForOtpState", dgnbVar);
        map.put("VerifyOtpState", dgmsVar);
        map.put("ConfiguredState", dgleVar);
        map.put("RequestWithMsisdnState", dglyVar);
        map.put("WaitingForGoogleTosState", dgmxVar);
        map.put("WaitingForTermsAndConditionsState", dgnfVar);
        map.put("ProcessConfigurationState", dglpVar);
        map.put("WaitingForManualMsisdnEntryState", dgnaVar);
        map.put("SetGoogleToSConsentState", dgmkVar);
        map.put("GetGoogleToSConsentState", dgllVar);
        map.put("WaitingForRcsDefaultOnState", dgndVar);
        map.put("RequestAttestationState", dglvVar);
        if (dgomVar.n()) {
            dgkzVar.e(dgliVar);
            dgkzVar.f(dglbVar, dgliVar);
            dgkzVar.f(dgmxVar, dglbVar);
            dgkzVar.f(dgmkVar, dglbVar);
            dgkzVar.f(dgllVar, dglbVar);
            dgkzVar.f(dgndVar, dglbVar);
            dgkzVar.f(dgmvVar, dglbVar);
            dgkzVar.e(dglgVar);
            dgkzVar.e(dgloVar);
            dgkzVar.e(dgmgVar);
            dgkzVar.e(dglsVar);
            dgkzVar.e(dgleVar);
            dgkzVar.f(dglrVar, dgloVar);
            dgkzVar.f(dgmqVar, dgloVar);
            dgkzVar.f(dgmbVar, dgloVar);
            dgkzVar.f(dglxVar3, dgloVar);
            dgkzVar.f(dgnbVar, dgloVar);
            dgkzVar.f(dgmsVar, dgloVar);
            dgkzVar.f(dgmfVar, dgloVar);
            dgkzVar.f(dgmeVar, dgloVar);
            dgkzVar.f(dglwVar, dgloVar);
            dgkzVar.f(dglyVar, dgloVar);
            dgkzVar.f(dgnfVar, dgloVar);
            dgkzVar.f(dglpVar, dgloVar);
            dgkzVar.f(dgnaVar, dgloVar);
            dgkzVar.f(dglvVar, dgloVar);
        }
        this.z.a("Creating PEv2. SIM id %s", dhiz.SIM_ID.c(this.h));
        Q(dgliVar);
        String strL = ((dgsz) fcsuVar.b()).l(this.h);
        if (!TextUtils.isEmpty(strL)) {
            this.z.a("Saved provisioning state is %s", strL);
            dgmn dgmnVar = (dgmn) map.get(strL);
            if (dgmnVar != null && dgmnVar.i()) {
                this.z.a("Restoring initial state to %s", strL);
                this.l = ((dgsz) fcsuVar.b()).i(this.h);
                this.z = new dgke(this.l, Optional.empty());
                ((dgsz) fcsuVar.b()).u(this.h, false);
                ((dgsz) fcsuVar.b()).B(this.h, null);
                return;
            }
        }
        this.z.a("Setting initial state to enabled", new Object[0]);
        Q(dgliVar);
    }

    public static final dgib al(Message message) {
        dgib dgibVar;
        int i = message.what;
        if (i == -20000) {
            dgibVar = dgib.MSG_FORCE_TRANSITION_NOW;
        } else if (i == 3000) {
            dgibVar = dgib.MSG_USE_ANDROID_OS_MESSAGE;
        } else if (i == 0) {
            dgibVar = dgib.MSG_UNKNOWN_DO_NOT_USE;
        } else if (i == 1) {
            dgibVar = dgib.MSG_RCS_AVAILABILITY_UPDATED;
        } else if (i == 2) {
            dgibVar = dgib.MSG_PROVISIONING_REQUESTED;
        } else if (i == 3) {
            dgibVar = dgib.MSG_SIM_EVENT;
        } else if (i == 2000) {
            dgibVar = dgib.MSG_ARG_TRANSITION_MSG;
        } else if (i != 2001) {
            switch (i) {
                case 5:
                    dgibVar = dgib.MSG_HTTP_RESPONSE;
                    break;
                case 6:
                    dgibVar = dgib.MSG_CONSENT_GRANTED;
                    break;
                case 7:
                    dgibVar = dgib.MSG_SEND_CONFIG_REQUEST;
                    break;
                case 8:
                    dgibVar = dgib.MSG_RECEIVED_OTP;
                    break;
                case 9:
                    dgibVar = dgib.MSG_TIMEOUT;
                    break;
                case 10:
                    dgibVar = dgib.MSG_EXCEPTION_CAUGHT;
                    break;
                case 11:
                    dgibVar = dgib.MSG_RETRY_AFTER;
                    break;
                case 12:
                    dgibVar = dgib.MSG_REFRESH_CONFIG;
                    break;
                case 13:
                    dgibVar = dgib.MSG_CONFIG_DOC;
                    break;
                case 14:
                    dgibVar = dgib.MSG_RETRY_PROVISIONING;
                    break;
                case 15:
                    dgibVar = dgib.MSG_VERIFY_NUMBER_SUCCESS;
                    break;
                case 16:
                    dgibVar = dgib.MSG_VERIFY_NUMBER_FAILURE;
                    break;
                case 17:
                    dgibVar = dgib.MSG_GOOGLE_TOS_ACCEPTED;
                    break;
                default:
                    switch (i) {
                        case 19:
                            dgibVar = dgib.MSG_T_AND_C_ACCEPTED;
                            break;
                        case 20:
                            dgibVar = dgib.MSG_T_AND_C_REJECTED;
                            break;
                        case 21:
                            dgibVar = dgib.MSG_BOEW_GRANTED;
                            break;
                        case 22:
                            dgibVar = dgib.MSG_SEND_CONFIG_REQUEST_OVER_MOBILE_NETWORK;
                            break;
                        case 23:
                            dgibVar = dgib.MSG_MOBILE_NETWORK_NOT_AVAILABLE;
                            break;
                        case 24:
                            dgibVar = dgib.MSG_HTTP_IO_EXCEPTION;
                            break;
                        case 25:
                            dgibVar = dgib.MSG_MSISDN_RECEIVED;
                            break;
                        case 26:
                            dgibVar = dgib.MSG_SOCKET_TIMEOUT_EXCEPTION;
                            break;
                        case 27:
                            dgibVar = dgib.MSG_RECONFIGURATION_REQUIRED;
                            break;
                        case 28:
                            dgibVar = dgib.MSG_REPLAY_REQUEST;
                            break;
                        case 29:
                            dgibVar = dgib.MSG_OTP_TIMEOUT;
                            break;
                        case 30:
                            dgibVar = dgib.MSG_GOOGLE_TOS_DECLINED;
                            break;
                        case 31:
                            dgibVar = dgib.MSG_VERIFY_OTP;
                            break;
                        case 32:
                            dgibVar = dgib.MSG_CONFIG_DOC_DISABLE_RCS;
                            break;
                        case 33:
                            dgibVar = dgib.MSG_IMS_MODULE_TERMINATED;
                            break;
                        case 34:
                            dgibVar = dgib.MSG_IMS_DEREGISTRATION_TIMEOUT;
                            break;
                        case 35:
                            dgibVar = dgib.MSG_MO_ENABLED_FROM_PH_NUM_UI;
                            break;
                        case 36:
                            dgibVar = dgib.MSG_SET_CONSENT_API_SUCCESS;
                            break;
                        case 37:
                            dgibVar = dgib.MSG_SET_CONSENT_API_ERROR;
                            break;
                        case 38:
                            dgibVar = dgib.MSG_GET_CONSENT_API_SUCCESS;
                            break;
                        case Maneuver.TYPE_DESTINATION /* 39 */:
                            dgibVar = dgib.MSG_GET_CONSENT_API_ERROR;
                            break;
                        case 40:
                            dgibVar = dgib.MSG_SET_CONSENT_COMPLETE;
                            break;
                        case 41:
                            dgibVar = dgib.MSG_GET_CONSENT_COMPLETE;
                            break;
                        case 42:
                            dgibVar = dgib.MSG_MLS_SIGNUP_WITH_CONFIG_REFRESH;
                            break;
                        default:
                            switch (i) {
                                case 1000:
                                    dgibVar = dgib.MSG_HTTP_RESPONSE_UNKNOWN;
                                    break;
                                case 1001:
                                    dgibVar = dgib.MSG_HTTP_200_OK;
                                    break;
                                case 1002:
                                    dgibVar = dgib.MSG_HTTP_403_FORBIDDEN;
                                    break;
                                case 1003:
                                    dgibVar = dgib.MSG_HTTP_511_AUTH_REQUIRED;
                                    break;
                                case 1004:
                                    dgibVar = dgib.MSG_HTTP_503_UNAVAILABLE;
                                    break;
                                case 1005:
                                    dgibVar = dgib.MSG_HTTP_400_BAD_REQUEST;
                                    break;
                                case 1006:
                                    dgibVar = dgib.MSG_HTTP_401_UNAUTHORIZED;
                                    break;
                                case 1007:
                                    dgibVar = dgib.MSG_HTTP_429_TOO_MANY_REQUESTS;
                                    break;
                                case 1008:
                                    dgibVar = dgib.MSG_HTTP_501_NOT_SUPPORTED;
                                    break;
                                case 1009:
                                    dgibVar = dgib.MSG_HTTP_504_GATEWAY_TIMEOUT;
                                    break;
                                case 1010:
                                    dgibVar = dgib.MSG_HTTP_405_METHOD_NOT_ALLOWED;
                                    break;
                                case 1011:
                                    dgibVar = dgib.MSG_HTTP_500_INTERNAL_SERVER_ERROR;
                                    break;
                                default:
                                    switch (i) {
                                        case 2003:
                                            dgibVar = dgib.MSG_TRANSITION_TO_DISABLED;
                                            break;
                                        case 2004:
                                            dgibVar = dgib.MSG_TRANSITION_TO_CHECK_PRECONDITIONS;
                                            break;
                                        case 2005:
                                            dgibVar = dgib.MSG_TRANSITION_TO_READY;
                                            break;
                                        case 2006:
                                            dgibVar = dgib.MSG_TRANSITION_TO_IN_PROGRESS;
                                            break;
                                        case 2007:
                                            dgibVar = dgib.MSG_TRANSITION_TO_REQUEST_WITH_IMSI;
                                            break;
                                        default:
                                            switch (i) {
                                                case 2009:
                                                    dgibVar = dgib.MSG_TRANSITION_TO_RETRY;
                                                    break;
                                                case 2010:
                                                    dgibVar = dgib.MSG_TRANSITION_TO_REPLAY_REQUEST;
                                                    break;
                                                case 2011:
                                                    dgibVar = dgib.MSG_TRANSITION_TO_WAITING_FOR_CONSENT_FOR_IMSI_REQUEST;
                                                    break;
                                                case 2012:
                                                    dgibVar = dgib.MSG_TRANSITION_TO_WAITING_FOR_OTP;
                                                    break;
                                                case 2013:
                                                    dgibVar = dgib.MSG_TRANSITION_TO_VERIFY_OTP;
                                                    break;
                                                case 2014:
                                                    dgibVar = dgib.MSG_TRANSITION_TO_REQUEST_WITHOUT_AUTH;
                                                    break;
                                                case 2015:
                                                    dgibVar = dgib.MSG_TRANSITION_TO_REQUEST_WITH_TOKEN;
                                                    break;
                                                case 2016:
                                                    dgibVar = dgib.MSG_TRANSITION_TO_REQUEST_WITH_HE;
                                                    break;
                                                case 2017:
                                                    dgibVar = dgib.MSG_TRANSITION_TO_CONFIGURED;
                                                    break;
                                                case 2018:
                                                    dgibVar = dgib.MSG_TRANSITION_TO_REQUEST_WITH_MSISDN;
                                                    break;
                                                case 2019:
                                                    dgibVar = dgib.MSG_TRANSITION_TO_WAITING_FOR_GOOGLE_TOS;
                                                    break;
                                                case 2020:
                                                    dgibVar = dgib.MSG_TRANSITION_TO_WAITING_FOR_BATTERY_OPT;
                                                    break;
                                                case 2021:
                                                    dgibVar = dgib.MSG_TRANSITION_TO_WAITING_FOR_TOS;
                                                    break;
                                                case 2022:
                                                    dgibVar = dgib.MSG_TRANSITION_TO_PROCESS_CONFIGURATION;
                                                    break;
                                                case 2023:
                                                    dgibVar = dgib.MSG_TRANSITION_TO_WAITING_FOR_MANUAL_MSISDN;
                                                    break;
                                                case 2024:
                                                    dgibVar = dgib.MSG_TRANSITION_TO_SEND_DISABLE_RCS;
                                                    break;
                                                case 2025:
                                                    dgibVar = dgib.MSG_TRANSITION_TO_SET_GOOGLE_TOS_CONSENT;
                                                    break;
                                                case 2026:
                                                    dgibVar = dgib.MSG_TRANSITION_TO_GET_GOOGLE_TOS_CONSENT;
                                                    break;
                                                case 2027:
                                                    dgibVar = dgib.MSG_TRANSITION_TO_REQUEST_WITH_MSISDN_TOKEN;
                                                    break;
                                                case 2028:
                                                    dgibVar = dgib.MSG_TRANSITION_TO_VERIFY_MSISDN;
                                                    break;
                                                case 2029:
                                                    dgibVar = dgib.MSG_TRANSITION_TO_WAITING_FOR_RCS_DEFAULT_ON;
                                                    break;
                                                case 2030:
                                                    dgibVar = dgib.MSG_TRANSITION_TO_WAITING_FOR_APP_OPEN;
                                                    break;
                                                case 2031:
                                                    dgibVar = dgib.MSG_TRANSITION_TO_REQUEST_ATTESTATION;
                                                    break;
                                                default:
                                                    dgibVar = null;
                                                    break;
                                            }
                                    }
                            }
                    }
            }
        } else {
            dgibVar = dgib.MSG_TRANSITION_TO_ENABLED;
        }
        if (dgibVar != null) {
            return dgibVar;
        }
        if (!((Boolean) c.a()).booleanValue()) {
            return dgib.MSG_UNKNOWN_DO_NOT_USE;
        }
        throw new IllegalArgumentException("Invalid message code for StateMachineMessage: " + message.what);
    }

    public static final String am(dgib dgibVar) {
        switch (dgibVar.ordinal()) {
            case 3:
                return "SIM event";
            case 4:
                return "HTTP Response";
            case 5:
                return "Consent granted";
            case 6:
                return "Send config request";
            case 7:
                return "Received OTP";
            case 8:
                return "Timeout";
            case 9:
                return "Exception caught";
            case 10:
                return "Retry after";
            case 11:
                return "Refresh config";
            case 12:
                return "Config document received";
            case 13:
            case 17:
            case 19:
            case 23:
            case 25:
            case 26:
            case 28:
            case 30:
            case 33:
            case 53:
            case 71:
            case 83:
            default:
                throw new IllegalArgumentException("Unknown message");
            case 14:
                return "Verify number - success";
            case 15:
                return "Verify number - failure";
            case 16:
                return "Google ToS accepted";
            case 18:
                return "T&Cs rejected";
            case 20:
                return "Send config request over Mobile network";
            case 21:
                return "Mobile network is not available";
            case 22:
                return "HTTP IO exception while requested";
            case 24:
                return "Socket Timeout exception while requested";
            case 27:
                return "Timed out waiting for OTP";
            case 29:
                return "Verify OTP";
            case 31:
                return "Ims Module Terminated";
            case 32:
                return "Ims Deregistration Timeout";
            case 34:
                return "Set Consent API succeed";
            case 35:
                return "Set Consent API error";
            case 36:
                return "Get Consent API succeed";
            case 37:
                return "Get Consent API error";
            case 38:
                return "Set Consent complete";
            case Maneuver.TYPE_DESTINATION /* 39 */:
                return "Get Consent complete";
            case 40:
                return "MLS Signup with Config Refresh";
            case 41:
                return "Unknown HTTP response";
            case 42:
                return "HTTP 200 (OK)";
            case 43:
                return "HTTP 403 (Forbidden)";
            case 44:
                return "HTTP 511 (Auth required)";
            case 45:
                return "HTTP 503 (Unavailable)";
            case 46:
                return "HTTP 400 (Bad request)";
            case 47:
                return "HTTP 401 (Unauthorized)";
            case 48:
                return "HTTP 429 (Too many requests)";
            case Maneuver.TYPE_FERRY_TRAIN_LEFT /* 49 */:
                return "HTTP 501 (Not supported)";
            case 50:
                return "HTTP 504 (Gateway timeout)";
            case 51:
                return "HTTP 405 (Method Not Allowed)";
            case 52:
                return "HTTP 500 (Internal server error)";
            case 54:
                return "Transition to enabled";
            case 55:
                return "Transition to disabled";
            case 56:
                return "Transition to check preconditions";
            case 57:
                return "Transition to ready";
            case 58:
                return "Transition to in progress";
            case 59:
                return "Transition to request with imsi";
            case 60:
                return "Transition to retry";
            case 61:
                return "Transition to replay request";
            case 62:
                return "Transition to waiting for consent for IMSI request";
            case Function.ALT_CONVENTION /* 63 */:
                return "Transition to waiting for OTP";
            case 64:
                return "Transition to verify OTP";
            case 65:
                return "Transition to request with auth";
            case 66:
                return "Transition to request with token";
            case 67:
                return "Transition to request with HE";
            case 68:
                return "Transition to configured";
            case 69:
                return "Transition to request with MSISDN";
            case 70:
                return "Transition to waiting for Google TOS";
            case 72:
                return "Transition to waiting for TOS";
            case 73:
                return "Transition to process configuration";
            case 74:
                return "Transition to waiting for manual MSISDN entry";
            case 75:
                return "Transition to send disable rcs";
            case 76:
                return "Transition to set Google ToS Consent";
            case 77:
                return "Transition to get Google ToS Consent";
            case 78:
                return "Transition to request with MSISDN token";
            case 79:
                return "Transition to verify MSISDN";
            case CarZone.CAR_ZONE_COLUMN_DRIVER /* 80 */:
                return "Transition to Waiting For RCS Default On";
            case 81:
                return "Transition to Waiting For App Open";
            case 82:
                return "Transition to Request Attestation";
            case 84:
                return "Force transition now";
        }
    }

    public static final void an(final dgjw dgjwVar, List list) {
        Collection.EL.stream(list).filter(new Predicate() { // from class: dgky
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
                dfny dfnyVar = dgng.a;
                return ((dgif) obj).a.equals("JIBE_ACS_COOKIE");
            }
        }).findFirst().ifPresent(new Consumer() { // from class: dgkp
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void z(Object obj) {
                dfny dfnyVar = dgng.a;
                dgjwVar.b(((dgif) obj).b);
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
    }

    static final int au(int i) {
        int i2 = i - 1;
        if (i2 == 1) {
            return 3;
        }
        if (i2 == 2) {
            return 4;
        }
        if (i2 != 3) {
            return i2 != 4 ? 1 : 7;
        }
        return 5;
    }

    static final boolean av(int i) {
        int i2 = i - 1;
        return i2 == 1 || i2 == 2 || i2 == 3 || i2 == 4;
    }

    private final int ay() {
        return (dfpi.z() && this.G) ? this.aH.i(Optional.of(this.h)) : this.aH.i(Optional.empty());
    }

    private static final int az(int i) {
        int i2 = i - 2;
        if (i2 == 1) {
            return 0;
        }
        if (i2 != 2) {
            return i2 != 4 ? 2 : 3;
        }
        return 1;
    }

    public static ewrg k(int i) {
        return i != 0 ? i != 1 ? i != 3 ? ewrg.CONSENT_REASON_UNKNOWN : ewrg.IMEI_PII_FORMAT_IGNORED : ewrg.IMEI_PII_FORMAT_SHORT : ewrg.IMEI_PII_FORMAT_NONE;
    }

    public static String q(Message message) {
        ejwl.b(message.obj instanceof String, "expected OTP to be string");
        return (String) message.obj;
    }

    final void A(ewps ewpsVar) {
        dgsz dgszVar = (dgsz) this.L.b();
        String str = this.h;
        boolean zJ = dgszVar.J(str);
        this.v.k(ewpsVar, this.l, Boolean.valueOf(zJ), str);
    }

    public final void B() {
        String str = this.h;
        final dgsy dgsyVar = this.v;
        Optional optionalOf = Optional.of(str);
        dhja.c("finishProvisioningStage for SIM: %s", dhiz.SIM_ID.c(dgsyVar.e(optionalOf)));
        if (dgsyVar.j(dgsyVar.e(optionalOf))) {
            return;
        }
        dgsyVar.s(new ejvr() { // from class: dgry
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                return dgsyVar.c((ewqd) obj);
            }
        }, optionalOf);
    }

    public final void C(Message message) {
        String headerField;
        if (!ag(message)) {
            x(message);
            return;
        }
        if (message.obj instanceof HttpURLConnection) {
            headerField = ((HttpURLConnection) message.obj).getHeaderField("Retry-After");
            this.z.d("Connection unavailable. Retry in %s seconds", headerField);
        } else {
            this.z.d("Connection unavailable. Retry", new Object[0]);
            headerField = "";
        }
        if (!TextUtils.isEmpty(headerField)) {
            try {
                y(dgib.MSG_RETRY_AFTER, Integer.valueOf(Integer.parseInt(headerField)));
            } catch (NumberFormatException unused) {
                this.z.b("Failed to parse Retry-After header: %s", headerField);
            }
        }
        T(this.an);
    }

    public final void D(final String str) {
        final int iAy = ay();
        String str2 = this.h;
        Optional optionalOf = Optional.of(str2);
        dgsx dgsxVar = new dgsx() { // from class: dgsi
            @Override // defpackage.dgsx
            public final void a(ewox ewoxVar) {
                ekgp ekgpVar = dgsy.a;
                ewoxVar.copyOnWrite();
                ewpg ewpgVar = (ewpg) ewoxVar.instance;
                ewpg ewpgVar2 = ewpg.a;
                String str3 = str;
                str3.getClass();
                ewpgVar.b |= 524288;
                ewpgVar.w = str3;
                ewoxVar.copyOnWrite();
                ewpg ewpgVar3 = (ewpg) ewoxVar.instance;
                ewpgVar3.v = iAy - 1;
                ewpgVar3.b |= 262144;
                ewoxVar.copyOnWrite();
                ewpg ewpgVar4 = (ewpg) ewoxVar.instance;
                ewpgVar4.u = 1;
                ewpgVar4.b |= 131072;
            }
        };
        dgsy dgsyVar = this.v;
        dgsyVar.r(dgsxVar, dgsyVar.e(optionalOf));
        this.n.w(this.m, l(), iAy, str, this.l, new dggp(str2));
    }

    public final void E() {
        String str = this.h;
        dgsy dgsyVar = this.v;
        Optional optionalOf = Optional.of(str);
        if (dgsyVar.j(dgsyVar.e(optionalOf))) {
            return;
        }
        dgsyVar.r(new dgsx() { // from class: dgst
            @Override // defpackage.dgsx
            public final void a(ewox ewoxVar) {
                ekgp ekgpVar = dgsy.a;
                ewpd ewpdVar = ewpd.TRUE;
                ewoxVar.copyOnWrite();
                ewpg ewpgVar = (ewpg) ewoxVar.instance;
                ewpg ewpgVar2 = ewpg.a;
                ewpgVar.o = ewpdVar.d;
                ewpgVar.b |= 2048;
            }
        }, dgsyVar.e(optionalOf));
    }

    public final void F(String str, Message message) {
        if (!this.Q.n() || message.arg1 == dgib.MSG_ARG_TRANSITION_MSG.a()) {
            return;
        }
        this.z.d("%s: event %s", str, am(al(message)));
    }

    final void G(ewrp ewrpVar) {
        this.n.d(this.m, ewrpVar, this.l, new dggp(this.h));
    }

    final void H(ewrp ewrpVar) {
        String strO = o();
        int iAy = ay();
        String str = this.l;
        dggp dggpVar = new dggp(this.h);
        deyo deyoVar = this.n;
        Context context = this.m;
        deyoVar.r(context, ewrpVar, str, strO, iAy, dggpVar);
        if (n().booleanValue()) {
            ckje.a(context, 8, this.i);
        }
    }

    public final void I() {
        cqgk cqgkVarG = ((cqey) this.aI.a()).g(this.i);
        dgsy dgsyVar = this.v;
        Optional optionalOf = Optional.of(this.h);
        if (dgsyVar.j(dgsyVar.e(optionalOf))) {
            return;
        }
        final ewpf ewpfVar = (ewpf) dgsy.a.getOrDefault(cqgkVarG, ewpf.SMS_CONNECTION_AVAILABILITY_UNKNOWN);
        dgsyVar.r(new dgsx() { // from class: dgss
            @Override // defpackage.dgsx
            public final void a(ewox ewoxVar) {
                ekgp ekgpVar = dgsy.a;
                ewoxVar.copyOnWrite();
                ewpg ewpgVar = (ewpg) ewoxVar.instance;
                ewpg ewpgVar2 = ewpg.a;
                ewpgVar.f = ewpfVar.d;
                ewpgVar.b |= 8;
            }
        }, dgsyVar.e(optionalOf));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0, types: [dgmn, dgop] */
    /* JADX WARN: Type inference failed for: r10v1, types: [dgop] */
    /* JADX WARN: Type inference failed for: r10v3, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r9v5, types: [dgkn] */
    public final void J(HttpURLConnection httpURLConnection, int i, dgmn dgmnVar) {
        dgib dgibVar = dgib.MSG_CONFIG_DOC;
        InputStream inputStream = null;
        try {
            try {
                inputStream = httpURLConnection.getInputStream();
                y(dgibVar, this.y.a(inputStream));
                T(this.ax);
            } finally {
                this.p.a(httpURLConnection, inputStream, dgmnVar.a());
            }
        } catch (dgqu | IOException e2) {
            ao(dgib.MSG_EXCEPTION_CAUGHT, i);
            this.z.e("Failed to parse configuration in state %s, exception = %s, errorMessage = %s", dgmnVar.a(), e2.getClass().getName(), dhiz.URI.c(e2));
            as(dgmnVar.g(), 4);
            G(dgmnVar.g());
        }
    }

    public final void K() {
        String str = this.h;
        dgsy dgsyVar = this.v;
        Optional optionalOf = Optional.of(str);
        if (dgsyVar.j(dgsyVar.e(optionalOf))) {
            return;
        }
        dgsyVar.r(new dgsx() { // from class: dgsj
            @Override // defpackage.dgsx
            public final void a(ewox ewoxVar) {
                ekgp ekgpVar = dgsy.a;
                ewpd ewpdVar = ewpd.FALSE;
                ewoxVar.copyOnWrite();
                ewpg ewpgVar = (ewpg) ewoxVar.instance;
                ewpg ewpgVar2 = ewpg.a;
                ewpgVar.g = ewpdVar.d;
                ewpgVar.b |= 16;
            }
        }, dgsyVar.e(optionalOf));
    }

    public final synchronized void L() {
        dgom dgomVar = this.Q;
        if (dgomVar.o()) {
            Iterator it = dgomVar.j.iterator();
            while (it.hasNext()) {
                ((dgkx) it.next()).a.aq(4);
            }
            dgomVar.l.set(true);
        }
        if (dgomVar.n()) {
            this.P.m();
        }
    }

    public final void M(dgib dgibVar) {
        dgom dgomVar = this.Q;
        if (dgomVar.o()) {
            auvh.h(dgomVar.c(dgibVar, new dgor()));
        }
        if (dgomVar.n()) {
            this.P.q(dgibVar.a());
        }
    }

    public final void N(dgib dgibVar, Object obj) {
        dgom dgomVar = this.Q;
        if (dgomVar.o()) {
            auvh.h(dgomVar.c(dgibVar, new dgor(null, null, obj)));
        }
        if (dgomVar.n()) {
            this.P.s(dgibVar.a(), obj);
        }
    }

    public final void O(dgib dgibVar, int i, int i2, Object obj) {
        dgom dgomVar = this.Q;
        if (dgomVar.o()) {
            auvh.h(dgomVar.c(dgibVar, new dgor(Integer.valueOf(i), Integer.valueOf(i2), obj)));
        }
        if (dgomVar.n()) {
            dfnb dfnbVar = this.P;
            int iA = dgibVar.a();
            dfnn dfnnVar = dfnbVar.b;
            if (dfnnVar == null) {
                return;
            }
            dfnnVar.sendMessage(dfnbVar.c(iA, i, i2, obj));
        }
    }

    public final void P(dgib dgibVar, long j) {
        dgib dgibVar2;
        dgom dgomVar = this.Q;
        if (dgomVar.o()) {
            dgor dgorVar = new dgor();
            Duration durationOfMillis = Duration.ofMillis(j);
            dgibVar.getClass();
            durationOfMillis.getClass();
            ((ekrd) dgom.c.h().h("com/google/android/ims/provisioning/engine/statemachine/StateMachineV2", "sendMessageDelayed", 520, "StateMachineV2.kt")).D("Queuing delayed %s for %s", dgibVar, durationOfMillis);
            dgibVar2 = dgibVar;
            auvw.k(dgomVar.e, null, null, new dgoh(durationOfMillis, dgomVar, dgibVar2, dgorVar, null), 3);
        } else {
            dgibVar2 = dgibVar;
        }
        if (dgomVar.n()) {
            this.P.t(dgibVar2.a(), j);
        }
    }

    public final void Q(dgmn dgmnVar) {
        dgom dgomVar = this.Q;
        if (dgomVar.o()) {
            ewrp ewrpVarG = dgmnVar.g();
            ewrpVarG.getClass();
            dgomVar.o = ewrpVarG;
        }
        if (dgomVar.n()) {
            this.P.u(dgmnVar);
        }
    }

    public final synchronized void R() {
        dgke dgkeVar = this.z;
        final long jHashCode = dgkeVar.hashCode();
        dgkeVar.a = (dhip) dgkeVar.c.map(new java.util.function.Function() { // from class: dgkb
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ java.util.function.Function mo536andThen(java.util.function.Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                dgkd dgkdVar = (dgkd) obj;
                StringBuilder sb = new StringBuilder();
                sb.append(jHashCode);
                sb.append("-Default");
                boolean z = dgkdVar.c;
                if (z) {
                    sb.append("Call");
                }
                boolean z2 = dgkdVar.d;
                if (z2) {
                    sb.append("Sms");
                }
                boolean z3 = dgkdVar.e;
                if (z3) {
                    sb.append("Data");
                }
                if (!z && !z2 && !z3) {
                    sb.append("None");
                }
                sb.append("-");
                sb.append(dgkdVar.b);
                sb.append((String) dgkdVar.a.map(new java.util.function.Function() { // from class: dgkc
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ java.util.function.Function mo536andThen(java.util.function.Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj2) {
                        String str = (String) obj2;
                        return (str.isEmpty() || str.length() < 3) ? "" : "-".concat(String.valueOf(str.substring(str.length() - 3)));
                    }

                    public final /* synthetic */ java.util.function.Function compose(java.util.function.Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                }).orElse(""));
                return new dhip(String.format(Locale.US, "(PEv2-SM%s)", sb));
            }

            public final /* synthetic */ java.util.function.Function compose(java.util.function.Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).orElse(new dhip(String.format(Locale.US, "(PEv2-SM%s)", a.u(jHashCode, "-Bugle-"))));
        this.z.d("start PEv2, trigger is %s, workerId is %s", this.W.name(), this.X);
        dgsy dgsyVar = this.v;
        String str = this.h;
        dgsyVar.g(str);
        if (this.u.j(str).isPresent()) {
            ((dgsz) this.L.b()).M(str);
        }
        dgom dgomVar = this.Q;
        if (dgomVar.o()) {
            if (dgomVar.p()) {
                dgomVar.i.add(new dgkw(this));
                dgomVar.j.add(new dgkx(this));
            }
            auvh.h(fdxs.a(ejaa.a(dgomVar.e, dgomVar.n, new dgoj(dgomVar, null))));
        }
        if (dgomVar.n()) {
            this.P.v();
        }
    }

    final void S(ewps ewpsVar) {
        this.v.m(ewpsVar, this.h);
    }

    public final void T(dgmn dgmnVar) {
        dgom dgomVar = this.Q;
        if (dgomVar.o()) {
            auvh.h(dgomVar.d(dgmnVar.g()));
        }
        if (dgomVar.n()) {
            this.P.w(dgmnVar);
        }
    }

    public final boolean U() {
        return dfpi.z() ? this.Y.c(this.h).D : ((Boolean) dfaq.E().d().a()).booleanValue();
    }

    public final boolean V() {
        return dfpi.z() ? this.Y.c(this.h).y : dfog.z();
    }

    public final boolean W() {
        return dfpi.z() ? this.Y.c(this.h).m && Build.VERSION.SDK_INT < 31 : ((Boolean) dfpi.t().a.H.a()).booleanValue() && Build.VERSION.SDK_INT < 31;
    }

    public final boolean X() {
        return dfpi.z() ? this.Y.c(this.h).x : dfpi.U();
    }

    public final boolean Y() {
        return dfpi.z() ? this.Y.c(this.h).n : dfar.b();
    }

    public final boolean Z() {
        return !TextUtils.isEmpty(this.u.o(this.h));
    }

    public final int a() {
        if (!dfpi.z()) {
            return ((Integer) dfaq.E().r().a()).intValue();
        }
        int iC = etsr.c(this.Y.c(this.h).E);
        if (iC == 0) {
            iC = 1;
        }
        return az(iC);
    }

    final boolean aa() {
        String strO = this.u.o(this.h);
        if (TextUtils.isEmpty(strO)) {
            strO = (String) m().orElse(null);
        }
        return !TextUtils.isEmpty(strO);
    }

    public final synchronized boolean ab() {
        dgom dgomVar = this.Q;
        if (dgomVar.p()) {
            return dgomVar.l();
        }
        return this.P.b == null;
    }

    public final boolean ac() {
        if (!this.G) {
            return this.r.k();
        }
        cmmh cmmhVar = this.H;
        cmmhVar.getClass();
        return cmmhVar.o;
    }

    final boolean ad() {
        if (U()) {
            this.z.a("Safe to share MSISDN in state %s. Device is ready for Seamless Authorized Provisioning.", p());
            return true;
        }
        if (a() != 3 || b() != 3) {
            return false;
        }
        this.z.a("Safe to share MSISDN in state %s. PII format ignored.", p());
        return true;
    }

    final boolean ae() {
        cmmh cmmhVar = this.H;
        cmmhVar.getClass();
        return this.I.s(cmmhVar.d);
    }

    public final boolean af() {
        return ((cqey) this.aI.a()).g(this.i) == cqgk.UNAVAILABLE;
    }

    final boolean ag(Message message) {
        if (this.k == message.arg2) {
            return true;
        }
        this.z.e("request id: %d, received id: %d, discard http response", Integer.valueOf(this.k), Integer.valueOf(message.arg2));
        return false;
    }

    public final boolean ah() {
        return dfpi.z() ? this.aL.a(this.h) : dfpi.G();
    }

    public final boolean ai() {
        return dfpi.z() ? this.aL.b(this.h) : dfpi.J();
    }

    public final boolean aj() {
        if (!dfpi.z()) {
            return dfpi.R();
        }
        int iA = ettr.a(this.Y.c(this.h).G);
        return iA != 0 && iA == 5;
    }

    public final boolean ak() {
        return ah() && Y() && !this.aE.d() && !this.u.H();
    }

    public final void ao(dgib dgibVar, int i) {
        dgom dgomVar = this.Q;
        if (dgomVar.o()) {
            auvh.h(dgomVar.c(dgibVar, new dgor(0, Integer.valueOf(i), null)));
        }
        if (dgomVar.n()) {
            dfnb dfnbVar = this.P;
            int iA = dgibVar.a();
            dfnn dfnnVar = dfnbVar.b;
            if (dfnnVar == null) {
                return;
            }
            dfnnVar.sendMessage(Message.obtain(dfnnVar, iA, 0, i));
        }
    }

    final void ap() {
        final String string = UUID.randomUUID().toString();
        fcsu fcsuVar = this.L;
        dgsz dgszVar = (dgsz) fcsuVar.b();
        final String str = this.h;
        dgszVar.A(str, string);
        Bundle bundle = new Bundle();
        bundle.putString("com.google.android.ims.provisioning.session.id.key", ((dgsz) fcsuVar.b()).k(str));
        dgic.c(this.m, 18, bundle);
        final int i = 2;
        dhja.c("startNewProvisioningAttempt, provisioningSessionId=%s, simId=%s", string, dhiz.SIM_ID.c(str));
        final dgsy dgsyVar = this.v;
        if (!dgsy.i()) {
            dgsyVar.s(new ejvr() { // from class: dgsf
                @Override // defpackage.ejvr
                public final Object apply(Object obj) {
                    ewqd ewqdVarN = (ewqd) obj;
                    int i2 = ewqdVarN.b & 2;
                    dgsy dgsyVar2 = dgsyVar;
                    String str2 = str;
                    if (i2 != 0) {
                        ewow ewowVar = ewqdVarN.d;
                        if (ewowVar == null) {
                            ewowVar = ewow.a;
                        }
                        if ((ewowVar.b & 4) == 0) {
                            ewqdVarN = dgsyVar2.n(ewqdVarN, 8, str2);
                        }
                    }
                    String str3 = string;
                    ewqc ewqcVar = (ewqc) ewqdVarN.toBuilder();
                    ewou ewouVar = (ewou) ewow.a.createBuilder();
                    ewouVar.copyOnWrite();
                    ewow ewowVar2 = (ewow) ewouVar.instance;
                    ewowVar2.g = 1;
                    ewowVar2.b = 8 | ewowVar2.b;
                    evvp evvpVarC = evxc.c(dhkl.a().longValue());
                    ewouVar.copyOnWrite();
                    ewow ewowVar3 = (ewow) ewouVar.instance;
                    evvpVarC.getClass();
                    ewowVar3.e = evvpVarC;
                    ewowVar3.b |= 2;
                    ewow ewowVar4 = (ewow) ewouVar.build();
                    ewqcVar.copyOnWrite();
                    ewqd ewqdVar = (ewqd) ewqcVar.instance;
                    ewowVar4.getClass();
                    ewqdVar.d = ewowVar4;
                    ewqdVar.b |= 2;
                    return dgsyVar2.d((ewqd) ewqcVar.build(), str3, Optional.of(str2));
                }
            }, Optional.of(str));
        }
        ((dgsz) fcsuVar.b()).u(str, false);
        this.l = string;
        this.z.b = string;
        this.z.d("Start a new provisioning session", new Object[0]);
        dgiq dgiqVarG = g();
        if (dgiqVarG != null && !dgiqVarG.S()) {
            i = !dgiqVarG.Q() ? 3 : true != dgiqVarG.ac() ? 4 : 5;
        }
        Optional optionalOf = Optional.of(str);
        if (dgsyVar.j(dgsyVar.e(optionalOf))) {
            return;
        }
        dgsyVar.r(new dgsx() { // from class: dgsu
            @Override // defpackage.dgsx
            public final void a(ewox ewoxVar) {
                ekgp ekgpVar = dgsy.a;
                ewoxVar.copyOnWrite();
                ewpg ewpgVar = (ewpg) ewoxVar.instance;
                ewpg ewpgVar2 = ewpg.a;
                ewpgVar.y = i - 1;
                ewpgVar.b |= 2097152;
            }
        }, dgsyVar.e(optionalOf));
    }

    final void aq(final int i) {
        final dgsy dgsyVar = this.v;
        dgid dgidVarF = f();
        String str = this.h;
        dgsyVar.l(dgidVarF, Optional.of(str));
        final Optional optionalOf = Optional.of(str);
        dhja.c("finishProvisioningAttempt", new Object[0]);
        if (!dgsy.i() && !dgsyVar.h(dgsyVar.e(optionalOf))) {
            dgsyVar.s(new ejvr() { // from class: dgsg
                @Override // defpackage.ejvr
                public final Object apply(Object obj) {
                    dgsy dgsyVar2 = dgsyVar;
                    return dgsyVar2.n((ewqd) obj, i, dgsyVar2.e(optionalOf));
                }
            }, optionalOf);
        }
        ((dgsz) this.L.b()).u(str, true);
        this.l = null;
        this.z.b = null;
    }

    final void ar(int i, int i2) {
        String str = this.l;
        dggp dggpVar = new dggp(this.h);
        ewof ewofVar = (ewof) ewoi.a.createBuilder();
        ewofVar.copyOnWrite();
        ewoi ewoiVar = (ewoi) ewofVar.instance;
        ewoiVar.c = i - 1;
        ewoiVar.b |= 1;
        ewofVar.copyOnWrite();
        ewoi ewoiVar2 = (ewoi) ewofVar.instance;
        ewoiVar2.d = i2 - 1;
        ewoiVar2.b |= 2;
        this.n.i(this.m, str, dggpVar, (ewoi) ewofVar.build());
    }

    final void as(ewrp ewrpVar, int i) {
        String str = this.l;
        dggp dggpVar = new dggp(this.h);
        deyo deyoVar = this.n;
        Context context = this.m;
        deyoVar.s(context, ewrpVar, i, str, dggpVar);
        if (n().booleanValue() && av(i)) {
            ckje.a(context, au(i), this.i);
        }
    }

    final void at(int i) {
        this.v.o(i);
    }

    final void aw(ewrp ewrpVar, int i) {
        String str = this.l;
        dggp dggpVar = new dggp(this.h);
        deyo deyoVar = this.n;
        Context context = this.m;
        deyoVar.z(context, ewrpVar, i, str, dggpVar);
        if (n().booleanValue() && av(2)) {
            int iAu = au(2);
            int i2 = this.i;
            if (craf.h) {
                Intent intent = new Intent("com.google.android.apps.messaging.ACTION_RCS_PROVISIONING_STATUS");
                if (iAu == 3) {
                    intent.putExtra("error_code", i);
                    iAu = 3;
                }
                ckje.c(intent, iAu, i2);
                ekrw ekrwVarH = ckje.a.h();
                ekrwVarH.X(eksq.a, "BugleRcsProvisioning");
                ((ekrd) ((ekrd) ekrwVarH).h("com/google/android/apps/messaging/shared/rcsprovisioning/statusbroadcaster/BroadcasterToTycho", "sendIntentToTychoWithErrorCode", 37, "BroadcasterToTycho.java")).q("BroadcasterToTycho: Broadcasting intent to Tycho about Provisioning Status");
                if (cqbe.h()) {
                    context.sendBroadcast(intent);
                } else {
                    context.sendBroadcast(intent, null, BroadcastOptions.makeBasic().setShareIdentityEnabled(true).toBundle());
                }
            }
        }
    }

    final void ax(int i) {
        this.v.q(28, i, Optional.empty());
    }

    public final int b() {
        if (!dfpi.z()) {
            return ((Integer) dfaq.E().s().a()).intValue();
        }
        int iC = etsr.c(this.Y.c(this.h).F);
        if (iC == 0) {
            iC = 1;
        }
        return az(iC);
    }

    public final int c() {
        return (dfpi.z() && this.G) ? this.aH.b(this.h) : this.aH.a();
    }

    public final long d() {
        if (!dfpi.z()) {
            return ((Long) dfaq.E().j().a()).longValue();
        }
        evrj evrjVar = this.Y.c(this.h).J;
        if (evrjVar == null) {
            evrjVar = evrj.a;
        }
        return evwy.b(evrjVar);
    }

    public final long e() {
        if (!dfpi.z()) {
            return ((Long) dfaq.E().n().a()).longValue();
        }
        evrj evrjVar = this.Y.c(this.h).K;
        if (evrjVar == null) {
            evrjVar = evrj.a;
        }
        return evwy.b(evrjVar);
    }

    final dgid f() {
        return new dgid(((chza) this.aK.a()).u(new dggp(this.h)));
    }

    public final dgiq g() {
        return this.u.f(this.h);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0040  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.dgmn h() {
        /*
            r3 = this;
            boolean r0 = r3.G
            dgnm r1 = r3.aG
            dgno r1 = r1.a
            if (r0 == 0) goto L2f
            cmlb r0 = r1.c
            cmla r1 = defpackage.cmla.a
            j$.util.Optional r1 = r0.h(r1)
            cmla r2 = defpackage.cmla.c
            j$.util.Optional r0 = r0.h(r2)
            dgnn r2 = new dgnn
            r2.<init>()
            j$.util.Optional r1 = r1.map(r2)
            dgnn r2 = new dgnn
            r2.<init>()
            j$.util.Optional r0 = r0.map(r2)
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L65
            goto L40
        L2f:
            dheq r0 = r1.b
            android.content.Context r1 = r1.a
            dher r2 = r0.a
            int r2 = r2.a(r1)
            int r0 = r0.a(r1)
            if (r2 == r0) goto L40
            goto L65
        L40:
            boolean r0 = defpackage.dfpi.z()
            if (r0 == 0) goto L51
            cebq r0 = r3.Y
            java.lang.String r1 = r3.h
            etsz r0 = r0.c(r1)
            boolean r0 = r0.M
            goto L63
        L51:
            dfpi r0 = defpackage.dfpi.t()
            dfph r0 = r0.a
            dfoa r0 = r0.i
            java.lang.Object r0 = r0.a()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
        L63:
            if (r0 == 0) goto L68
        L65:
            dgmn r0 = r3.al
            return r0
        L68:
            dgmn r0 = r3.as
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dgng.h():dgmn");
    }

    public final eiju i(emey emeyVar, String str, final ckiz ckizVar) {
        return ((ckil) this.aM.b()).a(emeyVar, this.l, new dggp(this.h), str).h(new ejvr() { // from class: dgkr
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                dfny dfnyVar = dgng.a;
                final ckiz ckizVar2 = ckizVar;
                ((Optional) obj).ifPresent(new Consumer() { // from class: dgkt
                    @Override // java.util.function.Consumer
                    /* renamed from: accept */
                    public final void z(Object obj2) {
                        ccvx ccvxVar = (ccvx) obj2;
                        evqs evqsVar = ccvxVar.a;
                        dfny dfnyVar2 = dgng.a;
                        String strE = evqsVar.E();
                        ckiz ckizVar3 = ckizVar2;
                        ckizVar3.l("participant_public_key", strE);
                        ckizVar3.l("signed_acs_data", ccvxVar.b.E());
                        ckizVar3.l("home_kds", String.valueOf(ccvxVar.c));
                    }

                    public final /* synthetic */ Consumer andThen(Consumer consumer) {
                        return Consumer$CC.$default$andThen(this, consumer);
                    }
                });
                return ckizVar2;
            }
        }, eoqg.a);
    }

    public final eiju j(emey emeyVar, String str, final ckiz ckizVar) {
        return ((ckil) this.aM.b()).a(emeyVar, this.l, new dggp(this.h), str).h(new ejvr() { // from class: dgkv
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                dfny dfnyVar = dgng.a;
                final ckiz ckizVar2 = ckizVar;
                ((Optional) obj).ifPresent(new Consumer() { // from class: dgkq
                    @Override // java.util.function.Consumer
                    /* renamed from: accept */
                    public final void z(Object obj2) {
                        ccvx ccvxVar = (ccvx) obj2;
                        evqs evqsVar = ccvxVar.a;
                        dfny dfnyVar2 = dgng.a;
                        String strE = evqsVar.E();
                        ckiz ckizVar3 = ckizVar2;
                        ckizVar3.l("participant_public_key", strE);
                        ckizVar3.l("participant_key_signed_nonce", ccvxVar.b.E());
                        ckizVar3.l("home_kds", String.valueOf(ccvxVar.c));
                    }

                    public final /* synthetic */ Consumer andThen(Consumer consumer) {
                        return Consumer$CC.$default$andThen(this, consumer);
                    }
                });
                return ckizVar2;
            }
        }, eoqg.a);
    }

    public final ewrp l() {
        dgom dgomVar = this.Q;
        if (dgomVar.p()) {
            ewrp ewrpVar = (ewrp) dgomVar.e();
            if (ewrpVar != null) {
                return ewrpVar;
            }
            this.z.e("StateMachineV2's initial state is not set, using unknown state", new Object[0]);
            return ewrp.RCS_PROVISIONING_UNKNOWN_STATE;
        }
        dfmy dfmyVarD = this.P.d();
        if (dfmyVarD == null) {
            this.z.e("Current state is null, use unknown state", new Object[0]);
            return ewrp.RCS_PROVISIONING_UNKNOWN_STATE;
        }
        if (dfmyVarD instanceof dgmn) {
            return ((dgmn) dfmyVarD).g();
        }
        this.z.e("Current state is not defined state, use unknown state", new Object[0]);
        return ewrp.RCS_PROVISIONING_UNKNOWN_STATE;
    }

    public final Optional m() {
        String strD;
        if (this.Y.c(this.h).O) {
            this.z.a("Skipping attempt to read MSISDN from SIM because of inhibitReadingMsisdnFromSim", new Object[0]);
            return Optional.empty();
        }
        if (!ejwk.c(dfpi.u())) {
            strD = dfpi.u();
            this.z.a("Using fake MSISDN from SIM because of RcsProvisioning.fakeSimNumberForTesting", new Object[0]);
        } else if (this.G) {
            cmmh cmmhVar = this.H;
            cmmhVar.getClass();
            strD = cmmhVar.q;
        } else {
            strD = this.r.d();
        }
        return TextUtils.isEmpty(strD) ? Optional.empty() : Optional.of(strD);
    }

    public final Boolean n() {
        boolean z = false;
        if (ac() && craf.h) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    public final String o() {
        return (dfpi.z() && this.G) ? (String) this.aH.d(this.h).orElse("") : (String) this.aH.c().orElse("");
    }

    public final String p() {
        dgom dgomVar = this.Q;
        dfmy dfmyVar = dgomVar.p() ? dgomVar.n() ? (dgop) this.P.d() : (dgop) dgomVar.a() : (dgmn) this.P.d();
        if (dfmyVar != null) {
            return dfmyVar.a();
        }
        this.z.e("Trying to get state name when current state is null, use unknown", new Object[0]);
        return "UnknownState";
    }

    public final String r() {
        return dfpi.z() ? this.Y.d(this.h).b : dfpi.x();
    }

    public final String s() {
        return (dfpi.z() && this.G) ? this.aH.f(this.h) : this.aH.e();
    }

    public final List t() {
        return ((dgsz) this.L.b()).m(this.h);
    }

    public final void u(dgmn dgmnVar, ckiz ckizVar, Optional optional) {
        if (Y() && dfpi.I()) {
            Optional optionalG = this.u.g();
            if (optionalG.isEmpty() && dfpi.P()) {
                this.z.e("Failed to find GMSCore IID token when constructing HTTP request.", new Object[0]);
                dgmnVar.p(this.am, ewrp.RCS_PROVISIONING_RETRY_STATE);
            } else if (optionalG.isPresent()) {
                ckizVar.k("gmscore_instance_id_token", (String) optionalG.get());
                if (optional.isPresent()) {
                    ((dgjr) optional.get()).b = (String) optionalG.get();
                }
            }
        }
    }

    public final void v(final ckiz ckizVar) {
        Optional optionalEmpty;
        byte[] bArrI;
        Optional optionalEmpty2;
        Optional optional = this.aJ;
        if (optional.isEmpty()) {
            this.z.e("Skipping adding Tachyon identity key to request. TachyonIdentityKeyGetter is not present. Perhaps provisioning engine is not running in Bugle.", new Object[0]);
            return;
        }
        dgiq dgiqVarG = g();
        if (dgiqVarG == null || dgiqVarG.c() == 0) {
            this.z.e("Could not retrieve MSISDN from configuration. Configuration is empty.", new Object[0]);
            optionalEmpty = Optional.empty();
        } else {
            dgis dgisVarM = dgiqVarG.m();
            if (dgisVarM == null) {
                this.z.e("Could not retrieve MSISDN from configuration. ImsConfiguration is null.", new Object[0]);
                optionalEmpty = Optional.empty();
            } else {
                String strW = dgisVarM.w();
                if (ejwk.c(strW)) {
                    this.z.e("Could not retrieve MSISDN from configuration. Public identity is null/empty.", new Object[0]);
                    optionalEmpty = Optional.empty();
                } else {
                    optionalEmpty = Optional.ofNullable(dhjv.k(strW, this.x));
                }
            }
        }
        if (optionalEmpty.isEmpty() || ejwk.c((String) optionalEmpty.get())) {
            this.z.e("Skipping adding Tachyon identity key to request. Null/empty RCS msisdn from configuration for sim ID: %s.", dhiz.SIM_ID.c(this.h));
            return;
        }
        Object obj = optional.get();
        String str = (String) optionalEmpty.get();
        if (ejwk.c(str)) {
            cevn.a.r("Cannot retrieve Tachyon Identity key because RCS MSISDN is empty.");
            optionalEmpty2 = Optional.empty();
        } else {
            try {
                bArrI = ((cevr) ((cevn) obj).b.a(str).b.l()).f.I();
            } catch (evtj e2) {
                cqbd cqbdVarB = cevn.a.b();
                cqbdVarB.I("Could not parse TachyonPhoneData from proto data store");
                cqbdVarB.s(e2);
                bArrI = new byte[0];
            }
            if (bArrI == null || bArrI.length == 0) {
                cqbd cqbdVarA = cevn.a.a();
                cqbdVarA.I("Tachyon identity key is empty because we do not have an active Tachyon registration.");
                cqbdVarA.r();
                optionalEmpty2 = Optional.empty();
            } else {
                ezpa ezpaVar = (ezpa) ezpb.a.createBuilder();
                ezpaVar.copyOnWrite();
                ((ezpb) ezpaVar.instance).b = felq.a(3);
                evqs evqsVarX = evqs.x(bArrI);
                ezpaVar.copyOnWrite();
                ((ezpb) ezpaVar.instance).c = evqsVarX;
                optionalEmpty2 = Optional.of(Base64.encodeToString(((ezpb) ezpaVar.build()).toByteArray(), 0));
            }
        }
        optionalEmpty2.ifPresent(new Consumer() { // from class: dgku
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void z(Object obj2) {
                dfny dfnyVar = dgng.a;
                ckizVar.k("tachyon_identity_key", (String) obj2);
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
    }

    public final void w() {
        at(57);
        cjxm cjxmVar = (cjxm) cjxn.a.createBuilder();
        cjqp cjqpVar = cjqp.GOOGLE_TOS_CONSENTED;
        cjxmVar.copyOnWrite();
        ((cjxn) cjxmVar.instance).c = cjqpVar.a();
        cjxmVar.copyOnWrite();
        ((cjxn) cjxmVar.instance).d = "Backfilled consent. Missing ToS URL.";
        String languageTag = craf.c(this.m).toLanguageTag();
        cjxmVar.copyOnWrite();
        cjxn cjxnVar = (cjxn) cjxmVar.instance;
        languageTag.getClass();
        cjxnVar.e = languageTag;
        evvp evvpVarC = evxc.c(dhkl.a().longValue());
        cjxmVar.copyOnWrite();
        cjxn cjxnVar2 = (cjxn) cjxmVar.instance;
        evvpVarC.getClass();
        cjxnVar2.f = evvpVarC;
        cjxnVar2.b |= 1;
        this.aE.c((cjxn) cjxmVar.build());
    }

    public final void x(Message message) {
        if (message.obj instanceof HttpURLConnection) {
            dgkn dgknVar = this.p;
            HttpURLConnection httpURLConnection = (HttpURLConnection) message.obj;
            dgom dgomVar = this.Q;
            dgknVar.a(httpURLConnection, null, dgomVar.p() ? dgomVar.d : this.P.a);
        }
    }

    public final void y(dgib dgibVar, Object obj) {
        dgom dgomVar = this.Q;
        if (dgomVar.o()) {
            if (((dfll) this.aN.b()).a()) {
                auvh.h(dgomVar.b(dgibVar, new dgor(null, null, obj)));
            } else {
                dgomVar.k(dgibVar, new dgor(null, null, obj));
            }
        }
        if (dgomVar.n()) {
            dfnb dfnbVar = this.P;
            dfnbVar.g(dfnbVar.b(dgibVar.a(), obj));
        }
    }

    public final void z(dgib dgibVar, int i, int i2, Object obj) {
        dgom dgomVar = this.Q;
        if (dgomVar.o()) {
            if (((dfll) this.aN.b()).a()) {
                auvh.h(dgomVar.b(dgibVar, new dgor(Integer.valueOf(i), Integer.valueOf(i2), obj)));
            } else {
                dgomVar.k(dgibVar, new dgor(Integer.valueOf(i), Integer.valueOf(i2), obj));
            }
        }
        if (dgomVar.n()) {
            dfnb dfnbVar = this.P;
            dfnbVar.g(dfnbVar.c(dgibVar.a(), i, i2, obj));
        }
    }
}
