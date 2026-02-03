package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ejlb implements ejkz {
    private Object a;
    private int b = 0;
    private boolean c = false;
    private final ejmr d;

    public ejlb(ejmr ejmrVar, Object obj) {
        this.d = ejmrVar;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [euob, java.lang.Object] */
    private final synchronized void e() {
        this.a.close();
        this.a = null;
    }

    private final synchronized boolean f() {
        return this.a == null;
    }

    @Override // defpackage.ejkz
    public final synchronized void b() {
        if (f()) {
            return;
        }
        if (this.b == 0) {
            e();
        } else {
            this.c = true;
        }
    }

    @Override // defpackage.ejkz
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final synchronized ejla a() {
        if (f()) {
            this.a = this.d.a();
        }
        this.b++;
        return new ejla(this.a, this);
    }

    public final synchronized void d() {
        int i = this.b - 1;
        this.b = i;
        if (i == 0 && this.c) {
            this.c = false;
            e();
        }
    }
}
