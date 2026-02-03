package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class caud extends evsf implements evui {
    public caud() {
        super(caue.a);
    }

    public final void a(String str) {
        copyOnWrite();
        caue caueVar = (caue) this.instance;
        caue caueVar2 = caue.a;
        str.getClass();
        evtg evtgVar = caueVar.c;
        if (!evtgVar.c()) {
            caueVar.c = evsn.mutableCopy(evtgVar);
        }
        caueVar.c.add(str);
    }
}
