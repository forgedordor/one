package defpackage;

import android.app.appsearch.GenericDocument;
import android.app.appsearch.PutDocumentsRequest;
import android.app.appsearch.exceptions.AppSearchException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aiu {
    public static void a(PutDocumentsRequest.Builder builder, GenericDocument genericDocument) {
        try {
            builder.addTakenActionGenericDocuments(new GenericDocument[]{genericDocument});
        } catch (AppSearchException e) {
            throw new RuntimeException("Unexpected AppSearchException which should not be possible", e);
        }
    }
}
