package defpackage;

import java.io.InputStream;
import java.io.OutputStream;

/* compiled from: PG */
/* loaded from: classes5.dex */
public abstract class eclx implements ecjn {
    @Override // defpackage.ecjn
    public final /* bridge */ /* synthetic */ void a(Object obj, OutputStream outputStream) {
        ((evuh) obj).writeTo(outputStream);
    }

    public abstract evrr b();

    public abstract evuh c();

    /* JADX WARN: Type inference failed for: r3v1, types: [evuh, java.lang.Object] */
    public final evuh d(InputStream inputStream) {
        return c().getParserForType().k(inputStream, b());
    }
}
