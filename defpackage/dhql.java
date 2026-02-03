package defpackage;

import com.google.android.libraries.abuse.hades.moirai.download.PersephoneDownloadWorker;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dhql extends fcyv {
    public /* synthetic */ Object a;
    final /* synthetic */ PersephoneDownloadWorker b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dhql(PersephoneDownloadWorker persephoneDownloadWorker, fcxy fcxyVar) {
        super(fcxyVar);
        this.b = persephoneDownloadWorker;
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.l(null, null, this);
    }
}
