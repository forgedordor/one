package defpackage;

import java.util.function.Predicate;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dzkx extends dzlf {
    public final String a;
    public final boolean b;
    public final feix c;
    public final feeg d;
    public final String e;
    public final Long f;
    public final boolean g;
    public final dzok h;
    public final boolean i;
    public final int j;
    public final Predicate k;
    public final dzii l;
    public final int m;

    public dzkx(String str, boolean z, feix feixVar, feeg feegVar, String str2, Long l, boolean z2, dzok dzokVar, boolean z3, int i, Predicate predicate, dzii dziiVar, int i2) {
        this.a = str;
        this.b = z;
        this.c = feixVar;
        this.d = feegVar;
        this.e = str2;
        this.f = l;
        this.g = z2;
        this.h = dzokVar;
        this.i = z3;
        this.j = i;
        this.k = predicate;
        this.l = dziiVar;
        this.m = i2;
    }

    @Override // defpackage.dzlf
    public final int a() {
        return this.m;
    }

    @Override // defpackage.dzlf
    public final int b() {
        return this.j;
    }

    @Override // defpackage.dzlf
    public final dzii c() {
        return this.l;
    }

    @Override // defpackage.dzlf
    public final dzok d() {
        return this.h;
    }

    @Override // defpackage.dzlf
    public final Long e() {
        return this.f;
    }

    public final boolean equals(Object obj) {
        feeg feegVar;
        String str;
        Long l;
        dzii dziiVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof dzlf) {
            dzlf dzlfVar = (dzlf) obj;
            String str2 = this.a;
            if (str2 != null ? str2.equals(dzlfVar.g()) : dzlfVar.g() == null) {
                if (this.b == dzlfVar.k() && this.c.equals(dzlfVar.j()) && ((feegVar = this.d) != null ? feegVar.equals(dzlfVar.i()) : dzlfVar.i() == null) && ((str = this.e) != null ? str.equals(dzlfVar.f()) : dzlfVar.f() == null) && ((l = this.f) != null ? l.equals(dzlfVar.e()) : dzlfVar.e() == null) && this.g == dzlfVar.l()) {
                    if (this.h != null) {
                        dzlfVar.d();
                        throw null;
                    }
                    if (dzlfVar.d() == null && this.i == dzlfVar.m() && this.j == dzlfVar.b() && this.k.equals(dzlfVar.h()) && ((dziiVar = this.l) != null ? dziiVar.equals(dzlfVar.c()) : dzlfVar.c() == null) && this.m == dzlfVar.a()) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // defpackage.dzlf
    public final String f() {
        return this.e;
    }

    @Override // defpackage.dzlf
    public final String g() {
        return this.a;
    }

    @Override // defpackage.dzlf
    public final Predicate h() {
        return this.k;
    }

    public final int hashCode() {
        String str = this.a;
        int iHashCode = ((((((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003) ^ (true != this.b ? 1237 : 1231)) * 1000003) ^ this.c.hashCode()) * 1000003;
        feeg feegVar = this.d;
        int iHashCode2 = (iHashCode ^ (feegVar == null ? 0 : feegVar.hashCode())) * 1000003;
        String str2 = this.e;
        int iHashCode3 = (iHashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        Long l = this.f;
        int iHashCode4 = (iHashCode3 ^ (l == null ? 0 : l.hashCode())) * 1000003;
        int i = true != this.g ? 1237 : 1231;
        if (this.h != null) {
            throw null;
        }
        int iHashCode5 = (((((((iHashCode4 ^ i) * (-721379959)) ^ (true == this.i ? 1231 : 1237)) * 1000003) ^ this.j) * 1000003) ^ this.k.hashCode()) * 1000003;
        dzii dziiVar = this.l;
        return ((iHashCode5 ^ (dziiVar != null ? dziiVar.hashCode() : 0)) * 1000003) ^ this.m;
    }

    @Override // defpackage.dzlf
    public final feeg i() {
        return this.d;
    }

    @Override // defpackage.dzlf
    public final feix j() {
        return this.c;
    }

    @Override // defpackage.dzlf
    public final boolean k() {
        return this.b;
    }

    @Override // defpackage.dzlf
    public final boolean l() {
        return this.g;
    }

    @Override // defpackage.dzlf
    public final boolean m() {
        return this.i;
    }

    public final String toString() {
        dzii dziiVar = this.l;
        Predicate predicate = this.k;
        dzok dzokVar = this.h;
        feeg feegVar = this.d;
        return "Metric{customEventName=" + this.a + ", isEventNameConstant=" + this.b + ", metric=" + this.c.toString() + ", metricExtension=" + String.valueOf(feegVar) + ", accountableComponentName=" + this.e + ", sampleRatePermille=" + this.f + ", isUnsampled=" + this.g + ", activeCuiId=" + String.valueOf(dzokVar) + ", shouldAttachActiveTraces=" + this.i + ", maxActiveTraces=" + this.j + ", activeTracePredicate=" + predicate.toString() + ", debugLogsTime=" + String.valueOf(dziiVar) + ", debugLogsSize=" + this.m + "}";
    }
}
