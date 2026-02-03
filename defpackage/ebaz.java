package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ebaz extends evsf implements evui {
    public ebaz() {
        super(ebba.a);
    }

    public final void a(Iterable iterable) {
        copyOnWrite();
        ebba ebbaVar = (ebba) this.instance;
        ebba ebbaVar2 = ebba.a;
        ebbaVar.a();
        evpz.addAll(iterable, ebbaVar.d);
    }

    public final void b(ebay ebayVar) {
        copyOnWrite();
        ebba ebbaVar = (ebba) this.instance;
        ebba ebbaVar2 = ebba.a;
        ebayVar.getClass();
        ebbaVar.a();
        ebbaVar.d.add(ebayVar);
    }
}
