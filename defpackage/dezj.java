package defpackage;

import j$.util.Optional;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dezj {
    public static dezn a(byte[] bArr) throws XmlPullParserException, IOException {
        XmlPullParser xmlPullParserNewPullParser = XmlPullParserFactory.newInstance().newPullParser();
        xmlPullParserNewPullParser.setInput(new ByteArrayInputStream(bArr), "utf-8");
        xmlPullParserNewPullParser.setFeature("http://xmlpull.org/v1/doc/features.html#process-namespaces", true);
        xmlPullParserNewPullParser.nextTag();
        return dezn.a(xmlPullParserNewPullParser);
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01d2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.dezn b(j$.util.Optional r10, defpackage.dezn r11, defpackage.crmx r12) throws defpackage.dezm {
        /*
            Method dump skipped, instructions count: 506
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dezj.b(j$.util.Optional, dezn, crmx):dezn");
    }

    public static dezn c(Optional optional, String str, byte[] bArr, crmx crmxVar) throws IOException {
        if (d(str, bArr)) {
            return b(optional, a(bArr), crmxVar);
        }
        throw new IOException("Invalid conference information");
    }

    public static boolean d(String str, byte[] bArr) {
        if (bArr == null || bArr.length == 0) {
            dhja.q("No content in notification", new Object[0]);
            return false;
        }
        if ("application/conference-info+xml".equalsIgnoreCase(str)) {
            return true;
        }
        dhja.q("Content-Type not matching: %s, expecting: %s", str, "application/conference-info+xml");
        return false;
    }
}
