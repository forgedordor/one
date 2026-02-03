package defpackage;

import android.net.Network;
import android.net.QosCallback;
import android.net.QosSocketInfo;
import com.google.common.util.concurrent.ListenableFuture;
import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class ebfc implements ebew {
    static final dfny a = dfnv.b("SingleRegistrationQosHandler_enableExpandedQci");
    static final dfny b = dfnv.b("SingleRegistrationQosHandler_disableQciVerification");
    public final eosc c;
    public final dhkr d;
    public final Network e;
    public final ebff f;
    public final ebjf g;
    private QosCallback h;

    public ebfc(eosc eoscVar, dhkr dhkrVar, Network network, ebjf ebjfVar, ebff ebffVar) {
        this.c = eoscVar;
        this.d = dhkrVar;
        this.e = network;
        this.g = ebjfVar;
        this.f = ebffVar;
    }

    public static void c(int i) throws IOException {
        if (((Boolean) b.a()).booleanValue()) {
            return;
        }
        if (!((Boolean) a.a()).booleanValue()) {
            if (i != 6) {
                throw new IOException(String.format("Wrong QCI: expected %d, got %d.", 6, Integer.valueOf(i)));
            }
        } else {
            evsx evsxVar = ((ewtm) dfog.o().a.A.a()).b;
            Integer numValueOf = Integer.valueOf(i);
            if (!evsxVar.contains(numValueOf)) {
                throw new IOException(String.format("Wrong QCI: expected %s, got %d.", evsxVar, numValueOf));
            }
        }
    }

    public static void d(List list, Socket socket) throws IOException {
        if (!((Boolean) dfog.o().a.y.a()).booleanValue() || dfog.o().M() || list == null || list.isEmpty()) {
            return;
        }
        InetAddress inetAddress = socket.getInetAddress();
        inetAddress.getClass();
        InetSocketAddress inetSocketAddress = new InetSocketAddress(inetAddress, socket.getPort());
        if (!list.contains(inetSocketAddress)) {
            throw new IOException(String.format("Client socket connected to %s. QoS session set for %s.", inetSocketAddress, Arrays.toString(list.toArray())));
        }
    }

    @Override // defpackage.ebew
    public final void a() {
        QosCallback qosCallback = this.h;
        if (qosCallback != null) {
            ((dhkq) this.d).a.unregisterQosCallback(qosCallback);
        }
    }

    @Override // defpackage.ebew
    public final void b(final Socket socket) throws IOException {
        dhja.k("[SR] Setting up the dedicated bearer.", new Object[0]);
        ewhm ewhmVar = (ewhm) ewhp.a.createBuilder();
        ewhmVar.copyOnWrite();
        ewhp ewhpVar = (ewhp) ewhmVar.instance;
        ewhpVar.e = 1;
        ewhpVar.b |= 4;
        this.f.c((ewhp) ewhmVar.build(), 2);
        ListenableFuture listenableFutureA = kol.a(new koi() { // from class: ebez
            @Override // defpackage.koi
            public final Object a(kog kogVar) throws dhkf {
                ebfc ebfcVar = this.a;
                Network network = ebfcVar.e;
                Socket socket2 = socket;
                QosSocketInfo qosSocketInfo = new QosSocketInfo(network, socket2);
                ebfb ebfbVar = new ebfb(ebfcVar, kogVar, socket2);
                dhkr dhkrVar = ebfcVar.d;
                try {
                    ((dhkq) dhkrVar).a.registerQosCallback(qosSocketInfo, ebfcVar.c, ebfbVar);
                    return "SingleRegistrationQosHandler#waitForDedicatedBearerSetup";
                } catch (SecurityException e) {
                    throw new dhkf("CONNECTIVITY_USE_RESTRICTED_NETWORKS permission is missing.", e);
                }
            }
        });
        Integer num = (Integer) dfog.o().a.p.a();
        try {
            this.h = (QosCallback) listenableFutureA.get(num.intValue(), TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            e = e;
            throw new IOException(e);
        } catch (ExecutionException e2) {
            e = e2;
            throw new IOException(e);
        } catch (TimeoutException e3) {
            dhja.g("Timed out while waiting for %d seconds for the dedicated bearer setup.", num);
            ebff ebffVar = this.f;
            ewhm ewhmVar2 = (ewhm) ewhp.a.createBuilder();
            ewhmVar2.copyOnWrite();
            ewhp ewhpVar2 = (ewhp) ewhmVar2.instance;
            ewhpVar2.c = 5;
            ewhpVar2.b = 1 | ewhpVar2.b;
            ewhmVar2.copyOnWrite();
            ewhp ewhpVar3 = (ewhp) ewhmVar2.instance;
            ewhpVar3.e = 3;
            ewhpVar3.b |= 4;
            ebffVar.c((ewhp) ewhmVar2.build(), 4);
            throw new IOException(e3);
        }
    }
}
