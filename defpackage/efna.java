package defpackage;

import com.google.android.ims.rcsservice.chatsession.message.ConversationSuggestion;
import com.google.android.rcs.client.messaging.data.BasicTextMessage;
import com.google.android.rcs.client.messaging.data.ContentType;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.charset.UnsupportedCharsetException;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class efna implements efoe {
    public static final ContentType a;
    private final Charset b = StandardCharsets.UTF_8;

    static {
        efil efilVarD = ContentType.d();
        efilVarD.f(ConversationSuggestion.SUGGESTION_PROPERTY_TEXT);
        efilVarD.e("plain");
        efilVarD.h(ekgp.l("charset", "UTF-8"));
        a = efilVarD.g();
    }

    public static final BasicTextMessage c(efnd efndVar) throws efoc {
        try {
            ContentType contentTypeA = efndVar.a();
            ContentType contentType = a;
            if (!contentType.g(contentTypeA)) {
                throw new efog(contentTypeA, a.E(contentType, "Supported type for this serializer is: "));
            }
            String strD = efndVar.b().D(Charset.forName((String) contentTypeA.a().getOrDefault(ejuf.c("charset"), "UTF-8")));
            efhf efhfVar = new efhf();
            efhfVar.b(strD);
            return efhfVar.a();
        } catch (UnsupportedCharsetException e) {
            throw new efoc("Error deserializing BasicTextMessage", e);
        }
    }

    @Override // defpackage.efoe
    public final /* bridge */ /* synthetic */ eflb a(efnd efndVar) {
        return c(efndVar);
    }

    @Override // defpackage.efoe
    public final /* bridge */ /* synthetic */ efnd b(eflb eflbVar) {
        efil efilVarD = ContentType.d();
        efilVarD.f(ConversationSuggestion.SUGGESTION_PROPERTY_TEXT);
        efilVarD.e("plain");
        Charset charset = this.b;
        efilVarD.h(ekgp.l("charset", charset.name()));
        ContentType contentTypeG = efilVarD.g();
        efmx efmxVar = new efmx();
        efmxVar.c(contentTypeG);
        efmxVar.b(evqs.y(((BasicTextMessage) eflbVar).a(), charset));
        return efmxVar.a();
    }
}
