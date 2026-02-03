package defpackage;

import j$.time.Instant;
import j$.util.Optional;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes7.dex */
public class btov extends dqpg {
    public long a;
    public Optional b;
    public aiba c;
    public aiaf d;
    public Instant e;
    public Instant f;
    public aiaa g;
    public long h;
    public Instant i;
    public Instant j;
    public aiay k;
    public boolean l;

    public btov() {
        super(btqy.e());
        this.b = basg.a;
        this.c = aiba.b(0);
        this.d = aiaf.b(0);
        this.e = Instant.EPOCH;
        this.f = Instant.EPOCH;
        this.i = Instant.EPOCH;
        this.j = Instant.EPOCH;
    }

    public final btor a(Supplier supplier) {
        btor btorVar = (btor) supplier.get();
        btorVar.aD(aB());
        btorVar.a = this.a;
        btorVar.b = this.b;
        btorVar.c = this.c;
        btorVar.d = this.d;
        btorVar.e = this.e;
        btorVar.f = this.f;
        btorVar.g = this.g;
        btorVar.h = this.h;
        btorVar.i = this.i;
        btorVar.j = this.j;
        btorVar.k = this.k;
        btorVar.l = this.l;
        btorVar.cM = aC();
        return btorVar;
    }

    public final void b(boolean z) {
        int i = this.aB;
        if (i < 60760) {
            dqru.x("cleaned_up", i);
        }
        aE(11);
        this.l = z;
    }

    public final void c(aiay aiayVar) {
        int i = this.aB;
        if (i < 60730) {
            dqru.x("config", i);
        }
        aE(10);
        this.k = aiayVar;
    }

    public final void d(aiba aibaVar) {
        aE(2);
        this.c = aibaVar;
    }

    public final void e(long j) {
        int i = this.aB;
        if (i < 60110) {
            dqru.x("initial_messages_version", i);
        }
        aE(7);
        this.h = j;
    }

    public final void f(Optional optional) {
        aE(1);
        this.b = optional;
    }

    public final void g(Instant instant) {
        aE(4);
        this.e = instant;
    }

    public final void h(aiaf aiafVar) {
        aE(3);
        this.d = aiafVar;
    }

    public final void i(Instant instant) {
        int i = this.aB;
        if (i < 60220) {
            dqru.x("status_timestamp", i);
        }
        aE(8);
        this.i = instant;
    }
}
