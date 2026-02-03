package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dwix extends dwrk {
    private String a;
    private ejwi b;
    private ejwi c;
    private ejwi d;
    private ejwi e;

    public dwix() {
        ejud ejudVar = ejud.a;
        this.b = ejudVar;
        this.c = ejudVar;
        this.d = ejudVar;
        this.e = ejudVar;
    }

    @Override // defpackage.dwrk
    public final dwrl a() {
        String str = this.a;
        if (str != null) {
            return new dwog(str, this.b, this.c, this.d, this.e);
        }
        throw new IllegalStateException("Missing required properties: rawText");
    }

    @Override // defpackage.dwrk
    public final void b(ekgb ekgbVar) {
        this.d = ejwi.j(ekgbVar);
    }

    @Override // defpackage.dwrk
    public final void c(ekgb ekgbVar) {
        this.c = ejwi.j(ekgbVar);
    }

    @Override // defpackage.dwrk
    public final void d(dwru dwruVar) {
        this.b = ejwi.j(dwruVar);
    }

    @Override // defpackage.dwrk
    public final void e(String str) {
        if (str == null) {
            throw new NullPointerException("Null rawText");
        }
        this.a = str;
    }

    @Override // defpackage.dwrk
    public final void f(boolean z) {
        this.e = ejwi.j(Boolean.valueOf(z));
    }
}
