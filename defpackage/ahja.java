package defpackage;

import android.content.Context;
import com.google.android.apps.messaging.shared.api.messaging.MessageId;
import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ahja implements alxs {
    final /* synthetic */ ahjq a;

    public ahja(ahjq ahjqVar) {
        this.a = ahjqVar;
    }

    @Override // defpackage.alxs
    public final alwv a(MessageId messageId, ConversationId conversationId, ajlk ajlkVar, MessagesTable.BindData bindData, ajmc ajmcVar, amvr amvrVar, ancl anclVar, anlb anlbVar, anpj anpjVar, boolean z, ekgb ekgbVar, fcsu fcsuVar) {
        ahjq ahjqVar = this.a;
        eyik eyikVar = ahjqVar.b.gn;
        ahkn ahknVar = ahjqVar.a;
        Context context = (Context) ahknVar.t.b();
        alwr alwrVar = new alwr();
        eyik eyikVar2 = ahknVar.cD;
        ahnh ahnhVar = ahknVar.a;
        return new alwv(eyikVar, context, alwrVar, ahnhVar.QI, ahnhVar.QJ, ahnhVar.bn(), messageId, conversationId, ajlkVar, bindData, ajmcVar, amvrVar, anclVar, anlbVar, anpjVar, z, ekgbVar, fcsuVar, (cogw) eyikVar2.b());
    }
}
