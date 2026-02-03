package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class ekzs extends ekzu {
    private static final long serialVersionUID = 1;
    private final elat a;
    private final elat b;

    public ekzs(elat elatVar, elat elatVar2) {
        this.a = elatVar;
        this.b = elatVar2;
    }

    @Override // defpackage.ekzu
    public final int a() {
        return 2;
    }

    @Override // defpackage.ekzu
    public final elat b(int i) {
        if (i == 0) {
            return this.a;
        }
        if (i == 1) {
            return this.b;
        }
        throw new ArrayIndexOutOfBoundsException();
    }
}
