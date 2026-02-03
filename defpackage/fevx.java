package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fevx extends feou {
    private static final long serialVersionUID = -1606972893204822853L;
    private int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fevx() {
        super("SEQUENCE");
        fera feraVar = fera.a;
        this.c = 0;
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
