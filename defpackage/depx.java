package defpackage;

import com.google.android.gms.wearable.Channel;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class depx implements denh {
    private final deni a;

    public depx(deni deniVar) {
        this.a = deniVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.a.equals(((depx) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.denh
    public final void m(Channel channel) {
        depy.b(channel);
        ((deor) this.a).a.i(channel);
    }

    @Override // defpackage.denh
    public final void n(Channel channel) {
        depy.b(channel);
    }

    @Override // defpackage.denh
    public final void o(Channel channel) {
        depy.b(channel);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.denh
    public final void p(Channel channel) {
        depy.b(channel);
        ((deor) this.a).a.l(channel);
    }
}
