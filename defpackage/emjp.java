package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class emjp extends evsf implements evui {
    public emjp() {
        super(emju.a);
    }

    public final void a(emjv emjvVar) {
        copyOnWrite();
        emju emjuVar = (emju) this.instance;
        emjz emjzVar = (emjz) emjvVar.build();
        emju emjuVar2 = emju.a;
        emjzVar.getClass();
        evtg evtgVar = emjuVar.f;
        if (!evtgVar.c()) {
            emjuVar.f = evsn.mutableCopy(evtgVar);
        }
        emjuVar.f.add(emjzVar);
    }
}
