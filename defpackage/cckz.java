package defpackage;

import j$.time.Instant;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes7.dex */
public class cckz extends dqpg {
    public String a;
    public basd b;
    public String c;
    public byte[] d;
    public ccnk e;
    public Instant f;

    public cckz() {
        super(ccmf.b());
        this.b = basd.a;
        this.f = Instant.EPOCH;
    }

    public final cckv a(Supplier supplier) {
        cckv cckvVar = (cckv) supplier.get();
        cckvVar.aD(aB());
        cckvVar.a = this.a;
        cckvVar.b = this.b;
        cckvVar.c = this.c;
        cckvVar.d = this.d;
        cckvVar.e = this.e;
        cckvVar.f = this.f;
        cckvVar.cM = aC();
        return cckvVar;
    }

    public final void b(byte[] bArr) {
        aE(3);
        this.d = bArr;
    }

    public final void c(basd basdVar) {
        aE(1);
        this.b = basdVar;
    }

    public final void d(String str) {
        aE(2);
        this.c = str;
    }

    public final void e(String str) {
        aE(0);
        this.a = str;
    }

    public final void f(Instant instant) {
        aE(5);
        this.f = instant;
    }

    public final void g(ccnk ccnkVar) {
        aE(4);
        this.e = ccnkVar;
    }
}
