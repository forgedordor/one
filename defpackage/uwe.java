package defpackage;

import j$.util.Optional;
import j$.util.function.Consumer$CC;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class uwe extends fcyz implements fdat {
    /* synthetic */ boolean a;
    final /* synthetic */ uwl b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uwe(uwl uwlVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = uwlVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        Boolean bool = (Boolean) obj;
        bool.booleanValue();
        return ((uwe) c(bool, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        final boolean z = this.a;
        Optional optional = (Optional) this.b.g.b();
        final fdap fdapVar = new fdap() { // from class: uwc
            @Override // defpackage.fdap
            public final Object invoke(Object obj2) {
                ((val) obj2).j(z);
                return fctx.a;
            }
        };
        optional.ifPresent(new Consumer() { // from class: uwd
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void z(Object obj2) {
                fdapVar.invoke(obj2);
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        uwe uweVar = new uwe(this.b, fcxyVar);
        uweVar.a = ((Boolean) obj).booleanValue();
        return uweVar;
    }
}
