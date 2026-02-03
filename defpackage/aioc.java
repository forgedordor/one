package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class aioc extends aiod {
    final /* synthetic */ aioe a;
    private final int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aioc(aioe aioeVar, int i, String str, long j) {
        super(aioeVar, "Bugle.DataModel.Action.UpdateConversationEncryptionStatusAction.ExecuteAction.DownloadAndProcessRemoteInstanceData.Latency", str, j);
        this.a = aioeVar;
        this.d = i;
    }

    @Override // defpackage.aiod
    protected final void e(long j) {
        ((ains) this.a.d.b()).f(this.b, this.d, j);
    }
}
