package com.google.android.apps.messaging.shared.api.messaging.conversation.emergency;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.common.proguard.UsedByReflection;
import com.google.android.apps.messaging.shared.api.messaging.Conversation;
import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;
import com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversation;
import com.google.android.apps.messaging.shared.api.messaging.conversation.emergency.EmergencyConversation;
import defpackage.ajlu;
import defpackage.ajlw;
import defpackage.ajmh;
import defpackage.ajvr;
import defpackage.akei;
import defpackage.akek;
import defpackage.akeo;
import defpackage.akey;
import defpackage.amkd;
import defpackage.amqz;
import defpackage.amra;
import defpackage.amyo;
import defpackage.amzd;
import defpackage.anph;
import defpackage.anpj;
import defpackage.auvw;
import defpackage.ccwi;
import defpackage.cdfg;
import defpackage.ekrg;
import defpackage.fcsu;
import defpackage.fctc;
import defpackage.fctd;
import defpackage.fdae;
import defpackage.fdjx;
import defpackage.fdlr;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class EmergencyConversation implements Conversation {
    public final anph b;
    public final amyo c;
    public final akey d;
    public final fcsu e;
    public final fcsu f;
    public final amra g;
    public final BugleConversation h;
    public final EmergencyConversationId i;
    private final fdjx j;
    private final fctc k;
    private final fctc l;
    private final fctc m;
    public static final ekrg a = ekrg.c("com/google/android/apps/messaging/shared/api/messaging/conversation/emergency/EmergencyConversation");

    @UsedByReflection
    public static final Parcelable.Creator<Conversation> CREATOR = new akei();

    public EmergencyConversation(fdjx fdjxVar, anph anphVar, amyo amyoVar, akey akeyVar, fcsu<ccwi> fcsuVar, fcsu<ajvr> fcsuVar2, amra amraVar, BugleConversation bugleConversation) {
        fdjxVar.getClass();
        anphVar.getClass();
        amyoVar.getClass();
        akeyVar.getClass();
        fcsuVar.getClass();
        fcsuVar2.getClass();
        amraVar.getClass();
        bugleConversation.getClass();
        this.j = fdjxVar;
        this.b = anphVar;
        this.c = amyoVar;
        this.d = akeyVar;
        this.e = fcsuVar;
        this.f = fcsuVar2;
        this.g = amraVar;
        this.h = bugleConversation;
        String string = bugleConversation.l().a.toString();
        string.getClass();
        this.i = akeo.a(string);
        this.k = fctd.a(new fdae() { // from class: akef
            @Override // defpackage.fdae
            public final Object invoke() {
                EmergencyConversation emergencyConversation = this.a;
                akey akeyVar2 = emergencyConversation.d;
                fdjx fdjxVar2 = (fdjx) akeyVar2.a.b();
                fdjxVar2.getClass();
                fdjx fdjxVar3 = (fdjx) akeyVar2.b.b();
                fdjxVar3.getClass();
                cqtp cqtpVar = (cqtp) akeyVar2.c.b();
                cqtpVar.getClass();
                return emergencyConversation.b.a(new akex(fdjxVar2, fdjxVar3, cqtpVar, emergencyConversation.h));
            }
        });
        this.l = fctd.a(new fdae() { // from class: akeg
            @Override // defpackage.fdae
            public final Object invoke() {
                EmergencyConversation emergencyConversation = this.a;
                amra amraVar2 = emergencyConversation.g;
                fcsu fcsuVar3 = amraVar2.a;
                anpj anpjVarM = emergencyConversation.m();
                fdjx fdjxVar2 = (fdjx) fcsuVar3.b();
                fdjxVar2.getClass();
                cqtp cqtpVar = (cqtp) amraVar2.d.b();
                cqtpVar.getClass();
                return new amqz(fdjxVar2, amraVar2.b, amraVar2.c, cqtpVar, emergencyConversation.i, anpjVarM);
            }
        });
        this.m = fctd.a(new fdae() { // from class: akeh
            @Override // defpackage.fdae
            public final Object invoke() {
                EmergencyConversation emergencyConversation = this.a;
                amyo amyoVar2 = emergencyConversation.c;
                fcsu fcsuVar3 = amyoVar2.a;
                ajmh ajmhVarC = emergencyConversation.h.c();
                amqz amqzVarL = emergencyConversation.l();
                anpj anpjVarI = emergencyConversation.i();
                anpj anpjVarM = emergencyConversation.m();
                amoc amocVar = (amoc) fcsuVar3.b();
                amocVar.getClass();
                amzc amzcVar = (amzc) amyoVar2.b.b();
                amzcVar.getClass();
                aqun aqunVar = (aqun) amyoVar2.c.b();
                aqunVar.getClass();
                amyt amytVar = (amyt) amyoVar2.d.b();
                amytVar.getClass();
                ajmhVarC.getClass();
                anpjVarI.getClass();
                return new amyn(amocVar, amzcVar, aqunVar, amytVar, ajmhVarC, amqzVarL, anpjVarI, anpjVarM);
            }
        });
    }

    private final amzd n() {
        Object objA = this.m.a();
        objA.getClass();
        return (amzd) objA;
    }

    @Override // com.google.android.apps.messaging.shared.api.messaging.Conversation
    public final ajlu a() {
        ajlu ajluVarA = n().a();
        ajluVarA.getClass();
        return ajluVarA;
    }

    @Override // com.google.android.apps.messaging.shared.api.messaging.Conversation
    public final ajlw b() {
        return this.h.b();
    }

    @Override // com.google.android.apps.messaging.shared.api.messaging.Conversation
    public final ajmh c() {
        return n();
    }

    @Override // com.google.android.apps.messaging.shared.api.messaging.Conversation, java.lang.AutoCloseable
    public final void close() {
        Map map = l().e;
        synchronized (map) {
            for (fdlr fdlrVar : map.values()) {
                if (fdlrVar.v()) {
                    fdlrVar.t(null);
                }
            }
            map.clear();
        }
        this.h.close();
    }

    @Override // com.google.android.apps.messaging.shared.api.messaging.Conversation
    public final ConversationId d() {
        return this.i;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return this.h.describeContents();
    }

    @Override // com.google.android.apps.messaging.shared.api.messaging.Conversation
    public final amkd e() {
        return this.h.e();
    }

    @Override // com.google.android.apps.messaging.shared.api.messaging.Conversation
    public final anpj f() {
        return this.h.f();
    }

    @Override // com.google.android.apps.messaging.shared.api.messaging.Conversation
    public final anpj g() {
        return this.h.g();
    }

    @Override // com.google.android.apps.messaging.shared.api.messaging.Conversation
    public final anpj h() {
        return m();
    }

    @Override // com.google.android.apps.messaging.shared.api.messaging.Conversation
    public final anpj i() {
        return this.h.i();
    }

    @Override // com.google.android.apps.messaging.shared.api.messaging.Conversation
    public final cdfg j() {
        return this.h.j();
    }

    @Override // com.google.android.apps.messaging.shared.api.messaging.Conversation
    public final void k() {
        this.h.k();
        auvw.k(this.j, null, null, new akek(this, null), 3);
    }

    public final amqz l() {
        Object objA = this.l.a();
        objA.getClass();
        return (amqz) objA;
    }

    public final anpj m() {
        Object objA = this.k.a();
        objA.getClass();
        return (anpj) objA;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        this.h.writeToParcel(parcel, i);
    }
}
