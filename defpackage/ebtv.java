package defpackage;

import java.util.Set;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class ebtv implements Runnable {
    final /* synthetic */ ebtu a;

    public ebtv(ebtu ebtuVar) {
        this.a = ebtuVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Set set = ebtw.a;
        ebtu ebtuVar = this.a;
        set.add(ebtuVar);
        int i = ebtw.b;
        if (i != -1) {
            ebtuVar.b(i);
        }
    }
}
