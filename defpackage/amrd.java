package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class amrd extends fcyz implements fdat {
    final /* synthetic */ amri a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public amrd(amri amriVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.a = amriVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((amrd) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        amri amriVar = this.a;
        if (((Boolean) amriVar.d.b()).booleanValue()) {
            return true;
        }
        Boolean bool = (Boolean) ((cpfu) amriVar.c.b()).c.c();
        boolean zBooleanValue = bool.booleanValue();
        ((ekrd) amri.a.g().h("com/google/android/apps/messaging/shared/api/messaging/message/compose/emergency/voiceaccess/EmergencyVoiceAccessConstraintSupplier$getAsync$1", "invokeSuspend", 46, "EmergencyVoiceAccessConstraintSupplier.kt")).t("Voice access enabled: %s", bool);
        return Boolean.valueOf(!zBooleanValue);
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new amrd(this.a, fcxyVar);
    }
}
