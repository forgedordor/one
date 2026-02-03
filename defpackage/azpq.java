package defpackage;

import j$.time.Instant;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes6.dex */
public class azpq extends dqpg {
    public Instant a;
    public int b;
    public String c;

    public azpq() {
        super(azqo.a().M());
        this.a = Instant.EPOCH;
    }

    public final azpm a(Supplier supplier) {
        azpm azpmVar = (azpm) supplier.get();
        azpmVar.aD(aB());
        azpmVar.a = this.a;
        azpmVar.b = this.b;
        azpmVar.c = this.c;
        azpmVar.cM = aC();
        return azpmVar;
    }

    public final void b(String str) {
        aE(2);
        this.c = str;
    }

    public final void c(Instant instant) {
        aE(0);
        this.a = instant;
    }

    public final void d(int i) {
        aE(1);
        this.b = i;
    }
}
