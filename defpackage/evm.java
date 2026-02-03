package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class evm extends eve {
    public evm(evf evfVar, evf evfVar2, evf evfVar3, evf evfVar4) {
        super(evfVar, evfVar2, evfVar3, evfVar4);
    }

    @Override // defpackage.eve
    public final /* synthetic */ eve b(evf evfVar, evf evfVar2, evf evfVar3, evf evfVar4) {
        return new evm(evfVar, evfVar2, evfVar3, evfVar4);
    }

    @Override // defpackage.eve
    public final ijz c(long j, float f, float f2, float f3, float f4, kji kjiVar) {
        if (f + f2 + f3 + f4 == 0.0f) {
            return new ijx(iia.c(j));
        }
        ihu ihuVarC = iia.c(j);
        kji kjiVar2 = kji.a;
        float f5 = kjiVar == kjiVar2 ? f : f2;
        long jFloatToRawIntBits = Float.floatToRawIntBits(f5);
        long jFloatToRawIntBits2 = Float.floatToRawIntBits(f5);
        float f6 = kjiVar != kjiVar2 ? f : f2;
        long jFloatToRawIntBits3 = Float.floatToRawIntBits(f6);
        long jFloatToRawIntBits4 = Float.floatToRawIntBits(f6);
        float f7 = kjiVar == kjiVar2 ? f3 : f4;
        long jFloatToRawIntBits5 = Float.floatToRawIntBits(f7);
        long jFloatToRawIntBits6 = Float.floatToRawIntBits(f7);
        float f8 = kjiVar != kjiVar2 ? f3 : f4;
        return new ijy(ihx.a(ihuVarC, (jFloatToRawIntBits << 32) | (jFloatToRawIntBits2 & 4294967295L), (jFloatToRawIntBits3 << 32) | (jFloatToRawIntBits4 & 4294967295L), (jFloatToRawIntBits5 << 32) | (jFloatToRawIntBits6 & 4294967295L), (Float.floatToRawIntBits(f8) << 32) | (Float.floatToRawIntBits(f8) & 4294967295L)));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof evm) {
            evm evmVar = (evm) obj;
            return fdbq.f(this.a, evmVar.a) && fdbq.f(this.b, evmVar.b) && fdbq.f(this.c, evmVar.c) && fdbq.f(this.d, evmVar.d);
        }
        return false;
    }

    public final int hashCode() {
        return (((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode();
    }

    public final String toString() {
        return "RoundedCornerShape(topStart = " + this.a + ", topEnd = " + this.b + ", bottomEnd = " + this.c + ", bottomStart = " + this.d + ')';
    }
}
