package defpackage;

import android.content.res.Resources;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.datamodel.data.MessagePartData;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.PartsTable;
import j$.time.Duration;
import j$.time.Instant;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class anmi implements anmk {
    private static final ekrg a = ekrg.c("com/google/android/apps/messaging/shared/api/messaging/message/status/SendingStatusHandler");
    private final cqbm b;
    private final cogw c;
    private final bahv d;
    private final arwn e;

    public anmi(cqbm cqbmVar, cogw cogwVar, bahv bahvVar, arwn arwnVar) {
        cqbmVar.getClass();
        cogwVar.getClass();
        bahvVar.getClass();
        this.b = cqbmVar;
        this.c = cogwVar;
        this.d = bahvVar;
        this.e = arwnVar;
    }

    private static final boolean c(MessagesTable.BindData bindData) {
        return bindData.m() == 3;
    }

    @Override // defpackage.anmk
    public final anlb a(Resources resources, MessagesTable.BindData bindData, ekgb ekgbVar, andw andwVar, ancl anclVar, ajts ajtsVar) throws Resources.NotFoundException {
        String string;
        boolean z;
        aoer aoerVarH;
        resources.getClass();
        bindData.getClass();
        ekgbVar.getClass();
        andwVar.getClass();
        anclVar.getClass();
        ajtsVar.getClass();
        cqbm cqbmVar = this.b;
        int iM = bindData.m();
        cqey cqeyVar = (cqey) cqbmVar.a();
        if (cqeyVar.x() && (aoerVarH = ajtsVar.h()) != null && cqeyVar.d(iM, aoerVarH.b()) == cqgk.UNAVAILABLE) {
            string = resources.getString(R.string.mapi_message_status_waiting_to_connect);
        } else {
            Instant instantOfEpochMilli = Instant.ofEpochMilli(bindData.z());
            Object objE = anpo.a.e();
            objE.getClass();
            string = instantOfEpochMilli.plus(Duration.ofMillis(((Number) objE).longValue())).isBefore(this.c.f()) ? resources.getString(R.string.mapi_message_status_still_sending) : null;
        }
        String str = string;
        ((ekrd) a.h().h("com/google/android/apps/messaging/shared/api/messaging/message/status/SendingStatusHandler", "convert", 78, "SendingStatusHandler.kt")).D("Message with id %s has status %s", bindData.E().b(), str);
        if (!c(bindData) || ajtsVar.S()) {
            z = false;
        } else {
            if (((eoth) ((arwj) this.e).a.b()).a("bugle.hide_fallback_during_beginning_of_uploading") && c(bindData)) {
                ArrayList arrayList = new ArrayList(fcva.p(ekgbVar, 10));
                Iterator<E> it = ekgbVar.iterator();
                while (it.hasNext()) {
                    arrayList.add(this.d.e((PartsTable.BindData) it.next()));
                }
                if (!arrayList.isEmpty()) {
                    Iterator it2 = arrayList.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            break;
                        }
                        MessagePartData messagePartData = (MessagePartData) it2.next();
                        if (messagePartData.aX() && !messagePartData.bk()) {
                            Instant instantOfEpochMilli2 = Instant.ofEpochMilli(bindData.z());
                            Object objE2 = anpo.c.e();
                            objE2.getClass();
                            if (!instantOfEpochMilli2.plus(Duration.ofMillis(((Number) objE2).longValue())).isAfter(this.c.f())) {
                                break;
                            }
                        }
                    }
                    z = false;
                }
            }
            z = true;
        }
        return new anla(str, 1, true, z, true, false, false, false, false, 480);
    }

    @Override // defpackage.anmk
    public final /* synthetic */ anpj b(Resources resources, MessagesTable.BindData bindData, ekgb ekgbVar, andw andwVar, ancl anclVar, ajts ajtsVar) {
        return anmj.a(this, resources, bindData, ekgbVar, andwVar, anclVar, ajtsVar);
    }
}
