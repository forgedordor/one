package com.google.android.libraries.communications.mobileconfiguration.sync;

import android.content.Context;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import defpackage.ceao;
import defpackage.digm;
import defpackage.ekhx;
import defpackage.ekrd;
import defpackage.etts;
import defpackage.ewzt;
import defpackage.ewzu;
import defpackage.ewzv;
import defpackage.ewzw;
import defpackage.qan;
import defpackage.qao;
import defpackage.qap;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class CleanupWorker extends Worker {
    private final digm e;

    public CleanupWorker(Context context, WorkerParameters workerParameters, digm digmVar) {
        super(context, workerParameters);
        this.e = digmVar;
    }

    @Override // androidx.work.Worker
    public final qap c() {
        digm digmVar = this.e;
        Optional optionalB = digmVar.b.b();
        if (optionalB.isEmpty()) {
            ((ekrd) ((ekrd) digm.a.i()).h("com/google/android/libraries/communications/mobileconfiguration/sync/CleanupWorkerHandler", "doWork", 31, "CleanupWorkerHandler.java")).q("Error deleting stale configs");
            ceao ceaoVar = digmVar.c;
            ewzv ewzvVar = (ewzv) ewzw.a.createBuilder();
            ewzt ewztVar = (ewzt) ewzu.a.createBuilder();
            ewztVar.copyOnWrite();
            ewzu ewzuVar = (ewzu) ewztVar.instance;
            ewzuVar.c = etts.a(3);
            ewzuVar.b |= 1;
            ewzvVar.copyOnWrite();
            ewzw ewzwVar = (ewzw) ewzvVar.instance;
            ewzu ewzuVar2 = (ewzu) ewztVar.build();
            ewzuVar2.getClass();
            ewzwVar.c = ewzuVar2;
            ewzwVar.b = 4;
            ceaoVar.a((ewzw) ewzvVar.build());
            return new qan();
        }
        int size = ((ekhx) optionalB.get()).size();
        ((ekrd) ((ekrd) digm.a.h()).h("com/google/android/libraries/communications/mobileconfiguration/sync/CleanupWorkerHandler", "doWork", 36, "CleanupWorkerHandler.java")).r("Successfully deleted %d configs", size);
        ceao ceaoVar2 = digmVar.c;
        ewzv ewzvVar2 = (ewzv) ewzw.a.createBuilder();
        ewzt ewztVar2 = (ewzt) ewzu.a.createBuilder();
        ewztVar2.copyOnWrite();
        ewzu ewzuVar3 = (ewzu) ewztVar2.instance;
        ewzuVar3.c = etts.a(4);
        ewzuVar3.b |= 1;
        ewztVar2.copyOnWrite();
        ewzu ewzuVar4 = (ewzu) ewztVar2.instance;
        ewzuVar4.b |= 2;
        ewzuVar4.d = size;
        ewzvVar2.copyOnWrite();
        ewzw ewzwVar2 = (ewzw) ewzvVar2.instance;
        ewzu ewzuVar5 = (ewzu) ewztVar2.build();
        ewzuVar5.getClass();
        ewzwVar2.c = ewzuVar5;
        ewzwVar2.b = 4;
        ceaoVar2.a((ewzw) ewzvVar2.build());
        return new qao();
    }
}
