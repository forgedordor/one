package defpackage;

import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class eije extends AtomicInteger {
    public static final eija a;
    public final eije b;
    public final String c;
    public volatile eijb<?> currentMetadata;
    public final long d;
    public final eiez e;
    public int f;
    public eije g;
    public boolean h;
    public volatile long i;
    int j;

    static {
        eija eijdVar;
        try {
            eijdVar = new eijc();
        } catch (Error | RuntimeException unused) {
            eijdVar = new eijd();
        }
        a = eijdVar;
    }

    public eije(eije eijeVar, String str, long j, eiez eiezVar) {
        this.j = 2;
        this.h = false;
        this.i = 0L;
        this.b = eijeVar.e() ? eijeVar.b : eijeVar;
        this.c = str;
        this.f = -1;
        this.d = j;
        this.e = eiezVar;
    }

    final int a() {
        eije eijeVar = this.b;
        if (eijeVar == null) {
            return -1;
        }
        return eijeVar.f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    final eiez b() {
        eijb eijbVarA = a.a(this);
        if (eijbVarA == null) {
            return eiey.a;
        }
        eiex eiexVarB = eiez.b();
        while (eijbVarA != null) {
            eiexVarB.a(eijbVarA.a, eijbVarA.b);
            eijbVarA = eijbVarA.c;
        }
        return ((eiez) eiexVarB).f();
    }

    final void c(int i, eije eijeVar) {
        this.f = i;
        this.g = eijeVar;
    }

    final boolean d() {
        return this.i != 0;
    }

    final boolean e() {
        return this.f < 0;
    }

    public final eies f(boolean z, int i) {
        eiep eiepVar = (eiep) eies.a.createBuilder();
        eiepVar.copyOnWrite();
        eies eiesVar = (eies) eiepVar.instance;
        String str = this.c;
        str.getClass();
        eiesVar.b |= 1;
        eiesVar.c = str;
        int i2 = this.f;
        eiepVar.copyOnWrite();
        eies eiesVar2 = (eies) eiepVar.instance;
        eiesVar2.b |= 2;
        eiesVar2.d = i2;
        eiepVar.copyOnWrite();
        eies eiesVar3 = (eies) eiepVar.instance;
        eiesVar3.b |= 4;
        eiesVar3.e = i;
        int i3 = this.j;
        eiepVar.copyOnWrite();
        eies eiesVar4 = (eies) eiepVar.instance;
        int i4 = i3 - 1;
        if (i3 == 0) {
            throw null;
        }
        eiesVar4.l = i4;
        eiesVar4.b |= 512;
        boolean z2 = this.h;
        eiepVar.copyOnWrite();
        eies eiesVar5 = (eies) eiepVar.instance;
        eiesVar5.b |= 1024;
        eiesVar5.m = z2;
        long j = this.d;
        eiepVar.copyOnWrite();
        eies eiesVar6 = (eies) eiepVar.instance;
        eiesVar6.b |= 8;
        eiesVar6.f = j / 1000000;
        long j2 = this.i;
        if (j2 != 0) {
            ejwl.l(true);
            eiepVar.copyOnWrite();
            eies eiesVar7 = (eies) eiepVar.instance;
            eiesVar7.b |= 32;
            eiesVar7.h = (4611686018427387903L & j2) / 1000000;
            ejwl.l(true);
            boolean z3 = (j2 & 4611686018427387904L) != 0;
            eiepVar.copyOnWrite();
            eies eiesVar8 = (eies) eiepVar.instance;
            eiesVar8.b |= 256;
            eiesVar8.k = z3;
        }
        if (z) {
            int i5 = get();
            eiepVar.copyOnWrite();
            eies eiesVar9 = (eies) eiepVar.instance;
            eiesVar9.b |= 128;
            eiesVar9.j = i5;
        }
        return (eies) eiepVar.build();
    }

    public eije(String str, eiez eiezVar, int i) {
        this.j = 2;
        this.h = false;
        this.i = 0L;
        this.b = null;
        this.c = str;
        this.f = 0;
        this.d = 0L;
        this.e = eiezVar;
        this.i = i != 2 ? Long.MIN_VALUE : 0L;
    }
}
