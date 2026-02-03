package defpackage;

import com.google.android.ims.rcsservice.businessinfo.BusinessInfoDatabaseConstants;
import com.google.android.ims.rcsservice.chatsession.message.ConversationSuggestion;
import j$.util.Objects;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import javax.xml.namespace.QName;
import javax.xml.parsers.ParserConfigurationException;
import org.w3c.dom.Document;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dhnr {
    private final fcsu a;

    public dhnr(fcsu fcsuVar) {
        this.a = fcsuVar;
    }

    public final dhnq a(Reader reader) throws XmlPullParserException, IOException {
        Document documentC;
        XmlPullParser xmlPullParserNewPullParser;
        boolean z;
        String str;
        String str2;
        String str3;
        String str4;
        dhnu dhnuVar;
        String str5 = "name";
        String str6 = "urn:ietf:params:xml:ns:rlmi";
        try {
            documentC = dhlf.c();
            xmlPullParserNewPullParser = XmlPullParserFactory.newInstance().newPullParser();
            z = true;
            xmlPullParserNewPullParser.setFeature("http://xmlpull.org/v1/doc/features.html#process-namespaces", true);
            xmlPullParserNewPullParser.setInput(reader);
            xmlPullParserNewPullParser.nextTag();
        } catch (ParserConfigurationException | XmlPullParserException e) {
            e = e;
        }
        try {
            dhnq dhnqVar = (dhnq) this.a.b();
            String attributeValue = xmlPullParserNewPullParser.getAttributeValue("", ConversationSuggestion.SUGGESTION_PROPERTY_WEB_URI);
            if (Objects.isNull(attributeValue)) {
                throw new XmlPullParserException("RLMI document missing uri required element.");
            }
            dhnqVar.a = attributeValue;
            String attributeValue2 = xmlPullParserNewPullParser.getAttributeValue("", BusinessInfoDatabaseConstants.BusinessInfoMetadataTableConstants.Columns.VERSION);
            if (Objects.isNull(attributeValue2)) {
                throw new XmlPullParserException("RLMI document missing version required element.");
            }
            dhnqVar.b = Integer.parseInt(attributeValue2);
            String attributeValue3 = xmlPullParserNewPullParser.getAttributeValue("", "fullState");
            if (Objects.isNull(attributeValue3)) {
                throw new XmlPullParserException("RLMI document missing fullState required element.");
            }
            dhnqVar.c = Boolean.parseBoolean(attributeValue3);
            dhnqVar.d = xmlPullParserNewPullParser.getAttributeValue("", "cid");
            String name = xmlPullParserNewPullParser.getName();
            int iNextTag = xmlPullParserNewPullParser.nextTag();
            String namespace = xmlPullParserNewPullParser.getNamespace();
            String name2 = xmlPullParserNewPullParser.getName();
            while (true) {
                int i = 3;
                if ((iNextTag == 3 ? z : false) && name2.equals(name)) {
                    return dhnqVar;
                }
                if (str6.equals(namespace)) {
                    if (str5.equals(name2)) {
                        dhns dhnsVar = new dhns();
                        dhnsVar.a(xmlPullParserNewPullParser);
                        dhnqVar.a().add(dhnsVar);
                    } else if ("resource".equals(name2)) {
                        dhnt dhntVar = (dhnt) dhnqVar.e.b();
                        String attributeValue4 = xmlPullParserNewPullParser.getAttributeValue("", ConversationSuggestion.SUGGESTION_PROPERTY_WEB_URI);
                        if (attributeValue4 == null) {
                            throw new XmlPullParserException("Missing required attribute [uri]", xmlPullParserNewPullParser, new Exception("Missing required attribute"));
                        }
                        dhntVar.a = attributeValue4;
                        String name3 = xmlPullParserNewPullParser.getName();
                        int iNextTag2 = xmlPullParserNewPullParser.nextTag();
                        String namespace2 = xmlPullParserNewPullParser.getNamespace();
                        String name4 = xmlPullParserNewPullParser.getName();
                        while (true) {
                            if ((iNextTag2 == i) && name4.equals(name3)) {
                                str = str5;
                                str2 = str6;
                                dhnqVar.a().add(dhntVar);
                                break;
                            }
                            if (str6.equals(namespace2)) {
                                if (str5.equals(name4)) {
                                    dhns dhnsVar2 = new dhns();
                                    dhnsVar2.a(xmlPullParserNewPullParser);
                                    dhntVar.b.add(dhnsVar2);
                                } else if ("instance".equals(name4)) {
                                    dhnp dhnpVar = (dhnp) dhntVar.c.b();
                                    String attributeValue5 = xmlPullParserNewPullParser.getAttributeValue("", "id");
                                    if (Objects.isNull(attributeValue5)) {
                                        throw new XmlPullParserException("RLMI document missing 'id' required element.");
                                    }
                                    dhnpVar.a = attributeValue5;
                                    String attributeValue6 = xmlPullParserNewPullParser.getAttributeValue("", "state");
                                    if (attributeValue6 != null) {
                                        dhnu[] dhnuVarArrValues = dhnu.values();
                                        int length = dhnuVarArrValues.length;
                                        str3 = str5;
                                        int i2 = 0;
                                        while (true) {
                                            if (i2 >= length) {
                                                str4 = str6;
                                                dhnuVar = null;
                                                break;
                                            }
                                            int i3 = i2;
                                            dhnuVar = dhnuVarArrValues[i3];
                                            str4 = str6;
                                            if (dhnuVar.d.equalsIgnoreCase(attributeValue6)) {
                                                break;
                                            }
                                            i2 = i3 + 1;
                                            str6 = str4;
                                        }
                                        if (Objects.isNull(dhnuVar)) {
                                            throw new XmlPullParserException("RLMI document was invalid value for 'state'element: ".concat(attributeValue6));
                                        }
                                        dhnpVar.b = dhnuVar;
                                    } else {
                                        str3 = str5;
                                        str4 = str6;
                                    }
                                    dhnpVar.c = xmlPullParserNewPullParser.getAttributeValue("", "reason");
                                    dhnpVar.d = xmlPullParserNewPullParser.getAttributeValue("", "cid");
                                    String name5 = xmlPullParserNewPullParser.getName();
                                    int iNextTag3 = xmlPullParserNewPullParser.nextTag();
                                    String namespace3 = xmlPullParserNewPullParser.getNamespace();
                                    String name6 = xmlPullParserNewPullParser.getName();
                                    while (true) {
                                        if ((iNextTag3 == 3) && name6.equals(name5)) {
                                            break;
                                        }
                                        if (dhnpVar.e == null) {
                                            dhnpVar.e = new ArrayList();
                                        }
                                        dhnpVar.e.add(((dhlq) dhnpVar.f.b()).a(documentC, new QName(namespace3, name6), xmlPullParserNewPullParser));
                                        iNextTag3 = xmlPullParserNewPullParser.nextTag();
                                        namespace3 = xmlPullParserNewPullParser.getNamespace();
                                        name6 = xmlPullParserNewPullParser.getName();
                                        name5 = name5;
                                    }
                                    dhntVar.b.add(dhnpVar);
                                }
                                str3 = str5;
                                str4 = str6;
                            } else {
                                str3 = str5;
                                str4 = str6;
                            }
                            iNextTag2 = xmlPullParserNewPullParser.nextTag();
                            namespace2 = xmlPullParserNewPullParser.getNamespace();
                            name4 = xmlPullParserNewPullParser.getName();
                            str5 = str3;
                            str6 = str4;
                            i = 3;
                        }
                    }
                    str = str5;
                    str2 = str6;
                } else {
                    str = str5;
                    str2 = str6;
                }
                iNextTag = xmlPullParserNewPullParser.nextTag();
                namespace = xmlPullParserNewPullParser.getNamespace();
                name2 = xmlPullParserNewPullParser.getName();
                str5 = str;
                str6 = str2;
                z = true;
            }
        } catch (ParserConfigurationException e2) {
            e = e2;
            throw new IOException(e.getMessage());
        } catch (XmlPullParserException e3) {
            e = e3;
            throw new IOException(e.getMessage());
        }
    }
}
