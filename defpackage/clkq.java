package defpackage;

import android.content.Context;
import com.google.android.apps.messaging.shared.api.messaging.selfidentity.SelfIdentityId;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class clkq {
    public final bveg a;
    private final Context b;

    public clkq(bveg bvegVar, Context context) {
        bvegVar.getClass();
        context.getClass();
        this.a = bvegVar;
        this.b = context;
    }

    public final MessageCoreData a(String str, SelfIdentityId selfIdentityId, ConversationIdType conversationIdType, evvp evvpVar, clko clkoVar) {
        clkoVar.getClass();
        return this.a.k(str, selfIdentityId, conversationIdType, clkoVar.f, clkp.a(evvpVar), this.b.getString(clkoVar.g));
    }
}
