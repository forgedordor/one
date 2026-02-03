package defpackage;

import android.content.Intent;
import com.google.android.ims.util.common.RcsIntents;
import j$.util.Objects;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dhbq extends dhgf {
    private static final dhip f = new dhip("RcsImsServiceDispatcher");
    private final dfcg g;

    public dhbq(dgwa dgwaVar, fcsu fcsuVar, dhjt dhjtVar, dfcg dfcgVar, epht ephtVar) {
        super(dgwaVar, fcsuVar, dhjtVar, dfcgVar, ephtVar);
        this.g = dfcgVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:55:0x0128, code lost:
    
        if (r14.j("Referred-By") != null) goto L56;
     */
    @Override // defpackage.dhgf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(defpackage.ebqr r14) throws defpackage.ebmn {
        /*
            Method dump skipped, instructions count: 415
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dhbq.a(ebqr):void");
    }

    @Override // defpackage.dhgf
    public final void b(ebqr ebqrVar) throws XmlPullParserException {
        String strJ;
        if (dfog.E() && (strJ = ebqrVar.j("Accept-Contact")) != null && dfog.E() && strJ.contains("urn%3Aurn-7%3A3gpp-service.ims.icsi.oma.cpm.msg")) {
            i(ebqrVar, 488, 24);
            return;
        }
        String strH = ebqrVar.h();
        if ("application/end-user-confirmation-request+xml".equals(strH)) {
            dgya dgyaVar = (dgya) this.d.b(dgya.class);
            if (!dgyaVar.r(ebqrVar)) {
                dgyaVar.q(ebqrVar);
                return;
            }
            ebqo ebqoVarC = ebqrVar.c("application/end-user-confirmation-request+xml");
            if (ebqoVarC == null) {
                return;
            }
            InputStream inputStreamA = ebqoVarC.a();
            dgxz dgxzVar = new dgxz();
            try {
                dgxzVar.a = dgxy.a(dgyaVar.a.c().mT1 * 64, inputStreamA);
                dgyaVar.g.put(dgxzVar.a.f, dgxzVar);
                if (dgxzVar.a.e == 2) {
                    try {
                        dgyaVar.p(ebqrVar);
                    } catch (dgyb e) {
                        dhja.i(e, "Error while sending confirmation request response: %s", e.getMessage());
                    }
                }
                dhbd dhbdVar = dgyaVar.h;
                if (dhbdVar != null) {
                    dgxy dgxyVar = dgxzVar.a;
                    Intent intent = new Intent(RcsIntents.ACTION_END_USER_CONFIRMATION_REQUEST);
                    intent.setFlags(805306368);
                    intent.putExtra(RcsIntents.EXTRA_REQUEST_ID, dgxyVar.f);
                    intent.putExtra(RcsIntents.EXTRA_SUBJECT, dgxyVar.b());
                    intent.putExtra(RcsIntents.EXTRA_TEXT, dgxyVar.c());
                    intent.putExtra(RcsIntents.EXTRA_BUTTON_POSITIVE, dgxy.d(dgxyVar.a));
                    intent.putExtra(RcsIntents.EXTRA_BUTTON_NEGATIVE, dgxy.d(dgxyVar.b));
                    intent.putExtra(RcsIntents.EXTRA_PIN_REQUIRED, dgxyVar.d);
                    intent.putExtra(RcsIntents.EXTRA_TIMEOUT, dgxyVar.c);
                    dhbdVar.a.startActivity(intent);
                    return;
                }
                return;
            } catch (IOException unused) {
                dhja.g("Error while parsing request", new Object[0]);
                return;
            }
        }
        if ("application/end-user-confirmation-ack+xml".equals(strH)) {
            dgya dgyaVar2 = (dgya) this.d.b(dgya.class);
            if (!dgyaVar2.r(ebqrVar)) {
                dgyaVar2.q(ebqrVar);
                return;
            }
            try {
                dgyaVar2.p(ebqrVar);
            } catch (Exception e2) {
                dhja.i(e2, "Error while sending confirmation ack response: %s", e2.getMessage());
            }
            ebqo ebqoVarC2 = ebqrVar.c("application/end-user-confirmation-ack+xml");
            if (ebqoVarC2 != null) {
                try {
                    dgxx dgxxVar = new dgxx(ebqoVarC2.a());
                    dhbd dhbdVar2 = dgyaVar2.h;
                    if (dhbdVar2 != null) {
                        Intent intent2 = new Intent(RcsIntents.ACTION_END_USER_CONFIRMATION_ACK);
                        intent2.setFlags(805306368);
                        intent2.putExtra(RcsIntents.EXTRA_REQUEST_ID, dgxxVar.f);
                        intent2.putExtra(RcsIntents.EXTRA_SUBJECT, dgxxVar.b());
                        intent2.putExtra(RcsIntents.EXTRA_TEXT, dgxxVar.c());
                        dhbdVar2.a.startActivity(intent2);
                        return;
                    }
                    return;
                } catch (IOException unused2) {
                    dhja.g("Error while parsing confirmation ack request", new Object[0]);
                    return;
                }
            }
            return;
        }
        if ("application/end-user-notification-request+xml".equals(strH)) {
            dgya dgyaVar3 = (dgya) this.d.b(dgya.class);
            if (!dgyaVar3.r(ebqrVar)) {
                dgyaVar3.q(ebqrVar);
                return;
            }
            try {
                dgyaVar3.p(ebqrVar);
            } catch (Exception e3) {
                dhja.i(e3, "Error while sending notification request response: %s", e3.getMessage());
            }
            ebqo ebqoVarC3 = ebqrVar.c("application/end-user-notification-request+xml");
            if (ebqoVarC3 != null) {
                try {
                    dgyc dgycVarA = dgyc.a(ebqoVarC3.a());
                    dhbd dhbdVar3 = dgyaVar3.h;
                    if (dhbdVar3 != null) {
                        Intent intent3 = new Intent(RcsIntents.ACTION_END_USER_NOTIFICATION_REQUEST);
                        intent3.setFlags(805306368);
                        intent3.putExtra(RcsIntents.EXTRA_REQUEST_ID, dgycVarA.f);
                        intent3.putExtra(RcsIntents.EXTRA_SUBJECT, dgycVarA.b());
                        intent3.putExtra(RcsIntents.EXTRA_TEXT, dgycVarA.c());
                        intent3.putExtra(RcsIntents.EXTRA_BUTTON_POSITIVE, dgyc.d(dgycVarA.a));
                        dhbdVar3.a.startActivity(intent3);
                        return;
                    }
                    return;
                } catch (IOException e4) {
                    dhja.i(e4, "Error while parsing notification request", new Object[0]);
                    return;
                }
            }
            return;
        }
        if (!"application/system-request+xml".equals(strH)) {
            dgzu dgzuVar = (dgzu) this.d.b(dgzu.class);
            dhja.l(dgzu.g, "Receive an instant message", new Object[0]);
            if (ebqrVar.z().equals("NOTIFY")) {
                dhja.w(6, 3, "Received a pager message", new Object[0]);
            }
            try {
                ebqs ebqsVarN = dgzuVar.f.n(ebqrVar);
                ebqsVarN.r("P-Preferred-Identity: " + dgzuVar.a.e());
                dgzuVar.q().s(ebqsVarN);
            } catch (ebmn e5) {
                dhja.j(e5, dgzu.g, "Can't send 200 OK for MESSAGE: %s", e5.getMessage());
            }
            String strJ2 = ebqrVar.j(ffho.a);
            if (Objects.isNull(strJ2)) {
                dhja.h(dgzu.g, "Ignoring message with null content type.", new Object[0]);
                return;
            }
            dhja.d(dgzu.g, "Checking incoming message content type [%s]", strJ2);
            ebma ebmaVarB = dhjv.b(ebqrVar, dgzuVar.j);
            ebmaVarB.getClass();
            dgyx dgyxVar = new dgyx(null, Objects.toString(ebqrVar.g(), "").getBytes(StandardCharsets.UTF_8), strJ2);
            dgyxVar.c = ebmaVarB.toString();
            dgzuVar.p.f(dgyxVar);
            return;
        }
        dgya dgyaVar4 = (dgya) this.d.b(dgya.class);
        if (!dgyaVar4.r(ebqrVar)) {
            dgyaVar4.q(ebqrVar);
            return;
        }
        try {
            dgyaVar4.p(ebqrVar);
        } catch (Exception e6) {
            dhja.i(e6, "Error while sending system request response to : %s", e6.getMessage());
        }
        ebqo ebqoVarC4 = ebqrVar.c("application/system-request+xml");
        if (ebqoVarC4 != null) {
            try {
                dgye dgyeVarA = dgye.a(ebqoVarC4.a());
                dhbd dhbdVar4 = dgyaVar4.h;
                if (dhbdVar4 != null) {
                    int i = dgyeVarA.a;
                    int i2 = i - 1;
                    if (i == 0) {
                        throw null;
                    }
                    if (i2 != 0) {
                        return;
                    }
                    dhbdVar4.b.onReconfigurationRequested();
                }
            } catch (IOException e7) {
                dhja.i(e7, "Error while procesing system request: %s", e7.getMessage());
            }
        }
    }
}
