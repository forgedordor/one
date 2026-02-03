package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class awmd extends fcyz implements fdat {
    final /* synthetic */ awpx a;
    final /* synthetic */ awmk b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public awmd(fcxy fcxyVar, awpx awpxVar, awmk awmkVar) {
        super(2, fcxyVar);
        this.a = awpxVar;
        this.b = awmkVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((awmd) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
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
        ((ekrd) ekrdVar.h("com/google/android/apps/messaging/shared/core/group/CachingGroupManager$subscribeConversationChange$3$preChangeInTransaction$$inlined$sequenceAsyncPropagatingLegacy$1", "invokeSuspend", 529, "CachingGroupManager.kt")).q("Conversation changed. Removing from cache");
        return this.b.d.e(awpxVar);
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        awmd awmdVar = new awmd(fcxyVar, this.a, this.b);
        awmdVar.c = obj;
        return awmdVar;
    }
}
