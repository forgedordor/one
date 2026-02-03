package com.google.android.apps.messaging.conversation2.viewmodel;

import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import defpackage.aakw;
import defpackage.aalc;
import defpackage.aale;
import defpackage.aalk;
import defpackage.aall;
import defpackage.aalo;
import defpackage.adma;
import defpackage.admb;
import defpackage.afza;
import defpackage.afzc;
import defpackage.aqkm;
import defpackage.aqtu;
import defpackage.aquo;
import defpackage.auvw;
import defpackage.barn;
import defpackage.cczi;
import defpackage.cliy;
import defpackage.cljh;
import defpackage.crbf;
import defpackage.diii;
import defpackage.dmgl;
import defpackage.ejxr;
import defpackage.fcsu;
import defpackage.fdct;
import defpackage.fdjx;
import defpackage.fdpl;
import defpackage.lxd;
import defpackage.zim;
import defpackage.zwn;
import defpackage.zwo;
import defpackage.zww;
import j$.util.Optional;
import java.util.Iterator;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ConversationViewModel extends lxd {
    public final ConversationId a;
    public final zww b;
    public final fcsu c;
    public final fcsu d;
    public final fcsu e;
    public final fcsu f;
    public final fcsu g;
    public final fcsu h;
    public final fcsu i;
    public final fcsu j;
    public final afzc k;
    public final afza l;
    public final fdpl m;
    public final aalo n;
    public final dmgl o;
    public final zim p;
    public final diii q;
    private final fdjx r;
    private final boolean s;

    /* JADX WARN: Type inference failed for: r4v27, types: [agva, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v11, types: [agtj, java.lang.Object] */
    public ConversationViewModel(ConversationId conversationId, fdjx fdjxVar, zww zwwVar, fcsu fcsuVar, zim zimVar, fcsu fcsuVar2, fcsu fcsuVar3, fcsu fcsuVar4, fcsu fcsuVar5, fcsu fcsuVar6, boolean z, fcsu fcsuVar7, fcsu fcsuVar8, afzc afzcVar, afza afzaVar, diii diiiVar, fdpl fdplVar, fcsu fcsuVar9, aalo aaloVar, Optional optional, fdpl fdplVar2, Optional optional2, Optional optional3, fcsu fcsuVar10, fcsu fcsuVar11, fcsu fcsuVar12, fcsu fcsuVar13, aqkm aqkmVar) throws Exception {
        conversationId.getClass();
        fdjxVar.getClass();
        fcsuVar.getClass();
        fcsuVar4.getClass();
        fcsuVar5.getClass();
        fcsuVar6.getClass();
        fcsuVar8.getClass();
        afzcVar.getClass();
        afzaVar.getClass();
        diiiVar.getClass();
        fdplVar.getClass();
        fcsuVar9.getClass();
        fdplVar2.getClass();
        fcsuVar10.getClass();
        fcsuVar11.getClass();
        fcsuVar12.getClass();
        aqkmVar.getClass();
        this.a = conversationId;
        this.r = fdjxVar;
        this.b = zwwVar;
        this.c = fcsuVar;
        this.p = zimVar;
        this.d = fcsuVar2;
        this.e = fcsuVar3;
        this.f = fcsuVar4;
        this.g = fcsuVar5;
        this.h = fcsuVar6;
        this.s = z;
        this.i = fcsuVar7;
        this.j = fcsuVar8;
        this.k = afzcVar;
        this.l = afzaVar;
        this.q = diiiVar;
        this.m = fdplVar;
        this.n = aaloVar;
        dmgl dmglVar = (dmgl) fdct.b(optional);
        this.o = dmglVar == null ? new aale() : dmglVar;
        auvw.k(fdjxVar, null, null, new aakw(fdplVar2, this, null), 3);
        aall aallVar = (aall) fcsuVar11.b();
        auvw.k(aallVar.b, null, null, new aalk(aallVar, null), 3);
        ejxr ejxrVar = crbf.ak;
        if (((Boolean) ((cczi) ejxrVar.get()).e()).booleanValue()) {
            optional2.isPresent();
            optional2.get().a();
        }
        if (((Boolean) ((cczi) ejxrVar.get()).e()).booleanValue()) {
            optional3.isPresent();
            optional3.get().a();
        }
        if (!((aqtu) fcsuVar13.b()).a()) {
            zwo zwoVar = (zwo) fcsuVar12.b();
            ConversationIdType conversationIdTypeB = barn.b(zwoVar.f.b());
            if (!conversationIdTypeB.equals(barn.a)) {
                zwoVar.a((cljh) ((cliy) zwoVar.b.b()).h().c(), conversationIdTypeB, true);
                auvw.k(zwoVar.c, null, null, new zwn(zwoVar, conversationIdTypeB, null), 3);
            }
        }
        admb admbVar = (admb) fcsuVar10.b();
        auvw.k(admbVar.a, null, null, new adma(admbVar, null), 3);
        fz(new AutoCloseable() { // from class: aakr
            @Override // java.lang.AutoCloseable
            public final void close() {
                Iterator it = ((Set) this.a.c.b()).iterator();
                while (it.hasNext()) {
                    ((aalp) it.next()).close();
                }
            }
        });
        if (((aquo) fcsuVar8.b()).a() && z) {
            auvw.k(fdjxVar, null, null, new aalc(this, null), 3);
        }
    }
}
