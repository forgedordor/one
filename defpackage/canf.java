package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class canf extends evsf implements evui {
    public canf() {
        super(cang.b);
    }

    public final void a(cank cankVar) {
        copyOnWrite();
        cang cangVar = (cang) this.instance;
        evsy evsyVar = cang.a;
        cankVar.getClass();
        evsx evsxVar = cangVar.k;
        if (!evsxVar.c()) {
            cangVar.k = evsn.mutableCopy(evsxVar);
        }
        cangVar.k.h(cankVar.g);
    }
}
