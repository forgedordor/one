package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ebqd extends ebpf {
    @Override // defpackage.ebpt
    public final ebob b() throws ebml {
        eboo ebooVar = new eboo();
        this.a.a(2070);
        this.a.h();
        this.a.a(58);
        this.a.h();
        while (true) {
            ebon ebonVar = new ebon();
            super.b(ebonVar);
            ebooVar.g(ebonVar);
            this.a.h();
            if (this.a.o(0) != ',') {
                break;
            }
            this.a.a(44);
            this.a.h();
        }
        if (this.a.o(0) == '\n') {
            return ebooVar;
        }
        throw f("unexpected char");
    }
}
