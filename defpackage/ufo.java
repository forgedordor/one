package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final /* synthetic */ class ufo extends fdbb implements fdat {
    public static final ufo a = new ufo();

    public ufo() {
        super(2, ellg.class, "setBugleContactPicker", "setBugleContactPicker(Lcom/google/common/logging/bugle/BugleContactPicker$ContactPickerEvent$Builder;)Lcom/google/common/logging/BugleProtos$BugleEvent$Builder;", 8);
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        ellg ellgVar = (ellg) obj;
        emsz emszVar = (emsz) obj2;
        ellgVar.getClass();
        emszVar.getClass();
        ellgVar.copyOnWrite();
        ellh ellhVar = (ellh) ellgVar.instance;
        emta emtaVar = (emta) emszVar.build();
        ellh ellhVar2 = ellh.a;
        emtaVar.getClass();
        ellhVar.V = emtaVar;
        ellhVar.c |= 4194304;
        return fctx.a;
    }
}
