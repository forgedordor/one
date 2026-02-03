package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ezgf extends evsf implements evui {
    public ezgf() {
        super(ezgg.b);
    }

    public final void a(ezar ezarVar) {
        copyOnWrite();
        ezgg ezggVar = (ezgg) this.instance;
        evsy evsyVar = ezgg.a;
        evsx evsxVar = ezggVar.h;
        if (!evsxVar.c()) {
            ezggVar.h = evsn.mutableCopy(evsxVar);
        }
        ezggVar.h.h(ezarVar.a());
    }
}
