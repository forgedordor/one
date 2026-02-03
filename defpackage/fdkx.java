package defpackage;

import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fdkx extends fdkz {
    final /* synthetic */ fdlb a;
    private final fdis c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fdkx(fdlb fdlbVar, long j, fdis fdisVar) {
        super(j);
        this.a = fdlbVar;
        this.c = fdisVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.c.g(this.a, fctx.a);
    }

    @Override // defpackage.fdkz
    public final String toString() {
        String string = super.toString();
        fdis fdisVar = this.c;
        Objects.toString(fdisVar);
        return string.concat(fdisVar.toString());
    }
}
