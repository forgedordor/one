package defpackage;

import android.telephony.PhoneNumberUtils;
import android.text.TextUtils;
import com.android.vcard.VCardBuilder;
import com.google.android.ims.provisioning.config.ImsConfiguration;
import j$.util.Objects;
import java.io.ByteArrayOutputStream;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dhjv {
    public static final ebkr a = new ebkr();
    public static final dhip b = new dhip("SipUtils");
    private static final dfny d = dfod.a(188805143);
    public static final dfny c = dfnv.b("do_not_respond_to_ack");
    private static final ekhx e = ekhx.s("+g.gsma.rcs.msgrevoke", "vnd.google.rcs.encrypted", "+vnd.google.rcs.encrypted");

    public static boolean A(String str, String str2) {
        if (str != null && str2 != null && !dhim.d(str) && !dhim.d(str2)) {
            try {
                ebma ebmaVarD = ebkr.d(str);
                ebma ebmaVarD2 = ebkr.d(str2);
                if (ebmaVarD.l() && ebmaVarD2.l()) {
                    eblx eblxVar = (eblx) ebmaVarD;
                    eblx eblxVar2 = (eblx) ebmaVarD2;
                    return dhim.b(eblxVar.e(), eblxVar2.e()) && dhim.b(eblxVar.b(), eblxVar2.b());
                }
                boolean z = ebmaVarD instanceof ebly;
                if (z && (ebmaVarD2 instanceof ebly)) {
                    return dhim.b(((ebly) ebmaVarD).a(), ((ebly) ebmaVarD2).a());
                }
                ebly eblyVar = null;
                eblx eblxVar3 = ebmaVarD.l() ? (eblx) ebmaVarD : ebmaVarD2.l() ? (eblx) ebmaVarD2 : null;
                if (z) {
                    eblyVar = (ebly) ebmaVarD;
                } else if (ebmaVarD2 instanceof ebly) {
                    eblyVar = (ebly) ebmaVarD2;
                }
                if (eblxVar3 == null || eblyVar == null) {
                    return false;
                }
                boolean zB = dhim.b(eblxVar3.e(), eblyVar.b());
                dhja.c("Comparing sip uri %s and tel uri %s equal %b", dhiz.URI_SIP.c(eblxVar3), dhiz.URI_TEL.c(eblyVar), Boolean.valueOf(zB));
                return zB;
            } catch (Exception e2) {
                dhja.i(e2, "Cannot compare URIs: %s, %s", str, str2);
            }
        }
        return false;
    }

    public static byte[] B(ebqo[] ebqoVarArr, String str) {
        StringBuilder sb = new StringBuilder();
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        for (int i = 0; i < ebqoVarArr.length; i++) {
            try {
                sb.setLength(0);
                if (i > 0) {
                    sb.append(VCardBuilder.VCARD_END_OF_LINE);
                }
                sb.append("--");
                sb.append(str);
                sb.append(VCardBuilder.VCARD_END_OF_LINE);
                sb.append("Content-Type: ");
                sb.append(ebqoVarArr[i].b);
                sb.append(VCardBuilder.VCARD_END_OF_LINE);
                if (ebqoVarArr[i].c != null) {
                    sb.append("Content-Disposition: ");
                    sb.append(ebqoVarArr[i].c);
                    sb.append(VCardBuilder.VCARD_END_OF_LINE);
                }
                if (ebqoVarArr[i].d != null) {
                    sb.append("Content-ID: <");
                    sb.append(ebqoVarArr[i].d);
                    sb.append(">");
                    sb.append(VCardBuilder.VCARD_END_OF_LINE);
                }
                byte[] bArr = ebqoVarArr[i].a;
                sb.append("Content-Length: ");
                sb.append(bArr.length);
                sb.append(VCardBuilder.VCARD_END_OF_LINE);
                sb.append(VCardBuilder.VCARD_END_OF_LINE);
                byteArrayOutputStream.write(sb.toString().getBytes("utf-8"));
                byteArrayOutputStream.write(bArr);
            } catch (Exception e2) {
                dhja.i(e2, "Error while getting multipart content: %s", e2.getMessage());
                return null;
            }
        }
        sb.setLength(0);
        sb.append(VCardBuilder.VCARD_END_OF_LINE);
        sb.append("--");
        sb.append(str);
        sb.append("--");
        sb.append(VCardBuilder.VCARD_END_OF_LINE);
        byteArrayOutputStream.write(sb.toString().getBytes("utf-8"));
        return byteArrayOutputStream.toByteArray();
    }

    @Deprecated
    public static String[] C(boolean z) {
        return z ? D(null, null, Arrays.asList("urn%3Aurn-7%3A3gpp-service.ims.icsi.oma.cpm.session")) : D(Arrays.asList("+g.oma.sip-im"), null, null);
    }

    public static String[] D(List list, List list2, List list3) {
        ArrayList arrayList = new ArrayList();
        if (list != null) {
            arrayList.addAll(list);
        }
        if (list2 != null && !list2.isEmpty()) {
            arrayList.add(String.format("%s=\"%s\"", "+g.3gpp.iari-ref", TextUtils.join(",", list2)));
        }
        if (list3 != null && !list3.isEmpty()) {
            arrayList.add(String.format("%s=\"%s\"", "+g.3gpp.icsi-ref", TextUtils.join(",", list3)));
        }
        return (String[]) arrayList.toArray(new String[0]);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00b4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int E(defpackage.ebqq r14) {
        /*
            Method dump skipped, instructions count: 294
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dhjv.E(ebqq):int");
    }

    public static ebob F() {
        return ebql.g("Allow", "INVITE, ACK, BYE, CANCEL, NOTIFY, OPTIONS, MESSAGE");
    }

    private static String G(String str, String str2, String str3, crmx crmxVar, boolean z) {
        String strX = !dfog.w() ? crmxVar.x(str) : str;
        boolean zIsGlobalPhoneNumber = PhoneNumberUtils.isGlobalPhoneNumber(strX);
        if (z) {
            if (zIsGlobalPhoneNumber) {
                return "tel:" + strX + ejwk.b(str3);
            }
        } else if (zIsGlobalPhoneNumber) {
            if (str3 == null) {
                str3 = ";user=phone";
            } else if (!str3.contains("user=phone")) {
                str3 = ";user=phone".concat(str3);
            }
            return "sip:" + strX + "@" + str2 + str3;
        }
        return H(str, str2, str3);
    }

    private static String H(String str, String str2, String str3) {
        if (TextUtils.isEmpty(str)) {
            if (str3 == null) {
                str3 = "";
            }
            return "sip:" + str2 + str3;
        }
        if (str3 == null) {
            str3 = "";
        }
        return "sip:" + str + "@" + str2 + str3;
    }

    public static int a(ebqq ebqqVar) {
        ebob ebobVarD = ebqqVar.a.d("Min-Expires");
        if (ebobVarD != null) {
            return ebobVarD.h(-1);
        }
        return -1;
    }

    public static ebma b(ebqr ebqrVar, crmx crmxVar) {
        ebnr ebnrVarB;
        eboc ebocVarE = ebqrVar.y().e("P-Asserted-Identity");
        if (ebocVarE != null && ebocVarE.b() > 0) {
            for (ebob ebobVar : ebocVarE.a) {
                try {
                    String strA = ebobVar.a();
                    String str = ebobVar.c;
                    strA.getClass();
                    ebma ebmaVar = ebkr.b(strA).b;
                    if (ebmaVar != null) {
                        if (!ebmaVar.d().equals("tel") || !((ebly) ebmaVar).e()) {
                            if (ebmaVar.l()) {
                                String strE = ((eblx) ebmaVar).e();
                                strE.getClass();
                                if (PhoneNumberUtils.isGlobalPhoneNumber(strE)) {
                                }
                            } else {
                                continue;
                            }
                        }
                        return ebmaVar;
                    }
                    continue;
                } catch (ebml unused) {
                }
            }
            try {
                ebob ebobVarF = ebocVarE.f();
                ebobVarF.getClass();
                String strA2 = ebobVarF.a();
                strA2.getClass();
                ebma ebmaVar2 = ebkr.b(strA2).b;
                if (ebmaVar2.l()) {
                    if (((Boolean) d.a()).booleanValue() && (ebnrVarB = ebqrVar.b()) != null && ebnrVarB.l("+g.gsma.rcs.isbot")) {
                        return ebmaVar2;
                    }
                    eblx eblxVar = (eblx) ebmaVar2;
                    String strE2 = eblxVar.e();
                    strE2.getClass();
                    if (!dfog.w()) {
                        strE2 = crmxVar.x(strE2);
                    }
                    eblxVar.k(strE2);
                    eblxVar.b.i("user");
                    eblxVar.b.f("user", "phone");
                    return eblxVar;
                }
                if (ebmaVar2 instanceof ebly) {
                    ebly eblyVar = (ebly) ebmaVar2;
                    String strA3 = eblyVar.a();
                    if (!dfog.w()) {
                        strA3 = crmxVar.x(eblyVar.a());
                    }
                    eblz eblzVar = eblyVar.a;
                    eblzVar.b = strA3;
                    eblzVar.a = true;
                    return eblyVar;
                }
            } catch (ebml unused2) {
                return null;
            }
        }
        try {
            eboa eboaVar = ebqrVar.a.e;
            String string = eboaVar == null ? null : eboaVar.a.b.toString();
            string.getClass();
            return ebkr.b(string).b;
        } catch (ebml e2) {
            dhja.i(e2, "Error while parsing remote address: %s", e2.getMessage());
            return null;
        }
    }

    public static ebma c(String str, ImsConfiguration imsConfiguration, crmx crmxVar) {
        return d(str, imsConfiguration.mDomain, crmxVar, y(imsConfiguration));
    }

    public static ebma d(String str, String str2, crmx crmxVar, boolean z) {
        try {
            return ebkr.b(m(str, str2, crmxVar, z)).b;
        } catch (ebml e2) {
            dhja.i(e2, "Error while parsing remote address: %s", e2.getMessage());
            return null;
        }
    }

    public static ebob e(String str) {
        return ebql.g("Server", str);
    }

    public static ebob f(String str) {
        if (!TextUtils.isEmpty(dfpo.r())) {
            str = dfpo.r();
        }
        return ebql.g("User-Agent", str);
    }

    public static ebod g() {
        return ebql.h(70);
    }

    public static String h(String str) {
        String str2;
        try {
            eblv eblvVarB = ebkr.b(str);
            ebma ebmaVar = eblvVarB.b;
            if (!(ebmaVar instanceof eblx)) {
                throw new IllegalArgumentException("address is not a SipURI");
            }
            ebmg ebmgVarA = ((eblx) ebmaVar).a();
            ebme ebmeVar = ebmgVarA == null ? null : ebmgVarA.a;
            if (ebmgVarA == null || ebmeVar == null) {
                throw new IllegalArgumentException("SipURI does not have host port.");
            }
            String str3 = ebmeVar.a;
            if (eblvVarB.a() != -1) {
                str2 = ":" + eblvVarB.a();
            } else {
                str2 = "";
            }
            return str3 + str2;
        } catch (Exception unused) {
            return null;
        }
    }

    public static String i(String str) {
        int iIndexOf;
        if (str == null || (iIndexOf = str.indexOf("tag=")) <= 0) {
            return null;
        }
        return str.substring(iIndexOf + 4);
    }

    public static String j(ebma ebmaVar, crmx crmxVar) {
        String string;
        if (ebmaVar instanceof eblx) {
            string = (String) ((eblx) ebmaVar).a.a().map(new dhju()).orElse("");
        } else if (ebmaVar instanceof ebly) {
            ebly eblyVar = (ebly) ebmaVar;
            String strA = eblyVar.a();
            string = eblyVar.e() ? "+".concat(String.valueOf(strA)) : strA;
        } else {
            string = ebmaVar.toString();
        }
        return (!w(string) || dfog.w()) ? string : crmxVar.x(string);
    }

    public static String k(String str, crmx crmxVar) {
        try {
            ebma ebmaVar = ebkr.b(str).b;
            if (ebmaVar != null) {
                return j(ebmaVar, crmxVar);
            }
            dhja.g("SipUtils: null uri returned for address: %s", str);
            return null;
        } catch (ebml e2) {
            dhja.i(e2, "captured ParseException extracting username from address %s", str);
            return null;
        }
    }

    public static String l(String str, ImsConfiguration imsConfiguration, crmx crmxVar) {
        return m(str, imsConfiguration.mDomain, crmxVar, y(imsConfiguration));
    }

    public static String m(String str, String str2, crmx crmxVar, boolean z) {
        int iIndexOf;
        if (dhim.c(str)) {
            return "sip:".concat(String.valueOf(str));
        }
        String strSubstring = null;
        if (w(str)) {
            return G(str, str2, null, crmxVar, z);
        }
        if (str != null && (iIndexOf = str.indexOf(59)) >= 0) {
            strSubstring = str.substring(iIndexOf);
            if (strSubstring.endsWith(">")) {
                strSubstring = strSubstring.substring(0, strSubstring.length() - 1);
            }
        }
        String strK = k(str, crmxVar);
        String strH = h(str);
        if (strH != null) {
            str2 = strH;
        }
        if (strK != null) {
            str = strK;
        }
        return w(str) ? G(str, str2, strSubstring, crmxVar, z) : H(str, str2, strSubstring);
    }

    public static String n(String str, crmx crmxVar) {
        String strK = k(str, crmxVar);
        String strH = h(str);
        if (TextUtils.isEmpty(strK) || TextUtils.isEmpty(strH)) {
            return null;
        }
        return a.q(strH, strK, "@");
    }

    public static String o(String str, crmx crmxVar) {
        String strK = k(str, crmxVar);
        return TextUtils.isEmpty(strK) ? str : strK;
    }

    public static String p() {
        return "z9hG4bK".concat(ebmh.a());
    }

    public static ArrayList q(eblf eblfVar) {
        return r(eblfVar, false);
    }

    public static ArrayList r(eblf eblfVar, boolean z) {
        String strP = p();
        if (eblfVar == null) {
            throw new IllegalArgumentException("sipStack cannot be null.");
        }
        ebov ebovVarJ = ebql.j(eblfVar.n(), eblfVar.i(), eblfVar.p(), strP);
        if (z) {
            ebovVarJ.f();
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(ebovVarJ);
        return arrayList;
    }

    public static ArrayList s(ebqq ebqqVar, boolean z) {
        int i;
        ArrayList arrayList = new ArrayList();
        Iterator it = ebqqVar.a.j("Record-Route").iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            ebok ebokVar = (ebok) ((ebob) it.next());
            ebon ebonVar = new ebon(ebokVar.a);
            if (ebokVar.m()) {
                Iterator<ebmj> it2 = ebokVar.e.iterator();
                while (it2.hasNext()) {
                    ebonVar.e.e((ebmj) it2.next().clone());
                }
            }
            if (z) {
                arrayList.add(0, ebonVar.a());
            } else {
                arrayList.add(ebonVar.a());
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (i = 0; i < arrayList.size(); i++) {
            try {
                arrayList2.add((ebon) ebql.g("Route", (String) arrayList.get(i)));
            } catch (ebml e2) {
                System.err.print("Can't create default Route header ".concat(String.valueOf(e2.getMessage())));
            }
        }
        return arrayList2;
    }

    public static void t(ebqq ebqqVar, String[] strArr, boolean z, boolean z2) {
        StringBuilder sb = new StringBuilder();
        for (String str : strArr) {
            if (E(ebqqVar) != 2 || !e.contains(str)) {
                sb.append(";");
                sb.append(str);
            }
        }
        if (z) {
            sb.append(";explicit");
        }
        if (z2) {
            sb.append(";require");
        }
        ebqqVar.a.p(ebql.g("Accept-Contact", "*".concat(sb.toString())));
    }

    public static void u(ebqq ebqqVar, String str, String[] strArr) {
        boolean z;
        String[] strArr2;
        Object[] objArr;
        ebpc ebpcVar;
        ebns ebnsVarC;
        boolean z2 = false;
        if (strArr.length != 0 && (ebnsVarC = (ebpcVar = ebqqVar.a).c()) != null && !ebnsVarC.i()) {
            ebnr ebnrVar = (ebnr) ebpcVar.c().f();
            ebnrVar.getClass();
            for (int i = 0; i < strArr.length; i++) {
                if (!strArr[i].contains("+sip.instance")) {
                    ebnrVar.j(new ebmj(strArr[i], null));
                }
            }
        }
        if (ebqqVar.x()) {
            return;
        }
        if (TextUtils.isEmpty(str)) {
            z = false;
            strArr2 = strArr;
        } else {
            Object objA = a.a(str, "+sip.instance=\"<", ">\"");
            z = true;
            if (strArr == null) {
                Object[] objArr2 = (Object[]) Array.newInstance(objA.getClass(), 1);
                objArr2[0] = objA;
                objArr = objArr2;
            } else {
                Class<?> componentType = strArr.getClass().getComponentType();
                objArr = strArr;
                if (!Objects.isNull(componentType)) {
                    int length = strArr.length;
                    Object[] objArr3 = (Object[]) Array.newInstance(componentType, length + 1);
                    System.arraycopy(strArr, 0, objArr3, 0, length);
                    objArr3[objArr3.length - 1] = objA;
                    objArr = objArr3;
                }
            }
            z2 = true;
            strArr2 = (String[]) objArr;
        }
        t(ebqqVar, strArr2, z2, z);
    }

    public static boolean v(String str) {
        if (TextUtils.isEmpty(str) || !str.toLowerCase(Locale.US).startsWith("sip:") || w(str.substring(4).split("@", -1)[0])) {
            return false;
        }
        return dhim.c(str.substring(4));
    }

    public static boolean w(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        int length = str.length();
        for (int i = 0; i < length; i++) {
            if (!PhoneNumberUtils.isDialable(str.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    public static boolean x(String str, String str2) {
        return str != null && str.toLowerCase(Locale.US).contains(str2);
    }

    public static boolean y(ImsConfiguration imsConfiguration) {
        return "tel".equals(imsConfiguration.mIntUrlFmt);
    }

    public static boolean z(ebqr ebqrVar) {
        return (((Boolean) c.a()).booleanValue() && "ACK".equals(ebqrVar.z())) ? false : true;
    }
}
