package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
final class qdf implements qdd {
    private final qdd a;
    private final Object b = new Object();

    public qdf(qdd qddVar) {
        this.a = qddVar;
    }

    @Override // defpackage.qdd
    public final qda a(qiw qiwVar) {
        qda qdaVarA;
        synchronized (this.b) {
            qdaVarA = this.a.a(qiwVar);
        }
        return qdaVarA;
    }

    @Override // defpackage.qdd
    public final qda b(qiw qiwVar) {
        qda qdaVarB;
        synchronized (this.b) {
            qdaVarB = this.a.b(qiwVar);
        }
        return qdaVarB;
    }

    @Override // defpackage.qdd
    public final /* synthetic */ qda c(qjn qjnVar) {
        return qdb.a(this, qjnVar);
    }

    @Override // defpackage.qdd
    public final List d(String str) {
        List listD;
        str.getClass();
        synchronized (this.b) {
            listD = this.a.d(str);
        }
        return listD;
    }

    @Override // defpackage.qdd
    public final boolean e(qiw qiwVar) {
        boolean zE;
        synchronized (this.b) {
            zE = this.a.e(qiwVar);
        }
        return zE;
    }
}
