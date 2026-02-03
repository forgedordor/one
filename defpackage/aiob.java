package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class aiob extends aiod {
    final /* synthetic */ aioe a;
    private final elgm d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aiob(aioe aioeVar, String str, elgm elgmVar, String str2, long j) {
        super(aioeVar, str, str2, j);
        this.a = aioeVar;
        this.d = elgmVar;
    }

    @Override // defpackage.aiod
    protected final void e(long j) {
        ((ains) this.a.d.b()).b(this.b, this.d, j);
    }
}
