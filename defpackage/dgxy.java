package defpackage;

import com.google.android.ims.rcsservice.businessinfo.BusinessInfoDatabaseConstants;
import java.io.IOException;
import java.io.InputStream;
import java.util.LinkedHashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dgxy extends dgyd {
    public final LinkedHashMap a = new LinkedHashMap();
    public final LinkedHashMap b = new LinkedHashMap();
    public int e = 1;
    public int c = 0;
    public boolean d = false;

    private dgxy() {
    }

    public static dgxy a(int i, InputStream inputStream) throws XmlPullParserException, IOException {
        String attributeValue;
        dgxy dgxyVar = new dgxy();
        try {
            XmlPullParser xmlPullParserNewPullParser = XmlPullParserFactory.newInstance().newPullParser();
            xmlPullParserNewPullParser.setInput(inputStream, "utf-8");
            xmlPullParserNewPullParser.nextTag();
            String attributeValue2 = xmlPullParserNewPullParser.getAttributeValue(null, "id");
            attributeValue2.getClass();
            dgxyVar.f = attributeValue2;
            String attributeValue3 = xmlPullParserNewPullParser.getAttributeValue(null, BusinessInfoDatabaseConstants.BusinessInfoPropertiesTableConstants.Columns.TYPE);
            if (attributeValue3 != null && !attributeValue3.equals("volatile")) {
                dgxyVar.e = 2;
            }
            if (dgxyVar.e == 1) {
                dgxyVar.c = i;
                String attributeValue4 = xmlPullParserNewPullParser.getAttributeValue(null, "timeout");
                if (attributeValue4 != null) {
                    try {
                        dgxyVar.c = Integer.parseInt(attributeValue4);
                    } catch (NumberFormatException unused) {
                        dhja.q("Invalid number format for timeout %s failling back to default value", attributeValue4);
                    }
                }
            }
            String attributeValue5 = xmlPullParserNewPullParser.getAttributeValue(null, "pin");
            if (attributeValue5 != null && attributeValue5.equals("true")) {
                dgxyVar.d = true;
            }
            String attributeValue6 = xmlPullParserNewPullParser.getAttributeValue(null, "externalEUCR");
            if (attributeValue6 != null) {
                attributeValue6.equals("true");
            }
            int iNextTag = xmlPullParserNewPullParser.nextTag();
            String name = xmlPullParserNewPullParser.getName();
            while (iNextTag != 3) {
                if (name.equals("EndUserConfirmationRequest")) {
                    break;
                }
                if (name.equals("Subject")) {
                    String attributeValue7 = xmlPullParserNewPullParser.getAttributeValue(null, "lang");
                    if (attributeValue7 != null) {
                        dgxyVar.g.put(attributeValue7, xmlPullParserNewPullParser.nextText());
                    }
                } else if (name.equals("Text")) {
                    String attributeValue8 = xmlPullParserNewPullParser.getAttributeValue(null, "lang");
                    if (attributeValue8 != null) {
                        dgxyVar.h.put(attributeValue8, xmlPullParserNewPullParser.nextText());
                    }
                } else if (name.equals("ButtonAccept")) {
                    String attributeValue9 = xmlPullParserNewPullParser.getAttributeValue(null, "lang");
                    if (attributeValue9 != null) {
                        dgxyVar.a.put(attributeValue9, xmlPullParserNewPullParser.nextText());
                    }
                } else if (name.equals("ButtonReject") && (attributeValue = xmlPullParserNewPullParser.getAttributeValue(null, "lang")) != null) {
                    dgxyVar.b.put(attributeValue, xmlPullParserNewPullParser.nextText());
                }
                iNextTag = xmlPullParserNewPullParser.nextTag();
                name = xmlPullParserNewPullParser.getName();
            }
            return dgxyVar;
        } catch (XmlPullParserException e) {
            throw new IOException(e.getMessage());
        }
    }
}
