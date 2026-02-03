package defpackage;

import android.view.Menu;
import android.view.MenuItem;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.home.select.SelectedConversation;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import java.util.Collection;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class czwd implements aday {
    private static final cqce a = cqce.f("Bugle", czwd.class);
    private final czxe b;
    private MenuItem c;

    public czwd(czxe czxeVar) {
        this.b = czxeVar;
    }

    private static boolean g(Collection collection) {
        return (collection.size() == 1 && czwc.a() && !czwc.b()) ? false : true;
    }

    @Override // defpackage.aday
    public final int a() {
        return R.id.action_set_reminder;
    }

    @Override // defpackage.aday
    public final void b(Menu menu) {
        MenuItem menuItemAdd = menu.add(0, R.id.action_set_reminder, 110, R.string.action_set_reminder);
        this.c = menuItemAdd;
        menuItemAdd.setShowAsAction(10);
        this.c.setIcon(R.drawable.quantum_ic_alarm_vd_theme_24);
    }

    @Override // defpackage.aday
    public final void c(Collection collection) {
        if (g(collection)) {
            a.m("Reminder menu icon shouldn't be displayed.");
            return;
        }
        SelectedConversation selectedConversation = (SelectedConversation) collection.iterator().next();
        MessageIdType messageIdType = selectedConversation.c;
        if (messageIdType.c()) {
            a.m("Msg ID null. Reminder menu icon shouldn't be displayed.");
            return;
        }
        czxn czxnVar = (czxn) czxo.a.createBuilder();
        String strB = messageIdType.b();
        czxnVar.copyOnWrite();
        czxo czxoVar = (czxo) czxnVar.instance;
        strB.getClass();
        czxoVar.b |= 2;
        czxoVar.d = strB;
        ConversationIdType conversationIdType = selectedConversation.a;
        conversationIdType.getClass();
        String strA = conversationIdType.a();
        czxnVar.copyOnWrite();
        czxo czxoVar2 = (czxo) czxnVar.instance;
        strA.getClass();
        czxoVar2.b |= 4;
        czxoVar2.e = strA;
        long j = selectedConversation.e;
        czxnVar.copyOnWrite();
        czxo czxoVar3 = (czxo) czxnVar.instance;
        czxoVar3.b |= 16;
        czxoVar3.g = j;
        boolean z = j > 0;
        czxnVar.copyOnWrite();
        czxo czxoVar4 = (czxo) czxnVar.instance;
        czxoVar4.b |= 8;
        czxoVar4.f = z;
        czxnVar.copyOnWrite();
        czxo czxoVar5 = (czxo) czxnVar.instance;
        czxoVar5.h = 9;
        czxoVar5.b |= 32;
        this.b.a(czxnVar.build());
    }

    @Override // defpackage.aday
    public final void d(Collection collection) {
        if (g(collection)) {
            this.c.setVisible(false);
            return;
        }
        SelectedConversation selectedConversation = (SelectedConversation) collection.iterator().next();
        if (selectedConversation.f.g() || selectedConversation.c.c()) {
            this.c.setVisible(false);
        } else {
            this.c.setVisible(true);
            this.c.setTitle(selectedConversation.e > 0 ? R.string.action_edit_reminder : R.string.action_set_reminder);
        }
    }

    @Override // defpackage.aday
    public final void f() {
    }

    @Override // defpackage.aday
    public final void e(ea eaVar) {
    }
}
