package defpackage;

import j$.util.Objects;
import java.io.IOException;
import java.util.Set;
import javax.xml.namespace.QName;
import org.w3c.dom.Document;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dhll implements dhld {
    private static final ekhx a = new ekph(new QName("urn:jibe:rcs:location-sharing", "preview"));
    private static final ekhx b = new ekph(dhlm.class);

    @Override // defpackage.dhld
    public final Object a(Document document, QName qName, XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        int i;
        byte[] bArr;
        dhlm dhlmVar = new dhlm();
        if (!"urn:jibe:rcs:location-sharing".equals(qName.getNamespaceURI()) || !"preview".equals(qName.getLocalPart())) {
            return dhlmVar;
        }
        if (Objects.isNull(xmlPullParser.getAttributeValue("", "content-type"))) {
            throw new XmlPullParserException("Preview is missing required content-type");
        }
        String strNextText = xmlPullParser.nextText();
        char[] cArr = dhig.a;
        int length = strNextText.length();
        if (length == 0) {
            bArr = new byte[0];
        } else {
            int i2 = length - 1;
            int i3 = 0;
            while (i3 < i2 && dhig.b[strNextText.charAt(i3) & 255] < 0) {
                i3++;
            }
            while (i2 > 0 && dhig.b[strNextText.charAt(i2) & 255] < 0) {
                i2--;
            }
            int i4 = strNextText.charAt(i2) == '=' ? strNextText.charAt(i2 + (-1)) == '=' ? 2 : 1 : 0;
            int i5 = (i2 - i3) + 1;
            if (length > 76) {
                int i6 = strNextText.charAt(76) == '\r' ? i5 / 78 : 0;
                i = i6 + i6;
            } else {
                i = 0;
            }
            int i7 = (((i5 - i) * 6) >> 3) - i4;
            byte[] bArr2 = new byte[i7];
            int i8 = 0;
            int i9 = 0;
            while (i8 < (i7 / 3) * 3) {
                int[] iArr = dhig.b;
                int i10 = i3 + 4;
                int i11 = iArr[strNextText.charAt(i3 + 3)] | (iArr[strNextText.charAt(i3 + 1)] << 12) | (iArr[strNextText.charAt(i3)] << 18) | (iArr[strNextText.charAt(i3 + 2)] << 6);
                bArr2[i8] = (byte) (i11 >> 16);
                int i12 = i8 + 2;
                bArr2[i8 + 1] = (byte) (i11 >> 8);
                i8 += 3;
                bArr2[i12] = (byte) i11;
                if (i <= 0 || (i9 = i9 + 1) != 19) {
                    i3 = i10;
                } else {
                    i3 += 6;
                    i9 = 0;
                }
            }
            if (i8 < i7) {
                int i13 = 0;
                int i14 = 0;
                while (i3 <= i2 - i4) {
                    i14 |= dhig.b[strNextText.charAt(i3)] << (18 - (i13 * 6));
                    i13++;
                    i3++;
                }
                int i15 = 16;
                while (i8 < i7) {
                    bArr2[i8] = (byte) (i14 >> i15);
                    i15 -= 8;
                    i8++;
                }
            }
            bArr = bArr2;
        }
        dhlmVar.a = bArr;
        return dhlmVar;
    }

    @Override // defpackage.dhld
    public final Set b() {
        return a;
    }

    @Override // defpackage.dhld
    public final Set c() {
        return b;
    }

    @Override // defpackage.dhld
    public final void d(Object obj, XmlSerializer xmlSerializer) throws IllegalStateException, IOException, IllegalArgumentException {
        if (obj instanceof dhlm) {
            xmlSerializer.startTag("urn:jibe:rcs:location-sharing", "preview");
            ((dhlm) obj).c(xmlSerializer);
            xmlSerializer.endTag("urn:jibe:rcs:location-sharing", "preview");
        }
    }
}
