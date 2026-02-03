package defpackage;

import java.io.InputStream;

/* compiled from: PG */
/* loaded from: classes5.dex */
public interface evug extends Cloneable, evui {
    evuh build();

    evuh buildPartial();

    evug mergeFrom(evqs evqsVar);

    evug mergeFrom(evqz evqzVar, evrr evrrVar);

    evug mergeFrom(evuh evuhVar);

    evug mergeFrom(InputStream inputStream);

    evug mergeFrom(byte[] bArr);

    evug mergeFrom(byte[] bArr, evrr evrrVar);
}
