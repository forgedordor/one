package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class byj implements bpu {
    final /* synthetic */ cby a;

    public byj(cby cbyVar) {
        this.a = cbyVar;
    }

    @Override // defpackage.bpu
    public final void a(Throwable th) {
        bbs.a("Recorder", String.format("An error occurred while attempting to release audio source: 0x%x", Integer.valueOf(this.a.hashCode())));
    }

    @Override // defpackage.bpu
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        bbs.a("Recorder", String.format("Released audio source successfully: 0x%x", Integer.valueOf(this.a.hashCode())));
    }
}
