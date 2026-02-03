package defpackage;

import android.os.Message;
import androidx.car.app.hardware.common.CarZone;
import com.sun.jna.Function;
import j$.time.Duration;
import j$.util.function.Consumer$CC;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class dgmn extends dgop {
    final /* synthetic */ dgng c;

    public dgmn(dgng dgngVar) {
        this.c = dgngVar;
    }

    private final boolean n(Message message, dgmn dgmnVar) {
        if (message.obj != this) {
            Object obj = message.obj;
            dgng dgngVar = this.c;
            if (obj != dgngVar.P.d()) {
                dgngVar.z.d("%s: ignoring %s", a(), dgng.am(dgng.al(message)));
                return false;
            }
        }
        dgng dgngVar2 = this.c;
        dgngVar2.z.d("%s: %s", a(), dgng.am(dgng.al(message)));
        dgngVar2.T(dgmnVar);
        return true;
    }

    @Override // defpackage.dfmy
    public void b() {
        Consumer consumer = new Consumer() { // from class: dgmm
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                ((dgni) obj).a = this.a;
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer2) {
                return Consumer$CC.$default$andThen(this, consumer2);
            }
        };
        dgng dgngVar = this.c;
        dgngVar.t.ifPresent(consumer);
        dgngVar.z.d("Enter %s", a());
        dgsz dgszVar = (dgsz) dgngVar.L.b();
        String str = dgngVar.h;
        dgszVar.B(str, a());
        if (h()) {
            dgngVar.n.c(dgngVar.m, g(), dgngVar.l, new dggp(str));
        }
        dgngVar.P(dgib.MSG_TIMEOUT, l().toMillis());
    }

    @Override // defpackage.dfmy
    public void c() {
        Consumer consumer = new Consumer() { // from class: dgml
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                dgni dgniVar = (dgni) obj;
                if (dgniVar.a == this.a) {
                    dgniVar.a = null;
                }
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer2) {
                return Consumer$CC.$default$andThen(this, consumer2);
            }
        };
        dgng dgngVar = this.c;
        dgngVar.t.ifPresent(consumer);
        dgngVar.z.d("Exit %s", a());
        dgngVar.P.p(dgib.MSG_TIMEOUT.a());
        if (h()) {
            dgngVar.n.h(dgngVar.m, g(), dgngVar.l, new dggp(dgngVar.h));
        }
    }

    public abstract dgib f();

    public abstract ewrp g();

    public abstract boolean h();

    public boolean i() {
        this.c.Q(this);
        return true;
    }

    public abstract boolean j();

    public Duration l() {
        return Duration.ofMillis(((Long) dfpi.t().a.c.a()).longValue());
    }

    final void p(dgmn dgmnVar, ewrp ewrpVar) {
        String strA = a();
        dgng dgngVar = this.c;
        dgngVar.z.d("transitionViaMessage, srcState=%s, destState = %s", strA, dgmnVar.a());
        dgom dgomVar = dgngVar.Q;
        if (dgomVar.o()) {
            auvh.h(dgomVar.d(ewrpVar));
        }
        if (dgomVar.n()) {
            dgngVar.O(dgmnVar.f(), dgib.MSG_ARG_TRANSITION_MSG.a(), 0, this);
        }
    }

    public final boolean q(Message message, dgib dgibVar) {
        dgng dgngVar = this.c;
        if (dgngVar.Q.n()) {
            dgibVar = dgng.al(message);
        }
        int iOrdinal = dgibVar.ordinal();
        if (iOrdinal == 8) {
            if (j()) {
                dgngVar.z.e("Timed out in state %s", dgngVar.p());
                dgngVar.n.m(dgngVar.m, dgngVar.l(), dgngVar.l, new dggp(dgngVar.h));
                dgngVar.T(dgngVar.am);
            }
            return true;
        }
        switch (iOrdinal) {
            case 54:
                return n(message, dgngVar.ae);
            case 55:
                return n(message, dgngVar.af);
            case 56:
                return n(message, dgngVar.ag);
            case 57:
                return n(message, dgngVar.ah);
            case 58:
                return n(message, dgngVar.ai);
            case 59:
                return n(message, dgngVar.al);
            case 60:
                return n(message, dgngVar.am);
            case 61:
                return n(message, dgngVar.an);
            default:
                switch (iOrdinal) {
                    case Function.ALT_CONVENTION /* 63 */:
                        return n(message, dgngVar.ao);
                    case 64:
                        return n(message, dgngVar.ap);
                    case 65:
                        return n(message, dgngVar.aq);
                    case 66:
                        return n(message, dgngVar.ar);
                    case 67:
                        return n(message, dgngVar.as);
                    case 68:
                        return n(message, dgngVar.at);
                    case 69:
                        return n(message, dgngVar.au);
                    case 70:
                        return n(message, dgngVar.av);
                    default:
                        switch (iOrdinal) {
                            case 72:
                                return n(message, dgngVar.aw);
                            case 73:
                                return n(message, dgngVar.ax);
                            case 74:
                                return n(message, dgngVar.ay);
                            default:
                                switch (iOrdinal) {
                                    case 76:
                                        return n(message, dgngVar.az);
                                    case 77:
                                        return n(message, dgngVar.aA);
                                    case 78:
                                        return n(message, dgngVar.ak);
                                    case 79:
                                        return n(message, dgngVar.aj);
                                    case CarZone.CAR_ZONE_COLUMN_DRIVER /* 80 */:
                                        return n(message, dgngVar.aB);
                                    case 81:
                                        return n(message, dgngVar.aC);
                                    case 82:
                                        return n(message, dgngVar.aD);
                                    default:
                                        return false;
                                }
                        }
                }
        }
    }

    final void r(dgmn dgmnVar, ewrp ewrpVar, int i) {
        if (i == 1) {
            p(dgmnVar, ewrpVar);
        } else {
            this.c.T(dgmnVar);
        }
    }

    public boolean y() {
        return false;
    }
}
