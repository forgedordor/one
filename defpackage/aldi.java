package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.MessageId;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class aldi extends fcyz implements fdat {
    int a;
    final /* synthetic */ aldj b;
    final /* synthetic */ amzg c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aldi(aldj aldjVar, amzg amzgVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = aldjVar;
        this.c = amzgVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((aldi) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            long j = aldj.a;
            this.a = 1;
            if (fdkj.d(j, this) == fcylVar) {
                return fcylVar;
            }
        }
        aldo aldoVar = (aldo) this.b.c.b();
        amzg amzgVar = this.c;
        aldk aldkVar = (aldk) aldl.a.createBuilder();
        aldkVar.getClass();
        String strB = amzgVar.d().f().b();
        strB.getClass();
        aldkVar.copyOnWrite();
        aldl aldlVar = (aldl) aldkVar.instance;
        aldlVar.b = 1 | aldlVar.b;
        aldlVar.c = strB;
        double dB = amzgVar.b();
        aldkVar.copyOnWrite();
        aldl aldlVar2 = (aldl) aldkVar.instance;
        aldlVar2.b |= 8;
        aldlVar2.f = dB;
        DesugarCollections.unmodifiableList(aldlVar2.d).getClass();
        ekgb ekgbVarI = amzgVar.i();
        ArrayList arrayList = new ArrayList(fcva.p(ekgbVarI, 10));
        Iterator<E> it = ekgbVarI.iterator();
        while (it.hasNext()) {
            arrayList.add(String.valueOf(((amsv) it.next()).c()));
        }
        aldkVar.copyOnWrite();
        aldl aldlVar3 = (aldl) aldkVar.instance;
        evtg evtgVar = aldlVar3.d;
        if (!evtgVar.c()) {
            aldlVar3.d = evsn.mutableCopy(evtgVar);
        }
        evpz.addAll(arrayList, aldlVar3.d);
        anaa anaaVarF = amzgVar.f();
        MessageId messageId = anaaVarF != null ? anaaVarF.a : null;
        if (messageId != null) {
            albd albdVar = (albd) albe.a.createBuilder();
            albdVar.getClass();
            String strA = messageId.a();
            strA.getClass();
            albdVar.copyOnWrite();
            ((albe) albdVar.instance).b = strA;
            evsn evsnVarBuild = albdVar.build();
            evsnVarBuild.getClass();
            aldkVar.copyOnWrite();
            aldl aldlVar4 = (aldl) aldkVar.instance;
            aldlVar4.e = (albe) evsnVarBuild;
            aldlVar4.b |= 4;
        }
        evsn evsnVarBuild2 = aldkVar.build();
        evsnVarBuild2.getClass();
        caxr caxrVar = new caxr();
        caxrVar.c = aldj.b;
        ((cazj) aldoVar.a.b()).a(cbcu.g("smarts_send_message_listener_handler", (aldl) evsnVarBuild2, caxrVar.a()));
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new aldi(this.b, this.c, fcxyVar);
    }
}
