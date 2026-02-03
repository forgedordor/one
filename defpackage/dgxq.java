package defpackage;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dgxq implements Runnable {
    final /* synthetic */ dgxt a;

    public dgxq(dgxt dgxtVar) {
        this.a = dgxtVar;
    }

    @Override // java.lang.Runnable
    public final void run() throws XmlPullParserException, IllegalStateException, dhax, IllegalArgumentException {
        String strE;
        dhmb dhmbVarA;
        InputStream inputStreamA;
        try {
            dgxt dgxtVar = this.a;
            String str = dgxtVar.a.c().mPublicIdentity;
            dhja.c("Publishing presence capabilities for %s", dhiz.USER_ID.c(str));
            dgwx dgwxVarB = dgxtVar.h.b();
            dgxu dgxuVar = dgxtVar.m;
            dhmb dhmbVar = (dhmb) dgxuVar.a.b();
            dhmbVar.a = str;
            List listB = dhmbVar.b();
            dhly dhlyVar = dhly.OPEN;
            dhfs dhfsVar = dgxuVar.b;
            listB.add(dgxuVar.a(str, dhlyVar, dhfsVar.a));
            if (dgwxVarB.y()) {
                listB.add(dgxuVar.a(str, dhlyVar, dhfsVar.b));
            }
            if (dgwxVarB.B()) {
                listB.add(dgxuVar.a(str, dhlyVar, dhfsVar.c));
            }
            if (dgwxVarB.G()) {
                listB.add(dgxuVar.a(str, dhlyVar, dhfsVar.d));
            }
            if (dgwxVarB.z()) {
                listB.add(dgxuVar.a(str, dhlyVar, dhfsVar.e));
            }
            if (dgwxVarB.A()) {
                listB.add(dgxuVar.a(str, dhlyVar, dhfsVar.f));
            }
            if (dgwxVarB.C()) {
                listB.add(dgxuVar.a(str, dhlyVar, dhfsVar.g));
            }
            if (dgwxVarB.D()) {
                listB.add(dgxuVar.a(str, dhlyVar, dhfsVar.h));
            }
            if (dgwxVarB.x()) {
                listB.add(dgxuVar.a(str, dhlyVar, dhfsVar.i));
            }
            if (dgwxVarB.I()) {
                dhmbVar.b().add(dgxuVar.a(str, dhlyVar, dhfsVar.j));
            }
            if (dgwxVarB.M()) {
                listB.add(dgxuVar.a(str, dhlyVar, dhfsVar.l));
            }
            if (dgwxVarB.L()) {
                listB.add(dgxuVar.a(str, dhlyVar, dhfsVar.k));
            }
            if (dgwxVarB.J()) {
                listB.add(dgxuVar.a(str, dhlyVar, dhfsVar.m));
            }
            if (dgwxVarB.F()) {
                dhmg dhmgVarA = dgxuVar.a(str, dhlyVar, dhfsVar.n);
                if (dgwxVarB.E()) {
                    dhmgVarA.g = ekgb.r(dhlr.VIDEO);
                }
                listB.add(dhmgVarA);
            }
            dfio dfioVar = dgxtVar.o;
            synchronized (dfioVar.c) {
                strE = dfioVar.a.e();
            }
            synchronized (dfioVar.c) {
                try {
                    inputStreamA = dfioVar.b.a("capabilities-pidf.xml");
                } catch (IOException e) {
                    dhja.i(e, "Failed to load capabilities PIDF from disk", new Object[0]);
                }
                if (inputStreamA != null) {
                    try {
                        dhmbVarA = dfioVar.d.a(inputStreamA);
                        inputStreamA.close();
                    } finally {
                    }
                } else {
                    dhmbVarA = null;
                }
            }
            if (dhmbVarA != null) {
                List<dhmg> list = dhmbVarA.b;
                HashMap map = new HashMap();
                if (list != null) {
                    for (dhmg dhmgVar : list) {
                        String str2 = dhmgVar.c.b;
                        if (str2 != null) {
                            map.put(str2, dhmgVar);
                        }
                    }
                }
                List<dhmg> list2 = dhmbVar.b;
                if (list2 != null) {
                    for (dhmg dhmgVar2 : list2) {
                        dhmg dhmgVar3 = (dhmg) map.get(dhmgVar2.c.b);
                        if (dhmgVar3 != null) {
                            dhmgVar2.a = dhmgVar3.a;
                        }
                    }
                }
            }
            dhaw dhawVar = dgxtVar.i;
            dhawVar.b();
            try {
                try {
                    dhawVar.k = dhmbVar;
                    dgvj dgvjVar = dhawVar.j;
                    if (dgvjVar == null) {
                        dgvjVar = new dgvj(dhawVar, dhawVar.h, dhmbVar.a, dhawVar.f);
                        dgvjVar.j = dhawVar.q;
                        dhawVar.j = dgvjVar;
                    }
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    dhme.b(dhmbVar, byteArrayOutputStream);
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    if (dgvjVar.i == 1) {
                        throw new IllegalStateException("publish() cannot be called in the PENDING state!");
                    }
                    dgvjVar.i = 1;
                    ebky ebkyVar = dgvjVar.d;
                    ebkyVar.a();
                    dgvjVar.e = -1;
                    if (strE != null) {
                        dhja.c("Capabilities publication with existing etag. Performing modify. Etag %s", strE);
                        dgvjVar.g = strE;
                    }
                    try {
                        eblf eblfVar = ((eblg) dgvjVar.a).a;
                        eblfVar.k(dgvjVar.b.d(eblfVar, ebkyVar, dgvjVar.c, dgvjVar.e, dgvjVar.g, "application/pidf+xml", byteArray), dgvjVar.h);
                    } catch (ebmn e2) {
                        dhja.i(e2, "Error while creating sip request: %s", e2.getMessage());
                        dgvjVar.i = 3;
                    }
                } catch (IOException e3) {
                    e = e3;
                    throw new dhax("Could not generate presence content: ".concat(String.valueOf(e.getMessage())), e);
                }
            } catch (ebmn e4) {
                e = e4;
                throw new dhax("Could not generate presence content: ".concat(String.valueOf(e.getMessage())), e);
            }
        } catch (dhax e5) {
            dhja.i(e5, "Can't send Publish for Presence", new Object[0]);
        }
    }
}
