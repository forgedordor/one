package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dsg {
    public final hum a = new hum(new dsn[16]);

    public final void a(Throwable th) {
        hum humVar = this.a;
        int i = humVar.b;
        fdis[] fdisVarArr = new fdis[i];
        for (int i2 = 0; i2 < i; i2++) {
            fdisVarArr[i2] = ((dsn) humVar.a[i2]).b;
        }
        for (int i3 = 0; i3 < i; i3++) {
            fdisVarArr[i3].h(th);
        }
        if (humVar.b == 0) {
            return;
        }
        ebs.d("uncancelled requests present");
    }
}
