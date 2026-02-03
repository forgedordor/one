package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cjtl extends evsf<cjtu, cjtl> implements evui {
    public cjtl() {
        super(cjtu.a);
    }

    public final void a(Iterable iterable) {
        copyOnWrite();
        cjtu cjtuVar = (cjtu) this.instance;
        cjtu cjtuVar2 = cjtu.a;
        cjtuVar.a();
        evpz.addAll(iterable, cjtuVar.d);
    }

    public final void b(cjtt cjttVar) {
        copyOnWrite();
        cjtu cjtuVar = (cjtu) this.instance;
        cjtu cjtuVar2 = cjtu.a;
        cjttVar.getClass();
        cjtuVar.a();
        cjtuVar.d.add(cjttVar);
    }
}
