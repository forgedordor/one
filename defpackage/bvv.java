package defpackage;

import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bvv extends bkm {
    public int a;
    private final String b;

    public bvv(bir birVar) {
        super(birVar);
        this.b = "virtual-" + birVar.l() + "-" + UUID.randomUUID().toString();
    }

    @Override // defpackage.bkm, defpackage.azd
    public final int b() {
        return c(0);
    }

    @Override // defpackage.bkm, defpackage.azd
    public final int c(int i) {
        return boy.b(super.c(i) - this.a);
    }

    @Override // defpackage.bkm, defpackage.bir
    public final String l() {
        return this.b;
    }
}
