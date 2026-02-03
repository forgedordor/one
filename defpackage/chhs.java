package defpackage;

import j$.util.function.Consumer$CC;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class chhs extends fcyz implements fdat {
    final /* synthetic */ chht a;
    final /* synthetic */ chif b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public chhs(chht chhtVar, chif chifVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.a = chhtVar;
        this.b = chifVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((chhs) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        final chht chhtVar = this.a;
        final chif chifVar = this.b;
        final fdap fdapVar = new fdap() { // from class: chhq
            @Override // defpackage.fdap
            public final Object invoke(Object obj2) {
                ((aijh) ((fcsu) obj2).b()).u(chhtVar.b, chifVar.g);
                return fctx.a;
            }
        };
        chhtVar.a.ifPresent(new Consumer() { // from class: chhr
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void z(Object obj2) {
                fdapVar.invoke(obj2);
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
        return new chig(chifVar.a, chifVar.b, chifVar.c);
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new chhs(this.a, this.b, fcxyVar);
    }
}
