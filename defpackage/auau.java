package defpackage;

import android.util.Base64;
import java.nio.ByteBuffer;
import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class auau {
    public static final cczv a = cdag.l(cdag.b, "rcs_message_id_regex", "^Mx(.){22,26}");

    public final basd a() {
        eieu eieuVarK = eiiy.k("RcsMessageIdGenerator::generate");
        try {
            UUID uuidRandomUUID = UUID.randomUUID();
            ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[16]);
            byteBufferWrap.putLong(uuidRandomUUID.getMostSignificantBits());
            byteBufferWrap.putLong(uuidRandomUUID.getLeastSignificantBits());
            basd basdVarA = basd.a("Mx" + Base64.encodeToString(byteBufferWrap.array(), 11).replace('_', '='));
            eieuVarK.close();
            return basdVarA;
        } catch (Throwable th) {
            try {
                eieuVarK.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
