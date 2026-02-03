package defpackage;

import android.content.res.Resources;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.api.messaging.selfidentity.SelfIdentityId;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dalo {
    public static final cqce a = cqce.g("Bugle", "MessageStatusHelper");
    public final crmx b;
    public final cssf c;
    public final cqbm d;
    public final cssx e;
    public final bvur f;
    public final fcsu g;
    public final fcsu h;
    public final awij i;
    private final bbdl j;

    public dalo(crmx crmxVar, cssf cssfVar, bbdl bbdlVar, cqbm cqbmVar, cssx cssxVar, bvur bvurVar, fcsu fcsuVar, fcsu fcsuVar2, awij awijVar) {
        this.b = crmxVar;
        this.c = cssfVar;
        this.j = bbdlVar;
        this.d = cqbmVar;
        this.e = cssxVar;
        this.f = bvurVar;
        this.g = fcsuVar;
        this.h = fcsuVar2;
        this.i = awijVar;
    }

    public static String a(baea baeaVar, Resources resources) {
        boolean zAh = baeaVar.ah();
        bdxm bdxmVar = baeaVar.b;
        return (bdxmVar == null ? !(baeaVar.a.f() == 0 && baeaVar.ah() && baeaVar.a.k()) : !(bdxmVar.f() == 0 && zAh && baeaVar.b.k())) ? resources.getString(R.string.message_status_rcs_delivery_failed_recipient_not_rcs_and_no_fallback) : resources.getString(R.string.message_status_rcs_delivery_failed_recipient_not_rcs);
    }

    public final String b(baea baeaVar, Resources resources) {
        return c(baeaVar.b(), baeaVar.p()) ? baeaVar.R() ? resources.getString(R.string.waiting_to_connect_tap_for_options) : resources.getString(R.string.message_status_waiting_for_connection) : baeaVar.Q() ? resources.getString(R.string.message_status_rcs_stuck_in_sending_hint) : resources.getString(R.string.message_status_sending);
    }

    public final boolean c(int i, SelfIdentityId selfIdentityId) {
        axcy axcyVarC;
        cqbm cqbmVar = this.d;
        return ((cqey) cqbmVar.a()).x() && (axcyVarC = this.j.c(selfIdentityId)) != null && ((cqey) cqbmVar.a()).d(i, axcyVarC.e()) == cqgk.UNAVAILABLE;
    }

    public final String d(Resources resources, baea baeaVar) {
        if (this.f.h()) {
            baeaVar.a();
        }
        return resources.getString(R.string.message_status_recipient_failed_decryption);
    }
}
