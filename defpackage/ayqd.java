package defpackage;

import android.os.Parcel;
import com.google.android.apps.messaging.shared.datamodel.action.common.Action;
import com.google.android.apps.messaging.shared.datamodel.action.common.ThrottledAction;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;

/* compiled from: PG */
/* loaded from: classes6.dex */
public abstract class ayqd implements ayms<Void> {
    public abstract ThrottledAction b(Parcel parcel);

    @Override // defpackage.ayms
    public /* bridge */ /* synthetic */ Action c(Parcel parcel) {
        throw null;
    }

    public abstract ThrottledAction d(boolean z, boolean z2, boolean z3, ConversationIdType conversationIdType);

    public final void e(boolean z, ConversationIdType conversationIdType) {
        ayqc ayqcVar = new ayqc(this);
        ayqcVar.c();
        ayqcVar.b = conversationIdType;
        ayqcVar.a = z;
        ayqcVar.a().K();
    }

    public final void f() {
        ayqc ayqcVar = new ayqc(this);
        ayqcVar.b();
        ayqcVar.a().K();
    }

    public final void g() {
        h(barn.a);
    }

    public final void h(ConversationIdType conversationIdType) {
        ayqc ayqcVar = new ayqc(this);
        ayqcVar.b();
        ayqcVar.c();
        ayqcVar.b = conversationIdType;
        ayqcVar.a().K();
    }
}
