package defpackage;

import android.content.Context;
import java.nio.ByteBuffer;
import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dwcy {
    public static ezpo a(Context context, UUID uuid) {
        dvjs dvjsVarA = dvjs.a(context);
        ezod ezodVar = (ezod) ezoe.a.createBuilder();
        ezodVar.copyOnWrite();
        ((ezoe) ezodVar.instance).e = 4;
        int i = dvjsVarA.a;
        ezodVar.copyOnWrite();
        ((ezoe) ezodVar.instance).b = i;
        ezodVar.copyOnWrite();
        ((ezoe) ezodVar.instance).c = 0;
        int i2 = dvjsVarA.b;
        ezodVar.copyOnWrite();
        ((ezoe) ezodVar.instance).d = i2;
        ezodVar.copyOnWrite();
        ((ezoe) ezodVar.instance).g = felo.a(3);
        ezodVar.copyOnWrite();
        ((ezoe) ezodVar.instance).f = feln.a(67);
        ezoe ezoeVar = (ezoe) ezodVar.build();
        ezpo ezpoVar = (ezpo) ezpp.a.createBuilder();
        ezpoVar.copyOnWrite();
        ezpp ezppVar = (ezpp) ezpoVar.instance;
        ezoeVar.getClass();
        ezppVar.g = ezoeVar;
        ezppVar.b |= 1;
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(16);
        byteBufferAllocate.putLong(uuid.getMostSignificantBits());
        byteBufferAllocate.putLong(uuid.getLeastSignificantBits());
        evqs evqsVarX = evqs.x(byteBufferAllocate.array());
        ezpoVar.copyOnWrite();
        ((ezpp) ezpoVar.instance).d = evqsVarX;
        return ezpoVar;
    }

    public static ezpo b(Context context, byte[] bArr, UUID uuid) {
        ezpo ezpoVarA = a(context, uuid);
        evqs evqsVarX = evqs.x(bArr);
        ezpoVarA.copyOnWrite();
        ezpp ezppVar = (ezpp) ezpoVarA.instance;
        ezpp ezppVar2 = ezpp.a;
        ezppVar.f = evqsVarX;
        return ezpoVarA;
    }
}
