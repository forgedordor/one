package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public abstract class coij {
    public abstract coik a();

    public abstract void b(long j);

    public abstract void c(long j);

    public final coik d() {
        coik coikVarA = a();
        cohj cohjVar = (cohj) coikVarA;
        ejwl.m(cohjVar.a >= 0, "Bytes transferred must be non-negative.");
        ejwl.m(cohjVar.b >= 0, "Total bytes in file must be non-negative.");
        return coikVarA;
    }
}
