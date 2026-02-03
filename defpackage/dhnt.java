package defpackage;

import com.google.android.ims.rcsservice.chatsession.message.ConversationSuggestion;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.xmlpull.v1.XmlSerializer;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dhnt implements dhle {
    public String a;
    public final List b = new ArrayList();
    public final fcsu c;

    public dhnt(fcsu fcsuVar) {
        this.c = fcsuVar;
    }

    @Override // defpackage.dhle
    public final void c(XmlSerializer xmlSerializer) throws IllegalStateException, IOException, IllegalArgumentException {
        xmlSerializer.startTag("urn:ietf:params:xml:ns:rlmi", "resource");
        xmlSerializer.attribute("", ConversationSuggestion.SUGGESTION_PROPERTY_WEB_URI, this.a);
        List list = this.b;
        if (!list.isEmpty()) {
            for (Object obj : list) {
                if (obj instanceof dhns) {
                    ((dhns) obj).c(xmlSerializer);
                } else if (obj instanceof dhnp) {
                    ((dhnp) obj).c(xmlSerializer);
                }
            }
        }
        xmlSerializer.endTag("urn:ietf:params:xml:ns:rlmi", "resource");
    }
}
