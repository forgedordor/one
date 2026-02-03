package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public class fevn extends feou {
    public static final fevn c = new fevm(0);
    public static final fevn d = new fevm(1);
    public static final fevn e = new fevm(5);
    public static final fevn f = new fevm(9);
    private static final long serialVersionUID = -5654367843953827397L;
    private int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fevn() {
        super("PRIORITY");
        fera feraVar = fera.a;
        this.g = c.g;
    }

    @Override // defpackage.fenc
    public final String a() {
        return String.valueOf(this.g);
    }

    @Override // defpackage.feou
    public void c(String str) {
        this.g = Integer.parseInt(str);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fevn(feor feorVar, int i) {
        super("PRIORITY", feorVar);
        fera feraVar = fera.a;
        this.g = i;
    }
}
