package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class doyz implements doba {
    private String a;
    private String b;
    private String c;
    private Iterable d;
    private doas e;

    @Override // defpackage.dlvw
    public final /* bridge */ /* synthetic */ dltc a() {
        doas doasVar = this.e;
        if (doasVar != null) {
            return doasVar;
        }
        throw new IllegalStateException("Property \"source\" has not been set");
    }

    @Override // defpackage.dlwe
    public final /* bridge */ /* synthetic */ dltd b() {
        String str;
        String str2;
        Iterable iterable;
        doas doasVar;
        String str3 = this.a;
        if (str3 != null && (str = this.b) != null && (str2 = this.c) != null && (iterable = this.d) != null && (doasVar = this.e) != null) {
            return new doyt(str3, str, str2, iterable, doasVar);
        }
        StringBuilder sb = new StringBuilder();
        if (this.a == null) {
            sb.append(" id");
        }
        if (this.b == null) {
            sb.append(" description");
        }
        if (this.c == null) {
            sb.append(" webUrl");
        }
        if (this.d == null) {
            sb.append(" variations");
        }
        if (this.e == null) {
            sb.append(" source");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    @Override // defpackage.doba
    public final /* synthetic */ void c(String str) {
        this.b = str;
    }

    @Override // defpackage.doba
    public final /* synthetic */ void d(String str) {
        this.a = str;
    }

    @Override // defpackage.done
    public final /* synthetic */ void e(Iterable iterable) {
        this.d = iterable;
    }

    @Override // defpackage.doba
    public final /* synthetic */ void f(String str) {
        this.c = str;
    }

    @Override // defpackage.dlvw
    public final /* bridge */ /* synthetic */ void g(dltc dltcVar) {
        this.e = (doas) dltcVar;
    }
}
