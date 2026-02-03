package defpackage;

import android.content.ContentValues;
import android.net.Uri;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class axlv extends aydc {
    private final int a;
    private final ContentValues b;
    private final ParticipantsTable.BindData c;
    private final long d;
    private final ConversationIdType e;
    private final boolean f;
    private final long g;
    private final Uri h;
    private final boolean i;
    private final boolean j;
    private final bvdk k;
    private final boolean l;
    private final bvdz m;
    private final long n;
    private final axza o;
    private final boolean p;
    private final UUID q;
    private final fhaz r;

    public axlv(int i, ContentValues contentValues, ParticipantsTable.BindData bindData, long j, ConversationIdType conversationIdType, boolean z, long j2, Uri uri, boolean z2, boolean z3, bvdk bvdkVar, boolean z4, bvdz bvdzVar, long j3, axza axzaVar, boolean z5, UUID uuid, fhaz fhazVar) {
        this.a = i;
        if (contentValues == null) {
            throw new NullPointerException("Null getMessageValues");
        }
        this.b = contentValues;
        this.c = bindData;
        this.d = j;
        this.e = conversationIdType;
        this.f = z;
        this.g = j2;
        this.h = uri;
        this.i = z2;
        this.j = z3;
        if (bvdkVar == null) {
            throw new NullPointerException("Null archiveStatus");
        }
        this.k = bvdkVar;
        this.l = z4;
        if (bvdzVar == null) {
            throw new NullPointerException("Null getVerificationStatus");
        }
        this.m = bvdzVar;
        this.n = j3;
        this.o = axzaVar;
        this.p = z5;
        this.q = uuid;
        this.r = fhazVar;
    }

    @Override // defpackage.aydc
    public final int a() {
        return this.a;
    }

    @Override // defpackage.aydc
    public final long b() {
        return this.n;
    }

    @Override // defpackage.aydc
    public final long c() {
        return this.g;
    }

    @Override // defpackage.aydc
    public final long d() {
        return this.d;
    }

    @Override // defpackage.aydc
    public final ContentValues e() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        Uri uri;
        UUID uuid;
        fhaz fhazVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof aydc) {
            aydc aydcVar = (aydc) obj;
            if (this.a == aydcVar.a() && this.b.equals(aydcVar.e()) && this.c.equals(aydcVar.i()) && this.d == aydcVar.d() && this.e.equals(aydcVar.h()) && this.f == aydcVar.o() && this.g == aydcVar.c() && ((uri = this.h) != null ? uri.equals(aydcVar.f()) : aydcVar.f() == null) && this.i == aydcVar.p() && this.j == aydcVar.q() && this.k.equals(aydcVar.j()) && this.l == aydcVar.r() && this.m.equals(aydcVar.k()) && this.n == aydcVar.b() && this.o.equals(aydcVar.g()) && this.p == aydcVar.n() && ((uuid = this.q) != null ? uuid.equals(aydcVar.l()) : aydcVar.l() == null) && ((fhazVar = this.r) != null ? fhazVar.equals(aydcVar.m()) : aydcVar.m() == null)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.aydc
    public final Uri f() {
        return this.h;
    }

    @Override // defpackage.aydc
    public final axza g() {
        return this.o;
    }

    @Override // defpackage.aydc
    public final ConversationIdType h() {
        return this.e;
    }

    public final int hashCode() {
        int iHashCode = ((((this.a ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode();
        long j = this.d;
        int iHashCode2 = (((iHashCode * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ this.e.hashCode();
        Uri uri = this.h;
        int iHashCode3 = uri == null ? 0 : uri.hashCode();
        long j2 = this.g;
        int iHashCode4 = ((((((((((((((((iHashCode2 * 1000003) ^ (true != this.f ? 1237 : 1231)) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ iHashCode3) * 1000003) ^ (true != this.i ? 1237 : 1231)) * 1000003) ^ (true != this.j ? 1237 : 1231)) * 1000003) ^ this.k.hashCode()) * 1000003) ^ (true != this.l ? 1237 : 1231)) * 1000003) ^ this.m.hashCode()) * 1000003;
        long j3 = this.n;
        int iHashCode5 = (((((iHashCode4 ^ ((int) ((j3 >>> 32) ^ j3))) * 1000003) ^ this.o.hashCode()) * 1000003) ^ (true == this.p ? 1231 : 1237)) * 1000003;
        UUID uuid = this.q;
        int iHashCode6 = (iHashCode5 ^ (uuid == null ? 0 : uuid.hashCode())) * 1000003;
        fhaz fhazVar = this.r;
        return iHashCode6 ^ (fhazVar != null ? fhazVar.hashCode() : 0);
    }

    @Override // defpackage.aydc
    public final ParticipantsTable.BindData i() {
        return this.c;
    }

    @Override // defpackage.aydc
    public final bvdk j() {
        return this.k;
    }

    @Override // defpackage.aydc
    public final bvdz k() {
        return this.m;
    }

    @Override // defpackage.aydc
    public final UUID l() {
        return this.q;
    }

    @Override // defpackage.aydc
    public final fhaz m() {
        return this.r;
    }

    @Override // defpackage.aydc
    public final boolean n() {
        return this.p;
    }

    @Override // defpackage.aydc
    public final boolean o() {
        return this.f;
    }

    @Override // defpackage.aydc
    public final boolean p() {
        return this.i;
    }

    @Override // defpackage.aydc
    public final boolean q() {
        return this.j;
    }

    @Override // defpackage.aydc
    public final boolean r() {
        return this.l;
    }

    public final String toString() {
        fhaz fhazVar = this.r;
        UUID uuid = this.q;
        axza axzaVar = this.o;
        bvdz bvdzVar = this.m;
        bvdk bvdkVar = this.k;
        Uri uri = this.h;
        ConversationIdType conversationIdType = this.e;
        ParticipantsTable.BindData bindData = this.c;
        return "InsertMessageInBugleDbParams{getSubId=" + this.a + ", getMessageValues=" + this.b.toString() + ", getSender=" + bindData.toString() + ", getThreadId=" + this.d + ", getConversationId=" + conversationIdType.toString() + ", isNewConversation=" + this.f + ", getReceivedTime=" + this.g + ", getMessageUri=" + String.valueOf(uri) + ", isNotified=" + this.i + ", isRead=" + this.j + ", archiveStatus=" + bvdkVar.toString() + ", shouldMessageBeIgnored=" + this.l + ", getVerificationStatus=" + bvdzVar.toString() + ", getMessageLoggingId=" + this.n + ", getRawSmsMessagingAddress=" + axzaVar.toString() + ", isAllowedByParents=" + this.p + ", persistenceId=" + String.valueOf(uuid) + ", traceId=" + String.valueOf(fhazVar) + "}";
    }
}
