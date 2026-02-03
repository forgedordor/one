package defpackage;

import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.api.messaging.MessageId;
import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class xvt extends fcyz implements fdav {
    /* synthetic */ Object a;
    /* synthetic */ boolean b;
    /* synthetic */ Object c;
    final /* synthetic */ xvw d;
    final /* synthetic */ dpfy e;
    final /* synthetic */ fdjx f;
    final /* synthetic */ MessageId g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xvt(xvw xvwVar, dpfy dpfyVar, fdjx fdjxVar, MessageId messageId, fcxy fcxyVar) {
        super(4, fcxyVar);
        this.d = xvwVar;
        this.e = dpfyVar;
        this.f = fdjxVar;
        this.g = messageId;
    }

    @Override // defpackage.fdav
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3, Object obj4) {
        boolean zBooleanValue = ((Boolean) obj2).booleanValue();
        xvt xvtVar = new xvt(this.d, this.e, this.f, this.g, (fcxy) obj4);
        xvtVar.a = (xvo) obj;
        xvtVar.b = zBooleanValue;
        xvtVar.c = (String) obj3;
        return xvtVar.b(fctx.a);
    }

    /* JADX WARN: Type inference failed for: r8v0, types: [java.lang.CharSequence, java.lang.Object] */
    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        xvo xvoVar = (xvo) this.a;
        ajli ajliVar = xvoVar.a;
        boolean z = this.b;
        ?? r8 = this.c;
        boolean z2 = false;
        if (ajliVar == ajli.NONE && r8.length() > 0 && !z) {
            z2 = true;
        }
        final boolean z3 = z2;
        if (!z3) {
            xvw xvwVar = this.d;
            int length = ((String) r8).length();
            ekrw ekrwVarH = xvw.a.h();
            ekrwVarH.X(eksq.a, "BugleMediaViewer");
            ((ekrd) ekrwVarH.h("com/google/android/apps/messaging/conversation2/mediaviewer2/MediaViewerComposeRowUiAdapter", "logSendButtonDisabled", 129, "MediaViewerComposeRowUiAdapter.kt")).J("%s send button disabled, sendingInProgress %s, disabledReason %s, draftTextLength %s", xvwVar.getClass().getSimpleName(), Boolean.valueOf(z), ajliVar, Integer.valueOf(length));
        }
        djrr djrrVar = xvoVar.b ? djrr.dB : djrr.dA;
        final xvw xvwVar2 = this.d;
        final fdjx fdjxVar = this.f;
        final MessageId messageId = this.g;
        final dpfy dpfyVar = this.e;
        final String str = (String) r8;
        djew djewVar = new djew(djrrVar, new fdae() { // from class: xvs
            @Override // defpackage.fdae
            public final Object invoke() throws IOException {
                eieh eiehVarA;
                String str2 = str;
                MessageId messageId2 = messageId;
                xvw xvwVar3 = xvwVar2;
                dpfy dpfyVar2 = dpfyVar;
                boolean z4 = z3;
                fdjx fdjxVar2 = fdjxVar;
                if (z4) {
                    eiehVarA = xvwVar3.f.a("MediaViewerComposeRowUiAdapter.onSend");
                    try {
                        if (xvwVar3.l.g(false, true)) {
                            ekrw ekrwVarH2 = xvw.a.h();
                            ekrwVarH2.X(eksq.a, "BugleMediaViewer");
                            ((ekrd) ekrwVarH2.h("com/google/android/apps/messaging/conversation2/mediaviewer2/MediaViewerComposeRowUiAdapter", "onSend", 174, "MediaViewerComposeRowUiAdapter.kt")).t("Beginning %s.onSend", xvwVar3.getClass().getSimpleName());
                            auvw.k(fdjxVar2, xvwVar3.d, null, new xvv(str2, messageId2, xvwVar3, dpfyVar2, null), 2);
                        } else {
                            ekrw ekrwVarH3 = xvw.a.h();
                            ekrwVarH3.X(eksq.a, "BugleMediaViewer");
                            ((ekrd) ekrwVarH3.h("com/google/android/apps/messaging/conversation2/mediaviewer2/MediaViewerComposeRowUiAdapter", "onSend", 171, "MediaViewerComposeRowUiAdapter.kt")).t("Skipping %s.onSend due to it currently sending.", xvwVar3.getClass().getSimpleName());
                        }
                        fczl.a(eiehVarA, null);
                    } finally {
                    }
                } else {
                    eiehVarA = xvwVar3.f.a("MediaViewerComposeRowUiAdapter.onSendDisabled");
                    try {
                        ekrw ekrwVarJ = xvw.a.j();
                        ekrwVarJ.X(eksq.a, "BugleMediaViewer");
                        ((ekrd) ekrwVarJ.h("com/google/android/apps/messaging/conversation2/mediaviewer2/MediaViewerComposeRowUiAdapter", "onSendDisabled", 204, "MediaViewerComposeRowUiAdapter.kt")).t("Skipping %s.onSend as sending is disabled.", xvwVar3.getClass().getSimpleName());
                        fczl.a(eiehVarA, null);
                    } finally {
                        try {
                            throw th;
                        } finally {
                        }
                    }
                }
                return fctx.a;
            }
        }, (fdae) null, (String) null, z3, (djev) null, 92);
        String string = xvwVar2.c.getString(R.string.full_screen_message_compose_row_text_hint);
        string.getClass();
        return new yby(new djcy(new djcv(dpfyVar, "", string, null, 4, false, null, null, 232), xvw.b, null, djewVar, new djcx(xvwVar2.j.a()), 52), new ybm(xvwVar2.k.a()));
    }
}
