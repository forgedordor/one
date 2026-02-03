package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import j$.util.function.Function$CC;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Random;
import java.util.UUID;
import java.util.function.Consumer;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dcrb {
    public static ejbp a(Context context, byte[] bArr, ejbn ejbnVar) {
        Optional optionalEmpty;
        final ejbo ejboVar = (ejbo) ejbp.a.createBuilder();
        evqs evqsVarX = evqs.x(bArr);
        ejboVar.copyOnWrite();
        ejbp ejbpVar = (ejbp) ejboVar.instance;
        ejbpVar.b |= 2;
        ejbpVar.d = evqsVarX;
        ejboVar.copyOnWrite();
        ejbp ejbpVar2 = (ejbp) ejboVar.instance;
        ejbnVar.getClass();
        ejbpVar2.e = ejbnVar;
        ejbpVar2.b |= 4;
        ejbi ejbiVar = ejbi.a;
        ejboVar.copyOnWrite();
        ejbp ejbpVar3 = (ejbp) ejboVar.instance;
        ejbiVar.getClass();
        ejbpVar3.f = ejbiVar;
        ejbpVar3.b |= 8;
        try {
            SharedPreferences sharedPreferences = context.getSharedPreferences("dg_shared_preferences", 0);
            String string = sharedPreferences.getString("client_uuid", "");
            if (string.isEmpty()) {
                UUID uuidRandomUUID = UUID.randomUUID();
                sharedPreferences.edit().putString("client_uuid", uuidRandomUUID.toString()).apply();
                optionalEmpty = Optional.of(uuidRandomUUID);
            } else {
                optionalEmpty = Optional.of(UUID.fromString(string));
            }
        } catch (IllegalStateException unused) {
            optionalEmpty = Optional.empty();
        }
        optionalEmpty.map(new Function() { // from class: dcqz
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                UUID uuid = (UUID) obj;
                return ByteBuffer.wrap(new byte[16]).order(ByteOrder.BIG_ENDIAN).putLong(uuid.getMostSignificantBits()).putLong(uuid.getLeastSignificantBits()).array();
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).ifPresent(new Consumer() { // from class: dcra
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void z(Object obj) {
                evqs evqsVarX2 = evqs.x((byte[]) obj);
                ejbo ejboVar2 = ejboVar;
                ejboVar2.copyOnWrite();
                ejbp ejbpVar4 = (ejbp) ejboVar2.instance;
                ejbp ejbpVar5 = ejbp.a;
                ejbpVar4.b |= 16;
                ejbpVar4.g = evqsVarX2;
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
        return (ejbp) ejboVar.build();
    }

    public static byte[] b(ejbp ejbpVar) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byte[] bArr = new byte[8];
            new Random().nextBytes(bArr);
            bArr[0] = 10;
            bArr[1] = 6;
            int i = 3;
            for (int i2 = 0; i2 < 8; i2++) {
                i ^= bArr[i2];
            }
            bArr[2] = (byte) (((byte) i) ^ bArr[2]);
            byteArrayOutputStream.write(bArr);
            ejbo ejboVar = (ejbo) ejbpVar.toBuilder();
            ejboVar.copyOnWrite();
            ejbp ejbpVar2 = (ejbp) ejboVar.instance;
            ejbpVar2.b &= -2;
            ejbpVar2.c = ejbp.a.c;
            ((ejbp) ejboVar.build()).writeTo(byteArrayOutputStream);
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
