package defpackage;

import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes5.dex */
abstract class eibd implements eifn {
    private final eifn a;
    private final UUID b;
    private final String c;
    private final String d;
    private Thread e;
    private eiit f;

    public eibd(String str, eifn eifnVar, eifi eifiVar) {
        str.getClass();
        this.d = str;
        this.a = eifnVar;
        this.b = eifnVar.g();
        this.c = eifnVar.e();
        eiit eiitVar = eifiVar.e;
        if (eiitVar == null) {
            this.f = null;
            this.e = Thread.currentThread();
        } else {
            this.f = eiitVar;
            this.e = null;
        }
    }

    public static String ho(UUID uuid) {
        return "tk-trace-id: ".concat(String.valueOf(Long.toString(uuid.getLeastSignificantBits() >>> 1, 36)));
    }

    @Override // defpackage.eifn
    public final eifn a() {
        return this.a;
    }

    @Override // defpackage.eifn
    public final eiit b() {
        return this.f;
    }

    @Override // defpackage.eifp, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        eidc.p(this);
        this.e = null;
        this.f = null;
    }

    @Override // defpackage.eifn
    public final String d() {
        return this.d;
    }

    @Override // defpackage.eifn
    public final String e() {
        return this.c;
    }

    @Override // defpackage.eifn
    public final Thread f() {
        return this.e;
    }

    @Override // defpackage.eifn
    public final UUID g() {
        return this.b;
    }

    public final String toString() {
        return eidc.o(this);
    }

    public eibd(String str, UUID uuid, String str2, eifi eifiVar) {
        this.d = str;
        Thread threadCurrentThread = null;
        this.a = null;
        this.b = uuid;
        this.c = str2;
        eiit eiitVar = eifiVar.e;
        if (eiitVar == null) {
            this.f = null;
            threadCurrentThread = Thread.currentThread();
        } else {
            this.f = eiitVar;
        }
        this.e = threadCurrentThread;
    }
}
