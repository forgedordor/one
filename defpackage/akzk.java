package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class akzk {
    public final ekgb a;
    public final ekgb b;
    public final Optional c;
    public final boolean d;
    public final Integer e;
    public final boolean f;
    public final boolean g;
    public final int h;

    public akzk(ekgb ekgbVar, ekgb ekgbVar2, Optional optional, int i, boolean z, Integer num, boolean z2, boolean z3) {
        ekgbVar.getClass();
        ekgbVar2.getClass();
        optional.getClass();
        this.a = ekgbVar;
        this.b = ekgbVar2;
        this.c = optional;
        this.h = i;
        this.d = z;
        this.e = num;
        this.f = z2;
        this.g = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof akzk)) {
            return false;
        }
        akzk akzkVar = (akzk) obj;
        return fdbq.f(this.a, akzkVar.a) && fdbq.f(this.b, akzkVar.b) && fdbq.f(this.c, akzkVar.c) && this.h == akzkVar.h && this.d == akzkVar.d && fdbq.f(this.e, akzkVar.e) && this.f == akzkVar.f && this.g == akzkVar.g;
    }

    public final int hashCode() {
        int iHashCode = (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
        Integer num = this.e;
        return (((((((((iHashCode * 31) + this.h) * 31) + akzj.a(this.d)) * 31) + (num == null ? 0 : num.hashCode())) * 31) + akzj.a(this.f)) * 31) + akzj.a(this.g);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FindConversationFilter(requiredRecipients=");
        sb.append(this.a);
        sb.append(", optionalRecipients=");
        sb.append(this.b);
        sb.append(", name=");
        sb.append(this.c);
        sb.append(", matchMode=");
        int i = this.h;
        sb.append((Object) (i != 1 ? i != 2 ? i != 3 ? "EXACT_RECIPIENTS_MATCH" : "BEST_MATCH" : "PARTIAL_MATCH" : "EXACT_MATCH"));
        sb.append(", isGroup=");
        sb.append(this.d);
        sb.append(", limit=");
        sb.append(this.e);
        sb.append(", filterInvalidRcsGroups=");
        sb.append(this.f);
        sb.append(", filterParentUnapprovedConversations=");
        sb.append(this.g);
        sb.append(")");
        return sb.toString();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ akzk(ekgb ekgbVar, ekgb ekgbVar2, Optional optional, int i, boolean z, Integer num, boolean z2, boolean z3, int i2) {
        if ((i2 & 2) != 0) {
            int i3 = ekgb.d;
            ekgbVar2 = ekoe.a;
        }
        this(ekgbVar, ekgbVar2, (i2 & 4) != 0 ? Optional.empty() : optional, i, ((i2 & 16) == 0) & z, (i2 & 32) != 0 ? null : num, ((i2 & 64) == 0) & z2, ((i2 & 128) == 0) & z3);
    }
}
