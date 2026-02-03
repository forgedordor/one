package defpackage;

import j$.time.Instant;

/* compiled from: PG */
/* loaded from: classes7.dex */
public class ccgc extends dqpg {
    public byte[] a;
    public byte[] b;
    public Instant c;

    public ccgc() {
        super(ccha.a().M());
        this.c = Instant.EPOCH;
    }

    public final ccga a() {
        ccgb ccgbVar = new ccgb();
        ccgbVar.aD(aB());
        ccgbVar.a = this.a;
        ccgbVar.b = this.b;
        ccgbVar.c = this.c;
        ccgbVar.cM = aC();
        return ccgbVar;
    }

    public final void b(Instant instant) {
        aE(2);
        this.c = instant;
    }

    public final void c(byte[] bArr) {
        aE(0);
        this.a = bArr;
    }

    public final void d(byte[] bArr) {
        aE(1);
        this.b = bArr;
    }
}
