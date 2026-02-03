package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class bohl implements Supplier {
    final /* synthetic */ bohm a;

    public bohl(bohm bohmVar) {
        this.a = bohmVar;
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        bohm bohmVar = this.a;
        ConversationIdType conversationIdType = bohmVar.a;
        if (conversationIdType == null || conversationIdType.equals(barn.a)) {
            return null;
        }
        return Long.valueOf(barn.a(bohmVar.a));
    }
}
