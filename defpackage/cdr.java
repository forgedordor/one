package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class cdr extends cdo {
    private String a;
    private Integer b;
    private Integer c;
    private Integer d;
    private Integer e;
    private Integer f;
    private int g;

    @Override // defpackage.cdo
    public final cdp a() {
        String str = this.a;
        Integer num = this.b;
        String strConcat = str == null ? " mimeType" : "";
        if (num == null) {
            strConcat = strConcat.concat(" profile");
        }
        if (this.g == 0) {
            strConcat = strConcat.concat(" inputTimebase");
        }
        if (this.c == null) {
            strConcat = strConcat.concat(" bitrate");
        }
        if (this.d == null) {
            strConcat = strConcat.concat(" captureSampleRate");
        }
        if (this.e == null) {
            strConcat = strConcat.concat(" encodeSampleRate");
        }
        if (this.f == null) {
            strConcat = strConcat.concat(" channelCount");
        }
        if (strConcat.isEmpty()) {
            return new cds(this.a, this.b.intValue(), this.g, this.c.intValue(), this.d.intValue(), this.e.intValue(), this.f.intValue());
        }
        throw new IllegalStateException("Missing required properties:".concat(strConcat));
    }

    @Override // defpackage.cdo
    public final void c(int i) {
        this.c = Integer.valueOf(i);
    }

    @Override // defpackage.cdo
    public final void d(int i) {
        this.d = Integer.valueOf(i);
    }

    @Override // defpackage.cdo
    public final void e(int i) {
        this.f = Integer.valueOf(i);
    }

    @Override // defpackage.cdo
    public final void f(int i) {
        this.e = Integer.valueOf(i);
    }

    @Override // defpackage.cdo
    public final void g(String str) {
        if (str == null) {
            throw new NullPointerException("Null mimeType");
        }
        this.a = str;
    }

    @Override // defpackage.cdo
    public final void h(int i) {
        this.b = Integer.valueOf(i);
    }

    @Override // defpackage.cdo
    public final void i() {
        this.g = 1;
    }
}
