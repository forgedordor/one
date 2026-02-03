package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class augh extends evsf implements evui {
    public augh() {
        super(augi.a);
    }

    public final void a(aubq aubqVar) {
        copyOnWrite();
        augi augiVar = (augi) this.instance;
        augi augiVar2 = augi.a;
        aubqVar.getClass();
        evtg evtgVar = augiVar.d;
        if (!evtgVar.c()) {
            augiVar.d = evsn.mutableCopy(evtgVar);
        }
        augiVar.d.add(aubqVar);
    }
}
