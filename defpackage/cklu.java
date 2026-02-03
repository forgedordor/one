package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cklu extends evsf implements evui {
    public cklu() {
        super(cklv.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final ckme a(int i) {
        return (ckme) ((cklv) this.instance).b.get(i);
    }

    public final void b(ckme ckmeVar) {
        copyOnWrite();
        cklv cklvVar = (cklv) this.instance;
        cklv cklvVar2 = cklv.a;
        ckmeVar.getClass();
        cklvVar.a();
        cklvVar.b.add(ckmeVar);
    }

    public final void c(int i) {
        copyOnWrite();
        cklv cklvVar = (cklv) this.instance;
        cklv cklvVar2 = cklv.a;
        cklvVar.a();
        cklvVar.b.remove(i);
    }

    public final void d(int i, ckmd ckmdVar) {
        copyOnWrite();
        cklv cklvVar = (cklv) this.instance;
        ckme ckmeVar = (ckme) ckmdVar.build();
        cklv cklvVar2 = cklv.a;
        ckmeVar.getClass();
        cklvVar.a();
        cklvVar.b.set(i, ckmeVar);
    }
}
