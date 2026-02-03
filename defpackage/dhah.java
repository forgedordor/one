package defpackage;

import java.io.IOException;
import java.io.InputStream;
import org.xml.sax.helpers.DefaultHandler;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dhah extends DefaultHandler {
    private static final ekgp a;
    private final XmlPullParser b = XmlPullParserFactory.newInstance().newPullParser();

    static {
        ekgi ekgiVar = new ekgi();
        ekgiVar.i("state", new dhag() { // from class: dhac
            @Override // defpackage.dhag
            public final void a(dgzy dgzyVar, String str) {
                dgzyVar.a = str.equalsIgnoreCase("active");
            }
        });
        ekgiVar.i("refresh", new dhag() { // from class: dhad
            @Override // defpackage.dhag
            public final void a(dgzy dgzyVar, String str) {
                dgzyVar.b = Long.parseLong(str);
            }
        });
        ekgiVar.i("contenttype", new dhag() { // from class: dhae
            @Override // defpackage.dhag
            public final void a(dgzy dgzyVar, String str) {
            }
        });
        ekgiVar.i("lastactive", new dhag() { // from class: dhaf
            @Override // defpackage.dhag
            public final void a(dgzy dgzyVar, String str) {
                dgzyVar.a(str);
            }
        });
        a = ekgiVar.c();
    }

    public final dgzy a(InputStream inputStream) throws XmlPullParserException, IOException {
        dgzy dgzyVar = new dgzy();
        try {
            XmlPullParser xmlPullParser = this.b;
            xmlPullParser.setInput(inputStream, "utf-8");
            xmlPullParser.nextTag();
            xmlPullParser.require(2, null, "isComposing");
            while (xmlPullParser.nextTag() == 2) {
                dhag dhagVar = (dhag) a.get(xmlPullParser.getName());
                if (dhagVar != null) {
                    dhagVar.a(dgzyVar, xmlPullParser.nextText());
                } else {
                    int i = 1;
                    while (i > 0) {
                        int next = xmlPullParser.next();
                        if (next == 3) {
                            i--;
                        } else if (next == 2) {
                            i++;
                        }
                    }
                }
            }
            xmlPullParser.require(3, null, "isComposing");
            return dgzyVar;
        } catch (XmlPullParserException e) {
            throw new IOException("Error while parsing notification message.", e);
        }
    }
}
