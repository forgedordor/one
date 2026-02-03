package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class asuz extends evsf implements evui {
    public asuz() {
        super(asva.a);
    }

    public final void a(asvc asvcVar) {
        copyOnWrite();
        asva asvaVar = (asva) this.instance;
        asva asvaVar2 = asva.a;
        asvcVar.getClass();
        evtg evtgVar = asvaVar.b;
        if (!evtgVar.c()) {
            asvaVar.b = evsn.mutableCopy(evtgVar);
        }
        asvaVar.b.add(asvcVar);
    }
}
