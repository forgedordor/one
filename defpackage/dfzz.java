package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dfzz implements fcsu<dfzy> {
    public dfzy a;

    @Override // defpackage.fcsu
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final dfzy b() {
        dfzy dfzyVar = this.a;
        if (dfzyVar != null) {
            return dfzyVar;
        }
        throw new IllegalStateException("Registration context not initialized!");
    }

    public final void c() {
        this.a = null;
    }
}
