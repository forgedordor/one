package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class aiyw extends ajbl {
    private final eiju a;
    private final enwr b;
    private final elsf c;
    private final int d;
    private final int e;
    private final int f;
    private final int g;
    private final int h;
    private final int i;
    private final elup j;
    private final int k;
    private final ekgp l;
    private final ekgp m;
    private final ekgp n;
    private final int o;
    private final ekhx p;

    public aiyw(eiju eijuVar, enwr enwrVar, elsf elsfVar, int i, int i2, int i3, int i4, int i5, int i6, elup elupVar, int i7, ekgp ekgpVar, ekgp ekgpVar2, ekgp ekgpVar3, int i8, ekhx ekhxVar) {
        this.a = eijuVar;
        if (enwrVar == null) {
            throw new NullPointerException("Null rcsAvailability");
        }
        this.b = enwrVar;
        if (elsfVar == null) {
            throw new NullPointerException("Null rcsUninitializedReason");
        }
        this.c = elsfVar;
        this.d = i;
        this.e = i2;
        this.f = i3;
        this.g = i4;
        this.h = i5;
        this.i = i6;
        if (elupVar == null) {
            throw new NullPointerException("Null happinessTrackingMode");
        }
        this.j = elupVar;
        this.k = i7;
        if (ekgpVar == null) {
            throw new NullPointerException("Null rbmBotsFromInteractiveRbmConversations1Day");
        }
        this.l = ekgpVar;
        if (ekgpVar2 == null) {
            throw new NullPointerException("Null rbmBotsFromInteractiveRbmConversations7Days");
        }
        this.m = ekgpVar2;
        if (ekgpVar3 == null) {
            throw new NullPointerException("Null rbmBotsFromInteractiveRbmConversations28Days");
        }
        this.n = ekgpVar3;
        this.o = i8;
        if (ekhxVar == null) {
            throw new NullPointerException("Null rcsAvailabilityForSim");
        }
        this.p = ekhxVar;
    }

    @Override // defpackage.ajbl
    public final int a() {
        return this.d;
    }

    @Override // defpackage.ajbl
    public final int b() {
        return this.e;
    }

    @Override // defpackage.ajbl
    public final int c() {
        return this.h;
    }

    @Override // defpackage.ajbl
    public final int d() {
        return this.i;
    }

    @Override // defpackage.ajbl
    public final int e() {
        return this.k;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ajbl) {
            ajbl ajblVar = (ajbl) obj;
            if (this.a.equals(ajblVar.i()) && this.b.equals(ajblVar.p()) && this.c.equals(ajblVar.n()) && this.d == ajblVar.a() && this.e == ajblVar.b() && this.f == ajblVar.g() && this.g == ajblVar.h() && this.h == ajblVar.c() && this.i == ajblVar.d() && this.j.equals(ajblVar.o()) && this.k == ajblVar.e() && this.l.equals(ajblVar.j()) && this.m.equals(ajblVar.l()) && this.n.equals(ajblVar.k()) && this.o == ajblVar.f() && this.p.equals(ajblVar.m())) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.ajbl
    public final int f() {
        return this.o;
    }

    @Override // defpackage.ajbl
    public final int g() {
        return this.f;
    }

    @Override // defpackage.ajbl
    public final int h() {
        return this.g;
    }

    public final int hashCode() {
        return ((((((((((((((((((((((((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d) * 1000003) ^ this.e) * 1000003) ^ this.f) * 1000003) ^ this.g) * 1000003) ^ this.h) * 1000003) ^ this.i) * 1000003) ^ this.j.hashCode()) * 1000003) ^ this.k) * 1000003) ^ this.l.hashCode()) * 1000003) ^ this.m.hashCode()) * 1000003) ^ this.n.hashCode()) * 1000003) ^ this.o) * 1000003) ^ this.p.hashCode();
    }

    @Override // defpackage.ajbl
    public final eiju i() {
        return this.a;
    }

    @Override // defpackage.ajbl
    public final ekgp j() {
        return this.l;
    }

    @Override // defpackage.ajbl
    public final ekgp k() {
        return this.n;
    }

    @Override // defpackage.ajbl
    public final ekgp l() {
        return this.m;
    }

    @Override // defpackage.ajbl
    public final ekhx m() {
        return this.p;
    }

    @Override // defpackage.ajbl
    public final elsf n() {
        return this.c;
    }

    @Override // defpackage.ajbl
    public final elup o() {
        return this.j;
    }

    @Override // defpackage.ajbl
    public final enwr p() {
        return this.b;
    }

    public final String toString() {
        ekhx ekhxVar = this.p;
        ekgp ekgpVar = this.n;
        ekgp ekgpVar2 = this.m;
        ekgp ekgpVar3 = this.l;
        elup elupVar = this.j;
        elsf elsfVar = this.c;
        enwr enwrVar = this.b;
        return "SharedRecurringMetrics{engagementLevel=" + this.a.toString() + ", rcsAvailability=" + enwrVar.toString() + ", rcsUninitializedReason=" + elsfVar.toString() + ", activeRcsGroups1DayCount=" + this.d + ", activeRcsGroups28DayCount=" + this.e + ", outgoingRcsFtSuccess1DayCount=" + this.f + ", outgoingRcsFtSuccess28DaysCount=" + this.g + ", activeShortCodeConversations1DayCount=" + this.h + ", activeShortCodeConversations28DaysCount=" + this.i + ", happinessTrackingMode=" + elupVar.toString() + ", happinessTrackingDisabledReasons=" + this.k + ", rbmBotsFromInteractiveRbmConversations1Day=" + ekgpVar3.toString() + ", rbmBotsFromInteractiveRbmConversations7Days=" + ekgpVar2.toString() + ", rbmBotsFromInteractiveRbmConversations28Days=" + ekgpVar.toString() + ", messageCount=" + this.o + ", rcsAvailabilityForSim=" + ekhxVar.toString() + "}";
    }
}
