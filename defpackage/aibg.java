package defpackage;

import j$.util.function.Consumer$CC;
import java.util.UUID;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class aibg extends fcyz implements fdat {
    final /* synthetic */ aibh a;
    final /* synthetic */ UUID b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aibg(aibh aibhVar, UUID uuid, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.a = aibhVar;
        this.b = uuid;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((aibg) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [java.io.Closeable, java.lang.Object] */
    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        final UUID uuid = this.b;
        Consumer consumer = new Consumer() { // from class: aibe
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void z(Object obj2) {
                ((ahta) obj2).b(new ahsz(uuid));
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer2) {
                return Consumer$CC.$default$andThen(this, consumer2);
            }
        };
        awlc awlcVar = this.a.a;
        aibf aibfVar = aibf.a;
        for (Object obj2 : awlcVar.c()) {
            ?? Invoke = aibfVar.invoke(obj2);
            try {
                consumer.z(obj2);
                fczl.a(Invoke, null);
            } finally {
            }
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new aibg(this.a, this.b, fcxyVar);
    }
}
