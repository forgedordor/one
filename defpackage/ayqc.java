package defpackage;

import com.google.android.apps.messaging.shared.datamodel.action.common.ThrottledAction;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ayqc {
    public boolean a;
    public ConversationIdType b = barn.a;
    final /* synthetic */ ayqd c;
    private boolean d;
    private boolean e;

    public ayqc(ayqd ayqdVar) {
        this.c = ayqdVar;
    }

    public final ThrottledAction a() {
        return this.c.d(this.d, this.e, this.a, this.b);
    }

    public final void b() {
        this.e = true;
    }

    public final void c() {
        this.d = true;
    }
}
