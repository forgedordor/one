package com.google.android.apps.messaging.shared.datamodel.action;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.messaging.shared.datamodel.action.common.Action;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import defpackage.aykl;
import defpackage.aykm;
import defpackage.aymo;
import defpackage.barn;
import defpackage.dqsn;
import defpackage.eieu;
import defpackage.eiiy;
import defpackage.ejwl;
import defpackage.ejxr;
import defpackage.elgm;
import defpackage.fcsu;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class UpdateConversationInteractiveTimestampAction extends Action<Void> implements Parcelable {
    public static final Parcelable.Creator<Action<Void>> CREATOR = new aykl();
    public final fcsu a;
    private final dqsn b;

    /* compiled from: PG */
    public interface a {
        aykm ip();
    }

    public UpdateConversationInteractiveTimestampAction(fcsu fcsuVar, dqsn dqsnVar, Parcel parcel) {
        super(parcel, elgm.UPDATE_CONVERSATION_INTERACTIVE_TIMESTAMP_ACTION);
        this.a = fcsuVar;
        this.b = dqsnVar;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final eieu a() {
        return eiiy.k("UpdateConversationInteractiveTimestampAction");
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final /* bridge */ /* synthetic */ Object b() {
        aymo aymoVar = this.v;
        final ConversationIdType conversationIdTypeB = barn.b(aymoVar.l("conversation_id"));
        ejwl.b(!conversationIdTypeB.b(), "Can't update the last interactive event timestamp without a conversation id");
        final long jD = aymoVar.d("interactive_timestamp_ms");
        this.b.c("UpdateConversationInteractiveTimestampAction#executeAction", new ejxr() { // from class: aykk
            @Override // defpackage.ejxr
            public final Object get() {
                bakt baktVar = (bakt) this.a.a.b();
                String[] strArr = botm.a;
                bote boteVar = new bote();
                boteVar.ap("UpdateConversationInteractiveTimestampAction#executeAction)");
                int iIntValue = botm.g().intValue();
                int iIntValue2 = botm.g().intValue();
                if (iIntValue2 < 15000) {
                    dqru.x("last_interactive_event_timestamp", iIntValue2);
                }
                if (iIntValue >= 15000) {
                    boteVar.a.put("last_interactive_event_timestamp", Long.valueOf(jD));
                }
                return Boolean.valueOf(baktVar.aj(conversationIdTypeB, boteVar));
            }
        });
        return null;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final String c() {
        return "Bugle.DataModel.Action.UpdateConversationInteractiveTimestamp.ExecuteAction.Latency";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C(parcel, i);
    }

    public UpdateConversationInteractiveTimestampAction(fcsu fcsuVar, dqsn dqsnVar, ConversationIdType conversationIdType, long j) {
        super(elgm.UPDATE_CONVERSATION_INTERACTIVE_TIMESTAMP_ACTION);
        this.a = fcsuVar;
        this.b = dqsnVar;
        this.v.v("conversation_id", conversationIdType.a());
        this.v.s("interactive_timestamp_ms", j);
    }
}
