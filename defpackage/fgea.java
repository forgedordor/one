package defpackage;

import android.os.SystemClock;
import org.chromium.net.impl.ImplVersion;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fgea {
    public final fgcx a;
    private final fgdb b;
    private final long c;

    public fgea(fgdb fgdbVar, long j, long j2, fgcy fgcyVar) {
        fgcx fgcxVar = new fgcx();
        this.a = fgcxVar;
        this.b = fgdbVar;
        fgcxVar.a = j;
        fgcxVar.i = fgcyVar;
        fgcxVar.h = ImplVersion.getCronetVersion();
        this.c = j2;
    }

    public final int a() {
        return (int) (SystemClock.uptimeMillis() - this.c);
    }

    public final void b() {
        fgcx fgcxVar = this.a;
        if (fgcxVar.b < 0 || fgcxVar.c < 0) {
            return;
        }
        this.b.d(fgcxVar);
    }
}
