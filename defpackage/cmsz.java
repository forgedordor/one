package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cmsz implements baye {
    public final fcsu a;
    private final fcsu b;
    private final arrc c;
    private final arrd d;
    private final fdjx e;

    public cmsz(fcsu fcsuVar, fcsu fcsuVar2, arrc arrcVar, arrd arrdVar, fdjx fdjxVar) {
        fcsuVar.getClass();
        fcsuVar2.getClass();
        arrcVar.getClass();
        arrdVar.getClass();
        fdjxVar.getClass();
        this.b = fcsuVar;
        this.a = fcsuVar2;
        this.c = arrcVar;
        this.d = arrdVar;
        this.e = fdjxVar;
    }

    @Override // defpackage.baye
    public final /* synthetic */ eieu c() {
        return bayd.a();
    }

    @Override // defpackage.baye, defpackage.baxz
    public final void gb(MessageCoreData messageCoreData) {
        fhaz fhazVarAJ;
        if (!this.c.a() || (fhazVarAJ = messageCoreData.aJ()) == null) {
            return;
        }
        ((cmxn) this.b.b()).j(fhazVarAJ.b, new dzfh("ToMessageStoredInDbSms"), cmxn.k);
    }

    @Override // defpackage.baye
    public final void l(long j, fhaz fhazVar) {
        if (this.c.a()) {
            ((cmxn) this.b.b()).g(cmxm.SMS_ARRIVED, fhazVar.b);
        }
        if (this.d.a()) {
            auvw.m(this.e, null, new cmsy(this, j, null), 3);
        }
    }

    @Override // defpackage.baye, defpackage.baxz
    public final /* synthetic */ void e(String str) {
    }

    @Override // defpackage.baye, defpackage.baxz
    public final /* synthetic */ void g(MessageCoreData messageCoreData) {
    }
}
