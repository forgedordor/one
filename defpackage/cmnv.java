package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cmnv extends cmnu {
    public final int a;
    public final String b;
    public final long c;
    public final MessageIdType d;
    public final ConversationIdType e;
    public final String f;
    public final String g;

    public cmnv(MessageIdType messageIdType, int i, String str, long j, ConversationIdType conversationIdType, String str2, String str3) {
        this.d = messageIdType;
        this.a = i;
        this.b = str;
        this.c = j;
        this.e = conversationIdType;
        this.f = str2;
        this.g = str3;
    }

    @Override // defpackage.cmnu
    public final int a() {
        throw null;
    }

    @Override // defpackage.cmnu
    public final int b() {
        throw null;
    }

    @Override // defpackage.cmnu
    public final long c() {
        return this.c;
    }

    @Override // defpackage.cmnu
    public final String d() {
        return this.b;
    }
}
