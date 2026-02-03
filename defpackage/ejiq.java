package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ejiq extends evsf implements evui {
    public ejiq() {
        super(ejir.a);
    }

    public final void a(Iterable iterable) {
        copyOnWrite();
        ejir ejirVar = (ejir) this.instance;
        ejir ejirVar2 = ejir.a;
        ejirVar.a();
        evpz.addAll(iterable, ejirVar.b);
    }

    public final void b(ejip ejipVar) {
        copyOnWrite();
        ejir ejirVar = (ejir) this.instance;
        ejir ejirVar2 = ejir.a;
        ejipVar.getClass();
        ejirVar.a();
        ejirVar.b.add(ejipVar);
    }
}
