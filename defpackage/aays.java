package defpackage;

import android.content.DialogInterface;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.TextView;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.home.select.SelectedConversation;
import com.google.android.apps.messaging.label.data.classification.SuperSortLabel;
import j$.util.Optional;
import java.util.Collection;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aays {
    public final eg a;
    public final fcsu b;
    public final fcsu c;
    private final eigp d;

    public aays(eg egVar, fcsu fcsuVar, fcsu fcsuVar2, eigp eigpVar) {
        this.a = egVar;
        this.b = fcsuVar;
        this.c = fcsuVar2;
        this.d = eigpVar;
    }

    public final void a(final ViewGroup viewGroup, final Collection collection, final elka elkaVar, final Runnable runnable) {
        eg egVar = this.a;
        eeji eejiVar = new eeji(egVar);
        aayu aayuVar = (aayu) this.b.b();
        Integer numValueOf = Integer.valueOf(R.plurals.delete_conversations_confirmation_dialog_title);
        ejxr ejxrVar = crbf.ak;
        boolean zBooleanValue = ((Boolean) ((cczi) ejxrVar.get()).e()).booleanValue();
        int i = R.string.delete_conversations_confirmation_dialog_text;
        if (zBooleanValue) {
            fcsu fcsuVar = aayuVar.c;
            if (((Optional) fcsuVar.b()).isPresent()) {
                Iterator it = collection.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    SelectedConversation selectedConversation = (SelectedConversation) it.next();
                    if (((alrj) aayuVar.d.b()).u(selectedConversation.k, selectedConversation.p).z()) {
                        numValueOf = Integer.valueOf(R.plurals.delete_conversations_confirmation_dialog_title_with_penpal);
                        if (collection.size() == 1) {
                            i = R.string.delete_conversation_confirmation_dialog_text_with_penpal;
                        } else {
                            i = R.string.delete_conversations_confirmation_dialog_text_with_penpal;
                        }
                    }
                }
            }
        }
        aayo aayoVar = new aayo(numValueOf.intValue(), i);
        eejiVar.v(egVar.getResources().getQuantityString(aayoVar.a, collection.size(), Integer.valueOf(collection.size())));
        eejiVar.k(aayoVar.b);
        eejiVar.r(R.string.delete_conversation_confirmation_button, new eigf(this.d, "com/google/android/apps/messaging/delete/ui/dialog/DeleteDialog", "showDeleteDialog", 65, "HomeFragmentPeer: Delete message", new DialogInterface.OnClickListener() { // from class: aayp
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                ViewGroup viewGroup2;
                Collection<SelectedConversation> collection2 = collection;
                int size = collection2.size();
                aays aaysVar = this.a;
                eg egVar2 = aaysVar.a;
                if (cpga.g(egVar2) && (viewGroup2 = viewGroup) != null) {
                    cpga.h(viewGroup2, egVar2.getResources().getQuantityString(R.plurals.deleted_toast_message, size, Integer.valueOf(size)));
                }
                for (SelectedConversation selectedConversation2 : collection2) {
                    elka elkaVar2 = elkaVar;
                    ((ains) aaysVar.c.b()).c("Bugle.UI.DeleteConversation");
                    aayu aayuVar2 = (aayu) aaysVar.b.b();
                    avnh avnhVar = (avnh) aayuVar2.b.b();
                    avnk avnkVarF = avnl.f();
                    avnkVarF.f(elkaVar2);
                    avnkVarF.b(selectedConversation2.a);
                    avnkVarF.d(SuperSortLabel.UNKNOWN);
                    avnkVarF.c(((cogw) aayuVar2.a.b()).f().toEpochMilli());
                    avnhVar.b(avnkVarF.a());
                }
                runnable.run();
            }
        }));
        eejiVar.m(R.string.delete_conversation_decline_button, new DialogInterface.OnClickListener() { // from class: aayq
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
            }
        });
        eejiVar.q(new DialogInterface.OnDismissListener() { // from class: aayr
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                runnable.run();
            }
        });
        iv ivVarA = eejiVar.a();
        if (((Boolean) ((cczi) ejxrVar.get()).e()).booleanValue()) {
            Window window = ivVarA.getWindow();
            window.getClass();
            eebt.b((TextView) window.findViewById(android.R.id.message));
        }
    }
}
