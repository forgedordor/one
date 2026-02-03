package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class dogg implements dogj<dogg, dogk> {
    private static final doia a;
    public static final /* synthetic */ int b = 0;
    private final String d;

    static {
        new dogd("*");
        a = doia.a;
    }

    public dogg(String str) {
        this.d = str;
    }

    @Override // defpackage.dogj
    public String a() {
        return this.d;
    }

    @Override // defpackage.dogj
    public final doif b() {
        return a;
    }

    @Override // defpackage.dogj
    public final /* synthetic */ doig c() {
        return dogh.a(this);
    }
}
