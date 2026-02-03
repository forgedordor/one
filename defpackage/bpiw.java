package defpackage;

import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes7.dex */
public class bpiw extends dqpg {
    public long a;
    public long b;
    public aiwp c;
    public String d;

    public bpiw() {
        super(bpjz.b());
        this.b = 0L;
        this.c = aiwp.b(0);
    }

    public final bpis a(Supplier supplier) {
        bpis bpisVar = (bpis) supplier.get();
        bpisVar.aD(aB());
        bpisVar.a = this.a;
        bpisVar.b = this.b;
        bpisVar.c = this.c;
        bpisVar.d = this.d;
        bpisVar.cM = aC();
        return bpisVar;
    }

    public final void b(String str) {
        aE(3);
        this.d = str;
    }

    public final void c(aiwp aiwpVar) {
        aE(2);
        this.c = aiwpVar;
    }

    public final void d(long j) {
        aE(1);
        this.b = j;
    }
}
