package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dzzv extends evsf implements evui {
    public dzzv() {
        super(dzzw.a);
    }

    public final void a(evqs evqsVar) {
        copyOnWrite();
        dzzw dzzwVar = (dzzw) this.instance;
        dzzw dzzwVar2 = dzzw.a;
        evtg evtgVar = dzzwVar.d;
        if (!evtgVar.c()) {
            dzzwVar.d = evsn.mutableCopy(evtgVar);
        }
        dzzwVar.d.add(evqsVar);
    }
}
