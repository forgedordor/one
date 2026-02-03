package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ewtn extends evsf implements evui {
    public ewtn() {
        super(ewto.a);
    }

    public final void a(Iterable iterable) {
        copyOnWrite();
        ewto ewtoVar = (ewto) this.instance;
        ewto ewtoVar2 = ewto.a;
        ewtoVar.a();
        evpz.addAll(iterable, ewtoVar.b);
    }

    public final void b(String str) {
        copyOnWrite();
        ewto ewtoVar = (ewto) this.instance;
        ewto ewtoVar2 = ewto.a;
        ewtoVar.a();
        ewtoVar.b.add(str);
    }
}
