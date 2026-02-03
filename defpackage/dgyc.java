package defpackage;

import java.io.IOException;
import java.io.InputStream;
import java.util.LinkedHashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dgyc extends dgyd {
    public final LinkedHashMap a = new LinkedHashMap();

    private dgyc() {
    }

    public static dgyc a(InputStream inputStream) throws XmlPullParserException, IOException {
        String attributeValue;
        dgyc dgycVar = new dgyc();
        try {
            XmlPullParser xmlPullParserNewPullParser = XmlPullParserFactory.newInstance().newPullParser();
            xmlPullParserNewPullParser.setInput(inputStream, "utf-8");
            xmlPullParserNewPullParser.nextTag();
            String attributeValue2 = xmlPullParserNewPullParser.getAttributeValue(null, "id");
            attributeValue2.getClass();
            dgycVar.f = attributeValue2;
            int iNextTag = xmlPullParserNewPullParser.nextTag();
            String name = xmlPullParserNewPullParser.getName();
            while (iNextTag != 3) {
                if (name.equals("EndUserNotification")) {
                    break;
                }
                if (name.equals("Subject")) {
                    String attributeValue3 = xmlPullParserNewPullParser.getAttributeValue(null, "lang");
                    if (attributeValue3 != null) {
                        dgycVar.g.put(attributeValue3, xmlPullParserNewPullParser.nextText());
                    }
                } else if (name.equals("Text")) {
                    String attributeValue4 = xmlPullParserNewPullParser.getAttributeValue(null, "lang");
                    if (attributeValue4 != null) {
                        dgycVar.h.put(attributeValue4, xmlPullParserNewPullParser.nextText());
                    }
                } else if (name.equals("ButtonOK") && (attributeValue = xmlPullParserNewPullParser.getAttributeValue(null, "lang")) != null) {
                    dgycVar.a.put(attributeValue, xmlPullParserNewPullParser.nextText());
                }
                iNextTag = xmlPullParserNewPullParser.nextTag();
                name = xmlPullParserNewPullParser.getName();
            }
            return dgycVar;
        } catch (XmlPullParserException e) {
            throw new IOException(e.getMessage());
        }
    }
}
