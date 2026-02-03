package defpackage;

import android.util.Base64;
import com.google.android.rcs.client.messaging.data.ContentType;
import com.google.android.rcs.client.messaging.data.MessageReceipt;
import j$.time.Instant;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Locale;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;
import org.xmlpull.v1.XmlSerializer;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class efnk implements efoe {
    public static final ContentType a = efne.d;
    private final dflp b;

    public efnk(dflp dflpVar) {
        this.b = dflpVar;
    }

    private static String e(String str) {
        return str.toUpperCase(Locale.US).replace('-', '_');
    }

    @Override // defpackage.efoe
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final MessageReceipt a(efnd efndVar) throws XmlPullParserException, IOException, efoc {
        try {
            efia efiaVar = new efia();
            dflp dflpVar = this.b;
            efiaVar.a = dflpVar;
            XmlPullParserFactory xmlPullParserFactoryNewInstance = XmlPullParserFactory.newInstance();
            xmlPullParserFactoryNewInstance.setNamespaceAware(true);
            XmlPullParser xmlPullParserNewPullParser = xmlPullParserFactoryNewInstance.newPullParser();
            xmlPullParserNewPullParser.setInput(efndVar.b().m(), StandardCharsets.UTF_8.name());
            efod.b(xmlPullParserNewPullParser);
            while (efod.b(xmlPullParserNewPullParser) == 2) {
                String name = xmlPullParserNewPullParser.getName();
                if ("message-id".equals(name)) {
                    efiaVar.i(efod.d(xmlPullParserNewPullParser));
                } else if ("datetime".equals(name)) {
                    efiaVar.k(Instant.ofEpochMilli(dhie.c(efod.d(xmlPullParserNewPullParser)).a));
                } else if ("delivery-notification".equals(name)) {
                    efiaVar.l(efkk.DELIVERY);
                    efod.b(xmlPullParserNewPullParser);
                    efod.b(xmlPullParserNewPullParser);
                    if (dflpVar.a()) {
                        String name2 = xmlPullParserNewPullParser.getName();
                        efiaVar.j(name2);
                        if (name2.equals("failed")) {
                            efod.b(xmlPullParserNewPullParser);
                            if (xmlPullParserNewPullParser.getName().equals("mls-server-failure-reason")) {
                                efod.b(xmlPullParserNewPullParser);
                                efiaVar.f(efkj.a(e(xmlPullParserNewPullParser.getName())));
                                efod.b(xmlPullParserNewPullParser);
                                efod.b(xmlPullParserNewPullParser);
                                efod.b(xmlPullParserNewPullParser);
                                efod.b(xmlPullParserNewPullParser);
                                efod.b(xmlPullParserNewPullParser);
                            } else if (xmlPullParserNewPullParser.getName().equals("mls-client-failure-reason")) {
                                efod.b(xmlPullParserNewPullParser);
                                efiaVar.e(efki.a(e(xmlPullParserNewPullParser.getName())));
                                efod.b(xmlPullParserNewPullParser);
                                efod.b(xmlPullParserNewPullParser);
                                efod.b(xmlPullParserNewPullParser);
                                efod.b(xmlPullParserNewPullParser);
                                efod.b(xmlPullParserNewPullParser);
                            } else {
                                efod.b(xmlPullParserNewPullParser);
                                efod.b(xmlPullParserNewPullParser);
                            }
                        } else {
                            efod.b(xmlPullParserNewPullParser);
                            efod.b(xmlPullParserNewPullParser);
                            efod.b(xmlPullParserNewPullParser);
                        }
                    } else {
                        efiaVar.j(xmlPullParserNewPullParser.getName());
                        efod.b(xmlPullParserNewPullParser);
                        efod.b(xmlPullParserNewPullParser);
                        efod.b(xmlPullParserNewPullParser);
                    }
                } else if ("display-notification".equals(name)) {
                    efiaVar.l(efkk.DISPLAY);
                    efod.b(xmlPullParserNewPullParser);
                    efod.b(xmlPullParserNewPullParser);
                    efiaVar.j(xmlPullParserNewPullParser.getName());
                    efod.b(xmlPullParserNewPullParser);
                    efod.b(xmlPullParserNewPullParser);
                    efod.b(xmlPullParserNewPullParser);
                } else if ("interworking-notification".equals(name)) {
                    efiaVar.l(efkk.INTERWORKING);
                    efod.b(xmlPullParserNewPullParser);
                    efod.b(xmlPullParserNewPullParser);
                    efiaVar.j(xmlPullParserNewPullParser.getName());
                    efod.b(xmlPullParserNewPullParser);
                    efod.b(xmlPullParserNewPullParser);
                    efod.b(xmlPullParserNewPullParser);
                } else if ("processing-notification".equals(name)) {
                    efiaVar.l(efkk.PROCESSING);
                    efod.b(xmlPullParserNewPullParser);
                    efod.b(xmlPullParserNewPullParser);
                    efiaVar.j(xmlPullParserNewPullParser.getName());
                    efod.b(xmlPullParserNewPullParser);
                    efod.b(xmlPullParserNewPullParser);
                    efod.b(xmlPullParserNewPullParser);
                } else if ("google".equals(name)) {
                    efod.b(xmlPullParserNewPullParser);
                    byte[] bArrDecode = Base64.decode(efod.d(xmlPullParserNewPullParser), 2);
                    if (bArrDecode == null) {
                        throw new efoc("Encounter a null encrypted data");
                    }
                    efiaVar.g(evqs.x(bArrDecode));
                    efod.b(xmlPullParserNewPullParser);
                } else {
                    dhja.c("Skipping unknown elements with name=%s", name);
                    String namespace = xmlPullParserNewPullParser.getNamespace();
                    xmlPullParserNewPullParser.require(2, namespace, name);
                    int i = 1;
                    while (true) {
                        xmlPullParserNewPullParser.next();
                        int eventType = xmlPullParserNewPullParser.getEventType();
                        if (eventType == 2) {
                            i++;
                        } else if (eventType == 3) {
                            i--;
                            ejwl.b(i >= 0, "Encounter more END_TAG than START_TAG while parsing unknown elements");
                        }
                        if (xmlPullParserNewPullParser.getEventType() == 3 && xmlPullParserNewPullParser.getName().equals(name) && i == 0) {
                            break;
                        }
                    }
                    xmlPullParserNewPullParser.require(3, namespace, name);
                }
            }
            return efiaVar.m();
        } catch (IOException | IllegalArgumentException | IllegalStateException | XmlPullParserException e) {
            throw new efoc("Error: ".concat(String.valueOf(e.getMessage())), e);
        }
    }

    @Override // defpackage.efoe
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final efnd b(MessageReceipt messageReceipt) throws XmlPullParserException, IllegalStateException, IOException, efoc, IllegalArgumentException {
        boolean zIsPresent;
        boolean zIsPresent2;
        ejwl.a(messageReceipt.a() != efkk.UNKNOWN);
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            XmlSerializer xmlSerializerNewSerializer = XmlPullParserFactory.newInstance().newSerializer();
            xmlSerializerNewSerializer.setOutput(byteArrayOutputStream, StandardCharsets.UTF_8.name());
            xmlSerializerNewSerializer.setPrefix("", "urn:ietf:params:xml:ns:imdn");
            xmlSerializerNewSerializer.setPrefix("cpm", "urn:oma:xml:cpm:imdn-extensions:1.0");
            boolean z = (efkk.DELIVERY.equals(messageReceipt.a()) || (((Boolean) dfok.a().a.a.a()).booleanValue() && efkk.DISPLAY.equals(messageReceipt.a()))) && messageReceipt.e().isPresent();
            if (z) {
                xmlSerializerNewSerializer.setPrefix("enc", "urn:google:am-imdn-xml-encryption");
            }
            xmlSerializerNewSerializer.startDocument(StandardCharsets.UTF_8.name(), null);
            xmlSerializerNewSerializer.startTag("urn:ietf:params:xml:ns:imdn", "imdn");
            efod.f(xmlSerializerNewSerializer, "urn:ietf:params:xml:ns:imdn", "message-id", messageReceipt.f());
            efod.f(xmlSerializerNewSerializer, "urn:ietf:params:xml:ns:imdn", "datetime", messageReceipt.b().toString());
            if (this.b.a() && !z && messageReceipt.h()) {
                zIsPresent = messageReceipt.d().isPresent();
                zIsPresent2 = messageReceipt.c().isPresent();
            } else {
                zIsPresent = false;
                zIsPresent2 = false;
            }
            int iOrdinal = messageReceipt.a().ordinal();
            boolean z2 = zIsPresent;
            boolean z3 = z;
            if (iOrdinal == 1) {
                xmlSerializerNewSerializer.startTag("urn:ietf:params:xml:ns:imdn", "delivery-notification");
                xmlSerializerNewSerializer.startTag("urn:ietf:params:xml:ns:imdn", "status");
                xmlSerializerNewSerializer.startTag("urn:ietf:params:xml:ns:imdn", messageReceipt.g());
                if (z2) {
                    xmlSerializerNewSerializer.startTag("urn:ietf:params:xml:ns:imdn", "mls-server-failure-reason");
                    xmlSerializerNewSerializer.startTag("urn:ietf:params:xml:ns:imdn", ((efkj) messageReceipt.d().get()).l);
                    xmlSerializerNewSerializer.endTag("urn:ietf:params:xml:ns:imdn", ((efkj) messageReceipt.d().get()).l);
                    xmlSerializerNewSerializer.endTag("urn:ietf:params:xml:ns:imdn", "mls-server-failure-reason");
                } else if (zIsPresent2) {
                    xmlSerializerNewSerializer.startTag("urn:ietf:params:xml:ns:imdn", "mls-client-failure-reason");
                    xmlSerializerNewSerializer.startTag("urn:ietf:params:xml:ns:imdn", ((efki) messageReceipt.c().get()).f);
                    xmlSerializerNewSerializer.endTag("urn:ietf:params:xml:ns:imdn", ((efki) messageReceipt.c().get()).f);
                    xmlSerializerNewSerializer.endTag("urn:ietf:params:xml:ns:imdn", "mls-client-failure-reason");
                }
                xmlSerializerNewSerializer.endTag("urn:ietf:params:xml:ns:imdn", messageReceipt.g());
                xmlSerializerNewSerializer.endTag("urn:ietf:params:xml:ns:imdn", "status");
                xmlSerializerNewSerializer.endTag("urn:ietf:params:xml:ns:imdn", "delivery-notification");
                if (z3) {
                    xmlSerializerNewSerializer.startTag("urn:google:am-imdn-xml-encryption", "google");
                    xmlSerializerNewSerializer.startTag("urn:google:am-imdn-xml-encryption", "encrypted-data");
                    xmlSerializerNewSerializer.text(Base64.encodeToString(((evqs) messageReceipt.e().get()).I(), 2));
                    xmlSerializerNewSerializer.endTag("urn:google:am-imdn-xml-encryption", "encrypted-data");
                    xmlSerializerNewSerializer.endTag("urn:google:am-imdn-xml-encryption", "google");
                }
            } else if (iOrdinal == 2) {
                xmlSerializerNewSerializer.startTag("urn:ietf:params:xml:ns:imdn", "display-notification");
                xmlSerializerNewSerializer.startTag("urn:ietf:params:xml:ns:imdn", "status");
                xmlSerializerNewSerializer.startTag("urn:ietf:params:xml:ns:imdn", messageReceipt.g());
                xmlSerializerNewSerializer.endTag("urn:ietf:params:xml:ns:imdn", messageReceipt.g());
                xmlSerializerNewSerializer.endTag("urn:ietf:params:xml:ns:imdn", "status");
                xmlSerializerNewSerializer.endTag("urn:ietf:params:xml:ns:imdn", "display-notification");
                if (z3) {
                    xmlSerializerNewSerializer.startTag("urn:google:am-imdn-xml-encryption", "google");
                    xmlSerializerNewSerializer.startTag("urn:google:am-imdn-xml-encryption", "encrypted-data");
                    xmlSerializerNewSerializer.text(Base64.encodeToString(((evqs) messageReceipt.e().get()).I(), 2));
                    xmlSerializerNewSerializer.endTag("urn:google:am-imdn-xml-encryption", "encrypted-data");
                    xmlSerializerNewSerializer.endTag("urn:google:am-imdn-xml-encryption", "google");
                }
            } else if (iOrdinal == 3) {
                xmlSerializerNewSerializer.startTag("urn:ietf:params:xml:ns:imdn", "processing-notification");
                xmlSerializerNewSerializer.startTag("urn:ietf:params:xml:ns:imdn", "status");
                xmlSerializerNewSerializer.startTag("urn:ietf:params:xml:ns:imdn", messageReceipt.g());
                xmlSerializerNewSerializer.endTag("urn:ietf:params:xml:ns:imdn", messageReceipt.g());
                xmlSerializerNewSerializer.endTag("urn:ietf:params:xml:ns:imdn", "status");
                xmlSerializerNewSerializer.endTag("urn:ietf:params:xml:ns:imdn", "processing-notification");
            } else {
                if (iOrdinal != 4) {
                    throw new IllegalArgumentException("Receipt type: " + messageReceipt.a().toString() + " not supported.");
                }
                xmlSerializerNewSerializer.startTag("urn:ietf:params:xml:ns:imdn", "interworking-notification");
                xmlSerializerNewSerializer.startTag("urn:ietf:params:xml:ns:imdn", "status");
                xmlSerializerNewSerializer.startTag("urn:oma:xml:cpm:imdn-extensions:1.0", messageReceipt.g());
                xmlSerializerNewSerializer.endTag("urn:oma:xml:cpm:imdn-extensions:1.0", messageReceipt.g());
                xmlSerializerNewSerializer.endTag("urn:ietf:params:xml:ns:imdn", "status");
                xmlSerializerNewSerializer.endTag("urn:ietf:params:xml:ns:imdn", "interworking-notification");
            }
            xmlSerializerNewSerializer.endTag("urn:ietf:params:xml:ns:imdn", "imdn");
            xmlSerializerNewSerializer.endDocument();
            xmlSerializerNewSerializer.flush();
            efmx efmxVar = new efmx();
            efmxVar.b(evqs.x(byteArrayOutputStream.toByteArray()));
            efmxVar.c(a);
            return efmxVar.a();
        } catch (IOException | XmlPullParserException e) {
            throw new efoc("Error: ".concat(String.valueOf(e.getMessage())), e);
        }
    }
}
