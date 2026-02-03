package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bakf extends bara {
    public final cnqj a;
    public final bvdk b;
    public final Optional c;
    public final Optional d;
    public final ekgb e;
    public final boolean f;
    public final boolean g;
    public final Optional h;
    public final int i;
    public final Optional j;
    public final long k;
    public final Optional l;
    public final boolean m;
    public final boolean n;
    public final Optional o;
    public final Optional p;
    public final Optional q;
    public final Optional r;
    public final Optional s;
    public final Optional t;
    public final boolean u;
    public final ajsm v;
    public final int w;

    public bakf(cnqj cnqjVar, bvdk bvdkVar, Optional optional, Optional optional2, ekgb ekgbVar, boolean z, boolean z2, Optional optional3, int i, Optional optional4, long j, Optional optional5, boolean z3, int i2, boolean z4, Optional optional6, Optional optional7, Optional optional8, Optional optional9, Optional optional10, Optional optional11, boolean z5, ajsm ajsmVar) {
        this.a = cnqjVar;
        this.b = bvdkVar;
        this.c = optional;
        this.d = optional2;
        this.e = ekgbVar;
        this.f = z;
        this.g = z2;
        this.h = optional3;
        this.i = i;
        this.j = optional4;
        this.k = j;
        this.l = optional5;
        this.m = z3;
        this.w = i2;
        this.n = z4;
        this.o = optional6;
        this.p = optional7;
        this.q = optional8;
        this.r = optional9;
        this.s = optional10;
        this.t = optional11;
        this.u = z5;
        this.v = ajsmVar;
    }

    @Override // defpackage.bara
    public final int a() {
        return this.i;
    }

    @Override // defpackage.bara
    public final long b() {
        return this.k;
    }

    @Override // defpackage.bara
    public final ajsm c() {
        return this.v;
    }

    @Override // defpackage.bara
    public final baqz d() {
        return new bake(this);
    }

    @Override // defpackage.bara
    public final bvdk e() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof bara) {
            bara baraVar = (bara) obj;
            if (this.a.equals(baraVar.f()) && this.b.equals(baraVar.e()) && this.c.equals(baraVar.q()) && this.d.equals(baraVar.i()) && ekjz.h(this.e, baraVar.g()) && this.f == baraVar.u() && this.g == baraVar.v() && this.h.equals(baraVar.r())) {
                baraVar.y();
                if (this.i == baraVar.a() && this.j.equals(baraVar.k()) && this.k == baraVar.b() && this.l.equals(baraVar.h()) && this.m == baraVar.s()) {
                    int i = this.w;
                    int iX = baraVar.x();
                    if (i == 0) {
                        throw null;
                    }
                    if (i == iX && this.n == baraVar.t() && this.o.equals(baraVar.o()) && this.p.equals(baraVar.l()) && this.q.equals(baraVar.p()) && this.r.equals(baraVar.m()) && this.s.equals(baraVar.j()) && this.t.equals(baraVar.n()) && this.u == baraVar.w() && this.v.equals(baraVar.c())) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // defpackage.bara
    public final cnqj f() {
        return this.a;
    }

    @Override // defpackage.bara
    public final ekgb g() {
        return this.e;
    }

    @Override // defpackage.bara
    public final Optional h() {
        return this.l;
    }

    public final int hashCode() {
        int iHashCode = (((((((((((((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode()) * 1000003) ^ (true != this.f ? 1237 : 1231)) * 1000003) ^ (true != this.g ? 1237 : 1231)) * 1000003) ^ this.h.hashCode()) * (-721379959)) ^ this.i) * 1000003) ^ this.j.hashCode()) * 1000003;
        long j = this.k;
        int iHashCode2 = ((iHashCode ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ this.l.hashCode();
        int i = this.w;
        avbm.b(i);
        return (((((((((((((((((((((iHashCode2 * 1000003) ^ (true != this.m ? 1237 : 1231)) * 1000003) ^ i) * 1000003) ^ (true != this.n ? 1237 : 1231)) * 1000003) ^ this.o.hashCode()) * 1000003) ^ this.p.hashCode()) * 1000003) ^ this.q.hashCode()) * 1000003) ^ this.r.hashCode()) * 1000003) ^ this.s.hashCode()) * 1000003) ^ this.t.hashCode()) * 1000003) ^ (true == this.u ? 1231 : 1237)) * 1000003) ^ this.v.hashCode();
    }

    @Override // defpackage.bara
    public final Optional i() {
        return this.d;
    }

    @Override // defpackage.bara
    public final Optional j() {
        return this.s;
    }

    @Override // defpackage.bara
    public final Optional k() {
        return this.j;
    }

    @Override // defpackage.bara
    public final Optional l() {
        return this.p;
    }

    @Override // defpackage.bara
    public final Optional m() {
        return this.r;
    }

    @Override // defpackage.bara
    public final Optional n() {
        return this.t;
    }

    @Override // defpackage.bara
    public final Optional o() {
        return this.o;
    }

    @Override // defpackage.bara
    public final Optional p() {
        return this.q;
    }

    @Override // defpackage.bara
    public final Optional q() {
        return this.c;
    }

    @Override // defpackage.bara
    public final Optional r() {
        return this.h;
    }

    @Override // defpackage.bara
    public final boolean s() {
        return this.m;
    }

    @Override // defpackage.bara
    public final boolean t() {
        return this.n;
    }

    public final String toString() {
        ajsm ajsmVar = this.v;
        Optional optional = this.t;
        Optional optional2 = this.s;
        Optional optional3 = this.r;
        Optional optional4 = this.q;
        Optional optional5 = this.p;
        Optional optional6 = this.o;
        Optional optional7 = this.l;
        Optional optional8 = this.j;
        Optional optional9 = this.h;
        ekgb ekgbVar = this.e;
        Optional optional10 = this.d;
        Optional optional11 = this.c;
        bvdk bvdkVar = this.b;
        String strValueOf = String.valueOf(this.a);
        String strValueOf2 = String.valueOf(bvdkVar);
        String strValueOf3 = String.valueOf(optional11);
        String strValueOf4 = String.valueOf(optional10);
        String strValueOf5 = String.valueOf(ekgbVar);
        String strValueOf6 = String.valueOf(optional9);
        String strValueOf7 = String.valueOf(optional8);
        String strValueOf8 = String.valueOf(optional7);
        String strValueOf9 = String.valueOf(optional6);
        String strValueOf10 = String.valueOf(optional5);
        String strValueOf11 = String.valueOf(optional4);
        String strValueOf12 = String.valueOf(optional3);
        String strValueOf13 = String.valueOf(optional2);
        String strValueOf14 = String.valueOf(optional);
        String strValueOf15 = String.valueOf(ajsmVar);
        StringBuilder sb = new StringBuilder("GetOrCreateConversationParameters{threadId=");
        sb.append(strValueOf);
        sb.append(", archiveStatus=");
        sb.append(strValueOf2);
        sb.append(", selfId=");
        sb.append(strValueOf3);
        sb.append(", defaultSelfParticipant=");
        sb.append(strValueOf4);
        sb.append(", participants=");
        sb.append(strValueOf5);
        sb.append(", notificationEnabled=");
        sb.append(this.f);
        sb.append(", notificationVibration=");
        sb.append(this.g);
        sb.append(", soundUri=");
        sb.append(strValueOf6);
        sb.append(", sourceType=0, joinState=");
        sb.append(this.i);
        sb.append(", participantIdList=");
        sb.append(strValueOf7);
        sb.append(", rcsSessionId=");
        sb.append(this.k);
        sb.append(", conversationName=");
        sb.append(strValueOf8);
        sb.append(", hasBeenRestoredFromTelephony=");
        sb.append(this.m);
        sb.append(", restorationSource=");
        sb.append(avbm.a(this.w));
        sb.append(", isRcsGroup=");
        sb.append(this.n);
        sb.append(", rcsGroupId=");
        sb.append(strValueOf9);
        sb.append(", rcsConferenceUri=");
        sb.append(strValueOf10);
        sb.append(", rcsGroupSelfMsisdn=");
        sb.append(strValueOf11);
        sb.append(", rcsGroupCapabilities=");
        sb.append(strValueOf12);
        sb.append(", destinationToken=");
        sb.append(strValueOf13);
        boolean z = this.u;
        sb.append(", rcsGroupIconUrl=");
        sb.append(strValueOf14);
        sb.append(", shouldTriggerCreationListeners=");
        sb.append(z);
        sb.append(", conversationCreationSource=");
        sb.append(strValueOf15);
        sb.append("}");
        return sb.toString();
    }

    @Override // defpackage.bara
    public final boolean u() {
        return this.f;
    }

    @Override // defpackage.bara
    public final boolean v() {
        return this.g;
    }

    @Override // defpackage.bara
    @Deprecated
    public final boolean w() {
        return this.u;
    }

    @Override // defpackage.bara
    public final int x() {
        return this.w;
    }

    @Override // defpackage.bara
    public final void y() {
    }
}
