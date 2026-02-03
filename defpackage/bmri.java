package defpackage;

import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes7.dex */
public class bmri extends dqpg {
    public long a;
    public long b;
    public long c;
    public bmsp d;
    public long e;

    public bmri() {
        super(bmso.a().M());
        this.d = bmsp.a;
    }

    public final bmre a(Supplier supplier) {
        bmre bmreVar = (bmre) supplier.get();
        bmreVar.aD(aB());
        bmreVar.a = this.a;
        bmreVar.b = this.b;
        bmreVar.c = this.c;
        bmreVar.d = this.d;
        bmreVar.e = this.e;
        bmreVar.cM = aC();
        return bmreVar;
    }

    public final void b(long j) {
        aE(4);
        this.e = j;
    }

    public final void c(bmsp bmspVar) {
        aE(3);
        this.d = bmspVar;
    }

    public final void d(long j) {
        aE(1);
        this.b = j;
    }
}
