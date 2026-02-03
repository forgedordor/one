package com.google.android.apps.messaging.shared.api.messaging.conversation.emergencysos;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.messaging.shared.api.messaging.Conversation;
import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;
import com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversation;
import defpackage.ajlu;
import defpackage.ajlw;
import defpackage.ajmh;
import defpackage.ajvr;
import defpackage.akff;
import defpackage.akfg;
import defpackage.akfk;
import defpackage.akfl;
import defpackage.amkd;
import defpackage.amrk;
import defpackage.amrl;
import defpackage.anph;
import defpackage.anpj;
import defpackage.auvh;
import defpackage.cdfg;
import defpackage.cloc;
import defpackage.clox;
import defpackage.clpl;
import defpackage.fcsu;
import defpackage.fdjx;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class EmergencySosConversation implements Conversation, clpl {
    public static final Parcelable.Creator<Conversation> CREATOR = new akff();
    private final EmergencySosConversationId a;
    private final BugleConversation b;
    private final anpj c;
    private final fcsu d;
    private final amrl e;

    /* compiled from: PG */
    public interface a {
        ajvr ag();

        akfg aj();
    }

    public EmergencySosConversation(anph anphVar, akfl akflVar, fcsu fcsuVar, amrl amrlVar, BugleConversation bugleConversation) {
        EmergencySosConversationId emergencySosConversationId = new EmergencySosConversationId(bugleConversation.l().a);
        this.a = emergencySosConversationId;
        this.b = bugleConversation;
        anpj anpjVarN = bugleConversation.n();
        fdjx fdjxVar = (fdjx) akflVar.a.b();
        fdjxVar.getClass();
        anpjVarN.getClass();
        this.c = anphVar.a(new akfk(fdjxVar, emergencySosConversationId, anpjVarN));
        this.d = fcsuVar;
        this.e = amrlVar;
    }

    @Override // com.google.android.apps.messaging.shared.api.messaging.Conversation
    public final ajlu a() {
        ajlu ajluVarA = this.b.a();
        anpj anpjVarI = i();
        ajluVarA.getClass();
        anpjVarI.getClass();
        anpj anpjVar = this.c;
        anpjVar.getClass();
        return new amrk(this.e.a, ajluVarA, this.a, anpjVarI, anpjVar);
    }

    @Override // com.google.android.apps.messaging.shared.api.messaging.Conversation
    public final ajlw b() {
        return this.b.b();
    }

    @Override // com.google.android.apps.messaging.shared.api.messaging.Conversation
    public final ajmh c() {
        return this.b.m();
    }

    @Override // com.google.android.apps.messaging.shared.api.messaging.Conversation, java.lang.AutoCloseable
    public final void close() {
        ((clox) this.d.b()).f(this);
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
        return this.b.g();
    }

    @Override // com.google.android.apps.messaging.shared.api.messaging.Conversation
    public final anpj h() {
        return this.c;
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
        fcsu fcsuVar = this.d;
        auvh.f(((clox) fcsuVar.b()).a(), "Failed to retrieve current session status on emergency sos conversation displayed.");
        this.b.k();
        ((clox) fcsuVar.b()).e(this);
    }

    @Override // defpackage.clpl
    public final void l(cloc clocVar) {
        if (clocVar == cloc.SESSION_STATUS_ENDING_EMERGENCY) {
            this.b.m().ab();
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.b.writeToParcel(parcel, i);
    }
}
