package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.selfidentity.SelfIdentityId;
import com.google.android.apps.messaging.shared.api.messaging.selfidentity.SelfIdentityIdImpl;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class atqr extends atrj {
    private final ConversationIdType a;
    private final cnqj b;
    private final String c;
    private final bvdp d;
    private final Optional e;
    private final boolean f;
    private final String g;
    private final String h;
    private final Optional i;
    private final cigb j;
    private final aubq k;
    private final SelfIdentityId l;
    private final int m;
    private final avoe n;
    private final axcy o;
    private final Optional p;

    public atqr(ConversationIdType conversationIdType, cnqj cnqjVar, String str, bvdp bvdpVar, Optional optional, boolean z, String str2, String str3, Optional optional2, cigb cigbVar, aubq aubqVar, SelfIdentityId selfIdentityId, int i, avoe avoeVar, axcy axcyVar, Optional optional3) {
        this.a = conversationIdType;
        this.b = cnqjVar;
        this.c = str;
        this.d = bvdpVar;
        this.e = optional;
        this.f = z;
        this.g = str2;
        this.h = str3;
        this.i = optional2;
        this.j = cigbVar;
        this.k = aubqVar;
        this.l = selfIdentityId;
        this.m = i;
        this.n = avoeVar;
        this.o = axcyVar;
        this.p = optional3;
    }

    @Override // defpackage.atrj
    public final int a() {
        return this.m;
    }

    @Override // defpackage.atrj
    public final SelfIdentityId b() {
        return this.l;
    }

    @Override // defpackage.atrj
    public final aubq c() {
        return this.k;
    }

    @Override // defpackage.atrj
    public final avoe d() {
        return this.n;
    }

    @Override // defpackage.atrj
    public final axcy e() {
        return this.o;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof atrj) {
            atrj atrjVar = (atrj) obj;
            if (this.a.equals(atrjVar.f()) && this.b.equals(atrjVar.i()) && this.c.equals(atrjVar.m()) && this.d.equals(atrjVar.g()) && this.e.equals(atrjVar.k()) && this.f == atrjVar.p() && this.g.equals(atrjVar.o()) && this.h.equals(atrjVar.n()) && this.i.equals(atrjVar.l()) && this.j.equals(atrjVar.h()) && this.k.equals(atrjVar.c()) && this.l.equals(atrjVar.b()) && this.m == atrjVar.a() && this.n.equals(atrjVar.d()) && this.o.equals(atrjVar.e()) && this.p.equals(atrjVar.j())) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.atrj
    public final ConversationIdType f() {
        return this.a;
    }

    @Override // defpackage.atrj
    public final bvdp g() {
        return this.d;
    }

    @Override // defpackage.atrj
    public final cigb h() {
        return this.j;
    }

    public final int hashCode() {
        return ((((((((((((((((((((((((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode()) * 1000003) ^ (true != this.f ? 1237 : 1231)) * 1000003) ^ this.g.hashCode()) * 1000003) ^ this.h.hashCode()) * 1000003) ^ this.i.hashCode()) * 1000003) ^ this.j.hashCode()) * 1000003) ^ this.k.hashCode()) * 1000003) ^ this.l.hashCode()) * 1000003) ^ this.m) * 1000003) ^ this.n.hashCode()) * 1000003) ^ this.o.hashCode()) * 1000003) ^ this.p.hashCode();
    }

    @Override // defpackage.atrj
    public final cnqj i() {
        return this.b;
    }

    @Override // defpackage.atrj
    public final Optional j() {
        return this.p;
    }

    @Override // defpackage.atrj
    public final Optional k() {
        return this.e;
    }

    @Override // defpackage.atrj
    public final Optional l() {
        return this.i;
    }

    @Override // defpackage.atrj
    public final String m() {
        return this.c;
    }

    @Override // defpackage.atrj
    public final String n() {
        return this.h;
    }

    @Override // defpackage.atrj
    public final String o() {
        return this.g;
    }

    @Override // defpackage.atrj
    public final boolean p() {
        return this.f;
    }

    public final String toString() {
        return "GroupConversationMetadata{conversationId=" + this.a.toString() + ", smsThreadId=" + this.b.toString() + ", name=" + this.c + ", groupNameSource=" + this.d.toString() + ", rcsGroupIconUrl=" + String.valueOf(this.e) + ", isUpgradeFromMmsGroup=" + this.f + ", rcsGroupId=" + this.g + ", rcsConferenceUri=" + this.h + ", rcsGroupSelfMsisdn=" + String.valueOf(this.i) + ", rcsGroupCapabilities=" + this.j.toString() + ", currentActiveRcsMsisdn=" + this.k.toString() + ", selfParticipantId=" + ((SelfIdentityIdImpl) this.l).a + ", joinState=" + this.m + ", errorState=" + this.n.toString() + ", selfSubscription=" + this.o.toString() + ", lastSyncTimestamp=" + String.valueOf(this.p) + "}";
    }
}
