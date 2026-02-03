package defpackage;

import android.text.TextUtils;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.ims.rcsservice.chatsession.message.ChatMessage;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Collection;
import j$.util.function.Function$CC;
import java.util.concurrent.Callable;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bwem extends cmpn {
    public static final cqce a = cqce.g("BugleE2eeEtouffee", "EncryptedRcsMessageConverter");
    public final fcsu b;
    public final fcsu c;
    public final bwjw d;
    public final eosc e;
    public final eosc f;
    public final ains g;
    public final bwkc h;
    public final bwey i;
    public final auau j;
    public final efnk k;
    public final fcsu l;
    private final bwln o;
    private final eosc p;
    private final ataj q;
    private final alrj r;

    public bwem(fcsu fcsuVar, fcsu fcsuVar2, bwln bwlnVar, bwjw bwjwVar, eosc eoscVar, eosc eoscVar2, eosc eoscVar3, ains ainsVar, efob efobVar, ataj atajVar, atak atakVar, alrj alrjVar, bwkc bwkcVar, bwey bweyVar, auau auauVar, fcsu fcsuVar3) {
        super(efobVar, atakVar, eoscVar3);
        this.b = fcsuVar;
        this.c = fcsuVar2;
        this.o = bwlnVar;
        this.d = bwjwVar;
        this.e = eoscVar;
        this.p = eoscVar2;
        this.f = eoscVar3;
        this.g = ainsVar;
        this.q = atajVar;
        this.r = alrjVar;
        this.h = bwkcVar;
        this.i = bweyVar;
        this.j = auauVar;
        this.l = fcsuVar3;
        this.k = new efnk((dflp) fcsuVar3.b());
    }

    final eiju a(final basd basdVar, final aubq aubqVar, final ekgb ekgbVar, final byte[] bArr, final String str, final elss elssVar, final eyga eygaVar, final boolean z) {
        if (!bwbv.g()) {
            ejwl.m(!z, "Only 1:1 conversations can be encrypted");
        }
        return this.o.a(aubqVar.d).i(new eooz() { // from class: bwel
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                String str2 = (String) obj;
                boolean zIsEmpty = TextUtils.isEmpty(str2);
                bwem bwemVar = this.a;
                basd basdVar2 = basdVar;
                if (zIsEmpty) {
                    bwemVar.g.e("Bugle.Etouffee.Encryption.Failure.Reason", 1);
                    bwemVar.i.e(basdVar2, 3);
                }
                eyga eygaVar2 = eygaVar;
                boolean z2 = z;
                elss elssVar2 = elssVar;
                String str3 = str;
                ekgb ekgbVar2 = ekgbVar;
                aubq aubqVar2 = aubqVar;
                byte[] bArr2 = bArr;
                ejwl.m(true ^ TextUtils.isEmpty(str2), "Failed to retrieve local registration ID");
                return bwemVar.b(bArr2, str2, aubqVar2, basdVar2, ekgbVar2, str3, false, elssVar2, z2, eygaVar2);
            }
        }, this.f);
    }

    public final eiju b(final byte[] bArr, final String str, final aubq aubqVar, final basd basdVar, final ekgb ekgbVar, final String str2, final boolean z, final elss elssVar, final boolean z2, eyga eygaVar) {
        final eyga eygaVar2;
        eieu eieuVarK = eiiy.k("EtouffeeMessageConverter#convert");
        if (eygaVar == null) {
            try {
                eygaVar2 = eyga.a;
            } finally {
            }
        } else {
            eygaVar2 = eygaVar;
        }
        eiju eijuVarF = c(ekgbVar, z2).i(new eooz() { // from class: bweg
            /* JADX WARN: Removed duplicated region for block: B:16:0x008c  */
            @Override // defpackage.eooz
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final com.google.common.util.concurrent.ListenableFuture a(java.lang.Object r7) {
                /*
                    Method dump skipped, instructions count: 312
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.bweg.a(java.lang.Object):com.google.common.util.concurrent.ListenableFuture");
            }
        }, this.p).f(Throwable.class, new eooz() { // from class: bweh
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                cqbd cqbdVarE = bwem.a.e();
                cqbdVarE.I("Failed to send an encrypted message.");
                cqbdVarE.N("participants messaging identity destinations", Collection.EL.stream(ekgbVar).map(new Function() { // from class: bweb
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo536andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj2) {
                        return ((alqm) obj2).toString();
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                }));
                cqbdVarE.A("rcsMessageId", basdVar);
                cqbdVarE.r();
                return eijx.d((Throwable) obj);
            }
        }, eoqg.a);
        eieuVarK.b(eijuVarF);
        eieuVarK.close();
        return eijuVarF;
    }

    final eiju c(final ekgb ekgbVar, final boolean z) {
        return eijx.g(new Callable() { // from class: bwea
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.a.d.c(ekgbVar, z);
            }
        }, this.e);
    }

    @Override // defpackage.cmpn
    public final eiju d(MessageCoreData messageCoreData, asrg asrgVar) {
        return e(cmpj.a(messageCoreData), asrgVar);
    }

    @Override // defpackage.cmpn
    public final eiju e(cmpk cmpkVar, asrg asrgVar) throws Throwable {
        if (!cmpkVar.c) {
            return super.e(cmpkVar, asrgVar);
        }
        ekgb ekgbVarZ = this.r.z(asrgVar);
        boolean zD = asrgVar.d();
        eieu eieuVarK = eiiy.k("EtouffeeMessageConverter#toChat");
        try {
            try {
                eiju eijuVarA = a(cmpkVar.a, cmpkVar.d, ekgbVarZ, cmpkVar.b.getBytes(), "text/plain", elss.TEXT, cmpkVar.e, zD);
                eieuVarK.b(eijuVarA);
                eieuVarK.close();
                ejvr ejvrVar = new ejvr() { // from class: bwei
                    @Override // defpackage.ejvr
                    public final Object apply(Object obj) {
                        return ataj.a((ChatMessage) obj);
                    }
                };
                eosc eoscVar = this.f;
                return eijuVarA.h(ejvrVar, eoscVar).e(IllegalStateException.class, new ejvr() { // from class: bwej
                    @Override // defpackage.ejvr
                    public final Object apply(Object obj) {
                        throw new cmph((IllegalStateException) obj);
                    }
                }, eoscVar);
            } catch (Throwable th) {
                th = th;
                Throwable th2 = th;
                try {
                    eieuVarK.close();
                    throw th2;
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                    throw th2;
                }
            }
        } catch (Throwable th4) {
            th = th4;
        }
    }
}
