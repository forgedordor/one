package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dpom implements dpmd, dpmb, dplt {
    private final long a;
    private final hsf b;

    public dpom(long j, hsf hsfVar) {
        this.a = j;
        this.b = hsfVar;
    }

    @Override // defpackage.dplt
    public final long a() {
        return this.a;
    }

    @Override // defpackage.dpmb
    public final dpmf c() {
        return (dpmf) this.b.a();
    }

    @Override // defpackage.dpmd
    public final /* synthetic */ ics d(ics icsVar, hml hmlVar) {
        throw null;
    }

    @Override // defpackage.dpmb
    public final /* synthetic */ ics e(ics icsVar, hml hmlVar) {
        throw null;
    }
}
