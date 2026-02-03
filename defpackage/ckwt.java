package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class ckwt implements baye, baxz {
    private static final eksp a = eksp.c("BugleReactions");
    private final fcsu b;
    private final fcsu c;
    private final fcsu d;
    private Optional e;
    private String f;

    public ckwt(fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3) {
        fcsuVar.getClass();
        fcsuVar2.getClass();
        fcsuVar3.getClass();
        this.b = fcsuVar;
        this.c = fcsuVar2;
        this.d = fcsuVar3;
        this.e = Optional.empty();
    }

    @Override // defpackage.baye
    public final eieu c() {
        return eiiy.a("XmsReactionsOnXmsMessageReceivedListener");
    }

    @Override // defpackage.baye, defpackage.baxz
    public final void e(String str) {
        if (str == null || str.length() <= 0 || !fdfv.d(str.charAt(0), (char) 8202, false)) {
            return;
        }
        ((eksl) a.h()).q("Starting to classify xMS reaction.");
        this.e = ((crjx) this.b.b()).a(str);
        this.f = str;
    }

    @Override // defpackage.baye, defpackage.baxz
    public final void g(MessageCoreData messageCoreData) {
        if (this.e.isPresent()) {
            messageCoreData.bx(true);
            ckxz ckxzVar = (ckxz) this.d.b();
            ezgd ezgdVar = (ezgd) this.e.get();
            ezfb ezfbVar = ezgdVar.b == 2 ? (ezfb) ezgdVar.c : ezfb.a;
            ezfbVar.getClass();
            ckxzVar.a(ezfbVar, messageCoreData);
        }
    }

    @Override // defpackage.baye, defpackage.baxz
    public final void gb(MessageCoreData messageCoreData) {
        String strAB = messageCoreData.aB();
        if (strAB != null && this.e.isPresent()) {
            eksl ekslVar = (eksl) a.h();
            ekslVar.X(cqnc.s, messageCoreData.A());
            ekslVar.X(cqnc.p, messageCoreData.aB());
            ekslVar.X(ckmz.a, messageCoreData.C());
            ekslVar.q("Starting to process xMS reaction.");
            ckyn ckynVar = (ckyn) this.c.b();
            ckyk ckykVar = (ckyk) ckyl.a.createBuilder();
            ckykVar.getClass();
            String strA = messageCoreData.A().a();
            strA.getClass();
            ckym.b(strA, ckykVar);
            ckym.e(strAB, ckykVar);
            String strB = messageCoreData.C().b();
            strB.getClass();
            ckym.c(strB, ckykVar);
            ckym.f((ezgd) this.e.get(), ckykVar);
            ckym.g(messageCoreData.o(), ckykVar);
            String str = this.f;
            if (str != null) {
                ckym.d(str, ckykVar);
            }
            ckynVar.a(ckym.a(ckykVar));
        }
    }

    @Override // defpackage.baye
    public final /* synthetic */ void l(long j, fhaz fhazVar) {
    }
}
