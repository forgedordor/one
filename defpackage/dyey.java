package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dyey extends dygl {
    private int a;
    private int b;
    private int c;
    private byte d;

    @Override // defpackage.dygl
    public final dygm a() {
        if (this.d == 7) {
            return new dyez(this.a, this.b, this.c);
        }
        StringBuilder sb = new StringBuilder();
        if ((this.d & 1) == 0) {
            sb.append(" cardCellId");
        }
        if ((this.d & 2) == 0) {
            sb.append(" cardMainActionId");
        }
        if ((this.d & 4) == 0) {
            sb.append(" cardSecondaryActionId");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    @Override // defpackage.dygl
    public final void b(int i) {
        this.a = i;
        this.d = (byte) (this.d | 1);
    }

    @Override // defpackage.dygl
    public final void c(int i) {
        this.b = i;
        this.d = (byte) (this.d | 2);
    }

    @Override // defpackage.dygl
    public final void d(int i) {
        this.c = i;
        this.d = (byte) (this.d | 4);
    }
}
