package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.MessageId;
import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class amzb implements ajma {
    public final amze a;
    private final fdjx b;
    private final eosc c;
    private final ajma d;

    public amzb(fdjx fdjxVar, eosc eoscVar, ajma ajmaVar, amze amzeVar) {
        this.b = fdjxVar;
        this.c = eoscVar;
        this.d = ajmaVar;
        this.a = amzeVar;
    }

    @Override // defpackage.ajma
    public final ajly a(ajlt ajltVar) {
        return this.d.a(ajltVar);
    }

    @Override // defpackage.ajma
    public final ajly b(Integer num) {
        return this.d.b(num);
    }

    @Override // defpackage.ajma
    public final cquc c(ajlz ajlzVar) {
        return this.d.c(ajlzVar);
    }

    @Override // defpackage.ajma
    public final eiju d(MessageId messageId) {
        return this.d.d(messageId);
    }

    @Override // defpackage.ajma
    public final eiju e(ajly ajlyVar, int i) {
        eiju eijuVarE = this.d.e(ajlyVar, i);
        final fdap fdapVar = new fdap() { // from class: amyw
            @Override // defpackage.fdap
            public final Object invoke(Object obj) {
                andk andkVar = (andk) obj;
                andkVar.getClass();
                return this.a.i(andkVar);
            }
        };
        return eijuVarE.i(new eooz() { // from class: amyx
            /* JADX WARN: Type inference failed for: r2v1, types: [com.google.common.util.concurrent.ListenableFuture, java.lang.Object] */
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                return fdapVar.invoke(obj);
            }
        }, this.c);
    }

    @Override // defpackage.ajma
    public final eiju f(ajly ajlyVar, int i) {
        eiju eijuVarF = this.d.f(ajlyVar, i);
        final fdap fdapVar = new fdap() { // from class: amyy
            @Override // defpackage.fdap
            public final Object invoke(Object obj) {
                andk andkVar = (andk) obj;
                andkVar.getClass();
                return this.a.i(andkVar);
            }
        };
        return eijuVarF.i(new eooz() { // from class: amyz
            /* JADX WARN: Type inference failed for: r2v1, types: [com.google.common.util.concurrent.ListenableFuture, java.lang.Object] */
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                return fdapVar.invoke(obj);
            }
        }, this.c);
    }

    @Override // defpackage.ajma
    public final eiju g(ajly ajlyVar, int i) {
        eiju eijuVarG = this.d.g(ajlyVar, i);
        final fdap fdapVar = new fdap() { // from class: amyu
            @Override // defpackage.fdap
            public final Object invoke(Object obj) {
                andk andkVar = (andk) obj;
                andkVar.getClass();
                return this.a.i(andkVar);
            }
        };
        return eijuVarG.i(new eooz() { // from class: amyv
            /* JADX WARN: Type inference failed for: r2v1, types: [com.google.common.util.concurrent.ListenableFuture, java.lang.Object] */
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                return fdapVar.invoke(obj);
            }
        }, this.c);
    }

    @Override // defpackage.ajma
    public final eiju h(MessageId messageId) {
        return this.d.h(messageId);
    }

    public final eiju i(andk andkVar) {
        return auvw.c(this.b, fcyi.a, fdjz.a, new amza(andkVar, this, null));
    }
}
