package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
abstract class attu {
    static final attu c;
    static final attu d;
    static final attu e;

    static {
        atqs atqsVar = new atqs();
        atqsVar.b(true);
        atqsVar.c(false);
        c = atqsVar.a();
        atqs atqsVar2 = new atqs();
        atqsVar2.b(true);
        atqsVar2.c(true);
        d = atqsVar2.a();
        atqs atqsVar3 = new atqs();
        atqsVar3.b(false);
        atqsVar3.c(false);
        e = atqsVar3.a();
    }

    public abstract boolean a();

    public abstract boolean b();

    final attu c(attu attuVar) {
        atqs atqsVar = new atqs();
        boolean z = true;
        atqsVar.b(a() && ((atqt) attuVar).a);
        if (!b() && !((atqt) attuVar).b) {
            z = false;
        }
        atqsVar.c(z);
        return atqsVar.a();
    }
}
