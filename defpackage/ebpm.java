package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ebpm extends ebpf {
    @Override // defpackage.ebpt
    public final ebob b() throws ebml {
        d(2087);
        ebns ebnsVar = new ebns();
        while (true) {
            ebnr ebnrVar = new ebnr();
            if (this.a.o(0) == '*') {
                this.a.a(42);
                ebnrVar.b = true;
            } else {
                super.b(ebnrVar);
            }
            ebnsVar.g(ebnrVar);
            this.a.h();
            if (this.a.o(0) != ',') {
                break;
            }
            this.a.a(44);
            this.a.h();
        }
        if (this.a.o(0) == '\n') {
            return ebnsVar;
        }
        throw f("unexpected char");
    }
}
