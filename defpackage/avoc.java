package defpackage;

import android.net.Uri;
import com.google.android.apps.messaging.shared.conversation.draft.IncomingDraft;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class avoc {
    public static final IncomingDraft a(ajlt ajltVar) {
        ajltVar.getClass();
        return ajltVar instanceof ajmy ? IncomingDraft.a(b(ajltVar.g()), null, ((ajmy) ajltVar).E(), null, 111) : b(ajltVar.g());
    }

    private static final IncomingDraft b(amvr amvrVar) {
        if (amvrVar instanceof amvw) {
            amvw amvwVar = (amvw) amvrVar;
            String strC = amvwVar.c();
            ekgb ekgbVarA = amvwVar.a();
            ArrayList arrayList = new ArrayList(fcva.p(ekgbVarA, 10));
            ekqh it = ekgbVarA.iterator();
            while (it.hasNext()) {
                amsv amsvVar = (amsv) it.next();
                String strB = amsvVar.b();
                strB.getClass();
                Uri uriC = amsvVar.c();
                if (uriC == null) {
                    uriC = amsvVar.e();
                }
                uriC.getClass();
                arrayList.add(new IncomingDraft.Attachment(strB, uriC, null));
            }
            return new IncomingDraft(strC, arrayList, null, false, null, null, false, 124, null);
        }
        if (amvrVar instanceof amwi) {
            amwi amwiVar = (amwi) amvrVar;
            return new IncomingDraft(amwiVar.c(), null, amwiVar.d(), amwiVar.e(), null, null, false, 114, null);
        }
        if (amvrVar instanceof amwf) {
            return new IncomingDraft(((amwf) amvrVar).c(), null, null, false, null, null, false, 126, null);
        }
        if (amvrVar instanceof amwm) {
            amwm amwmVar = (amwm) amvrVar;
            String strL = amwmVar.l();
            String strB2 = amvrVar.b();
            strB2.getClass();
            Uri uriC2 = amwmVar.c();
            if (uriC2 == null) {
                uriC2 = amwmVar.e();
            }
            return new IncomingDraft(strL, fcva.b(new IncomingDraft.Attachment(strB2, uriC2, null)), null, false, null, null, false, 124, null);
        }
        if (!(amvrVar instanceof amsv)) {
            return new IncomingDraft(null, null, null, false, null, null, false, 127, null);
        }
        String strB3 = amvrVar.b();
        strB3.getClass();
        amsv amsvVar2 = (amsv) amvrVar;
        Uri uriC3 = amsvVar2.c();
        if (uriC3 == null) {
            uriC3 = amsvVar2.e();
        }
        uriC3.getClass();
        return new IncomingDraft(null, fcva.b(new IncomingDraft.Attachment(strB3, uriC3, null)), null, false, null, null, false, 125, null);
    }
}
