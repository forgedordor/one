package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ewbq extends evsf implements evui {
    public ewbq() {
        super(ewbr.a);
    }

    public final void a(ewcc ewccVar) {
        copyOnWrite();
        ewbr ewbrVar = (ewbr) this.instance;
        ewce ewceVar = (ewce) ewccVar.build();
        ewbr ewbrVar2 = ewbr.a;
        ewceVar.getClass();
        evtg evtgVar = ewbrVar.d;
        if (!evtgVar.c()) {
            ewbrVar.d = evsn.mutableCopy(evtgVar);
        }
        ewbrVar.d.add(ewceVar);
    }
}
