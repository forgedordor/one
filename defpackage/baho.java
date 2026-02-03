package defpackage;

import android.content.Context;
import android.net.Uri;
import android.os.Parcel;
import com.google.android.apps.messaging.shared.api.messaging.selfidentity.SelfIdentityId;
import com.google.android.apps.messaging.shared.api.messaging.selfidentity.SelfIdentityIdImpl;
import com.google.android.apps.messaging.shared.datamodel.data.MessageData;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class baho implements bveg {
    private final fcsu a;
    private final fcsu b;
    private final fcsu c;
    private final fcsu d;
    private final fcsu e;
    private final fcsu f;
    private final fcsu g;
    private final fcsu h;
    private final fcsu i;
    private final fcsu j;
    private final fcsu k;
    private final fcsu l;

    public baho(fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3, fcsu fcsuVar4, fcsu fcsuVar5, fcsu fcsuVar6, fcsu fcsuVar7, fcsu fcsuVar8, fcsu fcsuVar9, fcsu fcsuVar10, fcsu fcsuVar11, fcsu fcsuVar12) {
        fcsuVar.getClass();
        this.a = fcsuVar;
        this.b = fcsuVar2;
        fcsuVar3.getClass();
        this.c = fcsuVar3;
        fcsuVar4.getClass();
        this.d = fcsuVar4;
        fcsuVar5.getClass();
        this.e = fcsuVar5;
        fcsuVar6.getClass();
        this.f = fcsuVar6;
        fcsuVar7.getClass();
        this.g = fcsuVar7;
        fcsuVar8.getClass();
        this.h = fcsuVar8;
        this.i = fcsuVar9;
        fcsuVar10.getClass();
        this.j = fcsuVar10;
        fcsuVar11.getClass();
        this.k = fcsuVar11;
        fcsuVar12.getClass();
        this.l = fcsuVar12;
    }

    @Override // defpackage.bveg
    public final /* bridge */ /* synthetic */ MessageCoreData a() {
        Context context = (Context) this.a.b();
        context.getClass();
        cogw cogwVar = (cogw) this.b.b();
        cogwVar.getClass();
        ((bahv) this.c.b()).getClass();
        bveg bvegVar = (bveg) this.d.b();
        bvegVar.getClass();
        ((cgvz) this.f.b()).getClass();
        bahm bahmVar = (bahm) this.k.b();
        bahmVar.getClass();
        return new MessageData(context, cogwVar, bvegVar, this.e, this.g, this.h, this.i, this.j, bahmVar);
    }

    @Override // defpackage.bveg
    public final /* bridge */ /* synthetic */ MessageCoreData b(Parcel parcel) {
        Context context = (Context) this.a.b();
        context.getClass();
        cogw cogwVar = (cogw) this.b.b();
        cogwVar.getClass();
        ((bahv) this.c.b()).getClass();
        bveg bvegVar = (bveg) this.d.b();
        bvegVar.getClass();
        cgvz cgvzVar = (cgvz) this.f.b();
        cgvzVar.getClass();
        parcel.getClass();
        bahm bahmVar = (bahm) this.k.b();
        bahmVar.getClass();
        fcsu fcsuVar = this.h;
        fcsu fcsuVar2 = this.i;
        fcsu fcsuVar3 = this.j;
        return new MessageData(context, cogwVar, bvegVar, this.e, cgvzVar, this.g, parcel, fcsuVar, fcsuVar2, fcsuVar3, bahmVar);
    }

    @Override // defpackage.bveg
    public final /* bridge */ /* synthetic */ MessageCoreData c(MessagesTable.BindData bindData, List list) {
        Context context = (Context) this.a.b();
        context.getClass();
        cogw cogwVar = (cogw) this.b.b();
        cogwVar.getClass();
        bahv bahvVar = (bahv) this.c.b();
        bahvVar.getClass();
        bveg bvegVar = (bveg) this.d.b();
        bvegVar.getClass();
        ((cgvz) this.f.b()).getClass();
        bahm bahmVar = (bahm) this.k.b();
        bahmVar.getClass();
        bindData.getClass();
        list.getClass();
        return new MessageData(context, cogwVar, bahvVar, bvegVar, this.e, this.g, this.h, this.i, this.j, bahmVar, bindData, list);
    }

    @Override // defpackage.bveg
    public final /* synthetic */ MessageCoreData d(String str, ConversationIdType conversationIdType, String str2, SelfIdentityId selfIdentityId, String str3, String str4, long j, long j2, boolean z, boolean z2, int i, String str5) {
        Context context = (Context) this.a.b();
        context.getClass();
        cogw cogwVar = (cogw) this.b.b();
        cogwVar.getClass();
        bahv bahvVar = (bahv) this.c.b();
        bahvVar.getClass();
        bveg bvegVar = (bveg) this.d.b();
        bvegVar.getClass();
        cgvz cgvzVar = (cgvz) this.f.b();
        cgvzVar.getClass();
        bahm bahmVar = (bahm) this.k.b();
        bahmVar.getClass();
        conversationIdType.getClass();
        str2.getClass();
        str3.getClass();
        str4.getClass();
        return new MessageData(context, cogwVar, bahvVar, bvegVar, this.e, cgvzVar, this.g, this.h, this.i, this.j, bahmVar, str, conversationIdType, str2, selfIdentityId, str3, str4, j, j2, z, z2, i, str5);
    }

    @Override // defpackage.bveg
    public final /* synthetic */ MessageCoreData e(ConversationIdType conversationIdType, SelfIdentityId selfIdentityId, String str, String str2, boolean z) {
        Context context = (Context) this.a.b();
        context.getClass();
        cogw cogwVar = (cogw) this.b.b();
        cogwVar.getClass();
        bahv bahvVar = (bahv) this.c.b();
        bahvVar.getClass();
        bveg bvegVar = (bveg) this.d.b();
        bvegVar.getClass();
        cgvz cgvzVar = (cgvz) this.f.b();
        cgvzVar.getClass();
        bahm bahmVar = (bahm) this.k.b();
        bahmVar.getClass();
        conversationIdType.getClass();
        return new MessageData(context, cogwVar, bahvVar, bvegVar, this.e, cgvzVar, this.g, this.h, this.i, this.j, bahmVar, conversationIdType, selfIdentityId, str, str2, z);
    }

    @Override // defpackage.bveg
    public final /* synthetic */ MessageCoreData f(ConversationIdType conversationIdType, SelfIdentityId selfIdentityId, String str) {
        Context context = (Context) this.a.b();
        context.getClass();
        cogw cogwVar = (cogw) this.b.b();
        cogwVar.getClass();
        bahv bahvVar = (bahv) this.c.b();
        bahvVar.getClass();
        bveg bvegVar = (bveg) this.d.b();
        bvegVar.getClass();
        ((cgvz) this.f.b()).getClass();
        bahm bahmVar = (bahm) this.k.b();
        bahmVar.getClass();
        conversationIdType.getClass();
        return new MessageData(context, cogwVar, bvegVar, this.e, this.g, this.h, this.i, this.j, bahmVar, conversationIdType, aoet.b(selfIdentityId), selfIdentityId, 3, 0, MessageData.aH(bahvVar, str));
    }

    @Override // defpackage.bveg
    public final /* synthetic */ MessageCoreData g(int i, ConversationIdType conversationIdType, SelfIdentityId selfIdentityId) {
        Context context = (Context) this.a.b();
        context.getClass();
        cogw cogwVar = (cogw) this.b.b();
        cogwVar.getClass();
        bahv bahvVar = (bahv) this.c.b();
        bahvVar.getClass();
        bveg bvegVar = (bveg) this.d.b();
        bvegVar.getClass();
        cgvz cgvzVar = (cgvz) this.f.b();
        cgvzVar.getClass();
        bahm bahmVar = (bahm) this.k.b();
        bahmVar.getClass();
        conversationIdType.getClass();
        return new MessageData(context, cogwVar, bahvVar, bvegVar, this.e, cgvzVar, this.g, this.h, this.i, this.j, bahmVar, i, conversationIdType, selfIdentityId, (String) null);
    }

    @Override // defpackage.bveg
    public final /* synthetic */ MessageCoreData h(String str, String str2, SelfIdentityId selfIdentityId, ConversationIdType conversationIdType, boolean z, int i, String str3, String str4, int i2, String str5, boolean z2, boolean z3, long j, int i3, long j2, long j3, long j4, String str6, bvdz bvdzVar, long j5) {
        Context context = (Context) this.a.b();
        context.getClass();
        cogw cogwVar = (cogw) this.b.b();
        cogwVar.getClass();
        bahv bahvVar = (bahv) this.c.b();
        bahvVar.getClass();
        bveg bvegVar = (bveg) this.d.b();
        bvegVar.getClass();
        cgvz cgvzVar = (cgvz) this.f.b();
        cgvzVar.getClass();
        bahm bahmVar = (bahm) this.k.b();
        bahmVar.getClass();
        selfIdentityId.getClass();
        conversationIdType.getClass();
        bvdzVar.getClass();
        return new MessageData(context, cogwVar, bahvVar, bvegVar, this.e, cgvzVar, this.g, this.h, this.i, this.j, bahmVar, str, str2, selfIdentityId, conversationIdType, z, i, str3, str4, i2, str5, z2, z3, j, i3, j2, j3, j4, str6, bvdzVar, j5);
    }

    @Override // defpackage.bveg
    public final /* synthetic */ MessageCoreData i(Uri uri, ConversationIdType conversationIdType, String str, SelfIdentityId selfIdentityId, String str2, String str3, long j, long j2, boolean z, boolean z2, long j3) {
        Context context = (Context) this.a.b();
        context.getClass();
        cogw cogwVar = (cogw) this.b.b();
        cogwVar.getClass();
        bahv bahvVar = (bahv) this.c.b();
        bahvVar.getClass();
        bveg bvegVar = (bveg) this.d.b();
        bvegVar.getClass();
        cgvz cgvzVar = (cgvz) this.f.b();
        cgvzVar.getClass();
        bahm bahmVar = (bahm) this.k.b();
        bahmVar.getClass();
        conversationIdType.getClass();
        str.getClass();
        return new MessageData(context, cogwVar, bahvVar, bvegVar, this.e, cgvzVar, this.g, this.h, this.i, this.j, bahmVar, uri, conversationIdType, str, selfIdentityId, str2, str3, j, j2, z, z2, j3);
    }

    @Override // defpackage.bveg
    public final /* synthetic */ MessageCoreData j(String str, String str2, SelfIdentityId selfIdentityId, ConversationIdType conversationIdType, int i, boolean z, boolean z2, long j, long j2, String str3) {
        Context context = (Context) this.a.b();
        context.getClass();
        cogw cogwVar = (cogw) this.b.b();
        cogwVar.getClass();
        bahv bahvVar = (bahv) this.c.b();
        bahvVar.getClass();
        bveg bvegVar = (bveg) this.d.b();
        bvegVar.getClass();
        cgvz cgvzVar = (cgvz) this.f.b();
        cgvzVar.getClass();
        bahm bahmVar = (bahm) this.k.b();
        bahmVar.getClass();
        conversationIdType.getClass();
        str3.getClass();
        return new MessageData(context, cogwVar, bahvVar, bvegVar, this.e, cgvzVar, this.g, this.h, this.i, this.j, bahmVar, str, str2, selfIdentityId, conversationIdType, i, z, z2, j, j2, str3);
    }

    @Override // defpackage.bveg
    public final /* synthetic */ MessageCoreData k(String str, SelfIdentityId selfIdentityId, ConversationIdType conversationIdType, int i, long j, String str2) {
        Context context = (Context) this.a.b();
        context.getClass();
        cogw cogwVar = (cogw) this.b.b();
        cogwVar.getClass();
        bahv bahvVar = (bahv) this.c.b();
        bahvVar.getClass();
        bveg bvegVar = (bveg) this.d.b();
        bvegVar.getClass();
        cgvz cgvzVar = (cgvz) this.f.b();
        cgvzVar.getClass();
        bahm bahmVar = (bahm) this.k.b();
        bahmVar.getClass();
        str.getClass();
        selfIdentityId.getClass();
        conversationIdType.getClass();
        return new MessageData(context, cogwVar, bahvVar, bvegVar, this.e, cgvzVar, this.g, this.h, this.i, this.j, bahmVar, str, selfIdentityId, conversationIdType, i, j, str2);
    }

    @Override // defpackage.bveg
    public final /* synthetic */ MessageCoreData l(ConversationIdType conversationIdType, int i, long j, MessageIdType messageIdType) {
        Context context = (Context) this.a.b();
        context.getClass();
        cogw cogwVar = (cogw) this.b.b();
        cogwVar.getClass();
        bahv bahvVar = (bahv) this.c.b();
        bahvVar.getClass();
        bveg bvegVar = (bveg) this.d.b();
        bvegVar.getClass();
        cgvz cgvzVar = (cgvz) this.f.b();
        cgvzVar.getClass();
        bahm bahmVar = (bahm) this.k.b();
        bahmVar.getClass();
        conversationIdType.getClass();
        return new MessageData(context, cogwVar, bahvVar, bvegVar, this.e, cgvzVar, this.g, this.l, this.h, this.i, this.j, bahmVar, conversationIdType, i, j, messageIdType);
    }

    @Override // defpackage.bveg
    public final /* bridge */ /* synthetic */ MessageCoreData m(ConversationIdType conversationIdType, SelfIdentityId selfIdentityId, aubq aubqVar, String str, String str2) {
        Context context = (Context) this.a.b();
        context.getClass();
        cogw cogwVar = (cogw) this.b.b();
        cogwVar.getClass();
        bahv bahvVar = (bahv) this.c.b();
        bahvVar.getClass();
        bveg bvegVar = (bveg) this.d.b();
        bvegVar.getClass();
        cgvz cgvzVar = (cgvz) this.f.b();
        cgvzVar.getClass();
        bahm bahmVar = (bahm) this.k.b();
        bahmVar.getClass();
        conversationIdType.getClass();
        return new MessageData(context, cogwVar, bahvVar, bvegVar, this.e, cgvzVar, this.g, this.h, this.i, this.j, bahmVar, conversationIdType, selfIdentityId, aubqVar, str, str2);
    }

    @Override // defpackage.bveg
    public final /* synthetic */ MessageCoreData n(String str, SelfIdentityId selfIdentityId, ConversationIdType conversationIdType, long j, long j2, String str2, baro baroVar) {
        return p(str, selfIdentityId, conversationIdType, 100, false, false, j, j2, str2, baroVar);
    }

    @Override // defpackage.bveg
    public final /* bridge */ /* synthetic */ MessageCoreData o(String str, long j, long j2, basd basdVar, String str2, SelfIdentityId selfIdentityId, ConversationIdType conversationIdType, int i, int i2, boolean z, boolean z2, long j3, long j4, String str3, String str4) {
        Context context = (Context) this.a.b();
        context.getClass();
        cogw cogwVar = (cogw) this.b.b();
        cogwVar.getClass();
        bahv bahvVar = (bahv) this.c.b();
        bahvVar.getClass();
        bveg bvegVar = (bveg) this.d.b();
        bvegVar.getClass();
        cgvz cgvzVar = (cgvz) this.f.b();
        cgvzVar.getClass();
        bahm bahmVar = (bahm) this.k.b();
        bahmVar.getClass();
        basdVar.getClass();
        str2.getClass();
        str3.getClass();
        return new MessageData(context, cogwVar, bahvVar, bvegVar, this.e, cgvzVar, this.g, this.h, this.i, this.j, bahmVar, str, j, j2, basdVar, str2, selfIdentityId, conversationIdType, i, i2, z, z2, j3, j4, str3, str4);
    }

    public final MessageData p(String str, SelfIdentityId selfIdentityId, ConversationIdType conversationIdType, int i, boolean z, boolean z2, long j, long j2, String str2, baro baroVar) {
        Context context = (Context) this.a.b();
        context.getClass();
        cogw cogwVar = (cogw) this.b.b();
        cogwVar.getClass();
        bahv bahvVar = (bahv) this.c.b();
        bahvVar.getClass();
        bveg bvegVar = (bveg) this.d.b();
        bvegVar.getClass();
        cgvz cgvzVar = (cgvz) this.f.b();
        cgvzVar.getClass();
        bahm bahmVar = (bahm) this.k.b();
        bahmVar.getClass();
        conversationIdType.getClass();
        return new MessageData(context, cogwVar, bahvVar, bvegVar, this.e, cgvzVar, this.g, this.h, this.i, this.j, bahmVar, str, selfIdentityId, conversationIdType, i, z, z2, j, j2, str2, baroVar);
    }

    @Override // defpackage.bveg
    public final /* synthetic */ MessageCoreData q(SelfIdentityId selfIdentityId, ConversationIdType conversationIdType, int i, long j, clmw clmwVar, baro baroVar) {
        Context context = (Context) this.a.b();
        context.getClass();
        cogw cogwVar = (cogw) this.b.b();
        cogwVar.getClass();
        bahv bahvVar = (bahv) this.c.b();
        bahvVar.getClass();
        bveg bvegVar = (bveg) this.d.b();
        bvegVar.getClass();
        cgvz cgvzVar = (cgvz) this.f.b();
        cgvzVar.getClass();
        bahm bahmVar = (bahm) this.k.b();
        bahmVar.getClass();
        String str = ((SelfIdentityIdImpl) selfIdentityId).a;
        return new MessageData(context, cogwVar, bahvVar, bvegVar, this.e, cgvzVar, this.g, this.h, this.i, this.j, bahmVar, str, selfIdentityId, conversationIdType, i, j, j, clmwVar, baroVar);
    }

    @Override // defpackage.bveg
    public final /* synthetic */ MessageCoreData r(SelfIdentityId selfIdentityId, ConversationIdType conversationIdType, long j, String str, baro baroVar) {
        return p(((SelfIdentityIdImpl) selfIdentityId).a, selfIdentityId, conversationIdType, 1, true, true, j, j, str, baroVar);
    }

    @Override // defpackage.bveg
    public final /* bridge */ /* synthetic */ MessageCoreData s(basd basdVar, String str, SelfIdentityId selfIdentityId, ConversationIdType conversationIdType, int i, int i2, String str2, boolean z, boolean z2, long j, long j2) {
        Context context = (Context) this.a.b();
        context.getClass();
        cogw cogwVar = (cogw) this.b.b();
        cogwVar.getClass();
        bahv bahvVar = (bahv) this.c.b();
        bahvVar.getClass();
        bveg bvegVar = (bveg) this.d.b();
        bvegVar.getClass();
        cgvz cgvzVar = (cgvz) this.f.b();
        cgvzVar.getClass();
        bahm bahmVar = (bahm) this.k.b();
        bahmVar.getClass();
        basdVar.getClass();
        str.getClass();
        conversationIdType.getClass();
        return new MessageData(context, cogwVar, bahvVar, bvegVar, this.e, cgvzVar, this.g, this.h, this.i, this.j, bahmVar, basdVar, str, selfIdentityId, conversationIdType, i, i2, str2, 0L, z, z2, j, j2);
    }

    @Override // defpackage.bveg
    public final /* synthetic */ MessageCoreData t(ConversationIdType conversationIdType, String str, aubq aubqVar) {
        Context context = (Context) this.a.b();
        context.getClass();
        cogw cogwVar = (cogw) this.b.b();
        cogwVar.getClass();
        bahv bahvVar = (bahv) this.c.b();
        bahvVar.getClass();
        bveg bvegVar = (bveg) this.d.b();
        bvegVar.getClass();
        cgvz cgvzVar = (cgvz) this.f.b();
        cgvzVar.getClass();
        bahm bahmVar = (bahm) this.k.b();
        bahmVar.getClass();
        return new MessageData(context, cogwVar, bahvVar, bvegVar, this.e, cgvzVar, this.g, this.h, this.i, this.j, bahmVar, conversationIdType, str, aubqVar);
    }

    @Override // defpackage.bveg
    public final /* synthetic */ MessageCoreData u(ConversationIdType conversationIdType, SelfIdentityId selfIdentityId, String str) {
        Context context = (Context) this.a.b();
        context.getClass();
        cogw cogwVar = (cogw) this.b.b();
        cogwVar.getClass();
        bahv bahvVar = (bahv) this.c.b();
        bahvVar.getClass();
        bveg bvegVar = (bveg) this.d.b();
        bvegVar.getClass();
        cgvz cgvzVar = (cgvz) this.f.b();
        cgvzVar.getClass();
        bahm bahmVar = (bahm) this.k.b();
        bahmVar.getClass();
        conversationIdType.getClass();
        return new MessageData(context, cogwVar, bahvVar, bvegVar, this.e, cgvzVar, this.g, this.h, this.i, this.j, bahmVar, 7, conversationIdType, selfIdentityId, str);
    }
}
