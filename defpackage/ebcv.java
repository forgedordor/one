package defpackage;

import android.os.SystemClock;
import android.text.TextUtils;
import j$.util.Objects;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Arrays;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;
import org.xmlpull.v1.XmlSerializer;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ebcv extends ebcp {
    private String d;
    private ebcu e;
    private String f;

    public ebcv() {
        super("message/imdn+xml", "utf-8");
        o("imdn", "urn:ietf:params:imdn");
        n("urn:ietf:params:imdn", "Message-ID", ebmh.a());
    }

    public static void u(ebcv ebcvVar, OutputStream outputStream) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            XmlSerializer xmlSerializerNewSerializer = XmlPullParserFactory.newInstance().newSerializer();
            xmlSerializerNewSerializer.setOutput(byteArrayOutputStream, "utf-8");
            xmlSerializerNewSerializer.setPrefix("", "urn:ietf:params:xml:ns:imdn");
            xmlSerializerNewSerializer.startDocument("utf-8", null);
            xmlSerializerNewSerializer.startTag("urn:ietf:params:xml:ns:imdn", "imdn");
            xmlSerializerNewSerializer.startTag("urn:ietf:params:xml:ns:imdn", "message-id");
            xmlSerializerNewSerializer.text(ebcvVar.d);
            xmlSerializerNewSerializer.endTag("urn:ietf:params:xml:ns:imdn", "message-id");
            xmlSerializerNewSerializer.startTag("urn:ietf:params:xml:ns:imdn", "datetime");
            xmlSerializerNewSerializer.text(new dhie(0L).toString());
            xmlSerializerNewSerializer.endTag("urn:ietf:params:xml:ns:imdn", "datetime");
            switch (ebcvVar.e) {
                case DELIVERED:
                case DELIVERY_FAILED:
                case DELIVERY_FORBIDDEN:
                case DELIVERY_ERROR:
                    xmlSerializerNewSerializer.startTag("urn:ietf:params:xml:ns:imdn", "delivery-notification");
                    xmlSerializerNewSerializer.startTag("urn:ietf:params:xml:ns:imdn", "status");
                    xmlSerializerNewSerializer.startTag("urn:ietf:params:xml:ns:imdn", ebcvVar.e.o);
                    xmlSerializerNewSerializer.endTag("urn:ietf:params:xml:ns:imdn", ebcvVar.e.o);
                    xmlSerializerNewSerializer.endTag("urn:ietf:params:xml:ns:imdn", "status");
                    xmlSerializerNewSerializer.endTag("urn:ietf:params:xml:ns:imdn", "delivery-notification");
                    break;
                case DISPLAYED:
                case DISPLAY_ERROR:
                case DISPLAY_FORBIDDEN:
                    xmlSerializerNewSerializer.startTag("urn:ietf:params:xml:ns:imdn", "display-notification");
                    xmlSerializerNewSerializer.startTag("urn:ietf:params:xml:ns:imdn", "status");
                    xmlSerializerNewSerializer.startTag("urn:ietf:params:xml:ns:imdn", ebcvVar.e.o);
                    xmlSerializerNewSerializer.endTag("urn:ietf:params:xml:ns:imdn", ebcvVar.e.o);
                    xmlSerializerNewSerializer.endTag("urn:ietf:params:xml:ns:imdn", "status");
                    xmlSerializerNewSerializer.endTag("urn:ietf:params:xml:ns:imdn", "display-notification");
                    break;
                case PROCESSED:
                case STORED:
                case PROCESSING_ERROR:
                case PROCESSING_FORBIDDEN:
                    xmlSerializerNewSerializer.startTag("urn:ietf:params:xml:ns:imdn", "processing-notification");
                    xmlSerializerNewSerializer.startTag("urn:ietf:params:xml:ns:imdn", "status");
                    xmlSerializerNewSerializer.startTag("urn:ietf:params:xml:ns:imdn", ebcvVar.e.o);
                    xmlSerializerNewSerializer.endTag("urn:ietf:params:xml:ns:imdn", ebcvVar.e.o);
                    xmlSerializerNewSerializer.endTag("urn:ietf:params:xml:ns:imdn", "status");
                    xmlSerializerNewSerializer.endTag("urn:ietf:params:xml:ns:imdn", "processing-notification");
                    break;
                case INTERWORKING_SMS:
                case INTERWORKING_MMS:
                case INTERWORKING_ERROR:
                    xmlSerializerNewSerializer.setPrefix("cpmimdn", "urn:oma:xml:cpm:imdn-extensions:1.0");
                    xmlSerializerNewSerializer.startTag("urn:oma:xml:cpm:imdn-extensions:1.0", "interworking-notification");
                    xmlSerializerNewSerializer.startTag("urn:oma:xml:cpm:imdn-extensions:1.0", "status");
                    xmlSerializerNewSerializer.startTag("urn:oma:xml:cpm:imdn-extensions:1.0", ebcvVar.e.o);
                    xmlSerializerNewSerializer.endTag("urn:oma:xml:cpm:imdn-extensions:1.0", ebcvVar.e.o);
                    xmlSerializerNewSerializer.endTag("urn:oma:xml:cpm:imdn-extensions:1.0", "status");
                    xmlSerializerNewSerializer.endTag("urn:oma:xml:cpm:imdn-extensions:1.0", "interworking-notification");
                    break;
            }
            xmlSerializerNewSerializer.endTag("urn:ietf:params:xml:ns:imdn", "imdn");
            xmlSerializerNewSerializer.endDocument();
            xmlSerializerNewSerializer.flush();
            ebcvVar.k(ffho.c, "notification");
            ebcvVar.j(byteArrayOutputStream.toByteArray());
            ebcvVar.q(outputStream);
        } catch (XmlPullParserException e) {
            throw new IOException("Error while writing document: ".concat(String.valueOf(e.getMessage())));
        }
    }

    @Override // defpackage.ebcp
    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof ebcv)) {
            return false;
        }
        ebcv ebcvVar = (ebcv) obj;
        if (TextUtils.equals(this.d, ebcvVar.d) && TextUtils.equals(this.f, ebcvVar.f) && TextUtils.equals(null, null) && TextUtils.equals(null, null) && TextUtils.equals(null, (String) ebcvVar.b.get("Subject")) && this.e == ebcvVar.e && Objects.equals(null, null)) {
            return super.equals(obj);
        }
        return false;
    }

    @Override // defpackage.ebcp
    public final int hashCode() {
        return Arrays.hashCode(new Object[]{0L, this.d, this.f, null, null, null, this.e, null});
    }

    @Override // defpackage.ebcp
    public final String toString() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            u(this, byteArrayOutputStream);
            return new String(byteArrayOutputStream.toByteArray(), "utf-8");
        } catch (IOException e) {
            e.printStackTrace();
            return "";
        }
    }

    public ebcv(String str, String str2, String str3, String str4, ebcu ebcuVar) {
        super("message/imdn+xml", "utf-8");
        o("imdn", "urn:ietf:params:imdn");
        l(str2);
        p(str3);
        this.e = ebcuVar;
        this.f = str;
        this.d = str4;
        n("urn:ietf:params:imdn", "Message-ID", str);
        m("DateTime", new dhie(SystemClock.currentThreadTimeMillis()).toString());
    }
}
