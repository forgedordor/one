package defpackage;

import com.sun.jna.Memory;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class ccpj {
    private final eygg a;

    public ccpj(eygg eyggVar) {
        eyggVar.getClass();
        this.a = eyggVar;
    }

    public final ccpk a(String str) {
        Object objA;
        this.a.b();
        try {
            eqbx eqbxVar = eqbw.a;
            fcti fctiVarD = epzk.d(str);
            Memory memory = (Memory) fctiVarD.a;
            epzp epzpVarZinnia_ZinniaFileEncryptor_init = eqbw.a.Zinnia_ZinniaFileEncryptor_init((eqau) fctiVarD.b);
            if (epzpVarZinnia_ZinniaFileEncryptor_init.isOk == 1) {
                eqbw eqbwVar = new eqbw(epzpVarZinnia_ZinniaFileEncryptor_init.union.ok);
                eqbwVar.c = true;
                objA = eqbwVar;
                if (memory != null) {
                    memory.close();
                    objA = eqbwVar;
                }
            } else {
                eqbs eqbsVar = new eqbs(epzpVarZinnia_ZinniaFileEncryptor_init.union.err);
                eqbsVar.b();
                if (memory != null) {
                    memory.close();
                }
                objA = fctl.a(eqbsVar);
            }
            fctl.b(objA);
            return new ccpk((eqbw) objA);
        } catch (Exception e) {
            throw new Exception("Error initializing ZinniaFileEncryptor", e);
        }
    }
}
