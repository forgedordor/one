package defpackage;

import java.io.IOException;
import java.io.InputStream;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dgxx extends dgyd {
    public dgxx() {
        dgxw dgxwVar = dgxw.OK;
    }

    private final void a(InputStream inputStream) throws XmlPullParserException, IOException {
        String attributeValue;
        try {
            XmlPullParser xmlPullParserNewPullParser = XmlPullParserFactory.newInstance().newPullParser();
            xmlPullParserNewPullParser.setInput(inputStream, "utf-8");
            xmlPullParserNewPullParser.nextTag();
            String attributeValue2 = xmlPullParserNewPullParser.getAttributeValue("", "id");
            if (attributeValue2 == null) {
                throw new IOException("Parsing Request id failed");
            }
            this.f = attributeValue2;
            String attributeValue3 = xmlPullParserNewPullParser.getAttributeValue("", "status");
            if (attributeValue3 == null || attributeValue3.equals("ok")) {
                dgxw dgxwVar = dgxw.OK;
            } else {
                dgxw dgxwVar2 = dgxw.OK;
            }
            int iNextTag = xmlPullParserNewPullParser.nextTag();
            for (String name = xmlPullParserNewPullParser.getName(); iNextTag != 3 && !name.equals("EndUserConfirmationAck"); name = xmlPullParserNewPullParser.getName()) {
                if (name.equals("Subject")) {
                    String attributeValue4 = xmlPullParserNewPullParser.getAttributeValue("", "lang");
                    if (attributeValue4 != null) {
                        this.g.put(attributeValue4, xmlPullParserNewPullParser.nextText());
                    }
                } else if (name.equals("Text") && (attributeValue = xmlPullParserNewPullParser.getAttributeValue("", "lang")) != null) {
                    this.h.put(attributeValue, xmlPullParserNewPullParser.nextText());
                }
                iNextTag = xmlPullParserNewPullParser.nextTag();
            }
        } catch (XmlPullParserException e) {
            throw new IOException(e.getMessage());
        }
    }

    public dgxx(InputStream inputStream) throws XmlPullParserException, IOException {
        dgxw dgxwVar = dgxw.OK;
        a(inputStream);
    }
}
