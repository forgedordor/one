package defpackage;

import com.google.android.rcs.client.messaging.data.FileInformation;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class atam extends atad {
    static final ejvj a = new atal();

    @Override // defpackage.atad
    public final void c(FileInformation fileInformation, auci auciVar) {
        evvp evvpVarB = evwz.b(fileInformation.d());
        auciVar.copyOnWrite();
        aucj aucjVar = (aucj) auciVar.instance;
        aucj aucjVar2 = aucj.a;
        evvpVarB.getClass();
        aucjVar.g = evvpVarB;
        aucjVar.b |= 2;
    }

    @Override // defpackage.atad
    public final void d(aucj aucjVar, efir efirVar) {
        if (aucjVar.c.isEmpty()) {
            return;
        }
        efirVar.e(aucjVar.c);
    }

    @Override // defpackage.atad
    public final void e(aucj aucjVar, efir efirVar) {
        evvp evvpVar = aucjVar.g;
        if (evvpVar == null) {
            evvpVar = evvp.a;
        }
        efirVar.h(evwz.d(evvpVar));
    }
}
