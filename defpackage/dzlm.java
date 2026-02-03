package defpackage;

import android.content.Context;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dzlm {
    public final dzlj a;
    public final fcsu b;
    public final dzvy c;
    public final fcsu d;
    public final eygg e;
    private final dzfu f;
    private final Executor g;

    public dzlm(dzlj dzljVar, fcsu fcsuVar, dzfu dzfuVar, dzvz dzvzVar, final fcsu fcsuVar2, Executor executor, eygg eyggVar, fcsu fcsuVar3) {
        this.a = dzljVar;
        this.f = dzfuVar;
        this.b = fcsuVar;
        this.g = executor;
        this.d = new fcsu() { // from class: dzlk
            @Override // defpackage.fcsu
            public final Object b() {
                fcsu fcsuVar4 = fcsuVar2;
                if (!((ejwi) fcsuVar4.b()).g()) {
                    return null;
                }
                return null;
            }
        };
        Context context = (Context) dzvzVar.a.b();
        context.getClass();
        Executor executor2 = (Executor) dzvzVar.b.b();
        executor2.getClass();
        dzwc dzwcVar = (dzwc) dzvzVar.c.b();
        dzwcVar.getClass();
        Boolean bool = (Boolean) dzvzVar.d.b();
        bool.getClass();
        boolean zBooleanValue = bool.booleanValue();
        ejwi ejwiVar = (ejwi) ((eyig) dzvzVar.e).a;
        dzvu dzvuVar = (dzvu) dzvzVar.f.b();
        dzvuVar.getClass();
        this.c = new dzvy(context, executor2, dzwcVar, eyggVar, zBooleanValue, ejwiVar, fcsuVar3, dzvuVar);
        this.e = eyggVar;
    }

    public final long a(String str) {
        if (!this.f.a) {
            dzvy dzvyVar = this.c;
            if (dzvyVar.c.b()) {
                return -1L;
            }
            boolean z = dzvyVar.b;
            dzwd dzwdVar = dzvyVar.a;
            if (z) {
                return dzwdVar.a(str);
            }
        }
        return -1L;
    }

    public final ListenableFuture b(final dzlf dzlfVar) {
        return this.f.a ? eork.g() : eork.n(new eooy() { // from class: dzll
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:103:0x02df A[LOOP:1: B:101:0x02dc->B:103:0x02df, LOOP_END] */
            @Override // defpackage.eooy
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final com.google.common.util.concurrent.ListenableFuture a() throws java.security.NoSuchAlgorithmException {
                /*
                    Method dump skipped, instructions count: 1829
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.dzll.a():com.google.common.util.concurrent.ListenableFuture");
            }
        }, this.g);
    }

    public final boolean c(String str) {
        return a(str) != -1;
    }

    public final boolean d() {
        dzvy dzvyVar = this.c;
        return dzvyVar.b && dzvyVar.a.d();
    }
}
