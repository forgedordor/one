package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import j$.util.Optional;
import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class ckwp implements baye, baxz, bayb {
    private static final eksp b = eksp.c("BugleReactions");
    public final fcsu a;
    private final crjx c;
    private final fcsu d;
    private final fcsu e;
    private Optional f;
    private String g;
    private final fctc h;

    public ckwp(crjx crjxVar, fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3) {
        fcsuVar.getClass();
        fcsuVar2.getClass();
        fcsuVar3.getClass();
        this.c = crjxVar;
        this.a = fcsuVar;
        this.d = fcsuVar2;
        this.e = fcsuVar3;
        this.f = Optional.empty();
        this.h = fctd.a(new fdae() { // from class: ckwo
            @Override // defpackage.fdae
            public final Object invoke() throws IOException {
                ckwp ckwpVar = this.a;
                eieu eieuVarH = eiiy.h("IosReactionsMessageReceivedListener#isReactionClassificationSettingEnabled");
                try {
                    boolean zB = ((cknb) ckwpVar.a.b()).b();
                    fczl.a(eieuVarH, null);
                    return Boolean.valueOf(zB);
                } finally {
                }
            }
        });
    }

    private final boolean a() {
        return ((Boolean) this.h.a()).booleanValue();
    }

    @Override // defpackage.baye
    public final eieu c() {
        return eiiy.a("IosReactionsMessageReceivedListener");
    }

    @Override // defpackage.bayb
    public final void d(MessageCoreData messageCoreData) {
        messageCoreData.getClass();
        gb(messageCoreData);
    }

    @Override // defpackage.bayb
    public final void e(MessageCoreData messageCoreData) {
        messageCoreData.getClass();
        e(messageCoreData.as());
    }

    @Override // defpackage.baye, defpackage.baxz
    public final void g(MessageCoreData messageCoreData) {
        if (this.f.isEmpty() || !a()) {
            return;
        }
        messageCoreData.bx(true);
        messageCoreData.bz(true);
        ckxz ckxzVar = (ckxz) this.e.b();
        ezgd ezgdVar = (ezgd) this.f.get();
        ezfb ezfbVar = ezgdVar.b == 2 ? (ezfb) ezgdVar.c : ezfb.a;
        ezfbVar.getClass();
        ckxzVar.a(ezfbVar, messageCoreData);
    }

    @Override // defpackage.baye, defpackage.baxz
    public final void gb(MessageCoreData messageCoreData) {
        String strAB = messageCoreData.aB();
        if (this.f.isEmpty() || strAB == null) {
            return;
        }
        if (!a()) {
            eksl ekslVar = (eksl) b.h();
            ekslVar.X(cqnc.s, messageCoreData.A());
            ekslVar.X(cqnc.p, messageCoreData.aB());
            ekslVar.X(ckmz.a, messageCoreData.C());
            ekslVar.q("Skipping iOS reaction due to setting being disabled.");
            return;
        }
        eksl ekslVar2 = (eksl) b.h();
        ekslVar2.X(cqnc.s, messageCoreData.A());
        ekslVar2.X(cqnc.p, messageCoreData.aB());
        ekslVar2.X(ckmz.a, messageCoreData.C());
        ekslVar2.q("Starting to process iOS reaction.");
        ckyn ckynVar = (ckyn) this.d.b();
        ckyk ckykVar = (ckyk) ckyl.a.createBuilder();
        ckykVar.getClass();
        String strA = messageCoreData.A().a();
        strA.getClass();
        ckym.b(strA, ckykVar);
        ckym.e(strAB, ckykVar);
        String strB = messageCoreData.C().b();
        strB.getClass();
        ckym.c(strB, ckykVar);
        ckym.f((ezgd) this.f.get(), ckykVar);
        ckym.g(messageCoreData.o(), ckykVar);
        String str = this.g;
        if (str != null) {
            ckym.d(str, ckykVar);
        }
        ckynVar.a(ckym.a(ckykVar));
    }

    @Override // defpackage.bayb
    public final /* synthetic */ void k(MessageCoreData messageCoreData) {
        messageCoreData.getClass();
    }

    @Override // defpackage.baye, defpackage.baxz
    public final void e(String str) {
        this.f = this.c.a(str);
        this.g = str;
    }

    @Override // defpackage.baye
    public final /* synthetic */ void l(long j, fhaz fhazVar) {
    }
}
