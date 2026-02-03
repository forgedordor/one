package defpackage;

import android.text.TextUtils;
import java.io.IOException;
import java.util.Arrays;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class dezx {
    public final long b;
    public final String c;
    public final String d;

    public dezx(long j, String str, String str2) {
        this.b = j;
        this.c = str;
        this.d = str2;
    }

    public static dezx a(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        String name = xmlPullParser.getName();
        int iNextTag = xmlPullParser.nextTag();
        String namespace = xmlPullParser.getNamespace();
        String name2 = xmlPullParser.getName();
        String strNextText = null;
        long jB = 0;
        String strNextText2 = null;
        while (true) {
            if (iNextTag == 3 && name2.equals(name)) {
                return new dezx(jB, strNextText, strNextText2);
            }
            if ("urn:ietf:params:xml:ns:conference-info".equals(namespace)) {
                if (name2.equals("when")) {
                    jB = dhif.b(xmlPullParser.nextText());
                } else if (name2.equals("reason")) {
                    strNextText = xmlPullParser.nextText();
                } else if (name2.equals("by")) {
                    strNextText2 = xmlPullParser.nextText();
                }
            }
            iNextTag = xmlPullParser.nextTag();
            namespace = xmlPullParser.getNamespace();
            name2 = xmlPullParser.getName();
        }
    }

    public final void b(XmlSerializer xmlSerializer, String str) throws IllegalStateException, IOException, IllegalArgumentException {
        xmlSerializer.startTag("urn:ietf:params:xml:ns:conference-info", str);
        long j = this.b;
        if (j > 0) {
            xmlSerializer.startTag("urn:ietf:params:xml:ns:conference-info", "when");
            xmlSerializer.text(dhif.c(j));
            xmlSerializer.endTag("urn:ietf:params:xml:ns:conference-info", "when");
        }
        String str2 = this.c;
        if (str2 != null) {
            xmlSerializer.startTag("urn:ietf:params:xml:ns:conference-info", "reason");
            xmlSerializer.text(str2);
            xmlSerializer.endTag("urn:ietf:params:xml:ns:conference-info", "reason");
        }
        String str3 = this.d;
        if (str3 != null) {
            xmlSerializer.startTag("urn:ietf:params:xml:ns:conference-info", "by");
            xmlSerializer.text(str3);
            xmlSerializer.endTag("urn:ietf:params:xml:ns:conference-info", "by");
        }
        xmlSerializer.endTag("urn:ietf:params:xml:ns:conference-info", str);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof dezx)) {
            return false;
        }
        dezx dezxVar = (dezx) obj;
        return TextUtils.equals(this.c, dezxVar.c) && TextUtils.equals(this.d, dezxVar.d) && this.b == dezxVar.b;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.c, this.d, Long.valueOf(this.b)});
    }

    public final String toString() {
        return "By: " + dhiz.USER_ID.c(this.d) + ", when: " + this.b + ", reason: " + this.c;
    }
}
