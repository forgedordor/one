package defpackage;

import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class rbz {
    public final rca a;
    public final boolean[] b;
    public boolean c;
    public final /* synthetic */ rcc d;

    public rbz(rcc rccVar, rca rcaVar) {
        this.d = rccVar;
        this.a = rcaVar;
        this.b = rcaVar.e ? null : new boolean[rccVar.d];
    }

    public final void a() {
        this.d.b(this, false);
    }

    public final void b() {
        if (this.c) {
            return;
        }
        try {
            a();
        } catch (IOException unused) {
        }
    }
}
