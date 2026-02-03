package defpackage;

import j$.util.Optional;
import java.util.Date;

/* compiled from: PG */
/* loaded from: classes7.dex */
public class cbdi extends dqpg {
    public long a;
    public String b;
    public byte[] c;
    public int d;
    public long e;
    public String f;
    public String g;
    public boolean h;
    public Optional i;
    public Date j;
    public String k;

    public cbdi() {
        super(cbfi.e());
        this.i = basg.a;
        this.j = barp.a;
    }

    public final cbdg a() {
        cbdh cbdhVar = new cbdh();
        cbdhVar.aD(aB());
        String str = this.f;
        if (str == null) {
            throw new IllegalStateException("field queue cannot be null");
        }
        cbdhVar.a = this.a;
        cbdhVar.b = this.b;
        cbdhVar.c = this.c;
        cbdhVar.d = this.d;
        cbdhVar.e = this.e;
        cbdhVar.f = str;
        cbdhVar.g = this.g;
        cbdhVar.h = this.h;
        cbdhVar.i = this.i;
        cbdhVar.j = this.j;
        cbdhVar.k = this.k;
        cbdhVar.cM = aC();
        return cbdhVar;
    }

    public final void b(String str) {
        int i = this.aB;
        if (i < 48020) {
            dqru.x("cancellation_tag", i);
        }
        aE(10);
        this.k = str;
    }

    public final void c(String str) {
        int i = this.aB;
        if (i < 42050) {
            dqru.x("deduplication_tag", i);
        }
        aE(6);
        this.g = str;
    }

    public final void d(Date date) {
        int i = this.aB;
        if (i < 46070) {
            dqru.x("minimum_start_time", i);
        }
        aE(9);
        this.j = date;
    }

    public final void e(String str) {
        int i = this.aB;
        if (i < 41030) {
            dqru.x("queue", i);
        }
        aE(5);
        this.f = str;
    }

    public final void f(byte[] bArr) {
        aE(2);
        this.c = bArr;
    }

    public final void g(long j) {
        aE(4);
        this.e = j;
    }

    public final void h(String str) {
        aE(1);
        this.b = str;
    }
}
