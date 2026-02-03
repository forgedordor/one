package defpackage;

import android.util.Size;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cdt extends cgo {
    public Integer a;
    public cgq b;
    public Integer c;
    private String d;
    private Integer e;
    private Size f;
    private Integer g;
    private Integer h;
    private Integer i;
    private int j;

    public cdt() {
    }

    @Override // defpackage.cgo
    public final cgp a() {
        String str = this.d;
        Integer num = this.e;
        String strConcat = str == null ? " mimeType" : "";
        if (num == null) {
            strConcat = strConcat.concat(" profile");
        }
        if (this.j == 0) {
            strConcat = strConcat.concat(" inputTimebase");
        }
        if (this.f == null) {
            strConcat = strConcat.concat(" resolution");
        }
        if (this.a == null) {
            strConcat = strConcat.concat(" colorFormat");
        }
        if (this.b == null) {
            strConcat = strConcat.concat(" dataSpace");
        }
        if (this.g == null) {
            strConcat = strConcat.concat(" captureFrameRate");
        }
        if (this.h == null) {
            strConcat = strConcat.concat(" encodeFrameRate");
        }
        if (this.c == null) {
            strConcat = strConcat.concat(" IFrameInterval");
        }
        if (this.i == null) {
            strConcat = strConcat.concat(" bitrate");
        }
        if (strConcat.isEmpty()) {
            return new cdu(this.d, this.e.intValue(), this.j, this.f, this.a.intValue(), this.b, this.g.intValue(), this.h.intValue(), this.c.intValue(), this.i.intValue());
        }
        throw new IllegalStateException("Missing required properties:".concat(strConcat));
    }

    @Override // defpackage.cgo
    public final void b(int i) {
        this.i = Integer.valueOf(i);
    }

    @Override // defpackage.cgo
    public final void c(int i) {
        this.g = Integer.valueOf(i);
    }

    @Override // defpackage.cgo
    public final void d(int i) {
        this.h = Integer.valueOf(i);
    }

    @Override // defpackage.cgo
    public final void e(int i) {
        if (i == 0) {
            throw new NullPointerException("Null inputTimebase");
        }
        this.j = i;
    }

    @Override // defpackage.cgo
    public final void f(String str) {
        this.d = str;
    }

    @Override // defpackage.cgo
    public final void g(int i) {
        this.e = Integer.valueOf(i);
    }

    @Override // defpackage.cgo
    public final void h(Size size) {
        if (size == null) {
            throw new NullPointerException("Null resolution");
        }
        this.f = size;
    }

    public cdt(cgp cgpVar) {
        cdu cduVar = (cdu) cgpVar;
        this.d = cduVar.a;
        this.e = Integer.valueOf(cduVar.b);
        this.j = cduVar.j;
        this.f = cduVar.c;
        this.a = Integer.valueOf(cduVar.d);
        this.b = cduVar.e;
        this.g = Integer.valueOf(cduVar.f);
        this.h = Integer.valueOf(cduVar.g);
        this.c = Integer.valueOf(cduVar.h);
        this.i = Integer.valueOf(cduVar.i);
    }
}
