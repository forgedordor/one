package defpackage;

import j$.time.Instant;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
abstract class eaoo extends easp {
    public final easo a;
    public final List b;
    public final List c;
    public final List d;
    public final Boolean e;
    public final Instant f;
    public final Instant g;

    public eaoo(easo easoVar, List list, List list2, List list3, Boolean bool, Instant instant, Instant instant2) {
        this.a = easoVar;
        if (list == null) {
            throw new NullPointerException("Null periods");
        }
        this.b = list;
        if (list2 == null) {
            throw new NullPointerException("Null specialDays");
        }
        this.c = list2;
        if (list3 == null) {
            throw new NullPointerException("Null weekdayText");
        }
        this.d = list3;
        this.e = bool;
        this.f = instant;
        this.g = instant2;
    }

    @Override // defpackage.easp
    public final easo a() {
        return this.a;
    }

    @Override // defpackage.easp
    public final Instant b() {
        return this.g;
    }

    @Override // defpackage.easp
    public final Instant c() {
        return this.f;
    }

    @Override // defpackage.easp
    public final Boolean d() {
        return this.e;
    }

    @Override // defpackage.easp
    public final List e() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        Boolean bool;
        Instant instant;
        Instant instant2;
        if (obj == this) {
            return true;
        }
        if (obj instanceof easp) {
            easp easpVar = (easp) obj;
            easo easoVar = this.a;
            if (easoVar != null ? easoVar.equals(easpVar.a()) : easpVar.a() == null) {
                if (this.b.equals(easpVar.e()) && this.c.equals(easpVar.f()) && this.d.equals(easpVar.g()) && ((bool = this.e) != null ? bool.equals(easpVar.d()) : easpVar.d() == null) && ((instant = this.f) != null ? instant.equals(easpVar.c()) : easpVar.c() == null) && ((instant2 = this.g) != null ? instant2.equals(easpVar.b()) : easpVar.b() == null)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // defpackage.easp
    public final List f() {
        return this.c;
    }

    @Override // defpackage.easp
    public final List g() {
        return this.d;
    }

    public final int hashCode() {
        easo easoVar = this.a;
        int iHashCode = (((((((easoVar == null ? 0 : easoVar.hashCode()) ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode();
        Boolean bool = this.e;
        int iHashCode2 = ((iHashCode * 1000003) ^ (bool == null ? 0 : bool.hashCode())) * 1000003;
        Instant instant = this.f;
        int iHashCode3 = (iHashCode2 ^ (instant == null ? 0 : instant.hashCode())) * 1000003;
        Instant instant2 = this.g;
        return iHashCode3 ^ (instant2 != null ? instant2.hashCode() : 0);
    }

    public final String toString() {
        Instant instant = this.g;
        Instant instant2 = this.f;
        List list = this.d;
        List list2 = this.c;
        List list3 = this.b;
        return "OpeningHours{hoursType=" + String.valueOf(this.a) + ", periods=" + list3.toString() + ", specialDays=" + list2.toString() + ", weekdayText=" + list.toString() + ", openNow=" + this.e + ", nextOpen=" + String.valueOf(instant2) + ", nextClose=" + String.valueOf(instant) + "}";
    }
}
