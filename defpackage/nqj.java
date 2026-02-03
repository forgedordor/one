package defpackage;

import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: PG */
/* loaded from: classes.dex */
final class nqj {
    private static final String[] a = {"Camera:MotionPhoto", "GCamera:MotionPhoto", "Camera:MicroVideo", "GCamera:MicroVideo"};
    private static final String[] b = {"Camera:MotionPhotoPresentationTimestampUs", "GCamera:MotionPhotoPresentationTimestampUs", "Camera:MicroVideoPresentationTimestampUs", "GCamera:MicroVideoPresentationTimestampUs"};
    private static final String[] c = {"Camera:MicroVideoOffset", "GCamera:MicroVideoOffset"};

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0089, code lost:
    
        r9 = -9223372036854775807L;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.nqf a(java.lang.String r24) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException, java.lang.NumberFormatException {
        /*
            Method dump skipped, instructions count: 231
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nqj.a(java.lang.String):nqf");
    }

    private static ekgb b(XmlPullParser xmlPullParser, String str, String str2) throws XmlPullParserException, IOException {
        int i = ekgb.d;
        ekfw ekfwVar = new ekfw();
        do {
            String strConcat = str.concat(":Item");
            xmlPullParser.next();
            if (mgc.c(xmlPullParser, strConcat)) {
                String strConcat2 = str2.concat(":Mime");
                String strConcat3 = str2.concat(":Semantic");
                String strConcat4 = str2.concat(":Length");
                String strConcat5 = str2.concat(":Padding");
                String strA = mgc.a(xmlPullParser, strConcat2);
                String strA2 = mgc.a(xmlPullParser, strConcat3);
                String strA3 = mgc.a(xmlPullParser, strConcat4);
                String strA4 = mgc.a(xmlPullParser, strConcat5);
                if (strA == null || strA2 == null) {
                    return ekoe.a;
                }
                ekfwVar.h(new nqe(strA, strA3 != null ? Long.parseLong(strA3) : 0L, strA4 != null ? Long.parseLong(strA4) : 0L));
            }
        } while (!mgc.b(xmlPullParser, str.concat(":Directory")));
        return ekfwVar.g();
    }
}
