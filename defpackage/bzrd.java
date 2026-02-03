package defpackage;

import android.content.Context;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.PartsTable;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bzrd {
    public final bzop a;
    public final eosc b;
    public final fcsu c;
    public final fcsu d;
    public final ceae e;
    public final fcsu f;
    public final fcsu g;
    public final dqsn h;
    public final Context i;
    public final bzqa j;
    public final aqmq k;
    private final bxlc l;

    public bzrd(bzop bzopVar, ceae ceaeVar, fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3, fcsu fcsuVar4, dqsn dqsnVar, bxlc bxlcVar, Context context, eosc eoscVar, bzqa bzqaVar, aqmq aqmqVar) {
        this.a = bzopVar;
        this.e = ceaeVar;
        this.c = fcsuVar;
        this.d = fcsuVar2;
        this.f = fcsuVar3;
        this.g = fcsuVar4;
        this.h = dqsnVar;
        this.l = bxlcVar;
        this.b = eoscVar;
        this.i = context;
        this.j = bzqaVar;
        this.k = aqmqVar;
    }

    @Deprecated
    public final void a(boolean z, ConversationIdType conversationIdType, MessageIdType messageIdType, String str) {
        String[] strArr = PartsTable.a;
        bsjh bsjhVar = new bsjh();
        bsjhVar.ap("updateAndNotifyCmsAttachmentProcessingStatus");
        bsjhVar.f(z ? bvdl.CMS_MEDIA_DOWNLOADED : bvdl.CMS_MEDIA_DOWNLOAD_NOT_STARTED);
        bsjhVar.c(str);
        this.l.l(conversationIdType, messageIdType, "parts");
    }
}
