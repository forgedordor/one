package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eowt extends evsf implements evui {
    public eowt() {
        super(eowu.a);
    }

    public final void a(Iterable iterable) {
        copyOnWrite();
        eowu eowuVar = (eowu) this.instance;
        eowu eowuVar2 = eowu.a;
        eowuVar.a();
        evpz.addAll(iterable, eowuVar.b);
    }

    public final void b(eowm eowmVar) {
        copyOnWrite();
        eowu eowuVar = (eowu) this.instance;
        eowu eowuVar2 = eowu.a;
        eowmVar.getClass();
        eowuVar.a();
        eowuVar.b.add(eowmVar);
    }
}
