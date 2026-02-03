package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fevk extends feou {
    private static final long serialVersionUID = 7788138484983240112L;
    private int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fevk() {
        super("PERCENT-COMPLETE");
        fera feraVar = fera.a;
    }

    @Override // defpackage.fenc
    public final String a() {
        return String.valueOf(this.c);
    }

    @Override // defpackage.feou
    public final void c(String str) {
        this.c = Integer.parseInt(str);
    }
}
