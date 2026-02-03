package defpackage;

import android.os.Bundle;
import com.google.android.ims.rcsservice.chatsession.message.ChatMessage;
import com.google.android.rcs.client.messaging.data.ContentType;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.communication.synapse.security.scytale.NativeMessageEncryptorV2;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bwip {
    public static final cqce a = cqce.g("BugleE2eeEtouffee", "IncomingEncryptedMessageProcessor");
    public final fcsu b;
    public final bwln c;
    public final atal d;
    public final bwet e;
    public final atzx f;
    public final bwiq g;
    public final bwmz h;
    public final ains i;
    public final eosc j;
    public final eosc k;
    public final bwkc l;
    public final atak m;
    public final bwey n;
    public final fcsu o;
    public final fcsu p;
    public final aqtx q;
    private final cogw r;
    private final fcsu s;
    private final fcsu t;

    public bwip(fcsu fcsuVar, bwln bwlnVar, cogw cogwVar, bwet bwetVar, atzx atzxVar, bwiq bwiqVar, bwmz bwmzVar, ains ainsVar, eosc eoscVar, eosc eoscVar2, bwkc bwkcVar, atak atakVar, bwey bweyVar, fcsu fcsuVar2, fcsu fcsuVar3, fcsu fcsuVar4, fcsu fcsuVar5, aqtx aqtxVar, fcsu fcsuVar6) {
        this.b = fcsuVar;
        this.c = bwlnVar;
        this.r = cogwVar;
        this.e = bwetVar;
        this.f = atzxVar;
        this.g = bwiqVar;
        this.h = bwmzVar;
        this.l = bwkcVar;
        this.m = atakVar;
        this.n = bweyVar;
        this.o = fcsuVar2;
        this.p = fcsuVar5;
        this.q = aqtxVar;
        ContentType contentType = efnf.a;
        ContentType contentType2 = efnk.a;
        this.s = fcsuVar3;
        this.i = ainsVar;
        this.k = eoscVar2;
        this.j = eoscVar;
        this.d = new atal();
        this.t = fcsuVar6;
    }

    public static Bundle a(Optional optional, elpg elpgVar) {
        Bundle bundle = new Bundle();
        bundle.putString("chat.extra.wrappingContentType", dfqb.c);
        if (optional.isPresent()) {
            bundle.putString("chat.extra.customDeliveryReceiptContentType", ((ChatMessage) optional.get()).getContentType());
            bundle.putByteArray("chat.extra.customDeliveryReceipt", ((ChatMessage) optional.get()).getContent());
        }
        bundle.putByteArray("chat.extra.logData", elpgVar.toByteArray());
        return bundle;
    }

    public static eiju d(aufh aufhVar) {
        ejwl.m((aufhVar.c & 64) != 0, "Receiver must be set");
        aubq aubqVar = aufhVar.h;
        if (aubqVar == null) {
            aubqVar = aubq.a;
        }
        return eijx.e(aubqVar.d);
    }

    public static void g(Exception exc) {
        cqbd cqbdVarE = a.e();
        cqbdVarE.I("No MessageEncryptor available to decrypt incoming message.");
        cqbdVarE.A("errorMessage", exc.getMessage());
        cqbdVarE.r();
    }

    public static boolean i(aufh aufhVar) {
        aubq aubqVar = aufhVar.f;
        if (aubqVar == null) {
            aubqVar = aubq.a;
        }
        aubp aubpVarB = aubp.b(aubqVar.c);
        if (aubpVarB == null) {
            aubpVarB = aubp.UNKNOWN_TYPE;
        }
        return aubpVarB.equals(aubp.GROUP);
    }

    public final chxo b(atys atysVar) {
        if (!atysVar.e().d.r()) {
            throw new IllegalStateException("Unable to parse the incoming content as an encrypted message.");
        }
        aufh aufhVar = ((atuy) atysVar).a;
        aubp aubpVar = aubp.GROUP;
        aubq aubqVar = aufhVar.f;
        if (aubqVar == null) {
            aubqVar = aubq.a;
        }
        aubp aubpVarB = aubp.b(aubqVar.c);
        if (aubpVarB == null) {
            aubpVarB = aubp.UNKNOWN_TYPE;
        }
        boolean zEquals = aubpVar.equals(aubpVarB);
        chxn chxnVarF = chxo.F();
        chug chugVar = (chug) chxnVarF;
        chugVar.a = basd.a(aufhVar.j);
        aubq aubqVar2 = aufhVar.d;
        if (aubqVar2 == null) {
            aubqVar2 = aubq.a;
        }
        chxnVarF.l(aubqVar2.d);
        aubq aubqVar3 = aufhVar.d;
        if (aubqVar3 == null) {
            aubqVar3 = aubq.a;
        }
        chxnVarF.k(aubqVar3);
        chugVar.d = atysVar.e().d.E();
        evvp evvpVar = aufhVar.n;
        if (evvpVar == null) {
            evvpVar = evvp.a;
        }
        chxnVarF.o(evxc.a(evvpVar));
        chxnVarF.j(this.r.f().toEpochMilli());
        atal atalVar = this.d;
        aubx aubxVar = atysVar.e().c;
        if (aubxVar == null) {
            aubxVar = aubx.a;
        }
        chugVar.h = ((ContentType) atalVar.fM(aubxVar)).toString();
        chxnVarF.i();
        chxnVarF.e(zEquals);
        chxnVarF.p(0);
        aubp aubpVar2 = aubp.BOT;
        aubq aubqVar4 = aufhVar.d;
        if (aubqVar4 == null) {
            aubqVar4 = aubq.a;
        }
        aubp aubpVarB2 = aubp.b(aubqVar4.c);
        if (aubpVarB2 == null) {
            aubpVarB2 = aubp.UNKNOWN_TYPE;
        }
        chxnVarF.f(aubpVar2.equals(aubpVarB2));
        eyga eygaVar = aufhVar.l;
        if (eygaVar == null) {
            eygaVar = eyga.a;
        }
        chugVar.i = eygaVar;
        chxnVarF.c(false);
        aubq aubqVar5 = aufhVar.h;
        if (aubqVar5 == null) {
            aubqVar5 = aubq.a;
        }
        chxnVarF.m(aubqVar5);
        chxnVarF.d(false);
        chxnVarF.g(false);
        awky awkyVar = aufhVar.e;
        if (awkyVar == null) {
            awkyVar = awky.a;
        }
        chxnVarF.n(awjj.a(awkyVar));
        if (((arph) this.t.b()).a()) {
            axfx axfxVar = aufhVar.i;
            if (axfxVar == null) {
                axfxVar = axfx.a;
            }
            chugVar.c = awzn.a(axfxVar);
        }
        if (zEquals) {
            awso awsoVar = aufhVar.g;
            if (awsoVar == null) {
                awsoVar = awso.a;
            }
            chugVar.e = awou.a(awsoVar);
        }
        if (bwbv.g() && zEquals) {
            chugVar.f = aufhVar.k;
            aubq aubqVar6 = aufhVar.f;
            if (aubqVar6 == null) {
                aubqVar6 = aubq.a;
            }
            chugVar.g = aubqVar6.d;
        }
        evsz evszVar = new evsz(aufhVar.q, aufh.a);
        chxnVarF.c(evszVar.contains(aufg.POSITIVE_DELIVERY));
        chxnVarF.d(evszVar.contains(aufg.DISPLAY));
        chxnVarF.g(evszVar.contains(aufg.NEGATIVE_DELIVERY));
        return chxnVarF.r();
    }

    public final eiju c(final atys atysVar, final evqs evqsVar) {
        final eiju eijuVarD = d(((atuy) atysVar).a);
        eooz eoozVar = new eooz() { // from class: bwih
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                return ((bwbn) this.a.b.b()).b((String) obj);
            }
        };
        eosc eoscVar = this.k;
        final eiju eijuVarI = eijuVarD.i(eoozVar, eoscVar);
        return eijuVarI.i(new eooz() { // from class: bwii
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                final NativeMessageEncryptorV2 nativeMessageEncryptorV2 = (NativeMessageEncryptorV2) obj;
                final eyfr eyfrVar = (eyfr) evsn.parseFrom(eyfr.a, evqsVar, evrr.a());
                final atys atysVar2 = atysVar;
                if (bwbv.g() && eyfrVar.e) {
                    cqbd cqbdVarE = bwip.a.e();
                    cqbdVarE.I("Unexpected FTD is received.");
                    cqbdVarE.h(basd.a(((atuy) atysVar2).a.j));
                    cqbdVarE.r();
                    return eijx.e(bwkb.e(bwbw.INVALID_FTD_RECEIPT));
                }
                eiju eijuVar = eijuVarD;
                final bwip bwipVar = this.a;
                String str = (String) eork.q(eijuVar);
                final basd basdVarA = basd.a(((atuy) atysVar2).a.j);
                return bwipVar.c.a(str).i(new eooz() { // from class: bwia
                    @Override // defpackage.eooz
                    public final ListenableFuture a(Object obj2) {
                        bwip bwipVar2 = bwipVar;
                        eyfr eyfrVar2 = eyfrVar;
                        chxo chxoVarB = bwipVar2.b(atysVar2);
                        NativeMessageEncryptorV2 nativeMessageEncryptorV22 = nativeMessageEncryptorV2;
                        bwkb bwkbVarA = bwipVar2.l.a((String) obj2, eyfrVar2, chxoVarB, nativeMessageEncryptorV22);
                        bwipVar2.h(bwkbVarA, basdVarA);
                        return eijx.e(bwkbVarA);
                    }
                }, bwipVar.j);
            }
        }, eoscVar).e(evtj.class, new ejvr() { // from class: bwij
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                cqbd cqbdVarE = bwip.a.e();
                cqbdVarE.I("Unable to parse the incoming chat message content as a MessageEnvelope.");
                cqbdVarE.A("errorMessage", ((evtj) obj).getMessage());
                cqbdVarE.r();
                return bwkb.e(bwbw.INVALID_PROTOCOL_BUFFER);
            }
        }, eoscVar).e(IllegalStateException.class, new ejvr() { // from class: bwik
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                bwip.g((IllegalStateException) obj);
                return bwkb.e(bwbw.ENCRYPTOR_NOT_FOUND);
            }
        }, eoscVar).i(new eooz() { // from class: bwil
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                return this.a.e(atysVar, (bwkb) obj, eijuVarI);
            }
        }, eoscVar);
    }

    public final eiju e(final atys atysVar, final bwkb bwkbVar, final eiju eijuVar) {
        return eijx.h(new eooy() { // from class: bwhx
            /* JADX WARN: Removed duplicated region for block: B:37:0x0136  */
            @Override // defpackage.eooy
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final com.google.common.util.concurrent.ListenableFuture a() {
                /*
                    Method dump skipped, instructions count: 331
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.bwhx.a():com.google.common.util.concurrent.ListenableFuture");
            }
        }, this.j);
    }

    public final eiju f(final atys atysVar, Optional optional) {
        boolean zI = i(atysVar.b());
        chxn chxnVarF = chxo.F();
        chug chugVar = (chug) chxnVarF;
        chugVar.a = basd.a(atysVar.b().j);
        aubq aubqVar = atysVar.b().d;
        if (aubqVar == null) {
            aubqVar = aubq.a;
        }
        chxnVarF.l(aubqVar.d);
        aubq aubqVar2 = atysVar.b().d;
        if (aubqVar2 == null) {
            aubqVar2 = aubq.a;
        }
        chxnVarF.k(aubqVar2);
        evvp evvpVar = atysVar.b().n;
        if (evvpVar == null) {
            evvpVar = evvp.a;
        }
        chxnVarF.o(evxc.a(evvpVar));
        chxnVarF.j(this.r.f().toEpochMilli());
        chxnVarF.i();
        chxnVarF.e(zI);
        chxnVarF.p(0);
        aubp aubpVar = aubp.BOT;
        aubq aubqVar3 = atysVar.b().d;
        if (aubqVar3 == null) {
            aubqVar3 = aubq.a;
        }
        aubp aubpVarB = aubp.b(aubqVar3.c);
        if (aubpVarB == null) {
            aubpVarB = aubp.UNKNOWN_TYPE;
        }
        chxnVarF.f(aubpVar.equals(aubpVarB));
        eyga eygaVar = atysVar.b().l;
        if (eygaVar == null) {
            eygaVar = eyga.a;
        }
        chugVar.i = eygaVar;
        chxnVarF.h(113);
        elpg elpgVar = atysVar.b().o;
        if (elpgVar == null) {
            elpgVar = elpg.b;
        }
        chxnVarF.b(a(optional, elpgVar));
        chxnVarF.c(false);
        aubq aubqVar4 = atysVar.b().h;
        if (aubqVar4 == null) {
            aubqVar4 = aubq.a;
        }
        chxnVarF.m(aubqVar4);
        chxnVarF.d(false);
        chxnVarF.g(false);
        awky awkyVar = atysVar.b().e;
        if (awkyVar == null) {
            awkyVar = awky.a;
        }
        chxnVarF.n(awjj.a(awkyVar));
        if (((arph) this.t.b()).a()) {
            axfx axfxVar = atysVar.b().i;
            if (axfxVar == null) {
                axfxVar = axfx.a;
            }
            chugVar.c = awzn.a(axfxVar);
        }
        if (zI) {
            awso awsoVar = atysVar.b().g;
            if (awsoVar == null) {
                awsoVar = awso.a;
            }
            chugVar.e = awou.a(awsoVar);
        }
        if (bwbv.g()) {
            aubq aubqVar5 = atysVar.b().f;
            if (aubqVar5 == null) {
                aubqVar5 = aubq.a;
            }
            aubp aubpVarB2 = aubp.b(aubqVar5.c);
            if (aubpVarB2 == null) {
                aubpVarB2 = aubp.UNKNOWN_TYPE;
            }
            if (aubpVarB2.equals(aubp.GROUP)) {
                chugVar.f = atysVar.b().k;
                aubq aubqVar6 = atysVar.b().f;
                if (aubqVar6 == null) {
                    aubqVar6 = aubq.a;
                }
                chugVar.g = aubqVar6.d;
            }
        }
        evsz evszVar = new evsz(atysVar.b().q, aufh.a);
        chxnVarF.c(optional.isPresent() || evszVar.contains(aufg.POSITIVE_DELIVERY));
        chxnVarF.g(evszVar.contains(aufg.NEGATIVE_DELIVERY));
        return ((civx) this.s.b()).b(chxnVarF.r()).h(new ejvr() { // from class: bwio
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                cqbd cqbdVarC = bwip.a.c();
                atys atysVar2 = atysVar;
                cqbdVarC.h(basd.a(atysVar2.b().j));
                cqbdVarC.g(atysVar2.b().k);
                cqbdVarC.I("Sent a receipt from Persistent Work Queue.");
                cqbdVarC.r();
                return atav.SUCCESS;
            }
        }, this.k);
    }

    public final void h(bwkb bwkbVar, basd basdVar) {
        ChatMessage chatMessage = ((bwaw) bwkbVar).a;
        if (chatMessage == null || !dfqb.d(chatMessage.getContentType())) {
            return;
        }
        bwey bweyVar = this.n;
        if (bweyVar.c.a()) {
            ((cbqh) bweyVar.b.b()).c(basdVar, basd.a, 10, 11, 1);
        } else {
            bweyVar.f(basdVar, basd.a, 10, 11, 1);
        }
    }

    public final boolean j(aufh aufhVar) {
        if ((aufhVar.c & 4) == 0) {
            this.n.c(basd.a(aufhVar.j), 56);
            return false;
        }
        if (!i(aufhVar) || (aufhVar.c & 32) != 0) {
            return true;
        }
        this.n.c(basd.a(aufhVar.j), 57);
        return false;
    }
}
