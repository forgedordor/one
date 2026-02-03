package defpackage;

import com.google.android.gms.phenotype.internal.IFlagUpdateListener;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class ddzl extends IFlagUpdateListener.Stub {
    final /* synthetic */ dcib a;

    public ddzl(dcib dcibVar) {
        this.a = dcibVar;
    }

    @Override // com.google.android.gms.phenotype.internal.IFlagUpdateListener
    public final void onFlagUpdate(byte[] bArr) {
        this.a.b(new ddzk(bArr));
    }
}
