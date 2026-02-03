package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class amlk extends amlm {
    private final ConversationId b;
    private final ajna c;
    private final ekhx d;
    private final ajli e;
    private final long f;
    private final boolean g;
    private final int h;
    private final int i;
    private final aoer j;
    private final ekgb k;
    private final awjl l;
    private final anxd m;
    private final elwq n;
    private final akgk o;
    private final ajlj p;
    private final boolean q;
    private final int r;
    private final int s;

    public amlk(ConversationId conversationId, ajna ajnaVar, ekhx ekhxVar, ajli ajliVar, long j, int i, boolean z, int i2, int i3, aoer aoerVar, ekgb ekgbVar, awjl awjlVar, anxd anxdVar, elwq elwqVar, akgk akgkVar, ajlj ajljVar, boolean z2, int i4) {
        this.b = conversationId;
        this.c = ajnaVar;
        this.d = ekhxVar;
        this.e = ajliVar;
        this.f = j;
        this.r = i;
        this.g = z;
        this.h = i2;
        this.i = i3;
        this.j = aoerVar;
        this.k = ekgbVar;
        this.l = awjlVar;
        this.m = anxdVar;
        this.n = elwqVar;
        this.o = akgkVar;
        this.p = ajljVar;
        this.q = z2;
        this.s = i4;
    }

    @Override // defpackage.ajlh
    public final int a() {
        return this.h;
    }

    @Override // defpackage.ajlh
    public final int b() {
        return this.i;
    }

    @Override // defpackage.ajlh
    public final long c() {
        return this.f;
    }

    @Override // defpackage.ajlh
    public final ajli d() {
        return this.e;
    }

    @Override // defpackage.ajlh
    public final ajna e() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        aoer aoerVar;
        anxd anxdVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof amlm) {
            amlm amlmVar = (amlm) obj;
            if (this.b.equals(amlmVar.f()) && this.c.equals(amlmVar.e()) && this.d.equals(amlmVar.i()) && this.e.equals(amlmVar.d()) && this.f == amlmVar.c() && this.r == amlmVar.n() && this.g == amlmVar.l() && this.h == amlmVar.a() && this.i == amlmVar.b() && ((aoerVar = this.j) != null ? aoerVar.equals(amlmVar.g()) : amlmVar.g() == null) && ekjz.h(this.k, amlmVar.s()) && this.l.equals(amlmVar.r()) && ((anxdVar = this.m) != null ? anxdVar.equals(amlmVar.q()) : amlmVar.q() == null) && this.n.equals(amlmVar.t()) && this.o.equals(amlmVar.p()) && this.p.equals(amlmVar.o()) && this.q == amlmVar.u() && this.s == amlmVar.v()) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.ajlh
    public final ConversationId f() {
        return this.b;
    }

    @Override // defpackage.amlm, defpackage.ajlh
    public final aoer g() {
        return this.j;
    }

    public final int hashCode() {
        int iHashCode = ((((((this.b.hashCode() ^ 1000003) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode();
        aoer aoerVar = this.j;
        int iHashCode2 = aoerVar == null ? 0 : aoerVar.hashCode();
        long j = this.f;
        int iHashCode3 = ((((((((((((((((iHashCode * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ this.r) * 1000003) ^ (true != this.g ? 1237 : 1231)) * 1000003) ^ this.h) * 1000003) ^ this.i) * 1000003) ^ iHashCode2) * 1000003) ^ this.k.hashCode()) * 1000003) ^ this.l.hashCode()) * 1000003;
        anxd anxdVar = this.m;
        return ((((((((((iHashCode3 ^ (anxdVar != null ? anxdVar.hashCode() : 0)) * 1000003) ^ this.n.hashCode()) * 1000003) ^ this.o.hashCode()) * 1000003) ^ this.p.hashCode()) * 1000003) ^ (true == this.q ? 1231 : 1237)) * 1000003) ^ this.s;
    }

    @Override // defpackage.ajlh
    public final ekhx i() {
        return this.d;
    }

    @Override // defpackage.ajlh
    public final boolean l() {
        return this.g;
    }

    @Override // defpackage.ajlh
    public final int n() {
        return this.r;
    }

    @Override // defpackage.amlm
    public final ajlj o() {
        return this.p;
    }

    @Override // defpackage.amlm
    public final akgk p() {
        return this.o;
    }

    @Override // defpackage.amlm
    public final anxd q() {
        return this.m;
    }

    @Override // defpackage.amlm
    public final awjl r() {
        return this.l;
    }

    @Override // defpackage.amlm
    public final ekgb s() {
        return this.k;
    }

    @Override // defpackage.amlm
    public final elwq t() {
        return this.n;
    }

    public final String toString() {
        int i = this.s;
        ajlj ajljVar = this.p;
        akgk akgkVar = this.o;
        elwq elwqVar = this.n;
        anxd anxdVar = this.m;
        awjl awjlVar = this.l;
        ekgb ekgbVar = this.k;
        aoer aoerVar = this.j;
        ajli ajliVar = this.e;
        ekhx ekhxVar = this.d;
        ajna ajnaVar = this.c;
        return "BugleComposeConstraints{conversationId=" + this.b.toString() + ", bestAvailableTransportFeatureSet=" + ajnaVar.toString() + ", supportedTransportFeatureSets=" + String.valueOf(ekhxVar) + ", composeDisabledReason=" + ajliVar.toString() + ", maxMessageSizeBytes=" + this.f + ", attachmentMode=" + ajlg.a(this.r) + ", locationSharingSupported=" + this.g + ", attachmentCountLimit=" + this.h + ", textLengthLimit=" + this.i + ", selfIdentity=" + String.valueOf(aoerVar) + ", recipients=" + ekgbVar.toString() + ", destinationToken=" + awjlVar.toString() + ", aggregateCapabilities=" + String.valueOf(anxdVar) + ", conversationProtocolConditions=" + elwqVar.toString() + ", palMode=" + akgkVar.toString() + ", conversationKind=" + ajljVar.toString() + ", wasRcsConversation=" + this.q + ", encryptionAlgorithm=" + (i != 1 ? "SCYTALE" : "NONE") + "}";
    }

    @Override // defpackage.amlm
    public final boolean u() {
        return this.q;
    }

    @Override // defpackage.amlm
    public final int v() {
        return this.s;
    }
}
