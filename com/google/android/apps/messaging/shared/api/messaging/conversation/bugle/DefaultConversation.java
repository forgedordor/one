package com.google.android.apps.messaging.shared.api.messaging.conversation.bugle;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.messaging.shared.api.messaging.Conversation;
import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;
import com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversationId;
import com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.DefaultConversation;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.protobuf.contrib.android.ProtoParsers;
import defpackage.ahlb;
import defpackage.ahmb;
import defpackage.ahmc;
import defpackage.ahnh;
import defpackage.ajlu;
import defpackage.ajlw;
import defpackage.ajmh;
import defpackage.ajvo;
import defpackage.ajxa;
import defpackage.ajxb;
import defpackage.akch;
import defpackage.aklo;
import defpackage.aklp;
import defpackage.aklw;
import defpackage.alza;
import defpackage.alzb;
import defpackage.amhm;
import defpackage.amkd;
import defpackage.ancc;
import defpackage.anpg;
import defpackage.anph;
import defpackage.anpi;
import defpackage.anpj;
import defpackage.anty;
import defpackage.aofc;
import defpackage.aqkk;
import defpackage.auvh;
import defpackage.cdfg;
import defpackage.cqty;
import defpackage.cquc;
import defpackage.eieu;
import defpackage.eiiy;
import defpackage.eiju;
import defpackage.eijx;
import defpackage.ejxr;
import defpackage.ejxx;
import defpackage.ekcv;
import defpackage.ekgb;
import defpackage.ekrd;
import defpackage.ekrg;
import defpackage.ekrw;
import defpackage.eksq;
import defpackage.eosc;
import defpackage.fcsu;
import defpackage.fdjx;
import j$.util.Collection;
import j$.util.function.Function$CC;
import j$.util.stream.Stream;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class DefaultConversation implements BugleConversation {
    public final BugleConversationId a;
    public final eosc b;
    public final anpj c;
    public final anpj d;
    public final anpj e;
    public final anpj f;
    public final anpj g;
    private final boolean i;
    private final ejxr j;
    private final fcsu k;
    private final ejxr l;
    private final ejxr m;
    private final AtomicBoolean n = new AtomicBoolean(false);
    private cquc o;
    private final fcsu p;
    private static final ekrg h = ekrg.c("com/google/android/apps/messaging/shared/api/messaging/conversation/bugle/DefaultConversation");
    public static final Parcelable.Creator<Conversation> CREATOR = new ajxa();

    /* compiled from: PG */
    public interface a {
        ajxb ah();
    }

    public DefaultConversation(eosc eoscVar, anty antyVar, aofc aofcVar, ajvo ajvoVar, fcsu fcsuVar, final alzb alzbVar, final amhm amhmVar, final aqkk aqkkVar, anph anphVar, fcsu fcsuVar2, fcsu fcsuVar3, final fcsu fcsuVar4, final fcsu fcsuVar5, fcsu fcsuVar6, final BugleConversationId bugleConversationId, final boolean z) {
        this.a = bugleConversationId;
        this.b = eoscVar;
        this.i = z;
        this.p = fcsuVar6;
        anpg anpgVarA = anphVar.a(antyVar.e(bugleConversationId));
        this.c = anpgVarA;
        this.e = anphVar.a(aofcVar.d());
        anpg anpgVarA2 = anphVar.a(ajvoVar.a(bugleConversationId));
        this.f = anpgVarA2;
        this.j = ejxx.a(new ejxr() { // from class: ajwk
            @Override // defpackage.ejxr
            public final Object get() {
                DefaultConversation defaultConversation = this.a;
                BugleConversationId bugleConversationId2 = bugleConversationId;
                boolean z2 = z;
                return aqkkVar.a() ? amhmVar.a(bugleConversationId2, defaultConversation.f, defaultConversation.c, defaultConversation.e, new alxh() { // from class: ajwt
                }, z2, ((Boolean) ames.a.e()).booleanValue()) : alzbVar.a(bugleConversationId2, defaultConversation.f, defaultConversation.c, defaultConversation.e, new alxh() { // from class: ajwu
                }, z2, ((Boolean) ames.a.e()).booleanValue());
            }
        });
        this.k = fcsuVar2;
        this.g = anphVar.a(((ahlb) fcsuVar.b()).a(anpgVarA, anpgVarA2, aofcVar.a(), bugleConversationId));
        this.d = anphVar.a(((ahmb) fcsuVar3.b()).a(anpgVarA2, anpgVarA));
        this.l = ejxx.a(new ejxr() { // from class: ajwr
            @Override // defpackage.ejxr
            public final Object get() {
                return ((amke) fcsuVar4.b()).a(bugleConversationId);
            }
        });
        this.m = ejxx.a(new ejxr() { // from class: ajws
            @Override // defpackage.ejxr
            public final Object get() {
                return ((akcg) fcsuVar5.b()).a(bugleConversationId);
            }
        });
    }

    @Override // com.google.android.apps.messaging.shared.api.messaging.Conversation
    public final ajlu a() {
        return ((alza) this.j.get()).a();
    }

    @Override // com.google.android.apps.messaging.shared.api.messaging.Conversation
    public final ajlw b() {
        return ((alza) this.j.get()).d();
    }

    @Override // com.google.android.apps.messaging.shared.api.messaging.Conversation
    public final ajmh c() {
        return (ajmh) this.j.get();
    }

    @Override // com.google.android.apps.messaging.shared.api.messaging.Conversation, java.lang.AutoCloseable
    public final void close() {
        ejxr ejxrVar = this.j;
        if (ejxrVar.get() != null) {
            ((alza) ejxrVar.get()).close();
        }
        cquc cqucVar = this.o;
        if (cqucVar != null) {
            cqucVar.close();
            this.o = null;
        }
        ekrw ekrwVarH = h.h();
        ekrwVarH.X(eksq.a, "BugleConversation");
        ((ekrd) ((ekrd) ekrwVarH).h("com/google/android/apps/messaging/shared/api/messaging/conversation/bugle/DefaultConversation", "close", 373, "DefaultConversation.java")).t("Conversation closed: %s.", this.a.b());
    }

    @Override // com.google.android.apps.messaging.shared.api.messaging.Conversation
    public final ConversationId d() {
        return this.a;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.google.android.apps.messaging.shared.api.messaging.Conversation
    public final amkd e() {
        return (amkd) this.l.get();
    }

    @Override // com.google.android.apps.messaging.shared.api.messaging.Conversation
    public final anpj f() {
        return ((akch) this.m.get()).a;
    }

    @Override // com.google.android.apps.messaging.shared.api.messaging.Conversation
    public final anpj g() {
        return this.g;
    }

    @Override // com.google.android.apps.messaging.shared.api.messaging.Conversation
    public final anpj h() {
        return this.f;
    }

    @Override // com.google.android.apps.messaging.shared.api.messaging.Conversation
    public final anpj i() {
        return this.d;
    }

    @Override // com.google.android.apps.messaging.shared.api.messaging.Conversation
    public final cdfg j() {
        ahnh ahnhVar = ((ahmc) this.p.b()).a.a.a;
        return new aklw(this, (fdjx) ahnhVar.m.b(), ahnhVar.Sk, ahnhVar.Sl);
    }

    @Override // com.google.android.apps.messaging.shared.api.messaging.Conversation
    public final void k() {
        if (this.n.compareAndSet(false, true)) {
            Stream map = Collection.EL.stream((Set) this.k.b()).map(new Function() { // from class: ajwn
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo536andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    final ajzi ajziVar = (ajzi) obj;
                    eieu eieuVarA = ajziVar.a();
                    final DefaultConversation defaultConversation = this.a;
                    try {
                        eiju eijuVarH = eijx.h(new eooy() { // from class: ajwq
                            @Override // defpackage.eooy
                            public final ListenableFuture a() {
                                return ajziVar.b(defaultConversation, ajlm.FOR_DISPLAY);
                            }
                        }, defaultConversation.b);
                        eieuVarA.b(eijuVarH);
                        eieuVarA.close();
                        return eijuVarH;
                    } catch (Throwable th) {
                        try {
                            eieuVarA.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
            int i = ekgb.d;
            ekgb ekgbVar = (ekgb) map.collect(ekcv.a);
            if (ekgbVar.isEmpty()) {
                return;
            }
            eieu eieuVarK = eiiy.k("notifyIsInteractive");
            try {
                eiju eijuVarA = eijx.a(ekgbVar);
                eieuVarK.b(eijuVarA);
                auvh.h(eijuVarA);
                eieuVarK.close();
            } catch (Throwable th) {
                try {
                    eieuVarK.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
    }

    @Override // com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversation
    public final BugleConversationId l() {
        return this.a;
    }

    @Override // com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversation
    public final alza m() {
        return (alza) this.j.get();
    }

    @Override // com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversation
    public final anpj n() {
        return this.f;
    }

    public final void o() {
        ekrw ekrwVarH = h.h();
        ekrwVarH.X(eksq.a, "BugleConversation");
        ((ekrd) ((ekrd) ekrwVarH).h("com/google/android/apps/messaging/shared/api/messaging/conversation/bugle/DefaultConversation", "startPreload", 342, "DefaultConversation.java")).t("Conversation preloading: %s.", this.a.b());
        anpi anpiVar = new anpi() { // from class: ajwy
            @Override // defpackage.anpi
            public final eiju a() {
                return eijx.e(null);
            }
        };
        anpi anpiVar2 = new anpi() { // from class: ajwz
            @Override // defpackage.anpi
            public final eiju a() {
                return eijx.e(null);
            }
        };
        anpj anpjVar = this.c;
        anpi anpiVar3 = new anpi() { // from class: ajwl
            @Override // defpackage.anpi
            public final eiju a() {
                return eijx.e(null);
            }
        };
        anpj anpjVar2 = this.e;
        anpi anpiVar4 = new anpi() { // from class: ajwm
            @Override // defpackage.anpi
            public final eiju a() {
                return eijx.e(null);
            }
        };
        anpj anpjVar3 = this.g;
        this.o = cqty.b(this.f.a(anpiVar), anpjVar.a(anpiVar2), anpjVar2.a(anpiVar3), anpjVar3.a(anpiVar4));
        anpjVar.b();
        anpjVar2.b();
        anpjVar3.b();
        ajmh ajmhVar = (ajmh) this.j.get();
        if (ajmhVar instanceof ancc) {
            ((ancc) ajmhVar).am();
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        aklo akloVar = (aklo) aklp.a.createBuilder();
        String string = this.a.toString();
        akloVar.copyOnWrite();
        aklp aklpVar = (aklp) akloVar.instance;
        string.getClass();
        aklpVar.b = string;
        akloVar.copyOnWrite();
        ((aklp) akloVar.instance).c = this.i;
        Bundle bundle = new Bundle();
        bundle.putParcelable("proto", new ProtoParsers.InternalDontUse(null, (aklp) akloVar.build()));
        parcel.writeBundle(bundle);
    }

    public DefaultConversation(eosc eoscVar, anty antyVar, aofc aofcVar, ajvo ajvoVar, fcsu fcsuVar, final alzb alzbVar, final amhm amhmVar, final aqkk aqkkVar, anph anphVar, fcsu fcsuVar2, fcsu fcsuVar3, final fcsu fcsuVar4, final fcsu fcsuVar5, fcsu fcsuVar6, final BugleConversationId bugleConversationId, final boolean z, byte[] bArr) {
        this.a = bugleConversationId;
        this.b = eoscVar;
        this.i = z;
        this.p = fcsuVar6;
        anpg anpgVarA = anphVar.a(antyVar.e(bugleConversationId));
        this.c = anpgVarA;
        this.e = anphVar.a(aofcVar.d());
        anpg anpgVarA2 = anphVar.a(ajvoVar.a(bugleConversationId));
        this.f = anpgVarA2;
        this.j = ejxx.a(new ejxr() { // from class: ajwv
            @Override // defpackage.ejxr
            public final Object get() {
                boolean z2 = z;
                DefaultConversation defaultConversation = this.a;
                BugleConversationId bugleConversationId2 = bugleConversationId;
                return aqkkVar.a() ? amhmVar.a(bugleConversationId2, defaultConversation.f, defaultConversation.c, defaultConversation.e, new alxh() { // from class: ajwo
                }, z2, false) : alzbVar.a(bugleConversationId2, defaultConversation.f, defaultConversation.c, defaultConversation.e, new alxh() { // from class: ajwp
                }, z2, false);
            }
        });
        this.k = fcsuVar2;
        this.g = anphVar.a(((ahlb) fcsuVar.b()).a(anpgVarA, anpgVarA2, aofcVar.a(), bugleConversationId));
        this.d = anphVar.a(((ahmb) fcsuVar3.b()).a(anpgVarA2, anpgVarA));
        this.l = ejxx.a(new ejxr() { // from class: ajww
            @Override // defpackage.ejxr
            public final Object get() {
                return ((amke) fcsuVar4.b()).a(bugleConversationId);
            }
        });
        this.m = ejxx.a(new ejxr() { // from class: ajwx
            @Override // defpackage.ejxr
            public final Object get() {
                return ((akcg) fcsuVar5.b()).a(bugleConversationId);
            }
        });
    }
}
