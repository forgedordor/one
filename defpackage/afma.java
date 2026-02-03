package defpackage;

import android.app.Activity;
import android.content.Intent;
import com.android.vcard.VCardConfig;
import com.google.android.apps.messaging.multishare.MultiShareActivity;
import com.google.android.apps.messaging.shared.conversation.draft.ComposeRowState;
import com.google.android.apps.messaging.shared.conversation.draft.IncomingDraft;
import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class afma implements aflz {
    private static final ekrg a = ekrg.c("com/google/android/apps/messaging/multishare/MultiShareEntryPointImpl");
    private final fcsu b;
    private final aqha c;

    public afma(fcsu fcsuVar, aqha aqhaVar) {
        aqhaVar.getClass();
        this.b = fcsuVar;
        this.c = aqhaVar;
    }

    @Override // defpackage.aflz
    public final void a(Activity activity, efwo efwoVar, IncomingDraft incomingDraft, envd envdVar) throws IOException {
        envdVar.getClass();
        ((dzuc) this.b.b()).e(afxy.b);
        if (this.c.a()) {
            ekrw ekrwVarH = a.h();
            ekrwVarH.X(eksq.a, "BugleMultiShare");
            ((ekrd) ekrwVarH.h("com/google/android/apps/messaging/multishare/MultiShareEntryPointImpl", "launchMultiShare", 42, "MultiShareEntryPointImpl.kt")).I("Launching MultiShare with accountId %s, draft %s, intentSource, %s", efwoVar, incomingDraft, envdVar);
        }
        Intent intent = new Intent(activity, (Class<?>) MultiShareActivity.class);
        intent.putExtra("intent_source", envdVar.e);
        intent.addFlags(VCardConfig.FLAG_APPEND_TYPE_PARAM);
        ComposeRowState composeRowStateA = avnr.a(incomingDraft, null);
        if (composeRowStateA != null) {
            avnt.d(intent, composeRowStateA);
        }
        intent.setClipData(avnz.b(incomingDraft));
        intent.addFlags(1);
        if (abxb.a() && efwoVar != null) {
            efyp.c(intent, efwoVar);
        }
        eiid.o(activity, intent);
    }
}
