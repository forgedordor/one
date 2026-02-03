package defpackage;

import com.google.android.ims.rcsservice.chatsession.message.ConversationSuggestion;
import com.google.android.rcs.client.messaging.data.ContentType;
import com.google.android.rcs.client.messaging.data.IsComposingMessage;
import j$.time.Duration;
import j$.time.Instant;
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
public final class efni implements efoe {
    public static final ContentType a = efne.a;
    private static final ContentType b;

    static {
        efil efilVarD = ContentType.d();
        efilVarD.f(ConversationSuggestion.SUGGESTION_PROPERTY_TEXT);
        efilVarD.e("plain");
        b = efilVarD.g();
    }

    public static final IsComposingMessage c(efnd efndVar) throws IOException, efoc {
        ContentType contentType = a;
        if (!contentType.g(efndVar.a())) {
            throw new efog(efndVar.a(), "Supported type for this serializer is: ".concat(String.valueOf(String.valueOf(contentType))));
        }
        try {
            InputStream inputStreamM = efndVar.b().m();
            try {
                XmlPullParser xmlPullParserE = efod.e();
                xmlPullParserE.setInput(inputStreamM, "UTF-8");
                int iA = efod.a(xmlPullParserE);
                String name = xmlPullParserE.getName();
                if (!"isComposing".equals(name)) {
                    throw new efng("Invalid start tag for XML:".concat(String.valueOf(IsComposingMessage.class.getName())));
                }
                efhu efhuVar = new efhu();
                while (true) {
                    if (iA == 3) {
                        if ("isComposing".equals(name)) {
                            IsComposingMessage isComposingMessageA = efhuVar.a();
                            inputStreamM.close();
                            return isComposingMessageA;
                        }
                        iA = 3;
                    }
                    if (iA == 1) {
                        throw new efng("Incomplete XML for:".concat(String.valueOf(IsComposingMessage.class.getName())));
                    }
                    if (iA == 2) {
                        if ("refresh".equals(name)) {
                            long j = Long.parseLong(efod.d(xmlPullParserE));
                            if (j < 0) {
                                throw new efnh("refresh");
                            }
                            efhuVar.b(Duration.ofSeconds(j));
                        } else if ("lastactive".equals(name)) {
                            efhuVar.d(efod.c("lastactive", efod.d(xmlPullParserE)));
                        } else if ("state".equals(name)) {
                            efhuVar.c(ejuf.e(efod.d(xmlPullParserE), "active") ? efjm.START : efjm.STOP);
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
        } catch (IOException | IllegalStateException | NumberFormatException | XmlPullParserException e) {
            throw new efoc("Error deserializing IsComposingMessage", e);
        }
    }

    public static final efnd d(IsComposingMessage isComposingMessage) throws XmlPullParserException, IOException, efoc {
        String str;
        try {
            XmlSerializer xmlSerializerNewSerializer = XmlPullParserFactory.newInstance().newSerializer();
            StringWriter stringWriter = new StringWriter();
            try {
                xmlSerializerNewSerializer.setOutput(stringWriter);
                xmlSerializerNewSerializer.setPrefix("", "urn:ietf:params:xml:ns:im-iscomposing");
                xmlSerializerNewSerializer.startDocument("UTF-8", true);
                xmlSerializerNewSerializer.startTag("urn:ietf:params:xml:ns:im-iscomposing", "isComposing");
                efjm efjmVarA = isComposingMessage.a();
                if (efjm.START.equals(efjmVarA)) {
                    str = "active";
                } else {
                    if (!efjm.STOP.equals(efjmVarA)) {
                        throw new efnh("state");
                    }
                    str = "idle";
                }
                efod.f(xmlSerializerNewSerializer, "urn:ietf:params:xml:ns:im-iscomposing", "state", str);
                efod.f(xmlSerializerNewSerializer, "urn:ietf:params:xml:ns:im-iscomposing", "contenttype", b.toString());
                Optional optionalC = isComposingMessage.c();
                if (optionalC.isPresent()) {
                    efod.f(xmlSerializerNewSerializer, "urn:ietf:params:xml:ns:im-iscomposing", "lastactive", dhif.c(((Instant) optionalC.get()).toEpochMilli()));
                }
                Optional optionalB = isComposingMessage.b();
                if (optionalB.isPresent()) {
                    efod.f(xmlSerializerNewSerializer, "urn:ietf:params:xml:ns:im-iscomposing", "refresh", String.valueOf(((Duration) optionalB.get()).getSeconds()));
                }
                xmlSerializerNewSerializer.endTag("urn:ietf:params:xml:ns:im-iscomposing", "isComposing");
                xmlSerializerNewSerializer.endDocument();
                String string = stringWriter.toString();
                stringWriter.close();
                efmx efmxVar = new efmx();
                efmxVar.c(a);
                efmxVar.b(evqs.A(string));
                return efmxVar.a();
            } catch (Throwable th) {
                try {
                    stringWriter.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (IOException | XmlPullParserException e) {
            throw new efoc("Error serializing IsComposingMessage.", e);
        }
    }

    @Override // defpackage.efoe
    public final /* bridge */ /* synthetic */ eflb a(efnd efndVar) {
        return c(efndVar);
    }

    @Override // defpackage.efoe
    public final /* bridge */ /* synthetic */ efnd b(eflb eflbVar) {
        return d((IsComposingMessage) eflbVar);
    }
}
