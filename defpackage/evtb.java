package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class evtb {
    final /* synthetic */ evsu a;
    final /* synthetic */ evst b;

    public evtb(evsu evsuVar, evst evstVar) {
        this.a = evsuVar;
        this.b = evstVar;
    }

    public final /* bridge */ /* synthetic */ Object a(Object obj) {
        evst evstVarA = this.a.a(((Integer) obj).intValue());
        return evstVarA == null ? this.b : evstVarA;
    }
}
