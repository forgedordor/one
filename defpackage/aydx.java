package defpackage;

import android.os.Parcel;
import com.google.android.apps.messaging.shared.datamodel.action.RefreshStatefulNotificationsAction;
import com.google.android.apps.messaging.shared.datamodel.action.common.ThrottledAction;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class aydx extends ayqd {
    private final fcsu a;
    private final fcsu b;
    private final fcsu c;

    public aydx(fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3) {
        fcsuVar.getClass();
        this.a = fcsuVar;
        fcsuVar2.getClass();
        this.b = fcsuVar2;
        this.c = fcsuVar3;
    }

    @Override // defpackage.ayqd, defpackage.ayms
    /* renamed from: a, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final RefreshStatefulNotificationsAction c(Parcel parcel) {
        cgbn cgbnVar = (cgbn) this.a.b();
        cgbnVar.getClass();
        ajfo ajfoVar = (ajfo) this.b.b();
        ajfoVar.getClass();
        cqpz cqpzVar = (cqpz) this.c.b();
        cqpzVar.getClass();
        parcel.getClass();
        return new RefreshStatefulNotificationsAction(cgbnVar, ajfoVar, cqpzVar, parcel);
    }

    @Override // defpackage.ayqd
    public final /* bridge */ /* synthetic */ ThrottledAction d(boolean z, boolean z2, boolean z3, ConversationIdType conversationIdType) {
        cgbn cgbnVar = (cgbn) this.a.b();
        cgbnVar.getClass();
        ajfo ajfoVar = (ajfo) this.b.b();
        ajfoVar.getClass();
        cqpz cqpzVar = (cqpz) this.c.b();
        cqpzVar.getClass();
        conversationIdType.getClass();
        return new RefreshStatefulNotificationsAction(cgbnVar, ajfoVar, cqpzVar, z, z2, z3, conversationIdType);
    }
}
