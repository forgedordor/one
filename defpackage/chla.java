package defpackage;

import j$.util.Optional;
import j$.util.function.Consumer$CC;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class chla implements ccyz {
    private final fcsu a;
    private final fcsu b;
    private final fcsu c;

    public chla(fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3) {
        fcsuVar.getClass();
        fcsuVar2.getClass();
        fcsuVar3.getClass();
        this.a = fcsuVar;
        this.b = fcsuVar2;
        this.c = fcsuVar3;
    }

    @Override // defpackage.ccyz
    public final void a() {
        if (!((Boolean) this.b.b()).booleanValue() || ((Boolean) this.c.b()).booleanValue()) {
            return;
        }
        Optional optional = (Optional) this.a.b();
        final chkz chkzVar = chkz.a;
        optional.ifPresent(new Consumer() { // from class: chky
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                chkzVar.invoke(obj);
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
    }

    @Override // defpackage.ccyz
    public final boolean gd() {
        return true;
    }
}
