package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eurj extends evsf implements evui {
    public eurj() {
        super(eurk.a);
    }

    public final void a(Iterable iterable) {
        copyOnWrite();
        eurk eurkVar = (eurk) this.instance;
        eurk eurkVar2 = eurk.a;
        eurkVar.a();
        evpz.addAll(iterable, eurkVar.c);
    }

    public final void b(eurd eurdVar) {
        copyOnWrite();
        eurk eurkVar = (eurk) this.instance;
        eure eureVar = (eure) eurdVar.build();
        eurk eurkVar2 = eurk.a;
        eureVar.getClass();
        eurkVar.a();
        eurkVar.c.add(eureVar);
    }

    public final void c(eure eureVar) {
        copyOnWrite();
        eurk eurkVar = (eurk) this.instance;
        eurk eurkVar2 = eurk.a;
        eureVar.getClass();
        eurkVar.a();
        eurkVar.c.add(eureVar);
    }
}
