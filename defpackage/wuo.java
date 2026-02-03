package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class wuo extends fcyz implements fdau {
    int a;
    /* synthetic */ Object b;
    final /* synthetic */ wuy c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wuo(fcxy fcxyVar, wuy wuyVar) {
        super(3, fcxyVar);
        this.c = wuyVar;
    }

    @Override // defpackage.fdau
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        wuo wuoVar = new wuo((fcxy) obj3, this.c);
        wuoVar.d = (fdpm) obj;
        wuoVar.b = obj2;
        return wuoVar.b(fctx.a);
    }

    /* JADX WARN: Type inference failed for: r9v2, types: [fdpm, java.lang.Object] */
    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fdpl wuxVar;
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            ?? r9 = this.d;
            wun wunVar = (wun) this.b;
            if (wunVar == null) {
                wuxVar = new fdpu(null);
            } else {
                ekrw ekrwVarE = wuy.a.e();
                ekrwVarE.X(eksq.a, "BugleComposeRow2");
                ekrd ekrdVar = (ekrd) ekrwVarE.h("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/draft/info/DraftInfoUiAdapterImpl$createUiData$$inlined$flatMapLatest$1", "invokeSuspend", 70, "DraftInfoUiAdapterImpl.kt");
                boolean z = wunVar.a;
                ekrdVar.F("DraftInfoUiAdapterImpl useInfoTooltip: %b, maxMessageSizeBytes: %d", z, wunVar.b);
                if (z) {
                    wuy wuyVar = this.c;
                    wuxVar = new wux(wuyVar.e.f, wuyVar, wunVar);
                } else {
                    wuxVar = new fdpu(null);
                }
            }
            this.a = 1;
            if (fdpy.c(r9, wuxVar, this) == fcylVar) {
                return fcylVar;
            }
        }
        return fctx.a;
    }
}
