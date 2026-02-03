package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ewcc extends evsf implements evui {
    public ewcc() {
        super(ewce.a);
    }

    public final void a(evqs evqsVar) {
        copyOnWrite();
        ewce ewceVar = (ewce) this.instance;
        ewce ewceVar2 = ewce.a;
        evtg evtgVar = ewceVar.d;
        if (!evtgVar.c()) {
            ewceVar.d = evsn.mutableCopy(evtgVar);
        }
        ewceVar.d.add(evqsVar);
    }
}
