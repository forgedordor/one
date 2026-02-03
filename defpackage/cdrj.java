package defpackage;

import j$.util.Optional;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cdrj implements dvjb {
    private static final cqce b = cqce.g("Lighter", "BugleDataStoreEventsReceiver");
    public final akhq a;
    private final fcsu c;
    private final fcsu d;
    private final fcsu e;
    private final fcsu f;

    public cdrj(akhq akhqVar, fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3, fcsu fcsuVar4) {
        this.a = akhqVar;
        this.c = fcsuVar;
        this.d = fcsuVar2;
        this.e = fcsuVar3;
        this.f = fcsuVar4;
    }

    private final akhu e(dwpx dwpxVar) {
        akhu akhuVar = (akhu) akhv.a.createBuilder();
        String strD = dwpxVar.c().d();
        akhuVar.copyOnWrite();
        akhv akhvVar = (akhv) akhuVar.instance;
        akhvVar.b |= 1;
        akhvVar.c = strD;
        String string = ((JSONObject) dwpxVar.f().c()).toString();
        akhuVar.copyOnWrite();
        akhv akhvVar2 = (akhv) akhuVar.instance;
        string.getClass();
        akhvVar2.b |= 2;
        akhvVar2.d = string;
        if (((Boolean) this.f.b()).booleanValue()) {
            long epochMilli = ((cogw) this.e.b()).f().toEpochMilli();
            akhuVar.copyOnWrite();
            akhv akhvVar3 = (akhv) akhuVar.instance;
            akhvVar3.b |= 1024;
            akhvVar3.m = epochMilli;
        }
        return akhuVar;
    }

    @Override // defpackage.dvja
    public final void a(dwje dwjeVar, dwpx dwpxVar) {
        cqce cqceVar = b;
        cqceVar.m("BugleDataStoreEventsReceiver#onConversationMessageUpdated called for business_id: ".concat(dwpxVar.c().d()));
        Optional optionalOfNullable = Optional.ofNullable((dwqw) dvju.a(((dvop) ((dvhb) this.c.b()).c()).l(dwjeVar).w(dwpxVar)).f());
        if (!optionalOfNullable.isPresent()) {
            cqceVar.r("No messages on conversation, setting empty values for Message fields.");
            akhq akhqVar = this.a;
            akhu akhuVarE = e(dwpxVar);
            akhuVarE.copyOnWrite();
            akhv akhvVar = (akhv) akhuVarE.instance;
            akhv akhvVar2 = akhv.a;
            akhvVar.b |= 8;
            akhvVar.f = "";
            akhuVarE.copyOnWrite();
            akhv akhvVar3 = (akhv) akhuVarE.instance;
            akhvVar3.b |= 64;
            akhvVar3.i = true;
            akhuVarE.copyOnWrite();
            akhv akhvVar4 = (akhv) akhuVarE.instance;
            akhvVar4.b |= 128;
            akhvVar4.j = false;
            akhqVar.a((akhv) akhuVarE.build());
            fcsu fcsuVar = this.d;
            ((ains) fcsuVar.b()).e("Bugle.UnifiedInbox.EventsReceivers.Count", 5);
            ((ains) fcsuVar.b()).e("Bugle.UnifiedInbox.DataSync.Errors.Count", 1);
            return;
        }
        akhq akhqVar2 = this.a;
        akhu akhuVarE2 = e(dwpxVar);
        long millis = TimeUnit.MICROSECONDS.toMillis(((dwqw) optionalOfNullable.get()).d());
        akhuVarE2.copyOnWrite();
        akhv akhvVar5 = (akhv) akhuVarE2.instance;
        akhv akhvVar6 = akhv.a;
        akhvVar5.b |= 32;
        akhvVar5.h = millis;
        String str = (String) ((dwqw) optionalOfNullable.get()).m().e("");
        akhuVarE2.copyOnWrite();
        akhv akhvVar7 = (akhv) akhuVarE2.instance;
        akhvVar7.b |= 8;
        akhvVar7.f = str;
        boolean z = !((dwqw) optionalOfNullable.get()).i().equals(dwqq.INCOMING_RECEIVED);
        akhuVarE2.copyOnWrite();
        akhv akhvVar8 = (akhv) akhuVarE2.instance;
        akhvVar8.b |= 64;
        akhvVar8.i = z;
        boolean zContains = dwqq.n.contains(((dwqw) optionalOfNullable.get()).i());
        akhuVarE2.copyOnWrite();
        akhv akhvVar9 = (akhv) akhuVarE2.instance;
        akhvVar9.b |= 128;
        akhvVar9.j = zContains;
        akhqVar2.a((akhv) akhuVarE2.build());
        ((ains) this.d.b()).e("Bugle.UnifiedInbox.EventsReceivers.Count", 5);
    }

    @Override // defpackage.dvja
    public final void b(dwje dwjeVar, dwpx dwpxVar) {
        dwpx dwpxVar2;
        cqce cqceVar = b;
        cqceVar.m("BugleDataStoreEventsReceiver#onConversationUpdated called for business_id: ".concat(dwpxVar.c().d()));
        dvop dvopVar = (dvop) ((dvhb) this.c.b()).c();
        ejwi ejwiVarV = dvopVar.l(dwjeVar).v(dwpxVar);
        if (ejwiVarV.g()) {
            dvhn.a();
            final long jCurrentTimeMillis = System.currentTimeMillis();
            dwpxVar2 = dwpxVar;
            dvopVar.k(dwjeVar, dwpxVar2, ejwiVarV, new ejwm() { // from class: dvnl
                @Override // defpackage.ejwm
                public final boolean a(Object obj) {
                    return jCurrentTimeMillis > ((dwpo) obj).b();
                }
            }, new ejwm() { // from class: dvnm
                @Override // defpackage.ejwm
                public final boolean a(Object obj) {
                    return jCurrentTimeMillis > ((dwpo) obj).e();
                }
            });
            ejwiVarV = dvopVar.b(dwjeVar, ejwiVarV);
        } else {
            dwpxVar2 = dwpxVar;
        }
        Optional optionalOfNullable = Optional.ofNullable((dwpo) ejwiVarV.f());
        if (optionalOfNullable.isEmpty()) {
            cqceVar.m("Dropping onConversationUpdated. No matching conversation on Lighter DB");
            return;
        }
        akhu akhuVarE = e(dwpxVar2);
        String str = (String) ((dwpo) optionalOfNullable.get()).l().e("");
        akhuVarE.copyOnWrite();
        akhv akhvVar = (akhv) akhuVarE.instance;
        akhv akhvVar2 = akhv.a;
        akhvVar.b |= 4;
        akhvVar.e = str;
        String str2 = (String) ((dwpo) optionalOfNullable.get()).j().e("");
        akhuVarE.copyOnWrite();
        akhv akhvVar3 = (akhv) akhuVarE.instance;
        akhvVar3.b |= 16;
        akhvVar3.g = str2;
        long jA = ((dwpo) optionalOfNullable.get()).a();
        akhuVarE.copyOnWrite();
        akhv akhvVar4 = (akhv) akhuVarE.instance;
        akhvVar4.b |= 512;
        akhvVar4.l = jA;
        if (!((dwpo) optionalOfNullable.get()).l().g() || !((dwpo) optionalOfNullable.get()).j().g()) {
            ((ains) this.d.b()).e("Bugle.UnifiedInbox.DataSync.Errors.Count", 2);
        }
        this.a.a((akhv) akhuVarE.build());
        ((ains) this.d.b()).e("Bugle.UnifiedInbox.EventsReceivers.Count", 2);
    }

    @Override // defpackage.dviz
    public final void c() {
        ((ains) this.d.b()).e("Bugle.UnifiedInbox.EventsReceivers.Count", 1);
    }

    @Override // defpackage.dvja
    public final void d(dwpx dwpxVar, boolean z) {
        b.m("BugleDataStoreEventsReceiver#onConversationBlockStatusUpdated called for business_id: ".concat(dwpxVar.c().d()));
        akhu akhuVarE = e(dwpxVar);
        akhuVarE.copyOnWrite();
        akhv akhvVar = (akhv) akhuVarE.instance;
        akhv akhvVar2 = akhv.a;
        akhvVar.b |= 256;
        akhvVar.k = z;
        this.a.a((akhv) akhuVarE.build());
        ((ains) this.d.b()).e("Bugle.UnifiedInbox.EventsReceivers.Count", 4);
    }
}
