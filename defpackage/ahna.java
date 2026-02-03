package defpackage;

import android.content.Context;
import androidx.work.WorkerParameters;
import com.google.android.libraries.abuse.hades.moirai.download.PersephoneDownloadWorker;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ahna implements dhqm {
    final /* synthetic */ ahnf a;

    public ahna(ahnf ahnfVar) {
        this.a = ahnfVar;
    }

    @Override // defpackage.dhqm
    public final PersephoneDownloadWorker a(Context context, WorkerParameters workerParameters) {
        ahkn ahknVar = this.a.a;
        dhxi dhxiVarDz = ahknVar.dz();
        Optional.empty();
        ahng ahngVar = ahknVar.b;
        ahkn ahknVar2 = ahngVar.a;
        ahknVar2.dw();
        eyik eyikVar = ahngVar.dA;
        eyikVar.getClass();
        Object objB = eyikVar.b();
        objB.getClass();
        return new PersephoneDownloadWorker(context, workerParameters, dhxiVarDz, (dhqw) objB, (diep) ahknVar.l.b(), (Optional<dhoc>) Optional.of(new dhod()), (dhxa) ahknVar.kT.b(), ahknVar.dw(), new dhpo((dhro) ahknVar2.kY.b()), ahknVar.dx(), ahknVar.dy(), ahknVar.du(), (Optional<dhpi>) Optional.empty());
    }
}
