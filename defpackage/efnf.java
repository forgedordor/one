package defpackage;

import android.util.Base64;
import com.google.android.ims.rcsservice.businessinfo.BusinessInfoDatabaseConstants;
import com.google.android.ims.rcsservice.chatsession.message.groupmanagement.GroupManagementRequest;
import com.google.android.rcs.client.messaging.data.ContentType;
import com.google.android.rcs.client.messaging.data.FileInformation;
import com.google.android.rcs.client.messaging.data.FileTransferInformation;
import j$.time.DateTimeException;
import j$.time.Duration;
import j$.util.Optional;
import java.io.IOException;
import java.io.InputStream;
import java.io.StringWriter;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;
import org.xmlpull.v1.XmlSerializer;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class efnf implements efoe {
    public static final ContentType a = efne.b;

    public static final FileTransferInformation c(efnd efndVar) throws efog {
        ContentType contentType = a;
        if (contentType.g(efndVar.a())) {
            return f(efndVar);
        }
        throw new efog(efndVar.a(), "Supported type for this serializer is: ".concat(String.valueOf(String.valueOf(contentType))));
    }

    public static final efnd d(FileTransferInformation fileTransferInformation) throws IOException, efoc {
        String strG = g(fileTransferInformation);
        efmx efmxVar = new efmx();
        efmxVar.c(a);
        efmxVar.b(evqs.A(strG));
        return efmxVar.a();
    }

    private static FileInformation e(XmlPullParser xmlPullParser, efis efisVar) throws efoc {
        int iA = efod.a(xmlPullParser);
        String name = xmlPullParser.getName();
        efhj efhjVar = new efhj();
        efhjVar.d(efisVar);
        String str = null;
        String name2 = name;
        int iA2 = iA;
        String attributeValue = null;
        while (true) {
            if (iA2 == 3) {
                if ("file-info".equals(name2)) {
                    return efhjVar.i();
                }
                iA2 = 3;
            }
            if (iA2 == 1) {
                throw new efng("Incomplete XML for:".concat(String.valueOf(FileInformation.class.getName())));
            }
            if (iA2 == 2) {
                if ("file-size".equals(name2)) {
                    efhjVar.f(Integer.parseInt(efod.d(xmlPullParser)));
                }
                if (str != null) {
                    efod.g("url", str);
                    efhjVar.g(str);
                }
                if ("content-type".equals(name2)) {
                    String strD = efod.d(xmlPullParser);
                    efod.g("content-type", strD);
                    try {
                        efhjVar.c(ContentType.e(strD));
                    } catch (IllegalArgumentException e) {
                        throw new efoc("Invalid content type for FileTransferInformation", e);
                    }
                }
                if ("file-name".equals(name2)) {
                    efhjVar.e(efod.d(xmlPullParser));
                }
                if (attributeValue != null) {
                    efod.g("until", attributeValue);
                    efhjVar.h(efod.c("until", attributeValue));
                }
            }
            iA2 = efod.a(xmlPullParser);
            name2 = xmlPullParser.getName();
            String attributeValue2 = xmlPullParser.getAttributeValue("", "url");
            attributeValue = xmlPullParser.getAttributeValue("", "until");
            str = attributeValue2;
        }
    }

    private static FileTransferInformation f(efnd efndVar) throws IOException, efoc {
        try {
            InputStream inputStreamM = efndVar.b().m();
            try {
                XmlPullParser xmlPullParserE = efod.e();
                xmlPullParserE.setFeature("http://xmlpull.org/v1/doc/features.html#process-namespaces", true);
                xmlPullParserE.setInput(inputStreamM, "UTF-8");
                int iA = efod.a(xmlPullParserE);
                String name = xmlPullParserE.getName();
                if (!"file".equals(name)) {
                    throw new efng("Invalid start tag for XML:" + FileTransferInformation.class.getName());
                }
                efho efhoVar = new efho();
                while (true) {
                    if (iA == 3) {
                        if ("file".equals(name)) {
                            FileTransferInformation fileTransferInformationA = efhoVar.a();
                            inputStreamM.close();
                            return fileTransferInformationA;
                        }
                        iA = 3;
                    }
                    if (iA == 1) {
                        throw new efng("Incomplete XML for:" + FileTransferInformation.class.getName());
                    }
                    if (iA == 2) {
                        if ("file-info".equals(name)) {
                            String attributeValue = xmlPullParserE.getAttributeValue("", BusinessInfoDatabaseConstants.BusinessInfoPropertiesTableConstants.Columns.TYPE);
                            if ("thumbnail".equals(attributeValue)) {
                                efhoVar.e(e(xmlPullParserE, efis.THUMBNAIL));
                            } else if ("file".equals(attributeValue)) {
                                efhoVar.c(e(xmlPullParserE, efis.FILE));
                            }
                        } else if ("encrypted-data".equals(name)) {
                            String strD = efod.d(xmlPullParserE);
                            efod.g("encrypted-data", strD);
                            efhoVar.b(evqs.x(Base64.decode(strD, 0)));
                        } else if ("mls-file".equals(name)) {
                            String strD2 = efod.d(xmlPullParserE);
                            efod.g("mls-file", strD2);
                            efhoVar.d(evqs.x(Base64.decode(strD2, 0)));
                        }
                    }
                    iA = efod.a(xmlPullParserE);
                    name = xmlPullParserE.getName();
                }
            } catch (Throwable th) {
                try {
                    inputStreamM.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (DateTimeException | IOException | IllegalStateException | NumberFormatException | XmlPullParserException e) {
            throw new efoc("Error deserializing FileTransferInformation", e);
        }
    }

    private static String g(FileTransferInformation fileTransferInformation) throws IOException, efoc {
        try {
            StringWriter stringWriter = new StringWriter();
            try {
                XmlSerializer xmlSerializerNewSerializer = XmlPullParserFactory.newInstance().newSerializer();
                xmlSerializerNewSerializer.setOutput(stringWriter);
                xmlSerializerNewSerializer.setPrefix("", "urn:gsma:params:xml:ns:rcs:rcs:fthttp");
                boolean zIsPresent = fileTransferInformation.b().isPresent();
                if (zIsPresent) {
                    xmlSerializerNewSerializer.setPrefix("enc", "urn:google:am-ftpush-xml-encryption");
                }
                if (fileTransferInformation.a().e().isPresent()) {
                    xmlSerializerNewSerializer.setPrefix("am", "urn:gsma:params:xml:ns:rcs:rcs:rram");
                }
                xmlSerializerNewSerializer.startDocument("UTF-8", true);
                xmlSerializerNewSerializer.startTag("urn:gsma:params:xml:ns:rcs:rcs:fthttp", "file");
                Optional optionalD = fileTransferInformation.d();
                if (optionalD.isPresent()) {
                    h((FileInformation) optionalD.get(), xmlSerializerNewSerializer, "thumbnail");
                }
                h(fileTransferInformation.a(), xmlSerializerNewSerializer, "file");
                if (zIsPresent) {
                    efod.f(xmlSerializerNewSerializer, "urn:google:am-ftpush-xml-encryption", "encrypted-data", Base64.encodeToString(((evqs) fileTransferInformation.b().get()).I(), 2));
                }
                if (fileTransferInformation.c().isPresent()) {
                    efod.f(xmlSerializerNewSerializer, null, "mls-file", Base64.encodeToString(((evqs) fileTransferInformation.c().get()).I(), 2));
                }
                xmlSerializerNewSerializer.endTag("urn:gsma:params:xml:ns:rcs:rcs:fthttp", "file");
                xmlSerializerNewSerializer.endDocument();
                String string = stringWriter.toString();
                stringWriter.close();
                return string;
            } catch (Throwable th) {
                try {
                    stringWriter.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (IOException | XmlPullParserException e) {
            throw new efoc("Error serializing message.", e);
        }
    }

    private static void h(FileInformation fileInformation, XmlSerializer xmlSerializer, String str) throws IllegalStateException, IOException, IllegalArgumentException {
        boolean zIsPresent = fileInformation.e().isPresent();
        xmlSerializer.startTag(null, "file-info");
        xmlSerializer.attribute(null, BusinessInfoDatabaseConstants.BusinessInfoPropertiesTableConstants.Columns.TYPE, str);
        if (zIsPresent) {
            xmlSerializer.attribute(null, "file-disposition", "render");
        }
        efod.f(xmlSerializer, null, "file-size", String.valueOf(fileInformation.a()));
        Optional optionalH = fileInformation.h();
        if (optionalH.isPresent()) {
            efod.f(xmlSerializer, null, "file-name", (String) optionalH.get());
        }
        efod.f(xmlSerializer, null, "content-type", fileInformation.b().toString());
        if (zIsPresent) {
            efod.f(xmlSerializer, "urn:gsma:params:xml:ns:rcs:rcs:rram", "playing-length", Long.toString(((Duration) fileInformation.e().get()).toSeconds()));
        }
        xmlSerializer.startTag(null, GroupManagementRequest.DATA_TAG);
        xmlSerializer.attribute(null, "url", fileInformation.i());
        xmlSerializer.attribute(null, "until", fileInformation.d().toString());
        xmlSerializer.endTag(null, GroupManagementRequest.DATA_TAG);
        xmlSerializer.endTag(null, "file-info");
    }

    @Override // defpackage.efoe
    public final /* bridge */ /* synthetic */ eflb a(efnd efndVar) {
        return c(efndVar);
    }

    @Override // defpackage.efoe
    public final /* bridge */ /* synthetic */ efnd b(eflb eflbVar) {
        return d((FileTransferInformation) eflbVar);
    }
}
