package defpackage;

import com.android.vcard.VCardConfig;

/* compiled from: PG */
/* loaded from: classes2.dex */
final /* synthetic */ class afxq extends fdbb implements fdat {
    public static final afxq a = new afxq();

    public afxq() {
        super(2, ellg.class, "setMultiShareEvent", "setMultiShareEvent(Lcom/google/common/logging/bugle/MultiShare$MultiShareEvent$Builder;)Lcom/google/common/logging/BugleProtos$BugleEvent$Builder;", 8);
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        ellg ellgVar = (ellg) obj;
        enuw enuwVar = (enuw) obj2;
        ellgVar.getClass();
        enuwVar.getClass();
        ellgVar.copyOnWrite();
        ellh ellhVar = (ellh) ellgVar.instance;
        envf envfVar = (envf) enuwVar.build();
        ellh ellhVar2 = ellh.a;
        envfVar.getClass();
        ellhVar.bM = envfVar;
        ellhVar.g |= VCardConfig.FLAG_APPEND_TYPE_PARAM;
        return fctx.a;
    }
}
