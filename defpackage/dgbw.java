package defpackage;

import android.telephony.ims.SipDelegateConfiguration;
import android.telephony.ims.SipDelegateConnection;
import android.telephony.ims.SipMessage;
import j$.util.DesugarCollections;
import j$.util.Optional;
import j$.util.function.Predicate$CC;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import java.util.function.Predicate;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dgbw implements ebqv {
    public static final dhip a = new dhip("SipRegistrationSipTransport");
    public ebrg b;
    public SipDelegateConfiguration c;
    private final SipDelegateConnection e;
    public final Map d = DesugarCollections.synchronizedMap(new HashMap());
    private final UUID f = UUID.randomUUID();

    public dgbw(SipDelegateConnection sipDelegateConnection, SipDelegateConfiguration sipDelegateConfiguration) {
        this.e = sipDelegateConnection;
        this.c = sipDelegateConfiguration;
    }

    @Override // defpackage.ebqv
    public final int a() {
        return this.c.getLocalAddress().getPort();
    }

    @Override // defpackage.ebqv
    public final int b() {
        return this.c.getSipServerAddress().getPort();
    }

    @Override // defpackage.ebqv
    public final String c() {
        return "";
    }

    @Override // defpackage.ebqv
    public final String d() {
        return this.f.toString();
    }

    @Override // defpackage.ebqv
    public final String e() {
        String hostAddress = this.c.getLocalAddress().getAddress().getHostAddress();
        hostAddress.getClass();
        return hostAddress;
    }

    @Override // defpackage.ebqv
    public final String f() {
        String hostAddress = this.c.getSipServerAddress().getAddress().getHostAddress();
        hostAddress.getClass();
        return hostAddress;
    }

    public final void g(ebpc ebpcVar, boolean z) {
        if (ebpcVar == null) {
            return;
        }
        SipDelegateConnection sipDelegateConnection = this.e;
        if (z || ebpcVar.t()) {
            String strH = ebpcVar.h();
            if (!"BYE".equals(ebpcVar.i()) || strH == null) {
                return;
            }
            sipDelegateConnection.cleanupSession(strH);
        }
    }

    @Override // defpackage.ebqv
    public final void i(ebpc ebpcVar) {
        long version = this.c.getVersion();
        ebov ebovVarF = ebpcVar.f();
        ebovVarF.getClass();
        String strB = ebovVarF.b();
        strB.getClass();
        int iIntValue = ((Integer) Optional.ofNullable(Integer.valueOf(this.c.getMaxUdpPayloadSizeBytes())).filter(new Predicate() { // from class: dgbv
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
                return ((Integer) obj).intValue() > 0;
            }
        }).orElse(1300)).intValue();
        SipMessage sipMessageA = dgai.a(ebpcVar);
        if (sipMessageA.getStartLine().length() + sipMessageA.getHeaderSection().length() + sipMessageA.getContent().length > iIntValue) {
            ebov ebovVarF2 = ebpcVar.f();
            ebovVarF2.getClass();
            ebovVarF2.p(ebmr.TCP.d);
            sipMessageA = dgai.a(ebpcVar);
        }
        this.d.put(strB, ebpcVar);
        this.e.sendMessage(sipMessageA, version);
    }

    @Override // defpackage.ebqv
    public final void j(ebqw ebqwVar) {
        throw new UnsupportedOperationException("Cannot set unused SipTransportErrorListener for Single-Reg SipTransport");
    }

    @Override // defpackage.ebqv
    public final void k(ebrg ebrgVar) {
        this.b = ebrgVar;
    }

    @Override // defpackage.ebqv
    public final void l() {
        try {
            ebrg ebrgVar = this.b;
            if (ebrgVar != null) {
                ebrgVar.d();
            }
        } catch (IllegalMonitorStateException | UnsupportedOperationException e) {
            dhja.j(e, a, "Caught exception in SingleRegistrationSipTransport#terminate", new Object[0]);
        }
    }

    @Override // defpackage.ebqv
    public final boolean n() {
        return false;
    }

    @Override // defpackage.ebqv
    public final boolean o() {
        return false;
    }

    @Override // defpackage.ebqv
    public final void h() {
    }

    @Override // defpackage.ebqv
    public final void m(int i) {
    }
}
