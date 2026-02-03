package defpackage;

import android.text.TextUtils;
import com.google.android.ims.rcsservice.chatsession.message.ConversationSuggestion;
import com.google.android.ims.rcsservice.chatsession.message.groupmanagement.GroupManagementRequest;
import j$.util.Objects;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dffe {
    public long a;
    public String b;
    private long c;

    private dffe() {
    }

    public static dffe a(byte[] bArr) throws XmlPullParserException, IOException, NumberFormatException {
        try {
            XmlPullParser xmlPullParserNewPullParser = XmlPullParserFactory.newInstance().newPullParser();
            xmlPullParserNewPullParser.setInput(new ByteArrayInputStream(bArr), "utf-8");
            xmlPullParserNewPullParser.nextTag();
            if (!xmlPullParserNewPullParser.getName().equalsIgnoreCase("file-resume-info")) {
                throw new IOException("Malformed XML or not a file resume info for HTTP file transfer. First tag is " + xmlPullParserNewPullParser.getName());
            }
            String strB = null;
            long j = 0;
            long j2 = 0;
            while (xmlPullParserNewPullParser.getEventType() != 1) {
                if (xmlPullParserNewPullParser.next() == 2) {
                    String name = xmlPullParserNewPullParser.getName();
                    if ("file-range".equalsIgnoreCase(name)) {
                        String strB2 = b(xmlPullParserNewPullParser, ConversationSuggestion.SUGGESTION_PROPERTY_CALENDAR_START_TIME);
                        if (TextUtils.isEmpty(strB2)) {
                            throw new IOException("Unable to find start attribute in file range tag!");
                        }
                        long j3 = Long.parseLong(strB2);
                        String strB3 = b(xmlPullParserNewPullParser, ConversationSuggestion.SUGGESTION_PROPERTY_CALENDAR_END_TIME);
                        if (TextUtils.isEmpty(strB3)) {
                            throw new IOException("Unable to find end attribute in file range tag!");
                        }
                        j2 = Long.parseLong(strB3);
                        j = j3;
                    } else if (GroupManagementRequest.DATA_TAG.equalsIgnoreCase(name)) {
                        strB = b(xmlPullParserNewPullParser, "url");
                    }
                }
            }
            if (Objects.isNull(strB)) {
                throw new IOException("Unable to find url attribute!");
            }
            return new dffe(j, j2, strB);
        } catch (XmlPullParserException e) {
            throw new IOException("Unable to parse file resume info", e);
        }
    }

    private static String b(XmlPullParser xmlPullParser, String str) {
        return xmlPullParser.getAttributeValue(null, str);
    }

    public final String toString() {
        return " Url: " + this.b + "\n start: " + this.c + "\n end: " + this.a;
    }

    private dffe(long j, long j2, String str) {
        this.c = j;
        this.a = j2;
        this.b = str;
    }
}
