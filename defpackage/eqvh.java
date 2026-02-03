package defpackage;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eqvh extends eqtd {
    public final eqvj a;
    public final erwn b;
    public final Integer c;

    private eqvh(eqvj eqvjVar, erwn erwnVar, Integer num) {
        this.a = eqvjVar;
        this.b = erwnVar;
        this.c = num;
    }

    public static eqvh d(eqvj eqvjVar, Integer num) throws GeneralSecurityException {
        erwn erwnVarB;
        eqvi eqviVar = eqvi.a;
        eqvi eqviVar2 = eqvjVar.b;
        if (eqviVar2 == eqviVar) {
            if (num == null) {
                throw new GeneralSecurityException("For given Variant TINK the value of idRequirement must be non-null");
            }
            erwnVarB = erwn.b(ByteBuffer.allocate(5).put((byte) 1).putInt(num.intValue()).array());
        } else {
            if (eqviVar2 != eqvi.b) {
                throw new GeneralSecurityException("Unknown Variant: ".concat(eqviVar2.c));
            }
            if (num != null) {
                throw new GeneralSecurityException("For given Variant NO_PREFIX the value of idRequirement must be null");
            }
            erwnVarB = erwn.b(new byte[0]);
        }
        return new eqvh(eqvjVar, erwnVarB, num);
    }

    @Override // defpackage.eqtd, defpackage.eqsg
    public final /* synthetic */ eqst a() {
        return this.a;
    }

    @Override // defpackage.eqsg
    public final Integer b() {
        throw null;
    }

    @Override // defpackage.eqtd
    public final erwn c() {
        return this.b;
    }
}
