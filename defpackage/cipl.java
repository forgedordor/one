package defpackage;

import com.android.vcard.VCardConfig;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cipl {
    private final aimb a;

    public cipl(aimb aimbVar) {
        aimbVar.getClass();
        this.a = aimbVar;
    }

    public final void a(encs encsVar) {
        ailn ailnVarA = this.a.a();
        ellg ellgVar = (ellg) ellh.a.createBuilder();
        ellgVar.getClass();
        elgr.g(ellf.MMS_MERGING_EVENT, ellgVar);
        ellgVar.copyOnWrite();
        ellh ellhVar = (ellh) ellgVar.instance;
        ellhVar.cp = encsVar;
        ellhVar.h |= VCardConfig.FLAG_APPEND_TYPE_PARAM;
        ailnVarA.j((ellg) elgr.a(ellgVar).toBuilder(), aioj.LOG_SPEC_MMS_MERGING_EVENT);
    }

    public final void b() {
        enco encoVar = (enco) encs.a.createBuilder();
        encoVar.getClass();
        enuv.b(2, encoVar);
        a(enuv.a(encoVar));
    }
}
