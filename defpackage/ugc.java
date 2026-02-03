package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ugc {
    public final fdjx a;
    public final egzh b;
    public final String c;
    public final feav d = new feaz();
    public egpe e;
    private final ufz f;

    public ugc(fdjx fdjxVar, egzh egzhVar, String str, ufz ufzVar) {
        this.a = fdjxVar;
        this.b = egzhVar;
        this.c = str;
        this.f = ufzVar;
        ufzVar.a(new fdae() { // from class: ufy
            @Override // defpackage.fdae
            public final Object invoke() {
                ugc ugcVar = this.a;
                ugcVar.b.a(auvw.c(ugcVar.a, fcyi.a, fdjz.a, new ugb(ugcVar, null)), ugcVar.c);
                return fctx.a;
            }
        });
    }

    public final void a() {
        this.f.b();
    }
}
