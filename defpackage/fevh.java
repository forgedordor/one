package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public class fevh extends feou {
    public static final fevh c = new fevg("PUBLISH");
    public static final fevh d = new fevg("REQUEST");
    public static final fevh e = new fevg("REPLY");
    public static final fevh f = new fevg("ADD");
    public static final fevh g = new fevg("CANCEL");
    public static final fevh h = new fevg("REFRESH");
    public static final fevh i = new fevg("COUNTER");
    public static final fevh j = new fevg("DECLINE-COUNTER");
    private static final long serialVersionUID = 7220956532685378719L;
    private String k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fevh() {
        super("METHOD");
        fera feraVar = fera.a;
    }

    @Override // defpackage.fenc
    public final String a() {
        return this.k;
    }

    @Override // defpackage.feou
    public void c(String str) {
        this.k = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fevh(feor feorVar, String str) {
        super("METHOD", feorVar);
        fera feraVar = fera.a;
        this.k = str;
    }
}
