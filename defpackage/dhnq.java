package defpackage;

import com.google.android.ims.rcsservice.businessinfo.BusinessInfoDatabaseConstants;
import com.google.android.ims.rcsservice.chatsession.message.ConversationSuggestion;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.xmlpull.v1.XmlSerializer;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dhnq implements dhle {
    public String a;
    public int b;
    public boolean c;
    public String d;
    public final fcsu e;
    private List f;

    public dhnq(fcsu fcsuVar) {
        this.e = fcsuVar;
    }

    public final List a() {
        if (this.f == null) {
            this.f = new ArrayList();
        }
        return this.f;
    }

    @Override // defpackage.dhle
    public final void c(XmlSerializer xmlSerializer) throws IllegalStateException, IOException, IllegalArgumentException {
        xmlSerializer.startTag("urn:ietf:params:xml:ns:rlmi", "list");
        xmlSerializer.attribute("", ConversationSuggestion.SUGGESTION_PROPERTY_WEB_URI, this.a);
        xmlSerializer.attribute("", BusinessInfoDatabaseConstants.BusinessInfoMetadataTableConstants.Columns.VERSION, String.valueOf(this.b));
        xmlSerializer.attribute("", "fullState", String.valueOf(this.c));
        String str = this.d;
        if (str != null) {
            xmlSerializer.attribute("", "cid", str);
        }
        List list = this.f;
        if (list != null && list.size() > 0) {
            for (Object obj : this.f) {
                if (obj instanceof dhns) {
                    ((dhns) obj).c(xmlSerializer);
                } else if (obj instanceof dhnt) {
                    ((dhnt) obj).c(xmlSerializer);
                }
            }
        }
        xmlSerializer.endTag("urn:ietf:params:xml:ns:rlmi", "list");
    }
}
