package defpackage;

import j$.time.Instant;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class eaon extends easm {
    public easo a;
    public Boolean b;
    public Instant c;
    public Instant d;
    private List e;
    private List f;
    private List g;

    @Override // defpackage.easm
    public final easp a() {
        List list;
        List list2;
        List list3 = this.e;
        if (list3 != null && (list = this.f) != null && (list2 = this.g) != null) {
            return new eaqu(this.a, list3, list, list2, this.b, this.c, this.d);
        }
        StringBuilder sb = new StringBuilder();
        if (this.e == null) {
            sb.append(" periods");
        }
        if (this.f == null) {
            sb.append(" specialDays");
        }
        if (this.g == null) {
            sb.append(" weekdayText");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    @Override // defpackage.easm
    public final void b(List list) {
        if (list == null) {
            throw new NullPointerException("Null periods");
        }
        this.e = list;
    }

    @Override // defpackage.easm
    public final void c(List list) {
        if (list == null) {
            throw new NullPointerException("Null specialDays");
        }
        this.f = list;
    }

    @Override // defpackage.easm
    public final void d(List list) {
        if (list == null) {
            throw new NullPointerException("Null weekdayText");
        }
        this.g = list;
    }
}
