package defpackage;

import android.view.View;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.api.messaging.Conversation;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class agwh implements agwd {
    public static final ekrg a = ekrg.c("com/google/android/apps/messaging/penpal/entrypoint/PenpalEntryPointImpl");
    public final fcsu b;
    public acop c;
    public fdae d;
    public boolean e;
    public boolean f;
    private final egpr g;
    private final ehbb h;
    private final eigp i;
    private final Optional j;
    private final fcsu k;
    private final fcsu l;
    private final fcsu m;
    private final fcsu n;
    private FloatingActionButton o;
    private final AnonymousClass1 p;
    private final agwi q;

    /* JADX WARN: Type inference failed for: r1v2, types: [agwh$1] */
    public agwh(egpr egprVar, ehbb ehbbVar, eigp eigpVar, Optional optional, fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3, fcsu fcsuVar4, fcsu fcsuVar5) {
        egprVar.getClass();
        ehbbVar.getClass();
        eigpVar.getClass();
        optional.getClass();
        fcsuVar.getClass();
        fcsuVar2.getClass();
        fcsuVar3.getClass();
        fcsuVar5.getClass();
        this.g = egprVar;
        this.h = ehbbVar;
        this.i = eigpVar;
        this.j = optional;
        this.k = fcsuVar;
        this.l = fcsuVar2;
        this.m = fcsuVar3;
        this.n = fcsuVar4;
        this.b = fcsuVar5;
        this.d = new fdae() { // from class: agwe
            @Override // defpackage.fdae
            public final Object invoke() {
                return fctx.a;
            }
        };
        this.p = new egps<Void, Conversation>() { // from class: agwh.1
            @Override // defpackage.egps
            public final /* bridge */ /* synthetic */ void c(Object obj, Object obj2) {
                Conversation conversation = (Conversation) obj2;
                conversation.getClass();
                agwh agwhVar = agwh.this;
                acop acopVar = agwhVar.c;
                if (acopVar == null) {
                    ((ekrd) agwh.a.j().h("com/google/android/apps/messaging/penpal/entrypoint/PenpalEntryPointImpl$launchConversationCallback$1", "onSuccess", 64, "PenpalEntryPointImpl.kt")).q("Failed to launch penpal chat, host is null");
                    return;
                }
                acopVar.k(conversation.d(), null);
                agxy agxyVar = (agxy) agwhVar.b.b();
                encu encuVar = (encu) encw.a.createBuilder();
                encuVar.getClass();
                envz.b(4, encuVar);
                agxyVar.a(envz.a(encuVar));
            }

            @Override // defpackage.egps
            public final /* bridge */ /* synthetic */ void f(Object obj, Throwable th) {
                ((ekrd) ((ekrd) agwh.a.j()).g(th).h("com/google/android/apps/messaging/penpal/entrypoint/PenpalEntryPointImpl$launchConversationCallback$1", "onFailure", 69, "PenpalEntryPointImpl.kt")).q("Failed to get the launch conversation callback");
            }

            @Override // defpackage.egps
            public final /* synthetic */ void b(Object obj) {
            }
        };
        this.q = new agwi(this);
    }

    public static final Boolean h() {
        return (Boolean) ((cczi) crbf.ak.get()).e();
    }

    @Override // defpackage.agwd
    public final void a() {
        FloatingActionButton floatingActionButton = this.o;
        if (floatingActionButton != null) {
            floatingActionButton.d(true);
        }
    }

    @Override // defpackage.agwd
    public final void b(View view, final Runnable runnable, final fdae fdaeVar) {
        FloatingActionButton floatingActionButton;
        if (this.o == null) {
            FloatingActionButton floatingActionButton2 = (FloatingActionButton) view.findViewById(R.id.penpal_fab);
            this.o = floatingActionButton2;
            if (floatingActionButton2 != null) {
                floatingActionButton2.setImageResource(R.drawable.gemini_spark_filled);
            }
            FloatingActionButton floatingActionButton3 = this.o;
            if (floatingActionButton3 != null) {
                cgsa cgsaVar = (cgsa) fdct.b(this.j);
                floatingActionButton3.setContentDescription(cgsaVar != null ? cgsaVar.s() : "");
            }
            if (runnable != null && (floatingActionButton = this.o) != null) {
                floatingActionButton.setOnClickListener(new eifs(this.i, "", "", 0, "penpalFab#onClick", new View.OnClickListener() { // from class: agwg
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        runnable.run();
                    }
                }));
            }
        }
        if (!((Boolean) ((cczi) crbf.ak.get()).e()).booleanValue()) {
            fdaeVar.invoke();
            return;
        }
        this.d = new fdae() { // from class: agwf
            @Override // defpackage.fdae
            public final Object invoke() {
                fdaeVar.invoke();
                this.e = true;
                return fctx.a;
            }
        };
        if (this.e) {
            return;
        }
        fdaeVar.invoke();
        this.e = true;
    }

    @Override // defpackage.agwd
    public final void c(acop acopVar) {
        egpq egpqVar = new egpq(((ajln) this.m.b()).o(Optional.empty(), ekgb.r(((anty) this.l.b()).h(((alrj) this.k.b()).v())), null));
        this.c = acopVar;
        this.g.h(egpqVar, new egpo(null), this.p);
    }

    @Override // defpackage.agwd
    public final void d(acop acopVar) {
        this.c = acopVar;
        this.g.j(this.p);
        this.h.g(R.id.penpal_entry_point_setting, ((cgte) this.n.b()).a(), this.q);
    }

    @Override // defpackage.agwd
    public final void e() {
        FloatingActionButton floatingActionButton = this.o;
        if (floatingActionButton != null) {
            floatingActionButton.e(true);
        }
    }

    @Override // defpackage.agwd
    public final /* bridge */ /* synthetic */ boolean f() {
        return h().booleanValue();
    }

    @Override // defpackage.agwd
    public final boolean g() {
        return h().booleanValue() && this.f;
    }
}
