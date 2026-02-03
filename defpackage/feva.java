package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class feva extends feou {
    private static final long serialVersionUID = -6415954847619338567L;
    private feot c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public feva() {
        super("FREEBUSY");
        fera feraVar = fera.a;
        this.c = new feot();
    }

    @Override // defpackage.fenc
    public final String a() {
        return this.c.toString();
    }

    @Override // defpackage.feou
    public final void c(String str) {
        this.c = new feot(str);
    }
}
