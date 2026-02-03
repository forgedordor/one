package defpackage;

import android.telephony.ims.SipMessage;
import android.telephony.ims.stub.DelegateConnectionMessageCallback;
import android.text.TextUtils;
import com.android.vcard.VCardBuilder;
import j$.util.DesugarArrays;
import j$.util.Optional;
import j$.util.function.Function$CC;
import j$.util.function.Predicate$CC;
import java.io.ByteArrayInputStream;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.function.Predicate;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dgau implements DelegateConnectionMessageCallback {
    private final dgbn a;
    private final dgbu b;
    private final String c;

    public dgau(dgbn dgbnVar, dgbu dgbuVar, String str) {
        this.a = dgbnVar;
        this.b = dgbuVar;
        this.c = str;
    }

    public final void onMessageReceived(SipMessage sipMessage) {
        try {
            dhja.l(this.a.i, "Message received. Actual content length:%d [%s]", Integer.valueOf(sipMessage.getContent().length), dhiz.MESSAGE_CONTENT.c("\n" + sipMessage.getStartLine() + sipMessage.getHeaderSection() + VCardBuilder.VCARD_END_OF_LINE + new String(sipMessage.getContent(), "UTF-8")));
        } catch (UnsupportedEncodingException unused) {
            dhja.h(this.a.i, "Failed to decode SipMessage.", new Object[0]);
        }
        dgbn dgbnVar = this.a;
        Optional optional = dgbnVar.I;
        if (optional.isPresent()) {
            optional.get();
            String startLine = sipMessage.getStartLine();
            String headerSection = sipMessage.getHeaderSection();
            if (sipMessage.getStartLine().startsWith("NOTIFY") && (sipMessage.getHeaderSection().contains("Event: conference") || sipMessage.getHeaderSection().contains("o: conference"))) {
                Integer num = (Integer) DesugarArrays.stream(headerSection.split("[\\r\\n]")).filter(new Predicate() { // from class: dgad
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
                        return ((String) obj).startsWith("Content-Length");
                    }
                }).findFirst().map(new Function() { // from class: dgae
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo536andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        List listI = ejxk.e("\\s*:\\s").i((String) obj);
                        return Integer.valueOf(listI.size() < 2 ? 0 : Integer.parseInt((String) listI.get(1)));
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                }).orElse(0);
                int iIntValue = num.intValue();
                dhja.c("Content length: %d", num);
                if (sipMessage.getContent().length >= iIntValue) {
                    dhja.c("Content is same or longer than content length", new Object[0]);
                } else {
                    String str = (String) DesugarArrays.stream(headerSection.split("[\\r\\n]")).filter(new Predicate() { // from class: dgaf
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
                            return ((String) obj).startsWith(ffho.a);
                        }
                    }).findFirst().map(new Function() { // from class: dgag
                        @Override // java.util.function.Function
                        /* renamed from: andThen */
                        public final /* synthetic */ Function mo536andThen(Function function) {
                            return Function$CC.$default$andThen(this, function);
                        }

                        @Override // java.util.function.Function
                        public final Object apply(Object obj) {
                            String strA = dfpy.a((String) obj);
                            dhja.c("Boundary - %s", strA);
                            return a.a(strA, "\r\n--", "--\r\n");
                        }

                        public final /* synthetic */ Function compose(Function function) {
                            return Function$CC.$default$compose(this, function);
                        }
                    }).orElse("");
                    dhja.c("Boundary: %s", str);
                    if (str.isEmpty()) {
                        dhja.q("No boundary is found in Content-Type header.", new Object[0]);
                    } else {
                        byte[] bytes = str.getBytes(StandardCharsets.UTF_8);
                        dhja.q("Adding %d padding bytes to SipMessage's content.", Integer.valueOf(iIntValue - sipMessage.getContent().length));
                        ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[iIntValue]);
                        byteBufferWrap.put(sipMessage.getContent());
                        byteBufferWrap.put(new byte[Math.max(0, (iIntValue - sipMessage.getContent().length) - bytes.length)]);
                        byteBufferWrap.put(bytes);
                        sipMessage = new SipMessage(startLine, headerSection, byteBufferWrap.array());
                    }
                }
            } else {
                dhja.o("No conference event. No need to fix.", new Object[0]);
            }
        }
        dgbw dgbwVar = dgbnVar.F;
        dgbwVar.getClass();
        try {
            byte[] bArrB = eomt.b((sipMessage.getStartLine() + sipMessage.getHeaderSection() + VCardBuilder.VCARD_END_OF_LINE).getBytes(StandardCharsets.UTF_8), sipMessage.getContent());
            int i = ebqg.a;
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArrB);
            try {
                ebpc ebpcVarA = ebqg.a(byteArrayInputStream);
                byteArrayInputStream.close();
                dgbwVar.g(ebpcVarA, false);
                ebrg ebrgVar = dgbwVar.b;
                if (ebrgVar != null) {
                    dhja.d(dgbw.a, ">>>>>>>>>> SIP message[%s] received (%d bytes) [Call-ID: %s]", ebpb.a(ebpcVarA.l), Integer.valueOf(ebpcVarA.a().length()), ebpcVarA.h());
                    ebrgVar.c(ebpcVarA);
                }
            } catch (Throwable th) {
                byteArrayInputStream.close();
                throw th;
            }
        } catch (ebml e) {
            dgbn dgbnVar2 = this.a;
            dhja.j(e, dgbnVar2.i, "Can't parse received message. %s", e.getMessage());
            dgbnVar2.C.s(dgbwVar.d(), 7);
        } catch (Throwable th2) {
            dgbn dgbnVar3 = this.a;
            dhja.j(th2, dgbnVar3.i, "Can't process received message. %s", th2.getMessage());
            dgbnVar3.C.s(dgbwVar.d(), 6);
        }
    }

    public final void onMessageSendFailure(String str, int i) {
        if (((Boolean) dgbn.d.a()).booleanValue()) {
            dgbu dgbuVar = this.b;
            dgbn dgbnVar = this.a;
            String str2 = this.c;
            String strA = dgbnVar.A();
            ewis ewisVar = (ewis) ewit.a.createBuilder();
            ewisVar.copyOnWrite();
            ewit ewitVar = (ewit) ewisVar.instance;
            strA.getClass();
            ewitVar.b |= 2;
            ewitVar.d = strA;
            ewisVar.copyOnWrite();
            ewit ewitVar2 = (ewit) ewisVar.instance;
            str2.getClass();
            ewitVar2.b |= 1;
            ewitVar2.c = str2;
            ewiu ewiuVar = (ewiu) ewiv.a.createBuilder();
            ewiuVar.copyOnWrite();
            ewiv ewivVar = (ewiv) ewiuVar.instance;
            str.getClass();
            ewivVar.b |= 1;
            ewivVar.c = str;
            ewiuVar.copyOnWrite();
            ewiv ewivVar2 = (ewiv) ewiuVar.instance;
            ewivVar2.b |= 2;
            ewivVar2.d = i;
            ewisVar.copyOnWrite();
            ewit ewitVar3 = (ewit) ewisVar.instance;
            ewiv ewivVar3 = (ewiv) ewiuVar.build();
            ewivVar3.getClass();
            ewitVar3.h = ewivVar3;
            ewitVar3.b |= 32;
            dgbuVar.b((ewit) ewisVar.build());
        }
        dgbw dgbwVar = this.a.F;
        dgbwVar.getClass();
        if (TextUtils.isEmpty(str)) {
            return;
        }
        Map map = dgbwVar.d;
        dgbwVar.g((ebpc) map.get(str), true);
        ebpc ebpcVar = (ebpc) map.remove(str);
        if (ebpcVar == null) {
            dhja.h(dgbw.a, "<<<<<<<<<< SIP message failed: reason code: %s", Integer.valueOf(i));
            return;
        }
        String strU = ebpcVar.u(2);
        dhja.h(dgbw.a, "<<<<<<<<<< SIP message[%s] failed [%s]: %s", ebpb.a(ebpcVar.l), strU, a.g(i, "reason code: "));
        ebrg ebrgVar = dgbwVar.b;
        if (!ebpcVar.s() || strU == null || ebrgVar == null) {
            return;
        }
        ebrgVar.a(strU);
    }

    public final void onMessageSent(String str) {
        dgbw dgbwVar = this.a.F;
        dgbwVar.getClass();
        ebpc ebpcVar = (ebpc) dgbwVar.d.remove(str);
        dgbwVar.g(ebpcVar, false);
        ebrg ebrgVar = dgbwVar.b;
        if (ebrgVar == null || ebpcVar == null) {
            return;
        }
        ebrgVar.b(ebpcVar);
    }
}
