package defpackage;

import android.content.Context;
import com.google.android.apps.messaging.shared.api.messaging.MessageId;
import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ahlt implements alxs {
    final /* synthetic */ ahmz a;

    public ahlt(ahmz ahmzVar) {
        this.a = ahmzVar;
    }

    @Override // defpackage.alxs
    public final alwv a(MessageId messageId, ConversationId conversationId, ajlk ajlkVar, MessagesTable.BindData bindData, ajmc ajmcVar, amvr amvrVar, ancl anclVar, anlb anlbVar, anpj anpjVar, boolean z, ekgb ekgbVar, fcsu fcsuVar) {
        ahkn ahknVar = this.a.a;
        Context context = (Context) ahknVar.t.b();
        alwr alwrVar = new alwr();
        eyik eyikVar = ahknVar.cD;
        ahnh ahnhVar = ahknVar.a;
        aptj aptjVarBn = ahnhVar.bn();
        cogw cogwVar = (cogw) eyikVar.b();
        return new alwv(ahnhVar.QH, context, alwrVar, ahnhVar.QI, ahnhVar.QJ, aptjVarBn, messageId, conversationId, ajlkVar, bindData, ajmcVar, amvrVar, anclVar, anlbVar, anpjVar, z, ekgbVar, fcsuVar, cogwVar);
    }
}
