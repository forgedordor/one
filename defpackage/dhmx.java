package defpackage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import org.xmlpull.v1.XmlSerializer;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dhmx extends dhmw implements dhmq {
    public List a;
    public dhnb b;

    public final List a() {
        if (this.a == null) {
            this.a = new ArrayList();
        }
        return this.a;
    }

    @Override // defpackage.dhmq, defpackage.dhle
    public final void c(XmlSerializer xmlSerializer) throws IllegalStateException, IOException, IllegalArgumentException {
        xmlSerializer.startTag("http://www.opengis.net/gml", "LinearRing");
        List list = this.a;
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((dhna) it.next()).c(xmlSerializer);
            }
        }
        dhnb dhnbVar = this.b;
        if (dhnbVar != null) {
            xmlSerializer.startTag("http://www.opengis.net/gml", "posList");
            List<dhna> list2 = dhnbVar.a;
            if (list2 != null) {
                String str = "";
                for (dhna dhnaVar : list2) {
                    String str2 = str.concat("\n") + dhnaVar.a() + " ";
                    Double dB = dhnaVar.b();
                    Objects.toString(dB);
                    String strConcat = str2.concat(String.valueOf(dB));
                    Double d = dhnaVar.a;
                    str = d != null ? strConcat + " " + d : strConcat;
                }
                xmlSerializer.text(str);
            }
            xmlSerializer.endTag("http://www.opengis.net/gml", "posList");
        }
        xmlSerializer.endTag("http://www.opengis.net/gml", "LinearRing");
    }
}
