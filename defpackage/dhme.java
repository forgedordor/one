package defpackage;

import com.google.android.ims.rcsservice.businessinfo.BusinessInfoDatabaseConstants;
import j$.util.Objects;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import javax.xml.namespace.QName;
import javax.xml.parsers.ParserConfigurationException;
import org.w3c.dom.Document;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;
import org.xmlpull.v1.XmlSerializer;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dhme {
    private final fcsu a;

    public dhme(fcsu fcsuVar) {
        this.a = fcsuVar;
    }

    public static void b(dhmb dhmbVar, OutputStream outputStream) throws XmlPullParserException, IllegalStateException, IOException, IllegalArgumentException {
        d(dhmbVar, new dhmc(outputStream));
    }

    private final dhmb c(dhmd dhmdVar) throws XmlPullParserException, IOException {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6 = "urn:ietf:params:xml:ns:pidf";
        String str7 = "";
        try {
            Document documentC = dhlf.c();
            XmlPullParser xmlPullParserNewPullParser = XmlPullParserFactory.newInstance().newPullParser();
            xmlPullParserNewPullParser.setFeature("http://xmlpull.org/v1/doc/features.html#process-namespaces", true);
            xmlPullParserNewPullParser.setInput(dhmdVar.a, "utf-8");
            xmlPullParserNewPullParser.next();
            dhmb dhmbVar = (dhmb) this.a.b();
            dhmbVar.a = xmlPullParserNewPullParser.getAttributeValue("", "entity");
            String name = xmlPullParserNewPullParser.getName();
            int iNextTag = xmlPullParserNewPullParser.nextTag();
            String namespace = xmlPullParserNewPullParser.getNamespace();
            String name2 = xmlPullParserNewPullParser.getName();
            while (true) {
                int i = 3;
                if (iNextTag == 3) {
                    if (name2.equals(name)) {
                        return dhmbVar;
                    }
                }
                if (!str6.equals(namespace)) {
                    str = str6;
                    str2 = str7;
                    dhmbVar.a().add(((dhlq) dhmbVar.d.b()).a(documentC, new QName(namespace, name2), xmlPullParserNewPullParser));
                } else if (name2.equals("tuple")) {
                    dhmg dhmgVar = (dhmg) dhmbVar.e.b();
                    dhmbVar.b().add(dhmgVar);
                    dhmgVar.a = xmlPullParserNewPullParser.getAttributeValue(str7, "id");
                    String name3 = xmlPullParserNewPullParser.getName();
                    int iNextTag2 = xmlPullParserNewPullParser.nextTag();
                    String name4 = xmlPullParserNewPullParser.getName();
                    String namespace2 = xmlPullParserNewPullParser.getNamespace();
                    while (true) {
                        if (iNextTag2 == i && name4.equals(name3)) {
                            break;
                        }
                        if (!str6.equals(namespace2)) {
                            str3 = str6;
                            str4 = str7;
                            if (!"urn:oma:xml:prs:pidf:oma-pres".equals(namespace2)) {
                                i = 3;
                                dhmgVar.a().add(((dhlq) dhmgVar.j.b()).a(documentC, new QName(namespace2, name4), xmlPullParserNewPullParser));
                            } else if (name4.equals("service-description")) {
                                dhmgVar.c = dhmgVar.h.a(null, null, null);
                                dhlw dhlwVar = dhmgVar.c;
                                int iNextTag3 = xmlPullParserNewPullParser.nextTag();
                                String name5 = xmlPullParserNewPullParser.getName();
                                String namespace3 = xmlPullParserNewPullParser.getNamespace();
                                i = 3;
                                while (true) {
                                    if (iNextTag3 != 3 || !name5.equals("service-description")) {
                                        if (name5.equals(BusinessInfoDatabaseConstants.BusinessInfoMetadataTableConstants.Columns.VERSION) && "urn:oma:xml:prs:pidf:oma-pres".equals(namespace3)) {
                                            dhlwVar.c = xmlPullParserNewPullParser.nextText();
                                        } else if (name5.equals("description") && "urn:oma:xml:prs:pidf:oma-pres".equals(namespace3)) {
                                            dhlwVar.d = xmlPullParserNewPullParser.nextText();
                                        } else if (name5.equals("service-id") && "urn:oma:xml:prs:pidf:oma-pres".equals(namespace3)) {
                                            dhlwVar.b = xmlPullParserNewPullParser.nextText();
                                        } else {
                                            Object objA = dhlwVar.e.a(documentC, new QName(namespace3, name5), xmlPullParserNewPullParser);
                                            if (dhlwVar.a == null) {
                                                dhlwVar.a = new ArrayList();
                                            }
                                            dhlwVar.a.add(objA);
                                        }
                                        iNextTag3 = xmlPullParserNewPullParser.nextTag();
                                        name5 = xmlPullParserNewPullParser.getName();
                                        namespace3 = xmlPullParserNewPullParser.getNamespace();
                                    }
                                }
                            } else {
                                i = 3;
                            }
                        } else if (name4.equals("contact")) {
                            dhmgVar.d = new dhlz();
                            dhlz dhlzVar = dhmgVar.d;
                            String attributeValue = xmlPullParserNewPullParser.getAttributeValue(str7, "priority");
                            if (attributeValue != null) {
                                dhlzVar.a = Double.valueOf(Double.parseDouble(attributeValue));
                            }
                            dhlzVar.b = xmlPullParserNewPullParser.nextText();
                            str3 = str6;
                            str4 = str7;
                        } else if (name4.equals("status")) {
                            dhmgVar.b = (dhmf) dhmgVar.i.b();
                            dhmf dhmfVar = dhmgVar.b;
                            String name6 = xmlPullParserNewPullParser.getName();
                            int iNextTag4 = xmlPullParserNewPullParser.nextTag();
                            str4 = str7;
                            String name7 = xmlPullParserNewPullParser.getName();
                            String namespace4 = xmlPullParserNewPullParser.getNamespace();
                            while (true) {
                                if (iNextTag4 == i && name7.equals(name6)) {
                                    break;
                                }
                                if (str6.equals(namespace4) && name7.equals("basic")) {
                                    String strTrim = xmlPullParserNewPullParser.nextText().trim();
                                    if (!Objects.isNull(strTrim)) {
                                        dhmfVar.a = dhly.a(strTrim);
                                    }
                                    str5 = str6;
                                } else {
                                    if (dhmfVar.b == null) {
                                        dhmfVar.b = new ArrayList();
                                    }
                                    str5 = str6;
                                    dhmfVar.b.add(((dhlq) dhmfVar.c.b()).a(documentC, new QName(namespace4, name7), xmlPullParserNewPullParser));
                                }
                                iNextTag4 = xmlPullParserNewPullParser.nextTag();
                                name7 = xmlPullParserNewPullParser.getName();
                                namespace4 = xmlPullParserNewPullParser.getNamespace();
                                str6 = str5;
                                i = 3;
                            }
                            str3 = str6;
                        } else {
                            str3 = str6;
                            str4 = str7;
                            if (name4.equals("note")) {
                                dhma dhmaVar = new dhma();
                                dhmaVar.b(xmlPullParserNewPullParser);
                                if (dhmgVar.e == null) {
                                    dhmgVar.e = new ArrayList();
                                }
                                dhmgVar.e.add(dhmaVar);
                            } else if (name4.equals("timestamp")) {
                                dhmgVar.f = dhie.b(xmlPullParserNewPullParser.nextText());
                            } else {
                                dhmgVar.a().add(((dhlq) dhmgVar.j.b()).a(documentC, new QName(namespace2, name4), xmlPullParserNewPullParser));
                            }
                            i = 3;
                        }
                        iNextTag2 = xmlPullParserNewPullParser.nextTag();
                        name4 = xmlPullParserNewPullParser.getName();
                        namespace2 = xmlPullParserNewPullParser.getNamespace();
                        str7 = str4;
                        str6 = str3;
                    }
                    str = str6;
                    str2 = str7;
                } else {
                    str = str6;
                    str2 = str7;
                    if ("note".equals(name2)) {
                        dhma dhmaVar2 = new dhma();
                        dhmaVar2.b(xmlPullParserNewPullParser);
                        if (dhmbVar.c == null) {
                            dhmbVar.c = new ArrayList();
                        }
                        dhmbVar.c.add(dhmaVar2);
                    } else {
                        dhmbVar.a().add(((dhlq) dhmbVar.d.b()).a(documentC, new QName(namespace, name2), xmlPullParserNewPullParser));
                    }
                }
                iNextTag = xmlPullParserNewPullParser.nextTag();
                namespace = xmlPullParserNewPullParser.getNamespace();
                name2 = xmlPullParserNewPullParser.getName();
                str7 = str2;
                str6 = str;
            }
        } catch (IllegalArgumentException | ParserConfigurationException | XmlPullParserException e) {
            throw new IOException(e);
        }
    }

    private static void d(dhmb dhmbVar, dhmc dhmcVar) throws XmlPullParserException, IllegalStateException, IOException, IllegalArgumentException {
        try {
            XmlSerializer xmlSerializerNewSerializer = XmlPullParserFactory.newInstance().newSerializer();
            xmlSerializerNewSerializer.setOutput(dhmcVar.a, "utf-8");
            xmlSerializerNewSerializer.setPrefix("", "urn:ietf:params:xml:ns:pidf");
            xmlSerializerNewSerializer.setPrefix("rpid", "urn:ietf:params:xml:ns:pidf:rpid");
            xmlSerializerNewSerializer.setPrefix("cipid", "urn:ietf:params:xml:ns:pidf:cipid");
            xmlSerializerNewSerializer.setPrefix("pde", "urn:oma:xml:pde:pidf:ext");
            xmlSerializerNewSerializer.setPrefix("op", "urn:oma:xml:prs:pidf:oma-pres");
            xmlSerializerNewSerializer.setPrefix("caps", "urn:ietf:params:xml:ns:pidf:caps");
            xmlSerializerNewSerializer.startDocument("utf-8", true);
            dhmbVar.c(xmlSerializerNewSerializer);
            xmlSerializerNewSerializer.endDocument();
            xmlSerializerNewSerializer.flush();
        } catch (IllegalArgumentException | XmlPullParserException e) {
            throw new IOException(e);
        }
    }

    public final dhmb a(InputStream inputStream) {
        return c(new dhmd(inputStream));
    }
}
