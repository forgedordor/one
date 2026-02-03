package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class ciaj extends cicr {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final Optional d;
    public final Optional e;
    public final Optional f;
    public final Optional g;
    public final Optional h;
    public final Optional i;
    public final Optional j;
    public final Optional k;
    public final Optional l;
    public final Optional m;
    public final Optional n;
    public final int o;
    public final cnqj p;
    public final boolean q;
    public final Optional r;
    public final Optional s;
    public final boolean t;
    public final ajsm u;
    public final int v;

    public ciaj(boolean z, boolean z2, boolean z3, Optional optional, Optional optional2, Optional optional3, Optional optional4, Optional optional5, Optional optional6, Optional optional7, Optional optional8, Optional optional9, Optional optional10, Optional optional11, int i, cnqj cnqjVar, boolean z4, int i2, Optional optional12, Optional optional13, boolean z5, ajsm ajsmVar) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = optional;
        this.e = optional2;
        this.f = optional3;
        this.g = optional4;
        this.h = optional5;
        this.i = optional6;
        this.j = optional7;
        this.k = optional8;
        this.l = optional9;
        this.m = optional10;
        this.n = optional11;
        this.o = i;
        this.p = cnqjVar;
        this.q = z4;
        this.v = i2;
        this.r = optional12;
        this.s = optional13;
        this.t = z5;
        this.u = ajsmVar;
    }

    @Override // defpackage.cicr
    public final int a() {
        return this.o;
    }

    @Override // defpackage.cicr
    public final ajsm b() {
        return this.u;
    }

    @Override // defpackage.cicr
    public final cnqj c() {
        return this.p;
    }

    @Override // defpackage.cicr
    public final Optional d() {
        return this.r;
    }

    @Override // defpackage.cicr
    public final Optional e() {
        return this.k;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof cicr) {
            cicr cicrVar = (cicr) obj;
            if (this.a == cicrVar.q() && this.b == cicrVar.s() && this.c == cicrVar.t() && this.d.equals(cicrVar.p()) && this.e.equals(cicrVar.m()) && this.f.equals(cicrVar.l()) && this.g.equals(cicrVar.i()) && this.h.equals(cicrVar.g()) && this.i.equals(cicrVar.k()) && this.j.equals(cicrVar.o()) && this.k.equals(cicrVar.e()) && this.l.equals(cicrVar.h()) && this.m.equals(cicrVar.j()) && this.n.equals(cicrVar.n()) && this.o == cicrVar.a() && this.p.equals(cicrVar.c()) && this.q == cicrVar.r()) {
                int i = this.v;
                int iV = cicrVar.v();
                if (i == 0) {
                    throw null;
                }
                if (i == iV && this.r.equals(cicrVar.d()) && this.s.equals(cicrVar.f()) && this.t == cicrVar.u() && this.u.equals(cicrVar.b())) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // defpackage.cicr
    public final Optional f() {
        return this.s;
    }

    @Override // defpackage.cicr
    public final Optional g() {
        return this.h;
    }

    @Override // defpackage.cicr
    public final Optional h() {
        return this.l;
    }

    public final int hashCode() {
        int i = true != this.a ? 1237 : 1231;
        int iHashCode = ((((((((((((((((((((((((((((((i ^ 1000003) * 1000003) ^ (true != this.b ? 1237 : 1231)) * 1000003) ^ (true != this.c ? 1237 : 1231)) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode()) * 1000003) ^ this.f.hashCode()) * 1000003) ^ this.g.hashCode()) * 1000003) ^ this.h.hashCode()) * 1000003) ^ this.i.hashCode()) * 1000003) ^ this.j.hashCode()) * 1000003) ^ this.k.hashCode()) * 1000003) ^ this.l.hashCode()) * 1000003) ^ this.m.hashCode()) * 1000003) ^ this.n.hashCode()) * 1000003) ^ this.o) * 1000003) ^ this.p.hashCode();
        int i2 = this.v;
        avbm.b(i2);
        return (((((((((((iHashCode * 1000003) ^ (true != this.q ? 1237 : 1231)) * 1000003) ^ i2) * 1000003) ^ this.r.hashCode()) * 1000003) ^ this.s.hashCode()) * 1000003) ^ (true == this.t ? 1231 : 1237)) * 1000003) ^ this.u.hashCode();
    }

    @Override // defpackage.cicr
    public final Optional i() {
        return this.g;
    }

    @Override // defpackage.cicr
    public final Optional j() {
        return this.m;
    }

    @Override // defpackage.cicr
    public final Optional k() {
        return this.i;
    }

    @Override // defpackage.cicr
    public final Optional l() {
        return this.f;
    }

    @Override // defpackage.cicr
    public final Optional m() {
        return this.e;
    }

    @Override // defpackage.cicr
    public final Optional n() {
        return this.n;
    }

    @Override // defpackage.cicr
    public final Optional o() {
        return this.j;
    }

    @Override // defpackage.cicr
    public final Optional p() {
        return this.d;
    }

    @Override // defpackage.cicr
    public final boolean q() {
        return this.a;
    }

    @Override // defpackage.cicr
    public final boolean r() {
        return this.q;
    }

    @Override // defpackage.cicr
    public final boolean s() {
        return this.b;
    }

    @Override // defpackage.cicr
    public final boolean t() {
        return this.c;
    }

    public final String toString() {
        ajsm ajsmVar = this.u;
        Optional optional = this.s;
        Optional optional2 = this.r;
        cnqj cnqjVar = this.p;
        Optional optional3 = this.n;
        Optional optional4 = this.m;
        Optional optional5 = this.l;
        Optional optional6 = this.k;
        Optional optional7 = this.j;
        Optional optional8 = this.i;
        Optional optional9 = this.h;
        Optional optional10 = this.g;
        Optional optional11 = this.f;
        Optional optional12 = this.e;
        String strValueOf = String.valueOf(this.d);
        String strValueOf2 = String.valueOf(optional12);
        String strValueOf3 = String.valueOf(optional11);
        String strValueOf4 = String.valueOf(optional10);
        String strValueOf5 = String.valueOf(optional9);
        String strValueOf6 = String.valueOf(optional8);
        String strValueOf7 = String.valueOf(optional7);
        String strValueOf8 = String.valueOf(optional6);
        String strValueOf9 = String.valueOf(optional5);
        String strValueOf10 = String.valueOf(optional4);
        String strValueOf11 = String.valueOf(optional3);
        String strValueOf12 = String.valueOf(cnqjVar);
        String strValueOf13 = String.valueOf(optional2);
        String strValueOf14 = String.valueOf(optional);
        String strValueOf15 = String.valueOf(ajsmVar);
        StringBuilder sb = new StringBuilder("RcsConversationAndThreadIdQueryParameters{createConversationIfNotPresent=");
        sb.append(this.a);
        sb.append(", isBot=");
        sb.append(this.b);
        sb.append(", isRcsGroup=");
        sb.append(this.c);
        sb.append(", rcsSessionId=");
        sb.append(strValueOf);
        sb.append(", rcsGroupInfo=");
        sb.append(strValueOf2);
        sb.append(", rcsGroupId=");
        sb.append(strValueOf3);
        sb.append(", rcsConferenceUri=");
        sb.append(strValueOf4);
        sb.append(", groupName=");
        sb.append(strValueOf5);
        sb.append(", rcsGroupIconUrl=");
        sb.append(strValueOf6);
        sb.append(", rcsGroupSelfMsisdn=");
        sb.append(strValueOf7);
        sb.append(", defaultSelfParticipant=");
        sb.append(strValueOf8);
        sb.append(", participants=");
        sb.append(strValueOf9);
        sb.append(", rcsGroupCapabilities=");
        sb.append(strValueOf10);
        sb.append(", rcsGroupResolutionTriggerSource=");
        sb.append(strValueOf11);
        sb.append(", rcsGroupJoinState=");
        sb.append(this.o);
        sb.append(", knownThreadForConversationCreation=");
        sb.append(strValueOf12);
        sb.append(", hasBeenRestoredFromTelephony=");
        sb.append(this.q);
        sb.append(", restorationSource=");
        sb.append(avbm.a(this.v));
        sb.append(", customHeaders=");
        sb.append(strValueOf13);
        sb.append(", destinationToken=");
        sb.append(strValueOf14);
        boolean z = this.t;
        sb.append(", shouldTriggerCreationListeners=");
        sb.append(z);
        sb.append(", conversationCreationSource=");
        sb.append(strValueOf15);
        sb.append("}");
        return sb.toString();
    }

    @Override // defpackage.cicr
    @Deprecated
    public final boolean u() {
        return this.t;
    }

    @Override // defpackage.cicr
    public final int v() {
        return this.v;
    }
}
