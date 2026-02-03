package defpackage;

import android.graphics.drawable.Drawable;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dyfa extends dyhj {
    public Drawable a;
    public ejwi b = ejud.a;
    private int c;
    private boolean d;
    private byte e;

    @Override // defpackage.dyhj
    public final dyhk a() {
        if (this.e == 3) {
            return new dyfb(this.a, this.c, this.d, this.b);
        }
        StringBuilder sb = new StringBuilder();
        if ((this.e & 1) == 0) {
            sb.append(" iconResId");
        }
        if ((this.e & 2) == 0) {
            sb.append(" useTint");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    @Override // defpackage.dyhj
    public final void b(int i) {
        this.c = i;
        this.e = (byte) (this.e | 1);
    }

    @Override // defpackage.dyhj
    public final void c(boolean z) {
        this.d = z;
        this.e = (byte) (this.e | 2);
    }
}
