package defpackage;

import j$.util.concurrent.ConcurrentHashMap;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ephs implements ephj {
    final ConcurrentHashMap a = new ConcurrentHashMap();
    private final ephj b;

    public ephs(ephj ephjVar) {
        this.b = ephjVar;
    }

    @Override // defpackage.ephi
    public final int a(String str) {
        return this.b.a(str);
    }

    @Override // defpackage.ephi
    public final String b(ephf ephfVar, ephg ephgVar) {
        return this.b.b(ephfVar, ephgVar);
    }

    @Override // defpackage.ephi
    public final String c(ephf ephfVar, String str) {
        return this.b.c(ephfVar, str);
    }

    @Override // defpackage.ephi
    public final String d(ephf ephfVar) {
        return this.b.d(ephfVar);
    }

    @Override // defpackage.ephi
    public final String e(int i) {
        return this.b.e(i);
    }

    @Override // defpackage.ephi
    public final String f(ephf ephfVar) {
        return this.b.f(ephfVar);
    }

    @Override // defpackage.ephi
    public final boolean g(ephf ephfVar) {
        return this.b.g(ephfVar);
    }

    @Override // defpackage.ephi
    public final boolean h(String str, String str2) {
        return this.b.h(str, str2);
    }

    @Override // defpackage.ephi
    public final boolean i(ephf ephfVar) {
        return this.b.i(ephfVar);
    }

    @Override // defpackage.ephi
    public final boolean j(ephf ephfVar) {
        return this.b.j(ephfVar);
    }

    @Override // defpackage.ephi
    public final int k(ephf ephfVar, ephf ephfVar2) {
        return this.b.k(ephfVar, ephfVar2);
    }

    @Override // defpackage.ephi
    public final int l(String str, String str2) {
        return this.b.l(str, str2);
    }

    @Override // defpackage.ephi
    public final int m(ephf ephfVar) {
        return this.b.m(ephfVar);
    }

    @Override // defpackage.ephj
    public final ephf n(CharSequence charSequence, String str) throws ephe {
        ephp ephpVar = new ephp(charSequence, str);
        ConcurrentHashMap concurrentHashMap = this.a;
        ephq ephqVar = (ephq) concurrentHashMap.get(ephpVar);
        if (ephqVar != null) {
            ephe epheVar = ephqVar.b;
            if (epheVar == null) {
                return ephqVar.a;
            }
            throw new ephm(epheVar.a());
        }
        try {
            ephf ephfVarN = this.b.n(charSequence, str);
            concurrentHashMap.put(ephpVar, new ephq(ephfVarN));
            return ephfVarN;
        } catch (ephe e) {
            this.a.put(ephpVar, new ephq(e));
            throw e;
        }
    }

    @Override // defpackage.ephj
    public final String o(ephf ephfVar, ephg ephgVar) {
        return this.b.o(ephfVar, ephgVar);
    }

    @Override // defpackage.ephj
    public final void p() {
        this.a.clear();
    }
}
