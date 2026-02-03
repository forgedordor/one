package defpackage;

import com.sun.jna.Pointer;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class epyg implements eqaf {
    final /* synthetic */ ccol a;

    public epyg(ccol ccolVar) {
        this.a = ccolVar;
    }

    @Override // defpackage.eqaf
    public eqay invoke(Pointer pointer, eqau eqauVar, Pointer pointer2) {
        eqaw eqawVarC;
        eqauVar.getClass();
        pointer2.getClass();
        byte[] bArrB = epzk.b(eqauVar);
        epze epzeVar = new epze(pointer2);
        eptp eptpVarD = this.a.a.d(ccok.a(bArrB));
        if (eptpVarD == null) {
            eqax eqaxVar = eqaw.a;
            eqawVarC = eqav.b();
        } else {
            byte[] byteArray = eptpVarD.toByteArray();
            byte[] bArrCopyOf = Arrays.copyOf(byteArray, byteArray.length);
            bArrCopyOf.getClass();
            epzeVar.a(bArrCopyOf);
            eqax eqaxVar2 = eqaw.a;
            eqawVarC = eqav.c();
        }
        return eqawVarC.b;
    }
}
