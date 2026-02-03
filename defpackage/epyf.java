package defpackage;

import com.sun.jna.Pointer;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class epyf implements eqae {
    final /* synthetic */ ccol a;

    public epyf(ccol ccolVar) {
        this.a = ccolVar;
    }

    @Override // defpackage.eqae
    public eqbf invoke(Pointer pointer, Pointer pointer2) {
        eqbd eqbdVarA;
        pointer2.getClass();
        epze epzeVar = new epze(pointer2);
        try {
            String str = this.a.a.a().b;
            if (str == null) {
                eqbe eqbeVar = eqbd.a;
                eqbdVarA = eqbc.a(eqbq.w);
            } else {
                byte[] bytes = str.getBytes(fdfy.a);
                bytes.getClass();
                byte[] bArrCopyOf = Arrays.copyOf(bytes, bytes.length);
                bArrCopyOf.getClass();
                epzeVar.a(bArrCopyOf);
                eqbdVarA = new eqbd(eqbd.a.Zinnia_StorageTraitSuccessResult_ok());
            }
        } catch (Exception unused) {
            eqbe eqbeVar2 = eqbd.a;
            eqbdVarA = eqbc.a(eqbq.w);
        }
        return eqbdVarA.b;
    }
}
