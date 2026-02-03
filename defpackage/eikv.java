package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class eikv extends fbsl {
    private final fbsl a;
    private final eiik b;

    public eikv(fbsl fbslVar, eiik eiikVar) {
        this.a = fbslVar;
        this.b = eiikVar;
    }

    @Override // defpackage.fbsl
    public final void a() {
        eifp eifpVarA = this.b.a();
        try {
            this.a.a();
            eifpVarA.close();
        } catch (Throwable th) {
            try {
                eifpVarA.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.fbsl
    public final void b() {
        eifp eifpVarA = this.b.a();
        try {
            this.a.b();
            eifpVarA.close();
        } catch (Throwable th) {
            try {
                eifpVarA.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.fbsl
    public final void c() {
        eifp eifpVarA = this.b.a();
        try {
            this.a.c();
            eifpVarA.close();
        } catch (Throwable th) {
            try {
                eifpVarA.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.fbsl
    public final void d(Object obj) {
        eifp eifpVarA = this.b.a();
        try {
            this.a.d(obj);
            eifpVarA.close();
        } catch (Throwable th) {
            try {
                eifpVarA.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.fbsl
    public final void e() {
        eifp eifpVarA = this.b.a();
        try {
            this.a.e();
            eifpVarA.close();
        } catch (Throwable th) {
            try {
                eifpVarA.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
