package defpackage;

import com.google.android.rcs.client.messaging.data.ContentType;

/* compiled from: PG */
/* loaded from: classes6.dex */
class atab extends ejvj {
    @Override // defpackage.ejvj
    protected final /* bridge */ /* synthetic */ Object a(Object obj) {
        aubt aubtVar = (aubt) obj;
        efmx efmxVar = new efmx();
        if ((aubtVar.b & 1) != 0) {
            ejvj ejvjVar = atak.a;
            aubx aubxVar = aubtVar.c;
            if (aubxVar == null) {
                aubxVar = aubx.a;
            }
            efmxVar.c((ContentType) ejvjVar.fM(aubxVar));
        }
        if ((aubtVar.b & 2) != 0) {
            efmxVar.b(aubtVar.d);
        }
        return efmxVar.a();
    }

    @Override // defpackage.ejvj
    protected final /* bridge */ /* synthetic */ Object b(Object obj) {
        efnd efndVar = (efnd) obj;
        aubs aubsVar = (aubs) aubt.a.createBuilder();
        evqs evqsVarB = efndVar.b();
        aubsVar.copyOnWrite();
        aubt aubtVar = (aubt) aubsVar.instance;
        aubtVar.b |= 2;
        aubtVar.d = evqsVarB;
        aubx aubxVar = (aubx) atak.a.fH().fM(efndVar.a());
        aubsVar.copyOnWrite();
        aubt aubtVar2 = (aubt) aubsVar.instance;
        aubxVar.getClass();
        aubtVar2.c = aubxVar;
        aubtVar2.b |= 1;
        return (aubt) aubsVar.build();
    }
}
