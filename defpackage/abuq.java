package defpackage;

import android.net.Uri;
import android.provider.Telephony;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class abuq implements cnos {
    private static final eksp a = eksp.c("BugleReactions");
    private final abut b;

    public abuq(abut abutVar) {
        this.b = abutVar;
    }

    @Override // defpackage.cnos
    public final void c(MessagePartCoreData messagePartCoreData) {
        messagePartCoreData.getClass();
        if (!crbf.c() || messagePartCoreData.bv()) {
            return;
        }
        if (messagePartCoreData.W() == null) {
            ((eksl) a.h()).q("Invoked telephony callback. Part does not have id yet");
            return;
        }
        Uri uriT = messagePartCoreData.t();
        if (uriT == null) {
            ((eksl) a.h()).q("Inserted part has no URI, not updating the database");
            return;
        }
        if (!fdbq.f(uriT.getAuthority(), Telephony.Mms.CONTENT_URI.getAuthority())) {
            ((eksl) a.h()).q("Ignoring on part inserted. It was not inserting to telephony.");
            return;
        }
        abut abutVar = this.b;
        MessageIdType messageIdTypeB = messagePartCoreData.B();
        messageIdTypeB.getClass();
        abur aburVar = (abur) abus.a.createBuilder();
        aburVar.getClass();
        String strB = messageIdTypeB.b();
        strB.getClass();
        aburVar.copyOnWrite();
        ((abus) aburVar.instance).b = strB;
        String string = uriT.toString();
        string.getClass();
        aburVar.copyOnWrite();
        ((abus) aburVar.instance).c = string;
        evsn evsnVarBuild = aburVar.build();
        evsnVarBuild.getClass();
        abutVar.a.a(cbcu.f("EmotifyReactionDatabaseUpdateHandler", (abus) evsnVarBuild));
    }

    @Override // defpackage.cnos
    public final void a(ConversationIdType conversationIdType) {
    }

    @Override // defpackage.cnos
    public final void d(String str) {
    }

    @Override // defpackage.cnos
    public final void b(ConversationIdType conversationIdType, List list) {
    }
}
