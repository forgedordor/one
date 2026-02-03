package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ezdh extends evsf implements evui {
    public ezdh() {
        super(ezdi.a);
    }

    public final void a(Iterable iterable) {
        copyOnWrite();
        ezdi ezdiVar = (ezdi) this.instance;
        ezdi ezdiVar2 = ezdi.a;
        evtg evtgVar = ezdiVar.c;
        if (!evtgVar.c()) {
            ezdiVar.c = evsn.mutableCopy(evtgVar);
        }
        evpz.addAll(iterable, ezdiVar.c);
    }
}
