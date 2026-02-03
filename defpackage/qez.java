package defpackage;

import android.content.Context;
import android.os.Build;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
final class qez extends fcyz implements fdat {
    int a;
    final /* synthetic */ qfa b;
    final /* synthetic */ qaq c;
    final /* synthetic */ qab d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qez(qfa qfaVar, qaq qaqVar, qab qabVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = qfaVar;
        this.c = qaqVar;
        this.d = qabVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((qez) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        Object objA;
        Object obj2 = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            qfa qfaVar = this.b;
            qaq qaqVar = this.c;
            qab qabVar = this.d;
            this.a = 1;
            String str = qly.a;
            qjn qjnVar = qfaVar.a;
            if (!qjnVar.s || Build.VERSION.SDK_INT >= 31) {
                objA = fctx.a;
            } else {
                qmg qmgVar = qfaVar.i;
                Context context = qfaVar.b;
                Executor executor = qmgVar.d;
                executor.getClass();
                objA = fdin.a(fdli.b(executor), new qlx(qaqVar, qjnVar, qabVar, context, null), this);
                if (objA != obj2) {
                    objA = fctx.a;
                }
            }
            if (objA != obj2) {
            }
        }
        if (i != 1) {
            return obj;
        }
        qas.c().a(qfc.a, "Starting work for ".concat(String.valueOf(this.b.a.e)));
        qaq qaqVar2 = this.c;
        ListenableFuture listenableFutureB = qaqVar2.b();
        listenableFutureB.getClass();
        this.a = 2;
        Object objA2 = qfc.a(listenableFutureB, qaqVar2, this);
        return objA2 == obj2 ? obj2 : objA2;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new qez(this.b, this.c, this.d, fcxyVar);
    }
}
