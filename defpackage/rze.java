package defpackage;

import android.graphics.Matrix;
import android.util.Log;
import com.google.android.ims.rcsservice.chatsession.message.ConversationSuggestion;
import com.sun.jna.Function;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.zip.GZIPInputStream;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParserFactory;
import org.xml.sax.Attributes;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import org.xml.sax.XMLReader;
import org.xml.sax.ext.DefaultHandler2;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class rze extends DefaultHandler2 {
    private int d;
    private ryk a = null;
    private rxo b = null;
    private boolean c = false;
    private boolean e = false;
    private rzc f = null;
    private StringBuilder g = null;
    private boolean h = false;
    private StringBuilder i = null;

    private static final void A(rxq rxqVar, Attributes attributes) throws SAXException {
        for (int i = 0; i < attributes.getLength(); i++) {
            String qName = attributes.getQName(i);
            if (qName.equals("id") || qName.equals("xml:id")) {
                rxqVar.o = attributes.getValue(i).trim();
                return;
            }
            if (qName.equals("xml:space")) {
                String strTrim = attributes.getValue(i).trim();
                if ("default".equals(strTrim)) {
                    rxqVar.p = Boolean.FALSE;
                    return;
                } else {
                    if (!"preserve".equals(strTrim)) {
                        throw new SAXException("Invalid value for \"xml:space\" attribute: ".concat(String.valueOf(strTrim)));
                    }
                    rxqVar.p = Boolean.TRUE;
                    return;
                }
            }
        }
    }

    private static final void B(rxe rxeVar, Attributes attributes, String str) throws SAXException {
        for (int i = 0; i < attributes.getLength(); i++) {
            if (rzb.a(attributes.getLocalName(i)) == rzb.points) {
                rzd rzdVar = new rzd(attributes.getValue(i));
                ArrayList arrayList = new ArrayList();
                rzdVar.l();
                while (!rzdVar.o()) {
                    float fC = rzdVar.c();
                    if (Float.isNaN(fC)) {
                        throw new SAXException(a.a(str, "Invalid <", "> points attribute. Non-coordinate content found in list."));
                    }
                    rzdVar.q();
                    float fC2 = rzdVar.c();
                    if (Float.isNaN(fC2)) {
                        throw new SAXException(a.a(str, "Invalid <", "> points attribute. There should be an even number of coordinates."));
                    }
                    rzdVar.q();
                    arrayList.add(Float.valueOf(fC));
                    arrayList.add(Float.valueOf(fC2));
                }
                rxeVar.a = new float[arrayList.size()];
                int size = arrayList.size();
                int i2 = 0;
                int i3 = 0;
                while (i2 < size) {
                    rxeVar.a[i3] = ((Float) arrayList.get(i2)).floatValue();
                    i2++;
                    i3++;
                }
            }
        }
    }

    private static final void C(rxq rxqVar, Attributes attributes) throws SAXException {
        for (int i = 0; i < attributes.getLength(); i++) {
            String strTrim = attributes.getValue(i).trim();
            if (strTrim.length() != 0) {
                int iOrdinal = rzb.a(attributes.getLocalName(i)).ordinal();
                if (iOrdinal == 0) {
                    rvw rvwVar = new rvw(strTrim);
                    ArrayList arrayList = null;
                    while (!rvwVar.o()) {
                        String strA = rvwVar.a();
                        if (strA == null) {
                            throw new SAXException("Invalid value for \"class\" attribute: ".concat(String.valueOf(strTrim)));
                        }
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                        }
                        arrayList.add(strA);
                        rvwVar.l();
                    }
                    rxqVar.s = arrayList;
                } else if (iOrdinal != 72) {
                    if (rxqVar.q == null) {
                        rxqVar.q = new rxj();
                    }
                    c(rxqVar.q, attributes.getLocalName(i), attributes.getValue(i).trim());
                } else {
                    rzd rzdVar = new rzd(strTrim.replaceAll("/\\*.*?\\*/", ""));
                    while (true) {
                        String strK = rzdVar.k(':');
                        rzdVar.l();
                        if (rzdVar.m(':')) {
                            rzdVar.l();
                            String strK2 = rzdVar.k(';');
                            if (strK2 != null) {
                                rzdVar.l();
                                if (rzdVar.o() || rzdVar.m(';')) {
                                    if (rxqVar.r == null) {
                                        rxqVar.r = new rxj();
                                    }
                                    c(rxqVar.r, strK, strK2);
                                    rzdVar.l();
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    private static final void D(ryf ryfVar, Attributes attributes) {
        for (int i = 0; i < attributes.getLength(); i++) {
            String strTrim = attributes.getValue(i).trim();
            int iOrdinal = rzb.a(attributes.getLocalName(i)).ordinal();
            if (iOrdinal == 9) {
                ryfVar.d = n(strTrim);
            } else if (iOrdinal == 10) {
                ryfVar.e = n(strTrim);
            } else if (iOrdinal == 82) {
                ryfVar.b = n(strTrim);
            } else if (iOrdinal == 83) {
                ryfVar.c = n(strTrim);
            }
        }
    }

    private static final void E(rxw rxwVar, Attributes attributes) throws SAXException {
        for (int i = 0; i < attributes.getLength(); i++) {
            String strTrim = attributes.getValue(i).trim();
            int iOrdinal = rzb.a(attributes.getLocalName(i)).ordinal();
            if (iOrdinal == 48) {
                w(rxwVar, strTrim);
            } else if (iOrdinal != 80) {
                continue;
            } else {
                rzd rzdVar = new rzd(strTrim);
                rzdVar.l();
                float fC = rzdVar.c();
                rzdVar.q();
                float fC2 = rzdVar.c();
                rzdVar.q();
                float fC3 = rzdVar.c();
                rzdVar.q();
                float fC4 = rzdVar.c();
                if (Float.isNaN(fC) || Float.isNaN(fC2) || Float.isNaN(fC3) || Float.isNaN(fC4)) {
                    throw new SAXException("Invalid viewBox definition - should have four numbers");
                }
                if (fC3 < 0.0f) {
                    throw new SAXException("Invalid viewBox. width cannot be negative");
                }
                if (fC4 < 0.0f) {
                    throw new SAXException("Invalid viewBox. height cannot be negative");
                }
                rxwVar.w = new rwh(fC, fC2, fC3, fC4);
            }
        }
    }

    private static float F(String str, int i) throws SAXException {
        float fA = new rwe().a(str, 0, i);
        if (Float.isNaN(fA)) {
            throw new SAXException("Invalid float value: ".concat(String.valueOf(str)));
        }
        return fA;
    }

    private static final Matrix G(String str) throws SAXException {
        Matrix matrix = new Matrix();
        rzd rzdVar = new rzd(str);
        rzdVar.l();
        while (!rzdVar.o()) {
            String strSubstring = null;
            if (!rzdVar.o()) {
                int i = rzdVar.b;
                String str2 = rzdVar.a;
                int iCharAt = str2.charAt(i);
                while (true) {
                    if ((iCharAt < 97 || iCharAt > 122) && (iCharAt < 65 || iCharAt > 90)) {
                        break;
                    }
                    iCharAt = rzdVar.e();
                }
                int i2 = rzdVar.b;
                while (rzd.s(iCharAt)) {
                    iCharAt = rzdVar.e();
                }
                if (iCharAt == 40) {
                    rzdVar.b++;
                    strSubstring = str2.substring(i, i2);
                } else {
                    rzdVar.b = i;
                }
            }
            if (strSubstring == null) {
                throw new SAXException("Bad transform function encountered in transform list: ".concat(String.valueOf(str)));
            }
            if (strSubstring.equals("matrix")) {
                rzdVar.l();
                float fC = rzdVar.c();
                rzdVar.q();
                float fC2 = rzdVar.c();
                rzdVar.q();
                float fC3 = rzdVar.c();
                rzdVar.q();
                float fC4 = rzdVar.c();
                rzdVar.q();
                float fC5 = rzdVar.c();
                rzdVar.q();
                float fC6 = rzdVar.c();
                rzdVar.l();
                if (Float.isNaN(fC6) || !rzdVar.m(')')) {
                    throw new SAXException("Invalid transform list: ".concat(String.valueOf(str)));
                }
                Matrix matrix2 = new Matrix();
                matrix2.setValues(new float[]{fC, fC3, fC5, fC2, fC4, fC6, 0.0f, 0.0f, 1.0f});
                matrix.preConcat(matrix2);
            } else if (strSubstring.equals("translate")) {
                rzdVar.l();
                float fC7 = rzdVar.c();
                float fD = rzdVar.d();
                rzdVar.l();
                if (Float.isNaN(fC7) || !rzdVar.m(')')) {
                    throw new SAXException("Invalid transform list: ".concat(String.valueOf(str)));
                }
                if (Float.isNaN(fD)) {
                    matrix.preTranslate(fC7, 0.0f);
                } else {
                    matrix.preTranslate(fC7, fD);
                }
            } else if (strSubstring.equals("scale")) {
                rzdVar.l();
                float fC8 = rzdVar.c();
                float fD2 = rzdVar.d();
                rzdVar.l();
                if (Float.isNaN(fC8) || !rzdVar.m(')')) {
                    throw new SAXException("Invalid transform list: ".concat(String.valueOf(str)));
                }
                if (Float.isNaN(fD2)) {
                    matrix.preScale(fC8, fC8);
                } else {
                    matrix.preScale(fC8, fD2);
                }
            } else if (strSubstring.equals("rotate")) {
                rzdVar.l();
                float fC9 = rzdVar.c();
                float fD3 = rzdVar.d();
                float fD4 = rzdVar.d();
                rzdVar.l();
                if (Float.isNaN(fC9) || !rzdVar.m(')')) {
                    throw new SAXException("Invalid transform list: ".concat(String.valueOf(str)));
                }
                if (Float.isNaN(fD3)) {
                    matrix.preRotate(fC9);
                } else {
                    if (Float.isNaN(fD4)) {
                        throw new SAXException("Invalid transform list: ".concat(String.valueOf(str)));
                    }
                    matrix.preRotate(fC9, fD3, fD4);
                }
            } else if (strSubstring.equals("skewX")) {
                rzdVar.l();
                float fC10 = rzdVar.c();
                rzdVar.l();
                if (Float.isNaN(fC10) || !rzdVar.m(')')) {
                    throw new SAXException("Invalid transform list: ".concat(String.valueOf(str)));
                }
                matrix.preSkew((float) Math.tan(Math.toRadians(fC10)), 0.0f);
            } else {
                if (!strSubstring.equals("skewY")) {
                    throw new SAXException(a.a(strSubstring, "Invalid transform list fn: ", ")"));
                }
                rzdVar.l();
                float fC11 = rzdVar.c();
                rzdVar.l();
                if (Float.isNaN(fC11) || !rzdVar.m(')')) {
                    throw new SAXException("Invalid transform list: ".concat(String.valueOf(str)));
                }
                matrix.preSkew(0.0f, (float) Math.tan(Math.toRadians(fC11)));
            }
            if (rzdVar.o()) {
                break;
            }
            rzdVar.q();
        }
        return matrix;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0065  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final void H(defpackage.rwp r7, org.xml.sax.Attributes r8) throws org.xml.sax.SAXException {
        /*
            r0 = 0
            r1 = r0
        L2:
            int r2 = r8.getLength()
            if (r1 >= r2) goto Lc2
            java.lang.String r2 = r8.getValue(r1)
            java.lang.String r2 = r2.trim()
            java.lang.String r3 = r8.getLocalName(r1)
            rzb r3 = defpackage.rzb.a(r3)
            int r3 = r3.ordinal()
            r4 = 23
            if (r3 == r4) goto Lb8
            r4 = 24
            r5 = 1
            if (r3 == r4) goto L92
            r4 = 26
            if (r3 == r4) goto L83
            r4 = 60
            if (r3 == r4) goto L2f
            goto Lbe
        L2f:
            int r3 = r2.hashCode()     // Catch: java.lang.IllegalArgumentException -> L75
            r4 = -934531685(0xffffffffc84c2d9b, float:-209078.42)
            r6 = 2
            if (r3 == r4) goto L58
            r4 = 110739(0x1b093, float:1.55178E-40)
            if (r3 == r4) goto L4e
            r4 = 1085265597(0x40afd6bd, float:5.494963)
            if (r3 == r4) goto L44
            goto L62
        L44:
            java.lang.String r3 = "reflect"
            boolean r3 = r2.equals(r3)
            if (r3 == 0) goto L62
            r3 = r5
            goto L63
        L4e:
            java.lang.String r3 = "pad"
            boolean r3 = r2.equals(r3)
            if (r3 == 0) goto L62
            r3 = r0
            goto L63
        L58:
            java.lang.String r3 = "repeat"
            boolean r3 = r2.equals(r3)
            if (r3 == 0) goto L62
            r3 = r6
            goto L63
        L62:
            r3 = -1
        L63:
            if (r3 == 0) goto L72
            if (r3 == r5) goto L71
            if (r3 != r6) goto L6b
            r5 = 3
            goto L72
        L6b:
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException     // Catch: java.lang.IllegalArgumentException -> L75
            r7.<init>()     // Catch: java.lang.IllegalArgumentException -> L75
            throw r7     // Catch: java.lang.IllegalArgumentException -> L75
        L71:
            r5 = r6
        L72:
            r7.e = r5     // Catch: java.lang.IllegalArgumentException -> L75
            goto Lbe
        L75:
            org.xml.sax.SAXException r7 = new org.xml.sax.SAXException
            java.lang.String r8 = "Invalid spreadMethod attribute. \""
            java.lang.String r0 = "\" is not a valid value."
            java.lang.String r8 = defpackage.a.a(r2, r8, r0)
            r7.<init>(r8)
            throw r7
        L83:
            java.lang.String r3 = r8.getURI(r1)
            java.lang.String r4 = "http://www.w3.org/1999/xlink"
            boolean r3 = r4.equals(r3)
            if (r3 == 0) goto Lbe
            r7.d = r2
            goto Lbe
        L92:
            java.lang.String r3 = "objectBoundingBox"
            boolean r3 = r3.equals(r2)
            if (r3 == 0) goto La1
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r0)
            r7.b = r2
            goto Lbe
        La1:
            java.lang.String r3 = "userSpaceOnUse"
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto Lb0
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r5)
            r7.b = r2
            goto Lbe
        Lb0:
            org.xml.sax.SAXException r7 = new org.xml.sax.SAXException
            java.lang.String r8 = "Invalid value for attribute gradientUnits"
            r7.<init>(r8)
            throw r7
        Lb8:
            android.graphics.Matrix r2 = G(r2)
            r7.c = r2
        Lbe:
            int r1 = r1 + 1
            goto L2
        Lc2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rze.H(rwp, org.xml.sax.Attributes):void");
    }

    private static final void I(rws rwsVar, Attributes attributes) {
        for (int i = 0; i < attributes.getLength(); i++) {
            if (rzb.a(attributes.getLocalName(i)) == rzb.transform) {
                rwsVar.a(G(attributes.getValue(i)));
            }
        }
    }

    protected static rwu a(String str) throws SAXException {
        int i;
        int iA;
        if (str.length() == 0) {
            throw new SAXException("Invalid length value (empty string)");
        }
        int length = str.length();
        int i2 = length - 1;
        char cCharAt = str.charAt(i2);
        try {
            if (cCharAt != '%') {
                i = 1;
                if (length > 2 && Character.isLetter(cCharAt)) {
                    i2 = length - 2;
                    if (Character.isLetter(str.charAt(i2))) {
                        try {
                            iA = ryh.a(str.substring(i2).toLowerCase(Locale.US));
                        } catch (IllegalArgumentException unused) {
                            throw new SAXException("Invalid length unit specifier: ".concat(String.valueOf(str)));
                        }
                    }
                }
                return new rwu(F(str, length), i);
            }
            iA = 9;
            return new rwu(F(str, length), i);
        } catch (NumberFormatException e) {
            throw new SAXException("Invalid length value: ".concat(String.valueOf(str)), e);
        }
        i = iA;
        length = i2;
    }

    protected static void c(rxj rxjVar, String str, String str2) {
        Boolean bool;
        String strK;
        int i;
        rwu rwuVarF;
        if (str2.length() == 0 || str2.equals("inherit")) {
            return;
        }
        int iOrdinal = rzb.a(str).ordinal();
        int i2 = 5;
        rwi rwiVar = null;
        rwuVarArr = null;
        rwuVarArr = null;
        rwu[] rwuVarArr = null;
        String strSubstring = null;
        if (iOrdinal == 1) {
            if (!"auto".equals(str2)) {
                if (!str2.toLowerCase(Locale.US).startsWith("rect(")) {
                    throw new SAXException("Invalid clip attribute shape. Only rect() is supported.");
                }
                rzd rzdVar = new rzd(str2.substring(5));
                rzdVar.l();
                rwu rwuVarI = i(rzdVar);
                rzdVar.q();
                rwu rwuVarI2 = i(rzdVar);
                rzdVar.q();
                rwu rwuVarI3 = i(rzdVar);
                rzdVar.q();
                rwu rwuVarI4 = i(rzdVar);
                rzdVar.l();
                if (!rzdVar.m(')')) {
                    throw new SAXException("Bad rect() clip definition: ".concat(String.valueOf(str2)));
                }
                rwiVar = new rwi(rwuVarI, rwuVarI2, rwuVarI3, rwuVarI4);
            }
            rxjVar.p = rwiVar;
            rxjVar.a |= 1048576;
            return;
        }
        if (iOrdinal == 2) {
            rxjVar.x = l(str2, str);
            rxjVar.a |= 268435456;
            return;
        }
        if (iOrdinal == 4) {
            rxjVar.K = x(str2);
            rxjVar.a |= 536870912;
            return;
        }
        if (iOrdinal == 5) {
            rxjVar.k = g(str2);
            rxjVar.a |= 4096;
            return;
        }
        if (iOrdinal == 8) {
            if (!"ltr".equals(str2)) {
                if (!"rtl".equals(str2)) {
                    throw new SAXException("Invalid direction property: ".concat(String.valueOf(str2)));
                }
                i = 2;
            }
            rxjVar.I = i;
            rxjVar.a |= 68719476736L;
            return;
        }
        if (iOrdinal == 35) {
            rxjVar.y = l(str2, str);
            rxjVar.a |= 1073741824;
            return;
        }
        if (iOrdinal == 40) {
            rxjVar.j = Float.valueOf(e(str2));
            rxjVar.a |= 2048;
            return;
        }
        if (iOrdinal == 42) {
            if ("visible".equals(str2) || "auto".equals(str2)) {
                bool = Boolean.TRUE;
            } else {
                if (!"hidden".equals(str2) && !"scroll".equals(str2)) {
                    throw new SAXException("Invalid toverflow property: ".concat(String.valueOf(str2)));
                }
                bool = Boolean.FALSE;
            }
            rxjVar.o = bool;
            rxjVar.a |= 524288;
            return;
        }
        if (iOrdinal == 78) {
            if (!"none".equals(str2)) {
                if (!"non-scaling-stroke".equals(str2)) {
                    throw new SAXException("Invalid vector-effect property: ".concat(String.valueOf(str2)));
                }
                i = 2;
            }
            rxjVar.L = i;
            rxjVar.a |= 34359738368L;
            return;
        }
        if (iOrdinal == 58) {
            if (str2.equals("currentColor")) {
                rxjVar.z = rwm.a;
            } else {
                rxjVar.z = g(str2);
            }
            rxjVar.a |= 2147483648L;
            return;
        }
        if (iOrdinal == 59) {
            rxjVar.A = Float.valueOf(e(str2));
            rxjVar.a |= 4294967296L;
            return;
        }
        if (iOrdinal == 74) {
            if (!ConversationSuggestion.SUGGESTION_PROPERTY_CALENDAR_START_TIME.equals(str2)) {
                if ("middle".equals(str2)) {
                    i = 2;
                } else {
                    if (!ConversationSuggestion.SUGGESTION_PROPERTY_CALENDAR_END_TIME.equals(str2)) {
                        throw new SAXException("Invalid text-anchor property: ".concat(String.valueOf(str2)));
                    }
                    i = 3;
                }
            }
            rxjVar.J = i;
            rxjVar.a |= 262144;
            return;
        }
        if (iOrdinal == 75) {
            if ("none".equals(str2)) {
                i2 = 1;
            } else if ("underline".equals(str2)) {
                i2 = 2;
            } else if ("overline".equals(str2)) {
                i2 = 3;
            } else if ("line-through".equals(str2)) {
                i2 = 4;
            } else if (!"blink".equals(str2)) {
                throw new SAXException("Invalid text-decoration property: ".concat(String.valueOf(str2)));
            }
            rxjVar.H = i2;
            rxjVar.a |= 131072;
            return;
        }
        switch (iOrdinal) {
            case 14:
                if (str2.indexOf(124) >= 0 || "|inline|block|list-item|run-in|compact|marker|table|inline-table|table-row-group|table-header-group|table-footer-group|table-row|table-column-group|table-column|table-cell|table-caption|none|".indexOf(a.a(str2, "|", "|")) == -1) {
                    throw new SAXException("Invalid value for \"display\" attribute: ".concat(String.valueOf(str2)));
                }
                rxjVar.t = Boolean.valueOf(!str2.equals("none"));
                rxjVar.a |= 16777216;
                return;
            case 15:
                rxjVar.b = k(str2, "fill");
                rxjVar.a |= 1;
                return;
            case 16:
                rxjVar.D = x(str2);
                rxjVar.a |= 2;
                return;
            case 17:
                rxjVar.c = Float.valueOf(e(str2));
                rxjVar.a |= 4;
                return;
            case 18:
                if ("|caption|icon|menu|message-box|small-caption|status-bar|".indexOf(a.a(str2, "|", "|")) == -1) {
                    rzd rzdVar2 = new rzd(str2);
                    int iY = 0;
                    Integer numA = null;
                    String str3 = null;
                    while (true) {
                        strK = rzdVar2.k('/');
                        rzdVar2.l();
                        if (strK == null) {
                            throw new SAXException("Invalid font style attribute: missing font size and family");
                        }
                        if (numA == null) {
                            i = iY;
                        } else if (iY == 0) {
                            i = 0;
                        }
                        if (!strK.equals("normal") && (numA != null || (numA = rza.a(strK)) == null)) {
                            if (i == 0) {
                                iY = y(strK);
                                if (iY != 0) {
                                    continue;
                                }
                            } else {
                                iY = i;
                            }
                            if (str3 == null && strK.equals("small-caps")) {
                                str3 = strK;
                            }
                        }
                    }
                    rwu rwuVarH = h(strK);
                    if (rzdVar2.m('/')) {
                        rzdVar2.l();
                        String strJ = rzdVar2.j();
                        if (strJ == null) {
                            throw new SAXException("Invalid font style attribute: missing line-height");
                        }
                        a(strJ);
                        rzdVar2.l();
                    }
                    if (!rzdVar2.o()) {
                        int i3 = rzdVar2.b;
                        rzdVar2.b = rzdVar2.c;
                        strSubstring = rzdVar2.a.substring(i3);
                    }
                    rxjVar.l = m(strSubstring);
                    rxjVar.m = rwuVarH;
                    rxjVar.n = Integer.valueOf(numA == null ? 400 : numA.intValue());
                    rxjVar.G = iY != 0 ? iY : 1;
                    rxjVar.a |= 122880;
                    return;
                }
                return;
            case 19:
                rxjVar.l = m(str2);
                rxjVar.a |= 8192;
                return;
            case 20:
                rxjVar.m = h(str2);
                rxjVar.a |= 16384;
                return;
            case 21:
                Integer numA2 = rza.a(str2);
                if (numA2 == null) {
                    throw new SAXException("Invalid font-weight property: ".concat(String.valueOf(str2)));
                }
                rxjVar.n = numA2;
                rxjVar.a |= 32768;
                return;
            case 22:
                int iY2 = y(str2);
                if (iY2 == 0) {
                    throw new SAXException("Invalid font-style property: ".concat(String.valueOf(str2)));
                }
                rxjVar.G = iY2;
                rxjVar.a |= 65536;
                return;
            default:
                switch (iOrdinal) {
                    case 28:
                        rxjVar.q = l(str2, str);
                        String str4 = rxjVar.q;
                        rxjVar.r = str4;
                        rxjVar.s = str4;
                        rxjVar.a |= 14680064;
                        return;
                    case 29:
                        rxjVar.q = l(str2, str);
                        rxjVar.a |= 2097152;
                        return;
                    case 30:
                        rxjVar.r = l(str2, str);
                        rxjVar.a |= 4194304;
                        return;
                    case 31:
                        rxjVar.s = l(str2, str);
                        rxjVar.a |= 8388608;
                        return;
                    default:
                        switch (iOrdinal) {
                            case 62:
                                if (str2.equals("currentColor")) {
                                    rxjVar.v = rwm.a;
                                } else {
                                    rxjVar.v = g(str2);
                                }
                                rxjVar.a |= 67108864;
                                return;
                            case Function.ALT_CONVENTION /* 63 */:
                                rxjVar.w = Float.valueOf(e(str2));
                                rxjVar.a |= 134217728;
                                return;
                            case 64:
                                rxjVar.d = k(str2, "stroke");
                                rxjVar.a |= 8;
                                return;
                            case 65:
                                if ("none".equals(str2)) {
                                    rxjVar.h = null;
                                } else {
                                    rzd rzdVar3 = new rzd(str2);
                                    rzdVar3.l();
                                    if (!rzdVar3.o() && (rwuVarF = rzdVar3.f()) != null) {
                                        if (rwuVarF.e()) {
                                            throw new SAXException("Invalid stroke-dasharray. Dash segemnts cannot be negative: ".concat(String.valueOf(str2)));
                                        }
                                        float f = rwuVarF.a;
                                        ArrayList arrayList = new ArrayList();
                                        arrayList.add(rwuVarF);
                                        while (!rzdVar3.o()) {
                                            rzdVar3.q();
                                            rwu rwuVarF2 = rzdVar3.f();
                                            if (rwuVarF2 == null) {
                                                throw new SAXException("Invalid stroke-dasharray. Non-Length content found: ".concat(String.valueOf(str2)));
                                            }
                                            if (rwuVarF2.e()) {
                                                throw new SAXException("Invalid stroke-dasharray. Dash segemnts cannot be negative: ".concat(String.valueOf(str2)));
                                            }
                                            arrayList.add(rwuVarF2);
                                            f += rwuVarF2.a;
                                        }
                                        if (f != 0.0f) {
                                            rwuVarArr = (rwu[]) arrayList.toArray(new rwu[arrayList.size()]);
                                        }
                                    }
                                    rxjVar.h = rwuVarArr;
                                }
                                rxjVar.a |= 512;
                                return;
                            case 66:
                                rxjVar.i = a(str2);
                                rxjVar.a |= 1024;
                                return;
                            case 67:
                                if (!"butt".equals(str2)) {
                                    if ("round".equals(str2)) {
                                        i = 2;
                                    } else {
                                        if (!"square".equals(str2)) {
                                            throw new SAXException("Invalid stroke-linecap property: ".concat(String.valueOf(str2)));
                                        }
                                        i = 3;
                                    }
                                }
                                rxjVar.E = i;
                                rxjVar.a |= 64;
                                return;
                            case 68:
                                if (!"miter".equals(str2)) {
                                    if ("round".equals(str2)) {
                                        i = 2;
                                    } else {
                                        if (!"bevel".equals(str2)) {
                                            throw new SAXException("Invalid stroke-linejoin property: ".concat(String.valueOf(str2)));
                                        }
                                        i = 3;
                                    }
                                }
                                rxjVar.F = i;
                                rxjVar.a |= 128;
                                return;
                            case 69:
                                rxjVar.g = Float.valueOf(d(str2));
                                rxjVar.a |= 256;
                                return;
                            case 70:
                                rxjVar.e = Float.valueOf(e(str2));
                                rxjVar.a |= 16;
                                return;
                            case 71:
                                rxjVar.f = a(str2);
                                rxjVar.a |= 32;
                                return;
                            default:
                                switch (iOrdinal) {
                                    case 88:
                                        if (str2.equals("currentColor")) {
                                            rxjVar.B = rwm.a;
                                        } else {
                                            rxjVar.B = g(str2);
                                        }
                                        rxjVar.a |= 8589934592L;
                                        return;
                                    case 89:
                                        rxjVar.C = Float.valueOf(e(str2));
                                        rxjVar.a |= 17179869184L;
                                        return;
                                    case 90:
                                        if (str2.indexOf(124) >= 0 || "|visible|hidden|collapse|".indexOf(a.a(str2, "|", "|")) == -1) {
                                            throw new SAXException("Invalid value for \"visibility\" attribute: ".concat(String.valueOf(str2)));
                                        }
                                        rxjVar.u = Boolean.valueOf(str2.equals("visible"));
                                        rxjVar.a |= 33554432;
                                        return;
                                    default:
                                        return;
                                }
                        }
                }
        }
    }

    private static float d(String str) throws SAXException {
        int length = str.length();
        if (length != 0) {
            return F(str, length);
        }
        throw new SAXException("Invalid float value (empty string)");
    }

    private static float e(String str) throws SAXException {
        float fD = d(str);
        if (fD < 0.0f) {
            return 0.0f;
        }
        if (fD > 1.0f) {
            return 1.0f;
        }
        return fD;
    }

    private static int f(float f) {
        if (f < 0.0f) {
            return 0;
        }
        if (f > 255.0f) {
            return 255;
        }
        return Math.round(f);
    }

    private static rwl g(String str) throws SAXException {
        long j;
        int i;
        if (str.charAt(0) != '#') {
            if (!str.toLowerCase(Locale.US).startsWith("rgb(")) {
                Integer num = (Integer) ryy.a.get(str.toLowerCase(Locale.US));
                if (num != null) {
                    return new rwl(num.intValue());
                }
                throw new SAXException("Invalid colour keyword: ".concat(String.valueOf(str)));
            }
            rzd rzdVar = new rzd(str.substring(4));
            rzdVar.l();
            float fC = rzdVar.c();
            if (!Float.isNaN(fC) && rzdVar.m('%')) {
                fC = (fC * 256.0f) / 100.0f;
            }
            float fB = rzdVar.b(fC);
            if (!Float.isNaN(fB) && rzdVar.m('%')) {
                fB = (fB * 256.0f) / 100.0f;
            }
            float fB2 = rzdVar.b(fB);
            if (!Float.isNaN(fB2) && rzdVar.m('%')) {
                fB2 = (fB2 * 256.0f) / 100.0f;
            }
            rzdVar.l();
            if (Float.isNaN(fB2) || !rzdVar.m(')')) {
                throw new SAXException("Bad rgb() colour value: ".concat(String.valueOf(str)));
            }
            return new rwl((f(fC) << 16) | (f(fB) << 8) | f(fB2));
        }
        int length = str.length();
        rwd rwdVar = null;
        if (length > 1) {
            long j2 = 0;
            int i2 = 1;
            while (i2 < length) {
                char cCharAt = str.charAt(i2);
                if (cCharAt < '0' || cCharAt > '9') {
                    if (cCharAt >= 'A' && cCharAt <= 'F') {
                        j = j2 * 16;
                        i = cCharAt - 'A';
                    } else {
                        if (cCharAt < 'a' || cCharAt > 'f') {
                            break;
                        }
                        j = j2 * 16;
                        i = cCharAt - 'a';
                    }
                    j2 = j + i + 10;
                } else {
                    j2 = (j2 * 16) + (cCharAt - '0');
                }
                if (j2 > 4294967295L) {
                    break;
                }
                i2++;
            }
            if (i2 != 1) {
                rwdVar = new rwd(j2, i2);
            }
        }
        if (rwdVar == null) {
            throw new SAXException("Bad hex colour value: ".concat(String.valueOf(str)));
        }
        int i3 = rwdVar.a;
        if (i3 == 7) {
            return new rwl(rwdVar.a());
        }
        if (i3 != 4) {
            throw new SAXException("Bad hex colour value: ".concat(String.valueOf(str)));
        }
        int iA = rwdVar.a();
        int i4 = iA & 3840;
        int i5 = iA & 240;
        int i6 = iA & 15;
        return new rwl(i6 | (i4 << 8) | (i4 << 12) | (-16777216) | (i5 << 8) | (i5 << 4) | (i6 << 4));
    }

    private static rwu h(String str) {
        rwu rwuVar = (rwu) ryz.a.get(str);
        return rwuVar == null ? a(str) : rwuVar;
    }

    private static rwu i(rzd rzdVar) {
        return rzdVar.n("auto") ? new rwu(0.0f) : rzdVar.f();
    }

    private static rxt j(String str) {
        if (str.equals("none")) {
            return null;
        }
        return str.equals("currentColor") ? rwm.a : g(str);
    }

    private static rxt k(String str, String str2) throws SAXException {
        if (!str.startsWith("url(")) {
            return j(str);
        }
        int iIndexOf = str.indexOf(")");
        if (iIndexOf == -1) {
            throw new SAXException(a.a(str2, "Bad ", " attribute. Unterminated url() reference"));
        }
        String strTrim = str.substring(4, iIndexOf).trim();
        String strTrim2 = str.substring(iIndexOf + 1).trim();
        return new rwz(strTrim, strTrim2.length() > 0 ? j(strTrim2) : null);
    }

    private static String l(String str, String str2) throws SAXException {
        if (str.equals("none")) {
            return null;
        }
        if (str.startsWith("url(") && str.endsWith(")")) {
            return str.substring(4, str.length() - 1).trim();
        }
        throw new SAXException(a.a(str2, "Bad ", " attribute. Expected \"none\" or \"url()\" format"));
    }

    private static List m(String str) {
        rzd rzdVar = new rzd(str);
        ArrayList arrayList = null;
        do {
            String strI = rzdVar.i();
            if (strI == null) {
                strI = rzdVar.k(',');
            }
            if (strI == null) {
                return arrayList;
            }
            if (arrayList == null) {
                arrayList = new ArrayList();
            }
            arrayList.add(strI);
            rzdVar.q();
        } while (!rzdVar.o());
        return arrayList;
    }

    private static List n(String str) throws SAXException {
        if (str.length() == 0) {
            throw new SAXException("Invalid length list (empty string)");
        }
        ArrayList arrayList = new ArrayList(1);
        rzd rzdVar = new rzd(str);
        rzdVar.l();
        while (!rzdVar.o()) {
            float fC = rzdVar.c();
            if (Float.isNaN(fC)) {
                int i = rzdVar.b;
                while (!rzdVar.o() && !rzd.s(rzdVar.a.charAt(rzdVar.b))) {
                    rzdVar.b++;
                }
                String strSubstring = rzdVar.a.substring(i, rzdVar.b);
                rzdVar.b = i;
                throw new SAXException("Invalid length list value: ".concat(String.valueOf(strSubstring)));
            }
            int iR = rzdVar.r();
            if (iR == 0) {
                iR = 1;
            }
            arrayList.add(new rwu(fC, iR));
            rzdVar.q();
        }
        return arrayList;
    }

    private final void o(Attributes attributes) throws SAXException {
        rxo rxoVar = this.b;
        if (rxoVar == null) {
            throw new SAXException("Invalid document. Root element must be <svg>");
        }
        rwj rwjVar = new rwj();
        rwjVar.t = this.a;
        rwjVar.u = rxoVar;
        A(rwjVar, attributes);
        C(rwjVar, attributes);
        I(rwjVar, attributes);
        z(rwjVar, attributes);
        for (int i = 0; i < attributes.getLength(); i++) {
            String strTrim = attributes.getValue(i).trim();
            int iOrdinal = rzb.a(attributes.getLocalName(i)).ordinal();
            if (iOrdinal == 6) {
                rwjVar.a = a(strTrim);
            } else if (iOrdinal == 7) {
                rwjVar.b = a(strTrim);
            } else if (iOrdinal != 49) {
                continue;
            } else {
                rwjVar.c = a(strTrim);
                if (rwjVar.c.e()) {
                    throw new SAXException("Invalid <circle> element. r cannot be negative");
                }
            }
        }
        this.b.b(rwjVar);
    }

    private final void p(Attributes attributes) throws SAXException {
        if (this.b == null) {
            throw new SAXException("Invalid document. Root element must be <svg>");
        }
        rwk rwkVar = new rwk();
        rwkVar.t = this.a;
        rwkVar.u = this.b;
        A(rwkVar, attributes);
        C(rwkVar, attributes);
        I(rwkVar, attributes);
        z(rwkVar, attributes);
        for (int i = 0; i < attributes.getLength(); i++) {
            String strTrim = attributes.getValue(i).trim();
            if (rzb.a(attributes.getLocalName(i)).ordinal() == 3) {
                if ("objectBoundingBox".equals(strTrim)) {
                    rwkVar.a = false;
                } else {
                    if (!"userSpaceOnUse".equals(strTrim)) {
                        throw new SAXException("Invalid value for attribute clipPathUnits");
                    }
                    rwkVar.a = true;
                }
            }
        }
        this.b.b(rwkVar);
        this.b = rwkVar;
    }

    private final void q(Attributes attributes) throws SAXException {
        if (this.b == null) {
            throw new SAXException("Invalid document. Root element must be <svg>");
        }
        rwn rwnVar = new rwn();
        rwnVar.t = this.a;
        rwnVar.u = this.b;
        A(rwnVar, attributes);
        C(rwnVar, attributes);
        I(rwnVar, attributes);
        this.b.b(rwnVar);
        this.b = rwnVar;
    }

    private final void r(Attributes attributes) throws SAXException {
        rxo rxoVar = this.b;
        if (rxoVar == null) {
            throw new SAXException("Invalid document. Root element must be <svg>");
        }
        rwo rwoVar = new rwo();
        rwoVar.t = this.a;
        rwoVar.u = rxoVar;
        A(rwoVar, attributes);
        C(rwoVar, attributes);
        I(rwoVar, attributes);
        z(rwoVar, attributes);
        for (int i = 0; i < attributes.getLength(); i++) {
            String strTrim = attributes.getValue(i).trim();
            int iOrdinal = rzb.a(attributes.getLocalName(i)).ordinal();
            if (iOrdinal == 6) {
                rwoVar.a = a(strTrim);
            } else if (iOrdinal == 7) {
                rwoVar.b = a(strTrim);
            } else if (iOrdinal == 56) {
                rwoVar.c = a(strTrim);
                if (rwoVar.c.e()) {
                    throw new SAXException("Invalid <ellipse> element. rx cannot be negative");
                }
            } else if (iOrdinal != 57) {
                continue;
            } else {
                rwoVar.d = a(strTrim);
                if (rwoVar.d.e()) {
                    throw new SAXException("Invalid <ellipse> element. ry cannot be negative");
                }
            }
        }
        this.b.b(rwoVar);
    }

    private final void s(Attributes attributes) throws SAXException {
        if (this.b == null) {
            throw new SAXException("Invalid document. Root element must be <svg>");
        }
        rwr rwrVar = new rwr();
        rwrVar.t = this.a;
        rwrVar.u = this.b;
        A(rwrVar, attributes);
        C(rwrVar, attributes);
        I(rwrVar, attributes);
        z(rwrVar, attributes);
        this.b.b(rwrVar);
        this.b = rwrVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x008e, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void t(org.xml.sax.Attributes r6) throws org.xml.sax.SAXException {
        /*
            r5 = this;
            rxo r0 = r5.b
            if (r0 == 0) goto La1
            rwt r0 = new rwt
            r0.<init>()
            ryk r1 = r5.a
            r0.t = r1
            rxo r1 = r5.b
            r0.u = r1
            A(r0, r6)
            C(r0, r6)
            I(r0, r6)
            z(r0, r6)
            r1 = 0
        L1e:
            int r2 = r6.getLength()
            if (r1 >= r2) goto L99
            java.lang.String r2 = r6.getValue(r1)
            java.lang.String r2 = r2.trim()
            java.lang.String r3 = r6.getLocalName(r1)
            rzb r3 = defpackage.rzb.a(r3)
            int r3 = r3.ordinal()
            r4 = 25
            if (r3 == r4) goto L80
            r4 = 26
            if (r3 == r4) goto L71
            r4 = 48
            if (r3 == r4) goto L6d
            switch(r3) {
                case 81: goto L56;
                case 82: goto L4f;
                case 83: goto L48;
                default: goto L47;
            }
        L47:
            goto L8e
        L48:
            rwu r2 = a(r2)
            r0.c = r2
            goto L8e
        L4f:
            rwu r2 = a(r2)
            r0.b = r2
            goto L8e
        L56:
            rwu r2 = a(r2)
            r0.d = r2
            rwu r2 = r0.d
            boolean r2 = r2.e()
            if (r2 != 0) goto L65
            goto L8e
        L65:
            org.xml.sax.SAXException r6 = new org.xml.sax.SAXException
            java.lang.String r0 = "Invalid <use> element. width cannot be negative"
            r6.<init>(r0)
            throw r6
        L6d:
            w(r0, r2)
            goto L8e
        L71:
            java.lang.String r3 = r6.getURI(r1)
            java.lang.String r4 = "http://www.w3.org/1999/xlink"
            boolean r3 = r4.equals(r3)
            if (r3 == 0) goto L8e
            r0.a = r2
            goto L8e
        L80:
            rwu r2 = a(r2)
            r0.e = r2
            rwu r2 = r0.e
            boolean r2 = r2.e()
            if (r2 != 0) goto L91
        L8e:
            int r1 = r1 + 1
            goto L1e
        L91:
            org.xml.sax.SAXException r6 = new org.xml.sax.SAXException
            java.lang.String r0 = "Invalid <use> element. height cannot be negative"
            r6.<init>(r0)
            throw r6
        L99:
            rxo r6 = r5.b
            r6.b(r0)
            r5.b = r0
            return
        La1:
            org.xml.sax.SAXException r6 = new org.xml.sax.SAXException
            java.lang.String r0 = "Invalid document. Root element must be <svg>"
            r6.<init>(r0)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rze.t(org.xml.sax.Attributes):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:54:0x00c0, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void u(org.xml.sax.Attributes r7) throws org.xml.sax.SAXException {
        /*
            r6 = this;
            rxo r0 = r6.b
            if (r0 == 0) goto Lcc
            rww r0 = new rww
            r0.<init>()
            ryk r1 = r6.a
            r0.t = r1
            rxo r1 = r6.b
            r0.u = r1
            A(r0, r7)
            C(r0, r7)
            z(r0, r7)
            E(r0, r7)
            r1 = 0
            r2 = r1
        L1f:
            int r3 = r7.getLength()
            if (r2 >= r3) goto Lc4
            java.lang.String r3 = r7.getValue(r2)
            java.lang.String r3 = r3.trim()
            java.lang.String r4 = r7.getLocalName(r2)
            rzb r4 = defpackage.rzb.a(r4)
            int r4 = r4.ordinal()
            r5 = 41
            if (r4 == r5) goto La5
            r5 = 50
            if (r4 == r5) goto L9e
            r5 = 51
            if (r4 == r5) goto L97
            switch(r4) {
                case 32: goto L80;
                case 33: goto L61;
                case 34: goto L4a;
                default: goto L48;
            }
        L48:
            goto Lc0
        L4a:
            rwu r3 = a(r3)
            r0.d = r3
            rwu r3 = r0.d
            boolean r3 = r3.e()
            if (r3 != 0) goto L59
            goto Lc0
        L59:
            org.xml.sax.SAXException r7 = new org.xml.sax.SAXException
            java.lang.String r0 = "Invalid <marker> element. markerWidth cannot be negative"
            r7.<init>(r0)
            throw r7
        L61:
            java.lang.String r4 = "strokeWidth"
            boolean r4 = r4.equals(r3)
            if (r4 == 0) goto L6c
            r0.a = r1
            goto Lc0
        L6c:
            java.lang.String r4 = "userSpaceOnUse"
            boolean r3 = r4.equals(r3)
            if (r3 == 0) goto L78
            r3 = 1
            r0.a = r3
            goto Lc0
        L78:
            org.xml.sax.SAXException r7 = new org.xml.sax.SAXException
            java.lang.String r0 = "Invalid value for attribute markerUnits"
            r7.<init>(r0)
            throw r7
        L80:
            rwu r3 = a(r3)
            r0.e = r3
            rwu r3 = r0.e
            boolean r3 = r3.e()
            if (r3 != 0) goto L8f
            goto Lc0
        L8f:
            org.xml.sax.SAXException r7 = new org.xml.sax.SAXException
            java.lang.String r0 = "Invalid <marker> element. markerHeight cannot be negative"
            r7.<init>(r0)
            throw r7
        L97:
            rwu r3 = a(r3)
            r0.c = r3
            goto Lc0
        L9e:
            rwu r3 = a(r3)
            r0.b = r3
            goto Lc0
        La5:
            java.lang.String r4 = "auto"
            boolean r4 = r4.equals(r3)
            if (r4 == 0) goto Lb6
            r3 = 2143289344(0x7fc00000, float:NaN)
            java.lang.Float r3 = java.lang.Float.valueOf(r3)
            r0.f = r3
            goto Lc0
        Lb6:
            float r3 = d(r3)
            java.lang.Float r3 = java.lang.Float.valueOf(r3)
            r0.f = r3
        Lc0:
            int r2 = r2 + 1
            goto L1f
        Lc4:
            rxo r7 = r6.b
            r7.b(r0)
            r6.b = r0
            return
        Lcc:
            org.xml.sax.SAXException r7 = new org.xml.sax.SAXException
            java.lang.String r0 = "Invalid document. Root element must be <svg>"
            r7.<init>(r0)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rze.u(org.xml.sax.Attributes):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:55:0x00a0, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void v(org.xml.sax.Attributes r8) throws org.xml.sax.SAXException {
        /*
            r7 = this;
            rxo r0 = r7.b
            if (r0 == 0) goto Lb4
            rwx r0 = new rwx
            r0.<init>()
            ryk r1 = r7.a
            r0.t = r1
            rxo r1 = r7.b
            r0.u = r1
            A(r0, r8)
            C(r0, r8)
            z(r0, r8)
            r1 = 0
        L1b:
            int r2 = r8.getLength()
            if (r1 >= r2) goto Lac
            java.lang.String r2 = r8.getValue(r1)
            java.lang.String r2 = r2.trim()
            java.lang.String r3 = r8.getLocalName(r1)
            rzb r3 = defpackage.rzb.a(r3)
            int r3 = r3.ordinal()
            r4 = 25
            if (r3 == r4) goto L92
            r4 = 36
            java.lang.String r5 = "userSpaceOnUse"
            java.lang.String r6 = "objectBoundingBox"
            if (r3 == r4) goto L7d
            r4 = 37
            if (r3 == r4) goto L68
            switch(r3) {
                case 81: goto L51;
                case 82: goto L4d;
                case 83: goto L49;
                default: goto L48;
            }
        L48:
            goto La0
        L49:
            a(r2)
            goto La0
        L4d:
            a(r2)
            goto La0
        L51:
            rwu r2 = a(r2)
            r0.a = r2
            rwu r2 = r0.a
            boolean r2 = r2.e()
            if (r2 != 0) goto L60
            goto La0
        L60:
            org.xml.sax.SAXException r8 = new org.xml.sax.SAXException
            java.lang.String r0 = "Invalid <mask> element. width cannot be negative"
            r8.<init>(r0)
            throw r8
        L68:
            boolean r3 = r6.equals(r2)
            if (r3 != 0) goto La0
            boolean r2 = r5.equals(r2)
            if (r2 == 0) goto L75
            goto La0
        L75:
            org.xml.sax.SAXException r8 = new org.xml.sax.SAXException
            java.lang.String r0 = "Invalid value for attribute maskUnits"
            r8.<init>(r0)
            throw r8
        L7d:
            boolean r3 = r6.equals(r2)
            if (r3 != 0) goto La0
            boolean r2 = r5.equals(r2)
            if (r2 == 0) goto L8a
            goto La0
        L8a:
            org.xml.sax.SAXException r8 = new org.xml.sax.SAXException
            java.lang.String r0 = "Invalid value for attribute maskContentUnits"
            r8.<init>(r0)
            throw r8
        L92:
            rwu r2 = a(r2)
            r0.b = r2
            rwu r2 = r0.b
            boolean r2 = r2.e()
            if (r2 != 0) goto La4
        La0:
            int r1 = r1 + 1
            goto L1b
        La4:
            org.xml.sax.SAXException r8 = new org.xml.sax.SAXException
            java.lang.String r0 = "Invalid <mask> element. height cannot be negative"
            r8.<init>(r0)
            throw r8
        Lac:
            rxo r8 = r7.b
            r8.b(r0)
            r7.b = r0
            return
        Lb4:
            org.xml.sax.SAXException r8 = new org.xml.sax.SAXException
            java.lang.String r0 = "Invalid document. Root element must be <svg>"
            r8.<init>(r0)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rze.v(org.xml.sax.Attributes):void");
    }

    private static void w(rxu rxuVar, String str) throws SAXException {
        int i;
        rzd rzdVar = new rzd(str);
        rzdVar.l();
        String strJ = rzdVar.j();
        if ("defer".equals(strJ)) {
            rzdVar.l();
            strJ = rzdVar.j();
        }
        rwf rwfVar = (rwf) ryx.a.get(strJ);
        rzdVar.l();
        if (rzdVar.o()) {
            i = 0;
        } else {
            String strJ2 = rzdVar.j();
            if (strJ2.equals("meet")) {
                i = 1;
            } else {
                if (!strJ2.equals("slice")) {
                    throw new SAXException("Invalid preserveAspectRatio definition: ".concat(String.valueOf(str)));
                }
                i = 2;
            }
        }
        rxuVar.v = new rwg(rwfVar, i);
    }

    private static int x(String str) throws SAXException {
        if ("nonzero".equals(str)) {
            return 1;
        }
        if ("evenodd".equals(str)) {
            return 2;
        }
        throw new SAXException("Invalid fill-rule property: ".concat(String.valueOf(str)));
    }

    private static int y(String str) {
        if ("italic".equals(str)) {
            return 2;
        }
        if ("normal".equals(str)) {
            return 1;
        }
        return "oblique".equals(str) ? 3 : 0;
    }

    private static final void z(rxl rxlVar, Attributes attributes) {
        for (int i = 0; i < attributes.getLength(); i++) {
            String strTrim = attributes.getValue(i).trim();
            int iOrdinal = rzb.a(attributes.getLocalName(i)).ordinal();
            if (iOrdinal != 73) {
                switch (iOrdinal) {
                    case 52:
                        rzd rzdVar = new rzd(strTrim);
                        HashSet hashSet = new HashSet();
                        while (!rzdVar.o()) {
                            String strJ = rzdVar.j();
                            if (strJ.startsWith("http://www.w3.org/TR/SVG11/feature#")) {
                                hashSet.add(strJ.substring(35));
                            } else {
                                hashSet.add("UNSUPPORTED");
                            }
                            rzdVar.l();
                        }
                        rxlVar.i(hashSet);
                        break;
                    case 53:
                        rxlVar.h(strTrim);
                        break;
                    case 54:
                        rzd rzdVar2 = new rzd(strTrim);
                        HashSet hashSet2 = new HashSet();
                        while (!rzdVar2.o()) {
                            hashSet2.add(rzdVar2.j());
                            rzdVar2.l();
                        }
                        rxlVar.k(hashSet2);
                        break;
                    case 55:
                        List listM = m(strTrim);
                        rxlVar.j(listM != null ? new HashSet(listM) : new HashSet(0));
                        break;
                }
            } else {
                rzd rzdVar3 = new rzd(strTrim);
                HashSet hashSet3 = new HashSet();
                while (!rzdVar3.o()) {
                    String strJ2 = rzdVar3.j();
                    int iIndexOf = strJ2.indexOf(45);
                    if (iIndexOf != -1) {
                        strJ2 = strJ2.substring(0, iIndexOf);
                    }
                    hashSet3.add(new Locale(strJ2, "", "").getLanguage());
                    rzdVar3.l();
                }
                rxlVar.l(hashSet3);
            }
        }
    }

    public final ryk b(InputStream inputStream) throws IOException {
        if (!inputStream.markSupported()) {
            inputStream = new BufferedInputStream(inputStream);
        }
        try {
            inputStream.mark(3);
            int i = inputStream.read() + (inputStream.read() << 8);
            inputStream.reset();
            if (i == 35615) {
                inputStream = new GZIPInputStream(inputStream);
            }
        } catch (IOException unused) {
        }
        SAXParserFactory sAXParserFactoryNewInstance = SAXParserFactory.newInstance();
        sAXParserFactoryNewInstance.setNamespaceAware(true);
        try {
            try {
                try {
                    try {
                        XMLReader xMLReader = sAXParserFactoryNewInstance.newSAXParser().getXMLReader();
                        xMLReader.setContentHandler(this);
                        xMLReader.setProperty("http://xml.org/sax/properties/lexical-handler", this);
                        xMLReader.parse(new InputSource(inputStream));
                        return this.a;
                    } catch (SAXException e) {
                        throw new ryw("SVG parse error: " + e.getMessage(), e);
                    }
                } catch (ParserConfigurationException e2) {
                    throw new ryw("XML Parser problem", e2);
                }
            } catch (IOException e3) {
                throw new ryw("File error", e3);
            }
        } finally {
            try {
                inputStream.close();
            } catch (IOException unused2) {
                Log.e("SVGParser", "Exception thrown closing input stream");
            }
        }
    }

    @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
    public final void characters(char[] cArr, int i, int i2) {
        if (this.c) {
            return;
        }
        if (this.e) {
            if (this.g == null) {
                this.g = new StringBuilder(i2);
            }
            this.g.append(cArr, i, i2);
            return;
        }
        if (this.h) {
            if (this.i == null) {
                this.i = new StringBuilder(i2);
            }
            this.i.append(cArr, i, i2);
            return;
        }
        rxo rxoVar = this.b;
        if (rxoVar instanceof ryd) {
            rxm rxmVar = (rxm) rxoVar;
            int size = rxmVar.i.size();
            rxs rxsVar = size == 0 ? null : (rxs) rxmVar.i.get(size - 1);
            if (!(rxsVar instanceof ryg)) {
                ((rxm) this.b).b(new ryg(new String(cArr, i, i2)));
                return;
            }
            ryg rygVar = (ryg) rxsVar;
            rygVar.a = String.valueOf(rygVar.a).concat(new String(cArr, i, i2));
        }
    }

    @Override // org.xml.sax.ext.DefaultHandler2, org.xml.sax.ext.LexicalHandler
    public final void comment(char[] cArr, int i, int i2) {
        if (!this.c && this.h) {
            if (this.i == null) {
                this.i = new StringBuilder(i2);
            }
            this.i.append(cArr, i, i2);
        }
    }

    @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
    public final void endElement(String str, String str2, String str3) throws SAXException {
        if (this.c) {
            int i = this.d - 1;
            this.d = i;
            if (i == 0) {
                this.c = false;
            }
        }
        if ("http://www.w3.org/2000/svg".equals(str) || "".equals(str)) {
            switch (rzc.a(str2)) {
                case svg:
                case clipPath:
                case defs:
                case g:
                case image:
                case linearGradient:
                case marker:
                case mask:
                case pattern:
                case radialGradient:
                case solidColor:
                case stop:
                case SWITCH:
                case symbol:
                case text:
                case textPath:
                case tspan:
                case use:
                case view:
                    this.b = ((rxs) this.b).u;
                    break;
                case desc:
                case title:
                    this.e = false;
                    rzc rzcVar = this.f;
                    if (rzcVar == rzc.title || rzcVar == rzc.desc) {
                        this.g.toString();
                    }
                    this.g.setLength(0);
                    break;
                case style:
                    StringBuilder sb = this.i;
                    if (sb != null) {
                        this.h = false;
                        String string = sb.toString();
                        rwc rwcVar = new rwc(rvx.screen);
                        ryk rykVar = this.a;
                        rvw rvwVar = new rvw(string);
                        rvwVar.l();
                        rykVar.c.a(rwcVar.a(rvwVar));
                        this.i.setLength(0);
                        break;
                    }
                    break;
            }
        }
    }

    @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
    public final void startDocument() {
        this.a = new ryk();
    }

    /* JADX WARN: Code restructure failed: missing block: B:448:0x0935, code lost:
    
        android.util.Log.e("SVGParser", defpackage.a.K(r14, "Bad path coords for ", " path segment"));
     */
    /* JADX WARN: Code restructure failed: missing block: B:542:0x00ea, code lost:
    
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:569:0x0483, code lost:
    
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:596:0x064a, code lost:
    
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:635:0x0aaa, code lost:
    
        continue;
     */
    /* JADX WARN: Removed duplicated region for block: B:347:0x06d2  */
    /* JADX WARN: Removed duplicated region for block: B:444:0x091f  */
    /* JADX WARN: Removed duplicated region for block: B:609:0x093c A[SYNTHETIC] */
    @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void startElement(java.lang.String r24, java.lang.String r25, java.lang.String r26, org.xml.sax.Attributes r27) throws org.xml.sax.SAXException {
        /*
            Method dump skipped, instructions count: 2978
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rze.startElement(java.lang.String, java.lang.String, java.lang.String, org.xml.sax.Attributes):void");
    }

    @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
    public final void endDocument() {
    }
}
