package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class ccrf {
    private final fadx a;
    private final ceqc b;

    public ccrf(fadx fadxVar, ceqc ceqcVar) {
        this.a = fadxVar;
        this.b = ceqcVar;
    }

    public final fadx a(cccv cccvVar) {
        String str = cccvVar.a;
        if (str.length() <= 0) {
            throw new IllegalArgumentException("KDS url must not be empty");
        }
        fcrn fcrnVarD = ceqb.d(this.a, this.b.b(), str);
        fcrnVarD.getClass();
        return (fadx) fcrnVarD;
    }
}
