package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public class ebpk extends ebpt {
    public final void c(ebnl ebnlVar) throws ebml {
        this.a.h();
        this.a.a(4095);
        ebmi ebmiVar = this.a;
        ebmq ebmqVar = ebmiVar.e;
        ebmiVar.h();
        ebnlVar.a = ebmqVar.a;
        while (this.a.o(0) != '\n') {
            ebnlVar.j(a());
            this.a.h();
            if (this.a.o(0) == '\n' || this.a.o(0) == 0) {
                return;
            }
            this.a.a(44);
            this.a.h();
        }
    }
}
