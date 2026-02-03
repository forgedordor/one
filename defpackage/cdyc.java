package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cdyc extends evsf implements evui {
    public cdyc() {
        super(cdyd.a);
    }

    public final void a(Iterable iterable) {
        copyOnWrite();
        cdyd cdydVar = (cdyd) this.instance;
        cdyd cdydVar2 = cdyd.a;
        cdydVar.a();
        evpz.addAll(iterable, cdydVar.c);
    }

    public final void b(String str) {
        copyOnWrite();
        cdyd cdydVar = (cdyd) this.instance;
        cdyd cdydVar2 = cdyd.a;
        str.getClass();
        cdydVar.a();
        cdydVar.c.add(str);
    }
}
