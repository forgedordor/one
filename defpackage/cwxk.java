package defpackage;

import android.content.Context;
import android.view.Menu;
import android.view.MenuItem;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.home.select.SelectedConversation;
import com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversationId;
import j$.util.Collection;
import j$.util.function.Function$CC;
import j$.util.function.Predicate$CC;
import j$.util.stream.Stream;
import java.util.Collection;
import java.util.Iterator;
import java.util.function.Function;
import java.util.function.Predicate;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cwxk implements aday {
    public static final /* synthetic */ int a = 0;
    private static final eksp b = eksp.c("Bugle");
    private final Context c;
    private final fcsu d;
    private MenuItem e;

    public cwxk(Context context, fcsu fcsuVar) {
        this.c = context;
        this.d = fcsuVar;
    }

    @Override // defpackage.aday
    public final int a() {
        return R.id.action_mark_as_unread;
    }

    @Override // defpackage.aday
    public final void b(Menu menu) {
        MenuItem menuItemAdd = menu.add(0, R.id.action_mark_as_unread, 65, this.c.getString(R.string.action_mark_as_unread));
        this.e = menuItemAdd;
        menuItemAdd.setShowAsAction(4);
        this.e.setIcon(R.drawable.messages_unread_chat_icon);
    }

    @Override // defpackage.aday
    public final void c(Collection collection) {
        eksp ekspVar = b;
        ((eksl) ekspVar.n().h("com/google/android/apps/messaging/ui/conversationlist/markunread/MarkAsUnreadMenuExtension", "onClick", 61, "MarkAsUnreadMenuExtension.java")).r("%d conversations selected for mark as (un)read", collection.size());
        if (collection.isEmpty()) {
            ((eksl) ekspVar.n().h("com/google/android/apps/messaging/ui/conversationlist/markunread/MarkAsUnreadMenuExtension", "onClick", 63, "MarkAsUnreadMenuExtension.java")).q("No conversations to mark as (un)read.");
            return;
        }
        final boolean zAnyMatch = Collection.EL.stream(collection).anyMatch(new Predicate() { // from class: cwxh
            public final /* synthetic */ Predicate and(Predicate predicate) {
                return Predicate$CC.$default$and(this, predicate);
            }

            @Override // java.util.function.Predicate
            /* renamed from: negate */
            public final /* synthetic */ Predicate mo538negate() {
                return Predicate$CC.$default$negate(this);
            }

            public final /* synthetic */ Predicate or(Predicate predicate) {
                return Predicate$CC.$default$or(this, predicate);
            }

            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                int i = cwxk.a;
                return ((SelectedConversation) obj).r;
            }
        });
        ((eksl) ekspVar.n().h("com/google/android/apps/messaging/ui/conversationlist/markunread/MarkAsUnreadMenuExtension", "onClick", 68, "MarkAsUnreadMenuExtension.java")).t("shouldMarkUnread is %b", Boolean.valueOf(zAnyMatch));
        Stream map = Collection.EL.stream(collection).filter(new Predicate() { // from class: cwxi
            public final /* synthetic */ Predicate and(Predicate predicate) {
                return Predicate$CC.$default$and(this, predicate);
            }

            @Override // java.util.function.Predicate
            /* renamed from: negate */
            public final /* synthetic */ Predicate mo538negate() {
                return Predicate$CC.$default$negate(this);
            }

            public final /* synthetic */ Predicate or(Predicate predicate) {
                return Predicate$CC.$default$or(this, predicate);
            }

            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                int i = cwxk.a;
                return ((SelectedConversation) obj).r == zAnyMatch;
            }
        }).map(new Function() { // from class: cwxj
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                int i = cwxk.a;
                return new BugleConversationId(((SelectedConversation) obj).a);
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        int i = ekgb.d;
        ekgb ekgbVar = (ekgb) map.collect(ekcv.a);
        if (zAnyMatch) {
            auvh.h(((ajln) this.d.b()).J(ekgbVar, 2));
        } else {
            auvh.h(((ajln) this.d.b()).I(ekgbVar, 2));
        }
    }

    @Override // defpackage.aday
    public final void d(java.util.Collection collection) {
        if (collection.isEmpty()) {
            this.e.setVisible(false);
            return;
        }
        Iterator it = collection.iterator();
        boolean z = false;
        while (it.hasNext()) {
            SelectedConversation selectedConversation = (SelectedConversation) it.next();
            if (selectedConversation.f.d()) {
                this.e.setVisible(false);
                return;
            }
            z |= selectedConversation.r;
        }
        this.e.setIcon(z ? R.drawable.messages_unread_chat_icon : R.drawable.messages_chat_icon);
        this.e.setTitle(z ? this.c.getString(R.string.action_mark_as_unread) : this.c.getString(R.string.action_mark_as_read));
        this.e.setVisible(true);
    }

    @Override // defpackage.aday
    public final /* synthetic */ void f() {
    }

    @Override // defpackage.aday
    public final /* synthetic */ void e(ea eaVar) {
    }
}
