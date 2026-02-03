package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class awmf extends fcyz implements fdat {
    final /* synthetic */ awpx a;
    final /* synthetic */ awmk b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public awmf(fcxy fcxyVar, awpx awpxVar, awmk awmkVar) {
        super(2, fcxyVar);
        this.a = awpxVar;
        this.b = awmkVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((awmf) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        ekrw ekrwVarH = awmk.a.h();
        ekrwVarH.X(eksq.a, "BugleCME");
        ekrd ekrdVar = (ekrd) ekrwVarH;
        ekrz ekrzVar = cqnc.ah;
        awpx awpxVar = this.a;
        ekrdVar.X(ekrzVar, awpxVar);
        ((ekrd) ekrdVar.h("com/google/android/apps/messaging/shared/core/group/CachingGroupManager$subscribeConversationToParticipantsChange$2$preChangeInTransaction$$inlined$sequenceAsyncPropagatingLegacy$1", "invokeSuspend", 489, "CachingGroupManager.kt")).q("Participants changed. Removing from cache");
        return this.b.d.e(awpxVar);
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        awmf awmfVar = new awmf(fcxyVar, this.a, this.b);
        awmfVar.c = obj;
        return awmfVar;
    }
}
