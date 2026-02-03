package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ajqp extends ajsk {
    public Optional a = Optional.empty();
    public int b;
    private embo c;
    private int d;
    private byte e;

    @Override // defpackage.ajsk
    public final ajsl a() {
        embo emboVar;
        int i;
        if (this.e == 1 && (emboVar = this.c) != null && (i = this.b) != 0) {
            return new ajqq(this.a, emboVar, this.d, i);
        }
        StringBuilder sb = new StringBuilder();
        if (this.c == null) {
            sb.append(" reason");
        }
        if (this.e == 0) {
            sb.append(" terminalStatus");
        }
        if (this.b == 0) {
            sb.append(" canFallback");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    @Override // defpackage.ajsk
    public final void b(embo emboVar) {
        if (emboVar == null) {
            throw new NullPointerException("Null reason");
        }
        this.c = emboVar;
    }

    @Override // defpackage.ajsk
    public final void c(int i) {
        this.d = i;
        this.e = (byte) 1;
    }
}
