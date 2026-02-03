package com.google.android.apps.messaging.shared.api.messaging.conversation.penpal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.messaging.shared.api.messaging.Conversation;
import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;
import com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversation;
import defpackage.ajln;
import defpackage.ajlu;
import defpackage.ajlw;
import defpackage.ajmh;
import defpackage.ajvr;
import defpackage.akkr;
import defpackage.akks;
import defpackage.akkv;
import defpackage.akkw;
import defpackage.akkz;
import defpackage.akla;
import defpackage.amkd;
import defpackage.anpg;
import defpackage.anph;
import defpackage.anpj;
import defpackage.cdfg;
import defpackage.ejxr;
import defpackage.ejxx;
import defpackage.fcsu;
import defpackage.fdjx;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class PenpalBotConversation implements Conversation {
    public static final Parcelable.Creator<Conversation> CREATOR = new akkr();
    public final BugleConversation a;
    private final ejxr b;
    private final PenpalBotConversationId c;
    private final akkv d;
    private final anpj e;

    /* compiled from: PG */
    public interface a {
        ajvr ag();

        akks ak();
    }

    public PenpalBotConversation(anph anphVar, akla aklaVar, akkw akkwVar, BugleConversation bugleConversation, ajln ajlnVar) {
        PenpalBotConversationId penpalBotConversationId = new PenpalBotConversationId(bugleConversation.l().a);
        this.c = penpalBotConversationId;
        this.a = bugleConversation;
        fdjx fdjxVar = (fdjx) aklaVar.a.b();
        fdjxVar.getClass();
        anpg anpgVarA = anphVar.a(new akkz(fdjxVar, penpalBotConversationId, bugleConversation));
        this.e = anpgVarA;
        this.b = ejxx.a(new ejxr() { // from class: akkq
            @Override // defpackage.ejxr
            public final Object get() {
                return new anet(this.a.a.m());
            }
        });
        fdjx fdjxVar2 = (fdjx) akkwVar.a.b();
        fdjxVar2.getClass();
        fcsu fcsuVar = akkwVar.b;
        anpgVarA.getClass();
        this.d = new akkv(fdjxVar2, fcsuVar, bugleConversation, ajlnVar, anpgVarA);
    }

    @Override // com.google.android.apps.messaging.shared.api.messaging.Conversation
    public final ajlu a() {
        return this.a.a();
    }

    @Override // com.google.android.apps.messaging.shared.api.messaging.Conversation
    public final ajlw b() {
        return this.a.b();
    }

    @Override // com.google.android.apps.messaging.shared.api.messaging.Conversation
    public final ajmh c() {
        return (ajmh) this.b.get();
    }

    @Override // com.google.android.apps.messaging.shared.api.messaging.Conversation, java.lang.AutoCloseable
    public final void close() {
        this.a.close();
    }

    @Override // com.google.android.apps.messaging.shared.api.messaging.Conversation
    public final ConversationId d() {
        return this.c;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return this.a.describeContents();
    }

    @Override // com.google.android.apps.messaging.shared.api.messaging.Conversation
    public final amkd e() {
        return this.a.e();
    }

    @Override // com.google.android.apps.messaging.shared.api.messaging.Conversation
    public final anpj f() {
        return this.a.f();
    }

    @Override // com.google.android.apps.messaging.shared.api.messaging.Conversation
    public final anpj g() {
        return this.d;
    }

    @Override // com.google.android.apps.messaging.shared.api.messaging.Conversation
    public final anpj h() {
        return this.e;
    }

    @Override // com.google.android.apps.messaging.shared.api.messaging.Conversation
    public final anpj i() {
        return this.a.i();
    }

    @Override // com.google.android.apps.messaging.shared.api.messaging.Conversation
    public final cdfg j() {
        return this.a.j();
    }

    @Override // com.google.android.apps.messaging.shared.api.messaging.Conversation
    public final void k() {
        this.a.k();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.a.writeToParcel(parcel, i);
    }
}
