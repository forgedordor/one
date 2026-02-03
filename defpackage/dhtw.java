package defpackage;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dhtw implements dhts {
    private static final ekrg a = ekrg.c("com/google/android/libraries/abuse/hades/moirai/featureprovider/FeatureProvider");
    private final fdap b;
    private final dhoy c;

    public dhtw(fdap fdapVar, dhoy dhoyVar) {
        this.b = fdapVar;
        this.c = dhoyVar;
    }

    @Override // defpackage.dhts
    public final dhtu a(dhuu dhuuVar) {
        sdq sdqVar;
        if (this.b.invoke(dhuuVar) == null) {
            ((ekrd) a.h().h("com/google/android/libraries/abuse/hades/moirai/featureprovider/FeatureProvider", "process", 17, "FeatureProvider.kt")).q("Nothing found to evaluate in feature provider payload.");
            return null;
        }
        etqv etqvVar = this.c.b;
        ByteBuffer byteBufferPut = ByteBuffer.allocateDirect(etqvVar.b.d()).put(etqvVar.b.o());
        byteBufferPut.getClass();
        byteBufferPut.flip();
        try {
            sdqVar = new sdq();
            byteBufferPut.order(ByteOrder.LITTLE_ENDIAN);
            sdqVar.h(byteBufferPut.getInt(byteBufferPut.position()) + byteBufferPut.position(), byteBufferPut);
        } catch (Exception e) {
            ((ekrd) ((ekrd) dhoy.a.j()).g(e).h("com/google/android/libraries/abuse/hades/moirai/blocklist/BloomFilterProcessor", "asBloom", 35, "BloomFilterProcessor.kt")).q("GetRootAsBloom throws an exception. ");
            sdqVar = null;
        }
        if (sdqVar != null) {
            sdr sdrVar = new sdr();
            int iD = sdqVar.d(4);
            if (iD != 0) {
                sdrVar.h(sdqVar.c(iD + sdqVar.a), sdqVar.b);
            } else {
                sdrVar = null;
            }
            if (sdrVar != null) {
                int iD2 = sdrVar.d(6);
                String strG = iD2 != 0 ? sdrVar.g(iD2 + sdrVar.a) : null;
                strG.getClass();
                return new dhtt(strG, byteBufferPut);
            }
        }
        ((ekrd) dhoy.a.j().h("com/google/android/libraries/abuse/hades/moirai/blocklist/BloomFilterProcessor", "run", 26, "BloomFilterProcessor.kt")).q("ByteBuffer Metadata is null. ");
        return null;
    }
}
