package defpackage;

import android.content.Context;
import android.content.DialogInterface;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.RadioGroup;
import androidx.core.widget.NestedScrollView;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.home.select.SelectedConversation;
import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;
import java.util.Collection;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class agjl implements aday {
    public static final eksp a = eksp.c("Bugle");
    public final fcsu b;
    public final fdjx c;
    public final egpr d;
    public final fcsu e;
    public cgra f;
    public boolean g;
    public final AnonymousClass1 h;
    private final Context i;
    private final eigp j;
    private final fcsu k;
    private final ardn l;
    private final arpr m;
    private MenuItem n;
    private fdap o;
    private final AnonymousClass2 p;

    /* JADX WARN: Type inference failed for: r1v3, types: [agjl$1] */
    /* JADX WARN: Type inference failed for: r1v4, types: [agjl$2] */
    public agjl(Context context, eigp eigpVar, fcsu fcsuVar, fdjx fdjxVar, fcsu fcsuVar2, egpr egprVar, ardn ardnVar, arpr arprVar, fcsu fcsuVar3) {
        eigpVar.getClass();
        fcsuVar.getClass();
        fdjxVar.getClass();
        egprVar.getClass();
        ardnVar.getClass();
        arprVar.getClass();
        this.i = context;
        this.j = eigpVar;
        this.b = fcsuVar;
        this.c = fdjxVar;
        this.k = fcsuVar2;
        this.d = egprVar;
        this.l = ardnVar;
        this.m = arprVar;
        this.e = fcsuVar3;
        this.f = cgra.c;
        this.g = true;
        this.h = new egps<Void, Boolean>() { // from class: agjl.1
            @Override // defpackage.egps
            public final /* bridge */ /* synthetic */ void c(Object obj, Object obj2) {
                if (((Boolean) obj2).booleanValue()) {
                    return;
                }
                agjl.this.g();
            }

            @Override // defpackage.egps
            public final /* bridge */ /* synthetic */ void f(Object obj, Throwable th) {
                ((eksl) ((eksl) agjl.a.j()).g(th)).q("Failed to snooze conversations.");
                agjl.this.g();
            }

            @Override // defpackage.egps
            public final /* synthetic */ void b(Object obj) {
            }
        };
        this.p = new egps<Void, Boolean>() { // from class: agjl.2
            @Override // defpackage.egps
            public final /* bridge */ /* synthetic */ void c(Object obj, Object obj2) {
                if (!((Boolean) obj2).booleanValue()) {
                    agjl.this.g();
                }
                ((aghz) agjl.this.e.b()).d(1);
            }

            @Override // defpackage.egps
            public final /* bridge */ /* synthetic */ void f(Object obj, Throwable th) {
                ((eksl) ((eksl) agjl.a.j()).g(th)).q("Failed to un-snooze conversation.");
                agjl.this.g();
            }

            @Override // defpackage.egps
            public final /* synthetic */ void b(Object obj) {
            }
        };
    }

    @Override // defpackage.aday
    public final int a() {
        return R.id.action_snooze;
    }

    @Override // defpackage.aday
    public final void b(Menu menu) {
        menu.getClass();
        if (this.m.a()) {
            MenuItem menuItemAdd = menu.add(0, R.id.action_snooze, 45, this.i.getString(R.string.action_snooze));
            menuItemAdd.setShowAsAction(2);
            menuItemAdd.setIcon(R.drawable.gs_snooze_vd_theme_24);
            this.n = menuItemAdd;
        }
    }

    @Override // defpackage.aday
    public final void c(Collection collection) {
        eeji eejiVar;
        SelectedConversation selectedConversation = (SelectedConversation) fcva.O(collection);
        if (selectedConversation == null) {
            return;
        }
        cgrc cgrcVar = selectedConversation.v;
        final ConversationId conversationId = selectedConversation.b;
        cgrc cgrcVar2 = cgrc.b;
        if (cgrcVar != cgrcVar2) {
            this.d.g(new egpq(((ajln) this.b.b()).t(conversationId, cgrcVar2, cgra.e)), this.p);
            return;
        }
        ((aghz) this.e.b()).c(1);
        Context context = this.i;
        View viewInflate = LayoutInflater.from(context).inflate(R.layout.dialog_snooze, (ViewGroup) null);
        RadioGroup radioGroup = (RadioGroup) viewInflate.findViewById(R.id.radioGroupSnoozeOptions);
        radioGroup.check(R.id.radioButton8Hours);
        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() { // from class: agje
            @Override // android.widget.RadioGroup.OnCheckedChangeListener
            public final void onCheckedChanged(RadioGroup radioGroup2, int i) {
                radioGroup2.getClass();
                this.a.f = i == R.id.radioButton1Hour ? cgra.b : i == R.id.radioButton8Hours ? cgra.c : i == R.id.radioButton24Hours ? cgra.d : cgra.e;
            }
        });
        CheckBox checkBox = (CheckBox) viewInflate.findViewById(R.id.checkBoxMuteException);
        ardn ardnVar = this.l;
        if (!ardnVar.a()) {
            checkBox.setVisibility(8);
        }
        boolean z = false;
        if (this.g && ardnVar.a()) {
            z = true;
        }
        checkBox.setChecked(z);
        checkBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: agjf
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z2) {
                compoundButton.getClass();
                this.a.g = z2;
            }
        });
        if (context.getResources().getConfiguration().orientation == 2) {
            eejiVar = new eeji(context);
            int iApplyDimension = (int) TypedValue.applyDimension(1, 46.0f, context.getResources().getDisplayMetrics());
            NestedScrollView nestedScrollView = (NestedScrollView) viewInflate.findViewById(R.id.scrollViewSnoozeOptions);
            ViewGroup.LayoutParams layoutParams = nestedScrollView.getLayoutParams();
            layoutParams.getClass();
            kte kteVar = (kte) layoutParams;
            kteVar.U = iApplyDimension;
            nestedScrollView.setLayoutParams(kteVar);
        } else {
            eejiVar = new eeji(context, R.style.ThemeOverlay_Material3_MaterialAlertDialog_Centered);
        }
        eejiVar.a.c = R.drawable.gs_snooze_vd_theme_24;
        eejiVar.u(R.string.snooze_dialog_title);
        eejiVar.k(R.string.snooze_dialog_message);
        eejiVar.w(viewInflate);
        eigp eigpVar = this.j;
        eejiVar.r(R.string.dialog_snooze_confirm, new eigf(eigpVar, "", "", 0, "Snooze Menu Extension - Snooze button", new DialogInterface.OnClickListener() { // from class: agjg
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.dismiss();
                ConversationId conversationId2 = conversationId;
                conversationId2.getClass();
                agjl agjlVar = this.a;
                cgra cgraVar = agjlVar.f;
                boolean z2 = agjlVar.g;
                fcyi fcyiVar = fcyi.a;
                fdjz fdjzVar = fdjz.a;
                agjlVar.d.g(new egpq(fdxs.b(agjlVar.c, eicg.a(fcyiVar), fdjzVar, new agjk(null, agjlVar, conversationId2, z2, cgraVar))), agjlVar.h);
            }
        }));
        eejiVar.m(R.string.snooze_cancel_button, new eigf(eigpVar, "", "", 0, "Snooze Menu Extension - Cancel button", new DialogInterface.OnClickListener() { // from class: agjh
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.dismiss();
                agjl.a.n().q("Snooze cancel pressed");
                ((aghz) this.a.e.b()).b(1);
            }
        }));
        eejiVar.a();
    }

    @Override // defpackage.aday
    public final void d(Collection collection) {
        if (!this.m.a() || collection.size() != 1) {
            MenuItem menuItem = this.n;
            if (menuItem != null) {
                menuItem.setVisible(false);
                return;
            }
            return;
        }
        MenuItem menuItem2 = this.n;
        if (menuItem2 != null) {
            menuItem2.setEnabled(true);
            menuItem2.setVisible(true);
            menuItem2.setTitle(this.i.getString(R.string.action_snooze));
            menuItem2.setIcon(R.drawable.gs_snooze_vd_theme_24);
        }
    }

    @Override // defpackage.aday
    public final void e(final ea eaVar) {
        this.o = new fdap() { // from class: agjj
            @Override // defpackage.fdap
            public final Object invoke(Object obj) {
                ctey cteyVar = (ctey) obj;
                eksp ekspVar = agjl.a;
                cteyVar.getClass();
                einf.f(cteyVar, eaVar);
                return fctx.a;
            }
        };
        egpr egprVar = this.d;
        egprVar.j(this.h);
        egprVar.j(this.p);
    }

    public final void g() {
        fdap fdapVar = this.o;
        if (fdapVar == null) {
            fdbq.c("snackbarEventSender");
            fdapVar = null;
        }
        Context context = this.i;
        fdapVar.invoke(new ctex(context.getString(R.string.snooze_failure_snackbar_message), context.getString(R.string.snooze_failure_snackbar_action_label), new Runnable() { // from class: agji
            @Override // java.lang.Runnable
            public final void run() {
                eksp ekspVar = agjl.a;
            }
        }));
        acns acnsVar = (acns) this.k.b();
        String string = context.getString(R.string.snooze_failure_snackbar_message_alternative);
        string.getClass();
        acnsVar.a(string);
    }

    @Override // defpackage.aday
    public final /* synthetic */ void f() {
    }
}
