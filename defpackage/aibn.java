package defpackage;

import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes2.dex */
final /* synthetic */ class aibn extends fdbo implements fdap {
    public aibn(Object obj) {
        super(1, obj, aice.class, "detectorLoop", "detectorLoop(Ljava/util/UUID;)Lkotlinx/coroutines/Job;", 0);
    }

    @Override // defpackage.fdap
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        UUID uuid = (UUID) obj;
        uuid.getClass();
        aice aiceVar = (aice) this.g;
        return auvw.k(aiceVar.i, null, null, new aibo(aiceVar, uuid, null), 3);
    }
}
