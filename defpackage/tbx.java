package defpackage;

import android.content.Context;
import android.content.res.Resources;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class tbx implements crra {
    private final Context a;
    private final crqv b;
    private final tbz c;

    public tbx(Context context, crqv crqvVar, tbz tbzVar) {
        this.a = context;
        this.b = crqvVar;
        this.c = tbzVar;
    }

    @Override // defpackage.crra
    public final boolean a(String str) {
        Context context = this.a;
        return str.equals(context.getString(R.string.rcs_tos_state_key)) || str.equals(context.getString(R.string.should_show_google_tos_prompt_key));
    }

    @Override // defpackage.dids
    public final boolean b(String str) throws Resources.NotFoundException {
        Context context = this.a;
        String string = context.getString(R.string.enable_rcs_pref_key);
        boolean z = context.getResources().getBoolean(R.bool.enable_rcs_pref_default);
        crqv crqvVar = this.b;
        boolean zQ = crqvVar.q(string, z);
        int iD = crqvVar.d(context.getString(R.string.rcs_tos_state_key), 0);
        if (!zQ || iD != 2) {
            return false;
        }
        tbz tbzVar = this.c;
        enjq enjqVar = (enjq) enjr.a.createBuilder();
        enjqVar.copyOnWrite();
        enjr enjrVar = (enjr) enjqVar.instance;
        enjrVar.d = 1;
        enjrVar.b = 2 | enjrVar.b;
        enjr enjrVar2 = (enjr) enjqVar.build();
        aill aillVar = (aill) tbzVar.a.b();
        ellg ellgVar = (ellg) ellh.a.createBuilder();
        ellf ellfVar = ellf.BUGLE_SYSTEM_BACKUP_EVENT;
        ellgVar.copyOnWrite();
        ellh ellhVar = (ellh) ellgVar.instance;
        ellhVar.j = ellfVar.f11do;
        ellhVar.b |= 1;
        ellgVar.copyOnWrite();
        ellh ellhVar2 = (ellh) ellgVar.instance;
        enjrVar2.getClass();
        ellhVar2.bC = enjrVar2;
        ellhVar2.g |= 32768;
        aillVar.k(ellgVar, emxt.BUGLE_SYSTEM_BACKUP_EVENT);
        return true;
    }
}
