package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class zwm implements fdpm {
    final /* synthetic */ zwo a;
    final /* synthetic */ ConversationIdType b;

    public zwm(zwo zwoVar, ConversationIdType conversationIdType) {
        this.a = zwoVar;
        this.b = conversationIdType;
    }

    @Override // defpackage.fdpm
    public final /* bridge */ /* synthetic */ Object fO(Object obj, fcxy fcxyVar) {
        ConversationIdType conversationIdType = this.b;
        this.a.a((cljh) obj, conversationIdType, false);
        return fctx.a;
    }
}
