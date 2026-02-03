package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fevf extends feou {
    private static final long serialVersionUID = -3541686430899510312L;
    private fenm c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fevf() {
        super("LOCATION-TYPE");
        fera feraVar = fera.a;
        this.c = new fenm();
    }

    @Override // defpackage.fenc
    public final String a() {
        return this.c.toString();
    }

    @Override // defpackage.feou
    public final void c(String str) {
        this.c = new fenm(str);
    }
}
