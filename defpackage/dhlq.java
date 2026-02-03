package defpackage;

import j$.util.Collection;
import j$.util.function.Consumer$CC;
import j$.util.stream.Stream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.function.Consumer;
import javax.xml.namespace.QName;
import org.w3c.dom.DOMException;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlSerializer;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dhlq {
    private final ekgp a;
    private final ekgp b;

    public dhlq(Set set) {
        final HashMap map = new HashMap();
        final HashMap map2 = new HashMap();
        Collection.EL.stream(set).forEach(new Consumer() { // from class: dhln
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                final dhld dhldVar = (dhld) obj;
                Stream stream = Collection.EL.stream(dhldVar.b());
                final Map map3 = map;
                stream.forEach(new Consumer() { // from class: dhlo
                    @Override // java.util.function.Consumer
                    public final void accept(Object obj2) {
                        map3.put((QName) obj2, dhldVar);
                    }

                    public final /* synthetic */ Consumer andThen(Consumer consumer) {
                        return Consumer$CC.$default$andThen(this, consumer);
                    }
                });
                Stream stream2 = Collection.EL.stream(dhldVar.c());
                final Map map4 = map2;
                stream2.forEach(new Consumer() { // from class: dhlp
                    @Override // java.util.function.Consumer
                    public final void accept(Object obj2) {
                        map4.put((Class) obj2, dhldVar);
                    }

                    public final /* synthetic */ Consumer andThen(Consumer consumer) {
                        return Consumer$CC.$default$andThen(this, consumer);
                    }
                });
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
        this.a = ekgp.j(map);
        this.b = ekgp.j(map2);
    }

    public final Object a(Document document, QName qName, XmlPullParser xmlPullParser) {
        dhld dhldVar = (dhld) this.a.get(new QName(xmlPullParser.getNamespace(), xmlPullParser.getName()));
        return dhldVar == null ? dhlf.d(document, xmlPullParser) : dhldVar.a(document, qName, xmlPullParser);
    }

    public final void b(Object obj, XmlSerializer xmlSerializer) throws IllegalStateException, DOMException, IOException, IllegalArgumentException {
        dhld dhldVar = (dhld) this.b.get(obj.getClass());
        if (dhldVar != null) {
            dhldVar.d(obj, xmlSerializer);
        } else if (obj instanceof Element) {
            dhlf.f((Element) obj, xmlSerializer);
        } else if (obj instanceof dhle) {
            ((dhle) obj).c(xmlSerializer);
        }
    }
}
