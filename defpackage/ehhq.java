package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ehhq {
    public static final ehhr a(ehdh ehdhVar, dzzn dzznVar, eaet eaetVar) {
        if (eaetVar.d) {
            String str = ehdhVar.d;
            str.getClass();
            if (str.length() != 0) {
                String str2 = ehdhVar.d;
                dzznVar.copyOnWrite();
                dzzs dzzsVar = (dzzs) dzznVar.instance;
                dzzs dzzsVar2 = dzzs.a;
                str2.getClass();
                dzzsVar.b |= 1;
                dzzsVar.c = str2;
            }
        } else {
            String str3 = ehdhVar.d;
            dzznVar.copyOnWrite();
            dzzs dzzsVar3 = (dzzs) dzznVar.instance;
            dzzs dzzsVar4 = dzzs.a;
            str3.getClass();
            dzzsVar3.b |= 1;
            dzzsVar3.c = str3;
        }
        String str4 = ehdhVar.c;
        str4.getClass();
        evqs evqsVar = (ehdhVar.b & 4) != 0 ? ehdhVar.e : null;
        long j = ehdhVar.i;
        evsn evsnVarBuild = dzznVar.build();
        evsnVarBuild.getClass();
        return new ehhr(str4, evqsVar, j, (dzzs) evsnVarBuild);
    }
}
