package defpackage;

import java.util.Random;

/* compiled from: PG */
/* loaded from: classes6.dex */
public abstract class fdda extends fddf {
    @Override // defpackage.fddf
    public final int a(int i) {
        return fddg.b(e().nextInt(), i);
    }

    @Override // defpackage.fddf
    public final int b() {
        return e().nextInt();
    }

    @Override // defpackage.fddf
    public final int c(int i) {
        return e().nextInt(i);
    }

    @Override // defpackage.fddf
    public final long d() {
        return e().nextLong();
    }

    public abstract Random e();
}
