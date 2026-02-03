package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public class bvbd extends dqpg {
    public String a;
    public String b;

    public bvbd() {
        super(bvbu.b().M());
    }

    public final bvbb a() {
        bvbc bvbcVar = new bvbc();
        bvbcVar.aD(aB());
        bvbcVar.a = this.a;
        bvbcVar.b = this.b;
        bvbcVar.cM = aC();
        return bvbcVar;
    }

    public final void b(String str) {
        aE(1);
        this.b = str;
    }

    public final void c(String str) {
        aE(0);
        this.a = str;
    }
}
