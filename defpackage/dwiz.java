package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dwiz extends dwrm {
    private int a;
    private int b;
    private ekgb c;
    private byte d;

    @Override // defpackage.dwrm
    public final dwrn a() {
        ekgb ekgbVar;
        if (this.d == 3 && (ekgbVar = this.c) != null) {
            return new dwoh(this.a, this.b, ekgbVar);
        }
        StringBuilder sb = new StringBuilder();
        if ((this.d & 1) == 0) {
            sb.append(" startIndex");
        }
        if ((this.d & 2) == 0) {
            sb.append(" endIndex");
        }
        if (this.c == null) {
            sb.append(" textStyles");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    @Override // defpackage.dwrm
    public final void b(int i) {
        this.b = i;
        this.d = (byte) (this.d | 2);
    }

    @Override // defpackage.dwrm
    public final void c(int i) {
        this.a = i;
        this.d = (byte) (this.d | 1);
    }

    @Override // defpackage.dwrm
    public final void d(ekgb ekgbVar) {
        if (ekgbVar == null) {
            throw new NullPointerException("Null textStyles");
        }
        this.c = ekgbVar;
    }
}
