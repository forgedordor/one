package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cdel {
    public final elqn a;
    public final emig b;
    public final eyzv c;
    public final ezac d;
    public final int e;
    public final int f;
    public final long g;
    public final String h;
    public final ekgb i;
    public final ekgb j;
    private final String k;
    private final MessageIdType l;

    public cdel(String str, elqn elqnVar, emig emigVar, eyzv eyzvVar, ezac ezacVar, int i, int i2, long j, String str2, ekgb ekgbVar, ekgb ekgbVar2, MessageIdType messageIdType) {
        this.k = str;
        this.a = elqnVar;
        this.b = emigVar;
        this.c = eyzvVar;
        this.d = ezacVar;
        this.e = i;
        this.f = i2;
        this.g = j;
        this.h = str2;
        this.i = ekgbVar;
        this.j = ekgbVar2;
        this.l = messageIdType;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cdel)) {
            return false;
        }
        cdel cdelVar = (cdel) obj;
        return fdbq.f(this.k, cdelVar.k) && this.a == cdelVar.a && this.b == cdelVar.b && this.c == cdelVar.c && this.d == cdelVar.d && this.e == cdelVar.e && this.f == cdelVar.f && this.g == cdelVar.g && fdbq.f(this.h, cdelVar.h) && fdbq.f(this.i, cdelVar.i) && fdbq.f(this.j, cdelVar.j) && fdbq.f(this.l, cdelVar.l);
    }

    public final int hashCode() {
        int iHashCode = (((((((this.k.hashCode() * 31) + this.a.hashCode()) * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode();
        long j = this.g;
        long j2 = j ^ (j >>> 32);
        return (((((((((((((iHashCode * 31) + this.e) * 31) + this.f) * 31) + ((int) j2)) * 31) + this.h.hashCode()) * 31) + this.i.hashCode()) * 31) + this.j.hashCode()) * 31) + this.l.hashCode();
    }

    public final String toString() {
        return "SmartSuggestionEvent(id=" + this.k + ", eventType=" + this.a + ", replyMode=" + this.b + ", actionSource=" + this.c + ", rejectionReason=" + this.d + ", numOfItems=" + this.e + ", clickIndex=" + this.f + ", timestamp=" + this.g + ", impressionId=" + this.h + ", suggestionTypes=" + this.i + ", modelOutputLabels=" + this.j + ", messageId=" + this.l + ")";
    }
}
