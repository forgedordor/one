package com.google.android.ims.filetransfer.http.message;

import android.util.Base64;
import com.google.android.ims.filetransfer.http.message.FileInfo;
import defpackage.dhiz;
import defpackage.dhja;
import defpackage.ejuf;
import defpackage.ejyb;
import defpackage.evqs;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.Serializable;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;
import org.xmlpull.v1.XmlSerializer;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class HttpFileTransferPushMessage implements Serializable {
    private static final long serialVersionUID = -4553689766953957948L;
    public evqs mEncryptedData;
    public String mFileId;
    public FileInfo mFileInfo;
    public String mRemoteInstance;
    public String mSender;
    public FileInfo mThumbnailInfo;

    private HttpFileTransferPushMessage() {
    }

    public static HttpFileTransferPushMessage a(byte[] bArr) throws XmlPullParserException, IOException {
        try {
            XmlPullParserFactory xmlPullParserFactoryNewInstance = XmlPullParserFactory.newInstance();
            xmlPullParserFactoryNewInstance.setNamespaceAware(true);
            XmlPullParser xmlPullParserNewPullParser = xmlPullParserFactoryNewInstance.newPullParser();
            xmlPullParserNewPullParser.setInput(new ByteArrayInputStream(bArr), "utf-8");
            xmlPullParserNewPullParser.nextTag();
            if (!xmlPullParserNewPullParser.getName().equalsIgnoreCase("file")) {
                throw new IOException("Malformed XML or not a push message for HTTP file transfer. First tag is " + xmlPullParserNewPullParser.getName());
            }
            HttpFileTransferPushMessage httpFileTransferPushMessage = new HttpFileTransferPushMessage();
            while (xmlPullParserNewPullParser.getEventType() != 1) {
                xmlPullParserNewPullParser.next();
                if (FileInfo.e(xmlPullParserNewPullParser)) {
                    FileInfo fileInfoA = FileInfo.a(xmlPullParserNewPullParser);
                    if (fileInfoA.mType == FileInfo.Type.THUMBNAIL) {
                        httpFileTransferPushMessage.mThumbnailInfo = fileInfoA;
                    } else if (fileInfoA.mType == FileInfo.Type.FILE) {
                        httpFileTransferPushMessage.mFileInfo = fileInfoA;
                    }
                } else if (xmlPullParserNewPullParser.getEventType() == 2 && ejuf.e("encrypted-data", xmlPullParserNewPullParser.getName())) {
                    httpFileTransferPushMessage.mEncryptedData = evqs.x(Base64.decode(xmlPullParserNewPullParser.nextText(), 0));
                }
            }
            if (httpFileTransferPushMessage.mFileInfo != null) {
                return httpFileTransferPushMessage;
            }
            throw new IOException("Invalid HTTP file transfer push message. Does not contain file information!");
        } catch (RuntimeException e) {
            dhja.g("RuntimeException: %s", e.getMessage());
            throw new IOException("Unable to parse HTTP file transfer push message", e);
        } catch (XmlPullParserException e2) {
            dhja.g("XmlPullParserException: %s", e2.getMessage());
            throw new IOException("Unable to parse HTTP file transfer push message", e2);
        }
    }

    public final boolean b() {
        return this.mThumbnailInfo != null;
    }

    public final byte[] c() throws XmlPullParserException, IllegalStateException, IOException, IllegalArgumentException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            XmlSerializer xmlSerializerNewSerializer = XmlPullParserFactory.newInstance().newSerializer();
            xmlSerializerNewSerializer.setOutput(byteArrayOutputStream, "utf-8");
            xmlSerializerNewSerializer.setPrefix("", "urn:gsma:params:xml:ns:rcs:rcs:fthttp");
            if (this.mFileInfo.d()) {
                xmlSerializerNewSerializer.setPrefix("am", "urn:gsma:params:xml:ns:rcs:rcs:rram");
            }
            boolean z = this.mEncryptedData != null;
            if (z) {
                xmlSerializerNewSerializer.setPrefix("enc", "urn:google:am-ftpush-xml-encryption");
            }
            xmlSerializerNewSerializer.startDocument("utf-8", false);
            xmlSerializerNewSerializer.startTag("urn:gsma:params:xml:ns:rcs:rcs:fthttp", "file");
            FileInfo fileInfo = this.mThumbnailInfo;
            if (fileInfo != null) {
                fileInfo.b(xmlSerializerNewSerializer);
            }
            this.mFileInfo.b(xmlSerializerNewSerializer);
            if (z) {
                xmlSerializerNewSerializer.startTag("urn:google:am-ftpush-xml-encryption", "encrypted-data");
                ejyb.e(this.mEncryptedData);
                xmlSerializerNewSerializer.text(Base64.encodeToString(this.mEncryptedData.I(), 0));
                xmlSerializerNewSerializer.endTag("urn:google:am-ftpush-xml-encryption", "encrypted-data");
            }
            xmlSerializerNewSerializer.endTag("urn:gsma:params:xml:ns:rcs:rcs:fthttp", "file");
            xmlSerializerNewSerializer.endDocument();
            xmlSerializerNewSerializer.flush();
            return byteArrayOutputStream.toByteArray();
        } catch (IllegalArgumentException | XmlPullParserException e) {
            throw new IOException(e);
        }
    }

    public final String toString() {
        String strC = dhiz.USER_ID.c(this.mSender);
        String str = this.mRemoteInstance;
        String str2 = this.mFileId;
        dhiz dhizVar = dhiz.GENERIC;
        String strC2 = dhizVar.c(this.mThumbnailInfo);
        String strC3 = dhizVar.c(this.mFileInfo);
        evqs evqsVar = this.mEncryptedData;
        StringBuilder sb = new StringBuilder("Sender: ");
        sb.append(strC);
        sb.append("\nRemote Instance: ");
        sb.append(str);
        sb.append("\nFile ID: ");
        sb.append(str2);
        sb.append("\nThumbnail: ");
        sb.append(strC2);
        sb.append("\nFile: ");
        sb.append(strC3);
        sb.append("\n");
        sb.append(evqsVar == null ? "No encrypted data" : "Has encrypted data");
        return sb.toString();
    }
}
