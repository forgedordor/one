package defpackage;

import android.content.Context;
import android.net.Network;
import android.os.Message;
import androidx.car.app.navigation.model.Maneuver;
import j$.util.Optional;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dglo extends dgmn {
    final /* synthetic */ dgng a;
    private dglm b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dglo(dgng dgngVar) {
        super(dgngVar);
        this.a = dgngVar;
    }

    private final void n(Message message) {
        dgng dgngVar = this.a;
        if (dgngVar.k != message.arg2) {
            dgngVar.z.e("request id: %d, received id: %d, discard exception message", Integer.valueOf(dgngVar.k), Integer.valueOf(message.arg1));
        } else {
            dgngVar.T(dgngVar.am);
        }
    }

    @Override // defpackage.dgop, defpackage.dfmy
    public final String a() {
        return "InProgressState";
    }

    @Override // defpackage.dgmn, defpackage.dfmy
    public final void b() {
        super.b();
        this.b = new dglm(this);
        dgnq dgnqVar = this.a.C;
        dglm dglmVar = this.b;
        dhhr dhhrVar = dgnqVar.a;
        dhhp dhhpVarF = dhhq.f(new dgnp(dglmVar), eoqg.a);
        dhhpVarF.b(dglmVar);
        dhhpVarF.c(false);
        dhhrVar.a(dhhpVarF.a());
    }

    @Override // defpackage.dgmn, defpackage.dfmy
    public final void c() {
        super.c();
        dglm dglmVar = this.b;
        if (dglmVar != null) {
            this.a.C.a.d(dglmVar);
        }
    }

    @Override // defpackage.dgmn
    public final dgib f() {
        return dgib.MSG_TRANSITION_TO_IN_PROGRESS;
    }

    @Override // defpackage.dgmn
    public final ewrp g() {
        return ewrp.RCS_PROVISIONING_IN_PROGRESS_STATE;
    }

    @Override // defpackage.dgmn
    public final boolean h() {
        return true;
    }

    @Override // defpackage.dgmn
    public final boolean i() {
        return false;
    }

    @Override // defpackage.dgmn
    public final boolean j() {
        return true;
    }

    @Override // defpackage.dgop
    public final boolean k(Message message, dgib dgibVar) {
        String headerField;
        dgng dgngVar = this.a;
        dgngVar.F("InProgressState", message);
        int iOrdinal = dgng.al(message).ordinal();
        if (iOrdinal == 4) {
            dgng dgngVar2 = this.a;
            if (dgngVar2.ag(message)) {
                int i = message.arg1;
                int i2 = message.arg2;
                dgngVar2.n.f(dgngVar2.m, dgngVar2.l(), i, dgngVar2.l, new dggp(dgngVar2.h));
                if ((message.obj instanceof HttpURLConnection) && (headerField = ((HttpURLConnection) message.obj).getHeaderField("x-acs-debug-message")) != null) {
                    dgngVar2.z.a("Http response ACS debug message: %s", headerField);
                }
                dgngVar2.O(i != 200 ? i != 403 ? i != 405 ? i != 429 ? i != 511 ? i != 400 ? i != 401 ? i != 500 ? i != 501 ? i != 503 ? i != 504 ? dgib.MSG_HTTP_RESPONSE_UNKNOWN : dgib.MSG_HTTP_504_GATEWAY_TIMEOUT : dgib.MSG_HTTP_503_UNAVAILABLE : dgib.MSG_HTTP_501_NOT_SUPPORTED : dgib.MSG_HTTP_500_INTERNAL_SERVER_ERROR : dgib.MSG_HTTP_401_UNAUTHORIZED : dgib.MSG_HTTP_400_BAD_REQUEST : dgib.MSG_HTTP_511_AUTH_REQUIRED : dgib.MSG_HTTP_429_TOO_MANY_REQUESTS : dgib.MSG_HTTP_405_METHOD_NOT_ALLOWED : dgib.MSG_HTTP_403_FORBIDDEN : dgib.MSG_HTTP_200_OK, i, i2, message.obj);
            } else {
                dgngVar2.x(message);
            }
        } else {
            if (iOrdinal == 6) {
                final dgng dgngVar3 = this.a;
                dgngVar3.k++;
                if (!(message.obj instanceof ckja)) {
                    dgngVar3.z.b("Wrong provisioning request message type", new Object[0]);
                    dgngVar3.T(dgngVar3.am);
                    return true;
                }
                ckja ckjaVar = (ckja) message.obj;
                final int i3 = dgngVar3.k;
                final dgkn dgknVar = dgngVar3.p;
                final Context context = dgngVar3.m;
                final Optional optionalOf = Optional.of(ckjaVar);
                int i4 = ekgb.d;
                ekgb ekgbVar = ekoe.a;
                final String str = dgngVar3.l;
                String str2 = dgngVar3.h;
                final dggp dggpVar = new dggp(str2);
                if (((Boolean) dgom.b.a()).booleanValue() && ((Boolean) dgom.a.a()).booleanValue()) {
                    auvh.h(eijx.g(new Callable() { // from class: dgkk
                        @Override // java.util.concurrent.Callable
                        public final Object call() {
                            ckja ckjaVar2 = (ckja) optionalOf.orElse(null);
                            return dgknVar.c(context, dgngVar3, null, str, i3, ckjaVar2, dggpVar);
                        }
                    }, dgknVar.a));
                } else {
                    dgknVar.a.execute(new Runnable() { // from class: dgkl
                        @Override // java.lang.Runnable
                        public final void run() {
                            ckja ckjaVar2 = (ckja) optionalOf.orElse(null);
                            dgknVar.c(context, dgngVar3, null, str, i3, ckjaVar2, dggpVar);
                        }
                    });
                }
                dgngVar3.n.e(context, dgngVar3.l(), dgngVar3.l, new dggp(str2));
                return true;
            }
            if (iOrdinal == 9) {
                n(message);
                return true;
            }
            if (iOrdinal == 20) {
                final dgng dgngVar4 = this.a;
                dgngVar4.k++;
                if (!(message.obj instanceof ckja)) {
                    dgngVar4.z.b("Wrong provisioning request message type", new Object[0]);
                    dgngVar4.T(dgngVar4.am);
                    return true;
                }
                ckja ckjaVar2 = (ckja) message.obj;
                final int i5 = dgngVar4.k;
                final dgkn dgknVar2 = dgngVar4.p;
                final Context context2 = dgngVar4.m;
                final Optional optionalOf2 = Optional.of(ckjaVar2);
                int i6 = ekgb.d;
                ekgb ekgbVar2 = ekoe.a;
                final String str3 = dgngVar4.l;
                String str4 = dgngVar4.h;
                final dggp dggpVar2 = new dggp(str4);
                final dhhl dhhlVar = new dhhl(context2, dgknVar2.d);
                final Network networkA = dhhlVar.a();
                if (networkA == null) {
                    dgngVar4.M(dgib.MSG_MOBILE_NETWORK_NOT_AVAILABLE);
                } else {
                    dgknVar2.a.execute(new Runnable() { // from class: dgkm
                        @Override // java.lang.Runnable
                        public final void run() {
                            dgknVar2.c(context2, dgngVar4, networkA, str3, i5, (ckja) optionalOf2.orElse(null), dggpVar2);
                            dhhlVar.b();
                        }
                    });
                }
                dgngVar4.n.e(context2, dgngVar4.l(), dgngVar4.l, new dggp(str4));
                return true;
            }
            if (iOrdinal == 22 || iOrdinal == 24) {
                dgngVar.as(ewrp.RCS_PROVISIONING_IN_PROGRESS_STATE, 3);
                n(message);
                return true;
            }
            if (iOrdinal != 41) {
                switch (iOrdinal) {
                    case 43:
                    case 44:
                    case 46:
                    case 47:
                    case 48:
                    case Maneuver.TYPE_FERRY_TRAIN_LEFT /* 49 */:
                    case 50:
                    case 51:
                    case 52:
                        break;
                    case 45:
                        dgngVar.C(message);
                        return true;
                    default:
                        return super.q(message, dgibVar);
                }
            } else {
                dgngVar.z.d("Received unknown response %d in %s state", Integer.valueOf(message.arg1), dgngVar.p());
            }
            try {
            } catch (IOException unused) {
                this.a.z.e("Error retrieving response code", new Object[0]);
            }
            if (dgngVar.ag(message)) {
                if (message.obj instanceof HttpURLConnection) {
                    dgngVar.aw(ewrp.RCS_PROVISIONING_IN_PROGRESS_STATE, ((HttpURLConnection) message.obj).getResponseCode());
                }
                dgng dgngVar5 = this.a;
                dgngVar5.T(dgngVar5.am);
                if (message.obj instanceof HttpURLConnection) {
                    dgngVar5.p.a((HttpURLConnection) message.obj, null, "InProgressState");
                }
            } else {
                dgngVar.x(message);
            }
        }
        return true;
    }
}
