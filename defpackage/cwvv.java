package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.text.TextUtils;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.home.select.SelectedConversation;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import j$.util.Collection;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import j$.util.stream.Stream;
import java.util.HashSet;
import java.util.concurrent.Callable;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cwvv implements ActionMode.Callback {
    public static final /* synthetic */ int d = 0;
    private static final ekgb e = ekgb.w(Integer.valueOf(R.id.action_archive), Integer.valueOf(R.id.action_unarchive), Integer.valueOf(R.id.action_add_contact), Integer.valueOf(R.id.action_block), Integer.valueOf(R.id.action_report_spam), Integer.valueOf(R.id.action_delete));
    public final csq a = new csq();
    public HashSet b;
    int c;
    private final Context f;
    private final cssx g;
    private final cmum h;
    private final cpiz i;
    private final Optional j;
    private final cwvu k;
    private final fcsu l;
    private final fcsu m;
    private final fcsu n;
    private boolean o;
    private Menu p;
    private MenuItem q;
    private MenuItem r;
    private MenuItem s;
    private MenuItem t;
    private MenuItem u;
    private Toast v;
    private final arpr w;

    public cwvv(Context context, cssx cssxVar, cmum cmumVar, cpiz cpizVar, Optional optional, cwvu cwvuVar, fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3, arpr arprVar) {
        this.f = context;
        this.g = cssxVar;
        this.h = cmumVar;
        this.i = cpizVar;
        this.j = optional;
        this.k = cwvuVar;
        this.l = fcsuVar;
        this.m = fcsuVar2;
        this.n = fcsuVar3;
        this.w = arprVar;
    }

    private final void f() throws Resources.NotFoundException {
        Toast toastMakeText;
        Toast toast;
        boolean z;
        if (this.o) {
            csq csqVar = this.a;
            if (csqVar.d == 1) {
                SelectedConversation selectedConversation = (SelectedConversation) csqVar.g(0);
                MenuItem menuItem = this.s;
                int i = selectedConversation.g;
                String str = selectedConversation.m;
                boolean zIsEmpty = TextUtils.isEmpty(str);
                boolean z2 = selectedConversation.h;
                alrj alrjVar = (alrj) this.m.b();
                String str2 = selectedConversation.k;
                boolean z3 = ((Boolean) ((cczi) crbf.ak.get()).e()).booleanValue() && alrjVar.u(str2, selectedConversation.p).z();
                boolean z4 = selectedConversation.n && this.g.b();
                bvdk bvdkVar = selectedConversation.f;
                boolean zE = bvdkVar.e();
                if (i != 0) {
                    z = false;
                } else if (!zIsEmpty || z2 || z3 || z4 || zE) {
                    i = 0;
                    z = false;
                } else {
                    z = true;
                    i = 0;
                }
                menuItem.setVisible(z);
                this.t.setVisible((!this.i.c() || str2 == null || this.b.contains(str2) || this.h.d(str2)) ? false : true);
                this.u.setVisible((i == 0 || bvdkVar.f()) ? false : true);
                this.s.setShowAsAction(1);
                if (this.w.a()) {
                    this.t.setShowAsAction(1);
                    this.u.setShowAsAction(1);
                } else {
                    this.t.setShowAsAction(true != TextUtils.isEmpty(str) ? 2 : 1);
                }
            } else {
                this.s.setVisible(false);
                this.t.setVisible(false);
                this.u.setVisible(false);
            }
            boolean z5 = false;
            boolean z6 = false;
            boolean z7 = false;
            boolean z8 = false;
            boolean z9 = false;
            for (SelectedConversation selectedConversation2 : csqVar.values()) {
                boolean z10 = selectedConversation2.i;
                z5 |= !z10;
                z6 |= z10;
                bvdk bvdkVar2 = selectedConversation2.f;
                if (!bvdkVar2.d()) {
                    z9 = true;
                } else if (bvdkVar2.g()) {
                    z7 = true;
                    z8 = true;
                } else {
                    z7 = true;
                }
                if (z5 && z6 && z7 && z8 && z9) {
                    break;
                }
            }
            this.q.setVisible(z9);
            this.r.setVisible(z7 && !z8);
            this.j.ifPresent(new Consumer() { // from class: cwvp
                @Override // java.util.function.Consumer
                /* renamed from: accept */
                public final void z(Object obj) {
                    ekgb ekgbVar = ((adba) obj).a;
                    int size = ekgbVar.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        ((aday) ekgbVar.get(i2)).d(this.a.a.values());
                    }
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
            Context context = this.f;
            if (cpga.g(context)) {
                ekgb ekgbVarB = b(this.p);
                StringBuilder sb = new StringBuilder();
                int i2 = ((ekoe) ekgbVarB).c;
                for (int i3 = 0; i3 < i2; i3++) {
                    MenuItem menuItem2 = (MenuItem) ekgbVarB.get(i3);
                    if (menuItem2.isVisible()) {
                        sb.append(menuItem2.getTitle());
                        sb.append(" ");
                    }
                }
                String string = context.getResources().getString(R.string.contextual_action_bar_description_prefix, sb.toString());
                if (cpga.f(context)) {
                    toastMakeText = Toast.makeText(context, string, 0);
                    toastMakeText.show();
                } else {
                    toastMakeText = null;
                }
                if (toastMakeText != null && (toast = this.v) != null) {
                    toast.cancel();
                }
                this.v = toastMakeText;
            }
        }
    }

    public final int a() {
        return this.a.d;
    }

    /* JADX WARN: Multi-variable type inference failed */
    final ekgb b(final Menu menu) {
        int i = ekgb.d;
        final ekfw ekfwVar = new ekfw();
        ekgb ekgbVar = e;
        int i2 = ((ekoe) ekgbVar).c;
        for (int i3 = 0; i3 < i2; i3++) {
            MenuItem menuItemFindItem = menu.findItem(((Integer) ekgbVar.get(i3)).intValue());
            if (menuItemFindItem != null) {
                ekfwVar.h(menuItemFindItem);
            }
        }
        this.j.ifPresent(new Consumer() { // from class: cwvr
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void z(Object obj) {
                ekgb ekgbVar2 = ((adba) obj).a;
                int i4 = cwvv.d;
                Stream stream = Collection.EL.stream(ekgbVar2);
                final Menu menu2 = menu;
                final ekfw ekfwVar2 = ekfwVar;
                stream.forEach(new Consumer() { // from class: cwvq
                    @Override // java.util.function.Consumer
                    /* renamed from: accept */
                    public final void z(Object obj2) {
                        int i5 = cwvv.d;
                        MenuItem menuItemFindItem2 = menu2.findItem(((aday) obj2).a());
                        if (menuItemFindItem2 != null) {
                            ekfwVar2.h(menuItemFindItem2);
                        }
                    }

                    public final /* synthetic */ Consumer andThen(Consumer consumer) {
                        return Consumer$CC.$default$andThen(this, consumer);
                    }
                });
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
        return ekfwVar.g();
    }

    public final void c(boolean z, View view) {
        Resources resources = this.f.getResources();
        cpga.h(view, z ? resources.getString(R.string.action_selected) : resources.getString(R.string.action_unselected));
    }

    public final void d() throws Resources.NotFoundException {
        if (this.a.isEmpty()) {
            ((acrt) this.k).o();
        } else {
            f();
        }
    }

    public final boolean e(ConversationIdType conversationIdType) {
        return this.a.containsKey(conversationIdType);
    }

    @Override // android.view.ActionMode.Callback
    public final boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
        eiju eijuVarG;
        int itemId = menuItem.getItemId();
        if (itemId == R.id.action_delete) {
            cwvu cwvuVar = this.k;
            java.util.Collection collectionValues = this.a.values();
            acrt acrtVar = (acrt) cwvuVar;
            acom acomVar = acrtVar.b;
            if (!craf.j(acomVar.A())) {
                ((dakl) acrtVar.M.b()).p(R.string.sms_disallowed_message);
            } else if (!acrtVar.k.G()) {
                ekrw ekrwVarJ = acrt.a.j();
                ekrwVarJ.X(eksq.a, "HomeFragmentFlogger");
                ((ekrd) ((ekrd) ekrwVarJ).h("com/google/android/apps/messaging/home/HomeFragmentPeer", "onActionBarDelete", 2529, "HomeFragmentPeer.java")).q("Can't delete messages when it's not default sms app");
            } else if (acomVar.Q == null) {
                ekrw ekrwVarJ2 = acrt.a.j();
                ekrwVarJ2.X(eksq.a, "HomeFragmentFlogger");
                ((ekrd) ((ekrd) ekrwVarJ2).h("com/google/android/apps/messaging/home/HomeFragmentPeer", "onActionBarDelete", 2534, "HomeFragmentPeer.java")).q("Can't show the dialog since the fragment doesn't have a view");
            } else {
                ((aays) acrtVar.L.b()).a(acrt.f(acomVar), collectionValues, elka.CONVERSATION_FROM_LIST, new acoy(acrtVar));
            }
            return true;
        }
        if (itemId == R.id.action_archive) {
            this.k.q(this.a.values(), true);
            return true;
        }
        if (itemId == R.id.action_unarchive) {
            this.k.q(this.a.values(), false);
            return true;
        }
        aday adayVar = null;
        if (itemId == R.id.action_add_contact) {
            csq csqVar = this.a;
            int i = csqVar.d;
            ejwl.m(i == 1, String.format("Attempted to execute add contact action when the number of selected messages is %d.", Integer.valueOf(i)));
            cwvu cwvuVar2 = this.k;
            SelectedConversation selectedConversation = (SelectedConversation) csqVar.g(0);
            String str = selectedConversation.j;
            if (str != null) {
                Uri.parse(str);
            }
            String str2 = selectedConversation.k;
            acrt acrtVar2 = (acrt) cwvuVar2;
            ((avbr) acrtVar2.J.b()).f(acrtVar2.b.N(), -1L, null, -1L, str2 != null ? ((alrj) acrtVar2.ah.b()).u(str2, selectedConversation.p) : null, 3);
            acrtVar2.o();
            return true;
        }
        if (itemId == R.id.action_block) {
            csq csqVar2 = this.a;
            int i2 = csqVar2.d;
            ejwl.m(i2 == 1, String.format("Attempted to execute block action when the number of selected messages is %d.", Integer.valueOf(i2)));
            cwvu cwvuVar3 = this.k;
            SelectedConversation selectedConversation2 = (SelectedConversation) csqVar2.g(0);
            final String str3 = selectedConversation2.k;
            if (str3 == null) {
                eijuVarG = eijx.e(null);
            } else {
                final acut acutVar = (acut) ((acrt) cwvuVar3).D;
                eijuVarG = eijx.g(new Callable() { // from class: acul
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        return ((bbca) acutVar.d.b()).d(str3);
                    }
                }, acutVar.a);
            }
            acrt acrtVar3 = (acrt) cwvuVar3;
            acrtVar3.C.h(new egpq(eijuVarG), new egpo(selectedConversation2), acrtVar3.ay);
            return true;
        }
        if (itemId == R.id.action_report_spam) {
            csq csqVar3 = this.a;
            int i3 = csqVar3.d;
            ejwl.m(i3 == 1, String.format("Attempted to execute report spam action when the number of selected messages is %d.", Integer.valueOf(i3)));
            cwvu cwvuVar4 = this.k;
            SelectedConversation selectedConversation3 = (SelectedConversation) csqVar3.g(0);
            acrt acrtVar4 = (acrt) cwvuVar4;
            acrtVar4.C.h(new egpq(((cpkp) ((acut) acrtVar4.D).g.b()).a(selectedConversation3.a)), new egpo(selectedConversation3), acrtVar4.az);
            return true;
        }
        if (itemId == 16908332) {
            ((acrt) this.k).o();
            return true;
        }
        Optional optional = this.j;
        if (optional.isPresent()) {
            ekgb ekgbVar = ((adba) optional.get()).a;
            int size = ekgbVar.size();
            int i4 = 0;
            while (true) {
                if (i4 >= size) {
                    break;
                }
                aday adayVar2 = (aday) ekgbVar.get(i4);
                i4++;
                if (itemId == adayVar2.a()) {
                    adayVar = adayVar2;
                    break;
                }
            }
            if (adayVar != null) {
                adayVar.c(this.a.values());
                ((acrt) this.k).o();
                return true;
            }
        }
        return false;
    }

    @Override // android.view.ActionMode.Callback
    public final boolean onCreateActionMode(ActionMode actionMode, final Menu menu) throws Resources.NotFoundException {
        Context context = this.f;
        if ((context instanceof cukf) && ((cukf) context).K()) {
            actionMode.getMenuInflater().inflate(R.menu.conversation_list_fragment_select_menu_action_mode_v2, menu);
        } else {
            actionMode.getMenuInflater().inflate(R.menu.conversation_list_fragment_select_menu, menu);
        }
        this.p = menu;
        this.q = menu.findItem(R.id.action_archive);
        this.r = menu.findItem(R.id.action_unarchive);
        this.s = menu.findItem(R.id.action_add_contact);
        this.t = menu.findItem(R.id.action_block);
        this.u = menu.findItem(R.id.action_report_spam);
        this.j.ifPresent(new Consumer() { // from class: cwvt
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void z(Object obj) {
                ekgb ekgbVar = ((adba) obj).a;
                int i = cwvv.d;
                Stream stream = Collection.EL.stream(ekgbVar);
                final Menu menu2 = menu;
                stream.forEach(new Consumer() { // from class: cwvs
                    @Override // java.util.function.Consumer
                    /* renamed from: accept */
                    public final void z(Object obj2) {
                        int i2 = cwvv.d;
                        ((aday) obj2).b(menu2);
                    }

                    public final /* synthetic */ Consumer andThen(Consumer consumer) {
                        return Consumer$CC.$default$andThen(this, consumer);
                    }
                });
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
        ekgb ekgbVarB = b(menu);
        if (!((asgn) this.n.b()).a()) {
            this.c = eehg.d(context, R.attr.colorPrimaryBrandIcon, "MultiSelectActionModeCallback");
            ekqh it = ekgbVarB.iterator();
            while (it.hasNext()) {
                MenuItem menuItem = (MenuItem) it.next();
                if (((apuw) this.l.b()).a()) {
                    menuItem.setIconTintList(ColorStateList.valueOf(this.c));
                } else {
                    Drawable icon = menuItem.getIcon();
                    if (icon != null) {
                        icon.setTint(this.c);
                    }
                }
            }
        }
        actionMode.getCustomView();
        this.o = true;
        f();
        return true;
    }

    @Override // android.view.ActionMode.Callback
    public final void onDestroyActionMode(ActionMode actionMode) {
        this.a.clear();
        this.o = false;
        ((acrt) this.k).o();
    }

    @Override // android.view.ActionMode.Callback
    public final boolean onPrepareActionMode(ActionMode actionMode, Menu menu) {
        return true;
    }
}
