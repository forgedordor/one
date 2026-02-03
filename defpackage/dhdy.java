package defpackage;

import com.google.android.ims.rcsservice.chatsession.message.ConversationSuggestion;
import j$.util.Objects;
import j$.util.Optional;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import javax.xml.namespace.QName;
import javax.xml.parsers.ParserConfigurationException;
import org.w3c.dom.DOMException;
import org.w3c.dom.Document;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;
import org.xmlpull.v1.XmlSerializer;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dhdy {
    public final fcsu a;

    public dhdy(fcsu fcsuVar) {
        this.a = fcsuVar;
    }

    public static void b(dhdx dhdxVar, OutputStream outputStream) throws XmlPullParserException, IllegalStateException, DOMException, IOException, IllegalArgumentException {
        try {
            XmlSerializer xmlSerializerNewSerializer = XmlPullParserFactory.newInstance().newSerializer();
            xmlSerializerNewSerializer.setOutput(outputStream, "utf-8");
            xmlSerializerNewSerializer.setPrefix("", "urn:gsma:params:xml:ns:rcs:rcs:geolocation");
            xmlSerializerNewSerializer.setPrefix("rpid", "urn:ietf:params:xml:ns:pidf:rpid");
            xmlSerializerNewSerializer.setPrefix("gml", "http://www.opengis.net/gml");
            xmlSerializerNewSerializer.setPrefix("gp", "urn:ietf:params:xml:ns:pidf:geopriv10");
            xmlSerializerNewSerializer.setPrefix("gs", "http://www.opengis.net/pidflo/1.0");
            xmlSerializerNewSerializer.startDocument("utf-8", null);
            dhdxVar.c(xmlSerializerNewSerializer);
            xmlSerializerNewSerializer.flush();
        } catch (XmlPullParserException e) {
            throw new IOException("XmlPullParserException during write(): ".concat(String.valueOf(e.getMessage())));
        }
    }

    public final dhdx a(InputStream inputStream) throws XmlPullParserException, IOException {
        try {
            Document documentC = dhlf.c();
            XmlPullParser xmlPullParserNewPullParser = XmlPullParserFactory.newInstance().newPullParser();
            xmlPullParserNewPullParser.setInput(inputStream, "utf-8");
            boolean z = true;
            xmlPullParserNewPullParser.setFeature("http://xmlpull.org/v1/doc/features.html#process-namespaces", true);
            xmlPullParserNewPullParser.nextTag();
            dhdx dhdxVar = (dhdx) this.a.b();
            dhdxVar.b = xmlPullParserNewPullParser.getAttributeValue("", "entity");
            int iNextTag = xmlPullParserNewPullParser.nextTag();
            String namespace = xmlPullParserNewPullParser.getNamespace();
            String name = xmlPullParserNewPullParser.getName();
            while (true) {
                if ((iNextTag == 3 ? z : false) && name.equals("rcsenvelope")) {
                    return dhdxVar;
                }
                if (!"urn:ietf:params:xml:ns:pidf".equals(namespace) && !"urn:gsma:params:xml:ns:rcs:rcs:geolocation".equals(namespace)) {
                    dhdxVar.b().add(((dhlq) dhdxVar.c.b()).a(documentC, new QName(namespace, name), xmlPullParserNewPullParser));
                } else if (name.equals("rcspushlocation")) {
                    dhdxVar.a = (dhdz) dhdxVar.d.b();
                    dhdz dhdzVar = dhdxVar.a;
                    dhdzVar.a = (String) Optional.ofNullable(xmlPullParserNewPullParser.getAttributeValue("", "id")).orElse("");
                    dhdzVar.b = xmlPullParserNewPullParser.getAttributeValue("", ConversationSuggestion.SUGGESTION_PROPERTY_MAP_LABEL);
                    int iNextTag2 = xmlPullParserNewPullParser.nextTag();
                    String namespace2 = xmlPullParserNewPullParser.getNamespace();
                    String name2 = xmlPullParserNewPullParser.getName();
                    while (true) {
                        if (iNextTag2 == 3 && name2.equals("rcspushlocation")) {
                            break;
                        }
                        if ("urn:ietf:params:xml:ns:pidf:rpid".equals(namespace2)) {
                            if (name2.equals("place-type")) {
                                dhnd dhndVar = (dhnd) dhdzVar.h.b();
                                dhndVar.e(documentC, xmlPullParserNewPullParser);
                                if (dhim.d(dhdzVar.b)) {
                                    dhdzVar.b = dhndVar.a();
                                }
                            } else if (name2.equals("time-offset")) {
                                dhdzVar.e = new dhng();
                                dhng dhngVar = dhdzVar.e;
                                dhngVar.a = xmlPullParserNewPullParser.getAttributeValue("", "id");
                                String attributeValue = xmlPullParserNewPullParser.getAttributeValue("urn:ietf:params:xml:ns:pidf:rpid", "until");
                                if (Objects.isNull(attributeValue)) {
                                    dhja.g("Invalid until value", new Object[0]);
                                } else {
                                    dhngVar.b = dhlf.b(attributeValue);
                                }
                                try {
                                    dhngVar.c = Long.parseLong(xmlPullParserNewPullParser.nextText());
                                } catch (NumberFormatException e) {
                                    dhja.i(e, "Invalid timeOffset value", new Object[0]);
                                }
                            }
                        } else if ("urn:ietf:params:xml:ns:pidf:geopriv10".equals(namespace2)) {
                            if (name2.equals("geopriv")) {
                                dhdzVar.d = (dhmn) dhdzVar.i.b();
                                dhdzVar.d.b(documentC, xmlPullParserNewPullParser);
                            }
                        } else if (!"urn:gsma:params:xml:ns:rcs:rcs:geolocation".equals(namespace2)) {
                            if (dhdzVar.f == null) {
                                dhdzVar.f = new ArrayList();
                            }
                            dhdzVar.f.add(((dhlq) dhdzVar.g.b()).a(documentC, new QName(namespace2, name2), xmlPullParserNewPullParser));
                        } else if (name2.equals("timestamp")) {
                            dhdzVar.c = dhlf.b(xmlPullParserNewPullParser.nextText()).getTime();
                        }
                        iNextTag2 = xmlPullParserNewPullParser.nextTag();
                        namespace2 = xmlPullParserNewPullParser.getNamespace();
                        name2 = xmlPullParserNewPullParser.getName();
                    }
                }
                iNextTag = xmlPullParserNewPullParser.nextTag();
                namespace = xmlPullParserNewPullParser.getNamespace();
                name = xmlPullParserNewPullParser.getName();
                z = true;
            }
        } catch (ParserConfigurationException e2) {
            throw new IOException("ParserConfigurationException during read(): ".concat(String.valueOf(e2.getMessage())));
        } catch (XmlPullParserException e3) {
            throw new IOException("XmlPullParserException during read(): ".concat(String.valueOf(e3.getMessage())));
        }
    }
}
