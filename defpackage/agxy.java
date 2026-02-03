package defpackage;

import com.android.vcard.VCardConfig;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class agxy {
    private final aimb a;

    public agxy(aimb aimbVar) {
        aimbVar.getClass();
        this.a = aimbVar;
    }

    public final void a(encw encwVar) {
        ailn ailnVarA = this.a.a();
        ellg ellgVar = (ellg) ellh.a.createBuilder();
        ellgVar.getClass();
        elgr.g(ellf.OPEN_PENPAL_CHAT_EVENT, ellgVar);
        ellgVar.copyOnWrite();
        ellh ellhVar = (ellh) ellgVar.instance;
        ellhVar.cm = encwVar;
        ellhVar.h |= VCardConfig.FLAG_REFRAIN_IMAGE_EXPORT;
        ailnVarA.j((ellg) elgr.a(ellgVar).toBuilder(), aioj.LOG_SPEC_OPEN_PENPAL_CHAT_EVENT);
    }
}
