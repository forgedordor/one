package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cdyi extends evsf implements evui {
    public cdyi() {
        super(cdyj.a);
    }

    public final void a(String str) {
        copyOnWrite();
        cdyj cdyjVar = (cdyj) this.instance;
        cdyj cdyjVar2 = cdyj.a;
        str.getClass();
        evtg evtgVar = cdyjVar.b;
        if (!evtgVar.c()) {
            cdyjVar.b = evsn.mutableCopy(evtgVar);
        }
        cdyjVar.b.add(str);
    }
}
