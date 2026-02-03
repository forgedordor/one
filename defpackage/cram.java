package defpackage;

import com.google.android.apps.messaging.shared.util.p2p.ClassificationResult;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cram extends cras {
    public int a;
    private float b;
    private String c;
    private byte d;

    @Override // defpackage.cras
    public final ClassificationResult a() {
        int i;
        String str;
        if (this.d == 1 && (i = this.a) != 0 && (str = this.c) != null) {
            return new crar(i, this.b, str);
        }
        StringBuilder sb = new StringBuilder();
        if (this.a == 0) {
            sb.append(" label");
        }
        if (this.d == 0) {
            sb.append(" score");
        }
        if (this.c == null) {
            sb.append(" intent");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    @Override // defpackage.cras
    public final void b(String str) {
        if (str == null) {
            throw new NullPointerException("Null intent");
        }
        this.c = str;
    }

    @Override // defpackage.cras
    public final void c(float f) {
        this.b = f;
        this.d = (byte) 1;
    }
}
