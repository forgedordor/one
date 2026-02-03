package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversationId;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class uwl implements uvn {
    public final Context a;
    public final fdjx b;
    public final fcsu c;
    public final fcsu d;
    public final fcsu e;
    public final fcsu f;
    public final fcsu g;
    public final fcsu h;
    public final fcsu i;
    public final fcsu j;
    public final eigp k;
    public SharedPreferences.OnSharedPreferenceChangeListener l;
    private final fcsu m;
    private final fcsu n;
    private final fcsu o;
    private final fcsu p;
    private final fdpl q;
    private final fdpl r;
    private final fdvc s;

    public uwl(Context context, fdjx fdjxVar, fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3, fcsu fcsuVar4, fcsu fcsuVar5, fcsu fcsuVar6, fcsu fcsuVar7, fcsu fcsuVar8, fcsu fcsuVar9, fcsu fcsuVar10, fcsu fcsuVar11, fcsu fcsuVar12, eigp eigpVar) {
        List list;
        context.getClass();
        fdjxVar.getClass();
        fcsuVar7.getClass();
        fcsuVar9.getClass();
        eigpVar.getClass();
        this.a = context;
        this.b = fdjxVar;
        this.c = fcsuVar;
        this.d = fcsuVar2;
        this.m = fcsuVar3;
        this.n = fcsuVar4;
        this.o = fcsuVar5;
        this.e = fcsuVar6;
        this.f = fcsuVar7;
        this.g = fcsuVar8;
        this.h = fcsuVar9;
        this.i = fcsuVar10;
        this.j = fcsuVar11;
        this.p = fcsuVar12;
        this.k = eigpVar;
        Object objB = fcsuVar12.b();
        objB.getClass();
        Optional optional = (Optional) objB;
        cczi ccziVar = crbf.ba;
        if (((Boolean) ccziVar.e()).booleanValue() || ((Boolean) crbf.bd.e()).booleanValue()) {
            ArrayList arrayList = new ArrayList();
            if (((Boolean) ccziVar.e()).booleanValue()) {
                arrayList.add(Integer.valueOf((int) ((Number) crbf.bb.e()).longValue()));
            }
            if (((Boolean) crbf.bd.e()).booleanValue()) {
                arrayList.add(Integer.valueOf((int) ((Number) crbf.be.e()).longValue()));
            }
            list = arrayList;
        } else {
            list = fcvo.a;
        }
        fdpl fdplVarA = fdqq.a(new fdui(new uwm(optional, list, null)));
        fdus fdusVar = fdur.b;
        fdvc fdvcVarB = fdtg.b(fdplVarA, fdjxVar, fdusVar, null);
        this.q = fdvcVarB;
        fdvc fdvcVarB2 = fdtg.b(fdqq.a(new fdpb(new uwk(this, null))), fdjxVar, fdusVar, null);
        this.r = fdvcVarB2;
        this.s = fdtg.b(fdqq.a(new fdtm(new fdua(fdvcVarB, fdvcVarB2, new uwb(this, null)), new uwe(this, null))), fdjxVar, fdusVar, false);
    }

    @Override // defpackage.uvn
    public final fdvc a() {
        return this.s;
    }

    @Override // defpackage.uvn
    public final void b() {
        if (crbf.d()) {
            fcsu fcsuVar = this.m;
            if (((Optional) fcsuVar.b()).isEmpty() || ((Optional) this.n.b()).isEmpty()) {
                return;
            }
            fcsu fcsuVar2 = this.o;
            if (((Optional) fcsuVar2.b()).isEmpty()) {
                return;
            }
            Optional optional = (Optional) this.g.b();
            final fdap fdapVar = new fdap() { // from class: uvo
                @Override // defpackage.fdap
                public final Object invoke(Object obj) {
                    val valVar = (val) obj;
                    valVar.getClass();
                    valVar.g();
                    return fctx.a;
                }
            };
            optional.ifPresent(new Consumer() { // from class: uvs
                @Override // java.util.function.Consumer
                /* renamed from: accept */
                public final void z(Object obj) {
                    fdapVar.invoke(obj);
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
            ((vbe) ((Optional) fcsuVar2.b()).get()).a(new fdae() { // from class: uvt
                @Override // defpackage.fdae
                public final Object invoke() {
                    return fctx.a;
                }
            });
            ((uwz) ((Optional) fcsuVar.b()).get()).a(new uwf(this));
        }
    }

    @Override // defpackage.uvn
    public final void c() {
        if (!crbf.d() || ((Optional) this.e.b()).isEmpty()) {
            return;
        }
        fcsu fcsuVar = this.o;
        if (((Optional) fcsuVar.b()).isEmpty()) {
            return;
        }
        fcsu fcsuVar2 = this.m;
        if (((Optional) fcsuVar2.b()).isEmpty()) {
            return;
        }
        Optional optional = (Optional) this.j.b();
        final fdap fdapVar = new fdap() { // from class: uvz
            @Override // defpackage.fdap
            public final Object invoke(Object obj) {
                uzw uzwVar = (uzw) obj;
                uzwVar.getClass();
                uzwVar.h();
                return fctx.a;
            }
        };
        optional.ifPresent(new Consumer() { // from class: uwa
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void z(Object obj) {
                fdapVar.invoke(obj);
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
        Optional optional2 = (Optional) this.g.b();
        final fdap fdapVar2 = new fdap() { // from class: uvp
            @Override // defpackage.fdap
            public final Object invoke(Object obj) {
                val valVar = (val) obj;
                valVar.getClass();
                valVar.l();
                return fctx.a;
            }
        };
        optional2.ifPresent(new Consumer() { // from class: uvq
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void z(Object obj) {
                fdapVar2.invoke(obj);
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
        final uwf uwfVar = new uwf(this);
        ((uwz) ((Optional) fcsuVar2.b()).get()).b(uwfVar);
        ((vbe) ((Optional) fcsuVar.b()).get()).a(new fdae() { // from class: uvr
            @Override // defpackage.fdae
            public final Object invoke() {
                uwl uwlVar = this.a;
                cwqx cwqxVar = (cwqx) ((Optional) uwlVar.e.b()).get();
                Object objB = uwlVar.f.b();
                objB.getClass();
                ConversationIdType conversationIdType = ((BugleConversationId) objB).a;
                final uwf uwfVar2 = uwfVar;
                cwqxVar.a(conversationIdType, new fdap() { // from class: uvu
                    @Override // defpackage.fdap
                    public final Object invoke(Object obj) {
                        uwf uwfVar3 = uwfVar2;
                        uwfVar3.c((String) obj);
                        uwfVar3.b();
                        return fctx.a;
                    }
                });
                return fctx.a;
            }
        });
    }

    @Override // defpackage.aalp, java.lang.AutoCloseable
    public final void close() {
        Optional optional = (Optional) this.g.b();
        final fdap fdapVar = new fdap() { // from class: uvv
            @Override // defpackage.fdap
            public final Object invoke(Object obj) {
                val valVar = (val) obj;
                valVar.getClass();
                valVar.i();
                return fctx.a;
            }
        };
        optional.ifPresent(new Consumer() { // from class: uvw
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void z(Object obj) {
                fdapVar.invoke(obj);
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
    }
}
