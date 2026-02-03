package defpackage;

import j$.util.Optional;
import j$.util.function.Consumer$CC;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class absg implements abpm {
    public static final cqce a = cqce.g("Bugle", "ShowSwitcherHandler");
    private final Optional b;

    public absg(Optional optional) {
        this.b = optional;
    }

    @Override // defpackage.abpm
    public final eiju a(eppi eppiVar, eppj eppjVar) {
        a.p("Received show switcher request from Ditto");
        this.b.ifPresent(new Consumer() { // from class: absf
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void z(Object obj) {
                absg.a.p("Showing switcher");
                ((abdk) obj).g(abgx.REMOTE);
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
        String str = eppiVar.d;
        eppjVar.copyOnWrite();
        eppl epplVar = (eppl) eppjVar.instance;
        eppl epplVar2 = eppl.a;
        str.getClass();
        epplVar.d = str;
        exmt exmtVar = exmt.OK;
        eppjVar.copyOnWrite();
        ((eppl) eppjVar.instance).e = exmtVar.a();
        evrl evrlVar = evrl.a;
        eppjVar.copyOnWrite();
        eppl epplVar3 = (eppl) eppjVar.instance;
        evrlVar.getClass();
        epplVar3.c = evrlVar;
        epplVar3.b = 107;
        return eijx.e(eppjVar.build());
    }
}
