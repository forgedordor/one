package defpackage;

import android.content.Context;
import java.io.File;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bxqk extends bxld {
    @Override // defpackage.bxld
    protected final File a(String str, String str2) {
        Context context = getContext();
        if (context == null) {
            return null;
        }
        return bxql.b(context, str, str2);
    }
}
