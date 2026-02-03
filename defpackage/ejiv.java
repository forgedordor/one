package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ejiv extends evsf implements evui {
    public ejiv() {
        super(ejji.b);
    }

    public final void a(ezan ezanVar) {
        copyOnWrite();
        ejji ejjiVar = (ejji) this.instance;
        evsy evsyVar = ejji.a;
        ezanVar.getClass();
        evsx evsxVar = ejjiVar.f;
        if (!evsxVar.c()) {
            ejjiVar.f = evsn.mutableCopy(evsxVar);
        }
        ejjiVar.f.h(ezanVar.a());
    }
}
