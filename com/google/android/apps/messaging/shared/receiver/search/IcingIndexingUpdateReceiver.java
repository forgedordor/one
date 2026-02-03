package com.google.android.apps.messaging.shared.receiver.search;

import android.content.Context;
import android.content.Intent;
import defpackage.aill;
import defpackage.aqdi;
import defpackage.bybl;
import defpackage.bybm;
import defpackage.bybn;
import defpackage.bycu;
import defpackage.cazj;
import defpackage.cbcu;
import defpackage.clez;
import defpackage.cmea;
import defpackage.cqbd;
import defpackage.cqce;
import defpackage.craf;
import defpackage.eieh;
import defpackage.eigp;
import defpackage.eiju;
import defpackage.eijx;
import defpackage.ellf;
import defpackage.ellg;
import defpackage.ellh;
import defpackage.embb;
import defpackage.embd;
import defpackage.embe;
import defpackage.emxt;
import defpackage.fcsu;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class IcingIndexingUpdateReceiver extends clez {
    private static final cqce f = cqce.g("BugleAction", "IcingIndexingUpdateReceiver");
    public fcsu a;
    public eigp b;
    public bybn c;
    public fcsu d;
    public fcsu e;

    @Override // defpackage.cldb
    public final eieh b() {
        return this.b.c("IcingIndexingUpdateReceiver Receive broadcast", "com/google/android/apps/messaging/shared/receiver/search/IcingIndexingUpdateReceiver", "beginRootTrace", 57);
    }

    @Override // defpackage.cldb
    public final eiju c(Context context, Intent intent) {
        if (intent != null && "com.google.firebase.appindexing.UPDATE_INDEX".equals(intent.getAction())) {
            int intExtra = intent.getIntExtra("com.google.firebase.appindexing.extra.REASON", 0);
            cqbd cqbdVarC = f.c();
            cqbdVarC.I("schedule the job to update index due to icing event:");
            cqbdVarC.I(intExtra != 1 ? intExtra != 2 ? "unknown" : "refresh" : "rebuild");
            cqbdVarC.r();
            int iA = embd.a(intExtra);
            aill aillVar = (aill) this.a.b();
            ellg ellgVar = (ellg) ellh.a.createBuilder();
            ellf ellfVar = ellf.ICING_INDEX_UPDATE_EVENT;
            ellgVar.copyOnWrite();
            ellh ellhVar = (ellh) ellgVar.instance;
            ellhVar.j = ellfVar.f11do;
            ellhVar.b |= 1;
            embb embbVar = (embb) embe.a.createBuilder();
            embbVar.copyOnWrite();
            embe embeVar = (embe) embbVar.instance;
            if (iA == 0) {
                throw null;
            }
            embeVar.c = iA - 1;
            embeVar.b |= 1;
            ellgVar.copyOnWrite();
            ellh ellhVar2 = (ellh) ellgVar.instance;
            embe embeVar2 = (embe) embbVar.build();
            embeVar2.getClass();
            ellhVar2.ae = embeVar2;
            ellhVar2.d = 1 | ellhVar2.d;
            aillVar.k(ellgVar, emxt.ICING_INDEX_UPDATE_EVENT);
            if (intExtra != 0) {
                ((cmea) this.d.b()).c();
                if (!((aqdi) this.e.b()).a()) {
                    ((cazj) this.c.a.b()).g(cbcu.f("icing_index_rebuild_handler", bybm.a));
                } else if (!craf.f) {
                    bybn bybnVar = this.c;
                    bybl byblVar = (bybl) bybm.a.createBuilder();
                    byblVar.copyOnWrite();
                    ((bybm) byblVar.instance).b = bycu.a(3);
                    ((cazj) bybnVar.a.b()).g(cbcu.f("icing_index_rebuild_handler", (bybm) byblVar.build()));
                }
            }
        }
        return eijx.e(null);
    }

    @Override // defpackage.cldb
    public final String d() {
        return "Bugle.Broadcast.IncomingIcingEvent.Latency";
    }
}
