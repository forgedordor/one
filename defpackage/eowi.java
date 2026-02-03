package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eowi extends evsf implements evui {
    public eowi() {
        super(eowm.a);
    }

    public final void a(Iterable iterable) {
        copyOnWrite();
        eowm eowmVar = (eowm) this.instance;
        eowm eowmVar2 = eowm.a;
        eowmVar.b();
        evpz.addAll(iterable, eowmVar.r);
    }

    public final void b(String str) {
        copyOnWrite();
        eowm eowmVar = (eowm) this.instance;
        eowm eowmVar2 = eowm.a;
        str.getClass();
        eowmVar.a();
        eowmVar.s.add(str);
    }

    public final void c(epcj epcjVar) {
        copyOnWrite();
        eowm eowmVar = (eowm) this.instance;
        eowm eowmVar2 = eowm.a;
        epcjVar.getClass();
        eowmVar.b();
        eowmVar.r.add(epcjVar);
    }
}
