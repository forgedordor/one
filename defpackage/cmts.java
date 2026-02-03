package defpackage;

import android.content.ContentValues;
import android.util.ArrayMap;
import com.google.android.ims.rcsservice.businessinfo.BusinessInfoDatabaseConstants;
import java.io.IOException;
import java.util.Map;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cmts {
    public static final /* synthetic */ int a = 0;
    private static final ekrg b = ekrg.c("com/google/android/apps/messaging/shared/sms/common/ApnsXmlProcessor");
    private static final Map c;

    static {
        ArrayMap arrayMap = new ArrayMap();
        c = arrayMap;
        arrayMap.put("mcc", "mcc");
        arrayMap.put("mnc", "mnc");
        arrayMap.put("carrier", "name");
        arrayMap.put("apn", "apn");
        arrayMap.put("mmsc", "mmsc");
        arrayMap.put("mmsproxy", "mmsproxy");
        arrayMap.put("mmsport", "mmsport");
        arrayMap.put(BusinessInfoDatabaseConstants.BusinessInfoPropertiesTableConstants.Columns.TYPE, BusinessInfoDatabaseConstants.BusinessInfoPropertiesTableConstants.Columns.TYPE);
        arrayMap.put("user", "user");
        arrayMap.put("password", "password");
        arrayMap.put("authtype", "authtype");
        arrayMap.put("mvno_match_data", "mvno_match_data");
        arrayMap.put("mvno_type", "mvno_type");
        arrayMap.put("protocol", "protocol");
        arrayMap.put("bearer", "bearer");
        arrayMap.put("server", "server");
        arrayMap.put("roaming_protocol", "roaming_protocol");
        arrayMap.put("proxy", "proxy");
        arrayMap.put("port", "port");
        arrayMap.put("carrier_enabled", "carrier_enabled");
    }

    public static final void a(crmx crmxVar, StringBuilder sb, XmlPullParser xmlPullParser, cmur cmurVar) throws XmlPullParserException {
        String str;
        int i;
        Boolean boolValueOf;
        String str2 = "authtype";
        try {
            if (c(xmlPullParser) != 2) {
                throw new XmlPullParserException("ApnsXmlProcessor: expecting start tag @" + d(sb, xmlPullParser));
            }
            ContentValues contentValues = new ContentValues();
            String name = xmlPullParser.getName();
            if (!"apns".equals(name)) {
                if (!"mms_config".equals(name) && !"motorola_config_override".equals(name) && !"huawei_config_override".equals(name) && !"lge_config_override".equals(name)) {
                    return;
                }
                b(crmxVar, sb, xmlPullParser, cmurVar);
                return;
            }
            for (int i2 = 2; c(xmlPullParser) == i2; i2 = 2) {
                String name2 = xmlPullParser.getName();
                if ("apn".equals(name2)) {
                    cqaz.l(contentValues);
                    contentValues.clear();
                    for (int i3 = 0; i3 < xmlPullParser.getAttributeCount(); i3++) {
                        String str3 = (String) c.get(xmlPullParser.getAttributeName(i3));
                        if (str3 != null) {
                            contentValues.put(str3, xmlPullParser.getAttributeValue(i3));
                        }
                    }
                    contentValues.put("numeric", crmxVar.l(contentValues.getAsString("mcc"), contentValues.getAsString("mnc")));
                    String asString = contentValues.getAsString(str2);
                    if (asString != null) {
                        i = 0;
                        contentValues.put(str2, e(asString, -1, "apn authtype", sb, xmlPullParser));
                    } else {
                        i = 0;
                    }
                    String asString2 = contentValues.getAsString("carrier_enabled");
                    if (asString2 != null) {
                        try {
                            boolValueOf = Boolean.valueOf(Boolean.parseBoolean(asString2));
                            str = str2;
                        } catch (Exception unused) {
                            ekrw ekrwVarI = b.i();
                            ekrwVarI.X(eksq.a, "Bugle");
                            str = str2;
                            ((ekrd) ((ekrd) ekrwVarI).h("com/google/android/apps/messaging/shared/sms/common/ApnsXmlProcessor", "parseBoolean", 188, "ApnsXmlProcessor.java")).I("Invalid value %sfor%s @%s", asString2, "apn carrierEnabled", d(sb, xmlPullParser));
                            boolValueOf = null;
                        }
                        contentValues.put("carrier_enabled", boolValueOf);
                    } else {
                        str = str2;
                    }
                    String asString3 = contentValues.getAsString("bearer");
                    if (asString3 != null) {
                        contentValues.put("bearer", e(asString3, Integer.valueOf(i), "apn bearer", sb, xmlPullParser));
                    }
                    if (xmlPullParser.next() != 3) {
                        throw new XmlPullParserException("Apn: expecting end tag @".concat(d(sb, xmlPullParser)));
                    }
                } else {
                    str = str2;
                    if ("mms_config".equals(name2)) {
                        b(crmxVar, sb, xmlPullParser, cmurVar);
                    }
                }
                str2 = str;
            }
        } catch (IOException e) {
            ekrw ekrwVarI2 = b.i();
            ekrwVarI2.X(eksq.a, "Bugle");
            ((ekrd) ((ekrd) ((ekrd) ekrwVarI2).g(e)).h("com/google/android/apps/messaging/shared/sms/common/ApnsXmlProcessor", "process", 166, "ApnsXmlProcessor.java")).t("ApnsXmlProcessor: I/O failure %s", e);
        } catch (XmlPullParserException e2) {
            ekrw ekrwVarI3 = b.i();
            ekrwVarI3.X(eksq.a, "Bugle");
            ((ekrd) ((ekrd) ((ekrd) ekrwVarI3).g(e2)).h("com/google/android/apps/messaging/shared/sms/common/ApnsXmlProcessor", "process", 168, "ApnsXmlProcessor.java")).t("ApnsXmlProcessor: parsing failure %s", e2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0083  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final void b(defpackage.crmx r10, java.lang.StringBuilder r11, org.xmlpull.v1.XmlPullParser r12, defpackage.cmur r13) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        /*
            r0 = 0
            if (r10 != 0) goto L5
            r10 = r0
            goto L15
        L5:
            java.lang.String r1 = "mcc"
            java.lang.String r1 = r12.getAttributeValue(r0, r1)
            java.lang.String r2 = "mnc"
            java.lang.String r2 = r12.getAttributeValue(r0, r2)
            java.lang.String r10 = r10.l(r1, r2)
        L15:
            int r1 = r12.next()
            r2 = 4
            if (r1 == r2) goto L15
            r3 = 3
            r4 = 2
            if (r1 != r4) goto L9a
            java.lang.String r1 = "name"
            java.lang.String r1 = r12.getAttributeValue(r0, r1)
            java.lang.String r5 = r12.getName()
            int r6 = r12.next()
            if (r6 != r2) goto L3c
            java.lang.String r6 = r12.getText()
            int r7 = r12.next()
            r9 = r7
            r7 = r6
            r6 = r9
            goto L3d
        L3c:
            r7 = r0
        L3d:
            if (r6 != r3) goto L8a
            if (r10 == 0) goto L15
            if (r1 == 0) goto L15
            if (r7 == 0) goto L15
            int r3 = r5.hashCode()
            r6 = -891985903(0xffffffffcad56011, float:-6991880.5)
            r8 = 1
            if (r3 == r6) goto L6e
            r6 = 104431(0x197ef, float:1.46339E-40)
            if (r3 == r6) goto L64
            r6 = 3029738(0x2e3aea, float:4.245567E-39)
            if (r3 == r6) goto L5a
            goto L78
        L5a:
            java.lang.String r3 = "bool"
            boolean r3 = r5.equals(r3)
            if (r3 == 0) goto L78
            r3 = r8
            goto L79
        L64:
            java.lang.String r3 = "int"
            boolean r3 = r5.equals(r3)
            if (r3 == 0) goto L78
            r3 = 0
            goto L79
        L6e:
            java.lang.String r3 = "string"
            boolean r3 = r5.equals(r3)
            if (r3 == 0) goto L78
            r3 = r4
            goto L79
        L78:
            r3 = -1
        L79:
            if (r3 == 0) goto L83
            if (r3 == r8) goto L81
            if (r3 == r4) goto L84
            r2 = 7
            goto L84
        L81:
            r2 = r4
            goto L84
        L83:
            r2 = r8
        L84:
            android.os.Bundle r3 = r13.a
            defpackage.cmuh.x(r3, r2, r1, r7)
            goto L15
        L8a:
            org.xmlpull.v1.XmlPullParserException r10 = new org.xmlpull.v1.XmlPullParserException
            java.lang.String r11 = d(r11, r12)
            java.lang.String r12 = "ApnsXmlProcessor: expecting end tag @"
            java.lang.String r11 = r12.concat(r11)
            r10.<init>(r11)
            throw r10
        L9a:
            if (r1 != r3) goto L9d
            return
        L9d:
            org.xmlpull.v1.XmlPullParserException r10 = new org.xmlpull.v1.XmlPullParserException
            java.lang.String r11 = d(r11, r12)
            java.lang.String r12 = "MmsConfig: expecting start or end tag @"
            java.lang.String r11 = r12.concat(r11)
            r10.<init>(r11)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cmts.b(crmx, java.lang.StringBuilder, org.xmlpull.v1.XmlPullParser, cmur):void");
    }

    private static final int c(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        int next;
        do {
            next = xmlPullParser.next();
            if (next == 2) {
                return next;
            }
        } while (next != 1);
        return 1;
    }

    private static final String d(StringBuilder sb, XmlPullParser xmlPullParser) throws XmlPullParserException {
        sb.setLength(0);
        if (xmlPullParser == null) {
            return "Unknown";
        }
        try {
            int eventType = xmlPullParser.getEventType();
            sb.append(eventType != 0 ? eventType != 1 ? eventType != 2 ? eventType != 3 ? eventType != 4 ? Integer.toString(eventType) : "TEXT" : "END_TAG" : "START_TAG" : "END_DOCUMENT" : "START_DOCUMENT");
            if (eventType == 2 || eventType == 3 || eventType == 4) {
                sb.append('<');
                sb.append(xmlPullParser.getName());
                for (int i = 0; i < xmlPullParser.getAttributeCount(); i++) {
                    sb.append(' ');
                    sb.append(xmlPullParser.getAttributeName(i));
                    sb.append('=');
                    sb.append(xmlPullParser.getAttributeValue(i));
                }
                sb.append("/>");
            }
            return sb.toString();
        } catch (XmlPullParserException e) {
            ekrw ekrwVarI = b.i();
            ekrwVarI.X(eksq.a, "Bugle");
            ((ekrd) ((ekrd) ((ekrd) ekrwVarI).g(e)).h("com/google/android/apps/messaging/shared/sms/common/ApnsXmlProcessor", "xmlParserDebugContext", 232, "ApnsXmlProcessor.java")).t("xmlParserDebugContext: %s", e);
            return "Unknown";
        }
    }

    private static final Integer e(String str, Integer num, String str2, StringBuilder sb, XmlPullParser xmlPullParser) {
        try {
            return Integer.valueOf(Integer.parseInt(str));
        } catch (Exception unused) {
            ekrw ekrwVarI = b.i();
            ekrwVarI.X(eksq.a, "Bugle");
            ((ekrd) ((ekrd) ekrwVarI).h("com/google/android/apps/messaging/shared/sms/common/ApnsXmlProcessor", "parseInt", 177, "ApnsXmlProcessor.java")).I("Invalid value %sfor%s @%s", str, str2, d(sb, xmlPullParser));
            return num;
        }
    }
}
