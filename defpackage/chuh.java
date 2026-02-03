package defpackage;

import android.os.Bundle;
import com.google.android.ims.rcsservice.locationsharing.LocationInformation;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class chuh extends chxo {
    public final basd a;
    public final aubq b;
    public final aubq c;
    public final axcm d;
    public final boolean e;
    public final awpx f;
    public final String g;
    public final long h;
    public final long i;
    public final String j;
    private final basd k;
    private final String l;
    private final awjl m;
    private final String n;
    private final String o;
    private final long p;
    private final int q;
    private final boolean r;
    private final eyga s;
    private final LocationInformation t;
    private final int u;
    private final Bundle v;
    private final boolean w;
    private final boolean x;
    private final boolean y;

    public chuh(basd basdVar, basd basdVar2, String str, aubq aubqVar, awjl awjlVar, aubq aubqVar2, axcm axcmVar, String str2, boolean z, awpx awpxVar, String str3, String str4, long j, long j2, String str5, long j3, int i, boolean z2, eyga eygaVar, LocationInformation locationInformation, int i2, Bundle bundle, boolean z3, boolean z4, boolean z5) {
        this.a = basdVar;
        this.k = basdVar2;
        this.l = str;
        this.b = aubqVar;
        this.m = awjlVar;
        this.c = aubqVar2;
        this.d = axcmVar;
        this.n = str2;
        this.e = z;
        this.f = awpxVar;
        this.g = str3;
        this.o = str4;
        this.h = j;
        this.i = j2;
        this.j = str5;
        this.p = j3;
        this.q = i;
        this.r = z2;
        this.s = eygaVar;
        this.t = locationInformation;
        this.u = i2;
        this.v = bundle;
        this.w = z3;
        this.x = z4;
        this.y = z5;
    }

    @Override // defpackage.chxo
    public final int a() {
        return this.u;
    }

    @Override // defpackage.chxo
    public final int b() {
        return this.q;
    }

    @Override // defpackage.chxo
    public final long c() {
        return this.p;
    }

    @Override // defpackage.chxo
    public final long d() {
        return this.i;
    }

    @Override // defpackage.chxo
    public final long e() {
        return this.h;
    }

    public final boolean equals(Object obj) {
        basd basdVar;
        axcm axcmVar;
        String str;
        awpx awpxVar;
        String str2;
        String str3;
        String str4;
        eyga eygaVar;
        LocationInformation locationInformation;
        if (obj == this) {
            return true;
        }
        if (obj instanceof chxo) {
            chxo chxoVar = (chxo) obj;
            chxoVar.E();
            if (this.a.equals(chxoVar.m()) && ((basdVar = this.k) != null ? basdVar.equals(chxoVar.l()) : chxoVar.l() == null) && this.l.equals(chxoVar.t()) && this.b.equals(chxoVar.g()) && this.m.equals(chxoVar.i()) && this.c.equals(chxoVar.h()) && ((axcmVar = this.d) != null ? axcmVar.equals(chxoVar.k()) : chxoVar.k() == null) && ((str = this.n) != null ? str.equals(chxoVar.q()) : chxoVar.q() == null)) {
                chxoVar.C();
                if (this.e == chxoVar.w() && ((awpxVar = this.f) != null ? awpxVar.equals(chxoVar.j()) : chxoVar.j() == null) && ((str2 = this.g) != null ? str2.equals(chxoVar.s()) : chxoVar.s() == null) && ((str3 = this.o) != null ? str3.equals(chxoVar.r()) : chxoVar.r() == null) && this.h == chxoVar.e() && this.i == chxoVar.d() && ((str4 = this.j) != null ? str4.equals(chxoVar.p()) : chxoVar.p() == null) && this.p == chxoVar.c()) {
                    chxoVar.z();
                    chxoVar.A();
                    if (this.q == chxoVar.b() && this.r == chxoVar.x() && ((eygaVar = this.s) != null ? eygaVar.equals(chxoVar.o()) : chxoVar.o() == null) && ((locationInformation = this.t) != null ? locationInformation.equals(chxoVar.n()) : chxoVar.n() == null) && this.u == chxoVar.a() && this.v.equals(chxoVar.f()) && this.w == chxoVar.u() && this.x == chxoVar.y() && this.y == chxoVar.v()) {
                        chxoVar.D();
                        chxoVar.B();
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // defpackage.chxo
    public final Bundle f() {
        return this.v;
    }

    @Override // defpackage.chxo
    public final aubq g() {
        return this.b;
    }

    @Override // defpackage.chxo
    public final aubq h() {
        return this.c;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() ^ (-721379959);
        basd basdVar = this.k;
        int iHashCode2 = (((((((((iHashCode * 1000003) ^ (basdVar == null ? 0 : basdVar.hashCode())) * 1000003) ^ this.l.hashCode()) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.m.hashCode()) * 1000003) ^ this.c.hashCode();
        axcm axcmVar = this.d;
        int iHashCode3 = ((iHashCode2 * 1000003) ^ (axcmVar == null ? 0 : axcmVar.hashCode())) * 1000003;
        String str = this.n;
        int iHashCode4 = (((iHashCode3 ^ (str == null ? 0 : str.hashCode())) * (-721379959)) ^ (true != this.e ? 1237 : 1231)) * 1000003;
        awpx awpxVar = this.f;
        int iHashCode5 = (iHashCode4 ^ (awpxVar == null ? 0 : awpxVar.hashCode())) * 1000003;
        String str2 = this.g;
        int iHashCode6 = (iHashCode5 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.o;
        int iHashCode7 = str3 == null ? 0 : str3.hashCode();
        long j = this.h;
        int i = (((iHashCode6 ^ iHashCode7) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003;
        long j2 = this.i;
        int i2 = (i ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003;
        String str4 = this.j;
        int iHashCode8 = (i2 ^ (str4 == null ? 0 : str4.hashCode())) * 1000003;
        long j3 = this.p;
        int i3 = (((((iHashCode8 ^ ((int) (j3 ^ (j3 >>> 32)))) * 583896283) ^ this.q) * 1000003) ^ (true != this.r ? 1237 : 1231)) * 1000003;
        eyga eygaVar = this.s;
        int iHashCode9 = (i3 ^ (eygaVar == null ? 0 : eygaVar.hashCode())) * 1000003;
        LocationInformation locationInformation = this.t;
        return (((((((((((((iHashCode9 ^ (locationInformation != null ? locationInformation.hashCode() : 0)) * 1000003) ^ this.u) * 1000003) ^ this.v.hashCode()) * 1000003) ^ (true != this.w ? 1237 : 1231)) * 1000003) ^ (true != this.x ? 1237 : 1231)) * 1000003) ^ (true != this.y ? 1237 : 1231)) * 1000003) ^ 1237) * 1000003;
    }

    @Override // defpackage.chxo
    public final awjl i() {
        return this.m;
    }

    @Override // defpackage.chxo
    public final awpx j() {
        return this.f;
    }

    @Override // defpackage.chxo
    public final axcm k() {
        return this.d;
    }

    @Override // defpackage.chxo
    public final basd l() {
        return this.k;
    }

    @Override // defpackage.chxo
    public final basd m() {
        return this.a;
    }

    @Override // defpackage.chxo
    public final LocationInformation n() {
        return this.t;
    }

    @Override // defpackage.chxo
    public final eyga o() {
        return this.s;
    }

    @Override // defpackage.chxo
    public final String p() {
        return this.j;
    }

    @Override // defpackage.chxo
    public final String q() {
        return this.n;
    }

    @Override // defpackage.chxo
    public final String r() {
        return this.o;
    }

    @Override // defpackage.chxo
    public final String s() {
        return this.g;
    }

    @Override // defpackage.chxo
    @Deprecated
    public final String t() {
        return this.l;
    }

    public final String toString() {
        Bundle bundle = this.v;
        LocationInformation locationInformation = this.t;
        eyga eygaVar = this.s;
        awpx awpxVar = this.f;
        axcm axcmVar = this.d;
        aubq aubqVar = this.c;
        awjl awjlVar = this.m;
        aubq aubqVar2 = this.b;
        basd basdVar = this.k;
        String string = this.a.toString();
        String strValueOf = String.valueOf(basdVar);
        String string2 = aubqVar2.toString();
        String string3 = awjlVar.toString();
        String string4 = aubqVar.toString();
        String strValueOf2 = String.valueOf(axcmVar);
        String strValueOf3 = String.valueOf(awpxVar);
        String strValueOf4 = String.valueOf(eygaVar);
        String strValueOf5 = String.valueOf(locationInformation);
        String string5 = bundle.toString();
        StringBuilder sb = new StringBuilder("ReceiveRcsActionParameters{traceId=null, rcsMessageId=");
        sb.append(string);
        sb.append(", originalRcsMessageId=");
        sb.append(strValueOf);
        sb.append(", remoteUserId=");
        sb.append(this.l);
        sb.append(", remoteChatEndpoint=");
        sb.append(string2);
        sb.append(", senderDestinationToken=");
        sb.append(string3);
        sb.append(", selfChatEndpoint=");
        sb.append(string4);
        sb.append(", myIdentityToken=");
        sb.append(strValueOf2);
        sb.append(", messageRawText=");
        sb.append(this.n);
        sb.append(", remoteInstance=null, isGroup=");
        sb.append(this.e);
        sb.append(", groupToken=");
        sb.append(strValueOf3);
        sb.append(", rcsConversationId=");
        sb.append(this.g);
        sb.append(", rcsConferenceUri=");
        sb.append(this.o);
        sb.append(", sentTimestamp=");
        sb.append(this.h);
        sb.append(", receivedTimestamp=");
        sb.append(this.i);
        sb.append(", contentType=");
        sb.append(this.j);
        sb.append(", rcsSessionId=");
        sb.append(this.p);
        sb.append(", alias=null, groupInfo=null, spamVerdict=");
        sb.append(this.q);
        sb.append(", isMarkedAsBot=");
        sb.append(this.r);
        sb.append(", customHeaders=");
        sb.append(strValueOf4);
        sb.append(", locationInformation=");
        sb.append(strValueOf5);
        sb.append(", messageStatus=");
        sb.append(this.u);
        boolean z = this.y;
        boolean z2 = this.x;
        boolean z3 = this.w;
        sb.append(", additionalMessageDetails=");
        sb.append(string5);
        sb.append(", isDeliveryReportRequested=");
        sb.append(z3);
        sb.append(", isNegativeDeliveryReportRequested=");
        sb.append(z2);
        sb.append(", isDisplayReportRequested=");
        sb.append(z);
        sb.append(", shouldClearTypingIndicator=false, incomingChatMessageRequest=null}");
        return sb.toString();
    }

    @Override // defpackage.chxo
    public final boolean u() {
        return this.w;
    }

    @Override // defpackage.chxo
    public final boolean v() {
        return this.y;
    }

    @Override // defpackage.chxo
    public final boolean w() {
        return this.e;
    }

    @Override // defpackage.chxo
    public final boolean x() {
        return this.r;
    }

    @Override // defpackage.chxo
    public final boolean y() {
        return this.x;
    }

    @Override // defpackage.chxo
    public final void A() {
    }

    @Override // defpackage.chxo
    public final void B() {
    }

    @Override // defpackage.chxo
    public final void C() {
    }

    @Override // defpackage.chxo
    public final void D() {
    }

    @Override // defpackage.chxo
    public final void E() {
    }

    @Override // defpackage.chxo
    public final void z() {
    }
}
