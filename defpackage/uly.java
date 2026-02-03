package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final /* synthetic */ class uly extends fdbb implements fdat {
    public static final uly a = new uly();

    public uly() {
        super(2, ellg.class, "setBugleSelectedMessagesEvent", "setBugleSelectedMessagesEvent(Lcom/google/common/logging/BugleProtos$SelectedMessagesEvent$Builder;)Lcom/google/common/logging/BugleProtos$BugleEvent$Builder;", 8);
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        ellg ellgVar = (ellg) obj;
        emhm emhmVar = (emhm) obj2;
        ellgVar.getClass();
        emhmVar.getClass();
        ellgVar.copyOnWrite();
        ellh ellhVar = (ellh) ellgVar.instance;
        emhn emhnVar = (emhn) emhmVar.build();
        ellh ellhVar2 = ellh.a;
        emhnVar.getClass();
        ellhVar.P = emhnVar;
        ellhVar.c |= 16384;
        return fctx.a;
    }
}
