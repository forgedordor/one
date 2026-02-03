package defpackage;

import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aiij extends aiiq {
    public Supplier a;
    private String b;
    private int c;
    private byte d;

    @Override // defpackage.aiiq
    public final aiir a() {
        String str;
        Supplier supplier;
        if (this.d == 1 && (str = this.b) != null && (supplier = this.a) != null) {
            return new aiik(str, this.c, supplier);
        }
        StringBuilder sb = new StringBuilder();
        if (this.b == null) {
            sb.append(" className");
        }
        if (this.d == 0) {
            sb.append(" xmlResId");
        }
        if (this.a == null) {
            sb.append(" enabled");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    @Override // defpackage.aiiq
    public final void b(String str) {
        if (str == null) {
            throw new NullPointerException("Null className");
        }
        this.b = str;
    }

    @Override // defpackage.aiiq
    public final void c(int i) {
        this.c = i;
        this.d = (byte) 1;
    }
}
