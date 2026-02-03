package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.selfidentity.SelfIdentityIdImpl;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class axrg extends fcyv {
    int a;
    Object b;
    Object c;
    /* synthetic */ Object d;
    final /* synthetic */ axrj e;
    int f;
    String g;
    String h;
    ConversationIdType i;
    SelfIdentityIdImpl j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public axrg(axrj axrjVar, fcxy fcxyVar) {
        super(fcxyVar);
        this.e = axrjVar;
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        return this.e.b(0, null, null, null, null, null, false, false, null, null, null, this);
    }
}
