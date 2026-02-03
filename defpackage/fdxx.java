package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fdxx {
    public static final fdzi a = new fdzi("CLOSED");

    public static final Object a(fdzf fdzfVar, long j, fdat fdatVar) {
        while (true) {
            long j2 = fdzfVar.b;
            if (j2 >= j && !fdzfVar.r()) {
                return fdzfVar;
            }
            Object objM = fdzfVar.m();
            fdzi fdziVar = a;
            if (objM == fdziVar) {
                return fdziVar;
            }
            fdzf fdzfVar2 = (fdzf) ((fdxy) objM);
            if (fdzfVar2 != null) {
                fdzfVar = fdzfVar2;
            } else {
                fdzf fdzfVar3 = (fdzf) fdatVar.a(Long.valueOf(j2 + 1), fdzfVar);
                if (fdzfVar.a.d(null, fdzfVar3)) {
                    if (fdzfVar.r()) {
                        fdzfVar.q();
                    }
                    fdzfVar = fdzfVar3;
                }
            }
        }
    }
}
