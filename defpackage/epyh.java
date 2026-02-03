package defpackage;

import com.sun.jna.Pointer;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class epyh implements eqag {
    final /* synthetic */ ccol a;

    public epyh(ccol ccolVar) {
        this.a = ccolVar;
    }

    @Override // defpackage.eqag
    public eqbn invoke(Pointer pointer, eqau eqauVar, eqau eqauVar2) {
        eqbl eqblVarA;
        eqauVar.getClass();
        eqauVar2.getClass();
        byte[] bArrB = epzk.b(eqauVar);
        byte[] bArrB2 = epzk.b(eqauVar2);
        int length = bArrB2.length;
        if (length == 0) {
            eqbm eqbmVar = eqbl.a;
            eqblVarA = eqbk.a(eqbq.aq);
        } else {
            try {
                byte[] bArrCopyOf = Arrays.copyOf(bArrB2, length);
                bArrCopyOf.getClass();
                String str = ((epwh) evsn.parseFrom(epwh.a, bArrCopyOf)).c;
                ccol ccolVar = this.a;
                str.getClass();
                eptc eptcVarC = ccolVar.a.c(ccok.a(bArrB), str);
                eqbm eqbmVar2 = eqbl.a;
                eqblVarA = eqbk.b(eptcVarC.ordinal());
            } catch (Throwable unused) {
                eqbm eqbmVar3 = eqbl.a;
                eqblVarA = eqbk.a(eqbq.aq);
            }
        }
        return eqblVarA.b;
    }
}
