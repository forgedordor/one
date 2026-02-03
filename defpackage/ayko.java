package defpackage;

import android.os.Parcel;
import com.google.android.apps.messaging.shared.datamodel.action.UpdateConversationOptionsAction;
import com.google.android.apps.messaging.shared.datamodel.action.common.Action;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ayko extends ayox {
    private final fcsu a;
    private final fcsu b;
    private final fcsu c;

    public ayko(fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3) {
        fcsuVar.getClass();
        this.a = fcsuVar;
        fcsuVar2.getClass();
        this.b = fcsuVar2;
        fcsuVar3.getClass();
        this.c = fcsuVar3;
    }

    @Override // defpackage.ayox
    public final /* bridge */ /* synthetic */ Action a(ConversationIdType conversationIdType, Boolean bool, String str, Boolean bool2, Integer num) {
        byeb byebVar = (byeb) this.b.b();
        byebVar.getClass();
        bxlc bxlcVar = (bxlc) this.c.b();
        bxlcVar.getClass();
        conversationIdType.getClass();
        return new UpdateConversationOptionsAction(this.a, byebVar, bxlcVar, conversationIdType, bool, str, bool2, num);
    }

    @Override // defpackage.ayms
    public final /* bridge */ /* synthetic */ Action c(Parcel parcel) {
        byeb byebVar = (byeb) this.b.b();
        byebVar.getClass();
        bxlc bxlcVar = (bxlc) this.c.b();
        bxlcVar.getClass();
        parcel.getClass();
        return new UpdateConversationOptionsAction(this.a, byebVar, bxlcVar, parcel);
    }
}
