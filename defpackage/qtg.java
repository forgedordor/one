package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class qtg implements qtk {
    private final qsz a;
    private final qsz b;

    public qtg(qsz qszVar, qsz qszVar2) {
        this.a = qszVar;
        this.b = qszVar2;
    }

    @Override // defpackage.qtk
    public final qpv a() {
        return new qqj(this.a.a(), this.b.a());
    }

    @Override // defpackage.qtk
    public final List b() {
        throw new UnsupportedOperationException("Cannot call getKeyframes on AnimatableSplitDimensionPathValue.");
    }

    @Override // defpackage.qtk
    public final boolean c() {
        return this.a.c() && this.b.c();
    }
}
