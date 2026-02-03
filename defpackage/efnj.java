package defpackage;

import com.google.android.ims.rcsservice.chatsession.message.ConversationSuggestion;
import com.google.android.rcs.client.messaging.data.ContentType;
import com.google.android.rcs.client.messaging.data.LocationInformation;
import j$.time.Instant;
import java.io.IOException;
import java.io.InputStream;
import java.io.StringWriter;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;
import org.xmlpull.v1.XmlSerializer;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class efnj implements efoe {
    public static final ContentType a = efne.c;

    /* JADX WARN: Code restructure failed: missing block: B:169:0x02c9, code lost:
    
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:182:0x01b4, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.google.android.rcs.client.messaging.data.LocationInformation c(java.io.InputStream r22) throws org.xmlpull.v1.XmlPullParserException, defpackage.efoc {
        /*
            Method dump skipped, instructions count: 768
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.efnj.c(java.io.InputStream):com.google.android.rcs.client.messaging.data.LocationInformation");
    }

    private static String d(LocationInformation locationInformation) {
        return locationInformation.a() + " " + locationInformation.b();
    }

    private static String e(LocationInformation locationInformation) throws Throwable {
        StringWriter stringWriter;
        try {
            StringWriter stringWriter2 = new StringWriter();
            try {
                XmlSerializer xmlSerializerNewSerializer = XmlPullParserFactory.newInstance().newSerializer();
                xmlSerializerNewSerializer.setOutput(stringWriter2);
                xmlSerializerNewSerializer.setPrefix("", "urn:gsma:params:xml:ns:rcs:rcs:geolocation");
                stringWriter = stringWriter2;
                try {
                    xmlSerializerNewSerializer.setPrefix("rpid", "urn:ietf:params:xml:ns:pidf:rpid");
                    xmlSerializerNewSerializer.setPrefix("gml", "http://www.opengis.net/gml");
                    xmlSerializerNewSerializer.setPrefix("gp", "urn:ietf:params:xml:ns:pidf:geopriv10");
                    xmlSerializerNewSerializer.setPrefix("gs", "http://www.opengis.net/pidflo/1.0");
                    xmlSerializerNewSerializer.startDocument("UTF-8", true);
                    xmlSerializerNewSerializer.startTag("urn:gsma:params:xml:ns:rcs:rcs:geolocation", "rcsenvelope");
                    if (locationInformation.c().isPresent()) {
                        xmlSerializerNewSerializer.attribute("", "entity", (String) locationInformation.c().get());
                    }
                    xmlSerializerNewSerializer.startTag("", "rcspushlocation");
                    xmlSerializerNewSerializer.attribute("", "id", locationInformation.i());
                    if (locationInformation.e().isPresent()) {
                        xmlSerializerNewSerializer.attribute("", ConversationSuggestion.SUGGESTION_PROPERTY_MAP_LABEL, (String) locationInformation.e().get());
                    }
                    xmlSerializerNewSerializer.startTag("urn:ietf:params:xml:ns:pidf:geopriv10", "geopriv");
                    xmlSerializerNewSerializer.startTag("urn:ietf:params:xml:ns:pidf:geopriv10", "location-info");
                    if (locationInformation.g().isPresent()) {
                        xmlSerializerNewSerializer.startTag("http://www.opengis.net/pidflo/1.0", "Circle");
                        xmlSerializerNewSerializer.attribute("", "srsName", "urn:ogc:def:crs:EPSG::4326");
                        efod.f(xmlSerializerNewSerializer, "http://www.opengis.net/gml", "pos", d(locationInformation));
                        xmlSerializerNewSerializer.startTag("http://www.opengis.net/pidflo/1.0", "radius");
                        xmlSerializerNewSerializer.attribute("", "uom", "urn:ogc:def:uom:EPSG::9001");
                        xmlSerializerNewSerializer.text(locationInformation.g().get().toString());
                        xmlSerializerNewSerializer.endTag("http://www.opengis.net/pidflo/1.0", "radius");
                        xmlSerializerNewSerializer.endTag("http://www.opengis.net/pidflo/1.0", "Circle");
                    } else {
                        xmlSerializerNewSerializer.startTag("http://www.opengis.net/gml", "Point");
                        xmlSerializerNewSerializer.attribute("", "srsName", "urn:ogc:def:crs:EPSG::4326");
                        efod.f(xmlSerializerNewSerializer, "http://www.opengis.net/gml", "pos", d(locationInformation));
                        xmlSerializerNewSerializer.endTag("http://www.opengis.net/gml", "Point");
                    }
                    xmlSerializerNewSerializer.endTag("urn:ietf:params:xml:ns:pidf:geopriv10", "location-info");
                    xmlSerializerNewSerializer.startTag("urn:ietf:params:xml:ns:pidf:geopriv10", "usage-rules");
                    if (locationInformation.d().isPresent()) {
                        efod.f(xmlSerializerNewSerializer, "urn:ietf:params:xml:ns:pidf:geopriv10", "retention-expiry", ((Instant) locationInformation.d().get()).toString());
                    }
                    xmlSerializerNewSerializer.endTag("urn:ietf:params:xml:ns:pidf:geopriv10", "usage-rules");
                    xmlSerializerNewSerializer.endTag("urn:ietf:params:xml:ns:pidf:geopriv10", "geopriv");
                    if (locationInformation.h().isPresent()) {
                        efod.f(xmlSerializerNewSerializer, "", "timestamp", ((Instant) locationInformation.h().get()).toString());
                    }
                    xmlSerializerNewSerializer.endTag("", "rcspushlocation");
                    xmlSerializerNewSerializer.endTag("urn:gsma:params:xml:ns:rcs:rcs:geolocation", "rcsenvelope");
                    xmlSerializerNewSerializer.endDocument();
                    String string = stringWriter.toString();
                    stringWriter.close();
                    return string;
                } catch (Throwable th) {
                    th = th;
                    Throwable th2 = th;
                    try {
                        stringWriter.close();
                        throw th2;
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                        throw th2;
                    }
                }
            } catch (Throwable th4) {
                th = th4;
                stringWriter = stringWriter2;
            }
        } catch (IOException | XmlPullParserException e) {
            throw new efoc("Error serializing LocationInformation", e);
        }
    }

    private static void f(efjp efjpVar, String str) throws efnh {
        try {
            String[] strArrSplit = str.contains(",") ? str.split(",") : str.split("\\s");
            if (strArrSplit.length >= 2) {
                efjpVar.f(Double.parseDouble(strArrSplit[0]));
                efjpVar.g(Double.parseDouble(strArrSplit[1]));
            }
        } catch (NumberFormatException e) {
            throw new efnh("pos", e);
        }
    }

    @Override // defpackage.efoe
    public final /* bridge */ /* synthetic */ eflb a(efnd efndVar) throws IOException, efoc {
        ContentType contentType = a;
        if (!contentType.g(efndVar.a())) {
            throw new efog(efndVar.a(), "Supported type for this serializer is: ".concat(String.valueOf(String.valueOf(contentType))));
        }
        try {
            InputStream inputStreamM = efndVar.b().m();
            try {
                LocationInformation locationInformationC = c(inputStreamM);
                inputStreamM.close();
                return locationInformationC;
            } finally {
            }
        } catch (IOException e) {
            throw new efoc("Error deserializing LocationInformation", e);
        }
    }

    @Override // defpackage.efoe
    public final /* bridge */ /* synthetic */ efnd b(eflb eflbVar) throws Throwable {
        String strE = e((LocationInformation) eflbVar);
        efmx efmxVar = new efmx();
        efmxVar.c(a);
        efmxVar.b(evqs.A(strE));
        return efmxVar.a();
    }
}
