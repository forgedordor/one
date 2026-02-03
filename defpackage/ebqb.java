package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ebqb extends ebpf {
    @Override // defpackage.ebpt
    public final ebob b() throws ebml {
        ebol ebolVar = new ebol();
        this.a.a(2092);
        this.a.h();
        this.a.a(58);
        this.a.h();
        while (true) {
            ebok ebokVar = new ebok();
            super.b(ebokVar);
            ebolVar.g(ebokVar);
            this.a.h();
            if (this.a.o(0) != ',') {
                break;
            }
            this.a.a(44);
            this.a.h();
        }
        if (this.a.o(0) == '\n') {
            return ebolVar;
        }
        throw f("unexpected char");
    }
}
