package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fcqa {
    public String[] a;
    public String[] b;
    public boolean c;

    public fcqa() {
    }

    public final void a(fcpz... fcpzVarArr) {
        String[] strArr = new String[fcpzVarArr.length];
        for (int i = 0; i < fcpzVarArr.length; i++) {
            strArr[i] = fcpzVarArr[i].bb;
        }
        this.a = strArr;
    }

    public final void b() {
        this.c = true;
    }

    public final void c(fcqn... fcqnVarArr) {
        String[] strArr = new String[fcqnVarArr.length];
        for (int i = 0; i < fcqnVarArr.length; i++) {
            strArr[i] = fcqnVarArr[i].f;
        }
        this.b = strArr;
    }

    public fcqa(fcqb fcqbVar) {
        boolean z = fcqbVar.b;
        this.a = fcqbVar.c;
        this.b = fcqbVar.d;
        this.c = fcqbVar.e;
    }
}
