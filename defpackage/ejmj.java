package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class ejmj extends ejmn {
    private String a;
    private ekgb b;
    private float c;
    private String d;
    private ezal e;
    private byte f;

    @Override // defpackage.ejmn
    public final ejmo a() {
        String str;
        ekgb ekgbVar;
        String str2;
        ezal ezalVar;
        if (this.f == 1 && (str = this.a) != null && (ekgbVar = this.b) != null && (str2 = this.d) != null && (ezalVar = this.e) != null) {
            return new ejmk(str, ekgbVar, this.c, str2, ezalVar);
        }
        StringBuilder sb = new StringBuilder();
        if (this.a == null) {
            sb.append(" intent");
        }
        if (this.b == null) {
            sb.append(" entities");
        }
        if (this.f == 0) {
            sb.append(" score");
        }
        if (this.d == null) {
            sb.append(" textPrediction");
        }
        if (this.e == null) {
            sb.append(" source");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    @Override // defpackage.ejmn
    public final void b(ekgb ekgbVar) {
        if (ekgbVar == null) {
            throw new NullPointerException("Null entities");
        }
        this.b = ekgbVar;
    }

    @Override // defpackage.ejmn
    public final void c(String str) {
        if (str == null) {
            throw new NullPointerException("Null intent");
        }
        this.a = str;
    }

    @Override // defpackage.ejmn
    public final void d(float f) {
        this.c = f;
        this.f = (byte) 1;
    }

    @Override // defpackage.ejmn
    public final void e(ezal ezalVar) {
        if (ezalVar == null) {
            throw new NullPointerException("Null source");
        }
        this.e = ezalVar;
    }

    @Override // defpackage.ejmn
    public final void f(String str) {
        if (str == null) {
            throw new NullPointerException("Null textPrediction");
        }
        this.d = str;
    }
}
