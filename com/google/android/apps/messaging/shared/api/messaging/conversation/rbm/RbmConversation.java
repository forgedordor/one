package com.google.android.apps.messaging.shared.api.messaging.conversation.rbm;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.messaging.shared.api.messaging.Conversation;
import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;
import com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversation;
import com.google.android.apps.messaging.shared.api.messaging.conversation.rbm.RbmConversation;
import com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient;
import defpackage.ajlu;
import defpackage.ajlw;
import defpackage.ajmh;
import defpackage.ajvr;
import defpackage.akms;
import defpackage.akmt;
import defpackage.akmw;
import defpackage.akmx;
import defpackage.aknj;
import defpackage.aknk;
import defpackage.amkd;
import defpackage.anfx;
import defpackage.anfy;
import defpackage.angb;
import defpackage.anpg;
import defpackage.anph;
import defpackage.anpj;
import defpackage.asqr;
import defpackage.bbmo;
import defpackage.cczi;
import defpackage.cdfg;
import defpackage.cqtp;
import defpackage.crbf;
import defpackage.ejvr;
import defpackage.ejxr;
import defpackage.ejxx;
import defpackage.eosc;
import defpackage.fcsu;
import defpackage.fdjx;
import j$.util.Collection;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import j$.util.function.Predicate$CC;
import java.io.IOException;
import java.util.function.Consumer;
import java.util.function.Predicate;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class RbmConversation implements Conversation {
    public static final Parcelable.Creator<Conversation> CREATOR = new akms();
    public final RbmConversationId a;
    public final BugleConversation b;
    public final fcsu c;
    public final fcsu d;
    private final eosc e;
    private final eosc f;
    private final ejxr g;
    private final anpj h;
    private final akmw i;
    private final ejxr j;

    /* compiled from: PG */
    public interface a {
        ajvr ag();

        akmt al();
    }

    public RbmConversation(eosc eoscVar, eosc eoscVar2, anph anphVar, aknk aknkVar, final anfx anfxVar, fcsu fcsuVar, fcsu fcsuVar2, akmx akmxVar, final angb angbVar, BugleConversation bugleConversation) {
        this.e = eoscVar;
        this.f = eoscVar2;
        RbmConversationId rbmConversationId = new RbmConversationId(bugleConversation.l().a);
        this.a = rbmConversationId;
        this.b = bugleConversation;
        fdjx fdjxVar = (fdjx) aknkVar.a.b();
        fdjxVar.getClass();
        fdjx fdjxVar2 = (fdjx) aknkVar.b.b();
        fdjxVar2.getClass();
        cqtp cqtpVar = (cqtp) aknkVar.c.b();
        cqtpVar.getClass();
        bbmo bbmoVar = (bbmo) aknkVar.d.b();
        bbmoVar.getClass();
        asqr asqrVar = (asqr) aknkVar.e.b();
        asqrVar.getClass();
        anpg anpgVarA = anphVar.a(new aknj(fdjxVar, fdjxVar2, cqtpVar, bbmoVar, asqrVar, aknkVar.f, bugleConversation));
        this.h = anpgVarA;
        this.g = ejxx.a(new ejxr() { // from class: akmq
            @Override // defpackage.ejxr
            public final Object get() {
                anfx anfxVar2 = anfxVar;
                fcsu fcsuVar3 = anfxVar2.a;
                ajmh ajmhVarC = this.a.b.c();
                fdjx fdjxVar3 = (fdjx) fcsuVar3.b();
                fdjxVar3.getClass();
                fdjx fdjxVar4 = (fdjx) anfxVar2.b.b();
                fdjxVar4.getClass();
                cqmz cqmzVar = (cqmz) anfxVar2.d.b();
                cqmzVar.getClass();
                ajmhVarC.getClass();
                return new anfw(fdjxVar3, fdjxVar4, anfxVar2.c, cqmzVar, ajmhVarC);
            }
        });
        this.c = fcsuVar;
        this.d = fcsuVar2;
        anpj anpjVarG = bugleConversation.g();
        fdjx fdjxVar3 = (fdjx) akmxVar.a.b();
        fdjxVar3.getClass();
        fcsu fcsuVar3 = akmxVar.b;
        anpjVarG.getClass();
        anpgVarA.getClass();
        this.i = new akmw(fdjxVar3, fcsuVar3, rbmConversationId, anpjVarG, anpgVarA);
        this.j = ejxx.a(new ejxr() { // from class: akmr
            @Override // defpackage.ejxr
            public final Object get() {
                RbmConversation rbmConversation = this.a;
                BugleConversation bugleConversation2 = rbmConversation.b;
                ajlu ajluVarA = bugleConversation2.a();
                anpj anpjVarI = bugleConversation2.i();
                anpj anpjVarH = bugleConversation2.h();
                ajluVarA.getClass();
                anpjVarI.getClass();
                anpjVarH.getClass();
                return new anga(angbVar.a, ajluVarA, rbmConversation.a.b, anpjVarI, anpjVarH);
            }
        });
    }

    @Override // com.google.android.apps.messaging.shared.api.messaging.Conversation
    public final ajlu a() {
        return ((Boolean) ((cczi) crbf.bv.get()).e()).booleanValue() ? (ajlu) this.j.get() : this.b.a();
    }

    @Override // com.google.android.apps.messaging.shared.api.messaging.Conversation
    public final ajlw b() {
        return this.b.b();
    }

    @Override // com.google.android.apps.messaging.shared.api.messaging.Conversation
    public final ajmh c() {
        return (ajmh) this.g.get();
    }

    @Override // com.google.android.apps.messaging.shared.api.messaging.Conversation, java.lang.AutoCloseable
    public final void close() {
        this.b.close();
    }

    @Override // com.google.android.apps.messaging.shared.api.messaging.Conversation
    public final ConversationId d() {
        return this.a;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return this.b.describeContents();
    }

    @Override // com.google.android.apps.messaging.shared.api.messaging.Conversation
    public final amkd e() {
        return this.b.e();
    }

    @Override // com.google.android.apps.messaging.shared.api.messaging.Conversation
    public final anpj f() {
        return this.b.f();
    }

    @Override // com.google.android.apps.messaging.shared.api.messaging.Conversation
    public final anpj g() {
        return this.i;
    }

    @Override // com.google.android.apps.messaging.shared.api.messaging.Conversation
    public final anpj h() {
        return this.h;
    }

    @Override // com.google.android.apps.messaging.shared.api.messaging.Conversation
    public final anpj i() {
        return this.b.i();
    }

    @Override // com.google.android.apps.messaging.shared.api.messaging.Conversation
    public final cdfg j() {
        return this.b.j();
    }

    @Override // com.google.android.apps.messaging.shared.api.messaging.Conversation
    public final void k() {
        this.b.k();
        ((anfy) this.g.get()).z();
        i().b().h(new ejvr() { // from class: akmp
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                Optional optionalFindFirst = Collection.EL.stream((ekgb) obj).filter(new Predicate() { // from class: akmm
                    public final /* synthetic */ Predicate and(Predicate predicate) {
                        return Predicate$CC.$default$and(this, predicate);
                    }

                    @Override // java.util.function.Predicate
                    /* renamed from: negate */
                    public final /* synthetic */ Predicate mo538negate() {
                        return Predicate$CC.$default$negate(this);
                    }

                    public final /* synthetic */ Predicate or(Predicate predicate) {
                        return Predicate$CC.$default$or(this, predicate);
                    }

                    @Override // java.util.function.Predicate
                    public final boolean test(Object obj2) {
                        return ((ResolvedRecipient) obj2).D();
                    }
                }).findFirst();
                final RbmConversation rbmConversation = this.a;
                optionalFindFirst.ifPresent(new Consumer() { // from class: akmn
                    @Override // java.util.function.Consumer
                    /* renamed from: accept */
                    public final void z(Object obj2) {
                        String strO = ((ResolvedRecipient) obj2).g().o();
                        cavh cavhVar = (cavh) cavk.a.createBuilder();
                        cavhVar.copyOnWrite();
                        ((cavk) cavhVar.instance).b = strO;
                        cavhVar.copyOnWrite();
                        ((cavk) cavhVar.instance).d = cavj.a(4);
                        cavhVar.copyOnWrite();
                        ((cavk) cavhVar.instance).c = cavi.a(4);
                        cavk cavkVar = (cavk) cavhVar.build();
                        caxr caxrVar = new caxr();
                        caxrVar.a = strO;
                        caxrVar.b = strO;
                        ((cavl) rbmConversation.c.b()).b(cavkVar, caxrVar.a());
                    }

                    public final /* synthetic */ Consumer andThen(Consumer consumer) {
                        return Consumer$CC.$default$andThen(this, consumer);
                    }
                });
                return null;
            }
        }, this.e);
        this.h.b().h(new ejvr() { // from class: akmo
            @Override // defpackage.ejvr
            public final Object apply(Object obj) throws IOException {
                int iOrdinal = ((akmy) obj).D().ordinal();
                RbmConversation rbmConversation = this.a;
                if (iOrdinal == 0) {
                    ((asqr) rbmConversation.d.b()).b(barn.b(rbmConversation.a.b()));
                    return null;
                }
                if (iOrdinal != 1) {
                    return null;
                }
                ((asqr) rbmConversation.d.b()).f(4, barn.b(rbmConversation.a.b()));
                return null;
            }
        }, this.f);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.b.writeToParcel(parcel, i);
    }
}
