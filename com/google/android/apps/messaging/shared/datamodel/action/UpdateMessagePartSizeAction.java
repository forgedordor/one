package com.google.android.apps.messaging.shared.datamodel.action;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.messaging.shared.datamodel.action.common.Action;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.PartsTable;
import defpackage.aykq;
import defpackage.aykr;
import defpackage.aymo;
import defpackage.bbae;
import defpackage.bsjh;
import defpackage.cqaz;
import defpackage.eieu;
import defpackage.eiiy;
import defpackage.elgm;
import defpackage.fcsu;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class UpdateMessagePartSizeAction extends Action<Void> implements Parcelable {
    public static final Parcelable.Creator<Action<Void>> CREATOR = new aykq();
    private final fcsu a;

    /* compiled from: PG */
    public interface a {
        aykr iq();
    }

    public UpdateMessagePartSizeAction(fcsu fcsuVar, Parcel parcel) {
        super(parcel, elgm.UPDATE_MESSAGE_PART_SIZE_ACTION);
        this.a = fcsuVar;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final eieu a() {
        return eiiy.k("UpdateMessagePartSizeAction");
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final /* synthetic */ Object b() {
        aymo aymoVar = this.v;
        String strL = aymoVar.l("part_id");
        int iA = aymoVar.a("width");
        int iA2 = aymoVar.a("height");
        fcsu fcsuVar = this.a;
        MessagePartCoreData messagePartCoreDataA = ((bbae) fcsuVar.b()).a(strL);
        if (messagePartCoreDataA == null) {
            return null;
        }
        bbae bbaeVar = (bbae) fcsuVar.b();
        ConversationIdType conversationIdTypeA = messagePartCoreDataA.A();
        MessageIdType messageIdTypeB = messagePartCoreDataA.B();
        eieu eieuVarK = eiiy.k("MessagePartDatabaseOperations#updateMessagePartSize");
        try {
            cqaz.h();
            String[] strArr = PartsTable.a;
            bsjh bsjhVar = new bsjh();
            bsjhVar.ap("updateMessagePartSize");
            bsjhVar.B(iA);
            bsjhVar.p(iA2);
            bbaeVar.f(conversationIdTypeA, messageIdTypeB, strL, bsjhVar);
            eieuVarK.close();
            return null;
        } catch (Throwable th) {
            try {
                eieuVarK.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final String c() {
        return "Bugle.DataModel.Action.UpdateMessagePartSize.ExecuteAction.Latency";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C(parcel, i);
    }

    public UpdateMessagePartSizeAction(fcsu fcsuVar, String str, int i, int i2) {
        super(elgm.UPDATE_MESSAGE_PART_SIZE_ACTION);
        this.v.v("part_id", str);
        this.v.r("width", i);
        this.v.r("height", i2);
        this.a = fcsuVar;
    }
}
