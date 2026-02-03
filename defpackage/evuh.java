package defpackage;

import java.io.OutputStream;

/* compiled from: PG */
/* loaded from: classes5.dex */
public interface evuh extends evui {
    evuo<? extends evuh> getParserForType();

    int getSerializedSize();

    evug newBuilderForType();

    evug toBuilder();

    byte[] toByteArray();

    evqs toByteString();

    void writeTo(evrf evrfVar);

    void writeTo(OutputStream outputStream);
}
