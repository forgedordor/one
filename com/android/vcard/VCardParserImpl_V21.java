package com.android.vcard;

import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import defpackage.a;
import defpackage.ejuf;
import defpackage.ejxk;
import defpackage.qyp;
import defpackage.qyq;
import defpackage.qyr;
import j$.io.BufferedReaderRetargetInterface;
import j$.io.DesugarBufferedReader;
import j$.util.stream.Stream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public class VCardParserImpl_V21 {
    protected final String a;
    protected String b;
    public CustomBufferedReader c;
    protected final Set d;
    protected final Set e;
    private final List f;
    private boolean g;

    /* compiled from: PG */
    protected static final class CustomBufferedReader extends BufferedReader implements BufferedReaderRetargetInterface {
        private String mNextLine;
        private boolean mNextLineIsValid;
        private long mTime;

        public CustomBufferedReader(Reader reader) {
            super(reader);
        }

        public long getTotalmillisecond() {
            return this.mTime;
        }

        @Override // java.io.BufferedReader, j$.io.BufferedReaderRetargetInterface
        public /* synthetic */ Stream lines() {
            return DesugarBufferedReader.lines(this);
        }

        public String peekLine() throws IOException {
            if (!this.mNextLineIsValid) {
                long jCurrentTimeMillis = System.currentTimeMillis();
                String line = super.readLine();
                this.mTime += System.currentTimeMillis() - jCurrentTimeMillis;
                this.mNextLine = line;
                this.mNextLineIsValid = true;
            }
            return this.mNextLine;
        }

        @Override // java.io.BufferedReader
        public String readLine() throws IOException {
            if (this.mNextLineIsValid) {
                String str = this.mNextLine;
                this.mNextLine = null;
                this.mNextLineIsValid = false;
                return str;
            }
            long jCurrentTimeMillis = System.currentTimeMillis();
            String line = super.readLine();
            this.mTime += System.currentTimeMillis() - jCurrentTimeMillis;
            return line;
        }
    }

    public VCardParserImpl_V21() {
        this(null);
    }

    private final String v(String str) throws qyq {
        if (!str.trim().endsWith("=")) {
            return str;
        }
        int length = str.length();
        while (str.charAt(length - 1) != '=') {
        }
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) str, 0, length);
        sb.append(VCardBuilder.VCARD_END_OF_LINE);
        while (true) {
            String strC = c();
            if (strC == null) {
                throw new qyq("File ended during parsing a Quoted-Printable String");
            }
            if (!strC.trim().endsWith("=")) {
                sb.append(strC);
                return sb.toString();
            }
            int length2 = strC.length();
            while (strC.charAt(length2 - 1) != '=') {
            }
            sb.append((CharSequence) strC, 0, length2);
            sb.append(VCardBuilder.VCARD_END_OF_LINE);
        }
    }

    private final boolean w() throws qyq, UnsupportedEncodingException {
        String strC;
        this.b = VCardConstants.PARAM_ENCODING_8BIT;
        do {
            strC = c();
            if (strC == null) {
                return false;
            }
        } while (strC.trim().length() <= 0);
        String[] strArrSplit = strC.split(":", 2);
        if (strArrSplit.length != 2 || !ejuf.e(strArrSplit[0].trim(), VCardConstants.PROPERTY_BEGIN) || !ejuf.e(strArrSplit[1].trim(), "VCARD")) {
            throw new qyq(a.a(strC, "Expected String \"BEGIN:VCARD\" did not come (Instead, \"", "\" came)"));
        }
        List list = this.f;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((VCardInterpreter) it.next()).onEntryStarted();
        }
        s();
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            ((VCardInterpreter) it2.next()).onEntryEnded();
        }
        return true;
    }

    private static final String x(String str) {
        int iIndexOf = str.indexOf(":");
        if (iIndexOf < 0) {
            return null;
        }
        int iIndexOf2 = str.indexOf(";");
        if (iIndexOf2 != -1) {
            iIndexOf = Math.min(iIndexOf, iIndexOf2);
        }
        return ejuf.d(str.substring(0, iIndexOf));
    }

    private static final boolean y(char c) {
        if (c < 'a' || c > 'z') {
            return c >= 'A' && c <= 'Z';
        }
        return true;
    }

    protected int a() {
        return 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0036, code lost:
    
        android.util.Log.w(com.android.vcard.VCardEntryCommitter.LOG_TAG, "Found a next property during parsing a BASE64 string, which must not contain semi-colon or colon. Treat the line as next property.");
        android.util.Log.w(com.android.vcard.VCardEntryCommitter.LOG_TAG, "Problematic line: ".concat(java.lang.String.valueOf(r4.trim())));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected java.lang.String b(java.lang.String r4) throws defpackage.qyq {
        /*
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r4)
        L8:
            java.lang.String r4 = r3.g()
            if (r4 == 0) goto L53
            java.lang.String r1 = x(r4)
            java.util.Set r2 = r3.h()
            boolean r2 = r2.contains(r1)
            if (r2 != 0) goto L36
            java.lang.String r2 = "X-ANDROID-CUSTOM"
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto L25
            goto L36
        L25:
            r3.c()
            int r1 = r4.length()
            if (r1 == 0) goto L4e
            java.lang.String r4 = r4.trim()
            r0.append(r4)
            goto L8
        L36:
            java.lang.String r1 = "Found a next property during parsing a BASE64 string, which must not contain semi-colon or colon. Treat the line as next property."
            java.lang.String r2 = "vCard"
            android.util.Log.w(r2, r1)
            java.lang.String r4 = r4.trim()
            java.lang.String r4 = java.lang.String.valueOf(r4)
            java.lang.String r1 = "Problematic line: "
            java.lang.String r4 = r1.concat(r4)
            android.util.Log.w(r2, r4)
        L4e:
            java.lang.String r4 = r0.toString()
            return r4
        L53:
            qyq r4 = new qyq
            java.lang.String r0 = "File ended during parsing BASE64 binary"
            r4.<init>(r0)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.vcard.VCardParserImpl_V21.b(java.lang.String):java.lang.String");
    }

    protected String c() {
        return this.c.readLine();
    }

    protected String d() throws qyq {
        String strC;
        do {
            strC = c();
            if (strC == null) {
                throw new qyq("Reached end of buffer.");
            }
        } while (strC.trim().length() <= 0);
        return strC;
    }

    protected String e() {
        return VCardConstants.VERSION_V21;
    }

    protected final String g() {
        return this.c.peekLine();
    }

    protected Set h() {
        return VCardParser_V21.sKnownPropertyNameSet;
    }

    public final void i(VCardInterpreter vCardInterpreter) {
        this.f.add(vCardInterpreter);
    }

    public final synchronized void j() {
        Log.i(VCardEntryCommitter.LOG_TAG, "ParserImpl received cancel operation.");
        this.g = true;
    }

    public final void k(VCardProperty vCardProperty) {
        Iterator it = this.f.iterator();
        while (it.hasNext()) {
            ((VCardInterpreter) it.next()).onPropertyCreated(vCardProperty);
        }
    }

    protected void l(VCardProperty vCardProperty) throws qyp {
        if (ejuf.d(vCardProperty.getRawValue()).contains("BEGIN:VCARD")) {
            throw new qyp(null);
        }
        Iterator it = this.f.iterator();
        while (it.hasNext()) {
            ((VCardInterpreter) it.next()).onPropertyCreated(vCardProperty);
        }
    }

    protected void m(VCardProperty vCardProperty, String str, String str2) {
        vCardProperty.addParameter(str, str2);
    }

    protected void n(VCardProperty vCardProperty, String str) {
        q(vCardProperty, str);
    }

    public void o(VCardProperty vCardProperty, String str) throws qyq {
        String[] strArrSplit = str.split("=", 2);
        if (strArrSplit.length != 2) {
            n(vCardProperty, strArrSplit[0]);
            return;
        }
        String strD = ejuf.d(strArrSplit[0].trim());
        String strTrim = strArrSplit[1].trim();
        if (strD.equals(VCardConstants.PARAM_TYPE)) {
            q(vCardProperty, strTrim);
            return;
        }
        if (strD.equals(VCardConstants.PARAM_VALUE)) {
            if (!VCardParser_V21.sKnownValueSet.contains(ejuf.d(strTrim)) && !strTrim.startsWith("X-")) {
                Set set = this.e;
                if (!set.contains(strTrim)) {
                    set.add(strTrim);
                    Log.w(VCardEntryCommitter.LOG_TAG, String.format("The value unsupported by TYPE of %s: %s", Integer.valueOf(a()), strTrim));
                }
            }
            vCardProperty.addParameter(VCardConstants.PARAM_VALUE, strTrim);
            return;
        }
        if (strD.equals(VCardConstants.PARAM_ENCODING)) {
            String strD2 = ejuf.d(strTrim);
            if (!VCardParser_V21.sAvailableEncoding.contains(strD2) && !strD2.startsWith("X-")) {
                throw new qyq(a.a(strD2, "Unknown encoding \"", "\""));
            }
            vCardProperty.addParameter(VCardConstants.PARAM_ENCODING, strD2);
            this.b = ejuf.d(strD2);
            return;
        }
        if (strD.equals(VCardConstants.PARAM_CHARSET)) {
            vCardProperty.addParameter(VCardConstants.PARAM_CHARSET, strTrim);
            return;
        }
        if (!strD.equals(VCardConstants.PARAM_LANGUAGE)) {
            if (!strD.startsWith("X-")) {
                throw new qyq(a.a(strD, "Unknown type \"", "\""));
            }
            m(vCardProperty, strD, strTrim);
            return;
        }
        List listI = ejxk.b('-').i(strTrim);
        if (listI.size() != 2) {
            throw new qyq(a.a(strTrim, "Invalid Language: \"", "\""));
        }
        String str2 = (String) listI.get(0);
        int length = str2.length();
        for (int i = 0; i < length; i++) {
            if (!y(str2.charAt(i))) {
                throw new qyq(a.a(strTrim, "Invalid Language: \"", "\""));
            }
        }
        String str3 = (String) listI.get(1);
        int length2 = str3.length();
        for (int i2 = 0; i2 < length2; i2++) {
            if (!y(str3.charAt(i2))) {
                throw new qyq(a.a(strTrim, "Invalid Language: \"", "\""));
            }
        }
        vCardProperty.addParameter(VCardConstants.PARAM_LANGUAGE, strTrim);
    }

    public void p(VCardProperty vCardProperty, String str) throws qyq, UnsupportedEncodingException {
        String strD = ejuf.d(vCardProperty.getName());
        String rawValue = vCardProperty.getRawValue();
        Collection<String> parameters = vCardProperty.getParameters(VCardConstants.PARAM_CHARSET);
        StringBuilder sb = null;
        String next = parameters != null ? parameters.iterator().next() : null;
        if (true == TextUtils.isEmpty(next)) {
            next = "UTF-8";
        }
        if (strD.equals(VCardConstants.PROPERTY_ADR) || strD.equals(VCardConstants.PROPERTY_ORG) || strD.equals(VCardConstants.PROPERTY_N)) {
            List<String> arrayList = new ArrayList<>();
            if (this.b.equals(VCardConstants.PARAM_ENCODING_QP)) {
                String strV = v(rawValue);
                vCardProperty.setRawValue(strV);
                Iterator<String> it = VCardUtils.constructListFromValue(strV, a()).iterator();
                while (it.hasNext()) {
                    arrayList.add(VCardUtils.parseQuotedPrintable(it.next(), false, "ISO-8859-1", next));
                }
            } else {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(rawValue);
                while (true) {
                    String strG = g();
                    if (strG == null || strG.length() == 0 || x(strG) != null) {
                        break;
                    }
                    c();
                    sb2.append(" ");
                    sb2.append(strG);
                }
                arrayList.addAll(VCardUtils.constructListFromValue(VCardUtils.convertStringCharset(sb2.toString(), "ISO-8859-1", next), a()));
            }
            vCardProperty.setValues(arrayList);
            Iterator it2 = this.f.iterator();
            while (it2.hasNext()) {
                ((VCardInterpreter) it2.next()).onPropertyCreated(vCardProperty);
            }
            return;
        }
        if (this.b.equals(VCardConstants.PARAM_ENCODING_QP) || (strD.equals(VCardConstants.PROPERTY_FN) && vCardProperty.getParameters(VCardConstants.PARAM_ENCODING) == null && VCardUtils.appearsLikeAndroidVCardQuotedPrintable(rawValue))) {
            String strV2 = v(rawValue);
            String quotedPrintable = VCardUtils.parseQuotedPrintable(strV2, false, "ISO-8859-1", next);
            vCardProperty.setRawValue(strV2);
            vCardProperty.setValues(quotedPrintable);
            k(vCardProperty);
            return;
        }
        if (this.b.equals(VCardConstants.PARAM_ENCODING_BASE64) || this.b.equals(VCardConstants.PARAM_ENCODING_B)) {
            try {
                try {
                    vCardProperty.setByteValue(Base64.decode(b(rawValue), 0));
                    k(vCardProperty);
                    return;
                } catch (IllegalArgumentException e) {
                    throw new qyq(a.v(rawValue, "Decode error on base64 photo: "), e);
                }
            } catch (OutOfMemoryError unused) {
                Log.e(VCardEntryCommitter.LOG_TAG, "OutOfMemoryError happened during parsing BASE64 data!");
                k(vCardProperty);
                return;
            }
        }
        if (!this.b.equals(VCardConstants.PARAM_ENCODING_7BIT) && !this.b.equals(VCardConstants.PARAM_ENCODING_8BIT) && !this.b.startsWith("X-")) {
            Log.w(VCardEntryCommitter.LOG_TAG, String.format("The encoding \"%s\" is unsupported by vCard %s", this.b, e()));
        }
        if (a() == 0) {
            while (true) {
                String strG2 = g();
                if (TextUtils.isEmpty(strG2) || strG2.charAt(0) != ' ' || "END:VCARD".contains(ejuf.d(strG2))) {
                    break;
                }
                c();
                if (sb == null) {
                    sb = new StringBuilder();
                    sb.append(rawValue);
                }
                sb.append((CharSequence) strG2, 1, strG2.length());
            }
            if (sb != null) {
                rawValue = sb.toString();
            }
        }
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(f(VCardUtils.convertStringCharset(rawValue, "ISO-8859-1", next)));
        vCardProperty.setValues(arrayList2);
        k(vCardProperty);
    }

    public void q(VCardProperty vCardProperty, String str) {
        if (!VCardParser_V21.sKnownTypeSet.contains(ejuf.d(str)) && !str.startsWith("X-")) {
            Set set = this.d;
            if (!set.contains(str)) {
                set.add(str);
                Log.w(VCardEntryCommitter.LOG_TAG, String.format("TYPE unsupported by %s: %s", Integer.valueOf(a()), str));
            }
        }
        vCardProperty.addParameter(VCardConstants.PARAM_TYPE, str);
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0021, code lost:
    
        android.util.Log.i(com.android.vcard.VCardEntryCommitter.LOG_TAG, "Cancel request has come. exitting parse operation.");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void r(java.io.InputStream r3) {
        /*
            r2 = this;
            if (r3 == 0) goto L55
            java.lang.String r0 = r2.a
            java.io.InputStreamReader r1 = new java.io.InputStreamReader
            r1.<init>(r3, r0)
            com.android.vcard.VCardParserImpl_V21$CustomBufferedReader r3 = new com.android.vcard.VCardParserImpl_V21$CustomBufferedReader
            r3.<init>(r1)
            r2.c = r3
            java.util.List r3 = r2.f
            java.util.Iterator r3 = r3.iterator()
        L16:
            boolean r0 = r3.hasNext()
            if (r0 != 0) goto L4b
        L1c:
            monitor-enter(r2)
            boolean r3 = r2.g     // Catch: java.lang.Throwable -> L48
            if (r3 == 0) goto L2a
            java.lang.String r3 = "vCard"
            java.lang.String r0 = "Cancel request has come. exitting parse operation."
            android.util.Log.i(r3, r0)     // Catch: java.lang.Throwable -> L48
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L48
            goto L31
        L2a:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L48
            boolean r3 = r2.w()
            if (r3 != 0) goto L1c
        L31:
            java.util.List r3 = r2.f
            java.util.Iterator r3 = r3.iterator()
        L37:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L47
            java.lang.Object r0 = r3.next()
            com.android.vcard.VCardInterpreter r0 = (com.android.vcard.VCardInterpreter) r0
            r0.onVCardEnded()
            goto L37
        L47:
            return
        L48:
            r3 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L48
            throw r3
        L4b:
            java.lang.Object r0 = r3.next()
            com.android.vcard.VCardInterpreter r0 = (com.android.vcard.VCardInterpreter) r0
            r0.onVCardStarted()
            goto L16
        L55:
            java.lang.NullPointerException r3 = new java.lang.NullPointerException
            java.lang.String r0 = "InputStream must not be null."
            r3.<init>(r0)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.vcard.VCardParserImpl_V21.r(java.io.InputStream):void");
    }

    protected final void s() throws qyq, UnsupportedEncodingException {
        boolean zU;
        try {
            zU = u();
        } catch (qyr unused) {
            Log.e(VCardEntryCommitter.LOG_TAG, "Invalid line which looks like some comment was found. Ignored.");
            zU = false;
        }
        while (!zU) {
            try {
                zU = u();
            } catch (qyr unused2) {
                Log.e(VCardEntryCommitter.LOG_TAG, "Invalid line which looks like some comment was found. Ignored.");
            }
        }
    }

    public final void t(InputStream inputStream) {
        if (inputStream == null) {
            throw new NullPointerException("InputStream must not be null.");
        }
        this.c = new CustomBufferedReader(new InputStreamReader(inputStream, this.a));
        List list = this.f;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((VCardInterpreter) it.next()).onVCardStarted();
        }
        w();
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            ((VCardInterpreter) it2.next()).onVCardEnded();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00fb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected final boolean u() throws defpackage.qyq, java.io.UnsupportedEncodingException {
        /*
            Method dump skipped, instructions count: 475
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.vcard.VCardParserImpl_V21.u():boolean");
    }

    public VCardParserImpl_V21(byte[] bArr) {
        this.f = new ArrayList();
        this.d = new HashSet();
        this.e = new HashSet();
        this.a = "ISO-8859-1";
    }

    protected String f(String str) {
        return str;
    }
}
