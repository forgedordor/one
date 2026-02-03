package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class bwq extends bxg {
    public bwi a;
    private cax b;
    private Integer c;

    public bwq() {
    }

    @Override // defpackage.bxg
    public final bxh a() {
        cax caxVar = this.b;
        bwi bwiVar = this.a;
        String strConcat = caxVar == null ? " videoSpec" : "";
        if (bwiVar == null) {
            strConcat = strConcat.concat(" audioSpec");
        }
        if (this.c == null) {
            strConcat = strConcat.concat(" outputFormat");
        }
        if (strConcat.isEmpty()) {
            return new bwr(this.b, this.a, this.c.intValue());
        }
        throw new IllegalStateException("Missing required properties:".concat(strConcat));
    }

    @Override // defpackage.bxg
    public final cax b() {
        cax caxVar = this.b;
        if (caxVar != null) {
            return caxVar;
        }
        throw new IllegalStateException("Property \"videoSpec\" has not been set");
    }

    @Override // defpackage.bxg
    public final void c() {
        this.c = -1;
    }

    @Override // defpackage.bxg
    public final void d(cax caxVar) {
        if (caxVar == null) {
            throw new NullPointerException("Null videoSpec");
        }
        this.b = caxVar;
    }

    public bwq(bxh bxhVar) {
        bwr bwrVar = (bwr) bxhVar;
        this.b = bwrVar.a;
        this.a = bwrVar.b;
        this.c = Integer.valueOf(bwrVar.c);
    }
}
