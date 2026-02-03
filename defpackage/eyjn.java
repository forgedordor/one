package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class eyjn extends eyjh {
    private final ekgb b;

    public eyjn(ekgb ekgbVar) {
        this.b = ekgbVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.eyjh
    public final void b(Throwable th) {
        ekgb ekgbVarA = this.b.a();
        int size = ekgbVarA.size();
        for (int i = 0; i < size; i++) {
            eyjh eyjhVar = (eyjh) ekgbVarA.get(i);
            try {
                eyjhVar.b(th);
            } catch (RuntimeException e) {
                eyjt.c(e, eyjhVar, "failed", th);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.eyjh
    public final void c() {
        ekgb ekgbVarA = this.b.a();
        int size = ekgbVarA.size();
        for (int i = 0; i < size; i++) {
            eyjh eyjhVar = (eyjh) ekgbVarA.get(i);
            try {
                eyjhVar.c();
            } catch (RuntimeException e) {
                eyjt.e(e, eyjhVar, "methodFinished");
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.eyjh
    public final void d() {
        int i = 0;
        while (true) {
            ekgb ekgbVar = this.b;
            if (i >= ((ekoe) ekgbVar).c) {
                return;
            }
            eyjh eyjhVar = (eyjh) ekgbVar.get(i);
            try {
                eyjhVar.d();
            } catch (RuntimeException e) {
                eyjt.e(e, eyjhVar, "methodStarting");
            }
            i++;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.eyjh
    public final void e() {
        int i = 0;
        while (true) {
            ekgb ekgbVar = this.b;
            if (i >= ((ekoe) ekgbVar).c) {
                return;
            }
            eyjh eyjhVar = (eyjh) ekgbVar.get(i);
            try {
                eyjhVar.e();
            } catch (RuntimeException e) {
                eyjt.e(e, eyjhVar, "ready");
            }
            i++;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.eyjh
    public final void f() {
        int i = 0;
        while (true) {
            ekgb ekgbVar = this.b;
            if (i >= ((ekoe) ekgbVar).c) {
                return;
            }
            eyjh eyjhVar = (eyjh) ekgbVar.get(i);
            try {
                eyjhVar.f();
            } catch (RuntimeException e) {
                eyjt.e(e, eyjhVar, "requested");
            }
            i++;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.eyjh
    public final void g(Object obj) {
        ekgb ekgbVarA = this.b.a();
        int size = ekgbVarA.size();
        for (int i = 0; i < size; i++) {
            eyjh eyjhVar = (eyjh) ekgbVarA.get(i);
            try {
                eyjhVar.g(obj);
            } catch (RuntimeException e) {
                eyjt.c(e, eyjhVar, "succeeded", obj);
            }
        }
    }
}
