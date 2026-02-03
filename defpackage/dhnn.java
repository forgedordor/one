package defpackage;

import com.google.android.ims.rcsservice.chatsession.message.ConversationSuggestion;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.xml.namespace.QName;
import org.w3c.dom.DOMException;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dhnn extends dhnh {
    public final List b = new ArrayList();
    private final List c = new ArrayList();
    private final Map d = new HashMap();
    private String e;

    public final void a(Document document, XmlPullParser xmlPullParser) throws XmlPullParserException, DOMException, IOException {
        for (int i = 0; i < xmlPullParser.getAttributeCount(); i++) {
            if (xmlPullParser.getAttributeName(i).equals("name")) {
                this.e = xmlPullParser.getAttributeValue(i);
            } else {
                this.d.put(new QName(xmlPullParser.getAttributeNamespace(i), xmlPullParser.getAttributeName(i)), xmlPullParser.getAttributeValue(i));
            }
        }
        int iNextTag = xmlPullParser.nextTag();
        String namespace = xmlPullParser.getNamespace();
        String name = xmlPullParser.getName();
        while (true) {
            if ((iNextTag == 3) && name.equals("list")) {
                return;
            }
            if (!"urn:ietf:params:xml:ns:resource-lists".equals(namespace)) {
                this.c.add(dhlf.d(document, xmlPullParser));
            } else if (name.equals("list")) {
                dhnn dhnnVar = new dhnn();
                dhnnVar.a(document, xmlPullParser);
                this.b.add(dhnnVar);
            } else if (name.equals("entry")) {
                dhnl dhnlVar = new dhnl();
                for (int i2 = 0; i2 < xmlPullParser.getAttributeCount(); i2++) {
                    if (xmlPullParser.getAttributeName(i2).equals(ConversationSuggestion.SUGGESTION_PROPERTY_WEB_URI)) {
                        dhnlVar.d = xmlPullParser.getAttributeValue(i2);
                    } else {
                        if (dhnlVar.e == null) {
                            dhnlVar.e = new HashMap();
                        }
                        dhnlVar.e.put(new QName(xmlPullParser.getAttributeNamespace(i2), xmlPullParser.getAttributeName(i2)), xmlPullParser.getAttributeValue(i2));
                    }
                }
                int iNextTag2 = xmlPullParser.nextTag();
                String namespace2 = xmlPullParser.getNamespace();
                String name2 = xmlPullParser.getName();
                while (true) {
                    if ((iNextTag2 == 3) && name2.equals("entry")) {
                        break;
                    }
                    if (!"urn:ietf:params:xml:ns:resource-lists".equals(namespace2)) {
                        Element elementD = dhlf.d(document, xmlPullParser);
                        if (dhnlVar.c == null) {
                            dhnlVar.c = new ArrayList(1);
                        }
                        dhnlVar.c.add(elementD);
                    } else if (name2.equals("display-name")) {
                        dhnlVar.b = new dhnj();
                        dhnlVar.b.b(xmlPullParser);
                    }
                    iNextTag2 = xmlPullParser.nextTag();
                    namespace2 = xmlPullParser.getNamespace();
                    name2 = xmlPullParser.getName();
                }
                this.b.add(dhnlVar);
            } else if (name.equals("external")) {
                dhnm dhnmVar = new dhnm();
                for (int i3 = 0; i3 < xmlPullParser.getAttributeCount(); i3++) {
                    if (!xmlPullParser.getAttributeName(i3).equals("anchor")) {
                        new QName(xmlPullParser.getAttributeNamespace(i3), xmlPullParser.getAttributeName(i3));
                        xmlPullParser.getAttributeValue(i3);
                        throw null;
                    }
                    dhnmVar.c = xmlPullParser.getAttributeValue(i3);
                }
                int iNextTag3 = xmlPullParser.nextTag();
                String namespace3 = xmlPullParser.getNamespace();
                String name3 = xmlPullParser.getName();
                while (true) {
                    if ((iNextTag3 == 3) && name3.equals("external")) {
                        break;
                    }
                    if (!"urn:ietf:params:xml:ns:resource-lists".equals(namespace3)) {
                        Element elementD2 = dhlf.d(document, xmlPullParser);
                        if (dhnmVar.b == null) {
                            dhnmVar.b = new ArrayList();
                        }
                        dhnmVar.b.add(elementD2);
                    } else if (name3.equals("display-name")) {
                        dhnj dhnjVar = new dhnj();
                        dhnjVar.b(xmlPullParser);
                        dhnmVar.a = dhnjVar;
                    }
                    iNextTag3 = xmlPullParser.nextTag();
                    namespace3 = xmlPullParser.getNamespace();
                    name3 = xmlPullParser.getName();
                }
                this.b.add(dhnmVar);
            } else if (name.equals("entry-ref")) {
                dhnk dhnkVar = new dhnk();
                for (int i4 = 0; i4 < xmlPullParser.getAttributeCount(); i4++) {
                    if (!xmlPullParser.getAttributeName(i4).equals("ref")) {
                        new QName(xmlPullParser.getAttributeNamespace(i4), xmlPullParser.getAttributeName(i4));
                        xmlPullParser.getAttributeValue(i4);
                        throw null;
                    }
                    dhnkVar.c = xmlPullParser.getAttributeValue(i4);
                }
                int iNextTag4 = xmlPullParser.nextTag();
                String namespace4 = xmlPullParser.getNamespace();
                String name4 = xmlPullParser.getName();
                while (true) {
                    if ((iNextTag4 == 3) && name4.equals("entry-ref")) {
                        break;
                    }
                    if (!"urn:ietf:params:xml:ns:resource-lists".equals(namespace4)) {
                        Element elementD3 = dhlf.d(document, xmlPullParser);
                        if (dhnkVar.b == null) {
                            dhnkVar.b = new ArrayList();
                        }
                        dhnkVar.b.add(elementD3);
                    } else if (name4.equals("display-name")) {
                        dhnj dhnjVar2 = new dhnj();
                        dhnjVar2.b(xmlPullParser);
                        dhnkVar.a = dhnjVar2;
                    }
                    iNextTag4 = xmlPullParser.nextTag();
                    namespace4 = xmlPullParser.getNamespace();
                    name4 = xmlPullParser.getName();
                }
                this.b.add(dhnkVar);
            } else if (name.equals("display-name")) {
                dhnj dhnjVar3 = new dhnj();
                dhnjVar3.b(xmlPullParser);
                this.a = dhnjVar3;
            }
            iNextTag = xmlPullParser.nextTag();
            namespace = xmlPullParser.getNamespace();
            name = xmlPullParser.getName();
        }
    }

    public final void b(XmlSerializer xmlSerializer) throws IllegalStateException, IOException, IllegalArgumentException {
        String str = this.e;
        if (str != null) {
            xmlSerializer.attribute("", "name", str);
        }
        dhnj dhnjVar = this.a;
        int i = 0;
        if (dhnjVar != null) {
            dhnjVar.a(xmlSerializer);
        }
        while (true) {
            List list = this.b;
            if (i >= list.size()) {
                return;
            }
            Object obj = list.get(i);
            if (obj instanceof dhnn) {
                xmlSerializer.startTag("urn:ietf:params:xml:ns:resource-lists", "list");
                ((dhnn) obj).b(xmlSerializer);
                xmlSerializer.endTag("urn:ietf:params:xml:ns:resource-lists", "list");
            } else if (obj instanceof dhnl) {
                xmlSerializer.startTag("urn:ietf:params:xml:ns:resource-lists", "entry");
                dhnl dhnlVar = (dhnl) obj;
                if (dhnlVar.f != dhni.NONE) {
                    xmlSerializer.attribute("urn:ietf:params:xml:ns:copycontrol", "copyControl", dhnlVar.f.e);
                }
                xmlSerializer.attribute("", ConversationSuggestion.SUGGESTION_PROPERTY_WEB_URI, dhnlVar.d);
                Map map = dhnlVar.e;
                if (map != null) {
                    for (Map.Entry entry : map.entrySet()) {
                        xmlSerializer.attribute(((QName) entry.getKey()).getPrefix(), ((QName) entry.getKey()).getLocalPart(), (String) entry.getValue());
                    }
                }
                dhnj dhnjVar2 = dhnlVar.b;
                if (dhnjVar2 != null) {
                    dhnjVar2.a(xmlSerializer);
                }
                xmlSerializer.endTag("urn:ietf:params:xml:ns:resource-lists", "entry");
            } else if (obj instanceof dhnk) {
                xmlSerializer.startTag("urn:ietf:params:xml:ns:resource-lists", "entry-ref");
                dhnk dhnkVar = (dhnk) obj;
                xmlSerializer.attribute("", "ref", dhnkVar.c);
                dhnj dhnjVar3 = dhnkVar.a;
                if (dhnjVar3 != null) {
                    dhnjVar3.a(xmlSerializer);
                }
                xmlSerializer.endTag("urn:ietf:params:xml:ns:resource-lists", "entry-ref");
            } else if (obj instanceof dhnm) {
                xmlSerializer.startTag("urn:ietf:params:xml:ns:resource-lists", "external");
                dhnm dhnmVar = (dhnm) obj;
                xmlSerializer.attribute("", "anchor", dhnmVar.c);
                dhnj dhnjVar4 = dhnmVar.a;
                if (dhnjVar4 != null) {
                    dhnjVar4.a(xmlSerializer);
                }
                xmlSerializer.endTag("urn:ietf:params:xml:ns:resource-lists", "external");
            }
            i++;
        }
    }
}
