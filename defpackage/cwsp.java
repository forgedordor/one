package defpackage;

import android.content.Context;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cwsp implements cwqx {
    public final Context a;
    public final fcyh b;
    public final fcsu c;
    public final Optional d;
    public final fcsu e;
    public final dzuc f;
    public final fcsu g;
    public final fcsu h;
    public final fcsu i;
    public final fcsu j;
    public final fcsu k;
    public final fcsu l;
    public final cqce m;
    private final fdjx n;

    public cwsp(Context context, fdjx fdjxVar, fcyh fcyhVar, fcsu fcsuVar, Optional optional, fcsu fcsuVar2, dzuc dzucVar, fcsu fcsuVar3, fcsu fcsuVar4, fcsu fcsuVar5, fcsu fcsuVar6, fcsu fcsuVar7, fcsu fcsuVar8) {
        context.getClass();
        fdjxVar.getClass();
        fcyhVar.getClass();
        fcsuVar2.getClass();
        dzucVar.getClass();
        fcsuVar3.getClass();
        fcsuVar6.getClass();
        fcsuVar7.getClass();
        this.a = context;
        this.n = fdjxVar;
        this.b = fcyhVar;
        this.c = fcsuVar;
        this.d = optional;
        this.e = fcsuVar2;
        this.f = dzucVar;
        this.g = fcsuVar3;
        this.h = fcsuVar4;
        this.i = fcsuVar5;
        this.j = fcsuVar6;
        this.k = fcsuVar7;
        this.l = fcsuVar8;
        this.m = cqce.f("BuglePenpal", cwsp.class);
    }

    @Override // defpackage.cwqx
    public final void a(final ConversationIdType conversationIdType, final fdap fdapVar) {
        final dofb dofbVar = (dofb) this.k.b();
        dofbVar.a();
        dofbVar.m();
        dofbVar.h(new fdae() { // from class: cwra
            @Override // defpackage.fdae
            public final Object invoke() {
                dofbVar.a();
                cwsp cwspVar = this;
                cwspVar.b(conversationIdType, fdapVar);
                Optional optional = (Optional) cwspVar.h.b();
                final fdap fdapVar2 = new fdap() { // from class: cwqy
                    @Override // defpackage.fdap
                    public final Object invoke(Object obj) {
                        uzw uzwVar = (uzw) obj;
                        uzwVar.getClass();
                        uzwVar.h();
                        return fctx.a;
                    }
                };
                optional.ifPresent(new Consumer() { // from class: cwqz
                    @Override // java.util.function.Consumer
                    /* renamed from: accept */
                    public final void z(Object obj) {
                        fdapVar2.invoke(obj);
                    }

                    public final /* synthetic */ Consumer andThen(Consumer consumer) {
                        return Consumer$CC.$default$andThen(this, consumer);
                    }
                });
                return fctx.a;
            }
        });
        dofbVar.q(new fdae() { // from class: cwrb
            @Override // defpackage.fdae
            public final Object invoke() {
                cwsp cwspVar = this.a;
                ((dakl) cwspVar.j.b()).p(R.string.feedback_confirmation);
                fcsu fcsuVar = cwspVar.h;
                if (((Optional) fcsuVar.b()).isPresent()) {
                    ((uzw) ((Optional) fcsuVar.b()).get()).l();
                }
                return fctx.a;
            }
        });
        dofbVar.p(new fdae() { // from class: cwrc
            @Override // defpackage.fdae
            public final Object invoke() {
                cwsp cwspVar = this.a;
                fcsu fcsuVar = cwspVar.h;
                if (((Optional) fcsuVar.b()).isPresent()) {
                    ((uzw) ((Optional) fcsuVar.b()).get()).j();
                }
                fcsu fcsuVar2 = cwspVar.i;
                if (((Optional) fcsuVar2.b()).isPresent()) {
                    ((uvd) ((Optional) fcsuVar2.b()).get()).a();
                }
                return fctx.a;
            }
        });
        dofbVar.e(new fdae() { // from class: cwrd
            @Override // defpackage.fdae
            public final Object invoke() {
                fcsu fcsuVar = this.a.i;
                if (((Optional) fcsuVar.b()).isPresent()) {
                    ((uvd) ((Optional) fcsuVar.b()).get()).b();
                }
                return fctx.a;
            }
        });
        dofbVar.c(crbf.b());
        b(conversationIdType, fdapVar);
    }

    public final void b(ConversationIdType conversationIdType, fdap fdapVar) {
        auvw.k(this.n, null, null, new cwrs(this, this.f.d(), conversationIdType, fdapVar, null), 3);
    }
}
