package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dqol extends dqrq {
    public String a;
    public dqrr b;
    private String c;
    private int d;
    private int e;
    private boolean f;
    private ekgb g;
    private int h;
    private byte i;

    @Override // defpackage.dqrq
    public final dqrs a() {
        String str;
        String str2;
        ekgb ekgbVar;
        if (this.i == 15 && (str = this.c) != null && (str2 = this.a) != null && (ekgbVar = this.g) != null) {
            return new dqom(str, str2, this.d, this.e, this.f, ekgbVar, this.b, this.h);
        }
        StringBuilder sb = new StringBuilder();
        if (this.c == null) {
            sb.append(" storageFileName");
        }
        if (this.a == null) {
            sb.append(" handleName");
        }
        if ((this.i & 1) == 0) {
            sb.append(" currentSchemaVersion");
        }
        if ((this.i & 2) == 0) {
            sb.append(" transactionOrderingPosition");
        }
        if ((this.i & 4) == 0) {
            sb.append(" ignoreDowngrade");
        }
        if (this.g == null) {
            sb.append(" invalidRanges");
        }
        if ((this.i & 8) == 0) {
            sb.append(" maxAllowableSchemaVersionForUniqueIndex");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    @Override // defpackage.dqrq
    public final void b(int i) {
        this.d = i;
        this.i = (byte) (this.i | 1);
    }

    @Override // defpackage.dqrq
    public final void c(boolean z) {
        this.f = z;
        this.i = (byte) (this.i | 4);
    }

    @Override // defpackage.dqrq
    public final void d(ekgb ekgbVar) {
        if (ekgbVar == null) {
            throw new NullPointerException("Null invalidRanges");
        }
        this.g = ekgbVar;
    }

    @Override // defpackage.dqrq
    public final void e(int i) {
        this.h = i;
        this.i = (byte) (this.i | 8);
    }

    @Override // defpackage.dqrq
    public final void f(String str) {
        if (str == null) {
            throw new NullPointerException("Null storageFileName");
        }
        this.c = str;
    }

    @Override // defpackage.dqrq
    public final void g(int i) {
        this.e = i;
        this.i = (byte) (this.i | 2);
    }
}
