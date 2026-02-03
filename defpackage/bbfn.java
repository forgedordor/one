package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.widget.Toast;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;

/* compiled from: PG */
@Deprecated
/* loaded from: classes7.dex */
public final class bbfn {
    public final Context a;
    public final fcsu b;
    private final crmx c;
    private final crny d;
    private final cmum e;
    private final fcsu f;
    private final fcsu g;
    private final cpga h;
    private final aqmw i;

    public bbfn(Context context, crmx crmxVar, crny crnyVar, cmum cmumVar, fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3, cpga cpgaVar, aqmw aqmwVar) {
        this.a = context;
        this.c = crmxVar;
        this.d = crnyVar;
        this.e = cmumVar;
        this.b = fcsuVar;
        this.f = fcsuVar2;
        this.g = fcsuVar3;
        this.h = cpgaVar;
        this.i = aqmwVar;
    }

    private static boolean g(int i) {
        return i == 1 || i == 2;
    }

    public final void a() {
        d(R.string.conversation_deletion_failed);
    }

    public final void b(ConversationIdType conversationIdType, ParticipantsTable.BindData bindData, MessageCoreData messageCoreData) {
        Context context = this.a;
        if (cpga.g(context) && ((bwwe) this.b.b()).f(conversationIdType)) {
            Resources resources = context.getResources();
            String string = bindData == null ? resources.getString(R.string.unknown_sender) : ((bbcc) this.g.b()).a(bindData, false);
            String strB = messageCoreData == null ? "" : ejwk.b(messageCoreData.av());
            String strB2 = messageCoreData != null ? ejwk.b(messageCoreData.as()) : "";
            int iK = messageCoreData == null ? 100 : messageCoreData.k();
            if (byed.g(iK)) {
                e(strB2);
                return;
            }
            boolean zCl = messageCoreData.cl();
            cpfy cpfyVarE = cpfz.e();
            cpfyVarE.d(resources);
            cpfyVarE.e(iK);
            cpfyVarE.c(false);
            cpfyVarE.g(false);
            cpgb cpgbVar = (cpgb) cpfyVarE;
            cpgbVar.a = string;
            cpfyVarE.b(zCl ? 1 : 0);
            cpgbVar.c = strB;
            cpgbVar.d = strB2;
            if (((eoth) ((aqmt) this.i).a.b()).a("bugle.talkback_announce_toast_message_added_attachment_type")) {
                cpgbVar.b = messageCoreData.am();
            }
            e(this.h.c(cpfyVarE.a()));
        }
    }

    public final void c(ConversationIdType conversationIdType, boolean z, int i, int i2, int i3, boolean z2) {
        if (!z) {
            if (i == 3) {
                if (g(i2)) {
                    if (!z2) {
                        z2 = false;
                    } else if (!this.e.a(i3).p()) {
                        d(R.string.mms_failure_outgoing_disabled);
                        return;
                    } else {
                        if (!((cdzw) this.f.b()).b()) {
                            d(R.string.toast_mms_failure_outgoing_disabled_by_device_admin);
                            return;
                        }
                        z2 = true;
                    }
                }
            } else if (i == 2) {
                if (this.c.E()) {
                    if (z2) {
                        d(R.string.send_message_failure_airplane_mode);
                        return;
                    } else {
                        d(R.string.download_message_failure_airplane_mode);
                        return;
                    }
                }
                crny crnyVar = this.d;
                if (!crnyVar.r()) {
                    if (z2) {
                        d(R.string.send_message_failure_no_sim);
                        return;
                    } else {
                        d(R.string.download_message_failure_no_sim);
                        return;
                    }
                }
                if (g(i2) && !crnyVar.i().A()) {
                    if (z2) {
                        d(R.string.send_message_failure_no_data);
                        return;
                    } else {
                        d(R.string.download_message_failure_no_data);
                        return;
                    }
                }
            }
        }
        if (cpga.g(this.a)) {
            fcsu fcsuVar = this.b;
            if (((bwwe) fcsuVar.b()).f(conversationIdType) && z) {
                d(true != z2 ? R.string.download_message_success : R.string.send_message_success);
            } else {
                if (!((bwwe) fcsuVar.b()).g(conversationIdType) || z) {
                    return;
                }
                d(true != z2 ? R.string.download_message_failure : R.string.send_message_failure);
            }
        }
    }

    public final void d(final int i) {
        ecem.a().post(new Runnable() { // from class: bbfl
            @Override // java.lang.Runnable
            public final void run() {
                Context context = this.a.a;
                Toast.makeText(context, context.getString(i), 1).show();
            }
        });
    }

    public final void e(final String str) {
        ecem.a().post(new Runnable() { // from class: bbfm
            @Override // java.lang.Runnable
            public final void run() {
                Toast.makeText(this.a.a, str, 1).show();
            }
        });
    }

    public final void f(String str) {
        if (cpga.g(this.a)) {
            e(str);
        }
    }
}
