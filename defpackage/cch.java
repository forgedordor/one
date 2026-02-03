package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class cch extends cbh {
    private Integer a;
    private Integer b;
    private Integer c;
    private Integer d;
    private Integer e;

    @Override // defpackage.cbh
    public final cbi a() {
        Integer num = this.a;
        Integer num2 = this.b;
        String strConcat = num == null ? " audioSource" : "";
        if (num2 == null) {
            strConcat = strConcat.concat(" captureSampleRate");
        }
        if (this.c == null) {
            strConcat = strConcat.concat(" encodeSampleRate");
        }
        if (this.d == null) {
            strConcat = strConcat.concat(" channelCount");
        }
        if (this.e == null) {
            strConcat = strConcat.concat(" audioFormat");
        }
        if (strConcat.isEmpty()) {
            return new cci(this.a.intValue(), this.b.intValue(), this.c.intValue(), this.d.intValue(), this.e.intValue());
        }
        throw new IllegalStateException("Missing required properties:".concat(strConcat));
    }

    @Override // defpackage.cbh
    public final void c(int i) {
        this.e = Integer.valueOf(i);
    }

    @Override // defpackage.cbh
    public final void d(int i) {
        this.a = Integer.valueOf(i);
    }

    @Override // defpackage.cbh
    public final void e(int i) {
        this.b = Integer.valueOf(i);
    }

    @Override // defpackage.cbh
    public final void f(int i) {
        this.d = Integer.valueOf(i);
    }

    @Override // defpackage.cbh
    public final void g(int i) {
        this.c = Integer.valueOf(i);
    }
}
