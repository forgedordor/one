package defpackage;

import android.net.Uri;
import com.google.android.rcs.client.messaging.data.ContentType;

/* compiled from: PG */
/* loaded from: classes5.dex */
public abstract class efiv {
    public abstract Uri a();

    public abstract ContentType b();

    public final String toString() {
        return "FileMessageContent {contentType=" + dhiz.GENERIC.c(b()) + ", contentUri=" + dhiz.URI.c(a());
    }
}
