package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class odw {
    public int a;
    public int b;
    private String c;
    private String d;

    public odw() {
        this.a = -1;
    }

    public final odx a() {
        return new odx(this.a, this.c, this.d, this.b);
    }

    public final void b(String str) {
        String strF = mbw.f(str);
        boolean z = true;
        if (strF != null && !mbw.i(strF)) {
            z = false;
        }
        mee.b(z, "Not an audio MIME type: ".concat(String.valueOf(strF)));
        this.c = strF;
    }

    public final void c(String str) {
        String strF = mbw.f(str);
        boolean z = true;
        if (strF != null && !mbw.l(strF)) {
            z = false;
        }
        mee.b(z, "Not a video MIME type: ".concat(String.valueOf(strF)));
        this.d = strF;
    }

    public odw(odx odxVar) {
        this.a = odxVar.a;
        this.c = odxVar.b;
        this.d = odxVar.c;
        this.b = odxVar.d;
    }
}
