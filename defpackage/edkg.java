package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class edkg extends ediy {
    public ekgp a;
    public ejwi b = ejud.a;
    private String c;
    private String d;
    private String e;
    private long f;
    private ekgb g;
    private ekgb h;
    private ekgb i;
    private byte j;

    @Override // defpackage.ediy
    public final ediz a() {
        String str;
        String str2;
        String str3;
        ekgb ekgbVar;
        ekgb ekgbVar2;
        ekgp ekgpVar;
        ekgb ekgbVar3;
        if (this.j == 1 && (str = this.c) != null && (str2 = this.d) != null && (str3 = this.e) != null && (ekgbVar = this.g) != null && (ekgbVar2 = this.h) != null && (ekgpVar = this.a) != null && (ekgbVar3 = this.i) != null) {
            return new edkh(str, str2, str3, this.f, ekgbVar, ekgbVar2, ekgpVar, this.b, ekgbVar3);
        }
        StringBuilder sb = new StringBuilder();
        if (this.c == null) {
            sb.append(" name");
        }
        if (this.d == null) {
            sb.append(" accessibilityLabel");
        }
        if (this.e == null) {
            sb.append(" url");
        }
        if (this.j == 0) {
            sb.append(" id");
        }
        if (this.g == null) {
            sb.append(" presets");
        }
        if (this.h == null) {
            sb.append(" frames");
        }
        if (this.a == null) {
            sb.append(" layers");
        }
        if (this.i == null) {
            sb.append(" eventLogs");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    @Override // defpackage.ediy
    public final void b(String str) {
        if (str == null) {
            throw new NullPointerException("Null accessibilityLabel");
        }
        this.d = str;
    }

    @Override // defpackage.ediy
    public final void c(ekgb ekgbVar) {
        if (ekgbVar == null) {
            throw new NullPointerException("Null eventLogs");
        }
        this.i = ekgbVar;
    }

    @Override // defpackage.ediy
    public final void d(Iterable iterable) {
        this.h = ekgb.j(iterable);
    }

    @Override // defpackage.ediy
    public final void e(long j) {
        this.f = j;
        this.j = (byte) 1;
    }

    @Override // defpackage.ediy
    public final void f(String str) {
        if (str == null) {
            throw new NullPointerException("Null name");
        }
        this.c = str;
    }

    @Override // defpackage.ediy
    public final void g(Iterable iterable) {
        this.g = ekgb.j(iterable);
    }

    @Override // defpackage.ediy
    public final void h(String str) {
        if (str == null) {
            throw new NullPointerException("Null url");
        }
        this.e = str;
    }
}
