package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class acky extends abs {
    final /* synthetic */ ackz a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public acky(ackz ackzVar) {
        super(true);
        this.a = ackzVar;
    }

    @Override // defpackage.abs
    public final void b() {
        ackz ackzVar = this.a;
        int i = ackzVar.d;
        int i2 = i - 1;
        if (i == 0) {
            throw null;
        }
        if (i2 == 0) {
            ackzVar.c.h(false);
            ackzVar.a.c().d();
        } else if (i2 == 1 || i2 == 2) {
            ackzVar.a();
        }
    }
}
