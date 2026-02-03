package defpackage;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import androidx.core.content.FileProvider;
import com.google.android.apps.messaging.shared.conversation.draft.IncomingDraft;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class agcx implements afyw {
    private final Context a;
    private final efwo b;
    private final aflz c;
    private final bxle d;

    public agcx(Context context, efwo efwoVar, aflz aflzVar, bxle bxleVar) {
        efwoVar.getClass();
        bxleVar.getClass();
        this.a = context;
        this.b = efwoVar;
        this.c = aflzVar;
        this.d = bxleVar;
    }

    private final Uri b(Uri uri) throws IOException {
        if (!fdbq.f(uri.getScheme(), "file")) {
            ((ekrd) agcy.a.e().h("com/google/android/apps/messaging/navigation/targets/ForwardMessage$ForwardMessageNavigationHandler", "convertFileToContentUri", 165, "ForwardMessage.kt")).t("original forward URI: %s", cqcy.d(uri));
            return uri;
        }
        ekrg ekrgVar = agcy.a;
        ((ekrd) ekrgVar.h().h("com/google/android/apps/messaging/navigation/targets/ForwardMessage$ForwardMessageNavigationHandler", "convertFileToContentUri", 146, "ForwardMessage.kt")).t("Converting forwarding file URI to a content URI: %s", cqcy.d(uri));
        String path = uri.getPath();
        if (path == null) {
            ((ekrd) ekrgVar.i().h("com/google/android/apps/messaging/navigation/targets/ForwardMessage$ForwardMessageNavigationHandler", "convertFileToContentUri", 150, "ForwardMessage.kt")).q("Forwarded URI has no path, aborting content URI conversion");
            return uri;
        }
        final File file = new File(path);
        try {
            Uri uriA = FileProvider.a(this.a, this.d.a, file);
            ekrd ekrdVar = (ekrd) agcy.a.e().h("com/google/android/apps/messaging/navigation/targets/ForwardMessage$ForwardMessageNavigationHandler", "convertFileToContentUri", 162, "ForwardMessage.kt");
            uriA.getClass();
            ekrdVar.t("Forwarding file content URI: %s", cqcy.d(uriA));
            return uriA;
        } catch (IllegalArgumentException e) {
            ((ekrd) agcy.a.e().h("com/google/android/apps/messaging/navigation/targets/ForwardMessage$ForwardMessageNavigationHandler", "convertFileToContentUri", 158, "ForwardMessage.kt")).t("Forwarding file exists: %b", fctd.a(new fdae() { // from class: agcw
                @Override // defpackage.fdae
                public final Object invoke() {
                    return Boolean.valueOf(file.exists());
                }
            }));
            throw e;
        }
    }

    @Override // defpackage.afyw
    public final /* synthetic */ Object a(afzv afzvVar, fcxy fcxyVar) {
        IncomingDraft incomingDraft;
        IncomingDraft incomingDraft2;
        String strC;
        agcy agcyVar = (agcy) afzvVar;
        Activity activityA = daiy.a(this.a);
        if (activityA == null) {
            throw new IllegalArgumentException("multi-share must be created with an activity context.");
        }
        aflz aflzVar = this.c;
        efwo efwoVar = this.b;
        amvr amvrVar = agcyVar.b;
        Object obj = null;
        if (amvrVar instanceof amvw) {
            amvw amvwVar = (amvw) amvrVar;
            String strC2 = amvwVar.c();
            String str = (strC2 == null || strC2.length() == 0) ? null : strC2;
            ekgb ekgbVarA = amvwVar.a();
            ArrayList arrayList = new ArrayList(fcva.p(ekgbVarA, 10));
            ekqh it = ekgbVarA.iterator();
            while (it.hasNext()) {
                amsv amsvVar = (amsv) it.next();
                String strB = amsvVar.b();
                strB.getClass();
                Uri uriE = amsvVar.e();
                uriE.getClass();
                arrayList.add(new IncomingDraft.Attachment(strB, uriE, null));
            }
            incomingDraft = new IncomingDraft(str, arrayList, null, false, null, null, true, 60, null);
        } else if (amvrVar instanceof amwi) {
            amwi amwiVar = (amwi) amvrVar;
            String strC3 = amwiVar.c();
            incomingDraft = new IncomingDraft((strC3 == null || strC3.length() == 0) ? null : strC3, null, amwiVar.d(), amwiVar.e(), null, null, false, 114, null);
        } else if (!(amvrVar instanceof amwf)) {
            if (amvrVar instanceof amwa) {
                incomingDraft2 = new IncomingDraft(((amwa) amvrVar).m(), null, null, false, null, null, false, 126, null);
            } else if (amvrVar instanceof amwm) {
                amwm amwmVar = (amwm) amvrVar;
                String strL = amwmVar.l();
                String strB2 = amvrVar.b();
                strB2.getClass();
                incomingDraft2 = new IncomingDraft(strL, fcva.b(new IncomingDraft.Attachment(strB2, b(amwmVar.e()), null)), null, false, null, null, true, 60, null);
            } else if (amvrVar instanceof amsv) {
                String strB3 = amvrVar.b();
                strB3.getClass();
                Uri uriE2 = ((amsv) amvrVar).e();
                uriE2.getClass();
                incomingDraft2 = new IncomingDraft(null, fcva.b(new IncomingDraft.Attachment(strB3, b(uriE2), null)), null, false, null, null, true, 61, null);
            } else {
                incomingDraft = new IncomingDraft(null, null, null, false, null, null, true, 63, null);
            }
            incomingDraft = incomingDraft2;
        } else if (((Boolean) ((cczi) crbf.aB.get()).e()).booleanValue()) {
            amwf amwfVar = (amwf) amvrVar;
            ekgb ekgbVarA2 = amwfVar.a();
            ekgbVarA2.getClass();
            Iterator<E> it2 = ekgbVarA2.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Object next = it2.next();
                if (((amwe) next).c() == amwd.ORIGINAL_TEXT) {
                    obj = next;
                    break;
                }
            }
            amwe amweVar = (amwe) obj;
            if (amweVar == null || (strC = amweVar.e()) == null) {
                strC = amwfVar.c();
            }
            incomingDraft = new IncomingDraft(strC, null, null, false, null, null, false, 126, null);
        } else {
            incomingDraft2 = new IncomingDraft(((amwf) amvrVar).c(), null, null, false, null, null, false, 126, null);
            incomingDraft = incomingDraft2;
        }
        aflzVar.a(activityA, efwoVar, incomingDraft, envd.FORWARD);
        return fctx.a;
    }
}
