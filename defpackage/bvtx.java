package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bvtx extends evsf implements evui {
    public bvtx() {
        super(bvty.a);
    }

    public final void a(Iterable iterable) {
        copyOnWrite();
        bvty bvtyVar = (bvty) this.instance;
        bvty bvtyVar2 = bvty.a;
        bvtyVar.a();
        evpz.addAll(iterable, bvtyVar.b);
    }

    public final void b(String str) {
        copyOnWrite();
        bvty bvtyVar = (bvty) this.instance;
        bvty bvtyVar2 = bvty.a;
        str.getClass();
        bvtyVar.a();
        bvtyVar.b.add(str);
    }
}
