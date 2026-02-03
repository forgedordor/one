package defpackage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.xbill.DNS2.ResolverConfig;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fgxk implements fgzk {
    public List a;
    public int b = 3;

    public fgxk() {
        d();
        String[] strArr = ResolverConfig.b().servers;
        if (strArr == null) {
            this.a.add(new fgzu(null));
            return;
        }
        for (String str : strArr) {
            fgzu fgzuVar = new fgzu(str);
            fgzuVar.b(5);
            this.a.add(fgzuVar);
        }
    }

    private final void d() {
        this.a = new ArrayList();
    }

    @Override // defpackage.fgzk
    public final fgyi a(fgyi fgyiVar) throws IOException {
        fgxj fgxjVar = new fgxj(this, fgyiVar);
        try {
            int[] iArr = fgxjVar.b;
            iArr[0] = iArr[0] + 1;
            fgxjVar.e++;
            fgxjVar.c[0] = new Object();
            return fgxjVar.a[0].a(fgxjVar.g);
        } catch (Exception e) {
            fgxjVar.a(fgxjVar.c[0], e);
            synchronized (fgxjVar) {
                while (!fgxjVar.f) {
                    try {
                        fgxjVar.wait();
                    } catch (InterruptedException unused) {
                    }
                }
                fgyi fgyiVar2 = fgxjVar.h;
                if (fgyiVar2 != null) {
                    return fgyiVar2;
                }
                Throwable th = fgxjVar.i;
                if (th instanceof IOException) {
                    throw ((IOException) th);
                }
                if (th instanceof RuntimeException) {
                    throw ((RuntimeException) th);
                }
                if (th instanceof Error) {
                    throw ((Error) th);
                }
                throw new IllegalStateException("ExtendedResolver failure");
            }
        }
    }

    @Override // defpackage.fgzk
    public final void b(int i) {
        for (int i2 = 0; i2 < this.a.size(); i2++) {
            ((fgzk) this.a.get(i2)).b(i);
        }
    }

    @Override // defpackage.fgzk
    public final Object c(fgyi fgyiVar, fgxj fgxjVar) {
        fgxj fgxjVar2 = new fgxj(this, fgyiVar);
        fgxjVar2.j = fgxjVar;
        fgxjVar2.b(0);
        return fgxjVar2;
    }

    public fgxk(fgzk[] fgzkVarArr) {
        d();
        for (fgzk fgzkVar : fgzkVarArr) {
            this.a.add(fgzkVar);
        }
    }
}
