package defpackage;

import android.net.QosCallback;
import android.net.QosCallbackException;
import android.net.QosSession;
import android.net.QosSessionAttributes;
import android.telephony.data.EpsBearerQosSessionAttributes;
import android.telephony.data.NrQosSessionAttributes;
import j$.util.Collection;
import j$.util.function.Consumer$CC;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class ebfb extends QosCallback {
    final /* synthetic */ kog a;
    final /* synthetic */ Socket b;
    final /* synthetic */ ebfc c;

    public ebfb(ebfc ebfcVar, kog kogVar, Socket socket) {
        this.a = kogVar;
        this.b = socket;
        this.c = ebfcVar;
    }

    public final void onError(QosCallbackException qosCallbackException) {
        this.a.c(qosCallbackException);
        this.c.f.a(qosCallbackException);
    }

    public final void onQosSessionAvailable(QosSession qosSession, QosSessionAttributes qosSessionAttributes) throws IOException {
        dhja.k("[SR] QoS session available.", new Object[0]);
        final ewhq ewhqVar = (ewhq) ewhs.a.createBuilder();
        try {
            if (qosSession.getSessionType() == 1) {
                EpsBearerQosSessionAttributes epsBearerQosSessionAttributes = (EpsBearerQosSessionAttributes) qosSessionAttributes;
                int qosIdentifier = epsBearerQosSessionAttributes.getQosIdentifier();
                ewhqVar.copyOnWrite();
                ewhs ewhsVar = (ewhs) ewhqVar.instance;
                ewhsVar.b |= 4;
                ewhsVar.e = qosIdentifier;
                long guaranteedUplinkBitRateKbps = epsBearerQosSessionAttributes.getGuaranteedUplinkBitRateKbps();
                ewhqVar.copyOnWrite();
                ewhs ewhsVar2 = (ewhs) ewhqVar.instance;
                ewhsVar2.b |= 8;
                ewhsVar2.f = guaranteedUplinkBitRateKbps;
                long guaranteedDownlinkBitRateKbps = epsBearerQosSessionAttributes.getGuaranteedDownlinkBitRateKbps();
                ewhqVar.copyOnWrite();
                ewhs ewhsVar3 = (ewhs) ewhqVar.instance;
                ewhsVar3.b |= 16;
                ewhsVar3.g = guaranteedDownlinkBitRateKbps;
                Collection.EL.stream(epsBearerQosSessionAttributes.getRemoteAddresses()).forEach(new Consumer() { // from class: ebfd
                    @Override // java.util.function.Consumer
                    /* renamed from: accept */
                    public final void z(Object obj) {
                        ewhqVar.a(ebff.b((InetSocketAddress) obj));
                    }

                    public final /* synthetic */ Consumer andThen(Consumer consumer) {
                        return Consumer$CC.$default$andThen(this, consumer);
                    }
                });
            } else if (qosSession.getSessionType() == 2) {
                NrQosSessionAttributes nrQosSessionAttributes = (NrQosSessionAttributes) qosSessionAttributes;
                int qosIdentifier2 = nrQosSessionAttributes.getQosIdentifier();
                ewhqVar.copyOnWrite();
                ewhs ewhsVar4 = (ewhs) ewhqVar.instance;
                ewhsVar4.b |= 4;
                ewhsVar4.e = qosIdentifier2;
                long guaranteedUplinkBitRateKbps2 = nrQosSessionAttributes.getGuaranteedUplinkBitRateKbps();
                ewhqVar.copyOnWrite();
                ewhs ewhsVar5 = (ewhs) ewhqVar.instance;
                ewhsVar5.b |= 8;
                ewhsVar5.f = guaranteedUplinkBitRateKbps2;
                long guaranteedDownlinkBitRateKbps2 = nrQosSessionAttributes.getGuaranteedDownlinkBitRateKbps();
                ewhqVar.copyOnWrite();
                ewhs ewhsVar6 = (ewhs) ewhqVar.instance;
                ewhsVar6.b |= 16;
                ewhsVar6.g = guaranteedDownlinkBitRateKbps2;
                Collection.EL.stream(nrQosSessionAttributes.getRemoteAddresses()).forEach(new Consumer() { // from class: ebfe
                    @Override // java.util.function.Consumer
                    /* renamed from: accept */
                    public final void z(Object obj) {
                        ewhqVar.a(ebff.b((InetSocketAddress) obj));
                    }

                    public final /* synthetic */ Consumer andThen(Consumer consumer) {
                        return Consumer$CC.$default$andThen(this, consumer);
                    }
                });
            }
        } catch (ClassCastException unused) {
            dhja.d(dhja.b, "Could not cast QosSessionAttributes", new Object[0]);
        }
        ebfc ebfcVar = this.c;
        ewhm ewhmVar = (ewhm) ewhp.a.createBuilder();
        int sessionId = qosSession.getSessionId();
        ewhqVar.copyOnWrite();
        ewhs ewhsVar7 = (ewhs) ewhqVar.instance;
        ewhsVar7.b |= 1;
        ewhsVar7.c = sessionId;
        int iD = ebff.d(qosSession.getSessionType());
        ewhqVar.copyOnWrite();
        ewhs ewhsVar8 = (ewhs) ewhqVar.instance;
        ewhsVar8.d = iD - 1;
        ewhsVar8.b |= 2;
        ewhmVar.copyOnWrite();
        ewhp ewhpVar = (ewhp) ewhmVar.instance;
        ewhs ewhsVar9 = (ewhs) ewhqVar.build();
        ewhsVar9.getClass();
        ewhpVar.d = ewhsVar9;
        ewhpVar.b |= 2;
        ewhmVar.copyOnWrite();
        ewhp ewhpVar2 = (ewhp) ewhmVar.instance;
        ewhpVar2.e = 2;
        ewhpVar2.b |= 4;
        ebfcVar.f.c((ewhp) ewhmVar.build(), 3);
        try {
            if (qosSession.getSessionType() == 1) {
                EpsBearerQosSessionAttributes epsBearerQosSessionAttributes2 = (EpsBearerQosSessionAttributes) qosSessionAttributes;
                int qosIdentifier3 = epsBearerQosSessionAttributes2.getQosIdentifier();
                List remoteAddresses = epsBearerQosSessionAttributes2.getRemoteAddresses();
                dhja.c("[SR] EpsBearerQosSessionAttributes: [ qosIdentifier = %d, remoteAddresses = %s]", Integer.valueOf(qosIdentifier3), Arrays.toString(ekjz.g(remoteAddresses, new ejvr() { // from class: ebfa
                    @Override // defpackage.ejvr
                    public final Object apply(Object obj) {
                        return ((InetSocketAddress) obj).toString();
                    }
                }).toArray()));
                ebfc.c(qosIdentifier3);
                ebfc.d(remoteAddresses, this.b);
            } else {
                if (qosSession.getSessionType() != 2) {
                    throw new IOException("Unknown QoS session type.");
                }
                NrQosSessionAttributes nrQosSessionAttributes2 = (NrQosSessionAttributes) qosSessionAttributes;
                int qosIdentifier4 = nrQosSessionAttributes2.getQosIdentifier();
                List remoteAddresses2 = nrQosSessionAttributes2.getRemoteAddresses();
                dhja.c("[SR] NrQosSessionAttributes: [ qosIdentifier = %d, remoteAddresses = %s]", Integer.valueOf(qosIdentifier4), Arrays.toString(ekjz.g(remoteAddresses2, new ejvr() { // from class: ebfa
                    @Override // defpackage.ejvr
                    public final Object apply(Object obj) {
                        return ((InetSocketAddress) obj).toString();
                    }
                }).toArray()));
                ebfc.c(qosIdentifier4);
                ebfc.d(remoteAddresses2, this.b);
            }
        } catch (IOException | ClassCastException e) {
            this.a.c(e);
            this.c.f.a(e);
        }
        this.a.b(this);
    }

    public final void onQosSessionLost(QosSession qosSession) {
        dhja.q("[SR] QoS session lost.", new Object[0]);
        ebfc ebfcVar = this.c;
        ebfcVar.g.a.aS();
        ewhm ewhmVar = (ewhm) ewhp.a.createBuilder();
        ewhq ewhqVar = (ewhq) ewhs.a.createBuilder();
        int sessionId = qosSession.getSessionId();
        ewhqVar.copyOnWrite();
        ewhs ewhsVar = (ewhs) ewhqVar.instance;
        ewhsVar.b |= 1;
        ewhsVar.c = sessionId;
        int iD = ebff.d(qosSession.getSessionType());
        ewhqVar.copyOnWrite();
        ewhs ewhsVar2 = (ewhs) ewhqVar.instance;
        ewhsVar2.d = iD - 1;
        ewhsVar2.b |= 2;
        ewhmVar.copyOnWrite();
        ewhp ewhpVar = (ewhp) ewhmVar.instance;
        ewhs ewhsVar3 = (ewhs) ewhqVar.build();
        ewhsVar3.getClass();
        ewhpVar.d = ewhsVar3;
        ewhpVar.b |= 2;
        ewhmVar.copyOnWrite();
        ewhp ewhpVar2 = (ewhp) ewhmVar.instance;
        ewhpVar2.e = 3;
        ewhpVar2.b |= 4;
        ebfcVar.f.c((ewhp) ewhmVar.build(), 3);
    }
}
