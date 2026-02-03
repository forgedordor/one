package defpackage;

import android.content.pm.PackageManager;
import android.text.TextUtils;
import com.google.common.util.concurrent.ListenableFuture;
import io.grpc.Status;
import j$.util.Collection;
import j$.util.Optional;
import j$.util.function.Function$CC;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class tvi implements cpmc {
    public static final eksp a = eksp.c("BugleCmsCall");
    static final ejxr b = cdag.w(202740020, "specify_order_by_for_conversations_and_messages");
    static final cczi c;
    static final cczi d;
    static final cczi e;
    public final tvr f;
    public final txe g;
    public final eosc h;
    public final fcsu i;
    private final fcsu j;
    private final aurx k;
    private final fcsu l;

    static {
        cdag.e(cdag.b, "cms_list_objects_page_size", 100);
        c = cdag.f(cdag.b, "cms_grpc_deadline_sec", 60L);
        d = cdag.e(cdag.b, "cms_list_conversation_objects_page_size", 1);
        e = cdag.e(cdag.b, "cms_list_top_conversation_object_page_size", 15);
    }

    public tvi(fcsu fcsuVar, tvr tvrVar, txe txeVar, aurx aurxVar, fcsu fcsuVar2, eosc eoscVar, fcsu fcsuVar3) {
        this.j = fcsuVar;
        this.f = tvrVar;
        this.g = txeVar;
        this.k = aurxVar;
        this.l = fcsuVar2;
        this.h = eoscVar;
        this.i = fcsuVar3;
    }

    public static void Z(String str, String str2) {
        if (!str.isEmpty() && !str2.isEmpty() && str.equals(str2)) {
            throw new cpmb(str);
        }
    }

    public static void aa(String str, String str2) {
        eksl ekslVar = (eksl) a.h();
        ekslVar.X(bzmz.H, str);
        ekslVar.X(bzmz.G, str2);
        ((eksl) ekslVar.h("com/google/android/apps/messaging/cloudstore/grpc/CloudMessageStoreClientImpl", "logCmsRequest", 1553, "CloudMessageStoreClientImpl.java")).o();
    }

    public static void ab(String str, String str2, int i) {
        eksl ekslVar = (eksl) a.h();
        ekslVar.X(bzmz.H, str);
        ekslVar.X(bzmz.G, str2);
        ekslVar.X(bzmz.L, Integer.valueOf(i));
        ((eksl) ekslVar.h("com/google/android/apps/messaging/cloudstore/grpc/CloudMessageStoreClientImpl", "logCmsRequest", 1563, "CloudMessageStoreClientImpl.java")).o();
    }

    private final eiju al(final boolean z, Function function) {
        final tvr tvrVar = this.f;
        eiju eijuVarA = tvrVar.a(tvrVar.c());
        eooz eoozVar = new eooz() { // from class: tvn
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                final eqnw eqnwVar = (eqnw) obj;
                if (!cpyl.a() || !((Boolean) ((cczi) cpyl.u.get()).e()).booleanValue()) {
                    return eijx.e(eqnwVar);
                }
                if (!z) {
                    tvr tvrVar2 = tvrVar;
                    return tvrVar2.b.q().h(new ejvr() { // from class: tvp
                        @Override // defpackage.ejvr
                        public final Object apply(Object obj2) {
                            cqce cqceVar = tvr.a;
                            int i = true != ((Boolean) obj2).booleanValue() ? 4 : 3;
                            eqnw eqnwVar2 = eqnwVar;
                            eqnwVar2.copyOnWrite();
                            eqny eqnyVar = (eqny) eqnwVar2.instance;
                            eqny eqnyVar2 = eqny.a;
                            eqnyVar.f = eqnx.a(i);
                            return eqnwVar2;
                        }
                    }, tvrVar2.c);
                }
                eqnwVar.copyOnWrite();
                eqny eqnyVar = (eqny) eqnwVar.instance;
                eqny eqnyVar2 = eqny.a;
                eqnyVar.f = eqnx.a(4);
                return eijx.e(eqnwVar);
            }
        };
        eosc eoscVar = tvrVar.c;
        eiju eijuVarH = eijuVarA.i(eoozVar, eoscVar).i(new tvl(tvrVar), eoscVar).h(new tvo(), eoscVar);
        ttb ttbVar = new ttb(function);
        eosc eoscVar2 = this.h;
        return eijuVarH.i(ttbVar, eoscVar2).f(fbtf.class, new tta(this), eoscVar2);
    }

    @Override // defpackage.cpmc
    public final eiju A(final String str, final boolean z) {
        return i(new Function() { // from class: tsr
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                eqny eqnyVar = (eqny) obj;
                tvi.aa("listConversationObjects", eqnyVar.d);
                eqmq eqmqVarY = this.a.Y();
                eqlo eqloVar = eqlo.a;
                eqln eqlnVar = (eqln) eqloVar.createBuilder();
                eqlnVar.copyOnWrite();
                eqlo eqloVar2 = (eqlo) eqlnVar.instance;
                eqnyVar.getClass();
                eqloVar2.c = eqnyVar;
                eqloVar2.b |= 1;
                Integer num = z ? (Integer) tvi.e.e() : (Integer) tvi.d.e();
                String str2 = str;
                int iIntValue = num.intValue();
                eqlnVar.copyOnWrite();
                ((eqlo) eqlnVar.instance).e = iIntValue;
                eqlnVar.copyOnWrite();
                eqlo eqloVar3 = (eqlo) eqlnVar.instance;
                str2.getClass();
                eqloVar3.d = str2;
                String str3 = true != ((Boolean) ((cczi) tvi.b.get()).e()).booleanValue() ? "" : "message_content.message_time desc, create_time desc, object_id desc";
                eqlnVar.copyOnWrite();
                ((eqlo) eqlnVar.instance).f = str3;
                eqlo eqloVar4 = (eqlo) eqlnVar.build();
                fbnd fbndVar = eqmqVarY.a;
                fbrk fbrkVar = eqmr.m;
                if (fbrkVar == null) {
                    synchronized (eqmr.class) {
                        fbrkVar = eqmr.m;
                        if (fbrkVar == null) {
                            fbrh fbrhVarA = fbrk.a();
                            fbrhVarA.c = fbrj.UNARY;
                            fbrhVarA.d = fbrk.c("google.communications.jibemessagestore.v1.MessageStore", "ListConversationObjects");
                            fbrhVarA.b();
                            evrr evrrVar = fcrj.a;
                            fbrhVarA.a = new fcrh(eqloVar);
                            fbrhVarA.b = new fcrh(eqlq.a);
                            fbrk fbrkVarA = fbrhVarA.a();
                            eqmr.m = fbrkVarA;
                            fbrkVar = fbrkVarA;
                        }
                    }
                }
                return fcrw.a(fbndVar.a(fbrkVar, eqmqVarY.b), eqloVar4);
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).h(new ejvr() { // from class: tss
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                eksp ekspVar = tvi.a;
                return ekgb.n(((eqlq) obj).b);
            }
        }, eoqg.a);
    }

    @Override // defpackage.cpmc
    public final eiju B() {
        return E("", evvp.a);
    }

    public final eiju C(final eqls eqlsVar) {
        eqmq eqmqVarY = Y();
        fbnd fbndVar = eqmqVarY.a;
        fbrk fbrkVarA = eqmr.i;
        if (fbrkVarA == null) {
            synchronized (eqmr.class) {
                fbrkVarA = eqmr.i;
                if (fbrkVarA == null) {
                    fbrh fbrhVarA = fbrk.a();
                    fbrhVarA.c = fbrj.UNARY;
                    fbrhVarA.d = fbrk.c("google.communications.jibemessagestore.v1.MessageStore", "ListConversations");
                    fbrhVarA.b();
                    eqls eqlsVar2 = eqls.a;
                    evrr evrrVar = fcrj.a;
                    fbrhVarA.a = new fcrh(eqlsVar2);
                    fbrhVarA.b = new fcrh(eqlu.a);
                    fbrkVarA = fbrhVarA.a();
                    eqmr.i = fbrkVarA;
                }
            }
        }
        return eiju.g(fcrw.a(fbndVar.a(fbrkVarA, eqmqVarY.b), eqlsVar)).h(new ejvr() { // from class: tui
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                eqlu eqluVar = (eqlu) obj;
                eksp ekspVar = tvi.a;
                tvi.Z(eqlsVar.e, eqluVar.c);
                return new cpvs(ekgb.n(eqluVar.b), eqluVar.c, eqluVar.d);
            }
        }, eoqg.a);
    }

    @Override // defpackage.cpmc
    public final eiju D(String str) {
        return E(str, evvp.a);
    }

    @Override // defpackage.cpmc
    public final eiju E(final String str, final evvp evvpVar) {
        return i(new Function() { // from class: tso
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                eqny eqnyVar = (eqny) obj;
                tvi.aa("listConversations", eqnyVar.d);
                eqlr eqlrVar = (eqlr) eqls.a.createBuilder();
                eqlrVar.copyOnWrite();
                eqls eqlsVar = (eqls) eqlrVar.instance;
                eqnyVar.getClass();
                eqlsVar.c = eqnyVar;
                eqlsVar.b |= 1;
                String str2 = true != ((Boolean) ((cczi) tvi.b.get()).e()).booleanValue() ? "" : "most_recent_message_time desc, conversation_id desc";
                eqlrVar.copyOnWrite();
                ((eqls) eqlrVar.instance).f = str2;
                evvp evvpVar2 = evvpVar;
                if (!ejwh.a(evvpVar2, evvp.a)) {
                    eqlrVar.copyOnWrite();
                    eqls eqlsVar2 = (eqls) eqlrVar.instance;
                    evvpVar2.getClass();
                    eqlsVar2.d = evvpVar2;
                    eqlsVar2.b |= 2;
                    eqlrVar.copyOnWrite();
                    ((eqls) eqlrVar.instance).g = true;
                }
                String str3 = str;
                if (!TextUtils.isEmpty(str3)) {
                    eqlrVar.copyOnWrite();
                    eqls eqlsVar3 = (eqls) eqlrVar.instance;
                    str3.getClass();
                    eqlsVar3.e = str3;
                }
                return this.a.C((eqls) eqlrVar.build());
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
    }

    @Override // defpackage.cpmc
    public final eiju F() {
        return i(new Function() { // from class: tud
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                eqny eqnyVar = (eqny) obj;
                tvi.aa("listObjects", eqnyVar.d);
                eqlz eqlzVar = (eqlz) eqma.a.createBuilder();
                eqlzVar.copyOnWrite();
                eqma eqmaVar = (eqma) eqlzVar.instance;
                eqnyVar.getClass();
                eqmaVar.c = eqnyVar;
                eqmaVar.b |= 1;
                eqlzVar.copyOnWrite();
                ((eqma) eqlzVar.instance).d = "root";
                eqlzVar.a("cipher");
                return this.a.L((eqma) eqlzVar.build());
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
    }

    @Override // defpackage.cpmc
    public final eiju G(final String str) {
        return i(new Function() { // from class: tsx
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                eqny eqnyVar = (eqny) obj;
                tvi.aa("listObjects", eqnyVar.d);
                eqlz eqlzVar = (eqlz) eqma.a.createBuilder();
                eqlzVar.copyOnWrite();
                eqma eqmaVar = (eqma) eqlzVar.instance;
                eqnyVar.getClass();
                eqmaVar.c = eqnyVar;
                eqmaVar.b |= 1;
                eqlzVar.copyOnWrite();
                ((eqma) eqlzVar.instance).d = "root";
                eqlzVar.a("cipher");
                eqlzVar.copyOnWrite();
                eqma eqmaVar2 = (eqma) eqlzVar.instance;
                String str2 = str;
                str2.getClass();
                eqmaVar2.g = str2;
                return this.a.L((eqma) eqlzVar.build());
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
    }

    @Override // defpackage.cpmc
    public final eiju H() {
        return i(new Function() { // from class: tug
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                eqny eqnyVar = (eqny) obj;
                tvi.aa("listFiles", eqnyVar.d);
                eqmq eqmqVarY = this.a.Y();
                eqlw eqlwVar = eqlw.a;
                eqlv eqlvVar = (eqlv) eqlwVar.createBuilder();
                eqlvVar.copyOnWrite();
                eqlw eqlwVar2 = (eqlw) eqlvVar.instance;
                eqnyVar.getClass();
                eqlwVar2.c = eqnyVar;
                eqlwVar2.b |= 1;
                eqlw eqlwVar3 = (eqlw) eqlvVar.build();
                fbnd fbndVar = eqmqVarY.a;
                fbrk fbrkVar = eqmr.B;
                if (fbrkVar == null) {
                    synchronized (eqmr.class) {
                        fbrkVar = eqmr.B;
                        if (fbrkVar == null) {
                            fbrh fbrhVarA = fbrk.a();
                            fbrhVarA.c = fbrj.UNARY;
                            fbrhVarA.d = fbrk.c("google.communications.jibemessagestore.v1.MessageStore", "ListFiles");
                            fbrhVarA.b();
                            evrr evrrVar = fcrj.a;
                            fbrhVarA.a = new fcrh(eqlwVar);
                            fbrhVarA.b = new fcrh(eqly.a);
                            fbrk fbrkVarA = fbrhVarA.a();
                            eqmr.B = fbrkVarA;
                            fbrkVar = fbrkVarA;
                        }
                    }
                }
                return eiju.g(fcrw.a(fbndVar.a(fbrkVar, eqmqVarY.b), eqlwVar3)).h(new ejvr() { // from class: tus
                    @Override // defpackage.ejvr
                    public final Object apply(Object obj2) {
                        eqly eqlyVar = (eqly) obj2;
                        eksp ekspVar = tvi.a;
                        return new cpvs(ekgb.n(eqlyVar.b), eqlyVar.c, eqlyVar.d);
                    }
                }, eoqg.a);
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
    }

    @Override // defpackage.cpmc
    public final eiju I() {
        return K("", evvp.a);
    }

    @Override // defpackage.cpmc
    public final eiju J(String str) {
        return K(str, evvp.a);
    }

    @Override // defpackage.cpmc
    public final eiju K(final String str, final evvp evvpVar) {
        return i(new Function() { // from class: tuf
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                eqny eqnyVar = (eqny) obj;
                tvi.aa("listObjects", eqnyVar.d);
                eqlz eqlzVar = (eqlz) eqma.a.createBuilder();
                eqlzVar.copyOnWrite();
                eqma eqmaVar = (eqma) eqlzVar.instance;
                eqnyVar.getClass();
                eqmaVar.c = eqnyVar;
                eqmaVar.b |= 1;
                eqlzVar.copyOnWrite();
                ((eqma) eqlzVar.instance).d = "inbox";
                tvi tviVar = this.a;
                int iIntValue = ((Long) tviVar.i.b()).intValue();
                eqlzVar.copyOnWrite();
                ((eqma) eqlzVar.instance).f = iIntValue;
                String str2 = true != ((Boolean) ((cczi) tvi.b.get()).e()).booleanValue() ? "" : "message_content.message_time desc, create_time desc, object_id desc";
                eqlzVar.copyOnWrite();
                ((eqma) eqlzVar.instance).h = str2;
                evvp evvpVar2 = evvpVar;
                if (!ejwh.a(evvpVar2, evvp.a)) {
                    eqlzVar.copyOnWrite();
                    eqma eqmaVar2 = (eqma) eqlzVar.instance;
                    evvpVar2.getClass();
                    eqmaVar2.j = evvpVar2;
                    eqmaVar2.b |= 32;
                    eqlzVar.copyOnWrite();
                    ((eqma) eqlzVar.instance).i = true;
                }
                String str3 = str;
                if (!TextUtils.isEmpty(str3)) {
                    eqlzVar.copyOnWrite();
                    eqma eqmaVar3 = (eqma) eqlzVar.instance;
                    str3.getClass();
                    eqmaVar3.g = str3;
                }
                return tviVar.L((eqma) eqlzVar.build());
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
    }

    public final eiju L(final eqma eqmaVar) {
        return eiju.g(Y().e(eqmaVar)).h(new ejvr() { // from class: tua
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                eqmc eqmcVar = (eqmc) obj;
                eksp ekspVar = tvi.a;
                tvi.Z(eqmaVar.g, eqmcVar.c);
                return new cpvs(ekgb.n(eqmcVar.b), eqmcVar.c, eqmcVar.d);
            }
        }, eoqg.a);
    }

    @Override // defpackage.cpmc
    public final eiju M() {
        return Q("", evvp.a);
    }

    @Override // defpackage.cpmc
    public final eiju N(final ekgb ekgbVar) {
        return i(new Function() { // from class: tuk
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                eqny eqnyVar = (eqny) obj;
                tvi.aa("listParticipants", eqnyVar.d);
                eqmd eqmdVar = (eqmd) eqme.a.createBuilder();
                eqmdVar.copyOnWrite();
                eqme eqmeVar = (eqme) eqmdVar.instance;
                eqnyVar.getClass();
                eqmeVar.c = eqnyVar;
                eqmeVar.b |= 1;
                eqmdVar.copyOnWrite();
                eqme eqmeVar2 = (eqme) eqmdVar.instance;
                evtg evtgVar = eqmeVar2.e;
                if (!evtgVar.c()) {
                    eqmeVar2.e = evsn.mutableCopy(evtgVar);
                }
                ekgb ekgbVar2 = ekgbVar;
                tvi tviVar = this.a;
                evpz.addAll(ekgbVar2, eqmeVar2.e);
                return tviVar.O((eqme) eqmdVar.build());
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
    }

    public final eiju O(final eqme eqmeVar) {
        eqmq eqmqVarY = Y();
        fbnd fbndVar = eqmqVarY.a;
        fbrk fbrkVarA = eqmr.y;
        if (fbrkVarA == null) {
            synchronized (eqmr.class) {
                fbrkVarA = eqmr.y;
                if (fbrkVarA == null) {
                    fbrh fbrhVarA = fbrk.a();
                    fbrhVarA.c = fbrj.UNARY;
                    fbrhVarA.d = fbrk.c("google.communications.jibemessagestore.v1.MessageStore", "ListParticipants");
                    fbrhVarA.b();
                    eqme eqmeVar2 = eqme.a;
                    evrr evrrVar = fcrj.a;
                    fbrhVarA.a = new fcrh(eqmeVar2);
                    fbrhVarA.b = new fcrh(eqmg.a);
                    fbrkVarA = fbrhVarA.a();
                    eqmr.y = fbrkVarA;
                }
            }
        }
        return eiju.g(fcrw.a(fbndVar.a(fbrkVarA, eqmqVarY.b), eqmeVar)).h(new ejvr() { // from class: tte
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                eqmg eqmgVar = (eqmg) obj;
                eksp ekspVar = tvi.a;
                tvi.Z(eqmeVar.f, eqmgVar.c);
                return new cpvs(ekgb.n(eqmgVar.b), eqmgVar.c, eqmgVar.d);
            }
        }, eoqg.a);
    }

    @Override // defpackage.cpmc
    public final eiju P(String str) {
        return Q(str, evvp.a);
    }

    @Override // defpackage.cpmc
    public final eiju Q(final String str, final evvp evvpVar) {
        return i(new Function() { // from class: tuw
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                eqny eqnyVar = (eqny) obj;
                tvi.aa("listParticipants", eqnyVar.d);
                eqmd eqmdVar = (eqmd) eqme.a.createBuilder();
                eqmdVar.copyOnWrite();
                eqme eqmeVar = (eqme) eqmdVar.instance;
                eqnyVar.getClass();
                eqmeVar.c = eqnyVar;
                eqmeVar.b |= 1;
                String str2 = str;
                if (!str2.isEmpty()) {
                    eqmdVar.copyOnWrite();
                    eqme eqmeVar2 = (eqme) eqmdVar.instance;
                    str2.getClass();
                    eqmeVar2.f = str2;
                }
                evvp evvpVar2 = evvpVar;
                eqmd eqmdVar2 = (eqmd) ((eqme) eqmdVar.build()).toBuilder();
                if (!ejwh.a(evvpVar2, evvp.a)) {
                    eqmdVar2.copyOnWrite();
                    eqme eqmeVar3 = (eqme) eqmdVar2.instance;
                    evvpVar2.getClass();
                    eqmeVar3.d = evvpVar2;
                    eqmeVar3.b |= 2;
                }
                return this.a.O((eqme) eqmdVar2.build());
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
    }

    @Override // defpackage.cpmc
    public final eiju R() {
        eqny eqnyVarD = this.f.d();
        aa("resetBox", eqnyVarD.d);
        eqmq eqmqVarY = Y();
        eqoa eqoaVar = eqoa.a;
        eqnz eqnzVar = (eqnz) eqoaVar.createBuilder();
        eqnzVar.copyOnWrite();
        eqoa eqoaVar2 = (eqoa) eqnzVar.instance;
        eqnyVarD.getClass();
        eqoaVar2.c = eqnyVarD;
        eqoaVar2.b |= 1;
        eqoa eqoaVar3 = (eqoa) eqnzVar.build();
        fbnd fbndVar = eqmqVarY.a;
        fbrk fbrkVar = eqmr.t;
        if (fbrkVar == null) {
            synchronized (eqmr.class) {
                fbrkVar = eqmr.t;
                if (fbrkVar == null) {
                    fbrh fbrhVarA = fbrk.a();
                    fbrhVarA.c = fbrj.UNARY;
                    fbrhVarA.d = fbrk.c("google.communications.jibemessagestore.v1.MessageStore", "ResetBox");
                    fbrhVarA.b();
                    evrr evrrVar = fcrj.a;
                    fbrhVarA.a = new fcrh(eqoaVar);
                    fbrhVarA.b = new fcrh(evrl.a);
                    fbrk fbrkVarA = fbrhVarA.a();
                    eqmr.t = fbrkVarA;
                    fbrkVar = fbrkVarA;
                }
            }
        }
        return eiju.g(fcrw.a(fbndVar.a(fbrkVar, eqmqVarY.b), eqoaVar3));
    }

    @Override // defpackage.cpmc
    public final eiju S(eqiz eqizVar, evrw evrwVar, eqmi eqmiVar) {
        eqny eqnyVarD = this.f.d();
        aa("updateBox", eqnyVarD.d);
        eqod eqodVar = (eqod) eqoe.a.createBuilder();
        eqodVar.copyOnWrite();
        eqoe eqoeVar = (eqoe) eqodVar.instance;
        eqnyVarD.getClass();
        eqoeVar.c = eqnyVarD;
        eqoeVar.b |= 1;
        eqodVar.copyOnWrite();
        eqoe eqoeVar2 = (eqoe) eqodVar.instance;
        eqizVar.getClass();
        eqoeVar2.d = eqizVar;
        eqoeVar2.b |= 2;
        eqodVar.copyOnWrite();
        eqoe eqoeVar3 = (eqoe) eqodVar.instance;
        evrwVar.getClass();
        eqoeVar3.e = evrwVar;
        eqoeVar3.b |= 4;
        eqodVar.copyOnWrite();
        eqoe eqoeVar4 = (eqoe) eqodVar.instance;
        eqmiVar.getClass();
        eqoeVar4.f = eqmiVar;
        eqoeVar4.b |= 8;
        return eiju.g(Y().f((eqoe) eqodVar.build()));
    }

    @Override // defpackage.cpmc
    public final eiju T(final eqjv eqjvVar, final evrw evrwVar, boolean z) {
        return al(z, new Function() { // from class: tuj
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                eqny eqnyVar = (eqny) obj;
                tvi.aa("updateConversation", eqnyVar.d);
                eqmq eqmqVarY = this.a.Y();
                eqog eqogVar = eqog.a;
                eqof eqofVar = (eqof) eqogVar.createBuilder();
                eqofVar.copyOnWrite();
                eqog eqogVar2 = (eqog) eqofVar.instance;
                eqnyVar.getClass();
                eqogVar2.c = eqnyVar;
                eqogVar2.b |= 1;
                eqofVar.copyOnWrite();
                eqog eqogVar3 = (eqog) eqofVar.instance;
                eqjv eqjvVar2 = eqjvVar;
                eqjvVar2.getClass();
                eqogVar3.d = eqjvVar2;
                eqogVar3.b |= 2;
                eqofVar.copyOnWrite();
                eqog eqogVar4 = (eqog) eqofVar.instance;
                eqogVar4.e = evrwVar;
                eqogVar4.b |= 4;
                eqog eqogVar5 = (eqog) eqofVar.build();
                fbnd fbndVar = eqmqVarY.a;
                fbrk fbrkVar = eqmr.k;
                if (fbrkVar == null) {
                    synchronized (eqmr.class) {
                        fbrkVar = eqmr.k;
                        if (fbrkVar == null) {
                            fbrh fbrhVarA = fbrk.a();
                            fbrhVarA.c = fbrj.UNARY;
                            fbrhVarA.d = fbrk.c("google.communications.jibemessagestore.v1.MessageStore", "UpdateConversation");
                            fbrhVarA.b();
                            evrr evrrVar = fcrj.a;
                            fbrhVarA.a = new fcrh(eqogVar);
                            fbrhVarA.b = new fcrh(eqjv.a);
                            fbrk fbrkVarA = fbrhVarA.a();
                            eqmr.k = fbrkVarA;
                            fbrkVar = fbrkVarA;
                        }
                    }
                }
                return fcrw.a(fbndVar.a(fbrkVar, eqmqVarY.b), eqogVar5);
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
    }

    @Override // defpackage.cpmc
    public final eiju U(final eqko eqkoVar, final evrw evrwVar, boolean z) {
        return al(z, new Function() { // from class: tto
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                eqny eqnyVar = (eqny) obj;
                tvi.aa("updateFile", eqnyVar.d);
                eqmq eqmqVarY = this.a.Y();
                eqoi eqoiVar = eqoi.a;
                eqoh eqohVar = (eqoh) eqoiVar.createBuilder();
                eqohVar.copyOnWrite();
                eqoi eqoiVar2 = (eqoi) eqohVar.instance;
                eqnyVar.getClass();
                eqoiVar2.c = eqnyVar;
                eqoiVar2.b |= 1;
                eqohVar.copyOnWrite();
                eqoi eqoiVar3 = (eqoi) eqohVar.instance;
                eqko eqkoVar2 = eqkoVar;
                eqkoVar2.getClass();
                eqoiVar3.d = eqkoVar2;
                eqoiVar3.b |= 2;
                eqohVar.copyOnWrite();
                eqoi eqoiVar4 = (eqoi) eqohVar.instance;
                evrw evrwVar2 = evrwVar;
                evrwVar2.getClass();
                eqoiVar4.e = evrwVar2;
                eqoiVar4.b |= 8;
                eqoi eqoiVar5 = (eqoi) eqohVar.build();
                fbnd fbndVar = eqmqVarY.a;
                fbrk fbrkVar = eqmr.C;
                if (fbrkVar == null) {
                    synchronized (eqmr.class) {
                        fbrkVar = eqmr.C;
                        if (fbrkVar == null) {
                            fbrh fbrhVarA = fbrk.a();
                            fbrhVarA.c = fbrj.UNARY;
                            fbrhVarA.d = fbrk.c("google.communications.jibemessagestore.v1.MessageStore", "UpdateFile");
                            fbrhVarA.b();
                            evrr evrrVar = fcrj.a;
                            fbrhVarA.a = new fcrh(eqoiVar);
                            fbrhVarA.b = new fcrh(eqko.a);
                            fbrk fbrkVarA = fbrhVarA.a();
                            eqmr.C = fbrkVarA;
                            fbrkVar = fbrkVarA;
                        }
                    }
                }
                return fcrw.a(fbndVar.a(fbrkVar, eqmqVarY.b), eqoiVar5);
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
    }

    @Override // defpackage.cpmc
    public final eiju V(final eqnd eqndVar, final evrw evrwVar, final eqmi eqmiVar, boolean z) {
        return al(z, new Function() { // from class: tsp
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                eqny eqnyVar = (eqny) obj;
                tvi.aa("updateObject", eqnyVar.d);
                eqmq eqmqVarY = this.a.Y();
                eqoj eqojVar = (eqoj) eqok.a.createBuilder();
                eqojVar.copyOnWrite();
                eqok eqokVar = (eqok) eqojVar.instance;
                eqnyVar.getClass();
                eqokVar.c = eqnyVar;
                eqokVar.b |= 1;
                eqojVar.copyOnWrite();
                eqok eqokVar2 = (eqok) eqojVar.instance;
                eqnd eqndVar2 = eqndVar;
                eqndVar2.getClass();
                eqokVar2.d = eqndVar2;
                eqokVar2.b |= 2;
                eqojVar.copyOnWrite();
                eqok eqokVar3 = (eqok) eqojVar.instance;
                evrw evrwVar2 = evrwVar;
                evrwVar2.getClass();
                eqokVar3.e = evrwVar2;
                eqokVar3.b |= 4;
                eqojVar.copyOnWrite();
                eqok eqokVar4 = (eqok) eqojVar.instance;
                eqmi eqmiVar2 = eqmiVar;
                eqmiVar2.getClass();
                eqokVar4.f = eqmiVar2;
                eqokVar4.b |= 8;
                return eqmqVarY.g((eqok) eqojVar.build());
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
    }

    @Override // defpackage.cpmc
    public final eiju W(final eqnl eqnlVar, final evrw evrwVar, boolean z) {
        return al(z, new Function() { // from class: tty
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                eqny eqnyVar = (eqny) obj;
                tvi.aa("updateParticipant", eqnyVar.d);
                eqmq eqmqVarY = this.a.Y();
                eqom eqomVar = eqom.a;
                eqol eqolVar = (eqol) eqomVar.createBuilder();
                eqolVar.copyOnWrite();
                eqom eqomVar2 = (eqom) eqolVar.instance;
                eqnyVar.getClass();
                eqomVar2.c = eqnyVar;
                eqomVar2.b |= 1;
                eqolVar.copyOnWrite();
                eqom eqomVar3 = (eqom) eqolVar.instance;
                eqnl eqnlVar2 = eqnlVar;
                eqnlVar2.getClass();
                eqomVar3.d = eqnlVar2;
                eqomVar3.b |= 2;
                eqolVar.copyOnWrite();
                eqom eqomVar4 = (eqom) eqolVar.instance;
                evrw evrwVar2 = evrwVar;
                evrwVar2.getClass();
                eqomVar4.e = evrwVar2;
                eqomVar4.b |= 4;
                eqom eqomVar5 = (eqom) eqolVar.build();
                fbnd fbndVar = eqmqVarY.a;
                fbrk fbrkVar = eqmr.z;
                if (fbrkVar == null) {
                    synchronized (eqmr.class) {
                        fbrkVar = eqmr.z;
                        if (fbrkVar == null) {
                            fbrh fbrhVarA = fbrk.a();
                            fbrhVarA.c = fbrj.UNARY;
                            fbrhVarA.d = fbrk.c("google.communications.jibemessagestore.v1.MessageStore", "UpdateParticipant");
                            fbrhVarA.b();
                            evrr evrrVar = fcrj.a;
                            fbrhVarA.a = new fcrh(eqomVar);
                            fbrhVarA.b = new fcrh(eqnl.a);
                            fbrk fbrkVarA = fbrhVarA.a();
                            eqmr.z = fbrkVarA;
                            fbrkVar = fbrkVarA;
                        }
                    }
                }
                return fcrw.a(fbndVar.a(fbrkVar, eqmqVarY.b), eqomVar5);
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
    }

    @Override // defpackage.cpmc
    public final eiju X(final String str, final eqnu eqnuVar, final evrw evrwVar, boolean z) {
        return al(z, new Function() { // from class: tul
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                eqny eqnyVar = (eqny) obj;
                tvi.aa("updatePayloadPart", eqnyVar.d);
                eqmq eqmqVarY = this.a.Y();
                eqoo eqooVar = eqoo.a;
                eqon eqonVar = (eqon) eqooVar.createBuilder();
                eqonVar.copyOnWrite();
                eqoo eqooVar2 = (eqoo) eqonVar.instance;
                eqnyVar.getClass();
                eqooVar2.c = eqnyVar;
                eqooVar2.b |= 1;
                eqonVar.copyOnWrite();
                eqoo eqooVar3 = (eqoo) eqonVar.instance;
                eqnu eqnuVar2 = eqnuVar;
                eqnuVar2.getClass();
                eqooVar3.e = eqnuVar2;
                eqooVar3.b |= 2;
                eqonVar.copyOnWrite();
                eqoo eqooVar4 = (eqoo) eqonVar.instance;
                String str2 = str;
                str2.getClass();
                eqooVar4.d = str2;
                eqonVar.copyOnWrite();
                eqoo eqooVar5 = (eqoo) eqonVar.instance;
                evrw evrwVar2 = evrwVar;
                evrwVar2.getClass();
                eqooVar5.f = evrwVar2;
                eqooVar5.b |= 4;
                eqoo eqooVar6 = (eqoo) eqonVar.build();
                fbnd fbndVar = eqmqVarY.a;
                fbrk fbrkVar = eqmr.f;
                if (fbrkVar == null) {
                    synchronized (eqmr.class) {
                        fbrkVar = eqmr.f;
                        if (fbrkVar == null) {
                            fbrh fbrhVarA = fbrk.a();
                            fbrhVarA.c = fbrj.UNARY;
                            fbrhVarA.d = fbrk.c("google.communications.jibemessagestore.v1.MessageStore", "UpdatePayloadPart");
                            fbrhVarA.b();
                            evrr evrrVar = fcrj.a;
                            fbrhVarA.a = new fcrh(eqooVar);
                            fbrhVarA.b = new fcrh(eqnu.a);
                            fbrk fbrkVarA = fbrhVarA.a();
                            eqmr.f = fbrkVarA;
                            fbrkVar = fbrkVarA;
                        }
                    }
                }
                return fcrw.a(fbndVar.a(fbrkVar, eqmqVarY.b), eqooVar6);
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
    }

    final eqmq Y() {
        eqmq eqmqVar = (eqmq) this.j.b();
        fbnb fbnbVar = espr.a;
        esop esopVar = new esop();
        esopVar.b(ekhx.r("https://www.googleapis.com/auth/carrier-message-store", "https://www.googleapis.com/auth/android-messages"));
        eqmq eqmqVar2 = (eqmq) ((eqmq) eqmqVar.n(fbnbVar, new esow(esopVar.c()))).k(((Long) c.e()).longValue(), TimeUnit.SECONDS);
        return Boolean.TRUE.equals(this.l.b()) ? (eqmq) eqmqVar2.n(estq.b, 8736) : eqmqVar2;
    }

    @Override // defpackage.cpmc
    public final eiju a(final List list, boolean z) {
        return al(z, new Function() { // from class: tsu
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                eqny eqnyVar = (eqny) obj;
                String str = eqnyVar.d;
                List list2 = list;
                tvi.ab("batchCreateConversations", str, list2.size());
                eqmq eqmqVarY = this.a.Y();
                eqia eqiaVar = eqia.a;
                eqhz eqhzVar = (eqhz) eqiaVar.createBuilder();
                eqhzVar.copyOnWrite();
                eqia eqiaVar2 = (eqia) eqhzVar.instance;
                evtg evtgVar = eqiaVar2.d;
                if (!evtgVar.c()) {
                    eqiaVar2.d = evsn.mutableCopy(evtgVar);
                }
                evpz.addAll(list2, eqiaVar2.d);
                eqhzVar.copyOnWrite();
                eqia eqiaVar3 = (eqia) eqhzVar.instance;
                eqnyVar.getClass();
                eqiaVar3.c = eqnyVar;
                eqiaVar3.b |= 1;
                eqia eqiaVar4 = (eqia) eqhzVar.build();
                fbnd fbndVar = eqmqVarY.a;
                fbrk fbrkVar = eqmr.g;
                if (fbrkVar == null) {
                    synchronized (eqmr.class) {
                        fbrkVar = eqmr.g;
                        if (fbrkVar == null) {
                            fbrh fbrhVarA = fbrk.a();
                            fbrhVarA.c = fbrj.UNARY;
                            fbrhVarA.d = fbrk.c("google.communications.jibemessagestore.v1.MessageStore", "BatchCreateConversations");
                            fbrhVarA.b();
                            evrr evrrVar = fcrj.a;
                            fbrhVarA.a = new fcrh(eqiaVar);
                            fbrhVarA.b = new fcrh(eqic.a);
                            fbrk fbrkVarA = fbrhVarA.a();
                            eqmr.g = fbrkVarA;
                            fbrkVar = fbrkVarA;
                        }
                    }
                }
                return fcrw.a(fbndVar.a(fbrkVar, eqmqVarY.b), eqiaVar4);
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
    }

    @Override // defpackage.cpmc
    public final eiju ac(final List list) {
        return al(false, new Function() { // from class: ttx
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                eqny eqnyVar = (eqny) obj;
                String str = eqnyVar.d;
                List list2 = list;
                tvi.ab("batchDeleteFiles", str, list2.size());
                eqmq eqmqVarY = this.a.Y();
                eqim eqimVar = eqim.a;
                eqil eqilVar = (eqil) eqimVar.createBuilder();
                eqilVar.copyOnWrite();
                eqim eqimVar2 = (eqim) eqilVar.instance;
                eqnyVar.getClass();
                eqimVar2.c = eqnyVar;
                eqimVar2.b |= 1;
                eqilVar.copyOnWrite();
                eqim eqimVar3 = (eqim) eqilVar.instance;
                evtg evtgVar = eqimVar3.d;
                if (!evtgVar.c()) {
                    eqimVar3.d = evsn.mutableCopy(evtgVar);
                }
                evpz.addAll(list2, eqimVar3.d);
                eqim eqimVar4 = (eqim) eqilVar.build();
                fbnd fbndVar = eqmqVarY.a;
                fbrk fbrkVar = eqmr.A;
                if (fbrkVar == null) {
                    synchronized (eqmr.class) {
                        fbrkVar = eqmr.A;
                        if (fbrkVar == null) {
                            fbrh fbrhVarA = fbrk.a();
                            fbrhVarA.c = fbrj.UNARY;
                            fbrhVarA.d = fbrk.c("google.communications.jibemessagestore.v1.MessageStore", "BatchDeleteFiles");
                            fbrhVarA.b();
                            evrr evrrVar = fcrj.a;
                            fbrhVarA.a = new fcrh(eqimVar);
                            fbrhVarA.b = new fcrh(eqio.a);
                            fbrk fbrkVarA = fbrhVarA.a();
                            eqmr.A = fbrkVarA;
                            fbrkVar = fbrkVarA;
                        }
                    }
                }
                return fcrw.a(fbndVar.a(fbrkVar, eqmqVarY.b), eqimVar4);
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
    }

    @Override // defpackage.cpmc
    public final eiju ad(final String str, boolean z) {
        eiju eijuVarAl = al(z, new Function() { // from class: tux
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                eqny eqnyVar = (eqny) obj;
                tvi.aa("deleteConversation", eqnyVar.d);
                eqmq eqmqVarY = this.a.Y();
                eqke eqkeVar = eqke.a;
                eqkd eqkdVar = (eqkd) eqkeVar.createBuilder();
                eqkdVar.copyOnWrite();
                eqke eqkeVar2 = (eqke) eqkdVar.instance;
                eqnyVar.getClass();
                eqkeVar2.c = eqnyVar;
                eqkeVar2.b |= 1;
                eqkdVar.copyOnWrite();
                eqke eqkeVar3 = (eqke) eqkdVar.instance;
                String str2 = str;
                str2.getClass();
                eqkeVar3.d = str2;
                eqkdVar.copyOnWrite();
                ((eqke) eqkdVar.instance).e = true;
                eqke eqkeVar4 = (eqke) eqkdVar.build();
                fbnd fbndVar = eqmqVarY.a;
                fbrk fbrkVar = eqmr.j;
                if (fbrkVar == null) {
                    synchronized (eqmr.class) {
                        fbrkVar = eqmr.j;
                        if (fbrkVar == null) {
                            fbrh fbrhVarA = fbrk.a();
                            fbrhVarA.c = fbrj.UNARY;
                            fbrhVarA.d = fbrk.c("google.communications.jibemessagestore.v1.MessageStore", "DeleteConversation");
                            fbrhVarA.b();
                            evrr evrrVar = fcrj.a;
                            fbrhVarA.a = new fcrh(eqkeVar);
                            fbrhVarA.b = new fcrh(evrl.a);
                            fbrk fbrkVarA = fbrhVarA.a();
                            eqmr.j = fbrkVarA;
                            fbrkVar = fbrkVarA;
                        }
                    }
                }
                return fcrw.a(fbndVar.a(fbrkVar, eqmqVarY.b), eqkeVar4);
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        ejvr ejvrVar = new ejvr() { // from class: tuy
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                eksp ekspVar = tvi.a;
                return true;
            }
        };
        eosc eoscVar = this.h;
        return eijuVarAl.h(ejvrVar, eoscVar).f(fbtf.class, new eooz() { // from class: tuz
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                fbtf fbtfVar = (fbtf) obj;
                Status status = fbtfVar.a;
                eksp ekspVar = tvi.a;
                return status.getCode().equals(Status.Code.NOT_FOUND) ? eijx.e(false) : eijx.d(fbtfVar);
            }
        }, eoscVar);
    }

    @Override // defpackage.cpmc
    public final eiju ae(final evvp evvpVar) {
        return i(new Function() { // from class: tuh
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                eqny eqnyVar = (eqny) obj;
                tvi.aa("listConversations", eqnyVar.d);
                eqlr eqlrVar = (eqlr) eqls.a.createBuilder();
                eqlrVar.copyOnWrite();
                eqls eqlsVar = (eqls) eqlrVar.instance;
                eqnyVar.getClass();
                eqlsVar.c = eqnyVar;
                eqlsVar.b |= 1;
                eqlrVar.copyOnWrite();
                ((eqls) eqlrVar.instance).i = 0;
                eqlrVar.copyOnWrite();
                ((eqls) eqlrVar.instance).g = true;
                evvp evvpVar2 = evvpVar;
                if (!evvpVar2.equals(evxc.c)) {
                    eqlrVar.copyOnWrite();
                    eqls eqlsVar2 = (eqls) eqlrVar.instance;
                    evvpVar2.getClass();
                    eqlsVar2.d = evvpVar2;
                    eqlsVar2.b |= 2;
                }
                return this.a.C((eqls) eqlrVar.build()).h(new tti(), eoqg.a);
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
    }

    @Override // defpackage.cpmc
    public final eiju af(final evvp evvpVar) {
        return i(new Function() { // from class: ttm
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                eqny eqnyVar = (eqny) obj;
                tvi.aa("listObjects", eqnyVar.d);
                eqlz eqlzVar = (eqlz) eqma.a.createBuilder();
                eqlzVar.copyOnWrite();
                eqma eqmaVar = (eqma) eqlzVar.instance;
                eqnyVar.getClass();
                eqmaVar.c = eqnyVar;
                eqmaVar.b |= 1;
                eqlzVar.copyOnWrite();
                ((eqma) eqlzVar.instance).d = "inbox";
                eqlzVar.copyOnWrite();
                ((eqma) eqlzVar.instance).f = 0;
                eqlzVar.copyOnWrite();
                ((eqma) eqlzVar.instance).i = true;
                evvp evvpVar2 = evvpVar;
                if (!evvpVar2.equals(evxc.c)) {
                    eqlzVar.copyOnWrite();
                    eqma eqmaVar2 = (eqma) eqlzVar.instance;
                    evvpVar2.getClass();
                    eqmaVar2.j = evvpVar2;
                    eqmaVar2.b |= 32;
                }
                return this.a.L((eqma) eqlzVar.build()).h(new tti(), eoqg.a);
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
    }

    @Override // defpackage.cpmc
    public final eiju ag(final evvp evvpVar) {
        return i(new Function() { // from class: tuc
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                eqny eqnyVar = (eqny) obj;
                tvi.aa("listParticipants", eqnyVar.d);
                eqmd eqmdVar = (eqmd) eqme.a.createBuilder();
                eqmdVar.copyOnWrite();
                eqme eqmeVar = (eqme) eqmdVar.instance;
                eqnyVar.getClass();
                eqmeVar.c = eqnyVar;
                eqmeVar.b |= 1;
                eqmdVar.copyOnWrite();
                ((eqme) eqmdVar.instance).i = 0;
                eqmdVar.copyOnWrite();
                ((eqme) eqmdVar.instance).g = true;
                evvp evvpVar2 = evvpVar;
                if (!evvpVar2.equals(evxc.c)) {
                    eqmdVar.copyOnWrite();
                    eqme eqmeVar2 = (eqme) eqmdVar.instance;
                    evvpVar2.getClass();
                    eqmeVar2.d = evvpVar2;
                    eqmeVar2.b |= 2;
                }
                return this.a.O((eqme) eqmdVar.build()).h(new tti(), eoqg.a);
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
    }

    @Override // defpackage.cpmc
    public final eiju ah(final int i) {
        aurx aurxVar = this.k;
        eiju eijuVarK = aurxVar.k();
        aurxVar.m.getClass();
        ejvr ejvrVar = new ejvr() { // from class: tut
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                return Boolean.valueOf(aurw.g((aumq) obj));
            }
        };
        eosc eoscVar = this.h;
        return eijuVarK.h(ejvrVar, eoscVar).i(new eooz() { // from class: tvc
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                final tvi tviVar = this.a;
                final int i2 = i;
                if (zBooleanValue) {
                    return tviVar.i(new Function() { // from class: tun
                        @Override // java.util.function.Function
                        /* renamed from: andThen */
                        public final /* synthetic */ Function mo536andThen(Function function) {
                            return Function$CC.$default$andThen(this, function);
                        }

                        @Override // java.util.function.Function
                        public final Object apply(Object obj2) {
                            eqny eqnyVar = (eqny) obj2;
                            tvi.aa("getUserStorageInfo", eqnyVar.d);
                            eqmq eqmqVarY = tviVar.Y();
                            eqld eqldVar = (eqld) eqlf.a.createBuilder();
                            eqldVar.copyOnWrite();
                            eqlf eqlfVar = (eqlf) eqldVar.instance;
                            eqnyVar.getClass();
                            eqlfVar.c = eqnyVar;
                            eqlfVar.b |= 1;
                            eqldVar.copyOnWrite();
                            eqlf eqlfVar2 = (eqlf) eqldVar.instance;
                            eqlfVar2.d = eqle.a(i2);
                            eqlfVar2.b |= 2;
                            return eqmqVarY.d((eqlf) eqldVar.build());
                        }

                        public final /* synthetic */ Function compose(Function function) {
                            return Function$CC.$default$compose(this, function);
                        }
                    }).h(new ejvr() { // from class: tuo
                        @Override // defpackage.ejvr
                        public final Object apply(Object obj2) {
                            eksp ekspVar = tvi.a;
                            eqoq eqoqVar = ((eqlh) obj2).b;
                            return eqoqVar == null ? eqoq.a : eqoqVar;
                        }
                    }, tviVar.h);
                }
                eqny eqnyVarD = tviVar.f.d();
                tvi.aa("getUserStorageInfo", eqnyVarD.d);
                eqmq eqmqVarY = tviVar.Y();
                eqld eqldVar = (eqld) eqlf.a.createBuilder();
                eqldVar.copyOnWrite();
                eqlf eqlfVar = (eqlf) eqldVar.instance;
                eqlfVar.d = eqle.a(i2);
                eqlfVar.b |= 2;
                eqldVar.copyOnWrite();
                eqlf eqlfVar2 = (eqlf) eqldVar.instance;
                eqnyVarD.getClass();
                eqlfVar2.c = eqnyVarD;
                eqlfVar2.b |= 1;
                return eiju.g(eqmqVarY.d((eqlf) eqldVar.build())).h(new ejvr() { // from class: tup
                    @Override // defpackage.ejvr
                    public final Object apply(Object obj2) {
                        eksp ekspVar = tvi.a;
                        eqoq eqoqVar = ((eqlh) obj2).b;
                        return eqoqVar == null ? eqoq.a : eqoqVar;
                    }
                }, tviVar.h);
            }
        }, eoscVar);
    }

    @Override // defpackage.cpmc
    public final eiju ai(final eqiz eqizVar, final evrw evrwVar, final eqmi eqmiVar, int i) throws PackageManager.NameNotFoundException {
        eiju eijuVarE = this.f.e(i);
        eooz eoozVar = new eooz() { // from class: tur
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                eqny eqnyVar = (eqny) obj;
                tvi.aa("updateBox", eqnyVar.d);
                eqod eqodVar = (eqod) eqoe.a.createBuilder();
                eqodVar.copyOnWrite();
                eqoe eqoeVar = (eqoe) eqodVar.instance;
                eqnyVar.getClass();
                eqoeVar.c = eqnyVar;
                eqoeVar.b |= 1;
                eqodVar.copyOnWrite();
                eqoe eqoeVar2 = (eqoe) eqodVar.instance;
                eqiz eqizVar2 = eqizVar;
                eqizVar2.getClass();
                eqoeVar2.d = eqizVar2;
                eqoeVar2.b |= 2;
                eqodVar.copyOnWrite();
                eqoe eqoeVar3 = (eqoe) eqodVar.instance;
                evrw evrwVar2 = evrwVar;
                evrwVar2.getClass();
                eqoeVar3.e = evrwVar2;
                eqoeVar3.b |= 4;
                eqodVar.copyOnWrite();
                eqoe eqoeVar4 = (eqoe) eqodVar.instance;
                eqmi eqmiVar2 = eqmiVar;
                eqmiVar2.getClass();
                eqoeVar4.f = eqmiVar2;
                eqoeVar4.b |= 8;
                return this.a.Y().f((eqoe) eqodVar.build());
            }
        };
        eosc eoscVar = this.h;
        return eijuVarE.i(eoozVar, eoscVar).f(fbtf.class, new tta(this), eoscVar);
    }

    final eiju aj(Function function) {
        tvr tvrVar = this.f;
        eiju eijuVarA = tvrVar.a(tvrVar.c());
        tvl tvlVar = new tvl(tvrVar);
        eosc eoscVar = tvrVar.c;
        eiju eijuVarH = eijuVarA.i(tvlVar, eoscVar).h(new ejvr() { // from class: tvm
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                eqnw eqnwVar = (eqnw) obj;
                cqce cqceVar = tvr.a;
                eqnwVar.copyOnWrite();
                eqny eqnyVar = (eqny) eqnwVar.instance;
                eqny eqnyVar2 = eqny.a;
                eqnyVar.f = eqnx.a(4);
                return (eqny) eqnwVar.build();
            }
        }, eoscVar);
        ttb ttbVar = new ttb(function);
        eosc eoscVar2 = this.h;
        return eijuVarH.i(ttbVar, eoscVar2).f(fbtf.class, new tta(this), eoscVar2);
    }

    @Override // defpackage.cpmc
    public final eiju ak(final eqnd eqndVar, final evrw evrwVar, final eqmi eqmiVar) {
        return aj(new Function() { // from class: tvb
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                eqny eqnyVar = (eqny) obj;
                tvi.aa("updateObject", eqnyVar.d);
                eqmq eqmqVarY = this.a.Y();
                eqoj eqojVar = (eqoj) eqok.a.createBuilder();
                eqojVar.copyOnWrite();
                eqok eqokVar = (eqok) eqojVar.instance;
                eqnyVar.getClass();
                eqokVar.c = eqnyVar;
                eqokVar.b |= 1;
                eqojVar.copyOnWrite();
                eqok eqokVar2 = (eqok) eqojVar.instance;
                eqnd eqndVar2 = eqndVar;
                eqndVar2.getClass();
                eqokVar2.d = eqndVar2;
                eqokVar2.b |= 2;
                eqojVar.copyOnWrite();
                eqok eqokVar3 = (eqok) eqojVar.instance;
                evrw evrwVar2 = evrwVar;
                evrwVar2.getClass();
                eqokVar3.e = evrwVar2;
                eqokVar3.b |= 4;
                eqojVar.copyOnWrite();
                eqok eqokVar4 = (eqok) eqojVar.instance;
                eqmi eqmiVar2 = eqmiVar;
                eqmiVar2.getClass();
                eqokVar4.f = eqmiVar2;
                eqokVar4.b |= 8;
                return eqmqVarY.g((eqok) eqojVar.build());
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
    }

    @Override // defpackage.cpmc
    public final eiju b(final List list, boolean z) {
        return al(z, new Function() { // from class: ttc
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                eqny eqnyVar = (eqny) obj;
                String str = eqnyVar.d;
                List list2 = list;
                tvi.ab("batchCreateObjects", str, list2.size());
                eqmq eqmqVarY = this.a.Y();
                eqie eqieVar = eqie.a;
                eqid eqidVar = (eqid) eqieVar.createBuilder();
                eqidVar.copyOnWrite();
                eqie eqieVar2 = (eqie) eqidVar.instance;
                evtg evtgVar = eqieVar2.d;
                if (!evtgVar.c()) {
                    eqieVar2.d = evsn.mutableCopy(evtgVar);
                }
                evpz.addAll(list2, eqieVar2.d);
                eqidVar.copyOnWrite();
                eqie eqieVar3 = (eqie) eqidVar.instance;
                eqnyVar.getClass();
                eqieVar3.c = eqnyVar;
                eqieVar3.b |= 1;
                eqie eqieVar4 = (eqie) eqidVar.build();
                fbnd fbndVar = eqmqVarY.a;
                fbrk fbrkVar = eqmr.n;
                if (fbrkVar == null) {
                    synchronized (eqmr.class) {
                        fbrkVar = eqmr.n;
                        if (fbrkVar == null) {
                            fbrh fbrhVarA = fbrk.a();
                            fbrhVarA.c = fbrj.UNARY;
                            fbrhVarA.d = fbrk.c("google.communications.jibemessagestore.v1.MessageStore", "BatchCreateObjects");
                            fbrhVarA.b();
                            evrr evrrVar = fcrj.a;
                            fbrhVarA.a = new fcrh(eqieVar);
                            fbrhVarA.b = new fcrh(eqig.a);
                            fbrk fbrkVarA = fbrhVarA.a();
                            eqmr.n = fbrkVarA;
                            fbrkVar = fbrkVarA;
                        }
                    }
                }
                return fcrw.a(fbndVar.a(fbrkVar, eqmqVarY.b), eqieVar4);
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
    }

    @Override // defpackage.cpmc
    public final eiju c(final List list, boolean z) {
        return al(z, new Function() { // from class: tsq
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                eqny eqnyVar = (eqny) obj;
                String str = eqnyVar.d;
                List list2 = list;
                tvi.ab("batchCreateParticipants", str, list2.size());
                eqmq eqmqVarY = this.a.Y();
                eqii eqiiVar = eqii.a;
                eqih eqihVar = (eqih) eqiiVar.createBuilder();
                eqihVar.copyOnWrite();
                eqii eqiiVar2 = (eqii) eqihVar.instance;
                evtg evtgVar = eqiiVar2.d;
                if (!evtgVar.c()) {
                    eqiiVar2.d = evsn.mutableCopy(evtgVar);
                }
                evpz.addAll(list2, eqiiVar2.d);
                eqihVar.copyOnWrite();
                eqii eqiiVar3 = (eqii) eqihVar.instance;
                eqnyVar.getClass();
                eqiiVar3.c = eqnyVar;
                eqiiVar3.b |= 1;
                eqii eqiiVar4 = (eqii) eqihVar.build();
                fbnd fbndVar = eqmqVarY.a;
                fbrk fbrkVar = eqmr.u;
                if (fbrkVar == null) {
                    synchronized (eqmr.class) {
                        fbrkVar = eqmr.u;
                        if (fbrkVar == null) {
                            fbrh fbrhVarA = fbrk.a();
                            fbrhVarA.c = fbrj.UNARY;
                            fbrhVarA.d = fbrk.c("google.communications.jibemessagestore.v1.MessageStore", "BatchCreateParticipants");
                            fbrhVarA.b();
                            evrr evrrVar = fcrj.a;
                            fbrhVarA.a = new fcrh(eqiiVar);
                            fbrhVarA.b = new fcrh(eqik.a);
                            fbrk fbrkVarA = fbrhVarA.a();
                            eqmr.u = fbrkVarA;
                            fbrkVar = fbrkVarA;
                        }
                    }
                }
                return fcrw.a(fbndVar.a(fbrkVar, eqmqVarY.b), eqiiVar4);
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
    }

    @Override // defpackage.cpmc
    public final eiju d(final ekgb ekgbVar) {
        return i(new Function() { // from class: tuq
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                eqny eqnyVar = (eqny) obj;
                String str = eqnyVar.d;
                ekgb ekgbVar2 = ekgbVar;
                tvi.ab("batchGetObjectsByCorrelationIds", str, ekgbVar2.size());
                eqmq eqmqVarY = this.a.Y();
                eqiq eqiqVar = eqiq.a;
                eqip eqipVar = (eqip) eqiqVar.createBuilder();
                eqipVar.copyOnWrite();
                eqiq eqiqVar2 = (eqiq) eqipVar.instance;
                eqnyVar.getClass();
                eqiqVar2.c = eqnyVar;
                eqiqVar2.b |= 1;
                eqipVar.copyOnWrite();
                eqiq eqiqVar3 = (eqiq) eqipVar.instance;
                evtg evtgVar = eqiqVar3.d;
                if (!evtgVar.c()) {
                    eqiqVar3.d = evsn.mutableCopy(evtgVar);
                }
                evpz.addAll(ekgbVar2, eqiqVar3.d);
                eqiq eqiqVar4 = (eqiq) eqipVar.build();
                fbnd fbndVar = eqmqVarY.a;
                fbrk fbrkVar = eqmr.p;
                if (fbrkVar == null) {
                    synchronized (eqmr.class) {
                        fbrkVar = eqmr.p;
                        if (fbrkVar == null) {
                            fbrh fbrhVarA = fbrk.a();
                            fbrhVarA.c = fbrj.UNARY;
                            fbrhVarA.d = fbrk.c("google.communications.jibemessagestore.v1.MessageStore", "BatchGetObjectsByCorrelationIds");
                            fbrhVarA.b();
                            evrr evrrVar = fcrj.a;
                            fbrhVarA.a = new fcrh(eqiqVar);
                            fbrhVarA.b = new fcrh(eqis.a);
                            fbrk fbrkVarA = fbrhVarA.a();
                            eqmr.p = fbrkVarA;
                            fbrkVar = fbrkVarA;
                        }
                    }
                }
                return fcrw.a(fbndVar.a(fbrkVar, eqmqVarY.b), eqiqVar4);
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
    }

    @Override // defpackage.cpmc
    public final eiju e(final ekgb ekgbVar) {
        return i(new Function() { // from class: ttq
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                eqny eqnyVar = (eqny) obj;
                String str = eqnyVar.d;
                ekgb ekgbVar2 = ekgbVar;
                tvi.ab("batchGetParticipants", str, ekgbVar2.size());
                eqmq eqmqVarY = this.a.Y();
                eqiu eqiuVar = eqiu.a;
                eqit eqitVar = (eqit) eqiuVar.createBuilder();
                eqitVar.copyOnWrite();
                eqiu eqiuVar2 = (eqiu) eqitVar.instance;
                eqnyVar.getClass();
                eqiuVar2.c = eqnyVar;
                eqiuVar2.b |= 1;
                eqitVar.copyOnWrite();
                eqiu eqiuVar3 = (eqiu) eqitVar.instance;
                evtg evtgVar = eqiuVar3.d;
                if (!evtgVar.c()) {
                    eqiuVar3.d = evsn.mutableCopy(evtgVar);
                }
                evpz.addAll(ekgbVar2, eqiuVar3.d);
                eqiu eqiuVar4 = (eqiu) eqitVar.build();
                fbnd fbndVar = eqmqVarY.a;
                fbrk fbrkVar = eqmr.x;
                if (fbrkVar == null) {
                    synchronized (eqmr.class) {
                        fbrkVar = eqmr.x;
                        if (fbrkVar == null) {
                            fbrh fbrhVarA = fbrk.a();
                            fbrhVarA.c = fbrj.UNARY;
                            fbrhVarA.d = fbrk.c("google.communications.jibemessagestore.v1.MessageStore", "BatchGetParticipants");
                            fbrhVarA.b();
                            evrr evrrVar = fcrj.a;
                            fbrhVarA.a = new fcrh(eqiuVar);
                            fbrhVarA.b = new fcrh(eqiw.a);
                            fbrk fbrkVarA = fbrhVarA.a();
                            eqmr.x = fbrkVarA;
                            fbrkVar = fbrkVarA;
                        }
                    }
                }
                return fcrw.a(fbndVar.a(fbrkVar, eqmqVarY.b), eqiuVar4);
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).h(new ejvr() { // from class: ttr
            /* JADX WARN: Multi-variable type inference failed */
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                eqiw eqiwVar = (eqiw) obj;
                eksp ekspVar = tvi.a;
                int size = eqiwVar.c.size();
                ekgb ekgbVar2 = ekgbVar;
                if (size != ekgbVar2.size() || eqiwVar.b.size() != ekgbVar2.size()) {
                    exmy exmyVar = exmy.a;
                    throw new cpma();
                }
                ekgi ekgiVar = new ekgi();
                for (int i = 0; i < ekgbVar2.size(); i++) {
                    String str = (String) ekgbVar2.get(i);
                    exmy exmyVar2 = (exmy) eqiwVar.c.get(i);
                    eqnl eqnlVar = (eqnl) eqiwVar.b.get(i);
                    if (exmyVar2.b == Status.Code.NOT_FOUND.value()) {
                        ekgiVar.i(str, Optional.empty());
                    } else {
                        if (exmyVar2.b != Status.Code.OK.value()) {
                            throw new cpma((String) ekgbVar2.get(i), "At least one participant lookup failed");
                        }
                        if (!str.equals(eqnlVar.c)) {
                            exmx exmxVar = (exmx) exmy.a.createBuilder();
                            int iValue = Status.Code.FAILED_PRECONDITION.value();
                            exmxVar.copyOnWrite();
                            ((exmy) exmxVar.instance).b = iValue;
                            throw new cpma(str, "Participant Id does not match lookup Id");
                        }
                        ekgiVar.i(str, Optional.of(eqnlVar));
                    }
                }
                return ekgiVar.c();
            }
        }, this.h);
    }

    @Override // defpackage.cpmc
    public final eiju f(final eqnd eqndVar, boolean z) {
        return al(z, new Function() { // from class: ttf
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                eqny eqnyVar = (eqny) obj;
                tvi.aa("createObject", eqnyVar.d);
                eqmq eqmqVarY = this.a.Y();
                eqkb eqkbVar = (eqkb) eqkc.a.createBuilder();
                eqkbVar.copyOnWrite();
                eqkc eqkcVar = (eqkc) eqkbVar.instance;
                eqnyVar.getClass();
                eqkcVar.c = eqnyVar;
                eqkcVar.b |= 1;
                eqkbVar.copyOnWrite();
                eqkc eqkcVar2 = (eqkc) eqkbVar.instance;
                eqnd eqndVar2 = eqndVar;
                eqndVar2.getClass();
                eqkcVar2.d = eqndVar2;
                eqkcVar2.b |= 2;
                return eqmqVarY.b((eqkc) eqkbVar.build());
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
    }

    @Override // defpackage.cpmc
    public final eiju g(final String str, boolean z) {
        eiju eijuVarAl = al(z, new Function() { // from class: tve
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                eqny eqnyVar = (eqny) obj;
                tvi.aa("deleteObject", eqnyVar.d);
                eqmq eqmqVarY = this.a.Y();
                eqkg eqkgVar = eqkg.a;
                eqkf eqkfVar = (eqkf) eqkgVar.createBuilder();
                eqkfVar.copyOnWrite();
                eqkg eqkgVar2 = (eqkg) eqkfVar.instance;
                eqnyVar.getClass();
                eqkgVar2.c = eqnyVar;
                eqkgVar2.b |= 1;
                eqkfVar.copyOnWrite();
                eqkg eqkgVar3 = (eqkg) eqkfVar.instance;
                String str2 = str;
                str2.getClass();
                eqkgVar3.d = str2;
                eqkg eqkgVar4 = (eqkg) eqkfVar.build();
                fbnd fbndVar = eqmqVarY.a;
                fbrk fbrkVar = eqmr.d;
                if (fbrkVar == null) {
                    synchronized (eqmr.class) {
                        fbrkVar = eqmr.d;
                        if (fbrkVar == null) {
                            fbrh fbrhVarA = fbrk.a();
                            fbrhVarA.c = fbrj.UNARY;
                            fbrhVarA.d = fbrk.c("google.communications.jibemessagestore.v1.MessageStore", "DeleteObject");
                            fbrhVarA.b();
                            evrr evrrVar = fcrj.a;
                            fbrhVarA.a = new fcrh(eqkgVar);
                            fbrhVarA.b = new fcrh(evrl.a);
                            fbrk fbrkVarA = fbrhVarA.a();
                            eqmr.d = fbrkVarA;
                            fbrkVar = fbrkVarA;
                        }
                    }
                }
                return fcrw.a(fbndVar.a(fbrkVar, eqmqVarY.b), eqkgVar4);
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        ejvr ejvrVar = new ejvr() { // from class: tvf
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                eksp ekspVar = tvi.a;
                return true;
            }
        };
        eosc eoscVar = this.h;
        return eijuVarAl.h(ejvrVar, eoscVar).f(fbtf.class, new eooz() { // from class: tvg
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                fbtf fbtfVar = (fbtf) obj;
                Status status = fbtfVar.a;
                eksp ekspVar = tvi.a;
                return status.getCode().equals(Status.Code.NOT_FOUND) ? eijx.e(false) : eijx.d(fbtfVar);
            }
        }, eoscVar);
    }

    @Override // defpackage.cpmc
    public final eiju h(final String str, boolean z) {
        eiju eijuVarAl = al(z, new Function() { // from class: tts
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                eqny eqnyVar = (eqny) obj;
                tvi.aa("deleteParticipant", eqnyVar.d);
                eqmq eqmqVarY = this.a.Y();
                eqki eqkiVar = eqki.a;
                eqkh eqkhVar = (eqkh) eqkiVar.createBuilder();
                eqkhVar.copyOnWrite();
                eqki eqkiVar2 = (eqki) eqkhVar.instance;
                eqnyVar.getClass();
                eqkiVar2.c = eqnyVar;
                eqkiVar2.b |= 1;
                eqkhVar.copyOnWrite();
                eqki eqkiVar3 = (eqki) eqkhVar.instance;
                String str2 = str;
                str2.getClass();
                eqkiVar3.d = str2;
                eqki eqkiVar4 = (eqki) eqkhVar.build();
                fbnd fbndVar = eqmqVarY.a;
                fbrk fbrkVar = eqmr.v;
                if (fbrkVar == null) {
                    synchronized (eqmr.class) {
                        fbrkVar = eqmr.v;
                        if (fbrkVar == null) {
                            fbrh fbrhVarA = fbrk.a();
                            fbrhVarA.c = fbrj.UNARY;
                            fbrhVarA.d = fbrk.c("google.communications.jibemessagestore.v1.MessageStore", "DeleteParticipant");
                            fbrhVarA.b();
                            evrr evrrVar = fcrj.a;
                            fbrhVarA.a = new fcrh(eqkiVar);
                            fbrhVarA.b = new fcrh(evrl.a);
                            fbrk fbrkVarA = fbrhVarA.a();
                            eqmr.v = fbrkVarA;
                            fbrkVar = fbrkVarA;
                        }
                    }
                }
                return fcrw.a(fbndVar.a(fbrkVar, eqmqVarY.b), eqkiVar4);
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        ejvr ejvrVar = new ejvr() { // from class: ttt
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                eksp ekspVar = tvi.a;
                return true;
            }
        };
        eosc eoscVar = this.h;
        return eijuVarAl.h(ejvrVar, eoscVar).f(fbtf.class, new eooz() { // from class: ttu
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                fbtf fbtfVar = (fbtf) obj;
                Status status = fbtfVar.a;
                eksp ekspVar = tvi.a;
                return status.getCode().equals(Status.Code.NOT_FOUND) ? eijx.e(false) : eijx.d(fbtfVar);
            }
        }, eoscVar);
    }

    final eiju i(Function function) {
        tvr tvrVar = this.f;
        eiju eijuVarA = tvrVar.a(tvrVar.c());
        tvl tvlVar = new tvl(tvrVar);
        eosc eoscVar = tvrVar.c;
        eiju eijuVarH = eijuVarA.i(tvlVar, eoscVar).h(new tvo(), eoscVar);
        ttb ttbVar = new ttb(function);
        eosc eoscVar2 = this.h;
        return eijuVarH.i(ttbVar, eoscVar2).f(fbtf.class, new tta(this), eoscVar2);
    }

    @Override // defpackage.cpmc
    public final eiju j() {
        return aj(new Function() { // from class: ttn
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                eqny eqnyVar = (eqny) obj;
                tvi.aa("exportUserDataReference", eqnyVar.d);
                eqmq eqmqVarY = this.a.Y();
                eqkl eqklVar = eqkl.a;
                eqkk eqkkVar = (eqkk) eqklVar.createBuilder();
                eqkkVar.copyOnWrite();
                eqkl eqklVar2 = (eqkl) eqkkVar.instance;
                eqnyVar.getClass();
                eqklVar2.c = eqnyVar;
                eqklVar2.b |= 1;
                eqkl eqklVar3 = (eqkl) eqkkVar.build();
                fbnd fbndVar = eqmqVarY.a;
                fbrk fbrkVar = eqmr.E;
                if (fbrkVar == null) {
                    synchronized (eqmr.class) {
                        fbrkVar = eqmr.E;
                        if (fbrkVar == null) {
                            fbrh fbrhVarA = fbrk.a();
                            fbrhVarA.c = fbrj.UNARY;
                            fbrhVarA.d = fbrk.c("google.communications.jibemessagestore.v1.MessageStore", "ExportUserDataReference");
                            fbrhVarA.b();
                            evrr evrrVar = fcrj.a;
                            fbrhVarA.a = new fcrh(eqklVar);
                            fbrhVarA.b = new fcrh(eqko.a);
                            fbrk fbrkVarA = fbrhVarA.a();
                            eqmr.E = fbrkVarA;
                            fbrkVar = fbrkVarA;
                        }
                    }
                }
                return fcrw.a(fbndVar.a(fbrkVar, eqmqVarY.b), eqklVar3);
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
    }

    @Override // defpackage.cpmc
    public final eiju k(evrw evrwVar) {
        eqny eqnyVarD = this.f.d();
        aa("getBox", eqnyVarD.d);
        eqks eqksVar = eqks.a;
        eqkr eqkrVar = (eqkr) eqksVar.createBuilder();
        eqkrVar.copyOnWrite();
        eqks eqksVar2 = (eqks) eqkrVar.instance;
        eqnyVarD.getClass();
        eqksVar2.c = eqnyVarD;
        eqksVar2.b |= 1;
        eqkrVar.copyOnWrite();
        eqks eqksVar3 = (eqks) eqkrVar.instance;
        evrwVar.getClass();
        eqksVar3.d = evrwVar;
        eqksVar3.b |= 2;
        eqks eqksVar4 = (eqks) eqkrVar.build();
        eqmq eqmqVarY = Y();
        fbnd fbndVar = eqmqVarY.a;
        fbrk fbrkVar = eqmr.q;
        if (fbrkVar == null) {
            synchronized (eqmr.class) {
                fbrkVar = eqmr.q;
                if (fbrkVar == null) {
                    fbrh fbrhVarA = fbrk.a();
                    fbrhVarA.c = fbrj.UNARY;
                    fbrhVarA.d = fbrk.c("google.communications.jibemessagestore.v1.MessageStore", "GetBox");
                    fbrhVarA.b();
                    evrr evrrVar = fcrj.a;
                    fbrhVarA.a = new fcrh(eqksVar);
                    fbrhVarA.b = new fcrh(eqiz.b);
                    fbrk fbrkVarA = fbrhVarA.a();
                    eqmr.q = fbrkVarA;
                    fbrkVar = fbrkVarA;
                }
            }
        }
        return eiju.g(fcrw.a(fbndVar.a(fbrkVar, eqmqVarY.b), eqksVar4));
    }

    @Override // defpackage.cpmc
    public final eiju l() {
        eiju eijuVarS = s("cms_daily_timestamp");
        ejvr ejvrVar = new ejvr() { // from class: tsw
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                fbtf fbtfVar = (fbtf) obj;
                Status status = fbtfVar.a;
                eksp ekspVar = tvi.a;
                if (status.getCode() != Status.Code.NOT_FOUND) {
                    throw fbtfVar;
                }
                ((eksl) ((eksl) tvi.a.h()).h("com/google/android/apps/messaging/cloudstore/grpc/CloudMessageStoreClientImpl", "getCmsCurrentTimestamp", 1400, "CloudMessageStoreClientImpl.java")).q("CMS Timestamp Object not found with correlation id cms_daily_timestamp.");
                return eqnd.a;
            }
        };
        eosc eoscVar = this.h;
        return eijuVarS.e(fbtf.class, ejvrVar, eoscVar).i(new eooz() { // from class: tsy
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) throws PackageManager.NameNotFoundException {
                final eqnd eqndVar = (eqnd) obj;
                eqnd eqndVar2 = eqnd.a;
                boolean zEquals = eqndVar.equals(eqndVar2);
                final tvi tviVar = this.a;
                if (!zEquals) {
                    ((eksl) ((eksl) tvi.a.h()).h("com/google/android/apps/messaging/cloudstore/grpc/CloudMessageStoreClientImpl", "getCmsCurrentTimestamp", 1417, "CloudMessageStoreClientImpl.java")).q("Updating CMS Timestamp Object.");
                    evrv evrvVar = (evrv) evrw.a.createBuilder();
                    evrvVar.a("labels");
                    evrvVar.a("payload");
                    final evrw evrwVar = (evrw) evrvVar.build();
                    tvr tvrVar = tviVar.f;
                    final eqmi eqmiVar = eqmi.a;
                    eiju eijuVarE = tvrVar.e(4);
                    eooz eoozVar = new eooz() { // from class: ttw
                        @Override // defpackage.eooz
                        public final ListenableFuture a(Object obj2) {
                            eqny eqnyVar = (eqny) obj2;
                            tvi.aa("updateObject", eqnyVar.d);
                            eqoj eqojVar = (eqoj) eqok.a.createBuilder();
                            eqojVar.copyOnWrite();
                            eqok eqokVar = (eqok) eqojVar.instance;
                            eqnyVar.getClass();
                            eqokVar.c = eqnyVar;
                            eqokVar.b |= 1;
                            eqojVar.copyOnWrite();
                            eqok eqokVar2 = (eqok) eqojVar.instance;
                            eqnd eqndVar3 = eqndVar;
                            eqndVar3.getClass();
                            eqokVar2.d = eqndVar3;
                            eqokVar2.b |= 2;
                            eqojVar.copyOnWrite();
                            eqok eqokVar3 = (eqok) eqojVar.instance;
                            evrw evrwVar2 = evrwVar;
                            evrwVar2.getClass();
                            eqokVar3.e = evrwVar2;
                            eqokVar3.b |= 4;
                            eqojVar.copyOnWrite();
                            eqok eqokVar4 = (eqok) eqojVar.instance;
                            eqmi eqmiVar2 = eqmiVar;
                            eqmiVar2.getClass();
                            eqokVar4.f = eqmiVar2;
                            eqokVar4.b |= 8;
                            return tviVar.Y().g((eqok) eqojVar.build());
                        }
                    };
                    eosc eoscVar2 = tviVar.h;
                    return eijuVarE.i(eoozVar, eoscVar2).f(fbtf.class, new tta(tviVar), eoscVar2);
                }
                eqnc eqncVar = (eqnc) eqndVar2.createBuilder();
                eqncVar.copyOnWrite();
                ((eqnd) eqncVar.instance).d = "root";
                eqncVar.copyOnWrite();
                ((eqnd) eqncVar.instance).e = eqnh.a(4);
                eqncVar.copyOnWrite();
                ((eqnd) eqncVar.instance).k = "cms_daily_timestamp";
                eqncVar.a("cms_daily_timestamp");
                eqnr eqnrVar = (eqnr) eqns.a.createBuilder();
                eqnt eqntVar = (eqnt) eqnu.a.createBuilder();
                eqntVar.copyOnWrite();
                ((eqnu) eqntVar.instance).f = "cms_daily_timestamp@message.cms.google";
                eqntVar.copyOnWrite();
                ((eqnu) eqntVar.instance).e = "message/encrypted";
                evqe evqeVar = evqe.a;
                evqd evqdVar = (evqd) evqeVar.createBuilder();
                evqdVar.copyOnWrite();
                ((evqe) evqdVar.instance).b = "type.googleapis.com/communication.messages.proto.cloud_store.encrypted_data.EncryptedData";
                epkg epkgVar = (epkg) epkh.a.createBuilder();
                epkgVar.copyOnWrite();
                ((epkh) epkgVar.instance).c = -1;
                evqs byteString = evqeVar.toByteString();
                epkgVar.copyOnWrite();
                ((epkh) epkgVar.instance).b = byteString;
                evqs byteString2 = ((epkh) epkgVar.build()).toByteString();
                evqdVar.copyOnWrite();
                ((evqe) evqdVar.instance).c = byteString2;
                eqntVar.copyOnWrite();
                eqnu eqnuVar = (eqnu) eqntVar.instance;
                evqe evqeVar2 = (evqe) evqdVar.build();
                evqeVar2.getClass();
                eqnuVar.g = evqeVar2;
                eqnuVar.b |= 1;
                eqnrVar.a((eqnu) eqntVar.build());
                eqncVar.copyOnWrite();
                eqnd eqndVar3 = (eqnd) eqncVar.instance;
                eqns eqnsVar = (eqns) eqnrVar.build();
                eqnsVar.getClass();
                eqndVar3.i = eqnsVar;
                eqndVar3.b |= 4;
                final eqnd eqndVar4 = (eqnd) eqncVar.build();
                ((eksl) ((eksl) tvi.a.h()).h("com/google/android/apps/messaging/cloudstore/grpc/CloudMessageStoreClientImpl", "getCmsCurrentTimestamp", 1413, "CloudMessageStoreClientImpl.java")).q("Creating new CMS Timestamp Object.");
                eiju eijuVarE2 = tviVar.f.e(4);
                eooz eoozVar2 = new eooz() { // from class: ttz
                    @Override // defpackage.eooz
                    public final ListenableFuture a(Object obj2) {
                        eqny eqnyVar = (eqny) obj2;
                        tvi.aa("createObject", eqnyVar.d);
                        eqkb eqkbVar = (eqkb) eqkc.a.createBuilder();
                        eqkbVar.copyOnWrite();
                        eqkc eqkcVar = (eqkc) eqkbVar.instance;
                        eqnyVar.getClass();
                        eqkcVar.c = eqnyVar;
                        eqkcVar.b |= 1;
                        eqkbVar.copyOnWrite();
                        eqkc eqkcVar2 = (eqkc) eqkbVar.instance;
                        eqnd eqndVar5 = eqndVar4;
                        eqndVar5.getClass();
                        eqkcVar2.d = eqndVar5;
                        eqkcVar2.b |= 2;
                        return tviVar.Y().b((eqkc) eqkbVar.build());
                    }
                };
                eosc eoscVar3 = tviVar.h;
                return eijuVarE2.i(eoozVar2, eoscVar3).f(fbtf.class, new tta(tviVar), eoscVar3);
            }
        }, eoscVar).h(new ejvr() { // from class: tsz
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                eksp ekspVar = tvi.a;
                evvp evvpVarD = evxc.d(((eqnd) obj).j);
                ((eksl) ((eksl) tvi.a.h()).h("com/google/android/apps/messaging/cloudstore/grpc/CloudMessageStoreClientImpl", "getCmsCurrentTimestamp", 1428, "CloudMessageStoreClientImpl.java")).t("Obtained cmsTimestampObject with timestamp: %s", evxc.h(evvpVarD));
                return evvpVarD;
            }
        }, eoscVar).f(fbtf.class, new tta(this), eoscVar);
    }

    @Override // defpackage.cpmc
    public final eiju m(final String str) {
        return i(new Function() { // from class: tub
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                eqny eqnyVar = (eqny) obj;
                tvi.aa("getConversation", eqnyVar.d);
                eqmq eqmqVarY = this.a.Y();
                eqkw eqkwVar = eqkw.a;
                eqkv eqkvVar = (eqkv) eqkwVar.createBuilder();
                eqkvVar.copyOnWrite();
                eqkw eqkwVar2 = (eqkw) eqkvVar.instance;
                eqnyVar.getClass();
                eqkwVar2.c = eqnyVar;
                eqkwVar2.b |= 1;
                eqkvVar.copyOnWrite();
                eqkw eqkwVar3 = (eqkw) eqkvVar.instance;
                String str2 = str;
                str2.getClass();
                eqkwVar3.d = str2;
                eqkw eqkwVar4 = (eqkw) eqkvVar.build();
                fbnd fbndVar = eqmqVarY.a;
                fbrk fbrkVar = eqmr.h;
                if (fbrkVar == null) {
                    synchronized (eqmr.class) {
                        fbrkVar = eqmr.h;
                        if (fbrkVar == null) {
                            fbrh fbrhVarA = fbrk.a();
                            fbrhVarA.c = fbrj.UNARY;
                            fbrhVarA.d = fbrk.c("google.communications.jibemessagestore.v1.MessageStore", "GetConversation");
                            fbrhVarA.b();
                            evrr evrrVar = fcrj.a;
                            fbrhVarA.a = new fcrh(eqkwVar);
                            fbrhVarA.b = new fcrh(eqjv.a);
                            fbrk fbrkVarA = fbrhVarA.a();
                            eqmr.h = fbrkVarA;
                            fbrkVar = fbrkVarA;
                        }
                    }
                }
                return fcrw.a(fbndVar.a(fbrkVar, eqmqVarY.b), eqkwVar4);
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
    }

    @Override // defpackage.cpmc
    public final eiju n(final String str) {
        return i(new Function() { // from class: tvh
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                eqny eqnyVar = (eqny) obj;
                tvi.aa("getConversationByCorrelationId", eqnyVar.d);
                eqmq eqmqVarY = this.a.Y();
                eqku eqkuVar = eqku.a;
                eqkt eqktVar = (eqkt) eqkuVar.createBuilder();
                eqktVar.copyOnWrite();
                eqku eqkuVar2 = (eqku) eqktVar.instance;
                eqnyVar.getClass();
                eqkuVar2.c = eqnyVar;
                eqkuVar2.b |= 1;
                eqktVar.copyOnWrite();
                eqku eqkuVar3 = (eqku) eqktVar.instance;
                String str2 = str;
                str2.getClass();
                eqkuVar3.d = str2;
                eqku eqkuVar4 = (eqku) eqktVar.build();
                fbnd fbndVar = eqmqVarY.a;
                fbrk fbrkVar = eqmr.l;
                if (fbrkVar == null) {
                    synchronized (eqmr.class) {
                        fbrkVar = eqmr.l;
                        if (fbrkVar == null) {
                            fbrh fbrhVarA = fbrk.a();
                            fbrhVarA.c = fbrj.UNARY;
                            fbrhVarA.d = fbrk.c("google.communications.jibemessagestore.v1.MessageStore", "GetConversationByCorrelationId");
                            fbrhVarA.b();
                            evrr evrrVar = fcrj.a;
                            fbrhVarA.a = new fcrh(eqkuVar);
                            fbrhVarA.b = new fcrh(eqjv.a);
                            fbrk fbrkVarA = fbrhVarA.a();
                            eqmr.l = fbrkVarA;
                            fbrkVar = fbrkVarA;
                        }
                    }
                }
                return fcrw.a(fbndVar.a(fbrkVar, eqmqVarY.b), eqkuVar4);
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
    }

    @Override // defpackage.cpmc
    public final eiju o() {
        return i(new Function() { // from class: tuv
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                eqny eqnyVar = (eqny) obj;
                tvi.aa("listConversations", eqnyVar.d);
                eqlr eqlrVar = (eqlr) eqls.a.createBuilder();
                eqlrVar.copyOnWrite();
                eqls eqlsVar = (eqls) eqlrVar.instance;
                eqnyVar.getClass();
                eqlsVar.c = eqnyVar;
                eqlsVar.b |= 1;
                eqlrVar.copyOnWrite();
                ((eqls) eqlrVar.instance).i = 0;
                return this.a.C((eqls) eqlrVar.build()).h(new ejvr() { // from class: tst
                    @Override // defpackage.ejvr
                    public final Object apply(Object obj2) {
                        int i = ((cpvs) obj2).c;
                        eksp ekspVar = tvi.a;
                        return Integer.valueOf(i);
                    }
                }, eoqg.a);
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
    }

    @Override // defpackage.cpmc
    public final eiju p() {
        return i(new Function() { // from class: ttj
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                eqny eqnyVar = (eqny) obj;
                tvi.aa("listObjects", eqnyVar.d);
                eqlz eqlzVar = (eqlz) eqma.a.createBuilder();
                eqlzVar.copyOnWrite();
                eqma eqmaVar = (eqma) eqlzVar.instance;
                eqnyVar.getClass();
                eqmaVar.c = eqnyVar;
                eqmaVar.b |= 1;
                eqlzVar.copyOnWrite();
                ((eqma) eqlzVar.instance).d = "inbox";
                eqlzVar.copyOnWrite();
                ((eqma) eqlzVar.instance).f = 0;
                return this.a.L((eqma) eqlzVar.build()).h(new ejvr() { // from class: tth
                    @Override // defpackage.ejvr
                    public final Object apply(Object obj2) {
                        int i = ((cpvs) obj2).c;
                        eksp ekspVar = tvi.a;
                        return Integer.valueOf(i);
                    }
                }, eoqg.a);
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
    }

    @Override // defpackage.cpmc
    public final eiju q(final String str) {
        return i(new Function() { // from class: tvd
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                eqny eqnyVar = (eqny) obj;
                tvi.aa("getObject", eqnyVar.d);
                eqmq eqmqVarY = this.a.Y();
                eqla eqlaVar = eqla.a;
                eqkz eqkzVar = (eqkz) eqlaVar.createBuilder();
                eqkzVar.copyOnWrite();
                eqla eqlaVar2 = (eqla) eqkzVar.instance;
                eqnyVar.getClass();
                eqlaVar2.c = eqnyVar;
                eqlaVar2.b |= 1;
                eqkzVar.copyOnWrite();
                eqla eqlaVar3 = (eqla) eqkzVar.instance;
                String str2 = str;
                str2.getClass();
                eqlaVar3.d = str2;
                eqla eqlaVar4 = (eqla) eqkzVar.build();
                fbnd fbndVar = eqmqVarY.a;
                fbrk fbrkVar = eqmr.b;
                if (fbrkVar == null) {
                    synchronized (eqmr.class) {
                        fbrkVar = eqmr.b;
                        if (fbrkVar == null) {
                            fbrh fbrhVarA = fbrk.a();
                            fbrhVarA.c = fbrj.UNARY;
                            fbrhVarA.d = fbrk.c("google.communications.jibemessagestore.v1.MessageStore", "GetObject");
                            fbrhVarA.b();
                            evrr evrrVar = fcrj.a;
                            fbrhVarA.a = new fcrh(eqlaVar);
                            fbrhVarA.b = new fcrh(eqnd.a);
                            fbrk fbrkVarA = fbrhVarA.a();
                            eqmr.b = fbrkVarA;
                            fbrkVar = fbrkVarA;
                        }
                    }
                }
                return fcrw.a(fbndVar.a(fbrkVar, eqmqVarY.b), eqlaVar4);
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
    }

    @Override // defpackage.cpmc
    public final eiju r(final String str) {
        return i(new Function() { // from class: ttl
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                eqny eqnyVar = (eqny) obj;
                tvi.aa("getObjectByCorrelationId", eqnyVar.d);
                eqmq eqmqVarY = this.a.Y();
                eqkx eqkxVar = (eqkx) eqky.a.createBuilder();
                eqkxVar.copyOnWrite();
                eqky eqkyVar = (eqky) eqkxVar.instance;
                eqnyVar.getClass();
                eqkyVar.c = eqnyVar;
                eqkyVar.b |= 1;
                eqkxVar.copyOnWrite();
                ((eqky) eqkxVar.instance).d = str;
                return eqmqVarY.c((eqky) eqkxVar.build());
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
    }

    @Override // defpackage.cpmc
    public final eiju s(String str) {
        eqny eqnyVarD = this.f.d();
        aa("getObjectByCorrelationIdAcrossDevices", eqnyVarD.d);
        eqmq eqmqVarY = Y();
        eqkx eqkxVar = (eqkx) eqky.a.createBuilder();
        eqkxVar.copyOnWrite();
        eqky eqkyVar = (eqky) eqkxVar.instance;
        eqnyVarD.getClass();
        eqkyVar.c = eqnyVarD;
        eqkyVar.b |= 1;
        eqkxVar.copyOnWrite();
        ((eqky) eqkxVar.instance).d = str;
        return eiju.g(eqmqVarY.c((eqky) eqkxVar.build()));
    }

    @Override // defpackage.cpmc
    public final eiju t(final String str) {
        return i(new Function() { // from class: ttp
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                eqny eqnyVar = (eqny) obj;
                tvi.aa("getParticipants", eqnyVar.d);
                eqmq eqmqVarY = this.a.Y();
                eqlc eqlcVar = eqlc.a;
                eqlb eqlbVar = (eqlb) eqlcVar.createBuilder();
                eqlbVar.copyOnWrite();
                eqlc eqlcVar2 = (eqlc) eqlbVar.instance;
                eqnyVar.getClass();
                eqlcVar2.c = eqnyVar;
                eqlcVar2.b |= 1;
                eqlbVar.copyOnWrite();
                eqlc eqlcVar3 = (eqlc) eqlbVar.instance;
                String str2 = str;
                str2.getClass();
                eqlcVar3.d = str2;
                eqlc eqlcVar4 = (eqlc) eqlbVar.build();
                fbnd fbndVar = eqmqVarY.a;
                fbrk fbrkVar = eqmr.w;
                if (fbrkVar == null) {
                    synchronized (eqmr.class) {
                        fbrkVar = eqmr.w;
                        if (fbrkVar == null) {
                            fbrh fbrhVarA = fbrk.a();
                            fbrhVarA.c = fbrj.UNARY;
                            fbrhVarA.d = fbrk.c("google.communications.jibemessagestore.v1.MessageStore", "GetParticipant");
                            fbrhVarA.b();
                            evrr evrrVar = fcrj.a;
                            fbrhVarA.a = new fcrh(eqlcVar);
                            fbrhVarA.b = new fcrh(eqnl.a);
                            fbrk fbrkVarA = fbrhVarA.a();
                            eqmr.w = fbrkVarA;
                            fbrkVar = fbrkVarA;
                        }
                    }
                }
                return fcrw.a(fbndVar.a(fbrkVar, eqmqVarY.b), eqlcVar4);
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
    }

    @Override // defpackage.cpmc
    public final eiju u() {
        return i(new Function() { // from class: ttd
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                eqny eqnyVar = (eqny) obj;
                tvi.aa("listParticipants", eqnyVar.d);
                eqmd eqmdVar = (eqmd) eqme.a.createBuilder();
                eqmdVar.copyOnWrite();
                eqme eqmeVar = (eqme) eqmdVar.instance;
                eqnyVar.getClass();
                eqmeVar.c = eqnyVar;
                eqmeVar.b |= 1;
                eqmdVar.copyOnWrite();
                ((eqme) eqmdVar.instance).i = 0;
                return this.a.O((eqme) eqmdVar.build()).h(new ejvr() { // from class: tue
                    @Override // defpackage.ejvr
                    public final Object apply(Object obj2) {
                        int i = ((cpvs) obj2).c;
                        eksp ekspVar = tvi.a;
                        return Integer.valueOf(i);
                    }
                }, eoqg.a);
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
    }

    @Override // defpackage.cpmc
    public final eiju v() {
        eqny eqnyVarD = this.f.d();
        aa("listBoxEvents", eqnyVarD.d);
        eqmq eqmqVarY = Y();
        eqlk eqlkVar = eqlk.a;
        eqlj eqljVar = (eqlj) eqlkVar.createBuilder();
        eqljVar.copyOnWrite();
        eqlk eqlkVar2 = (eqlk) eqljVar.instance;
        eqnyVarD.getClass();
        eqlkVar2.c = eqnyVarD;
        eqlkVar2.b |= 1;
        eqljVar.copyOnWrite();
        eqlk eqlkVar3 = (eqlk) eqljVar.instance;
        evsx evsxVar = eqlkVar3.d;
        if (!evsxVar.c()) {
            eqlkVar3.d = evsn.mutableCopy(evsxVar);
        }
        eqlkVar3.d.h(6);
        eqljVar.copyOnWrite();
        ((eqlk) eqljVar.instance).e = 1;
        eqlk eqlkVar4 = (eqlk) eqljVar.build();
        fbnd fbndVar = eqmqVarY.a;
        fbrk fbrkVar = eqmr.r;
        if (fbrkVar == null) {
            synchronized (eqmr.class) {
                fbrkVar = eqmr.r;
                if (fbrkVar == null) {
                    fbrh fbrhVarA = fbrk.a();
                    fbrhVarA.c = fbrj.UNARY;
                    fbrhVarA.d = fbrk.c("google.communications.jibemessagestore.v1.MessageStore", "ListBoxEvents");
                    fbrhVarA.b();
                    evrr evrrVar = fcrj.a;
                    fbrhVarA.a = new fcrh(eqlkVar);
                    fbrhVarA.b = new fcrh(eqlm.a);
                    fbrk fbrkVarA = fbrhVarA.a();
                    eqmr.r = fbrkVarA;
                    fbrkVar = fbrkVarA;
                }
            }
        }
        return eiju.g(fcrw.a(fbndVar.a(fbrkVar, eqmqVarY.b), eqlkVar4)).h(new ejvr() { // from class: tsv
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                eksp ekspVar = tvi.a;
                return Collection.EL.stream(((eqlm) obj).b).findFirst().map(new Function() { // from class: ttv
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo536andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj2) {
                        evvp evvpVar = ((eqjf) obj2).b;
                        return evvpVar == null ? evvp.a : evvpVar;
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                });
            }
        }, eoqg.a);
    }

    @Override // defpackage.cpmc
    public final eiju w() {
        eqny eqnyVarD = this.f.d();
        aa("listObjects", eqnyVarD.d);
        eqlz eqlzVar = (eqlz) eqma.a.createBuilder();
        eqlzVar.copyOnWrite();
        eqma eqmaVar = (eqma) eqlzVar.instance;
        eqnyVarD.getClass();
        eqmaVar.c = eqnyVarD;
        eqmaVar.b |= 1;
        eqlzVar.copyOnWrite();
        ((eqma) eqlzVar.instance).d = "root";
        eqlzVar.a("encrypted_backup_key");
        return eiju.g(Y().e((eqma) eqlzVar.build())).h(new ejvr() { // from class: tuu
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                eksp ekspVar = tvi.a;
                return Boolean.valueOf(((eqmc) obj).b.size() > 0);
            }
        }, eoqg.a);
    }

    @Override // defpackage.cpmc
    public final eiju x() {
        eqny eqnyVarD = this.f.d();
        aa("listObjects", eqnyVarD.d);
        eqlz eqlzVar = (eqlz) eqma.a.createBuilder();
        eqlzVar.copyOnWrite();
        eqma eqmaVar = (eqma) eqlzVar.instance;
        eqnyVarD.getClass();
        eqmaVar.c = eqnyVarD;
        eqmaVar.b |= 1;
        eqlzVar.copyOnWrite();
        ((eqma) eqlzVar.instance).d = "root";
        eqlzVar.a("backup_key");
        return eiju.g(Y().e((eqma) eqlzVar.build())).h(new ejvr() { // from class: tum
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                eksp ekspVar = tvi.a;
                return Boolean.valueOf(((eqmc) obj).b.size() > 0);
            }
        }, eoqg.a);
    }

    @Override // defpackage.cpmc
    public final eiju y() {
        final ArrayList arrayList = new ArrayList();
        arrayList.add("backup_key");
        if (cpyl.a()) {
            arrayList.add("encrypted_backup_key");
        }
        return i(new Function() { // from class: tva
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                eqny eqnyVar = (eqny) obj;
                tvi.aa("listObjects", eqnyVar.d);
                eqlz eqlzVar = (eqlz) eqma.a.createBuilder();
                eqlzVar.copyOnWrite();
                eqma eqmaVar = (eqma) eqlzVar.instance;
                eqnyVar.getClass();
                eqmaVar.c = eqnyVar;
                eqmaVar.b |= 1;
                eqlzVar.copyOnWrite();
                ((eqma) eqlzVar.instance).d = "root";
                eqlzVar.copyOnWrite();
                eqma eqmaVar2 = (eqma) eqlzVar.instance;
                eqmaVar2.a();
                evpz.addAll(arrayList, eqmaVar2.e);
                return this.a.L((eqma) eqlzVar.build());
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
    }

    @Override // defpackage.cpmc
    public final eiju z(String str) {
        return A(str, ((Boolean) ((cczi) cpyl.T.get()).e()).booleanValue());
    }
}
