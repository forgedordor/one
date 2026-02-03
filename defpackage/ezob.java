package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ezob extends evsf implements evui {
    public ezob() {
        super(ezoc.b);
    }

    public final void a(felh felhVar) {
        copyOnWrite();
        ezoc ezocVar = (ezoc) this.instance;
        evsy evsyVar = ezoc.a;
        felhVar.getClass();
        evsx evsxVar = ezocVar.c;
        if (!evsxVar.c()) {
            ezocVar.c = evsn.mutableCopy(evsxVar);
        }
        ezocVar.c.h(felhVar.a());
    }
}
