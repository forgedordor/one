package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fevw extends feou {
    private static final long serialVersionUID = -848562477226746807L;
    private fere c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fevw() {
        super("RESOURCES");
        fera feraVar = fera.a;
        this.c = new fere();
    }

    @Override // defpackage.fenc
    public final String a() {
        return this.c.toString();
    }

    @Override // defpackage.feou
    public final void c(String str) {
        this.c = new fere(str);
    }
}
