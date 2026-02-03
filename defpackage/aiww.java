package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversationId;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class aiww extends fcyv {
    Object a;
    /* synthetic */ Object b;
    final /* synthetic */ aiwz c;
    int d;
    ConversationIdType e;
    BugleConversationId f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aiww(aiwz aiwzVar, fcxy fcxyVar) {
        super(fcxyVar);
        this.c = aiwzVar;
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.a(null, null, this);
    }
}
