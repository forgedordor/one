package defpackage;

import com.google.android.ims.rcsservice.businessinfo.BasePaymentResult;
import j$.util.Optional;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.security.SecureRandom;
import java.util.HashMap;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ebjv implements ebjr, ebjx {
    public final String a;
    public final ebix b;
    public final String c;
    public final List d;
    public final ewfe e;
    public final dhip f;
    public final HashMap g = new HashMap();
    public Optional h = Optional.empty();
    public final Set i = ekpg.i();
    private final String j;
    private final String k;
    private final ebjq l;
    private final SecureRandom m;

    public ebjv(String str, ebix ebixVar, String str2, String str3, String str4, ebjq ebjqVar, List list, SecureRandom secureRandom, Optional optional) {
        this.f = new dhip("MsrpSessionImpl[%s]", str);
        this.a = str;
        this.b = ebixVar;
        this.j = str2;
        this.k = str3;
        this.c = str4;
        this.d = list;
        this.m = secureRandom;
        this.l = ebjqVar;
        ewfe ewfeVar = null;
        eomf eomfVar = (eomf) optional.orElse(null);
        if (eomfVar != null) {
            ewfd ewfdVar = (ewfd) ewfe.a.createBuilder();
            String str5 = eomfVar.a;
            ewfdVar.copyOnWrite();
            ewfe ewfeVar2 = (ewfe) ewfdVar.instance;
            str5.getClass();
            ewfeVar2.b |= 1;
            ewfeVar2.c = str5;
            ejwl.l(eomfVar.c());
            int i = eomfVar.b;
            ewfdVar.copyOnWrite();
            ewfe ewfeVar3 = (ewfe) ewfdVar.instance;
            ewfeVar3.b |= 2;
            ewfeVar3.d = i;
            ewfeVar = (ewfe) ewfdVar.build();
        }
        this.e = ewfeVar;
    }

    private final String g() {
        byte[] bArr = new byte[8];
        this.m.nextBytes(bArr);
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 8; i++) {
            sb.append(String.format("%02x", Byte.valueOf(bArr[i])));
        }
        return sb.toString();
    }

    private final void h(ebjj ebjjVar) {
        if (this.h.isPresent() && ebjjVar.c().equals(((ebjo) this.h.get()).a())) {
            this.h = Optional.empty();
        }
    }

    private final void i(ByteBuffer byteBuffer) {
        byte[] bArrArray = byteBuffer.array();
        ebix ebixVar = this.b;
        synchronized (ebixVar) {
            int iArrayOffset = byteBuffer.arrayOffset();
            int iPosition = byteBuffer.position();
            if (((Boolean) dfbu.g.a()).booleanValue() && dfoq.o()) {
                ebep ebepVar = new ebep(ebixVar.a());
                ebepVar.write(bArrArray, iArrayOffset, iPosition);
                ebepVar.flush();
                dhja.d(ebix.a, "Msrp message: %s", new String(ebepVar.a.array(), StandardCharsets.UTF_8));
            } else {
                ebixVar.a().write(bArrArray, iArrayOffset, iPosition);
                ebixVar.a().flush();
            }
        }
    }

    @Override // defpackage.ebjr
    public final void a() {
        dhja.d(this.f, "Starting MSRP media session", new Object[0]);
        ebix ebixVar = this.b;
        ebixVar.e = this;
        Object obj = ebixVar.c;
        synchronized (obj) {
            if (ebixVar.b == null) {
                dhja.c("Waiting for connection to be established", new Object[0]);
                long jIntValue = ((Integer) dfoq.c().a.c.a()).intValue() * 1000;
                long jCurrentTimeMillis = System.currentTimeMillis();
                while (ebixVar.b == null) {
                    long jCurrentTimeMillis2 = jIntValue - (System.currentTimeMillis() - jCurrentTimeMillis);
                    if (jCurrentTimeMillis2 <= 0) {
                        break;
                    } else {
                        try {
                            obj.wait(jCurrentTimeMillis2);
                        } catch (InterruptedException unused) {
                        }
                    }
                }
            }
            InputStream inputStream = ebixVar.b;
            if (inputStream != null) {
                ebixVar.d = new ebjl(ebixVar.g, ebixVar.e, inputStream);
                ebixVar.d.start();
            }
        }
        if (this.b.c()) {
            dhja.d(this.f, "Sending initial empty request", new Object[0]);
            ebjj ebjjVar = new ebjj();
            ebjjVar.e("yes");
            ebjjVar.g();
            ebjjVar.k = true;
            b(ebjjVar);
        }
        dhja.d(this.f, "MSRP media session started", new Object[0]);
    }

    @Override // defpackage.ebjr
    public final void b(ebjj ebjjVar) {
        if (ebjjVar.b() == null) {
            ebjjVar.f(g());
        }
        ebit ebitVar = new ebit();
        ebitVar.b("To-Path", this.j);
        ebitVar.b("From-Path", this.k);
        String strB = ebjjVar.b();
        if (strB == null) {
            strB = g();
            ebjjVar.f(strB);
        }
        ebitVar.b("Message-ID", strB);
        String str = ebjjVar.j;
        if (str != null) {
            ebitVar.b("Failure-Report", str);
        }
        String str2 = ebjjVar.i;
        if (str2 != null) {
            ebitVar.b("Success-Report", str2);
        }
        ebjjVar.g = ebitVar;
        dhip dhipVar = this.f;
        dhja.l(dhipVar, "sendMessage (MSRP session ID:%s):\n%s", this.a, ebjjVar);
        try {
            try {
                String str3 = ebjjVar.j;
                ebjn ebjnVarC = c(ebjjVar, str3 == null || "yes".equals(str3));
                if (ebjjVar.m) {
                    dhja.w(11, 3, "MSRP message cancelled", new Object[0]);
                    d(ebjjVar);
                } else if (ebjnVarC == null) {
                    dhja.r(dhipVar, "No response received for MSRP message: %s", ebjjVar.b());
                    f(ebjjVar, 2);
                } else {
                    int i = ebjnVarC.a;
                    if (i >= 400) {
                        dhja.w(14, 5, "Received error response code %d for MSRP message", Integer.valueOf(i));
                        ekqh it = ((ekgb) this.d).iterator();
                        while (it.hasNext()) {
                            ((ebjc) it.next()).aP(this, ebjjVar, ebjnVarC);
                        }
                    } else {
                        if (i == 200) {
                            dhja.d(dhipVar, "Timestamp for %s MSRP_OK_RESPONSE: %d", ebjjVar.h, dhkl.a());
                            i = 200;
                        }
                        dhja.w(16, 3, "Received successful response code %d for MSRP message", Integer.valueOf(i));
                        ekqh it2 = ((ekgb) this.d).iterator();
                        while (it2.hasNext()) {
                            ((ebjc) it2.next()).aN(this, ebjjVar);
                        }
                        if (dzfj.i() && dfoi.d()) {
                            dzfj.a().e(new dzfh("msrpMessageSent"));
                        }
                    }
                }
            } catch (IOException e) {
                dhja.j(e, this.f, "Error while sending a message: %s", ebjjVar);
                f(ebjjVar, 4);
            }
        } finally {
            h(ebjjVar);
        }
    }

    public final ebjn c(ebjj ebjjVar, boolean z) throws IOException {
        boolean z2;
        ebjn ebjnVar;
        ebjp ebjpVar = new ebjp(this.l, ebjjVar);
        while (true) {
            ebjn ebjnVar2 = null;
            while (ebjpVar.f) {
                if (ebjjVar.m && (ebjnVar = ebjjVar.n) != null) {
                    return ebjnVar;
                }
                ByteBuffer next = ebjpVar.next();
                dhip dhipVar = this.f;
                dhja.d(dhipVar, "Sending chunk for message ID: %s. Transaction ID: %s.", ebjjVar.b(), ebjjVar.c());
                if (z) {
                    this.h = Optional.of(new ebjo(ebjjVar));
                    z2 = true;
                } else {
                    z2 = false;
                }
                i(next);
                ebjjVar.q = dhkl.a().longValue();
                if (z2) {
                    String strC = ebjjVar.c();
                    dhja.d(dhipVar, "Wait transaction (id=%s) response for: %d seconds", strC, Integer.valueOf(dfoq.a()));
                    if (this.h.isEmpty()) {
                        dhja.h(dhipVar, "Wait for response but there is no countdown latch for transaction ID: %s", strC);
                    } else {
                        try {
                            ((ebjo) this.h.get()).await(dfoq.a(), TimeUnit.SECONDS);
                        } catch (InterruptedException e) {
                            dhja.j(e, this.f, "Wait for response has been interrupted for transaction ID: %s, the session has been stopped.", strC);
                        }
                        ebjn ebjnVar3 = ((ebjo) this.h.get()).b;
                        if (ebjnVar3 == null) {
                            dhja.h(this.f, "No response for transaction id=%s", strC);
                        } else {
                            if (ebjnVar3.a == 413) {
                                dhja.r(this.f, "Received 413 STOP_SEND response for transaction ID: %s", strC);
                                ebjjVar.n = ebjnVar3;
                                ebjjVar.m = true;
                            }
                            ebjnVar2 = ebjnVar3;
                        }
                    }
                }
            }
            dhja.d(this.f, "Timestamp for %s SENT_CONTENT_OVER_MSRP: %d", ebjjVar.h, Long.valueOf(ebjjVar.q));
            return z ? ebjnVar2 : new ebjn(ebjjVar.c(), BasePaymentResult.ERROR_REQUEST_FAILED, "OK");
        }
    }

    public final void d(ebjj ebjjVar) {
        ekqh it = ((ekgb) this.d).iterator();
        while (it.hasNext()) {
            ((ebjc) it.next()).aO(this, ebjjVar);
        }
    }

    public final void e(ebjn ebjnVar, ebjm ebjmVar) {
        int i = ebjnVar.a;
        Integer numValueOf = Integer.valueOf(i);
        dhja.w(20, 3, "Sending MSRP response: %d", numValueOf);
        String str = ebjnVar.d;
        dhja.c("Sending MSRP response: %d, id: %s", numValueOf, str);
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[4000]);
        ebjq.c(byteBufferWrap, str, String.valueOf(i) + " " + ebjnVar.b);
        String strF = ebjnVar.f();
        if (strF == null) {
            throw new IllegalStateException("expected non-null `to`");
        }
        ebjq.b(byteBufferWrap, ebjb.i, strF.getBytes());
        String strD = ebjnVar.d();
        if (strD == null) {
            throw new IllegalStateException("expected non-null `from`");
        }
        ebjq.b(byteBufferWrap, ebjb.j, strD.getBytes());
        ebjq.a(byteBufferWrap, str, 36);
        i(byteBufferWrap);
        ekqh it = ((ekgb) this.d).iterator();
        while (it.hasNext()) {
            ((ebjc) it.next()).aR(this, ebjnVar, ebjmVar);
        }
    }

    public final void f(ebjj ebjjVar, int i) {
        ekqh it = ((ekgb) this.d).iterator();
        while (it.hasNext()) {
            ((ebjc) it.next()).bi(this, ebjjVar, i);
        }
    }

    public final String toString() {
        dhiz dhizVar = dhiz.PHONE_NUMBER;
        return "MsrpSession for session ID " + this.a + "\r\n To: " + dhizVar.c(this.j) + "\r\n From: " + dhizVar.c(this.k) + "\r\n Connection: " + this.b.toString();
    }
}
