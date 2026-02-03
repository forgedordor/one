package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ezny extends evsf implements evui {
    public ezny() {
        super(eznz.a);
    }

    public final void a(Iterable iterable) {
        copyOnWrite();
        eznz eznzVar = (eznz) this.instance;
        eznz eznzVar2 = eznz.a;
        eznzVar.a();
        evpz.addAll(iterable, eznzVar.b);
    }

    public final void b(eznv eznvVar) {
        copyOnWrite();
        eznz eznzVar = (eznz) this.instance;
        eznz eznzVar2 = eznz.a;
        eznvVar.getClass();
        eznzVar.a();
        eznzVar.b.add(eznvVar);
    }
}
