package defpackage;

import android.view.View;
import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class uuk extends uum {
    private final View a;
    private final View b;
    private final ConversationId c;
    private final MessageIdType d;
    private final long e;

    public uuk(View view, View view2, ConversationId conversationId, MessageIdType messageIdType, long j) {
        if (view == null) {
            throw new NullPointerException("Null parent");
        }
        this.a = view;
        if (view2 == null) {
            throw new NullPointerException("Null target");
        }
        this.b = view2;
        this.c = conversationId;
        if (messageIdType == null) {
            throw new NullPointerException("Null messageId");
        }
        this.d = messageIdType;
        this.e = j;
    }

    @Override // defpackage.uum
    public final long a() {
        return this.e;
    }

    @Override // defpackage.uum
    public final View b() {
        return this.a;
    }

    @Override // defpackage.uum
    public final View c() {
        return this.b;
    }

    @Override // defpackage.uum
    public final ConversationId d() {
        return this.c;
    }

    @Override // defpackage.uum
    public final MessageIdType e() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof uum) {
            uum uumVar = (uum) obj;
            if (this.a.equals(uumVar.b()) && this.b.equals(uumVar.c()) && this.c.equals(uumVar.d()) && this.d.equals(uumVar.e()) && this.e == uumVar.a()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = ((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode();
        long j = this.e;
        return (iHashCode * 1000003) ^ ((int) (j ^ (j >>> 32)));
    }

    public final String toString() {
        MessageIdType messageIdType = this.d;
        ConversationId conversationId = this.c;
        View view = this.b;
        return "StarBadgeClickEvent{parent=" + this.a.toString() + ", target=" + view.toString() + ", conversationId=" + conversationId.toString() + ", messageId=" + messageIdType.toString() + ", usageStatsLoggingId=" + this.e + "}";
    }
}
