package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class djd implements diw {
    private final dej a;
    private deh b;
    private deh c;
    private deh d;

    public djd(dej dejVar) {
        this.a = dejVar;
    }

    @Override // defpackage.diw
    public final long a(deh dehVar, deh dehVar2, deh dehVar3) {
        int iB = dehVar.b();
        long jMax = 0;
        for (int i = 0; i < iB; i++) {
            jMax = Math.max(jMax, this.a.a(i).e(dehVar.a(i), dehVar2.a(i), dehVar3.a(i)));
        }
        return jMax;
    }

    @Override // defpackage.diw
    public final deh b(deh dehVar, deh dehVar2, deh dehVar3) {
        if (this.d == null) {
            this.d = dehVar3.c();
        }
        deh dehVar4 = this.d;
        if (dehVar4 == null) {
            fdbq.c("endVelocityVector");
            dehVar4 = null;
        }
        int iB = dehVar4.b();
        for (int i = 0; i < iB; i++) {
            deh dehVar5 = this.d;
            if (dehVar5 == null) {
                fdbq.c("endVelocityVector");
                dehVar5 = null;
            }
            dehVar5.e(i, this.a.a(i).b(dehVar.a(i), dehVar2.a(i), dehVar3.a(i)));
        }
        deh dehVar6 = this.d;
        if (dehVar6 != null) {
            return dehVar6;
        }
        fdbq.c("endVelocityVector");
        return null;
    }

    @Override // defpackage.diw
    public final deh c(long j, deh dehVar, deh dehVar2, deh dehVar3) {
        if (this.b == null) {
            this.b = dehVar.c();
        }
        deh dehVar4 = this.b;
        if (dehVar4 == null) {
            fdbq.c("valueVector");
            dehVar4 = null;
        }
        int iB = dehVar4.b();
        for (int i = 0; i < iB; i++) {
            deh dehVar5 = this.b;
            if (dehVar5 == null) {
                fdbq.c("valueVector");
                dehVar5 = null;
            }
            dehVar5.e(i, this.a.a(i).c(j, dehVar.a(i), dehVar2.a(i), dehVar3.a(i)));
        }
        deh dehVar6 = this.b;
        if (dehVar6 != null) {
            return dehVar6;
        }
        fdbq.c("valueVector");
        return null;
    }

    @Override // defpackage.diw
    public final deh d(long j, deh dehVar, deh dehVar2, deh dehVar3) {
        if (this.c == null) {
            this.c = dehVar3.c();
        }
        deh dehVar4 = this.c;
        if (dehVar4 == null) {
            fdbq.c("velocityVector");
            dehVar4 = null;
        }
        int iB = dehVar4.b();
        for (int i = 0; i < iB; i++) {
            deh dehVar5 = this.c;
            if (dehVar5 == null) {
                fdbq.c("velocityVector");
                dehVar5 = null;
            }
            dehVar5.e(i, this.a.a(i).d(j, dehVar.a(i), dehVar2.a(i), dehVar3.a(i)));
        }
        deh dehVar6 = this.c;
        if (dehVar6 != null) {
            return dehVar6;
        }
        fdbq.c("velocityVector");
        return null;
    }

    @Override // defpackage.diw
    public final /* synthetic */ boolean e() {
        return false;
    }

    public djd(dey deyVar) {
        this(new djc(deyVar));
    }
}
