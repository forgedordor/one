package defpackage;

import android.os.PowerManager;
import java.io.BufferedInputStream;
import java.net.SocketTimeoutException;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class ebre extends Thread {
    final /* synthetic */ ebrf a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ebre(ebrf ebrfVar) {
        super("ClientSocketConnection");
        this.a = ebrfVar;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        PowerManager.WakeLock wakeLock;
        ebrf ebrfVar = this.a;
        dhja.d(ebrfVar.b, "TCP socket reader started", new Object[0]);
        try {
            ebfw ebfwVar = ebrfVar.e;
            ebfwVar.getClass();
            BufferedInputStream bufferedInputStream = new BufferedInputStream(ebfwVar.a());
            while (ebrfVar.h.get() == 1) {
                if (bufferedInputStream.available() >= 0) {
                    try {
                        ebpc ebpcVarA = ebqg.a(bufferedInputStream);
                        ebrf ebrfVar2 = this.a;
                        ebrfVar2.f = dhkl.a().longValue();
                        dhja.d(ebrfVar2.b, ">>>>>>>>>> SIP message[%s] received (%d bytes) [Call-ID: %s]", ebpb.a(ebpcVarA.l), Integer.valueOf(ebpcVarA.a().length()), ebpcVarA.h());
                        try {
                            ebrg ebrgVar = ebrfVar2.d;
                            String strU = ebpcVarA.u(1);
                            eblt ebltVar = ((eblq) ebrgVar).a;
                            dhja.d(ebltVar.a, "shouldAcquireWakelock for context id: %s", strU);
                            if ((!ebltVar.i(ebpcVarA) || !ebltVar.h(ebpcVarA)) && !ebpcVarA.r() && (wakeLock = ebrfVar2.g) != null && dfpo.o() > 0) {
                                wakeLock.acquire(dfpo.o());
                            }
                            ebrfVar2.d.c(ebpcVarA);
                        } catch (Exception e) {
                            ebrfVar2.s(5);
                            dhja.j(e, ebrfVar2.b, "Error while notifying message: %s", e.getMessage());
                        }
                    } catch (SocketTimeoutException unused) {
                        dhja.d(this.a.b, "Socket read timeout due to inactivity.", new Object[0]);
                    }
                }
            }
        } catch (Exception e2) {
            ebrf ebrfVar3 = this.a;
            if (!ebrfVar3.h.compareAndSet(1, 2)) {
                return;
            }
            int i = 7;
            if (!(e2 instanceof ebml) && !(e2 instanceof dhii)) {
                i = 6;
            }
            ebrfVar3.s(i);
            dhip dhipVar = ebrfVar3.b;
            dhja.j(e2, dhipVar, "Error while receiving message: %s", e2.getMessage());
            ebrfVar3.q(ewnq.SOCKET_FAILURE_READ_ERROR);
            ebrfVar3.r();
            ebqw ebqwVar = ebrfVar3.c;
            if (ebqwVar != null) {
                ebqwVar.a(ebrfVar3.d(), e2);
            } else {
                dhja.r(dhipVar, "SipTransportErrorListener is null", new Object[0]);
            }
        }
        dhja.d(this.a.b, "TCP socket reader terminated", new Object[0]);
    }
}
