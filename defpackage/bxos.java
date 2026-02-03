package defpackage;

import android.content.Context;
import java.io.File;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bxos {
    public final String a = "com.google.android.apps.messaging.shared.datamodel.richcard.RichCardMediaFileProvider";
    public final String b = "richcard-";
    private final Function c;

    public bxos(Function function) {
        this.c = function;
    }

    public final File a(Context context, String str) {
        return new File((File) this.c.apply(context), str);
    }
}
