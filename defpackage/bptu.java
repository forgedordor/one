package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public class bptu extends dqpg {
    public String a;
    public long b;
    public long c;

    public bptu() {
        super(bput.b());
        this.c = 0L;
    }

    public final bpts a() {
        bptt bpttVar = new bptt();
        bpttVar.aD(aB());
        bpttVar.a = this.a;
        bpttVar.b = this.b;
        bpttVar.c = this.c;
        bpttVar.cM = aC();
        return bpttVar;
    }

    public final void b(long j) {
        aE(2);
        this.c = j;
    }

    public final void c(long j) {
        aE(1);
        this.b = j;
    }
}
