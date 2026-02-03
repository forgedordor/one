package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ermi extends evsf implements evui {
    public ermi() {
        super(erml.a);
    }

    public final void a(ermk ermkVar) {
        copyOnWrite();
        erml ermlVar = (erml) this.instance;
        erml ermlVar2 = erml.a;
        ermkVar.getClass();
        evtg evtgVar = ermlVar.c;
        if (!evtgVar.c()) {
            ermlVar.c = evsn.mutableCopy(evtgVar);
        }
        ermlVar.c.add(ermkVar);
    }
}
