package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cplq extends cppb {
    private final bojh a;
    private final ekgb b;
    private final ParticipantsTable.BindData c;
    private final MessageCoreData d;
    private final boolean e;
    private final long f;
    private final ekgp g;

    public cplq(bojh bojhVar, ekgb ekgbVar, ParticipantsTable.BindData bindData, MessageCoreData messageCoreData, boolean z, long j, ekgp ekgpVar) {
        this.a = bojhVar;
        this.b = ekgbVar;
        this.c = bindData;
        this.d = messageCoreData;
        this.e = z;
        this.f = j;
        this.g = ekgpVar;
    }

    @Override // defpackage.cppb
    public final long a() {
        return this.f;
    }

    @Override // defpackage.cppb
    public final MessageCoreData b() {
        return this.d;
    }

    @Override // defpackage.cppb
    public final bojh c() {
        return this.a;
    }

    @Override // defpackage.cppb
    public final ParticipantsTable.BindData d() {
        return this.c;
    }

    @Override // defpackage.cppb
    public final ekgb e() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        ParticipantsTable.BindData bindData;
        MessageCoreData messageCoreData;
        if (obj == this) {
            return true;
        }
        if (obj instanceof cppb) {
            cppb cppbVar = (cppb) obj;
            if (this.a.equals(cppbVar.c()) && ekjz.h(this.b, cppbVar.e()) && ((bindData = this.c) != null ? bindData.equals(cppbVar.d()) : cppbVar.d() == null) && ((messageCoreData = this.d) != null ? messageCoreData.equals(cppbVar.b()) : cppbVar.b() == null) && this.e == cppbVar.g() && this.f == cppbVar.a() && this.g.equals(cppbVar.f())) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.cppb
    public final ekgp f() {
        return this.g;
    }

    @Override // defpackage.cppb
    public final boolean g() {
        return this.e;
    }

    public final int hashCode() {
        int iHashCode = ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
        ParticipantsTable.BindData bindData = this.c;
        int iHashCode2 = ((iHashCode * 1000003) ^ (bindData == null ? 0 : bindData.hashCode())) * 1000003;
        MessageCoreData messageCoreData = this.d;
        int iHashCode3 = (((iHashCode2 ^ (messageCoreData != null ? messageCoreData.hashCode() : 0)) * 1000003) ^ (true != this.e ? 1237 : 1231)) * 1000003;
        long j = this.f;
        return ((iHashCode3 ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ this.g.hashCode();
    }

    public final String toString() {
        ekgp ekgpVar = this.g;
        MessageCoreData messageCoreData = this.d;
        ParticipantsTable.BindData bindData = this.c;
        ekgb ekgbVar = this.b;
        return "CmsConversationData{conversation=" + this.a.toString() + ", participantsList=" + ekgbVar.toString() + ", selfParticipant=" + String.valueOf(bindData) + ", lastMessage=" + String.valueOf(messageCoreData) + ", hasUnreadMessages=" + this.e + ", latestIncomingReadMessageTimestampMs=" + this.f + ", additionalFields=" + ekgpVar.toString() + "}";
    }
}
