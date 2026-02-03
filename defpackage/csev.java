package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class csev {
    public final csch a;
    public final csdl b;
    public final eoeo c;
    public final Integer d;
    public final boolean e;
    public final csnz f;
    public final ConversationIdType g;
    public final csnx h;
    public final int i;
    public final boolean j;
    public final String k;
    public final eoff l;
    public final csdo m;
    public final String n;
    public final cspo o;
    private final csdd p;

    public /* synthetic */ csev(csch cschVar, csdd csddVar, csdl csdlVar, eoeo eoeoVar, Integer num, boolean z, int i) {
        cschVar.getClass();
        csddVar.getClass();
        csdlVar.getClass();
        eoeoVar.getClass();
        this.a = cschVar;
        this.p = csddVar;
        this.b = csdlVar;
        this.c = eoeoVar;
        num = (i & 16) != 0 ? null : num;
        this.d = num;
        this.e = z & ((i & 32) == 0);
        if (csdlVar == csdl.a) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (eoeoVar == eoeo.UNKNOWN_DETECTION_TRIGGER_TYPE) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (eoeoVar == eoeo.RECLASSIFICATION) {
            if (num == null) {
                throw new IllegalArgumentException("Failed requirement.");
            }
        } else if (num != null) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        this.f = cschVar.i;
        this.g = cschVar.j;
        this.h = cschVar.k;
        this.i = cschVar.m;
        this.j = cschVar.n;
        this.k = cschVar.o;
        this.o = cschVar.q;
        this.l = csddVar.a;
        this.m = csddVar.b;
        this.n = csddVar.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof csev)) {
            return false;
        }
        csev csevVar = (csev) obj;
        return fdbq.f(this.a, csevVar.a) && fdbq.f(this.p, csevVar.p) && this.b == csevVar.b && this.c == csevVar.c && fdbq.f(this.d, csevVar.d) && this.e == csevVar.e;
    }

    public final int hashCode() {
        int iHashCode = (((((this.a.hashCode() * 31) + this.p.hashCode()) * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
        Integer num = this.d;
        return (((iHashCode * 31) + (num == null ? 0 : num.hashCode())) * 31) + (true != this.e ? 1237 : 1231);
    }

    public final String toString() {
        return "VerdictEnforcementParams(incomingParams=" + this.a + ", checkResult=" + this.p + ", classificationSource=" + this.b + ", trigger=" + this.c + ", reclassificationIndex=" + this.d + ", ignoreUserReplyCount=" + this.e + ")";
    }
}
