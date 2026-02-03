package defpackage;

import java.io.File;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class ecmz implements eora {
    final /* synthetic */ ecng a;

    public ecmz(ecng ecngVar) {
        this.a = ecngVar;
    }

    @Override // defpackage.eora
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        new File(this.a.b.getDatabasePath((String) obj).getPath().concat(".bak")).delete();
    }

    @Override // defpackage.eora
    public final void hi(Throwable th) {
    }
}
