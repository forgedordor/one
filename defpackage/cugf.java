package defpackage;

import android.app.ActivityOptions;
import android.app.PendingIntent;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.Spannable;
import android.view.View;
import android.widget.TextView;
import androidx.core.app.RemoteActionCompat;
import com.android.vcard.VCardConfig;
import com.google.android.ims.rcsservice.chatsession.message.ConversationSuggestion;
import j$.util.Collection;
import j$.util.Optional;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cugf extends euln {
    private static final eksp b = eksp.c("BugleLinkify");
    private final Spannable c;
    private final Context d;
    private final cmwe e;
    private final cden f;
    private final Optional g;
    private final fcsu h;

    public cugf(Spannable spannable, euls eulsVar, Context context, cmwe cmweVar, cden cdenVar, fcsu fcsuVar) {
        super(eulsVar);
        this.c = spannable;
        this.d = context;
        this.e = cmweVar;
        this.f = cdenVar;
        this.g = Optional.ofNullable(null);
        this.h = fcsuVar;
    }

    private static ActivityOptions d() {
        return ActivityOptions.makeBasic().setPendingIntentBackgroundActivityStartMode(4);
    }

    private final String e(Spannable spannable) {
        eulq eulqVar = this.a.a;
        return spannable.subSequence(eulqVar.b, eulqVar.c).toString();
    }

    private final void f(TextView textView, eukb eukbVar) throws PendingIntent.CanceledException, IOException {
        if (!((Boolean) ((cczi) cmwe.a.get()).e()).booleanValue()) {
            List list = eukbVar.b;
            if (!list.isEmpty()) {
                try {
                    ((eksl) ((eksl) b.h()).h("com/google/android/apps/messaging/textclassifier/TCLibLinkifyTextSpan", "handleUrlClassification", 138, "TCLibLinkifyTextSpan.java")).q("TCLib: perform first action to open URL in default app.");
                    if (((arhn) this.h.b()).a() && craf.h) {
                        ((RemoteActionCompat) list.get(0)).d.send(d().toBundle());
                        return;
                    } else {
                        ((RemoteActionCompat) list.get(0)).d.send();
                        return;
                    }
                } catch (PendingIntent.CanceledException unused) {
                    ((eksl) ((eksl) b.h()).h("com/google/android/apps/messaging/textclassifier/TCLibLinkifyTextSpan", "handleUrlClassification", 146, "TCLibLinkifyTextSpan.java")).q("Failed to start the PendingIntent in onTextClassificationResult");
                }
            }
        } else if (c(textView.getContext(), eukbVar)) {
            return;
        }
        Intent intent = new Intent("android.intent.action.VIEW", a(this.c));
        if (this.e.a()) {
            intent.addFlags(268439552);
        }
        try {
            ((eksl) ((eksl) b.h()).h("com/google/android/apps/messaging/textclassifier/TCLibLinkifyTextSpan", "handleUrlClassification", 159, "TCLibLinkifyTextSpan.java")).t("TCLiB: No actions found, opening activity intent: %s", intent);
            eiid.o(textView.getContext(), intent);
        } catch (ActivityNotFoundException e) {
            ((eksl) ((eksl) ((eksl) b.i()).g(e)).h("com/google/android/apps/messaging/textclassifier/TCLibLinkifyTextSpan", "handleUrlClassification", (char) 163, "TCLibLinkifyTextSpan.java")).q("TCLib: Unable to open linkified text, activity not found.");
            h(textView, eukbVar);
        }
    }

    private final void g(TextView textView, eukb eukbVar) throws PendingIntent.CanceledException, IOException {
        if (eukbVar.a() <= 0 || !"url".equals(eukbVar.c())) {
            h(textView, eukbVar);
            return;
        }
        if (!((Boolean) ((cczi) cmwe.a.get()).e()).booleanValue()) {
            List list = eukbVar.b;
            if (!list.isEmpty()) {
                ((eksl) ((eksl) b.h()).h("com/google/android/apps/messaging/textclassifier/TCLibLinkifyTextSpan", "onTextClassificationResultLegacy", 187, "TCLibLinkifyTextSpan.java")).q("TCLib: legacy, perform first action to open URL in default app.");
                try {
                    if (((arhn) this.h.b()).a() && craf.h) {
                        ((RemoteActionCompat) list.get(0)).d.send(d().toBundle());
                        return;
                    } else {
                        ((RemoteActionCompat) list.get(0)).d.send();
                        return;
                    }
                } catch (PendingIntent.CanceledException unused) {
                    ((eksl) ((eksl) b.h()).h("com/google/android/apps/messaging/textclassifier/TCLibLinkifyTextSpan", "onTextClassificationResultLegacy", 197, "TCLibLinkifyTextSpan.java")).q("Failed to start the PendingIntent in onTextClassificationResult");
                }
            }
        } else if (c(textView.getContext(), eukbVar)) {
            return;
        }
        Intent intent = new Intent("android.intent.action.VIEW", a(this.c));
        if (this.e.a()) {
            intent.addFlags(268439552);
        }
        try {
            ((eksl) ((eksl) b.h()).h("com/google/android/apps/messaging/textclassifier/TCLibLinkifyTextSpan", "onTextClassificationResultLegacy", 210, "TCLibLinkifyTextSpan.java")).t("TCLiB: No actions found, opening activity intent: %s", intent);
            eiid.o(textView.getContext(), intent);
        } catch (ActivityNotFoundException e) {
            ((eksl) ((eksl) ((eksl) b.i()).g(e)).h("com/google/android/apps/messaging/textclassifier/TCLibLinkifyTextSpan", "onTextClassificationResultLegacy", (char) 214, "TCLibLinkifyTextSpan.java")).q("TCLib: Unable to open linkified text, activity not found.");
            h(textView, eukbVar);
        }
    }

    private final void h(TextView textView, eukb eukbVar) {
        try {
            ((eksl) ((eksl) b.h()).h("com/google/android/apps/messaging/textclassifier/TCLibLinkifyTextSpan", "tryShowBasicActionsToolbar", 263, "TCLibLinkifyTextSpan.java")).q("TCLiB: Opening basic actions toolbar");
            super.b(textView, eukbVar);
        } catch (Exception e) {
            ((eksl) ((eksl) ((eksl) b.i()).g(e)).h("com/google/android/apps/messaging/textclassifier/TCLibLinkifyTextSpan", "tryShowBasicActionsToolbar", (char) 266, "TCLibLinkifyTextSpan.java")).q("TCLib: Failed to show the basic actions toolbar");
            this.f.b(e);
        }
    }

    public final Uri a(Spannable spannable) {
        boolean z;
        String strE = e(spannable);
        String[] strArr = cdsc.a;
        int i = 0;
        while (true) {
            if (i >= 3) {
                z = false;
                break;
            }
            String str = strArr[i];
            if (strE.regionMatches(true, 0, str, 0, str.length())) {
                z = true;
                if (!strE.regionMatches(false, 0, str, 0, str.length())) {
                    strE = String.valueOf(str).concat(String.valueOf(strE.substring(str.length())));
                }
            } else {
                i++;
            }
        }
        if (!z) {
            strE = String.valueOf(strArr[0]).concat(String.valueOf(strE));
        }
        return Uri.parse(strE);
    }

    @Override // defpackage.euln
    public final void b(TextView textView, eukb eukbVar) throws PendingIntent.CanceledException, IOException {
        Context context = this.d;
        if (cpga.g(context) && c(textView.getContext(), eukbVar)) {
            return;
        }
        if (!((Boolean) ((cczi) affw.a.get()).e()).booleanValue()) {
            g(textView, eukbVar);
            return;
        }
        if (eukbVar.a() <= 0) {
            h(textView, eukbVar);
            return;
        }
        if (eukbVar.c().equals("url")) {
            f(textView, eukbVar);
            return;
        }
        if (!eukbVar.c().equals("tracking_number")) {
            h(textView, eukbVar);
            return;
        }
        Intent intent = new Intent("android.intent.action.WEB_SEARCH");
        intent.putExtra(ConversationSuggestion.SUGGESTION_PROPERTY_MAP_QUERY, e(this.c));
        intent.addFlags(VCardConfig.FLAG_REFRAIN_QP_TO_NAME_PROPERTIES);
        eiid.o(context, intent);
    }

    final boolean c(Context context, eukb eukbVar) throws IOException {
        ekgb ekgbVarG;
        if (!eukbVar.b.isEmpty()) {
            ArrayList parcelableArrayList = eukbVar.c.deepCopy().getParcelableArrayList("actions-intents");
            if (parcelableArrayList == null) {
                int i = ekgb.d;
                ekgbVarG = ekoe.a;
            } else {
                int i2 = ekgb.d;
                ekfw ekfwVar = new ekfw();
                int size = parcelableArrayList.size();
                for (int i3 = 0; i3 < size; i3++) {
                    ekfwVar.h(new Intent((Intent) parcelableArrayList.get(i3)));
                }
                ekgbVarG = ekfwVar.g();
            }
            Optional optionalFindFirst = Collection.EL.stream(ekgbVarG).findFirst();
            if (optionalFindFirst.isEmpty()) {
                ((eksl) ((eksl) b.h()).h("com/google/android/apps/messaging/textclassifier/TCLibLinkifyTextSpan", "runFirstActionIntent", 237, "TCLibLinkifyTextSpan.java")).q("TCLiB: No action intent found");
                return false;
            }
            if (this.e.a()) {
                ((eksl) ((eksl) b.h()).h("com/google/android/apps/messaging/textclassifier/TCLibLinkifyTextSpan", "runFirstActionIntent", 242, "TCLibLinkifyTextSpan.java")).q("TCLiB: adding flags to launch in split screen");
                ((Intent) optionalFindFirst.get()).addFlags(268439552);
            }
            ((eksl) ((eksl) b.h()).h("com/google/android/apps/messaging/textclassifier/TCLibLinkifyTextSpan", "runFirstActionIntent", 247, "TCLibLinkifyTextSpan.java")).t("TCLib: Starting text classification action: %s", optionalFindFirst.get());
            try {
                eiid.o(context, (Intent) optionalFindFirst.get());
                return true;
            } catch (ActivityNotFoundException e) {
                ((eksl) ((eksl) ((eksl) b.i()).g(e)).h("com/google/android/apps/messaging/textclassifier/TCLibLinkifyTextSpan", "runFirstActionIntent", (char) 254, "TCLibLinkifyTextSpan.java")).q("TCLib: Unable to open linkified text, activity not found.");
            }
        }
        return false;
    }

    @Override // defpackage.euln, android.text.style.ClickableSpan
    public final void onClick(View view) {
        Optional optional = this.g;
        if (!optional.isPresent()) {
            super.onClick(view);
        } else {
            afgj.a(this.a.a);
            throw null;
        }
    }
}
