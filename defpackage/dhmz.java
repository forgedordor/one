package defpackage;

import j$.util.Objects;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dhmz extends dhmw implements dhmq, dhmj {
    private dhmx a;
    private String b;

    @Override // defpackage.dhmj
    public final void a(XmlSerializer xmlSerializer) throws IllegalStateException, IOException, IllegalArgumentException {
        xmlSerializer.startTag("http://www.opengis.net/pidflo/1.0", "base");
        c(xmlSerializer);
        xmlSerializer.endTag("http://www.opengis.net/pidflo/1.0", "base");
    }

    @Override // defpackage.dhmj
    public final void b(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        this.b = xmlPullParser.getAttributeValue("", "srsName");
        int iNextTag = xmlPullParser.nextTag();
        String name = xmlPullParser.getName();
        String namespace = xmlPullParser.getNamespace();
        while (true) {
            if ((iNextTag == 3) && name.equalsIgnoreCase("Polygon")) {
                return;
            }
            if ("http://www.opengis.net/gml".equals(namespace) && name.equalsIgnoreCase("exterior")) {
                int iNextTag2 = xmlPullParser.nextTag();
                String name2 = xmlPullParser.getName();
                xmlPullParser.getNamespace();
                while (true) {
                    if (!((iNextTag2 == 3) & name2.equalsIgnoreCase("exterior"))) {
                        dhmx dhmxVar = new dhmx();
                        this.a = dhmxVar;
                        int iNextTag3 = xmlPullParser.nextTag();
                        String name3 = xmlPullParser.getName();
                        String namespace2 = xmlPullParser.getNamespace();
                        while (true) {
                            if (!((iNextTag3 == 3) & name3.equalsIgnoreCase("LinearRing"))) {
                                if ("http://www.opengis.net/gml".equals(namespace2)) {
                                    if (name3.equalsIgnoreCase("pos")) {
                                        dhna dhnaVar = new dhna();
                                        dhnaVar.d(xmlPullParser);
                                        dhmxVar.a().add(dhnaVar);
                                    }
                                    if (name3.equalsIgnoreCase("posList")) {
                                        dhmxVar.b = new dhnb();
                                        dhnb dhnbVar = dhmxVar.b;
                                        String[] strArrSplit = xmlPullParser.nextText().trim().split("\r\n|\n");
                                        for (int i = 0; i < strArrSplit.length; i++) {
                                            if (strArrSplit[i].length() != 0) {
                                                String[] strArrSplit2 = strArrSplit[i].contains(",") ? strArrSplit[i].split(",") : strArrSplit[i].split("\\s");
                                                dhna dhnaVar2 = new dhna(Double.valueOf(strArrSplit2[0]), Double.valueOf(strArrSplit2[1]));
                                                if (strArrSplit2.length == 3) {
                                                    dhnaVar2.a = Double.valueOf(strArrSplit2[2]);
                                                }
                                                dhnbVar.a().add(dhnaVar2);
                                            }
                                        }
                                    }
                                }
                                iNextTag3 = xmlPullParser.nextTag();
                                name3 = xmlPullParser.getName();
                                namespace2 = xmlPullParser.getNamespace();
                            }
                        }
                        iNextTag2 = xmlPullParser.nextTag();
                        name2 = xmlPullParser.getName();
                        xmlPullParser.getNamespace();
                    }
                }
            }
            iNextTag = xmlPullParser.nextTag();
            name = xmlPullParser.getName();
            namespace = xmlPullParser.getNamespace();
        }
    }

    @Override // defpackage.dhmq, defpackage.dhle
    public final void c(XmlSerializer xmlSerializer) throws IllegalStateException, IOException, IllegalArgumentException {
        xmlSerializer.startTag("http://www.opengis.net/gml", "Polygon");
        String str = this.b;
        if (str != null) {
            xmlSerializer.attribute("", "srsName", str);
        }
        if (this.a != null) {
            xmlSerializer.startTag("http://www.opengis.net/gml", "exterior");
            this.a.c(xmlSerializer);
            xmlSerializer.endTag("http://www.opengis.net/gml", "exterior");
        }
        xmlSerializer.endTag("http://www.opengis.net/gml", "Polygon");
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0070  */
    @Override // defpackage.dhmj
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean equals(java.lang.Object r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof defpackage.dhmz
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            dhmz r7 = (defpackage.dhmz) r7
            dhmx r0 = r6.a
            dhmx r2 = r7.a
            dhnb r3 = r0.b
            if (r3 == 0) goto L1b
            dhnb r4 = r2.b
            if (r4 != 0) goto L15
            goto L62
        L15:
            boolean r3 = r4.equals(r3)
            if (r3 == 0) goto L62
        L1b:
            java.util.List r3 = r0.a
            if (r3 == 0) goto L53
            java.util.List r3 = r2.a()
            if (r3 == 0) goto L53
            java.util.List r3 = r0.a
            int r3 = r3.size()
            java.util.List r4 = r2.a
            int r4 = r4.size()
            if (r3 != r4) goto L62
            r3 = r1
        L34:
            java.util.List r4 = r0.a
            int r4 = r4.size()
            if (r3 >= r4) goto L53
            java.util.List r4 = r0.a
            java.lang.Object r4 = r4.get(r3)
            dhna r4 = (defpackage.dhna) r4
            java.util.List r5 = r2.a
            java.lang.Object r5 = r5.get(r3)
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L62
            int r3 = r3 + 1
            goto L34
        L53:
            java.util.List r0 = r0.a
            if (r0 == 0) goto L5b
            java.util.List r3 = r2.a
            if (r3 == 0) goto L62
        L5b:
            if (r0 != 0) goto L63
            java.util.List r0 = r2.a
            if (r0 != 0) goto L62
            goto L63
        L62:
            return r1
        L63:
            java.lang.String r0 = r6.b
            if (r0 == 0) goto L70
            java.lang.String r7 = r7.b
            boolean r7 = r0.equals(r7)
            if (r7 != 0) goto L75
            return r1
        L70:
            java.lang.String r7 = r7.b
            if (r7 == 0) goto L75
            return r1
        L75:
            r7 = 1
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dhmz.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        return Objects.hashCode(this.a);
    }
}
