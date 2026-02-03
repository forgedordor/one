package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fegb extends evsf implements evui {
    public fegb() {
        super(fegm.a);
    }

    public final void a(fegn fegnVar) {
        copyOnWrite();
        fegm fegmVar = (fegm) this.instance;
        fegx fegxVar = (fegx) fegnVar.build();
        fegm fegmVar2 = fegm.a;
        fegxVar.getClass();
        evtg evtgVar = fegmVar.k;
        if (!evtgVar.c()) {
            fegmVar.k = evsn.mutableCopy(evtgVar);
        }
        fegmVar.k.add(fegxVar);
    }
}
