package defpackage;

import com.google.android.rcs.client.messaging.data.AutoValue_FileInformation;
import com.google.android.rcs.client.messaging.data.ContentType;
import com.google.android.rcs.client.messaging.data.FileInformation;
import j$.time.Duration;
import j$.time.Instant;

/* compiled from: PG */
/* loaded from: classes5.dex */
public abstract class efir {
    public abstract FileInformation a();

    public abstract void b(Duration duration);

    public abstract void c(ContentType contentType);

    public abstract void d(efis efisVar);

    public abstract void e(String str);

    public abstract void f(int i);

    public abstract void g(String str);

    public abstract void h(Instant instant);

    public final FileInformation i() {
        if (((AutoValue_FileInformation) a()).f.isPresent() && efis.THUMBNAIL.equals(((AutoValue_FileInformation) a()).f.get())) {
            e(null);
        }
        return a();
    }
}
