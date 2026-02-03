package defpackage;

import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.main.MainActivity;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class afjb implements efzm {
    final /* synthetic */ afjl a;

    public afjb(afjl afjlVar) {
        this.a = afjlVar;
    }

    private final void e(int i) {
        afjl afjlVar = this.a;
        int i2 = i - 1;
        ((adas) afjlVar.o.b()).c.set(i2);
        ((uld) afjlVar.p.b()).a.set(i2);
    }

    @Override // defpackage.efzm
    public final void a(efzk efzkVar) {
        ea eaVarD;
        afjl afjlVar = this.a;
        cqce cqceVar = afjlVar.z;
        cqceVar.p("onAccountChanged called");
        auvh.h(((auwu) afjlVar.r.b()).a("MainActivityPeerAccountUiCallbacks#onAccountChanged"));
        afjlVar.l.c = null;
        e(2);
        if (afjlVar.n().e()) {
            ((ajfo) afjlVar.e.b()).e(ajfo.p);
        }
        cqceVar.p("Attaching newConversationListRootFragment");
        efwo efwoVarA = efzkVar.a();
        efwoVarA.getClass();
        acnt acntVar = new acnt();
        eyhj.e(acntVar);
        ehok.b(acntVar, efwoVarA);
        MainActivity mainActivity = afjlVar.b;
        cg cgVar = new cg(mainActivity.a());
        cgVar.x(R.id.conversation_list_root_container, acntVar, "conversation_list_root_fragment_tag");
        cgVar.c();
        cqceVar.p("Attaching newConversationRootFragment");
        efwo efwoVarA2 = efzkVar.a();
        efwoVarA2.getClass();
        afjlVar.C();
        vds vdsVar = new vds();
        eyhj.e(vdsVar);
        ehok.b(vdsVar, efwoVarA2);
        cg cgVar2 = new cg(mainActivity.a());
        cgVar2.x(R.id.conversation_root_container, vdsVar, "conversation_root_fragment_tag");
        cgVar2.c();
        if (!((crnp) afjlVar.n.b()).d() && afjlVar.n().c()) {
            afjlVar.n().a = 0;
        }
        afjlVar.D();
        if (cpyl.a() && fdbq.f(efzkVar.b(), "pseudonymous") && (eaVarD = afjlVar.d()) != null) {
            ((Optional) ((eyig) ((acrt) ehle.a(eaVarD)).au).a).ifPresent(new Consumer() { // from class: acov
                @Override // java.util.function.Consumer
                /* renamed from: accept */
                public final void z(Object obj) {
                    ((tmq) obj).b();
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
        }
        ((afjt) afjlVar.t.b()).b = true;
    }

    @Override // defpackage.efzm
    public final void b() {
        this.a.z.p("onAccountLoading called");
        e(4);
    }

    @Override // defpackage.efzm
    public final void c(efyg efygVar) {
        afjl afjlVar = this.a;
        afjlVar.z.p("onAccountError called");
        e(3);
        ((abxv) afjlVar.i.b()).a(efygVar);
    }

    @Override // defpackage.efzm
    public final void d() {
        afjl afjlVar = this.a;
        ((aisx) afjlVar.v.b()).b(afjlVar.b, 184226);
    }
}
