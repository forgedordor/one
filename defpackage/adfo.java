package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final /* synthetic */ class adfo extends fdbb implements fdat {
    public static final adfo a = new adfo();

    public adfo() {
        super(2, ellg.class, "setGooglePhotosOnboardingEvent", "setGooglePhotosOnboardingEvent(Lcom/google/common/logging/bugle/BuglePhotosOnboarding$GooglePhotosOnboardingEvent$Builder;)Lcom/google/common/logging/BugleProtos$BugleEvent$Builder;", 8);
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        ellg ellgVar = (ellg) obj;
        enda endaVar = (enda) obj2;
        ellgVar.getClass();
        endaVar.getClass();
        ellgVar.copyOnWrite();
        ellh ellhVar = (ellh) ellgVar.instance;
        endb endbVar = (endb) endaVar.build();
        ellh ellhVar2 = ellh.a;
        endbVar.getClass();
        ellhVar.bf = endbVar;
        ellhVar.f |= 256;
        return fctx.a;
    }
}
