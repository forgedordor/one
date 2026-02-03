package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public class ffhk {
    private final String a;
    private final ffhl b;
    private final ffht c;

    public ffhk(String str, ffht ffhtVar) {
        if (str == null) {
            throw new IllegalArgumentException("Name may not be null");
        }
        if (ffhtVar == null) {
            throw new IllegalArgumentException("Body may not be null");
        }
        this.a = str;
        this.c = ffhtVar;
        this.b = new ffhl();
        e(ffhtVar);
        f(ffhtVar);
        g(ffhtVar);
    }

    public String a() {
        return this.a;
    }

    public ffhl b() {
        return this.b;
    }

    public ffht c() {
        return this.c;
    }

    public void d(String str, String str2) {
        if (str == null) {
            throw new IllegalArgumentException("Field name may not be null");
        }
        this.b.e(new ffhp(str, str2));
    }

    protected void e(ffht ffhtVar) {
        StringBuilder sb = new StringBuilder("form-data; name=\"");
        sb.append(a());
        sb.append("\"");
        if (ffhtVar.f() != null) {
            sb.append("; filename=\"");
            sb.append(ffhtVar.f());
            sb.append("\"");
        }
        d(ffho.c, sb.toString());
    }

    protected void f(ffht ffhtVar) {
        StringBuilder sb = new StringBuilder();
        sb.append(ffhtVar.c());
        if (ffhtVar.e() != null) {
            sb.append("; charset=");
            sb.append(ffhtVar.e());
        }
        d(ffho.a, sb.toString());
    }

    protected void g(ffht ffhtVar) {
        d(ffho.b, ffhtVar.g());
    }
}
