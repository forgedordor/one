package defpackage;

import java.io.Serializable;

/* compiled from: PG */
/* loaded from: classes6.dex */
public class fgnn extends fgnk implements Serializable, fgnh {
    private static final long serialVersionUID = 2581698638990L;
    private volatile long a;

    protected fgnn(long j) {
        this.a = j;
    }

    @Override // defpackage.fgnh
    public long getMillis() {
        return this.a;
    }
}
