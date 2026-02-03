package defpackage;

import android.content.Context;
import com.google.android.libraries.mdi.download.workmanager.workers.PeriodicWorker;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ahov implements eyik {
    private final ahkn a;
    private final ahow b;

    public ahov(ahkn ahknVar, ahow ahowVar) {
        this.a = ahknVar;
        this.b = ahowVar;
    }

    @Override // defpackage.fcsu
    public final Object b() {
        ahkn ahknVar = this.a;
        return new PeriodicWorker((Context) ahknVar.t.b(), this.b.a, (dtsl) ahknVar.a.Br.b(), (eosc) ahknVar.aJ.b());
    }
}
