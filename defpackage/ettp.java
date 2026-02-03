package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ettp extends evsf implements evui {
    public ettp() {
        super(ettq.a);
    }

    public final void a(String str) {
        copyOnWrite();
        ettq ettqVar = (ettq) this.instance;
        ettq ettqVar2 = ettq.a;
        evtg evtgVar = ettqVar.b;
        if (!evtgVar.c()) {
            ettqVar.b = evsn.mutableCopy(evtgVar);
        }
        ettqVar.b.add(str);
    }
}
