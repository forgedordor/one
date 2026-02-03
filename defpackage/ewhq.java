package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ewhq extends evsf implements evui {
    public ewhq() {
        super(ewhs.a);
    }

    public final void a(String str) {
        copyOnWrite();
        ewhs ewhsVar = (ewhs) this.instance;
        ewhs ewhsVar2 = ewhs.a;
        evtg evtgVar = ewhsVar.h;
        if (!evtgVar.c()) {
            ewhsVar.h = evsn.mutableCopy(evtgVar);
        }
        ewhsVar.h.add(str);
    }
}
