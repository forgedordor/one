package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.MessageData;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class ckxr implements ckxk {
    public static final eksp a = eksp.c("BugleReactions");
    private boolean A;
    public final ckvy b;
    public final cklf c;
    public final cklg d;
    public final fcsu e;
    public final arxn f;
    public final arxp g;
    public final arxq h;
    public final fcsu i;
    public final eyga j;
    public basd k;
    public MessageIdType l = bary.a;
    public ezgd m;
    private final ckxj n;
    private final fcsu o;
    private final fcsu p;
    private final fcsu q;
    private final fcsu r;
    private final fcsu s;
    private final String t;
    private final ConversationIdType u;
    private Boolean v;
    private ckmc w;
    private ckmb x;
    private boolean y;
    private boolean z;

    public ckxr(ckvy ckvyVar, ckxj ckxjVar, cklf cklfVar, cklg cklgVar, fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3, fcsu fcsuVar4, fcsu fcsuVar5, fcsu fcsuVar6, arxn arxnVar, arxp arxpVar, arxq arxqVar, fcsu fcsuVar7, String str, eyga eygaVar, ConversationIdType conversationIdType) {
        this.b = ckvyVar;
        this.n = ckxjVar;
        this.c = cklfVar;
        this.d = cklgVar;
        this.o = fcsuVar;
        this.p = fcsuVar2;
        this.q = fcsuVar3;
        this.r = fcsuVar4;
        this.s = fcsuVar5;
        this.e = fcsuVar6;
        this.f = arxnVar;
        this.g = arxpVar;
        this.h = arxqVar;
        this.i = fcsuVar7;
        this.t = str;
        this.j = eygaVar;
        this.u = conversationIdType;
    }

    public static MessageIdType d(brec brecVar) {
        brdr brdrVarD = MessagesTable.d();
        brdrVarD.A("ReactionsRcsReceiverImpl#queryMessageId");
        brdrVarD.c(MessagesTable.c.a);
        brdrVarD.g(brecVar);
        brdrVarD.y(1);
        brap brapVar = (brap) brdrVarD.b().p();
        try {
            if (!brapVar.moveToFirst()) {
                brapVar.close();
                return bary.a;
            }
            MessageIdType messageIdTypeQ = brapVar.q();
            brapVar.close();
            return messageIdTypeQ;
        } catch (Throwable th) {
            try {
                brapVar.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    private final ezgd k() {
        if (!this.z) {
            this.z = true;
            ((crjx) this.q.b()).a(this.t).ifPresent(new Consumer() { // from class: ckxn
                @Override // java.util.function.Consumer
                /* renamed from: accept */
                public final void z(Object obj) {
                    this.a.m = (ezgd) obj;
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
        }
        return this.m;
    }

    @Override // defpackage.ckxk
    public final String a() {
        if (this.g.a()) {
            if (!i()) {
                return null;
            }
        } else if (!b()) {
            return null;
        }
        MessageCoreData messageCoreDataW = ((baxe) this.o.b()).w(c());
        if (messageCoreDataW == null) {
            return null;
        }
        return ((ckya) this.p.b()).a(g(), f(), cknp.a(((MessageData) messageCoreDataW).i));
    }

    @Override // defpackage.ckxk
    public final boolean b() {
        if (!this.A && j()) {
            this.A = true;
            eksl ekslVar = (eksl) a.h();
            ekslVar.X(ckmz.g, g());
            ekslVar.X(ckmz.e, e());
            ekslVar.X(ckmz.d, c());
            ekrz ekrzVar = ckmz.h;
            ckml ckmlVarB = ckml.b(f().e);
            if (ckmlVarB == null) {
                ckmlVarB = ckml.UNRECOGNIZED;
            }
            ekslVar.X(ekrzVar, Boolean.valueOf(ckmlVarB == ckml.REACTION_TYPE_UNSPECIFIED));
            ((eksl) ekslVar.h("com/google/android/apps/messaging/shared/reactions/transport/rcsfallback/receiver/ReactionsRcsReceiverImpl", "isReaction", 158, "ReactionsRcsReceiverImpl.java")).q("ReactionsRcsReceiverImpl#isReaction");
        }
        return this.g.a() ? j() : i();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final MessageIdType c() {
        if (!this.y) {
            this.y = true;
            if (!e().i()) {
                e().g(new Consumer() { // from class: ckxq
                    @Override // java.util.function.Consumer
                    /* renamed from: accept */
                    public final void z(Object obj) {
                        basd basdVar = (basd) obj;
                        String[] strArr = MessagesTable.a;
                        brec brecVar = new brec();
                        brecVar.F(basdVar);
                        brecVar.A(false);
                        MessageIdType messageIdTypeD = ckxr.d(brecVar);
                        ckxr ckxrVar = this.a;
                        ckxrVar.l = messageIdTypeD;
                        if (ckxrVar.l.c()) {
                            brec brecVar2 = new brec();
                            brecVar2.N(basdVar);
                            brecVar2.A(false);
                            ckxrVar.l = ckxr.d(brecVar2);
                        }
                        if (((Boolean) ckxrVar.e.b()).booleanValue() && ckxrVar.l.c()) {
                            ckxrVar.l = ckee.a(ckxrVar.e());
                        }
                        if (ckxrVar.l.c()) {
                            brec brecVar3 = new brec();
                            brecVar3.F(basdVar);
                            ckxrVar.l = ckxr.d(brecVar3);
                        }
                    }

                    public final /* synthetic */ Consumer andThen(Consumer consumer) {
                        return Consumer$CC.$default$andThen(this, consumer);
                    }
                });
                return this.l;
            }
            if (h().booleanValue()) {
                return bary.a;
            }
            ezgd ezgdVarK = k();
            if (ezgdVarK != null) {
                ekgb ekgbVarA = ckxy.a(this.u, (ezgdVarK.b == 2 ? (ezfb) ezgdVarK.c : ezfb.a).c, ((Integer) ckmx.b.e()).intValue());
                if (ekgbVarA.size() == 1) {
                    this.l = (MessageIdType) ekgbVarA.get(0);
                }
            }
        }
        return this.l;
    }

    public final basd e() {
        basd basdVar = this.k;
        if (basdVar != null) {
            return basdVar;
        }
        if (h().booleanValue()) {
            ciuy.a(this.j).ifPresent(new Consumer() { // from class: ckxo
                @Override // java.util.function.Consumer
                /* renamed from: accept */
                public final void z(Object obj) {
                    this.a.k = basd.a((String) obj);
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
        } else {
            civb.a(this.j, civa.REACTIONS_NAMESPACE, "In-Reply-To-Message-Id").ifPresent(new Consumer() { // from class: ckxp
                @Override // java.util.function.Consumer
                /* renamed from: accept */
                public final void z(Object obj) {
                    this.a.k = basd.a((String) obj);
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
        }
        if (this.k == null) {
            this.k = basd.a;
        }
        return this.k;
    }

    public final ckmb f() {
        ckmb ckmbVarA;
        ckmb ckmbVar = this.x;
        if (ckmbVar != null) {
            return ckmbVar;
        }
        if (h().booleanValue()) {
            String str = this.t;
            if (ejwk.c(str)) {
                this.x = ckmg.a(ckml.REACTION_TYPE_UNSPECIFIED);
            } else {
                this.x = ((ckmg) this.r.b()).b(str);
            }
        } else {
            ezgd ezgdVarK = k();
            if (ezgdVarK != null) {
                this.x = ckyi.a(ezgdVarK.b == 2 ? (ezfb) ezgdVarK.c : ezfb.a, (ckmg) this.r.b(), this.s);
            }
            if (this.x == null) {
                if (civb.a(this.j, civa.REACTIONS_NAMESPACE, "Message-Reply-Type").isPresent()) {
                    ckxj ckxjVar = this.n;
                    String str2 = this.t;
                    if (str2 == null) {
                        ckmbVarA = ckmg.a(ckml.REACTION_TYPE_UNSPECIFIED);
                    } else {
                        ckmb ckmbVarA2 = ckxjVar.a(str2, (char) 8203);
                        ckml ckmlVarB = ckml.b(ckmbVarA2.e);
                        if (ckmlVarB == null) {
                            ckmlVarB = ckml.UNRECOGNIZED;
                        }
                        ckmbVarA = ckmlVarB != ckml.REACTION_TYPE_UNSPECIFIED ? ckmbVarA2 : ckxjVar.a(str2, (char) 8204);
                    }
                } else {
                    ckmbVarA = ckmg.a(ckml.REACTION_TYPE_UNSPECIFIED);
                }
                this.x = ckmbVarA;
            }
        }
        return this.x;
    }

    public final ckmc g() {
        ckmc ckmcVar = this.w;
        if (ckmcVar != null) {
            return ckmcVar;
        }
        if (h().booleanValue()) {
            ckmc ckmcVarA = ckxi.a(this.j);
            this.w = ckmcVarA;
            return ckmcVarA;
        }
        Optional optionalA = civb.a(this.j, civa.REACTIONS_NAMESPACE, "Message-Reply-Type");
        if (!optionalA.isPresent()) {
            ezgd ezgdVarK = k();
            if (ezgdVarK != null) {
                this.w = ckyi.b(ezgdVarK.b == 2 ? (ezfb) ezgdVarK.c : ezfb.a);
            }
        } else if ("message-reaction-add".equals(optionalA.get())) {
            this.w = ckmc.ADD_REACTION;
        } else if ("message-reaction-remove".equals(optionalA.get())) {
            this.w = ckmc.REMOVE_REACTION;
        }
        if (this.w == null) {
            this.w = ckmc.REACTION_ACTION_UNSPECIFIED;
        }
        return this.w;
    }

    public final Boolean h() {
        Boolean bool = this.v;
        if (bool != null) {
            return bool;
        }
        boolean z = false;
        if (!this.f.a()) {
            this.v = false;
            return false;
        }
        Optional optionalB = ciuy.b(this.j);
        if (optionalB.isPresent() && (((String) optionalB.get()).equals("+Reaction") || ((String) optionalB.get()).equals("-Reaction"))) {
            z = true;
        }
        Boolean boolValueOf = Boolean.valueOf(z);
        this.v = boolValueOf;
        return boolValueOf;
    }

    public final boolean i() {
        ckml ckmlVarB = ckml.b(f().e);
        if (ckmlVarB == null) {
            ckmlVarB = ckml.UNRECOGNIZED;
        }
        return (ckmlVarB == ckml.REACTION_TYPE_UNSPECIFIED || g() == ckmc.REACTION_ACTION_UNSPECIFIED || c().c()) ? false : true;
    }

    public final boolean j() {
        ckml ckmlVarB = ckml.b(f().e);
        if (ckmlVarB == null) {
            ckmlVarB = ckml.UNRECOGNIZED;
        }
        return (ckmlVarB == ckml.REACTION_TYPE_UNSPECIFIED && g() == ckmc.REACTION_ACTION_UNSPECIFIED && !e().k()) ? false : true;
    }
}
