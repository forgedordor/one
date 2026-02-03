package defpackage;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.view.Menu;
import android.view.MenuItem;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.home.select.SelectedConversation;
import com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversationId;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cwxf implements aday {
    public static final eksp a = eksp.c("Bugle");
    public final eigp b;
    public final fcsu c;
    public final fdjx d;
    public final ains e;
    public final egpr f;
    public final AnonymousClass1 g;
    private final Context h;
    private final fcsu i;
    private final arfn j;
    private final arpr k;
    private MenuItem l;
    private fdap m;

    /* JADX WARN: Type inference failed for: r1v1, types: [cwxf$1] */
    public cwxf(Context context, eigp eigpVar, fcsu fcsuVar, fdjx fdjxVar, ains ainsVar, fcsu fcsuVar2, egpr egprVar, arfn arfnVar, arpr arprVar) {
        eigpVar.getClass();
        fcsuVar.getClass();
        fdjxVar.getClass();
        ainsVar.getClass();
        egprVar.getClass();
        arprVar.getClass();
        this.h = context;
        this.b = eigpVar;
        this.c = fcsuVar;
        this.d = fdjxVar;
        this.e = ainsVar;
        this.i = fcsuVar2;
        this.f = egprVar;
        this.j = arfnVar;
        this.k = arprVar;
        this.g = new egps<Void, Boolean>() { // from class: cwxf.1
            @Override // defpackage.egps
            public final /* bridge */ /* synthetic */ void c(Object obj, Object obj2) {
                if (((Boolean) obj2).booleanValue()) {
                    return;
                }
                cwxf.this.g();
            }

            @Override // defpackage.egps
            public final /* bridge */ /* synthetic */ void f(Object obj, Throwable th) {
                ((eksl) ((eksl) cwxf.a.j()).g(th)).q("Failed to leave conversations.");
                cwxf.this.g();
            }

            @Override // defpackage.egps
            public final /* synthetic */ void b(Object obj) {
            }
        };
    }

    @Override // defpackage.aday
    public final int a() {
        return R.id.action_leave_group;
    }

    @Override // defpackage.aday
    public final void b(Menu menu) {
        menu.getClass();
        if (this.k.a() || ((eoth) ((arev) this.j).a.b()).a("bugle.disable_leave_group_extension")) {
            return;
        }
        MenuItem menuItemAdd = menu.add(0, R.id.action_leave_group, 150, this.h.getString(R.string.action_leave_group));
        menuItemAdd.setShowAsAction(0);
        menuItemAdd.setEnabled(false);
        menuItemAdd.setVisible(false);
        this.l = menuItemAdd;
    }

    @Override // defpackage.aday
    public final void c(Collection collection) {
        eksp ekspVar = a;
        ekspVar.n().r("%d conversations selected for leave", collection.size());
        ArrayList arrayList = new ArrayList();
        for (Object obj : collection) {
            if (cwxe.a((SelectedConversation) obj)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : arrayList) {
            if (((SelectedConversation) obj2).s == 0) {
                arrayList2.add(obj2);
            }
        }
        final ArrayList arrayList3 = new ArrayList(fcva.p(arrayList2, 10));
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            arrayList3.add(new BugleConversationId(((SelectedConversation) it.next()).a));
        }
        if (arrayList3.isEmpty()) {
            ((eksl) ekspVar.j()).q("No RCS group conversations to leave.");
            return;
        }
        boolean z = arrayList3.size() == 1;
        AlertDialog.Builder negativeButton = new AlertDialog.Builder(this.h).setTitle(z ? R.string.leave_menu_leave_confirmation_title_single : R.string.leave_menu_leave_confirmation_title_multiple).setMessage(true != z ? R.string.leave_menu_leave_confirmation_text_multiple : R.string.leave_menu_leave_confirmation_text_single).setPositiveButton(R.string.dialog_confirm, new DialogInterface.OnClickListener() { // from class: cwxb
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) throws IOException {
                cwxf cwxfVar = this.a;
                eigp eigpVar = cwxfVar.b;
                List list = arrayList3;
                eieh eiehVarA = eigpVar.a("LeaveGroupMenuExtension#onDialogConfirm");
                try {
                    egpr egprVar = cwxfVar.f;
                    fdjx fdjxVar = cwxfVar.d;
                    fcyi fcyiVar = fcyi.a;
                    egprVar.g(new egpq(fdxs.b(fdjxVar, eicg.a(fcyiVar), fdjz.a, new cwxg(null, cwxfVar, list))), cwxfVar.g);
                    fczl.a(eiehVarA, null);
                } finally {
                }
            }
        }).setNegativeButton(R.string.dialog_cancel, new DialogInterface.OnClickListener() { // from class: cwxc
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                cwxf.a.n().q("Leave group dialog cancel pressed");
            }
        });
        negativeButton.getClass();
        ((eksl) ekspVar.h()).q("Asking user to confirm leaving groups");
        negativeButton.show();
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x002c  */
    @Override // defpackage.aday
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d(java.util.Collection r6) {
        /*
            r5 = this;
            android.view.MenuItem r0 = r5.l
            if (r0 != 0) goto L5
            return
        L5:
            boolean r1 = r6.isEmpty()
            r2 = 1
            r3 = 0
            if (r1 == 0) goto Le
            goto L25
        Le:
            java.util.Iterator r1 = r6.iterator()
        L12:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L25
            java.lang.Object r4 = r1.next()
            com.google.android.apps.messaging.home.select.SelectedConversation r4 = (com.google.android.apps.messaging.home.select.SelectedConversation) r4
            boolean r4 = defpackage.cwxe.a(r4)
            if (r4 != 0) goto L12
            goto L41
        L25:
            boolean r1 = r6.isEmpty()
            if (r1 == 0) goto L2c
            goto L41
        L2c:
            java.util.Iterator r1 = r6.iterator()
        L30:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L41
            java.lang.Object r4 = r1.next()
            com.google.android.apps.messaging.home.select.SelectedConversation r4 = (com.google.android.apps.messaging.home.select.SelectedConversation) r4
            int r4 = r4.s
            if (r4 != 0) goto L30
            r3 = r2
        L41:
            int r6 = r6.size()
            if (r6 <= r2) goto L51
            android.content.Context r6 = r5.h
            r1 = 2132082787(0x7f150063, float:1.9805698E38)
            java.lang.String r6 = r6.getString(r1)
            goto L5a
        L51:
            android.content.Context r6 = r5.h
            r1 = 2132082786(0x7f150062, float:1.9805696E38)
            java.lang.String r6 = r6.getString(r1)
        L5a:
            r6.getClass()
            r0.setEnabled(r3)
            r0.setVisible(r3)
            r0.setTitle(r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cwxf.d(java.util.Collection):void");
    }

    @Override // defpackage.aday
    public final void e(final ea eaVar) {
        this.m = new fdap() { // from class: cwxd
            @Override // defpackage.fdap
            public final Object invoke(Object obj) {
                ctey cteyVar = (ctey) obj;
                eksp ekspVar = cwxf.a;
                cteyVar.getClass();
                einf.f(cteyVar, eaVar);
                return fctx.a;
            }
        };
        this.f.j(this.g);
    }

    public final void g() {
        fdap fdapVar = this.m;
        if (fdapVar == null) {
            fdbq.c("snackbarEventSender");
            fdapVar = null;
        }
        Context context = this.h;
        fdapVar.invoke(new ctex(context.getString(R.string.leave_groups_failure_snackbar_message), context.getString(R.string.leave_groups_failure_snackbar_action_label), new Runnable() { // from class: cwxa
            @Override // java.lang.Runnable
            public final void run() {
                eksp ekspVar = cwxf.a;
            }
        }));
        acns acnsVar = (acns) this.i.b();
        String string = context.getString(R.string.leave_groups_failure_snackbar_message);
        string.getClass();
        acnsVar.a(string);
    }

    @Override // defpackage.aday
    public final /* synthetic */ void f() {
    }
}
