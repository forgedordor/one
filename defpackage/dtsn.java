package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dtsn implements eora {
    @Override // defpackage.eora
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        durt.b("%s: Succeeded commitToFlagSnapshot.", "MobileDataDownloadBuilder");
    }

    @Override // defpackage.eora
    public final void hi(Throwable th) {
        durt.o("%s: Failed to commitToFlagSnapshot: %s", "MobileDataDownloadBuilder", th);
    }
}
