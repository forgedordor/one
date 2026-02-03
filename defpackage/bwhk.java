package defpackage;

import j$.util.function.Consumer$CC;
import j$.util.function.Function$CC;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bwhk {
    public static final ekrg a = ekrg.c("com/google/android/apps/messaging/shared/datamodel/etouffee/impl/IdentityVerificationPendingMessageProcessor");
    public final eosc b;
    public final eosc c;
    public final bwjw d;
    public final eosc e;
    public final asrc f;
    public final atal g = new atal();
    public final fcsu h;
    public final fcsu i;
    public final alrj j;
    public final fcsu k;
    public final atvy l;
    private final fcsu m;
    private final fcsu n;

    public bwhk(eosc eoscVar, eosc eoscVar2, bwjw bwjwVar, fcsu fcsuVar, eosc eoscVar3, asrc asrcVar, fcsu fcsuVar2, fcsu fcsuVar3, fcsu fcsuVar4, alrj alrjVar, fcsu fcsuVar5, atvy atvyVar) {
        this.c = eoscVar2;
        this.b = eoscVar;
        this.d = bwjwVar;
        this.m = fcsuVar;
        this.e = eoscVar3;
        this.f = asrcVar;
        this.h = fcsuVar2;
        this.i = fcsuVar3;
        this.n = fcsuVar4;
        this.l = atvyVar;
        this.j = alrjVar;
        this.k = fcsuVar5;
    }

    public static String a(aubq aubqVar, String str) {
        return aubqVar != null ? aubqVar.d : str;
    }

    public static boolean e(final chxo chxoVar, boolean z) {
        bsmq bsmqVarA = bsmv.a();
        bsmqVarA.A("storeMessageInPendingIncomingMessages");
        bsmqVarA.d(new Function() { // from class: bwhi
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                bsmu bsmuVar = (bsmu) obj;
                bsmuVar.d(((chuh) chxoVar).a);
                return bsmuVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        if (bsmqVarA.b().U()) {
            return false;
        }
        bsjy bsjyVar = new bsjy();
        chxoVar.G(bsjyVar);
        if (z) {
            bsjyVar.k(bvdv.WAITING_IDENTITY_VERIFICATION);
        } else {
            bsjyVar.k(bvdv.WAITING_PRIOR_MESSAGE);
        }
        bsjs bsjsVarA = bsjyVar.a(new Supplier() { // from class: bsju
            @Override // java.util.function.Supplier
            public final Object get() {
                return new bsjt();
            }
        });
        final dqsy dqsyVarB = bsmv.b();
        dqru.b(bsmv.b(), "pending_incoming_message_rcs_table", bsjsVarA, new Function() { // from class: bsjn
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return Long.valueOf(dqsyVarB.O("pending_incoming_message_rcs_table", (dqst) obj));
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }, new Consumer() { // from class: bsjo
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void z(Object obj) {
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
        return true;
    }

    public final void b(chxo chxoVar, String str) {
        ekrg ekrgVar = a;
        ekrw ekrwVarF = ekrgVar.f();
        ekrz ekrzVar = eksq.a;
        ekrwVarF.X(ekrzVar, "BugleE2eeEtouffee");
        ekrd ekrdVar = (ekrd) ekrwVarF;
        ekrdVar.X(cqnc.I, str);
        chuh chuhVar = (chuh) chxoVar;
        ekrdVar.X(cqnc.f, chuhVar.a);
        ((ekrd) ekrdVar.h("com/google/android/apps/messaging/shared/datamodel/etouffee/impl/IdentityVerificationPendingMessageProcessor", "performIdentityCheckInTheBackground", 147, "IdentityVerificationPendingMessageProcessor.java")).q("Performing identity check for pending messages.");
        if (!e(chxoVar, true)) {
            ekrw ekrwVarH = ekrgVar.h();
            ekrwVarH.X(ekrzVar, "BugleE2eeEtouffee");
            ((ekrd) ((ekrd) ekrwVarH).h("com/google/android/apps/messaging/shared/datamodel/etouffee/impl/IdentityVerificationPendingMessageProcessor", "performIdentityCheckInTheBackground", 153, "IdentityVerificationPendingMessageProcessor.java")).q("Skip queuing. The message is already in the queue.");
        } else if (((Boolean) ((cczi) bwbt.v.get()).e()).booleanValue()) {
            d(this.j.b(chuhVar.b), str);
        } else {
            c(str);
        }
    }

    @Deprecated
    public final void c(String str) {
        ((bwqp) this.n.b()).b(1);
        cazj cazjVar = (cazj) this.m.b();
        ewtj ewtjVar = (ewtj) ewtk.a.createBuilder();
        ewtjVar.copyOnWrite();
        ewtk ewtkVar = (ewtk) ewtjVar.instance;
        str.getClass();
        ewtkVar.b = 1 | ewtkVar.b;
        ewtkVar.c = str;
        evsn evsnVarBuild = ewtjVar.build();
        caxr caxrVar = new caxr();
        caxrVar.a = str;
        cazjVar.a(cbcu.g("IdentityVerificationPendingMessageHandler", evsnVarBuild, caxrVar.a()));
    }

    public final void d(alqm alqmVar, String str) {
        ((bwqp) this.n.b()).b(2);
        cazj cazjVar = (cazj) this.m.b();
        ewtj ewtjVar = (ewtj) ewtk.a.createBuilder();
        ewtjVar.copyOnWrite();
        ewtk ewtkVar = (ewtk) ewtjVar.instance;
        str.getClass();
        ewtkVar.b |= 1;
        ewtkVar.c = str;
        alwl alwlVarC = alre.c(alqmVar);
        ewtjVar.copyOnWrite();
        ewtk ewtkVar2 = (ewtk) ewtjVar.instance;
        alwlVarC.getClass();
        ewtkVar2.d = alwlVarC;
        ewtkVar2.b |= 2;
        evsn evsnVarBuild = ewtjVar.build();
        caxr caxrVar = new caxr();
        caxrVar.a = alqmVar.o();
        cazjVar.a(cbcu.g("IdentityVerificationPendingMessageHandler", evsnVarBuild, caxrVar.a()));
    }
}
