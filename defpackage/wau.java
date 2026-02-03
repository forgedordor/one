package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class wau {
    public final yby a;
    public final dpdy b;

    public wau(yby ybyVar, dpdy dpdyVar) {
        this.a = ybyVar;
        this.b = dpdyVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wau)) {
            return false;
        }
        wau wauVar = (wau) obj;
        return fdbq.f(this.a, wauVar.a) && fdbq.f(this.b, wauVar.b);
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "DirectSendComposeRowHolderUiData(fullScreenComposeRowUiData=" + this.a + ", hugoUiData=" + this.b + ")";
    }
}
