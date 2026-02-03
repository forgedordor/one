package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ezjk extends evsf implements evui {
    public ezjk() {
        super(ezjl.a);
    }

    public final void a(evqs evqsVar) {
        copyOnWrite();
        ezjl ezjlVar = (ezjl) this.instance;
        ezjl ezjlVar2 = ezjl.a;
        evqsVar.getClass();
        evtg evtgVar = ezjlVar.d;
        if (!evtgVar.c()) {
            ezjlVar.d = evsn.mutableCopy(evtgVar);
        }
        ezjlVar.d.add(evqsVar);
    }
}
