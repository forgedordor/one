package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class emug extends evsf implements evui {
    public emug() {
        super(emuh.a);
    }

    public final void a(emut emutVar) {
        copyOnWrite();
        emuh emuhVar = (emuh) this.instance;
        emuu emuuVar = (emuu) emutVar.build();
        emuh emuhVar2 = emuh.a;
        emuuVar.getClass();
        evtg evtgVar = emuhVar.g;
        if (!evtgVar.c()) {
            emuhVar.g = evsn.mutableCopy(evtgVar);
        }
        emuhVar.g.add(emuuVar);
    }
}
