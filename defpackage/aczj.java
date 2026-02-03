package defpackage;

import j$.util.Optional;
import j$.util.function.Consumer$CC;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aczj implements acyy {
    final /* synthetic */ aczk a;

    public aczj(aczk aczkVar) {
        this.a = aczkVar;
    }

    @Override // defpackage.acyy
    public final void a(adan adanVar, acyx acyxVar, aczf aczfVar) {
        acyxVar.getClass();
        aczfVar.getClass();
        final aczk aczkVar = this.a;
        if (((apwp) aczkVar.c.b()).a()) {
            if (acyxVar.A() != cins.j) {
                ((adaj) adanVar).I = null;
                return;
            }
            Integer num = aczfVar.b;
            if (num == null) {
                ((adaj) adanVar).I = false;
                return;
            }
            Optional optional = aczkVar.b;
            final fdap fdapVar = new fdap() { // from class: aczg
                @Override // defpackage.fdap
                public final Object invoke(Object obj) {
                    acve acveVar = (acve) obj;
                    acveVar.getClass();
                    auvw.k(aczkVar.a, null, null, new aczi(acveVar, null), 3);
                    return fctx.a;
                }
            };
            optional.ifPresent(new Consumer() { // from class: aczh
                @Override // java.util.function.Consumer
                /* renamed from: accept */
                public final void z(Object obj) {
                    fdapVar.invoke(obj);
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
            ((adaj) adanVar).I = Boolean.valueOf(num.intValue() < 2);
        }
    }
}
