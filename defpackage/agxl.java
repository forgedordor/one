package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final /* synthetic */ class agxl extends fdbb implements fdat {
    public static final agxl a = new agxl();

    public agxl() {
        super(2, ellg.class, "setBardEvent", "setBardEvent(Lcom/google/common/logging/bugle/Bard$BardEvent$Builder;)Lcom/google/common/logging/BugleProtos$BugleEvent$Builder;", 8);
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        ellg ellgVar = (ellg) obj;
        emnv emnvVar = (emnv) obj2;
        ellgVar.getClass();
        emnvVar.getClass();
        ellgVar.copyOnWrite();
        ellh ellhVar = (ellh) ellgVar.instance;
        emnw emnwVar = (emnw) emnvVar.build();
        ellh ellhVar2 = ellh.a;
        emnwVar.getClass();
        ellhVar.bX = emnwVar;
        ellhVar.h |= 64;
        return fctx.a;
    }
}
