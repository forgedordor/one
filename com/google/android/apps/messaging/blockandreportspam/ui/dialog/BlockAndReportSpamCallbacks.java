package com.google.android.apps.messaging.blockandreportspam.ui.dialog;

import android.os.Parcelable;
import com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversationId;
import defpackage.cpju;
import defpackage.cpjw;
import defpackage.cpki;
import defpackage.cpkj;
import defpackage.egps;
import defpackage.eiju;
import defpackage.ejvr;
import defpackage.elka;
import defpackage.eoqg;
import defpackage.eosc;
import defpackage.fcsu;
import defpackage.tjg;
import defpackage.tlb;
import defpackage.tlc;
import defpackage.tld;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class BlockAndReportSpamCallbacks {
    public final fcsu a;
    public final fcsu b;
    public final fcsu c;
    public final fcsu d;
    public final fcsu e;
    public final fcsu f;
    public final fcsu g;
    public final eosc h;
    public Supplier k = null;
    public final egps i = new tlb(this);
    public final egps j = new tlc(this);

    /* compiled from: PG */
    public static abstract class ParticipantBlockAndSpamStatus implements Parcelable {
        public abstract int a();

        public abstract String b();

        public abstract boolean c();

        public abstract boolean d();
    }

    public BlockAndReportSpamCallbacks(fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3, fcsu fcsuVar4, fcsu fcsuVar5, fcsu fcsuVar6, fcsu fcsuVar7, eosc eoscVar) {
        this.a = fcsuVar;
        this.b = fcsuVar2;
        this.c = fcsuVar3;
        this.d = fcsuVar4;
        this.e = fcsuVar5;
        this.f = fcsuVar6;
        this.g = fcsuVar7;
        this.h = eoscVar;
    }

    public final eiju a(tld tldVar, int i, int i2, int i3) {
        cpjw cpjwVar = (cpjw) this.b.b();
        cpki cpkiVarQ = cpkj.q();
        tjg tjgVar = (tjg) tldVar;
        cpju cpjuVar = (cpju) cpkiVarQ;
        cpjuVar.d = new BugleConversationId(tjgVar.c);
        boolean z = tjgVar.e;
        cpjuVar.a = z ? bool : null;
        cpjuVar.b = tjgVar.f ? true : null;
        cpjuVar.g = z ? elka.CONVERSATION_FROM_UNBLOCK_ACTION : elka.CONVERSATION_FROM_UNSPAM_ACTION;
        cpjuVar.i = i;
        cpjuVar.j = i2;
        cpjuVar.k = i3;
        return cpjwVar.a(cpkiVarQ.a().p()).h(new ejvr() { // from class: tkx
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                cpkr cpkrVar = (cpkr) obj;
                return cpkrVar == null ? cpkr.a : cpkrVar;
            }
        }, eoqg.a);
    }
}
