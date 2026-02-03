package defpackage;

import android.content.Context;
import android.content.DialogInterface;
import android.view.Menu;
import android.view.MenuItem;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.home.select.SelectedConversation;
import java.util.Collection;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class acuy implements aday {
    public final Context a;
    private final egpr b;
    private final fdjx c;
    private MenuItem d;
    private final egps e;

    public acuy(Context context, egpr egprVar, fdjx fdjxVar) {
        egprVar.getClass();
        fdjxVar.getClass();
        this.a = context;
        this.b = egprVar;
        this.c = fdjxVar;
        this.e = new egps<SelectedConversation, String>() { // from class: acuy.1
            @Override // defpackage.egps
            public final /* bridge */ /* synthetic */ void c(Object obj, Object obj2) {
                String str = (String) obj2;
                ((SelectedConversation) obj).getClass();
                str.getClass();
                Context context2 = acuy.this.a;
                eeji eejiVar = new eeji(context2);
                eejiVar.v(context2.getString(R.string.debug_conversation_details));
                eejiVar.l(str);
                eejiVar.i(true);
                eejiVar.n(context2.getString(R.string.debug_conversation_details_negative_button), new DialogInterface.OnClickListener() { // from class: acux
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i) {
                        dialogInterface.dismiss();
                    }
                });
                eejiVar.a();
            }

            @Override // defpackage.egps
            public final /* synthetic */ void f(Object obj, Throwable th) {
                auvh.d(th);
            }

            @Override // defpackage.egps
            public final /* synthetic */ void b(Object obj) {
            }
        };
    }

    @Override // defpackage.aday
    public final int a() {
        return R.id.debug_conversation_details;
    }

    @Override // defpackage.aday
    public final void b(Menu menu) {
        menu.getClass();
        MenuItem menuItemAdd = menu.add(0, R.id.debug_conversation_details, 99999, this.a.getString(R.string.debug_conversation_details));
        this.d = menuItemAdd;
        if (menuItemAdd == null) {
            fdbq.c("debugConversationDetailsMenuItem");
            menuItemAdd = null;
        }
        menuItemAdd.setShowAsAction(4);
    }

    @Override // defpackage.aday
    public final void c(Collection collection) {
        SelectedConversation selectedConversation = (SelectedConversation) fcva.M(collection);
        this.b.h(new egpq(auvw.c(this.c, fcyi.a, fdjz.a, new acva(selectedConversation, null))), new egpo(selectedConversation), this.e);
    }

    @Override // defpackage.aday
    public final void d(Collection collection) {
        int size = collection.size();
        MenuItem menuItem = this.d;
        if (menuItem == null) {
            fdbq.c("debugConversationDetailsMenuItem");
            menuItem = null;
        }
        menuItem.setVisible(size == 1);
    }

    @Override // defpackage.aday
    public final void e(ea eaVar) {
        this.b.j(this.e);
    }

    @Override // defpackage.aday
    public final /* synthetic */ void f() {
    }
}
