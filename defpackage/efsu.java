package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.Xml;
import android.view.InflateException;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class efsu {
    public static final efst a(int i, Context context) throws Resources.NotFoundException {
        XmlResourceParser xml = context.getResources().getXml(i);
        try {
            return b(xml, context);
        } finally {
            xml.close();
        }
    }

    private static final efst b(XmlPullParser xmlPullParser, Context context) throws XmlPullParserException, IOException {
        int next;
        AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xmlPullParser);
        do {
            try {
                next = xmlPullParser.next();
                if (next == 2) {
                    if (xmlPullParser.getName().equals("FooterButton")) {
                        return new efst(context, attributeSetAsAttributeSet);
                    }
                    throw new InflateException(xmlPullParser.getPositionDescription() + ": not a FooterButton");
                }
            } catch (IOException e) {
                throw new InflateException(xmlPullParser.getPositionDescription() + ": " + e.getMessage(), e);
            } catch (XmlPullParserException e2) {
                throw new InflateException(e2.getMessage(), e2);
            }
        } while (next != 1);
        throw new InflateException(xmlPullParser.getPositionDescription() + ": No start tag found!");
    }
}
