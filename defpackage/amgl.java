package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class amgl implements amet, cmqg, axjy {
    public final fcsu a;
    public final List b;
    public final Object c;
    private final alxg d;

    public amgl(alxg alxgVar, fcsu fcsuVar) {
        alxgVar.getClass();
        fcsuVar.getClass();
        this.d = alxgVar;
        this.a = fcsuVar;
        this.b = new ArrayList();
        Object obj = new Object();
        this.c = obj;
        synchronized (obj) {
            ((anco) fcsuVar.b()).c(new amgj(this));
        }
    }

    @Override // defpackage.cmqg
    public final void a(boolean z) {
        this.d.a(z);
    }

    @Override // defpackage.cmqg
    public final void b(boolean z) {
        this.d.e();
    }

    @Override // defpackage.amet
    public final cquc c(final ajmg ajmgVar) {
        synchronized (this.c) {
            this.b.add(ajmgVar);
        }
        final cquc cqucVarC = this.d.c(ajmgVar);
        return new cquc() { // from class: amgi
            @Override // defpackage.cquc
            public final void a() {
                ajmg ajmgVar2 = ajmgVar;
                cquc cqucVar = cqucVarC;
                amgl amglVar = this.a;
                synchronized (amglVar.c) {
                    List list = amglVar.b;
                    list.remove(ajmgVar2);
                    if (list.isEmpty()) {
                        ((anco) amglVar.a.b()).b();
                    }
                    cqucVar.a();
                }
            }

            @Override // defpackage.cquc, java.io.Closeable, java.lang.AutoCloseable
            public final /* synthetic */ void close() {
                cqub.a(this);
            }
        };
    }

    @Override // defpackage.axjy
    public final void d(String str, String str2, long j) {
        this.d.d(str, str2, j);
    }
}
