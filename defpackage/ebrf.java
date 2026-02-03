package defpackage;

import android.content.Context;
import android.net.Network;
import android.os.PowerManager;
import j$.util.Optional;
import java.io.IOException;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.util.Arrays;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;
import javax.net.ssl.SNIHostName;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ebrf implements ebqv {
    public static final dfny a = dfod.a(181030825);
    public final dhip b;
    public ebqw c;
    public ebrg d;
    public final PowerManager.WakeLock g;
    private final String j;
    private final String k;
    private final int l;
    private int m;
    private final ebmr n;
    private final String o;
    private final ebfl p;
    private final Network q;
    private final deym r;
    private final UUID i = UUID.randomUUID();
    public ebfw e = null;
    private ebre s = null;
    public long f = -1;
    final AtomicInteger h = new AtomicInteger(0);

    public ebrf(Context context, Network network, String str, int i, String str2, int i2, String str3, deym deymVar, dhip dhipVar, ebfl ebflVar, ebmr ebmrVar) {
        this.q = network;
        this.j = str;
        this.m = i;
        this.k = str2;
        this.l = i2;
        this.o = str3;
        this.r = deymVar;
        this.b = dhipVar;
        this.p = ebflVar;
        this.n = ebmrVar;
        this.g = dhkk.a(context).newWakeLock(1, "CarrierServices:SipTransport");
    }

    private final ewnt t() {
        return this.n == ebmr.TCP ? ewnt.SOCKET_PROTOCOL_TYPE_TCP : ewnt.SOCKET_PROTOCOL_TYPE_TLS;
    }

    @Override // defpackage.ebqv
    public final int a() {
        return this.m;
    }

    @Override // defpackage.ebqv
    public final int b() {
        return this.l;
    }

    @Override // defpackage.ebqv
    public final String c() {
        return this.o;
    }

    @Override // defpackage.ebqv
    public final String d() {
        return this.i.toString();
    }

    @Override // defpackage.ebqv
    public final String e() {
        return this.j;
    }

    @Override // defpackage.ebqv
    public final String f() {
        return this.k;
    }

    final synchronized void g(final Network network) {
        String str;
        ebfw ebfwVar;
        try {
            ewnt ewntVarT = t();
            deym deymVar = this.r;
            String str2 = this.j;
            String str3 = this.k;
            int i = this.l;
            if (deymVar.o()) {
                str = str3;
            } else {
                dhja.o("Logging socket opening event, protocol type = %s", ewntVarT);
                str = str3;
                ewnm ewnmVarQ = deymVar.q(ewntVarT, deym.r(str2), str, i, deym.r(str));
                i = i;
                ewnmVarQ.copyOnWrite();
                ewnx ewnxVar = (ewnx) ewnmVarQ.instance;
                ewnx ewnxVar2 = ewnx.a;
                ewnxVar.d = 1;
                ewnxVar.b |= 2;
                deymVar.l((ewnx) ewnmVarQ.build());
            }
            ebft ebftVar = new ebft() { // from class: ebrd
                @Override // defpackage.ebft
                public final InetAddress a(Socket socket, String str4) throws IOException {
                    Network network2 = network;
                    ebrf ebrfVar = this.a;
                    dhja.l(ebrfVar.b, "Binding socket to network [%s]", network2);
                    try {
                        network2.bindSocket(socket);
                        if (str4 == null) {
                            return null;
                        }
                        try {
                            return network2.getByName(str4);
                        } catch (IOException e) {
                            dhja.j(e, ebrfVar.b, "error resolving static PCSCF host [%s] while connecting SIP transport", str4);
                            throw e;
                        }
                    } catch (IOException e2) {
                        dhja.j(e2, ebrfVar.b, "error binding socket to network [%s]", network2);
                        throw e2;
                    }
                }
            };
            if (n()) {
                dhja.d(this.b, "Creating a TCP socket connection", new Object[0]);
                ebfwVar = this.p.a(ebftVar, str, i, Optional.empty());
            } else {
                dhja.c("Creating a TLS socket connection", new Object[0]);
                final ebfl ebflVar = this.p;
                final String str4 = this.o;
                String str5 = str;
                str = str5;
                ebfwVar = new ebfw(new ebfv() { // from class: ebfh
                    @Override // defpackage.ebfv
                    public final Socket a() {
                        int iA;
                        SSLSocket sSLSocket = (SSLSocket) ebflVar.d().createSocket();
                        sSLSocket.setUseClientMode(true);
                        if (dfpo.a() > 0 && (iA = (int) dfps.a()) > 0) {
                            sSLSocket.setSoTimeout(iA);
                        }
                        String str6 = str4;
                        if (ejwk.c(str6)) {
                            dhja.q("Invalid host, cannot setup host verification!", new Object[0]);
                            return sSLSocket;
                        }
                        if (eomh.b(str6)) {
                            dhja.c("Skipping host verification for IP address: %s", str6);
                            return sSLSocket;
                        }
                        if (((Boolean) ebfl.a.a()).booleanValue()) {
                            dhja.c("Enabling SNI.", new Object[0]);
                            SSLParameters sSLParameters = sSLSocket.getSSLParameters();
                            if (sSLParameters == null) {
                                sSLParameters = new SSLParameters();
                            }
                            sSLParameters.setServerNames(Arrays.asList(new SNIHostName(str6)));
                            sSLSocket.setSSLParameters(sSLParameters);
                        }
                        ebgg ebggVar = this;
                        dhja.c("Setting up host for verification: %s", str6);
                        sSLSocket.addHandshakeCompletedListener(new ebgh(str6, ebggVar));
                        return sSLSocket;
                    }
                }, ebftVar, str5, i, Optional.empty());
            }
            this.e = ebfwVar;
            ebfwVar.d();
            this.e.b();
            dhja.w(21, 3, "SIP connection established", new Object[0]);
            String str6 = str;
            ewnt ewntVarT2 = t();
            if (deymVar.o()) {
                return;
            }
            dhja.o("Logging socket opened event, protocol type = %s", ewntVarT2);
            ewnm ewnmVarQ2 = deymVar.q(ewntVarT2, deym.r(str2), str6, i, deym.r(str6));
            ewnmVarQ2.copyOnWrite();
            ewnx ewnxVar3 = (ewnx) ewnmVarQ2.instance;
            ewnx ewnxVar4 = ewnx.a;
            ewnxVar3.d = 2;
            ewnxVar3.b |= 2;
            deymVar.l((ewnx) ewnmVarQ2.build());
        } catch (IOException e) {
            l();
            q(ewnq.SOCKET_FAILURE_UNABLE_TO_OPEN);
            throw new ebqu(e);
        }
    }

    @Override // defpackage.ebqv
    public final synchronized void h() {
        if (this.h.compareAndSet(0, 1)) {
            g(this.q);
            ebre ebreVar = new ebre(this);
            this.s = ebreVar;
            ebreVar.start();
        }
    }

    @Override // defpackage.ebqv
    public final synchronized void i(ebpc ebpcVar) {
        ebmn ebmnVar;
        String strU = ebpcVar.s() ? ebpcVar.u(2) : (ebpcVar.t() && ((ebpe) ebpcVar).A()) ? ebpcVar.v("ACK", 2) : null;
        try {
            this.d.getClass();
            if (this.s == null) {
                h();
            }
            byte[] bArrB = ebpcVar.b();
            if (bArrB == null) {
                throw new ebmn("SIP message to send is null");
            }
            dhip dhipVar = this.b;
            int i = ebpcVar.l;
            dhja.d(dhipVar, ">>>>>>>>>> SIP send message[%s] started (%d bytes) [%s]", ebpb.a(i), Integer.valueOf(bArrB.length), strU);
            ebfw ebfwVar = this.e;
            if (ebfwVar == null) {
                s(2);
                dhja.h(dhipVar, "<<<<<<<<<< SIP message aborted [%s]: client socket is null", strU);
                if (ebpcVar.s() && strU != null) {
                    this.d.a(strU);
                }
            } else {
                OutputStream outputStreamB = ebfwVar.b();
                outputStreamB.write(bArrB);
                outputStreamB.flush();
                dhja.d(dhipVar, "<<<<<<<<<< SIP message[%s] sent [%s]", ebpb.a(i), strU);
                if (!ebpcVar.r()) {
                    this.d.b(ebpcVar);
                }
            }
        } catch (ebqu | IOException e) {
            s(3);
            dhip dhipVar2 = this.b;
            dhja.j(e, dhipVar2, "<<<<<<<<<< SIP message[%s] failed [%s]: %s", ebpb.a(ebpcVar.l), strU, e.getMessage());
            q(ewnq.SOCKET_FAILURE_WRITE_ERROR);
            p();
            if (e instanceof ebmn) {
                ebmnVar = (ebmn) e;
            } else {
                ebmnVar = new ebmn(dhipVar2.a + ": Can't send message: " + e.getMessage(), e);
            }
            ebqw ebqwVar = this.c;
            if (ebqwVar != null) {
                ebqwVar.a(d(), ebmnVar);
            } else {
                dhja.r(dhipVar2, "SipTransportErrorListener is null", new Object[0]);
            }
            throw ebmnVar;
        }
    }

    @Override // defpackage.ebqv
    public final void j(ebqw ebqwVar) {
        this.c = ebqwVar;
    }

    @Override // defpackage.ebqv
    public final void k(ebrg ebrgVar) {
        this.d = ebrgVar;
    }

    @Override // defpackage.ebqv
    public final synchronized void l() {
        if (this.h.compareAndSet(1, 2)) {
            ebre ebreVar = this.s;
            if (ebreVar != null) {
                ebreVar.interrupt();
            }
            r();
        }
    }

    @Override // defpackage.ebqv
    public final void m(int i) {
        this.m = i;
    }

    @Override // defpackage.ebqv
    public final boolean n() {
        return this.n == ebmr.TCP;
    }

    @Override // defpackage.ebqv
    public final boolean o() {
        return this.n == ebmr.TLS;
    }

    final synchronized void p() {
        ewnt ewntVarT;
        deym deymVar;
        String str;
        String str2;
        int i;
        try {
            ebfw ebfwVar = this.e;
            if (ebfwVar != null) {
                ebfwVar.c();
            }
            dhja.w(22, 3, "SIP connection disconnected", new Object[0]);
            ewntVarT = t();
            deymVar = this.r;
            str = this.j;
            str2 = this.k;
            i = this.l;
        } catch (Exception e) {
            dhja.t(e, this.b, "Unable to close socket", new Object[0]);
            q(ewnq.SOCKET_FAILURE_UNABLE_TO_CLOSE);
        }
        if (deymVar.o()) {
            this.e = null;
        } else {
            dhja.o("Logging socket closed event, protocol type = %s", ewntVarT);
            ewnm ewnmVarQ = deymVar.q(ewntVarT, deym.r(str), str2, i, deym.r(str2));
            ewnmVarQ.copyOnWrite();
            ewnx ewnxVar = (ewnx) ewnmVarQ.instance;
            ewnx ewnxVar2 = ewnx.a;
            ewnxVar.d = 4;
            ewnxVar.b |= 2;
            deymVar.l((ewnx) ewnmVarQ.build());
            this.e = null;
        }
    }

    public final void q(ewnq ewnqVar) {
        deym deymVar = this.r;
        ewnt ewntVarT = t();
        long j = this.f;
        if (deymVar.o()) {
            return;
        }
        int i = this.l;
        String str = this.k;
        String str2 = this.j;
        dhja.o("Logging socket failure event, protocol type = %s, reason = %s", ewntVarT, ewnqVar);
        ewnm ewnmVarQ = deymVar.q(ewntVarT, deym.r(str2), str, i, deym.r(str));
        ewnmVarQ.copyOnWrite();
        ewnx ewnxVar = (ewnx) ewnmVarQ.instance;
        ewnx ewnxVar2 = ewnx.a;
        ewnxVar.d = 3;
        ewnxVar.b |= 2;
        ewnmVarQ.copyOnWrite();
        ewnx ewnxVar3 = (ewnx) ewnmVarQ.instance;
        ewnxVar3.e = ewnqVar.j;
        ewnxVar3.b |= 4;
        ewnmVarQ.copyOnWrite();
        ewnx ewnxVar4 = (ewnx) ewnmVarQ.instance;
        ewnxVar4.b |= 512;
        ewnxVar4.l = j;
        deymVar.l((ewnx) ewnmVarQ.build());
    }

    public final void r() {
        p();
        this.s = null;
        try {
            this.d.d();
        } catch (Exception e) {
            s(4);
            dhja.j(e, this.b, "caught exception in SipTransport#teardown", new Object[0]);
        }
    }

    public final void s(int i) {
        this.r.s(d(), i);
    }
}
