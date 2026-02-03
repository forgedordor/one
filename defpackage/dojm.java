package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class dojm implements dogj<dojm, dogo> {
    private static final doie a;
    public static final fctc b;
    private final String d;

    static {
        new dojd("*");
        a = doie.a;
        b = fctd.a(new fdae() { // from class: doio
            @Override // defpackage.fdae
            public final Object invoke() {
                fctc fctcVar = dojm.b;
                return fcva.g(dojh.a, dojl.a, dojk.a, doiq.a, doit.a, doiv.a, doix.a, dojb.a, doja.a, dojf.a);
            }
        });
    }

    public dojm(String str) {
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
