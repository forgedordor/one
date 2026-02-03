package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class evtx implements evuf {
    private final evuf[] a;

    public evtx(evuf... evufVarArr) {
        this.a = evufVarArr;
    }

    @Override // defpackage.evuf
    public final evue a(Class cls) {
        for (int i = 0; i < 2; i++) {
            evuf evufVar = this.a[i];
            if (evufVar.b(cls)) {
                return evufVar.a(cls);
            }
        }
        throw new UnsupportedOperationException("No factory is available for message type: ".concat(String.valueOf(cls.getName())));
    }

    @Override // defpackage.evuf
    public final boolean b(Class cls) {
        for (int i = 0; i < 2; i++) {
            if (this.a[i].b(cls)) {
                return true;
            }
        }
        return false;
    }
}
