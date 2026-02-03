package defpackage;

import java.util.UUID;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes7.dex */
public class bqcw extends dqpg {
    public long a;
    public UUID b;
    public bvds c;
    public String d;

    public bqcw() {
        super(bqdw.a().M());
        this.b = base.b();
    }

    public final bqcs a(Supplier supplier) {
        bqcs bqcsVar = (bqcs) supplier.get();
        bqcsVar.aD(aB());
        bqcsVar.a = this.a;
        bqcsVar.b = this.b;
        bqcsVar.c = this.c;
        bqcsVar.d = this.d;
        bqcsVar.cM = aC();
        return bqcsVar;
    }

    public final void b(String str) {
        aE(3);
        this.d = str;
    }

    public final void c(bvds bvdsVar) {
        aE(2);
        this.c = bvdsVar;
    }

    public final void d(UUID uuid) {
        aE(1);
        this.b = uuid;
    }
}
