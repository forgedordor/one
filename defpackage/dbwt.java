package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dbwt extends evsf implements evui {
    public dbwt() {
        super(dbwu.a);
    }

    public final void a(dbwf dbwfVar) {
        copyOnWrite();
        dbwu dbwuVar = (dbwu) this.instance;
        dbwu dbwuVar2 = dbwu.a;
        evtg evtgVar = dbwuVar.d;
        if (!evtgVar.c()) {
            dbwuVar.d = evsn.mutableCopy(evtgVar);
        }
        dbwuVar.d.add(dbwfVar);
    }
}
