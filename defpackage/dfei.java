package defpackage;

import java.io.IOException;
import java.io.InputStream;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dfei extends ffhw {
    private long a;

    public dfei(InputStream inputStream, String str, String str2) {
        super(inputStream, str, str2);
        try {
            long jAvailable = inputStream.available();
            this.a = jAvailable;
            if (jAvailable < 0) {
                throw new IllegalArgumentException("Invalid input stream!");
            }
        } catch (IOException unused) {
            throw new IllegalArgumentException("Input stream not ready!");
        }
    }

    @Override // defpackage.ffhw, defpackage.ffhu
    public final long a() {
        return this.a;
    }
}
