package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class ckbx extends evsf implements evui {
    public ckbx() {
        super(ckce.a);
    }

    public final void a(String str, ckcc ckccVar) {
        ckccVar.getClass();
        copyOnWrite();
        ckce ckceVar = (ckce) this.instance;
        ckce ckceVar2 = ckce.a;
        evub evubVar = ckceVar.c;
        if (!evubVar.b) {
            ckceVar.c = evubVar.a();
        }
        new evtf(ckceVar.c, ckce.f).put(str, ckccVar);
    }
}
