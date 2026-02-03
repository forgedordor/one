package defpackage;

import j$.util.Objects;
import java.io.IOException;
import java.util.Arrays;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dhna extends dhmw {
    public Double a;
    private String b;
    private String c;

    public dhna() {
    }

    public final Double a() {
        String str = this.c;
        if (str != null) {
            return Double.valueOf(str);
        }
        return null;
    }

    public final Double b() {
        String str = this.b;
        if (str != null) {
            return Double.valueOf(str);
        }
        return null;
    }

    public final void c(XmlSerializer xmlSerializer) throws IllegalStateException, IOException, IllegalArgumentException {
        xmlSerializer.startTag("http://www.opengis.net/gml", "pos");
        String str = this.c;
        String strConcat = str != null ? "".concat(str) : "";
        String str2 = this.b;
        if (str2 != null) {
            strConcat = a.q(str2, strConcat, " ");
        }
        Double d = this.a;
        if (d != null) {
            strConcat = strConcat + " " + d;
        }
        xmlSerializer.text(strConcat);
        xmlSerializer.endTag("http://www.opengis.net/gml", "pos");
    }

    public final void d(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        String strNextText = xmlPullParser.nextText();
        String[] strArrSplit = strNextText.contains(",") ? strNextText.split(",") : strNextText.split("\\s");
        int length = strArrSplit.length;
        if (length >= 2) {
            this.c = strArrSplit[0];
            this.b = strArrSplit[1];
            if (length == 3) {
                this.a = Double.valueOf(strArrSplit[2]);
            }
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof dhna)) {
            return false;
        }
        dhna dhnaVar = (dhna) obj;
        Double dB = b();
        Double dA = a();
        Double dA2 = dhnaVar.a();
        Double dB2 = dhnaVar.b();
        Double d = dhnaVar.a;
        if (dA == null && dhnaVar.a() != null) {
            return false;
        }
        if (dA != null && (Objects.isNull(dA2) || !eolk.b(dA.doubleValue(), dA2.doubleValue(), 1.0E-5d))) {
            return false;
        }
        if (dB == null && dhnaVar.b() != null) {
            return false;
        }
        if (dB != null && (Objects.isNull(dB2) || !eolk.b(dB.doubleValue(), dB2.doubleValue(), 1.0E-5d))) {
            return false;
        }
        Double d2 = this.a;
        if (d2 == null && d == null) {
            return true;
        }
        return (d2 == null || d == null || !eolk.b(d2.doubleValue(), d.doubleValue(), 1.0E-5d)) ? false : true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.b, this.c, this.a});
    }

    public dhna(Double d, Double d2) {
        this.b = d2.toString();
        this.c = d.toString();
    }
}
