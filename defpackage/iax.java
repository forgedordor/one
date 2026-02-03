package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class iax implements iaw {
    private final hwu a = new hwu();

    @Override // defpackage.iaw
    public /* synthetic */ iay g(iay iayVar, iay iayVar2, iay iayVar3) {
        return null;
    }

    public final void j(int i) {
        hwu hwuVar;
        int i2;
        do {
            hwuVar = this.a;
            i2 = hwuVar.get();
            if ((i2 & i) != 0) {
                return;
            }
        } while (!hwuVar.compareAndSet(i2, i2 | i));
    }

    public final boolean k(int i) {
        return (i & this.a.get()) != 0;
    }
}
