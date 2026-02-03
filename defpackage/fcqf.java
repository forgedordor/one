package defpackage;

import java.security.cert.CertificateParsingException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.regex.Pattern;
import javax.net.ssl.HostnameVerifier;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fcqf implements HostnameVerifier {
    public static final fcqf a = new fcqf();
    private static final Pattern b = Pattern.compile("([0-9a-fA-F]*:[0-9a-fA-F:.]*)|([\\d.]+)");

    private fcqf() {
    }

    private static List a(X509Certificate x509Certificate, int i) throws CertificateParsingException {
        Integer num;
        String str;
        ArrayList arrayList = new ArrayList();
        try {
            Collection<List<?>> subjectAlternativeNames = x509Certificate.getSubjectAlternativeNames();
            if (subjectAlternativeNames == null) {
                return Collections.EMPTY_LIST;
            }
            for (List<?> list : subjectAlternativeNames) {
                if (list != null && list.size() >= 2 && (num = (Integer) list.get(0)) != null && num.intValue() == i && (str = (String) list.get(1)) != null) {
                    arrayList.add(str);
                }
            }
            return arrayList;
        } catch (CertificateParsingException unused) {
            return Collections.EMPTY_LIST;
        }
    }

    private static final boolean b(String str, String str2) {
        if (str != null && str.length() != 0 && !str.startsWith(".") && !str.endsWith("..") && str2 != null && str2.length() != 0 && !str2.startsWith(".") && !str2.endsWith("..")) {
            if (!str.endsWith(".")) {
                str = str.concat(".");
            }
            if (!str2.endsWith(".")) {
                str2 = str2.concat(".");
            }
            String strC = ejuf.c(str2);
            if (!strC.contains("*")) {
                return str.equals(strC);
            }
            if (!strC.startsWith("*.") || strC.indexOf(42, 1) != -1 || str.length() < strC.length() || "*.".equals(strC)) {
                return false;
            }
            String strSubstring = strC.substring(1);
            if (!str.endsWith(strSubstring)) {
                return false;
            }
            int length = str.length() - strSubstring.length();
            return length <= 0 || str.lastIndexOf(46, length + (-1)) == -1;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:121:0x021a, code lost:
    
        throw new java.lang.IllegalStateException("Unexpected end of DN: ".concat(java.lang.String.valueOf(r4)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0152, code lost:
    
        r7 = r3.d;
        r8 = new java.lang.String(r9, r7, r3.e - r7);
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.net.ssl.HostnameVerifier
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean verify(java.lang.String r19, javax.net.ssl.SSLSession r20) throws java.security.cert.CertificateParsingException {
        /*
            Method dump skipped, instructions count: 761
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fcqf.verify(java.lang.String, javax.net.ssl.SSLSession):boolean");
    }
}
