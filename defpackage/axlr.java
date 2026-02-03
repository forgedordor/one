package defpackage;

import android.content.Context;
import android.net.Uri;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class axlr extends axus {
    private final Uri a;
    private final Context b;
    private final MessageIdType c;
    private final ConversationIdType d;
    private final boolean e;
    private final baqv f;
    private final MessageCoreData g;
    private final int h;
    private final long i;
    private final ParticipantsTable.BindData j;
    private final boolean k;

    public axlr(Uri uri, Context context, MessageIdType messageIdType, ConversationIdType conversationIdType, boolean z, baqv baqvVar, MessageCoreData messageCoreData, int i, long j, ParticipantsTable.BindData bindData, boolean z2) {
        this.a = uri;
        this.b = context;
        this.c = messageIdType;
        this.d = conversationIdType;
        this.e = z;
        this.f = baqvVar;
        this.g = messageCoreData;
        this.h = i;
        this.i = j;
        this.j = bindData;
        this.k = z2;
    }

    @Override // defpackage.axus
    public final int a() {
        return this.h;
    }

    @Override // defpackage.axus
    public final long b() {
        return this.i;
    }

    @Override // defpackage.axus
    public final Context c() {
        return this.b;
    }

    @Override // defpackage.axus
    public final Uri d() {
        return this.a;
    }

    @Override // defpackage.axus
    public final MessageCoreData e() {
        return this.g;
    }

    public final boolean equals(Object obj) {
        baqv baqvVar;
        MessageCoreData messageCoreData;
        ParticipantsTable.BindData bindData;
        if (obj == this) {
            return true;
        }
        if (obj instanceof axus) {
            axus axusVar = (axus) obj;
            Uri uri = this.a;
            if (uri != null ? uri.equals(axusVar.d()) : axusVar.d() == null) {
                if (this.b.equals(axusVar.c()) && this.c.equals(axusVar.h()) && this.d.equals(axusVar.g()) && this.e == axusVar.k() && ((baqvVar = this.f) != null ? baqvVar.equals(axusVar.f()) : axusVar.f() == null) && ((messageCoreData = this.g) != null ? messageCoreData.equals(axusVar.e()) : axusVar.e() == null) && this.h == axusVar.a() && this.i == axusVar.b() && ((bindData = this.j) != null ? bindData.equals(axusVar.i()) : axusVar.i() == null) && this.k == axusVar.j()) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // defpackage.axus
    public final baqv f() {
        return this.f;
    }

    @Override // defpackage.axus
    public final ConversationIdType g() {
        return this.d;
    }

    @Override // defpackage.axus
    public final MessageIdType h() {
        return this.c;
    }

    public final int hashCode() {
        Uri uri = this.a;
        int iHashCode = ((((((((((uri == null ? 0 : uri.hashCode()) ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ (true != this.e ? 1237 : 1231)) * 1000003;
        baqv baqvVar = this.f;
        int iHashCode2 = (iHashCode ^ (baqvVar == null ? 0 : baqvVar.hashCode())) * 1000003;
        MessageCoreData messageCoreData = this.g;
        int iHashCode3 = (((iHashCode2 ^ (messageCoreData == null ? 0 : messageCoreData.hashCode())) * 1000003) ^ this.h) * 1000003;
        long j = this.i;
        int i = (iHashCode3 ^ ((int) (j ^ (j >>> 32)))) * 1000003;
        ParticipantsTable.BindData bindData = this.j;
        return ((i ^ (bindData != null ? bindData.hashCode() : 0)) * 1000003) ^ (true == this.k ? 1231 : 1237);
    }

    @Override // defpackage.axus
    public final ParticipantsTable.BindData i() {
        return this.j;
    }

    @Override // defpackage.axus
    public final boolean j() {
        return this.k;
    }

    @Override // defpackage.axus
    public final boolean k() {
        return this.e;
    }

    public final String toString() {
        ParticipantsTable.BindData bindData = this.j;
        MessageCoreData messageCoreData = this.g;
        baqv baqvVar = this.f;
        ConversationIdType conversationIdType = this.d;
        MessageIdType messageIdType = this.c;
        Context context = this.b;
        return "ResultValues{mmsUri=" + String.valueOf(this.a) + ", context=" + context.toString() + ", messageId=" + messageIdType.toString() + ", notificationConversationId=" + conversationIdType.toString() + ", isMessageInFocusedConversation=" + this.e + ", createConversationResult=" + String.valueOf(baqvVar) + ", message=" + String.valueOf(messageCoreData) + ", subId=" + this.h + ", timestamp=" + this.i + ", senderData=" + String.valueOf(bindData) + ", isAllowedByParents=" + this.k + "}";
    }
}
