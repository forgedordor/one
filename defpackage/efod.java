package defpackage;

import j$.time.Instant;
import java.io.IOException;
import java.text.ParseException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;
import org.xmlpull.v1.XmlSerializer;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class efod {
    static int a(XmlPullParser xmlPullParser) throws efoc {
        try {
            return xmlPullParser.next();
        } catch (RuntimeException e) {
            throw new efoc("Invalid reading tag in XML for FileTransferInformation", e);
        }
    }

    static int b(XmlPullParser xmlPullParser) throws efoc {
        try {
            return xmlPullParser.nextTag();
        } catch (RuntimeException e) {
            throw new efoc("Invalid tag in XML for MessageReceipt", e);
        }
    }

    static Instant c(String str, String str2) throws efnh {
        try {
            long jA = dhif.a(str2);
            if (jA >= 0) {
                return Instant.ofEpochMilli(jA);
            }
            throw new efnh(str);
        } catch (ParseException e) {
            throw new efnh(str, e);
        }
    }

    static String d(XmlPullParser xmlPullParser) throws efoc {
        try {
            return xmlPullParser.nextText();
        } catch (RuntimeException e) {
            throw new efoc("Invalid reading value in XML for FileTransferInformation", e);
        }
    }

    static XmlPullParser e() throws XmlPullParserException {
        XmlPullParser xmlPullParserNewPullParser = XmlPullParserFactory.newInstance().newPullParser();
        xmlPullParserNewPullParser.setFeature("http://xmlpull.org/v1/doc/features.html#process-namespaces", true);
        return xmlPullParserNewPullParser;
    }

    static void f(XmlSerializer xmlSerializer, String str, String str2, String str3) throws IllegalStateException, IOException, IllegalArgumentException {
        xmlSerializer.startTag(str, str2);
        xmlSerializer.text(str3);
        xmlSerializer.endTag(str, str2);
    }

    static void g(String str, String str2) throws efnh {
        if (str2 == null || str2.trim().isEmpty()) {
            throw new efnh(str);
        }
    }
}
