package defpackage;

import j$.util.Optional;
import j$.util.function.Consumer$CC;
import java.util.List;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class uwb extends fcyz implements fdau {
    /* synthetic */ Object a;
    /* synthetic */ Object b;
    final /* synthetic */ uwl c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uwb(uwl uwlVar, fcxy fcxyVar) {
        super(3, fcxyVar);
        this.c = uwlVar;
    }

    @Override // defpackage.fdau
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        uwb uwbVar = new uwb(this.c, (fcxy) obj3);
        uwbVar.a = (agqo) obj;
        uwbVar.b = (Boolean) obj2;
        return uwbVar.b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        Object obj2 = this.a;
        Object obj3 = this.b;
        final boolean z = false;
        if (!((Boolean) crbf.aO.e()).booleanValue() || obj2 == null || obj3 == null) {
            return false;
        }
        Boolean bool = (Boolean) obj3;
        if (bool.booleanValue() && ((agqo) obj2).a) {
            z = true;
        }
        uwl uwlVar = this.c;
        final boolean zBooleanValue = bool.booleanValue();
        int i = agqq.a;
        if (!fdbq.f(obj2, agqn.a)) {
            final List list = ((agqo) obj2).b;
            Optional optional = (Optional) uwlVar.j.b();
            final fdap fdapVar = new fdap() { // from class: uvx
                @Override // defpackage.fdap
                public final Object invoke(Object obj4) {
                    uzw uzwVar = (uzw) obj4;
                    uzwVar.getClass();
                    List list2 = list;
                    uzwVar.e(z, list2.contains(agqp.a), list2.contains(agqp.b), list2.contains(agqp.c), list2.contains(agqp.d), !zBooleanValue, list2.contains(agqp.g));
                    return fctx.a;
                }
            };
            optional.ifPresent(new Consumer() { // from class: uvy
                @Override // java.util.function.Consumer
                /* renamed from: accept */
                public final void z(Object obj4) {
                    fdapVar.invoke(obj4);
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
        }
        return Boolean.valueOf(z);
    }
}
