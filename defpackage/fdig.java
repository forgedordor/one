package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fdig {
    public final fdkf[] a;
    public final fdhx b;

    public fdig(fdkf[] fdkfVarArr) {
        this.a = fdkfVarArr;
        this.b = new fdhx(fdkfVarArr.length, fdia.a);
    }

    public final Object a(fcxy fcxyVar) {
        fdiu fdiuVar = new fdiu(fcym.c(fcxyVar), 1);
        fdiuVar.B();
        fdkf[] fdkfVarArr = this.a;
        int length = fdkfVarArr.length;
        fdie[] fdieVarArr = new fdie[length];
        for (int i = 0; i < length; i++) {
            fdkf fdkfVar = fdkfVarArr[i];
            fdkfVar.z();
            fdie fdieVar = new fdie(this, fdiuVar);
            fdieVar.a = fdlw.b(fdkfVar, true, fdieVar);
            fdieVarArr[i] = fdieVar;
        }
        fdif fdifVar = new fdif(fdieVarArr);
        for (int i2 = 0; i2 < length; i2++) {
            fdieVarArr[i2].b.c(fdifVar);
        }
        if (fdiuVar.k()) {
            fdifVar.a();
        } else {
            fdiuVar.D(fdifVar);
        }
        Object objM = fdiuVar.m();
        if (objM == fcyl.a) {
            fcxyVar.getClass();
        }
        return objM;
    }
}
