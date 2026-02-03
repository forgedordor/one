package defpackage;

import com.google.android.libraries.abuse.hades.moirai.download.PersephoneDownloadWorker;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dhqj extends fcyv {
    public Object a;
    public Object b;
    public Object c;
    public Object d;
    public long e;
    public boolean f;
    public boolean g;
    public /* synthetic */ Object h;
    final /* synthetic */ PersephoneDownloadWorker i;
    public int j;
    public dhqh k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dhqj(PersephoneDownloadWorker persephoneDownloadWorker, fcxy fcxyVar) {
        super(fcxyVar);
        this.i = persephoneDownloadWorker;
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) {
        this.h = obj;
        this.j |= Integer.MIN_VALUE;
        return this.i.c(this);
    }
}
