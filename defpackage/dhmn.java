package defpackage;

import j$.util.Objects;
import java.io.IOException;
import java.util.ArrayList;
import javax.xml.namespace.QName;
import org.w3c.dom.DOMException;
import org.w3c.dom.Document;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dhmn implements dhle {
    public dhmv a = new dhmv();
    private dhmp b;
    private String c;
    private dhmt d;
    private final fcsu e;
    private final fcsu f;

    public dhmn(fcsu fcsuVar, fcsu fcsuVar2) {
        this.e = fcsuVar;
        this.f = fcsuVar2;
        this.b = (dhmp) fcsuVar.b();
    }

    public final dhmp a() {
        if (this.b == null) {
            this.b = (dhmp) this.e.b();
        }
        return this.b;
    }

    public final void b(Document document, XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        dhmn dhmnVar;
        String str;
        String str2;
        String str3;
        dhmp dhmpVar;
        String str4;
        String str5;
        dhmn dhmnVar2 = this;
        int iNextTag = xmlPullParser.nextTag();
        String name = xmlPullParser.getName();
        String namespace = xmlPullParser.getNamespace();
        while (true) {
            int i = 3;
            if ((iNextTag == 3) && name.equalsIgnoreCase("geopriv")) {
                return;
            }
            String str6 = "urn:ietf:params:xml:ns:pidf:geopriv10";
            if ("urn:ietf:params:xml:ns:pidf:geopriv10".equals(namespace)) {
                String str7 = "location-info";
                if (name.equalsIgnoreCase("location-info")) {
                    dhmp dhmpVar2 = (dhmp) dhmnVar2.e.b();
                    dhmnVar2.b = dhmpVar2;
                    int iNextTag2 = xmlPullParser.nextTag();
                    String name2 = xmlPullParser.getName();
                    String namespace2 = xmlPullParser.getNamespace();
                    while (true) {
                        if ((iNextTag2 == i) && name2.equalsIgnoreCase(str7)) {
                            break;
                        }
                        if ("http://www.opengis.net/gml".equals(namespace2)) {
                            if (name2.equalsIgnoreCase("Point")) {
                                dhmy dhmyVar = new dhmy();
                                dhmyVar.b = xmlPullParser.getAttributeValue("", "srsName");
                                int iNextTag3 = xmlPullParser.nextTag();
                                String namespace3 = xmlPullParser.getNamespace();
                                str = str7;
                                String name3 = xmlPullParser.getName();
                                while (true) {
                                    if ((iNextTag3 == i) && name3.equalsIgnoreCase("point")) {
                                        break;
                                    }
                                    if ("http://www.opengis.net/gml".equals(namespace3) && name3.equalsIgnoreCase("pos")) {
                                        dhmyVar.a = new dhna();
                                        dhmyVar.a.d(xmlPullParser);
                                    }
                                    iNextTag3 = xmlPullParser.nextTag();
                                    namespace3 = xmlPullParser.getNamespace();
                                    name3 = xmlPullParser.getName();
                                    i = 3;
                                }
                                dhmpVar2.a().add(dhmyVar);
                            } else {
                                str = str7;
                            }
                            if (name2.equalsIgnoreCase("Polygon")) {
                                dhmz dhmzVar = new dhmz();
                                dhmzVar.b(xmlPullParser);
                                dhmpVar2.a().add(dhmzVar);
                            }
                            str2 = str6;
                            str3 = name;
                        } else {
                            str = str7;
                            if ("http://www.opengis.net/pidflo/1.0".equals(namespace2)) {
                                if (name2.equalsIgnoreCase("Circle")) {
                                    dhmk dhmkVar = new dhmk();
                                    xmlPullParser.getAttributeValue("", "srsName");
                                    str2 = str6;
                                    int iNextTag4 = xmlPullParser.nextTag();
                                    String name4 = xmlPullParser.getName();
                                    str3 = name;
                                    while (true) {
                                        if ((iNextTag4 == 3) && name4.equalsIgnoreCase("Circle")) {
                                            break;
                                        }
                                        if (name4.equalsIgnoreCase("radius")) {
                                            dhmkVar.b = new dhmo("radius");
                                            dhmkVar.b.b(xmlPullParser);
                                        }
                                        if (name4.equalsIgnoreCase("pos")) {
                                            dhmkVar.a = new dhna();
                                            dhmkVar.a.d(xmlPullParser);
                                        }
                                        iNextTag4 = xmlPullParser.nextTag();
                                        name4 = xmlPullParser.getName();
                                    }
                                    dhmpVar2.a().add(dhmkVar);
                                } else {
                                    str2 = str6;
                                    str3 = name;
                                }
                                if (name2.equalsIgnoreCase("Prism")) {
                                    dhms dhmsVar = new dhms();
                                    dhmsVar.a = xmlPullParser.getAttributeValue("", "srsName");
                                    int iNextTag5 = xmlPullParser.nextTag();
                                    String name5 = xmlPullParser.getName();
                                    String namespace4 = xmlPullParser.getNamespace();
                                    while (true) {
                                        if ((iNextTag5 == 3) && name5.equalsIgnoreCase("Prism")) {
                                            break;
                                        }
                                        if ("http://www.opengis.net/pidflo/1.0".equals(namespace4)) {
                                            if (name5.equalsIgnoreCase("height")) {
                                                dhmsVar.c = new dhmo("height");
                                                dhmsVar.c.b(xmlPullParser);
                                            }
                                            if (name5.equalsIgnoreCase("base")) {
                                                String name6 = xmlPullParser.getName();
                                                xmlPullParser.getNamespace();
                                                while (true) {
                                                    if (!(name6.equalsIgnoreCase("base") & (iNextTag5 == 3))) {
                                                        xmlPullParser.nextTag();
                                                        String name7 = xmlPullParser.getName();
                                                        xmlPullParser.getNamespace();
                                                        if (name7.equals("Polygon")) {
                                                            dhmsVar.b = new dhmz();
                                                        }
                                                        if (name7.equals("ArcBand")) {
                                                            dhmsVar.b = new dhmi();
                                                        }
                                                        dhmsVar.b.b(xmlPullParser);
                                                        iNextTag5 = xmlPullParser.nextTag();
                                                        name6 = xmlPullParser.getName();
                                                        xmlPullParser.getNamespace();
                                                    }
                                                }
                                            }
                                        }
                                        iNextTag5 = xmlPullParser.nextTag();
                                        name5 = xmlPullParser.getName();
                                        namespace4 = xmlPullParser.getNamespace();
                                    }
                                    dhmpVar2.a().add(dhmsVar);
                                }
                                if (name2.equalsIgnoreCase("Ellipsoid")) {
                                    dhmm dhmmVar = new dhmm();
                                    dhmmVar.a = xmlPullParser.getAttributeValue("", "srsName");
                                    int iNextTag6 = xmlPullParser.nextTag();
                                    String name8 = xmlPullParser.getName();
                                    dhmpVar = dhmpVar2;
                                    String namespace5 = xmlPullParser.getNamespace();
                                    str4 = "radius";
                                    while (true) {
                                        if ((iNextTag6 == 3) && name8.equalsIgnoreCase("Ellipsoid")) {
                                            break;
                                        }
                                        if ("http://www.opengis.net/gml".equals(namespace5)) {
                                            if (name8.equalsIgnoreCase("pos")) {
                                                dhmmVar.b = new dhna();
                                                dhmmVar.b.d(xmlPullParser);
                                            }
                                        } else if ("http://www.opengis.net/pidflo/1.0".equals(namespace5)) {
                                            if (name8.equalsIgnoreCase("semiMajorAxis")) {
                                                dhmmVar.c = new dhmo("semiMajorAxis");
                                                dhmmVar.c.b(xmlPullParser);
                                            }
                                            if (name8.equalsIgnoreCase("semiMinorAxis")) {
                                                dhmmVar.d = new dhmo("semiMinorAxis");
                                                dhmmVar.d.b(xmlPullParser);
                                            }
                                            if (name8.equalsIgnoreCase("verticalAxis")) {
                                                dhmmVar.e = new dhmo("verticalAxis");
                                                dhmmVar.e.b(xmlPullParser);
                                            }
                                            if (name8.equalsIgnoreCase("orientation")) {
                                                dhmmVar.f = new dhmh("orientation");
                                                dhmmVar.f.b(xmlPullParser);
                                            }
                                        }
                                        iNextTag6 = xmlPullParser.nextTag();
                                        name8 = xmlPullParser.getName();
                                        namespace5 = xmlPullParser.getNamespace();
                                    }
                                    dhmpVar.a().add(dhmmVar);
                                } else {
                                    dhmpVar = dhmpVar2;
                                    str4 = "radius";
                                }
                                if (name2.equalsIgnoreCase("Sphere")) {
                                    dhmu dhmuVar = new dhmu();
                                    dhmuVar.c = xmlPullParser.getAttributeValue("", "srsName");
                                    int iNextTag7 = xmlPullParser.nextTag();
                                    String name9 = xmlPullParser.getName();
                                    String namespace6 = xmlPullParser.getNamespace();
                                    while (true) {
                                        if ((iNextTag7 == 3) && name9.equalsIgnoreCase("Sphere")) {
                                            break;
                                        }
                                        if (!"http://www.opengis.net/gml".equals(namespace6)) {
                                            if ("http://www.opengis.net/pidflo/1.0".equals(namespace6)) {
                                                str5 = str4;
                                                if (name9.equalsIgnoreCase(str5)) {
                                                    dhmuVar.b = new dhmo(str5);
                                                    dhmuVar.b.b(xmlPullParser);
                                                }
                                            }
                                            str4 = str5;
                                            iNextTag7 = xmlPullParser.nextTag();
                                            name9 = xmlPullParser.getName();
                                            namespace6 = xmlPullParser.getNamespace();
                                        } else if (name9.equalsIgnoreCase("pos")) {
                                            dhmuVar.a = new dhna();
                                            dhmuVar.a.d(xmlPullParser);
                                        }
                                        str5 = str4;
                                        str4 = str5;
                                        iNextTag7 = xmlPullParser.nextTag();
                                        name9 = xmlPullParser.getName();
                                        namespace6 = xmlPullParser.getNamespace();
                                    }
                                    dhmpVar.a().add(dhmuVar);
                                }
                                if (name2.equalsIgnoreCase("Ellipse")) {
                                    dhml dhmlVar = new dhml();
                                    dhmlVar.e = xmlPullParser.getAttributeValue("", "srsName");
                                    int iNextTag8 = xmlPullParser.nextTag();
                                    String name10 = xmlPullParser.getName();
                                    String namespace7 = xmlPullParser.getNamespace();
                                    while (true) {
                                        if ((iNextTag8 == 3) && name10.equalsIgnoreCase("Ellipse")) {
                                            break;
                                        }
                                        if ("http://www.opengis.net/gml".equals(namespace7)) {
                                            if (name10.equalsIgnoreCase("pos")) {
                                                dhmlVar.a = new dhna();
                                                dhmlVar.a.d(xmlPullParser);
                                            }
                                        } else if ("http://www.opengis.net/pidflo/1.0".equals(namespace7)) {
                                            if (name10.equalsIgnoreCase("semiMajorAxis")) {
                                                dhmlVar.b = new dhmo("semiMajorAxis");
                                                dhmlVar.b.b(xmlPullParser);
                                            }
                                            if (name10.equalsIgnoreCase("semiMinorAxis")) {
                                                dhmlVar.c = new dhmo("semiMinorAxis");
                                                dhmlVar.c.b(xmlPullParser);
                                            }
                                            if (name10.equalsIgnoreCase("orientation")) {
                                                dhmlVar.d = new dhmh("orientation");
                                                dhmlVar.d.b(xmlPullParser);
                                            }
                                        }
                                        iNextTag8 = xmlPullParser.nextTag();
                                        name10 = xmlPullParser.getName();
                                        namespace7 = xmlPullParser.getNamespace();
                                    }
                                    dhmpVar.a().add(dhmlVar);
                                }
                                if (name2.equalsIgnoreCase("ArcBand")) {
                                    dhmi dhmiVar = new dhmi();
                                    dhmiVar.b(xmlPullParser);
                                    dhmpVar.a().add(dhmiVar);
                                }
                                dhmpVar2 = dhmpVar;
                            } else {
                                str2 = str6;
                                str3 = name;
                                if (dhmpVar2.a == null) {
                                    dhmpVar2.a = new ArrayList();
                                }
                                dhmpVar2.a.add(((dhlq) dhmpVar2.b.b()).a(document, new QName(namespace2, name2), xmlPullParser));
                            }
                        }
                        iNextTag2 = xmlPullParser.nextTag();
                        name2 = xmlPullParser.getName();
                        namespace2 = xmlPullParser.getNamespace();
                        str7 = str;
                        name = str3;
                        str6 = str2;
                        i = 3;
                    }
                }
                String str8 = str6;
                String str9 = name;
                if (str9.equalsIgnoreCase("usage-rules")) {
                    dhmv dhmvVar = new dhmv();
                    dhmnVar = this;
                    dhmnVar.a = dhmvVar;
                    String namespace8 = xmlPullParser.getNamespace();
                    int iNextTag9 = xmlPullParser.nextTag();
                    String name11 = xmlPullParser.getName();
                    while (true) {
                        if ((iNextTag9 == 3) && name11.equals("usage-rules")) {
                            break;
                        }
                        String str10 = str8;
                        if (str10.equals(namespace8)) {
                            if (name11.equalsIgnoreCase("retransmission-allowed")) {
                                String strNextText = xmlPullParser.nextText();
                                if (strNextText.equals("yes") || strNextText.equalsIgnoreCase("true")) {
                                    dhmvVar.a = Boolean.TRUE;
                                }
                                if (strNextText.equalsIgnoreCase("no") || strNextText.equalsIgnoreCase("false")) {
                                    dhmvVar.a = Boolean.FALSE;
                                }
                            } else if (name11.equalsIgnoreCase("ruleset-reference")) {
                                dhmvVar.c = xmlPullParser.nextText();
                            } else if (name11.equalsIgnoreCase("retention-expiry")) {
                                dhmvVar.d = dhlf.b(xmlPullParser.nextText());
                            } else if (name11.equalsIgnoreCase("note-well")) {
                                dhmvVar.e = xmlPullParser.getAttributeValue("", "xml:lang");
                                dhmvVar.b = xmlPullParser.nextText();
                            }
                        }
                        str8 = str10;
                        iNextTag9 = xmlPullParser.nextTag();
                        namespace8 = xmlPullParser.getNamespace();
                        name11 = xmlPullParser.getName();
                    }
                } else {
                    dhmnVar = this;
                }
                if (str9.equalsIgnoreCase("method")) {
                    dhmnVar.c = xmlPullParser.nextText();
                }
                if (str9.equalsIgnoreCase("provided-by")) {
                    dhmt dhmtVar = (dhmt) dhmnVar.f.b();
                    dhmnVar.d = dhmtVar;
                    int iNextTag10 = xmlPullParser.nextTag();
                    String name12 = xmlPullParser.getName();
                    String namespace9 = xmlPullParser.getNamespace();
                    while (true) {
                        if (!((iNextTag10 == 3) & name12.equalsIgnoreCase("provided-by"))) {
                            dhmtVar.a().add(((dhlq) dhmtVar.a.b()).a(document, new QName(namespace9, name12), xmlPullParser));
                            iNextTag10 = xmlPullParser.nextTag();
                            name12 = xmlPullParser.getName();
                            namespace9 = xmlPullParser.getNamespace();
                        }
                    }
                }
            } else {
                dhmnVar = dhmnVar2;
            }
            iNextTag = xmlPullParser.nextTag();
            name = xmlPullParser.getName();
            dhmnVar2 = dhmnVar;
            namespace = xmlPullParser.getNamespace();
        }
    }

    @Override // defpackage.dhle
    public final void c(XmlSerializer xmlSerializer) throws IllegalStateException, DOMException, IOException, IllegalArgumentException {
        xmlSerializer.startTag("urn:ietf:params:xml:ns:pidf:geopriv10", "geopriv");
        dhmp dhmpVar = this.b;
        if (dhmpVar != null) {
            dhmpVar.c(xmlSerializer);
        }
        dhmv dhmvVar = this.a;
        if (dhmvVar != null) {
            dhmvVar.c(xmlSerializer);
        }
        if (this.c != null) {
            xmlSerializer.startTag("urn:ietf:params:xml:ns:pidf:geopriv10", "method");
            xmlSerializer.text(this.c);
            xmlSerializer.endTag("urn:ietf:params:xml:ns:pidf:geopriv10", "method");
        }
        dhmt dhmtVar = this.d;
        if (dhmtVar != null) {
            dhmtVar.c(xmlSerializer);
        }
        xmlSerializer.endTag("urn:ietf:params:xml:ns:pidf:geopriv10", "geopriv");
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof dhmn)) {
            return false;
        }
        dhmn dhmnVar = (dhmn) obj;
        return Objects.equals(this.b, dhmnVar.a()) && Objects.equals(this.a, dhmnVar.a) && Objects.equals(this.c, dhmnVar.c) && Objects.equals(this.d, dhmnVar.d);
    }

    public final int hashCode() {
        return Objects.hash(this.b, this.a, this.c, this.d);
    }
}
