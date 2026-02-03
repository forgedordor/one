package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class dje {
    public final dez a;
    public deh b;
    public deh c;
    public final float d;
    private deh e;

    public dje(dez dezVar) {
        this.a = dezVar;
        this.d = dezVar.a();
    }

    public final deh a(deh dehVar, deh dehVar2) {
        if (this.e == null) {
            this.e = dehVar.c();
        }
        deh dehVar3 = this.e;
        if (dehVar3 == null) {
            fdbq.c("targetVector");
            dehVar3 = null;
        }
        int iB = dehVar3.b();
        for (int i = 0; i < iB; i++) {
            deh dehVar4 = this.e;
            if (dehVar4 == null) {
                fdbq.c("targetVector");
                dehVar4 = null;
            }
            dehVar4.e(i, this.a.b(dehVar.a(i), dehVar2.a(i)));
        }
        deh dehVar5 = this.e;
        if (dehVar5 != null) {
            return dehVar5;
        }
        fdbq.c("targetVector");
        return null;
    }

    public final deh b(long j, deh dehVar, deh dehVar2) {
        if (this.c == null) {
            this.c = dehVar.c();
        }
        deh dehVar3 = this.c;
        if (dehVar3 == null) {
            fdbq.c("velocityVector");
            dehVar3 = null;
        }
        int iB = dehVar3.b();
        for (int i = 0; i < iB; i++) {
            deh dehVar4 = this.c;
            if (dehVar4 == null) {
                fdbq.c("velocityVector");
                dehVar4 = null;
            }
            dez dezVar = this.a;
            dehVar.a(i);
            dehVar4.e(i, dezVar.e(j, dehVar2.a(i)));
        }
        deh dehVar5 = this.c;
        if (dehVar5 != null) {
            return dehVar5;
        }
        fdbq.c("velocityVector");
        return null;
    }
}
