package defpackage;

import io.grpc.Status;
import io.grpc.StatusException;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class agrd {
    public static final fbrb a;

    static {
        exmy exmyVar = exmy.a;
        evrr evrrVar = fcrj.a;
        fcri fcriVar = new fcri(exmyVar);
        int i = fbrb.d;
        a = new fbqy("grpc-status-details-bin", fcriVar);
    }

    public static final agrr a(Exception exc) {
        evqe evqeVar;
        exmw exmwVar;
        Object next;
        boolean z = exc instanceof fbtf;
        if (!z && !(exc instanceof StatusException)) {
            return null;
        }
        int iOrdinal = (z ? ((fbtf) exc).a.getCode() : ((StatusException) exc).a.getCode()).ordinal();
        if (iOrdinal != 2) {
            if (iOrdinal == 4) {
                return new agrc(exc);
            }
            if (iOrdinal == 16 || iOrdinal == 7) {
                return new agrs(exc);
            }
            if (iOrdinal == 8) {
                fbrg fbrgVar = z ? ((fbtf) exc).b : ((StatusException) exc).b;
                exmy exmyVar = fbrgVar != null ? (exmy) fbrgVar.c(a) : null;
                if (exmyVar != null) {
                    evtg evtgVar = exmyVar.d;
                    evtgVar.getClass();
                    Iterator<E> it = evtgVar.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it.next();
                        String str = ((evqe) next).b;
                        str.getClass();
                        if (fdgn.G(str, "ErrorInfo", false)) {
                            break;
                        }
                    }
                    evqeVar = (evqe) next;
                } else {
                    evqeVar = null;
                }
                if (evqeVar != null) {
                    try {
                        exmwVar = (exmw) evsn.parseFrom(exmw.a, evqeVar.c);
                    } catch (evtj e) {
                        fcsw.a(exc, e);
                    }
                } else {
                    exmwVar = null;
                }
                return fdbq.f(exmwVar != null ? exmwVar.b : null, "SERVER_THROTTLED") ? new agrq(exc) : new agro(exc);
            }
            if (iOrdinal != 13) {
                return iOrdinal != 14 ? new agrt(exc) : new agrk(exc);
            }
        }
        return new agrp(exc);
    }

    public static final agrl b(int i) {
        Status.Code code = Status.Code.OK;
        int i2 = i - 2;
        return (i2 == 7 || i2 == 8 || i2 == 9) ? new agrg(i) : new agrb(i);
    }
}
