package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fgby extends fggd {
    public fgby(String str, int i, int i2) {
        super(str, i, i2);
    }

    @Override // defpackage.fggd, org.chromium.net.NetworkException
    public final boolean immediatelyRetryable() {
        int i = this.b;
        if (i == -358 || i == -352) {
            return true;
        }
        return super.immediatelyRetryable();
    }
}
