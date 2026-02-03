package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class agyi implements bayb {
    public final fcsu a;
    private final fdjx b;

    public agyi(fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3, fdjx fdjxVar) {
        fcsuVar.getClass();
        fcsuVar2.getClass();
        fcsuVar3.getClass();
        fdjxVar.getClass();
        this.a = fcsuVar2;
        this.b = fdjxVar;
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [alqm, java.lang.Object] */
    @Override // defpackage.bayb
    public final void d(MessageCoreData messageCoreData) {
        messageCoreData.getClass();
        Object objE = ((cczi) crbf.ak.get()).e();
        objE.getClass();
        if (((Boolean) objE).booleanValue() && messageCoreData.cX() && !messageCoreData.ah().isEmpty() && messageCoreData.ah().get().z()) {
            auvh.h(auvw.c(this.b, fcyi.a, fdjz.a, new agyh(this, messageCoreData, null)));
        }
    }

    @Override // defpackage.bayb
    public final /* synthetic */ void e(MessageCoreData messageCoreData) {
        messageCoreData.getClass();
    }

    @Override // defpackage.bayb
    public final /* synthetic */ void k(MessageCoreData messageCoreData) {
        messageCoreData.getClass();
    }

    @Override // defpackage.bayb
    public final /* synthetic */ void g(MessageCoreData messageCoreData) {
    }
}
