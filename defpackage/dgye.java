package defpackage;

import com.google.android.ims.rcsservice.businessinfo.BusinessInfoDatabaseConstants;
import com.google.android.ims.rcsservice.chatsession.message.groupmanagement.GroupManagementRequest;
import java.io.IOException;
import java.io.InputStream;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dgye {
    public int a;

    private dgye() {
    }

    public static dgye a(InputStream inputStream) throws XmlPullParserException, IOException {
        try {
            XmlPullParser xmlPullParserNewPullParser = XmlPullParserFactory.newInstance().newPullParser();
            xmlPullParserNewPullParser.setInput(inputStream, "utf-8");
            xmlPullParserNewPullParser.nextTag();
            dgye dgyeVar = new dgye();
            if (xmlPullParserNewPullParser.getAttributeValue(null, "id") == null) {
                throw new IllegalArgumentException("No id attribute found in XML document");
            }
            String attributeValue = xmlPullParserNewPullParser.getAttributeValue(null, BusinessInfoDatabaseConstants.BusinessInfoPropertiesTableConstants.Columns.TYPE);
            if ("urn:gsma:rcs:http-configuration:reconfigure".equalsIgnoreCase(attributeValue)) {
                dgyeVar.a = 1;
                return dgyeVar;
            }
            if (!"urn:gsma:rcs:extension:control".equalsIgnoreCase(attributeValue)) {
                throw new IOException(a.v(attributeValue, "Unexpected type: "));
            }
            dgyeVar.a = 2;
            xmlPullParserNewPullParser.getAttributeValue(null, GroupManagementRequest.DATA_TAG);
            return dgyeVar;
        } catch (XmlPullParserException e) {
            throw new IOException(e.getMessage());
        }
    }
}
