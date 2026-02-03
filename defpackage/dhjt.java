package defpackage;

import android.text.TextUtils;
import com.android.vcard.VCardBuilder;
import com.google.android.ims.rcsservice.businessinfo.BasePaymentResult;
import j$.util.Collection;
import j$.util.DesugarArrays;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import j$.util.stream.Collectors;
import java.util.ArrayList;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dhjt {
    public final dhjx b;
    private static final dfny c = dfod.a(116284689);
    private static final dfny d = dfod.a(181241346);
    public static final dfny a = dfnv.b("bug_191166396");

    public dhjt(dhjx dhjxVar) {
        this.b = dhjxVar;
    }

    public static ebnr a(eblf eblfVar, boolean z, String[] strArr) {
        if (eblfVar == null) {
            throw new IllegalArgumentException("sipStack cannot be null.");
        }
        String str = eblfVar.c;
        ebkr ebkrVar = dhjv.a;
        return new ebnr(ebkr.f(str, z, eblfVar.h(), eblfVar.n()), eblfVar.p(), eblfVar.i(), Optional.ofNullable(eblfVar.g()), strArr);
    }

    public static ebpe b(int i, ebpd ebpdVar) {
        ebkr ebkrVar = dhjv.a;
        ebpe ebpeVar = new ebpe(i, ebpe.y(i));
        for (ebob ebobVar : ebpdVar.d) {
            if ((ebobVar instanceof eboa) || (ebobVar instanceof ebos) || (ebobVar instanceof ebow) || (ebobVar instanceof ebno) || (ebobVar instanceof ebol) || ebobVar.c.equalsIgnoreCase("Time-Stamp")) {
                ebpeVar.k(ebobVar);
            }
        }
        ebnn ebnnVar = ebpdVar.g;
        if (ebnnVar != null) {
            ebpeVar.k(ebnnVar);
        }
        ebpeVar.k = null;
        ebpeVar.m(ffho.a);
        ebpeVar.m("Content-Length");
        Collection.EL.stream(ebpeVar.g().a).forEach(new Consumer() { // from class: dhjr
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void z(Object obj) {
                dfny dfnyVar = dhjt.a;
                ((ebov) obj).g = false;
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
        return ebpeVar;
    }

    public static void i(ebpd ebpdVar, String... strArr) {
        ebpdVar.k(ebql.g("Require", (String) DesugarArrays.stream(strArr).collect(Collectors.joining(","))));
    }

    public static void j(ebpd ebpdVar, String... strArr) {
        ebpdVar.k(ebql.g("Proxy-Require", (String) DesugarArrays.stream(strArr).collect(Collectors.joining(","))));
    }

    public static void k(ebpd ebpdVar, String str) {
        ebpdVar.k(ebql.g("Security-Verify", str));
    }

    public static void l(ebpd ebpdVar, ArrayList arrayList) {
        if (arrayList.isEmpty()) {
            return;
        }
        for (int i = 0; i < arrayList.size(); i++) {
            ebpdVar.k((ebob) arrayList.get(i));
        }
    }

    public static void m(String str, String str2, String str3) {
        if (str == null) {
            throw new ebmn("call-ID is null.");
        }
        if (str2 == null) {
            throw new ebmn("localParty is null.");
        }
        if (str3 == null) {
            throw new ebmn("remoteParty is null.");
        }
    }

    private static void t(ebqr ebqrVar) throws dhjs {
        if (!dhjv.z(ebqrVar)) {
            throw new dhjs();
        }
    }

    private static final ebpe u(ebqr ebqrVar, int i) throws ebmn {
        t(ebqrVar);
        try {
            ebpe ebpeVarB = b(i, (ebpd) ebqrVar.a);
            ebos ebosVar = (ebos) ebpeVarB.d("To");
            String strL = ebqrVar.l();
            if (ebosVar == null || strL == null) {
                throw new ebmn("To header is null.");
            }
            if (!strL.contains("tag")) {
                ebosVar.f(ebmh.a());
            }
            return ebpeVarB;
        } catch (Exception e) {
            dhja.i(e, "Can't create SIP message", new Object[0]);
            throw new ebmn("Can't create SIP response");
        }
    }

    private static final ebpe v(ebqr ebqrVar, String str, int i) throws ebmn {
        t(ebqrVar);
        try {
            ebpe ebpeVarB = b(i, (ebpd) ebqrVar.a);
            if (str == null) {
                return ebpeVarB;
            }
            ebos ebosVar = (ebos) ebpeVarB.d("To");
            if (ebosVar == null) {
                throw new ebmn("To header is null.");
            }
            ebosVar.f(str);
            return ebpeVarB;
        } catch (ebml e) {
            dhja.i(e, "Can't create SIP message: ", new Object[0]);
            throw new ebmn("Can't create SIP response");
        }
    }

    public final ebqr c(eblf eblfVar, ebky ebkyVar, String str, byte[] bArr, String str2, Optional optional) throws ebmn {
        ebpd ebpdVarA;
        ebqr ebqrVar;
        try {
            String str3 = ebkyVar.f;
            String str4 = ebkyVar.a;
            String str5 = ebkyVar.g;
            String str6 = ebkyVar.h;
            m(str4, str5, str6);
            ebkr ebkrVar = dhjv.a;
            ebma ebmaVarD = ebkr.d(str3);
            ebno ebnoVarB = ebql.b(str4);
            ebnn ebnnVarA = ebql.a(ebkyVar.b, "MESSAGE");
            eblv eblvVarB = ebkr.b(str5);
            ebpdVarA = ebkx.a(ebmaVarD, "MESSAGE", ebnoVarB, ebnnVarA, ebql.f(eblvVarB, ebkyVar.d), ebql.i(ebkr.b(str6), ebkyVar.e), dhjv.q(eblfVar), dhjv.g());
            ebqrVar = new ebqr(ebpdVarA);
            ArrayList arrayList = ebkyVar.j;
            if (arrayList != null) {
                l(ebpdVarA, arrayList);
            }
            ebpdVarA.k(ebql.g("P-Preferred-Identity", eblvVarB.c()));
        } catch (Exception e) {
            e = e;
        }
        try {
            ebpdVarA.k(dhjv.f(this.b.a()));
            String[] strArrSplit = TextUtils.split(str, "/");
            ebpdVarA.o(bArr, ebql.d(strArrSplit[0], strArrSplit[1]));
            ebpdVarA.p(ebql.c(bArr.length));
            if (optional.isPresent() && ((Boolean) c.a()).booleanValue()) {
                ebpdVarA.k(ebql.g("Contribution-ID", (String) optional.get()));
            }
            if (((Boolean) d.a()).booleanValue()) {
                Optional optional2 = eblfVar.e;
                if (optional2.isPresent()) {
                    k(ebpdVarA, (String) optional2.get());
                    i(ebpdVarA, "sec-agree");
                    j(ebpdVarA, "sec-agree");
                }
            }
            ebqrVar.b = str2;
            return ebqrVar;
        } catch (Exception e2) {
            e = e2;
            dhja.i(e, "Can't create SIP message", new Object[0]);
            throw new ebmn("Can't create SIP MESSAGE message");
        }
    }

    public final ebqr d(eblf eblfVar, ebky ebkyVar, String str, int i, String str2, String str3, byte[] bArr) throws ebmn {
        ebpd ebpdVarA;
        try {
            String str4 = ebkyVar.f;
            String str5 = ebkyVar.a;
            String str6 = ebkyVar.g;
            String str7 = ebkyVar.h;
            m(str5, str6, str7);
            ebkr ebkrVar = dhjv.a;
            ebma ebmaVarD = ebkr.d(str4);
            ebno ebnoVarB = ebql.b(str5);
            ebnn ebnnVarA = ebql.a(ebkyVar.b, "PUBLISH");
            eblv eblvVarB = ebkr.b(str6);
            ebpdVarA = ebkx.a(ebmaVarD, "PUBLISH", ebnoVarB, ebnnVarA, ebql.f(eblvVarB, ebkyVar.d), ebql.i(ebkr.b(str7), null), dhjv.q(eblfVar), dhjv.g());
            ArrayList arrayList = ebkyVar.j;
            if (arrayList != null) {
                l(ebpdVarA, arrayList);
            }
            if (i >= 0) {
                ebpdVarA.k(ebql.e(i));
            }
            if (str2 != null) {
                ebpdVarA.k(ebql.g("SIP-If-Match", str2));
            }
            ebpdVarA.k(ebql.g("P-Preferred-Identity", eblvVarB.c()));
        } catch (Exception e) {
            e = e;
        }
        try {
            ebpdVarA.k(dhjv.f(this.b.a()));
            ebpdVarA.k(ebql.g("Event", str));
            if (bArr != null && str3 != null) {
                ebpdVarA.p(ebql.c(0));
                String[] strArrSplit = TextUtils.split(str3, "/");
                ebpdVarA.o(bArr, ebql.d(strArrSplit[0], strArrSplit[1]));
            }
            return new ebqr(ebpdVarA);
        } catch (Exception e2) {
            e = e2;
            dhja.i(e, "Can't create SIP message: %s", e.getMessage());
            throw new ebmn("Can't create SIP PUBLISH message");
        }
    }

    public final ebqr e(eblf eblfVar, ebky ebkyVar, int i, String str, String[] strArr) {
        try {
            String str2 = ebkyVar.f;
            String str3 = ebkyVar.a;
            String str4 = ebkyVar.g;
            String str5 = ebkyVar.h;
            m(str3, str4, str5);
            ebkr ebkrVar = dhjv.a;
            ebpd ebpdVarA = ebkx.a(ebkr.d(str2), "SUBSCRIBE", ebql.b(str3), ebql.a(ebkyVar.b, "SUBSCRIBE"), ebql.f(ebkyVar.x ? ebkr.b("sip:anonymous@anonymous.invalid") : ebkr.b(str4), ebkyVar.d), ebql.i(ebkr.b(str5), ebkyVar.e), dhjv.q(eblfVar), dhjv.g());
            ArrayList arrayList = ebkyVar.j;
            if (arrayList != null) {
                l(ebpdVarA, arrayList);
            }
            ebpdVarA.k(ebql.e(i));
            ebpdVarA.k(ebql.g("P-Preferred-Identity", str4));
            try {
                ebpdVarA.k(dhjv.f(this.b.a()));
                ebpdVarA.k(a(eblfVar, false, strArr));
                ebqm.b(ebpdVarA, a.v(str, "Event: "));
                Optional optional = eblfVar.e;
                if (optional.isPresent()) {
                    k(ebpdVarA, (String) optional.get());
                    i(ebpdVarA, "sec-agree");
                    j(ebpdVarA, "sec-agree");
                }
                return new ebqr(ebpdVarA);
            } catch (Exception e) {
                e = e;
                dhja.i(e, "Can't create SIP message", new Object[0]);
                throw new ebmn("Can't create SIP SUBSCRIBE message");
            }
        } catch (Exception e2) {
            e = e2;
        }
    }

    public final ebqs f(eblf eblfVar, ebky ebkyVar) {
        ebqr ebqrVar = ebkyVar.i;
        ebqr ebqrVar2 = ebkyVar.p;
        if (ebqrVar2 != null) {
            ebqrVar = ebqrVar2;
        }
        if (ebqrVar == null) {
            return null;
        }
        return g(eblfVar, ebkyVar, ebqrVar);
    }

    public final ebqs g(eblf eblfVar, ebky ebkyVar, ebqr ebqrVar) throws ebmn {
        try {
            ebpe ebpeVarB = b(BasePaymentResult.ERROR_REQUEST_FAILED, ebqrVar.y());
            ebos ebosVar = (ebos) ebpeVarB.d("To");
            if (ebosVar == null) {
                throw new ebmn("To header is null.");
            }
            ebosVar.f(ebkyVar.d);
            ebpeVarB.k(a(eblfVar, false, new String[0]));
            ebpeVarB.k(dhjv.e(this.b.a()));
            ebpeVarB.k(ebql.g("Require", "timer"));
            ebpeVarB.p(ebql.c(0));
            ebqo[] ebqoVarArr = ebkyVar.r;
            if (ebqoVarArr != null) {
                if (ebqoVarArr.length == 1) {
                    ebpeVarB.o(ebqoVarArr[0].a, ebql.d("application", "sdp"));
                } else {
                    String strConcat = "b".concat(ebmh.a());
                    byte[] bArrB = dhjv.B(ebqoVarArr, strConcat);
                    ebnv ebnvVarD = ebql.d("multipart", "mixed");
                    ebnvVarD.n(strConcat);
                    ebpeVarB.o(bArrB, ebnvVarD);
                }
            }
            return new ebqs(ebpeVarB);
        } catch (Exception e) {
            dhja.i(e, "Can't create SIP message", new Object[0]);
            throw new ebmn("Can't create SIP response");
        }
    }

    public final ebqs h(ebqr ebqrVar, String str, int i) {
        return new ebqs(v(ebqrVar, str, i));
    }

    public final ebqs n(ebqr ebqrVar) {
        return new ebqs(u(ebqrVar, BasePaymentResult.ERROR_REQUEST_FAILED));
    }

    public final ebqs o(ebqr ebqrVar, int i, int i2) throws ebmn {
        ebpe ebpeVarU = u(ebqrVar, i);
        if (((Boolean) a.a()).booleanValue()) {
            ebpeVarU.m = i2;
        }
        return new ebqs(ebpeVarU);
    }

    public final ebqs p(ebqr ebqrVar, String str, int i, int i2) {
        ebpe ebpeVarV = v(ebqrVar, str, i);
        if (((Boolean) a.a()).booleanValue()) {
            ebpeVarV.m = i2;
        }
        return new ebqs(ebpeVarV);
    }

    public final ebqr q(eblf eblfVar, ebky ebkyVar) throws ebmn {
        try {
            String str = ebkyVar.f;
            String str2 = ebkyVar.a;
            String str3 = ebkyVar.g;
            String str4 = ebkyVar.h;
            m(str2, str3, str4);
            ebkr ebkrVar = dhjv.a;
            ebma ebmaVarD = ebkr.d(str);
            ebno ebnoVarB = ebql.b(str2);
            ebnn ebnnVarA = ebql.a(ebkyVar.b, "ACK");
            eboa eboaVarF = ebql.f(ebkr.b(str3), ebkyVar.d);
            ebos ebosVarI = ebql.i(ebkr.b(str4), ebkyVar.e);
            ebqr ebqrVar = ebkyVar.i;
            if (ebqrVar == null) {
                throw new ebmn("INVITE is null.");
            }
            String strB = ((ebov) ebqrVar.a.g().e(0)).b();
            int iY = ebkyVar.q.y();
            if (iY > 199 && iY < 300) {
                strB = dhjv.p();
            }
            if (strB == null) {
                throw new ebmn("Branch is null.");
            }
            ebov ebovVarJ = ebql.j(eblfVar.n(), eblfVar.i(), eblfVar.p(), strB);
            ArrayList arrayList = new ArrayList();
            arrayList.add(ebovVarJ);
            ebpd ebpdVarA = ebkx.a(ebmaVarD, "ACK", ebnoVarB, ebnnVarA, eboaVarF, ebosVarI, arrayList, dhjv.g());
            ArrayList arrayList2 = ebkyVar.j;
            if (arrayList2 != null) {
                l(ebpdVarA, arrayList2);
            }
            ebpdVarA.k(a(eblfVar, false, new String[0]));
            ebpdVarA.k(dhjv.f(this.b.a()));
            ebpdVarA.k(dhjv.F());
            return new ebqr(ebpdVarA);
        } catch (Exception e) {
            dhja.i(e, "Can't create SIP message", new Object[0]);
            throw new ebmn("Can't create SIP ACK message");
        }
    }

    public final ebqr r(eblf eblfVar, ebky ebkyVar) throws ebmn {
        String str;
        String str2;
        String str3;
        String str4;
        ebma ebmaVarD;
        int length;
        int i = 0;
        try {
            str = ebkyVar.f;
            str2 = ebkyVar.a;
            str3 = ebkyVar.g;
            str4 = ebkyVar.h;
        } catch (Exception e) {
            e = e;
        }
        try {
            if (str2 == null || str3 == null || str4 == null) {
                throw new ebmn(a.E(ebkyVar, "Call-ID, localParty or remoteParty is null. "));
            }
            if (ebkyVar.k && ebkyVar.v != null) {
                ebkr ebkrVar = dhjv.a;
                ebmaVarD = ebkr.d(ebkyVar.v);
            } else {
                if (str == null) {
                    throw new ebmn("Target is null.");
                }
                ebkr ebkrVar2 = dhjv.a;
                ebmaVarD = ebkr.d(str);
            }
            ebma ebmaVar = ebmaVarD;
            ebno ebnoVarB = ebql.b(str2);
            ebnn ebnnVarA = ebql.a(ebkyVar.b, "INVITE");
            eblv eblvVarB = ebkr.b(str3);
            ebpd ebpdVarA = ebkx.a(ebmaVar, "INVITE", ebnoVarB, ebnnVarA, ebql.f(eblvVarB, ebkyVar.d), ebql.i(ebkr.b(str4), ebkyVar.e), dhjv.r(eblfVar, true), dhjv.g());
            ebnq ebnqVar = ebkyVar.c;
            if (ebnqVar != null) {
                ebpdVarA.k(ebnqVar);
                dhja.c("set conference header: %s", ebnqVar.a);
            }
            ebpdVarA.k(a(eblfVar, false, new String[0]));
            ArrayList arrayList = ebkyVar.j;
            if (arrayList != null) {
                l(ebpdVarA, arrayList);
            }
            ebpdVarA.k(ebql.g("P-Preferred-Identity", eblvVarB.c()));
            ebpdVarA.k(dhjv.f(this.b.a()));
            ebpdVarA.k(dhjv.F());
            ebpdVarA.k(ebql.g("Supported", "timer"));
            if (!dfog.H() && (!((Boolean) dfog.o().a.K.a()).booleanValue() || dfog.o().M())) {
                eboq eboqVar = (eboq) ebql.g("Session-Expires", "1800");
                ebpdVarA.k(eboqVar);
                String str5 = ebkyVar.w;
                if (str5 != null) {
                    eboqVar.f(str5);
                }
            }
            Optional optional = eblfVar.e;
            if (optional.isPresent()) {
                k(ebpdVarA, (String) optional.get());
                i(ebpdVarA, "sec-agree");
                j(ebpdVarA, "sec-agree");
            }
            ebpdVarA.p(ebql.c(0));
            ebqo[] ebqoVarArr = ebkyVar.t;
            if (ebqoVarArr == null) {
                ebqoVarArr = ebkyVar.r;
            }
            if (ebqoVarArr != null && (length = ebqoVarArr.length) > 0) {
                if (length == 1) {
                    String[] strArrSplit = TextUtils.split(ebqoVarArr[0].b, "/");
                    ebpdVarA.o(ebqoVarArr[0].a, ebql.d(strArrSplit[0], strArrSplit[1]));
                } else {
                    String strV = a.v(ebmh.a(), "b");
                    ebnv ebnvVarD = ebql.d("multipart", "mixed");
                    ebnvVarD.n(strV);
                    ebpdVarA.o(dhjv.B(ebqoVarArr, strV), ebnvVarD);
                }
            }
            ebqr ebqrVar = new ebqr(ebpdVarA);
            if (ebqoVarArr != null) {
                StringBuilder sb = new StringBuilder();
                String str6 = "";
                while (i < ebqoVarArr.length) {
                    ebqo ebqoVar = ebqoVarArr[i];
                    sb.append(str6);
                    sb.append(ebqoVar.c());
                    i++;
                    str6 = VCardBuilder.VCARD_END_OF_LINE;
                }
                ebqrVar.b = sb.toString();
            }
            return ebqrVar;
        } catch (Exception e2) {
            e = e2;
            dhja.i(e, "Can't create SIP message", new Object[0]);
            throw new ebmn("Can't create SIP INVITE message", e);
        }
    }

    public final ebqr s(eblf eblfVar, ebky ebkyVar) throws ebmn {
        try {
            String str = ebkyVar.f;
            String str2 = ebkyVar.a;
            String str3 = ebkyVar.g;
            String str4 = ebkyVar.h;
            m(str2, str3, str4);
            ebkr ebkrVar = dhjv.a;
            ebma ebmaVarD = ebkr.d(str);
            ebno ebnoVarB = ebql.b(str2);
            ebnn ebnnVarA = ebql.a(ebkyVar.b, "OPTIONS");
            eblv eblvVarB = ebkr.b(str3);
            ebpd ebpdVarA = ebkx.a(ebmaVarD, "OPTIONS", ebnoVarB, ebnnVarA, ebql.f(eblvVarB, ebkyVar.d), ebql.i(ebkr.b(str4), null), dhjv.q(eblfVar), dhjv.g());
            ebpdVarA.k(a(eblfVar, false, new String[0]));
            ebpdVarA.k(ebql.g("Accept", "application/sdp"));
            ArrayList arrayList = ebkyVar.j;
            if (arrayList != null) {
                l(ebpdVarA, arrayList);
            }
            ebpdVarA.k(ebql.g("P-Preferred-Identity", eblvVarB.c()));
            ebpdVarA.k(dhjv.f(this.b.a()));
            ebpdVarA.k(dhjv.F());
            return new ebqr(ebpdVarA);
        } catch (Exception e) {
            dhja.i(e, "Can't create SIP message", new Object[0]);
            throw new ebmn("Can't create SIP OPTIONS message");
        }
    }
}
