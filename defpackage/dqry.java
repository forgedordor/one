package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dqry implements dqsq {
    public final dqrx a;
    public final boolean b;
    private final String c;
    private final List d;

    public dqry(int[] iArr, String str, dqrx dqrxVar) {
        this(iArr, false, str, dqrxVar);
    }

    @Override // defpackage.dqsq
    public final int a() {
        return ((Integer) this.d.get(0)).intValue();
    }

    @Override // defpackage.dqsq
    public final int b() {
        return 2;
    }

    @Override // defpackage.dqsq
    public final dqsp c(final dqsy dqsyVar) {
        final int iIntValue = ((Integer) this.d.remove(0)).intValue();
        return new dqrw(this, new Runnable() { // from class: dqrv
            @Override // java.lang.Runnable
            public final void run() {
                this.a.a.a(iIntValue, dqsyVar);
            }
        });
    }

    @Override // defpackage.dqsq
    public final String d() {
        return this.c;
    }

    @Override // defpackage.dqsq
    public final boolean e() {
        return !this.d.isEmpty();
    }

    @Override // defpackage.dqsq
    public final boolean f() {
        return false;
    }

    public dqry(int[] iArr, boolean z, String str, dqrx dqrxVar) {
        this.d = new ArrayList();
        this.c = str;
        this.b = z;
        for (int i : iArr) {
            this.d.add(Integer.valueOf(i));
        }
        this.a = dqrxVar;
    }
}
