package defpackage;

import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.datamodel.action.MarkAsReadAction;
import com.google.android.apps.messaging.shared.datamodel.action.common.Action;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class acsc implements aymj {
    final /* synthetic */ acsd a;

    public acsc(acsd acsdVar) {
        this.a = acsdVar;
    }

    @Override // defpackage.aymj
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        this.a.a.r("Failed to mark all messages as read");
    }

    @Override // defpackage.aymj
    public final /* bridge */ /* synthetic */ void b(Action action, Object obj) {
        acsd acsdVar = this.a;
        ((dakl) acsdVar.c.b()).i(R.string.mark_all_messages_as_read_confirmation);
        int iA = ((MarkAsReadAction) action).v.a("total_messages_marked_as_read");
        cqbd cqbdVarA = acsdVar.a.a();
        cqbdVarA.G(iA);
        cqbdVarA.I(" message(s) marked as read and/or notified");
        cqbdVarA.r();
    }
}
