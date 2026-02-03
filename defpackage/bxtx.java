package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class bxtx extends bxuy {
    private final MessageIdType a;
    private final ConversationIdType b;
    private final String c;
    private final boolean d;
    private final long e;
    private final String f;
    private final Optional g;
    private final int h;
    private final ezds i;
    private final String j;
    private final ezds k;
    private final String l;
    private final String m;
    private final String n;
    private final String o;
    private final String p;
    private final Long q;
    private final boolean r;

    public bxtx(MessageIdType messageIdType, ConversationIdType conversationIdType, String str, boolean z, long j, String str2, Optional optional, int i, ezds ezdsVar, String str3, ezds ezdsVar2, String str4, String str5, String str6, String str7, String str8, Long l, boolean z2) {
        this.a = messageIdType;
        this.b = conversationIdType;
        this.c = str;
        this.d = z;
        this.e = j;
        this.f = str2;
        this.g = optional;
        this.h = i;
        this.i = ezdsVar;
        this.j = str3;
        this.k = ezdsVar2;
        this.l = str4;
        this.m = str5;
        this.n = str6;
        this.o = str7;
        this.p = str8;
        this.q = l;
        this.r = z2;
    }

    @Override // defpackage.bxuy
    public final int a() {
        return this.h;
    }

    @Override // defpackage.bxuy
    public final long b() {
        return this.e;
    }

    @Override // defpackage.bxuy
    public final ConversationIdType c() {
        return this.b;
    }

    @Override // defpackage.bxuy
    public final MessageIdType d() {
        return this.a;
    }

    @Override // defpackage.bxuy
    public final ezds e() {
        return this.i;
    }

    public final boolean equals(Object obj) {
        String str;
        String str2;
        ezds ezdsVar;
        String str3;
        ezds ezdsVar2;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        Long l;
        if (obj == this) {
            return true;
        }
        if (obj instanceof bxuy) {
            bxuy bxuyVar = (bxuy) obj;
            if (this.a.equals(bxuyVar.d()) && this.b.equals(bxuyVar.c()) && ((str = this.c) != null ? str.equals(bxuyVar.p()) : bxuyVar.p() == null) && this.d == bxuyVar.q() && this.e == bxuyVar.b() && ((str2 = this.f) != null ? str2.equals(bxuyVar.o()) : bxuyVar.o() == null) && this.g.equals(bxuyVar.g()) && this.h == bxuyVar.a() && ((ezdsVar = this.i) != null ? ezdsVar.equals(bxuyVar.e()) : bxuyVar.e() == null) && ((str3 = this.j) != null ? str3.equals(bxuyVar.i()) : bxuyVar.i() == null) && ((ezdsVar2 = this.k) != null ? ezdsVar2.equals(bxuyVar.f()) : bxuyVar.f() == null) && ((str4 = this.l) != null ? str4.equals(bxuyVar.j()) : bxuyVar.j() == null) && ((str5 = this.m) != null ? str5.equals(bxuyVar.m()) : bxuyVar.m() == null) && ((str6 = this.n) != null ? str6.equals(bxuyVar.n()) : bxuyVar.n() == null) && ((str7 = this.o) != null ? str7.equals(bxuyVar.k()) : bxuyVar.k() == null) && ((str8 = this.p) != null ? str8.equals(bxuyVar.l()) : bxuyVar.l() == null) && ((l = this.q) != null ? l.equals(bxuyVar.h()) : bxuyVar.h() == null) && this.r == bxuyVar.r()) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.bxuy
    public final ezds f() {
        return this.k;
    }

    @Override // defpackage.bxuy
    public final Optional g() {
        return this.g;
    }

    @Override // defpackage.bxuy
    public final Long h() {
        return this.q;
    }

    public final int hashCode() {
        int iHashCode = ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
        String str = this.c;
        int iHashCode2 = ((iHashCode * 1000003) ^ (str == null ? 0 : str.hashCode())) * 1000003;
        int i = true != this.d ? 1237 : 1231;
        long j = this.e;
        int i2 = (((iHashCode2 ^ i) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003;
        String str2 = this.f;
        int iHashCode3 = (((((i2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003) ^ this.g.hashCode()) * 1000003) ^ this.h) * 1000003;
        ezds ezdsVar = this.i;
        int iHashCode4 = (iHashCode3 ^ (ezdsVar == null ? 0 : ezdsVar.hashCode())) * 1000003;
        String str3 = this.j;
        int iHashCode5 = (iHashCode4 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        ezds ezdsVar2 = this.k;
        int iHashCode6 = (iHashCode5 ^ (ezdsVar2 == null ? 0 : ezdsVar2.hashCode())) * 1000003;
        String str4 = this.l;
        int iHashCode7 = (iHashCode6 ^ (str4 == null ? 0 : str4.hashCode())) * 1000003;
        String str5 = this.m;
        int iHashCode8 = (iHashCode7 ^ (str5 == null ? 0 : str5.hashCode())) * 1000003;
        String str6 = this.n;
        int iHashCode9 = (iHashCode8 ^ (str6 == null ? 0 : str6.hashCode())) * 1000003;
        String str7 = this.o;
        int iHashCode10 = (iHashCode9 ^ (str7 == null ? 0 : str7.hashCode())) * 1000003;
        String str8 = this.p;
        int iHashCode11 = (iHashCode10 ^ (str8 == null ? 0 : str8.hashCode())) * 1000003;
        Long l = this.q;
        return ((iHashCode11 ^ (l != null ? l.hashCode() : 0)) * 1000003) ^ (true == this.r ? 1231 : 1237);
    }

    @Override // defpackage.bxuy
    public final String i() {
        return this.j;
    }

    @Override // defpackage.bxuy
    public final String j() {
        return this.l;
    }

    @Override // defpackage.bxuy
    public final String k() {
        return this.o;
    }

    @Override // defpackage.bxuy
    public final String l() {
        return this.p;
    }

    @Override // defpackage.bxuy
    public final String m() {
        return this.m;
    }

    @Override // defpackage.bxuy
    public final String n() {
        return this.n;
    }

    @Override // defpackage.bxuy
    public final String o() {
        return this.f;
    }

    @Override // defpackage.bxuy
    public final String p() {
        return this.c;
    }

    @Override // defpackage.bxuy
    public final boolean q() {
        return this.d;
    }

    @Override // defpackage.bxuy
    public final boolean r() {
        return this.r;
    }

    public final String toString() {
        ezds ezdsVar = this.k;
        ezds ezdsVar2 = this.i;
        Optional optional = this.g;
        ConversationIdType conversationIdType = this.b;
        return "LocationSearchItemData{messageId=" + this.a.toString() + ", conversationId=" + conversationIdType.toString() + ", participantNormalizedDestination=" + this.c + ", hasRbmBotRecipient=" + this.d + ", receivedTimestamp=" + this.e + ", participantFullName=" + this.f + ", participantMessagingIdentity=" + String.valueOf(optional) + ", participantSubId=" + this.h + ", addressAnnotation=" + String.valueOf(ezdsVar2) + ", addressId=" + this.j + ", linkAnnotation=" + String.valueOf(ezdsVar) + ", linkId=" + this.l + ", linkPreviewTitle=" + this.m + ", linkPreviewTriggerUrl=" + this.n + ", linkPreviewCanonicalUrl=" + this.o + ", linkPreviewImageUrl=" + this.p + ", linkPreviewExpirationTimeMillis=" + this.q + ", isStarred=" + this.r + "}";
    }
}
